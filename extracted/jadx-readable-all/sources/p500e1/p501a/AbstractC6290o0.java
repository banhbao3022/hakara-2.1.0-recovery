package p500e1.p501a;

import java.util.Objects;
import p477d1.p483s._ArraysJvm;
import p500e1.p501a.p503c2.ArrayQueue;

/* JADX INFO: renamed from: e1.a.o0 */
/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6290o0 extends CoroutineDispatcher {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f29776g = 0;

    /* JADX INFO: renamed from: h */
    public long f29777h;

    /* JADX INFO: renamed from: i */
    public boolean f29778i;

    /* JADX INFO: renamed from: j */
    public ArrayQueue<DispatchedTask<?>> f29779j;

    /* JADX INFO: renamed from: H0 */
    public final void m13274H0(boolean z) {
        long jM13275I0 = this.f29777h - m13275I0(z);
        this.f29777h = jM13275I0;
        if (jM13275I0 <= 0 && this.f29778i) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final long m13275I0(boolean z) {
        return z ? 4294967296L : 1L;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m13276J0(DispatchedTask<?> dispatchedTask) {
        ArrayQueue<DispatchedTask<?>> arrayQueue = this.f29779j;
        if (arrayQueue == null) {
            arrayQueue = new ArrayQueue<>();
            this.f29779j = arrayQueue;
        }
        Object[] objArr = arrayQueue.f29635a;
        int i = arrayQueue.f29637c;
        objArr[i] = dispatchedTask;
        int length = (objArr.length - 1) & (i + 1);
        arrayQueue.f29637c = length;
        int i2 = arrayQueue.f29636b;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            _ArraysJvm.m13030d(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = arrayQueue.f29635a;
            int length3 = objArr3.length;
            int i3 = arrayQueue.f29636b;
            _ArraysJvm.m13030d(objArr3, objArr2, length3 - i3, 0, i3, 4);
            arrayQueue.f29635a = objArr2;
            arrayQueue.f29636b = 0;
            arrayQueue.f29637c = length2;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m13277K0(boolean z) {
        this.f29777h = m13275I0(z) + this.f29777h;
        if (z) {
            return;
        }
        this.f29778i = true;
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m13278L0() {
        return this.f29777h >= m13275I0(true);
    }

    /* JADX INFO: renamed from: M0 */
    public long mo13279M0() {
        return !m13280N0() ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m13280N0() {
        ArrayQueue<DispatchedTask<?>> arrayQueue = this.f29779j;
        if (arrayQueue != null) {
            int i = arrayQueue.f29636b;
            Object obj = null;
            if (i != arrayQueue.f29637c) {
                Object[] objArr = arrayQueue.f29635a;
                Object obj2 = objArr[i];
                objArr[i] = null;
                arrayQueue.f29636b = (i + 1) & (objArr.length - 1);
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type T");
                obj = obj2;
            }
            DispatchedTask dispatchedTask = (DispatchedTask) obj;
            if (dispatchedTask != null) {
                dispatchedTask.run();
                return true;
            }
        }
        return false;
    }

    public void shutdown() {
    }
}
