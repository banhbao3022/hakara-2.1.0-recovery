package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-base@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class gg2 implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f14577f;

    /* JADX INFO: renamed from: g */
    public final String f14578g;

    public gg2(IBinder iBinder, String str) {
        this.f14577f = iBinder;
        this.f14578g = str;
    }

    /* JADX INFO: renamed from: E0 */
    public final Parcel m7001E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f14578g);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m7002T1(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f14577f.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14577f;
    }

    /* JADX INFO: renamed from: i1 */
    public final Parcel m7003i1(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f14577f.transact(i, parcel, parcelObtain, 0);
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
