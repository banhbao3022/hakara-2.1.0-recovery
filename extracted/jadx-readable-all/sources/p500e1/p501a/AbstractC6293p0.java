package p500e1.p501a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.p503c2.ArrayQueue;
import p500e1.p501a.p503c2.LockFreeTaskQueue2;
import p500e1.p501a.p503c2.Symbol;
import p500e1.p501a.p503c2.ThreadSafeHeap;
import p500e1.p501a.p503c2.ThreadSafeHeap2;

/* JADX INFO: renamed from: e1.a.p0 */
/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6293p0 extends EventLoop2 implements Delay {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29783k = AtomicReferenceFieldUpdater.newUpdater(AbstractC6293p0.class, Object.class, "_queue");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29784l = AtomicReferenceFieldUpdater.newUpdater(AbstractC6293p0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX INFO: renamed from: e1.a.p0$a */
    /* JADX INFO: compiled from: EventLoop.common.kt */
    public final class a extends b {

        /* JADX INFO: renamed from: i */
        public final CancellableContinuation<Unit> f29785i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j2, CancellableContinuation<? super Unit> cancellableContinuation) {
            super(j2);
            this.f29785i = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29785i.mo13255j(AbstractC6293p0.this, Unit.f29502a);
        }

        @Override // p500e1.p501a.AbstractC6293p0.b
        public String toString() {
            return super.toString() + this.f29785i.toString();
        }
    }

    /* JADX INFO: renamed from: e1.a.p0$b */
    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static abstract class b implements Runnable, Comparable<b>, Job2, ThreadSafeHeap2 {

        /* JADX INFO: renamed from: f */
        public Object f29787f;

        /* JADX INFO: renamed from: g */
        public int f29788g = -1;

        /* JADX INFO: renamed from: h */
        public long f29789h;

        public b(long j2) {
            this.f29789h = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            long j2 = this.f29789h - bVar.f29789h;
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }

        @Override // p500e1.p501a.Job2
        public final synchronized void dispose() {
            Object obj = this.f29787f;
            Symbol symbol = C6299r0.f29794a;
            if (obj == symbol) {
                return;
            }
            if (!(obj instanceof c)) {
                obj = null;
            }
            c cVar = (c) obj;
            if (cVar != null) {
                synchronized (cVar) {
                    if (mo13176l() != null) {
                        cVar.m13170d(mo13177m());
                    }
                }
            }
            this.f29787f = symbol;
        }

        @Override // p500e1.p501a.p503c2.ThreadSafeHeap2
        /* JADX INFO: renamed from: f */
        public void mo13174f(int i) {
            this.f29788g = i;
        }

        @Override // p500e1.p501a.p503c2.ThreadSafeHeap2
        /* JADX INFO: renamed from: h */
        public void mo13175h(ThreadSafeHeap<?> threadSafeHeap) {
            if (!(this.f29787f != C6299r0.f29794a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f29787f = threadSafeHeap;
        }

        @Override // p500e1.p501a.p503c2.ThreadSafeHeap2
        /* JADX INFO: renamed from: l */
        public ThreadSafeHeap<?> mo13176l() {
            Object obj = this.f29787f;
            if (!(obj instanceof ThreadSafeHeap)) {
                obj = null;
            }
            return (ThreadSafeHeap) obj;
        }

        @Override // p500e1.p501a.p503c2.ThreadSafeHeap2
        /* JADX INFO: renamed from: m */
        public int mo13177m() {
            return this.f29788g;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("Delayed[nanos=");
            sbM1556G.append(this.f29789h);
            sbM1556G.append(']');
            return sbM1556G.toString();
        }
    }

    /* JADX INFO: renamed from: e1.a.p0$c */
    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static final class c extends ThreadSafeHeap<b> {

        /* JADX INFO: renamed from: b */
        public long f29790b;

        public c(long j2) {
            this.f29790b = j2;
        }
    }

    @Override // p500e1.p501a.CoroutineDispatcher
    /* JADX INFO: renamed from: F0 */
    public final void mo13118F0(CoroutineContext coroutineContext, Runnable runnable) {
        m13284P0(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009a  */
    /* JADX WARN: Code duplicated, block: B:75:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:91:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p500e1.p501a.AbstractC6290o0
    /* JADX INFO: renamed from: M0 */
    public long mo13279M0() {
        long j2;
        c cVar;
        b bVarM13168b;
        long jNanoTime;
        b bVarM13170d;
        if (m13280N0()) {
            return 0L;
        }
        c cVar2 = (c) this._delayed;
        Runnable runnable = null;
        if (cVar2 != null && !cVar2.m13169c()) {
            long jNanoTime2 = System.nanoTime();
            do {
                synchronized (cVar2) {
                    b bVarM13168b2 = cVar2.m13168b();
                    if (bVarM13168b2 != null) {
                        b bVar = bVarM13168b2;
                        bVarM13170d = ((jNanoTime2 - bVar.f29789h) > 0L ? 1 : ((jNanoTime2 - bVar.f29789h) == 0L ? 0 : -1)) >= 0 ? m13285Q0(bVar) : false ? cVar2.m13170d(0) : null;
                    } else {
                        bVarM13170d = null;
                    }
                }
            } while (bVarM13170d != null);
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof LockFreeTaskQueue2)) {
                if (obj == C6299r0.f29795b) {
                    break;
                }
                if (f29783k.compareAndSet(this, obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                LockFreeTaskQueue2 lockFreeTaskQueue2 = (LockFreeTaskQueue2) obj;
                Object objM13159f = lockFreeTaskQueue2.m13159f();
                if (objM13159f != LockFreeTaskQueue2.f29658c) {
                    runnable = (Runnable) objM13159f;
                    break;
                }
                f29783k.compareAndSet(this, obj, lockFreeTaskQueue2.m13158e());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        ArrayQueue<DispatchedTask<?>> arrayQueue = this.f29779j;
        if (arrayQueue == null) {
            j2 = Long.MAX_VALUE;
        } else {
            if (arrayQueue.f29636b == arrayQueue.f29637c) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 0;
            }
        }
        if (j2 == 0) {
            return 0L;
        }
        Object obj2 = this._queue;
        if (obj2 == null) {
            cVar = (c) this._delayed;
            if (cVar != null) {
                synchronized (cVar) {
                    bVarM13168b = cVar.m13168b();
                    if (bVarM13168b != null) {
                        jNanoTime = bVarM13168b.f29789h - System.nanoTime();
                        if (jNanoTime < 0) {
                            return 0L;
                        }
                        return jNanoTime;
                    }
                }
            }
        } else if (obj2 instanceof LockFreeTaskQueue2) {
            if (!((LockFreeTaskQueue2) obj2).m13157d()) {
                return 0L;
            }
            cVar = (c) this._delayed;
            if (cVar != null) {
                synchronized (cVar) {
                }
                bVarM13168b = cVar.m13168b();
                if (bVarM13168b != null) {
                    jNanoTime = bVarM13168b.f29789h - System.nanoTime();
                    if (jNanoTime < 0) {
                        return 0L;
                    }
                    return jNanoTime;
                }
            }
        } else if (obj2 != C6299r0.f29795b) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m13284P0(Runnable runnable) {
        if (!m13285Q0(runnable)) {
            DefaultExecutor.f29739n.m13284P0(runnable);
            return;
        }
        Thread threadMo13210O0 = mo13210O0();
        if (Thread.currentThread() != threadMo13210O0) {
            LockSupport.unpark(threadMo13210O0);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m13285Q0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (f29783k.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof LockFreeTaskQueue2) {
                LockFreeTaskQueue2 lockFreeTaskQueue2 = (LockFreeTaskQueue2) obj;
                int iM13154a = lockFreeTaskQueue2.m13154a(runnable);
                if (iM13154a == 0) {
                    return true;
                }
                if (iM13154a == 1) {
                    f29783k.compareAndSet(this, obj, lockFreeTaskQueue2.m13158e());
                } else if (iM13154a == 2) {
                    return false;
                }
            } else {
                if (obj == C6299r0.f29795b) {
                    return false;
                }
                LockFreeTaskQueue2 lockFreeTaskQueue3 = new LockFreeTaskQueue2(8, true);
                lockFreeTaskQueue3.m13154a((Runnable) obj);
                lockFreeTaskQueue3.m13154a(runnable);
                if (f29783k.compareAndSet(this, obj, lockFreeTaskQueue3)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m13286R0() {
        ArrayQueue<DispatchedTask<?>> arrayQueue = this.f29779j;
        if (!(arrayQueue == null || arrayQueue.f29636b == arrayQueue.f29637c)) {
            return false;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.m13169c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof LockFreeTaskQueue2) {
            return ((LockFreeTaskQueue2) obj).m13157d();
        }
        return obj == C6299r0.f29795b;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m13287S0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m13288T0(long j2, b bVar) {
        char c2;
        Thread threadMo13210O0;
        b bVarM13168b;
        b bVar2 = null;
        if (this._isCompleted == 0) {
            c cVar = (c) this._delayed;
            if (cVar == null) {
                f29784l.compareAndSet(this, null, new c(j2));
                Object obj = this._delayed;
                Intrinsics2.m13087c(obj);
                cVar = (c) obj;
            }
            synchronized (bVar) {
                if (bVar.f29787f == C6299r0.f29794a) {
                    c2 = 2;
                } else {
                    synchronized (cVar) {
                        b bVarM13168b2 = cVar.m13168b();
                        if (this._isCompleted != 0) {
                            c2 = 1;
                        } else {
                            if (bVarM13168b2 == null) {
                                cVar.f29790b = j2;
                            } else {
                                long j3 = bVarM13168b2.f29789h;
                                if (j3 - j2 >= 0) {
                                    j3 = j2;
                                }
                                if (j3 - cVar.f29790b > 0) {
                                    cVar.f29790b = j3;
                                }
                            }
                            long j4 = bVar.f29789h;
                            long j5 = cVar.f29790b;
                            if (j4 - j5 < 0) {
                                bVar.f29789h = j5;
                            }
                            cVar.m13167a(bVar);
                            c2 = 0;
                        }
                    }
                }
            }
        } else {
            c2 = 1;
        }
        if (c2 != 0) {
            if (c2 == 1) {
                DefaultExecutor.f29739n.m13288T0(j2, bVar);
                return;
            } else {
                if (c2 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        c cVar2 = (c) this._delayed;
        if (cVar2 != null) {
            synchronized (cVar2) {
                bVarM13168b = cVar2.m13168b();
            }
            bVar2 = bVarM13168b;
        }
        if (!(bVar2 == bVar) || Thread.currentThread() == (threadMo13210O0 = mo13210O0())) {
            return;
        }
        LockSupport.unpark(threadMo13210O0);
    }

    @Override // p500e1.p501a.Delay
    /* JADX INFO: renamed from: h */
    public void mo13123h(long j2, CancellableContinuation<? super Unit> cancellableContinuation) {
        Symbol symbol = C6299r0.f29794a;
        long j3 = 0;
        if (j2 > 0) {
            j3 = j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2;
        }
        if (j3 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            a aVar = new a(j3 + jNanoTime, cancellableContinuation);
            C5729a.m12458m(cancellableContinuation, aVar);
            m13288T0(jNanoTime, aVar);
        }
    }

    @Override // p500e1.p501a.AbstractC6290o0
    public void shutdown() {
        b bVarM13171e;
        C6312v1 c6312v1 = C6312v1.f29813b;
        C6312v1.f29812a.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f29783k.compareAndSet(this, null, C6299r0.f29795b)) {
                    break;
                }
            } else if (obj instanceof LockFreeTaskQueue2) {
                ((LockFreeTaskQueue2) obj).m13155b();
                break;
            } else {
                if (obj == C6299r0.f29795b) {
                    break;
                }
                LockFreeTaskQueue2 lockFreeTaskQueue2 = new LockFreeTaskQueue2(8, true);
                lockFreeTaskQueue2.m13154a((Runnable) obj);
                if (f29783k.compareAndSet(this, obj, lockFreeTaskQueue2)) {
                    break;
                }
            }
        }
        while (mo13279M0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            if (cVar == null || (bVarM13171e = cVar.m13171e()) == null) {
                return;
            } else {
                DefaultExecutor.f29739n.m13288T0(jNanoTime, bVarM13171e);
            }
        }
    }
}
