package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p007c.p190n.p194b.p266d.p267a.p282z.AbstractC2314e;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;

/* JADX INFO: renamed from: c.n.b.d.j.a.ai */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2844ai extends AbstractC2314e<InterfaceC3104hi> {
    public C2844ai(Context context, Looper looper, AbstractC2717c.a aVar, AbstractC2717c.b bVar) {
        super(C2994ej.m6634a(context), looper, 8, aVar, bVar);
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC3104hi m5815C() throws DeadObjectException {
        return (InterfaceC3104hi) m5581u();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: h */
    public final String mo4923h() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ IInterface mo4924i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3104hi ? (InterfaceC3104hi) iInterfaceQueryLocalInterface : new C3030fi(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: n */
    public final String mo4926n() {
        return "com.google.android.gms.ads.service.START";
    }
}
