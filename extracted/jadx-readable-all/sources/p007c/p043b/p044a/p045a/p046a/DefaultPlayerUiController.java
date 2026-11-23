package p007c.p043b.p044a.p045a.p046a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.p476ui.views.YouTubePlayerSeekBar;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView;
import mtp.media.karaoke.R;
import p000.ViewOnClickListenerC6328g;
import p007c.p043b.p044a.p045a.p046a.p047c.YouTubePlayerMenu;
import p007c.p043b.p044a.p045a.p046a.p047c.p048c.DefaultYouTubePlayerMenu;
import p007c.p043b.p044a.p045a.p046a.p049d.FadeViewHelper;
import p007c.p043b.p044a.p045a.p046a.p050e.YouTubePlayerSeekBar3;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants2;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants3;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants4;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p007c.p043b.p044a.p045a.p051b.p052a.FullScreenHelper;
import p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerFullScreenListener;
import p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: c.b.a.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: DefaultPlayerUiController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultPlayerUiController implements PlayerUiController, YouTubePlayerListener, YouTubePlayerFullScreenListener, YouTubePlayerSeekBar3 {

    /* JADX INFO: renamed from: f */
    public YouTubePlayerMenu f1822f;

    /* JADX INFO: renamed from: g */
    public final View f1823g;

    /* JADX INFO: renamed from: h */
    public final View f1824h;

    /* JADX INFO: renamed from: i */
    public final TextView f1825i;

    /* JADX INFO: renamed from: j */
    public final TextView f1826j;

    /* JADX INFO: renamed from: k */
    public final ProgressBar f1827k;

    /* JADX INFO: renamed from: l */
    public final ImageView f1828l;

    /* JADX INFO: renamed from: m */
    public final ImageView f1829m;

    /* JADX INFO: renamed from: n */
    public final ImageView f1830n;

    /* JADX INFO: renamed from: o */
    public final ImageView f1831o;

    /* JADX INFO: renamed from: p */
    public final ImageView f1832p;

    /* JADX INFO: renamed from: q */
    public final ImageView f1833q;

    /* JADX INFO: renamed from: r */
    public final YouTubePlayerSeekBar f1834r;

    /* JADX INFO: renamed from: s */
    public View.OnClickListener f1835s;

    /* JADX INFO: renamed from: t */
    public View.OnClickListener f1836t;

    /* JADX INFO: renamed from: u */
    public final FadeViewHelper f1837u;

    /* JADX INFO: renamed from: v */
    public boolean f1838v;

    /* JADX INFO: renamed from: w */
    public boolean f1839w;

    /* JADX INFO: renamed from: x */
    public final LegacyYouTubePlayerView f1840x;

    /* JADX INFO: renamed from: y */
    public final YouTubePlayer f1841y;

    /* JADX INFO: renamed from: c.b.a.a.a.a$a */
    /* JADX INFO: compiled from: java-style lambda group */
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f1842f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Object f1843g;

        public a(int i, Object obj) {
            this.f1842f = i;
            this.f1843g = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.f1842f;
            if (i != 0) {
                if (i != 1) {
                    throw null;
                }
                DefaultPlayerUiController defaultPlayerUiController = (DefaultPlayerUiController) this.f1843g;
                defaultPlayerUiController.f1822f.mo1313a(defaultPlayerUiController.f1828l);
                return;
            }
            FullScreenHelper fullScreenHelper = ((DefaultPlayerUiController) this.f1843g).f1840x.f29301j;
            if (fullScreenHelper.f1873a) {
                fullScreenHelper.m1317b();
            } else {
                fullScreenHelper.m1316a();
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.a.a$b */
    /* JADX INFO: compiled from: DefaultPlayerUiController.kt */
    public static final class b implements View.OnClickListener {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f1845g;

        public b(String str) {
            this.f1845g = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            StringBuilder sbM1556G = outline.m1556G("http://www.youtube.com/watch?v=");
            sbM1556G.append(this.f1845g);
            sbM1556G.append("#t=");
            sbM1556G.append(DefaultPlayerUiController.this.f1834r.getSeekBar().getProgress());
            try {
                DefaultPlayerUiController.this.f1830n.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sbM1556G.toString())));
            } catch (Exception e) {
                String simpleName = DefaultPlayerUiController.this.getClass().getSimpleName();
                String message = e.getMessage();
                if (message == null) {
                    message = "Can't open url to YouTube";
                }
                Log.e(simpleName, message);
            }
        }
    }

    public DefaultPlayerUiController(LegacyYouTubePlayerView legacyYouTubePlayerView, YouTubePlayer youTubePlayer) {
        Intrinsics2.m13090f(legacyYouTubePlayerView, "youTubePlayerView");
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        this.f1840x = legacyYouTubePlayerView;
        this.f1841y = youTubePlayer;
        this.f1839w = true;
        View viewInflate = View.inflate(legacyYouTubePlayerView.getContext(), R.layout.ayp_default_player_ui, legacyYouTubePlayerView);
        Context context = legacyYouTubePlayerView.getContext();
        Intrinsics2.m13086b(context, "youTubePlayerView.context");
        this.f1822f = new DefaultYouTubePlayerMenu(context);
        View viewFindViewById = viewInflate.findViewById(R.id.panel);
        Intrinsics2.m13086b(viewFindViewById, "controlsView.findViewById(R.id.panel)");
        this.f1823g = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.controls_container);
        Intrinsics2.m13086b(viewFindViewById2, "controlsView.findViewById(R.id.controls_container)");
        this.f1824h = viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.extra_views_container);
        Intrinsics2.m13086b(viewFindViewById3, "controlsView.findViewByI…id.extra_views_container)");
        View viewFindViewById4 = viewInflate.findViewById(R.id.video_title);
        Intrinsics2.m13086b(viewFindViewById4, "controlsView.findViewById(R.id.video_title)");
        this.f1825i = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.live_video_indicator);
        Intrinsics2.m13086b(viewFindViewById5, "controlsView.findViewByI….id.live_video_indicator)");
        this.f1826j = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.progress);
        Intrinsics2.m13086b(viewFindViewById6, "controlsView.findViewById(R.id.progress)");
        this.f1827k = (ProgressBar) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.menu_button);
        Intrinsics2.m13086b(viewFindViewById7, "controlsView.findViewById(R.id.menu_button)");
        ImageView imageView = (ImageView) viewFindViewById7;
        this.f1828l = imageView;
        View viewFindViewById8 = viewInflate.findViewById(R.id.play_pause_button);
        Intrinsics2.m13086b(viewFindViewById8, "controlsView.findViewById(R.id.play_pause_button)");
        ImageView imageView2 = (ImageView) viewFindViewById8;
        this.f1829m = imageView2;
        View viewFindViewById9 = viewInflate.findViewById(R.id.youtube_button);
        Intrinsics2.m13086b(viewFindViewById9, "controlsView.findViewById(R.id.youtube_button)");
        this.f1830n = (ImageView) viewFindViewById9;
        View viewFindViewById10 = viewInflate.findViewById(R.id.fullscreen_button);
        Intrinsics2.m13086b(viewFindViewById10, "controlsView.findViewById(R.id.fullscreen_button)");
        ImageView imageView3 = (ImageView) viewFindViewById10;
        this.f1831o = imageView3;
        View viewFindViewById11 = viewInflate.findViewById(R.id.custom_action_left_button);
        Intrinsics2.m13086b(viewFindViewById11, "controlsView.findViewByI…ustom_action_left_button)");
        this.f1832p = (ImageView) viewFindViewById11;
        View viewFindViewById12 = viewInflate.findViewById(R.id.custom_action_right_button);
        Intrinsics2.m13086b(viewFindViewById12, "controlsView.findViewByI…stom_action_right_button)");
        this.f1833q = (ImageView) viewFindViewById12;
        View viewFindViewById13 = viewInflate.findViewById(R.id.youtube_player_seekbar);
        Intrinsics2.m13086b(viewFindViewById13, "controlsView.findViewByI…d.youtube_player_seekbar)");
        YouTubePlayerSeekBar youTubePlayerSeekBar = (YouTubePlayerSeekBar) viewFindViewById13;
        this.f1834r = youTubePlayerSeekBar;
        FadeViewHelper fadeViewHelper = new FadeViewHelper(viewFindViewById2);
        this.f1837u = fadeViewHelper;
        this.f1835s = new a(0, this);
        this.f1836t = new a(1, this);
        youTubePlayer.mo1320c(youTubePlayerSeekBar);
        youTubePlayer.mo1320c(fadeViewHelper);
        youTubePlayerSeekBar.setYoutubePlayerSeekBarListener(this);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC6328g(0, this));
        imageView2.setOnClickListener(new ViewOnClickListenerC6328g(1, this));
        imageView3.setOnClickListener(new ViewOnClickListenerC6328g(2, this));
        imageView.setOnClickListener(new ViewOnClickListenerC6328g(3, this));
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: a */
    public void mo1291a(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
    }

    @Override // p007c.p043b.p044a.p045a.p046a.PlayerUiController
    /* JADX INFO: renamed from: b */
    public PlayerUiController mo1292b(boolean z) {
        this.f1831o.setVisibility(z ? 0 : 8);
        return this;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: c */
    public void mo1293c(YouTubePlayer youTubePlayer, PlayerConstants2 playerConstants2) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants2, "playbackRate");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: d */
    public void mo1294d(YouTubePlayer youTubePlayer) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
    }

    @Override // p007c.p043b.p044a.p045a.p046a.PlayerUiController
    /* JADX INFO: renamed from: e */
    public PlayerUiController mo1295e(boolean z) {
        this.f1837u.f1860j = !z;
        this.f1824h.setVisibility(z ? 0 : 4);
        return this;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: f */
    public void mo1296f(YouTubePlayer youTubePlayer, String str) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(str, "videoId");
        this.f1830n.setOnClickListener(new b(str));
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: g */
    public void mo1297g(YouTubePlayer youTubePlayer, PlayerConstants4 playerConstants4) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants4, "state");
        int iOrdinal = playerConstants4.ordinal();
        if (iOrdinal == 2) {
            this.f1838v = false;
        } else if (iOrdinal == 3) {
            this.f1838v = true;
        } else if (iOrdinal == 4) {
            this.f1838v = false;
        }
        m1312v(!this.f1838v);
        PlayerConstants4 playerConstants5 = PlayerConstants4.PLAYING;
        if (playerConstants4 == playerConstants5 || playerConstants4 == PlayerConstants4.PAUSED || playerConstants4 == PlayerConstants4.VIDEO_CUED) {
            View view = this.f1823g;
            view.setBackgroundColor(ContextCompat.m16134b(view.getContext(), android.R.color.transparent));
            this.f1827k.setVisibility(8);
            if (this.f1839w) {
                this.f1829m.setVisibility(0);
            }
            m1312v(playerConstants4 == playerConstants5);
            return;
        }
        m1312v(false);
        if (playerConstants4 == PlayerConstants4.BUFFERING) {
            this.f1827k.setVisibility(0);
            View view2 = this.f1823g;
            view2.setBackgroundColor(ContextCompat.m16134b(view2.getContext(), android.R.color.transparent));
            if (this.f1839w) {
                this.f1829m.setVisibility(4);
            }
            this.f1832p.setVisibility(8);
            this.f1833q.setVisibility(8);
        }
        if (playerConstants4 == PlayerConstants4.UNSTARTED) {
            this.f1827k.setVisibility(8);
            if (this.f1839w) {
                this.f1829m.setVisibility(0);
            }
        }
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: h */
    public void mo1298h(YouTubePlayer youTubePlayer) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
    }

    @Override // p007c.p043b.p044a.p045a.p046a.PlayerUiController
    /* JADX INFO: renamed from: i */
    public PlayerUiController mo1299i(boolean z) {
        this.f1830n.setVisibility(z ? 0 : 8);
        return this;
    }

    @Override // p007c.p043b.p044a.p045a.p046a.PlayerUiController
    /* JADX INFO: renamed from: j */
    public PlayerUiController mo1300j(boolean z) {
        this.f1834r.getSeekBar().setVisibility(z ? 0 : 4);
        return this;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: k */
    public void mo1301k(YouTubePlayer youTubePlayer, PlayerConstants playerConstants) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants, "playbackQuality");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerFullScreenListener
    /* JADX INFO: renamed from: l */
    public void mo1302l() {
        this.f1831o.setImageResource(R.drawable.ayp_ic_fullscreen_24dp);
    }

    @Override // p007c.p043b.p044a.p045a.p046a.PlayerUiController
    /* JADX INFO: renamed from: m */
    public PlayerUiController mo1303m(boolean z) {
        this.f1825i.setVisibility(z ? 0 : 8);
        return this;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerFullScreenListener
    /* JADX INFO: renamed from: n */
    public void mo1304n() {
        this.f1831o.setImageResource(R.drawable.ayp_ic_fullscreen_exit_24dp);
    }

    @Override // p007c.p043b.p044a.p045a.p046a.PlayerUiController
    /* JADX INFO: renamed from: o */
    public PlayerUiController mo1305o(boolean z) {
        this.f1829m.setVisibility(z ? 0 : 8);
        this.f1839w = z;
        return this;
    }

    @Override // p007c.p043b.p044a.p045a.p046a.PlayerUiController
    /* JADX INFO: renamed from: p */
    public PlayerUiController mo1306p(boolean z) {
        this.f1834r.getVideoDurationTextView().setVisibility(z ? 0 : 8);
        return this;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: q */
    public void mo1307q(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
    }

    @Override // p007c.p043b.p044a.p045a.p046a.PlayerUiController
    /* JADX INFO: renamed from: r */
    public PlayerUiController mo1308r(boolean z) {
        this.f1834r.getVideoCurrentTimeTextView().setVisibility(z ? 0 : 8);
        return this;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: s */
    public void mo1309s(YouTubePlayer youTubePlayer, PlayerConstants3 playerConstants3) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants3, "error");
    }

    @Override // p007c.p043b.p044a.p045a.p046a.p050e.YouTubePlayerSeekBar3
    public void seekTo(float f) {
        this.f1841y.seekTo(f);
    }

    @Override // p007c.p043b.p044a.p045a.p046a.PlayerUiController
    /* JADX INFO: renamed from: t */
    public PlayerUiController mo1310t(boolean z) {
        this.f1834r.setVisibility(z ? 4 : 0);
        this.f1826j.setVisibility(z ? 0 : 8);
        return this;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: u */
    public void mo1311u(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
    }

    /* JADX INFO: renamed from: v */
    public final void m1312v(boolean z) {
        this.f1829m.setImageResource(z ? R.drawable.ayp_ic_pause_36dp : R.drawable.ayp_ic_play_36dp);
    }
}
