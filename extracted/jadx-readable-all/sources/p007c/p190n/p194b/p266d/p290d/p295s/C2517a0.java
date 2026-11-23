package p007c.p190n.p194b.p266d.p290d.p295s;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p007c.p190n.p194b.p266d.p290d.C2567y;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i;
import p007c.p190n.p194b.p266d.p298f.p302q.C2720d;

/* JADX INFO: renamed from: c.n.b.d.d.s.a0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2517a0 extends AbstractC2735i<InterfaceC2531h> {
    public C2517a0(Context context, Looper looper, C2720d c2720d, AbstractC2632e.a aVar, AbstractC2632e.b bVar) {
        super(context, looper, 161, c2720d, aVar, bVar);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: h */
    public final String mo4923h() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ IInterface mo4924i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2531h ? (InterfaceC2531h) iInterfaceQueryLocalInterface : new C2537k(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i, p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: k */
    public final int mo4925k() {
        return 12451000;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: n */
    public final String mo4926n() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: q */
    public final C2606d[] mo5118q() {
        return C2567y.f11491f;
    }
}
