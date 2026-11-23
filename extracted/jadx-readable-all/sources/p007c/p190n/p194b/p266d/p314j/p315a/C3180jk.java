package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IInterface;

/* JADX INFO: renamed from: c.n.b.d.j.a.jk */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3180jk implements InterfaceC3590un {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3590un f15604a = new C3180jk();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3590un
    /* JADX INFO: renamed from: a */
    public final Object mo6228a(Object obj) {
        if (obj == 0) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return iInterfaceQueryLocalInterface instanceof C2921ck ? (C2921ck) iInterfaceQueryLocalInterface : new C2921ck(obj);
    }
}
