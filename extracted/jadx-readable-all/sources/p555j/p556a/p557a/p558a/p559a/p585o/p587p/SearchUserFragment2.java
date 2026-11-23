package p555j.p556a.p557a.p558a.p559a.p585o.p587p;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Objects;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.ProfileActivity;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: j.a.a.a.a.o.p.b, reason: use source file name */
/* JADX INFO: compiled from: SearchUserFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchUserFragment2 extends Lambda implements InterfaceC6164l<User, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SearchUserFragment.d f31768g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchUserFragment2(SearchUserFragment.d dVar) {
        super(1);
        this.f31768g = dVar;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(User user) {
        User user2 = user;
        Intrinsics2.m13089e(user2, "it");
        SearchUserFragment searchUserFragment = SearchUserFragment.this;
        SearchUserFragment.c cVar = SearchUserFragment.f31756f0;
        Objects.requireNonNull(searchUserFragment);
        int id = user2.getId();
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        User user3 = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
        if (user3 == null || id != user3.getId()) {
            ProfileActivity.C7312a c7312a = ProfileActivity.f33786u;
            Context contextM16528G0 = searchUserFragment.m16528G0();
            Intrinsics2.m13088d(contextM16528G0, "requireContext()");
            searchUserFragment.m13976b1(c7312a.m14415a(contextM16528G0, user2.getId()));
        }
        return Unit.f29502a;
    }
}
