package mtp.media.karaoke.p628ui.screen.playing;

import android.animation.ArgbEvaluator;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.devbrackets.android.exomedia.p474ui.widget.VideoView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import mtp.media.karaoke.MainApplication;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.kenburn.KenBurnsView;
import mtp.media.karaoke.data.model.Comment;
import mtp.media.karaoke.data.model.Duet;
import mtp.media.karaoke.data.model.Gift;
import mtp.media.karaoke.data.model.Image;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.duet.owner.DuetOwnerActivity;
import mtp.media.karaoke.p628ui.screen.profile.ProfileActivity;
import p000.C7403u0;
import p000.ViewOnClickListenerC0231b;
import p000.ViewOnClickListenerC6325f;
import p000.ViewOnClickListenerC7218l;
import p007c.p008a.p009a.p010a.C0244f;
import p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls;
import p007c.p008a.p009a.p010a.p011a.p012a.VideoControls;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler;
import p007c.p008a.p009a.p029b.p038c.MediaProgress;
import p007c.p008a.p009a.p029b.p038c.PlaybackState;
import p007c.p008a.p009a.p029b.p038c.RemoteActions;
import p007c.p008a.p009a.p029b.p039d.PlaylistListener;
import p007c.p008a.p009a.p029b.p039d.ProgressListener;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.EventLogger;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p375f.C5129c;
import p007c.p190n.p194b.p367f.p368a.p375f.C5131e;
import p007c.p190n.p194b.p367f.p368a.p375f.C5132f;
import p007c.p190n.p194b.p367f.p368a.p375f.C5135i;
import p007c.p190n.p194b.p367f.p368a.p377h.C5142f;
import p007c.p190n.p194b.p367f.p368a.p377h.C5144h;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;
import p007c.p190n.p194b.p367f.p368a.p377h.C5155s;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p483s.Collections2;
import p477d1.p483s.Iterables2;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p530b.p531a.EventBus3;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingViewModel2;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentFragment;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentViewModel3;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p558a.p559a.p578j.GiftFragment;
import p555j.p556a.p557a.p558a.p559a.p578j.GiftRecordingRankingAdapter;
import p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingActivity2;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingActivity3;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingActivity4;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingActivity5;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingActivity6;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingActivity7;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingActivity8;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingPagerAdapter;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingViewModel;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingViewModel2;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingViewModel3;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingViewModel4;
import p555j.p556a.p557a.p558a.p559a.p589q.ShareFragment;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p558a.p594d.RecordingEvent;
import p555j.p556a.p557a.p558a.p594d.UserEvent;
import p555j.p556a.p557a.p558a.p596f.PlaylistManager;
import p555j.p556a.p557a.p558a.p596f.PlaylistManager.a;
import p555j.p556a.p557a.p606h.p607a.Auth;
import p555j.p556a.p557a.p606h.p607a.MediaItem3;
import p555j.p556a.p557a.p606h.p607a.MediaItem4;
import p555j.p556a.p557a.p606h.p607a.VideoApi;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.PlayingActivityBinding;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentManager;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: PlayingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlayingActivity extends BaseActivity3<PlayingActivityBinding, PlayingViewModel4> implements CommentFragment.c, GiftFragment.d, LoginFragment2.c, PlaylistListener<MediaItem4>, ProgressListener {

    /* JADX INFO: renamed from: w */
    public static final C7291e f33644w = new C7291e(null);

    /* JADX INFO: renamed from: A */
    public final Lazy3 f33645A;

    /* JADX INFO: renamed from: B */
    public final Lazy3 f33646B;

    /* JADX INFO: renamed from: C */
    public final GiftRecordingRankingAdapter f33647C;

    /* JADX INFO: renamed from: D */
    public int f33648D;

    /* JADX INFO: renamed from: E */
    public float f33649E;

    /* JADX INFO: renamed from: F */
    public int f33650F;

    /* JADX INFO: renamed from: G */
    public int f33651G;

    /* JADX INFO: renamed from: H */
    public Timer f33652H;

    /* JADX INFO: renamed from: I */
    public int f33653I;

    /* JADX INFO: renamed from: J */
    public int f33654J;

    /* JADX INFO: renamed from: K */
    public PlayingPagerAdapter f33655K;

    /* JADX INFO: renamed from: L */
    public final ArrayList<String> f33656L;

    /* JADX INFO: renamed from: M */
    public GiftFragment f33657M;

    /* JADX INFO: renamed from: N */
    public PlaylistManager f33658N;

    /* JADX INFO: renamed from: O */
    public boolean f33659O;

    /* JADX INFO: renamed from: P */
    public boolean f33660P;

    /* JADX INFO: renamed from: Q */
    public int f33661Q;

    /* JADX INFO: renamed from: R */
    public final Lazy3 f33662R;

    /* JADX INFO: renamed from: S */
    public final List<MediaItem3> f33663S;

    /* JADX INFO: renamed from: T */
    public VideoApi f33664T;

    /* JADX INFO: renamed from: U */
    public boolean f33665U;

    /* JADX INFO: renamed from: V */
    public boolean f33666V;

    /* JADX INFO: renamed from: W */
    public int f33667W;

    /* JADX INFO: renamed from: X */
    public int f33668X;

    /* JADX INFO: renamed from: Y */
    public String f33669Y;

    /* JADX INFO: renamed from: Z */
    public boolean f33670Z;

    /* JADX INFO: renamed from: a0 */
    public HashMap f33671a0;

    /* JADX INFO: renamed from: x */
    public final int f33672x = R.layout.playing_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f33673y;

    /* JADX INFO: renamed from: z */
    public final Lazy3 f33674z;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.playing.PlayingActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7287a extends Lambda implements InterfaceC6153a<PlayingViewModel4> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33675g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33676h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33677i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7287a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33675g = viewModelStoreOwner;
            this.f33676h = qualifier;
            this.f33677i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.n.m] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public PlayingViewModel4 mo2c() {
            return SkuDao.a.m14107t(this.f33675g, Reflection.m13097a(PlayingViewModel4.class), this.f33676h, this.f33677i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.playing.PlayingActivity$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7288b extends Lambda implements InterfaceC6153a<CommentViewModel3> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33678g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33679h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33680i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7288b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33678g = viewModelStoreOwner;
            this.f33679h = qualifier;
            this.f33680i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.g.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public CommentViewModel3 mo2c() {
            return SkuDao.a.m14107t(this.f33678g, Reflection.m13097a(CommentViewModel3.class), this.f33679h, this.f33680i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.playing.PlayingActivity$c */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7289c extends Lambda implements InterfaceC6153a<RecordingViewModel2> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33681g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33682h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33683i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7289c(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33681g = viewModelStoreOwner;
            this.f33682h = qualifier;
            this.f33683i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.e.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public RecordingViewModel2 mo2c() {
            return SkuDao.a.m14107t(this.f33681g, Reflection.m13097a(RecordingViewModel2.class), this.f33682h, this.f33683i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.playing.PlayingActivity$d */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7290d extends Lambda implements InterfaceC6153a<ProfileViewModel6> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33684g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33685h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33686i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7290d(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33684g = viewModelStoreOwner;
            this.f33685h = qualifier;
            this.f33686i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.i.z] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ProfileViewModel6 mo2c() {
            return SkuDao.a.m14107t(this.f33684g, Reflection.m13097a(ProfileViewModel6.class), this.f33685h, this.f33686i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.playing.PlayingActivity$e */
    /* JADX INFO: compiled from: PlayingActivity.kt */
    public static final class C7291e {
        public C7291e() {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Intent m14396b(C7291e c7291e, Context context, int i, String str, Integer num, Integer num2, ArrayList arrayList, int i2) {
            String str2 = (i2 & 4) != 0 ? null : str;
            if ((i2 & 8) != 0) {
                num = 0;
            }
            Integer num3 = num;
            if ((i2 & 16) != 0) {
                num2 = 0;
            }
            return c7291e.m14397a(context, i, str2, num3, num2, (i2 & 32) != 0 ? new ArrayList<>() : null);
        }

        /* JADX INFO: renamed from: a */
        public final Intent m14397a(Context context, int i, String str, Integer num, Integer num2, ArrayList<Recording> arrayList) {
            Intrinsics2.m13089e(context, "context");
            Intent intent = new Intent(context, (Class<?>) PlayingActivity.class);
            intent.putExtra("id", i);
            intent.putExtra("thumbnail", str);
            intent.putExtra("format", num);
            intent.putExtra("video_ratio", num2);
            intent.putExtra("recordings", arrayList);
            return intent;
        }

        public C7291e(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.playing.PlayingActivity$f */
    /* JADX INFO: compiled from: PlayingActivity.kt */
    public final class C7292f implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: f */
        public int f33687f = -1;

        public C7292f() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Intrinsics2.m13089e(seekBar, "seekBar");
            if (z) {
                this.f33687f = i;
                TextView textView = (TextView) PlayingActivity.this.m14383U(R.id.currTime);
                Intrinsics2.m13088d(textView, "currTime");
                textView.setText(C0244f.m1022k(i));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics2.m13089e(seekBar, "seekBar");
            PlayingActivity.this.f33660P = true;
            this.f33687f = seekBar.getProgress();
            PlaylistManager playlistManagerM14375W = PlayingActivity.m14375W(PlayingActivity.this);
            playlistManagerM14375W.m1281j(playlistManagerM14375W.f1783s);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics2.m13089e(seekBar, "seekBar");
            PlayingActivity playingActivity = PlayingActivity.this;
            playingActivity.f33660P = false;
            PlaylistManager playlistManager = playingActivity.f33658N;
            if (playlistManager == null) {
                Intrinsics2.m13096l("playlistManager");
                throw null;
            }
            long j2 = this.f33687f;
            Intent intent = playlistManager.f1778n;
            if (intent != null) {
                RemoteActions remoteActions = RemoteActions.f1769j;
                intent.putExtra(RemoteActions.f1767h, j2);
                playlistManager.f1784t.startService(intent);
            }
            this.f33687f = -1;
            PlayingActivity playingActivity2 = PlayingActivity.this;
            playingActivity2.f33652H.cancel();
            Timer timer = new Timer();
            playingActivity2.f33652H = timer;
            timer.schedule(new p555j.p556a.p557a.p558a.p559a.p584n.Timer(playingActivity2), 7000L);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.playing.PlayingActivity$g */
    /* JADX INFO: compiled from: PlayingActivity.kt */
    public static final class C7293g<T> implements Observer<Recording> {
        public C7293g() {
        }

        /* JADX WARN: Code duplicated, block: B:106:0x03ac  */
        /* JADX WARN: Code duplicated, block: B:108:0x03ce  */
        /* JADX WARN: Code duplicated, block: B:110:0x03d2  */
        /* JADX WARN: Code duplicated, block: B:113:0x03d9  */
        /* JADX WARN: Code duplicated, block: B:115:0x03de  */
        /* JADX WARN: Code duplicated, block: B:117:0x03e2  */
        /* JADX WARN: Code duplicated, block: B:119:0x03eb  */
        /* JADX WARN: Code duplicated, block: B:122:0x0416  */
        /* JADX WARN: Code duplicated, block: B:124:0x0434  */
        /* JADX WARN: Code duplicated, block: B:126:0x043a  */
        /* JADX WARN: Code duplicated, block: B:128:0x044c  */
        /* JADX WARN: Code duplicated, block: B:129:0x0455  */
        /* JADX WARN: Code duplicated, block: B:132:0x0468  */
        /* JADX WARN: Code duplicated, block: B:134:0x04a3  */
        /* JADX WARN: Code duplicated, block: B:136:0x04a8  */
        /* JADX WARN: Code duplicated, block: B:138:0x04ad  */
        /* JADX WARN: Code duplicated, block: B:140:0x04b2  */
        /* JADX WARN: Instruction removed from duplicated block: B:106:0x03ac, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(Recording recording) {
            int i;
            C5155s c5155s;
            RecyclerView recyclerView;
            String str;
            String str2;
            String str3;
            boolean z;
            Iterator<T> it;
            String str4;
            User user;
            StringBuilder sb;
            PlaylistManager playlistManager;
            PlaylistManager playlistManager2;
            PlaylistManager playlistManager3;
            PlayingActivity playingActivity;
            ViewPager2 viewPager2;
            PlayingPagerAdapter playingPagerAdapter;
            Recording recordingM421d;
            int i2;
            Recording recordingM421d2;
            Integer numValueOf;
            PlaylistManager playlistManager4;
            Recording recording2 = recording;
            PlayingActivity playingActivity2 = PlayingActivity.this;
            C7291e c7291e = PlayingActivity.f33644w;
            playingActivity2.m13968Q().mo398f();
            PlayingActivity.this.f33667W = recording2.getFormat();
            PlayingActivity.this.f33668X = recording2.getVideoRatio();
            PlayingActivity.this.m14391l0();
            if (PlayingActivity.this.m14387h0().size() <= 0) {
                PlayingActivity.this.m14387h0().add(recording2);
            }
            if (recording2.getFormat() == 0) {
                PlayingActivity playingActivity3 = PlayingActivity.this;
                playingActivity3.f33665U = false;
                VideoView videoView = (VideoView) playingActivity3.m14383U(R.id.videoView);
                Intrinsics2.m13088d(videoView, "videoView");
                SkuDao.a.m14061M(videoView);
                KenBurnsView kenBurnsView = (KenBurnsView) PlayingActivity.this.m14383U(R.id.kenBurnsView);
                Intrinsics2.m13088d(kenBurnsView, "kenBurnsView");
                SkuDao.a.m14068T(kenBurnsView);
                ArrayList<Image> images = recording2.getImages();
                if (images != null) {
                    PlayingActivity.this.f33656L.remove(0);
                    Iterator<T> it2 = images.iterator();
                    while (it2.hasNext()) {
                        PlayingActivity.this.f33656L.add(((Image) it2.next()).getImage());
                    }
                }
                PlayingActivity playingActivity4 = PlayingActivity.this;
                ((KenBurnsView) playingActivity4.m14383U(R.id.kenBurnsView)).setScaleType(ImageView.ScaleType.CENTER_CROP);
                ((KenBurnsView) playingActivity4.m14383U(R.id.kenBurnsView)).m14335d(playingActivity4.f33656L);
            } else {
                PlayingActivity playingActivity5 = PlayingActivity.this;
                playingActivity5.f33665U = true;
                VideoView videoView2 = (VideoView) playingActivity5.m14383U(R.id.videoView);
                Intrinsics2.m13088d(videoView2, "videoView");
                SkuDao.a.m14068T(videoView2);
                KenBurnsView kenBurnsView2 = (KenBurnsView) PlayingActivity.this.m14383U(R.id.kenBurnsView);
                Intrinsics2.m13088d(kenBurnsView2, "kenBurnsView");
                SkuDao.a.m14061M(kenBurnsView2);
            }
            PlayingActivity playingActivity6 = PlayingActivity.this;
            String str5 = ")";
            String str6 = "adapter";
            String str7 = " (";
            String string = "";
            String string2 = null;
            if (playingActivity6.f33666V) {
                Recording recordingM421d3 = playingActivity6.mo13969R().f31696l.m421d();
                if (recordingM421d3 != null) {
                    if (recordingM421d3.getCommentCount() > 0) {
                        StringBuilder sbM1556G = outline.m1556G(" (");
                        Recording recordingM421d4 = playingActivity6.mo13969R().f31696l.m421d();
                        sbM1556G.append(String.valueOf(recordingM421d4 != null ? Integer.valueOf(recordingM421d4.getCommentCount()) : null));
                        sbM1556G.append(")");
                        string = sbM1556G.toString();
                    }
                    i = R.id.playingTabLayout;
                } else {
                    i = R.id.playingTabLayout;
                    string = null;
                }
                TabLayout.C5969g c5969gM12822g = ((TabLayout) playingActivity6.m14383U(i)).m12822g(0);
                if (c5969gM12822g != null) {
                    c5969gM12822g.m12838b(playingActivity6.getString(R.string.title_comment) + string);
                }
                PlayingPagerAdapter playingPagerAdapter2 = playingActivity6.f33655K;
                if (playingPagerAdapter2 == null) {
                    Intrinsics2.m13096l("adapter");
                    throw null;
                }
                int i3 = playingActivity6.f33651G;
                for (int i4 = 0; i4 < 1; i4++) {
                    Fragment fragmentM13990w = playingPagerAdapter2.m13990w(i4);
                    if (fragmentM13990w != null && (fragmentM13990w instanceof CommentFragment)) {
                        CommentFragment commentFragment = (CommentFragment) fragmentM13990w;
                        Intrinsics2.m13089e("reloadTabs reloadTabs", "message");
                        commentFragment.mo13882Z0().f31346s.mo427j(Integer.valueOf(i3));
                        commentFragment.mo13882Z0().mo13895u(1);
                    }
                }
            } else {
                ((SeekBar) playingActivity6.m14383U(R.id.seekBarAudio)).setOnSeekBarChangeListener(playingActivity6.new C7292f());
                ((ImageView) playingActivity6.m14383U(R.id.btnMediaPlay)).setOnClickListener(new ViewOnClickListenerC6325f(0, playingActivity6));
                ((ImageView) playingActivity6.m14383U(R.id.btnMediaPrev)).setOnClickListener(new ViewOnClickListenerC6325f(1, playingActivity6));
                ((ImageView) playingActivity6.m14383U(R.id.btnMediaNext)).setOnClickListener(new ViewOnClickListenerC6325f(2, playingActivity6));
                if (playingActivity6.f33665U) {
                    ((VideoView) playingActivity6.m14383U(R.id.videoView)).setHandleAudioFocus(false);
                    ((VideoView) playingActivity6.m14383U(R.id.videoView)).setAnalyticsListener(new EventLogger(null));
                    VideoView videoView3 = (VideoView) playingActivity6.m14383U(R.id.videoView);
                    Intrinsics2.m13088d(videoView3, "videoView");
                    VideoApi videoApi = new VideoApi(videoView3);
                    playingActivity6.f33664T = videoApi;
                    PlaylistManager playlistManager5 = playingActivity6.f33658N;
                    if (playlistManager5 == null) {
                        Intrinsics2.m13096l("playlistManager");
                        throw null;
                    }
                    Intrinsics2.m13087c(videoApi);
                    Intrinsics2.m13089e(videoApi, "videoApi");
                    playlistManager5.f1773i.add(videoApi);
                    VideoControls videoControls = videoApi.f32269i.getVideoControls();
                    if (!(videoControls instanceof DefaultVideoControls)) {
                        videoControls = null;
                    }
                    DefaultVideoControls defaultVideoControls = (DefaultVideoControls) videoControls;
                    if (defaultVideoControls != null) {
                        defaultVideoControls.setPreviousButtonRemoved(false);
                        defaultVideoControls.setNextButtonRemoved(false);
                        defaultVideoControls.setButtonListener(playlistManager5.new a());
                    }
                    playlistManager5.m1280i(videoApi);
                }
                Context applicationContext = playingActivity6.getApplicationContext();
                Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type mtp.media.karaoke.MainApplication");
                PlaylistManager playlistManagerM14331a = ((MainApplication) applicationContext).m14331a();
                playingActivity6.f33658N = playlistManagerM14331a;
                if (playlistManagerM14331a == null) {
                    Intrinsics2.m13096l("playlistManager");
                    throw null;
                }
                MediaItem4 mediaItem4 = (MediaItem4) playlistManagerM14331a.m1273b();
                if (mediaItem4 == null || mediaItem4.f32262a.f32256a != playingActivity6.f33651G) {
                    if (playingActivity6.m14387h0().size() > 0) {
                        playingActivity6.f33663S.clear();
                        ArrayList<Recording> arrayListM14387h0 = playingActivity6.m14387h0();
                        ArrayList arrayList = new ArrayList(Iterables2.m13042g(arrayListM14387h0, 10));
                        Iterator<T> it3 = arrayListM14387h0.iterator();
                        while (it3.hasNext()) {
                            Recording recording3 = (Recording) it3.next();
                            User user2 = recording3.getUser();
                            if (user2 != null) {
                                string2 = user2.getFullName();
                            }
                            if (recording3.getType() == 2) {
                                StringBuilder sb2 = new StringBuilder();
                                User user3 = recording3.getUser();
                                sb2.append(user3 != null ? user3.getFullName() : null);
                                sb2.append(" ft ");
                                Duet duet = recording3.getDuet();
                                sb2.append((duet == null || (user = duet.getUser()) == null) ? null : user.getFullName());
                                string2 = sb2.toString();
                            }
                            String str8 = string2;
                            if (!playingActivity6.f33665U) {
                                it = it3;
                                str4 = str5;
                                if (recording3.getFormat() == 0) {
                                    playingActivity6.f33663S.add(new MediaItem3(recording3.getId(), recording3.getName(), recording3.getUrl(), str8, recording3.getThumbnail(), true));
                                }
                            } else if (recording3.getFormat() == 1) {
                                it = it3;
                                str4 = str5;
                                playingActivity6.f33663S.add(new MediaItem3(recording3.getId(), recording3.getName(), recording3.getUrl(), str8, recording3.getThumbnail(), false));
                            } else {
                                it = it3;
                                str4 = str5;
                            }
                            arrayList.add(Unit.f29502a);
                            string2 = null;
                            str5 = str4;
                            it3 = it;
                        }
                    }
                    str = str5;
                    if (playingActivity6.f33663S.size() > 0) {
                        List<MediaItem3> list = playingActivity6.f33663S;
                        ArrayList arrayList2 = new ArrayList(Iterables2.m13042g(list, 10));
                        int i5 = 0;
                        for (T t : list) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                Collections2.m13041f();
                                throw null;
                            }
                            String str9 = str6;
                            String str10 = str7;
                            if (((MediaItem3) t).f32256a == playingActivity6.f33651G) {
                                playingActivity6.f33661Q = i5;
                            }
                            arrayList2.add(Unit.f29502a);
                            i5 = i6;
                            str6 = str9;
                            str7 = str10;
                        }
                        str2 = str6;
                        str3 = str7;
                        List<MediaItem3> list2 = playingActivity6.f33663S;
                        ArrayList arrayList3 = new ArrayList(Iterables2.m13042g(list2, 10));
                        Iterator<T> it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(new MediaItem4((MediaItem3) it4.next()));
                        }
                        PlaylistManager playlistManager6 = playingActivity6.f33658N;
                        if (playlistManager6 == null) {
                            Intrinsics2.m13096l("playlistManager");
                            throw null;
                        }
                        int i7 = playingActivity6.f33661Q;
                        playlistManager6.f1786v = arrayList3;
                        if (i7 < 0 || i7 >= playlistManager6.mo1276e()) {
                            i7 = -1;
                        }
                        playlistManager6.f1771g = i7;
                        if (playingActivity6.f33658N == null) {
                            Intrinsics2.m13096l("playlistManager");
                            throw null;
                        }
                        StringBuilder sbM1556G2 = outline.m1556G("selectedPosition ");
                        sbM1556G2.append(playingActivity6.f33661Q);
                        Intrinsics2.m13089e(sbM1556G2.toString(), "message");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("setupPlaylistManager: ");
                        PlaylistManager playlistManager7 = playingActivity6.f33658N;
                        if (playlistManager7 == null) {
                            Intrinsics2.m13096l("playlistManager");
                            throw null;
                        }
                        sb3.append(playlistManager7.f1773i.toString());
                        Intrinsics2.m13089e(sb3.toString(), "message");
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("setupPlaylistManager: ");
                        PlaylistManager playlistManager8 = playingActivity6.f33658N;
                        if (playlistManager8 == null) {
                            Intrinsics2.m13096l("playlistManager");
                            throw null;
                        }
                        sb4.append(playlistManager8.f1773i.size());
                        Intrinsics2.m13089e(sb4.toString(), "message");
                        z = true;
                    }
                    Intrinsics2.m13089e("startPlayback " + z, "message");
                    sb = new StringBuilder();
                    sb.append("playlistManager.currentPosition ");
                    playlistManager = playingActivity6.f33658N;
                    if (playlistManager != null) {
                        Intrinsics2.m13096l("playlistManager");
                        throw null;
                    }
                    sb.append(playlistManager.f1771g);
                    Intrinsics2.m13089e(sb.toString(), "message");
                    Intrinsics2.m13089e("selectedPosition " + playingActivity6.f33661Q, "message");
                    if (z) {
                        playlistManager2 = playingActivity6.f33658N;
                        if (playlistManager2 != null) {
                            Intrinsics2.m13096l("playlistManager");
                            throw null;
                        }
                        playlistManager2.m1282l(playingActivity6.f33661Q);
                        playlistManager3 = playingActivity6.f33658N;
                        if (playlistManager3 != null) {
                            Intrinsics2.m13096l("playlistManager");
                            throw null;
                        }
                        playlistManager3.m1279h(0L, false);
                    } else {
                        playlistManager4 = playingActivity6.f33658N;
                        if (playlistManager4 != null) {
                            Intrinsics2.m13096l("playlistManager");
                            throw null;
                        }
                        if (playlistManager4.f1771g != playingActivity6.f33661Q) {
                            playlistManager2 = playingActivity6.f33658N;
                            if (playlistManager2 != null) {
                                Intrinsics2.m13096l("playlistManager");
                                throw null;
                            }
                            playlistManager2.m1282l(playingActivity6.f33661Q);
                            playlistManager3 = playingActivity6.f33658N;
                            if (playlistManager3 != null) {
                                Intrinsics2.m13096l("playlistManager");
                                throw null;
                            }
                            playlistManager3.m1279h(0L, false);
                        }
                    }
                    playingActivity6.f33666V = true;
                    playingActivity = PlayingActivity.this;
                    Objects.requireNonNull(playingActivity);
                    playingActivity.f33655K = new PlayingPagerAdapter(playingActivity, playingActivity.f33651G, "r");
                    viewPager2 = (ViewPager2) playingActivity.m14383U(R.id.playingViewPager);
                    Intrinsics2.m13088d(viewPager2, "playingViewPager");
                    playingPagerAdapter = playingActivity.f33655K;
                    if (playingPagerAdapter != null) {
                        Intrinsics2.m13096l(str2);
                        throw null;
                    }
                    viewPager2.setAdapter(playingPagerAdapter);
                    ViewPager2 viewPager3 = (ViewPager2) playingActivity.m14383U(R.id.playingViewPager);
                    Intrinsics2.m13088d(viewPager3, "playingViewPager");
                    viewPager3.setUserInputEnabled(false);
                    recordingM421d = playingActivity.mo13969R().f31696l.m421d();
                    if (recordingM421d != null) {
                        if (recordingM421d.getCommentCount() > 0) {
                            StringBuilder sbM1556G3 = outline.m1556G(str3);
                            recordingM421d2 = playingActivity.mo13969R().f31696l.m421d();
                            if (recordingM421d2 != null) {
                                numValueOf = Integer.valueOf(recordingM421d2.getCommentCount());
                            } else {
                                numValueOf = null;
                            }
                            sbM1556G3.append(String.valueOf(numValueOf));
                            sbM1556G3.append(str);
                            string = sbM1556G3.toString();
                        }
                        i2 = 1;
                    } else {
                        i2 = 1;
                        string = null;
                    }
                    String[] strArr = new String[i2];
                    strArr[0] = playingActivity.getString(R.string.title_comment) + string;
                    new TabLayoutMediator((TabLayout) playingActivity.m14383U(R.id.playingTabLayout), (ViewPager2) playingActivity.m14383U(R.id.playingViewPager), new PlayingActivity6(strArr)).m11024a();
                } else {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) playingActivity6.m14383U(R.id.recordingThumbnail);
                    Intrinsics2.m13088d(appCompatImageView, "recordingThumbnail");
                    SkuDao.a.m14061M(appCompatImageView);
                    PlaylistManager playlistManager9 = playingActivity6.f33658N;
                    if (playlistManager9 == null) {
                        Intrinsics2.m13096l("playlistManager");
                        throw null;
                    }
                    playingActivity6.f33661Q = playlistManager9.f1771g;
                    str = ")";
                }
                z = false;
                str2 = "adapter";
                str3 = " (";
                Intrinsics2.m13089e("startPlayback " + z, "message");
                sb = new StringBuilder();
                sb.append("playlistManager.currentPosition ");
                playlistManager = playingActivity6.f33658N;
                if (playlistManager != null) {
                    Intrinsics2.m13096l("playlistManager");
                    throw null;
                }
                sb.append(playlistManager.f1771g);
                Intrinsics2.m13089e(sb.toString(), "message");
                Intrinsics2.m13089e("selectedPosition " + playingActivity6.f33661Q, "message");
                if (z) {
                    playlistManager2 = playingActivity6.f33658N;
                    if (playlistManager2 != null) {
                        Intrinsics2.m13096l("playlistManager");
                        throw null;
                    }
                    playlistManager2.m1282l(playingActivity6.f33661Q);
                    playlistManager3 = playingActivity6.f33658N;
                    if (playlistManager3 != null) {
                        Intrinsics2.m13096l("playlistManager");
                        throw null;
                    }
                    playlistManager3.m1279h(0L, false);
                } else {
                    playlistManager4 = playingActivity6.f33658N;
                    if (playlistManager4 != null) {
                        Intrinsics2.m13096l("playlistManager");
                        throw null;
                    }
                    if (playlistManager4.f1771g != playingActivity6.f33661Q) {
                        playlistManager2 = playingActivity6.f33658N;
                        if (playlistManager2 != null) {
                            Intrinsics2.m13096l("playlistManager");
                            throw null;
                        }
                        playlistManager2.m1282l(playingActivity6.f33661Q);
                        playlistManager3 = playingActivity6.f33658N;
                        if (playlistManager3 != null) {
                            Intrinsics2.m13096l("playlistManager");
                            throw null;
                        }
                        playlistManager3.m1279h(0L, false);
                    }
                }
                playingActivity6.f33666V = true;
                playingActivity = PlayingActivity.this;
                Objects.requireNonNull(playingActivity);
                playingActivity.f33655K = new PlayingPagerAdapter(playingActivity, playingActivity.f33651G, "r");
                viewPager2 = (ViewPager2) playingActivity.m14383U(R.id.playingViewPager);
                Intrinsics2.m13088d(viewPager2, "playingViewPager");
                playingPagerAdapter = playingActivity.f33655K;
                if (playingPagerAdapter != null) {
                    Intrinsics2.m13096l(str2);
                    throw null;
                }
                viewPager2.setAdapter(playingPagerAdapter);
                ViewPager2 viewPager4 = (ViewPager2) playingActivity.m14383U(R.id.playingViewPager);
                Intrinsics2.m13088d(viewPager4, "playingViewPager");
                viewPager4.setUserInputEnabled(false);
                recordingM421d = playingActivity.mo13969R().f31696l.m421d();
                if (recordingM421d != null) {
                    if (recordingM421d.getCommentCount() > 0) {
                        StringBuilder sbM1556G4 = outline.m1556G(str3);
                        recordingM421d2 = playingActivity.mo13969R().f31696l.m421d();
                        if (recordingM421d2 != null) {
                            numValueOf = Integer.valueOf(recordingM421d2.getCommentCount());
                        } else {
                            numValueOf = null;
                        }
                        sbM1556G4.append(String.valueOf(numValueOf));
                        sbM1556G4.append(str);
                        string = sbM1556G4.toString();
                    }
                    i2 = 1;
                } else {
                    i2 = 1;
                    string = null;
                }
                String[] strArr2 = new String[i2];
                strArr2[0] = playingActivity.getString(R.string.title_comment) + string;
                new TabLayoutMediator((TabLayout) playingActivity.m14383U(R.id.playingTabLayout), (ViewPager2) playingActivity.m14383U(R.id.playingViewPager), new PlayingActivity6(strArr2)).m11024a();
            }
            PlayingActivity playingActivity7 = PlayingActivity.this;
            PlayingViewModel4 playingViewModel4Mo13969R = playingActivity7.mo13969R();
            int i8 = playingActivity7.f33651G;
            Objects.requireNonNull(playingViewModel4Mo13969R);
            C5729a.m12428A(C8310a.m16440e(playingViewModel4Mo13969R), null, 0, new PlayingViewModel2(playingViewModel4Mo13969R, i8, null), 3, null);
            RecyclerView recyclerView2 = (RecyclerView) playingActivity7.m14383U(R.id.recyclerGift);
            if ((recyclerView2 != null ? recyclerView2.getAdapter() : null) == null && (recyclerView = (RecyclerView) playingActivity7.m14383U(R.id.recyclerGift)) != null) {
                recyclerView.setAdapter(playingActivity7.f33647C);
            }
            playingActivity7.mo13969R().f31697m.mo422e(playingActivity7, new PlayingActivity5(playingActivity7));
            User user4 = recording2.getUser();
            if (user4 != null && user4.getFollowStatus()) {
                ImageView imageView = (ImageView) PlayingActivity.this.m14383U(R.id.btnVideoFollow);
                Intrinsics2.m13088d(imageView, "btnVideoFollow");
                SkuDao.a.m14109v(imageView);
            }
            User userM14033a = Auth.m14033a();
            if (userM14033a != null && userM14033a.getId() == recording2.getUserId()) {
                TextView textView = (TextView) PlayingActivity.this.m14383U(R.id.btnFollow);
                Intrinsics2.m13088d(textView, "btnFollow");
                SkuDao.a.m14109v(textView);
                ImageView imageView2 = (ImageView) PlayingActivity.this.m14383U(R.id.btnVideoFollow);
                Intrinsics2.m13088d(imageView2, "btnVideoFollow");
                SkuDao.a.m14109v(imageView2);
            }
            User userM14033a2 = Auth.m14033a();
            Integer numValueOf2 = userM14033a2 != null ? Integer.valueOf(userM14033a2.getId()) : null;
            Duet duet2 = recording2.getDuet();
            if (Intrinsics2.m13085a(numValueOf2, duet2 != null ? Integer.valueOf(duet2.getUserId()) : null)) {
                TextView textView2 = (TextView) PlayingActivity.this.m14383U(R.id.btnFollowDuet);
                Intrinsics2.m13088d(textView2, "btnFollowDuet");
                SkuDao.a.m14109v(textView2);
            }
            int userId = recording2.getUserId();
            User userM14033a3 = Auth.m14033a();
            if (userM14033a3 != null && userId == userM14033a3.getId()) {
                User userM14033a4 = Auth.m14033a();
                if ((userM14033a4 != null ? userM14033a4.getRecordingCount() : 0) > 1) {
                    PlayingActivity playingActivity8 = PlayingActivity.this;
                    C4799a.m10966Q(playingActivity8.getPackageManager(), new ComponentName(playingActivity8.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
                    Context applicationContext2 = playingActivity8.getApplicationContext();
                    if (applicationContext2 == null) {
                        applicationContext2 = playingActivity8;
                    }
                    C5129c c5129c = new C5129c(new C5135i(applicationContext2));
                    Intrinsics2.m13088d(c5129c, "ReviewManagerFactory.create(this)");
                    C5135i c5135i = c5129c.f26085a;
                    C5089f c5089f = C5135i.f26093a;
                    c5089f.m11533b(4, "requestInAppReview (%s)", new Object[]{c5135i.f26095c});
                    if (c5135i.f26094b == null) {
                        c5089f.m11533b(6, "Play Store app is either not installed or not the official version", new Object[0]);
                        C5131e c5131e = new C5131e();
                        c5155s = new C5155s();
                        c5155s.m11575h(c5131e);
                    } else {
                        C5151o c5151o = new C5151o();
                        c5135i.f26094b.m11548a(new C5132f(c5135i, c5151o, c5151o));
                        c5155s = c5151o.f26116a;
                    }
                    Intrinsics2.m13088d(c5155s, "manager.requestReviewFlow()");
                    c5155s.f26119b.m11570a(new C5144h(C5142f.f26096a, new PlayingActivity8(playingActivity8, c5129c)));
                    c5155s.m11576i();
                }
            }
            Intrinsics2.m13089e("update play count", "message");
            PlayingViewModel4 playingViewModel4Mo13969R2 = PlayingActivity.this.mo13969R();
            int i9 = PlayingActivity.this.f33651G;
            Objects.requireNonNull(playingViewModel4Mo13969R2);
            C5729a.m12428A(C8310a.m16440e(playingViewModel4Mo13969R2), null, 0, new PlayingViewModel3(playingViewModel4Mo13969R2, i9, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.playing.PlayingActivity$h */
    /* JADX INFO: compiled from: PlayingActivity.kt */
    public static final class C7294h extends Lambda implements InterfaceC6153a<ArrayList<Recording>> {
        public C7294h() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ArrayList<Recording> mo2c() {
            ArrayList<Recording> parcelableArrayListExtra = PlayingActivity.this.getIntent().getParcelableArrayListExtra("recordings");
            Objects.requireNonNull(parcelableArrayListExtra, "null cannot be cast to non-null type kotlin.collections.ArrayList<mtp.media.karaoke.data.model.Recording> /* = java.util.ArrayList<mtp.media.karaoke.data.model.Recording> */");
            return parcelableArrayListExtra;
        }
    }

    public PlayingActivity() {
        Lazy4 lazy4 = Lazy4.NONE;
        this.f33673y = LazyJVM.m13020a(lazy4, new C7287a(this, null, null));
        this.f33674z = LazyJVM.m13020a(lazy4, new C7288b(this, null, null));
        this.f33645A = LazyJVM.m13020a(lazy4, new C7289c(this, null, null));
        this.f33646B = LazyJVM.m13020a(lazy4, new C7290d(this, null, null));
        this.f33647C = new GiftRecordingRankingAdapter();
        this.f33652H = new Timer();
        this.f33656L = new ArrayList<>();
        this.f33662R = LazyJVM.m13021b(new C7294h());
        this.f33663S = new ArrayList();
    }

    /* JADX INFO: renamed from: V */
    public static final void m14374V(PlayingActivity playingActivity) {
        User user;
        Objects.requireNonNull(playingActivity);
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        if (((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class)) == null) {
            playingActivity.m14393n0();
            return;
        }
        Recording recordingM421d = playingActivity.mo13969R().f31696l.m421d();
        if (recordingM421d == null || (user = recordingM421d.getUser()) == null) {
            return;
        }
        playingActivity.m14386g0(user);
    }

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ PlaylistManager m14375W(PlayingActivity playingActivity) {
        PlaylistManager playlistManager = playingActivity.f33658N;
        if (playlistManager != null) {
            return playlistManager;
        }
        Intrinsics2.m13096l("playlistManager");
        throw null;
    }

    /* JADX INFO: renamed from: X */
    public static final void m14376X(PlayingActivity playingActivity) {
        playingActivity.f33653I = 0;
        playingActivity.f33654J = 0;
        EditText editText = (EditText) playingActivity.m14383U(R.id.writeComment);
        Intrinsics2.m13088d(editText, "writeComment");
        editText.setHint(playingActivity.getString(R.string.txt_write_comment));
        CardView cardView = (CardView) playingActivity.m14383U(R.id.footerLayout);
        Intrinsics2.m13088d(cardView, "footerLayout");
        SkuDao.a.m14110w(cardView);
        ((EditText) playingActivity.m14383U(R.id.writeComment)).clearFocus();
        playingActivity.m14392m0();
    }

    /* JADX INFO: renamed from: Y */
    public static final void m14377Y(PlayingActivity playingActivity) {
        Objects.requireNonNull(playingActivity);
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        Unit unit = null;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        if (((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class)) != null) {
            Recording recordingM421d = playingActivity.mo13969R().f31696l.m421d();
            if (recordingM421d != null) {
                int i = 1;
                recordingM421d.setLikeStatus(!recordingM421d.getLikeStatus());
                if (recordingM421d.getLikeStatus()) {
                    recordingM421d.setLikeCount(recordingM421d.getLikeCount() + 1);
                    ((ImageView) playingActivity.m14383U(R.id.iconLikePlaying)).setImageResource(R.drawable.ic_like_active);
                } else {
                    recordingM421d.setLikeCount(recordingM421d.getLikeCount() - 1);
                    ((ImageView) playingActivity.m14383U(R.id.iconLikePlaying)).setImageResource(R.drawable.ic_like);
                    i = 2;
                }
                ((RecordingViewModel2) playingActivity.f33645A.getValue()).m13907w(recordingM421d.getId(), "r", i);
                playingActivity.m13968Q().mo398f();
                EventBus3.m13810b().m13815g(new RecordingEvent(playingActivity.f33651G, recordingM421d.getLikeStatus(), recordingM421d.getLikeCount()));
                unit = Unit.f29502a;
            }
            if (unit != null) {
                return;
            }
        }
        playingActivity.m14393n0();
    }

    /* JADX INFO: renamed from: Z */
    public static final void m14378Z(PlayingActivity playingActivity) {
        Objects.requireNonNull(playingActivity);
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        if (((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class)) == null) {
            playingActivity.m14393n0();
            return;
        }
        GiftFragment.c cVar = GiftFragment.f31535t0;
        int i = playingActivity.f33651G;
        Objects.requireNonNull(cVar);
        GiftFragment giftFragment = new GiftFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("recording_id", i);
        giftFragment.m16540M0(bundle);
        playingActivity.f33657M = giftFragment;
        giftFragment.mo5469c1(playingActivity.m16577C(), "GiftPopup");
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m14379a0(PlayingActivity playingActivity) {
        Objects.requireNonNull(playingActivity);
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        if (((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class)) == null) {
            playingActivity.m14393n0();
            return;
        }
        Recording recordingM421d = playingActivity.mo13969R().f31696l.m421d();
        if (recordingM421d != null) {
            ShareFragment.b bVar = ShareFragment.f31783t0;
            int id = recordingM421d.getId();
            String name = recordingM421d.getName();
            User user = recordingM421d.getUser();
            bVar.m13947a(id, name, String.valueOf(user != null ? user.getFullName() : null), recordingM421d.getShareUrl()).mo5469c1(playingActivity.m16577C(), "share_popup");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m14380b0(PlayingActivity playingActivity) {
        Objects.requireNonNull(playingActivity);
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        if (((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class)) == null) {
            playingActivity.m14393n0();
            return;
        }
        CardView cardView = (CardView) playingActivity.m14383U(R.id.footerLayout);
        Intrinsics2.m13088d(cardView, "footerLayout");
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null);
        if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) <= 0) {
            playingActivity.f33653I = 0;
            playingActivity.f33654J = 0;
            EditText editText = (EditText) playingActivity.m14383U(R.id.writeComment);
            Intrinsics2.m13088d(editText, "writeComment");
            editText.setHint(playingActivity.getString(R.string.txt_write_comment));
            ((EditText) playingActivity.m14383U(R.id.writeComment)).requestFocus();
            EditText editText2 = (EditText) playingActivity.m14383U(R.id.writeComment);
            Intrinsics2.m13088d(editText2, "writeComment");
            SkuDao.a.m14070V(editText2);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m14381c0(PlayingActivity playingActivity) {
        Duet duet;
        Recording recordingM421d = playingActivity.mo13969R().f31696l.m421d();
        if (recordingM421d == null || (duet = recordingM421d.getDuet()) == null) {
            return;
        }
        Parcelable user = duet.getUser();
        if (duet.getUser() == null) {
            Recording recordingM421d2 = playingActivity.mo13969R().f31696l.m421d();
            user = recordingM421d2 != null ? recordingM421d2.getUser() : null;
        }
        Recording recording = duet.getRecording();
        String name = recording != null ? recording.getName() : null;
        Recording recording2 = duet.getRecording();
        String message = recording2 != null ? recording2.getMessage() : null;
        if (duet.getRecording() == null) {
            Recording recordingM421d3 = playingActivity.mo13969R().f31696l.m421d();
            name = recordingM421d3 != null ? recordingM421d3.getName() : null;
            Recording recordingM421d4 = playingActivity.mo13969R().f31696l.m421d();
            message = recordingM421d4 != null ? recordingM421d4.getMessage() : null;
        }
        Objects.requireNonNull(DuetOwnerActivity.f33536y);
        Intrinsics2.m13089e(playingActivity, "context");
        Intrinsics2.m13089e(duet, "duet");
        Intent intent = new Intent(playingActivity, (Class<?>) DuetOwnerActivity.class);
        intent.putExtra("duet", duet);
        intent.putExtra("user", user);
        intent.putExtra("recording_name", name);
        intent.putExtra("message", message);
        playingActivity.m13971T(intent);
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m14382d0(PlayingActivity playingActivity) {
        User user;
        Recording recordingM421d = playingActivity.mo13969R().f31696l.m421d();
        if (recordingM421d == null || (user = recordingM421d.getUser()) == null) {
            return;
        }
        int id = user.getId();
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        User user2 = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
        if (user2 == null || id != user2.getId()) {
            playingActivity.m13971T(ProfileActivity.f33786u.m14415a(playingActivity, user.getId()));
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33672x;
    }

    /* JADX INFO: renamed from: U */
    public View m14383U(int i) {
        if (this.f33671a0 == null) {
            this.f33671a0 = new HashMap();
        }
        View view = (View) this.f33671a0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33671a0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m14384e0() {
        if (this.f33665U) {
            Intrinsics2.m13089e("cleanVideo", "message");
            VideoApi videoApi = this.f33664T;
            if (videoApi != null) {
                if (videoApi.isPlaying()) {
                    PlaylistManager playlistManager = this.f33658N;
                    if (playlistManager == null) {
                        Intrinsics2.m13096l("playlistManager");
                        throw null;
                    }
                    playlistManager.m1281j(playlistManager.f1779o);
                }
                PlaylistManager playlistManager2 = this.f33658N;
                if (playlistManager2 == null) {
                    Intrinsics2.m13096l("playlistManager");
                    throw null;
                }
                Objects.requireNonNull(playlistManager2);
                Intrinsics2.m13089e(videoApi, "videoApi");
                VideoControls videoControls = videoApi.f32269i.getVideoControls();
                if (!(videoControls instanceof DefaultVideoControls)) {
                    videoControls = null;
                }
                DefaultVideoControls defaultVideoControls = (DefaultVideoControls) videoControls;
                if (defaultVideoControls != null) {
                    defaultVideoControls.setButtonListener(null);
                }
                playlistManager2.m1283m(videoApi);
                playlistManager2.f1773i.remove(videoApi);
                PlaylistManager playlistManager3 = this.f33658N;
                if (playlistManager3 == null) {
                    Intrinsics2.m13096l("playlistManager");
                    throw null;
                }
                playlistManager3.m1281j(playlistManager3.f1782r);
                this.f33664T = null;
            }
        }
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p571g.CommentFragment.c
    /* JADX INFO: renamed from: f */
    public void mo13913f(Comment comment) {
        Intrinsics2.m13089e(comment, CainMediaMetadataRetriever.METADATA_KEY_COMMENT);
        this.f33653I = comment.getId();
        this.f33654J = comment.getUserId();
        EditText editText = (EditText) m14383U(R.id.writeComment);
        Intrinsics2.m13088d(editText, "writeComment");
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.txt_reply));
        sb.append(" @");
        User user = comment.getUser();
        sb.append(String.valueOf(user != null ? user.getFullName() : null));
        editText.setHint(sb.toString());
        ((EditText) m14383U(R.id.writeComment)).requestFocus();
        EditText editText2 = (EditText) m14383U(R.id.writeComment);
        Intrinsics2.m13088d(editText2, "writeComment");
        SkuDao.a.m14070V(editText2);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m14385f0(boolean z) {
        Intrinsics2.m13089e("doneLoading", "message");
        System.out.print((Object) "loadCompleted");
        ImageView imageView = (ImageView) m14383U(R.id.btnMediaPlay);
        Intrinsics2.m13088d(imageView, "btnMediaPlay");
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) m14383U(R.id.btnMediaPrev);
        Intrinsics2.m13088d(imageView2, "btnMediaPrev");
        imageView2.setVisibility(0);
        ImageView imageView3 = (ImageView) m14383U(R.id.btnMediaNext);
        Intrinsics2.m13088d(imageView3, "btnMediaNext");
        imageView3.setVisibility(0);
        ProgressBar progressBar = (ProgressBar) m14383U(R.id.loadingBar);
        Intrinsics2.m13088d(progressBar, "loadingBar");
        progressBar.setVisibility(4);
        m14395p0(z);
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2.c
    /* JADX INFO: renamed from: g */
    public void mo13941g(int i) {
    }

    /* JADX INFO: renamed from: g0 */
    public final void m14386g0(User user) {
        user.setFollowStatus(!user.getFollowStatus());
        ((ProfileViewModel6) this.f33646B.getValue()).m13921p(user.getId(), user.getFollowStatus() ? 1 : 2);
        m13968Q().mo398f();
        EventBus3.m13810b().m13815g(new UserEvent(user.getId(), user.getFollowStatus(), user.getFollowerCount()));
    }

    /* JADX INFO: renamed from: h0 */
    public final ArrayList<Recording> m14387h0() {
        return (ArrayList) this.f33662R.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public PlayingViewModel4 mo13969R() {
        return (PlayingViewModel4) this.f33673y.getValue();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m14389j0() {
        PlayingViewModel4 playingViewModel4Mo13969R = mo13969R();
        int i = this.f33651G;
        Objects.requireNonNull(playingViewModel4Mo13969R);
        C5729a.m12428A(C8310a.m16440e(playingViewModel4Mo13969R), null, 0, new PlayingViewModel(playingViewModel4Mo13969R, i, null), 3, null);
        TextView textView = (TextView) m14383U(R.id.totalTime);
        Intrinsics2.m13088d(textView, "totalTime");
        textView.setText(C0244f.m1022k(0L));
        TextView textView2 = (TextView) m14383U(R.id.currTime);
        Intrinsics2.m13088d(textView2, "currTime");
        textView2.setText(C0244f.m1022k(0L));
        RelativeLayout relativeLayout = (RelativeLayout) m14383U(R.id.controlLayout);
        Intrinsics2.m13088d(relativeLayout, "controlLayout");
        SkuDao.a.m14113z(relativeLayout, true);
    }

    @Override // p007c.p008a.p009a.p029b.p039d.ProgressListener
    /* JADX INFO: renamed from: k */
    public boolean mo1250k(MediaProgress mediaProgress) {
        Intrinsics2.m13089e(mediaProgress, "mediaProgress");
        if (this.f33659O) {
            long j2 = mediaProgress.f1746b;
            if (j2 > 0) {
                this.f33659O = false;
                SeekBar seekBar = (SeekBar) m14383U(R.id.seekBarAudio);
                Intrinsics2.m13088d(seekBar, "seekBarAudio");
                int i = (int) j2;
                seekBar.setMax(i);
                ProgressBar progressBar = (ProgressBar) m14383U(R.id.progressBarVideo);
                Intrinsics2.m13088d(progressBar, "progressBarVideo");
                progressBar.setMax(i);
                TextView textView = (TextView) m14383U(R.id.totalTime);
                Intrinsics2.m13088d(textView, "totalTime");
                textView.setText(C0244f.m1022k(j2));
            }
        }
        if (this.f33660P) {
            return true;
        }
        SeekBar seekBar2 = (SeekBar) m14383U(R.id.seekBarAudio);
        Intrinsics2.m13088d(seekBar2, "seekBarAudio");
        seekBar2.setSecondaryProgress((int) (mediaProgress.f1746b * mediaProgress.f1748d));
        SeekBar seekBar3 = (SeekBar) m14383U(R.id.seekBarAudio);
        Intrinsics2.m13088d(seekBar3, "seekBarAudio");
        seekBar3.setProgress((int) mediaProgress.m1266a());
        ProgressBar progressBar2 = (ProgressBar) m14383U(R.id.progressBarVideo);
        Intrinsics2.m13088d(progressBar2, "progressBarVideo");
        progressBar2.setSecondaryProgress((int) (mediaProgress.f1746b * mediaProgress.f1748d));
        ProgressBar progressBar3 = (ProgressBar) m14383U(R.id.progressBarVideo);
        Intrinsics2.m13088d(progressBar3, "progressBarVideo");
        progressBar3.setProgress((int) mediaProgress.m1266a());
        TextView textView2 = (TextView) m14383U(R.id.currTime);
        Intrinsics2.m13088d(textView2, "currTime");
        textView2.setText(C0244f.m1022k(mediaProgress.m1266a()));
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m14390k0() {
        ImageView imageView = (ImageView) m14383U(R.id.btnMediaPlay);
        Intrinsics2.m13088d(imageView, "btnMediaPlay");
        imageView.setVisibility(4);
        ImageView imageView2 = (ImageView) m14383U(R.id.btnMediaPrev);
        Intrinsics2.m13088d(imageView2, "btnMediaPrev");
        imageView2.setVisibility(4);
        ImageView imageView3 = (ImageView) m14383U(R.id.btnMediaNext);
        Intrinsics2.m13088d(imageView3, "btnMediaNext");
        imageView3.setVisibility(4);
        ProgressBar progressBar = (ProgressBar) m14383U(R.id.loadingBar);
        Intrinsics2.m13088d(progressBar, "loadingBar");
        progressBar.setVisibility(0);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m14391l0() {
        int i;
        if (this.f33667W == 0 || (i = this.f33668X) == 2) {
            int iM14104q = ((SkuDao.a.m14104q(this) / 2) * 960) / 530;
            ConstraintLayout constraintLayout = (ConstraintLayout) m14383U(R.id.headerLayout);
            Intrinsics2.m13088d(constraintLayout, "headerLayout");
            constraintLayout.getLayoutParams().height = iM14104q;
            RelativeLayout relativeLayout = (RelativeLayout) m14383U(R.id.layoutVideoVertical);
            Intrinsics2.m13088d(relativeLayout, "layoutVideoVertical");
            SkuDao.a.m14061M(relativeLayout);
            CardView cardView = (CardView) m14383U(R.id.footerLayout);
            Intrinsics2.m13088d(cardView, "footerLayout");
            SkuDao.a.m14068T(cardView);
            LinearLayout linearLayout = (LinearLayout) m14383U(R.id.userLayout);
            Intrinsics2.m13088d(linearLayout, "userLayout");
            SkuDao.a.m14068T(linearLayout);
            ((AppCompatImageView) m14383U(R.id.recordingThumbnail)).setBackgroundResource(R.drawable.ic_song_default_dark);
            ((TextView) m14383U(R.id.toolbarTitle)).setTextColor(ContextCompat.m16134b(this, R.color.white_light));
            return;
        }
        if (i == 1) {
            ((AppCompatImageView) m14383U(R.id.recordingThumbnail)).setBackgroundResource(R.drawable.ic_song_vertical_default_dark);
            RelativeLayout relativeLayout2 = (RelativeLayout) m14383U(R.id.layoutVideoVertical);
            Intrinsics2.m13088d(relativeLayout2, "layoutVideoVertical");
            SkuDao.a.m14098l0(relativeLayout2, true);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) m14383U(R.id.headerLayout);
            Intrinsics2.m13088d(constraintLayout2, "headerLayout");
            constraintLayout2.getLayoutParams().height = SkuDao.a.m14103p(this);
            CardView cardView2 = (CardView) m14383U(R.id.footerLayout);
            Intrinsics2.m13088d(cardView2, "footerLayout");
            SkuDao.a.m14061M(cardView2);
            LinearLayout linearLayout2 = (LinearLayout) m14383U(R.id.userLayout);
            Intrinsics2.m13088d(linearLayout2, "userLayout");
            SkuDao.a.m14061M(linearLayout2);
            ((TextView) m14383U(R.id.toolbarTitle)).setTextColor(ContextCompat.m16134b(this, R.color.transparent_white));
        }
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p571g.CommentFragment.c
    /* JADX INFO: renamed from: m */
    public void mo13914m(Comment comment) {
        Intrinsics2.m13089e(comment, CainMediaMetadataRetriever.METADATA_KEY_COMMENT);
        ((RecordingViewModel2) this.f33645A.getValue()).m13907w(comment.getId(), "c", comment.getLikeStatus() ? 2 : 1);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m14392m0() {
        if (this.f33650F <= -1240) {
            if (this.f33665U && this.f33668X == 1) {
                CardView cardView = (CardView) m14383U(R.id.footerLayout);
                Intrinsics2.m13088d(cardView, "footerLayout");
                if (cardView.getVisibility() == 8) {
                    CardView cardView2 = (CardView) m14383U(R.id.footerLayout);
                    Intrinsics2.m13088d(cardView2, "footerLayout");
                    SkuDao.a.m14068T(cardView2);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f33665U && this.f33668X == 1) {
            CardView cardView3 = (CardView) m14383U(R.id.footerLayout);
            Intrinsics2.m13088d(cardView3, "footerLayout");
            if (cardView3.getVisibility() == 0) {
                CardView cardView4 = (CardView) m14383U(R.id.footerLayout);
                Intrinsics2.m13088d(cardView4, "footerLayout");
                SkuDao.a.m14061M(cardView4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    @Override // p007c.p008a.p009a.p029b.p039d.PlaylistListener
    /* JADX INFO: renamed from: n */
    public boolean mo1268n(PlaybackState playbackState) {
        Intrinsics2.m13089e(playbackState, "playbackState");
        Intrinsics2.m13089e("playbackState " + playbackState, "message");
        int iOrdinal = playbackState.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            m14390k0();
        } else if (iOrdinal == 2) {
            m14385f0(true);
            AppCompatImageView appCompatImageView = (AppCompatImageView) m14383U(R.id.recordingThumbnail);
            Intrinsics2.m13088d(appCompatImageView, "recordingThumbnail");
            SkuDao.a.m14061M(appCompatImageView);
            KenBurnsView kenBurnsView = (KenBurnsView) m14383U(R.id.kenBurnsView);
            kenBurnsView.f33429h.post(kenBurnsView.f33445x);
        } else if (iOrdinal == 3) {
            KenBurnsView kenBurnsView2 = (KenBurnsView) m14383U(R.id.kenBurnsView);
            kenBurnsView2.f33429h.removeCallbacks(kenBurnsView2.f33445x);
            kenBurnsView2.f33429h.removeCallbacks(kenBurnsView2.f33446y);
            m14385f0(false);
        } else if (iOrdinal == 4) {
            m14390k0();
        } else if (iOrdinal == 5) {
            boolean z = this.f33665U;
            if (z) {
                finish();
            } else {
                this.f33670Z = true;
                if (!z) {
                    Intrinsics2.m13089e("Update play count from replay", "message");
                    PlayingViewModel4 playingViewModel4Mo13969R = mo13969R();
                    int i = this.f33651G;
                    Objects.requireNonNull(playingViewModel4Mo13969R);
                    C5729a.m12428A(C8310a.m16440e(playingViewModel4Mo13969R), null, 0, new PlayingViewModel3(playingViewModel4Mo13969R, i, null), 3, null);
                    PlaylistManager playlistManager = this.f33658N;
                    if (playlistManager == null) {
                        Intrinsics2.m13096l("playlistManager");
                        throw null;
                    }
                    playlistManager.m1282l(this.f33661Q);
                    PlaylistManager playlistManager2 = this.f33658N;
                    if (playlistManager2 == null) {
                        Intrinsics2.m13096l("playlistManager");
                        throw null;
                    }
                    playlistManager2.m1279h(0L, false);
                }
                m14395p0(false);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m14393n0() {
        LoginFragment2.f31647t0.m13940a(-1).mo5469c1(m16577C(), "LoginForm");
    }

    /* JADX INFO: renamed from: o0 */
    public final void m14394o0() {
        if (this.f33650F >= 110) {
            SkuDao.a.m14056H(this, true, false, 2);
        } else {
            SkuDao.a.m14056H(this, false, false, 3);
        }
        Window window = getWindow();
        Intrinsics2.m13088d(window, "window");
        Object objEvaluate = new ArgbEvaluator().evaluate(this.f33649E, 0, Integer.valueOf(ContextCompat.m16134b(this, R.color.white)));
        Objects.requireNonNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        window.setStatusBarColor(((Integer) objEvaluate).intValue());
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Intrinsics2.m13089e("onActivityResult Playing", "message");
        FragmentManager fragmentManagerM16577C = m16577C();
        Intrinsics2.m13088d(fragmentManagerM16577C, "supportFragmentManager");
        for (Fragment fragment : fragmentManagerM16577C.m16659L()) {
            if (fragment instanceof ShareFragment) {
                fragment.mo2588X(i, i2, intent);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m14384e0();
        this.f143l.m133b();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        Toolbar toolbar = (Toolbar) m14383U(R.id.playingToolbar);
        Intrinsics2.m13088d(toolbar, "playingToolbar");
        SkuDao.a.m14066R(toolbar, SkuDao.a.m14105r(this));
        TextView textView = (TextView) m14383U(R.id.toolbarTitle);
        Intrinsics2.m13088d(textView, "toolbarTitle");
        textView.setSelected(true);
        TextView textView2 = (TextView) m14383U(R.id.videoRecordingName);
        Intrinsics2.m13088d(textView2, "videoRecordingName");
        textView2.setSelected(true);
        TextView textView3 = (TextView) m14383U(R.id.giftCount);
        Intrinsics2.m13088d(textView3, "giftCount");
        textView3.setSelected(true);
        this.f33656L.add("");
        this.f33651G = getIntent().getIntExtra("id", 0);
        StringBuilder sbM1556G = outline.m1556G("recordingId ");
        sbM1556G.append(this.f33651G);
        Intrinsics2.m13089e(sbM1556G.toString(), "message");
        this.f33667W = getIntent().getIntExtra("format", 0);
        this.f33668X = getIntent().getIntExtra("video_ratio", 2);
        this.f33669Y = getIntent().getStringExtra("thumbnail");
        if (this.f33651G <= 0) {
            finish();
        }
        String str = this.f33669Y;
        if (str != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) m14383U(R.id.recordingThumbnail);
            Intrinsics2.m13088d(appCompatImageView, "recordingThumbnail");
            SkuDao.a.m14054F(appCompatImageView, str, null, null, null, null, true, false, false, 0, false, null, null, null, 8158);
        }
        m14389j0();
        m14391l0();
        mo13969R().f31696l.mo422e(this, new C7293g());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_250);
        this.f33648D = dimensionPixelSize;
        this.f33650F = dimensionPixelSize;
        m14394o0();
        ((AppBarLayout) m14383U(R.id.appBarLayout)).m12678a(new PlayingActivity7(this));
        ((CommentViewModel3) this.f33674z.getValue()).f31348u.mo422e(this, new PlayingActivity3(this));
        m14383U(R.id.commentDim).setOnClickListener(new ViewOnClickListenerC0231b(0, this));
        ((EditText) m14383U(R.id.writeComment)).setOnClickListener(new ViewOnClickListenerC0231b(1, this));
        CardView cardView = (CardView) m14383U(R.id.footerLayout);
        Intrinsics2.m13088d(cardView, "footerLayout");
        cardView.getViewTreeObserver().addOnGlobalLayoutListener(new PlayingActivity4(this));
        ((ImageView) m14383U(R.id.btnSendComment)).setOnClickListener(new ViewOnClickListenerC0231b(2, this));
        this.f33652H.cancel();
        Timer timer = new Timer();
        this.f33652H = timer;
        timer.schedule(new p555j.p556a.p557a.p558a.p559a.p584n.Timer(this), 7000L);
        m14383U(R.id.clickShowHideControl).setOnClickListener(new ViewOnClickListenerC7218l(0, this));
        ((LinearLayout) m14383U(R.id.btnLike)).setOnClickListener(new ViewOnClickListenerC7218l(1, this));
        RelativeLayout relativeLayout = (RelativeLayout) m14383U(R.id.btnSendGift);
        Intrinsics2.m13088d(relativeLayout, "btnSendGift");
        SkuDao.a.m14067S(relativeLayout, new C7403u0(12, this));
        LinearLayout linearLayout = (LinearLayout) m14383U(R.id.btnShare);
        Intrinsics2.m13088d(linearLayout, "btnShare");
        SkuDao.a.m14067S(linearLayout, new C7403u0(13, this));
        LinearLayout linearLayout2 = (LinearLayout) m14383U(R.id.btnGiftViewAll);
        Intrinsics2.m13088d(linearLayout2, "btnGiftViewAll");
        SkuDao.a.m14067S(linearLayout2, new C7403u0(14, this));
        ImageView imageView = (ImageView) m14383U(R.id.btnBack);
        Intrinsics2.m13088d(imageView, "btnBack");
        SkuDao.a.m14067S(imageView, new C7403u0(15, this));
        FloatingActionButton floatingActionButton = (FloatingActionButton) m14383U(R.id.btnSing);
        Intrinsics2.m13088d(floatingActionButton, "btnSing");
        SkuDao.a.m14067S(floatingActionButton, new C7403u0(16, this));
        TextView textView4 = (TextView) m14383U(R.id.btnFollow);
        Intrinsics2.m13088d(textView4, "btnFollow");
        SkuDao.a.m14067S(textView4, new C7403u0(17, this));
        TextView textView5 = (TextView) m14383U(R.id.btnFollowDuet);
        Intrinsics2.m13088d(textView5, "btnFollowDuet");
        SkuDao.a.m14067S(textView5, new C7403u0(18, this));
        ConstraintLayout constraintLayout = (ConstraintLayout) m14383U(R.id.btnViewUser);
        Intrinsics2.m13088d(constraintLayout, "btnViewUser");
        SkuDao.a.m14067S(constraintLayout, new C7403u0(0, this));
        ConstraintLayout constraintLayout2 = (ConstraintLayout) m14383U(R.id.btnViewDuetUser);
        Intrinsics2.m13088d(constraintLayout2, "btnViewDuetUser");
        SkuDao.a.m14067S(constraintLayout2, new C7403u0(1, this));
        TextView textView6 = (TextView) m14383U(R.id.btnViewOwnerDuet);
        Intrinsics2.m13088d(textView6, "btnViewOwnerDuet");
        SkuDao.a.m14067S(textView6, new C7403u0(2, this));
        LinearLayout linearLayout3 = (LinearLayout) m14383U(R.id.btnVideoLike);
        Intrinsics2.m13088d(linearLayout3, "btnVideoLike");
        SkuDao.a.m14067S(linearLayout3, new C7403u0(3, this));
        LinearLayout linearLayout4 = (LinearLayout) m14383U(R.id.btnVideoComment);
        Intrinsics2.m13088d(linearLayout4, "btnVideoComment");
        SkuDao.a.m14067S(linearLayout4, new C7403u0(4, this));
        LinearLayout linearLayout5 = (LinearLayout) m14383U(R.id.btnVideoShare);
        Intrinsics2.m13088d(linearLayout5, "btnVideoShare");
        SkuDao.a.m14067S(linearLayout5, new C7403u0(5, this));
        LinearLayout linearLayout6 = (LinearLayout) m14383U(R.id.btnVideoSendGift);
        Intrinsics2.m13088d(linearLayout6, "btnVideoSendGift");
        SkuDao.a.m14067S(linearLayout6, new C7403u0(6, this));
        LinearLayout linearLayout7 = (LinearLayout) m14383U(R.id.btnVideoViewProfile);
        Intrinsics2.m13088d(linearLayout7, "btnVideoViewProfile");
        SkuDao.a.m14067S(linearLayout7, new C7403u0(7, this));
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) m14383U(R.id.videoAvatar);
        Intrinsics2.m13088d(appCompatImageView2, "videoAvatar");
        SkuDao.a.m14067S(appCompatImageView2, new C7403u0(8, this));
        TextView textView7 = (TextView) m14383U(R.id.btnVideoWriteComment);
        Intrinsics2.m13088d(textView7, "btnVideoWriteComment");
        SkuDao.a.m14067S(textView7, new C7403u0(9, this));
        TextView textView8 = (TextView) m14383U(R.id.btnVideoDuetJoined);
        Intrinsics2.m13088d(textView8, "btnVideoDuetJoined");
        SkuDao.a.m14067S(textView8, new C7403u0(10, this));
        ImageView imageView2 = (ImageView) m14383U(R.id.btnVideoFollow);
        Intrinsics2.m13088d(imageView2, "btnVideoFollow");
        SkuDao.a.m14067S(imageView2, new C7403u0(11, this));
    }

    @Override // p636z0.p644b.p645c.AppCompatActivity, p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Intrinsics2.m13089e("onDestroy1111", "message");
        m14384e0();
        this.f33652H.cancel();
        PlaylistManager playlistManager = this.f33658N;
        if (playlistManager == null) {
            Intrinsics2.m13096l("playlistManager");
            throw null;
        }
        playlistManager.m1283m(this);
        PlaylistManager playlistManager2 = this.f33658N;
        if (playlistManager2 == null) {
            Intrinsics2.m13096l("playlistManager");
            throw null;
        }
        Objects.requireNonNull(playlistManager2);
        Intrinsics2.m13090f(this, "listener");
        playlistManager2.f1777m.lock();
        Iterator<WeakReference<ProgressListener>> it = playlistManager2.f1775k.iterator();
        while (it.hasNext()) {
            ProgressListener progressListener = it.next().get();
            if (progressListener == null || Intrinsics2.m13085a(progressListener, this)) {
                it.remove();
            }
        }
        playlistManager2.f1777m.unlock();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Intrinsics2.m13089e("onResume", "message");
        Context applicationContext = getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type mtp.media.karaoke.MainApplication");
        PlaylistManager playlistManagerM14331a = ((MainApplication) applicationContext).m14331a();
        this.f33658N = playlistManagerM14331a;
        if (playlistManagerM14331a == null) {
            Intrinsics2.m13096l("playlistManager");
            throw null;
        }
        playlistManagerM14331a.m1280i(this);
        PlaylistManager playlistManager = this.f33658N;
        if (playlistManager == null) {
            Intrinsics2.m13096l("playlistManager");
            throw null;
        }
        Objects.requireNonNull(playlistManager);
        Intrinsics2.m13090f(this, "listener");
        playlistManager.f1777m.lock();
        playlistManager.f1775k.add(new WeakReference<>(this));
        playlistManager.f1777m.unlock();
        PlaylistManager playlistManager2 = this.f33658N;
        if (playlistManager2 == null) {
            Intrinsics2.m13096l("playlistManager");
            throw null;
        }
        PlaylistHandler<I> playlistHandler = playlistManager2.f1772h;
        if ((playlistHandler != 0 ? playlistHandler.f1730f : null) != null) {
            this.f33659O = true;
        }
        if (playlistManager2.m1274c() != PlaybackState.STOPPED) {
            PlaylistManager playlistManager3 = this.f33658N;
            if (playlistManager3 == null) {
                Intrinsics2.m13096l("playlistManager");
                throw null;
            }
            int iOrdinal = playlistManager3.m1274c().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                m14390k0();
            } else if (iOrdinal == 2) {
                m14385f0(true);
            } else if (iOrdinal == 3) {
                m14385f0(false);
            } else if (iOrdinal == 4) {
                m14390k0();
            } else if (iOrdinal == 5) {
                m14395p0(false);
            }
        }
        PlaylistManager playlistManager4 = this.f33658N;
        if (playlistManager4 == null) {
            Intrinsics2.m13096l("playlistManager");
            throw null;
        }
        PlaylistHandler<I> playlistHandler2 = playlistManager4.f1772h;
        MediaProgress mediaProgress = playlistHandler2 != 0 ? playlistHandler2.f1731g : null;
        if (mediaProgress != null) {
            mo1250k(mediaProgress);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m14395p0(boolean z) {
        Intrinsics2.m13089e("updatePlayPauseImage " + z, "message");
        VideoView videoView = (VideoView) m14383U(R.id.videoView);
        if (videoView != null && videoView.m12572a()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) m14383U(R.id.recordingThumbnail);
            Intrinsics2.m13088d(appCompatImageView, "recordingThumbnail");
            SkuDao.a.m14061M(appCompatImageView);
            z = true;
        }
        ((ImageView) m14383U(R.id.btnMediaPlay)).setImageResource(z ? R.drawable.ic_pause_music : R.drawable.ic_playing_music);
        if (z) {
            ((LottieAnimationView) m14383U(R.id.f33394eq)).m12552i();
        } else {
            ((LottieAnimationView) m14383U(R.id.f33394eq)).m12550g();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p578j.GiftFragment.d
    /* JADX INFO: renamed from: r */
    public void mo13930r(Present present) {
        Intrinsics2.m13089e(present, "present");
        Intrinsics2.m13089e("onSendGiftSuccess", "message");
        PlayingViewModel4 playingViewModel4Mo13969R = mo13969R();
        int i = this.f33651G;
        Objects.requireNonNull(playingViewModel4Mo13969R);
        C5729a.m12428A(C8310a.m16440e(playingViewModel4Mo13969R), null, 0, new PlayingViewModel2(playingViewModel4Mo13969R, i, null), 3, null);
        Intrinsics2.m13089e("renderGiftAnimationLayout", "message");
        AppCompatImageView appCompatImageView = (AppCompatImageView) m14383U(R.id.senderAvatar);
        Intrinsics2.m13088d(appCompatImageView, "senderAvatar");
        User user = present.getUser();
        SkuDao.a.m14054F(appCompatImageView, user != null ? user.getAvatar() : null, null, null, null, null, false, false, true, 0, false, null, null, null, 8062);
        TextView textView = (TextView) m14383U(R.id.senderFullName);
        Intrinsics2.m13088d(textView, "senderFullName");
        User user2 = present.getUser();
        textView.setText(user2 != null ? user2.getFullName() : null);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) m14383U(R.id.senderGiftImage);
        Intrinsics2.m13088d(appCompatImageView2, "senderGiftImage");
        Gift gift = present.getGift();
        SkuDao.a.m14054F(appCompatImageView2, gift != null ? gift.getImage() : null, null, null, null, null, false, false, false, 0, false, null, null, null, 8190);
        RelativeLayout relativeLayout = (RelativeLayout) m14383U(R.id.giftAnimationView);
        Intrinsics2.m13088d(relativeLayout, "giftAnimationView");
        slideUp(relativeLayout);
        new Timer().schedule(new PlayingActivity2(this), 3000L);
    }

    public final void slideDown(View view) {
        Intrinsics2.m13089e(view, "view");
        try {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) m14383U(R.id.container);
            Intrinsics2.m13088d(coordinatorLayout, "container");
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, coordinatorLayout.getWidth(), 0.0f, 0.0f);
            translateAnimation.setDuration(200L);
            translateAnimation.setFillAfter(true);
            view.startAnimation(translateAnimation);
        } catch (Exception unused) {
        }
    }

    public final void slideUp(View view) {
        Intrinsics2.m13089e(view, "view");
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation((-view.getWidth()) + 50, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setFillAfter(true);
        view.startAnimation(translateAnimation);
    }

    @Override // p007c.p008a.p009a.p029b.p039d.PlaylistListener
    /* JADX INFO: renamed from: y */
    public boolean mo1269y(PlaylistItem playlistItem, boolean z, boolean z2) {
        MediaItem4 mediaItem4 = (MediaItem4) playlistItem;
        StringBuilder sbM1556G = outline.m1556G("onPlaylistItemChanged ");
        sbM1556G.append(mediaItem4 != null ? Long.valueOf(mediaItem4.f32262a.f32256a) : null);
        Intrinsics2.m13089e(sbM1556G.toString(), "message");
        if (!this.f33670Z && mediaItem4 != null) {
            long j2 = mediaItem4.f32262a.f32256a;
            if (j2 > 0) {
                int i = (int) j2;
                this.f33651G = i;
                if (i > 0) {
                    this.f33656L.clear();
                    this.f33656L.add("");
                    m14389j0();
                }
            }
        }
        this.f33659O = true;
        if (z) {
            ((ImageView) m14383U(R.id.btnMediaNext)).setColorFilter(ContextCompat.m16134b(this, R.color.white_light));
        } else {
            ((ImageView) m14383U(R.id.btnMediaNext)).setColorFilter(ContextCompat.m16134b(this, R.color.grey_400));
        }
        if (z2) {
            ((ImageView) m14383U(R.id.btnMediaPrev)).setColorFilter(ContextCompat.m16134b(this, R.color.white_light));
        } else {
            ((ImageView) m14383U(R.id.btnMediaPrev)).setColorFilter(ContextCompat.m16134b(this, R.color.grey_400));
        }
        if (!z && !z2) {
            ((ImageView) m14383U(R.id.btnMediaPrev)).setColorFilter(ContextCompat.m16134b(this, R.color.grey_400));
            ((ImageView) m14383U(R.id.btnMediaPrev)).setColorFilter(ContextCompat.m16134b(this, R.color.grey_400));
        }
        ImageView imageView = (ImageView) m14383U(R.id.btnMediaNext);
        Intrinsics2.m13088d(imageView, "btnMediaNext");
        imageView.setEnabled(z);
        ImageView imageView2 = (ImageView) m14383U(R.id.btnMediaPrev);
        Intrinsics2.m13088d(imageView2, "btnMediaPrev");
        imageView2.setEnabled(z2);
        return true;
    }
}
