package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum eu0 implements i82 {
    DEVICE_IDENTIFIER_NO_ID(0),
    DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
    DEVICE_IDENTIFIER_GLOBAL_ID(2),
    DEVICE_IDENTIFIER_ADVERTISER_ID(3),
    DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
    DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
    DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6),
    DEVICE_IDENTIFIER_PER_APP_ID(7);


    /* JADX INFO: renamed from: o */
    public final int f13703o;

    eu0(int i) {
        this.f13703o = i;
    }

    /* JADX INFO: renamed from: f */
    public static eu0 m6690f(int i) {
        switch (i) {
            case 0:
                return DEVICE_IDENTIFIER_NO_ID;
            case 1:
                return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
            case 2:
                return DEVICE_IDENTIFIER_GLOBAL_ID;
            case 3:
                return DEVICE_IDENTIFIER_ADVERTISER_ID;
            case 4:
                return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
            case 5:
                return DEVICE_IDENTIFIER_ANDROID_AD_ID;
            case 6:
                return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
            case 7:
                return DEVICE_IDENTIFIER_PER_APP_ID;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + eu0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f13703o + " name=" + name() + '>';
    }
}
