package p509g1.p510j0.p514g;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p483s.MutableCollections;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Call;
import p509g1.Callback;
import p509g1.Dispatcher4;
import p509g1.EventListener;
import p509g1.OkHttpClient;
import p509g1.Request3;
import p509g1.Response3;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p512e.CacheInterceptor;
import p509g1.p510j0.p513f.TaskQueue2;
import p509g1.p510j0.p515h.BridgeInterceptor;
import p509g1.p510j0.p515h.CallServerInterceptor;
import p509g1.p510j0.p515h.RealInterceptorChain;
import p509g1.p510j0.p515h.RetryAndFollowUpInterceptor;
import p509g1.p510j0.p519l.Platform;
import p524h1.AsyncTimeout;
import p623k1.OkHttpCall;

/* JADX INFO: renamed from: g1.j0.g.e, reason: use source file name */
/* JADX INFO: compiled from: RealCall.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RealCall implements Call {

    /* JADX INFO: renamed from: f */
    public final RealConnectionPool f30213f;

    /* JADX INFO: renamed from: g */
    public final EventListener f30214g;

    /* JADX INFO: renamed from: h */
    public final c f30215h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f30216i;

    /* JADX INFO: renamed from: j */
    public Object f30217j;

    /* JADX INFO: renamed from: k */
    public ExchangeFinder f30218k;

    /* JADX INFO: renamed from: l */
    public RealConnection f30219l;

    /* JADX INFO: renamed from: m */
    public boolean f30220m;

    /* JADX INFO: renamed from: n */
    public Exchange f30221n;

    /* JADX INFO: renamed from: o */
    public boolean f30222o;

    /* JADX INFO: renamed from: p */
    public boolean f30223p;

    /* JADX INFO: renamed from: q */
    public boolean f30224q;

    /* JADX INFO: renamed from: r */
    public volatile boolean f30225r;

    /* JADX INFO: renamed from: s */
    public volatile Exchange f30226s;

    /* JADX INFO: renamed from: t */
    public volatile RealConnection f30227t;

    /* JADX INFO: renamed from: u */
    public final OkHttpClient f30228u;

    /* JADX INFO: renamed from: v */
    public final Request3 f30229v;

    /* JADX INFO: renamed from: w */
    public final boolean f30230w;

    /* JADX INFO: renamed from: g1.j0.g.e$a */
    /* JADX INFO: compiled from: RealCall.kt */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public volatile AtomicInteger f30231f;

        /* JADX INFO: renamed from: g */
        public final Callback f30232g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ RealCall f30233h;

        public a(RealCall realCall, Callback callback) {
            Intrinsics2.m13090f(callback, "responseCallback");
            this.f30233h = realCall;
            this.f30232g = callback;
            this.f30231f = new AtomicInteger(0);
        }

        /* JADX INFO: renamed from: a */
        public final String m13452a() {
            return this.f30233h.f30229v.f29951b.f30647g;
        }

        @Override // java.lang.Runnable
        public void run() {
            RealCall realCall;
            StringBuilder sbM1556G = outline.m1556G("OkHttp ");
            sbM1556G.append(this.f30233h.f30229v.f29951b.m13671h());
            String string = sbM1556G.toString();
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics2.m13086b(threadCurrentThread, "currentThread");
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(string);
            try {
                this.f30233h.f30215h.m13703h();
                boolean z = false;
                try {
                    try {
                        try {
                            ((OkHttpCall.a) this.f30232g).m14304b(this.f30233h, this.f30233h.m13448i());
                            realCall = this.f30233h;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                Objects.requireNonNull(Platform.f30547c);
                                Platform.f30545a.m13605i("Callback failure for " + RealCall.m13443a(this.f30233h), 4, e);
                            } else {
                                ((OkHttpCall.a) this.f30232g).m14303a(this.f30233h, e);
                            }
                            realCall = this.f30233h;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            this.f30233h.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                iOException.addSuppressed(th);
                                ((OkHttpCall.a) this.f30232g).m14303a(this.f30233h, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.f30233h.f30228u.f29861i.m13640b(this);
                        throw th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
                realCall.f30228u.f29861i.m13640b(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th4) {
                threadCurrentThread.setName(name);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: g1.j0.g.e$b */
    /* JADX INFO: compiled from: RealCall.kt */
    public static final class b extends WeakReference<RealCall> {

        /* JADX INFO: renamed from: a */
        public final Object f30234a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RealCall realCall, Object obj) {
            super(realCall);
            Intrinsics2.m13090f(realCall, "referent");
            this.f30234a = obj;
        }
    }

    /* JADX INFO: renamed from: g1.j0.g.e$c */
    /* JADX INFO: compiled from: RealCall.kt */
    public static final class c extends AsyncTimeout {
        public c() {
        }

        @Override // p524h1.AsyncTimeout
        /* JADX INFO: renamed from: k */
        public void mo13453k() {
            RealCall.this.cancel();
        }
    }

    public RealCall(OkHttpClient okHttpClient, Request3 request3, boolean z) {
        Intrinsics2.m13090f(okHttpClient, "client");
        Intrinsics2.m13090f(request3, "originalRequest");
        this.f30228u = okHttpClient;
        this.f30229v = request3;
        this.f30230w = z;
        this.f30213f = okHttpClient.f29862j.f30588a;
        this.f30214g = okHttpClient.f29865m.mo13359a(this);
        c cVar = new c();
        cVar.mo13702g(okHttpClient.f29854F, TimeUnit.MILLISECONDS);
        this.f30215h = cVar;
        this.f30216i = new AtomicBoolean();
        this.f30224q = true;
    }

    /* JADX INFO: renamed from: a */
    public static final String m13443a(RealCall realCall) {
        StringBuilder sb = new StringBuilder();
        sb.append(realCall.f30225r ? "canceled " : "");
        sb.append(realCall.f30230w ? "web socket" : "call");
        sb.append(" to ");
        sb.append(realCall.f30229v.f29951b.m13671h());
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m13444b(RealConnection realConnection) {
        Intrinsics2.m13090f(realConnection, "connection");
        byte[] bArr = Util9.f30070a;
        if (!(this.f30219l == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f30219l = realConnection;
        realConnection.f30249o.add(new b(this, this.f30217j));
    }

    @Override // p509g1.Call
    /* JADX INFO: renamed from: c */
    public Request3 mo13332c() {
        return this.f30229v;
    }

    @Override // p509g1.Call
    public void cancel() {
        Socket socket;
        if (this.f30225r) {
            return;
        }
        this.f30225r = true;
        Exchange exchange = this.f30226s;
        if (exchange != null) {
            exchange.f30191f.cancel();
        }
        RealConnection realConnection = this.f30227t;
        if (realConnection != null && (socket = realConnection.f30236b) != null) {
            Util9.m13365e(socket);
        }
        Objects.requireNonNull(this.f30214g);
        Intrinsics2.m13090f(this, "call");
    }

    public Object clone() {
        return new RealCall(this.f30228u, this.f30229v, this.f30230w);
    }

    /* JADX INFO: renamed from: d */
    public final <E extends IOException> E m13445d(E e) {
        E interruptedIOException;
        Socket socketM13451l;
        byte[] bArr = Util9.f30070a;
        RealConnection realConnection = this.f30219l;
        if (realConnection != null) {
            synchronized (realConnection) {
                socketM13451l = m13451l();
            }
            if (this.f30219l == null) {
                if (socketM13451l != null) {
                    Util9.m13365e(socketM13451l);
                }
                Objects.requireNonNull(this.f30214g);
                Intrinsics2.m13090f(this, "call");
                Intrinsics2.m13090f(realConnection, "connection");
            } else {
                if (!(socketM13451l == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f30220m && this.f30215h.m13704i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e != null) {
                interruptedIOException.initCause(e);
            }
        } else {
            interruptedIOException = e;
        }
        if (e != null) {
            EventListener eventListener = this.f30214g;
            if (interruptedIOException == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            Objects.requireNonNull(eventListener);
            Intrinsics2.m13090f(this, "call");
            Intrinsics2.m13090f(interruptedIOException, "ioe");
        } else {
            Objects.requireNonNull(this.f30214g);
            Intrinsics2.m13090f(this, "call");
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: e */
    public final void m13446e() {
        Objects.requireNonNull(Platform.f30547c);
        this.f30217j = Platform.f30545a.mo13596g("response.body().close()");
        Objects.requireNonNull(this.f30214g);
        Intrinsics2.m13090f(this, "call");
    }

    @Override // p509g1.Call
    /* JADX INFO: renamed from: f */
    public boolean mo13333f() {
        return this.f30225r;
    }

    /* JADX INFO: renamed from: g */
    public final void m13447g(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (!this.f30224q) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (exchange = this.f30226s) != null) {
            exchange.f30191f.cancel();
            exchange.f30188c.m13449j(exchange, true, true, null);
        }
        this.f30221n = null;
    }

    @Override // p509g1.Call
    /* JADX INFO: renamed from: h */
    public Response3 mo13334h() {
        if (!this.f30216i.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f30215h.m13703h();
        m13446e();
        try {
            Dispatcher4 dispatcher4 = this.f30228u.f29861i;
            synchronized (dispatcher4) {
                Intrinsics2.m13090f(this, "call");
                dispatcher4.f30621f.add(this);
            }
            Response3 response3M13448i = m13448i();
            Dispatcher4 dispatcher5 = this.f30228u.f29861i;
            Objects.requireNonNull(dispatcher5);
            Intrinsics2.m13090f(this, "call");
            dispatcher5.m13639a(dispatcher5.f30621f, this);
            return response3M13448i;
        } catch (Throwable th) {
            Dispatcher4 dispatcher6 = this.f30228u.f29861i;
            Objects.requireNonNull(dispatcher6);
            Intrinsics2.m13090f(this, "call");
            dispatcher6.m13639a(dispatcher6.f30621f, this);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX INFO: renamed from: i */
    public final Response3 m13448i() throws Throwable {
        ArrayList arrayList = new ArrayList();
        MutableCollections.m13043h(arrayList, this.f30228u.f29863k);
        arrayList.add(new RetryAndFollowUpInterceptor(this.f30228u));
        arrayList.add(new BridgeInterceptor(this.f30228u.f29870r));
        arrayList.add(new CacheInterceptor(this.f30228u.f29871s));
        arrayList.add(ConnectInterceptor.f30181a);
        if (!this.f30230w) {
            MutableCollections.m13043h(arrayList, this.f30228u.f29864l);
        }
        arrayList.add(new CallServerInterceptor(this.f30230w));
        Request3 request3 = this.f30229v;
        OkHttpClient okHttpClient = this.f30228u;
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this, arrayList, 0, null, request3, okHttpClient.f29855G, okHttpClient.f29856H, okHttpClient.f29857I);
        boolean z = false;
        try {
            try {
                Response3 response3Mo13492a = realInterceptorChain.mo13492a(this.f30229v);
                if (!this.f30225r) {
                    m13450k(null);
                    return response3Mo13492a;
                }
                Intrinsics2.m13090f(response3Mo13492a, "$this$closeQuietly");
                try {
                    response3Mo13492a.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                throw new IOException("Canceled");
            } catch (IOException e2) {
                try {
                    IOException iOExceptionM13450k = m13450k(e2);
                    if (iOExceptionM13450k == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                    throw iOExceptionM13450k;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        m13450k(null);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
                m13450k(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0023 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:14:0x001d), top: B:53:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0027 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:14:0x001d), top: B:53:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0033  */
    /* JADX INFO: renamed from: j */
    public final <E extends IOException> E m13449j(Exchange exchange, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics2.m13090f(exchange, "exchange");
        if (!Intrinsics2.m13085a(exchange, this.f30226s)) {
            return e;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (this.f30222o) {
                        if (z) {
                            this.f30222o = false;
                        }
                        if (z2) {
                            this.f30223p = false;
                        }
                        z5 = this.f30222o;
                        if (z5) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (!z5) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    } else if (z2 || !this.f30223p) {
                        z4 = false;
                    } else {
                        if (z) {
                            this.f30222o = false;
                        }
                        if (z2) {
                            this.f30223p = false;
                        }
                        z5 = this.f30222o;
                        if (z5 || this.f30223p) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (!z5 && !this.f30223p && !this.f30224q) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
        }
        if (z3) {
            this.f30226s = null;
            RealConnection realConnection = this.f30219l;
            if (realConnection != null) {
                synchronized (realConnection) {
                    realConnection.f30246l++;
                }
            }
        }
        return z4 ? (E) m13445d(e) : e;
    }

    /* JADX INFO: renamed from: k */
    public final IOException m13450k(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f30224q) {
                this.f30224q = false;
                if (!this.f30222o && !this.f30223p) {
                    z = true;
                }
            }
        }
        return z ? m13445d(iOException) : iOException;
    }

    /* JADX INFO: renamed from: l */
    public final Socket m13451l() {
        RealConnection realConnection = this.f30219l;
        if (realConnection == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        byte[] bArr = Util9.f30070a;
        List<Reference<RealCall>> list = realConnection.f30249o;
        Iterator<Reference<RealCall>> it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics2.m13085a(it.next().get(), this)) {
                break;
            }
            i++;
        }
        if (!(i != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        list.remove(i);
        this.f30219l = null;
        if (list.isEmpty()) {
            realConnection.f30250p = System.nanoTime();
            RealConnectionPool realConnectionPool = this.f30213f;
            Objects.requireNonNull(realConnectionPool);
            Intrinsics2.m13090f(realConnection, "connection");
            byte[] bArr2 = Util9.f30070a;
            if (realConnection.f30243i || realConnectionPool.f30261e == 0) {
                realConnection.f30243i = true;
                realConnectionPool.f30260d.remove(realConnection);
                if (realConnectionPool.f30260d.isEmpty()) {
                    realConnectionPool.f30258b.m13417a();
                }
                z = true;
            } else {
                TaskQueue2.m13416d(realConnectionPool.f30258b, realConnectionPool.f30259c, 0L, 2);
            }
            if (z) {
                return realConnection.m13467n();
            }
        }
        return null;
    }

    @Override // p509g1.Call
    /* JADX INFO: renamed from: u */
    public void mo13335u(Callback callback) {
        a next;
        Intrinsics2.m13090f(callback, "responseCallback");
        if (!this.f30216i.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        m13446e();
        Dispatcher4 dispatcher4 = this.f30228u.f29861i;
        a aVar = new a(this, callback);
        Objects.requireNonNull(dispatcher4);
        Intrinsics2.m13090f(aVar, "call");
        synchronized (dispatcher4) {
            dispatcher4.f30619d.add(aVar);
            if (!aVar.f30233h.f30230w) {
                String strM13452a = aVar.m13452a();
                Iterator<a> it = dispatcher4.f30620e.iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator<a> it2 = dispatcher4.f30619d.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!Intrinsics2.m13085a(next.m13452a(), strM13452a));
                    } else {
                        next = it.next();
                    }
                } while (!Intrinsics2.m13085a(next.m13452a(), strM13452a));
                if (next != null) {
                    Intrinsics2.m13090f(next, "other");
                    aVar.f30231f = next.f30231f;
                }
            }
        }
        dispatcher4.m13641c();
    }
}
