package p007c.p190n.p194b.p266d.p290d.p291r;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.r.o */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2503o extends BinderC3808a implements InterfaceC2501m0 {
    public AbstractBinderC2503o() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a
    /* JADX INFO: renamed from: E0 */
    public final boolean mo5103E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                BinderC2800b binderC2800b = new BinderC2800b(AbstractC2436h.this);
                parcel2.writeNoException();
                C4016v.m9268b(parcel2, binderC2800b);
                return true;
            case 2:
                AbstractC2436h.this.mo5009g((Bundle) C4016v.m9267a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                AbstractC2436h.this.mo5008f((Bundle) C4016v.m9267a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                int i3 = C4016v.f22903a;
                AbstractC2436h.this.mo5004a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5:
                long jMo5005b = AbstractC2436h.this.mo5005b();
                parcel2.writeNoException();
                parcel2.writeLong(jMo5005b);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                return true;
            case 7:
                AbstractC2436h.this.mo5007e((Bundle) C4016v.m9267a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                AbstractC2436h.this.mo5006d((Bundle) C4016v.m9267a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
