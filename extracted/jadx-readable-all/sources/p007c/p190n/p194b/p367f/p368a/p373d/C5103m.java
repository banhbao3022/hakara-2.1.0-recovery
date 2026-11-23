package p007c.p190n.p194b.p367f.p368a.p373d;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: renamed from: c.n.b.f.a.d.m */
/* JADX INFO: loaded from: classes.dex */
public final class C5103m extends AbstractRunnableC5091g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ IBinder f26052g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ServiceConnectionC5107o f26053h;

    public C5103m(ServiceConnectionC5107o serviceConnectionC5107o, IBinder iBinder) {
        this.f26053h = serviceConnectionC5107o;
        this.f26052g = iBinder;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g
    /* JADX INFO: renamed from: a */
    public final void mo11431a() {
        C5109p c5109p = this.f26053h.f26055a;
        c5109p.f26067l = (T) c5109p.f26063h.mo11468a(this.f26052g);
        C5109p c5109p2 = this.f26053h.f26055a;
        c5109p2.f26058c.m11533b(4, "linkToDeath", new Object[0]);
        try {
            c5109p2.f26067l.asBinder().linkToDeath(c5109p2.f26065j, 0);
        } catch (RemoteException e) {
            c5109p2.f26058c.m11532a(e, "linkToDeath failed", new Object[0]);
        }
        C5109p c5109p3 = this.f26053h.f26055a;
        c5109p3.f26061f = false;
        Iterator<AbstractRunnableC5091g> it = c5109p3.f26060e.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f26053h.f26055a.f26060e.clear();
    }
}
