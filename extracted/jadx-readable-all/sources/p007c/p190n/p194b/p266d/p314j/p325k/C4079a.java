package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4079a implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f23020f;

    /* JADX INFO: renamed from: g */
    public final String f23021g;

    public C4079a(IBinder iBinder, String str) {
        this.f23020f = iBinder;
        this.f23021g = str;
    }

    /* JADX INFO: renamed from: E0 */
    public final Parcel m9333E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f23021g);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m9334T1(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f23020f.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f23020f;
    }

    /* JADX INFO: renamed from: i1 */
    public final Parcel m9335i1(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f23020f.transact(i, parcel, parcelObtain, 0);
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
