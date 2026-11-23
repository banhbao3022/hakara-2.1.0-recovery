package p007c.p043b.p044a.p045a.p051b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import java.util.Collection;
import java.util.Iterator;
import p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.b.a.a.b.g, reason: use source file name */
/* JADX INFO: compiled from: YouTubePlayerBridge.kt */
/* JADX INFO: loaded from: classes.dex */
public final class YouTubePlayerBridge {

    /* JADX INFO: renamed from: a */
    public final Handler f1911a;

    /* JADX INFO: renamed from: b */
    public final b f1912b;

    /* JADX INFO: renamed from: c.b.a.a.b.g$a */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.g$b */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo1323a();

        YouTubePlayer getInstance();

        Collection<YouTubePlayerListener> getListeners();
    }

    /* JADX INFO: renamed from: c.b.a.a.b.g$c */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<YouTubePlayerListener> it = YouTubePlayerBridge.this.f1912b.getListeners().iterator();
            while (it.hasNext()) {
                it.next().mo1294d(YouTubePlayerBridge.this.f1912b.getInstance());
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.g$d */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public static final class d implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ PlayerConstants3 f1915g;

        public d(PlayerConstants3 playerConstants3) {
            this.f1915g = playerConstants3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<YouTubePlayerListener> it = YouTubePlayerBridge.this.f1912b.getListeners().iterator();
            while (it.hasNext()) {
                it.next().mo1309s(YouTubePlayerBridge.this.f1912b.getInstance(), this.f1915g);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.g$e */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ PlayerConstants f1917g;

        public e(PlayerConstants playerConstants) {
            this.f1917g = playerConstants;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<YouTubePlayerListener> it = YouTubePlayerBridge.this.f1912b.getListeners().iterator();
            while (it.hasNext()) {
                it.next().mo1301k(YouTubePlayerBridge.this.f1912b.getInstance(), this.f1917g);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.g$f */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public static final class f implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ PlayerConstants2 f1919g;

        public f(PlayerConstants2 playerConstants2) {
            this.f1919g = playerConstants2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<YouTubePlayerListener> it = YouTubePlayerBridge.this.f1912b.getListeners().iterator();
            while (it.hasNext()) {
                it.next().mo1293c(YouTubePlayerBridge.this.f1912b.getInstance(), this.f1919g);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.g$g */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public static final class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<YouTubePlayerListener> it = YouTubePlayerBridge.this.f1912b.getListeners().iterator();
            while (it.hasNext()) {
                it.next().mo1298h(YouTubePlayerBridge.this.f1912b.getInstance());
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.g$h */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public static final class h implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ PlayerConstants4 f1922g;

        public h(PlayerConstants4 playerConstants4) {
            this.f1922g = playerConstants4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<YouTubePlayerListener> it = YouTubePlayerBridge.this.f1912b.getListeners().iterator();
            while (it.hasNext()) {
                it.next().mo1297g(YouTubePlayerBridge.this.f1912b.getInstance(), this.f1922g);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.g$i */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public static final class i implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float f1924g;

        public i(float f) {
            this.f1924g = f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<YouTubePlayerListener> it = YouTubePlayerBridge.this.f1912b.getListeners().iterator();
            while (it.hasNext()) {
                it.next().mo1291a(YouTubePlayerBridge.this.f1912b.getInstance(), this.f1924g);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.g$j */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public static final class j implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float f1926g;

        public j(float f) {
            this.f1926g = f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<YouTubePlayerListener> it = YouTubePlayerBridge.this.f1912b.getListeners().iterator();
            while (it.hasNext()) {
                it.next().mo1311u(YouTubePlayerBridge.this.f1912b.getInstance(), this.f1926g);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.g$k */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public static final class k implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f1928g;

        public k(String str) {
            this.f1928g = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<YouTubePlayerListener> it = YouTubePlayerBridge.this.f1912b.getListeners().iterator();
            while (it.hasNext()) {
                it.next().mo1296f(YouTubePlayerBridge.this.f1912b.getInstance(), this.f1928g);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.g$l */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public static final class l implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float f1930g;

        public l(float f) {
            this.f1930g = f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<YouTubePlayerListener> it = YouTubePlayerBridge.this.f1912b.getListeners().iterator();
            while (it.hasNext()) {
                it.next().mo1307q(YouTubePlayerBridge.this.f1912b.getInstance(), this.f1930g);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.g$m */
    /* JADX INFO: compiled from: YouTubePlayerBridge.kt */
    public static final class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            YouTubePlayerBridge.this.f1912b.mo1323a();
        }
    }

    static {
        new a(null);
    }

    public YouTubePlayerBridge(b bVar) {
        Intrinsics2.m13090f(bVar, "youTubePlayerOwner");
        this.f1912b = bVar;
        this.f1911a = new Handler(Looper.getMainLooper());
    }

    @JavascriptInterface
    public final void sendApiChange() {
        this.f1911a.post(new c());
    }

    @JavascriptInterface
    public final void sendError(String str) {
        Intrinsics2.m13090f(str, "error");
        PlayerConstants3 playerConstants3 = PlayerConstants3.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER;
        if (StringsJVM.m12989f(str, "2", true)) {
            playerConstants3 = PlayerConstants3.INVALID_PARAMETER_IN_REQUEST;
        } else if (StringsJVM.m12989f(str, "5", true)) {
            playerConstants3 = PlayerConstants3.HTML_5_PLAYER;
        } else if (StringsJVM.m12989f(str, "100", true)) {
            playerConstants3 = PlayerConstants3.VIDEO_NOT_FOUND;
        } else if (!StringsJVM.m12989f(str, "101", true) && !StringsJVM.m12989f(str, "150", true)) {
            playerConstants3 = PlayerConstants3.UNKNOWN;
        }
        this.f1911a.post(new d(playerConstants3));
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(String str) {
        PlayerConstants playerConstants;
        Intrinsics2.m13090f(str, "quality");
        if (StringsJVM.m12989f(str, "small", true)) {
            playerConstants = PlayerConstants.SMALL;
        } else if (StringsJVM.m12989f(str, "medium", true)) {
            playerConstants = PlayerConstants.MEDIUM;
        } else if (StringsJVM.m12989f(str, "large", true)) {
            playerConstants = PlayerConstants.LARGE;
        } else if (StringsJVM.m12989f(str, "hd720", true)) {
            playerConstants = PlayerConstants.HD720;
        } else if (StringsJVM.m12989f(str, "hd1080", true)) {
            playerConstants = PlayerConstants.HD1080;
        } else if (StringsJVM.m12989f(str, "highres", true)) {
            playerConstants = PlayerConstants.HIGH_RES;
        } else {
            playerConstants = StringsJVM.m12989f(str, "default", true) ? PlayerConstants.DEFAULT : PlayerConstants.UNKNOWN;
        }
        this.f1911a.post(new e(playerConstants));
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(String str) {
        PlayerConstants2 playerConstants2;
        Intrinsics2.m13090f(str, "rate");
        if (StringsJVM.m12989f(str, "0.25", true)) {
            playerConstants2 = PlayerConstants2.RATE_0_25;
        } else if (StringsJVM.m12989f(str, "0.5", true)) {
            playerConstants2 = PlayerConstants2.RATE_0_5;
        } else if (StringsJVM.m12989f(str, "1", true)) {
            playerConstants2 = PlayerConstants2.RATE_1;
        } else if (StringsJVM.m12989f(str, "1.5", true)) {
            playerConstants2 = PlayerConstants2.RATE_1_5;
        } else {
            playerConstants2 = StringsJVM.m12989f(str, "2", true) ? PlayerConstants2.RATE_2 : PlayerConstants2.UNKNOWN;
        }
        this.f1911a.post(new f(playerConstants2));
    }

    @JavascriptInterface
    public final void sendReady() {
        this.f1911a.post(new g());
    }

    @JavascriptInterface
    public final void sendStateChange(String str) {
        PlayerConstants4 playerConstants4;
        Intrinsics2.m13090f(str, "state");
        if (StringsJVM.m12989f(str, "UNSTARTED", true)) {
            playerConstants4 = PlayerConstants4.UNSTARTED;
        } else if (StringsJVM.m12989f(str, "ENDED", true)) {
            playerConstants4 = PlayerConstants4.ENDED;
        } else if (StringsJVM.m12989f(str, "PLAYING", true)) {
            playerConstants4 = PlayerConstants4.PLAYING;
        } else if (StringsJVM.m12989f(str, "PAUSED", true)) {
            playerConstants4 = PlayerConstants4.PAUSED;
        } else if (StringsJVM.m12989f(str, "BUFFERING", true)) {
            playerConstants4 = PlayerConstants4.BUFFERING;
        } else {
            playerConstants4 = StringsJVM.m12989f(str, "CUED", true) ? PlayerConstants4.VIDEO_CUED : PlayerConstants4.UNKNOWN;
        }
        this.f1911a.post(new h(playerConstants4));
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(String str) {
        Intrinsics2.m13090f(str, "seconds");
        try {
            this.f1911a.post(new i(Float.parseFloat(str)));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(String str) {
        Intrinsics2.m13090f(str, "seconds");
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.f1911a.post(new j(Float.parseFloat(str)));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoId(String str) {
        Intrinsics2.m13090f(str, "videoId");
        this.f1911a.post(new k(str));
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(String str) {
        Intrinsics2.m13090f(str, "fraction");
        try {
            this.f1911a.post(new l(Float.parseFloat(str)));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.f1911a.post(new m());
    }
}
