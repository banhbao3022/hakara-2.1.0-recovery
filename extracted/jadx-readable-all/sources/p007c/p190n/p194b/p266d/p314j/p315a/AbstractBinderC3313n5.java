package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.a.n5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3313n5 extends hg2 implements InterfaceC3350o5 {
    public AbstractBinderC3313n5() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* JADX INFO: renamed from: F6 */
    public static InterfaceC3350o5 m7778F6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3350o5 ? (InterfaceC3350o5) iInterfaceQueryLocalInterface : new C3276m5(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String str = ((BinderC2980e5) this).f13497j;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        }
        if (i != 3) {
            return false;
        }
        List<InterfaceC3610v5> list = ((BinderC2980e5) this).f13499l;
        parcel2.writeNoException();
        parcel2.writeList(list);
        return true;
    }
}
