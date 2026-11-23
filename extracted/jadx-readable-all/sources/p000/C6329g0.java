package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Objects;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import mtp.media.karaoke.p628ui.screen.profile.ProfileActivity;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p567e.p568b.RecordingRankingFragment;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: g0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C6329g0 extends Lambda implements InterfaceC6164l<Recording, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f29833g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f29834h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6329g0(int i, Object obj) {
        super(1);
        this.f29833g = i;
        this.f29834h = obj;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Unit mo3b(Recording recording) {
        int i = this.f29833g;
        if (i == 0) {
            Recording recording2 = recording;
            Intrinsics2.m13089e(recording2, "it");
            RecordingRankingFragment recordingRankingFragment = RecordingRankingFragment.this;
            RecordingRankingFragment.b bVar = RecordingRankingFragment.f31207f0;
            Objects.requireNonNull(recordingRankingFragment);
            PlayingActivity.C7291e c7291e = PlayingActivity.f33644w;
            Context contextM16528G0 = recordingRankingFragment.m16528G0();
            Intrinsics2.m13088d(contextM16528G0, "requireContext()");
            recordingRankingFragment.m13976b1(c7291e.m14397a(contextM16528G0, recording2.getId(), recording2.getThumbnail(), Integer.valueOf(recording2.getFormat()), Integer.valueOf(recording2.getVideoRatio()), SkuDao.a.m14052D(recording2, (ArrayList) recordingRankingFragment.mo13882Z0().f32034q.m421d())));
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        Recording recording3 = recording;
        Intrinsics2.m13089e(recording3, "it");
        RecordingRankingFragment recordingRankingFragment2 = RecordingRankingFragment.this;
        RecordingRankingFragment.b bVar2 = RecordingRankingFragment.f31207f0;
        Objects.requireNonNull(recordingRankingFragment2);
        int userId = recording3.getUserId();
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        User user = (User) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("current_user", null), User.class);
        if (user == null || userId != user.getId()) {
            ProfileActivity.C7312a c7312a = ProfileActivity.f33786u;
            Context contextM16528G1 = recordingRankingFragment2.m16528G0();
            Intrinsics2.m13088d(contextM16528G1, "requireContext()");
            recordingRankingFragment2.m13976b1(c7312a.m14415a(contextM16528G1, recording3.getUserId()));
        }
        return Unit.f29502a;
    }
}
