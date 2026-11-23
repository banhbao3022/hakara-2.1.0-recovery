package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.d6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2944d6 extends hg2 implements InterfaceC2981e6 {
    public AbstractBinderC2944d6() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3610v5 interfaceC3610v5;
        String strM6007q;
        switch (i) {
            case 2:
                BinderC2800b binderC2800b = new BinderC2800b(((ak0) this).f12189g);
                parcel2.writeNoException();
                ig2.m7253d(parcel2, binderC2800b);
                return true;
            case 3:
                String strM6011u = ((ak0) this).f12190h.m6011u();
                parcel2.writeNoException();
                parcel2.writeString(strM6011u);
                return true;
            case 4:
                List<?> listM6012v = ((ak0) this).f12190h.m6012v();
                parcel2.writeNoException();
                parcel2.writeList(listM6012v);
                return true;
            case 5:
                String strM5997c = ((ak0) this).f12190h.m5997c();
                parcel2.writeNoException();
                parcel2.writeString(strM5997c);
                return true;
            case 6:
                bg0 bg0Var = ((ak0) this).f12190h;
                synchronized (bg0Var) {
                    interfaceC3610v5 = bg0Var.f12616p;
                }
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3610v5);
                return true;
            case 7:
                String strM5999e = ((ak0) this).f12190h.m5999e();
                parcel2.writeNoException();
                parcel2.writeString(strM5999e);
                return true;
            case 8:
                bg0 bg0Var2 = ((ak0) this).f12190h;
                synchronized (bg0Var2) {
                    strM6007q = bg0Var2.m6007q("advertiser");
                }
                parcel2.writeNoException();
                parcel2.writeString(strM6007q);
                return true;
            case 9:
                Bundle bundleM5998d = ((ak0) this).f12190h.m5998d();
                parcel2.writeNoException();
                ig2.m7252c(parcel2, bundleM5998d);
                return true;
            case 10:
                ((ak0) this).f12189g.mo7041b();
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC3087h1 interfaceC3087h1M6009s = ((ak0) this).f12190h.m6009s();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3087h1M6009s);
                return true;
            case 12:
                ((ak0) this).f12189g.m8633g((Bundle) ig2.m7250a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zM8634h = ((ak0) this).f12189g.m8634h((Bundle) ig2.m7250a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zM8634h ? 1 : 0);
                return true;
            case 14:
                ((ak0) this).f12189g.m8635i((Bundle) ig2.m7250a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC3350o5 interfaceC3350o5M6010t = ((ak0) this).f12190h.m6010t();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3350o5M6010t);
                return true;
            case 16:
                InterfaceC2799a interfaceC2799aM6001g = ((ak0) this).f12190h.m6001g();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC2799aM6001g);
                return true;
            case 17:
                String str = ((ak0) this).f12188f;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
