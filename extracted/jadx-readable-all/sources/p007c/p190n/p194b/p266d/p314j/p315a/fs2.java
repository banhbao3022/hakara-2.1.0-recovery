package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fs2 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f14110a = new fs2();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        gs2 gs2Var;
        switch (i) {
            case 0:
                gs2Var = gs2.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                gs2Var = gs2.BANNER;
                break;
            case 2:
                gs2Var = gs2.DFP_BANNER;
                break;
            case 3:
                gs2Var = gs2.INTERSTITIAL;
                break;
            case 4:
                gs2Var = gs2.DFP_INTERSTITIAL;
                break;
            case 5:
                gs2Var = gs2.NATIVE_EXPRESS;
                break;
            case 6:
                gs2Var = gs2.AD_LOADER;
                break;
            case 7:
                gs2Var = gs2.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                gs2Var = gs2.BANNER_SEARCH_ADS;
                break;
            case 9:
                gs2Var = gs2.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                gs2Var = gs2.APP_OPEN;
                break;
            case 11:
                gs2Var = gs2.REWARDED_INTERSTITIAL;
                break;
            default:
                gs2Var = null;
                break;
        }
        return gs2Var != null;
    }
}
