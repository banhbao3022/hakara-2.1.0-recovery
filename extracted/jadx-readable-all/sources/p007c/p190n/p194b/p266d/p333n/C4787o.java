package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.n.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4787o<TResult, TContinuationResult> implements InterfaceC4770c0<TResult> {

    /* JADX INFO: renamed from: a */
    public final Executor f24696a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4767b<TResult, TContinuationResult> f24697b;

    /* JADX INFO: renamed from: c */
    public final C4778g0<TContinuationResult> f24698c;

    public C4787o(Executor executor, InterfaceC4767b<TResult, TContinuationResult> interfaceC4767b, C4778g0<TContinuationResult> c4778g0) {
        this.f24696a = executor;
        this.f24697b = interfaceC4767b;
        this.f24698c = c4778g0;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4770c0
    /* JADX INFO: renamed from: b */
    public final void mo10924b(AbstractC4781i<TResult> abstractC4781i) {
        this.f24696a.execute(new RunnableC4788p(this, abstractC4781i));
    }
}
