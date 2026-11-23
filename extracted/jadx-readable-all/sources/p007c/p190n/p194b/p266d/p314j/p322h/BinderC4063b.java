package p007c.p190n.p194b.p266d.p314j.p322h;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.h.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class BinderC4063b extends Binder implements IInterface {
    public BinderC4063b(String str) {
        attachInterface(this, str);
    }

    /* JADX INFO: renamed from: E0 */
    public boolean mo5598E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        return false;
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
        return mo5598E0(i, parcel, parcel2, i2);
    }
}
