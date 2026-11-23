package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IInterface;

/* JADX INFO: renamed from: c.n.b.d.j.a.vg */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3621vg implements InterfaceC3590un {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3590un f20762a = new C3621vg();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3590un
    /* JADX INFO: renamed from: a */
    public final Object mo6228a(Object obj) {
        int i = en1.f13624f;
        if (obj == 0) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return iInterfaceQueryLocalInterface instanceof fn1 ? (fn1) iInterfaceQueryLocalInterface : new dn1(obj);
    }
}
