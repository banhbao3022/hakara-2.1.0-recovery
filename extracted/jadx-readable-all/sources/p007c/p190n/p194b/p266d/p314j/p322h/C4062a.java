package p007c.p190n.p194b.p266d.p314j.p322h;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.h.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4062a implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f23007f;

    /* JADX INFO: renamed from: g */
    public final String f23008g;

    public C4062a(IBinder iBinder, String str) {
        this.f23007f = iBinder;
        this.f23008g = str;
    }

    /* JADX INFO: renamed from: E0 */
    public final Parcel m9327E0(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f23007f.transact(i, parcel, parcelObtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23007f;
    }

    /* JADX INFO: renamed from: i1 */
    public final Parcel m9328i1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f23008g);
        return parcelObtain;
    }
}
