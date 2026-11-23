package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2636i;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2639l;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2661g1;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2696v0;
import p007c.p190n.p194b.p266d.p314j.p319e.HandlerC3807c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends InterfaceC2638k> extends AbstractC2634g<R> {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Boolean> f28658a = new C2661g1();

    /* JADX INFO: renamed from: b */
    public final Object f28659b;

    /* JADX INFO: renamed from: c */
    public final HandlerC5897a<R> f28660c;

    /* JADX INFO: renamed from: d */
    public final CountDownLatch f28661d;

    /* JADX INFO: renamed from: e */
    public final ArrayList<AbstractC2634g.a> f28662e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2639l<? super R> f28663f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference<InterfaceC2696v0> f28664g;

    /* JADX INFO: renamed from: h */
    public R f28665h;

    /* JADX INFO: renamed from: i */
    public Status f28666i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f28667j;

    /* JADX INFO: renamed from: k */
    public boolean f28668k;

    /* JADX INFO: renamed from: l */
    public boolean f28669l;

    /* JADX INFO: renamed from: m */
    public boolean f28670m;

    @KeepName
    public C5898b mResultGuardian;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class HandlerC5897a<R extends InterfaceC2638k> extends HandlerC3807c {
        public HandlerC5897a() {
            this(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("BasePendingResult", outline.m1585g(45, "Don't know how to handle message: ", i), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).m12661l(Status.f28651i);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            InterfaceC2639l interfaceC2639l = (InterfaceC2639l) pair.first;
            InterfaceC2638k interfaceC2638k = (InterfaceC2638k) pair.second;
            try {
                interfaceC2639l.mo5012a(interfaceC2638k);
            } catch (RuntimeException e) {
                BasePendingResult.m12655k(interfaceC2638k);
                throw e;
            }
        }

        public HandlerC5897a(Looper looper) {
            super(looper);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public final class C5898b {
        public C5898b(C2661g1 c2661g1) {
        }

        public final void finalize() throws Throwable {
            BasePendingResult.m12655k(BasePendingResult.this.f28665h);
            super.finalize();
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f28659b = new Object();
        this.f28661d = new CountDownLatch(1);
        this.f28662e = new ArrayList<>();
        this.f28664g = new AtomicReference<>();
        this.f28670m = false;
        this.f28660c = new HandlerC5897a<>(Looper.getMainLooper());
        new WeakReference(null);
    }

    /* JADX INFO: renamed from: k */
    public static void m12655k(InterfaceC2638k interfaceC2638k) {
        if (interfaceC2638k instanceof InterfaceC2636i) {
            try {
                ((InterfaceC2636i) interfaceC2638k).release();
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(interfaceC2638k);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g
    /* JADX INFO: renamed from: b */
    public final R mo5492b(long j2, TimeUnit timeUnit) {
        if (j2 > 0) {
            C2622l.m5369g("await must not be called on the UI thread when time is greater than zero.");
        }
        C2622l.m5389k(!this.f28667j, "Result has already been consumed.");
        C2622l.m5389k(true, "Cannot await if then() has been called.");
        try {
            if (!this.f28661d.await(j2, timeUnit)) {
                m12661l(Status.f28651i);
            }
        } catch (InterruptedException unused) {
            m12661l(Status.f28649g);
        }
        C2622l.m5389k(m12658h(), "Result is not ready.");
        return (R) m12657g();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g
    /* JADX INFO: renamed from: c */
    public void mo5493c() {
        synchronized (this.f28659b) {
            if (!this.f28668k && !this.f28667j) {
                m12655k(this.f28665h);
                this.f28668k = true;
                m12660j(mo4929f(Status.f28652j));
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g
    /* JADX INFO: renamed from: d */
    public final void mo5494d(InterfaceC2639l<? super R> interfaceC2639l) {
        boolean z;
        synchronized (this.f28659b) {
            C2622l.m5389k(!this.f28667j, "Result has already been consumed.");
            C2622l.m5389k(true, "Cannot set callbacks if then() has been called.");
            synchronized (this.f28659b) {
                z = this.f28668k;
            }
            if (z) {
                return;
            }
            if (m12658h()) {
                HandlerC5897a<R> handlerC5897a = this.f28660c;
                InterfaceC2638k interfaceC2638kM12657g = m12657g();
                Objects.requireNonNull(handlerC5897a);
                handlerC5897a.sendMessage(handlerC5897a.obtainMessage(1, new Pair(interfaceC2639l, interfaceC2638kM12657g)));
            } else {
                this.f28663f = interfaceC2639l;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12656e(AbstractC2634g.a aVar) {
        C2622l.m5344b(true, "Callback cannot be null.");
        synchronized (this.f28659b) {
            if (m12658h()) {
                aVar.mo5495a(this.f28666i);
            } else {
                this.f28662e.add(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract R mo4929f(Status status);

    /* JADX INFO: renamed from: g */
    public final R m12657g() {
        R r;
        synchronized (this.f28659b) {
            C2622l.m5389k(!this.f28667j, "Result has already been consumed.");
            C2622l.m5389k(m12658h(), "Result is not ready.");
            r = this.f28665h;
            this.f28665h = null;
            this.f28663f = null;
            this.f28667j = true;
        }
        InterfaceC2696v0 andSet = this.f28664g.getAndSet(null);
        if (andSet != null) {
            andSet.m5557a(this);
        }
        return r;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12658h() {
        return this.f28661d.getCount() == 0;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2653e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void mo4931a(R r) {
        synchronized (this.f28659b) {
            if (this.f28669l || this.f28668k) {
                m12655k(r);
                return;
            }
            m12658h();
            boolean z = true;
            C2622l.m5389k(!m12658h(), "Results have already been set");
            if (this.f28667j) {
                z = false;
            }
            C2622l.m5389k(z, "Result has already been consumed");
            m12660j(r);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12660j(R r) {
        this.f28665h = r;
        this.f28661d.countDown();
        this.f28666i = this.f28665h.mo4909B();
        if (this.f28668k) {
            this.f28663f = null;
        } else if (this.f28663f != null) {
            this.f28660c.removeMessages(2);
            HandlerC5897a<R> handlerC5897a = this.f28660c;
            InterfaceC2639l<? super R> interfaceC2639l = this.f28663f;
            InterfaceC2638k interfaceC2638kM12657g = m12657g();
            Objects.requireNonNull(handlerC5897a);
            handlerC5897a.sendMessage(handlerC5897a.obtainMessage(1, new Pair(interfaceC2639l, interfaceC2638kM12657g)));
        } else if (this.f28665h instanceof InterfaceC2636i) {
            this.mResultGuardian = new C5898b(null);
        }
        ArrayList<AbstractC2634g.a> arrayList = this.f28662e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AbstractC2634g.a aVar = arrayList.get(i);
            i++;
            aVar.mo5495a(this.f28666i);
        }
        this.f28662e.clear();
    }

    /* JADX INFO: renamed from: l */
    public final void m12661l(Status status) {
        synchronized (this.f28659b) {
            if (!m12658h()) {
                mo4931a(mo4929f(status));
                this.f28669l = true;
            }
        }
    }

    public BasePendingResult(AbstractC2632e abstractC2632e) {
        this.f28659b = new Object();
        this.f28661d = new CountDownLatch(1);
        this.f28662e = new ArrayList<>();
        this.f28664g = new AtomicReference<>();
        this.f28670m = false;
        this.f28660c = new HandlerC5897a<>(abstractC2632e != null ? abstractC2632e.mo5491b() : Looper.getMainLooper());
        new WeakReference(abstractC2632e);
    }

    @Deprecated
    public BasePendingResult(Looper looper) {
        this.f28659b = new Object();
        this.f28661d = new CountDownLatch(1);
        this.f28662e = new ArrayList<>();
        this.f28664g = new AtomicReference<>();
        this.f28670m = false;
        this.f28660c = new HandlerC5897a<>(looper);
        new WeakReference(null);
    }
}
