package p555j.p556a.p557a.p558a.p559a.p560a;

import android.content.SharedPreferences;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.Objects;
import java.util.Timer;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p080e.p081a.FFmpeg;
import p007c.p190n.p385d.p386j.p389b.C5240b;
import p477d1.Unit;
import p477d1.p492w.Utils7;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p526i1.p534c.p535a.Async2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: j.a.a.a.a.a.y */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC6605y implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ProcessActivity f31046f;

    /* JADX INFO: renamed from: j.a.a.a.a.a.y$a */
    /* JADX INFO: compiled from: ProcessActivity.kt */
    public static final class a extends Lambda implements InterfaceC6153a<Unit> {
        public a() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            ProcessActivity processActivity = ViewOnClickListenerC6605y.this.f31046f;
            ProcessActivity.C7304d c7304d = ProcessActivity.f33721w;
            Objects.requireNonNull(processActivity);
            File file = new File(processActivity.f33724C, Intrinsics2.m13094j(processActivity.f33768z, C7804v0.m15335x(5)));
            if (processActivity.f33733L && file.exists()) {
                FirebaseAnalytics firebaseAnalytics = processActivity.f33749b0;
                if (firebaseAnalytics == null) {
                    Intrinsics2.m13096l("firebaseAnalytics");
                    throw null;
                }
                C5240b c5240b = new C5240b();
                Song songM421d = processActivity.mo13969R().f31857l.m421d();
                c5240b.m11683a("song_name", String.valueOf(songM421d != null ? songM421d.getName() : null));
                firebaseAnalytics.m12913a("mixed_audio", c5240b.f26349a);
                Timer timer = processActivity.f33735N;
                if (timer != null) {
                    timer.cancel();
                }
                ((LinearLayout) processActivity.m14407U(R.id.layoutSaveMixing)).startAnimation(AnimationUtils.loadAnimation(processActivity.getApplicationContext(), R.anim.fade_in));
                LinearLayout linearLayout = (LinearLayout) processActivity.m14407U(R.id.layoutSaveMixing);
                Intrinsics2.m13088d(linearLayout, "layoutSaveMixing");
                SkuDao.a.m14068T(linearLayout);
                Intrinsics2.m13089e("currentRhythm " + processActivity.f33747Z, "message");
                if (processActivity.f33747Z != 0) {
                    File file2 = new File(processActivity.f33724C, outline.m1551B(new StringBuilder(), processActivity.f33768z, "-new", 5));
                    if (file2.exists()) {
                        Utils7.m13078a(file2);
                    }
                    StringBuilder sbM1556G = outline.m1556G("-i ");
                    File file3 = processActivity.f33728G;
                    if (file3 == null) {
                        Intrinsics2.m13096l("fileVoice");
                        throw null;
                    }
                    sbM1556G.append(file3.getPath());
                    sbM1556G.append(" -af adelay=");
                    sbM1556G.append(processActivity.f33747Z);
                    sbM1556G.append('|');
                    sbM1556G.append(processActivity.f33747Z);
                    sbM1556G.append(' ');
                    sbM1556G.append(file2.getPath());
                    String string = sbM1556G.toString();
                    if (processActivity.f33747Z > 0) {
                        StringBuilder sbM1556G2 = outline.m1556G("-ss ");
                        sbM1556G2.append(processActivity.f33747Z);
                        sbM1556G2.append("ms -i ");
                        File file4 = processActivity.f33728G;
                        if (file4 == null) {
                            Intrinsics2.m13096l("fileVoice");
                            throw null;
                        }
                        sbM1556G2.append(file4.getPath());
                        sbM1556G2.append(" -c copy ");
                        sbM1556G2.append(file2.getPath());
                        string = sbM1556G2.toString();
                    }
                    FFmpeg.m1606a(string, new C6585f0(processActivity, file2, file));
                } else {
                    Async2.m13839b(processActivity, null, new C6601u(processActivity, file), 1);
                }
            }
            return Unit.f29502a;
        }
    }

    public ViewOnClickListenerC6605y(ProcessActivity processActivity) {
        this.f31046f = processActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        if (((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class)) == null) {
            ProcessActivity.m14405Y(this.f31046f);
            return;
        }
        ProcessActivity processActivity = this.f31046f;
        File file = new File(processActivity.f33724C, Intrinsics2.m13094j(processActivity.f33768z, C7804v0.m15335x(5)));
        if (this.f31046f.f33733L && file.exists()) {
            ProcessActivity processActivity2 = this.f31046f;
            if (processActivity2.f33734M) {
                processActivity2.f33734M = false;
                processActivity2.onAudioPause();
                this.f31046f.m14410c0();
                this.f31046f.m14411d0();
                ((ImageButton) this.f31046f.m14407U(R.id.btnPlay)).setImageResource(R.drawable.ic_play_white_30dp);
            }
            ProcessActivity.m14404X(this.f31046f);
            ProcessActivity processActivity3 = this.f31046f;
            SkuDao.a.m14069U(processActivity3, processActivity3.getString(R.string.message_continue_post), null, this.f31046f.getString(R.string.text_yes), new a(), this.f31046f.getString(R.string.text_no), null, false, false, 98);
        }
    }
}
