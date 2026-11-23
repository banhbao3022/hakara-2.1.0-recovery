package p007c.p190n.p194b.p266d.p290d.p291r;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.r.n */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2502n extends BinderC3808a implements IInterface {
    public AbstractBinderC2502n() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a
    /* JADX INFO: renamed from: E0 */
    public final boolean mo5103E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            AbstractC2436h abstractC2436hMo5034a = AbstractC2442k.this.mo5034a(parcel.readString());
            InterfaceC2799a interfaceC2799aM5027h = abstractC2436hMo5034a == null ? null : abstractC2436hMo5034a.m5027h();
            parcel2.writeNoException();
            C4016v.m9268b(parcel2, interfaceC2799aM5027h);
        } else if (i == 2) {
            boolean zMo5035b = AbstractC2442k.this.mo5035b();
            parcel2.writeNoException();
            int i3 = C4016v.f22903a;
            parcel2.writeInt(zMo5035b ? 1 : 0);
        } else if (i == 3) {
            String str = AbstractC2442k.this.f11195b;
            parcel2.writeNoException();
            parcel2.writeString(str);
        } else {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
