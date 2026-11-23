package p555j.p556a.p557a.p558a.p559a.p573i;

import android.content.Context;
import android.content.SharedPreferences;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.ProfileFragment;
import mtp.media.karaoke.p628ui.screen.webview.WebViewActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p619l.DeviceUtils;

/* JADX INFO: renamed from: j.a.a.a.a.i.b, reason: use source file name */
/* JADX INFO: compiled from: ProfileFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileFragment2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ProfileFragment.C7317e f31413g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BottomSheetDialog f31414h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileFragment2(ProfileFragment.C7317e c7317e, BottomSheetDialog bottomSheetDialog) {
        super(0);
        this.f31413g = c7317e;
        this.f31414h = bottomSheetDialog;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        StringBuilder sbM1556G = outline.m1556G("https://www.karavietnam.com/report-violation?content_id=");
        User userM421d = ProfileFragment.this.mo13882Z0().f31515m.m421d();
        sbM1556G.append(userM421d != null ? Integer.valueOf(userM421d.getId()) : null);
        sbM1556G.append("&content_type=r&lang=");
        DeviceUtils.a aVar = DeviceUtils.f33080a;
        sbM1556G.append(aVar.m14248b());
        sbM1556G.append("&region=");
        sbM1556G.append(aVar.m14249c());
        String string = sbM1556G.toString();
        WebViewActivity.C7383a c7383a = WebViewActivity.f34037u;
        Context contextM16528G0 = ProfileFragment.this.m16528G0();
        Intrinsics2.m13088d(contextM16528G0, "requireContext()");
        String strM16546Q = ProfileFragment.this.m16546Q(R.string.title_report_violation);
        Intrinsics2.m13088d(strM16546Q, "getString(R.string.title_report_violation)");
        ProfileFragment.this.m13976b1(c7383a.m14469a(contextM16528G0, strM16546Q, string));
        this.f31414h.dismiss();
        return Unit.f29502a;
    }
}
