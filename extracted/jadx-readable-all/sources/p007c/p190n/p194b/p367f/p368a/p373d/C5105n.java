package p007c.p190n.p194b.p367f.p368a.p373d;

/* JADX INFO: renamed from: c.n.b.f.a.d.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5105n extends AbstractRunnableC5091g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ServiceConnectionC5107o f26054g;

    public C5105n(ServiceConnectionC5107o serviceConnectionC5107o) {
        this.f26054g = serviceConnectionC5107o;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g
    /* JADX INFO: renamed from: a */
    public final void mo11431a() {
        C5109p c5109p = this.f26054g.f26055a;
        c5109p.f26058c.m11533b(4, "unlinkToDeath", new Object[0]);
        c5109p.f26067l.asBinder().unlinkToDeath(c5109p.f26065j, 0);
        C5109p c5109p2 = this.f26054g.f26055a;
        c5109p2.f26067l = null;
        c5109p2.f26061f = false;
    }
}
