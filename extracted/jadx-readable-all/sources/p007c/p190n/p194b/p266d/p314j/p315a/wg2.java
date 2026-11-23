package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.Log;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wg2 {

    /* JADX INFO: renamed from: a */
    public final zl2 f21104a;

    /* JADX INFO: renamed from: b */
    public final Object f21105b;

    /* JADX INFO: renamed from: c */
    public final int f21106c;

    /* JADX INFO: renamed from: d */
    public final ul2[] f21107d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f21108e;

    /* JADX INFO: renamed from: f */
    public final long f21109f;

    /* JADX INFO: renamed from: g */
    public int f21110g;

    /* JADX INFO: renamed from: h */
    public long f21111h;

    /* JADX INFO: renamed from: i */
    public boolean f21112i;

    /* JADX INFO: renamed from: j */
    public boolean f21113j;

    /* JADX INFO: renamed from: k */
    public boolean f21114k;

    /* JADX INFO: renamed from: l */
    public wg2 f21115l;

    /* JADX INFO: renamed from: m */
    public dn2 f21116m;

    /* JADX INFO: renamed from: n */
    public final hh2[] f21117n;

    /* JADX INFO: renamed from: o */
    public final ih2[] f21118o;

    /* JADX INFO: renamed from: p */
    public final bn2 f21119p;

    /* JADX INFO: renamed from: q */
    public final bm2 f21120q;

    /* JADX INFO: renamed from: r */
    public dn2 f21121r;

    /* JADX INFO: renamed from: s */
    public final C3556tq f21122s;

    public wg2(hh2[] hh2VarArr, ih2[] ih2VarArr, long j2, bn2 bn2Var, C3556tq c3556tq, bm2 bm2Var, Object obj, int i, int i2, boolean z, long j3, byte[] bArr) {
        this.f21117n = hh2VarArr;
        this.f21118o = ih2VarArr;
        this.f21109f = j2;
        this.f21119p = bn2Var;
        this.f21122s = c3556tq;
        this.f21120q = bm2Var;
        Objects.requireNonNull(obj);
        this.f21105b = obj;
        this.f21106c = i;
        this.f21110g = i2;
        this.f21112i = z;
        this.f21111h = j3;
        this.f21107d = new ul2[2];
        this.f21108e = new boolean[2];
        this.f21104a = bm2Var.mo6060b(i2, c3556tq.f19953a);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8646a() {
        return this.f21113j && (!this.f21114k || this.f21104a.mo6211h() == Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8647b() throws pg2 {
        dn2 dn2VarMo6066a = this.f21119p.mo6066a(this.f21118o, this.f21104a.mo6209f());
        dn2 dn2Var = this.f21121r;
        if (dn2Var != null) {
            for (int i = 0; i < 2; i++) {
                if (dn2VarMo6066a.m6383a(dn2Var, i)) {
                }
            }
            return false;
        }
        this.f21116m = dn2VarMo6066a;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final long m8648c(long j2) {
        return m8649d(j2, false, new boolean[2]);
    }

    /* JADX INFO: renamed from: d */
    public final long m8649d(long j2, boolean z, boolean[] zArr) {
        zm2 zm2Var = this.f21116m.f13327b;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.f21108e;
            if (z || !this.f21116m.m6383a(this.f21121r, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long jMo6206c = this.f21104a.mo6206c((rm2[]) zm2Var.f22357b.clone(), this.f21108e, this.f21107d, zArr, j2);
        this.f21121r = this.f21116m;
        this.f21114k = false;
        int i2 = 0;
        while (true) {
            ul2[] ul2VarArr = this.f21107d;
            if (i2 >= 2) {
                break;
            }
            if (ul2VarArr[i2] != null) {
                C2622l.m5322V2(zm2Var.f22357b[i2] != null);
                this.f21114k = true;
            } else {
                C2622l.m5322V2(zm2Var.f22357b[i2] == null);
            }
            i2++;
        }
        C3556tq c3556tq = this.f21122s;
        hh2[] hh2VarArr = this.f21117n;
        om2 om2Var = this.f21116m.f13326a;
        c3556tq.f19958f = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            if (zm2Var.f22357b[i3] != null) {
                int i4 = c3556tq.f19958f;
                int iZza = hh2VarArr[i3].zza();
                int i5 = jo2.f15673a;
                c3556tq.f19958f = i4 + (iZza != 1 ? 13107200 : 3538944);
            }
        }
        c3556tq.f19953a.m7530a(c3556tq.f19958f);
        return jMo6206c;
    }

    /* JADX INFO: renamed from: e */
    public final void m8650e() {
        try {
            this.f21120q.mo6063f(this.f21104a);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }
}
