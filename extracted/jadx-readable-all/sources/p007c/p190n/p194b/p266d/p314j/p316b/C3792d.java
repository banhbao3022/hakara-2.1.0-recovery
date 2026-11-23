package p007c.p190n.p194b.p266d.p314j.p316b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3792d implements InterfaceC3790b, IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f22461f;

    /* JADX INFO: renamed from: g */
    public final String f22462g = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public C3792d(IBinder iBinder) {
        this.f22461f = iBinder;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p316b.InterfaceC3790b
    /* JADX INFO: renamed from: D2 */
    public final boolean mo8915D2(boolean z) throws RemoteException {
        Parcel parcelM8918E0 = m8918E0();
        int i = C3789a.f22459a;
        parcelM8918E0.writeInt(1);
        Parcel parcelM8919i1 = m8919i1(2, parcelM8918E0);
        boolean z2 = parcelM8919i1.readInt() != 0;
        parcelM8919i1.recycle();
        return z2;
    }

    /* JADX INFO: renamed from: E0 */
    public final Parcel m8918E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f22462g);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f22461f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p316b.InterfaceC3790b
    /* JADX INFO: renamed from: b */
    public final boolean mo8916b() throws RemoteException {
        Parcel parcelM8919i1 = m8919i1(6, m8918E0());
        int i = C3789a.f22459a;
        boolean z = parcelM8919i1.readInt() != 0;
        parcelM8919i1.recycle();
        return z;
    }

    /* JADX INFO: renamed from: i1 */
    public final Parcel m8919i1(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f22461f.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p316b.InterfaceC3790b
    /* JADX INFO: renamed from: w */
    public final String mo8917w() throws RemoteException {
        Parcel parcelM8919i1 = m8919i1(1, m8918E0());
        String string = parcelM8919i1.readString();
        parcelM8919i1.recycle();
        return string;
    }
}
