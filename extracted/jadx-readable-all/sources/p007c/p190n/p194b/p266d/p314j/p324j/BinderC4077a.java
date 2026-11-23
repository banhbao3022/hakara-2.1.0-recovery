package p007c.p190n.p194b.p266d.p314j.p324j;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p312i.AbstractBinderC2823c;

/* JADX INFO: renamed from: c.n.b.d.j.j.a */
/* JADX INFO: loaded from: classes.dex */
public class BinderC4077a extends Binder implements IInterface {
    public BinderC4077a(String str) {
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
        AbstractBinderC2823c abstractBinderC2823c = (AbstractBinderC2823c) this;
        if (i == 1) {
            abstractBinderC2823c.init(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 2) {
            String string = parcel.readString();
            int i3 = C4078b.f23019a;
            boolean booleanFlagValue = abstractBinderC2823c.getBooleanFlagValue(string, parcel.readInt() != 0, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
        } else if (i == 3) {
            int intFlagValue = abstractBinderC2823c.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i == 4) {
            long longFlagValue = abstractBinderC2823c.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else {
            if (i != 5) {
                return false;
            }
            String stringFlagValue = abstractBinderC2823c.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}
