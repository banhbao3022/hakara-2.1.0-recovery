package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4093b extends BinderC4373v0 implements InterfaceC4107c {
    public AbstractBinderC4093b() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.BinderC4373v0
    /* JADX INFO: renamed from: E0 */
    public final boolean mo9388E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ((C4177h.c) this).mo9492V3(parcel.readString(), parcel.readString(), (Bundle) C4385w.m10296a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int iZza = ((C4177h.c) this).zza();
            parcel2.writeNoException();
            parcel2.writeInt(iZza);
        }
        return true;
    }
}
