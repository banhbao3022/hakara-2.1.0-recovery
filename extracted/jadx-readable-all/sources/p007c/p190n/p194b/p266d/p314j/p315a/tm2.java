package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.websocket.CloseCodes;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tm2 extends xm2 {

    /* JADX INFO: renamed from: d */
    public final AtomicReference<sm2> f19920d;

    public tm2() {
        this(null);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8428d(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    /* JADX INFO: renamed from: e */
    public static int m8429e(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xm2
    /* JADX INFO: renamed from: c */
    public final rm2[] mo8430c(ih2[] ih2VarArr, om2[] om2VarArr, int[][][] iArr) throws pg2 {
        int[] iArr2;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int i = 2;
        rm2[] rm2VarArr = new rm2[2];
        sm2 sm2Var = this.f19920d.get();
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            int iM6187f = -1;
            if (i2 >= i) {
                break;
            }
            if (((ng2) ih2VarArr[i2]).f17093a == i) {
                if (!z3) {
                    ih2 ih2Var = ih2VarArr[i2];
                    om2 om2Var = om2VarArr[i2];
                    int[][] iArr3 = iArr[i2];
                    int i3 = sm2Var.f19619b;
                    int i4 = -1;
                    nm2 nm2Var = null;
                    int i5 = 0;
                    int i6 = 0;
                    for (int i7 = 0; i7 < om2Var.f17682b; i7++) {
                        nm2 nm2Var2 = om2Var.f17683c[i7];
                        ArrayList arrayList2 = new ArrayList(nm2Var2.f17163a);
                        for (int i8 = 0; i8 < nm2Var2.f17163a; i8++) {
                            arrayList2.add(Integer.valueOf(i8));
                        }
                        int[] iArr4 = iArr3[i7];
                        int i9 = 0;
                        while (i9 < nm2Var2.f17163a) {
                            om2 om2Var2 = om2Var;
                            if (m8428d(iArr4[i9], true)) {
                                ch2 ch2Var = nm2Var2.f17164b[i9];
                                if (arrayList2.contains(Integer.valueOf(i9))) {
                                    int i10 = ch2Var.f13020o;
                                    z = true;
                                    z2 = true;
                                } else {
                                    z = true;
                                    z2 = false;
                                }
                                arrayList = arrayList2;
                                int i11 = z != z2 ? 1 : 2;
                                iArr2 = iArr4;
                                boolean zM8428d = m8428d(iArr4[i9], false);
                                if (zM8428d) {
                                    i11 += CloseCodes.NORMAL_CLOSURE;
                                }
                                boolean z4 = i11 > i6;
                                if (i11 == i6) {
                                    int iM8429e = ch2Var.m6187f() != iM6187f ? m8429e(ch2Var.m6187f(), iM6187f) : m8429e(ch2Var.f13012g, i4);
                                    z4 = !(zM8428d && z2) ? iM8429e >= 0 : iM8429e <= 0;
                                }
                                if (z4) {
                                    i4 = ch2Var.f13012g;
                                    iM6187f = ch2Var.m6187f();
                                    i6 = i11;
                                    i5 = i9;
                                    nm2Var = nm2Var2;
                                }
                            } else {
                                nm2Var2 = nm2Var2;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i9++;
                            om2Var = om2Var2;
                            nm2Var2 = nm2Var2;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                    }
                    um2 um2Var = nm2Var == null ? null : new um2(nm2Var, i5, 0, null);
                    rm2VarArr[i2] = um2Var;
                    z3 = um2Var != null;
                }
                int i12 = om2VarArr[i2].f17682b;
            }
            i2++;
            i = 2;
        }
        int i13 = 0;
        boolean z5 = false;
        while (i13 < i) {
            if (((ng2) ih2VarArr[i13]).f17093a == 1 && !z5) {
                om2 om2Var3 = om2VarArr[i13];
                int[][] iArr5 = iArr[i13];
                Objects.requireNonNull(sm2Var);
                int i14 = 0;
                int i15 = 0;
                int i16 = -1;
                int i17 = -1;
                while (i14 < om2Var3.f17682b) {
                    nm2 nm2Var3 = om2Var3.f17683c[i14];
                    int[] iArr6 = iArr5[i14];
                    int i18 = i17;
                    int i19 = i16;
                    int i20 = i15;
                    for (int i21 = 0; i21 < nm2Var3.f17163a; i21++) {
                        if (m8428d(iArr6[i21], true)) {
                            ch2 ch2Var2 = nm2Var3.f17164b[i21];
                            int i22 = iArr6[i21];
                            int i23 = 1 != (ch2Var2.f13007C & 1) ? 1 : 2;
                            if (m8428d(i22, false)) {
                                i23 += CloseCodes.NORMAL_CLOSURE;
                            }
                            if (i23 > i20) {
                                i19 = i14;
                                i18 = i21;
                                i20 = i23;
                            }
                        }
                    }
                    i14++;
                    i15 = i20;
                    i16 = i19;
                    i17 = i18;
                }
                um2 um2Var2 = i16 == -1 ? null : new um2(om2Var3.f17683c[i16], i17, 0, null);
                rm2VarArr[i13] = um2Var2;
                z5 = um2Var2 != null;
            }
            i13++;
            i = 2;
        }
        return rm2VarArr;
    }

    public tm2(ym2 ym2Var) {
        this.f19920d = new AtomicReference<>(new sm2());
    }
}
