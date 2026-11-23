package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.h7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3093h7 extends hg2 implements InterfaceC3130i7 {
    public AbstractBinderC3093h7() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3610v5 interfaceC3610v5;
        String strM6007q;
        double d;
        String strM6007q2;
        InterfaceC3019f7 c2945d7 = null;
        InterfaceC3345o0 c3308n0 = null;
        switch (i) {
            case 2:
                String strM6011u = ((fk0) this).f14047h.m6011u();
                parcel2.writeNoException();
                parcel2.writeString(strM6011u);
                return true;
            case 3:
                List<?> listM6012v = ((fk0) this).f14047h.m6012v();
                parcel2.writeNoException();
                parcel2.writeList(listM6012v);
                return true;
            case 4:
                String strM5997c = ((fk0) this).f14047h.m5997c();
                parcel2.writeNoException();
                parcel2.writeString(strM5997c);
                return true;
            case 5:
                bg0 bg0Var = ((fk0) this).f14047h;
                synchronized (bg0Var) {
                    interfaceC3610v5 = bg0Var.f12615o;
                }
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3610v5);
                return true;
            case 6:
                String strM5999e = ((fk0) this).f14047h.m5999e();
                parcel2.writeNoException();
                parcel2.writeString(strM5999e);
                return true;
            case 7:
                bg0 bg0Var2 = ((fk0) this).f14047h;
                synchronized (bg0Var2) {
                    strM6007q = bg0Var2.m6007q("advertiser");
                }
                parcel2.writeNoException();
                parcel2.writeString(strM6007q);
                return true;
            case 8:
                bg0 bg0Var3 = ((fk0) this).f14047h;
                synchronized (bg0Var3) {
                    d = bg0Var3.f12614n;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                bg0 bg0Var4 = ((fk0) this).f14047h;
                synchronized (bg0Var4) {
                    strM6007q2 = bg0Var4.m6007q("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(strM6007q2);
                return true;
            case 10:
                String strMo6837m = ((fk0) this).mo6837m();
                parcel2.writeNoException();
                parcel2.writeString(strMo6837m);
                return true;
            case 11:
                InterfaceC3087h1 interfaceC3087h1Mo6838p = ((fk0) this).mo6838p();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3087h1Mo6838p);
                return true;
            case 12:
                String str = ((fk0) this).f14045f;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                ((fk0) this).f14046g.mo7041b();
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC3350o5 interfaceC3350o5Mo6836l = ((fk0) this).mo6836l();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3350o5Mo6836l);
                return true;
            case 15:
                ((fk0) this).f14046g.m8633g((Bundle) ig2.m7250a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                boolean zM8634h = ((fk0) this).f14046g.m8634h((Bundle) ig2.m7250a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zM8634h ? 1 : 0);
                return true;
            case 17:
                ((fk0) this).f14046g.m8635i((Bundle) ig2.m7250a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                BinderC2800b binderC2800b = new BinderC2800b(((fk0) this).f14046g);
                parcel2.writeNoException();
                ig2.m7253d(parcel2, binderC2800b);
                return true;
            case 19:
                InterfaceC2799a interfaceC2799aM6001g = ((fk0) this).f14047h.m6001g();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC2799aM6001g);
                return true;
            case 20:
                Bundle bundleM5998d = ((fk0) this).f14047h.m5998d();
                parcel2.writeNoException();
                ig2.m7252c(parcel2, bundleM5998d);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    c2945d7 = iInterfaceQueryLocalInterface instanceof InterfaceC3019f7 ? (InterfaceC3019f7) iInterfaceQueryLocalInterface : new C2945d7(strongBinder);
                }
                ((fk0) this).m6825L6(c2945d7);
                parcel2.writeNoException();
                return true;
            case 22:
                ((fk0) this).m6826M6();
                parcel2.writeNoException();
                return true;
            case 23:
                fk0 fk0Var = (fk0) this;
                List<BinderC3606v1> listM5995a = fk0Var.m6827b0() ? fk0Var.f14047h.m5995a() : Collections.emptyList();
                parcel2.writeNoException();
                parcel2.writeList(listM5995a);
                return true;
            case 24:
                boolean zM6827b0 = ((fk0) this).m6827b0();
                parcel2.writeNoException();
                ClassLoader classLoader = ig2.f15182a;
                parcel2.writeInt(zM6827b0 ? 1 : 0);
                return true;
            case 25:
                ((fk0) this).m6819F6(AbstractBinderC3419q0.m8172F6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    c3308n0 = iInterfaceQueryLocalInterface2 instanceof InterfaceC3345o0 ? (InterfaceC3345o0) iInterfaceQueryLocalInterface2 : new C3308n0(strongBinder2);
                }
                ((fk0) this).m6820G6(c3308n0);
                parcel2.writeNoException();
                return true;
            case 27:
                ((fk0) this).m6821H6();
                parcel2.writeNoException();
                return true;
            case 28:
                ((fk0) this).m6822I6();
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC3498s5 interfaceC3498s5M8793a = ((fk0) this).f14046g.f21047A.m8793a();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3498s5M8793a);
                return true;
            case 30:
                boolean zM6823J6 = ((fk0) this).m6823J6();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ig2.f15182a;
                parcel2.writeInt(zM6823J6 ? 1 : 0);
                return true;
            case 31:
                a60 a60Var = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14413o4)).booleanValue() ? ((fk0) this).f14046g.f16669f : null;
                parcel2.writeNoException();
                ig2.m7253d(parcel2, a60Var);
                return true;
            case 32:
                ((fk0) this).m6824K6(AbstractBinderC2827a1.m5656F6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
