package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p322h.BinderC4063b;
import p007c.p190n.p194b.p266d.p314j.p322h.C4064c;

/* JADX INFO: renamed from: c.n.b.d.f.q.i0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2736i0 extends BinderC4063b implements InterfaceC2747n {
    public AbstractBinderC2736i0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p322h.BinderC4063b
    /* JADX INFO: renamed from: E0 */
    public final boolean mo5598E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) C4064c.m9329a(parcel, Bundle.CREATOR);
            BinderC2756r0 binderC2756r0 = (BinderC2756r0) this;
            C2622l.m5379i(binderC2756r0.f11903f, "onPostInitComplete can be called only once per call to getRemoteService");
            binderC2756r0.f11903f.mo5137w(i3, strongBinder, bundle, binderC2756r0.f11904g);
            binderC2756r0.f11903f = null;
        } else if (i == 2) {
            parcel.readInt();
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            C2766w0 c2766w0 = (C2766w0) C4064c.m9329a(parcel, C2766w0.CREATOR);
            BinderC2756r0 binderC2756r1 = (BinderC2756r0) this;
            AbstractC2717c abstractC2717c = binderC2756r1.f11903f;
            C2622l.m5379i(abstractC2717c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            Objects.requireNonNull(c2766w0, "null reference");
            abstractC2717c.f11820v = c2766w0;
            Bundle bundle2 = c2766w0.f11927f;
            C2622l.m5379i(binderC2756r1.f11903f, "onPostInitComplete can be called only once per call to getRemoteService");
            binderC2756r1.f11903f.mo5137w(i4, strongBinder2, bundle2, binderC2756r1.f11904g);
            binderC2756r1.f11903f = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
