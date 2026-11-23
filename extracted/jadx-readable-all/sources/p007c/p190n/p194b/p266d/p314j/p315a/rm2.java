package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class rm2 {

    /* JADX INFO: renamed from: a */
    public final nm2 f18957a;

    /* JADX INFO: renamed from: b */
    public final int f18958b;

    /* JADX INFO: renamed from: c */
    public final int[] f18959c;

    /* JADX INFO: renamed from: d */
    public final ch2[] f18960d;

    /* JADX INFO: renamed from: e */
    public int f18961e;

    public rm2(nm2 nm2Var, int... iArr) {
        int length = iArr.length;
        C2622l.m5322V2(length > 0);
        Objects.requireNonNull(nm2Var);
        this.f18957a = nm2Var;
        this.f18958b = length;
        this.f18960d = new ch2[length];
        for (int i = 0; i < iArr.length; i++) {
            this.f18960d[i] = nm2Var.f17164b[iArr[i]];
        }
        Arrays.sort(this.f18960d, new qm2());
        this.f18959c = new int[this.f18958b];
        for (int i2 = 0; i2 < this.f18958b; i2++) {
            int[] iArr2 = this.f18959c;
            ch2 ch2Var = this.f18960d[i2];
            int i3 = 0;
            while (true) {
                ch2[] ch2VarArr = nm2Var.f17164b;
                if (i3 >= ch2VarArr.length) {
                    i3 = -1;
                    break;
                } else if (ch2Var == ch2VarArr[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
            iArr2[i2] = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8298a() {
        return this.f18959c.length;
    }

    /* JADX INFO: renamed from: b */
    public final ch2 m8299b(int i) {
        return this.f18960d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            rm2 rm2Var = (rm2) obj;
            if (this.f18957a == rm2Var.f18957a && Arrays.equals(this.f18959c, rm2Var.f18959c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f18961e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f18959c) + (System.identityHashCode(this.f18957a) * 31);
        this.f18961e = iHashCode;
        return iHashCode;
    }
}
