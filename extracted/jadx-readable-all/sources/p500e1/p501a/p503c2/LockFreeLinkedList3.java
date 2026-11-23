package p500e1.p501a.p503c2;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: e1.a.c2.j, reason: use source file name */
/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes.dex */
public class LockFreeLinkedList3 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29650f = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedList3.class, Object.class, "_next");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29651g = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedList3.class, Object.class, "_prev");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29652h = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedList3.class, Object.class, "_removedRef");
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* JADX INFO: renamed from: e1.a.c2.j$a */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    public static abstract class a extends Atomic2<LockFreeLinkedList3> {

        /* JADX INFO: renamed from: b */
        public LockFreeLinkedList3 f29653b;

        /* JADX INFO: renamed from: c */
        public final LockFreeLinkedList3 f29654c;

        public a(LockFreeLinkedList3 lockFreeLinkedList3) {
            this.f29654c = lockFreeLinkedList3;
        }

        @Override // p500e1.p501a.p503c2.Atomic2
        /* JADX INFO: renamed from: b */
        public void mo13132b(LockFreeLinkedList3 lockFreeLinkedList3, Object obj) {
            LockFreeLinkedList3 lockFreeLinkedList4 = lockFreeLinkedList3;
            boolean z = obj == null;
            LockFreeLinkedList3 lockFreeLinkedList5 = z ? this.f29654c : this.f29653b;
            if (lockFreeLinkedList5 != null && LockFreeLinkedList3.f29650f.compareAndSet(lockFreeLinkedList4, this, lockFreeLinkedList5) && z) {
                LockFreeLinkedList3 lockFreeLinkedList6 = this.f29654c;
                LockFreeLinkedList3 lockFreeLinkedList7 = this.f29653b;
                Intrinsics2.m13087c(lockFreeLinkedList7);
                lockFreeLinkedList6.m13145i(lockFreeLinkedList7);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final LockFreeLinkedList3 m13144g(Atomic3 atomic3) {
        Object obj;
        while (true) {
            LockFreeLinkedList3 lockFreeLinkedList3 = (LockFreeLinkedList3) this._prev;
            LockFreeLinkedList3 lockFreeLinkedList4 = lockFreeLinkedList3;
            while (true) {
                LockFreeLinkedList3 lockFreeLinkedList5 = null;
                while (true) {
                    obj = lockFreeLinkedList4._next;
                    if (obj == this) {
                        if (lockFreeLinkedList3 != lockFreeLinkedList4 && !f29651g.compareAndSet(this, lockFreeLinkedList3, lockFreeLinkedList4)) {
                            break;
                        }
                        return lockFreeLinkedList4;
                    }
                    if (mo13143o()) {
                        return null;
                    }
                    if (obj == null) {
                        return lockFreeLinkedList4;
                    }
                    if (obj instanceof Atomic3) {
                        ((Atomic3) obj).mo13131a(lockFreeLinkedList4);
                        break;
                    }
                    if (!(obj instanceof LockFreeLinkedList4)) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        lockFreeLinkedList5 = lockFreeLinkedList4;
                        lockFreeLinkedList4 = (LockFreeLinkedList3) obj;
                    } else {
                        if (lockFreeLinkedList5 != null) {
                            break;
                        }
                        lockFreeLinkedList4 = (LockFreeLinkedList3) lockFreeLinkedList4._prev;
                    }
                }
                if (!f29650f.compareAndSet(lockFreeLinkedList5, lockFreeLinkedList4, ((LockFreeLinkedList4) obj).f29667a)) {
                    break;
                }
                lockFreeLinkedList4 = lockFreeLinkedList5;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m13145i(LockFreeLinkedList3 lockFreeLinkedList3) {
        LockFreeLinkedList3 lockFreeLinkedList4;
        do {
            lockFreeLinkedList4 = (LockFreeLinkedList3) lockFreeLinkedList3._prev;
            if (m13146k() != lockFreeLinkedList3) {
                return;
            }
        } while (!f29651g.compareAndSet(lockFreeLinkedList3, lockFreeLinkedList4, this));
        if (mo13143o()) {
            lockFreeLinkedList3.m13144g(null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final Object m13146k() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof Atomic3)) {
                return obj;
            }
            ((Atomic3) obj).mo13131a(this);
        }
    }

    /* JADX INFO: renamed from: m */
    public final LockFreeLinkedList3 m13147m() {
        LockFreeLinkedList3 lockFreeLinkedList3;
        Object objM13146k = m13146k();
        Object obj = LockFreeLinkedList2.f29649a;
        LockFreeLinkedList4 lockFreeLinkedList4 = (LockFreeLinkedList4) (!(objM13146k instanceof LockFreeLinkedList4) ? null : objM13146k);
        if (lockFreeLinkedList4 != null && (lockFreeLinkedList3 = lockFreeLinkedList4.f29667a) != null) {
            return lockFreeLinkedList3;
        }
        Objects.requireNonNull(objM13146k, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        return (LockFreeLinkedList3) objM13146k;
    }

    /* JADX INFO: renamed from: n */
    public final LockFreeLinkedList3 m13148n() {
        LockFreeLinkedList3 lockFreeLinkedList3M13144g = m13144g(null);
        if (lockFreeLinkedList3M13144g == null) {
            Object obj = this._prev;
            while (true) {
                lockFreeLinkedList3M13144g = (LockFreeLinkedList3) obj;
                if (!lockFreeLinkedList3M13144g.mo13143o()) {
                    break;
                }
                obj = lockFreeLinkedList3M13144g._prev;
            }
        }
        return lockFreeLinkedList3M13144g;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo13143o() {
        return m13146k() instanceof LockFreeLinkedList4;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x003b A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: p */
    public boolean m13149p() {
        Object objM13146k;
        LockFreeLinkedList3 lockFreeLinkedList3;
        LockFreeLinkedList3 lockFreeLinkedList4;
        LockFreeLinkedList4 lockFreeLinkedList5;
        do {
            objM13146k = m13146k();
            if (objM13146k instanceof LockFreeLinkedList4) {
                lockFreeLinkedList3 = ((LockFreeLinkedList4) objM13146k).f29667a;
            } else if (objM13146k == this) {
                lockFreeLinkedList3 = (LockFreeLinkedList3) objM13146k;
            } else {
                Objects.requireNonNull(objM13146k, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                lockFreeLinkedList4 = (LockFreeLinkedList3) objM13146k;
                lockFreeLinkedList5 = (LockFreeLinkedList4) lockFreeLinkedList4._removedRef;
                if (lockFreeLinkedList5 == null) {
                    lockFreeLinkedList5 = new LockFreeLinkedList4(lockFreeLinkedList4);
                    f29652h.lazySet(lockFreeLinkedList4, lockFreeLinkedList5);
                }
            }
            if (lockFreeLinkedList3 == null) {
                return true;
            }
            return false;
        } while (!f29650f.compareAndSet(this, objM13146k, lockFreeLinkedList5));
        lockFreeLinkedList3 = null;
        lockFreeLinkedList4.m13144g(null);
        if (lockFreeLinkedList3 == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
