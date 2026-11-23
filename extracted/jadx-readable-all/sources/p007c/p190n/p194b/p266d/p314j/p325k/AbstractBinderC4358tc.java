package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.tc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4358tc extends BinderC4373v0 implements InterfaceC4316qc {
    public AbstractBinderC4358tc() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.BinderC4373v0
    /* JADX INFO: renamed from: E0 */
    public final boolean mo9388E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ((BinderC4274nc) this).mo10100V((Bundle) C4385w.m10296a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
