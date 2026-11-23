package p007c.p190n.p194b.p266d.p290d.p291r;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p266d.p290d.BinderC2405l0;
import p007c.p190n.p194b.p266d.p290d.C2372a0;
import p007c.p190n.p194b.p266d.p290d.C2375b0;
import p007c.p190n.p194b.p266d.p290d.C2380d;
import p007c.p190n.p194b.p266d.p290d.C2383e;
import p007c.p190n.p194b.p266d.p290d.C2567y;
import p007c.p190n.p194b.p266d.p290d.InterfaceC2415o1;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2444a;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i.C2460a;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i.C2470k;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p290d.p295s.C2522c0;
import p007c.p190n.p194b.p266d.p290d.p295s.C2532h0;
import p007c.p190n.p194b.p266d.p290d.p295s.C2539l;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2639l;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2659g;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2666i0;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2669j0;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2671k;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2675l0;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2679n;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2680n0;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2704z0;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o;
import p007c.p190n.p194b.p266d.p314j.p320f.C3818b;
import p007c.p190n.p194b.p266d.p314j.p320f.C3838d;
import p007c.p190n.p194b.p266d.p314j.p320f.C3858f;
import p007c.p190n.p194b.p266d.p314j.p320f.C3868g;
import p007c.p190n.p194b.p266d.p314j.p320f.C3937m8;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3828c;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3878h;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3907j8;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3917k8;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4006t7;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.d.r.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2426c extends AbstractC2436h {

    /* JADX INFO: renamed from: d */
    public static final C2518b f11168d = new C2518b("CastSession");

    /* JADX INFO: renamed from: e */
    public final Context f11169e;

    /* JADX INFO: renamed from: f */
    public final Set<C2383e.c> f11170f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2423a0 f11171g;

    /* JADX INFO: renamed from: h */
    public final C2424b f11172h;

    /* JADX INFO: renamed from: i */
    public final C2470k f11173i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC3907j8 f11174j;

    /* JADX INFO: renamed from: k */
    public InterfaceC4006t7 f11175k;

    /* JADX INFO: renamed from: l */
    public C2458h f11176l;

    /* JADX INFO: renamed from: m */
    public CastDevice f11177m;

    /* JADX INFO: renamed from: n */
    public C2383e.a f11178n;

    /* JADX INFO: renamed from: c.n.b.d.d.r.c$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public class a implements InterfaceC2639l<C2383e.a> {

        /* JADX INFO: renamed from: a */
        public String f11179a;

        public a(String str) {
            this.f11179a = str;
        }

        @Override // p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2639l
        /* JADX INFO: renamed from: a */
        public final void mo5012a(InterfaceC2638k interfaceC2638k) {
            C2383e.a aVar = (C2383e.a) interfaceC2638k;
            C2426c.this.f11178n = aVar;
            try {
                if (!aVar.mo4909B().m12654H()) {
                    C2426c.f11168d.m5119a("%s() -> failure result", this.f11179a);
                    C2426c.this.f11171g.mo4999d0(aVar.mo4909B().f28654l);
                    return;
                }
                C2426c.f11168d.m5119a("%s() -> success result", this.f11179a);
                C2426c.this.f11176l = new C2458h(new C2539l(null));
                C2426c c2426c = C2426c.this;
                c2426c.f11176l.m5075r(c2426c.f11175k);
                C2426c.this.f11176l.m5077t();
                C2426c c2426c2 = C2426c.this;
                c2426c2.f11173i.m5097j(c2426c2.f11176l, c2426c2.m5010i());
                C2426c.this.f11171g.mo5000l0(aVar.mo4954t(), aVar.mo4953f(), aVar.mo4951D(), aVar.mo4952c());
            } catch (RemoteException e) {
                C2426c.f11168d.m5120b(e, "Unable to call %s on %s.", "methods", InterfaceC2423a0.class.getSimpleName());
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.d.r.c$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public class b extends C2383e.c {
        public b(C2509u c2509u) {
        }

        @Override // p007c.p190n.p194b.p266d.p290d.C2383e.c
        /* JADX INFO: renamed from: a */
        public final void mo4955a(int i) {
            Iterator it = new HashSet(C2426c.this.f11170f).iterator();
            while (it.hasNext()) {
                ((C2383e.c) it.next()).mo4955a(i);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p290d.C2383e.c
        /* JADX INFO: renamed from: b */
        public final void mo4956b(int i) {
            C2426c.m5003j(C2426c.this, i);
            C2426c.this.m5026c(i);
            Iterator it = new HashSet(C2426c.this.f11170f).iterator();
            while (it.hasNext()) {
                ((C2383e.c) it.next()).mo4956b(i);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p290d.C2383e.c
        /* JADX INFO: renamed from: c */
        public final void mo4957c(C2380d c2380d) {
            Iterator it = new HashSet(C2426c.this.f11170f).iterator();
            while (it.hasNext()) {
                ((C2383e.c) it.next()).mo4957c(c2380d);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p290d.C2383e.c
        /* JADX INFO: renamed from: d */
        public final void mo4958d() {
            Iterator it = new HashSet(C2426c.this.f11170f).iterator();
            while (it.hasNext()) {
                ((C2383e.c) it.next()).mo4958d();
            }
        }

        @Override // p007c.p190n.p194b.p266d.p290d.C2383e.c
        /* JADX INFO: renamed from: e */
        public final void mo4959e(int i) {
            Iterator it = new HashSet(C2426c.this.f11170f).iterator();
            while (it.hasNext()) {
                ((C2383e.c) it.next()).mo4959e(i);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p290d.C2383e.c
        /* JADX INFO: renamed from: f */
        public final void mo4960f() {
            Iterator it = new HashSet(C2426c.this.f11170f).iterator();
            while (it.hasNext()) {
                ((C2383e.c) it.next()).mo4960f();
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.d.r.c$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public class c extends AbstractBinderC2513y {
        public c(C2509u c2509u) {
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.d.r.c$d */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public class d implements InterfaceC3917k8 {
        public d(C2509u c2509u) {
        }

        /* JADX INFO: renamed from: a */
        public final void m5013a(int i) {
            try {
                C2426c.this.f11171g.mo4997W(new C2602b(i));
            } catch (RemoteException e) {
                C2426c.f11168d.m5120b(e, "Unable to call %s on %s.", "onConnectionFailed", InterfaceC2423a0.class.getSimpleName());
            }
        }
    }

    public C2426c(Context context, String str, String str2, C2424b c2424b, InterfaceC3907j8 interfaceC3907j8, C2470k c2470k) {
        super(context, str, str2);
        this.f11170f = new HashSet();
        this.f11169e = context.getApplicationContext();
        this.f11172h = c2424b;
        this.f11173i = c2470k;
        this.f11174j = interfaceC3907j8;
        InterfaceC2423a0 interfaceC2423a0Mo9032J0 = null;
        try {
            interfaceC2423a0Mo9032J0 = C3858f.m9021a(context).mo9032J0(c2424b, m5027h(), new c(null));
        } catch (RemoteException e) {
            C3858f.f22572a.m5120b(e, "Unable to call %s on %s.", "newCastSessionImpl", InterfaceC3878h.class.getSimpleName());
        }
        this.f11171g = interfaceC2423a0Mo9032J0;
    }

    /* JADX INFO: renamed from: j */
    public static void m5003j(C2426c c2426c, int i) {
        C2470k c2470k = c2426c.f11173i;
        if (c2470k.f11335n) {
            c2470k.f11335n = false;
            C2458h c2458h = c2470k.f11331j;
            if (c2458h != null) {
                C2622l.m5354d("Must be called from the main thread.");
                c2458h.f11294h.remove(c2470k);
            }
            c2470k.f11325d.m9182i1(null);
            C2460a c2460a = c2470k.f11327f;
            if (c2460a != null) {
                c2460a.m5089a();
            }
            C2460a c2460a2 = c2470k.f11328g;
            if (c2460a2 != null) {
                c2460a2.m5089a();
            }
            MediaSessionCompat mediaSessionCompat = c2470k.f11333l;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.f77c.mo60b(null);
                c2470k.f11333l.m45f(null, null);
                MediaSessionCompat mediaSessionCompat2 = c2470k.f11333l;
                mediaSessionCompat2.f77c.mo64f(new MediaMetadataCompat.C0023b().m26a());
                c2470k.m5095h(0, null);
                c2470k.f11333l.m44e(false);
                c2470k.f11333l.f77c.release();
                c2470k.f11333l = null;
            }
            c2470k.f11331j = null;
            c2470k.f11332k = null;
            c2470k.f11334m = null;
            c2470k.m5099l();
            if (i == 0) {
                c2470k.m5100m();
            }
        }
        InterfaceC4006t7 interfaceC4006t7 = c2426c.f11175k;
        if (interfaceC4006t7 != null) {
            C3937m8 c3937m8 = (C3937m8) interfaceC4006t7;
            InterfaceC2415o1 interfaceC2415o1 = c3937m8.f22818h;
            if (interfaceC2415o1 != null) {
                ((C2372a0) interfaceC2415o1).m4946i();
                c3937m8.f22818h = null;
            }
            c2426c.f11175k = null;
        }
        c2426c.f11177m = null;
        C2458h c2458h2 = c2426c.f11176l;
        if (c2458h2 != null) {
            c2458h2.m5075r(null);
            c2426c.f11176l = null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.AbstractC2436h
    /* JADX INFO: renamed from: a */
    public void mo5004a(boolean z) {
        try {
            this.f11171g.mo5001r3(z, 0);
        } catch (RemoteException e) {
            f11168d.m5120b(e, "Unable to call %s on %s.", "disconnectFromDevice", InterfaceC2423a0.class.getSimpleName());
        }
        m5026c(0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.AbstractC2436h
    /* JADX INFO: renamed from: b */
    public long mo5005b() {
        C2622l.m5354d("Must be called from the main thread.");
        C2458h c2458h = this.f11176l;
        if (c2458h == null) {
            return 0L;
        }
        return c2458h.m5066g() - this.f11176l.m5061b();
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.AbstractC2436h
    /* JADX INFO: renamed from: d */
    public void mo5006d(Bundle bundle) {
        this.f11177m = CastDevice.m12646H(bundle);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.AbstractC2436h
    /* JADX INFO: renamed from: e */
    public void mo5007e(Bundle bundle) {
        this.f11177m = CastDevice.m12646H(bundle);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.AbstractC2436h
    /* JADX INFO: renamed from: f */
    public void mo5008f(Bundle bundle) {
        m5011k(bundle);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.AbstractC2436h
    /* JADX INFO: renamed from: g */
    public void mo5009g(Bundle bundle) {
        m5011k(bundle);
    }

    /* JADX INFO: renamed from: i */
    public CastDevice m5010i() {
        C2622l.m5354d("Must be called from the main thread.");
        return this.f11177m;
    }

    /* JADX INFO: renamed from: k */
    public final void m5011k(Bundle bundle) {
        C2444a c2444a;
        C2444a c2444a2;
        boolean zMo5021d5;
        CastDevice castDeviceM12646H = CastDevice.m12646H(bundle);
        this.f11177m = castDeviceM12646H;
        if (castDeviceM12646H == null) {
            C2622l.m5354d("Must be called from the main thread.");
            try {
                zMo5021d5 = this.f11188b.mo5021d5();
            } catch (RemoteException e) {
                AbstractC2436h.f11187a.m5120b(e, "Unable to call %s on %s.", "isResuming", InterfaceC2435g0.class.getSimpleName());
                zMo5021d5 = false;
            }
            if (zMo5021d5) {
                try {
                    this.f11188b.mo5023m5(8);
                    return;
                } catch (RemoteException e2) {
                    AbstractC2436h.f11187a.m5120b(e2, "Unable to call %s on %s.", "notifyFailedToResumeSession", InterfaceC2435g0.class.getSimpleName());
                    return;
                }
            }
            try {
                this.f11188b.mo5024r4(8);
                return;
            } catch (RemoteException e3) {
                AbstractC2436h.f11187a.m5120b(e3, "Unable to call %s on %s.", "notifyFailedToStartSession", InterfaceC2435g0.class.getSimpleName());
                return;
            }
        }
        InterfaceC4006t7 interfaceC4006t7 = this.f11175k;
        if (interfaceC4006t7 != null) {
            C3937m8 c3937m8 = (C3937m8) interfaceC4006t7;
            InterfaceC2415o1 interfaceC2415o1 = c3937m8.f22818h;
            if (interfaceC2415o1 != null) {
                ((C2372a0) interfaceC2415o1).m4946i();
                c3937m8.f22818h = null;
            }
            this.f11175k = null;
        }
        f11168d.m5119a("Acquiring a connection to Google Play Services for %s", this.f11177m);
        InterfaceC3907j8 interfaceC3907j8 = this.f11174j;
        Context context = this.f11169e;
        CastDevice castDevice = this.f11177m;
        C2424b c2424b = this.f11172h;
        b bVar = new b(null);
        d dVar = new d(null);
        Objects.requireNonNull((C3838d) interfaceC3907j8);
        C3937m8 c3937m9 = new C3937m8(C3868g.f22681a, context, castDevice, c2424b, bVar, dVar);
        this.f11175k = c3937m9;
        InterfaceC2415o1 interfaceC2415o2 = c3937m9.f22818h;
        if (interfaceC2415o2 != null) {
            ((C2372a0) interfaceC2415o2).m4946i();
            c3937m9.f22818h = null;
        }
        C3937m8.f22811a.m5119a("Acquiring a connection to Google Play Services for %s", c3937m9.f22814d);
        C3818b c3818b = new C3818b(c3937m9, null);
        InterfaceC3828c interfaceC3828c = c3937m9.f22812b;
        Context context2 = c3937m9.f22813c;
        Bundle bundle2 = new Bundle();
        C2424b c2424b2 = c3937m9.f22815e;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", (c2424b2 == null || (c2444a2 = c2424b2.f11157k) == null || c2444a2.f11202j == null) ? false : true);
        C2424b c2424b3 = c3937m9.f22815e;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", (c2424b3 == null || (c2444a = c2424b3.f11157k) == null || !c2444a.f11203k) ? false : true);
        C2383e.b.a aVar = new C2383e.b.a(c3937m9.f22814d, c3937m9.f22816f);
        aVar.f11024c = bundle2;
        C2383e.b bVar2 = new C2383e.b(aVar, null);
        Objects.requireNonNull((C3868g) interfaceC3828c);
        C2628a.a<C2522c0, C2383e.b> aVar2 = C2383e.f11017a;
        final C2372a0 c2372a0 = new C2372a0(context2, bVar2);
        c2372a0.f10978H.add(c3818b);
        c3937m9.f22818h = c2372a0;
        BinderC2405l0 binderC2405l0 = c2372a0.f10979m;
        Looper looper = c2372a0.f11614e;
        C2622l.m5379i(binderC2405l0, "Listener must not be null");
        C2622l.m5379i(looper, "Looper must not be null");
        C2622l.m5379i("castDeviceControllerListenerKey", "Listener type must not be null");
        C2671k<L> c2671k = new C2671k<>(looper, binderC2405l0, "castDeviceControllerListenerKey");
        C2679n c2679n = new C2679n(null);
        InterfaceC2681o<A, C4782j<Void>> interfaceC2681o = new InterfaceC2681o(c2372a0) { // from class: c.n.b.d.d.z

            /* JADX INFO: renamed from: a */
            public final C2372a0 f11492a;

            {
                this.f11492a = c2372a0;
            }

            @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o
            /* JADX INFO: renamed from: a */
            public final void mo4950a(Object obj, Object obj2) throws RemoteException {
                C2532h0 c2532h0 = (C2532h0) obj;
                ((InterfaceC2542m0) c2532h0.m5581u()).mo5142e6(this.f11492a.f10979m);
                ((InterfaceC2542m0) c2532h0.m5581u()).mo5140K();
                ((C4782j) obj2).f24683a.m10944q(null);
            }
        };
        InterfaceC2681o<A, C4782j<Boolean>> interfaceC2681o2 = C2375b0.f10999a;
        c2679n.f11734c = c2671k;
        c2679n.f11732a = interfaceC2681o;
        c2679n.f11733b = interfaceC2681o2;
        c2679n.f11735d = new C2606d[]{C2567y.f11486a};
        C2622l.m5344b(true, "Must set register function");
        C2622l.m5344b(c2679n.f11733b != null, "Must set unregister function");
        C2622l.m5344b(c2679n.f11734c != null, "Must set holder");
        C2671k<L> c2671k2 = c2679n.f11734c;
        C2680n0 c2680n0 = new C2680n0(c2679n, c2671k2, c2679n.f11735d, true);
        C2671k.a<L> aVar3 = c2671k2.f11717b;
        C2675l0 c2675l0 = new C2675l0(c2679n, aVar3);
        C2622l.m5379i(aVar3, "Listener has already been released.");
        C2622l.m5379i(aVar3, "Listener has already been released.");
        C2659g c2659g = c2372a0.f11618i;
        Objects.requireNonNull(c2659g);
        C2704z0 c2704z0 = new C2704z0(new C2669j0(c2680n0, c2675l0), new C4782j());
        Handler handler = c2659g.f11672t;
        handler.sendMessage(handler.obtainMessage(8, new C2666i0(c2704z0, c2659g.f11667o.get(), c2372a0)));
    }
}
