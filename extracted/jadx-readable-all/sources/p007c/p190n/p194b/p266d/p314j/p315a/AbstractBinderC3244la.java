package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.la */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3244la extends hg2 implements InterfaceC3281ma {
    public AbstractBinderC3244la() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        yf0 yf0Var;
        InterfaceC3087h1 interfaceC3087h1 = null;
        interfaceC3498s5M8793a = null;
        interfaceC3498s5M8793a = null;
        InterfaceC3498s5 interfaceC3498s5M8793a = null;
        InterfaceC3429qa c3318na = null;
        if (i == 3) {
            wj0 wj0Var = (wj0) this;
            C2622l.m5354d("#008 Must be called on the main UI thread.");
            if (wj0Var.f21139i) {
                C2622l.m5408n3("getVideoController: Instream ad should not be used after destroyed");
            } else {
                interfaceC3087h1 = wj0Var.f21137g;
            }
            parcel2.writeNoException();
            ig2.m7253d(parcel2, interfaceC3087h1);
            return true;
        }
        if (i == 4) {
            ((wj0) this).m8655b();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                c3318na = iInterfaceQueryLocalInterface instanceof InterfaceC3429qa ? (InterfaceC3429qa) iInterfaceQueryLocalInterface : new C3318na(strongBinder);
            }
            ((wj0) this).m8654F6(interfaceC2799aM5638i1, c3318na);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            InterfaceC2799a interfaceC2799aM5638i2 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
            C2622l.m5354d("#008 Must be called on the main UI thread.");
            ((wj0) this).m8654F6(interfaceC2799aM5638i2, new vj0());
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        wj0 wj0Var2 = (wj0) this;
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        if (wj0Var2.f21139i) {
            C2622l.m5408n3("getVideoController: Instream ad should not be used after destroyed");
        } else {
            wf0 wf0Var = wj0Var2.f21138h;
            if (wf0Var != null && (yf0Var = wf0Var.f21047A) != null) {
                interfaceC3498s5M8793a = yf0Var.m8793a();
            }
        }
        parcel2.writeNoException();
        ig2.m7253d(parcel2, interfaceC3498s5M8793a);
        return true;
    }
}
