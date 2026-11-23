package p500e1.p501a;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p000.ServiceLoader;
import p477d1.Exceptions;
import p477d1.p480c0.Sequences3;
import p477d1.p480c0._Sequences;
import p477d1.p485u.CoroutineContext;

/* JADX INFO: renamed from: e1.a.b0, reason: use source file name */
/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineExceptionHandlerImpl {

    /* JADX INFO: renamed from: a */
    public static final List<CoroutineExceptionHandler> f29623a = _Sequences.m12977b(Sequences3.m12976a(ServiceLoader.m0a()));

    /* JADX INFO: renamed from: a */
    public static final void m13121a(CoroutineContext coroutineContext, Throwable th) {
        Throwable runtimeException;
        Iterator<CoroutineExceptionHandler> it = f29623a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    Exceptions.m12964a(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
