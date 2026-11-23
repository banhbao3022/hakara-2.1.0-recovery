package p500e1.p501a;

import p477d1.p485u.CoroutineContext;

/* JADX INFO: renamed from: e1.a.x1, reason: use source file name */
/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Unconfined2 extends CoroutineDispatcher {

    /* JADX INFO: renamed from: g */
    public static final Unconfined2 f29818g = new Unconfined2();

    @Override // p500e1.p501a.CoroutineDispatcher
    /* JADX INFO: renamed from: F0 */
    public void mo13118F0(CoroutineContext coroutineContext, Runnable runnable) {
        if (((Unconfined) coroutineContext.get(Unconfined.f29621f)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // p500e1.p501a.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
