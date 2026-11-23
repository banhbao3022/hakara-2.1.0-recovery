package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.g1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3050g1 extends hg2 implements InterfaceC3087h1 {
    public AbstractBinderC3050g1() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* JADX INFO: renamed from: F6 */
    public static InterfaceC3087h1 m6893F6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3087h1 ? (InterfaceC3087h1) iInterfaceQueryLocalInterface : new C3013f1(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3198k1 c3124i1;
        switch (i) {
            case 1:
                mo5772c();
                parcel2.writeNoException();
                return true;
            case 2:
                mo5773d();
                parcel2.writeNoException();
                return true;
            case 3:
                ClassLoader classLoader = ig2.f15182a;
                mo5771a0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zMo5774g = mo5774g();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ig2.f15182a;
                parcel2.writeInt(zMo5774g ? 1 : 0);
                return true;
            case 5:
                int iMo5777i = mo5777i();
                parcel2.writeNoException();
                parcel2.writeInt(iMo5777i);
                return true;
            case 6:
                float fMo5776h = mo5776h();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo5776h);
                return true;
            case 7:
                float fMo5778k = mo5778k();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo5778k);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c3124i1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    c3124i1 = iInterfaceQueryLocalInterface instanceof InterfaceC3198k1 ? (InterfaceC3198k1) iInterfaceQueryLocalInterface : new C3124i1(strongBinder);
                }
                mo5775g4(c3124i1);
                parcel2.writeNoException();
                return true;
            case 9:
                float fMo5780m = mo5780m();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo5780m);
                return true;
            case 10:
                boolean zMo5782p = mo5782p();
                parcel2.writeNoException();
                ClassLoader classLoader3 = ig2.f15182a;
                parcel2.writeInt(zMo5782p ? 1 : 0);
                return true;
            case 11:
                InterfaceC3198k1 interfaceC3198k1Mo5783u = mo5783u();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3198k1Mo5783u);
                return true;
            case 12:
                boolean zMo5781n = mo5781n();
                parcel2.writeNoException();
                ClassLoader classLoader4 = ig2.f15182a;
                parcel2.writeInt(zMo5781n ? 1 : 0);
                return true;
            case 13:
                mo5779l();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
