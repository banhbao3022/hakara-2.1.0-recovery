package p007c.p190n.p194b.p266d.p333n;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: c.n.b.d.n.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4772d0<TResult> {

    /* JADX INFO: renamed from: a */
    public final Object f24672a = new Object();

    /* JADX INFO: renamed from: b */
    public Queue<InterfaceC4770c0<TResult>> f24673b;

    /* JADX INFO: renamed from: c */
    public boolean f24674c;

    /* JADX INFO: renamed from: a */
    public final void m10926a(AbstractC4781i<TResult> abstractC4781i) {
        InterfaceC4770c0<TResult> interfaceC4770c0Poll;
        synchronized (this.f24672a) {
            if (this.f24673b != null && !this.f24674c) {
                this.f24674c = true;
                while (true) {
                    synchronized (this.f24672a) {
                        interfaceC4770c0Poll = this.f24673b.poll();
                        if (interfaceC4770c0Poll == null) {
                            this.f24674c = false;
                            return;
                        }
                    }
                    interfaceC4770c0Poll.mo10924b(abstractC4781i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10927b(InterfaceC4770c0<TResult> interfaceC4770c0) {
        synchronized (this.f24672a) {
            if (this.f24673b == null) {
                this.f24673b = new ArrayDeque();
            }
            this.f24673b.add(interfaceC4770c0);
        }
    }
}
