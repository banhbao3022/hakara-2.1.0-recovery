package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.u5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3572u5 extends hg2 implements InterfaceC3610v5 {
    public AbstractBinderC3572u5() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* JADX INFO: renamed from: F6 */
    public static InterfaceC3610v5 m8470F6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3610v5 ? (InterfaceC3610v5) iInterfaceQueryLocalInterface : new C3535t5(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            InterfaceC2799a interfaceC2799aMo7056a = ((BinderC3091h5) this).mo7056a();
            parcel2.writeNoException();
            ig2.m7253d(parcel2, interfaceC2799aMo7056a);
        } else if (i == 2) {
            Uri uri = ((BinderC3091h5) this).f14760g;
            parcel2.writeNoException();
            ig2.m7252c(parcel2, uri);
        } else if (i == 3) {
            double d = ((BinderC3091h5) this).f14761h;
            parcel2.writeNoException();
            parcel2.writeDouble(d);
        } else if (i == 4) {
            int i3 = ((BinderC3091h5) this).f14762i;
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else {
            if (i != 5) {
                return false;
            }
            int i4 = ((BinderC3091h5) this).f14763j;
            parcel2.writeNoException();
            parcel2.writeInt(i4);
        }
        return true;
    }
}
