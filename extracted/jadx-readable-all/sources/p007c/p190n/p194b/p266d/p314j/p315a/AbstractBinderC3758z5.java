package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.z5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3758z5 extends hg2 implements IInterface {
    public AbstractBinderC3758z5() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
            ug0 ug0Var = (ug0) this;
            synchronized (ug0Var) {
                Object objM5639T1 = BinderC2800b.m5639T1(interfaceC2799aM5638i1);
                if (objM5639T1 instanceof wf0) {
                    wf0 wf0Var = ug0Var.f20308j;
                    if (wf0Var != null) {
                        wf0Var.m8637k(ug0Var);
                    }
                    wf0 wf0Var2 = (wf0) objM5639T1;
                    if (wf0Var2.f21055m.mo6998b()) {
                        ug0Var.f20308j = wf0Var2;
                        wf0Var2.m8636j(ug0Var);
                        ug0Var.f20308j.m8630d(ug0Var.mo8489K2());
                    } else {
                        C2622l.m5408n3("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                } else {
                    C2622l.m5226A3("Not an instance of InternalNativeAd. This is most likely a transient error");
                }
            }
        } else if (i == 2) {
            ug0 ug0Var2 = (ug0) this;
            synchronized (ug0Var2) {
                wf0 wf0Var3 = ug0Var2.f20308j;
                if (wf0Var3 != null) {
                    wf0Var3.m8637k(ug0Var2);
                    ug0Var2.f20308j = null;
                }
            }
        } else {
            if (i != 3) {
                return false;
            }
            InterfaceC2799a interfaceC2799aM5638i2 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
            ug0 ug0Var3 = (ug0) this;
            synchronized (ug0Var3) {
                if (ug0Var3.f20308j != null) {
                    Object objM5639T2 = BinderC2800b.m5639T1(interfaceC2799aM5638i2);
                    if (!(objM5639T2 instanceof View)) {
                        C2622l.m5226A3("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                    }
                    wf0 wf0Var4 = ug0Var3.f20308j;
                    View view = (View) objM5639T2;
                    synchronized (wf0Var4) {
                        wf0Var4.f21053k.mo5751j(view);
                    }
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
