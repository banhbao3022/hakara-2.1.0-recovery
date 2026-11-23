package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.b7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2870b7 extends hg2 implements InterfaceC2908c7 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f12534f = 0;

    public AbstractBinderC2870b7() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        boolean zMo5698t0 = mo5698t0(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
        parcel2.writeNoException();
        ClassLoader classLoader = ig2.f15182a;
        parcel2.writeInt(zMo5698t0 ? 1 : 0);
        return true;
    }
}
