package p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i;

import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.i.l */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2471l extends BinderC3808a implements InterfaceC2468i {
    public AbstractBinderC2471l() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a
    /* JADX INFO: renamed from: E0 */
    public final boolean mo5103E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ((BinderC2465f) this).f11320f.publishProgress(Long.valueOf(parcel.readLong()), Long.valueOf(parcel.readLong()));
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
