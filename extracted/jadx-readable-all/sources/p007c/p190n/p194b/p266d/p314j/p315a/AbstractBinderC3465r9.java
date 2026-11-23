package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.r9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3465r9 extends hg2 implements IInterface {
    public AbstractBinderC3465r9() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ((BinderC3539t9) this).f19793f.m7286a((ParcelFileDescriptor) ig2.m7250a(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
