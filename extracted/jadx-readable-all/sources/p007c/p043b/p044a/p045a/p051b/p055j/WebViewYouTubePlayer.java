package p007c.p043b.p044a.p045a.p051b.p055j;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayerBridge;
import p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.b.a.a.b.j.c, reason: use source file name */
/* JADX INFO: compiled from: WebViewYouTubePlayer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WebViewYouTubePlayer extends WebView implements YouTubePlayer, YouTubePlayerBridge.b {

    /* JADX INFO: renamed from: f */
    public InterfaceC6164l<? super YouTubePlayer, Unit> f1937f;

    /* JADX INFO: renamed from: g */
    public final HashSet<YouTubePlayerListener> f1938g;

    /* JADX INFO: renamed from: h */
    public final Handler f1939h;

    /* JADX INFO: renamed from: i */
    public boolean f1940i;

    /* JADX INFO: renamed from: c.b.a.a.b.j.c$a */
    /* JADX INFO: compiled from: WebViewYouTubePlayer.kt */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f1942g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ float f1943h;

        public a(String str, float f) {
            this.f1942g = str;
            this.f1943h = f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebViewYouTubePlayer webViewYouTubePlayer = WebViewYouTubePlayer.this;
            StringBuilder sbM1556G = outline.m1556G("javascript:cueVideo('");
            sbM1556G.append(this.f1942g);
            sbM1556G.append("', ");
            sbM1556G.append(this.f1943h);
            sbM1556G.append(')');
            webViewYouTubePlayer.loadUrl(sbM1556G.toString());
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.j.c$b */
    /* JADX INFO: compiled from: WebViewYouTubePlayer.kt */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f1945g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ float f1946h;

        public b(String str, float f) {
            this.f1945g = str;
            this.f1946h = f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebViewYouTubePlayer webViewYouTubePlayer = WebViewYouTubePlayer.this;
            StringBuilder sbM1556G = outline.m1556G("javascript:loadVideo('");
            sbM1556G.append(this.f1945g);
            sbM1556G.append("', ");
            sbM1556G.append(this.f1946h);
            sbM1556G.append(')');
            webViewYouTubePlayer.loadUrl(sbM1556G.toString());
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.j.c$c */
    /* JADX INFO: compiled from: WebViewYouTubePlayer.kt */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebViewYouTubePlayer.this.loadUrl("javascript:pauseVideo()");
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.j.c$d */
    /* JADX INFO: compiled from: WebViewYouTubePlayer.kt */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebViewYouTubePlayer.this.loadUrl("javascript:playVideo()");
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.j.c$e */
    /* JADX INFO: compiled from: WebViewYouTubePlayer.kt */
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float f1950g;

        public e(float f) {
            this.f1950g = f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebViewYouTubePlayer webViewYouTubePlayer = WebViewYouTubePlayer.this;
            StringBuilder sbM1556G = outline.m1556G("javascript:seekTo(");
            sbM1556G.append(this.f1950g);
            sbM1556G.append(')');
            webViewYouTubePlayer.loadUrl(sbM1556G.toString());
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.j.c$f */
    /* JADX INFO: compiled from: WebViewYouTubePlayer.kt */
    public static final class f implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f1952g;

        public f(int i) {
            this.f1952g = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebViewYouTubePlayer webViewYouTubePlayer = WebViewYouTubePlayer.this;
            StringBuilder sbM1556G = outline.m1556G("javascript:setVolume(");
            sbM1556G.append(this.f1952g);
            sbM1556G.append(')');
            webViewYouTubePlayer.loadUrl(sbM1556G.toString());
        }
    }

    public /* synthetic */ WebViewYouTubePlayer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // p007c.p043b.p044a.p045a.p051b.YouTubePlayer
    /* JADX INFO: renamed from: U */
    public void mo1318U() {
        this.f1939h.post(new d());
    }

    @Override // p007c.p043b.p044a.p045a.p051b.YouTubePlayerBridge.b
    /* JADX INFO: renamed from: a */
    public void mo1323a() {
        InterfaceC6164l<? super YouTubePlayer, Unit> interfaceC6164l = this.f1937f;
        if (interfaceC6164l != null) {
            interfaceC6164l.mo3b(this);
        } else {
            Intrinsics2.m13096l("youTubePlayerInitListener");
            throw null;
        }
    }

    @Override // p007c.p043b.p044a.p045a.p051b.YouTubePlayer
    /* JADX INFO: renamed from: b */
    public boolean mo1319b(YouTubePlayerListener youTubePlayerListener) {
        Intrinsics2.m13090f(youTubePlayerListener, "listener");
        return this.f1938g.remove(youTubePlayerListener);
    }

    @Override // p007c.p043b.p044a.p045a.p051b.YouTubePlayer
    /* JADX INFO: renamed from: c */
    public boolean mo1320c(YouTubePlayerListener youTubePlayerListener) {
        Intrinsics2.m13090f(youTubePlayerListener, "listener");
        return this.f1938g.add(youTubePlayerListener);
    }

    @Override // p007c.p043b.p044a.p045a.p051b.YouTubePlayer
    /* JADX INFO: renamed from: d */
    public void mo1321d(String str, float f2) {
        Intrinsics2.m13090f(str, "videoId");
        this.f1939h.post(new a(str, f2));
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f1938g.clear();
        this.f1939h.removeCallbacksAndMessages(null);
        super.destroy();
    }

    @Override // p007c.p043b.p044a.p045a.p051b.YouTubePlayer
    /* JADX INFO: renamed from: e */
    public void mo1322e(String str, float f2) {
        Intrinsics2.m13090f(str, "videoId");
        this.f1939h.post(new b(str, f2));
    }

    @Override // p007c.p043b.p044a.p045a.p051b.YouTubePlayerBridge.b
    public YouTubePlayer getInstance() {
        return this;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.YouTubePlayerBridge.b
    public Collection<YouTubePlayerListener> getListeners() {
        Collection<YouTubePlayerListener> collectionUnmodifiableCollection = Collections.unmodifiableCollection(new HashSet(this.f1938g));
        Intrinsics2.m13086b(collectionUnmodifiableCollection, "Collections.unmodifiable…(youTubePlayerListeners))");
        return collectionUnmodifiableCollection;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        if (this.f1940i && (i == 8 || i == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(i);
    }

    @Override // p007c.p043b.p044a.p045a.p051b.YouTubePlayer
    public void pause() {
        this.f1939h.post(new c());
    }

    @Override // p007c.p043b.p044a.p045a.p051b.YouTubePlayer
    public void seekTo(float f2) {
        this.f1939h.post(new e(f2));
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z) {
        this.f1940i = z;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.YouTubePlayer
    public void setVolume(int i) {
        if (!(i >= 0 && i <= 100)) {
            throw new IllegalArgumentException("Volume must be between 0 and 100".toString());
        }
        this.f1939h.post(new f(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewYouTubePlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13090f(context, "context");
        this.f1938g = new HashSet<>();
        this.f1939h = new Handler(Looper.getMainLooper());
    }
}
