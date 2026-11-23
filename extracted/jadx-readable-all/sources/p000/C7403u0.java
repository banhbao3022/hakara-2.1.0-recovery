package p000;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.cardview.widget.CardView;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Duet;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.gift.fan.FanGiftActivity;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import mtp.media.karaoke.p628ui.screen.profile.ProfileActivity;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: u0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7403u0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34124g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34125h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7403u0(int i, Object obj) {
        super(0);
        this.f34124g = i;
        this.f34125h = obj;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        Duet duet;
        User user;
        Duet duet2;
        Duet duet3;
        User user2;
        switch (this.f34124g) {
            case 0:
                PlayingActivity.m14382d0((PlayingActivity) this.f34125h);
                return Unit.f29502a;
            case 1:
                Recording recordingM421d = ((PlayingActivity) this.f34125h).mo13969R().f31696l.m421d();
                if (recordingM421d != null && (duet = recordingM421d.getDuet()) != null && (user = duet.getUser()) != null) {
                    int id = user.getId();
                    SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                    if (sharedPreferences == null) {
                        Intrinsics2.m13096l("preferences");
                        throw null;
                    }
                    User user3 = (User) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("current_user", null), User.class);
                    if (user3 == null || id != user3.getId()) {
                        ((PlayingActivity) this.f34125h).m13971T(ProfileActivity.f33786u.m14415a((PlayingActivity) this.f34125h, user.getId()));
                    }
                }
                return Unit.f29502a;
            case 2:
                PlayingActivity.m14381c0((PlayingActivity) this.f34125h);
                return Unit.f29502a;
            case 3:
                PlayingActivity.m14377Y((PlayingActivity) this.f34125h);
                return Unit.f29502a;
            case 4:
                PlayingActivity.m14380b0((PlayingActivity) this.f34125h);
                CardView cardView = (CardView) ((PlayingActivity) this.f34125h).m14383U(R.id.footerLayout);
                Intrinsics2.m13088d(cardView, "footerLayout");
                SkuDao.a.m14068T(cardView);
                return Unit.f29502a;
            case 5:
                PlayingActivity.m14379a0((PlayingActivity) this.f34125h);
                return Unit.f29502a;
            case 6:
                PlayingActivity.m14378Z((PlayingActivity) this.f34125h);
                return Unit.f29502a;
            case 7:
                PlayingActivity.m14382d0((PlayingActivity) this.f34125h);
                return Unit.f29502a;
            case 8:
                PlayingActivity.m14382d0((PlayingActivity) this.f34125h);
                return Unit.f29502a;
            case 9:
                PlayingActivity.m14380b0((PlayingActivity) this.f34125h);
                CardView cardView2 = (CardView) ((PlayingActivity) this.f34125h).m14383U(R.id.footerLayout);
                Intrinsics2.m13088d(cardView2, "footerLayout");
                SkuDao.a.m14068T(cardView2);
                return Unit.f29502a;
            case 10:
                PlayingActivity.m14381c0((PlayingActivity) this.f34125h);
                return Unit.f29502a;
            case 11:
                PlayingActivity.m14374V((PlayingActivity) this.f34125h);
                return Unit.f29502a;
            case 12:
                PlayingActivity.m14378Z((PlayingActivity) this.f34125h);
                return Unit.f29502a;
            case 13:
                PlayingActivity.m14379a0((PlayingActivity) this.f34125h);
                return Unit.f29502a;
            case 14:
                FanGiftActivity.C7274b c7274b = FanGiftActivity.f33592y;
                PlayingActivity playingActivity = (PlayingActivity) this.f34125h;
                int i = playingActivity.f33651G;
                Objects.requireNonNull(c7274b);
                Intrinsics2.m13089e(playingActivity, "context");
                Intent intent = new Intent(playingActivity, (Class<?>) FanGiftActivity.class);
                intent.putExtra("mode", 1);
                intent.putExtra("id", i);
                ((PlayingActivity) this.f34125h).m13971T(intent);
                return Unit.f29502a;
            case 15:
                PlayingActivity playingActivity2 = (PlayingActivity) this.f34125h;
                PlayingActivity.C7291e c7291e = PlayingActivity.f33644w;
                playingActivity2.f32012v = true;
                playingActivity2.onBackPressed();
                return Unit.f29502a;
            case 16:
                Recording recordingM421d2 = ((PlayingActivity) this.f34125h).mo13969R().f31696l.m421d();
                if (recordingM421d2 != null) {
                    int i2 = 2;
                    int i3 = recordingM421d2.getType() == 1 ? 2 : 0;
                    int recordingId = ((PlayingActivity) this.f34125h).f33651G;
                    if (recordingM421d2.getType() != 2 || (duet2 = recordingM421d2.getDuet()) == null) {
                        i2 = i3;
                    } else {
                        recordingId = duet2.getRecordingId();
                    }
                    Intent intentM14458a = SingActivity.f33896w.m14458a((PlayingActivity) this.f34125h, recordingM421d2.getSongId(), i2, recordingId);
                    intentM14458a.setFlags(67108864);
                    ((PlayingActivity) this.f34125h).m13971T(intentM14458a);
                    PlayingActivity playingActivity3 = (PlayingActivity) this.f34125h;
                    playingActivity3.f32012v = false;
                    playingActivity3.finish();
                }
                return Unit.f29502a;
            case 17:
                PlayingActivity.m14374V((PlayingActivity) this.f34125h);
                return Unit.f29502a;
            case 18:
                SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
                if (sharedPreferences2 == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                if (((User) new GsonBuilder().m12322a().m12315b(sharedPreferences2.getString("current_user", null), User.class)) != null) {
                    Recording recordingM421d3 = ((PlayingActivity) this.f34125h).mo13969R().f31696l.m421d();
                    if (recordingM421d3 != null && (duet3 = recordingM421d3.getDuet()) != null && (user2 = duet3.getUser()) != null) {
                        ((PlayingActivity) this.f34125h).m14386g0(user2);
                    }
                } else {
                    PlayingActivity playingActivity4 = (PlayingActivity) this.f34125h;
                    PlayingActivity.C7291e c7291e2 = PlayingActivity.f33644w;
                    playingActivity4.m14393n0();
                }
                return Unit.f29502a;
            default:
                throw null;
        }
    }
}
