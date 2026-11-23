package p007c.p190n.p194b.p367f.p368a.p377h;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.f.a.h.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5155s<ResultT> extends AbstractC5141e<ResultT> {

    /* JADX INFO: renamed from: a */
    public final Object f26118a = new Object();

    /* JADX INFO: renamed from: b */
    public final C5150n<ResultT> f26119b = new C5150n<>();

    /* JADX INFO: renamed from: c */
    public boolean f26120c;

    /* JADX INFO: renamed from: d */
    public ResultT f26121d;

    /* JADX INFO: renamed from: e */
    public Exception f26122e;

    @Override // p007c.p190n.p194b.p367f.p368a.p377h.AbstractC5141e
    /* JADX INFO: renamed from: a */
    public final AbstractC5141e<ResultT> mo11563a(Executor executor, InterfaceC5138b interfaceC5138b) {
        this.f26119b.m11570a(new C5146j(executor, interfaceC5138b));
        m11576i();
        return this;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p377h.AbstractC5141e
    /* JADX INFO: renamed from: b */
    public final AbstractC5141e<ResultT> mo11564b(Executor executor, InterfaceC5139c<? super ResultT> interfaceC5139c) {
        this.f26119b.m11570a(new C5148l(executor, interfaceC5139c));
        m11576i();
        return this;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p377h.AbstractC5141e
    /* JADX INFO: renamed from: c */
    public final Exception mo11565c() {
        Exception exc;
        synchronized (this.f26118a) {
            exc = this.f26122e;
        }
        return exc;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p377h.AbstractC5141e
    /* JADX INFO: renamed from: d */
    public final ResultT mo11566d() {
        ResultT resultt;
        synchronized (this.f26118a) {
            if (!this.f26120c) {
                throw new IllegalStateException("Task is not yet complete");
            }
            Exception exc = this.f26122e;
            if (exc != null) {
                throw new C5140d(exc);
            }
            resultt = this.f26121d;
        }
        return resultt;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p377h.AbstractC5141e
    /* JADX INFO: renamed from: e */
    public final boolean mo11567e() {
        boolean z;
        synchronized (this.f26118a) {
            z = this.f26120c;
        }
        return z;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p377h.AbstractC5141e
    /* JADX INFO: renamed from: f */
    public final boolean mo11568f() {
        boolean z;
        synchronized (this.f26118a) {
            z = false;
            if (this.f26120c && this.f26122e == null) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final void m11574g(ResultT resultt) {
        synchronized (this.f26118a) {
            if (!(!this.f26120c)) {
                throw new IllegalStateException("Task is already complete");
            }
            this.f26120c = true;
            this.f26121d = resultt;
        }
        this.f26119b.m11571b(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m11575h(Exception exc) {
        synchronized (this.f26118a) {
            if (!(!this.f26120c)) {
                throw new IllegalStateException("Task is already complete");
            }
            this.f26120c = true;
            this.f26122e = exc;
        }
        this.f26119b.m11571b(this);
    }

    /* JADX INFO: renamed from: i */
    public final void m11576i() {
        synchronized (this.f26118a) {
            if (this.f26120c) {
                this.f26119b.m11571b(this);
            }
        }
    }
}
