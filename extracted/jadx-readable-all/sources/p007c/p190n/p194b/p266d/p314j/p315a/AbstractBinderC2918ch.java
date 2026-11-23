package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ch */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2918ch extends hg2 implements InterfaceC2955dh {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f13000f = 0;

    public AbstractBinderC2918ch() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo4686c6((Bundle) ig2.m7250a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                mo4690h();
                parcel2.writeNoException();
                return true;
            case 4:
                mo4693k();
                parcel2.writeNoException();
                return true;
            case 5:
                mo4692j();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle = (Bundle) ig2.m7250a(parcel, Bundle.CREATOR);
                mo4682Y1(bundle);
                parcel2.writeNoException();
                ig2.m7252c(parcel2, bundle);
                return true;
            case 7:
                mo4695n();
                parcel2.writeNoException();
                return true;
            case 8:
                mo4694l();
                parcel2.writeNoException();
                return true;
            case 9:
                mo4696q();
                parcel2.writeNoException();
                return true;
            case 10:
                mo4685c();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zMo4689f = mo4689f();
                parcel2.writeNoException();
                ClassLoader classLoader = ig2.f15182a;
                parcel2.writeInt(zMo4689f ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 13:
                mo4674H(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                mo4687d();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
