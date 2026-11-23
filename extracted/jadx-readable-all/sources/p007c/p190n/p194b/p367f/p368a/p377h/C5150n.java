package p007c.p190n.p194b.p367f.p368a.p377h;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: c.n.b.f.a.h.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5150n<ResultT> {

    /* JADX INFO: renamed from: a */
    public final Object f26113a = new Object();

    /* JADX INFO: renamed from: b */
    public Queue<InterfaceC5149m<ResultT>> f26114b;

    /* JADX INFO: renamed from: c */
    public boolean f26115c;

    /* JADX INFO: renamed from: a */
    public final void m11570a(InterfaceC5149m<ResultT> interfaceC5149m) {
        synchronized (this.f26113a) {
            if (this.f26114b == null) {
                this.f26114b = new ArrayDeque();
            }
            this.f26114b.add(interfaceC5149m);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11571b(AbstractC5141e<ResultT> abstractC5141e) {
        InterfaceC5149m<ResultT> interfaceC5149mPoll;
        synchronized (this.f26113a) {
            if (this.f26114b != null && !this.f26115c) {
                this.f26115c = true;
                while (true) {
                    synchronized (this.f26113a) {
                        interfaceC5149mPoll = this.f26114b.poll();
                        if (interfaceC5149mPoll == null) {
                            this.f26115c = false;
                            return;
                        }
                    }
                    interfaceC5149mPoll.mo11569a(abstractC5141e);
                }
            }
        }
    }
}
