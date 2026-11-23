package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2650d;
import p007c.p190n.p194b.p266d.p298f.p302q.C2763v;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.w0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2698w0<A extends AbstractC2650d<? extends InterfaceC2638k, C2628a.b>> extends AbstractC2678m0 {

    /* JADX INFO: renamed from: a */
    public final A f11766a;

    public C2698w0(int i, A a) {
        super(i);
        this.f11766a = a;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: a */
    public final void mo5547a(Status status) {
        this.f11766a.m5509n(status);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: b */
    public final void mo5496b(C2664h1 c2664h1, boolean z) {
        A a = this.f11766a;
        c2664h1.f11701a.put(a, Boolean.valueOf(z));
        a.m12656e(new C2693u(c2664h1, a));
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: c */
    public final void mo5548c(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        this.f11766a.m5509n(new Status(10, outline.m1587i(outline.m1558I(localizedMessage, simpleName.length() + 2), simpleName, ": ", localizedMessage)));
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: e */
    public final void mo5549e(C2659g.a<?> aVar) throws DeadObjectException {
        try {
            A a = this.f11766a;
            Object obj = aVar.f11674g;
            Objects.requireNonNull(a);
            if (obj instanceof C2763v) {
                obj = ((C2763v) obj).f11924A;
            }
            try {
                try {
                    a.mo4930m(obj);
                } catch (DeadObjectException e) {
                    a.m5509n(new Status(8, e.getLocalizedMessage(), (PendingIntent) null));
                    throw e;
                }
            } catch (RemoteException e2) {
                a.m5509n(new Status(8, e2.getLocalizedMessage(), (PendingIntent) null));
            }
        } catch (RuntimeException e3) {
            mo5548c(e3);
        }
    }
}
