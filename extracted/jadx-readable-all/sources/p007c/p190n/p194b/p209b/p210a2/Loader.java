package p007c.p190n.p194b.p209b.p210a2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Log;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.a2.b0, reason: use source file name */
/* JADX INFO: compiled from: Loader.java */
/* JADX INFO: loaded from: classes.dex */
public final class Loader implements LoaderErrorThrower {

    /* JADX INFO: renamed from: a */
    public static final c f5957a = m2895c(false, -9223372036854775807L);

    /* JADX INFO: renamed from: b */
    public static final c f5958b = new c(2, -9223372036854775807L, null);

    /* JADX INFO: renamed from: c */
    public static final c f5959c = new c(3, -9223372036854775807L, null);

    /* JADX INFO: renamed from: d */
    public final ExecutorService f5960d;

    /* JADX INFO: renamed from: e */
    public d<? extends e> f5961e;

    /* JADX INFO: renamed from: f */
    public IOException f5962f;

    /* JADX INFO: renamed from: c.n.b.b.a2.b0$b */
    /* JADX INFO: compiled from: Loader.java */
    public interface b<T extends e> {
        /* JADX INFO: renamed from: k */
        void mo2903k(T t, long j2, long j3, boolean z);

        /* JADX INFO: renamed from: l */
        void mo2904l(T t, long j2, long j3);

        /* JADX INFO: renamed from: t */
        c mo2905t(T t, long j2, long j3, IOException iOException, int i);
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.b0$c */
    /* JADX INFO: compiled from: Loader.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f5963a;

        /* JADX INFO: renamed from: b */
        public final long f5964b;

        public c(int i, long j2, a aVar) {
            this.f5963a = i;
            this.f5964b = j2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m2906a() {
            int i = this.f5963a;
            return i == 0 || i == 1;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.b0$d */
    /* JADX INFO: compiled from: Loader.java */
    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: f */
        public final int f5965f;

        /* JADX INFO: renamed from: g */
        public final T f5966g;

        /* JADX INFO: renamed from: h */
        public final long f5967h;

        /* JADX INFO: renamed from: i */
        public b<T> f5968i;

        /* JADX INFO: renamed from: j */
        public IOException f5969j;

        /* JADX INFO: renamed from: k */
        public int f5970k;

        /* JADX INFO: renamed from: l */
        public Thread f5971l;

        /* JADX INFO: renamed from: m */
        public boolean f5972m;

        /* JADX INFO: renamed from: n */
        public volatile boolean f5973n;

        public d(Looper looper, T t, b<T> bVar, int i, long j2) {
            super(looper);
            this.f5966g = t;
            this.f5968i = bVar;
            this.f5965f = i;
            this.f5967h = j2;
        }

        /* JADX INFO: renamed from: a */
        public void m2907a(boolean z) {
            this.f5973n = z;
            this.f5969j = null;
            if (hasMessages(0)) {
                this.f5972m = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f5972m = true;
                    this.f5966g.mo2910b();
                    Thread thread = this.f5971l;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                Loader.this.f5961e = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                b<T> bVar = this.f5968i;
                Objects.requireNonNull(bVar);
                bVar.mo2903k(this.f5966g, jElapsedRealtime, jElapsedRealtime - this.f5967h, true);
                this.f5968i = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public void m2908b(long j2) {
            C2096e.m4570f(Loader.this.f5961e == null);
            Loader loader = Loader.this;
            loader.f5961e = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                this.f5969j = null;
                loader.f5960d.execute(this);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f5973n) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.f5969j = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.f5960d;
                d<? extends e> dVar = loader.f5961e;
                Objects.requireNonNull(dVar);
                executorService.execute(dVar);
                return;
            }
            if (i == 3) {
                throw ((Error) message.obj);
            }
            Loader.this.f5961e = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = jElapsedRealtime - this.f5967h;
            b<T> bVar = this.f5968i;
            Objects.requireNonNull(bVar);
            if (this.f5972m) {
                bVar.mo2903k(this.f5966g, jElapsedRealtime, j2, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    bVar.mo2904l(this.f5966g, jElapsedRealtime, j2);
                    return;
                } catch (RuntimeException e) {
                    Log.m3154b("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.f5962f = new h(e);
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f5969j = iOException;
            int i3 = this.f5970k + 1;
            this.f5970k = i3;
            c cVarMo2905t = bVar.mo2905t(this.f5966g, jElapsedRealtime, j2, iOException, i3);
            int i4 = cVarMo2905t.f5963a;
            if (i4 == 3) {
                Loader.this.f5962f = this.f5969j;
            } else if (i4 != 2) {
                if (i4 == 1) {
                    this.f5970k = 1;
                }
                long jMin = cVarMo2905t.f5964b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.f5970k - 1) * CloseCodes.NORMAL_CLOSURE, 5000);
                }
                m2908b(jMin);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f5972m;
                    this.f5971l = Thread.currentThread();
                }
                if (z) {
                    C2096e.m4565a("load:" + this.f5966g.getClass().getSimpleName());
                    try {
                        this.f5966g.mo2909a();
                        C2096e.m4574j();
                    } catch (Throwable th) {
                        C2096e.m4574j();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f5971l = null;
                    Thread.interrupted();
                }
                if (this.f5973n) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.f5973n) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (Error e2) {
                Log.m3154b("LoadTask", "Unexpected error loading stream", e2);
                if (!this.f5973n) {
                    obtainMessage(3, e2).sendToTarget();
                }
                throw e2;
            } catch (Exception e3) {
                Log.m3154b("LoadTask", "Unexpected exception loading stream", e3);
                if (this.f5973n) {
                    return;
                }
                obtainMessage(2, new h(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                Log.m3154b("LoadTask", "OutOfMemory error loading stream", e4);
                if (this.f5973n) {
                    return;
                }
                obtainMessage(2, new h(e4)).sendToTarget();
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.b0$e */
    /* JADX INFO: compiled from: Loader.java */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo2909a() throws IOException;

        /* JADX INFO: renamed from: b */
        void mo2910b();
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.b0$f */
    /* JADX INFO: compiled from: Loader.java */
    public interface f {
        /* JADX INFO: renamed from: i */
        void mo2911i();
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.b0$g */
    /* JADX INFO: compiled from: Loader.java */
    public static final class g implements Runnable {

        /* JADX INFO: renamed from: f */
        public final f f5975f;

        public g(f fVar) {
            this.f5975f = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5975f.mo2911i();
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.b0$h */
    /* JADX INFO: compiled from: Loader.java */
    public static final class h extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        public h(Throwable th) {
            StringBuilder sbM1556G = outline.m1556G("Unexpected ");
            sbM1556G.append(th.getClass().getSimpleName());
            sbM1556G.append(": ");
            sbM1556G.append(th.getMessage());
            super(sbM1556G.toString(), th);
        }
    }

    public Loader(final String str) {
        int i = Util6.f6307a;
        this.f5960d = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: c.n.b.b.b2.e
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static c m2895c(boolean z, long j2) {
        return new c(z ? 1 : 0, j2, null);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.LoaderErrorThrower
    /* JADX INFO: renamed from: a */
    public void mo2896a() throws IOException {
        m2900f(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public void m2897b() {
        d<? extends e> dVar = this.f5961e;
        C2096e.m4572h(dVar);
        dVar.m2907a(false);
    }

    /* JADX INFO: renamed from: d */
    public boolean m2898d() {
        return this.f5962f != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m2899e() {
        return this.f5961e != null;
    }

    /* JADX INFO: renamed from: f */
    public void m2900f(int i) throws IOException {
        IOException iOException = this.f5962f;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f5961e;
        if (dVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = dVar.f5965f;
            }
            IOException iOException2 = dVar.f5969j;
            if (iOException2 != null && dVar.f5970k > i) {
                throw iOException2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2901g(f fVar) {
        d<? extends e> dVar = this.f5961e;
        if (dVar != null) {
            dVar.m2907a(true);
        }
        if (fVar != null) {
            this.f5960d.execute(new g(fVar));
        }
        this.f5960d.shutdown();
    }

    /* JADX INFO: renamed from: h */
    public <T extends e> long m2902h(T t, b<T> bVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        C2096e.m4572h(looperMyLooper);
        this.f5962f = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looperMyLooper, t, bVar, i, jElapsedRealtime).m2908b(0L);
        return jElapsedRealtime;
    }
}
