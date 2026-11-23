package p007c.p190n.p194b.p266d.p290d.p291r;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p007c.p190n.p194b.p266d.p290d.C2372a0;
import p007c.p190n.p194b.p266d.p290d.C2389g;
import p007c.p190n.p194b.p266d.p290d.InterfaceC2415o1;
import p007c.p190n.p194b.p266d.p290d.p291r.C2426c.a;
import p007c.p190n.p194b.p266d.p290d.p295s.C2532h0;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2687r;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o;
import p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a;
import p007c.p190n.p194b.p266d.p314j.p320f.C3937m8;
import p007c.p190n.p194b.p266d.p314j.p320f.C3947n8;
import p007c.p190n.p194b.p266d.p314j.p320f.C3967p8;
import p007c.p190n.p194b.p266d.p314j.p320f.C3977q8;
import p007c.p190n.p194b.p266d.p314j.p320f.C3997s8;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4006t7;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.d.r.y */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2513y extends BinderC3808a implements InterfaceC2510v {
    public AbstractBinderC2513y() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a
    /* JADX INFO: renamed from: E0 */
    public final boolean mo5103E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC2415o1 interfaceC2415o1;
        AbstractC2634g abstractC2634gM5420q0 = null;
        if (i == 1) {
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            C2426c.c cVar = (C2426c.c) this;
            InterfaceC4006t7 interfaceC4006t7 = C2426c.this.f11175k;
            if (interfaceC4006t7 != null) {
                InterfaceC2415o1 interfaceC2415o2 = ((C3937m8) interfaceC4006t7).f22818h;
                if (interfaceC2415o2 != null) {
                    final C2372a0 c2372a0 = (C2372a0) interfaceC2415o2;
                    AbstractC2687r.a aVarM5551a = AbstractC2687r.m5551a();
                    aVarM5551a.f11748a = new InterfaceC2681o(c2372a0, string, string2) { // from class: c.n.b.d.d.g0

                        /* JADX INFO: renamed from: a */
                        public final C2372a0 f11034a;

                        /* JADX INFO: renamed from: b */
                        public final String f11035b;

                        /* JADX INFO: renamed from: c */
                        public final String f11036c;

                        {
                            this.f11034a = c2372a0;
                            this.f11035b = string;
                            this.f11036c = string2;
                        }

                        @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o
                        /* JADX INFO: renamed from: a */
                        public final void mo4950a(Object obj, Object obj2) throws RemoteException {
                            C2372a0 c2372a1 = this.f11034a;
                            String str = this.f11035b;
                            String str2 = this.f11036c;
                            c2372a1.m4943d();
                            ((InterfaceC2542m0) ((C2532h0) obj).m5581u()).mo5146x6(str, str2, null);
                            c2372a1.m4945g((C4782j) obj2);
                        }
                    };
                    abstractC2634gM5420q0 = C2622l.m5420q0(c2372a0.m5487c(1, aVarM5551a.m5553a()), C3947n8.f22823a, C3977q8.f22854a);
                }
                abstractC2634gM5420q0.mo5494d(C2426c.this.new a("joinApplication"));
            }
            parcel2.writeNoException();
        } else if (i == 2) {
            final String string3 = parcel.readString();
            final C2389g c2389g = (C2389g) C4016v.m9267a(parcel, C2389g.CREATOR);
            C2426c.c cVar2 = (C2426c.c) this;
            InterfaceC4006t7 interfaceC4006t8 = C2426c.this.f11175k;
            if (interfaceC4006t8 != null) {
                InterfaceC2415o1 interfaceC2415o3 = ((C3937m8) interfaceC4006t8).f22818h;
                if (interfaceC2415o3 != null) {
                    final C2372a0 c2372a1 = (C2372a0) interfaceC2415o3;
                    AbstractC2687r.a aVarM5551a2 = AbstractC2687r.m5551a();
                    aVarM5551a2.f11748a = new InterfaceC2681o(c2372a1, string3, c2389g) { // from class: c.n.b.d.d.h0

                        /* JADX INFO: renamed from: a */
                        public final C2372a0 f11042a;

                        /* JADX INFO: renamed from: b */
                        public final String f11043b;

                        /* JADX INFO: renamed from: c */
                        public final C2389g f11044c;

                        {
                            this.f11042a = c2372a1;
                            this.f11043b = string3;
                            this.f11044c = c2389g;
                        }

                        @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o
                        /* JADX INFO: renamed from: a */
                        public final void mo4950a(Object obj, Object obj2) throws RemoteException {
                            C2372a0 c2372a2 = this.f11042a;
                            String str = this.f11043b;
                            C2389g c2389g2 = this.f11044c;
                            c2372a2.m4943d();
                            ((InterfaceC2542m0) ((C2532h0) obj).m5581u()).mo5145r6(str, c2389g2);
                            c2372a2.m4945g((C4782j) obj2);
                        }
                    };
                    abstractC2634gM5420q0 = C2622l.m5420q0(c2372a1.m5487c(1, aVarM5551a2.m5553a()), C3967p8.f22840a, C3997s8.f22873a);
                }
                abstractC2634gM5420q0.mo5494d(C2426c.this.new a("launchApplication"));
            }
            parcel2.writeNoException();
        } else if (i == 3) {
            final String string4 = parcel.readString();
            InterfaceC4006t7 interfaceC4006t9 = C2426c.this.f11175k;
            if (interfaceC4006t9 != null && (interfaceC2415o1 = ((C3937m8) interfaceC4006t9).f22818h) != null) {
                final C2372a0 c2372a2 = (C2372a0) interfaceC2415o1;
                AbstractC2687r.a aVarM5551a3 = AbstractC2687r.m5551a();
                aVarM5551a3.f11748a = new InterfaceC2681o(c2372a2, string4) { // from class: c.n.b.d.d.j0

                    /* JADX INFO: renamed from: a */
                    public final C2372a0 f11059a;

                    /* JADX INFO: renamed from: b */
                    public final String f11060b;

                    {
                        this.f11059a = c2372a2;
                        this.f11060b = string4;
                    }

                    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o
                    /* JADX INFO: renamed from: a */
                    public final void mo4950a(Object obj, Object obj2) throws RemoteException {
                        C2372a0 c2372a3 = this.f11059a;
                        String str = this.f11060b;
                        C4782j<Status> c4782j = (C4782j) obj2;
                        c2372a3.m4943d();
                        ((InterfaceC2542m0) ((C2532h0) obj).m5581u()).mo5138I(str);
                        synchronized (c2372a3.f10988v) {
                            if (c2372a3.f10985s == null) {
                                c2372a3.f10985s = c4782j;
                            } else {
                                c4782j.f24683a.m10943p(C2372a0.m4942k(2001));
                            }
                        }
                    }
                };
                c2372a2.m5487c(1, aVarM5551a3.m5553a());
            }
            parcel2.writeNoException();
        } else if (i == 4) {
            C2426c.m5003j(C2426c.this, parcel.readInt());
            parcel2.writeNoException();
        } else {
            if (i != 5) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
