package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.n.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4778g0<TResult> extends AbstractC4781i<TResult> {

    /* JADX INFO: renamed from: a */
    public final Object f24675a = new Object();

    /* JADX INFO: renamed from: b */
    public final C4772d0<TResult> f24676b = new C4772d0<>();

    /* JADX INFO: renamed from: c */
    public boolean f24677c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f24678d;

    /* JADX INFO: renamed from: e */
    public TResult f24679e;

    /* JADX INFO: renamed from: f */
    public Exception f24680f;

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: a */
    public final AbstractC4781i<TResult> mo10928a(Executor executor, InterfaceC4769c interfaceC4769c) {
        this.f24676b.m10927b(new C4791s(executor, interfaceC4769c));
        m10946s();
        return this;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: b */
    public final AbstractC4781i<TResult> mo10929b(InterfaceC4771d<TResult> interfaceC4771d) {
        mo10930c(C4783k.f24684a, interfaceC4771d);
        return this;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: c */
    public final AbstractC4781i<TResult> mo10930c(Executor executor, InterfaceC4771d<TResult> interfaceC4771d) {
        this.f24676b.m10927b(new C4793u(executor, interfaceC4771d));
        m10946s();
        return this;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: d */
    public final AbstractC4781i<TResult> mo10931d(Executor executor, InterfaceC4773e interfaceC4773e) {
        this.f24676b.m10927b(new C4795w(executor, interfaceC4773e));
        m10946s();
        return this;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: e */
    public final AbstractC4781i<TResult> mo10932e(Executor executor, InterfaceC4775f<? super TResult> interfaceC4775f) {
        this.f24676b.m10927b(new C4797y(executor, interfaceC4775f));
        m10946s();
        return this;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: f */
    public final <TContinuationResult> AbstractC4781i<TContinuationResult> mo10933f(InterfaceC4767b<TResult, TContinuationResult> interfaceC4767b) {
        return mo10934g(C4783k.f24684a, interfaceC4767b);
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: g */
    public final <TContinuationResult> AbstractC4781i<TContinuationResult> mo10934g(Executor executor, InterfaceC4767b<TResult, TContinuationResult> interfaceC4767b) {
        C4778g0 c4778g0 = new C4778g0();
        this.f24676b.m10927b(new C4787o(executor, interfaceC4767b, c4778g0));
        m10946s();
        return c4778g0;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: h */
    public final <TContinuationResult> AbstractC4781i<TContinuationResult> mo10935h(Executor executor, InterfaceC4767b<TResult, AbstractC4781i<TContinuationResult>> interfaceC4767b) {
        C4778g0 c4778g0 = new C4778g0();
        this.f24676b.m10927b(new C4789q(executor, interfaceC4767b, c4778g0));
        m10946s();
        return c4778g0;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: i */
    public final Exception mo10936i() {
        Exception exc;
        synchronized (this.f24675a) {
            exc = this.f24680f;
        }
        return exc;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: j */
    public final TResult mo10937j() {
        TResult tresult;
        synchronized (this.f24675a) {
            C2622l.m5389k(this.f24677c, "Task is not yet complete");
            if (this.f24678d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (this.f24680f != null) {
                throw new C4777g(this.f24680f);
            }
            tresult = this.f24679e;
        }
        return tresult;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: k */
    public final <X extends Throwable> TResult mo10938k(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f24675a) {
            C2622l.m5389k(this.f24677c, "Task is not yet complete");
            if (this.f24678d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (cls.isInstance(this.f24680f)) {
                throw cls.cast(this.f24680f);
            }
            if (this.f24680f != null) {
                throw new C4777g(this.f24680f);
            }
            tresult = this.f24679e;
        }
        return tresult;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: l */
    public final boolean mo10939l() {
        return this.f24678d;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: m */
    public final boolean mo10940m() {
        boolean z;
        synchronized (this.f24675a) {
            z = this.f24677c;
        }
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: n */
    public final boolean mo10941n() {
        boolean z;
        synchronized (this.f24675a) {
            z = this.f24677c && !this.f24678d && this.f24680f == null;
        }
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.AbstractC4781i
    /* JADX INFO: renamed from: o */
    public final <TContinuationResult> AbstractC4781i<TContinuationResult> mo10942o(Executor executor, InterfaceC4779h<TResult, TContinuationResult> interfaceC4779h) {
        C4778g0 c4778g0 = new C4778g0();
        this.f24676b.m10927b(new C4766a0(executor, interfaceC4779h, c4778g0));
        m10946s();
        return c4778g0;
    }

    /* JADX INFO: renamed from: p */
    public final void m10943p(Exception exc) {
        C2622l.m5379i(exc, "Exception must not be null");
        synchronized (this.f24675a) {
            C2622l.m5389k(!this.f24677c, "Task is already complete");
            this.f24677c = true;
            this.f24680f = exc;
        }
        this.f24676b.m10926a(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m10944q(TResult tresult) {
        synchronized (this.f24675a) {
            C2622l.m5389k(!this.f24677c, "Task is already complete");
            this.f24677c = true;
            this.f24679e = tresult;
        }
        this.f24676b.m10926a(this);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m10945r() {
        synchronized (this.f24675a) {
            if (this.f24677c) {
                return false;
            }
            this.f24677c = true;
            this.f24678d = true;
            this.f24676b.m10926a(this);
            return true;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m10946s() {
        synchronized (this.f24675a) {
            if (this.f24677c) {
                this.f24676b.m10926a(this);
            }
        }
    }
}
