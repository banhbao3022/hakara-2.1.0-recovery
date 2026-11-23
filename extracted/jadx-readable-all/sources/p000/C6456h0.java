package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import mtp.media.karaoke.p628ui.screen.user.UserInviteActivity;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p573i.C6693k;
import p555j.p556a.p557a.p558a.p559a.p573i.C6698p;
import p555j.p556a.p557a.p558a.p559a.p573i.C6701s;
import p555j.p556a.p557a.p558a.p559a.p573i.C6703u;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: h0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C6456h0 extends Lambda implements InterfaceC6164l<Recording, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f30687g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f30688h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6456h0(int i, Object obj) {
        super(1);
        this.f30687g = i;
        this.f30688h = obj;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Unit mo3b(Recording recording) {
        String strM16546Q;
        switch (this.f30687g) {
            case 0:
                Recording recording2 = recording;
                Intrinsics2.m13089e(recording2, "it");
                C6693k c6693k = C6693k.this;
                C6693k.b bVar = C6693k.f31460f0;
                c6693k.m13919h1(recording2);
                return Unit.f29502a;
            case 1:
                Recording recording3 = recording;
                Intrinsics2.m13089e(recording3, "it");
                C6693k c6693k2 = C6693k.this;
                C6693k.b bVar2 = C6693k.f31460f0;
                Objects.requireNonNull(c6693k2);
                c6693k2.mo13882Z0().m13907w(recording3.getId(), "r", recording3.getLikeStatus() ? 2 : 1);
                return Unit.f29502a;
            case 2:
                Recording recording4 = recording;
                Intrinsics2.m13089e(recording4, "it");
                C6693k c6693k3 = C6693k.this;
                C6693k.b bVar3 = C6693k.f31460f0;
                c6693k3.m13919h1(recording4);
                return Unit.f29502a;
            case 3:
                Recording recording5 = recording;
                Intrinsics2.m13089e(recording5, "it");
                C6693k c6693k4 = C6693k.this;
                C6693k.b bVar4 = C6693k.f31460f0;
                c6693k4.m13919h1(recording5);
                return Unit.f29502a;
            case 4:
                Recording recording6 = recording;
                Intrinsics2.m13089e(recording6, "it");
                C6693k c6693k5 = C6693k.this;
                C6693k.b bVar5 = C6693k.f31460f0;
                c6693k5.m13919h1(recording6);
                return Unit.f29502a;
            case 5:
                Recording recording7 = recording;
                Intrinsics2.m13089e(recording7, "it");
                C6693k c6693k6 = C6693k.this;
                C6693k.b bVar6 = C6693k.f31460f0;
                Objects.requireNonNull(c6693k6);
                Intrinsics2.m13089e(recording7.toString(), "message");
                return Unit.f29502a;
            case 6:
                Recording recording8 = recording;
                Intrinsics2.m13089e(recording8, "it");
                C6693k c6693k7 = C6693k.this;
                C6693k.b bVar7 = C6693k.f31460f0;
                View viewInflate = c6693k7.m16524E().inflate(R.layout.bottom_sheet_recording_menu, (ViewGroup) null);
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(c6693k7.m16528G0(), R.style.AppBottomSheetDialogTheme);
                bottomSheetDialog.setContentView(viewInflate);
                bottomSheetDialog.show();
                if (recording8.getPrivacy() == 1) {
                    Intrinsics2.m13088d(viewInflate, "view");
                    TextView textView = (TextView) viewInflate.findViewById(R.id.txtPrivacy);
                    Intrinsics2.m13088d(textView, "view.txtPrivacy");
                    textView.setText(c6693k7.m16546Q(R.string.text_menu_privacy));
                    strM16546Q = c6693k7.m16546Q(R.string.text_public_recording_success);
                    Intrinsics2.m13088d(strM16546Q, "getString(R.string.text_public_recording_success)");
                } else {
                    strM16546Q = c6693k7.m16546Q(R.string.text_private_recording_success);
                    Intrinsics2.m13088d(strM16546Q, "getString(R.string.text_private_recording_success)");
                    Intrinsics2.m13088d(viewInflate, "view");
                    TextView textView2 = (TextView) viewInflate.findViewById(R.id.txtPrivacy);
                    Intrinsics2.m13088d(textView2, "view.txtPrivacy");
                    textView2.setText(c6693k7.m16546Q(R.string.text_menu_none_privacy));
                }
                String str = strM16546Q;
                if (recording8.getPin() == 0) {
                    TextView textView3 = (TextView) viewInflate.findViewById(R.id.txtPin);
                    Intrinsics2.m13088d(textView3, "view.txtPin");
                    textView3.setText(c6693k7.m16546Q(R.string.text_menu_pin));
                    Intrinsics2.m13088d(c6693k7.m16546Q(R.string.text_pin_success), "getString(R.string.text_pin_success)");
                } else {
                    TextView textView4 = (TextView) viewInflate.findViewById(R.id.txtPin);
                    Intrinsics2.m13088d(textView4, "view.txtPin");
                    textView4.setText(c6693k7.m16546Q(R.string.text_menu_unpin));
                    Intrinsics2.m13088d(c6693k7.m16546Q(R.string.text_unpin_success), "getString(R.string.text_unpin_success)");
                }
                LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.menuPrivacy);
                Intrinsics2.m13088d(linearLayout, "view.menuPrivacy");
                SkuDao.a.m14067S(linearLayout, new C6698p(c6693k7, recording8, viewInflate, str, bottomSheetDialog));
                LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.menuShare);
                Intrinsics2.m13088d(linearLayout2, "view.menuShare");
                SkuDao.a.m14067S(linearLayout2, new C7408x(0, c6693k7, bottomSheetDialog, recording8));
                LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.menuPin);
                Intrinsics2.m13088d(linearLayout3, "view.menuPin");
                SkuDao.a.m14067S(linearLayout3, new C6701s(c6693k7, recording8, viewInflate, bottomSheetDialog));
                LinearLayout linearLayout4 = (LinearLayout) viewInflate.findViewById(R.id.menuCopyLink);
                Intrinsics2.m13088d(linearLayout4, "view.menuCopyLink");
                SkuDao.a.m14067S(linearLayout4, new C7408x(1, c6693k7, recording8, bottomSheetDialog));
                LinearLayout linearLayout5 = (LinearLayout) viewInflate.findViewById(R.id.menuDownload);
                Intrinsics2.m13088d(linearLayout5, "view.menuDownload");
                SkuDao.a.m14067S(linearLayout5, new C7408x(2, c6693k7, recording8, bottomSheetDialog));
                LinearLayout linearLayout6 = (LinearLayout) viewInflate.findViewById(R.id.menuDelete);
                Intrinsics2.m13088d(linearLayout6, "view.menuDelete");
                SkuDao.a.m14067S(linearLayout6, new C6703u(c6693k7, bottomSheetDialog, recording8));
                return Unit.f29502a;
            case 7:
                Recording recording9 = recording;
                Intrinsics2.m13089e(recording9, "it");
                C6693k c6693k8 = C6693k.this;
                C6693k.b bVar8 = C6693k.f31460f0;
                Objects.requireNonNull(c6693k8);
                SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                if (sharedPreferences == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                User user = (User) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("current_user", null), User.class);
                if (user == null || user.getId() != recording9.getUserId()) {
                    SingActivity.C7351e c7351e = SingActivity.f33896w;
                    Context contextM16528G0 = c6693k8.m16528G0();
                    Intrinsics2.m13088d(contextM16528G0, "requireContext()");
                    c6693k8.m13976b1(SingActivity.C7351e.m14457b(c7351e, contextM16528G0, 0, 2, recording9.getId(), 2));
                } else if (recording9.getPrivacy() == 0) {
                    UserInviteActivity.C7379b c7379b = UserInviteActivity.f34020w;
                    Context contextM16528G1 = c6693k8.m16528G0();
                    Intrinsics2.m13088d(contextM16528G1, "requireContext()");
                    int id = recording9.getId();
                    Objects.requireNonNull(c7379b);
                    Intrinsics2.m13089e(contextM16528G1, "context");
                    Intent intent = new Intent(contextM16528G1, (Class<?>) UserInviteActivity.class);
                    intent.putExtra("recording_id", id);
                    c6693k8.m13976b1(intent);
                } else {
                    FragmentActivity fragmentActivityM16562f = c6693k8.m16562f();
                    if (fragmentActivityM16562f != null) {
                        SkuDao.a.m14092i0(fragmentActivityM16562f, R.string.msg_invite_duet_private, 0, 2);
                    }
                }
                return Unit.f29502a;
            default:
                throw null;
        }
    }
}
