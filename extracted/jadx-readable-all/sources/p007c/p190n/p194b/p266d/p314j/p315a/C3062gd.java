package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IInterface;

/* JADX INFO: renamed from: c.n.b.d.j.a.gd */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3062gd implements InterfaceC3590un {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3590un f14533a = new C3062gd();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3590un
    /* JADX INFO: renamed from: a */
    public final Object mo6228a(Object obj) {
        int i = AbstractBinderC3153iu.f15387f;
        if (obj == 0) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3227ku ? (InterfaceC3227ku) iInterfaceQueryLocalInterface : new C3116hu(obj);
    }
}
