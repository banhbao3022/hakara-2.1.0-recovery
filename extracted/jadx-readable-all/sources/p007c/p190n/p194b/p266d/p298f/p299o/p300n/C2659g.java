package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.C2608e;
import p007c.p190n.p194b.p266d.p298f.C2618j;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p299o.C2631d;
import p007c.p190n.p194b.p266d.p298f.p299o.C2640m;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;
import p007c.p190n.p194b.p266d.p298f.p302q.C2720d;
import p007c.p190n.p194b.p266d.p298f.p302q.C2743l;
import p007c.p190n.p194b.p266d.p298f.p302q.C2753q;
import p007c.p190n.p194b.p266d.p298f.p302q.C2763v;
import p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2745m;
import p007c.p190n.p194b.p266d.p314j.p319e.HandlerC3807c;
import p007c.p190n.p194b.p266d.p330l.C4746a;
import p007c.p190n.p194b.p266d.p330l.InterfaceC4761e;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p636z0.p691g.ArrayMap;
import p636z0.p691g.ArraySet2;
import p636z0.p691g.MapCollections;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2659g implements Handler.Callback {

    /* JADX INFO: renamed from: f */
    public static final Status f11658f = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: g */
    public static final Status f11659g = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: h */
    public static final Object f11660h = new Object();

    /* JADX INFO: renamed from: i */
    public static C2659g f11661i;

    /* JADX INFO: renamed from: k */
    public final Context f11663k;

    /* JADX INFO: renamed from: l */
    public final C2608e f11664l;

    /* JADX INFO: renamed from: m */
    public final C2743l f11665m;

    /* JADX INFO: renamed from: t */
    public final Handler f11672t;

    /* JADX INFO: renamed from: j */
    public long f11662j = 10000;

    /* JADX INFO: renamed from: n */
    public final AtomicInteger f11666n = new AtomicInteger(1);

    /* JADX INFO: renamed from: o */
    public final AtomicInteger f11667o = new AtomicInteger(0);

    /* JADX INFO: renamed from: p */
    public final Map<C2644b<?>, a<?>> f11668p = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: q */
    public C2695v f11669q = null;

    /* JADX INFO: renamed from: r */
    public final Set<C2644b<?>> f11670r = new ArraySet2();

    /* JADX INFO: renamed from: s */
    public final Set<C2644b<?>> f11671s = new ArraySet2();

    /* JADX INFO: renamed from: c.n.b.d.f.o.n.g$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public class a<O extends C2628a.d> implements AbstractC2632e.a, AbstractC2632e.b {

        /* JADX INFO: renamed from: g */
        public final C2628a.f f11674g;

        /* JADX INFO: renamed from: h */
        public final C2628a.b f11675h;

        /* JADX INFO: renamed from: i */
        public final C2644b<O> f11676i;

        /* JADX INFO: renamed from: j */
        public final C2664h1 f11677j;

        /* JADX INFO: renamed from: m */
        public final int f11680m;

        /* JADX INFO: renamed from: n */
        public final BinderC2684p0 f11681n;

        /* JADX INFO: renamed from: o */
        public boolean f11682o;

        /* JADX INFO: renamed from: f */
        public final Queue<AbstractC2678m0> f11673f = new LinkedList();

        /* JADX INFO: renamed from: k */
        public final Set<C2646b1> f11678k = new HashSet();

        /* JADX INFO: renamed from: l */
        public final Map<C2671k.a<?>, C2669j0> f11679l = new HashMap();

        /* JADX INFO: renamed from: p */
        public final List<c> f11683p = new ArrayList();

        /* JADX INFO: renamed from: q */
        public C2602b f11684q = null;

        public a(C2631d<O> c2631d) {
            Looper looper = C2659g.this.f11672t.getLooper();
            C2720d c2720dM5584a = c2631d.m5486b().m5584a();
            C2628a<O> c2628a = c2631d.f11611b;
            C2622l.m5389k(c2628a.f11605a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
            C2628a.f fVarMo4938a = c2628a.f11605a.mo4938a(c2631d.f11610a, looper, c2720dM5584a, c2631d.f11612c, this, this);
            this.f11674g = fVarMo4938a;
            if (fVarMo4938a instanceof C2763v) {
                this.f11675h = ((C2763v) fVarMo4938a).f11924A;
            } else {
                this.f11675h = fVarMo4938a;
            }
            this.f11676i = c2631d.f11613d;
            this.f11677j = new C2664h1();
            this.f11680m = c2631d.f11615f;
            if (fVarMo4938a.mo5480m()) {
                this.f11681n = new BinderC2684p0(C2659g.this.f11663k, C2659g.this.f11672t, c2631d.m5486b().m5584a());
            } else {
                this.f11681n = null;
            }
        }

        @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2656f
        /* JADX INFO: renamed from: Q */
        public final void mo5510Q(int i) {
            if (Looper.myLooper() == C2659g.this.f11672t.getLooper()) {
                m5524g();
            } else {
                C2659g.this.f11672t.post(new RunnableC2645b0(this));
            }
        }

        @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2674l
        /* JADX INFO: renamed from: W */
        public final void mo5517W(C2602b c2602b) {
            InterfaceC4761e interfaceC4761e;
            C2622l.m5349c(C2659g.this.f11672t);
            BinderC2684p0 binderC2684p0 = this.f11681n;
            if (binderC2684p0 != null && (interfaceC4761e = binderC2684p0.f11744l) != null) {
                interfaceC4761e.mo5133J();
            }
            m5527j();
            C2659g.this.f11665m.f11886a.clear();
            m5534q(c2602b);
            if (c2602b.f11553h == 4) {
                m5530m(C2659g.f11659g);
                return;
            }
            if (this.f11673f.isEmpty()) {
                this.f11684q = c2602b;
                return;
            }
            if (m5533p(c2602b) || C2659g.this.m5516d(c2602b, this.f11680m)) {
                return;
            }
            if (c2602b.f11553h == 18) {
                this.f11682o = true;
            }
            if (this.f11682o) {
                Handler handler = C2659g.this.f11672t;
                Message messageObtain = Message.obtain(handler, 9, this.f11676i);
                Objects.requireNonNull(C2659g.this);
                handler.sendMessageDelayed(messageObtain, 5000L);
                return;
            }
            String str = this.f11676i.f11630b.f11607c;
            String strValueOf = String.valueOf(c2602b);
            StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(str).length() + 63);
            sb.append("API: ");
            sb.append(str);
            sb.append(" is not available on this device. Connection failed with: ");
            sb.append(strValueOf);
            m5530m(new Status(17, sb.toString()));
        }

        /* JADX INFO: renamed from: a */
        public final void m5518a() {
            C2622l.m5349c(C2659g.this.f11672t);
            if (this.f11674g.m5481u0() || this.f11674g.m5474d()) {
                return;
            }
            C2659g c2659g = C2659g.this;
            C2743l c2743l = c2659g.f11665m;
            Context context = c2659g.f11663k;
            C2628a.f fVar = this.f11674g;
            Objects.requireNonNull(c2743l);
            Objects.requireNonNull(context, "null reference");
            Objects.requireNonNull(fVar, "null reference");
            int iMo5207d = 0;
            if (fVar.m5478j()) {
                int iMo4925k = fVar.mo4925k();
                int i = c2743l.f11886a.get(iMo4925k, -1);
                if (i != -1) {
                    iMo5207d = i;
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= c2743l.f11886a.size()) {
                            iMo5207d = i;
                            break;
                        }
                        int iKeyAt = c2743l.f11886a.keyAt(i2);
                        if (iKeyAt > iMo4925k && c2743l.f11886a.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (iMo5207d == -1) {
                        iMo5207d = c2743l.f11887b.mo5207d(context, iMo4925k);
                    }
                    c2743l.f11886a.put(iMo4925k, iMo5207d);
                }
            }
            if (iMo5207d != 0) {
                mo5517W(new C2602b(iMo5207d, null));
                return;
            }
            b bVar = C2659g.this.new b(this.f11674g, this.f11676i);
            if (this.f11674g.mo5480m()) {
                BinderC2684p0 binderC2684p0 = this.f11681n;
                InterfaceC4761e interfaceC4761e = binderC2684p0.f11744l;
                if (interfaceC4761e != null) {
                    interfaceC4761e.mo5133J();
                }
                binderC2684p0.f11743k.f11832i = Integer.valueOf(System.identityHashCode(binderC2684p0));
                C2628a.a<? extends InterfaceC4761e, C4746a> aVar = binderC2684p0.f11741i;
                Context context2 = binderC2684p0.f11739g;
                Looper looper = binderC2684p0.f11740h.getLooper();
                C2720d c2720d = binderC2684p0.f11743k;
                binderC2684p0.f11744l = (InterfaceC4761e) aVar.mo4938a(context2, looper, c2720d, c2720d.f11831h, binderC2684p0, binderC2684p0);
                binderC2684p0.f11745m = bVar;
                Set<Scope> set = binderC2684p0.f11742j;
                if (set == null || set.isEmpty()) {
                    binderC2684p0.f11740h.post(new RunnableC2682o0(binderC2684p0));
                } else {
                    binderC2684p0.f11744l.mo10916K();
                }
            }
            this.f11674g.m5476f(bVar);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m5519b() {
            return this.f11674g.mo5480m();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public final C2606d m5520c(C2606d[] c2606dArr) {
            if (c2606dArr != null && c2606dArr.length != 0) {
                C2606d[] c2606dArrM5479l = this.f11674g.m5479l();
                if (c2606dArrM5479l == null) {
                    c2606dArrM5479l = new C2606d[0];
                }
                ArrayMap arrayMap = new ArrayMap(c2606dArrM5479l.length);
                for (C2606d c2606d : c2606dArrM5479l) {
                    arrayMap.put(c2606d.f11558f, Long.valueOf(c2606d.m5198H()));
                }
                for (C2606d c2606d2 : c2606dArr) {
                    if (!arrayMap.containsKey(c2606d2.f11558f) || ((Long) arrayMap.get(c2606d2.f11558f)).longValue() < c2606d2.m5198H()) {
                        return c2606d2;
                    }
                }
            }
            return null;
        }

        @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2656f
        /* JADX INFO: renamed from: c0 */
        public final void mo5511c0(Bundle bundle) {
            if (Looper.myLooper() == C2659g.this.f11672t.getLooper()) {
                m5523f();
            } else {
                C2659g.this.f11672t.post(new RunnableC2642a0(this));
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m5521d(AbstractC2678m0 abstractC2678m0) {
            C2622l.m5349c(C2659g.this.f11672t);
            if (this.f11674g.m5481u0()) {
                if (m5522e(abstractC2678m0)) {
                    m5529l();
                    return;
                } else {
                    this.f11673f.add(abstractC2678m0);
                    return;
                }
            }
            this.f11673f.add(abstractC2678m0);
            C2602b c2602b = this.f11684q;
            if (c2602b == null || !c2602b.m5196H()) {
                m5518a();
            } else {
                mo5517W(this.f11684q);
            }
        }

        /* JADX INFO: renamed from: e */
        public final boolean m5522e(AbstractC2678m0 abstractC2678m0) {
            if (!(abstractC2678m0 instanceof AbstractC2701y)) {
                m5531n(abstractC2678m0);
                return true;
            }
            AbstractC2701y abstractC2701y = (AbstractC2701y) abstractC2678m0;
            C2606d c2606dM5520c = m5520c(abstractC2701y.mo5497f(this));
            if (c2606dM5520c == null) {
                m5531n(abstractC2678m0);
                return true;
            }
            if (!abstractC2701y.mo5498g(this)) {
                abstractC2701y.mo5548c(new C2640m(c2606dM5520c));
                return false;
            }
            c cVar = new c(this.f11676i, c2606dM5520c, null);
            int iIndexOf = this.f11683p.indexOf(cVar);
            if (iIndexOf >= 0) {
                c cVar2 = this.f11683p.get(iIndexOf);
                C2659g.this.f11672t.removeMessages(15, cVar2);
                Handler handler = C2659g.this.f11672t;
                Message messageObtain = Message.obtain(handler, 15, cVar2);
                Objects.requireNonNull(C2659g.this);
                handler.sendMessageDelayed(messageObtain, 5000L);
                return false;
            }
            this.f11683p.add(cVar);
            Handler handler2 = C2659g.this.f11672t;
            Message messageObtain2 = Message.obtain(handler2, 15, cVar);
            Objects.requireNonNull(C2659g.this);
            handler2.sendMessageDelayed(messageObtain2, 5000L);
            Handler handler3 = C2659g.this.f11672t;
            Message messageObtain3 = Message.obtain(handler3, 16, cVar);
            Objects.requireNonNull(C2659g.this);
            handler3.sendMessageDelayed(messageObtain3, 120000L);
            C2602b c2602b = new C2602b(2, null);
            if (m5533p(c2602b)) {
                return false;
            }
            C2659g.this.m5516d(c2602b, this.f11680m);
            return false;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: f */
        public final void m5523f() {
            m5527j();
            m5534q(C2602b.f11551f);
            m5528k();
            Iterator<C2669j0> it = this.f11679l.values().iterator();
            while (it.hasNext()) {
                C2669j0 next = it.next();
                if (m5520c(next.f11710a.f11730b) != null) {
                    it.remove();
                } else {
                    try {
                        AbstractC2677m<C2628a.b, ?> abstractC2677m = next.f11710a;
                        C2628a.b bVar = this.f11675h;
                        ((C2680n0) abstractC2677m).f11736d.f11732a.mo4950a((A) bVar, new C4782j<>());
                    } catch (DeadObjectException unused) {
                        mo5510Q(1);
                        this.f11674g.mo5133J();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            m5525h();
            m5529l();
        }

        /* JADX INFO: renamed from: g */
        public final void m5524g() {
            m5527j();
            this.f11682o = true;
            C2664h1 c2664h1 = this.f11677j;
            Objects.requireNonNull(c2664h1);
            c2664h1.m5539a(true, C2694u0.f11759a);
            Handler handler = C2659g.this.f11672t;
            Message messageObtain = Message.obtain(handler, 9, this.f11676i);
            Objects.requireNonNull(C2659g.this);
            handler.sendMessageDelayed(messageObtain, 5000L);
            Handler handler2 = C2659g.this.f11672t;
            Message messageObtain2 = Message.obtain(handler2, 11, this.f11676i);
            Objects.requireNonNull(C2659g.this);
            handler2.sendMessageDelayed(messageObtain2, 120000L);
            C2659g.this.f11665m.f11886a.clear();
        }

        /* JADX INFO: renamed from: h */
        public final void m5525h() {
            ArrayList arrayList = new ArrayList(this.f11673f);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                AbstractC2678m0 abstractC2678m0 = (AbstractC2678m0) obj;
                if (!this.f11674g.m5481u0()) {
                    return;
                }
                if (m5522e(abstractC2678m0)) {
                    this.f11673f.remove(abstractC2678m0);
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m5526i() {
            C2622l.m5349c(C2659g.this.f11672t);
            Status status = C2659g.f11658f;
            m5530m(status);
            C2664h1 c2664h1 = this.f11677j;
            Objects.requireNonNull(c2664h1);
            c2664h1.m5539a(false, status);
            for (C2671k.a aVar : (C2671k.a[]) this.f11679l.keySet().toArray(new C2671k.a[this.f11679l.size()])) {
                m5521d(new C2643a1(aVar, new C4782j()));
            }
            m5534q(new C2602b(4));
            if (this.f11674g.m5481u0()) {
                this.f11674g.m5477g(new C2651d0(this));
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m5527j() {
            C2622l.m5349c(C2659g.this.f11672t);
            this.f11684q = null;
        }

        /* JADX INFO: renamed from: k */
        public final void m5528k() {
            if (this.f11682o) {
                C2659g.this.f11672t.removeMessages(11, this.f11676i);
                C2659g.this.f11672t.removeMessages(9, this.f11676i);
                this.f11682o = false;
            }
        }

        /* JADX INFO: renamed from: l */
        public final void m5529l() {
            C2659g.this.f11672t.removeMessages(12, this.f11676i);
            Handler handler = C2659g.this.f11672t;
            handler.sendMessageDelayed(handler.obtainMessage(12, this.f11676i), C2659g.this.f11662j);
        }

        /* JADX INFO: renamed from: m */
        public final void m5530m(Status status) {
            C2622l.m5349c(C2659g.this.f11672t);
            Iterator<AbstractC2678m0> it = this.f11673f.iterator();
            while (it.hasNext()) {
                it.next().mo5547a(status);
            }
            this.f11673f.clear();
        }

        /* JADX INFO: renamed from: n */
        public final void m5531n(AbstractC2678m0 abstractC2678m0) {
            abstractC2678m0.mo5496b(this.f11677j, m5519b());
            try {
                abstractC2678m0.mo5549e(this);
            } catch (DeadObjectException unused) {
                mo5510Q(1);
                this.f11674g.mo5133J();
            }
        }

        /* JADX INFO: renamed from: o */
        public final boolean m5532o(boolean z) {
            C2622l.m5349c(C2659g.this.f11672t);
            if (!this.f11674g.m5481u0() || this.f11679l.size() != 0) {
                return false;
            }
            C2664h1 c2664h1 = this.f11677j;
            if (!((c2664h1.f11701a.isEmpty() && c2664h1.f11702b.isEmpty()) ? false : true)) {
                this.f11674g.mo5133J();
                return true;
            }
            if (z) {
                m5529l();
            }
            return false;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m5533p(C2602b c2602b) {
            synchronized (C2659g.f11660h) {
                C2659g c2659g = C2659g.this;
                if (c2659g.f11669q == null || !c2659g.f11670r.contains(this.f11676i)) {
                    return false;
                }
                C2695v c2695v = C2659g.this.f11669q;
                int i = this.f11680m;
                Objects.requireNonNull(c2695v);
                C2655e1 c2655e1 = new C2655e1(c2602b, i);
                if (c2695v.f11645h.compareAndSet(null, c2655e1)) {
                    c2695v.f11646i.post(new RunnableC2652d1(c2695v, c2655e1));
                }
                return true;
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m5534q(C2602b c2602b) {
            for (C2646b1 c2646b1 : this.f11678k) {
                String strM5475e = null;
                if (C2622l.m5459y(c2602b, C2602b.f11551f)) {
                    strM5475e = this.f11674g.m5475e();
                }
                c2646b1.m5500a(this.f11676i, c2602b, strM5475e);
            }
            this.f11678k.clear();
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.f.o.n.g$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public class b implements InterfaceC2686q0, AbstractC2717c.c {

        /* JADX INFO: renamed from: a */
        public final C2628a.f f11686a;

        /* JADX INFO: renamed from: b */
        public final C2644b<?> f11687b;

        /* JADX INFO: renamed from: c */
        public InterfaceC2745m f11688c = null;

        /* JADX INFO: renamed from: d */
        public Set<Scope> f11689d = null;

        /* JADX INFO: renamed from: e */
        public boolean f11690e = false;

        public b(C2628a.f fVar, C2644b<?> c2644b) {
            this.f11686a = fVar;
            this.f11687b = c2644b;
        }

        @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.c
        /* JADX INFO: renamed from: a */
        public final void mo5535a(C2602b c2602b) {
            C2659g.this.f11672t.post(new RunnableC2657f0(this, c2602b));
        }

        /* JADX INFO: renamed from: b */
        public final void m5536b(C2602b c2602b) {
            a<?> aVar = C2659g.this.f11668p.get(this.f11687b);
            C2622l.m5349c(C2659g.this.f11672t);
            aVar.f11674g.mo5133J();
            aVar.mo5517W(c2602b);
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.f.o.n.g$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final C2644b<?> f11692a;

        /* JADX INFO: renamed from: b */
        public final C2606d f11693b;

        public c(C2644b c2644b, C2606d c2606d, C2703z c2703z) {
            this.f11692a = c2644b;
            this.f11693b = c2606d;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                if (C2622l.m5459y(this.f11692a, cVar.f11692a) && C2622l.m5459y(this.f11693b, cVar.f11693b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f11692a, this.f11693b});
        }

        public final String toString() {
            C2753q c2753q = new C2753q(this);
            c2753q.m5608a("key", this.f11692a);
            c2753q.m5608a("feature", this.f11693b);
            return c2753q.toString();
        }
    }

    public C2659g(Context context, Looper looper, C2608e c2608e) {
        this.f11663k = context;
        HandlerC3807c handlerC3807c = new HandlerC3807c(looper, this);
        this.f11672t = handlerC3807c;
        this.f11664l = c2608e;
        this.f11665m = new C2743l(c2608e);
        handlerC3807c.sendMessage(handlerC3807c.obtainMessage(6));
    }

    /* JADX INFO: renamed from: b */
    public static C2659g m5513b(Context context) {
        C2659g c2659g;
        synchronized (f11660h) {
            if (f11661i == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f11661i = new C2659g(context.getApplicationContext(), handlerThread.getLooper(), C2608e.f11563d);
            }
            c2659g = f11661i;
        }
        return c2659g;
    }

    /* JADX INFO: renamed from: a */
    public final void m5514a(C2695v c2695v) {
        synchronized (f11660h) {
            if (this.f11669q != c2695v) {
                this.f11669q = c2695v;
                this.f11670r.clear();
            }
            this.f11670r.addAll(c2695v.f11762k);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: c */
    public final void m5515c(C2631d<?> c2631d) {
        C2644b<O> c2644b = c2631d.f11613d;
        a<?> aVar = this.f11668p.get(c2644b);
        if (aVar == null) {
            aVar = new a<>(c2631d);
            this.f11668p.put((C2644b<?>) c2644b, aVar);
        }
        if (aVar.m5519b()) {
            this.f11671s.add((C2644b<?>) c2644b);
        }
        aVar.m5518a();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5516d(C2602b c2602b, int i) {
        PendingIntent activity;
        C2608e c2608e = this.f11664l;
        Context context = this.f11663k;
        Objects.requireNonNull(c2608e);
        if (c2602b.m5196H()) {
            activity = c2602b.f11554i;
        } else {
            Intent intentMo5205b = c2608e.mo5205b(context, c2602b.f11553h, null);
            activity = intentMo5205b == null ? null : PendingIntent.getActivity(context, 0, intentMo5205b, 134217728);
        }
        if (activity == null) {
            return false;
        }
        int i2 = c2602b.f11553h;
        int i3 = GoogleApiActivity.f28644f;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        c2608e.m5210i(context, i2, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0243  */
    /* JADX WARN: Code duplicated, block: B:88:0x028a  */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C2606d[] c2606dArrMo5497f;
        int i = message.what;
        int i2 = 0;
        a<?> aVar = null;
        switch (i) {
            case 1:
                this.f11662j = ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f11672t.removeMessages(12);
                for (C2644b<?> c2644b : this.f11668p.keySet()) {
                    Handler handler = this.f11672t;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c2644b), this.f11662j);
                }
                return true;
            case 2:
                C2646b1 c2646b1 = (C2646b1) message.obj;
                Iterator it = ((MapCollections.c) c2646b1.f11633a.keySet()).iterator();
                while (true) {
                    MapCollections.a aVar2 = (MapCollections.a) it;
                    if (aVar2.hasNext()) {
                        C2644b<?> c2644b2 = (C2644b) aVar2.next();
                        a<?> aVar3 = this.f11668p.get(c2644b2);
                        if (aVar3 == null) {
                            c2646b1.m5500a(c2644b2, new C2602b(13), null);
                        } else if (aVar3.f11674g.m5481u0()) {
                            c2646b1.m5500a(c2644b2, C2602b.f11551f, aVar3.f11674g.m5475e());
                        } else {
                            C2622l.m5349c(C2659g.this.f11672t);
                            if (aVar3.f11684q != null) {
                                C2622l.m5349c(C2659g.this.f11672t);
                                c2646b1.m5500a(c2644b2, aVar3.f11684q, null);
                            } else {
                                C2622l.m5349c(C2659g.this.f11672t);
                                aVar3.f11678k.add(c2646b1);
                                aVar3.m5518a();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (a<?> aVar4 : this.f11668p.values()) {
                    aVar4.m5527j();
                    aVar4.m5518a();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C2666i0 c2666i0 = (C2666i0) message.obj;
                a<?> aVar5 = this.f11668p.get(c2666i0.f11706c.f11613d);
                if (aVar5 == null) {
                    m5515c(c2666i0.f11706c);
                    aVar5 = this.f11668p.get(c2666i0.f11706c.f11613d);
                }
                if (!aVar5.m5519b() || this.f11667o.get() == c2666i0.f11705b) {
                    aVar5.m5521d(c2666i0.f11704a);
                } else {
                    c2666i0.f11704a.mo5547a(f11658f);
                    aVar5.m5526i();
                }
                return true;
            case 5:
                int i3 = message.arg1;
                C2602b c2602b = (C2602b) message.obj;
                for (a<?> aVar6 : this.f11668p.values()) {
                    if (aVar6.f11680m == i3) {
                        aVar = aVar6;
                        if (aVar != null) {
                            C2608e c2608e = this.f11664l;
                            int i4 = c2602b.f11553h;
                            Objects.requireNonNull(c2608e);
                            AtomicBoolean atomicBoolean = C2618j.f11583a;
                            String strM5195L = C2602b.m5195L(i4);
                            String str = c2602b.f11555j;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(strM5195L).length() + 69);
                            sb.append("Error resolution was canceled by the user, original error message: ");
                            sb.append(strM5195L);
                            sb.append(": ");
                            sb.append(str);
                            aVar.m5530m(new Status(17, sb.toString()));
                        } else {
                            StringBuilder sb2 = new StringBuilder(76);
                            sb2.append("Could not find API instance ");
                            sb2.append(i3);
                            sb2.append(" while trying to fail enqueued calls.");
                            Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                        }
                        return true;
                    }
                }
                if (aVar != null) {
                    C2608e c2608e2 = this.f11664l;
                    int i5 = c2602b.f11553h;
                    Objects.requireNonNull(c2608e2);
                    AtomicBoolean atomicBoolean2 = C2618j.f11583a;
                    String strM5195L2 = C2602b.m5195L(i5);
                    String str2 = c2602b.f11555j;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + String.valueOf(strM5195L2).length() + 69);
                    sb3.append("Error resolution was canceled by the user, original error message: ");
                    sb3.append(strM5195L2);
                    sb3.append(": ");
                    sb3.append(str2);
                    aVar.m5530m(new Status(17, sb3.toString()));
                } else {
                    StringBuilder sb4 = new StringBuilder(76);
                    sb4.append("Could not find API instance ");
                    sb4.append(i3);
                    sb4.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb4.toString(), new Exception());
                }
                return true;
            case 6:
                if (this.f11663k.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C2647c.m5501a((Application) this.f11663k.getApplicationContext());
                    ComponentCallbacks2C2647c componentCallbacks2C2647c = ComponentCallbacks2C2647c.f11638f;
                    C2703z c2703z = new C2703z(this);
                    Objects.requireNonNull(componentCallbacks2C2647c);
                    synchronized (componentCallbacks2C2647c) {
                        componentCallbacks2C2647c.f11641i.add(c2703z);
                        break;
                    }
                    if (!componentCallbacks2C2647c.f11640h.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!componentCallbacks2C2647c.f11640h.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            componentCallbacks2C2647c.f11639g.set(true);
                        }
                    }
                    if (!componentCallbacks2C2647c.f11639g.get()) {
                        this.f11662j = 300000L;
                    }
                }
                return true;
            case 7:
                m5515c((C2631d) message.obj);
                return true;
            case 9:
                if (this.f11668p.containsKey(message.obj)) {
                    a<?> aVar7 = this.f11668p.get(message.obj);
                    C2622l.m5349c(C2659g.this.f11672t);
                    if (aVar7.f11682o) {
                        aVar7.m5518a();
                    }
                }
                return true;
            case 10:
                Iterator<C2644b<?>> it2 = this.f11671s.iterator();
                while (it2.hasNext()) {
                    this.f11668p.remove(it2.next()).m5526i();
                }
                this.f11671s.clear();
                return true;
            case 11:
                if (this.f11668p.containsKey(message.obj)) {
                    a<?> aVar8 = this.f11668p.get(message.obj);
                    C2622l.m5349c(C2659g.this.f11672t);
                    if (aVar8.f11682o) {
                        aVar8.m5528k();
                        C2659g c2659g = C2659g.this;
                        aVar8.m5530m(c2659g.f11664l.mo5206c(c2659g.f11663k) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                        aVar8.f11674g.mo5133J();
                    }
                }
                return true;
            case 12:
                if (this.f11668p.containsKey(message.obj)) {
                    this.f11668p.get(message.obj).m5532o(true);
                }
                return true;
            case 14:
                C2697w c2697w = (C2697w) message.obj;
                C2644b<?> c2644b3 = c2697w.f11764a;
                if (this.f11668p.containsKey(c2644b3)) {
                    c2697w.f11765b.f24683a.m10944q(Boolean.valueOf(this.f11668p.get(c2644b3).m5532o(false)));
                } else {
                    c2697w.f11765b.f24683a.m10944q(Boolean.FALSE);
                }
                return true;
            case 15:
                c cVar = (c) message.obj;
                if (this.f11668p.containsKey(cVar.f11692a)) {
                    a<?> aVar9 = this.f11668p.get(cVar.f11692a);
                    if (aVar9.f11683p.contains(cVar) && !aVar9.f11682o) {
                        if (aVar9.f11674g.m5481u0()) {
                            aVar9.m5525h();
                        } else {
                            aVar9.m5518a();
                        }
                    }
                }
                return true;
            case 16:
                c cVar2 = (c) message.obj;
                if (this.f11668p.containsKey(cVar2.f11692a)) {
                    a<?> aVar10 = this.f11668p.get(cVar2.f11692a);
                    if (aVar10.f11683p.remove(cVar2)) {
                        C2659g.this.f11672t.removeMessages(15, cVar2);
                        C2659g.this.f11672t.removeMessages(16, cVar2);
                        C2606d c2606d = cVar2.f11693b;
                        ArrayList arrayList = new ArrayList(aVar10.f11673f.size());
                        for (AbstractC2678m0 abstractC2678m0 : aVar10.f11673f) {
                            if ((abstractC2678m0 instanceof AbstractC2701y) && (c2606dArrMo5497f = ((AbstractC2701y) abstractC2678m0).mo5497f(aVar10)) != null && C2622l.m5394l(c2606dArrMo5497f, c2606d)) {
                                arrayList.add(abstractC2678m0);
                            }
                        }
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            AbstractC2678m0 abstractC2678m1 = (AbstractC2678m0) obj;
                            aVar10.f11673f.remove(abstractC2678m1);
                            abstractC2678m1.mo5548c(new C2640m(c2606d));
                        }
                    }
                }
                return true;
            default:
                StringBuilder sb5 = new StringBuilder(31);
                sb5.append("Unknown message id: ");
                sb5.append(i);
                Log.w("GoogleApiManager", sb5.toString());
                return false;
        }
    }
}
