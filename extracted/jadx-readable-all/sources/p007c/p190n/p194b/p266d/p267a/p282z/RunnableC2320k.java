package p007c.p190n.p194b.p266d.p267a.p282z;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C2962do;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3331nn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3702xn;
import p007c.p190n.p194b.p266d.p314j.p315a.fg2;
import p007c.p190n.p194b.p266d.p314j.p315a.gr1;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;
import p007c.p190n.p194b.p266d.p314j.p315a.np1;
import p007c.p190n.p194b.p266d.p314j.p315a.qd2;
import p007c.p190n.p194b.p266d.p314j.p315a.tb2;
import p007c.p190n.p194b.p266d.p314j.p315a.x82;

/* JADX INFO: renamed from: c.n.b.d.a.z.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2320k implements Runnable, tb2 {

    /* JADX INFO: renamed from: i */
    public final boolean f10845i;

    /* JADX INFO: renamed from: j */
    public final boolean f10846j;

    /* JADX INFO: renamed from: k */
    public final boolean f10847k;

    /* JADX INFO: renamed from: l */
    public final Executor f10848l;

    /* JADX INFO: renamed from: m */
    public final np1 f10849m;

    /* JADX INFO: renamed from: n */
    public Context f10850n;

    /* JADX INFO: renamed from: o */
    public final Context f10851o;

    /* JADX INFO: renamed from: p */
    public C3702xn f10852p;

    /* JADX INFO: renamed from: q */
    public final C3702xn f10853q;

    /* JADX INFO: renamed from: r */
    public final boolean f10854r;

    /* JADX INFO: renamed from: t */
    public int f10856t;

    /* JADX INFO: renamed from: f */
    public final List<Object[]> f10842f = new Vector();

    /* JADX INFO: renamed from: g */
    public final AtomicReference<tb2> f10843g = new AtomicReference<>();

    /* JADX INFO: renamed from: h */
    public final AtomicReference<tb2> f10844h = new AtomicReference<>();

    /* JADX INFO: renamed from: s */
    public final CountDownLatch f10855s = new CountDownLatch(1);

    public RunnableC2320k(Context context, C3702xn c3702xn) {
        boolean z = true;
        this.f10850n = context;
        this.f10851o = context;
        this.f10852p = c3702xn;
        this.f10853q = c3702xn;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f10848l = executorServiceNewCachedThreadPool;
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14396m1;
        C2862b c2862b = C2862b.f12493a;
        boolean zBooleanValue = ((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue();
        this.f10854r = zBooleanValue;
        np1 np1VarM7912a = np1.m7912a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f10849m = np1VarM7912a;
        this.f10846j = ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14375j1)).booleanValue();
        this.f10847k = ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14403n1)).booleanValue();
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14389l1)).booleanValue()) {
            this.f10856t = 2;
        } else {
            this.f10856t = 1;
        }
        Context context2 = this.f10850n;
        C2319j c2319j = new C2319j(this);
        gr1 gr1Var = new gr1(this.f10850n, C2622l.m5269J1(context2, np1VarM7912a), c2319j, ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14382k1)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (gr1.f14650a) {
            fg2 fg2VarM7027h = gr1Var.m7027h(1);
            if (fg2VarM7027h == null) {
                gr1Var.m7026g(4025, jCurrentTimeMillis);
            } else {
                File fileM7023c = gr1Var.m7023c(fg2VarM7027h.m6810v());
                if (!new File(fileM7023c, "pcam.jar").exists()) {
                    gr1Var.m7026g(4026, jCurrentTimeMillis);
                } else if (new File(fileM7023c, "pcbc").exists()) {
                    gr1Var.m7026g(5019, jCurrentTimeMillis);
                } else {
                    gr1Var.m7026g(4027, jCurrentTimeMillis);
                }
            }
            z = false;
        }
        this.f10845i = z;
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14172D1)).booleanValue()) {
            C2962do.f13330a.execute(this);
            return;
        }
        C3331nn c3331nn = gx2.f14692a.f14693b;
        if (C3331nn.m7890h()) {
            C2962do.f13330a.execute(this);
        } else {
            run();
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Context m4851k(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: a */
    public final void mo4852a(MotionEvent motionEvent) {
        tb2 tb2VarM4861j = m4861j();
        if (tb2VarM4861j == null) {
            this.f10842f.add(new Object[]{motionEvent});
        } else {
            m4859h();
            tb2VarM4861j.mo4852a(motionEvent);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: b */
    public final String mo4853b(Context context, View view, Activity activity) {
        tb2 tb2VarM4861j = m4861j();
        return tb2VarM4861j != null ? tb2VarM4861j.mo4853b(context, view, null) : "";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: c */
    public final String mo4854c(Context context, String str, View view, Activity activity) {
        boolean z;
        tb2 tb2VarM4861j;
        try {
            this.f10855s.await();
            z = true;
        } catch (InterruptedException e) {
            C2622l.m5241D3("Interrupted during GADSignals creation.", e);
            z = false;
        }
        if (!z || (tb2VarM4861j = m4861j()) == null) {
            return "";
        }
        m4859h();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return tb2VarM4861j.mo4854c(context, str, view, activity);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: d */
    public final void mo4855d(int i, int i2, int i3) {
        tb2 tb2VarM4861j = m4861j();
        if (tb2VarM4861j == null) {
            this.f10842f.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            m4859h();
            tb2VarM4861j.mo4855d(i, i2, i3);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: e */
    public final String mo4856e(Context context, String str, View view) {
        return mo4854c(context, str, view, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: f */
    public final String mo4857f(Context context) {
        boolean z;
        tb2 tb2VarM4861j;
        try {
            this.f10855s.await();
            z = true;
        } catch (InterruptedException e) {
            C2622l.m5241D3("Interrupted during GADSignals creation.", e);
            z = false;
        }
        if (!z || (tb2VarM4861j = m4861j()) == null) {
            return "";
        }
        m4859h();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return tb2VarM4861j.mo4857f(context);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: g */
    public final void mo4858g(View view) {
        tb2 tb2VarM4861j = m4861j();
        if (tb2VarM4861j != null) {
            tb2VarM4861j.mo4858g(view);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4859h() {
        tb2 tb2VarM4861j = m4861j();
        if (this.f10842f.isEmpty() || tb2VarM4861j == null) {
            return;
        }
        for (Object[] objArr : this.f10842f) {
            int length = objArr.length;
            if (length == 1) {
                tb2VarM4861j.mo4852a((MotionEvent) objArr[0]);
            } else if (length == 3) {
                tb2VarM4861j.mo4855d(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f10842f.clear();
    }

    /* JADX INFO: renamed from: i */
    public final void m4860i(boolean z) {
        this.f10843g.set(qd2.m8201r(this.f10852p.f21615f, m4851k(this.f10850n), z, this.f10856t));
    }

    /* JADX INFO: renamed from: j */
    public final tb2 m4861j() {
        return ((!this.f10846j || this.f10845i) ? this.f10856t : 1) == 2 ? this.f10844h.get() : this.f10843g.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            boolean z2 = this.f10852p.f21618i;
            final boolean z3 = false;
            if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14164C0)).booleanValue() && z2) {
                z3 = true;
            }
            if (((!this.f10846j || this.f10845i) ? this.f10856t : 1) == 1) {
                m4860i(z3);
                if (this.f10856t == 2) {
                    this.f10848l.execute(new Runnable(this, z3) { // from class: c.n.b.d.a.z.i

                        /* JADX INFO: renamed from: f */
                        public final RunnableC2320k f10839f;

                        /* JADX INFO: renamed from: g */
                        public final boolean f10840g;

                        {
                            this.f10839f = this;
                            this.f10840g = z3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            RunnableC2320k runnableC2320k = this.f10839f;
                            boolean z4 = this.f10840g;
                            Objects.requireNonNull(runnableC2320k);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                x82.m8724h(runnableC2320k.f10853q.f21615f, RunnableC2320k.m4851k(runnableC2320k.f10851o), z4, runnableC2320k.f10854r).m8728j();
                            } catch (NullPointerException e) {
                                runnableC2320k.f10849m.m7914c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
                            }
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    x82 x82VarM8724h = x82.m8724h(this.f10852p.f21615f, m4851k(this.f10850n), z3, this.f10854r);
                    this.f10844h.set(x82VarM8724h);
                    if (this.f10847k) {
                        synchronized (x82VarM8724h) {
                            z = x82VarM8724h.f21467s;
                        }
                        if (!z) {
                            this.f10856t = 1;
                            m4860i(z3);
                        }
                    }
                } catch (NullPointerException e) {
                    this.f10856t = 1;
                    m4860i(z3);
                    this.f10849m.m7914c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.f10855s.countDown();
            this.f10850n = null;
            this.f10852p = null;
        } catch (Throwable th) {
            this.f10855s.countDown();
            this.f10850n = null;
            this.f10852p = null;
            throw th;
        }
    }
}
