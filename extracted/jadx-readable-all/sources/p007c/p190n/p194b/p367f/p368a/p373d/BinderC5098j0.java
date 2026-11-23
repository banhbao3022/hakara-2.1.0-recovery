package p007c.p190n.p194b.p367f.p368a.p373d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.f.a.d.j0 */
/* JADX INFO: loaded from: classes.dex */
public class BinderC5098j0 extends Binder implements IInterface {
    public BinderC5098j0(String str) {
        attachInterface(this, str);
    }

    /* JADX INFO: renamed from: E0 */
    public boolean mo11528E0(int i, Parcel parcel) throws RemoteException {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo11528E0(i, parcel);
    }
}
