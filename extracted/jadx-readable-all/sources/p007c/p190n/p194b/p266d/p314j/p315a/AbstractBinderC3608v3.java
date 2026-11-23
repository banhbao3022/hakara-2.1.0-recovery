package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.v3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3608v3 extends hg2 implements InterfaceC3645w3 {
    public AbstractBinderC3608v3() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String str = ((BinderC3570u3) this).f20205g;
            parcel2.writeNoException();
            parcel2.writeString(str);
        } else if (i == 2) {
            String str2 = ((BinderC3570u3) this).f20206h;
            parcel2.writeNoException();
            parcel2.writeString(str2);
        } else if (i == 3) {
            InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
            BinderC3570u3 binderC3570u3 = (BinderC3570u3) this;
            if (interfaceC2799aM5638i1 != null) {
                binderC3570u3.f20204f.mo4848c((View) BinderC2800b.m5639T1(interfaceC2799aM5638i1));
            }
            parcel2.writeNoException();
        } else if (i == 4) {
            ((BinderC3570u3) this).f20204f.mo4846a();
            parcel2.writeNoException();
        } else {
            if (i != 5) {
                return false;
            }
            ((BinderC3570u3) this).f20204f.mo4847b();
            parcel2.writeNoException();
        }
        return true;
    }
}
