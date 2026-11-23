package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.a.j1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3161j1 extends hg2 implements InterfaceC3198k1 {
    public AbstractBinderC3161j1() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ((BinderC3273m2) this).f16663f.mo4639c();
        } else if (i == 2) {
            Objects.requireNonNull(((BinderC3273m2) this).f16663f);
        } else if (i == 3) {
            ((BinderC3273m2) this).f16663f.mo4638b();
        } else if (i == 4) {
            ((BinderC3273m2) this).f16663f.mo4637a();
        } else {
            if (i != 5) {
                return false;
            }
            ClassLoader classLoader = ig2.f15182a;
            parcel.readInt();
            Objects.requireNonNull(((BinderC3273m2) this).f16663f);
        }
        parcel2.writeNoException();
        return true;
    }
}
