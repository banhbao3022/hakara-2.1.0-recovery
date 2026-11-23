package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cm2 implements zl2, yl2 {

    /* JADX INFO: renamed from: f */
    public final zl2[] f13053f;

    /* JADX INFO: renamed from: g */
    public final IdentityHashMap<ul2, Integer> f13054g = new IdentityHashMap<>();

    /* JADX INFO: renamed from: h */
    public yl2 f13055h;

    /* JADX INFO: renamed from: i */
    public int f13056i;

    /* JADX INFO: renamed from: j */
    public om2 f13057j;

    /* JADX INFO: renamed from: k */
    public zl2[] f13058k;

    /* JADX INFO: renamed from: l */
    public lm2 f13059l;

    public cm2(zl2... zl2VarArr) {
        this.f13053f = zl2VarArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2, p007c.p190n.p194b.p266d.p314j.p315a.lm2
    /* JADX INFO: renamed from: a */
    public final boolean mo6205a(long j2) {
        return this.f13059l.mo6205a(j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yl2
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo5792b(lm2 lm2Var) {
        if (this.f13057j == null) {
            return;
        }
        this.f13055h.mo5792b(this);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: c */
    public final long mo6206c(rm2[] rm2VarArr, boolean[] zArr, ul2[] ul2VarArr, boolean[] zArr2, long j2) {
        int length;
        ul2[] ul2VarArr2 = ul2VarArr;
        int length2 = rm2VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = rm2VarArr.length;
            if (i >= length) {
                break;
            }
            ul2 ul2Var = ul2VarArr2[i];
            iArr[i] = ul2Var == null ? -1 : this.f13054g.get(ul2Var).intValue();
            iArr2[i] = -1;
            rm2 rm2Var = rm2VarArr[i];
            if (rm2Var != null) {
                nm2 nm2Var = rm2Var.f18957a;
                int i2 = 0;
                while (true) {
                    zl2[] zl2VarArr = this.f13053f;
                    if (i2 >= zl2VarArr.length) {
                        break;
                    }
                    if (zl2VarArr[i2].mo6209f().m8043a(nm2Var) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        this.f13054g.clear();
        ul2[] ul2VarArr3 = new ul2[length];
        ul2[] ul2VarArr4 = new ul2[length];
        rm2[] rm2VarArr2 = new rm2[length];
        ArrayList arrayList = new ArrayList(this.f13053f.length);
        long j3 = j2;
        int i3 = 0;
        while (i3 < this.f13053f.length) {
            for (int i4 = 0; i4 < rm2VarArr.length; i4++) {
                rm2 rm2Var2 = null;
                ul2VarArr4[i4] = iArr[i4] == i3 ? ul2VarArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    rm2Var2 = rm2VarArr[i4];
                }
                rm2VarArr2[i4] = rm2Var2;
            }
            int i5 = i3;
            rm2[] rm2VarArr3 = rm2VarArr2;
            ArrayList arrayList2 = arrayList;
            long jMo6206c = this.f13053f[i3].mo6206c(rm2VarArr2, zArr, ul2VarArr4, zArr2, j3);
            if (i5 == 0) {
                j3 = jMo6206c;
            } else if (jMo6206c != j3) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < rm2VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    C2622l.m5322V2(ul2VarArr4[i6] != null);
                    ul2 ul2Var2 = ul2VarArr4[i6];
                    ul2VarArr3[i6] = ul2Var2;
                    this.f13054g.put(ul2Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    C2622l.m5322V2(ul2VarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f13053f[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            rm2VarArr2 = rm2VarArr3;
            ul2VarArr2 = ul2VarArr;
        }
        ul2[] ul2VarArr5 = ul2VarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(ul2VarArr3, 0, ul2VarArr5, 0, length);
        zl2[] zl2VarArr2 = new zl2[arrayList3.size()];
        this.f13058k = zl2VarArr2;
        arrayList3.toArray(zl2VarArr2);
        this.f13059l = new nl2(this.f13058k);
        return j3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: d */
    public final void mo6207d() throws IOException {
        for (zl2 zl2Var : this.f13053f) {
            zl2Var.mo6207d();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: e */
    public final long mo6208e(long j2) {
        long jMo6208e = this.f13058k[0].mo6208e(j2);
        int i = 1;
        while (true) {
            zl2[] zl2VarArr = this.f13058k;
            if (i >= zl2VarArr.length) {
                return jMo6208e;
            }
            if (zl2VarArr[i].mo6208e(jMo6208e) != jMo6208e) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: f */
    public final om2 mo6209f() {
        return this.f13057j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: g */
    public final void mo6210g(yl2 yl2Var, long j2) {
        this.f13055h = yl2Var;
        zl2[] zl2VarArr = this.f13053f;
        this.f13056i = zl2VarArr.length;
        for (zl2 zl2Var : zl2VarArr) {
            zl2Var.mo6210g(this, j2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: h */
    public final long mo6211h() {
        long jMin = Long.MAX_VALUE;
        for (zl2 zl2Var : this.f13058k) {
            long jMo6211h = zl2Var.mo6211h();
            if (jMo6211h != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo6211h);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: i */
    public final long mo6212i() {
        long jMo6212i = this.f13053f[0].mo6212i();
        int i = 1;
        while (true) {
            zl2[] zl2VarArr = this.f13053f;
            if (i >= zl2VarArr.length) {
                if (jMo6212i != -9223372036854775807L) {
                    for (zl2 zl2Var : this.f13058k) {
                        if (zl2Var != this.f13053f[0] && zl2Var.mo6208e(jMo6212i) != jMo6212i) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return jMo6212i;
            }
            if (zl2VarArr[i].mo6212i() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            }
            i++;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yl2
    /* JADX INFO: renamed from: j */
    public final void mo5800j(zl2 zl2Var) {
        int i = this.f13056i - 1;
        this.f13056i = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (zl2 zl2Var2 : this.f13053f) {
            i2 += zl2Var2.mo6209f().f17682b;
        }
        nm2[] nm2VarArr = new nm2[i2];
        int i3 = 0;
        for (zl2 zl2Var3 : this.f13053f) {
            om2 om2VarMo6209f = zl2Var3.mo6209f();
            int i4 = om2VarMo6209f.f17682b;
            int i5 = 0;
            while (i5 < i4) {
                nm2VarArr[i3] = om2VarMo6209f.f17683c[i5];
                i5++;
                i3++;
            }
        }
        this.f13057j = new om2(nm2VarArr);
        this.f13055h.mo5800j(this);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: k */
    public final void mo6213k(long j2) {
        for (zl2 zl2Var : this.f13058k) {
            zl2Var.mo6213k(j2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2, p007c.p190n.p194b.p266d.p314j.p315a.lm2
    public final long zza() {
        return this.f13059l.zza();
    }
}
