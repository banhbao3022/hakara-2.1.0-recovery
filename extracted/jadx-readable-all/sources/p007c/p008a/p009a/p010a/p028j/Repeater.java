package p007c.p008a.p009a.p010a.p028j;

import android.os.Handler;
import android.os.HandlerThread;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c.a.a.a.j.b, reason: use source file name */
/* JADX INFO: compiled from: Repeater.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Repeater {

    /* JADX INFO: renamed from: a */
    public volatile boolean f1664a;

    /* JADX INFO: renamed from: b */
    public int f1665b;

    /* JADX INFO: renamed from: c */
    public Handler f1666c;

    /* JADX INFO: renamed from: d */
    public final Lazy3 f1667d;

    /* JADX INFO: renamed from: e */
    public boolean f1668e;

    /* JADX INFO: renamed from: f */
    public InterfaceC6153a<Unit> f1669f;

    /* JADX INFO: renamed from: g */
    public b f1670g;

    /* JADX INFO: renamed from: c.a.a.a.j.b$a */
    /* JADX INFO: compiled from: Repeater.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.j.b$b */
    /* JADX INFO: compiled from: Repeater.kt */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Repeater repeater;
            Handler handler;
            InterfaceC6153a<Unit> interfaceC6153a = Repeater.this.f1669f;
            if (interfaceC6153a != null) {
                interfaceC6153a.mo2c();
            }
            if (!Repeater.this.f1664a || (handler = (repeater = Repeater.this).f1666c) == null) {
                return;
            }
            handler.postDelayed(repeater.f1670g, repeater.f1665b);
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.j.b$c */
    /* JADX INFO: compiled from: Repeater.kt */
    public static final class c extends Lambda implements InterfaceC6153a<HandlerThread> {

        /* JADX INFO: renamed from: g */
        public static final c f1672g = new c();

        public c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public HandlerThread mo2c() {
            return new HandlerThread("ExoMedia_Repeater_HandlerThread");
        }
    }

    static {
        new a(null);
    }

    public Repeater() {
        this(false, 1, null);
    }

    public /* synthetic */ Repeater(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: a */
    public final HandlerThread m1212a() {
        return (HandlerThread) this.f1667d.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m1213b() {
        if (this.f1664a) {
            return;
        }
        this.f1664a = true;
        if (this.f1668e) {
            m1212a().start();
            this.f1666c = new Handler(m1212a().getLooper());
        }
        Repeater repeater = Repeater.this;
        Handler handler = repeater.f1666c;
        if (handler != null) {
            handler.postDelayed(repeater.f1670g, repeater.f1665b);
        }
    }

    public Repeater(boolean z) {
        this.f1665b = 33;
        this.f1667d = LazyJVM.m13021b(c.f1672g);
        this.f1670g = new b();
        if (z) {
            this.f1666c = new Handler();
        } else {
            this.f1668e = true;
        }
    }

    public Repeater(Handler handler) {
        Intrinsics2.m13089e(handler, "handler");
        this.f1665b = 33;
        this.f1667d = LazyJVM.m13021b(c.f1672g);
        this.f1670g = new b();
        this.f1666c = handler;
    }
}
