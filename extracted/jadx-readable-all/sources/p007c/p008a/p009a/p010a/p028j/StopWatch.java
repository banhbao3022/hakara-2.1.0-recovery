package p007c.p008a.p009a.p010a.p028j;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Objects;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c.a.a.a.j.c, reason: use source file name */
/* JADX INFO: compiled from: StopWatch.kt */
/* JADX INFO: loaded from: classes.dex */
public final class StopWatch {

    /* JADX INFO: renamed from: a */
    public int f1673a;

    /* JADX INFO: renamed from: b */
    public Handler f1674b;

    /* JADX INFO: renamed from: c */
    public final Lazy3 f1675c;

    /* JADX INFO: renamed from: d */
    public b f1676d;

    /* JADX INFO: renamed from: e */
    public long f1677e;

    /* JADX INFO: renamed from: f */
    public long f1678f;

    /* JADX INFO: renamed from: g */
    public float f1679g;

    /* JADX INFO: renamed from: c.a.a.a.j.c$a */
    /* JADX INFO: compiled from: StopWatch.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.j.c$b */
    /* JADX INFO: compiled from: StopWatch.kt */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: f */
        public long f1680f;

        /* JADX INFO: renamed from: g */
        public long f1681g = -1;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1681g == -1) {
                Objects.requireNonNull(StopWatch.this);
                this.f1681g = 0L;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f1680f = jCurrentTimeMillis;
            StopWatch stopWatch = StopWatch.this;
            stopWatch.f1677e += (long) ((jCurrentTimeMillis - this.f1681g) * stopWatch.f1679g);
            this.f1681g = jCurrentTimeMillis;
            Objects.requireNonNull(stopWatch);
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.j.c$c */
    /* JADX INFO: compiled from: StopWatch.kt */
    public static final class c extends Lambda implements InterfaceC6153a<HandlerThread> {

        /* JADX INFO: renamed from: g */
        public static final c f1683g = new c();

        public c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public HandlerThread mo2c() {
            return new HandlerThread("ExoMedia_StopWatch_HandlerThread");
        }
    }

    static {
        new a(null);
    }

    public StopWatch() {
        this(false, 1, null);
    }

    public /* synthetic */ StopWatch(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public StopWatch(boolean z) {
        this.f1673a = 33;
        this.f1675c = LazyJVM.m13021b(c.f1683g);
        this.f1676d = new b();
        this.f1679g = 1.0f;
        if (z) {
            this.f1674b = new Handler();
        }
    }

    public StopWatch(Handler handler) {
        Intrinsics2.m13089e(handler, "handler");
        this.f1673a = 33;
        this.f1675c = LazyJVM.m13021b(c.f1683g);
        this.f1676d = new b();
        this.f1679g = 1.0f;
        this.f1674b = handler;
    }
}
