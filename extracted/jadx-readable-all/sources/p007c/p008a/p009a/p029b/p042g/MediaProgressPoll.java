package p007c.p008a.p009a.p029b.p042g;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import p007c.p008a.p009a.p029b.p030a.MediaPlayerApi;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p038c.MediaProgress;
import p007c.p008a.p009a.p029b.p039d.ProgressListener;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.b.g.a, reason: use source file name */
/* JADX INFO: compiled from: MediaProgressPoll.kt */
/* JADX INFO: loaded from: classes.dex */
public class MediaProgressPoll<I extends PlaylistItem> {

    /* JADX INFO: renamed from: a */
    public static final String f1792a;

    /* JADX INFO: renamed from: b */
    public Repeater2 f1793b = new Repeater2(false, 1, null);

    /* JADX INFO: renamed from: c */
    public StopWatch2 f1794c = new StopWatch2(false, 1, null);

    /* JADX INFO: renamed from: d */
    public final MediaProgress f1795d = new MediaProgress(0, 0, 0);

    /* JADX INFO: renamed from: e */
    public ProgressListener f1796e;

    /* JADX INFO: renamed from: f */
    public MediaPlayerApi<I> f1797f;

    /* JADX INFO: renamed from: c.a.a.b.g.a$a */
    /* JADX INFO: compiled from: MediaProgressPoll.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.b.g.a$b */
    /* JADX INFO: compiled from: MediaProgressPoll.kt */
    public final class b implements Repeater2.c {
        public b() {
        }

        @Override // p007c.p008a.p009a.p029b.p042g.Repeater2.c
        /* JADX INFO: renamed from: a */
        public void mo1289a() {
            MediaProgressPoll mediaProgressPoll = MediaProgressPoll.this;
            MediaProgress mediaProgress = mediaProgressPoll.f1795d;
            MediaPlayerApi<I> mediaPlayerApi = mediaProgressPoll.f1797f;
            long currentPosition = mediaPlayerApi != null ? mediaPlayerApi.getCurrentPosition() : 0L;
            MediaPlayerApi<I> mediaPlayerApi2 = MediaProgressPoll.this.f1797f;
            int bufferedPercent = mediaPlayerApi2 != null ? mediaPlayerApi2.getBufferedPercent() : 0;
            MediaPlayerApi<I> mediaPlayerApi3 = MediaProgressPoll.this.f1797f;
            mediaProgress.m1267b(currentPosition, bufferedPercent, mediaPlayerApi3 != null ? mediaPlayerApi3.getDuration() : 0L);
            MediaProgressPoll mediaProgressPoll2 = MediaProgressPoll.this;
            ProgressListener progressListener = mediaProgressPoll2.f1796e;
            if (progressListener != null) {
                progressListener.mo1250k(mediaProgressPoll2.f1795d);
                return;
            }
            Repeater2 repeater2 = mediaProgressPoll2.f1793b;
            HandlerThread handlerThread = repeater2.f1804f;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            repeater2.f1801c = false;
            Log.w(MediaProgressPoll.f1792a, "Stopping due to no listeners");
        }
    }

    static {
        new a(null);
        f1792a = "MediaProgressPoll";
    }

    public MediaProgressPoll() {
        this.f1793b.f1805g = new b();
    }

    /* JADX INFO: renamed from: a */
    public final void m1286a() {
        m1288c();
        StopWatch2 stopWatch2 = this.f1794c;
        stopWatch2.f1819i = 0L;
        stopWatch2.f1820j = 0L;
        stopWatch2.f1818h = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public final void m1287b() {
        if (this.f1796e == null) {
            Log.w(f1792a, "Not started due to no progress listener specified");
            return;
        }
        Repeater2 repeater2 = this.f1793b;
        if (repeater2.f1801c) {
            return;
        }
        repeater2.f1801c = true;
        if (repeater2.f1803e == null) {
            HandlerThread handlerThread = new HandlerThread(Repeater2.f1799a);
            repeater2.f1804f = handlerThread;
            handlerThread.start();
            HandlerThread handlerThread2 = repeater2.f1804f;
            if (handlerThread2 == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            repeater2.f1803e = new Handler(handlerThread2.getLooper());
        }
        Repeater2 repeater3 = Repeater2.this;
        Handler handler = repeater3.f1803e;
        if (handler != null) {
            handler.postDelayed(repeater3.f1806h, repeater3.f1802d);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1288c() {
        Repeater2 repeater2 = this.f1793b;
        HandlerThread handlerThread = repeater2.f1804f;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        repeater2.f1801c = false;
        StopWatch2 stopWatch2 = this.f1794c;
        if (stopWatch2.f1813c) {
            Handler handler = stopWatch2.f1815e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread2 = stopWatch2.f1816f;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            stopWatch2.f1813c = false;
            stopWatch2.f1819i = 0L;
            stopWatch2.f1820j = (System.currentTimeMillis() - stopWatch2.f1818h) + stopWatch2.f1820j;
        }
    }
}
