package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.n.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4781i<TResult> {
    /* JADX INFO: renamed from: a */
    public AbstractC4781i<TResult> mo10928a(Executor executor, InterfaceC4769c interfaceC4769c) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* JADX INFO: renamed from: b */
    public AbstractC4781i<TResult> mo10929b(InterfaceC4771d<TResult> interfaceC4771d) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* JADX INFO: renamed from: c */
    public AbstractC4781i<TResult> mo10930c(Executor executor, InterfaceC4771d<TResult> interfaceC4771d) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC4781i<TResult> mo10931d(Executor executor, InterfaceC4773e interfaceC4773e);

    /* JADX INFO: renamed from: e */
    public abstract AbstractC4781i<TResult> mo10932e(Executor executor, InterfaceC4775f<? super TResult> interfaceC4775f);

    /* JADX INFO: renamed from: f */
    public <TContinuationResult> AbstractC4781i<TContinuationResult> mo10933f(InterfaceC4767b<TResult, TContinuationResult> interfaceC4767b) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* JADX INFO: renamed from: g */
    public <TContinuationResult> AbstractC4781i<TContinuationResult> mo10934g(Executor executor, InterfaceC4767b<TResult, TContinuationResult> interfaceC4767b) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* JADX INFO: renamed from: h */
    public <TContinuationResult> AbstractC4781i<TContinuationResult> mo10935h(Executor executor, InterfaceC4767b<TResult, AbstractC4781i<TContinuationResult>> interfaceC4767b) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* JADX INFO: renamed from: i */
    public abstract Exception mo10936i();

    /* JADX INFO: renamed from: j */
    public abstract TResult mo10937j();

    /* JADX INFO: renamed from: k */
    public abstract <X extends Throwable> TResult mo10938k(Class<X> cls) throws Throwable;

    /* JADX INFO: renamed from: l */
    public abstract boolean mo10939l();

    /* JADX INFO: renamed from: m */
    public abstract boolean mo10940m();

    /* JADX INFO: renamed from: n */
    public abstract boolean mo10941n();

    /* JADX INFO: renamed from: o */
    public <TContinuationResult> AbstractC4781i<TContinuationResult> mo10942o(Executor executor, InterfaceC4779h<TResult, TContinuationResult> interfaceC4779h) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
