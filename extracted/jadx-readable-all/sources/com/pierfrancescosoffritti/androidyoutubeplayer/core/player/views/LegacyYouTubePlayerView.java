package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import mtp.media.karaoke.R;
import org.json.JSONException;
import p007c.p043b.p044a.p045a.p046a.DefaultPlayerUiController;
import p007c.p043b.p044a.p045a.p046a.PlayerUiController;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants3;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants4;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayerBridge;
import p007c.p043b.p044a.p045a.p051b.p052a.FullScreenHelper;
import p007c.p043b.p044a.p045a.p051b.p052a.NetworkListener;
import p007c.p043b.p044a.p045a.p051b.p052a.PlaybackResumer;
import p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener;
import p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerCallback;
import p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener;
import p007c.p043b.p044a.p045a.p051b.p054i.IFramePlayerOptions;
import p007c.p043b.p044a.p045a.p051b.p055j.LegacyYouTubePlayerView2;
import p007c.p043b.p044a.p045a.p051b.p055j.SixteenByNineFrameLayout;
import p007c.p043b.p044a.p045a.p051b.p055j.WebViewYouTubePlayer;
import p007c.p043b.p044a.p045a.p051b.p055j.WebViewYouTubePlayer2;
import p477d1.Unit;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleObserver;
import p636z0.p759s.OnLifecycleEvent;

/* JADX INFO: compiled from: LegacyYouTubePlayerView.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LegacyYouTubePlayerView extends SixteenByNineFrameLayout implements LifecycleObserver {

    /* JADX INFO: renamed from: f */
    public final WebViewYouTubePlayer f29297f;

    /* JADX INFO: renamed from: g */
    public final DefaultPlayerUiController f29298g;

    /* JADX INFO: renamed from: h */
    public final NetworkListener f29299h;

    /* JADX INFO: renamed from: i */
    public final PlaybackResumer f29300i;

    /* JADX INFO: renamed from: j */
    public final FullScreenHelper f29301j;

    /* JADX INFO: renamed from: k */
    public boolean f29302k;

    /* JADX INFO: renamed from: l */
    public InterfaceC6153a<Unit> f29303l;

    /* JADX INFO: renamed from: m */
    public final HashSet<YouTubePlayerCallback> f29304m;

    /* JADX INFO: renamed from: n */
    public boolean f29305n;

    /* JADX INFO: renamed from: o */
    public boolean f29306o;

    /* JADX INFO: renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$a */
    /* JADX INFO: compiled from: LegacyYouTubePlayerView.kt */
    public static final class C6000a extends AbstractYouTubePlayerListener {
        public C6000a() {
        }

        @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
        /* JADX INFO: renamed from: g */
        public void mo1297g(YouTubePlayer youTubePlayer, PlayerConstants4 playerConstants4) {
            Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
            Intrinsics2.m13090f(playerConstants4, "state");
            if (playerConstants4 == PlayerConstants4.PLAYING) {
                LegacyYouTubePlayerView legacyYouTubePlayerView = LegacyYouTubePlayerView.this;
                if (legacyYouTubePlayerView.f29305n || legacyYouTubePlayerView.f29297f.f1940i) {
                    return;
                }
                youTubePlayer.pause();
            }
        }
    }

    /* JADX INFO: renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$b */
    /* JADX INFO: compiled from: LegacyYouTubePlayerView.kt */
    public static final class C6001b extends AbstractYouTubePlayerListener {
        public C6001b() {
        }

        @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
        /* JADX INFO: renamed from: h */
        public void mo1298h(YouTubePlayer youTubePlayer) {
            Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
            LegacyYouTubePlayerView.this.setYouTubePlayerReady$core_release(true);
            Iterator<T> it = LegacyYouTubePlayerView.this.f29304m.iterator();
            while (it.hasNext()) {
                ((YouTubePlayerCallback) it.next()).m1324a(youTubePlayer);
            }
            LegacyYouTubePlayerView.this.f29304m.clear();
            youTubePlayer.mo1319b(this);
        }
    }

    /* JADX INFO: renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$c */
    /* JADX INFO: compiled from: LegacyYouTubePlayerView.kt */
    public static final class C6002c extends Lambda implements InterfaceC6153a<Unit> {
        public C6002c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            LegacyYouTubePlayerView legacyYouTubePlayerView = LegacyYouTubePlayerView.this;
            if (legacyYouTubePlayerView.f29302k) {
                PlaybackResumer playbackResumer = legacyYouTubePlayerView.f29300i;
                WebViewYouTubePlayer youTubePlayer$core_release = legacyYouTubePlayerView.getYouTubePlayer$core_release();
                Objects.requireNonNull(playbackResumer);
                PlayerConstants3 playerConstants3 = PlayerConstants3.HTML_5_PLAYER;
                Intrinsics2.m13090f(youTubePlayer$core_release, "youTubePlayer");
                String str = playbackResumer.f1879i;
                if (str != null) {
                    boolean z = playbackResumer.f1877g;
                    if (z && playbackResumer.f1878h == playerConstants3) {
                        boolean z2 = playbackResumer.f1876f;
                        float f = playbackResumer.f1880j;
                        Intrinsics2.m13090f(youTubePlayer$core_release, "$this$loadOrCueVideo");
                        Intrinsics2.m13090f(str, "videoId");
                        if (z2) {
                            youTubePlayer$core_release.mo1322e(str, f);
                        } else {
                            youTubePlayer$core_release.mo1321d(str, f);
                        }
                    } else if (!z && playbackResumer.f1878h == playerConstants3) {
                        youTubePlayer$core_release.mo1321d(str, playbackResumer.f1880j);
                    }
                }
                playbackResumer.f1878h = null;
            } else {
                legacyYouTubePlayerView.f29303l.mo2c();
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$d */
    /* JADX INFO: compiled from: LegacyYouTubePlayerView.kt */
    public static final class C6003d extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public static final C6003d f29310g = new C6003d();

        public C6003d() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$e */
    /* JADX INFO: compiled from: LegacyYouTubePlayerView.kt */
    public static final class C6004e extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ YouTubePlayerListener f29312h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ IFramePlayerOptions f29313i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6004e(YouTubePlayerListener youTubePlayerListener, IFramePlayerOptions iFramePlayerOptions) {
            super(0);
            this.f29312h = youTubePlayerListener;
            this.f29313i = iFramePlayerOptions;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() throws JSONException, IOException {
            WebViewYouTubePlayer youTubePlayer$core_release = LegacyYouTubePlayerView.this.getYouTubePlayer$core_release();
            LegacyYouTubePlayerView2 legacyYouTubePlayerView2 = new LegacyYouTubePlayerView2(this);
            IFramePlayerOptions iFramePlayerOptions = this.f29313i;
            Objects.requireNonNull(youTubePlayer$core_release);
            Intrinsics2.m13090f(legacyYouTubePlayerView2, "initListener");
            youTubePlayer$core_release.f1937f = legacyYouTubePlayerView2;
            if (iFramePlayerOptions == null) {
                Objects.requireNonNull(IFramePlayerOptions.f1933b);
                iFramePlayerOptions = IFramePlayerOptions.f1932a;
            }
            WebSettings settings = youTubePlayer$core_release.getSettings();
            Intrinsics2.m13086b(settings, "settings");
            settings.setJavaScriptEnabled(true);
            WebSettings settings2 = youTubePlayer$core_release.getSettings();
            Intrinsics2.m13086b(settings2, "settings");
            settings2.setMediaPlaybackRequiresUserGesture(false);
            WebSettings settings3 = youTubePlayer$core_release.getSettings();
            Intrinsics2.m13086b(settings3, "settings");
            settings3.setCacheMode(2);
            youTubePlayer$core_release.addJavascriptInterface(new YouTubePlayerBridge(youTubePlayer$core_release), "YouTubePlayerBridge");
            InputStream inputStreamOpenRawResource = youTubePlayer$core_release.getResources().openRawResource(R.raw.ayp_youtube_player);
            Intrinsics2.m13086b(inputStreamOpenRawResource, "resources.openRawResourc…R.raw.ayp_youtube_player)");
            Intrinsics2.m13090f(inputStreamOpenRawResource, "inputStream");
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, "utf-8"));
                    StringBuilder sb = new StringBuilder();
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        sb.append(line);
                        sb.append("\n");
                    }
                    String string = sb.toString();
                    Intrinsics2.m13086b(string, "sb.toString()");
                    inputStreamOpenRawResource.close();
                    String strM12993j = StringsJVM.m12993j(string, "<<injectedPlayerVars>>", iFramePlayerOptions.toString(), false, 4);
                    String string2 = iFramePlayerOptions.f1934c.getString("origin");
                    Intrinsics2.m13086b(string2, "playerOptions.getString(Builder.ORIGIN)");
                    youTubePlayer$core_release.loadDataWithBaseURL(string2, strM12993j, "text/html", "utf-8", null);
                    youTubePlayer$core_release.setWebChromeClient(new WebViewYouTubePlayer2());
                    return Unit.f29502a;
                } catch (Exception unused) {
                    throw new RuntimeException("Can't parse HTML file.");
                }
            } catch (Throwable th) {
                inputStreamOpenRawResource.close();
                throw th;
            }
        }
    }

    public /* synthetic */ LegacyYouTubePlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: e */
    public final void m12937e(YouTubePlayerListener youTubePlayerListener, boolean z, IFramePlayerOptions iFramePlayerOptions) throws JSONException, IOException {
        Intrinsics2.m13090f(youTubePlayerListener, "youTubePlayerListener");
        if (this.f29302k) {
            throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
        }
        if (z) {
            getContext().registerReceiver(this.f29299h, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        C6004e c6004e = new C6004e(youTubePlayerListener, iFramePlayerOptions);
        this.f29303l = c6004e;
        if (z) {
            return;
        }
        c6004e.mo2c();
    }

    public final boolean getCanPlay$core_release() {
        return this.f29305n;
    }

    public final PlayerUiController getPlayerUiController() {
        if (this.f29306o) {
            throw new RuntimeException("You have inflated a custom player Ui. You must manage it with your own controller.");
        }
        return this.f29298g;
    }

    public final WebViewYouTubePlayer getYouTubePlayer$core_release() {
        return this.f29297f;
    }

    @OnLifecycleEvent(Lifecycle3.a.ON_RESUME)
    public final void onResume$core_release() {
        this.f29300i.f1876f = true;
        this.f29305n = true;
    }

    @OnLifecycleEvent(Lifecycle3.a.ON_STOP)
    public final void onStop$core_release() {
        this.f29297f.pause();
        this.f29300i.f1876f = false;
        this.f29305n = false;
    }

    @OnLifecycleEvent(Lifecycle3.a.ON_DESTROY)
    public final void release() {
        removeView(this.f29297f);
        this.f29297f.removeAllViews();
        this.f29297f.destroy();
        try {
            getContext().unregisterReceiver(this.f29299h);
        } catch (Exception unused) {
        }
    }

    public final void setYouTubePlayerReady$core_release(boolean z) {
        this.f29302k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyYouTubePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13090f(context, "context");
        WebViewYouTubePlayer webViewYouTubePlayer = new WebViewYouTubePlayer(context, null, 0, 6, null);
        this.f29297f = webViewYouTubePlayer;
        NetworkListener networkListener = new NetworkListener();
        this.f29299h = networkListener;
        PlaybackResumer playbackResumer = new PlaybackResumer();
        this.f29300i = playbackResumer;
        FullScreenHelper fullScreenHelper = new FullScreenHelper(this);
        this.f29301j = fullScreenHelper;
        this.f29303l = C6003d.f29310g;
        this.f29304m = new HashSet<>();
        this.f29305n = true;
        addView(webViewYouTubePlayer, new FrameLayout.LayoutParams(-1, -1));
        DefaultPlayerUiController defaultPlayerUiController = new DefaultPlayerUiController(this, webViewYouTubePlayer);
        this.f29298g = defaultPlayerUiController;
        Intrinsics2.m13090f(defaultPlayerUiController, "fullScreenListener");
        fullScreenHelper.f1874b.add(defaultPlayerUiController);
        webViewYouTubePlayer.mo1320c(defaultPlayerUiController);
        webViewYouTubePlayer.mo1320c(playbackResumer);
        webViewYouTubePlayer.mo1320c(new C6000a());
        webViewYouTubePlayer.mo1320c(new C6001b());
        C6002c c6002c = new C6002c();
        Intrinsics2.m13090f(c6002c, "<set-?>");
        networkListener.f1869b = c6002c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyYouTubePlayerView(Context context) {
        this(context, null, 0);
        Intrinsics2.m13090f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyYouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics2.m13090f(context, "context");
    }

    public /* synthetic */ LegacyYouTubePlayerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
