package p007c.p190n.p194b.p266d.p267a.p269b0;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import p007c.p190n.p194b.p266d.p267a.C2103a;

/* JADX INFO: renamed from: c.n.b.d.a.b0.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2107a {
    @RecentlyNonNull
    public abstract C2125s getSDKVersionInfo();

    @RecentlyNonNull
    public abstract C2125s getVersionInfo();

    public abstract void initialize(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2108b interfaceC2108b, @RecentlyNonNull List<C2115i> list);

    public void loadBannerAd(@RecentlyNonNull C2113g c2113g, @RecentlyNonNull InterfaceC2110d<?, ?> interfaceC2110d) {
        interfaceC2110d.mo4603a(new C2103a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(@RecentlyNonNull C2113g c2113g, @RecentlyNonNull InterfaceC2110d<?, ?> interfaceC2110d) {
        interfaceC2110d.mo4603a(new C2103a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(@RecentlyNonNull C2116j c2116j, @RecentlyNonNull InterfaceC2110d<?, ?> interfaceC2110d) {
        interfaceC2110d.mo4603a(new C2103a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAd(@RecentlyNonNull C2118l c2118l, @RecentlyNonNull InterfaceC2110d<AbstractC2124r, ?> interfaceC2110d) {
        interfaceC2110d.mo4603a(new C2103a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(@RecentlyNonNull C2120n c2120n, @RecentlyNonNull InterfaceC2110d<?, ?> interfaceC2110d) {
        interfaceC2110d.mo4603a(new C2103a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(@RecentlyNonNull C2120n c2120n, @RecentlyNonNull InterfaceC2110d<?, ?> interfaceC2110d) {
        interfaceC2110d.mo4603a(new C2103a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
