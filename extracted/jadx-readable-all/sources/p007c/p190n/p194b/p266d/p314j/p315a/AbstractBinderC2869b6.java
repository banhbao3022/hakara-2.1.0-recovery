package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.b6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2869b6 extends hg2 implements InterfaceC2907c6 {
    public AbstractBinderC2869b6() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3610v5 interfaceC3610v5;
        double d;
        String strM6007q;
        String strM6007q2;
        switch (i) {
            case 2:
                BinderC2800b binderC2800b = new BinderC2800b(((yj0) this).f21903g);
                parcel2.writeNoException();
                ig2.m7253d(parcel2, binderC2800b);
                return true;
            case 3:
                String strM6011u = ((yj0) this).f21904h.m6011u();
                parcel2.writeNoException();
                parcel2.writeString(strM6011u);
                return true;
            case 4:
                List<?> listM6012v = ((yj0) this).f21904h.m6012v();
                parcel2.writeNoException();
                parcel2.writeList(listM6012v);
                return true;
            case 5:
                String strM5997c = ((yj0) this).f21904h.m5997c();
                parcel2.writeNoException();
                parcel2.writeString(strM5997c);
                return true;
            case 6:
                bg0 bg0Var = ((yj0) this).f21904h;
                synchronized (bg0Var) {
                    interfaceC3610v5 = bg0Var.f12615o;
                }
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3610v5);
                return true;
            case 7:
                String strM5999e = ((yj0) this).f21904h.m5999e();
                parcel2.writeNoException();
                parcel2.writeString(strM5999e);
                return true;
            case 8:
                bg0 bg0Var2 = ((yj0) this).f21904h;
                synchronized (bg0Var2) {
                    d = bg0Var2.f12614n;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                bg0 bg0Var3 = ((yj0) this).f21904h;
                synchronized (bg0Var3) {
                    strM6007q = bg0Var3.m6007q("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(strM6007q);
                return true;
            case 10:
                bg0 bg0Var4 = ((yj0) this).f21904h;
                synchronized (bg0Var4) {
                    strM6007q2 = bg0Var4.m6007q("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strM6007q2);
                return true;
            case 11:
                Bundle bundleM5998d = ((yj0) this).f21904h.m5998d();
                parcel2.writeNoException();
                ig2.m7252c(parcel2, bundleM5998d);
                return true;
            case 12:
                ((yj0) this).f21903g.mo7041b();
                parcel2.writeNoException();
                return true;
            case 13:
                InterfaceC3087h1 interfaceC3087h1M6009s = ((yj0) this).f21904h.m6009s();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3087h1M6009s);
                return true;
            case 14:
                ((yj0) this).f21903g.m8633g((Bundle) ig2.m7250a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zM8634h = ((yj0) this).f21903g.m8634h((Bundle) ig2.m7250a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zM8634h ? 1 : 0);
                return true;
            case 16:
                ((yj0) this).f21903g.m8635i((Bundle) ig2.m7250a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                InterfaceC3350o5 interfaceC3350o5M6010t = ((yj0) this).f21904h.m6010t();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3350o5M6010t);
                return true;
            case 18:
                InterfaceC2799a interfaceC2799aM6001g = ((yj0) this).f21904h.m6001g();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC2799aM6001g);
                return true;
            case 19:
                String str = ((yj0) this).f21902f;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
