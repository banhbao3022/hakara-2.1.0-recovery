package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class om2 {

    /* JADX INFO: renamed from: a */
    public static final om2 f17681a = new om2(new nm2[0]);

    /* JADX INFO: renamed from: b */
    public final int f17682b;

    /* JADX INFO: renamed from: c */
    public final nm2[] f17683c;

    /* JADX INFO: renamed from: d */
    public int f17684d;

    public om2(nm2... nm2VarArr) {
        this.f17683c = nm2VarArr;
        this.f17682b = nm2VarArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final int m8043a(nm2 nm2Var) {
        for (int i = 0; i < this.f17682b; i++) {
            if (this.f17683c[i] == nm2Var) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && om2.class == obj.getClass()) {
            om2 om2Var = (om2) obj;
            if (this.f17682b == om2Var.f17682b && Arrays.equals(this.f17683c, om2Var.f17683c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f17684d;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f17683c);
        this.f17684d = iHashCode;
        return iHashCode;
    }
}
