package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p194b.p266d.p267a.C2193t;
import p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2201d;
import p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.j7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3167j7 extends AbstractC2205h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3130i7 f15497a;

    /* JADX INFO: renamed from: c */
    public final C3647w5 f15499c;

    /* JADX INFO: renamed from: b */
    public final List<AbstractC2201d> f15498b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final C2193t f15500d = new C2193t();

    /* JADX INFO: renamed from: e */
    public final List<?> f15501e = new ArrayList();

    public C3167j7(InterfaceC3130i7 interfaceC3130i7) {
        InterfaceC3610v5 c3535t5;
        IBinder iBinder;
        this.f15497a = interfaceC3130i7;
        C3647w5 c3647w5 = null;
        try {
            List listMo6829d = interfaceC3130i7.mo6829d();
            if (listMo6829d != null) {
                for (Object obj : listMo6829d) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        c3535t5 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        c3535t5 = iInterfaceQueryLocalInterface instanceof InterfaceC3610v5 ? (InterfaceC3610v5) iInterfaceQueryLocalInterface : new C3535t5(iBinder);
                    }
                    if (c3535t5 != null) {
                        this.f15498b.add(new C3647w5(c3535t5));
                    }
                }
            }
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
        try {
            List listMo6839v = this.f15497a.mo6839v();
            if (listMo6839v != null) {
                for (Object obj2 : listMo6839v) {
                    InterfaceC3456r0 interfaceC3456r0M8172F6 = obj2 instanceof IBinder ? AbstractBinderC3419q0.m8172F6((IBinder) obj2) : null;
                    if (interfaceC3456r0M8172F6 != null) {
                        this.f15501e.add(new C3493s0(interfaceC3456r0M8172F6));
                    }
                }
            }
        } catch (RemoteException e2) {
            C2622l.m5438t3("", e2);
        }
        try {
            InterfaceC3610v5 interfaceC3610v5Mo6831g = this.f15497a.mo6831g();
            if (interfaceC3610v5Mo6831g != null) {
                c3647w5 = new C3647w5(interfaceC3610v5Mo6831g);
            }
        } catch (RemoteException e3) {
            C2622l.m5438t3("", e3);
        }
        this.f15499c = c3647w5;
        try {
            if (this.f15497a.mo6836l() != null) {
                new C3387p5(this.f15497a.mo6836l());
            }
        } catch (RemoteException e4) {
            C2622l.m5438t3("", e4);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h
    /* JADX INFO: renamed from: a */
    public final String mo4645a() {
        try {
            return this.f15497a.mo6832h();
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h
    /* JADX INFO: renamed from: b */
    public final String mo4646b() {
        try {
            return this.f15497a.mo6830f();
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h
    /* JADX INFO: renamed from: c */
    public final String mo4647c() {
        try {
            return this.f15497a.mo6833i();
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h
    /* JADX INFO: renamed from: d */
    public final String mo4648d() {
        try {
            return this.f15497a.mo6828c();
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h
    /* JADX INFO: renamed from: e */
    public final AbstractC2201d mo4649e() {
        return this.f15499c;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h
    /* JADX INFO: renamed from: f */
    public final List<AbstractC2201d> mo4650f() {
        return this.f15498b;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h
    /* JADX INFO: renamed from: g */
    public final String mo4651g() {
        try {
            return this.f15497a.mo6837m();
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h
    /* JADX INFO: renamed from: h */
    public final Double mo4652h() {
        try {
            double dMo6835k = this.f15497a.mo6835k();
            if (dMo6835k == -1.0d) {
                return null;
            }
            return Double.valueOf(dMo6835k);
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h
    /* JADX INFO: renamed from: i */
    public final String mo4653i() {
        try {
            return this.f15497a.mo6834j();
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h
    /* JADX INFO: renamed from: j */
    public final C2193t mo4654j() {
        try {
            if (this.f15497a.mo6838p() != null) {
                this.f15500d.m4636b(this.f15497a.mo6838p());
            }
        } catch (RemoteException e) {
            C2622l.m5438t3("Exception occurred while getting video controller", e);
        }
        return this.f15500d;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h
    /* JADX INFO: renamed from: k */
    public final Object mo4655k() {
        try {
            InterfaceC2799a interfaceC2799aMo6818C = this.f15497a.mo6818C();
            if (interfaceC2799aMo6818C != null) {
                return BinderC2800b.m5639T1(interfaceC2799aMo6818C);
            }
            return null;
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
            return null;
        }
    }
}
