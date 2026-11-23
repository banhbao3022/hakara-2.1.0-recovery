package p007c.p190n.p194b.p367f.p368a.p373d;

/* JADX INFO: renamed from: c.n.b.f.a.d.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5097j extends AbstractRunnableC5091g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5109p f26050g;

    public C5097j(C5109p c5109p) {
        this.f26050g = c5109p;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g
    /* JADX INFO: renamed from: a */
    public final void mo11431a() {
        C5109p c5109p = this.f26050g;
        if (c5109p.f26067l != 0) {
            c5109p.f26058c.m11533b(4, "Unbind from service.", new Object[0]);
            C5109p c5109p2 = this.f26050g;
            c5109p2.f26057b.unbindService(c5109p2.f26066k);
            C5109p c5109p3 = this.f26050g;
            c5109p3.f26061f = false;
            c5109p3.f26067l = null;
            c5109p3.f26066k = null;
        }
    }
}
