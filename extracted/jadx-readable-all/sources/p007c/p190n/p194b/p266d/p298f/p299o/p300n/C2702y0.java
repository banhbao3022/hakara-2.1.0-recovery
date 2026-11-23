package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p302q.C2714b;
import p007c.p190n.p194b.p266d.p333n.C4778g0;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p194b.p266d.p333n.C4783k;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.y0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2702y0<ResultT> extends AbstractC2701y {

    /* JADX INFO: renamed from: a */
    public final AbstractC2687r<C2628a.b, ResultT> f11768a;

    /* JADX INFO: renamed from: b */
    public final C4782j<ResultT> f11769b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2683p f11770c;

    public C2702y0(int i, AbstractC2687r<C2628a.b, ResultT> abstractC2687r, C4782j<ResultT> c4782j, InterfaceC2683p interfaceC2683p) {
        super(i);
        this.f11769b = c4782j;
        this.f11768a = abstractC2687r;
        this.f11770c = interfaceC2683p;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: a */
    public final void mo5547a(Status status) {
        C4782j<ResultT> c4782j = this.f11769b;
        Objects.requireNonNull((C2641a) this.f11770c);
        c4782j.m10947a(C2714b.m5564a(status));
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: b */
    public final void mo5496b(C2664h1 c2664h1, boolean z) {
        C4782j<ResultT> c4782j = this.f11769b;
        c2664h1.f11702b.put(c4782j, Boolean.valueOf(z));
        C4778g0<ResultT> c4778g0 = c4782j.f24683a;
        C2691t c2691t = new C2691t(c2664h1, c4782j);
        Objects.requireNonNull(c4778g0);
        c4778g0.mo10930c(C4783k.f24684a, c2691t);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: c */
    public final void mo5548c(RuntimeException runtimeException) {
        this.f11769b.m10947a(runtimeException);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: e */
    public final void mo5549e(C2659g.a<?> aVar) throws DeadObjectException {
        try {
            this.f11768a.mo5552b(aVar.f11674g, this.f11769b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo5547a(AbstractC2678m0.m5546d(e2));
        } catch (RuntimeException e3) {
            this.f11769b.m10947a(e3);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2701y
    /* JADX INFO: renamed from: f */
    public final C2606d[] mo5497f(C2659g.a<?> aVar) {
        return this.f11768a.f11746a;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2701y
    /* JADX INFO: renamed from: g */
    public final boolean mo5498g(C2659g.a<?> aVar) {
        return this.f11768a.f11747b;
    }
}
