package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import p007c.p190n.p194b.p266d.p314j.p315a.gs2;
import p007c.p190n.p194b.p266d.p314j.p315a.zc2;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.w */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2165w implements zc2<gs2> {

    /* JADX INFO: renamed from: a */
    public final C2164v f10542a;

    public C2165w(C2164v c2164v) {
        this.f10542a = c2164v;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        byte b;
        switch (this.f10542a.f10541a) {
            case "NATIVE":
                b = 2;
                break;
            case "INTERSTITIAL":
                b = 1;
                break;
            case "REWARDED":
                b = 3;
                break;
            case "BANNER":
                b = 0;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return gs2.BANNER;
        }
        if (b == 1) {
            return gs2.INTERSTITIAL;
        }
        if (b != 2) {
            return b != 3 ? gs2.AD_INITIATER_UNSPECIFIED : gs2.REWARD_BASED_VIDEO_AD;
        }
        return gs2.AD_LOADER;
    }
}
