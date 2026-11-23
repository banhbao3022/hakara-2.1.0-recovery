package p509g1.p510j0.p514g;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.EventListener;
import p509g1.Request3;
import p509g1.RequestBody;
import p509g1.Response3;
import p509g1.p510j0.p515h.ExchangeCodec;
import p509g1.p510j0.p517j.ConnectionShutdownException;
import p509g1.p510j0.p517j.ErrorCode2;
import p509g1.p510j0.p517j.StreamResetException;
import p524h1.Buffer3;
import p524h1.ForwardingSink;
import p524h1.ForwardingSource;
import p524h1.Sink;
import p524h1.Source;

/* JADX INFO: renamed from: g1.j0.g.c, reason: use source file name */
/* JADX INFO: compiled from: Exchange.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Exchange {

    /* JADX INFO: renamed from: a */
    public boolean f30186a;

    /* JADX INFO: renamed from: b */
    public final RealConnection f30187b;

    /* JADX INFO: renamed from: c */
    public final RealCall f30188c;

    /* JADX INFO: renamed from: d */
    public final EventListener f30189d;

    /* JADX INFO: renamed from: e */
    public final ExchangeFinder f30190e;

    /* JADX INFO: renamed from: f */
    public final ExchangeCodec f30191f;

    /* JADX INFO: renamed from: g1.j0.g.c$a */
    /* JADX INFO: compiled from: Exchange.kt */
    public final class a extends ForwardingSink {

        /* JADX INFO: renamed from: g */
        public boolean f30192g;

        /* JADX INFO: renamed from: h */
        public long f30193h;

        /* JADX INFO: renamed from: i */
        public boolean f30194i;

        /* JADX INFO: renamed from: j */
        public final long f30195j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Exchange f30196k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exchange exchange, Sink sink, long j2) {
            super(sink);
            Intrinsics2.m13090f(sink, "delegate");
            this.f30196k = exchange;
            this.f30195j = j2;
        }

        @Override // p524h1.ForwardingSink, p524h1.Sink
        /* JADX INFO: renamed from: U */
        public void mo13415U(Buffer3 buffer3, long j2) throws IOException {
            Intrinsics2.m13090f(buffer3, "source");
            if (!(!this.f30194i)) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.f30195j;
            if (j3 == -1 || this.f30193h + j2 <= j3) {
                try {
                    super.mo13415U(buffer3, j2);
                    this.f30193h += j2;
                    return;
                } catch (IOException e) {
                    throw m13438a(e);
                }
            }
            StringBuilder sbM1556G = outline.m1556G("expected ");
            sbM1556G.append(this.f30195j);
            sbM1556G.append(" bytes but received ");
            sbM1556G.append(this.f30193h + j2);
            throw new ProtocolException(sbM1556G.toString());
        }

        /* JADX INFO: renamed from: a */
        public final <E extends IOException> E m13438a(E e) {
            if (this.f30192g) {
                return e;
            }
            this.f30192g = true;
            return (E) this.f30196k.m13432a(this.f30193h, false, true, e);
        }

        @Override // p524h1.ForwardingSink, p524h1.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f30194i) {
                return;
            }
            this.f30194i = true;
            long j2 = this.f30195j;
            if (j2 != -1 && this.f30193h != j2) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m13438a(null);
            } catch (IOException e) {
                throw m13438a(e);
            }
        }

        @Override // p524h1.ForwardingSink, p524h1.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m13438a(e);
            }
        }
    }

    /* JADX INFO: renamed from: g1.j0.g.c$b */
    /* JADX INFO: compiled from: Exchange.kt */
    public final class b extends ForwardingSource {

        /* JADX INFO: renamed from: g */
        public long f30197g;

        /* JADX INFO: renamed from: h */
        public boolean f30198h;

        /* JADX INFO: renamed from: i */
        public boolean f30199i;

        /* JADX INFO: renamed from: j */
        public boolean f30200j;

        /* JADX INFO: renamed from: k */
        public final long f30201k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ Exchange f30202l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exchange exchange, Source source, long j2) {
            super(source);
            Intrinsics2.m13090f(source, "delegate");
            this.f30202l = exchange;
            this.f30201k = j2;
            this.f30198h = true;
            if (j2 == 0) {
                m13439a(null);
            }
        }

        /* JADX INFO: renamed from: a */
        public final <E extends IOException> E m13439a(E e) {
            if (this.f30199i) {
                return e;
            }
            this.f30199i = true;
            if (e == null && this.f30198h) {
                this.f30198h = false;
                Exchange exchange = this.f30202l;
                EventListener eventListener = exchange.f30189d;
                RealCall realCall = exchange.f30188c;
                Objects.requireNonNull(eventListener);
                Intrinsics2.m13090f(realCall, "call");
            }
            return (E) this.f30202l.m13432a(this.f30197g, true, false, e);
        }

        @Override // p524h1.ForwardingSource, p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f30200j) {
                return;
            }
            this.f30200j = true;
            try {
                super.close();
                m13439a(null);
            } catch (IOException e) {
                throw m13439a(e);
            }
        }

        @Override // p524h1.ForwardingSource, p524h1.Source
        /* JADX INFO: renamed from: p0 */
        public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
            Intrinsics2.m13090f(buffer3, "sink");
            if (!(!this.f30200j)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jMo13392p0 = this.f30717f.mo13392p0(buffer3, j2);
                if (this.f30198h) {
                    this.f30198h = false;
                    Exchange exchange = this.f30202l;
                    EventListener eventListener = exchange.f30189d;
                    RealCall realCall = exchange.f30188c;
                    Objects.requireNonNull(eventListener);
                    Intrinsics2.m13090f(realCall, "call");
                }
                if (jMo13392p0 == -1) {
                    m13439a(null);
                    return -1L;
                }
                long j3 = this.f30197g + jMo13392p0;
                long j4 = this.f30201k;
                if (j4 != -1 && j3 > j4) {
                    throw new ProtocolException("expected " + this.f30201k + " bytes but received " + j3);
                }
                this.f30197g = j3;
                if (j3 == j4) {
                    m13439a(null);
                }
                return jMo13392p0;
            } catch (IOException e) {
                throw m13439a(e);
            }
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        Intrinsics2.m13090f(realCall, "call");
        Intrinsics2.m13090f(eventListener, "eventListener");
        Intrinsics2.m13090f(exchangeFinder, "finder");
        Intrinsics2.m13090f(exchangeCodec, "codec");
        this.f30188c = realCall;
        this.f30189d = eventListener;
        this.f30190e = exchangeFinder;
        this.f30191f = exchangeCodec;
        this.f30187b = exchangeCodec.mo13481e();
    }

    /* JADX INFO: renamed from: a */
    public final <E extends IOException> E m13432a(long j2, boolean z, boolean z2, E e) {
        if (e != null) {
            m13437f(e);
        }
        if (z2) {
            if (e != null) {
                EventListener eventListener = this.f30189d;
                RealCall realCall = this.f30188c;
                Objects.requireNonNull(eventListener);
                Intrinsics2.m13090f(realCall, "call");
                Intrinsics2.m13090f(e, "ioe");
            } else {
                EventListener eventListener2 = this.f30189d;
                RealCall realCall2 = this.f30188c;
                Objects.requireNonNull(eventListener2);
                Intrinsics2.m13090f(realCall2, "call");
            }
        }
        if (z) {
            if (e != null) {
                EventListener eventListener3 = this.f30189d;
                RealCall realCall3 = this.f30188c;
                Objects.requireNonNull(eventListener3);
                Intrinsics2.m13090f(realCall3, "call");
                Intrinsics2.m13090f(e, "ioe");
            } else {
                EventListener eventListener4 = this.f30189d;
                RealCall realCall4 = this.f30188c;
                Objects.requireNonNull(eventListener4);
                Intrinsics2.m13090f(realCall4, "call");
            }
        }
        return (E) this.f30188c.m13449j(this, z2, z, e);
    }

    /* JADX INFO: renamed from: b */
    public final Sink m13433b(Request3 request3, boolean z) throws IOException {
        Intrinsics2.m13090f(request3, "request");
        this.f30186a = z;
        RequestBody requestBody = request3.f29954e;
        if (requestBody == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        long jMo13326a = requestBody.mo13326a();
        EventListener eventListener = this.f30189d;
        RealCall realCall = this.f30188c;
        Objects.requireNonNull(eventListener);
        Intrinsics2.m13090f(realCall, "call");
        return new a(this, this.f30191f.mo13484h(request3, jMo13326a), jMo13326a);
    }

    /* JADX INFO: renamed from: c */
    public final void m13434c() throws IOException {
        try {
            this.f30191f.mo13482f();
        } catch (IOException e) {
            EventListener eventListener = this.f30189d;
            RealCall realCall = this.f30188c;
            Objects.requireNonNull(eventListener);
            Intrinsics2.m13090f(realCall, "call");
            Intrinsics2.m13090f(e, "ioe");
            m13437f(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Response3.a m13435d(boolean z) throws IOException {
        try {
            Response3.a aVarMo13480d = this.f30191f.mo13480d(z);
            if (aVarMo13480d != null) {
                Intrinsics2.m13090f(this, "deferredTrailers");
                aVarMo13480d.f30015m = this;
            }
            return aVarMo13480d;
        } catch (IOException e) {
            EventListener eventListener = this.f30189d;
            RealCall realCall = this.f30188c;
            Objects.requireNonNull(eventListener);
            Intrinsics2.m13090f(realCall, "call");
            Intrinsics2.m13090f(e, "ioe");
            m13437f(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13436e() {
        EventListener eventListener = this.f30189d;
        RealCall realCall = this.f30188c;
        Objects.requireNonNull(eventListener);
        Intrinsics2.m13090f(realCall, "call");
    }

    /* JADX INFO: renamed from: f */
    public final void m13437f(IOException iOException) {
        this.f30190e.m13442c(iOException);
        RealConnection realConnectionMo13481e = this.f30191f.mo13481e();
        RealCall realCall = this.f30188c;
        synchronized (realConnectionMo13481e) {
            Intrinsics2.m13090f(realCall, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).f30513f == ErrorCode2.REFUSED_STREAM) {
                    int i = realConnectionMo13481e.f30247m + 1;
                    realConnectionMo13481e.f30247m = i;
                    if (i > 1) {
                        realConnectionMo13481e.f30243i = true;
                        realConnectionMo13481e.f30245k++;
                    }
                } else if (((StreamResetException) iOException).f30513f != ErrorCode2.CANCEL || !realCall.f30225r) {
                    realConnectionMo13481e.f30243i = true;
                    realConnectionMo13481e.f30245k++;
                }
            } else if (!realConnectionMo13481e.m13463j() || (iOException instanceof ConnectionShutdownException)) {
                realConnectionMo13481e.f30243i = true;
                if (realConnectionMo13481e.f30246l == 0) {
                    realConnectionMo13481e.m13457d(realCall.f30228u, realConnectionMo13481e.f30251q, iOException);
                    realConnectionMo13481e.f30245k++;
                }
            }
        }
    }
}
