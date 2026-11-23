package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum dc2 implements i82 {
    AD_RESOURCE_UNKNOWN(0),
    AD_RESOURCE_CREATIVE(1),
    AD_RESOURCE_POST_CLICK(2),
    AD_RESOURCE_AUTO_CLICK_DESTINATION(3);


    /* JADX INFO: renamed from: k */
    public final int f13240k;

    dc2(int i) {
        this.f13240k = i;
    }

    /* JADX INFO: renamed from: f */
    public static dc2 m6353f(int i) {
        if (i == 0) {
            return AD_RESOURCE_UNKNOWN;
        }
        if (i == 1) {
            return AD_RESOURCE_CREATIVE;
        }
        if (i == 2) {
            return AD_RESOURCE_POST_CLICK;
        }
        if (i != 3) {
            return null;
        }
        return AD_RESOURCE_AUTO_CLICK_DESTINATION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + dc2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f13240k + " name=" + name() + '>';
    }
}
