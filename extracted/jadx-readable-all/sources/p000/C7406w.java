package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Comment;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.ProfileActivity;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentFragment;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: w */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7406w extends Lambda implements InterfaceC6164l<Comment, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34132g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34133h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7406w(int i, Object obj) {
        super(1);
        this.f34132g = i;
        this.f34133h = obj;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Unit mo3b(Comment comment) {
        int i = this.f34132g;
        if (i != 0) {
            if (i == 1) {
                Comment comment2 = comment;
                Intrinsics2.m13089e(comment2, "it");
                CommentFragment.c cVar = CommentFragment.this.f31326i0;
                if (cVar != null) {
                    cVar.mo13914m(comment2);
                }
                return Unit.f29502a;
            }
            if (i == 2) {
                Comment comment3 = comment;
                Intrinsics2.m13089e(comment3, "it");
                CommentFragment.c cVar2 = CommentFragment.this.f31326i0;
                if (cVar2 != null) {
                    cVar2.mo13913f(comment3);
                }
                return Unit.f29502a;
            }
            if (i != 3) {
                throw null;
            }
            Comment comment4 = comment;
            Intrinsics2.m13089e(comment4, "it");
            CommentFragment commentFragment = CommentFragment.this;
            CommentFragment.b bVar = CommentFragment.f31323f0;
            Objects.requireNonNull(commentFragment);
            int userId = comment4.getUserId();
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            User user = (User) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("current_user", null), User.class);
            if (user == null || userId != user.getId()) {
                ProfileActivity.C7312a c7312a = ProfileActivity.f33786u;
                Context contextM16528G0 = commentFragment.m16528G0();
                Intrinsics2.m13088d(contextM16528G0, "requireContext()");
                commentFragment.m13976b1(c7312a.m14415a(contextM16528G0, comment4.getUserId()));
            }
            return Unit.f29502a;
        }
        Comment comment5 = comment;
        Intrinsics2.m13089e(comment5, "it");
        CommentFragment commentFragment2 = CommentFragment.this;
        CommentFragment.b bVar2 = CommentFragment.f31323f0;
        View viewInflate = commentFragment2.m16524E().inflate(R.layout.bottom_sheet_comment_menu, (ViewGroup) null);
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(commentFragment2.m16528G0());
        bottomSheetDialog.setContentView(viewInflate);
        bottomSheetDialog.show();
        Intrinsics2.m13088d(viewInflate, "view");
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.menuReply);
        Intrinsics2.m13088d(linearLayout, "view.menuReply");
        SkuDao.a.m14067S(linearLayout, new C7407w0(0, commentFragment2, comment5, bottomSheetDialog));
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.menuReport);
        Intrinsics2.m13088d(linearLayout2, "view.menuReport");
        SkuDao.a.m14067S(linearLayout2, new C7407w0(1, commentFragment2, comment5, bottomSheetDialog));
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.menuCopy);
        Intrinsics2.m13088d(linearLayout3, "view.menuCopy");
        SkuDao.a.m14067S(linearLayout3, new C7407w0(2, commentFragment2, comment5, bottomSheetDialog));
        int userId2 = comment5.getUserId();
        SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
        if (sharedPreferences2 == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        User user2 = (User) new GsonBuilder().m12322a().m12315b(sharedPreferences2.getString("current_user", null), User.class);
        if (user2 != null && userId2 == user2.getId() && comment5.getReplyCount() == 0) {
            LinearLayout linearLayout4 = (LinearLayout) viewInflate.findViewById(R.id.menuDelete);
            Intrinsics2.m13088d(linearLayout4, "view.menuDelete");
            SkuDao.a.m14067S(linearLayout4, new C7407w0(3, commentFragment2, comment5, bottomSheetDialog));
        } else {
            LinearLayout linearLayout5 = (LinearLayout) viewInflate.findViewById(R.id.menuDelete);
            Intrinsics2.m13088d(linearLayout5, "view.menuDelete");
            SkuDao.a.m14061M(linearLayout5);
        }
        return Unit.f29502a;
    }
}
