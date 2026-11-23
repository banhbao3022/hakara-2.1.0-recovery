package p524h1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.b, reason: use source file name */
/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTimeout extends Timeout2 {

    /* JADX INFO: renamed from: e */
    public static final long f30694e;

    /* JADX INFO: renamed from: f */
    public static final long f30695f;

    /* JADX INFO: renamed from: g */
    public static AsyncTimeout f30696g;

    /* JADX INFO: renamed from: h */
    public static final a f30697h = new a(null);

    /* JADX INFO: renamed from: i */
    public boolean f30698i;

    /* JADX INFO: renamed from: j */
    public AsyncTimeout f30699j;

    /* JADX INFO: renamed from: k */
    public long f30700k;

    /* JADX INFO: renamed from: h1.b$a */
    /* JADX INFO: compiled from: AsyncTimeout.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final AsyncTimeout m13705a() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.f30696g;
            if (asyncTimeout == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            AsyncTimeout asyncTimeout2 = asyncTimeout.f30699j;
            if (asyncTimeout2 == null) {
                long jNanoTime = System.nanoTime();
                AsyncTimeout.class.wait(AsyncTimeout.f30694e);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.f30696g;
                if (asyncTimeout3 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                if (asyncTimeout3.f30699j != null || System.nanoTime() - jNanoTime < AsyncTimeout.f30695f) {
                    return null;
                }
                return AsyncTimeout.f30696g;
            }
            long jNanoTime2 = asyncTimeout2.f30700k - System.nanoTime();
            if (jNanoTime2 > 0) {
                long j2 = jNanoTime2 / 1000000;
                AsyncTimeout.class.wait(j2, (int) (jNanoTime2 - (1000000 * j2)));
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.f30696g;
            if (asyncTimeout4 == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            asyncTimeout4.f30699j = asyncTimeout2.f30699j;
            asyncTimeout2.f30699j = null;
            return asyncTimeout2;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: h1.b$b */
    /* JADX INFO: compiled from: AsyncTimeout.kt */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncTimeout asyncTimeoutM13705a;
            while (true) {
                try {
                    synchronized (AsyncTimeout.class) {
                        asyncTimeoutM13705a = AsyncTimeout.f30697h.m13705a();
                        if (asyncTimeoutM13705a == AsyncTimeout.f30696g) {
                            AsyncTimeout.f30696g = null;
                            return;
                        }
                    }
                    if (asyncTimeoutM13705a != null) {
                        asyncTimeoutM13705a.mo13453k();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f30694e = millis;
        f30695f = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: h */
    public final void m13703h() {
        AsyncTimeout asyncTimeout;
        if (!(!this.f30698i)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long j2 = this.f30693d;
        boolean z = this.f30691b;
        if (j2 != 0 || z) {
            this.f30698i = true;
            Objects.requireNonNull(f30697h);
            synchronized (AsyncTimeout.class) {
                if (f30696g == null) {
                    f30696g = new AsyncTimeout();
                    new b().start();
                }
                long jNanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    this.f30700k = Math.min(j2, mo13698c() - jNanoTime) + jNanoTime;
                } else if (j2 != 0) {
                    this.f30700k = j2 + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.f30700k = mo13698c();
                }
                long j3 = this.f30700k - jNanoTime;
                AsyncTimeout asyncTimeout2 = f30696g;
                if (asyncTimeout2 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                while (true) {
                    asyncTimeout = asyncTimeout2.f30699j;
                    if (asyncTimeout == null || j3 < asyncTimeout.f30700k - jNanoTime) {
                        break;
                        break;
                    }
                    asyncTimeout2 = asyncTimeout;
                }
                this.f30699j = asyncTimeout;
                asyncTimeout2.f30699j = this;
                if (asyncTimeout2 == f30696g) {
                    AsyncTimeout.class.notify();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m13704i() {
        boolean z = false;
        if (!this.f30698i) {
            return false;
        }
        this.f30698i = false;
        Objects.requireNonNull(f30697h);
        synchronized (AsyncTimeout.class) {
            AsyncTimeout asyncTimeout = f30696g;
            while (asyncTimeout != null) {
                AsyncTimeout asyncTimeout2 = asyncTimeout.f30699j;
                if (asyncTimeout2 == this) {
                    asyncTimeout.f30699j = this.f30699j;
                    this.f30699j = null;
                } else {
                    asyncTimeout = asyncTimeout2;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public IOException mo13563j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: k */
    public void mo13453k() {
    }
}
