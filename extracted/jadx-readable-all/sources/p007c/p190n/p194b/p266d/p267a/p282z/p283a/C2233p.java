package p007c.p190n.p194b.p266d.p267a.p282z.p283a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p314j.p315a.uv2;

/* JADX INFO: renamed from: c.n.b.d.a.z.a.p */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2233p {
    /* JADX INFO: renamed from: a */
    public static final void m4697a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f28477p == 4 && adOverlayInfoParcel.f28469h == null) {
            uv2 uv2Var = adOverlayInfoParcel.f28468g;
            if (uv2Var != null) {
                uv2Var.mo2739i0();
            }
            Activity activityMo6482h = adOverlayInfoParcel.f28470i.mo6482h();
            C2223f c2223f = adOverlayInfoParcel.f28467f;
            if (c2223f != null && c2223f.f10641o && activityMo6482h != null) {
                context = activityMo6482h;
            }
            C2216a c2216a = C2330u.f10884a.f10887b;
            C2216a.m4668b(context, c2223f, adOverlayInfoParcel.f28475n, c2223f != null ? c2223f.f10640n : null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f28479r.f21618i);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        C2267h1.m4752k(context, intent);
    }
}
