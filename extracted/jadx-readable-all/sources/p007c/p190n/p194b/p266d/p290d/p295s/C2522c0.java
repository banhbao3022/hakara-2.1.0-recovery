package p007c.p190n.p194b.p266d.p290d.p295s;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import p007c.p190n.p194b.p266d.p290d.C2380d;
import p007c.p190n.p194b.p266d.p290d.C2383e;
import p007c.p190n.p194b.p266d.p290d.C2565x;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2653e;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i;
import p007c.p190n.p194b.p266d.p298f.p302q.C2720d;

/* JADX INFO: renamed from: c.n.b.d.d.s.c0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2522c0 extends AbstractC2735i<InterfaceC2542m0> {

    /* JADX INFO: renamed from: A */
    public static final C2518b f11384A = new C2518b("CastClientImpl");

    /* JADX INFO: renamed from: B */
    public static final Object f11385B = new Object();

    /* JADX INFO: renamed from: C */
    public static final Object f11386C = new Object();

    /* JADX INFO: renamed from: D */
    public C2380d f11387D;

    /* JADX INFO: renamed from: E */
    public final CastDevice f11388E;

    /* JADX INFO: renamed from: F */
    public final C2383e.c f11389F;

    /* JADX INFO: renamed from: G */
    public final Map<String, C2383e.d> f11390G;

    /* JADX INFO: renamed from: H */
    public final long f11391H;

    /* JADX INFO: renamed from: I */
    public final Bundle f11392I;

    /* JADX INFO: renamed from: J */
    public BinderC2526e0 f11393J;

    /* JADX INFO: renamed from: K */
    public String f11394K;

    /* JADX INFO: renamed from: L */
    public boolean f11395L;

    /* JADX INFO: renamed from: M */
    public boolean f11396M;

    /* JADX INFO: renamed from: N */
    public boolean f11397N;

    /* JADX INFO: renamed from: O */
    public double f11398O;

    /* JADX INFO: renamed from: P */
    public C2565x f11399P;

    /* JADX INFO: renamed from: Q */
    public int f11400Q;

    /* JADX INFO: renamed from: R */
    public int f11401R;

    /* JADX INFO: renamed from: S */
    public String f11402S;

    /* JADX INFO: renamed from: T */
    public String f11403T;

    /* JADX INFO: renamed from: U */
    public Bundle f11404U;

    /* JADX INFO: renamed from: V */
    public final Map<Long, InterfaceC2653e<Status>> f11405V;

    public C2522c0(Context context, Looper looper, C2720d c2720d, CastDevice castDevice, long j2, C2383e.c cVar, Bundle bundle, AbstractC2632e.a aVar, AbstractC2632e.b bVar) {
        super(context, looper, 10, c2720d, aVar, bVar);
        this.f11388E = castDevice;
        this.f11389F = cVar;
        this.f11391H = j2;
        this.f11392I = bundle;
        this.f11390G = new HashMap();
        new AtomicLong(0L);
        this.f11405V = new HashMap();
        m5130E();
        m5132G();
    }

    /* JADX INFO: renamed from: C */
    public static void m5128C(C2522c0 c2522c0, int i) {
        synchronized (f11386C) {
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m5129D(C2522c0 c2522c0, long j2, int i) {
        InterfaceC2653e<Status> interfaceC2653eRemove;
        synchronized (c2522c0.f11405V) {
            interfaceC2653eRemove = c2522c0.f11405V.remove(Long.valueOf(j2));
        }
        if (interfaceC2653eRemove != null) {
            interfaceC2653eRemove.mo4931a(new Status(i));
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m5130E() {
        this.f11400Q = -1;
        this.f11401R = -1;
        this.f11387D = null;
        this.f11394K = null;
        this.f11398O = 0.0d;
        m5132G();
        this.f11395L = false;
        this.f11399P = null;
    }

    /* JADX INFO: renamed from: F */
    public final void m5131F() {
        f11384A.m5119a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f11390G) {
            this.f11390G.clear();
        }
    }

    /* JADX INFO: renamed from: G */
    public final double m5132G() {
        if (this.f11388E.m12647K(2048)) {
            return 0.02d;
        }
        return (!this.f11388E.m12647K(4) || this.f11388E.m12647K(1) || "Chromecast Audio".equals(this.f11388E.f28549j)) ? 0.05d : 0.02d;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: J */
    public final void mo5133J() {
        C2518b c2518b = f11384A;
        c2518b.m5119a("disconnect(); ServiceListener=%s, isConnected=%b", this.f11393J, Boolean.valueOf(m5582u0()));
        BinderC2526e0 binderC2526e0 = this.f11393J;
        C2522c0 c2522c0 = null;
        this.f11393J = null;
        if (binderC2526e0 != null) {
            C2522c0 andSet = binderC2526e0.f11408f.getAndSet(null);
            if (andSet != null) {
                andSet.m5130E();
                c2522c0 = andSet;
            }
            if (c2522c0 != null) {
                m5131F();
                try {
                    try {
                        ((InterfaceC2542m0) m5581u()).mo5139J();
                        return;
                    } finally {
                        super.mo5133J();
                    }
                } catch (RemoteException | IllegalStateException e) {
                    f11384A.m5120b(e, "Error while disconnecting the controller interface: %s", e.getMessage());
                    super.mo5133J();
                    return;
                }
            }
        }
        c2518b.m5119a("already disposed, so short-circuiting", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: h */
    public final String mo4923h() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ IInterface mo4924i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2542m0 ? (InterfaceC2542m0) iInterfaceQueryLocalInterface : new C2529g(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i, p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: k */
    public final int mo4925k() {
        return 12800000;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: n */
    public final String mo4926n() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: r */
    public final Bundle mo5134r() {
        Bundle bundle = this.f11404U;
        if (bundle == null) {
            return null;
        }
        this.f11404U = null;
        return bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: s */
    public final Bundle mo5135s() {
        Bundle bundle = new Bundle();
        f11384A.m5119a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f11402S, this.f11403T);
        CastDevice castDevice = this.f11388E;
        Objects.requireNonNull(castDevice);
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f11391H);
        Bundle bundle2 = this.f11392I;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        BinderC2526e0 binderC2526e0 = new BinderC2526e0(this);
        this.f11393J = binderC2526e0;
        bundle.putParcelable("listener", new BinderWrapper(binderC2526e0));
        String str = this.f11402S;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f11403T;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: v */
    public final void mo5136v(C2602b c2602b) {
        int i = c2602b.f11553h;
        System.currentTimeMillis();
        m5131F();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: w */
    public final void mo5137w(int i, IBinder iBinder, Bundle bundle, int i2) {
        f11384A.m5119a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.f11396M = true;
            this.f11397N = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.f11404U = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.mo5137w(i, iBinder, bundle, i2);
    }
}
