package p500e1.p501a;

import p477d1.Unit;

/* JADX INFO: renamed from: e1.a.r1, reason: use source file name */
/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Executors3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final CoroutineDispatcher f29796f;

    /* JADX INFO: renamed from: g */
    public final CancellableContinuation<Unit> f29797g;

    /* JADX WARN: Multi-variable type inference failed */
    public Executors3(CoroutineDispatcher coroutineDispatcher, CancellableContinuation<? super Unit> cancellableContinuation) {
        this.f29796f = coroutineDispatcher;
        this.f29797g = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f29797g.mo13255j(this.f29796f, Unit.f29502a);
    }
}
