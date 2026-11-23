package p007c.p190n.p194b.p266d.p298f.p299o;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a.d;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2687r;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2641a;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2644b;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2654e0;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2659g;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2665i;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2666i0;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2676l1;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2695v;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2702y0;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.FragmentC2670j1;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2668j;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2683p;
import p007c.p190n.p194b.p266d.p298f.p302q.C2720d;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p636z0.p691g.ArraySet2;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.n.b.d.f.o.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2631d<O extends C2628a.d> implements InterfaceC2633f<O> {

    /* JADX INFO: renamed from: a */
    public final Context f11610a;

    /* JADX INFO: renamed from: b */
    public final C2628a<O> f11611b;

    /* JADX INFO: renamed from: c */
    public final O f11612c;

    /* JADX INFO: renamed from: d */
    public final C2644b<O> f11613d;

    /* JADX INFO: renamed from: e */
    public final Looper f11614e;

    /* JADX INFO: renamed from: f */
    public final int f11615f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2632e f11616g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2683p f11617h;

    /* JADX INFO: renamed from: i */
    public final C2659g f11618i;

    /* JADX INFO: renamed from: c.n.b.d.f.o.d$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final a f11619a = new C8515a().m5488a();

        /* JADX INFO: renamed from: b */
        public final InterfaceC2683p f11620b;

        /* JADX INFO: renamed from: c */
        public final Looper f11621c;

        /* JADX INFO: renamed from: c.n.b.d.f.o.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static class C8515a {

            /* JADX INFO: renamed from: a */
            public InterfaceC2683p f11622a;

            /* JADX INFO: renamed from: b */
            public Looper f11623b;

            /* JADX INFO: renamed from: a */
            public a m5488a() {
                if (this.f11622a == null) {
                    this.f11622a = new C2641a();
                }
                if (this.f11623b == null) {
                    this.f11623b = Looper.getMainLooper();
                }
                return new a(this.f11622a, null, this.f11623b);
            }

            /* JADX INFO: renamed from: b */
            public C8515a m5489b(InterfaceC2683p interfaceC2683p) {
                C2622l.m5379i(interfaceC2683p, "StatusExceptionMapper must not be null.");
                this.f11622a = interfaceC2683p;
                return this;
            }
        }

        public a(InterfaceC2683p interfaceC2683p, Account account, Looper looper) {
            this.f11620b = interfaceC2683p;
            this.f11621c = looper;
        }
    }

    @Deprecated
    public C2631d(Context context, C2628a<O> c2628a, O o, Looper looper, InterfaceC2683p interfaceC2683p) {
        a.C8515a c8515a = new a.C8515a();
        C2622l.m5379i(looper, "Looper must not be null.");
        c8515a.f11623b = looper;
        c8515a.m5489b(interfaceC2683p);
        this(context, c2628a, o, c8515a.m5488a());
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2633f
    /* JADX INFO: renamed from: a */
    public C2644b<O> mo5485a() {
        return this.f11613d;
    }

    /* JADX INFO: renamed from: b */
    public C2720d.a m5486b() {
        GoogleSignInAccount googleSignInAccountM5471h;
        GoogleSignInAccount googleSignInAccountM5471h2;
        C2720d.a aVar = new C2720d.a();
        O o = this.f11612c;
        Account accountM5470u = null;
        if (!(o instanceof C2628a.d.b) || (googleSignInAccountM5471h2 = ((C2628a.d.b) o).m5471h()) == null) {
            O o2 = this.f11612c;
            if (o2 instanceof C2628a.d.a) {
                accountM5470u = ((C2628a.d.a) o2).m5470u();
            }
        } else if (googleSignInAccountM5471h2.f28496j != null) {
            accountM5470u = new Account(googleSignInAccountM5471h2.f28496j, "com.google");
        }
        aVar.f11833a = accountM5470u;
        O o3 = this.f11612c;
        Set<Scope> setEmptySet = (!(o3 instanceof C2628a.d.b) || (googleSignInAccountM5471h = ((C2628a.d.b) o3).m5471h()) == null) ? Collections.emptySet() : googleSignInAccountM5471h.m12639H();
        if (aVar.f11834b == null) {
            aVar.f11834b = new ArraySet2<>();
        }
        aVar.f11834b.addAll(setEmptySet);
        aVar.f11836d = this.f11610a.getClass().getName();
        aVar.f11835c = this.f11610a.getPackageName();
        return aVar;
    }

    /* JADX INFO: renamed from: c */
    public final <TResult, A extends C2628a.b> AbstractC4781i<TResult> m5487c(int i, AbstractC2687r<A, TResult> abstractC2687r) {
        C4782j c4782j = new C4782j();
        C2659g c2659g = this.f11618i;
        InterfaceC2683p interfaceC2683p = this.f11617h;
        Objects.requireNonNull(c2659g);
        C2702y0 c2702y0 = new C2702y0(i, abstractC2687r, c4782j, interfaceC2683p);
        Handler handler = c2659g.f11672t;
        handler.sendMessage(handler.obtainMessage(4, new C2666i0(c2702y0, c2659g.f11667o.get(), this)));
        return c4782j.f24683a;
    }

    public C2631d(Activity activity, C2628a<O> c2628a, O o, a aVar) {
        FragmentC2670j1 fragmentC2670j1;
        FragmentC2670j1 fragmentC2670j2;
        InterfaceC2668j interfaceC2668j;
        C2676l1 c2676l1;
        C2676l1 c2676l2;
        C2622l.m5379i(activity, "Null activity is not permitted.");
        C2622l.m5379i(c2628a, "Api must not be null.");
        C2622l.m5379i(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = activity.getApplicationContext();
        this.f11610a = applicationContext;
        this.f11611b = c2628a;
        this.f11612c = o;
        this.f11614e = aVar.f11621c;
        C2644b<O> c2644b = new C2644b<>(c2628a, o);
        this.f11613d = c2644b;
        this.f11616g = new C2654e0(this);
        C2659g c2659gM5513b = C2659g.m5513b(applicationContext);
        this.f11618i = c2659gM5513b;
        this.f11615f = c2659gM5513b.f11666n.getAndIncrement();
        this.f11617h = aVar.f11620b;
        if (!(activity instanceof GoogleApiActivity)) {
            Object obj = new C2665i(activity).f11703a;
            if (obj instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                WeakHashMap<FragmentActivity, WeakReference<C2676l1>> weakHashMap = C2676l1.f11725c0;
                WeakReference<C2676l1> weakReference = weakHashMap.get(fragmentActivity);
                if (weakReference == null || (c2676l2 = weakReference.get()) == null) {
                    try {
                        interfaceC2668j = c2676l2;
                        C2676l1 c2676l3 = (C2676l1) fragmentActivity.m16577C().m16656I("SupportLifecycleFragmentImpl");
                        if (c2676l3 == null || c2676l3.f38444s) {
                            c2676l1 = c2676l3;
                            C2676l1 c2676l4 = new C2676l1();
                            BackStackRecord backStackRecord = new BackStackRecord(fragmentActivity.m16577C());
                            backStackRecord.mo16448g(0, c2676l4, "SupportLifecycleFragmentImpl", 1);
                            backStackRecord.m16454o();
                            c2676l1 = c2676l4;
                        }
                        c2676l1 = c2676l3;
                        weakHashMap.put(fragmentActivity, new WeakReference<>(c2676l1));
                        interfaceC2668j = c2676l1;
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                    }
                }
            } else if (obj instanceof Activity) {
                Activity activity2 = (Activity) obj;
                WeakHashMap<Activity, WeakReference<FragmentC2670j1>> weakHashMap2 = FragmentC2670j1.f11712f;
                WeakReference<FragmentC2670j1> weakReference2 = weakHashMap2.get(activity2);
                if (weakReference2 == null || (fragmentC2670j2 = weakReference2.get()) == null) {
                    try {
                        interfaceC2668j = fragmentC2670j2;
                        FragmentC2670j1 fragmentC2670j3 = (FragmentC2670j1) activity2.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                        if (fragmentC2670j3 == null || fragmentC2670j3.isRemoving()) {
                            fragmentC2670j1 = fragmentC2670j3;
                            FragmentC2670j1 fragmentC2670j4 = new FragmentC2670j1();
                            activity2.getFragmentManager().beginTransaction().add(fragmentC2670j4, "LifecycleFragmentImpl").commitAllowingStateLoss();
                            fragmentC2670j1 = fragmentC2670j4;
                        }
                        fragmentC2670j1 = fragmentC2670j3;
                        weakHashMap2.put(activity2, new WeakReference<>(fragmentC2670j1));
                        interfaceC2668j = fragmentC2670j1;
                    } catch (ClassCastException e2) {
                        throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                    }
                }
            } else {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            interfaceC2668j = fragmentC2670j2;
            interfaceC2668j = c2676l2;
            C2695v c2695v = (C2695v) interfaceC2668j.mo5541e("ConnectionlessLifecycleHelper", C2695v.class);
            c2695v = c2695v == null ? new C2695v(interfaceC2668j) : c2695v;
            c2695v.f11763l = c2659gM5513b;
            C2622l.m5379i(c2644b, "ApiKey cannot be null");
            c2695v.f11762k.add(c2644b);
            c2659gM5513b.m5514a(c2695v);
        }
        Handler handler = c2659gM5513b.f11672t;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public C2631d(Context context, C2628a<O> c2628a, O o, a aVar) {
        C2622l.m5379i(context, "Null context is not permitted.");
        C2622l.m5379i(c2628a, "Api must not be null.");
        C2622l.m5379i(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.f11610a = applicationContext;
        this.f11611b = c2628a;
        this.f11612c = o;
        this.f11614e = aVar.f11621c;
        this.f11613d = new C2644b<>(c2628a, o);
        this.f11616g = new C2654e0(this);
        C2659g c2659gM5513b = C2659g.m5513b(applicationContext);
        this.f11618i = c2659gM5513b;
        this.f11615f = c2659gM5513b.f11666n.getAndIncrement();
        this.f11617h = aVar.f11620b;
        Handler handler = c2659gM5513b.f11672t;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    @Deprecated
    public C2631d(Activity activity, C2628a<O> c2628a, O o, InterfaceC2683p interfaceC2683p) {
        a.C8515a c8515a = new a.C8515a();
        c8515a.m5489b(interfaceC2683p);
        Looper mainLooper = activity.getMainLooper();
        C2622l.m5379i(mainLooper, "Looper must not be null.");
        c8515a.f11623b = mainLooper;
        this(activity, (C2628a) c2628a, (C2628a.d) o, c8515a.m5488a());
    }

    @Deprecated
    public C2631d(Context context, C2628a<O> c2628a, O o, InterfaceC2683p interfaceC2683p) {
        a.C8515a c8515a = new a.C8515a();
        c8515a.m5489b(interfaceC2683p);
        this(context, c2628a, o, c8515a.m5488a());
    }
}
