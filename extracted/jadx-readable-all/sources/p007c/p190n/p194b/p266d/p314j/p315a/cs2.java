package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cs2 implements InterfaceC3590un {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3590un f13116a = new cs2();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3590un
    /* JADX INFO: renamed from: a */
    public final Object mo6228a(Object obj) {
        int i = kg2.f15941f;
        if (obj == 0) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterfaceQueryLocalInterface instanceof lg2 ? (lg2) iInterfaceQueryLocalInterface : new jg2(obj);
    }
}
