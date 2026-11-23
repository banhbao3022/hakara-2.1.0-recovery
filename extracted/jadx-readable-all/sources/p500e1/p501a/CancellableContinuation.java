package p500e1.p501a;

import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p493x.p494b.InterfaceC6164l;

/* JADX INFO: renamed from: e1.a.i, reason: use source file name */
/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes.dex */
public interface CancellableContinuation<T> extends Continuation<T> {
    /* JADX INFO: renamed from: i */
    void mo13254i(InterfaceC6164l<? super Throwable, Unit> interfaceC6164l);

    /* JADX INFO: renamed from: j */
    void mo13255j(CoroutineDispatcher coroutineDispatcher, T t);
}
