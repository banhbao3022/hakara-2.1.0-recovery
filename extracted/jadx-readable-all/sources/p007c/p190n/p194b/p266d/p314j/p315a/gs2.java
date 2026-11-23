package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum gs2 implements i82 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);


    /* JADX INFO: renamed from: s */
    public final int f14673s;

    gs2(int i) {
        this.f14673s = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + gs2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14673s + " name=" + name() + '>';
    }
}
