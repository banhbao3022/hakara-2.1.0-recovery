package p500e1.p501a.p503c2;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p477d1.p493x.p495c.DefaultConstructorMarker;

/* JADX INFO: renamed from: e1.a.c2.l, reason: use source file name */
/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LockFreeTaskQueue2<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: e */
    public final int f29660e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ AtomicReferenceArray f29661f;

    /* JADX INFO: renamed from: g */
    public final int f29662g;

    /* JADX INFO: renamed from: h */
    public final boolean f29663h;

    /* JADX INFO: renamed from: d */
    public static final a f29659d = new a(null);

    /* JADX INFO: renamed from: c */
    public static final Symbol f29658c = new Symbol("REMOVE_FROZEN");

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29656a = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue2.class, Object.class, "_next");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicLongFieldUpdater f29657b = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueue2.class, "_state");

    /* JADX INFO: renamed from: e1.a.c2.l$a */
    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: e1.a.c2.l$b */
    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f29664a;

        public b(int i) {
            this.f29664a = i;
        }
    }

    public LockFreeTaskQueue2(int i, boolean z) {
        this.f29662g = i;
        this.f29663h = z;
        int i2 = i - 1;
        this.f29660e = i2;
        this.f29661f = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m13154a(E e) {
        while (true) {
            long j2 = this._state;
            if ((3458764513820540928L & j2) != 0) {
                Objects.requireNonNull(f29659d);
                return (2305843009213693952L & j2) != 0 ? 2 : 1;
            }
            a aVar = f29659d;
            int i = (int) ((1073741823 & j2) >> 0);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            int i3 = this.f29660e;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f29663h || this.f29661f.get(i2 & i3) == null) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = f29657b;
                Objects.requireNonNull(aVar);
                if (atomicLongFieldUpdater.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    this.f29661f.set(i2 & i3, e);
                    LockFreeTaskQueue2<E> lockFreeTaskQueue2M13158e = this;
                    while ((lockFreeTaskQueue2M13158e._state & 1152921504606846976L) != 0) {
                        lockFreeTaskQueue2M13158e = lockFreeTaskQueue2M13158e.m13158e();
                        Object obj = lockFreeTaskQueue2M13158e.f29661f.get(lockFreeTaskQueue2M13158e.f29660e & i2);
                        if ((obj instanceof b) && ((b) obj).f29664a == i2) {
                            lockFreeTaskQueue2M13158e.f29661f.set(lockFreeTaskQueue2M13158e.f29660e & i2, e);
                        } else {
                            lockFreeTaskQueue2M13158e = null;
                        }
                        if (lockFreeTaskQueue2M13158e == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i4 = this.f29662g;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13155b() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f29657b.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m13156c() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13157d() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final LockFreeTaskQueue2<E> m13158e() {
        long j2;
        while (true) {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                break;
            }
            long j3 = j2 | 1152921504606846976L;
            if (f29657b.compareAndSet(this, j2, j3)) {
                j2 = j3;
                break;
            }
        }
        while (true) {
            LockFreeTaskQueue2<E> lockFreeTaskQueue2 = (LockFreeTaskQueue2) this._next;
            if (lockFreeTaskQueue2 != null) {
                return lockFreeTaskQueue2;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29656a;
            LockFreeTaskQueue2 lockFreeTaskQueue3 = new LockFreeTaskQueue2(this.f29662g * 2, this.f29663h);
            int i = (int) ((1073741823 & j2) >> 0);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i3 = this.f29660e;
                int i4 = i & i3;
                if (i4 != (i3 & i2)) {
                    Object bVar = this.f29661f.get(i4);
                    if (bVar == null) {
                        bVar = new b(i);
                    }
                    lockFreeTaskQueue3.f29661f.set(lockFreeTaskQueue3.f29660e & i, bVar);
                    i++;
                }
            }
            Objects.requireNonNull(f29659d);
            lockFreeTaskQueue3._state = (-1152921504606846977L) & j2;
            atomicReferenceFieldUpdater.compareAndSet(this, null, lockFreeTaskQueue3);
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m13159f() {
        while (true) {
            long j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return f29658c;
            }
            a aVar = f29659d;
            int i = (int) ((j2 & 1073741823) >> 0);
            int i2 = this.f29660e;
            int i3 = ((int) ((1152921503533105152L & j2) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.f29661f.get(i4);
            if (obj == null) {
                if (this.f29663h) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f29657b;
                Objects.requireNonNull(aVar);
                long j3 = ((long) ((i + 1) & 1073741823)) << 0;
                if (atomicLongFieldUpdater.compareAndSet(this, j2, (j2 & (-1073741824)) | j3)) {
                    this.f29661f.set(this.f29660e & i, null);
                    return obj;
                }
                if (this.f29663h) {
                    LockFreeTaskQueue2<E> lockFreeTaskQueue2M13158e = this;
                    while (true) {
                        long j4 = lockFreeTaskQueue2M13158e._state;
                        a aVar2 = f29659d;
                        int i5 = (int) ((j4 & 1073741823) >> 0);
                        if ((j4 & 1152921504606846976L) != 0) {
                            lockFreeTaskQueue2M13158e = lockFreeTaskQueue2M13158e.m13158e();
                        } else {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f29657b;
                            Objects.requireNonNull(aVar2);
                            if (atomicLongFieldUpdater2.compareAndSet(lockFreeTaskQueue2M13158e, j4, j3 | (j4 & (-1073741824)))) {
                                lockFreeTaskQueue2M13158e.f29661f.set(lockFreeTaskQueue2M13158e.f29660e & i5, null);
                                lockFreeTaskQueue2M13158e = null;
                            } else {
                                continue;
                            }
                        }
                        if (lockFreeTaskQueue2M13158e == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
