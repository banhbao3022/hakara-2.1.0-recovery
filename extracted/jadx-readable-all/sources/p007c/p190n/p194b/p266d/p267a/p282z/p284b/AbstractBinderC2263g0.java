package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p315a.hg2;
import p007c.p190n.p194b.p266d.p314j.p315a.ig2;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.g0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2263g0 extends hg2 implements InterfaceC2266h0 {
    public AbstractBinderC2263g0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            boolean zZze = zze(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            ClassLoader classLoader = ig2.f15182a;
            parcel2.writeInt(zZze ? 1 : 0);
        } else {
            if (i != 2) {
                return false;
            }
            zzf(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}
