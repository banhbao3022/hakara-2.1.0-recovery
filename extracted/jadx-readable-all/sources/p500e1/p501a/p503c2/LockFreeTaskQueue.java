package p500e1.p501a.p503c2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: e1.a.c2.k, reason: use source file name */
/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes.dex */
public class LockFreeTaskQueue<E> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29655a = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public LockFreeTaskQueue(boolean z) {
        this._cur = new LockFreeTaskQueue2(8, z);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13150a(E e) {
        while (true) {
            LockFreeTaskQueue2 lockFreeTaskQueue2 = (LockFreeTaskQueue2) this._cur;
            int iM13154a = lockFreeTaskQueue2.m13154a(e);
            if (iM13154a == 0) {
                return true;
            }
            if (iM13154a == 1) {
                f29655a.compareAndSet(this, lockFreeTaskQueue2, lockFreeTaskQueue2.m13158e());
            } else if (iM13154a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13151b() {
        while (true) {
            LockFreeTaskQueue2 lockFreeTaskQueue2 = (LockFreeTaskQueue2) this._cur;
            if (lockFreeTaskQueue2.m13155b()) {
                return;
            } else {
                f29655a.compareAndSet(this, lockFreeTaskQueue2, lockFreeTaskQueue2.m13158e());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m13152c() {
        return ((LockFreeTaskQueue2) this._cur).m13156c();
    }

    /* JADX INFO: renamed from: d */
    public final E m13153d() {
        while (true) {
            LockFreeTaskQueue2 lockFreeTaskQueue2 = (LockFreeTaskQueue2) this._cur;
            E e = (E) lockFreeTaskQueue2.m13159f();
            if (e != LockFreeTaskQueue2.f29658c) {
                return e;
            }
            f29655a.compareAndSet(this, lockFreeTaskQueue2, lockFreeTaskQueue2.m13158e());
        }
    }
}
