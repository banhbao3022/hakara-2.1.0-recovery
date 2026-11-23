package p007c.p190n.p194b.p266d.p314j.p320f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.f.s */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C3988s implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f22867f;

    /* JADX INFO: renamed from: g */
    public final String f22868g;

    public C3988s(IBinder iBinder, String str) {
        this.f22867f = iBinder;
        this.f22868g = str;
    }

    /* JADX INFO: renamed from: E0 */
    public final Parcel m9209E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f22868g);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: K2 */
    public final void m9210K2(int i, Parcel parcel) throws RemoteException {
        try {
            this.f22867f.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final void m9211T1(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f22867f.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f22867f;
    }

    /* JADX INFO: renamed from: i1 */
    public final Parcel m9212i1(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f22867f.transact(i, parcel, parcelObtain, 0);
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
