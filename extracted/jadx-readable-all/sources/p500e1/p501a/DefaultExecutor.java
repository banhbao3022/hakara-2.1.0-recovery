package p500e1.p501a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p477d1.p478a0._Ranges;

/* JADX INFO: renamed from: e1.a.e0, reason: use source file name */
/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultExecutor extends AbstractC6293p0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: m */
    public static final long f29738m;

    /* JADX INFO: renamed from: n */
    public static final DefaultExecutor f29739n;

    static {
        Long l;
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        f29739n = defaultExecutor;
        defaultExecutor.m13277K0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f29738m = timeUnit.toNanos(l.longValue());
    }

    @Override // p500e1.p501a.EventLoop2
    /* JADX INFO: renamed from: O0 */
    public Thread mo13210O0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    /* JADX INFO: renamed from: U0 */
    public final synchronized void m13211U0() {
        if (m13212V0()) {
            debugStatus = 3;
            m13287S0();
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m13212V0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        C6312v1 c6312v1 = C6312v1.f29813b;
        C6312v1.f29812a.set(this);
        try {
            synchronized (this) {
                if (m13212V0()) {
                    z = false;
                } else {
                    z = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (!z) {
                _thread = null;
                m13211U0();
                if (m13286R0()) {
                    return;
                }
                mo13210O0();
                return;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo13279M0 = mo13279M0();
                if (jMo13279M0 == Long.MAX_VALUE) {
                    long jNanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = f29738m + jNanoTime;
                    }
                    long j3 = j2 - jNanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        m13211U0();
                        if (m13286R0()) {
                            return;
                        }
                        mo13210O0();
                        return;
                    }
                    jMo13279M0 = _Ranges.m12966a(jMo13279M0, j3);
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (jMo13279M0 > 0) {
                    if (m13212V0()) {
                        _thread = null;
                        m13211U0();
                        if (m13286R0()) {
                            return;
                        }
                        mo13210O0();
                        return;
                    }
                    LockSupport.parkNanos(this, jMo13279M0);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m13211U0();
            if (!m13286R0()) {
                mo13210O0();
            }
            throw th;
        }
    }
}
