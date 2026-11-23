package p007c.p190n.p194b.p266d.p290d.p295s;

import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p290d.C2380d;
import p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.s.i */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2533i extends BinderC3808a implements InterfaceC2527f {
    public AbstractBinderC2533i() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a
    /* JADX INFO: renamed from: E0 */
    public final boolean mo5103E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo4970A(parcel.readInt());
                return true;
            case 2:
                mo4980l0((C2380d) C4016v.m9267a(parcel, C2380d.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                return true;
            case 3:
                mo4977d0(parcel.readInt());
                return true;
            case 4:
                String string = parcel.readString();
                double d = parcel.readDouble();
                int i3 = C4016v.f22903a;
                mo4978h1(string, d, parcel.readInt() != 0);
                return true;
            case 5:
                mo4972C0(parcel.readString(), parcel.readString());
                return true;
            case 6:
                mo4976Z3(parcel.readString(), parcel.createByteArray());
                return true;
            case 7:
                mo4971A0(parcel.readInt());
                return true;
            case 8:
                mo4982x0(parcel.readInt());
                return true;
            case 9:
                mo4974U5(parcel.readInt());
                return true;
            case 10:
                mo4984z2(parcel.readString(), parcel.readLong(), parcel.readInt());
                return true;
            case 11:
                mo4979k6(parcel.readString(), parcel.readLong());
                return true;
            case 12:
                mo4981n3((C2550u) C4016v.m9267a(parcel, C2550u.CREATOR));
                return true;
            case 13:
                mo4973E4((C2536j0) C4016v.m9267a(parcel, C2536j0.CREATOR));
                return true;
            case 14:
                mo4983y(parcel.readInt());
                return true;
            case 15:
                mo4975Y(parcel.readInt());
                return true;
            default:
                return false;
        }
    }
}
