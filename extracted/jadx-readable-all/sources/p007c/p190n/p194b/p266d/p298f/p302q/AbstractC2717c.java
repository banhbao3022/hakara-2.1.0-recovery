package p007c.p190n.p194b.p266d.p298f.p302q;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.C2610f;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2651d0;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2659g;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.RunnableC2648c0;

/* JADX INFO: renamed from: c.n.b.d.f.q.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2717c<T extends IInterface> {

    /* JADX INFO: renamed from: a */
    public static final C2606d[] f11799a = new C2606d[0];

    /* JADX INFO: renamed from: b */
    public C2728f1 f11800b;

    /* JADX INFO: renamed from: c */
    public final Context f11801c;

    /* JADX INFO: renamed from: d */
    public final Looper f11802d;

    /* JADX INFO: renamed from: e */
    public final AbstractC2738j f11803e;

    /* JADX INFO: renamed from: f */
    public final C2610f f11804f;

    /* JADX INFO: renamed from: g */
    public final Handler f11805g;

    /* JADX INFO: renamed from: h */
    public final Object f11806h;

    /* JADX INFO: renamed from: i */
    public final Object f11807i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2749o f11808j;

    /* JADX INFO: renamed from: k */
    @RecentlyNonNull
    public c f11809k;

    /* JADX INFO: renamed from: l */
    public T f11810l;

    /* JADX INFO: renamed from: m */
    public final ArrayList<AbstractC2754q0<?>> f11811m;

    /* JADX INFO: renamed from: n */
    public ServiceConnectionC2758s0 f11812n;

    /* JADX INFO: renamed from: o */
    public int f11813o;

    /* JADX INFO: renamed from: p */
    public final a f11814p;

    /* JADX INFO: renamed from: q */
    public final b f11815q;

    /* JADX INFO: renamed from: r */
    public final int f11816r;

    /* JADX INFO: renamed from: s */
    public final String f11817s;

    /* JADX INFO: renamed from: t */
    public C2602b f11818t;

    /* JADX INFO: renamed from: u */
    public boolean f11819u;

    /* JADX INFO: renamed from: v */
    public volatile C2766w0 f11820v;

    /* JADX INFO: renamed from: w */
    @RecentlyNonNull
    public AtomicInteger f11821w;

    /* JADX INFO: renamed from: c.n.b.d.f.q.c$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface a {
        /* JADX INFO: renamed from: Q */
        void mo5562Q(int i);

        /* JADX INFO: renamed from: c0 */
        void mo5563c0(Bundle bundle);
    }

    /* JADX INFO: renamed from: c.n.b.d.f.q.c$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface b {
        /* JADX INFO: renamed from: W */
        void mo5565W(@RecentlyNonNull C2602b c2602b);
    }

    /* JADX INFO: renamed from: c.n.b.d.f.q.c$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo5535a(@RecentlyNonNull C2602b c2602b);
    }

    /* JADX INFO: renamed from: c.n.b.d.f.q.c$d */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public class d implements c {
        public d() {
        }

        @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.c
        /* JADX INFO: renamed from: a */
        public final void mo5535a(@RecentlyNonNull C2602b c2602b) {
            if (c2602b.m5197K()) {
                AbstractC2717c abstractC2717c = AbstractC2717c.this;
                abstractC2717c.m5571b(null, abstractC2717c.mo5580t());
            } else {
                b bVar = AbstractC2717c.this.f11815q;
                if (bVar != null) {
                    bVar.mo5565W(c2602b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.f.q.c$e */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface e {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC2717c(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i, a aVar, b bVar, String str) {
        AbstractC2738j abstractC2738jM5599a = AbstractC2738j.m5599a(context);
        C2610f c2610f = C2610f.f11568b;
        Objects.requireNonNull(aVar, "null reference");
        Objects.requireNonNull(bVar, "null reference");
        this(context, looper, abstractC2738jM5599a, c2610f, i, aVar, bVar, null);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ boolean m5567A(AbstractC2717c abstractC2717c, int i, int i2, IInterface iInterface) {
        synchronized (abstractC2717c.f11806h) {
            if (abstractC2717c.f11813o != i) {
                return false;
            }
            abstractC2717c.m5570B(i2, iInterface);
            return true;
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m5568y(AbstractC2717c abstractC2717c, int i) {
        int i2;
        int i3;
        synchronized (abstractC2717c.f11806h) {
            i2 = abstractC2717c.f11813o;
        }
        if (i2 == 3) {
            abstractC2717c.f11819u = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = abstractC2717c.f11805g;
        handler.sendMessage(handler.obtainMessage(i3, abstractC2717c.f11821w.get(), 16));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m5569z(AbstractC2717c abstractC2717c) {
        if (abstractC2717c.f11819u || TextUtils.isEmpty(abstractC2717c.mo4923h()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(abstractC2717c.mo4923h());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m5570B(int i, T t) {
        C2728f1 c2728f1;
        C2622l.m5339a((i == 4) == (t != null));
        synchronized (this.f11806h) {
            this.f11813o = i;
            this.f11810l = t;
            if (i == 1) {
                ServiceConnectionC2758s0 serviceConnectionC2758s0 = this.f11812n;
                if (serviceConnectionC2758s0 != null) {
                    AbstractC2738j abstractC2738j = this.f11803e;
                    String str = this.f11800b.f11856a;
                    Objects.requireNonNull(str, "null reference");
                    C2728f1 c2728f2 = this.f11800b;
                    String str2 = c2728f2.f11857b;
                    int i2 = c2728f2.f11858c;
                    String strM5583x = m5583x();
                    boolean z = this.f11800b.f11859d;
                    Objects.requireNonNull(abstractC2738j);
                    abstractC2738j.mo5586c(new C2713a1(str, str2, i2, z), serviceConnectionC2758s0, strM5583x);
                    this.f11812n = null;
                }
            } else if (i == 2 || i == 3) {
                ServiceConnectionC2758s0 serviceConnectionC2758s1 = this.f11812n;
                if (serviceConnectionC2758s1 != null && (c2728f1 = this.f11800b) != null) {
                    String str3 = c2728f1.f11856a;
                    String str4 = c2728f1.f11857b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str3);
                    sb.append(" on ");
                    sb.append(str4);
                    Log.e("GmsClient", sb.toString());
                    AbstractC2738j abstractC2738j2 = this.f11803e;
                    String str5 = this.f11800b.f11856a;
                    Objects.requireNonNull(str5, "null reference");
                    C2728f1 c2728f3 = this.f11800b;
                    String str6 = c2728f3.f11857b;
                    int i3 = c2728f3.f11858c;
                    String strM5583x2 = m5583x();
                    boolean z2 = this.f11800b.f11859d;
                    Objects.requireNonNull(abstractC2738j2);
                    abstractC2738j2.mo5586c(new C2713a1(str5, str6, i3, z2), serviceConnectionC2758s1, strM5583x2);
                    this.f11821w.incrementAndGet();
                }
                ServiceConnectionC2758s0 serviceConnectionC2758s2 = new ServiceConnectionC2758s0(this, this.f11821w.get());
                this.f11812n = serviceConnectionC2758s2;
                String strMo4926n = mo4926n();
                Object obj = AbstractC2738j.f11881a;
                C2728f1 c2728f4 = new C2728f1("com.google.android.gms", strMo4926n, false, 4225, false);
                this.f11800b = c2728f4;
                if (c2728f4.f11859d && mo4925k() < 17895000) {
                    String strValueOf = String.valueOf(this.f11800b.f11856a);
                    throw new IllegalStateException(strValueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(strValueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                AbstractC2738j abstractC2738j3 = this.f11803e;
                String str7 = this.f11800b.f11856a;
                Objects.requireNonNull(str7, "null reference");
                C2728f1 c2728f5 = this.f11800b;
                if (!abstractC2738j3.mo5585b(new C2713a1(str7, c2728f5.f11857b, c2728f5.f11858c, this.f11800b.f11859d), serviceConnectionC2758s2, m5583x())) {
                    C2728f1 c2728f6 = this.f11800b;
                    String str8 = c2728f6.f11856a;
                    String str9 = c2728f6.f11857b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str8);
                    sb2.append(" on ");
                    sb2.append(str9);
                    Log.e("GmsClient", sb2.toString());
                    int i4 = this.f11821w.get();
                    Handler handler = this.f11805g;
                    handler.sendMessage(handler.obtainMessage(7, i4, -1, new C2762u0(this, 16, null)));
                }
            } else if (i == 4) {
                Objects.requireNonNull(t, "null reference");
                System.currentTimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void mo5133J() {
        this.f11821w.incrementAndGet();
        synchronized (this.f11811m) {
            int size = this.f11811m.size();
            for (int i = 0; i < size; i++) {
                AbstractC2754q0<?> abstractC2754q0 = this.f11811m.get(i);
                synchronized (abstractC2754q0) {
                    abstractC2754q0.f11899a = null;
                }
            }
            this.f11811m.clear();
        }
        synchronized (this.f11807i) {
            this.f11808j = null;
        }
        m5570B(1, null);
    }

    /* JADX INFO: renamed from: b */
    public void m5571b(InterfaceC2745m interfaceC2745m, @RecentlyNonNull Set<Scope> set) {
        Bundle bundleMo5135s = mo5135s();
        C2732h c2732h = new C2732h(this.f11816r, null);
        c2732h.f11863i = this.f11801c.getPackageName();
        c2732h.f11866l = bundleMo5135s;
        if (set != null) {
            c2732h.f11865k = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo5480m()) {
            Account accountMo5579p = mo5579p();
            if (accountMo5579p == null) {
                accountMo5579p = new Account("<<default account>>", "com.google");
            }
            c2732h.f11867m = accountMo5579p;
            if (interfaceC2745m != null) {
                c2732h.f11864j = interfaceC2745m.asBinder();
            }
        }
        c2732h.f11868n = f11799a;
        c2732h.f11869o = mo5118q();
        try {
            synchronized (this.f11807i) {
                InterfaceC2749o interfaceC2749o = this.f11808j;
                if (interfaceC2749o != null) {
                    interfaceC2749o.mo5600S1(new BinderC2756r0(this, this.f11821w.get()), c2732h);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            Handler handler = this.f11805g;
            handler.sendMessage(handler.obtainMessage(6, this.f11821w.get(), 3));
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo5137w(8, null, null, this.f11821w.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo5137w(8, null, null, this.f11821w.get());
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m5572d() {
        boolean z;
        synchronized (this.f11806h) {
            int i = this.f11813o;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: e */
    public String m5573e() {
        C2728f1 c2728f1;
        if (!m5582u0() || (c2728f1 = this.f11800b) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return c2728f1.f11857b;
    }

    /* JADX INFO: renamed from: f */
    public void m5574f(@RecentlyNonNull c cVar) {
        C2622l.m5379i(cVar, "Connection progress callbacks cannot be null.");
        this.f11809k = cVar;
        m5570B(2, null);
    }

    /* JADX INFO: renamed from: g */
    public void m5575g(@RecentlyNonNull e eVar) {
        C2651d0 c2651d0 = (C2651d0) eVar;
        C2659g.this.f11672t.post(new RunnableC2648c0(c2651d0));
    }

    /* JADX INFO: renamed from: h */
    public abstract String mo4923h();

    @RecentlyNullable
    /* JADX INFO: renamed from: i */
    public abstract T mo4924i(@RecentlyNonNull IBinder iBinder);

    /* JADX INFO: renamed from: j */
    public boolean m5576j() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public int mo4925k() {
        return C2610f.f11567a;
    }

    @RecentlyNullable
    /* JADX INFO: renamed from: l */
    public final C2606d[] m5577l() {
        C2766w0 c2766w0 = this.f11820v;
        if (c2766w0 == null) {
            return null;
        }
        return c2766w0.f11928g;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo5480m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public abstract String mo4926n();

    /* JADX INFO: renamed from: o */
    public void m5578o() {
        int iMo5207d = this.f11804f.mo5207d(this.f11801c, mo4925k());
        if (iMo5207d == 0) {
            m5574f(new d());
            return;
        }
        m5570B(1, null);
        d dVar = new d();
        C2622l.m5379i(dVar, "Connection progress callbacks cannot be null.");
        this.f11809k = dVar;
        Handler handler = this.f11805g;
        handler.sendMessage(handler.obtainMessage(3, this.f11821w.get(), iMo5207d, null));
    }

    @RecentlyNullable
    /* JADX INFO: renamed from: p */
    public Account mo5579p() {
        return null;
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: q */
    public C2606d[] mo5118q() {
        return f11799a;
    }

    @RecentlyNullable
    /* JADX INFO: renamed from: r */
    public Bundle mo5134r() {
        return null;
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: s */
    public Bundle mo5135s() {
        return new Bundle();
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: t */
    public Set<Scope> mo5580t() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: u */
    public final T m5581u() throws DeadObjectException {
        T t;
        synchronized (this.f11806h) {
            try {
                if (this.f11813o == 5) {
                    throw new DeadObjectException();
                }
                if (!m5582u0()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                t = this.f11810l;
                C2622l.m5379i(t, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m5582u0() {
        boolean z;
        synchronized (this.f11806h) {
            z = this.f11813o == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: v */
    public void mo5136v(@RecentlyNonNull C2602b c2602b) {
        int i = c2602b.f11553h;
        System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: w */
    public void mo5137w(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f11805g;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C2760t0(this, i, iBinder, bundle)));
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: x */
    public final String m5583x() {
        String str = this.f11817s;
        return str == null ? this.f11801c.getClass().getName() : str;
    }

    public AbstractC2717c(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull AbstractC2738j abstractC2738j, @RecentlyNonNull C2610f c2610f, int i, a aVar, b bVar, String str) {
        this.f11806h = new Object();
        this.f11807i = new Object();
        this.f11811m = new ArrayList<>();
        this.f11813o = 1;
        this.f11818t = null;
        this.f11819u = false;
        this.f11820v = null;
        this.f11821w = new AtomicInteger(0);
        C2622l.m5379i(context, "Context must not be null");
        this.f11801c = context;
        C2622l.m5379i(looper, "Looper must not be null");
        this.f11802d = looper;
        C2622l.m5379i(abstractC2738j, "Supervisor must not be null");
        this.f11803e = abstractC2738j;
        C2622l.m5379i(c2610f, "API availability must not be null");
        this.f11804f = c2610f;
        this.f11805g = new HandlerC2752p0(this, looper);
        this.f11816r = i;
        this.f11814p = aVar;
        this.f11815q = bVar;
        this.f11817s = str;
    }
}
