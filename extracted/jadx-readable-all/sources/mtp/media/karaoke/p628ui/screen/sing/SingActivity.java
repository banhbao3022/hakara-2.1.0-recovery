package mtp.media.karaoke.p628ui.screen.sing;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.arthenica.mobileffmpeg.Config;
import com.cgfay.camera.widget.RecordCountDownView;
import com.cgfay.media.CainMediaPlayer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mtp.media.karaoke.MainApplication;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.CustomSeekBar;
import mtp.media.karaoke.data.model.Duet;
import mtp.media.karaoke.data.model.Duet2;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.widgets.CircleProgressBar;
import mtp.media.karaoke.p628ui.widgets.VideoTextureView;
import p000.C6021d;
import p000.C7388n0;
import p007c.p008a.p009a.p029b.p038c.PlaybackState;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p007c.p071d.p078c.p079a.outline;
import p007c.p080e.p081a.ExecuteCallback;
import p007c.p080e.p081a.FFmpeg;
import p007c.p114h.p115a.p117b.CameraPreviewFragment2;
import p007c.p114h.p115a.p119d.CameraPreviewPresenter;
import p007c.p114h.p145f.p146b.HWMediaRecorder;
import p007c.p154j.Error2;
import p007c.p154j.OnDownloadListener;
import p007c.p154j.OnProgressListener;
import p007c.p154j.OnStartOrResumeListener;
import p007c.p154j.Progress;
import p007c.p154j.p161l.DownloadRequest;
import p007c.p154j.p161l.DownloadRequestBuilder;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.C2172f;
import p007c.p190n.p194b.p266d.p267a.C2191r;
import p007c.p190n.p194b.p266d.p267a.p268a0.AbstractC2104a;
import p007c.p190n.p385d.p386j.p389b.C5239a;
import p007c.p190n.p385d.p386j.p389b.C5240b;
import p007c.p190n.p385d.p427v.Firebase;
import p007c.p190n.p430e.GsonBuilder;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p481d0.StringsJVM;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p492w.Utils7;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.CoroutineScope2;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.p503c2.MainDispatchers;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p560a.EffectFragment;
import p555j.p556a.p557a.p558a.p559a.p560a.VolumeFragment;
import p555j.p556a.p557a.p558a.p559a.p590r.C6784a;
import p555j.p556a.p557a.p558a.p559a.p590r.C6785a0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6786b;
import p555j.p556a.p557a.p558a.p559a.p590r.C6788c;
import p555j.p556a.p557a.p558a.p559a.p590r.C6789c0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6790d;
import p555j.p556a.p557a.p558a.p559a.p590r.C6791d0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6792e;
import p555j.p556a.p557a.p558a.p559a.p590r.C6794f;
import p555j.p556a.p557a.p558a.p559a.p590r.C6796g;
import p555j.p556a.p557a.p558a.p559a.p590r.C6798h;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6800i;
import p555j.p556a.p557a.p558a.p559a.p590r.C6802j;
import p555j.p556a.p557a.p558a.p559a.p590r.C6804k;
import p555j.p556a.p557a.p558a.p559a.p590r.C6806l;
import p555j.p556a.p557a.p558a.p559a.p590r.C6807l0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6808m;
import p555j.p556a.p557a.p558a.p559a.p590r.C6809m0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6811n0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6812o;
import p555j.p556a.p557a.p558a.p559a.p590r.C6814q;
import p555j.p556a.p557a.p558a.p559a.p590r.C6815r;
import p555j.p556a.p557a.p558a.p559a.p590r.C6816s;
import p555j.p556a.p557a.p558a.p559a.p590r.C6817t;
import p555j.p556a.p557a.p558a.p559a.p590r.C6818u;
import p555j.p556a.p557a.p558a.p559a.p590r.C6819v;
import p555j.p556a.p557a.p558a.p559a.p590r.C6821x;
import p555j.p556a.p557a.p558a.p559a.p590r.C6822y;
import p555j.p556a.p557a.p558a.p559a.p590r.C6823z;
import p555j.p556a.p557a.p558a.p559a.p590r.CountDownTimerC6787b0;
import p555j.p556a.p557a.p558a.p559a.p590r.CountDownTimerC6820w;
import p555j.p556a.p557a.p558a.p559a.p590r.RunnableC6810n;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p558a.p596f.PlaylistManager;
import p555j.p556a.p557a.p558a.p596f.TipPagerAdapter;
import p555j.p556a.p557a.p597g.p599b.HeadphoneAlertDialog;
import p555j.p556a.p557a.p597g.p600c.ProgressItem;
import p555j.p556a.p557a.p597g.p605e.VideoMeta;
import p555j.p556a.p557a.p597g.p605e.YouTubeExtractor;
import p555j.p556a.p557a.p597g.p605e.YtFile;
import p555j.p556a.p557a.p606h.p607a.NowPlayingMetadata;
import p555j.p556a.p557a.p606h.p608b.Constants;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.SingActivityBinding;
import p555j.p556a.p557a.p619l.PathUtils;
import p636z0.p644b.p645c.AlertDialog;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p725k.p726c.ActivityCompat;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.Fragment;
import p636z0.p759s.MutableLiveData;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SingActivity extends BaseActivity3<SingActivityBinding, C6799h0> implements EffectFragment.c, VolumeFragment.b {

    /* JADX INFO: renamed from: w */
    public static final C7351e f33896w = new C7351e(null);

    /* JADX INFO: renamed from: A */
    public int f33897A;

    /* JADX INFO: renamed from: B */
    public int f33898B;

    /* JADX INFO: renamed from: C */
    public int f33899C;

    /* JADX INFO: renamed from: D */
    public YouTubePlayer f33900D;

    /* JADX INFO: renamed from: E */
    public C7352f f33901E;

    /* JADX INFO: renamed from: F */
    public boolean f33902F;

    /* JADX INFO: renamed from: G */
    public boolean f33903G;

    /* JADX INFO: renamed from: H */
    public boolean f33904H;

    /* JADX INFO: renamed from: I */
    public boolean f33905I;

    /* JADX INFO: renamed from: J */
    public boolean f33906J;

    /* JADX INFO: renamed from: K */
    public boolean f33907K;

    /* JADX INFO: renamed from: M */
    public int f33909M;

    /* JADX INFO: renamed from: N */
    public int f33910N;

    /* JADX INFO: renamed from: V */
    public int f33918V;

    /* JADX INFO: renamed from: W */
    public float f33919W;

    /* JADX INFO: renamed from: X */
    public float f33920X;

    /* JADX INFO: renamed from: d0 */
    public int f33926d0;

    /* JADX INFO: renamed from: e0 */
    public int f33927e0;

    /* JADX INFO: renamed from: f0 */
    public int f33928f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f33929g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f33930h0;

    /* JADX INFO: renamed from: j0 */
    public AbstractC2104a f33932j0;

    /* JADX INFO: renamed from: k0 */
    public FirebaseAnalytics f33933k0;

    /* JADX INFO: renamed from: l0 */
    public CameraPreviewFragment2 f33934l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f33935m0;

    /* JADX INFO: renamed from: n0 */
    public CainMediaPlayer f33936n0;

    /* JADX INFO: renamed from: o0 */
    public SurfaceTexture f33937o0;

    /* JADX INFO: renamed from: p0 */
    public Surface f33938p0;

    /* JADX INFO: renamed from: r0 */
    public boolean f33940r0;

    /* JADX INFO: renamed from: s0 */
    public PlaylistManager f33941s0;

    /* JADX INFO: renamed from: v0 */
    public int f33944v0;

    /* JADX INFO: renamed from: x0 */
    public HashMap f33947x0;

    /* JADX INFO: renamed from: z */
    public int f33949z;

    /* JADX INFO: renamed from: x */
    public final int f33946x = R.layout.sing_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f33948y = LazyJVM.m13020a(Lazy4.NONE, new C7350d(this, null, null));

    /* JADX INFO: renamed from: L */
    public int f33908L = 1;

    /* JADX INFO: renamed from: O */
    public String f33911O = "";

    /* JADX INFO: renamed from: P */
    public String f33912P = "";

    /* JADX INFO: renamed from: Q */
    public String f33913Q = "";

    /* JADX INFO: renamed from: R */
    public String f33914R = "";

    /* JADX INFO: renamed from: S */
    public String f33915S = "";

    /* JADX INFO: renamed from: T */
    public String f33916T = "";

    /* JADX INFO: renamed from: U */
    public String f33917U = "";

    /* JADX INFO: renamed from: Y */
    public String f33921Y = "";

    /* JADX INFO: renamed from: Z */
    public int f33922Z = 38;

    /* JADX INFO: renamed from: a0 */
    public int f33923a0 = 70;

    /* JADX INFO: renamed from: b0 */
    public int f33924b0 = 70;

    /* JADX INFO: renamed from: c0 */
    public int f33925c0 = 90;

    /* JADX INFO: renamed from: i0 */
    public ArrayList<Duet2> f33931i0 = new ArrayList<>();

    /* JADX INFO: renamed from: q0 */
    public final float f33939q0 = 0.5f;

    /* JADX INFO: renamed from: t0 */
    public boolean f33942t0 = true;

    /* JADX INFO: renamed from: u0 */
    public final TextureView.SurfaceTextureListener f33943u0 = new TextureViewSurfaceTextureListenerC7360n();

    /* JADX INFO: renamed from: w0 */
    public final int[] f33945w0 = {R.string.text_tip5, R.string.text_tip0, R.string.text_tip1, R.string.text_tip2, R.string.text_tip3, R.string.text_tip4, R.string.text_tip5, R.string.text_tip1, R.string.text_tip2, R.string.text_tip3, R.string.text_tip4, R.string.text_tip5, R.string.text_tip0, R.string.text_tip1, R.string.text_tip2, R.string.text_tip3, R.string.text_tip4, R.string.text_tip5, R.string.text_tip1, R.string.text_tip2, R.string.text_tip3, R.string.text_tip4, R.string.text_tip5, R.string.text_tip0, R.string.text_tip1, R.string.text_tip2, R.string.text_tip3, R.string.text_tip4};

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$a */
    /* JADX INFO: compiled from: java-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class ViewOnClickListenerC7347a implements View.OnClickListener {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f33950f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Object f33951g;

        public ViewOnClickListenerC7347a(int i, Object obj) {
            this.f33950f = i;
            this.f33951g = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z;
            int i = this.f33950f;
            if (i == 0) {
                EffectFragment.b.m13871a(EffectFragment.f30959s0, true, 0, ((SingActivity) this.f33951g).f33926d0, false, 10).mo5469c1(((SingActivity) this.f33951g).m16577C(), "EffectForm");
                return;
            }
            if (i == 1) {
                Objects.requireNonNull(VolumeFragment.f30997s0);
                VolumeFragment volumeFragment = new VolumeFragment();
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_sing", true);
                volumeFragment.m16540M0(bundle);
                volumeFragment.mo5469c1(((SingActivity) this.f33951g).m16577C(), "VolumeForm");
                return;
            }
            if (i == 2) {
                LinearLayout linearLayout = (LinearLayout) ((SingActivity) this.f33951g).m14442U(R.id.layoutLoopBack);
                Intrinsics2.m13088d(linearLayout, "layoutLoopBack");
                SkuDao.a.m14109v(linearLayout);
                return;
            }
            if (i == 3) {
                LinearLayout linearLayout2 = (LinearLayout) ((SingActivity) this.f33951g).m14442U(R.id.layoutLoopBack);
                Intrinsics2.m13088d(linearLayout2, "layoutLoopBack");
                if (linearLayout2.getVisibility() == 0) {
                    LinearLayout linearLayout3 = (LinearLayout) ((SingActivity) this.f33951g).m14442U(R.id.layoutLoopBack);
                    Intrinsics2.m13088d(linearLayout3, "layoutLoopBack");
                    linearLayout3.setVisibility(4);
                    return;
                } else {
                    LinearLayout linearLayout4 = (LinearLayout) ((SingActivity) this.f33951g).m14442U(R.id.layoutLoopBack);
                    Intrinsics2.m13088d(linearLayout4, "layoutLoopBack");
                    linearLayout4.setVisibility(0);
                    return;
                }
            }
            if (i != 4) {
                throw null;
            }
            SingActivity singActivity = (SingActivity) this.f33951g;
            if (singActivity.f33935m0) {
                Fragment fragmentM16656I = singActivity.m16577C().m16656I("fragment_camera");
                if (fragmentM16656I != null) {
                    BackStackRecord backStackRecord = new BackStackRecord(((SingActivity) this.f33951g).m16577C());
                    backStackRecord.mo16449h(fragmentM16656I);
                    backStackRecord.mo16444c();
                    SingActivity singActivity2 = (SingActivity) this.f33951g;
                    singActivity2.f33934l0 = null;
                    singActivity2.f33935m0 = false;
                    ImageView imageView = (ImageView) singActivity2.m14442U(R.id.icCameraSwitch);
                    Intrinsics2.m13088d(imageView, "icCameraSwitch");
                    SkuDao.a.m14109v(imageView);
                    ((ImageView) ((SingActivity) this.f33951g).m14442U(R.id.btnShowCamera)).setImageResource(R.drawable.ic_camera_mv);
                    return;
                }
                return;
            }
            String[] strArr = {"android.permission.CAMERA"};
            int i2 = 0;
            while (true) {
                if (i2 >= 1) {
                    z = true;
                    break;
                } else {
                    if (ContextCompat.m16133a(singActivity, strArr[i2]) != 0) {
                        ActivityCompat.m16082c(singActivity, strArr, 1);
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            if (!z) {
                ((SingActivity) this.f33951g).f33940r0 = true;
                return;
            }
            FrameLayout frameLayout = (FrameLayout) ((SingActivity) this.f33951g).m14442U(R.id.fragment_camera_container);
            Intrinsics2.m13088d(frameLayout, "fragment_camera_container");
            YouTubePlayerView youTubePlayerView = (YouTubePlayerView) ((SingActivity) this.f33951g).m14442U(R.id.youTubePlayerView);
            Intrinsics2.m13088d(youTubePlayerView, "youTubePlayerView");
            int height = youTubePlayerView.getHeight();
            RelativeLayout relativeLayout = (RelativeLayout) ((SingActivity) this.f33951g).m14442U(R.id.linearLayout);
            Intrinsics2.m13088d(relativeLayout, "linearLayout");
            SkuDao.a.m14064P(frameLayout, height, 0, relativeLayout.getHeight(), 0);
            ((SingActivity) this.f33951g).m14453m0();
            ImageView imageView2 = (ImageView) ((SingActivity) this.f33951g).m14442U(R.id.icCameraSwitch);
            Intrinsics2.m13088d(imageView2, "icCameraSwitch");
            SkuDao.a.m14068T(imageView2);
            ((ImageView) ((SingActivity) this.f33951g).m14442U(R.id.btnShowCamera)).setImageResource(R.drawable.ic_camera_mv_none);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$b */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class DialogInterfaceOnClickListenerC7348b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$b$a */
        /* JADX INFO: compiled from: java-style lambda group */
        /* JADX INFO: loaded from: classes.dex */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ int f33953f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Object f33954g;

            public a(int i, Object obj) {
                this.f33953f = i;
                this.f33954g = obj;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = this.f33953f;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw null;
                    }
                    SingActivity.m14435W(SingActivity.this);
                    return;
                }
                SingActivity singActivity = SingActivity.this;
                C7351e c7351e = SingActivity.f33896w;
                singActivity.m14456q0();
                SingActivity.this.m14445e0();
                YouTubePlayer youTubePlayer = SingActivity.this.f33900D;
                if (youTubePlayer != null) {
                    youTubePlayer.pause();
                }
                SingActivity.this.finish();
            }
        }

        /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$b$b */
        /* JADX INFO: compiled from: SingActivity.kt */
        public static final class b extends Lambda implements InterfaceC6153a<Unit> {
            public b() {
                super(0);
            }

            @Override // p477d1.p493x.p494b.InterfaceC6153a
            /* JADX INFO: renamed from: c */
            public Unit mo2c() {
                SingActivity.m14435W(SingActivity.this);
                return Unit.f29502a;
            }
        }

        public DialogInterfaceOnClickListenerC7348b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                SingActivity.m14435W(SingActivity.this);
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                SingActivity singActivity = SingActivity.this;
                C7351e c7351e = SingActivity.f33896w;
                SkuDao.a.m14069U(singActivity, singActivity.getString(R.string.text_cancel_question), singActivity.getString(R.string.text_message_cancel), singActivity.getString(R.string.text_cancel), new C7388n0(1, singActivity), singActivity.getString(R.string.text_continue_recording), new C7388n0(0, singActivity), false, false, 64);
                return;
            }
            SingActivity singActivity2 = SingActivity.this;
            if (singActivity2.f33897A == 1) {
                SkuDao.a.m14069U(singActivity2, singActivity2.getString(R.string.text_message_recording_duet_title_finish), SingActivity.this.getString(R.string.text_message_recording_duet_message_finish), SingActivity.this.getString(R.string.text_continue_recording), new b(), null, null, false, false, 112);
                return;
            }
            if (singActivity2.f33920X >= 50) {
                SingActivity.m14440b0(singActivity2);
                return;
            }
            AlertDialog.a aVar = new AlertDialog.a(singActivity2);
            AlertController.C0050b c0050b = aVar.f34424a;
            c0050b.f228f = c0050b.f223a.getText(R.string.text_message_recording_finish);
            aVar.setNegativeButton(R.string.text_no, new a(0, this));
            aVar.setPositiveButton(R.string.text_yes, new a(1, this)).create().show();
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$c */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    public static final class C7349c extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f33956g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f33957h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7349c(int i, Object obj) {
            super(0);
            this.f33956g = i;
            this.f33957h = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            int i = this.f33956g;
            if (i == 0) {
                SingActivity singActivity = (SingActivity) this.f33957h;
                if (singActivity.f33903G || singActivity.f33930h0) {
                    singActivity.m14454n0();
                } else {
                    singActivity.onBackPressed();
                }
                return Unit.f29502a;
            }
            if (i == 1) {
                SingActivity.m14439a0((SingActivity) this.f33957h);
                return Unit.f29502a;
            }
            if (i == 2) {
                CustomSeekBar customSeekBar = (CustomSeekBar) ((SingActivity) this.f33957h).m14442U(R.id.songSeekBar);
                Intrinsics2.m13088d(customSeekBar, "songSeekBar");
                customSeekBar.setProgress(customSeekBar.getProgress() + 1);
                SingActivity singActivity2 = (SingActivity) this.f33957h;
                YouTubePlayer youTubePlayer = singActivity2.f33900D;
                if (youTubePlayer != null) {
                    CustomSeekBar customSeekBar2 = (CustomSeekBar) singActivity2.m14442U(R.id.songSeekBar);
                    Intrinsics2.m13088d(customSeekBar2, "songSeekBar");
                    youTubePlayer.seekTo(customSeekBar2.getProgress());
                }
                TextView textView = (TextView) ((SingActivity) this.f33957h).m14442U(R.id.currTime);
                Intrinsics2.m13088d(textView, "currTime");
                NowPlayingMetadata.a aVar = NowPlayingMetadata.f32263a;
                CustomSeekBar customSeekBar3 = (CustomSeekBar) ((SingActivity) this.f33957h).m14442U(R.id.songSeekBar);
                Intrinsics2.m13088d(customSeekBar3, "songSeekBar");
                textView.setText(aVar.m14034a(customSeekBar3.getProgress()));
                TextView textView2 = (TextView) ((SingActivity) this.f33957h).m14442U(R.id.timerTextView);
                Intrinsics2.m13088d(textView2, "timerTextView");
                CustomSeekBar customSeekBar4 = (CustomSeekBar) ((SingActivity) this.f33957h).m14442U(R.id.songSeekBar);
                Intrinsics2.m13088d(customSeekBar4, "songSeekBar");
                textView2.setText(aVar.m14034a(customSeekBar4.getProgress()));
                return Unit.f29502a;
            }
            if (i == 3) {
                CustomSeekBar customSeekBar5 = (CustomSeekBar) ((SingActivity) this.f33957h).m14442U(R.id.songSeekBar);
                Intrinsics2.m13088d(customSeekBar5, "songSeekBar");
                customSeekBar5.setProgress(customSeekBar5.getProgress() - 1);
                SingActivity singActivity3 = (SingActivity) this.f33957h;
                YouTubePlayer youTubePlayer2 = singActivity3.f33900D;
                if (youTubePlayer2 != null) {
                    CustomSeekBar customSeekBar6 = (CustomSeekBar) singActivity3.m14442U(R.id.songSeekBar);
                    Intrinsics2.m13088d(customSeekBar6, "songSeekBar");
                    youTubePlayer2.seekTo(customSeekBar6.getProgress());
                }
                TextView textView3 = (TextView) ((SingActivity) this.f33957h).m14442U(R.id.currTime);
                Intrinsics2.m13088d(textView3, "currTime");
                NowPlayingMetadata.a aVar2 = NowPlayingMetadata.f32263a;
                CustomSeekBar customSeekBar7 = (CustomSeekBar) ((SingActivity) this.f33957h).m14442U(R.id.songSeekBar);
                Intrinsics2.m13088d(customSeekBar7, "songSeekBar");
                textView3.setText(aVar2.m14034a(customSeekBar7.getProgress()));
                TextView textView4 = (TextView) ((SingActivity) this.f33957h).m14442U(R.id.timerTextView);
                Intrinsics2.m13088d(textView4, "timerTextView");
                CustomSeekBar customSeekBar8 = (CustomSeekBar) ((SingActivity) this.f33957h).m14442U(R.id.songSeekBar);
                Intrinsics2.m13088d(customSeekBar8, "songSeekBar");
                textView4.setText(aVar2.m14034a(customSeekBar8.getProgress()));
                return Unit.f29502a;
            }
            if (i != 4) {
                if (i != 5) {
                    throw null;
                }
                SingActivity singActivity4 = (SingActivity) this.f33957h;
                if (singActivity4.f33930h0) {
                    SingActivity.m14439a0(singActivity4);
                } else if (singActivity4.f33906J) {
                    singActivity4.m14454n0();
                }
                return Unit.f29502a;
            }
            Intrinsics2.m13089e("start youtube", "message");
            CircleProgressBar circleProgressBar = (CircleProgressBar) ((SingActivity) this.f33957h).m14442U(R.id.recording_progressBar);
            Intrinsics2.m13088d(circleProgressBar, "recording_progressBar");
            circleProgressBar.setProgress(0.0f);
            Intrinsics2.m13089e(((SingActivity) this.f33957h).f33904H + " - " + ((SingActivity) this.f33957h).f33906J + " - " + ((SingActivity) this.f33957h).f33905I, "message");
            SingActivity singActivity5 = (SingActivity) this.f33957h;
            if (singActivity5.f33904H && !singActivity5.f33906J && singActivity5.f33905I) {
                if (singActivity5.f33897A == 2 && singActivity5.f33935m0) {
                    Intrinsics2.m13089e("showVideoDuet", "message");
                    Intrinsics2.m13089e("openMediaPlayer", "message");
                    CainMediaPlayer cainMediaPlayer = singActivity5.f33936n0;
                    if (cainMediaPlayer != null) {
                        cainMediaPlayer.setOnPreparedListener(C6814q.f31916a);
                    }
                    CainMediaPlayer cainMediaPlayer2 = singActivity5.f33936n0;
                    if (cainMediaPlayer2 != null) {
                        cainMediaPlayer2.setOnCompletionListener(C6815r.f31917a);
                    }
                    CainMediaPlayer cainMediaPlayer3 = singActivity5.f33936n0;
                    if (cainMediaPlayer3 != null) {
                        cainMediaPlayer3.setOnErrorListener(C6816s.f31918a);
                    }
                    CainMediaPlayer cainMediaPlayer4 = singActivity5.f33936n0;
                    if (cainMediaPlayer4 != null) {
                        cainMediaPlayer4.setOnCurrentPositionListener(C6817t.f31919a);
                    }
                    try {
                        String str = singActivity5.f33915S + "/" + singActivity5.f33913Q + C7804v0.m15335x(6);
                        Intrinsics2.m13089e("videoDuetPath: " + str, "message");
                        CainMediaPlayer cainMediaPlayer5 = singActivity5.f33936n0;
                        if (cainMediaPlayer5 != null) {
                            cainMediaPlayer5.setDataSource(str);
                        }
                        if (singActivity5.f33938p0 == null) {
                            singActivity5.f33938p0 = new Surface(singActivity5.f33937o0);
                        }
                        CainMediaPlayer cainMediaPlayer6 = singActivity5.f33936n0;
                        if (cainMediaPlayer6 != null) {
                            cainMediaPlayer6.setSurface(singActivity5.f33938p0);
                        }
                        CainMediaPlayer cainMediaPlayer7 = singActivity5.f33936n0;
                        if (cainMediaPlayer7 != null) {
                            float f = singActivity5.f33939q0;
                            cainMediaPlayer7.setVolume(f, f);
                        }
                        CainMediaPlayer cainMediaPlayer8 = singActivity5.f33936n0;
                        if (cainMediaPlayer8 != null) {
                            cainMediaPlayer8.setOption(4, "vcodec", "h264_mediacodec");
                        }
                        CainMediaPlayer cainMediaPlayer9 = singActivity5.f33936n0;
                        if (cainMediaPlayer9 != null) {
                            cainMediaPlayer9.prepare();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                SingActivity singActivity6 = (SingActivity) this.f33957h;
                YouTubePlayer youTubePlayer3 = singActivity6.f33900D;
                if (youTubePlayer3 != null) {
                    youTubePlayer3.mo1318U();
                }
                LinearLayout linearLayout = (LinearLayout) singActivity6.m14442U(R.id.loadingForFirst);
                Intrinsics2.m13088d(linearLayout, "loadingForFirst");
                SkuDao.a.m14068T(linearLayout);
                ImageView imageView = (ImageView) singActivity6.m14442U(R.id.btnShowCamera);
                Intrinsics2.m13088d(imageView, "btnShowCamera");
                SkuDao.a.m14109v(imageView);
                ImageView imageView2 = (ImageView) singActivity6.m14442U(R.id.icCameraSwitch);
                Intrinsics2.m13088d(imageView2, "icCameraSwitch");
                SkuDao.a.m14109v(imageView2);
                TextView textView5 = (TextView) singActivity6.m14442U(R.id.txtProgress);
                Intrinsics2.m13088d(textView5, "txtProgress");
                textView5.setVisibility(4);
                ((ImageButton) singActivity6.m14442U(R.id.btnRecording)).setImageResource(R.drawable.ic_stop);
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$d */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7350d extends Lambda implements InterfaceC6153a<C6799h0> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33958g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33959h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33960i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7350d(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33958g = viewModelStoreOwner;
            this.f33959h = qualifier;
            this.f33960i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.r.h0] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public C6799h0 mo2c() {
            return SkuDao.a.m14107t(this.f33958g, Reflection.m13097a(C6799h0.class), this.f33959h, this.f33960i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$e */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class C7351e {
        public C7351e() {
        }

        /* JADX INFO: renamed from: b */
        public static Intent m14457b(C7351e c7351e, Context context, int i, int i2, int i3, int i4) {
            if ((i4 & 2) != 0) {
                i = 0;
            }
            if ((i4 & 4) != 0) {
                i2 = 0;
            }
            if ((i4 & 8) != 0) {
                i3 = 0;
            }
            return c7351e.m14458a(context, i, i2, i3);
        }

        /* JADX INFO: renamed from: a */
        public final Intent m14458a(Context context, int i, int i2, int i3) {
            Intrinsics2.m13089e(context, "context");
            Intent intent = new Intent(context, (Class<?>) SingActivity.class);
            intent.putExtra("song_id", i);
            intent.putExtra("sing_type", i2);
            intent.putExtra("recording_id", i3);
            return intent;
        }

        public C7351e(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$f */
    /* JADX INFO: compiled from: SingActivity.kt */
    public final class C7352f extends BroadcastReceiver {
        public C7352f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics2.m13089e(context, "context");
            Intrinsics2.m13089e(intent, "intent");
            Intrinsics2.m13089e("onReceive", "message");
            if (!Intrinsics2.m13085a(intent.getAction(), "android.intent.action.HEADSET_PLUG")) {
                return;
            }
            int intExtra = intent.getIntExtra("state", -1);
            if (intExtra != 0) {
                if (intExtra != 1) {
                    SingActivity singActivity = SingActivity.this;
                    singActivity.f33902F = false;
                    Switch r6 = (Switch) singActivity.m14442U(R.id.isLoopBack);
                    Intrinsics2.m13088d(r6, "isLoopBack");
                    if (r6.isChecked()) {
                        Switch r7 = (Switch) SingActivity.this.m14442U(R.id.isLoopBack);
                        Intrinsics2.m13088d(r7, "isLoopBack");
                        r7.setChecked(false);
                        SingActivity.this.enableLoopBack(false);
                    }
                    Intrinsics2.m13089e("2", "message");
                    return;
                }
                SingActivity singActivity2 = SingActivity.this;
                singActivity2.f33902F = true;
                Switch r8 = (Switch) singActivity2.m14442U(R.id.isLoopBack);
                Intrinsics2.m13088d(r8, "isLoopBack");
                if (!r8.isChecked()) {
                    Switch r9 = (Switch) SingActivity.this.m14442U(R.id.isLoopBack);
                    Intrinsics2.m13088d(r9, "isLoopBack");
                    r9.setChecked(true);
                    SingActivity.this.enableLoopBack(true);
                }
                Intrinsics2.m13089e("1", "message");
                return;
            }
            SingActivity singActivity3 = SingActivity.this;
            singActivity3.f33902F = false;
            Switch r10 = (Switch) singActivity3.m14442U(R.id.isLoopBack);
            Intrinsics2.m13088d(r10, "isLoopBack");
            if (r10.isChecked()) {
                Switch r11 = (Switch) SingActivity.this.m14442U(R.id.isLoopBack);
                Intrinsics2.m13088d(r11, "isLoopBack");
                r11.setChecked(false);
                SingActivity.this.enableLoopBack(false);
            }
            Intrinsics2.m13089e("0", "message");
            SingActivity singActivity4 = SingActivity.this;
            if (singActivity4.f33907K) {
                return;
            }
            singActivity4.f33907K = true;
            View viewInflate = LayoutInflater.from(singActivity4).inflate(R.layout.layout_popup_headphone_suggest, (ViewGroup) null, false);
            Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            TextView textView = (TextView) linearLayout.findViewById(R.id.message);
            Intrinsics2.m13088d(textView, "layout.message");
            textView.setText(singActivity4.getString(R.string.txt_headphone_suggest_sub_title));
            HeadphoneAlertDialog headphoneAlertDialog = new HeadphoneAlertDialog(singActivity4, 4);
            headphoneAlertDialog.m14005f(singActivity4.getString(R.string.txt_headphone_suggest_title));
            headphoneAlertDialog.m14004e(headphoneAlertDialog.getContext().getResources().getDrawable(R.drawable.ic_headphone_suggest, singActivity4.getTheme()));
            headphoneAlertDialog.m14003d(singActivity4.getString(R.string.text_i_see));
            headphoneAlertDialog.f32131v = linearLayout;
            FrameLayout frameLayout = headphoneAlertDialog.f32132w;
            if (frameLayout != null) {
                frameLayout.addView(linearLayout);
                headphoneAlertDialog.f32132w.setVisibility(0);
            }
            headphoneAlertDialog.m14002c(headphoneAlertDialog.getContext().getResources().getDrawable(R.drawable.bg_button_gray_basic_corners, singActivity4.getTheme()));
            headphoneAlertDialog.show();
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$g */
    /* JADX INFO: compiled from: SingActivity.kt */
    public final class C7353g extends TimerTask {

        /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$g$a */
        /* JADX INFO: compiled from: SingActivity.kt */
        public static final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ViewPager viewPager = (ViewPager) SingActivity.this.m14442U(R.id.sing_tips);
                Intrinsics2.m13088d(viewPager, "sing_tips");
                int currentItem = viewPager.getCurrentItem();
                SingActivity singActivity = SingActivity.this;
                if (currentItem >= singActivity.f33945w0.length - 1) {
                    ViewPager viewPager2 = (ViewPager) singActivity.m14442U(R.id.sing_tips);
                    Intrinsics2.m13088d(viewPager2, "sing_tips");
                    viewPager2.setCurrentItem(0);
                } else {
                    ViewPager viewPager3 = (ViewPager) singActivity.m14442U(R.id.sing_tips);
                    Intrinsics2.m13088d(viewPager3, "sing_tips");
                    ViewPager viewPager4 = (ViewPager) SingActivity.this.m14442U(R.id.sing_tips);
                    Intrinsics2.m13088d(viewPager4, "sing_tips");
                    viewPager3.setCurrentItem(viewPager4.getCurrentItem() + 1);
                }
            }
        }

        public C7353g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            SingActivity.this.runOnUiThread(new a());
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$h */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class C7354h implements ExecuteCallback {
        public C7354h() {
        }

        @Override // p007c.p080e.p081a.ExecuteCallback
        /* JADX INFO: renamed from: a */
        public final void mo1605a(long j2, int i) {
            String strGroup;
            if (i != 0) {
                return;
            }
            float f = 0.0f;
            Matcher matcher = Pattern.compile("max_volume:\\s([^\"]+?)\\sdB").matcher(Config.m12559b());
            if (matcher.find() && (strGroup = matcher.group(1)) != null) {
                float f2 = Float.parseFloat(strGroup);
                float fAbs = Math.abs(f2);
                Intrinsics2.m13089e("maxVol: " + f2, "message");
                Intrinsics2.m13089e("vol increase: " + fAbs, "message");
                f = fAbs;
            }
            SingActivity singActivity = SingActivity.this;
            float f3 = f + 3.0f;
            C7351e c7351e = SingActivity.f33896w;
            Objects.requireNonNull(singActivity);
            File file = new File(singActivity.f33916T, outline.m1551B(new StringBuilder(), singActivity.f33913Q, "-tmp", 5));
            if (file.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append(singActivity.f33916T);
                sb.append("/");
                String strM1604z = outline.m1604z(sb, singActivity.f33913Q, 5);
                StringBuilder sbM1556G = outline.m1556G("-i ");
                sbM1556G.append(file.getPath());
                sbM1556G.append(" -ar 44100 ");
                sbM1556G.append(strM1604z);
                String string = sbM1556G.toString();
                if (f3 > 0) {
                    StringBuilder sbM1556G2 = outline.m1556G("-i ");
                    sbM1556G2.append(file.getPath());
                    sbM1556G2.append(" -ar 44100 -af volume=");
                    sbM1556G2.append(f3);
                    sbM1556G2.append("dB ");
                    sbM1556G2.append(strM1604z);
                    string = sbM1556G2.toString();
                }
                Intrinsics2.m13089e("voiceConvert: " + string, "message");
                FFmpeg.m1606a(string, new C6791d0(singActivity, file));
            }
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$i */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class C7355i implements ExecuteCallback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f33966b;

        public C7355i(String str) {
            this.f33966b = str;
        }

        @Override // p007c.p080e.p081a.ExecuteCallback
        /* JADX INFO: renamed from: a */
        public final void mo1605a(long j2, int i) {
            if (i != 0) {
                return;
            }
            Intrinsics2.m13089e("convertVideoToAudio success", "message");
            SingActivity singActivity = SingActivity.this;
            String str = this.f33966b;
            C7351e c7351e = SingActivity.f33896w;
            Objects.requireNonNull(singActivity);
            Intrinsics2.m13089e("removeAudioFromVideo begin", "message");
            StringBuilder sb = new StringBuilder();
            sb.append("-i ");
            sb.append(str);
            sb.append(" -map 0 -map -0:a -c copy -y ");
            sb.append(singActivity.f33915S);
            sb.append('/');
            FFmpeg.m1606a(outline.m1604z(sb, singActivity.f33913Q, 6), new C6819v(singActivity, str));
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$j */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class C7356j implements OnStartOrResumeListener {

        /* JADX INFO: renamed from: a */
        public static final C7356j f33967a = new C7356j();

        @Override // p007c.p154j.OnStartOrResumeListener
        /* JADX INFO: renamed from: a */
        public final void mo2224a() {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$k */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class C7357k implements OnProgressListener {
        public C7357k() {
        }

        @Override // p007c.p154j.OnProgressListener
        /* JADX INFO: renamed from: a */
        public final void mo2223a(Progress progress) {
            long j2 = (progress.f4409f * ((long) 100)) / progress.f4410g;
            if (((int) j2) == 1) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) SingActivity.this.m14442U(R.id.preloading);
                Intrinsics2.m13088d(lottieAnimationView, "preloading");
                SkuDao.a.m14061M(lottieAnimationView);
                ((LottieAnimationView) SingActivity.this.m14442U(R.id.preloading)).m12546c();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(j2);
            sb.append('%');
            String string = sb.toString();
            TextView textView = (TextView) SingActivity.this.m14442U(R.id.txtProgress);
            Intrinsics2.m13088d(textView, "txtProgress");
            textView.setText(string);
            CircleProgressBar circleProgressBar = (CircleProgressBar) SingActivity.this.m14442U(R.id.recording_progressBar);
            Intrinsics2.m13088d(circleProgressBar, "recording_progressBar");
            circleProgressBar.setProgress(j2);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$l */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class C7358l implements OnDownloadListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f33970b;

        public C7358l(int i) {
            this.f33970b = i;
        }

        @Override // p007c.p154j.OnDownloadListener
        /* JADX INFO: renamed from: a */
        public void mo2221a() {
            int i = this.f33970b;
            if (i == 0) {
                SingActivity singActivity = SingActivity.this;
                C7351e c7351e = SingActivity.f33896w;
                Objects.requireNonNull(singActivity);
                Intrinsics2.m13089e("audioConverter", "message");
                File file = new File(PathUtils.m14261g(singActivity.getApplicationContext()), outline.m1604z(new StringBuilder(), singActivity.f33913Q, 6));
                StringBuilder sb = new StringBuilder();
                sb.append(singActivity.f33915S);
                sb.append("/");
                String strM1604z = outline.m1604z(sb, singActivity.f33913Q, 3);
                StringBuilder sbM1556G = outline.m1556G("-i ");
                sbM1556G.append(file.getPath());
                sbM1556G.append(" -c:a copy ");
                sbM1556G.append(strM1604z);
                FFmpeg.m1606a(sbM1556G.toString(), new C6784a(singActivity, file));
                return;
            }
            if (i == 1) {
                SingActivity singActivity2 = SingActivity.this;
                C7351e c7351e2 = SingActivity.f33896w;
                Objects.requireNonNull(singActivity2);
                Intrinsics2.m13089e("videoToAudioConverter", "message");
                File file2 = new File(PathUtils.m14261g(singActivity2.getApplicationContext()), outline.m1604z(new StringBuilder(), singActivity2.f33913Q, 6));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(singActivity2.f33915S);
                sb2.append("/");
                String strM1604z2 = outline.m1604z(sb2, singActivity2.f33913Q, 3);
                StringBuilder sbM1556G2 = outline.m1556G("-i ");
                sbM1556G2.append(file2.getPath());
                sbM1556G2.append(" -vn -y ");
                sbM1556G2.append(strM1604z2);
                FFmpeg.m1606a(sbM1556G2.toString(), new C6789c0(singActivity2, file2, strM1604z2));
            }
        }

        @Override // p007c.p154j.OnDownloadListener
        /* JADX INFO: renamed from: b */
        public void mo2222b(Error2 error2) {
            Intrinsics2.m13089e(error2, "error");
            SingActivity singActivity = SingActivity.this;
            Song songM421d = singActivity.mo13969R().f31857l.m421d();
            singActivity.m14451k0(songM421d != null ? songM421d.getPlayer_ias_url() : null);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$m */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class AsyncTaskC7359m extends YouTubeExtractor {

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ Song f33971H;

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ SingActivity f33972I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncTaskC7359m(Song song, Context context, SingActivity singActivity, String str) {
            super(context);
            this.f33971H = song;
            this.f33972I = singActivity;
        }

        @Override // p555j.p556a.p557a.p597g.p605e.YouTubeExtractor
        /* JADX INFO: renamed from: c */
        public void mo14031c(SparseArray<YtFile> sparseArray, VideoMeta videoMeta) {
            Intrinsics2.m13089e(sparseArray, "ytFiles");
            Intrinsics2.m13089e(videoMeta, "vMeta");
            YtFile ytFile = sparseArray.get(18);
            Intrinsics2.m13088d(ytFile, "ytFiles.get(18)");
            String str = ytFile.f32251b;
            Intrinsics2.m13089e("YouTubeExtractor " + str, "message");
            if (!Intrinsics2.m13085a(str, "")) {
                Intrinsics2.m13089e("downloadSong", "message");
                SingActivity singActivity = this.f33972I;
                Intrinsics2.m13088d(str, "url");
                singActivity.m14447g0(str, this.f33972I.f33913Q + C7804v0.m15335x(6), 1);
                return;
            }
            Intrinsics2.m13089e("checkInternalLink", "message");
            SingActivity singActivity2 = this.f33972I;
            Song song = this.f33971H;
            Intrinsics2.m13088d(song, "song");
            SingActivity.m14434V(singActivity2, song, this.f33972I.f33913Q + C7804v0.m15335x(6));
        }

        @Override // p555j.p556a.p557a.p597g.p605e.YouTubeExtractor
        /* JADX INFO: renamed from: d */
        public void mo14032d() {
            Intrinsics2.m13089e("checkInternalLink 2", "message");
            SingActivity singActivity = this.f33972I;
            Song song = this.f33971H;
            Intrinsics2.m13088d(song, "song");
            SingActivity.m14434V(singActivity, song, this.f33972I.f33913Q + C7804v0.m15335x(6));
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$n */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class TextureViewSurfaceTextureListenerC7360n implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC7360n() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
            Intrinsics2.m13089e("onSurfaceTextureAvailable", "message");
            SingActivity singActivity = SingActivity.this;
            if (singActivity.f33937o0 == null) {
                singActivity.f33937o0 = surfaceTexture;
                return;
            }
            Intrinsics2.m13089e("mSurfaceTexture", "message");
            VideoTextureView videoTextureView = (VideoTextureView) SingActivity.this.m14442U(R.id.videoPlayerView);
            SurfaceTexture surfaceTexture2 = SingActivity.this.f33937o0;
            Intrinsics2.m13087c(surfaceTexture2);
            videoTextureView.setSurfaceTexture(surfaceTexture2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
            Intrinsics2.m13089e("onSurfaceTextureDestroyed", "message");
            return SingActivity.this.f33937o0 == null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
            Intrinsics2.m13089e("onSurfaceTextureSizeChanged", "message");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$o */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class C7361o<T> implements Observer<Recording> {
        public C7361o() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(Recording recording) {
            Recording recording2 = recording;
            SingActivity.this.f33899C = recording2.getDuetId();
            SingActivity singActivity = SingActivity.this;
            StringBuilder sb = new StringBuilder();
            Song song = recording2.getSong();
            String strValueOf = String.valueOf(song != null ? song.getYoutubeId() : null);
            Locale locale = Locale.ROOT;
            Intrinsics2.m13088d(locale, "Locale.ROOT");
            String lowerCase = strValueOf.toLowerCase(locale);
            Intrinsics2.m13088d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append('-');
            sb.append(SingActivity.this.f33898B);
            sb.append('-');
            User user = recording2.getUser();
            sb.append(user != null ? Integer.valueOf(user.getId()) : null);
            singActivity.f33913Q = sb.toString();
            if (recording2.getFormat() == 1) {
                recording2.getUrl();
                String urlVideoResize = recording2.getUrlVideoResize();
                if (urlVideoResize == null) {
                    urlVideoResize = StringsJVM.m12993j(recording2.getUrl(), ".mp4", "_resize.mp4", false, 4);
                }
                ImageView imageView = (ImageView) SingActivity.this.m14442U(R.id.btnShowCamera);
                Intrinsics2.m13088d(imageView, "btnShowCamera");
                SkuDao.a.m14061M(imageView);
                ImageView imageView2 = (ImageView) SingActivity.this.m14442U(R.id.icCameraSwitch);
                Intrinsics2.m13088d(imageView2, "icCameraSwitch");
                SkuDao.a.m14068T(imageView2);
                SingActivity singActivity2 = SingActivity.this;
                String str = SingActivity.this.f33913Q + C7804v0.m15335x(6);
                Objects.requireNonNull(singActivity2);
                Intrinsics2.m13089e("downloadVideoDuet: " + urlVideoResize, "message");
                String strM14261g = PathUtils.m14261g(singActivity2.getApplicationContext());
                if (new File(singActivity2.f33915S, str).exists()) {
                    singActivity2.f33904H = true;
                } else {
                    File file = new File(strM14261g, str);
                    if (file.exists()) {
                        Intrinsics2.m13089e("tmpFile", "message");
                        String path = file.getPath();
                        Intrinsics2.m13088d(path, "tmpFile.path");
                        singActivity2.m14446f0(path);
                    } else {
                        DownloadRequest downloadRequest = new DownloadRequest(new DownloadRequestBuilder(urlVideoResize, strM14261g, str));
                        downloadRequest.f4470n = C6800i.f31884a;
                        downloadRequest.f4468l = new C6802j(singActivity2);
                        downloadRequest.m2244d(new C6804k(singActivity2, file));
                    }
                }
                SingActivity singActivity3 = SingActivity.this;
                if (singActivity3.f33936n0 == null) {
                    singActivity3.f33936n0 = new CainMediaPlayer();
                }
                VideoTextureView videoTextureView = (VideoTextureView) SingActivity.this.m14442U(R.id.videoPlayerView);
                Intrinsics2.m13088d(videoTextureView, "videoPlayerView");
                videoTextureView.setSurfaceTextureListener(SingActivity.this.f33943u0);
                FrameLayout frameLayout = (FrameLayout) SingActivity.this.m14442U(R.id.fragment_camera_container);
                Intrinsics2.m13088d(frameLayout, "fragment_camera_container");
                YouTubePlayerView youTubePlayerView = (YouTubePlayerView) SingActivity.this.m14442U(R.id.youTubePlayerView);
                Intrinsics2.m13088d(youTubePlayerView, "youTubePlayerView");
                SkuDao.a.m14064P(frameLayout, youTubePlayerView.getHeight(), 0, 0, 0);
                RelativeLayout relativeLayout = (RelativeLayout) SingActivity.this.m14442U(R.id.layoutVideoView);
                Intrinsics2.m13088d(relativeLayout, "layoutVideoView");
                YouTubePlayerView youTubePlayerView2 = (YouTubePlayerView) SingActivity.this.m14442U(R.id.youTubePlayerView);
                Intrinsics2.m13088d(youTubePlayerView2, "youTubePlayerView");
                SkuDao.a.m14064P(relativeLayout, youTubePlayerView2.getHeight(), 0, 0, 0);
                int iM14104q = SkuDao.a.m14104q(SingActivity.this) / 2;
                int i = (iM14104q * 960) / 540;
                FrameLayout frameLayout2 = (FrameLayout) SingActivity.this.m14442U(R.id.fragment_camera_container);
                Intrinsics2.m13088d(frameLayout2, "fragment_camera_container");
                frameLayout2.getLayoutParams().width = iM14104q;
                FrameLayout frameLayout3 = (FrameLayout) SingActivity.this.m14442U(R.id.fragment_camera_container);
                Intrinsics2.m13088d(frameLayout3, "fragment_camera_container");
                frameLayout3.getLayoutParams().height = i;
                RelativeLayout relativeLayout2 = (RelativeLayout) SingActivity.this.m14442U(R.id.layoutVideoView);
                Intrinsics2.m13088d(relativeLayout2, "layoutVideoView");
                relativeLayout2.getLayoutParams().width = iM14104q;
                RelativeLayout relativeLayout3 = (RelativeLayout) SingActivity.this.m14442U(R.id.layoutVideoView);
                Intrinsics2.m13088d(relativeLayout3, "layoutVideoView");
                relativeLayout3.getLayoutParams().height = i;
                RelativeLayout relativeLayout4 = (RelativeLayout) SingActivity.this.m14442U(R.id.layoutVideoView);
                Intrinsics2.m13088d(relativeLayout4, "layoutVideoView");
                SkuDao.a.m14068T(relativeLayout4);
            } else {
                ImageView imageView3 = (ImageView) SingActivity.this.m14442U(R.id.btnShowCamera);
                Intrinsics2.m13088d(imageView3, "btnShowCamera");
                SkuDao.a.m14109v(imageView3);
                SingActivity singActivity4 = SingActivity.this;
                String url = recording2.getUrl();
                String str2 = SingActivity.this.f33913Q + C7804v0.m15335x(3);
                Objects.requireNonNull(singActivity4);
                if (new File(singActivity4.f33915S, str2).exists()) {
                    singActivity4.f33904H = true;
                } else {
                    DownloadRequest downloadRequest2 = new DownloadRequest(new DownloadRequestBuilder(url, singActivity4.f33915S, str2));
                    downloadRequest2.f4470n = C6794f.f31838a;
                    downloadRequest2.f4468l = new C6796g(singActivity4);
                    downloadRequest2.m2244d(new C6798h(singActivity4));
                }
            }
            SingActivity.this.mo13969R().f31857l.mo427j(recording2.getSong());
            SingActivity.this.mo13969R().f31863r.mo427j(recording2.getUser());
            MutableLiveData<User> mutableLiveData = SingActivity.this.mo13969R().f31864s;
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            mutableLiveData.mo427j((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class));
            MutableLiveData<ArrayList<Duet2>> mutableLiveData2 = SingActivity.this.mo13969R().f31860o;
            Duet duet = recording2.getDuet();
            mutableLiveData2.mo427j(duet != null ? duet.getSegments() : null);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$p */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class C7362p<T> implements Observer<Song> {
        public C7362p() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(Song song) {
            Song song2 = song;
            if (Intrinsics2.m13085a(SingActivity.this.f33913Q, "")) {
                SingActivity singActivity = SingActivity.this;
                String strValueOf = String.valueOf(song2.getYoutubeId());
                Locale locale = Locale.ROOT;
                Intrinsics2.m13088d(locale, "Locale.ROOT");
                String lowerCase = strValueOf.toLowerCase(locale);
                Intrinsics2.m13088d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                singActivity.f33913Q = lowerCase;
            }
            StringBuilder sbM1556G = outline.m1556G("Filename::: ");
            sbM1556G.append(SingActivity.this.f33913Q);
            Intrinsics2.m13089e(sbM1556G.toString(), "message");
            SingActivity singActivity2 = SingActivity.this;
            singActivity2.f139h.mo16727a((YouTubePlayerView) singActivity2.m14442U(R.id.youTubePlayerView));
            YouTubePlayerView youTubePlayerView = (YouTubePlayerView) singActivity2.m14442U(R.id.youTubePlayerView);
            C6812o c6812o = new C6812o(singActivity2);
            Objects.requireNonNull(youTubePlayerView);
            Intrinsics2.m13090f(c6812o, "youTubePlayerListener");
            youTubePlayerView.f29314f.getYouTubePlayer$core_release().mo1320c(c6812o);
            SingActivity singActivity3 = SingActivity.this;
            String[] strArr = {"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
            Recording recordingM421d = singActivity3.mo13969R().f31859n.m421d();
            boolean z = true;
            if (recordingM421d != null && recordingM421d.getFormat() == 1) {
                strArr = new String[]{"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"};
            }
            for (String str : strArr) {
                if (ContextCompat.m16133a(singActivity3, str) != 0) {
                    ActivityCompat.m16082c(singActivity3, strArr, 0);
                    z = false;
                    break;
                }
            }
            if (z) {
                SingActivity.this.m14452l0();
                SingActivity.this.m14451k0(null);
            }
            FirebaseAnalytics firebaseAnalytics = SingActivity.this.f33933k0;
            if (firebaseAnalytics == null) {
                Intrinsics2.m13096l("firebaseAnalytics");
                throw null;
            }
            C5240b c5240b = new C5240b();
            c5240b.m11683a("song_recording_name", String.valueOf(song2.getName()));
            c5240b.m11683a("song_recording_text", "Click to recording");
            firebaseAnalytics.m12913a("song_recording", c5240b.f26349a);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$q */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class C7363q<T> implements Observer<ArrayList<Duet2>> {
        public C7363q() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(ArrayList<Duet2> arrayList) {
            ArrayList<Duet2> arrayList2 = arrayList;
            SingActivity singActivity = SingActivity.this;
            Intrinsics2.m13088d(arrayList2, "it");
            singActivity.f33931i0 = arrayList2;
            String string = arrayList2.toString();
            Intrinsics2.m13088d(string, "it.toString()");
            Intrinsics2.m13089e(string, "message");
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$r */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class ViewOnClickListenerC7364r implements View.OnClickListener {

        /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$r$a */
        /* JADX INFO: compiled from: SingActivity.kt */
        public static final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ImageView imageView = (ImageView) SingActivity.this.m14442U(R.id.icCameraSwitch);
                Intrinsics2.m13088d(imageView, "icCameraSwitch");
                imageView.setEnabled(true);
            }
        }

        public ViewOnClickListenerC7364r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ImageView imageView = (ImageView) SingActivity.this.m14442U(R.id.icCameraSwitch);
            Intrinsics2.m13088d(imageView, "icCameraSwitch");
            ImageView imageView2 = (ImageView) SingActivity.this.m14442U(R.id.icCameraSwitch);
            Intrinsics2.m13088d(imageView2, "icCameraSwitch");
            imageView.setPivotX(imageView2.getWidth() / 2.0f);
            ImageView imageView3 = (ImageView) SingActivity.this.m14442U(R.id.icCameraSwitch);
            Intrinsics2.m13088d(imageView3, "icCameraSwitch");
            ImageView imageView4 = (ImageView) SingActivity.this.m14442U(R.id.icCameraSwitch);
            Intrinsics2.m13088d(imageView4, "icCameraSwitch");
            imageView3.setPivotY(imageView4.getHeight() / 2.0f);
            ImageView imageView5 = (ImageView) SingActivity.this.m14442U(R.id.icCameraSwitch);
            Intrinsics2.m13088d(imageView5, "icCameraSwitch");
            float width = imageView5.getWidth() / 2.0f;
            ImageView imageView6 = (ImageView) SingActivity.this.m14442U(R.id.icCameraSwitch);
            Intrinsics2.m13088d(imageView6, "icCameraSwitch");
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, width, imageView6.getHeight() / 2.0f);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setDuration(400L);
            ((ImageView) SingActivity.this.m14442U(R.id.icCameraSwitch)).startAnimation(rotateAnimation);
            ImageView imageView7 = (ImageView) SingActivity.this.m14442U(R.id.icCameraSwitch);
            Intrinsics2.m13088d(imageView7, "icCameraSwitch");
            imageView7.setEnabled(false);
            ((ImageView) SingActivity.this.m14442U(R.id.icCameraSwitch)).postDelayed(new a(), 100L);
            CameraPreviewFragment2 cameraPreviewFragment2 = SingActivity.this.f33934l0;
            if (cameraPreviewFragment2 != null) {
                cameraPreviewFragment2.m2073d1();
            }
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$s */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class ViewOnClickListenerC7365s implements View.OnClickListener {

        /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$s$a */
        /* JADX INFO: compiled from: SingActivity.kt */
        public static final class a extends Lambda implements InterfaceC6153a<Unit> {
            public a() {
                super(0);
            }

            @Override // p477d1.p493x.p494b.InterfaceC6153a
            /* JADX INFO: renamed from: c */
            public Unit mo2c() {
                SingActivity.m14436X(SingActivity.this);
                return Unit.f29502a;
            }
        }

        public ViewOnClickListenerC7365s() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SingActivity singActivity = SingActivity.this;
            if (singActivity.f33903G) {
                SkuDao.a.m14069U(singActivity, singActivity.getString(R.string.text_message_restart), null, SingActivity.this.getString(R.string.text_restart_ok), new a(), SingActivity.this.getString(R.string.text_skip), null, false, false, 98);
            }
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$t */
    /* JADX INFO: compiled from: SingActivity.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.sing.SingActivity$startRecording$1", m13069f = "SingActivity.kt", m13070l = {655}, m13071m = "invokeSuspend")
    public static final class C7366t extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f33981j;

        public C7366t(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return SingActivity.this.new C7366t(continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return SingActivity.this.new C7366t(continuation2).mo6m(Unit.f29502a);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f33981j;
            if (i == 0) {
                C5729a.m12442O(obj);
                this.f33981j = 1;
                if (C5729a.m12457l(1000L, this) == intrinsics) {
                    return intrinsics;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5729a.m12442O(obj);
            }
            SingActivity singActivity = SingActivity.this;
            C7351e c7351e = SingActivity.f33896w;
            singActivity.f33919W = singActivity.durationSeconds();
            CircleProgressBar circleProgressBar = (CircleProgressBar) SingActivity.this.m14442U(R.id.recording_progressBar);
            Intrinsics2.m13088d(circleProgressBar, "recording_progressBar");
            circleProgressBar.setMax((int) SingActivity.this.f33919W);
            CircleProgressBar circleProgressBar2 = (CircleProgressBar) SingActivity.this.m14442U(R.id.recording_progressBar);
            Intrinsics2.m13088d(circleProgressBar2, "recording_progressBar");
            circleProgressBar2.setProgress(0.0f);
            CustomSeekBar customSeekBar = (CustomSeekBar) SingActivity.this.m14442U(R.id.songSeekBar);
            Intrinsics2.m13088d(customSeekBar, "songSeekBar");
            customSeekBar.setMax((int) SingActivity.this.f33919W);
            TextView textView = (TextView) SingActivity.this.m14442U(R.id.audioDuration);
            Intrinsics2.m13088d(textView, "audioDuration");
            textView.setText(NowPlayingMetadata.f32263a.m14034a(SingActivity.this.f33919W));
            SingActivity singActivity2 = SingActivity.this;
            if (singActivity2.f33935m0 && singActivity2.f33897A == 0) {
                LinearLayout linearLayout = (LinearLayout) singActivity2.m14442U(R.id.seekBarContainer);
                Intrinsics2.m13088d(linearLayout, "seekBarContainer");
                SkuDao.a.m14061M(linearLayout);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) singActivity2.m14442U(R.id.seekBarContainer);
                Intrinsics2.m13088d(linearLayout2, "seekBarContainer");
                SkuDao.a.m14068T(linearLayout2);
                ArrayList<ProgressItem> arrayList = new ArrayList<>();
                if (singActivity2.f33931i0.size() <= 0) {
                    singActivity2.f33931i0.add(new Duet2("A", 0.0f, singActivity2.f33919W));
                }
                if (singActivity2.f33931i0.size() > 1) {
                    Duet2 duet2 = singActivity2.f33931i0.get(0);
                    Intrinsics2.m13088d(duet2, "segments[0]");
                    Duet2 duet3 = duet2;
                    if (duet3.getS() > 0) {
                        singActivity2.f33931i0.add(0, new Duet2("A", 0.0f, duet3.getS()));
                    }
                }
                StringBuilder sbM1556G = outline.m1556G("new segments ");
                sbM1556G.append(singActivity2.f33931i0);
                Intrinsics2.m13089e(sbM1556G.toString(), "message");
                for (Duet2 duet4 : singActivity2.f33931i0) {
                    ProgressItem progressItem = new ProgressItem();
                    float f = 100;
                    Intrinsics2.m13089e("AAA: " + (((duet4.getE() - duet4.getS()) / singActivity2.f33919W) * f), "message");
                    progressItem.f32172b = ((duet4.getE() - duet4.getS()) / singActivity2.f33919W) * f;
                    String n = duet4.getN();
                    switch (n.hashCode()) {
                        case 65:
                            if (n.equals("A")) {
                                progressItem.f32171a = R.color.header_color;
                            }
                            break;
                        case 66:
                            if (n.equals("B")) {
                                progressItem.f32171a = R.color.pink_A400;
                            }
                            break;
                        case 67:
                            if (n.equals("C")) {
                                progressItem.f32171a = R.color.deep_purple_700;
                            }
                            break;
                    }
                    arrayList.add(progressItem);
                }
                CustomSeekBar customSeekBar2 = (CustomSeekBar) singActivity2.m14442U(R.id.songSeekBar);
                Objects.requireNonNull(customSeekBar2);
                Intrinsics2.m13089e(arrayList, "progressItemsList");
                customSeekBar2.f33449g = arrayList;
                ((CustomSeekBar) singActivity2.m14442U(R.id.songSeekBar)).invalidate();
                ((CustomSeekBar) singActivity2.m14442U(R.id.songSeekBar)).setOnSeekBarChangeListener(new C6806l(singActivity2));
                SingActivity singActivity3 = SingActivity.this;
                if (singActivity3.f33935m0) {
                    CustomSeekBar customSeekBar3 = (CustomSeekBar) singActivity3.m14442U(R.id.songSeekBar);
                    Intrinsics2.m13088d(customSeekBar3, "songSeekBar");
                    customSeekBar3.setEnabled(false);
                }
            }
            SingActivity.this.f33942t0 = false;
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.sing.SingActivity$u */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class C7367u implements CompoundButton.OnCheckedChangeListener {
        public C7367u() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SingActivity singActivity = SingActivity.this;
            if (singActivity.f33902F) {
                singActivity.enableLoopBack(z);
            } else {
                singActivity.enableLoopBack(false);
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public static final void m14434V(SingActivity singActivity, Song song, String str) {
        Objects.requireNonNull(singActivity);
        String link = song.getLink();
        if (link != null) {
            singActivity.m14447g0(link, str, 0);
            return;
        }
        String link_video = song.getLink_video();
        if (link_video != null) {
            singActivity.m14447g0(link_video, str, 1);
            return;
        }
        Intrinsics2.m13089e("getSongLink", "message");
        String strValueOf = String.valueOf(song.getYoutubeId());
        C6799h0 c6799h0Mo13969R = singActivity.mo13969R();
        Objects.requireNonNull(c6799h0Mo13969R);
        Intrinsics2.m13089e(strValueOf, "youtubeId");
        C5729a.m12428A(C8310a.m16440e(c6799h0Mo13969R), null, 0, new C6811n0(c6799h0Mo13969R, strValueOf, null), 3, null);
        singActivity.mo13969R().f31867v.mo422e(singActivity, new C6808m(singActivity, str));
    }

    /* JADX INFO: renamed from: W */
    public static final void m14435W(SingActivity singActivity) {
        if (!singActivity.f33903G || singActivity.f33906J || singActivity.f33930h0) {
            return;
        }
        if (!singActivity.f33935m0) {
            singActivity.m14448h0();
            return;
        }
        RecordCountDownView recordCountDownView = (RecordCountDownView) singActivity.m14442U(R.id.countDownViewSing);
        recordCountDownView.f28164n.removeCallbacksAndMessages(null);
        recordCountDownView.setText("");
        RecordCountDownView.InterfaceC5782b interfaceC5782b = recordCountDownView.f28163m;
        if (interfaceC5782b != null) {
            interfaceC5782b.mo12568b();
        }
        ((RecordCountDownView) singActivity.m14442U(R.id.countDownViewSing)).f28163m = new C6788c(singActivity);
        RecordCountDownView recordCountDownView2 = (RecordCountDownView) singActivity.m14442U(R.id.countDownViewSing);
        RecordCountDownView.HandlerC5781a handlerC5781a = recordCountDownView2.f28164n;
        handlerC5781a.sendMessage(handlerC5781a.obtainMessage(1, recordCountDownView2.f28162l, 0));
    }

    /* JADX INFO: renamed from: X */
    public static final void m14436X(SingActivity singActivity) {
        singActivity.m14456q0();
        singActivity.m14441o0();
        new CountDownTimerC6820w(singActivity, 2000L, 1000L).start();
    }

    /* JADX INFO: renamed from: Y */
    public static final void m14437Y(SingActivity singActivity) {
        Objects.requireNonNull(singActivity);
        File file = new File(singActivity.f33916T, outline.m1551B(new StringBuilder(), singActivity.f33913Q, "-tmp", 5));
        File file2 = new File(singActivity.f33916T, outline.m1551B(new StringBuilder(), singActivity.f33913Q, "-seek", 5));
        singActivity.f33927e0 = 0;
        singActivity.f33930h0 = false;
        file2.delete();
        file.delete();
        singActivity.m14456q0();
        singActivity.m14441o0();
        new CountDownTimerC6820w(singActivity, 2000L, 1000L).start();
    }

    /* JADX INFO: renamed from: Z */
    public static final void m14438Z(SingActivity singActivity, int i) {
        TextView textView = (TextView) singActivity.m14442U(R.id.btnSingContinue);
        Intrinsics2.m13088d(textView, "btnSingContinue");
        SkuDao.a.m14109v(textView);
        RelativeLayout relativeLayout = (RelativeLayout) singActivity.m14442U(R.id.layoutNextPrevSecond);
        Intrinsics2.m13088d(relativeLayout, "layoutNextPrevSecond");
        SkuDao.a.m14109v(relativeLayout);
        File file = new File(singActivity.f33916T, outline.m1551B(new StringBuilder(), singActivity.f33913Q, "-seek", 5));
        File file2 = new File(singActivity.f33916T, outline.m1551B(new StringBuilder(), singActivity.f33913Q, "-seek1", 5));
        StringBuilder sbM1556G = outline.m1556G("-ss 0 -i ");
        sbM1556G.append(file.getPath());
        sbM1556G.append(" -t ");
        sbM1556G.append(i);
        sbM1556G.append(" -c copy -y ");
        sbM1556G.append(file2.getPath());
        FFmpeg.m1606a(sbM1556G.toString(), new C6821x(singActivity, file2, file, i));
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m14439a0(SingActivity singActivity) {
        Objects.requireNonNull(singActivity);
        File file = new File(singActivity.f33916T, outline.m1551B(new StringBuilder(), singActivity.f33913Q, "-tmp", 5));
        File file2 = new File(singActivity.f33916T, outline.m1551B(new StringBuilder(), singActivity.f33913Q, "-seek", 5));
        singActivity.m14441o0();
        if (singActivity.f33927e0 == 0) {
            CustomSeekBar customSeekBar = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
            Intrinsics2.m13088d(customSeekBar, "songSeekBar");
            if (customSeekBar.getProgress() <= singActivity.f33928f0) {
                StringBuilder sbM1556G = outline.m1556G("-ss 0 -i ");
                sbM1556G.append(file.getPath());
                sbM1556G.append(" -t ");
                CustomSeekBar customSeekBar2 = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
                Intrinsics2.m13088d(customSeekBar2, "songSeekBar");
                sbM1556G.append(customSeekBar2.getProgress());
                sbM1556G.append(" -c copy -y ");
                sbM1556G.append(file2.getPath());
                FFmpeg.m1606a(sbM1556G.toString(), new C6021d(0, singActivity, file));
                return;
            }
            CustomSeekBar customSeekBar3 = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
            Intrinsics2.m13088d(customSeekBar3, "songSeekBar");
            int progress = customSeekBar3.getProgress() - singActivity.f33928f0;
            StringBuilder sbM1556G2 = outline.m1556G("secondSilence: ");
            CustomSeekBar customSeekBar4 = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
            Intrinsics2.m13088d(customSeekBar4, "songSeekBar");
            sbM1556G2.append(customSeekBar4.getProgress());
            sbM1556G2.append(" - ");
            sbM1556G2.append(singActivity.f33928f0);
            sbM1556G2.append(" = ");
            sbM1556G2.append(progress);
            Intrinsics2.m13089e(sbM1556G2.toString(), "message");
            FFmpeg.m1606a("-i " + file.getPath() + " -af apad=pad_dur=" + progress + " -y " + file2.getPath(), new C6021d(1, singActivity, file));
            return;
        }
        CustomSeekBar customSeekBar5 = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
        Intrinsics2.m13088d(customSeekBar5, "songSeekBar");
        if (customSeekBar5.getProgress() < singActivity.f33927e0) {
            Intrinsics2.m13089e("currentSongSeek < voiceSeekEnd", "message");
            File file3 = new File(singActivity.f33916T, outline.m1551B(new StringBuilder(), singActivity.f33913Q, "-seek1", 5));
            StringBuilder sbM1556G3 = outline.m1556G("-ss 0 -i ");
            sbM1556G3.append(file2.getPath());
            sbM1556G3.append(" -t ");
            CustomSeekBar customSeekBar6 = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
            Intrinsics2.m13088d(customSeekBar6, "songSeekBar");
            sbM1556G3.append(customSeekBar6.getProgress());
            sbM1556G3.append(" -c copy -y ");
            sbM1556G3.append(file3.getPath());
            FFmpeg.m1606a(sbM1556G3.toString(), new C6822y(singActivity, file3, file2));
            return;
        }
        CustomSeekBar customSeekBar7 = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
        Intrinsics2.m13088d(customSeekBar7, "songSeekBar");
        if (customSeekBar7.getProgress() <= singActivity.f33927e0) {
            Intrinsics2.m13089e("When out errro", "message");
            return;
        }
        Intrinsics2.m13089e("currentSongSeek > voiceSeekEnd", "message");
        CustomSeekBar customSeekBar8 = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
        Intrinsics2.m13088d(customSeekBar8, "songSeekBar");
        if (customSeekBar8.getProgress() > singActivity.f33928f0) {
            File file4 = new File(singActivity.f33916T, outline.m1551B(new StringBuilder(), singActivity.f33913Q, "-seek1", 5));
            StringBuilder sbM1556G4 = outline.m1556G("-i ");
            sbM1556G4.append(file2.getPath());
            sbM1556G4.append(" -i ");
            sbM1556G4.append(file.getPath());
            sbM1556G4.append(" -filter_complex '[0:0][1:0]concat=n=2:v=0:a=1[out]' -map '[out]' -y ");
            sbM1556G4.append(file4.getPath());
            FFmpeg.m1606a(sbM1556G4.toString(), new C6785a0(singActivity, file4, file2));
            return;
        }
        Intrinsics2.m13089e("currentSongSeek <= currentPreSeek", "message");
        File file5 = new File(singActivity.f33916T, outline.m1551B(new StringBuilder(), singActivity.f33913Q, "-seek-tmp", 5));
        StringBuilder sbM1556G5 = outline.m1556G("-ss 0 -i ");
        sbM1556G5.append(file.getPath());
        sbM1556G5.append(" -t ");
        CustomSeekBar customSeekBar9 = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
        Intrinsics2.m13088d(customSeekBar9, "songSeekBar");
        sbM1556G5.append(customSeekBar9.getProgress() - singActivity.f33927e0);
        sbM1556G5.append(" -c copy -y ");
        sbM1556G5.append(file5.getPath());
        FFmpeg.m1606a(sbM1556G5.toString(), new C6823z(singActivity, file2, file5));
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m14440b0(SingActivity singActivity) {
        CameraPreviewFragment2 cameraPreviewFragment2;
        singActivity.m14456q0();
        if (singActivity.f33935m0 && (cameraPreviewFragment2 = singActivity.f33934l0) != null) {
            CameraPreviewPresenter cameraPreviewPresenter = cameraPreviewFragment2.f3876l0;
            if (cameraPreviewPresenter.f3896g) {
                cameraPreviewPresenter.f3896g = false;
                HWMediaRecorder hWMediaRecorder = cameraPreviewPresenter.f3901l;
                if (hWMediaRecorder != null) {
                    cameraPreviewPresenter.f3897h = false;
                    hWMediaRecorder.m2204e();
                }
            }
            cameraPreviewFragment2.f3876l0.m2082f();
        }
        singActivity.m14441o0();
        LinearLayout linearLayout = (LinearLayout) singActivity.m14442U(R.id.layoutTips);
        Intrinsics2.m13088d(linearLayout, "layoutTips");
        SkuDao.a.m14113z(linearLayout, true);
        FrameLayout frameLayout = (FrameLayout) singActivity.m14442U(R.id.fragment_camera_container);
        Intrinsics2.m13088d(frameLayout, "fragment_camera_container");
        SkuDao.a.m14109v(frameLayout);
        VideoTextureView videoTextureView = (VideoTextureView) singActivity.m14442U(R.id.videoPlayerView);
        Intrinsics2.m13088d(videoTextureView, "videoPlayerView");
        SkuDao.a.m14109v(videoTextureView);
        AppCompatImageView appCompatImageView = (AppCompatImageView) singActivity.m14442U(R.id.videoThumbnail);
        Intrinsics2.m13088d(appCompatImageView, "videoThumbnail");
        SkuDao.a.m14109v(appCompatImageView);
        new CountDownTimerC6787b0(singActivity, 2000L, 1000L).start();
        FirebaseAnalytics firebaseAnalytics = singActivity.f33933k0;
        if (firebaseAnalytics == null) {
            Intrinsics2.m13096l("firebaseAnalytics");
            throw null;
        }
        C5240b c5240b = new C5240b();
        Song songM421d = singActivity.mo13969R().f31857l.m421d();
        c5240b.m11683a("song_name", String.valueOf(songM421d != null ? songM421d.getName() : null));
        firebaseAnalytics.m12913a("finished_recording_audio", c5240b.f26349a);
    }

    /* JADX INFO: renamed from: o0 */
    private final void m14441o0() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) m14442U(R.id.loading);
        Intrinsics2.m13088d(lottieAnimationView, "loading");
        SkuDao.a.m14068T(lottieAnimationView);
        ((LottieAnimationView) m14442U(R.id.loading)).m12551h();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33946x;
    }

    /* JADX INFO: renamed from: U */
    public View m14442U(int i) {
        if (this.f33947x0 == null) {
            this.f33947x0 = new HashMap();
        }
        View view = (View) this.f33947x0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33947x0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m14443c0() {
        File file = new File(this.f33916T, outline.m1551B(new StringBuilder(), this.f33913Q, "-tmp", 5));
        if (file.exists()) {
            StringBuilder sbM1556G = outline.m1556G("-i ");
            sbM1556G.append(file.getPath());
            sbM1556G.append(" -filter:a volumedetect -f null /dev/null");
            FFmpeg.m1606a(sbM1556G.toString(), new C7354h());
        }
    }

    public final native float currentMs();

    public final native float currentSeconds();

    public final native void customReverb(int i, int i2);

    /* JADX INFO: renamed from: d0 */
    public final void m14444d0() {
        if (!new File(this.f33916T, outline.m1551B(new StringBuilder(), this.f33913Q, "-tmp", 5)).exists()) {
            int i = this.f33944v0;
            if (i > 5) {
                Toast.makeText(this, R.string.message_error_voice_not_found, 5).show();
                return;
            } else {
                this.f33944v0 = i + 1;
                m14444d0();
                return;
            }
        }
        File file = new File(this.f33916T, outline.m1551B(new StringBuilder(), this.f33913Q, "-seek", 5));
        File file2 = new File(this.f33916T, outline.m1551B(new StringBuilder(), this.f33913Q, "-tmp", 5));
        File file3 = new File(this.f33916T, outline.m1551B(new StringBuilder(), this.f33913Q, "-tmp1", 5));
        if (!file.exists()) {
            m14443c0();
            return;
        }
        Intrinsics2.m13089e("concatAudioFinal", "message");
        FFmpeg.m1606a("-i " + file.getPath() + " -i " + file2.getPath() + " -filter_complex '[0:0][1:0]concat=n=2:v=0:a=1[out]' -map '[out]' -y " + file3.getPath(), new C6786b(this, file3, file2, file));
    }

    public final native float durationSeconds();

    @Override // p555j.p556a.p557a.p558a.p559a.p560a.EffectFragment.c
    /* JADX INFO: renamed from: e */
    public void mo13872e(int i) {
        this.f33926d0 = i;
        if (this.f33903G) {
            setTone(i);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m14445e0() {
        Intrinsics2.m13089e("cleanFile", "message");
        File file = new File(PathUtils.m14259e(getApplicationContext()) + '/' + this.f33914R);
        if (file.exists()) {
            Utils7.m13078a(file);
        }
        File file2 = new File(this.f33916T);
        if (file2.exists()) {
            Utils7.m13078a(file2);
        }
        File file3 = new File(this.f33917U);
        if (file3.exists()) {
            Utils7.m13078a(file3);
        }
    }

    public final native void effect(int i);

    public final native void enableLoopBack(boolean z);

    public final native void enableReverb(boolean z);

    /* JADX INFO: renamed from: f0 */
    public final void m14446f0(String str) {
        Intrinsics2.m13089e("convertVideoToAudio begin", "message");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) m14442U(R.id.preloading);
        Intrinsics2.m13088d(lottieAnimationView, "preloading");
        SkuDao.a.m14068T(lottieAnimationView);
        TextView textView = (TextView) m14442U(R.id.txtProgress);
        Intrinsics2.m13088d(textView, "txtProgress");
        textView.setText("");
        StringBuilder sb = new StringBuilder();
        sb.append("-i ");
        sb.append(str);
        sb.append(" -vn -y ");
        sb.append(this.f33915S);
        sb.append('/');
        FFmpeg.m1606a(outline.m1604z(sb, this.f33913Q, 3), new C7355i(str));
    }

    /* JADX INFO: renamed from: g0 */
    public final void m14447g0(String str, String str2, int i) {
        Intrinsics2.m13089e("downloadSong filename " + str2, "message");
        Intrinsics2.m13089e("downloadSong url " + str, "message");
        DownloadRequest downloadRequest = new DownloadRequest(new DownloadRequestBuilder(str, PathUtils.m14261g(getApplicationContext()), str2));
        downloadRequest.f4470n = C7356j.f33967a;
        downloadRequest.f4468l = new C7357k();
        downloadRequest.m2244d(new C7358l(i));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m14448h0() {
        this.f33906J = true;
        onPause(false);
        onPlayMusic();
        if (this.f33935m0) {
            CainMediaPlayer cainMediaPlayer = this.f33936n0;
            if (cainMediaPlayer != null) {
                cainMediaPlayer.resume();
            }
            CainMediaPlayer cainMediaPlayer2 = this.f33936n0;
            if (cainMediaPlayer2 != null) {
                cainMediaPlayer2.seekTo(currentMs());
            }
            CameraPreviewFragment2 cameraPreviewFragment2 = this.f33934l0;
            if (cameraPreviewFragment2 != null) {
                cameraPreviewFragment2.m2072c1();
            }
        }
        ((ImageButton) m14442U(R.id.btnRecording)).setImageResource(R.drawable.ic_stop);
        YouTubePlayer youTubePlayer = this.f33900D;
        if (youTubePlayer != null) {
            youTubePlayer.mo1318U();
        }
        Intrinsics2.m13089e(String.valueOf(currentSeconds()), "message");
        YouTubePlayer youTubePlayer2 = this.f33900D;
        if (youTubePlayer2 != null) {
            youTubePlayer2.seekTo(currentSeconds() + 0.6f);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public C6799h0 mo13969R() {
        return (C6799h0) this.f33948y.getValue();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m14450j0() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) m14442U(R.id.loading);
        Intrinsics2.m13088d(lottieAnimationView, "loading");
        SkuDao.a.m14061M(lottieAnimationView);
        ((LottieAnimationView) m14442U(R.id.loading)).m12546c();
    }

    @SuppressLint({"StaticFieldLeak"})
    /* JADX INFO: renamed from: k0 */
    public final void m14451k0(String str) {
        if (this.f33897A != 2) {
            Intrinsics2.m13089e("initLink", "message");
            Song songM421d = mo13969R().f31857l.m421d();
            if (songM421d != null) {
                StringBuilder sbM1556G = outline.m1556G("http://youtube.com/watch?v=");
                sbM1556G.append(songM421d.getYoutubeId());
                String string = sbM1556G.toString();
                if (new File(this.f33915S, outline.m1604z(new StringBuilder(), this.f33913Q, 3)).exists()) {
                    this.f33904H = true;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) m14442U(R.id.preloading);
                    Intrinsics2.m13088d(lottieAnimationView, "preloading");
                    SkuDao.a.m14061M(lottieAnimationView);
                    ((LottieAnimationView) m14442U(R.id.preloading)).m12546c();
                    TextView textView = (TextView) m14442U(R.id.txtProgress);
                    Intrinsics2.m13088d(textView, "txtProgress");
                    textView.setText(getResources().getText(R.string.text_start));
                } else {
                    Intrinsics2.m13089e("initLink youtube", "message");
                    AsyncTaskC7359m asyncTaskC7359m = new AsyncTaskC7359m(songM421d, this, this, str);
                    asyncTaskC7359m.f32240C = true;
                    asyncTaskC7359m.f32242E = str;
                    asyncTaskC7359m.execute(string);
                }
                this.f33918V++;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m14452l0() {
        Recording recordingM421d = mo13969R().f31859n.m421d();
        if (recordingM421d != null && recordingM421d.getFormat() == 1) {
            m14453m0();
        }
        if (mo13969R().f31857l.m421d() != null) {
            Object systemService = getSystemService("audio");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            audioManager.setStreamVolume(3, 14, 0);
            String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
            this.f33909M = Integer.parseInt(property);
            this.f33910N = Integer.parseInt(property2);
            StringBuilder sb = new StringBuilder();
            File cacheDir = getCacheDir();
            Intrinsics2.m13088d(cacheDir, "cacheDir");
            sb.append(cacheDir.getAbsolutePath());
            sb.append("/");
            this.f33911O = outline.m1604z(sb, this.f33913Q, 5);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f33916T);
            sb2.append('/');
            this.f33912P = outline.m1550A(sb2, this.f33913Q, "-tmp");
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m14453m0() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f33917U);
        sb.append("/");
        String strM1604z = outline.m1604z(sb, this.f33913Q, 6);
        this.f33934l0 = this.f33897A == 2 ? new CameraPreviewFragment2(strM1604z, 270, 480) : new CameraPreviewFragment2(strM1604z);
        BackStackRecord backStackRecord = new BackStackRecord(m16577C());
        CameraPreviewFragment2 cameraPreviewFragment2 = this.f33934l0;
        Intrinsics2.m13087c(cameraPreviewFragment2);
        backStackRecord.m16506i(R.id.fragment_camera_container, cameraPreviewFragment2, "fragment_camera");
        backStackRecord.mo16444c();
        this.f33935m0 = true;
    }

    public final native void musicVolume(int i);

    /* JADX INFO: renamed from: n0 */
    public final void m14454n0() {
        if (this.f33906J) {
            ((ImageButton) m14442U(R.id.btnRecording)).setImageResource(R.drawable.ic_play);
            YouTubePlayer youTubePlayer = this.f33900D;
            if (youTubePlayer != null) {
                youTubePlayer.pause();
            }
            onPause(true);
            onPauseMusic();
            this.f33906J = false;
            if (this.f33935m0) {
                CainMediaPlayer cainMediaPlayer = this.f33936n0;
                if (cainMediaPlayer != null) {
                    cainMediaPlayer.pause();
                }
                CameraPreviewFragment2 cameraPreviewFragment2 = this.f33934l0;
                if (cameraPreviewFragment2 != null) {
                    CameraPreviewPresenter cameraPreviewPresenter = cameraPreviewFragment2.f3876l0;
                    if (cameraPreviewPresenter.f3896g) {
                        cameraPreviewPresenter.f3896g = false;
                        HWMediaRecorder hWMediaRecorder = cameraPreviewPresenter.f3901l;
                        if (hWMediaRecorder != null) {
                            cameraPreviewPresenter.f3897h = true;
                            hWMediaRecorder.m2204e();
                        }
                    }
                }
            }
        }
        String[] strArr = {getString(R.string.text_resume), getString(R.string.text_save_early), getString(R.string.text_cancel)};
        AlertDialog.a aVar = new AlertDialog.a(this);
        AlertController.C0050b c0050b = aVar.f34424a;
        c0050b.f233k = false;
        DialogInterfaceOnClickListenerC7348b dialogInterfaceOnClickListenerC7348b = new DialogInterfaceOnClickListenerC7348b();
        c0050b.f235m = strArr;
        c0050b.f237o = dialogInterfaceOnClickListenerC7348b;
        AlertDialog alertDialogCreate = aVar.create();
        Intrinsics2.m13088d(alertDialogCreate, "builder.create()");
        alertDialogCreate.show();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f33903G || this.f33930h0) {
            m14454n0();
        } else {
            m14445e0();
            finish();
        }
    }

    public final native void onBackground();

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14055G(this, true, false);
        Toolbar toolbar = (Toolbar) m14442U(R.id.toolbar);
        Intrinsics2.m13088d(toolbar, "toolbar");
        SkuDao.a.m14066R(toolbar, SkuDao.a.m14105r(this));
        TextView textView = (TextView) m14442U(R.id.toolbarTitle);
        Intrinsics2.m13088d(textView, "toolbarTitle");
        textView.setSelected(true);
        this.f33933k0 = C5239a.m11682a(Firebase.f27225a);
        Context applicationContext = getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type mtp.media.karaoke.MainApplication");
        PlaylistManager playlistManagerM14331a = ((MainApplication) applicationContext).m14331a();
        this.f33941s0 = playlistManagerM14331a;
        if (playlistManagerM14331a == null) {
            Intrinsics2.m13096l("playlistManager");
            throw null;
        }
        if (playlistManagerM14331a.m1274c() == PlaybackState.PLAYING) {
            PlaylistManager playlistManager = this.f33941s0;
            if (playlistManager == null) {
                Intrinsics2.m13096l("playlistManager");
                throw null;
            }
            playlistManager.m1281j(playlistManager.f1779o);
        }
        Intent intent = getIntent();
        Intrinsics2.m13088d(intent, "intent");
        Bundle extras = intent.getExtras();
        this.f33949z = extras != null ? extras.getInt("song_id") : 0;
        Intent intent2 = getIntent();
        Intrinsics2.m13088d(intent2, "intent");
        Bundle extras2 = intent2.getExtras();
        this.f33897A = extras2 != null ? extras2.getInt("sing_type") : 0;
        Intent intent3 = getIntent();
        Intrinsics2.m13088d(intent3, "intent");
        Bundle extras3 = intent3.getExtras();
        this.f33898B = extras3 != null ? extras3.getInt("recording_id") : 0;
        this.f33914R = String.valueOf(System.currentTimeMillis());
        String strM14258d = PathUtils.m14258d(getApplicationContext());
        Intrinsics2.m13088d(strM14258d, "PathUtils.getAudioPath(applicationContext)");
        this.f33915S = strM14258d;
        String str = PathUtils.m14263i(getApplicationContext()) + '/' + this.f33914R;
        PathUtils.m14255a(str);
        Intrinsics2.m13088d(str, "PathUtils.checkCreateFol…text) + '/' + folderName)");
        this.f33916T = str;
        String str2 = PathUtils.m14262h(getApplicationContext()) + '/' + this.f33914R;
        PathUtils.m14255a(str2);
        Intrinsics2.m13088d(str2, "PathUtils.checkCreateFol…text) + '/' + folderName)");
        this.f33917U = str2;
        this.f33901E = new C7352f();
        mo13969R().f31858m.mo427j(Integer.valueOf(this.f33897A));
        if (this.f33897A == 2) {
            C6799h0 c6799h0Mo13969R = mo13969R();
            int i = this.f33898B;
            Objects.requireNonNull(c6799h0Mo13969R);
            C5729a.m12428A(C8310a.m16440e(c6799h0Mo13969R), null, 0, new C6807l0(c6799h0Mo13969R, i, null), 3, null);
            mo13969R().f31859n.mo422e(this, new C7361o());
        } else {
            C6799h0 c6799h0Mo13969R2 = mo13969R();
            int i2 = this.f33949z;
            Objects.requireNonNull(c6799h0Mo13969R2);
            C5729a.m12428A(C8310a.m16440e(c6799h0Mo13969R2), null, 0, new C6809m0(c6799h0Mo13969R2, i2, null), 3, null);
            MutableLiveData<User> mutableLiveData = mo13969R().f31863r;
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            mutableLiveData.mo427j((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class));
        }
        mo13969R().f31857l.mo422e(this, new C7362p());
        if (this.f33897A == 1) {
            C6799h0 c6799h0Mo13969R3 = mo13969R();
            Integer numValueOf = Integer.valueOf(this.f33949z);
            Objects.requireNonNull(c6799h0Mo13969R3);
            if (numValueOf != null) {
                String str3 = "duet_segment_" + numValueOf.intValue();
                SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
                if (sharedPreferences2 == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                ArrayList arrayList = (ArrayList) outline.m1584f(sharedPreferences2.getString(str3, null), ArrayList.class);
                ArrayList<Duet2> arrayList2 = new ArrayList<>();
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object objM12315b = new GsonBuilder().m12322a().m12315b(it.next().toString(), Duet2.class);
                        Intrinsics2.m13088d(objM12315b, "GsonBuilder().create().f… DuetSegment::class.java)");
                        Duet2 duet2 = (Duet2) objM12315b;
                        Intrinsics2.m13089e(duet2.toString(), "message");
                        arrayList2.add(duet2);
                    }
                }
                c6799h0Mo13969R3.f31860o.mo427j(arrayList2);
            }
        }
        mo13969R().f31860o.mo422e(this, new C7363q());
        SharedPreferences sharedPreferences3 = ModelPrefs.f32358a;
        if (sharedPreferences3 == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        Integer num = (Integer) outline.m1584f(sharedPreferences3.getString("effect", null), Integer.class);
        mo13874w(num != null ? num.intValue() : R.id.rbStudio);
        SharedPreferences sharedPreferences4 = ModelPrefs.f32358a;
        if (sharedPreferences4 == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        Integer num2 = (Integer) outline.m1584f(sharedPreferences4.getString("voice_vol", null), Integer.class);
        this.f33925c0 = num2 != null ? num2.intValue() : 90;
        SharedPreferences sharedPreferences5 = ModelPrefs.f32358a;
        if (sharedPreferences5 == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        Integer num3 = (Integer) outline.m1584f(sharedPreferences5.getString("music_vol", null), Integer.class);
        this.f33924b0 = num3 != null ? num3.intValue() : 70;
        SharedPreferences sharedPreferences6 = ModelPrefs.f32358a;
        if (sharedPreferences6 == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        Integer num4 = (Integer) outline.m1584f(sharedPreferences6.getString("reverb_mix", null), Integer.class);
        this.f33922Z = num4 != null ? num4.intValue() : 38;
        SharedPreferences sharedPreferences7 = ModelPrefs.f32358a;
        if (sharedPreferences7 == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        Integer num5 = (Integer) outline.m1584f(sharedPreferences7.getString("reverb_room_size", null), Integer.class);
        this.f33923a0 = num5 != null ? num5.intValue() : 70;
        TipPagerAdapter tipPagerAdapter = new TipPagerAdapter(this, this.f33945w0);
        ViewPager viewPager = (ViewPager) m14442U(R.id.sing_tips);
        Intrinsics2.m13088d(viewPager, "sing_tips");
        viewPager.setAdapter(tipPagerAdapter);
        ViewPager viewPager2 = (ViewPager) m14442U(R.id.sing_tips);
        Intrinsics2.m13088d(viewPager2, "sing_tips");
        viewPager2.setCurrentItem(0);
        new Timer().scheduleAtFixedRate(new C7353g(), 8000L, 8000L);
        Intrinsics2.m13089e("initCameraResources", "message");
        new Thread(new RunnableC6810n(this)).start();
        TextView textView2 = (TextView) m14442U(R.id.txtProgress);
        Intrinsics2.m13088d(textView2, "txtProgress");
        SkuDao.a.m14067S(textView2, new C7349c(4, this));
        ImageButton imageButton = (ImageButton) m14442U(R.id.btnRecording);
        Intrinsics2.m13088d(imageButton, "btnRecording");
        SkuDao.a.m14067S(imageButton, new C7349c(5, this));
        ((LinearLayout) m14442U(R.id.layoutHeadphone)).setOnClickListener(new ViewOnClickListenerC7347a(3, this));
        ((ImageView) m14442U(R.id.btnShowCamera)).setOnClickListener(new ViewOnClickListenerC7347a(4, this));
        ((ImageView) m14442U(R.id.icCameraSwitch)).setOnClickListener(new ViewOnClickListenerC7364r());
        ((LinearLayout) m14442U(R.id.actionRestart)).setOnClickListener(new ViewOnClickListenerC7365s());
        ImageView imageView = (ImageView) m14442U(R.id.btnCancel);
        Intrinsics2.m13088d(imageView, "btnCancel");
        SkuDao.a.m14067S(imageView, new C7349c(0, this));
        ((LinearLayout) m14442U(R.id.actionEffect)).setOnClickListener(new ViewOnClickListenerC7347a(0, this));
        ((LinearLayout) m14442U(R.id.actionVolume)).setOnClickListener(new ViewOnClickListenerC7347a(1, this));
        ((AppCompatImageView) m14442U(R.id.singBackground)).setOnClickListener(new ViewOnClickListenerC7347a(2, this));
        TextView textView3 = (TextView) m14442U(R.id.btnSingContinue);
        Intrinsics2.m13088d(textView3, "btnSingContinue");
        SkuDao.a.m14067S(textView3, new C7349c(1, this));
        TextView textView4 = (TextView) m14442U(R.id.btnNextSecond);
        Intrinsics2.m13088d(textView4, "btnNextSecond");
        SkuDao.a.m14067S(textView4, new C7349c(2, this));
        TextView textView5 = (TextView) m14442U(R.id.btnPrevSecond);
        Intrinsics2.m13088d(textView5, "btnPrevSecond");
        SkuDao.a.m14067S(textView5, new C7349c(3, this));
        ((YouTubePlayerView) m14442U(R.id.youTubePlayerView)).getPlayerUiController().mo1303m(false);
        ((YouTubePlayerView) m14442U(R.id.youTubePlayerView)).getPlayerUiController().mo1295e(false);
        Constants constants = Constants.f32272c;
        List<String> list = Constants.f32271b;
        C2191r.a aVar = new C2191r.a();
        aVar.f10587c.clear();
        if (list != null) {
            aVar.f10587c.addAll(list);
        }
        C2096e.m4587w(aVar.m4633a());
        AbstractC2104a.m4599a(this, "ca-app-pub-1954765915398379/1382102929", new C2172f(new C2172f.a()), new C6790d(this));
        AbstractC2104a abstractC2104a = this.f33932j0;
        if (abstractC2104a != null) {
            abstractC2104a.mo4600b(new C6792e(this));
        }
    }

    @Override // p636z0.p644b.p645c.AppCompatActivity, p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C7352f c7352f = this.f33901E;
        if (c7352f != null) {
            unregisterReceiver(c7352f);
        }
        this.f33901E = null;
        if (((RecordCountDownView) m14442U(R.id.countDownViewSing)) != null) {
            RecordCountDownView recordCountDownView = (RecordCountDownView) m14442U(R.id.countDownViewSing);
            recordCountDownView.f28164n.removeCallbacksAndMessages(null);
            recordCountDownView.setText("");
            RecordCountDownView.InterfaceC5782b interfaceC5782b = recordCountDownView.f28163m;
            if (interfaceC5782b != null) {
                interfaceC5782b.mo12568b();
            }
        }
        if (this.f33903G) {
            m14456q0();
        }
        ((YouTubePlayerView) m14442U(R.id.youTubePlayerView)).release();
        CainMediaPlayer cainMediaPlayer = this.f33936n0;
        if (cainMediaPlayer != null) {
            cainMediaPlayer.reset();
        }
        this.f33936n0 = null;
        Surface surface = this.f33938p0;
        if (surface != null) {
            surface.release();
        }
        this.f33938p0 = null;
        SurfaceTexture surfaceTexture = this.f33937o0;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f33937o0 = null;
        super.onDestroy();
    }

    public final native void onForeground();

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f33903G) {
            onBackground();
            onPause(true);
        }
    }

    public final native void onPause(boolean z);

    public final native void onPauseMusic();

    public final native void onPlayMusic();

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics2.m13089e(strArr, "permissions");
        Intrinsics2.m13089e(iArr, "grantResults");
        boolean z = true;
        if (i == 1) {
            if (i != 1) {
                return;
            }
            if ((iArr.length == 0) || iArr.length != strArr.length) {
                return;
            }
            for (int i2 : iArr) {
                if (i2 != 0) {
                    z = false;
                }
            }
            if (!z) {
                SkuDao.a.m14092i0(this, R.string.message_allow_camera, 0, 2);
            } else if (this.f33940r0) {
                this.f33940r0 = false;
                FrameLayout frameLayout = (FrameLayout) m14442U(R.id.fragment_camera_container);
                Intrinsics2.m13088d(frameLayout, "fragment_camera_container");
                YouTubePlayerView youTubePlayerView = (YouTubePlayerView) m14442U(R.id.youTubePlayerView);
                Intrinsics2.m13088d(youTubePlayerView, "youTubePlayerView");
                int height = youTubePlayerView.getHeight();
                RelativeLayout relativeLayout = (RelativeLayout) m14442U(R.id.linearLayout);
                Intrinsics2.m13088d(relativeLayout, "linearLayout");
                SkuDao.a.m14064P(frameLayout, height, 0, relativeLayout.getHeight(), 0);
                m14453m0();
                ImageView imageView = (ImageView) m14442U(R.id.icCameraSwitch);
                Intrinsics2.m13088d(imageView, "icCameraSwitch");
                SkuDao.a.m14068T(imageView);
                ((ImageView) m14442U(R.id.btnShowCamera)).setImageResource(R.drawable.ic_camera_mv_none);
            }
        } else {
            if (i != 0) {
                return;
            }
            if ((iArr.length == 0) || iArr.length != strArr.length) {
                return;
            }
            boolean z2 = true;
            for (int i3 : iArr) {
                if (i3 != 0) {
                    SkuDao.a.m14092i0(this, R.string.message_allow_all_permissions, 0, 2);
                    TextView textView = (TextView) m14442U(R.id.txtProgress);
                    Intrinsics2.m13088d(textView, "txtProgress");
                    textView.setEnabled(false);
                    z2 = false;
                }
            }
            if (z2) {
                m14452l0();
                m14451k0(null);
                TextView textView2 = (TextView) m14442U(R.id.txtProgress);
                Intrinsics2.m13088d(textView2, "txtProgress");
                textView2.setEnabled(true);
            }
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onResume() {
        registerReceiver(this.f33901E, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        super.onResume();
        if (this.f33903G) {
            onForeground();
            onPause(false);
            if (this.f33906J) {
                YouTubePlayer youTubePlayer = this.f33900D;
                if (youTubePlayer != null) {
                    youTubePlayer.mo1318U();
                }
                CainMediaPlayer cainMediaPlayer = this.f33936n0;
                if (cainMediaPlayer != null) {
                    cainMediaPlayer.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m14455p0() {
        if (this.f33906J) {
            return;
        }
        File file = new File(this.f33915S, outline.m1604z(new StringBuilder(), this.f33913Q, 3));
        if (file.exists()) {
            ((ImageButton) m14442U(R.id.btnRecording)).setImageResource(R.drawable.ic_stop);
            int i = this.f33909M;
            int i2 = this.f33910N;
            String str = this.f33911O;
            String str2 = this.f33912P;
            String path = file.getPath();
            Intrinsics2.m13088d(path, "fileMusic.path");
            startAudio(i, i2, str, str2, path);
            this.f33906J = true;
            this.f33903G = true;
            if (this.f33930h0) {
                CustomSeekBar customSeekBar = (CustomSeekBar) m14442U(R.id.songSeekBar);
                Intrinsics2.m13088d(customSeekBar, "songSeekBar");
                float f = 100;
                setSeek(((customSeekBar.getProgress() * f) / this.f33919W) / f);
                onPlayMusic();
                YouTubePlayer youTubePlayer = this.f33900D;
                if (youTubePlayer != null) {
                    CustomSeekBar customSeekBar2 = (CustomSeekBar) m14442U(R.id.songSeekBar);
                    Intrinsics2.m13088d(customSeekBar2, "songSeekBar");
                    youTubePlayer.seekTo(customSeekBar2.getProgress());
                }
                YouTubePlayer youTubePlayer2 = this.f33900D;
                if (youTubePlayer2 != null) {
                    youTubePlayer2.mo1318U();
                }
            } else if (this.f33929g0) {
                onPlayMusic();
                if (this.f33935m0) {
                    CameraPreviewFragment2 cameraPreviewFragment2 = this.f33934l0;
                    if (cameraPreviewFragment2 != null) {
                        cameraPreviewFragment2.m2072c1();
                    }
                    CainMediaPlayer cainMediaPlayer = this.f33936n0;
                    if (cainMediaPlayer != null) {
                        cainMediaPlayer.start();
                    }
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) m14442U(R.id.thumbnail);
                Intrinsics2.m13088d(appCompatImageView, "thumbnail");
                SkuDao.a.m14109v(appCompatImageView);
                LinearLayout linearLayout = (LinearLayout) m14442U(R.id.loadingForFirst);
                Intrinsics2.m13088d(linearLayout, "loadingForFirst");
                SkuDao.a.m14061M(linearLayout);
                CoroutineScope2 coroutineScope2 = CoroutineScope2.f29811f;
                CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
                C5729a.m12428A(coroutineScope2, MainDispatchers.f29666b, 0, new C7366t(null), 2, null);
            } else {
                this.f33929g0 = true;
                if (this.f33935m0) {
                    ((RecordCountDownView) m14442U(R.id.countDownViewSing)).f28163m = new C6818u(this);
                    RecordCountDownView recordCountDownView = (RecordCountDownView) m14442U(R.id.countDownViewSing);
                    RecordCountDownView.HandlerC5781a handlerC5781a = recordCountDownView.f28164n;
                    handlerC5781a.sendMessage(handlerC5781a.obtainMessage(1, recordCountDownView.f28162l, 0));
                } else {
                    m14456q0();
                    YouTubePlayer youTubePlayer3 = this.f33900D;
                    if (youTubePlayer3 != null) {
                        youTubePlayer3.seekTo(0.0f);
                    }
                    YouTubePlayer youTubePlayer4 = this.f33900D;
                    if (youTubePlayer4 != null) {
                        youTubePlayer4.mo1318U();
                    }
                    m14455p0();
                }
            }
            if (this.f33903G) {
                effect(this.f33908L);
                setTone(this.f33926d0);
                musicVolume(this.f33924b0);
                voiceVolume(this.f33925c0);
                if (this.f33908L == 5 && this.f33903G) {
                    customReverb(this.f33922Z, this.f33923a0);
                }
                ((Switch) m14442U(R.id.isLoopBack)).setOnCheckedChangeListener(new C7367u());
            }
        }
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p560a.VolumeFragment.b
    /* JADX INFO: renamed from: q */
    public void mo13887q(int i, int i2) {
        this.f33924b0 = i;
        this.f33925c0 = i2;
        if (this.f33903G) {
            musicVolume(i);
            voiceVolume(i2);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m14456q0() {
        if (this.f33903G) {
            stopAudio();
            this.f33903G = false;
            ((ImageButton) m14442U(R.id.btnRecording)).setImageResource(R.drawable.ic_play);
            this.f33906J = false;
            YouTubePlayer youTubePlayer = this.f33900D;
            if (youTubePlayer != null) {
                youTubePlayer.pause();
            }
        }
    }

    public final native void setSeek(float f);

    public final native void setTone(int i);

    public final native void startAudio(int i, int i2, String str, String str2, String str3);

    public final native void stopAudio();

    @Override // p555j.p556a.p557a.p558a.p559a.p560a.EffectFragment.c
    /* JADX INFO: renamed from: v */
    public void mo13873v(int i, int i2) {
        this.f33922Z = i;
        this.f33923a0 = i2;
        if (this.f33903G) {
            customReverb(i, i2);
        }
    }

    public final native void voiceVolume(int i);

    @Override // p555j.p556a.p557a.p558a.p559a.p560a.EffectFragment.c
    /* JADX INFO: renamed from: w */
    public void mo13874w(int i) {
        switch (i) {
            case R.id.rbBolero /* 2131362673 */:
                this.f33908L = 3;
                break;
            case R.id.rbCustom /* 2131362674 */:
                this.f33908L = 5;
                break;
            case R.id.rbHall /* 2131362675 */:
                this.f33908L = 4;
                break;
            case R.id.rbKaraoke /* 2131362676 */:
                this.f33908L = 2;
                break;
            case R.id.rbNone /* 2131362677 */:
                this.f33908L = 0;
                break;
            case R.id.rbStudio /* 2131362678 */:
                this.f33908L = 1;
                break;
        }
        StringBuilder sbM1556G = outline.m1556G("effect ");
        sbM1556G.append(this.f33908L);
        Intrinsics2.m13089e(sbM1556G.toString(), "message");
        if (this.f33903G) {
            effect(this.f33908L);
            if (this.f33908L == 0) {
                enableReverb(false);
            }
        }
    }
}
