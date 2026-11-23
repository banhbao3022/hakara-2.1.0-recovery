package p636z0.p667e.p676b.p677v1;

import android.util.Log;
import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p667e.p676b.Logger8;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.ImmediateFuture;
import p636z0.p686f.C7944a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;

/* JADX INFO: renamed from: z0.e.b.v1.l0, reason: use source file name */
/* JADX INFO: compiled from: DeferrableSurface.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class DeferrableSurface {

    /* JADX INFO: renamed from: a */
    public static final boolean f36198a = Logger8.m15274c("DeferrableSurface");

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f36199b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public static final AtomicInteger f36200c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    public final Object f36201d = new Object();

    /* JADX INFO: renamed from: e */
    public int f36202e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f36203f = false;

    /* JADX INFO: renamed from: g */
    public CallbackToFutureAdapter<Void> f36204g;

    /* JADX INFO: renamed from: h */
    public final ListenableFuture<Void> f36205h;

    /* JADX INFO: renamed from: z0.e.b.v1.l0$a */
    /* JADX INFO: compiled from: DeferrableSurface.java */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: f */
        public DeferrableSurface f36206f;

        public a(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.f36206f = deferrableSurface;
        }
    }

    public DeferrableSurface() {
        ListenableFuture<Void> listenableFutureM15540a = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.b.v1.d
            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
            /* JADX INFO: renamed from: a */
            public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter) {
                DeferrableSurface deferrableSurface = this.f36122a;
                synchronized (deferrableSurface.f36201d) {
                    deferrableSurface.f36204g = callbackToFutureAdapter;
                }
                return "DeferrableSurface-termination(" + deferrableSurface + ")";
            }
        });
        this.f36205h = listenableFutureM15540a;
        if (Logger8.m15274c("DeferrableSurface")) {
            m15393f("Surface created", f36200c.incrementAndGet(), f36199b.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            listenableFutureM15540a.mo11664h(new Runnable() { // from class: z0.e.b.v1.c
                @Override // java.lang.Runnable
                public final void run() {
                    DeferrableSurface deferrableSurface = this.f36112f;
                    String str = stackTraceString;
                    Objects.requireNonNull(deferrableSurface);
                    try {
                        deferrableSurface.f36205h.get();
                        deferrableSurface.m15393f("Surface terminated", DeferrableSurface.f36200c.decrementAndGet(), DeferrableSurface.f36199b.get());
                    } catch (Exception e) {
                        Logger8.m15273b("DeferrableSurface", "Unexpected surface termination for " + deferrableSurface + "\nStack Trace:\n" + str, null);
                        synchronized (deferrableSurface.f36201d) {
                            throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.f36203f), Integer.valueOf(deferrableSurface.f36202e)), e);
                        }
                    }
                }
            }, C7462a.m14569f());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15388a() {
        CallbackToFutureAdapter<Void> callbackToFutureAdapter;
        synchronized (this.f36201d) {
            if (this.f36203f) {
                callbackToFutureAdapter = null;
            } else {
                this.f36203f = true;
                if (this.f36202e == 0) {
                    callbackToFutureAdapter = this.f36204g;
                    this.f36204g = null;
                } else {
                    callbackToFutureAdapter = null;
                }
                if (Logger8.m15274c("DeferrableSurface")) {
                    Logger8.m15272a("DeferrableSurface", "surface closed,  useCount=" + this.f36202e + " closed=true " + this, null);
                }
            }
        }
        if (callbackToFutureAdapter != null) {
            callbackToFutureAdapter.m15659a(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15389b() {
        CallbackToFutureAdapter<Void> callbackToFutureAdapter;
        synchronized (this.f36201d) {
            int i = this.f36202e;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i2 = i - 1;
            this.f36202e = i2;
            if (i2 == 0 && this.f36203f) {
                callbackToFutureAdapter = this.f36204g;
                this.f36204g = null;
            } else {
                callbackToFutureAdapter = null;
            }
            if (Logger8.m15274c("DeferrableSurface")) {
                Logger8.m15272a("DeferrableSurface", "use count-1,  useCount=" + this.f36202e + " closed=" + this.f36203f + " " + this, null);
                if (this.f36202e == 0) {
                    m15393f("Surface no longer in use", f36200c.get(), f36199b.decrementAndGet());
                }
            }
        }
        if (callbackToFutureAdapter != null) {
            callbackToFutureAdapter.m15659a(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final ListenableFuture<Surface> m15390c() {
        synchronized (this.f36201d) {
            if (this.f36203f) {
                return new ImmediateFuture.a(new a("DeferrableSurface already closed.", this));
            }
            return mo15288g();
        }
    }

    /* JADX INFO: renamed from: d */
    public ListenableFuture<Void> m15391d() {
        return Futures2.m15429d(this.f36205h);
    }

    /* JADX INFO: renamed from: e */
    public void m15392e() throws a {
        synchronized (this.f36201d) {
            int i = this.f36202e;
            if (i == 0 && this.f36203f) {
                throw new a("Cannot begin use on a closed surface.", this);
            }
            this.f36202e = i + 1;
            if (Logger8.m15274c("DeferrableSurface")) {
                if (this.f36202e == 1) {
                    m15393f("New surface in use", f36200c.get(), f36199b.incrementAndGet());
                }
                Logger8.m15272a("DeferrableSurface", "use count+1, useCount=" + this.f36202e + " " + this, null);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15393f(String str, int i, int i2) {
        if (!f36198a && Logger8.m15274c("DeferrableSurface")) {
            Logger8.m15272a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.", null);
        }
        Logger8.m15272a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}", null);
    }

    /* JADX INFO: renamed from: g */
    public abstract ListenableFuture<Surface> mo15288g();
}
