package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Objects;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import mtp.media.karaoke.p628ui.screen.profile.ProfileActivity;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p563d.p564a.DuetInviteFragment;
import p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: p */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7392p extends Lambda implements InterfaceC6164l<Recording, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34078g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34079h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7392p(int i, Object obj) {
        super(1);
        this.f34078g = i;
        this.f34079h = obj;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Unit mo3b(Recording recording) {
        int i = this.f34078g;
        if (i == 0) {
            Recording recording2 = recording;
            Intrinsics2.m13089e(recording2, "it");
            DuetInviteFragment duetInviteFragment = DuetInviteFragment.this;
            DuetInviteFragment.b bVar = DuetInviteFragment.f31150f0;
            Objects.requireNonNull(duetInviteFragment);
            PlayingActivity.C7291e c7291e = PlayingActivity.f33644w;
            Context contextM16528G0 = duetInviteFragment.m16528G0();
            Intrinsics2.m13088d(contextM16528G0, "requireContext()");
            duetInviteFragment.m13976b1(c7291e.m14397a(contextM16528G0, recording2.getId(), recording2.getThumbnail(), Integer.valueOf(recording2.getFormat()), Integer.valueOf(recording2.getVideoRatio()), SkuDao.a.m14052D(recording2, (ArrayList) duetInviteFragment.mo13882Z0().f32034q.m421d())));
            return Unit.f29502a;
        }
        if (i == 1) {
            Recording recording3 = recording;
            Intrinsics2.m13089e(recording3, "it");
            DuetInviteFragment duetInviteFragment2 = DuetInviteFragment.this;
            DuetInviteFragment.b bVar2 = DuetInviteFragment.f31150f0;
            Objects.requireNonNull(duetInviteFragment2);
            int userId = recording3.getUserId();
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            User user = (User) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("current_user", null), User.class);
            if (user == null || userId != user.getId()) {
                ProfileActivity.C7312a c7312a = ProfileActivity.f33786u;
                Context contextM16528G1 = duetInviteFragment2.m16528G0();
                Intrinsics2.m13088d(contextM16528G1, "requireContext()");
                duetInviteFragment2.m13976b1(c7312a.m14415a(contextM16528G1, recording3.getUserId()));
            }
            return Unit.f29502a;
        }
        if (i != 2) {
            throw null;
        }
        Recording recording4 = recording;
        Intrinsics2.m13089e(recording4, "it");
        DuetInviteFragment duetInviteFragment3 = DuetInviteFragment.this;
        DuetInviteFragment.b bVar3 = DuetInviteFragment.f31150f0;
        Objects.requireNonNull(duetInviteFragment3);
        SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
        if (sharedPreferences2 == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        if (((User) new GsonBuilder().m12322a().m12315b(sharedPreferences2.getString("current_user", null), User.class)) != null) {
            int i2 = recording4.getType() != 1 ? 0 : 2;
            SingActivity.C7351e c7351e = SingActivity.f33896w;
            Context contextM16528G2 = duetInviteFragment3.m16528G0();
            Intrinsics2.m13088d(contextM16528G2, "requireContext()");
            duetInviteFragment3.m13976b1(c7351e.m14458a(contextM16528G2, recording4.getSongId(), i2, recording4.getId()));
        } else {
            LoginFragment2 loginFragment2M13940a = LoginFragment2.f31647t0.m13940a(-1);
            FragmentActivity fragmentActivityM16526F0 = duetInviteFragment3.m16526F0();
            Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
            loginFragment2M13940a.mo5469c1(fragmentActivityM16526F0.m16577C(), "LoginForm");
        }
        return Unit.f29502a;
    }
}
