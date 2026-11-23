package p000;

import android.content.SharedPreferences;
import android.widget.ImageButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.TimeUnit;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p007c.p190n.p194b.p266d.p267a.p268a0.AbstractC2104a;
import p007c.p190n.p385d.p386j.p389b.C5240b;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: n0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7388n0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34060g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34061h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7388n0(int i, Object obj) {
        super(0);
        this.f34060g = i;
        this.f34061h = obj;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f34060g;
        boolean z = false;
        if (i == 0) {
            SingActivity singActivity = (SingActivity) this.f34061h;
            SingActivity.C7351e c7351e = SingActivity.f33896w;
            singActivity.onPause(false);
            singActivity.onPlayMusic();
            ((ImageButton) singActivity.m14442U(R.id.btnRecording)).setImageResource(R.drawable.ic_stop);
            singActivity.f33906J = true;
            YouTubePlayer youTubePlayer = singActivity.f33900D;
            if (youTubePlayer != null) {
                youTubePlayer.mo1318U();
            }
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        SingActivity singActivity2 = (SingActivity) this.f34061h;
        SingActivity.C7351e c7351e2 = SingActivity.f33896w;
        singActivity2.m14456q0();
        singActivity2.m14445e0();
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(jCurrentTimeMillis);
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        Long l = (Long) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("ad_inter_time_limit", null), Long.class);
        if (minutes - timeUnit.toMinutes(l != null ? l.longValue() : 0L) >= 4) {
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            Intrinsics2.m13089e("ad_inter_time_limit", "key");
            String strM12319f = new GsonBuilder().m12322a().m12319f(lValueOf);
            SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
            if (sharedPreferences2 == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            sharedPreferences2.edit().putString("ad_inter_time_limit", strM12319f).apply();
            z = true;
        }
        if (z) {
            AbstractC2104a abstractC2104a = singActivity2.f33932j0;
            if (abstractC2104a != null) {
                abstractC2104a.mo4602d(singActivity2);
            } else {
                Intrinsics2.m13089e("The interstitial ad wasn't ready yet.", "message");
            }
        }
        singActivity2.finish();
        FirebaseAnalytics firebaseAnalytics = singActivity2.f33933k0;
        if (firebaseAnalytics == null) {
            Intrinsics2.m13096l("firebaseAnalytics");
            throw null;
        }
        C5240b c5240b = new C5240b();
        Song songM421d = singActivity2.mo13969R().f31857l.m421d();
        c5240b.m11683a("song_name", String.valueOf(songM421d != null ? songM421d.getName() : null));
        firebaseAnalytics.m12913a("cancel_recording_audio", c5240b.f26349a);
        return Unit.f29502a;
    }
}
