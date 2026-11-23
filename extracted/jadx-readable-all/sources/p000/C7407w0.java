package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Comment;
import mtp.media.karaoke.p628ui.screen.webview.WebViewActivity;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p007c.p190n.p430e.GsonBuilder;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentFragment;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentViewModel2;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentViewModel3;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p619l.DeviceUtils;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: w0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7407w0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34134g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34135h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34136i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f34137j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7407w0(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.f34134g = i;
        this.f34135h = obj;
        this.f34136i = obj2;
        this.f34137j = obj3;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f34134g;
        if (i == 0) {
            CommentFragment commentFragment = (CommentFragment) this.f34135h;
            Comment comment = (Comment) this.f34136i;
            CommentFragment.c cVar = commentFragment.f31326i0;
            if (cVar != null) {
                cVar.mo13913f(comment);
            }
            ((BottomSheetDialog) this.f34137j).dismiss();
            return Unit.f29502a;
        }
        if (i != 1) {
            if (i == 2) {
                FragmentActivity fragmentActivityM16562f = ((CommentFragment) this.f34135h).m16562f();
                Object systemService = fragmentActivityM16562f != null ? fragmentActivityM16562f.getSystemService("clipboard") : null;
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, ((Comment) this.f34136i).getMessage()));
                ((BottomSheetDialog) this.f34137j).dismiss();
                return Unit.f29502a;
            }
            if (i != 3) {
                throw null;
            }
            CommentViewModel3 commentViewModel3Mo13882Z0 = ((CommentFragment) this.f34135h).mo13882Z0();
            int id = ((Comment) this.f34136i).getId();
            Objects.requireNonNull(commentViewModel3Mo13882Z0);
            C5729a.m12428A(C8310a.m16440e(commentViewModel3Mo13882Z0), null, 0, new CommentViewModel2(commentViewModel3Mo13882Z0, id, null), 3, null);
            ArrayList arrayList = (ArrayList) ((CommentFragment) this.f34135h).mo13882Z0().f32034q.m421d();
            if (arrayList != null) {
                arrayList.remove((Comment) this.f34136i);
            }
            ((CommentFragment) this.f34135h).mo13892e1().m13977p((List) ((CommentFragment) this.f34135h).mo13882Z0().f32034q.m421d());
            ((BottomSheetDialog) this.f34137j).dismiss();
            return Unit.f29502a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://www.karavietnam.com/report-violation?token=");
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        sb.append((String) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("access_token", null), String.class));
        sb.append("&content_id=");
        sb.append(((Comment) this.f34136i).getId());
        sb.append("&content_type=c&lang=");
        DeviceUtils.a aVar = DeviceUtils.f33080a;
        sb.append(aVar.m14248b());
        sb.append("&region=");
        sb.append(aVar.m14249c());
        String string = sb.toString();
        WebViewActivity.C7383a c7383a = WebViewActivity.f34037u;
        Context contextM16528G0 = ((CommentFragment) this.f34135h).m16528G0();
        Intrinsics2.m13088d(contextM16528G0, "requireContext()");
        String strM16546Q = ((CommentFragment) this.f34135h).m16546Q(R.string.title_report_violation);
        Intrinsics2.m13088d(strM16546Q, "getString(R.string.title_report_violation)");
        ((CommentFragment) this.f34135h).m13976b1(c7383a.m14469a(contextM16528G0, strM16546Q, string));
        ((BottomSheetDialog) this.f34137j).dismiss();
        return Unit.f29502a;
    }
}
