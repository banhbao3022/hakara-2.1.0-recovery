package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.s6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3499s6 extends hg2 implements InterfaceC3536t6 {
    public AbstractBinderC3499s6() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3129i6 c3018f6;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c3018f6 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c3018f6 = iInterfaceQueryLocalInterface instanceof InterfaceC3129i6 ? (InterfaceC3129i6) iInterfaceQueryLocalInterface : new C3018f6(strongBinder);
        }
        ((BinderC3315n7) this).mo7779W5(c3018f6);
        parcel2.writeNoException();
        return true;
    }
}
