package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p007c.p190n.p194b.p266d.p298f.p299o.C2629b;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.x0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2700x0<T> extends AbstractC2701y {

    /* JADX INFO: renamed from: a */
    public final C4782j<T> f11767a;

    public AbstractC2700x0(int i, C4782j<T> c4782j) {
        super(i);
        this.f11767a = c4782j;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: a */
    public void mo5547a(Status status) {
        this.f11767a.m10947a(new C2629b(status));
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: b */
    public void mo5496b(C2664h1 c2664h1, boolean z) {
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: c */
    public void mo5548c(RuntimeException runtimeException) {
        this.f11767a.m10947a(runtimeException);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: e */
    public final void mo5549e(C2659g.a<?> aVar) throws DeadObjectException {
        try {
            mo5499h(aVar);
        } catch (DeadObjectException e) {
            this.f11767a.m10947a(new C2629b(AbstractC2678m0.m5546d(e)));
            throw e;
        } catch (RemoteException e2) {
            this.f11767a.m10947a(new C2629b(AbstractC2678m0.m5546d(e2)));
        } catch (RuntimeException e3) {
            this.f11767a.m10947a(e3);
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo5499h(C2659g.a<?> aVar) throws RemoteException;
}
