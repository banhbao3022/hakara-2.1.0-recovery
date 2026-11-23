package p007c.p190n.p194b.p367f.p368a.p373d;

import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.d.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5095i extends AbstractRunnableC5091g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractRunnableC5091g f26046g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5109p f26047h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5095i(C5109p c5109p, C5151o c5151o, AbstractRunnableC5091g abstractRunnableC5091g) {
        super(c5151o);
        this.f26047h = c5109p;
        this.f26046g = abstractRunnableC5091g;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g
    /* JADX INFO: renamed from: a */
    public final void mo11431a() {
        C5109p c5109p = this.f26047h;
        AbstractRunnableC5091g abstractRunnableC5091g = this.f26046g;
        if (c5109p.f26067l != 0 || c5109p.f26061f) {
            if (!c5109p.f26061f) {
                abstractRunnableC5091g.run();
                return;
            } else {
                c5109p.f26058c.m11533b(4, "Waiting to bind to the service.", new Object[0]);
                c5109p.f26060e.add(abstractRunnableC5091g);
                return;
            }
        }
        c5109p.f26058c.m11533b(4, "Initiate binding to the service.", new Object[0]);
        c5109p.f26060e.add(abstractRunnableC5091g);
        ServiceConnectionC5107o serviceConnectionC5107o = new ServiceConnectionC5107o(c5109p);
        c5109p.f26066k = serviceConnectionC5107o;
        c5109p.f26061f = true;
        if (c5109p.f26057b.bindService(c5109p.f26062g, serviceConnectionC5107o, 1)) {
            return;
        }
        c5109p.f26058c.m11533b(4, "Failed to bind to the service.", new Object[0]);
        c5109p.f26061f = false;
        for (AbstractRunnableC5091g abstractRunnableC5091g2 : c5109p.f26060e) {
            C5111q c5111q = new C5111q();
            C5151o<?> c5151o = abstractRunnableC5091g2.f26044f;
            if (c5151o != null) {
                c5151o.m11572a(c5111q);
            }
        }
        c5109p.f26060e.clear();
    }
}
