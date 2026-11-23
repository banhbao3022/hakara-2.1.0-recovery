package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum xt2 implements i82 {
    CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
    TWO_G(1),
    THREE_G(2),
    LTE(4);


    /* JADX INFO: renamed from: k */
    public final int f21679k;

    xt2(int i) {
        this.f21679k = i;
    }

    /* JADX INFO: renamed from: f */
    public static xt2 m8755f(int i) {
        if (i == 0) {
            return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return TWO_G;
        }
        if (i == 2) {
            return THREE_G;
        }
        if (i != 4) {
            return null;
        }
        return LTE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + xt2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f21679k + " name=" + name() + '>';
    }
}
