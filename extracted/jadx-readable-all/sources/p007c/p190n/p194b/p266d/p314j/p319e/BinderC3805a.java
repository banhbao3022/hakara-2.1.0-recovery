package p007c.p190n.p194b.p266d.p314j.p319e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p330l.p331b.AbstractBinderC4753g;
import p007c.p190n.p194b.p266d.p330l.p331b.C4758l;

/* JADX INFO: renamed from: c.n.b.d.j.e.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class BinderC3805a extends Binder implements IInterface {
    public BinderC3805a(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact;
        if (i > 16777215) {
            zOnTransact = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        AbstractBinderC4753g abstractBinderC4753g = (AbstractBinderC4753g) this;
        if (i == 3) {
        } else if (i == 4 || i == 6) {
        } else if (i == 7) {
        } else {
            if (i != 8) {
                return false;
            }
            abstractBinderC4753g.mo5550V1((C4758l) C3806b.m8922a(parcel, C4758l.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
