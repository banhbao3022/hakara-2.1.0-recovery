package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.AbstractC2185l;

/* JADX INFO: renamed from: c.n.b.d.j.a.h0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3086h0 extends hg2 implements InterfaceC3123i0 {
    public AbstractBinderC3086h0() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            yv2 yv2Var = (yv2) ig2.m7250a(parcel, yv2.CREATOR);
            AbstractC2185l abstractC2185l = ((BinderC2900c) this).f12901f;
            if (abstractC2185l != null) {
                abstractC2185l.mo4630b(yv2Var.m8836H());
            }
        } else if (i == 2) {
            AbstractC2185l abstractC2185l2 = ((BinderC2900c) this).f12901f;
            if (abstractC2185l2 != null) {
                abstractC2185l2.mo2743c();
            }
        } else if (i == 3) {
            AbstractC2185l abstractC2185l3 = ((BinderC2900c) this).f12901f;
            if (abstractC2185l3 != null) {
                abstractC2185l3.mo2742a();
            }
        } else {
            if (i != 4) {
                return false;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
