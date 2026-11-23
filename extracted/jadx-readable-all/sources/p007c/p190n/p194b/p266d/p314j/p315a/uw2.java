package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uw2 implements InterfaceC3590un {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3590un f20669a = new uw2();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3590un
    /* JADX INFO: renamed from: a */
    public final Object mo6228a(Object obj) {
        int i = AbstractBinderC3478rm.f18949f;
        if (obj == 0) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3515sm ? (InterfaceC3515sm) iInterfaceQueryLocalInterface : new C3441qm(obj);
    }
}
