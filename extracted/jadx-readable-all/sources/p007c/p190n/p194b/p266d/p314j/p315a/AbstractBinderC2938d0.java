package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.HashMap;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p273d0.p274a.BinderC2161s;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.d0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2938d0 extends hg2 implements InterfaceC2975e0 {
    public AbstractBinderC2938d0() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3169j9 c3132i9 = null;
        switch (i) {
            case 1:
                InterfaceC3604v interfaceC3604vMo6133h6 = ((ClientApi) this).mo6133h6(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), (jw2) ig2.m7250a(parcel, jw2.CREATOR), parcel.readString(), AbstractBinderC3358od.m7996F6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3604vMo6133h6);
                return true;
            case 2:
                InterfaceC3604v interfaceC3604vMo6136q6 = ((ClientApi) this).mo6136q6(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), (jw2) ig2.m7250a(parcel, jw2.CREATOR), parcel.readString(), AbstractBinderC3358od.m7996F6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3604vMo6136q6);
                return true;
            case 3:
                InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                String string = parcel.readString();
                InterfaceC3395pd interfaceC3395pdM7996F6 = AbstractBinderC3358od.m7996F6(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                Context context = (Context) BinderC2800b.m5639T1(interfaceC2799aM5638i1);
                l31 l31Var = new l31(AbstractC3264lu.m7618c(context, interfaceC3395pdM7996F6, i3), context, string);
                parcel2.writeNoException();
                ig2.m7253d(parcel2, l31Var);
                return true;
            case 4:
                InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                parcel2.writeNoException();
                ig2.m7253d(parcel2, null);
                return true;
            case 5:
                wg0 wg0Var = new wg0((FrameLayout) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder())), (FrameLayout) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder())), 210890000);
                parcel2.writeNoException();
                ig2.m7253d(parcel2, wg0Var);
                return true;
            case 6:
                InterfaceC2799a interfaceC2799aM5638i2 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                InterfaceC3395pd interfaceC3395pdM7996F7 = AbstractBinderC3358od.m7996F6(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                Context context2 = (Context) BinderC2800b.m5639T1(interfaceC2799aM5638i2);
                C3340nw c3340nwMo7639u = AbstractC3264lu.m7618c(context2, interfaceC3395pdM7996F7, i4).mo7639u();
                Objects.requireNonNull(c3340nwMo7639u);
                Objects.requireNonNull(context2);
                c3340nwMo7639u.f17462a = context2;
                oh1 oh1VarMo4613a = c3340nwMo7639u.m7945a().f17769f.mo4613a();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, oh1VarMo4613a);
                return true;
            case 7:
                InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                parcel2.writeNoException();
                ig2.m7253d(parcel2, null);
                return true;
            case 8:
                InterfaceC2955dh interfaceC2955dhMo6135q0 = ((ClientApi) this).mo6135q0(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC2955dhMo6135q0);
                return true;
            case 9:
                BinderC2971dx binderC2971dxMo7629k = AbstractC3264lu.m7619d((Context) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder())), parcel.readInt()).mo7629k();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, binderC2971dxMo7629k);
                return true;
            case 10:
                InterfaceC3604v interfaceC3604vMo6134o1 = ((ClientApi) this).mo6134o1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), (jw2) ig2.m7250a(parcel, jw2.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3604vMo6134o1);
                return true;
            case 11:
                ug0 ug0Var = new ug0((View) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder())), (HashMap) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder())), (HashMap) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder())));
                parcel2.writeNoException();
                ig2.m7253d(parcel2, ug0Var);
                return true;
            case 12:
                InterfaceC3735yj interfaceC3735yjMo6139v4 = ((ClientApi) this).mo6139v4(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readString(), AbstractBinderC3358od.m7996F6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3735yjMo6139v4);
                return true;
            case 13:
                InterfaceC2799a interfaceC2799aM5638i3 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                String string2 = parcel.readString();
                InterfaceC3395pd interfaceC3395pdM7996F8 = AbstractBinderC3358od.m7996F6(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                Context context3 = (Context) BinderC2800b.m5639T1(interfaceC2799aM5638i3);
                C3636vv c3636vvMo7634p = AbstractC3264lu.m7618c(context3, interfaceC3395pdM7996F8, i5).mo7634p();
                Objects.requireNonNull(c3636vvMo7634p);
                Objects.requireNonNull(string2);
                c3636vvMo7634p.f20949b = string2;
                Objects.requireNonNull(context3);
                c3636vvMo7634p.f20948a = context3;
                C2622l.m5467z2(context3, Context.class);
                C2622l.m5467z2(c3636vvMo7634p.f20949b, String.class);
                C3673wv c3673wv = new C3673wv(c3636vvMo7634p.f20950c, c3636vvMo7634p.f20948a, c3636vvMo7634p.f20949b);
                zc1 zc1VarMo4613a = i5 >= ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14314a3)).intValue() ? c3673wv.f21374i.mo4613a() : c3673wv.f21371f.mo4613a();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, zc1VarMo4613a);
                return true;
            case 14:
                BinderC2161s binderC2161sMo7641w = AbstractC3264lu.m7618c((Context) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder())), AbstractBinderC3358od.m7996F6(parcel.readStrongBinder()), parcel.readInt()).mo7641w();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, binderC2161sMo7641w);
                return true;
            case 15:
                xw0 xw0VarMo7642x = AbstractC3264lu.m7618c((Context) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder())), AbstractBinderC3358od.m7996F6(parcel.readStrongBinder()), parcel.readInt()).mo7642x();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, xw0VarMo7642x);
                return true;
            case 16:
                InterfaceC2799a interfaceC2799aM5638i4 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                InterfaceC3395pd interfaceC3395pdM7996F9 = AbstractBinderC3358od.m7996F6(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    c3132i9 = iInterfaceQueryLocalInterface instanceof InterfaceC3169j9 ? (InterfaceC3169j9) iInterfaceQueryLocalInterface : new C3132i9(strongBinder);
                }
                Context context4 = (Context) BinderC2800b.m5639T1(interfaceC2799aM5638i4);
                C2970dw c2970dwMo7622b = AbstractC3264lu.m7618c(context4, interfaceC3395pdM7996F9, i6).mo7622b();
                Objects.requireNonNull(c2970dwMo7622b);
                Objects.requireNonNull(context4);
                c2970dwMo7622b.f13403a = context4;
                Objects.requireNonNull(c3132i9);
                c2970dwMo7622b.f13404b = c3132i9;
                C2622l.m5467z2(c2970dwMo7622b.f13403a, Context.class);
                C2622l.m5467z2(c2970dwMo7622b.f13404b, InterfaceC3169j9.class);
                rp0 rp0VarMo4613a = new C3118hw(c2970dwMo7622b.f13405c, c2970dwMo7622b.f13403a, c2970dwMo7622b.f13404b).f15033f.mo4613a();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, rp0VarMo4613a);
                return true;
            default:
                return false;
        }
    }
}
