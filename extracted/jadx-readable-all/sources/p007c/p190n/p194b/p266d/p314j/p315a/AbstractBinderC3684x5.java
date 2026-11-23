package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.x5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3684x5 extends hg2 implements IInterface {
    public AbstractBinderC3684x5() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        BinderC2800b binderC2800b;
        InterfaceC3498s5 c3424q5;
        switch (i) {
            case 1:
                String string = parcel.readString();
                InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                wg0 wg0Var = (wg0) this;
                synchronized (wg0Var) {
                    wg0Var.mo8490T1(string, (View) BinderC2800b.m5639T1(interfaceC2799aM5638i1), true);
                }
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                wg0 wg0Var2 = (wg0) this;
                synchronized (wg0Var2) {
                    binderC2800b = new BinderC2800b(wg0Var2.mo8497q3(string2));
                }
                parcel2.writeNoException();
                ig2.m7253d(parcel2, binderC2800b);
                return true;
            case 3:
                InterfaceC2799a interfaceC2799aM5638i2 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                final wg0 wg0Var3 = (wg0) this;
                synchronized (wg0Var3) {
                    try {
                        if (!wg0Var3.f21094s) {
                            Object objM5639T1 = BinderC2800b.m5639T1(interfaceC2799aM5638i2);
                            if (objM5639T1 instanceof wf0) {
                                wf0 wf0Var = wg0Var3.f21089n;
                                if (wf0Var != null) {
                                    wf0Var.m8637k(wg0Var3);
                                }
                                synchronized (wg0Var3) {
                                    wg0Var3.f21086k.execute(new Runnable(wg0Var3) { // from class: c.n.b.d.j.a.vg0

                                        /* JADX INFO: renamed from: f */
                                        public final wg0 f20763f;

                                        {
                                            this.f20763f = wg0Var3;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            wg0 wg0Var4 = this.f20763f;
                                            if (wg0Var4.f21087l == null) {
                                                View view = new View(wg0Var4.f21084i.getContext());
                                                wg0Var4.f21087l = view;
                                                view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                                            }
                                            if (wg0Var4.f21084i != wg0Var4.f21087l.getParent()) {
                                                wg0Var4.f21084i.addView(wg0Var4.f21087l);
                                            }
                                        }
                                    });
                                    wf0 wf0Var2 = (wf0) objM5639T1;
                                    wg0Var3.f21089n = wf0Var2;
                                    wf0Var2.m8636j(wg0Var3);
                                    wg0Var3.f21089n.m8630d(wg0Var3.f21084i);
                                    wf0 wf0Var3 = wg0Var3.f21089n;
                                    FrameLayout frameLayout = wg0Var3.f21085j;
                                    InterfaceC2799a interfaceC2799aM6005k = wf0Var3.f21052j.m6005k();
                                    if (wf0Var3.f21055m.mo6999c() && interfaceC2799aM6005k != null && frameLayout != null) {
                                        C2330u.f10884a.f10908w.mo5887r0(interfaceC2799aM6005k, frameLayout);
                                    }
                                    if (wg0Var3.f21093r) {
                                        yf0 yf0Var = wg0Var3.f21089n.f21047A;
                                        InterfaceC3498s5 interfaceC3498s5 = wg0Var3.f21092q;
                                        synchronized (yf0Var) {
                                            yf0Var.f21864a = interfaceC3498s5;
                                        }
                                    }
                                }
                            } else {
                                C2622l.m5226A3("Not an instance of native engine. This is most likely a transient error");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                ((wg0) this).m8644c();
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 6:
                ((wg0) this).m8645q0(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC2799a interfaceC2799aM5638i3 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                wg0 wg0Var4 = (wg0) this;
                wg0Var4.onTouch(wg0Var4.f21084i, (MotionEvent) BinderC2800b.m5639T1(interfaceC2799aM5638i3));
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c3424q5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    c3424q5 = iInterfaceQueryLocalInterface instanceof InterfaceC3498s5 ? (InterfaceC3498s5) iInterfaceQueryLocalInterface : new C3424q5(strongBinder);
                }
                ((wg0) this).m8643G6(c3424q5);
                parcel2.writeNoException();
                return true;
            case 9:
                ((wg0) this).m8642F6(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
