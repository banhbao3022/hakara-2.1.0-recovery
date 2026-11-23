package mtp.media.karaoke.p628ui.screen.process;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.arthenica.mobileffmpeg.Config;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.cgfay.media.CainMediaPlayer;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.kenburn.KenBurnsView;
import mtp.media.karaoke.data.model.Image;
import mtp.media.karaoke.data.model.Simple2;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.image.ImageActivity;
import mtp.media.karaoke.p628ui.widgets.VideoTextureView;
import p007c.p071d.p078c.p079a.outline;
import p007c.p080e.p081a.ExecuteCallback;
import p007c.p080e.p081a.FFmpeg;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p007c.p190n.p385d.p386j.p389b.C5239a;
import p007c.p190n.p385d.p386j.p389b.C5240b;
import p007c.p190n.p385d.p427v.Firebase;
import p007c.p190n.p430e.GsonBuilder;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p478a0.Ranges;
import p477d1.p480c0.Iterables;
import p477d1.p480c0.Sequence;
import p477d1.p481d0.Strings5;
import p477d1.p483s.Iterables2;
import p477d1.p483s._Collections;
import p477d1.p492w.Utils7;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p530b.p531a.EventBus3;
import p526i1.p530b.p531a.Subscribe;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p560a.BackgroundFragment2;
import p555j.p556a.p557a.p558a.p559a.p560a.C6575a0;
import p555j.p556a.p557a.p558a.p559a.p560a.C6577b0;
import p555j.p556a.p557a.p558a.p559a.p560a.C6579c0;
import p555j.p556a.p557a.p558a.p559a.p560a.C6581d0;
import p555j.p556a.p557a.p558a.p559a.p560a.C6583e0;
import p555j.p556a.p557a.p558a.p559a.p560a.C6596p;
import p555j.p556a.p557a.p558a.p559a.p560a.C6597q;
import p555j.p556a.p557a.p558a.p559a.p560a.C6599s;
import p555j.p556a.p557a.p558a.p559a.p560a.C6602v;
import p555j.p556a.p557a.p558a.p559a.p560a.C6603w;
import p555j.p556a.p557a.p558a.p559a.p560a.C6606z;
import p555j.p556a.p557a.p558a.p559a.p560a.EffectFragment;
import p555j.p556a.p557a.p558a.p559a.p560a.ViewOnClickListenerC6604x;
import p555j.p556a.p557a.p558a.p559a.p560a.ViewOnClickListenerC6605y;
import p555j.p556a.p557a.p558a.p559a.p560a.VolumeFragment;
import p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6801i0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6805k0;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p558a.p594d.ImageEvent;
import p555j.p556a.p557a.p558a.p594d.RecordingEvent3;
import p555j.p556a.p557a.p558a.p596f.PagerAdapter;
import p555j.p556a.p557a.p606h.p607a.NowPlayingMetadata;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.ProcessActivityBinding;
import p555j.p556a.p557a.p619l.PathUtils;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentManager;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProcessActivity extends BaseActivity3<ProcessActivityBinding, C6799h0> implements EffectFragment.c, VolumeFragment.b, BackgroundFragment2.c, LoginFragment2.c {

    /* JADX INFO: renamed from: w */
    public static final C7304d f33721w = new C7304d(null);

    /* JADX INFO: renamed from: F */
    public File f33727F;

    /* JADX INFO: renamed from: G */
    public File f33728G;

    /* JADX INFO: renamed from: J */
    public int f33731J;

    /* JADX INFO: renamed from: K */
    public int f33732K;

    /* JADX INFO: renamed from: L */
    public boolean f33733L;

    /* JADX INFO: renamed from: M */
    public boolean f33734M;

    /* JADX INFO: renamed from: N */
    public Timer f33735N;

    /* JADX INFO: renamed from: P */
    public int f33737P;

    /* JADX INFO: renamed from: T */
    public boolean f33741T;

    /* JADX INFO: renamed from: V */
    public long f33743V;

    /* JADX INFO: renamed from: W */
    public boolean f33744W;

    /* JADX INFO: renamed from: Z */
    public int f33747Z;

    /* JADX INFO: renamed from: a0 */
    public int f33748a0;

    /* JADX INFO: renamed from: b0 */
    public FirebaseAnalytics f33749b0;

    /* JADX INFO: renamed from: c0 */
    public CainMediaPlayer f33750c0;

    /* JADX INFO: renamed from: d0 */
    public SurfaceTexture f33751d0;

    /* JADX INFO: renamed from: e0 */
    public Surface f33752e0;

    /* JADX INFO: renamed from: f0 */
    public CainMediaPlayer f33753f0;

    /* JADX INFO: renamed from: g0 */
    public SurfaceTexture f33754g0;

    /* JADX INFO: renamed from: h0 */
    public Surface f33755h0;

    /* JADX INFO: renamed from: j0 */
    public boolean f33757j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f33758k0;

    /* JADX INFO: renamed from: o0 */
    public boolean f33762o0;

    /* JADX INFO: renamed from: r0 */
    public HashMap f33765r0;

    /* JADX INFO: renamed from: x */
    public final int f33766x = R.layout.process_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f33767y = LazyJVM.m13020a(Lazy4.NONE, new C7303c(this, null, null));

    /* JADX INFO: renamed from: z */
    public String f33768z = "";

    /* JADX INFO: renamed from: A */
    public String f33722A = "";

    /* JADX INFO: renamed from: B */
    public String f33723B = "";

    /* JADX INFO: renamed from: C */
    public String f33724C = "";

    /* JADX INFO: renamed from: D */
    public String f33725D = "";

    /* JADX INFO: renamed from: E */
    public String f33726E = "";

    /* JADX INFO: renamed from: H */
    public String f33729H = "";

    /* JADX INFO: renamed from: I */
    public String f33730I = "";

    /* JADX INFO: renamed from: O */
    public int f33736O = 1;

    /* JADX INFO: renamed from: Q */
    public final ArrayList<String> f33738Q = new ArrayList<>();

    /* JADX INFO: renamed from: R */
    public String f33739R = "";

    /* JADX INFO: renamed from: S */
    public ArrayList<Image> f33740S = new ArrayList<>();

    /* JADX INFO: renamed from: U */
    public boolean f33742U = true;

    /* JADX INFO: renamed from: X */
    public boolean f33745X = true;

    /* JADX INFO: renamed from: Y */
    public int f33746Y = R.id.rbStudio;

    /* JADX INFO: renamed from: i0 */
    public final float f33756i0 = 0.5f;

    /* JADX INFO: renamed from: l0 */
    public int f33759l0 = 0;

    /* JADX INFO: renamed from: m0 */
    public int f33760m0 = 0;

    /* JADX INFO: renamed from: n0 */
    public int f33761n0 = 1;

    /* JADX INFO: renamed from: p0 */
    public final TextureView.SurfaceTextureListener f33763p0 = new TextureViewSurfaceTextureListenerC7307g();

    /* JADX INFO: renamed from: q0 */
    public final TextureView.SurfaceTextureListener f33764q0 = new TextureViewSurfaceTextureListenerC7306f();

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.ProcessActivity$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class C7301a extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f33769g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f33770h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Object f33771i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7301a(int i, Object obj, Object obj2) {
            super(0);
            this.f33769g = i;
            this.f33770h = obj;
            this.f33771i = obj2;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            int i = this.f33769g;
            if (i == 0) {
                SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                if (sharedPreferences == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                if (((User) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("current_user", null), User.class)) != null) {
                    ProcessActivity.m14404X((ProcessActivity) this.f33770h);
                    SkuDao.a.m14092i0((ProcessActivity) this.f33770h, R.string.message_save_draft_success, 0, 2);
                    ((BottomSheetDialog) this.f33771i).dismiss();
                    ((ProcessActivity) this.f33770h).finish();
                } else {
                    ProcessActivity.m14405Y((ProcessActivity) this.f33770h);
                }
                return Unit.f29502a;
            }
            if (i != 1) {
                throw null;
            }
            File file = new File(((ProcessActivity) this.f33770h).f33724C);
            if (file.exists()) {
                Utils7.m13078a(file);
            }
            File file2 = new File(((ProcessActivity) this.f33770h).f33725D);
            if (file2.exists()) {
                Utils7.m13078a(file2);
            }
            File file3 = new File(((ProcessActivity) this.f33770h).f33729H);
            if (file3.exists()) {
                Utils7.m13078a(file3);
            }
            C6799h0 c6799h0Mo13969R = ((ProcessActivity) this.f33770h).mo13969R();
            long j2 = ((ProcessActivity) this.f33770h).f33743V;
            Objects.requireNonNull(c6799h0Mo13969R);
            C5729a.m12428A(C8310a.m16440e(c6799h0Mo13969R), null, 0, new C6801i0(c6799h0Mo13969R, j2, null), 3, null);
            FirebaseAnalytics firebaseAnalytics = ((ProcessActivity) this.f33770h).f33749b0;
            if (firebaseAnalytics == null) {
                Intrinsics2.m13096l("firebaseAnalytics");
                throw null;
            }
            C5240b c5240b = new C5240b();
            Song songM421d = ((ProcessActivity) this.f33770h).mo13969R().f31857l.m421d();
            c5240b.m11683a("song_name", String.valueOf(songM421d != null ? songM421d.getName() : null));
            firebaseAnalytics.m12913a("cancel_process_audio", c5240b.f26349a);
            ((BottomSheetDialog) this.f33771i).dismiss();
            ((ProcessActivity) this.f33770h).finish();
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.ProcessActivity$b */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class C7302b extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f33772g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f33773h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7302b(int i, Object obj) {
            super(0);
            this.f33772g = i;
            this.f33773h = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            int i = this.f33772g;
            if (i == 0) {
                SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                if (sharedPreferences == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                if (((User) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("current_user", null), User.class)) != null) {
                    ((ProcessActivity) this.f33773h).m13971T(ImageActivity.C7282d.m14371a(ImageActivity.f33613y, (ProcessActivity) this.f33773h, true, false, 4));
                } else {
                    ProcessActivity.m14405Y((ProcessActivity) this.f33773h);
                }
                return Unit.f29502a;
            }
            if (i != 1) {
                throw null;
            }
            ProcessActivity processActivity = (ProcessActivity) this.f33773h;
            C7304d c7304d = ProcessActivity.f33721w;
            processActivity.onAudioPause();
            ((ProcessActivity) this.f33773h).m14410c0();
            ((ProcessActivity) this.f33773h).m14411d0();
            SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
            if (sharedPreferences2 == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            if (((User) new GsonBuilder().m12322a().m12315b(sharedPreferences2.getString("current_user", null), User.class)) != null) {
                ProcessActivity.m14404X((ProcessActivity) this.f33773h);
                SkuDao.a.m14092i0((ProcessActivity) this.f33773h, R.string.message_save_draft_success, 0, 2);
                FirebaseAnalytics firebaseAnalytics = ((ProcessActivity) this.f33773h).f33749b0;
                if (firebaseAnalytics == null) {
                    Intrinsics2.m13096l("firebaseAnalytics");
                    throw null;
                }
                C5240b c5240b = new C5240b();
                SharedPreferences sharedPreferences3 = ModelPrefs.f32358a;
                if (sharedPreferences3 == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                User user = (User) new GsonBuilder().m12322a().m12315b(sharedPreferences3.getString("current_user", null), User.class);
                c5240b.m11683a("user_id", String.valueOf(user != null ? Integer.valueOf(user.getId()) : null));
                firebaseAnalytics.m12913a("recording_save_draft", c5240b.f26349a);
                EventBus3.m13810b().m13815g(new RecordingEvent3());
                ((ProcessActivity) this.f33773h).finish();
            } else {
                ProcessActivity.m14405Y((ProcessActivity) this.f33773h);
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.ProcessActivity$c */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7303c extends Lambda implements InterfaceC6153a<C6799h0> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33774g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33775h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33776i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7303c(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33774g = viewModelStoreOwner;
            this.f33775h = qualifier;
            this.f33776i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.r.h0] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public C6799h0 mo2c() {
            return SkuDao.a.m14107t(this.f33774g, Reflection.m13097a(C6799h0.class), this.f33775h, this.f33776i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.ProcessActivity$d */
    /* JADX INFO: compiled from: ProcessActivity.kt */
    public static final class C7304d {
        public C7304d() {
        }

        /* JADX INFO: renamed from: a */
        public final Intent m14414a(Context context, String str, String str2, long j2, Boolean bool, int i, int i2, int i3, int i4, int i5, int i6) {
            Intrinsics2.m13089e(context, "context");
            Intrinsics2.m13089e(str, CainMediaMetadataRetriever.METADATA_KEY_FILENAME);
            Intrinsics2.m13089e(str2, "folderName");
            Intent intent = new Intent(context, (Class<?>) ProcessActivity.class);
            intent.putExtra("file_name", str);
            intent.putExtra("folder_name", str2);
            intent.putExtra("recording_entity_id", j2);
            intent.putExtra("is_from_draft", bool);
            intent.putExtra("current_tone", i);
            intent.putExtra("current_rhythm", i2);
            intent.putExtra(CainMediaMetadataRetriever.METADATA_KEY_DURATION, i3);
            intent.putExtra("format", i5);
            intent.putExtra("video_ratio", i6);
            intent.putExtra("sing_type", i4);
            return intent;
        }

        public C7304d(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.ProcessActivity$e */
    /* JADX INFO: compiled from: ProcessActivity.kt */
    public final class C7305e extends TimerTask {

        /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.ProcessActivity$e$a */
        /* JADX INFO: compiled from: ProcessActivity.kt */
        public static final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ProcessActivity processActivity = ProcessActivity.this;
                if (processActivity.f33734M) {
                    int iCurrentSeconds = processActivity.currentSeconds();
                    TextView textView = (TextView) ProcessActivity.this.m14407U(R.id.currTime);
                    Intrinsics2.m13088d(textView, "currTime");
                    textView.setText(NowPlayingMetadata.f32263a.m14034a(iCurrentSeconds));
                    if (iCurrentSeconds == 0) {
                        ProcessActivity.this.m14410c0();
                        ProcessActivity processActivity2 = ProcessActivity.this;
                        CainMediaPlayer cainMediaPlayer = processActivity2.f33750c0;
                        if (cainMediaPlayer != null) {
                            cainMediaPlayer.resume();
                        }
                        CainMediaPlayer cainMediaPlayer2 = processActivity2.f33750c0;
                        if (cainMediaPlayer2 != null) {
                            cainMediaPlayer2.seekTo(processActivity2.currentMs());
                        }
                        ProcessActivity.this.m14411d0();
                        ProcessActivity processActivity3 = ProcessActivity.this;
                        CainMediaPlayer cainMediaPlayer3 = processActivity3.f33753f0;
                        if (cainMediaPlayer3 != null) {
                            cainMediaPlayer3.resume();
                        }
                        CainMediaPlayer cainMediaPlayer4 = processActivity3.f33753f0;
                        if (cainMediaPlayer4 != null) {
                            cainMediaPlayer4.seekTo(processActivity3.currentMs());
                        }
                    }
                    Intrinsics2.m13089e("=======", "message");
                    Intrinsics2.m13089e(String.valueOf(ProcessActivity.this.currentMs()), "message");
                    CainMediaPlayer cainMediaPlayer5 = ProcessActivity.this.f33750c0;
                    Intrinsics2.m13089e(String.valueOf(cainMediaPlayer5 != null ? Long.valueOf(cainMediaPlayer5.getCurrentPosition()) : null), "message");
                    int iDurationSeconds = ProcessActivity.this.durationSeconds();
                    if (iDurationSeconds > 0) {
                        int i = (iCurrentSeconds * 100) / iDurationSeconds;
                        if (Build.VERSION.SDK_INT >= 24) {
                            SeekBar seekBar = (SeekBar) ProcessActivity.this.m14407U(R.id.seekBar);
                            if (seekBar != null) {
                                seekBar.setProgress(i, true);
                                return;
                            }
                            return;
                        }
                        SeekBar seekBar2 = (SeekBar) ProcessActivity.this.m14407U(R.id.seekBar);
                        if (seekBar2 != null) {
                            seekBar2.setProgress(i);
                        }
                    }
                }
            }
        }

        public C7305e() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ProcessActivity.this.runOnUiThread(new a());
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.ProcessActivity$f */
    /* JADX INFO: compiled from: ProcessActivity.kt */
    public static final class TextureViewSurfaceTextureListenerC7306f implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC7306f() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
            ProcessActivity processActivity = ProcessActivity.this;
            if (processActivity.f33754g0 != null) {
                VideoTextureView videoTextureView = (VideoTextureView) processActivity.m14407U(R.id.videoPlayerViewDuet);
                SurfaceTexture surfaceTexture2 = ProcessActivity.this.f33754g0;
                Intrinsics2.m13087c(surfaceTexture2);
                videoTextureView.setSurfaceTexture(surfaceTexture2);
                return;
            }
            processActivity.f33754g0 = surfaceTexture;
            CainMediaPlayer cainMediaPlayer = processActivity.f33753f0;
            if (cainMediaPlayer != null) {
                cainMediaPlayer.setOnPreparedListener(C6581d0.f30989a);
            }
            try {
                String str = processActivity.f33723B + "/" + processActivity.f33768z + C7804v0.m15335x(6);
                CainMediaPlayer cainMediaPlayer2 = processActivity.f33753f0;
                if (cainMediaPlayer2 != null) {
                    cainMediaPlayer2.setDataSource(str);
                }
                if (processActivity.f33755h0 == null) {
                    processActivity.f33755h0 = new Surface(processActivity.f33754g0);
                }
                CainMediaPlayer cainMediaPlayer3 = processActivity.f33753f0;
                if (cainMediaPlayer3 != null) {
                    cainMediaPlayer3.setSurface(processActivity.f33755h0);
                }
                CainMediaPlayer cainMediaPlayer4 = processActivity.f33753f0;
                if (cainMediaPlayer4 != null) {
                    float f = processActivity.f33756i0;
                    cainMediaPlayer4.setVolume(f, f);
                }
                CainMediaPlayer cainMediaPlayer5 = processActivity.f33753f0;
                if (cainMediaPlayer5 != null) {
                    cainMediaPlayer5.setOption(4, "vcodec", "h264_mediacodec");
                }
                CainMediaPlayer cainMediaPlayer6 = processActivity.f33753f0;
                if (cainMediaPlayer6 != null) {
                    cainMediaPlayer6.prepare();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
            return ProcessActivity.this.f33754g0 == null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.ProcessActivity$g */
    /* JADX INFO: compiled from: ProcessActivity.kt */
    public static final class TextureViewSurfaceTextureListenerC7307g implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC7307g() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
            ProcessActivity processActivity = ProcessActivity.this;
            if (processActivity.f33751d0 != null) {
                VideoTextureView videoTextureView = (VideoTextureView) processActivity.m14407U(R.id.videoPlayerView);
                SurfaceTexture surfaceTexture2 = ProcessActivity.this.f33751d0;
                Intrinsics2.m13087c(surfaceTexture2);
                videoTextureView.setSurfaceTexture(surfaceTexture2);
                return;
            }
            processActivity.f33751d0 = surfaceTexture;
            CainMediaPlayer cainMediaPlayer = processActivity.f33750c0;
            if (cainMediaPlayer != null) {
                cainMediaPlayer.setOnPreparedListener(new C6606z(processActivity));
            }
            CainMediaPlayer cainMediaPlayer2 = processActivity.f33750c0;
            if (cainMediaPlayer2 != null) {
                cainMediaPlayer2.setOnCompletionListener(C6575a0.f30970a);
            }
            CainMediaPlayer cainMediaPlayer3 = processActivity.f33750c0;
            if (cainMediaPlayer3 != null) {
                cainMediaPlayer3.setOnErrorListener(C6577b0.f30977a);
            }
            CainMediaPlayer cainMediaPlayer4 = processActivity.f33750c0;
            if (cainMediaPlayer4 != null) {
                cainMediaPlayer4.setOnCurrentPositionListener(C6579c0.f30987a);
            }
            try {
                CainMediaPlayer cainMediaPlayer5 = processActivity.f33750c0;
                if (cainMediaPlayer5 != null) {
                    cainMediaPlayer5.setDataSource(processActivity.f33726E);
                }
                if (processActivity.f33752e0 == null) {
                    processActivity.f33752e0 = new Surface(processActivity.f33751d0);
                }
                CainMediaPlayer cainMediaPlayer6 = processActivity.f33750c0;
                if (cainMediaPlayer6 != null) {
                    cainMediaPlayer6.setSurface(processActivity.f33752e0);
                }
                CainMediaPlayer cainMediaPlayer7 = processActivity.f33750c0;
                if (cainMediaPlayer7 != null) {
                    float f = processActivity.f33756i0;
                    cainMediaPlayer7.setVolume(f, f);
                }
                CainMediaPlayer cainMediaPlayer8 = processActivity.f33750c0;
                if (cainMediaPlayer8 != null) {
                    cainMediaPlayer8.setOption(4, "vcodec", "h264_mediacodec");
                }
                CainMediaPlayer cainMediaPlayer9 = processActivity.f33750c0;
                if (cainMediaPlayer9 != null) {
                    cainMediaPlayer9.prepare();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
            return ProcessActivity.this.f33751d0 == null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.ProcessActivity$h */
    /* JADX INFO: compiled from: ProcessActivity.kt */
    public static final class C7308h implements ExecuteCallback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f33782b;

        public C7308h(String str) {
            this.f33782b = str;
        }

        @Override // p007c.p080e.p081a.ExecuteCallback
        /* JADX INFO: renamed from: a */
        public final void mo1605a(long j2, int i) {
            if (i != 0) {
                return;
            }
            Intrinsics2.m13089e("mergeAudioToVideo scuccess", "message");
            ProcessActivity processActivity = ProcessActivity.this;
            int i2 = processActivity.f33759l0;
            if (i2 == 0) {
                ProcessActivity.m14403W(processActivity);
                return;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    ProcessActivity.m14403W(processActivity);
                    return;
                }
                return;
            }
            String str = this.f33782b;
            TextView textView = (TextView) processActivity.m14407U(R.id.txtMessageProgress);
            Intrinsics2.m13088d(textView, "txtMessageProgress");
            textView.setText(processActivity.getString(R.string.message_processing_video));
            StringBuilder sb = new StringBuilder();
            sb.append(processActivity.f33729H);
            sb.append("/");
            String str2 = "-i " + str + " -vf scale=270:480 -y " + outline.m1551B(sb, processActivity.f33768z, "-resize", 6);
            Intrinsics2.m13089e(str2, "message");
            FFmpeg.m1606a(str2, new C6583e0(processActivity));
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.ProcessActivity$i */
    /* JADX INFO: compiled from: ProcessActivity.kt */
    public static final class C7309i<T> implements Observer<RecordingEntity> {
        public C7309i() {
        }

        /* JADX WARN: Code duplicated, block: B:110:0x0337  */
        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(RecordingEntity recordingEntity) {
            Integer num;
            List<String> listM13000C;
            RecordingEntity recordingEntity2 = recordingEntity;
            Intrinsics2.m13089e(recordingEntity2.toString(), "message");
            if (ProcessActivity.this.f33741T) {
                Intrinsics2.m13089e("isFromDraft", "message");
                ProcessActivity.this.f33738Q.clear();
                ProcessActivity.this.f33738Q.add(recordingEntity2.f32336l);
                String str = recordingEntity2.f32340p;
                if (str != null) {
                    String[] strArr = {","};
                    Intrinsics2.m13089e(str, "$this$split");
                    Intrinsics2.m13089e(strArr, "delimiters");
                    String str2 = strArr[0];
                    if (str2.length() == 0) {
                        Sequence sequenceM13016z = Strings5.m13016z(str, strArr, 0, false, 0, 2);
                        Intrinsics2.m13089e(sequenceM13016z, "$this$asIterable");
                        Iterables iterables = new Iterables(sequenceM13016z);
                        ArrayList arrayList = new ArrayList(Iterables2.m13042g(iterables, 10));
                        Iterator<T> it = iterables.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Strings5.m13002E(str, (Ranges) it.next()));
                        }
                        listM13000C = arrayList;
                    } else {
                        listM13000C = Strings5.m13000C(str, str2, false, 0);
                    }
                    ArrayList arrayList2 = new ArrayList(Iterables2.m13042g(listM13000C, 10));
                    for (String str3 : listM13000C) {
                        Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.CharSequence");
                        arrayList2.add(Strings5.m13004G(str3).toString());
                    }
                    ProcessActivity.this.f33738Q.addAll(arrayList2);
                }
            }
            ProcessActivity processActivity = ProcessActivity.this;
            Objects.requireNonNull(processActivity);
            processActivity.f33727F = new File(processActivity.f33723B, Intrinsics2.m13094j(processActivity.f33768z, C7804v0.m15335x(3)));
            processActivity.f33728G = new File(processActivity.f33724C, Intrinsics2.m13094j(processActivity.f33768z, C7804v0.m15335x(5)));
            File file = processActivity.f33727F;
            if (file == null) {
                Intrinsics2.m13096l("fileAudio");
                throw null;
            }
            if (file.exists()) {
                File file2 = processActivity.f33728G;
                if (file2 == null) {
                    Intrinsics2.m13096l("fileVoice");
                    throw null;
                }
                if (file2.exists()) {
                    SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                    if (sharedPreferences == null) {
                        Intrinsics2.m13096l("preferences");
                        throw null;
                    }
                    Integer num2 = (Integer) outline.m1584f(sharedPreferences.getString("voice_vol", null), Integer.class);
                    int iIntValue = num2 != null ? num2.intValue() : 60;
                    SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
                    if (sharedPreferences2 == null) {
                        Intrinsics2.m13096l("preferences");
                        throw null;
                    }
                    Integer num3 = (Integer) outline.m1584f(sharedPreferences2.getString("music_vol", null), Integer.class);
                    int iIntValue2 = num3 != null ? num3.intValue() : 50;
                    Object systemService = processActivity.getSystemService("audio");
                    Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                    AudioManager audioManager = (AudioManager) systemService;
                    String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
                    String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
                    processActivity.f33731J = Integer.parseInt(property);
                    int i = Integer.parseInt(property2);
                    processActivity.f33732K = i;
                    int i2 = processActivity.f33731J;
                    File file3 = processActivity.f33727F;
                    if (file3 == null) {
                        Intrinsics2.m13096l("fileAudio");
                        throw null;
                    }
                    String path = file3.getPath();
                    Intrinsics2.m13088d(path, "fileAudio.path");
                    File file4 = processActivity.f33728G;
                    if (file4 == null) {
                        Intrinsics2.m13096l("fileVoice");
                        throw null;
                    }
                    String path2 = file4.getPath();
                    Intrinsics2.m13088d(path2, "fileVoice.path");
                    processActivity.processingAudio(i2, i, path, path2, iIntValue2, iIntValue, 0, 0);
                    processActivity.f33733L = true;
                    ((SeekBar) processActivity.m14407U(R.id.seekBar)).setOnSeekBarChangeListener(new C6603w(processActivity));
                    processActivity.setTone(processActivity.f33748a0);
                    if (processActivity.f33733L) {
                        SharedPreferences sharedPreferences3 = ModelPrefs.f32358a;
                        if (sharedPreferences3 == null) {
                            Intrinsics2.m13096l("preferences");
                            throw null;
                        }
                        Integer num4 = (Integer) outline.m1584f(sharedPreferences3.getString("reverb_mix", null), Integer.class);
                        int iIntValue3 = num4 != null ? num4.intValue() : 38;
                        SharedPreferences sharedPreferences4 = ModelPrefs.f32358a;
                        if (sharedPreferences4 == null) {
                            Intrinsics2.m13096l("preferences");
                            throw null;
                        }
                        Integer num5 = (Integer) outline.m1584f(sharedPreferences4.getString("reverb_room_size", null), Integer.class);
                        int iIntValue4 = num5 != null ? num5.intValue() : 70;
                        Intrinsics2.m13089e("reverbMix: " + iIntValue3, "message");
                        Intrinsics2.m13089e("reverbRoomSize: " + iIntValue4, "message");
                        SeekBar seekBar = (SeekBar) processActivity.m14407U(R.id.seekBarReverb2);
                        Intrinsics2.m13088d(seekBar, "seekBarReverb2");
                        seekBar.setProgress(iIntValue3);
                        SeekBar seekBar2 = (SeekBar) processActivity.m14407U(R.id.seekBarRoomSize2);
                        Intrinsics2.m13088d(seekBar2, "seekBarRoomSize2");
                        seekBar2.setProgress(iIntValue4);
                        TextView textView = (TextView) processActivity.m14407U(R.id.txtNumberReverb2);
                        Intrinsics2.m13088d(textView, "txtNumberReverb2");
                        textView.setText(String.valueOf(iIntValue3));
                        TextView textView2 = (TextView) processActivity.m14407U(R.id.txtNumberRoomSize2);
                        Intrinsics2.m13088d(textView2, "txtNumberRoomSize2");
                        textView2.setText(String.valueOf(iIntValue4));
                        ((SeekBar) processActivity.m14407U(R.id.seekBarReverb2)).setOnSeekBarChangeListener(new C6596p(processActivity));
                        ((SeekBar) processActivity.m14407U(R.id.seekBarRoomSize2)).setOnSeekBarChangeListener(new C6597q(processActivity));
                    }
                    SharedPreferences sharedPreferences5 = ModelPrefs.f32358a;
                    if (sharedPreferences5 == null) {
                        Intrinsics2.m13096l("preferences");
                        throw null;
                    }
                    Integer num6 = (Integer) outline.m1584f(sharedPreferences5.getString("effect", null), Integer.class);
                    processActivity.f33746Y = num6 != null ? num6.intValue() : R.id.rbStudio;
                    if (processActivity.f33741T) {
                        RecordingEntity recordingEntityM421d = processActivity.mo13969R().f31869x.m421d();
                        processActivity.f33736O = (recordingEntityM421d == null || (num = recordingEntityM421d.f32342r) == null) ? processActivity.f33736O : num.intValue();
                        StringBuilder sbM1556G = outline.m1556G("effect draft: ");
                        sbM1556G.append(processActivity.f33736O);
                        Intrinsics2.m13089e(sbM1556G.toString(), "message");
                        int i3 = processActivity.f33736O;
                        if (i3 == 0) {
                            processActivity.f33746Y = R.id.rbNone;
                        } else if (i3 == 1) {
                            processActivity.f33746Y = R.id.rbStudio;
                        } else if (i3 == 2) {
                            processActivity.f33746Y = R.id.rbKaraoke;
                        } else if (i3 == 3) {
                            processActivity.f33746Y = R.id.rbBolero;
                        } else if (i3 == 4) {
                            processActivity.f33746Y = R.id.rbHall;
                        } else if (i3 == 5) {
                            processActivity.f33746Y = R.id.rbCustom;
                        }
                    }
                    processActivity.mo13874w(processActivity.f33746Y);
                    ((ImageButton) processActivity.m14407U(R.id.btnPlay)).setOnClickListener(new ViewOnClickListenerC6604x(processActivity));
                    ((TextView) processActivity.m14407U(R.id.btnContinue)).setOnClickListener(new ViewOnClickListenerC6605y(processActivity));
                } else {
                    processActivity.f33743V = 0L;
                    SkuDao.a.m14092i0(processActivity, R.string.txt_error_not_vocal, 0, 2);
                }
            } else {
                processActivity.f33743V = 0L;
                SkuDao.a.m14092i0(processActivity, R.string.txt_error_not_vocal, 0, 2);
            }
            ProcessActivity processActivity2 = ProcessActivity.this;
            TabLayout tabLayout = (TabLayout) processActivity2.findViewById(R.id.effect_tab_layout);
            ViewPager viewPager = (ViewPager) processActivity2.findViewById(R.id.effect_view_pager);
            Intrinsics2.m13088d(viewPager, "viewPager");
            viewPager.setOffscreenPageLimit(3);
            PagerAdapter pagerAdapter = new PagerAdapter(processActivity2.m16577C());
            EffectFragment effectFragmentM13871a = EffectFragment.b.m13871a(EffectFragment.f30959s0, false, processActivity2.f33746Y, processActivity2.f33747Z, processActivity2.f33758k0, 1);
            String string = processActivity2.getResources().getString(R.string.text_effect);
            pagerAdapter.f32069g.add(effectFragmentM13871a);
            pagerAdapter.f32070h.add(string);
            VolumeFragment volumeFragment = new VolumeFragment();
            String string2 = processActivity2.getResources().getString(R.string.text_volume);
            pagerAdapter.f32069g.add(volumeFragment);
            pagerAdapter.f32070h.add(string2);
            if (!processActivity2.f33758k0) {
                BackgroundFragment2 backgroundFragment2 = new BackgroundFragment2();
                String string3 = processActivity2.getResources().getString(R.string.text_background);
                pagerAdapter.f32069g.add(backgroundFragment2);
                pagerAdapter.f32070h.add(string3);
            }
            viewPager.setAdapter(pagerAdapter);
            tabLayout.setupWithViewPager(viewPager);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.ProcessActivity$j */
    /* JADX INFO: compiled from: ProcessActivity.kt */
    public static final class ViewOnClickListenerC7310j implements View.OnClickListener {
        public ViewOnClickListenerC7310j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ProcessActivity processActivity = ProcessActivity.this;
            C7304d c7304d = ProcessActivity.f33721w;
            Objects.requireNonNull(processActivity);
            Intrinsics2.m13089e("toggleShowHideEffectCustom", "message");
            RelativeLayout relativeLayout = (RelativeLayout) processActivity.m14407U(R.id.layoutEffectCustom2);
            Intrinsics2.m13088d(relativeLayout, "layoutEffectCustom2");
            if (relativeLayout.getVisibility() == 4) {
                Intrinsics2.m13089e("toggleShowHideEffectCustom1", "message");
                RelativeLayout relativeLayout2 = (RelativeLayout) processActivity.m14407U(R.id.layoutEffectCustom2);
                Intrinsics2.m13088d(relativeLayout2, "layoutEffectCustom2");
                relativeLayout2.setVisibility(0);
                LinearLayout linearLayout = (LinearLayout) processActivity.m14407U(R.id.layoutPagerEffect);
                Intrinsics2.m13088d(linearLayout, "layoutPagerEffect");
                linearLayout.setVisibility(4);
                LinearLayout linearLayout2 = (LinearLayout) processActivity.m14407U(R.id.layoutPagerEffect);
                Intrinsics2.m13088d(linearLayout2, "layoutPagerEffect");
                SkuDao.a.m14101n(linearLayout2, false);
                RelativeLayout relativeLayout3 = (RelativeLayout) processActivity.m14407U(R.id.layoutEffectCustom2);
                Intrinsics2.m13088d(relativeLayout3, "layoutEffectCustom2");
                SkuDao.a.m14101n(relativeLayout3, true);
                return;
            }
            Intrinsics2.m13089e("toggleShowHideEffectCustom2", "message");
            RelativeLayout relativeLayout4 = (RelativeLayout) processActivity.m14407U(R.id.layoutEffectCustom2);
            Intrinsics2.m13088d(relativeLayout4, "layoutEffectCustom2");
            relativeLayout4.setVisibility(4);
            LinearLayout linearLayout3 = (LinearLayout) processActivity.m14407U(R.id.layoutPagerEffect);
            Intrinsics2.m13088d(linearLayout3, "layoutPagerEffect");
            linearLayout3.setVisibility(0);
            LinearLayout linearLayout4 = (LinearLayout) processActivity.m14407U(R.id.layoutPagerEffect);
            Intrinsics2.m13088d(linearLayout4, "layoutPagerEffect");
            SkuDao.a.m14101n(linearLayout4, true);
            RelativeLayout relativeLayout5 = (RelativeLayout) processActivity.m14407U(R.id.layoutEffectCustom2);
            Intrinsics2.m13088d(relativeLayout5, "layoutEffectCustom2");
            SkuDao.a.m14101n(relativeLayout5, false);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.ProcessActivity$k */
    /* JADX INFO: compiled from: ProcessActivity.kt */
    public static final class C7311k extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ BottomSheetDialog f33785g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7311k(BottomSheetDialog bottomSheetDialog) {
            super(0);
            this.f33785g = bottomSheetDialog;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            this.f33785g.dismiss();
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: V */
    public static final void m14402V(ProcessActivity processActivity) {
        Objects.requireNonNull(processActivity);
        File file = new File(processActivity.f33723B, outline.m1551B(new StringBuilder(), processActivity.f33768z, "-tone", 5));
        if (file.exists()) {
            Utils7.m13078a(file);
        }
        File file2 = new File(processActivity.f33724C, outline.m1551B(new StringBuilder(), processActivity.f33768z, "-new", 5));
        if (file2.exists()) {
            Utils7.m13078a(file2);
        }
        TextView textView = (TextView) processActivity.m14407U(R.id.txtProgress);
        Intrinsics2.m13088d(textView, "txtProgress");
        SkuDao.a.m14109v(textView);
        ImageView imageView = (ImageView) processActivity.m14407U(R.id.imgProgressSuccess);
        Intrinsics2.m13088d(imageView, "imgProgressSuccess");
        SkuDao.a.m14068T(imageView);
        TextView textView2 = (TextView) processActivity.m14407U(R.id.txtMessageProgress);
        Intrinsics2.m13088d(textView2, "txtMessageProgress");
        textView2.setText(processActivity.getString(R.string.message_process_finish));
        PostActivity.C7298d c7298d = PostActivity.f33691w;
        String str = processActivity.f33768z;
        String str2 = processActivity.f33722A;
        int i = processActivity.f33737P;
        RecordingEntity recordingEntityM421d = processActivity.mo13969R().f31869x.m421d();
        Long l = recordingEntityM421d != null ? recordingEntityM421d.f32330f : null;
        Objects.requireNonNull(c7298d);
        Intrinsics2.m13089e(processActivity, "context");
        Intent intent = new Intent(processActivity, (Class<?>) PostActivity.class);
        intent.putExtra("file_name", str);
        intent.putExtra("folder_name", str2);
        intent.putExtra(CainMediaMetadataRetriever.METADATA_KEY_DURATION, i);
        intent.putExtra("recording_entity_id", l);
        processActivity.startActivity(intent);
        processActivity.f32012v = false;
        processActivity.finish();
    }

    /* JADX INFO: renamed from: W */
    public static final void m14403W(ProcessActivity processActivity) {
        processActivity.f33762o0 = true;
        StringBuilder sb = new StringBuilder();
        sb.append(processActivity.f33725D);
        sb.append("/thumbnail_");
        String strM1550A = outline.m1550A(sb, processActivity.f33768z, ".png");
        String path = processActivity.f33726E;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(processActivity.f33729H);
        sb2.append("/");
        File file = new File(outline.m1604z(sb2, processActivity.f33768z, 6));
        if (file.exists()) {
            path = file.getPath();
            Intrinsics2.m13088d(path, "file.path");
        }
        String str = "-i " + path + " -ss 00:00:00.000 -vframes 1 -y " + strM1550A;
        Intrinsics2.m13089e(str, "message");
        FFmpeg.m1606a(str, new C6602v(processActivity, strM1550A));
    }

    /* JADX INFO: renamed from: X */
    public static final void m14404X(ProcessActivity processActivity) {
        RecordingEntity recordingEntityM421d = processActivity.mo13969R().f31869x.m421d();
        if (recordingEntityM421d != null) {
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            User user = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
            recordingEntityM421d.f32332h = user != null ? user.getId() : 0;
            if (processActivity.f33733L) {
                recordingEntityM421d.f32341q = Integer.valueOf(processActivity.durationSeconds());
            }
            recordingEntityM421d.f32342r = Integer.valueOf(processActivity.f33736O);
            recordingEntityM421d.f32344t = processActivity.f33747Z;
            Date date = new Date();
            Locale locale = Locale.getDefault();
            Intrinsics2.m13088d(locale, "Locale.getDefault()");
            String strValueOf = String.valueOf(SkuDao.a.m14090h0(date, "yyyy-MM-dd HH:mm:ss", locale));
            Intrinsics2.m13089e(strValueOf, "<set-?>");
            recordingEntityM421d.f32329C = strValueOf;
            if (!Intrinsics2.m13085a(processActivity.f33739R, "")) {
                recordingEntityM421d.m14116a(processActivity.f33739R);
            }
            if (processActivity.f33740S.size() > 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Image image : processActivity.f33740S) {
                    arrayList2.add(Integer.valueOf(image.getId()));
                    arrayList.add(image.getImage());
                }
                recordingEntityM421d.f32340p = _Collections.m13046k(arrayList, null, null, null, 0, null, null, 63);
                recordingEntityM421d.f32339o = _Collections.m13046k(arrayList2, null, null, null, 0, null, null, 63);
            }
            C6799h0 c6799h0Mo13969R = processActivity.mo13969R();
            Intrinsics2.m13088d(recordingEntityM421d, "recordingEntity");
            c6799h0Mo13969R.m13951q(recordingEntityM421d);
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final void m14405Y(ProcessActivity processActivity) {
        Objects.requireNonNull(processActivity);
        LoginFragment2.f31647t0.m13940a(0).mo5469c1(processActivity.m16577C(), "LoginForm");
    }

    /* JADX INFO: renamed from: Z */
    public static final void m14406Z(ProcessActivity processActivity) {
        boolean z = !processActivity.f33734M;
        processActivity.f33734M = z;
        processActivity.onPlayPause(z);
        if (processActivity.f33734M) {
            if (processActivity.f33757j0) {
                CainMediaPlayer cainMediaPlayer = processActivity.f33750c0;
                if (cainMediaPlayer != null) {
                    cainMediaPlayer.resume();
                }
                CainMediaPlayer cainMediaPlayer2 = processActivity.f33750c0;
                if (cainMediaPlayer2 != null) {
                    cainMediaPlayer2.seekTo(processActivity.currentMs());
                }
                CainMediaPlayer cainMediaPlayer3 = processActivity.f33753f0;
                if (cainMediaPlayer3 != null) {
                    cainMediaPlayer3.resume();
                }
                CainMediaPlayer cainMediaPlayer4 = processActivity.f33753f0;
                if (cainMediaPlayer4 != null) {
                    cainMediaPlayer4.seekTo(processActivity.currentMs());
                }
            } else {
                processActivity.f33757j0 = true;
                CainMediaPlayer cainMediaPlayer5 = processActivity.f33750c0;
                if (cainMediaPlayer5 != null) {
                    cainMediaPlayer5.start();
                }
                CainMediaPlayer cainMediaPlayer6 = processActivity.f33753f0;
                if (cainMediaPlayer6 != null) {
                    cainMediaPlayer6.start();
                }
            }
            processActivity.m14413f0();
            ((ImageButton) processActivity.m14407U(R.id.btnPlay)).setImageResource(R.drawable.ic_pause_white);
            processActivity.setPositionRhythm(processActivity.f33747Z);
        } else {
            processActivity.m14410c0();
            processActivity.m14411d0();
            ((ImageButton) processActivity.m14407U(R.id.btnPlay)).setImageResource(R.drawable.ic_play_white_30dp);
        }
        processActivity.f33737P = processActivity.durationSeconds();
        TextView textView = (TextView) processActivity.m14407U(R.id.durationTime);
        Intrinsics2.m13088d(textView, "durationTime");
        textView.setText(NowPlayingMetadata.f32263a.m14034a(processActivity.durationSeconds()));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33766x;
    }

    /* JADX INFO: renamed from: U */
    public View m14407U(int i) {
        if (this.f33765r0 == null) {
            this.f33765r0 = new HashMap();
        }
        View view = (View) this.f33765r0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33765r0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public C6799h0 mo13969R() {
        return (C6799h0) this.f33767y.getValue();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m14409b0(float f, String str, String str2, String str3) {
        TextView textView = (TextView) m14407U(R.id.txtMessageProgress);
        Intrinsics2.m13088d(textView, "txtMessageProgress");
        textView.setText(getString(R.string.message_processing_converting));
        StringBuilder sb = new StringBuilder();
        sb.append("-i ");
        sb.append(str);
        sb.append(" -i ");
        String strM1552C = outline.m1552C(sb, str2, " -c:v copy -map 0:v:0 -map 1:a:0 -y ", str3);
        if (f > 0) {
            strM1552C = "-i " + str + " -i " + str2 + " -af volume=" + f + "dB -c:v copy -map 0:v:0 -map 1:a:0 -y " + str3;
        }
        Intrinsics2.m13089e(strM1552C, "message");
        FFmpeg.m1606a(strM1552C, new C7308h(str3));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m14410c0() {
        CainMediaPlayer cainMediaPlayer = this.f33750c0;
        if (cainMediaPlayer != null) {
            cainMediaPlayer.pause();
        }
    }

    public final native float currentMs();

    public final native int currentSeconds();

    /* JADX INFO: renamed from: d0 */
    public final void m14411d0() {
        CainMediaPlayer cainMediaPlayer = this.f33753f0;
        if (cainMediaPlayer != null) {
            cainMediaPlayer.pause();
        }
    }

    public final native int durationSeconds();

    @Override // p555j.p556a.p557a.p558a.p559a.p560a.EffectFragment.c
    /* JADX INFO: renamed from: e */
    public void mo13872e(int i) {
        Intrinsics2.m13089e(String.valueOf(i), "message");
        this.f33747Z = i;
        if (this.f33733L) {
            setPositionRhythm(i);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m14412e0() {
        if (this.f33734M) {
            this.f33734M = false;
            onAudioPause();
            m14410c0();
            m14411d0();
            ((ImageButton) m14407U(R.id.btnPlay)).setImageResource(R.drawable.ic_play_white_30dp);
        }
        if (this.f33743V <= 0 || this.f33741T) {
            finish();
            return;
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.bottom_sheet_audio_cancel, (ViewGroup) null);
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(viewInflate);
        bottomSheetDialog.show();
        Intrinsics2.m13088d(viewInflate, "view");
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.optionDraft);
        Intrinsics2.m13088d(linearLayout, "view.optionDraft");
        SkuDao.a.m14067S(linearLayout, new C7301a(0, this, bottomSheetDialog));
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.optionDelete);
        Intrinsics2.m13088d(linearLayout2, "view.optionDelete");
        SkuDao.a.m14067S(linearLayout2, new C7301a(1, this, bottomSheetDialog));
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.optionContinue);
        Intrinsics2.m13088d(linearLayout3, "view.optionContinue");
        SkuDao.a.m14067S(linearLayout3, new C7311k(bottomSheetDialog));
    }

    public final native void effect(int i);

    /* JADX INFO: renamed from: f0 */
    public final void m14413f0() {
        Timer timer = this.f33735N;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f33735N = timer2;
        if (timer2 != null) {
            timer2.scheduleAtFixedRate(new C7305e(), 100L, 1000L);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2.c
    /* JADX INFO: renamed from: g */
    public void mo13941g(int i) {
        SkuDao.a.m14092i0(this, R.string.msg_login_success, 0, 2);
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Intrinsics2.m13089e(String.valueOf(i), "message");
        FragmentManager fragmentManagerM16577C = m16577C();
        Intrinsics2.m13088d(fragmentManagerM16577C, "supportFragmentManager");
        for (Fragment fragment : fragmentManagerM16577C.m16659L()) {
            if (fragment instanceof LoginFragment2) {
                fragment.mo2588X(i, i2, intent);
            }
        }
    }

    public final native void onAudioPause();

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m14412e0();
    }

    public final native void onBackground();

    public final native void onCleanup();

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14055G(this, true, false);
        Toolbar toolbar = (Toolbar) m14407U(R.id.toolbar);
        Intrinsics2.m13088d(toolbar, "toolbar");
        SkuDao.a.m14066R(toolbar, SkuDao.a.m14105r(this));
        m14615N((Toolbar) m14407U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14593m(true);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14594n(true);
        }
        this.f33749b0 = C5239a.m11682a(Firebase.f27225a);
        Intent intent = getIntent();
        Intrinsics2.m13088d(intent, "intent");
        Bundle extras = intent.getExtras();
        this.f33768z = extras != null ? extras.getString("file_name") : null;
        Intent intent2 = getIntent();
        Intrinsics2.m13088d(intent2, "intent");
        Bundle extras2 = intent2.getExtras();
        this.f33722A = extras2 != null ? extras2.getString("folder_name") : null;
        Intent intent3 = getIntent();
        Intrinsics2.m13088d(intent3, "intent");
        Bundle extras3 = intent3.getExtras();
        this.f33741T = extras3 != null ? extras3.getBoolean("is_from_draft") : false;
        Intent intent4 = getIntent();
        Intrinsics2.m13088d(intent4, "intent");
        Bundle extras4 = intent4.getExtras();
        this.f33748a0 = extras4 != null ? extras4.getInt("current_tone") : 0;
        Intent intent5 = getIntent();
        Intrinsics2.m13088d(intent5, "intent");
        Bundle extras5 = intent5.getExtras();
        this.f33747Z = extras5 != null ? extras5.getInt("current_rhythm") : 0;
        Intent intent6 = getIntent();
        Intrinsics2.m13088d(intent6, "intent");
        Bundle extras6 = intent6.getExtras();
        this.f33737P = extras6 != null ? extras6.getInt(CainMediaMetadataRetriever.METADATA_KEY_DURATION) : 0;
        Intent intent7 = getIntent();
        Intrinsics2.m13088d(intent7, "intent");
        Bundle extras7 = intent7.getExtras();
        this.f33760m0 = extras7 != null ? extras7.getInt("format") : this.f33760m0;
        Intent intent8 = getIntent();
        Intrinsics2.m13088d(intent8, "intent");
        Bundle extras8 = intent8.getExtras();
        this.f33761n0 = extras8 != null ? extras8.getInt("video_ratio") : this.f33761n0;
        Intent intent9 = getIntent();
        Intrinsics2.m13088d(intent9, "intent");
        Bundle extras9 = intent9.getExtras();
        this.f33759l0 = extras9 != null ? extras9.getInt("sing_type") : this.f33759l0;
        Intent intent10 = getIntent();
        Intrinsics2.m13088d(intent10, "intent");
        Bundle extras10 = intent10.getExtras();
        this.f33743V = extras10 != null ? extras10.getLong("recording_entity_id") : 0L;
        C6799h0 c6799h0Mo13969R = mo13969R();
        long j2 = this.f33743V;
        Objects.requireNonNull(c6799h0Mo13969R);
        C5729a.m12428A(C8310a.m16440e(c6799h0Mo13969R), null, 0, new C6805k0(c6799h0Mo13969R, j2, null), 3, null);
        Intrinsics2.m13088d(PathUtils.m14260f(getApplicationContext()), "PathUtils.getRootDirPath(applicationContext)");
        String strM14258d = PathUtils.m14258d(getApplicationContext());
        Intrinsics2.m13088d(strM14258d, "PathUtils.getAudioPath(applicationContext)");
        this.f33723B = strM14258d;
        this.f33724C = PathUtils.m14263i(getApplicationContext()) + '/' + this.f33722A;
        this.f33725D = PathUtils.m14262h(getApplicationContext()) + '/' + this.f33722A;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f33725D);
        sb.append("/");
        this.f33726E = outline.m1604z(sb, this.f33768z, 6);
        String str = PathUtils.m14259e(getApplicationContext()) + '/' + this.f33722A;
        PathUtils.m14255a(str);
        Intrinsics2.m13088d(str, "PathUtils.checkCreateFol…text) + '/' + folderName)");
        this.f33729H = str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33729H);
        sb2.append("/");
        this.f33730I = outline.m1604z(sb2, this.f33768z, 5);
        if (this.f33760m0 == 1) {
            if (this.f33750c0 == null) {
                this.f33750c0 = new CainMediaPlayer();
            }
            if (this.f33759l0 == 2 && this.f33753f0 == null) {
                this.f33753f0 = new CainMediaPlayer();
            }
        }
        TextView textView = (TextView) m14407U(R.id.durationTime);
        Intrinsics2.m13088d(textView, "durationTime");
        textView.setText(NowPlayingMetadata.f32263a.m14034a(this.f33737P));
        ((RelativeLayout) m14407U(R.id.layoutEffectCustom2)).setBackgroundColor(0);
        LinearLayout linearLayout = (LinearLayout) m14407U(R.id.layoutPagerEffect);
        Intrinsics2.m13088d(linearLayout, "layoutPagerEffect");
        SkuDao.a.m14101n(linearLayout, true);
        RelativeLayout relativeLayout = (RelativeLayout) m14407U(R.id.layoutEffectCustom2);
        Intrinsics2.m13088d(relativeLayout, "layoutEffectCustom2");
        SkuDao.a.m14101n(relativeLayout, false);
        this.f33735N = new Timer();
        Config.f28136b = new C6599s(this);
        this.f33738Q.add("");
        mo13969R().f31869x.mo422e(this, new C7309i());
        ((ImageButton) m14407U(R.id.btnEffectCustomClose2)).setOnClickListener(new ViewOnClickListenerC7310j());
        TextView textView2 = (TextView) m14407U(R.id.btnCreateVideo);
        Intrinsics2.m13088d(textView2, "btnCreateVideo");
        SkuDao.a.m14067S(textView2, new C7302b(0, this));
        TextView textView3 = (TextView) m14407U(R.id.btnDraft);
        Intrinsics2.m13088d(textView3, "btnDraft");
        SkuDao.a.m14067S(textView3, new C7302b(1, this));
        this.f32012v = this.f33741T;
        if (this.f33760m0 != 1) {
            ((KenBurnsView) m14407U(R.id.kenBurnsView)).setScaleType(ImageView.ScaleType.CENTER_CROP);
            ((KenBurnsView) m14407U(R.id.kenBurnsView)).m14335d(this.f33738Q);
            RelativeLayout relativeLayout2 = (RelativeLayout) m14407U(R.id.layoutPlayer);
            Intrinsics2.m13088d(relativeLayout2, "layoutPlayer");
            SkuDao.a.m14061M(relativeLayout2);
            VideoTextureView videoTextureView = (VideoTextureView) m14407U(R.id.videoPlayerView);
            Intrinsics2.m13088d(videoTextureView, "videoPlayerView");
            SkuDao.a.m14061M(videoTextureView);
            LinearLayout linearLayout2 = (LinearLayout) m14407U(R.id.layoutPagerEffect);
            Intrinsics2.m13088d(linearLayout2, "layoutPagerEffect");
            linearLayout2.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.dp_360);
            return;
        }
        this.f33758k0 = true;
        ImageView imageView = (ImageView) m14407U(R.id.thumbnailBackground);
        Intrinsics2.m13088d(imageView, "thumbnailBackground");
        SkuDao.a.m14061M(imageView);
        KenBurnsView kenBurnsView = (KenBurnsView) m14407U(R.id.kenBurnsView);
        Intrinsics2.m13088d(kenBurnsView, "kenBurnsView");
        SkuDao.a.m14061M(kenBurnsView);
        View viewM14407U = m14407U(R.id.dimView);
        Intrinsics2.m13088d(viewM14407U, "dimView");
        SkuDao.a.m14061M(viewM14407U);
        TextView textView4 = (TextView) m14407U(R.id.btnCreateVideo);
        Intrinsics2.m13088d(textView4, "btnCreateVideo");
        SkuDao.a.m14061M(textView4);
        RelativeLayout relativeLayout3 = (RelativeLayout) m14407U(R.id.layoutPlayer);
        Intrinsics2.m13088d(relativeLayout3, "layoutPlayer");
        SkuDao.a.m14068T(relativeLayout3);
        VideoTextureView videoTextureView2 = (VideoTextureView) m14407U(R.id.videoPlayerView);
        Intrinsics2.m13088d(videoTextureView2, "videoPlayerView");
        SkuDao.a.m14068T(videoTextureView2);
        if (this.f33759l0 == 2) {
            int iM14104q = SkuDao.a.m14104q(this) / 2;
            int i = (iM14104q * 960) / 540;
            Intrinsics2.m13089e(String.valueOf(iM14104q), "message");
            Intrinsics2.m13089e(String.valueOf(i), "message");
            VideoTextureView videoTextureView3 = (VideoTextureView) m14407U(R.id.videoPlayerView);
            Intrinsics2.m13088d(videoTextureView3, "videoPlayerView");
            videoTextureView3.getLayoutParams().width = iM14104q;
            VideoTextureView videoTextureView4 = (VideoTextureView) m14407U(R.id.videoPlayerView);
            Intrinsics2.m13088d(videoTextureView4, "videoPlayerView");
            videoTextureView4.getLayoutParams().height = i;
            VideoTextureView videoTextureView5 = (VideoTextureView) m14407U(R.id.videoPlayerViewDuet);
            Intrinsics2.m13088d(videoTextureView5, "videoPlayerViewDuet");
            videoTextureView5.getLayoutParams().width = iM14104q;
            VideoTextureView videoTextureView6 = (VideoTextureView) m14407U(R.id.videoPlayerViewDuet);
            Intrinsics2.m13088d(videoTextureView6, "videoPlayerViewDuet");
            videoTextureView6.getLayoutParams().height = i;
            VideoTextureView videoTextureView7 = (VideoTextureView) m14407U(R.id.videoPlayerViewDuet);
            Intrinsics2.m13088d(videoTextureView7, "videoPlayerViewDuet");
            SkuDao.a.m14068T(videoTextureView7);
            VideoTextureView videoTextureView8 = (VideoTextureView) m14407U(R.id.videoPlayerViewDuet);
            Intrinsics2.m13088d(videoTextureView8, "videoPlayerViewDuet");
            videoTextureView8.setSurfaceTextureListener(this.f33764q0);
            LinearLayout linearLayout3 = (LinearLayout) m14407U(R.id.layoutPagerEffect);
            Intrinsics2.m13088d(linearLayout3, "layoutPagerEffect");
            linearLayout3.getLayoutParams().height = (SkuDao.a.m14103p(this) - i) - getResources().getDimensionPixelSize(R.dimen.dp_68);
        } else {
            LinearLayout linearLayout4 = (LinearLayout) m14407U(R.id.layoutPagerEffect);
            Intrinsics2.m13088d(linearLayout4, "layoutPagerEffect");
            linearLayout4.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.dp_190);
        }
        VideoTextureView videoTextureView9 = (VideoTextureView) m14407U(R.id.videoPlayerView);
        Intrinsics2.m13088d(videoTextureView9, "videoPlayerView");
        videoTextureView9.setSurfaceTextureListener(this.f33763p0);
    }

    @Override // p636z0.p644b.p645c.AppCompatActivity, p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Timer timer = this.f33735N;
        if (timer != null) {
            timer.cancel();
        }
        onCleanup();
        EventBus3.m13810b().m13821m(this);
        CainMediaPlayer cainMediaPlayer = this.f33750c0;
        if (cainMediaPlayer != null) {
            cainMediaPlayer.reset();
        }
        this.f33750c0 = null;
        Surface surface = this.f33752e0;
        if (surface != null) {
            surface.release();
        }
        this.f33752e0 = null;
        SurfaceTexture surfaceTexture = this.f33751d0;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f33751d0 = null;
        CainMediaPlayer cainMediaPlayer2 = this.f33753f0;
        if (cainMediaPlayer2 != null) {
            cainMediaPlayer2.reset();
        }
        this.f33753f0 = null;
        Surface surface2 = this.f33755h0;
        if (surface2 != null) {
            surface2.release();
        }
        this.f33755h0 = null;
        SurfaceTexture surfaceTexture2 = this.f33754g0;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.f33754g0 = null;
        super.onDestroy();
    }

    public final native void onForeground();

    @Subscribe
    public final void onImageEvent(ImageEvent imageEvent) {
        Intrinsics2.m13089e(imageEvent, "event");
        if (this.f33758k0 || imageEvent.f32051a.size() <= 0) {
            return;
        }
        this.f33738Q.clear();
        Iterator<T> it = imageEvent.f32051a.iterator();
        while (it.hasNext()) {
            this.f33738Q.add(((Image) it.next()).getImage());
        }
        ((KenBurnsView) m14407U(R.id.kenBurnsView)).m14335d(this.f33738Q);
        this.f33739R = imageEvent.f32051a.get(0).getImage();
        this.f33740S = imageEvent.f32051a;
    }

    public final native void onMixer(String str, String str2, String str3, int i);

    public final native void onMixerWithTone(String str, String str2, String str3, String str4, int i, int i2);

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics2.m13089e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        m14412e0();
        return true;
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f33733L) {
            onBackground();
        }
    }

    public final native void onPlayPause(boolean z);

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f33733L) {
            onForeground();
        }
        if (this.f33734M) {
            CainMediaPlayer cainMediaPlayer = this.f33750c0;
            if (cainMediaPlayer != null) {
                cainMediaPlayer.resume();
            }
            CainMediaPlayer cainMediaPlayer2 = this.f33753f0;
            if (cainMediaPlayer2 != null) {
                cainMediaPlayer2.resume();
            }
        }
    }

    @Override // p636z0.p644b.p645c.AppCompatActivity, p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (EventBus3.m13810b().m13814f(this)) {
            return;
        }
        EventBus3.m13810b().m13819k(this);
    }

    public final native void processingAudio(int i, int i2, String str, String str2, int i3, int i4, int i5, int i6);

    public final native void processingCustomReverb(int i, int i2);

    public final native void processingEnableReverb(boolean z);

    @Override // p555j.p556a.p557a.p558a.p559a.p560a.VolumeFragment.b
    /* JADX INFO: renamed from: q */
    public void mo13887q(int i, int i2) {
        if (this.f33733L) {
            setVolume(i, i2);
        }
    }

    public final native void setPositionRhythm(float f);

    public final native void setSeek(float f, float f2);

    public final native void setTone(int i);

    public final native void setVolume(int i, int i2);

    @Override // p555j.p556a.p557a.p558a.p559a.p560a.EffectFragment.c
    /* JADX INFO: renamed from: v */
    public void mo13873v(int i, int i2) {
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p560a.EffectFragment.c
    /* JADX INFO: renamed from: w */
    public void mo13874w(int i) {
        boolean z = this.f33733L;
        if (z) {
            switch (i) {
                case R.id.rbBolero /* 2131362673 */:
                    this.f33736O = 3;
                    break;
                case R.id.rbCustom /* 2131362674 */:
                    if (z) {
                        Intrinsics2.m13089e("setCustomEffect", "message");
                        SeekBar seekBar = (SeekBar) m14407U(R.id.seekBarReverb2);
                        Intrinsics2.m13088d(seekBar, "seekBarReverb2");
                        int progress = seekBar.getProgress();
                        SeekBar seekBar2 = (SeekBar) m14407U(R.id.seekBarRoomSize2);
                        Intrinsics2.m13088d(seekBar2, "seekBarRoomSize2");
                        processingCustomReverb(progress, seekBar2.getProgress());
                    }
                    RelativeLayout relativeLayout = (RelativeLayout) m14407U(R.id.layoutEffectCustom2);
                    Intrinsics2.m13088d(relativeLayout, "layoutEffectCustom2");
                    relativeLayout.setVisibility(0);
                    LinearLayout linearLayout = (LinearLayout) m14407U(R.id.layoutPagerEffect);
                    Intrinsics2.m13088d(linearLayout, "layoutPagerEffect");
                    linearLayout.setVisibility(4);
                    LinearLayout linearLayout2 = (LinearLayout) m14407U(R.id.layoutPagerEffect);
                    Intrinsics2.m13088d(linearLayout2, "layoutPagerEffect");
                    SkuDao.a.m14101n(linearLayout2, false);
                    RelativeLayout relativeLayout2 = (RelativeLayout) m14407U(R.id.layoutEffectCustom2);
                    Intrinsics2.m13088d(relativeLayout2, "layoutEffectCustom2");
                    SkuDao.a.m14101n(relativeLayout2, true);
                    this.f33736O = 5;
                    break;
                case R.id.rbHall /* 2131362675 */:
                    this.f33736O = 4;
                    break;
                case R.id.rbKaraoke /* 2131362676 */:
                    this.f33736O = 2;
                    break;
                case R.id.rbNone /* 2131362677 */:
                    processingEnableReverb(false);
                    this.f33736O = 0;
                    break;
                case R.id.rbStudio /* 2131362678 */:
                    this.f33736O = 1;
                    break;
            }
            StringBuilder sbM1556G = outline.m1556G("effect ");
            sbM1556G.append(this.f33736O);
            Intrinsics2.m13089e(sbM1556G.toString(), "message");
            effect(this.f33736O);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p560a.BackgroundFragment2.c
    /* JADX INFO: renamed from: x */
    public void mo13885x(Simple2 simple2) {
        Intrinsics2.m13089e(simple2, "background");
        if (this.f33741T && this.f33742U) {
            this.f33742U = false;
            return;
        }
        this.f33738Q.clear();
        this.f33738Q.add(simple2.getValue());
        this.f33739R = simple2.getValue();
        RecordingEntity recordingEntityM421d = mo13969R().f31869x.m421d();
        if (recordingEntityM421d != null) {
            recordingEntityM421d.f32340p = null;
        }
        RecordingEntity recordingEntityM421d2 = mo13969R().f31869x.m421d();
        if (recordingEntityM421d2 != null) {
            recordingEntityM421d2.f32339o = null;
        }
    }
}
