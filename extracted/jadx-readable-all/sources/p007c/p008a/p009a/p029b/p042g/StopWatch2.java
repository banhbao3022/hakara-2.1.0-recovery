package p007c.p008a.p009a.p029b.p042g;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Objects;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.b.g.e, reason: use source file name */
/* JADX INFO: compiled from: StopWatch.kt */
/* JADX INFO: loaded from: classes.dex */
public final class StopWatch2 {

    /* JADX INFO: renamed from: a */
    public static final String f1811a;

    /* JADX INFO: renamed from: b */
    public static final int f1812b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f1813c;

    /* JADX INFO: renamed from: d */
    public int f1814d;

    /* JADX INFO: renamed from: e */
    public Handler f1815e;

    /* JADX INFO: renamed from: f */
    public HandlerThread f1816f;

    /* JADX INFO: renamed from: g */
    public final b f1817g;

    /* JADX INFO: renamed from: h */
    public long f1818h;

    /* JADX INFO: renamed from: i */
    public long f1819i;

    /* JADX INFO: renamed from: j */
    public long f1820j;

    /* JADX INFO: renamed from: c.a.a.b.g.e$a */
    /* JADX INFO: compiled from: StopWatch.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.b.g.e$b */
    /* JADX INFO: compiled from: StopWatch.kt */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StopWatch2 stopWatch2;
            Handler handler;
            StopWatch2 stopWatch3 = StopWatch2.this;
            long jCurrentTimeMillis = System.currentTimeMillis();
            StopWatch2 stopWatch4 = StopWatch2.this;
            stopWatch3.f1819i = jCurrentTimeMillis - stopWatch4.f1818h;
            if (stopWatch4.f1813c && (handler = (stopWatch2 = StopWatch2.this).f1815e) != null) {
                handler.postDelayed(stopWatch2.f1817g, stopWatch2.f1814d);
            }
            Objects.requireNonNull(StopWatch2.this);
        }
    }

    static {
        new a(null);
        f1811a = "StopWatch_HandlerThread";
        f1812b = 33;
    }

    public StopWatch2() {
        this(false, 1, null);
    }

    public /* synthetic */ StopWatch2(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public StopWatch2(boolean z) {
        this.f1814d = f1812b;
        this.f1817g = new b();
        if (z) {
            this.f1815e = new Handler();
        }
    }

    public StopWatch2(Handler handler) {
        Intrinsics2.m13090f(handler, "handler");
        this.f1814d = f1812b;
        this.f1817g = new b();
        this.f1815e = handler;
    }
}
