package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.pg */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3398pg extends hg2 implements InterfaceC3435qg {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f17969f = 0;

    public AbstractBinderC3398pg() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ((xw0) this).mo8005I0((Intent) ig2.m7250a(parcel, Intent.CREATOR));
        } else if (i == 2) {
            ((xw0) this).mo8006O0(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
        } else {
            if (i != 3) {
                return false;
            }
            xw0 xw0Var = (xw0) this;
            xw0Var.f21706j.m8169a(new jw0(xw0Var.f21705i));
        }
        parcel2.writeNoException();
        return true;
    }
}
