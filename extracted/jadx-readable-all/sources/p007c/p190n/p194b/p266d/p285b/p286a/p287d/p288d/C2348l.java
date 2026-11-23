package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.l */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2348l extends AbstractC2350n<Status> {
    public C2348l(AbstractC2632e abstractC2632e) {
        super(abstractC2632e);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2638k mo4929f(Status status) {
        return status;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2650d
    /* JADX INFO: renamed from: m */
    public final void mo4930m(C2628a.b bVar) throws RemoteException {
        C2344h c2344h = (C2344h) bVar;
        ((InterfaceC2355s) c2344h.m5581u()).mo4936d4(new BinderC2351o(this), c2344h.f10945A);
    }
}
