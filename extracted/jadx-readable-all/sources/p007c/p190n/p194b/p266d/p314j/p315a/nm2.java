package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nm2 {

    /* JADX INFO: renamed from: a */
    public final int f17163a;

    /* JADX INFO: renamed from: b */
    public final ch2[] f17164b;

    /* JADX INFO: renamed from: c */
    public int f17165c;

    public nm2(ch2... ch2VarArr) {
        int length = ch2VarArr.length;
        C2622l.m5322V2(length > 0);
        this.f17164b = ch2VarArr;
        this.f17163a = length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nm2.class == obj.getClass()) {
            nm2 nm2Var = (nm2) obj;
            if (this.f17163a == nm2Var.f17163a && Arrays.equals(this.f17164b, nm2Var.f17164b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f17165c;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f17164b) + 527;
        this.f17165c = iHashCode;
        return iHashCode;
    }
}
