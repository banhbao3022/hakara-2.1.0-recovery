package p007c.p190n.p194b.p367f.p368a.p375f;

import android.os.RemoteException;
import p007c.p190n.p194b.p367f.p368a.p372c.C5075b;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5083c;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.f.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5132f extends AbstractRunnableC5091g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5151o f26088g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5135i f26089h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5132f(C5135i c5135i, C5151o c5151o, C5151o c5151o2) {
        super(c5151o);
        this.f26089h = c5135i;
        this.f26088g = c5151o2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g
    /* JADX INFO: renamed from: a */
    public final void mo11431a() {
        try {
            C5135i c5135i = this.f26089h;
            ((InterfaceC5083c) c5135i.f26094b.f26067l).mo11526F4(c5135i.f26095c, C5075b.m11524a("review"), new BinderC5134h(this.f26089h, this.f26088g));
        } catch (RemoteException e) {
            C5135i.f26093a.m11532a(e, "error requesting in-app review for %s", this.f26089h.f26095c);
            this.f26088g.m11572a(new RuntimeException(e));
        }
    }
}
