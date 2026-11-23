package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.ProfileActivity;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import mtp.media.karaoke.p628ui.screen.user.UserInviteActivity;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingFragment;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: u */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7402u extends Lambda implements InterfaceC6164l<Recording, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34122g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34123h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7402u(int i, Object obj) {
        super(1);
        this.f34122g = i;
        this.f34123h = obj;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Unit mo3b(Recording recording) {
        switch (this.f34122g) {
            case 0:
                Recording recording2 = recording;
                Intrinsics2.m13089e(recording2, "it");
                RecordingFragment recordingFragment = RecordingFragment.this;
                RecordingFragment.c cVar = RecordingFragment.f31226f0;
                recordingFragment.m13904i1(recording2);
                return Unit.f29502a;
            case 1:
                Recording recording3 = recording;
                Intrinsics2.m13089e(recording3, "it");
                RecordingFragment recordingFragment2 = RecordingFragment.this;
                RecordingFragment.c cVar2 = RecordingFragment.f31226f0;
                Objects.requireNonNull(recordingFragment2);
                recordingFragment2.mo13882Z0().m13907w(recording3.getId(), "r", recording3.getLikeStatus() ? 2 : 1);
                return Unit.f29502a;
            case 2:
                Recording recording4 = recording;
                Intrinsics2.m13089e(recording4, "it");
                RecordingFragment recordingFragment3 = RecordingFragment.this;
                RecordingFragment.c cVar3 = RecordingFragment.f31226f0;
                recordingFragment3.m13904i1(recording4);
                return Unit.f29502a;
            case 3:
                Recording recording5 = recording;
                Intrinsics2.m13089e(recording5, "it");
                RecordingFragment recordingFragment4 = RecordingFragment.this;
                RecordingFragment.c cVar4 = RecordingFragment.f31226f0;
                recordingFragment4.m13904i1(recording5);
                return Unit.f29502a;
            case 4:
                Recording recording6 = recording;
                Intrinsics2.m13089e(recording6, "it");
                RecordingFragment recordingFragment5 = RecordingFragment.this;
                RecordingFragment.c cVar5 = RecordingFragment.f31226f0;
                recordingFragment5.m13904i1(recording6);
                return Unit.f29502a;
            case 5:
                Recording recording7 = recording;
                Intrinsics2.m13089e(recording7, "it");
                RecordingFragment recordingFragment6 = RecordingFragment.this;
                Integer num = recordingFragment6.f31234n0;
                if (num == null || num.intValue() != 3) {
                    ProfileActivity.C7312a c7312a = ProfileActivity.f33786u;
                    Context contextM16528G0 = recordingFragment6.m16528G0();
                    Intrinsics2.m13088d(contextM16528G0, "requireContext()");
                    recordingFragment6.m13976b1(c7312a.m14415a(contextM16528G0, recording7.getUserId()));
                }
                return Unit.f29502a;
            case 6:
                Recording recording8 = recording;
                Intrinsics2.m13089e(recording8, "it");
                RecordingFragment recordingFragment7 = RecordingFragment.this;
                RecordingFragment.c cVar6 = RecordingFragment.f31226f0;
                Objects.requireNonNull(recordingFragment7);
                User user = recording8.getUser();
                if (user != null) {
                    ((ProfileViewModel6) recordingFragment7.f31228h0.getValue()).m13921p(user.getId(), user.getFollowStatus() ? 1 : 2);
                }
                return Unit.f29502a;
            case 7:
                Recording recording9 = recording;
                Intrinsics2.m13089e(recording9, "it");
                RecordingFragment recordingFragment8 = RecordingFragment.this;
                RecordingFragment.c cVar7 = RecordingFragment.f31226f0;
                Objects.requireNonNull(recordingFragment8);
                SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                if (sharedPreferences == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                User user2 = (User) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("current_user", null), User.class);
                if (user2 == null || user2.getId() != recording9.getUserId()) {
                    SingActivity.C7351e c7351e = SingActivity.f33896w;
                    Context contextM16528G1 = recordingFragment8.m16528G0();
                    Intrinsics2.m13088d(contextM16528G1, "requireContext()");
                    recordingFragment8.m13976b1(SingActivity.C7351e.m14457b(c7351e, contextM16528G1, 0, 2, recording9.getId(), 2));
                } else if (recording9.getPrivacy() == 0) {
                    UserInviteActivity.C7379b c7379b = UserInviteActivity.f34020w;
                    Context contextM16528G2 = recordingFragment8.m16528G0();
                    Intrinsics2.m13088d(contextM16528G2, "requireContext()");
                    int id = recording9.getId();
                    Objects.requireNonNull(c7379b);
                    Intrinsics2.m13089e(contextM16528G2, "context");
                    Intent intent = new Intent(contextM16528G2, (Class<?>) UserInviteActivity.class);
                    intent.putExtra("recording_id", id);
                    recordingFragment8.m13976b1(intent);
                } else {
                    FragmentActivity fragmentActivityM16562f = recordingFragment8.m16562f();
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
