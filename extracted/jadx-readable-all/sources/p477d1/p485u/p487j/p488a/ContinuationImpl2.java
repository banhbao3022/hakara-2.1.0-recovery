package p477d1.p485u.p487j.p488a;

import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;

/* JADX INFO: renamed from: d1.u.j.a.b, reason: use source file name */
/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContinuationImpl2 implements Continuation<Object> {

    /* JADX INFO: renamed from: f */
    public static final ContinuationImpl2 f29548f = new ContinuationImpl2();

    @Override // p477d1.p485u.Continuation
    /* JADX INFO: renamed from: g */
    public void mo13056g(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // p477d1.p485u.Continuation
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
