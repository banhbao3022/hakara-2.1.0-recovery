package p636z0.p709j0.p710y;

import p636z0.p709j0.Operation;
import p636z0.p709j0.p710y.p720t.p721s.SettableFuture;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: z0.j0.y.c, reason: use source file name */
/* JADX INFO: compiled from: OperationImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class OperationImpl implements Operation {

    /* JADX INFO: renamed from: c */
    public final MutableLiveData<Operation.b> f37297c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d */
    public final SettableFuture<Operation.b.c> f37298d = new SettableFuture<>();

    public OperationImpl() {
        m15898a(Operation.f37280b);
    }

    /* JADX INFO: renamed from: a */
    public void m15898a(Operation.b bVar) {
        this.f37297c.m16742k(bVar);
        if (bVar instanceof Operation.b.c) {
            this.f37298d.m16027k((Operation.b.c) bVar);
        } else if (bVar instanceof Operation.b.a) {
            this.f37298d.m16028l(((Operation.b.a) bVar).f37281a);
        }
    }
}
