package p007c.p190n.p194b.p266d.p314j.p326l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.l.e */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public class C4441e implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f23685f;

    public C4441e(IBinder iBinder) {
        this.f23685f = iBinder;
    }

    /* JADX INFO: renamed from: E0 */
    public final Parcel m10367E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23685f;
    }

    /* JADX INFO: renamed from: i1 */
    public final Parcel m10368i1(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f23685f.transact(i, parcel, parcelObtain, 0);
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
}
