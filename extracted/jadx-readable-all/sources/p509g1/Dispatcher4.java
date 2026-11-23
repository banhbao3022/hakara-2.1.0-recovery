package p509g1;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util8;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p514g.RealCall;
import p623k1.OkHttpCall;

/* JADX INFO: renamed from: g1.q, reason: use source file name */
/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Dispatcher4 {

    /* JADX INFO: renamed from: a */
    public int f30616a;

    /* JADX INFO: renamed from: b */
    public int f30617b;

    /* JADX INFO: renamed from: c */
    public ExecutorService f30618c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque<RealCall.a> f30619d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque<RealCall.a> f30620e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<RealCall> f30621f;

    public Dispatcher4() {
        this.f30616a = 64;
        this.f30617b = 5;
        this.f30619d = new ArrayDeque<>();
        this.f30620e = new ArrayDeque<>();
        this.f30621f = new ArrayDeque<>();
    }

    /* JADX INFO: renamed from: a */
    public final <T> void m13639a(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m13641c();
    }

    /* JADX INFO: renamed from: b */
    public final void m13640b(RealCall.a aVar) {
        Intrinsics2.m13090f(aVar, "call");
        aVar.f30231f.decrementAndGet();
        m13639a(this.f30620e, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[Catch: all -> 0x00f4, TryCatch #1 {, blocks: (B:27:0x006f, B:29:0x0073, B:30:0x00a5, B:44:0x00ef, B:45:0x00f3), top: B:58:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:58:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0073, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final boolean m13641c() {
        int size;
        int size2;
        int i;
        RealCall.a aVar;
        ExecutorService executorService;
        byte[] bArr = Util9.f30070a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.a> it = this.f30619d.iterator();
            Intrinsics2.m13086b(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                RealCall.a next = it.next();
                if (this.f30620e.size() >= this.f30616a) {
                    break;
                }
                if (next.f30231f.get() < this.f30617b) {
                    it.remove();
                    next.f30231f.incrementAndGet();
                    Intrinsics2.m13086b(next, "asyncCall");
                    arrayList.add(next);
                    this.f30620e.add(next);
                }
            }
            synchronized (this) {
                size = this.f30620e.size() + this.f30621f.size();
            }
            size2 = arrayList.size();
            for (i = 0; i < size2; i++) {
                aVar = (RealCall.a) arrayList.get(i);
                synchronized (this) {
                    if (this.f30618c == null) {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        SynchronousQueue synchronousQueue = new SynchronousQueue();
                        String str = Util9.f30076g + " Dispatcher";
                        Intrinsics2.m13090f(str, "name");
                        this.f30618c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new Util8(str, false));
                    }
                    executorService = this.f30618c;
                    if (executorService != null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                }
                Objects.requireNonNull(aVar);
                Intrinsics2.m13090f(executorService, "executorService");
                Dispatcher4 dispatcher4 = aVar.f30233h.f30228u.f29861i;
                byte[] bArr2 = Util9.f30070a;
                try {
                    try {
                        executorService.execute(aVar);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        aVar.f30233h.m13450k(interruptedIOException);
                        ((OkHttpCall.a) aVar.f30232g).m14303a(aVar.f30233h, interruptedIOException);
                        aVar.f30233h.f30228u.f29861i.m13640b(aVar);
                    }
                } catch (Throwable th) {
                    aVar.f30233h.f30228u.f29861i.m13640b(aVar);
                    throw th;
                }
            }
            return z;
        }
        boolean z = size > 0;
        size2 = arrayList.size();
        while (i < size2) {
            aVar = (RealCall.a) arrayList.get(i);
            synchronized (this) {
                if (this.f30618c == null) {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue2 = new SynchronousQueue();
                    String str2 = Util9.f30076g + " Dispatcher";
                    Intrinsics2.m13090f(str2, "name");
                    this.f30618c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit2, synchronousQueue2, new Util8(str2, false));
                }
                executorService = this.f30618c;
                if (executorService != null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                Objects.requireNonNull(aVar);
                Intrinsics2.m13090f(executorService, "executorService");
                Dispatcher4 dispatcher5 = aVar.f30233h.f30228u.f29861i;
                byte[] bArr3 = Util9.f30070a;
                executorService.execute(aVar);
            }
        }
        return z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher4(ExecutorService executorService) {
        this();
        Intrinsics2.m13090f(executorService, "executorService");
        this.f30618c = executorService;
    }
}
