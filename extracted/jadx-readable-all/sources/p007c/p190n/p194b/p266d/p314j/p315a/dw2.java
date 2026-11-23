package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.AbstractC2801c;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dw2 extends AbstractC2801c<C3641w> {
    public dw2() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // p007c.p190n.p194b.p266d.p310g.AbstractC2801c
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ C3641w mo5640a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof C3641w ? (C3641w) iInterfaceQueryLocalInterface : new C3641w(iBinder);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3604v m6536c(Context context, jw2 jw2Var, String str, InterfaceC3395pd interfaceC3395pd, int i) {
        try {
            IBinder iBinderM8601K2 = m5641b(context).m8601K2(new BinderC2800b(context), jw2Var, str, interfaceC3395pd, 210890000, i);
            if (iBinderM8601K2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM8601K2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3604v ? (InterfaceC3604v) iInterfaceQueryLocalInterface : new C3529t(iBinderM8601K2);
        } catch (RemoteException | AbstractC2801c.a e) {
            C2622l.m5358d3("Could not create remote AdManager.", e);
            return null;
        }
    }
}
