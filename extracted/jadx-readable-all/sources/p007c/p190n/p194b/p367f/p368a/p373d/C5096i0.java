package p007c.p190n.p194b.p367f.p368a.p373d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.f.a.d.i0 */
/* JADX INFO: loaded from: classes.dex */
public class C5096i0 implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f26048f;

    /* JADX INFO: renamed from: g */
    public final String f26049g;

    public C5096i0(IBinder iBinder, String str) {
        this.f26048f = iBinder;
        this.f26049g = str;
    }

    /* JADX INFO: renamed from: E0 */
    public final Parcel m11536E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f26049g);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f26048f;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m11537i1(int i, Parcel parcel) throws RemoteException {
        try {
            this.f26048f.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
