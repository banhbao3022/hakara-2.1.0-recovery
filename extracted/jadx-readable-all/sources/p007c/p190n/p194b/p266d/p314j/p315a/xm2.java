package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xm2 extends bn2 {

    /* JADX INFO: renamed from: b */
    public final SparseArray<Map<om2, wm2>> f21613b = new SparseArray<>();

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f21614c = new SparseBooleanArray();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bn2
    /* JADX INFO: renamed from: a */
    public final dn2 mo6066a(ih2[] ih2VarArr, om2 om2Var) throws pg2 {
        int[] iArr;
        int[] iArr2 = new int[3];
        nm2[][] nm2VarArr = new nm2[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = om2Var.f17682b;
            nm2VarArr[i] = new nm2[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            ih2VarArr[i4].mo7254l();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < om2Var.f17682b) {
            nm2 nm2Var = om2Var.f17683c[i5];
            int i6 = 0;
            int i7 = 2;
            int i8 = 0;
            while (true) {
                if (i6 >= i3) {
                    i6 = i7;
                    break;
                }
                ih2 ih2Var = ih2VarArr[i6];
                for (int i9 = 0; i9 < nm2Var.f17163a; i9++) {
                    ch2 ch2Var = nm2Var.f17164b[i9];
                    tk2 tk2Var = (tk2) ih2Var;
                    Objects.requireNonNull(tk2Var);
                    int i10 = i7;
                    try {
                        int iMo7702B = tk2Var.mo7702B(tk2Var.f19888j, ch2Var) & 3;
                        if (iMo7702B <= i8) {
                            i7 = i10;
                        } else {
                            if (iMo7702B == 3) {
                                break;
                            }
                            i8 = iMo7702B;
                            i7 = i6;
                        }
                    } catch (xk2 e) {
                        throw new pg2(e);
                    }
                }
                i6++;
                i3 = 2;
            }
            if (i6 == 2) {
                iArr = new int[nm2Var.f17163a];
            } else {
                ih2 ih2Var2 = ih2VarArr[i6];
                int[] iArr5 = new int[nm2Var.f17163a];
                for (int i11 = 0; i11 < nm2Var.f17163a; i11++) {
                    ch2 ch2Var2 = nm2Var.f17164b[i11];
                    tk2 tk2Var2 = (tk2) ih2Var2;
                    Objects.requireNonNull(tk2Var2);
                    try {
                        iArr5[i11] = tk2Var2.mo7702B(tk2Var2.f19888j, ch2Var2);
                    } catch (xk2 e2) {
                        throw new pg2(e2);
                    }
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i6];
            nm2VarArr[i6][i12] = nm2Var;
            iArr3[i6][i12] = iArr;
            iArr2[i6] = i12 + 1;
            i5++;
            i3 = 2;
        }
        int i13 = 2;
        om2[] om2VarArr = new om2[2];
        int[] iArr6 = new int[2];
        int i14 = 0;
        while (i14 < i13) {
            int i15 = iArr2[i14];
            om2VarArr[i14] = new om2((nm2[]) Arrays.copyOf(nm2VarArr[i14], i15));
            iArr3[i14] = (int[][]) Arrays.copyOf(iArr3[i14], i15);
            iArr6[i14] = ((ng2) ih2VarArr[i14]).f17093a;
            i14++;
            i13 = 2;
        }
        om2 om2Var2 = new om2((nm2[]) Arrays.copyOf(nm2VarArr[i13], iArr2[i13]));
        rm2[] rm2VarArrMo8430c = mo8430c(ih2VarArr, om2VarArr, iArr3);
        int i16 = 0;
        while (i16 < i13) {
            if (this.f21614c.get(i16)) {
                rm2VarArrMo8430c[i16] = null;
            } else {
                om2 om2Var3 = om2VarArr[i16];
                Map<om2, wm2> map = this.f21613b.get(i16);
                if ((map == null ? null : map.get(om2Var3)) != null) {
                    throw null;
                }
            }
            i16++;
            i13 = 2;
        }
        vm2 vm2Var = new vm2(iArr6, om2VarArr, iArr4, iArr3, om2Var2);
        jh2[] jh2VarArr = new jh2[2];
        for (int i17 = 0; i17 < 2; i17++) {
            jh2VarArr[i17] = rm2VarArrMo8430c[i17] != null ? jh2.f15597a : null;
        }
        return new dn2(om2Var, new zm2(rm2VarArrMo8430c, null), vm2Var, jh2VarArr);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bn2
    /* JADX INFO: renamed from: b */
    public final void mo6067b(Object obj) {
    }

    /* JADX INFO: renamed from: c */
    public abstract rm2[] mo8430c(ih2[] ih2VarArr, om2[] om2VarArr, int[][][] iArr) throws pg2;
}
