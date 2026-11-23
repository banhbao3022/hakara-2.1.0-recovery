package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.r5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3461r5 extends hg2 implements InterfaceC3498s5 {
    public AbstractBinderC3461r5() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        float f;
        int i3 = 0;
        C3573u6 c3573u6 = null;
        float fMo5780m = 0.0f;
        switch (i) {
            case 2:
                nf0 nf0Var = (nf0) this;
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14254Q3)).booleanValue()) {
                    bg0 bg0Var = nf0Var.f17085f;
                    synchronized (bg0Var) {
                        f = bg0Var.f12620t;
                    }
                    if (f != 0.0f) {
                        bg0 bg0Var2 = nf0Var.f17085f;
                        synchronized (bg0Var2) {
                            fMo5780m = bg0Var2.f12620t;
                        }
                    } else if (nf0Var.f17085f.m6009s() != null) {
                        try {
                            fMo5780m = nf0Var.f17085f.m6009s().mo5780m();
                        } catch (RemoteException e) {
                            C2622l.m5438t3("Remote exception getting video controller aspect ratio.", e);
                        }
                        break;
                    } else {
                        InterfaceC2799a interfaceC2799a = nf0Var.f17086g;
                        if (interfaceC2799a != null) {
                            fMo5780m = nf0.m7857F6(interfaceC2799a);
                        } else {
                            InterfaceC3610v5 interfaceC3610v5M6013w = nf0Var.f17085f.m6013w();
                            if (interfaceC3610v5M6013w != null) {
                                float fMo7058c = (interfaceC3610v5M6013w.mo7058c() == -1 || interfaceC3610v5M6013w.mo7059d() == -1) ? 0.0f : interfaceC3610v5M6013w.mo7058c() / interfaceC3610v5M6013w.mo7059d();
                                fMo5780m = fMo7058c == 0.0f ? nf0.m7857F6(interfaceC3610v5M6013w.mo7056a()) : fMo7058c;
                            }
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(fMo5780m);
                return true;
            case 3:
                ((nf0) this).f17086g = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC2799a interfaceC2799aMo7858f = ((nf0) this).mo7858f();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC2799aMo7858f);
                return true;
            case 5:
                nf0 nf0Var2 = (nf0) this;
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14260R3)).booleanValue() && nf0Var2.f17085f.m6009s() != null) {
                    fMo5780m = nf0Var2.f17085f.m6009s().mo5776h();
                }
                parcel2.writeNoException();
                parcel2.writeFloat(fMo5780m);
                return true;
            case 6:
                nf0 nf0Var3 = (nf0) this;
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14260R3)).booleanValue() && nf0Var3.f17085f.m6009s() != null) {
                    fMo5780m = nf0Var3.f17085f.m6009s().mo5778k();
                }
                parcel2.writeNoException();
                parcel2.writeFloat(fMo5780m);
                return true;
            case 7:
                InterfaceC3087h1 interfaceC3087h1M6009s = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14260R3)).booleanValue() ? ((nf0) this).f17085f.m6009s() : null;
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3087h1M6009s);
                return true;
            case 8:
                nf0 nf0Var4 = (nf0) this;
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14260R3)).booleanValue() && nf0Var4.f17085f.m6009s() != null) {
                    i3 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader = ig2.f15182a;
                parcel2.writeInt(i3);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    c3573u6 = iInterfaceQueryLocalInterface instanceof C3573u6 ? (C3573u6) iInterfaceQueryLocalInterface : new C3573u6(strongBinder);
                }
                nf0 nf0Var5 = (nf0) this;
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14260R3)).booleanValue() && (nf0Var5.f17085f.m6009s() instanceof BinderC3263lt)) {
                    BinderC3263lt binderC3263lt = (BinderC3263lt) nf0Var5.f17085f.m6009s();
                    synchronized (binderC3263lt.f16489g) {
                        binderC3263lt.f16501s = c3573u6;
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
