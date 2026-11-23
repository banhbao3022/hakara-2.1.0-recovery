package p007c.p008a.p009a.p029b.p042g;

import android.os.Handler;
import android.os.HandlerThread;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.b.g.b, reason: use source file name */
/* JADX INFO: compiled from: Repeater.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Repeater2 {

    /* JADX INFO: renamed from: a */
    public static final String f1799a;

    /* JADX INFO: renamed from: b */
    public static final int f1800b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f1801c;

    /* JADX INFO: renamed from: d */
    public int f1802d;

    /* JADX INFO: renamed from: e */
    public Handler f1803e;

    /* JADX INFO: renamed from: f */
    public HandlerThread f1804f;

    /* JADX INFO: renamed from: g */
    public c f1805g;

    /* JADX INFO: renamed from: h */
    public final b f1806h;

    /* JADX INFO: renamed from: c.a.a.b.g.b$a */
    /* JADX INFO: compiled from: Repeater.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.b.g.b$b */
    /* JADX INFO: compiled from: Repeater.kt */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Repeater2 repeater2;
            Handler handler;
            c cVar = Repeater2.this.f1805g;
            if (cVar != null) {
                cVar.mo1289a();
            }
            if (!Repeater2.this.f1801c || (handler = (repeater2 = Repeater2.this).f1803e) == null) {
                return;
            }
            handler.postDelayed(repeater2.f1806h, repeater2.f1802d);
        }
    }

    /* JADX INFO: renamed from: c.a.a.b.g.b$c */
    /* JADX INFO: compiled from: Repeater.kt */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo1289a();
    }

    static {
        new a(null);
        f1799a = "Repeater_HandlerThread";
        f1800b = 33;
    }

    public Repeater2() {
        this(false, 1, null);
    }

    public /* synthetic */ Repeater2(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public Repeater2(boolean z) {
        this.f1802d = f1800b;
        this.f1806h = new b();
        if (z) {
            this.f1803e = new Handler();
        }
    }

    public Repeater2(Handler handler) {
        Intrinsics2.m13090f(handler, "handler");
        this.f1802d = f1800b;
        this.f1806h = new b();
        this.f1803e = handler;
    }
}
