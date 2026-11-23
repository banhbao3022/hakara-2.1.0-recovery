package p509g1.p510j0.p517j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Headers2;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p513f.TaskQueue2;
import p524h1.AsyncTimeout;
import p524h1.Buffer3;
import p524h1.Sink;
import p524h1.Source;
import p524h1.Timeout2;

/* JADX INFO: renamed from: g1.j0.j.o, reason: use source file name */
/* JADX INFO: compiled from: Http2Stream.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Http2Stream {

    /* JADX INFO: renamed from: a */
    public long f30471a;

    /* JADX INFO: renamed from: b */
    public long f30472b;

    /* JADX INFO: renamed from: c */
    public long f30473c;

    /* JADX INFO: renamed from: d */
    public long f30474d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque<Headers2> f30475e;

    /* JADX INFO: renamed from: f */
    public boolean f30476f;

    /* JADX INFO: renamed from: g */
    public final c f30477g;

    /* JADX INFO: renamed from: h */
    public final b f30478h;

    /* JADX INFO: renamed from: i */
    public final d f30479i;

    /* JADX INFO: renamed from: j */
    public final d f30480j;

    /* JADX INFO: renamed from: k */
    public ErrorCode2 f30481k;

    /* JADX INFO: renamed from: l */
    public IOException f30482l;

    /* JADX INFO: renamed from: m */
    public final int f30483m;

    /* JADX INFO: renamed from: n */
    public final Http2Connection f30484n;

    /* JADX INFO: renamed from: g1.j0.j.o$a */
    /* JADX INFO: compiled from: Http2Stream.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.j0.j.o$c */
    /* JADX INFO: compiled from: Http2Stream.kt */
    public final class c implements Source {

        /* JADX INFO: renamed from: f */
        public final Buffer3 f30489f = new Buffer3();

        /* JADX INFO: renamed from: g */
        public final Buffer3 f30490g = new Buffer3();

        /* JADX INFO: renamed from: h */
        public boolean f30491h;

        /* JADX INFO: renamed from: i */
        public final long f30492i;

        /* JADX INFO: renamed from: j */
        public boolean f30493j;

        public c(long j2, boolean z) {
            this.f30492i = j2;
            this.f30493j = z;
        }

        /* JADX INFO: renamed from: a */
        public final void m13562a(long j2) {
            Http2Stream http2Stream = Http2Stream.this;
            byte[] bArr = Util9.f30070a;
            http2Stream.f30484n.m13525D(j2);
        }

        @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long j2;
            synchronized (Http2Stream.this) {
                this.f30491h = true;
                Buffer3 buffer3 = this.f30490g;
                j2 = buffer3.f30708g;
                buffer3.skip(j2);
                Http2Stream http2Stream = Http2Stream.this;
                if (http2Stream == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                }
                http2Stream.notifyAll();
            }
            if (j2 > 0) {
                m13562a(j2);
            }
            Http2Stream.this.m13549a();
        }

        @Override // p524h1.Source
        /* JADX INFO: renamed from: d */
        public Timeout2 mo13391d() {
            return Http2Stream.this.f30479i;
        }

        @Override // p524h1.Source
        /* JADX INFO: renamed from: p0 */
        public long mo13392p0(Buffer3 buffer3, long j2) throws Throwable {
            Throwable th;
            long jMo13392p0;
            boolean z;
            long j3;
            Intrinsics2.m13090f(buffer3, "sink");
            long j4 = 0;
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(outline.m1594p("byteCount < 0: ", j2).toString());
            }
            while (true) {
                synchronized (Http2Stream.this) {
                    Http2Stream.this.f30479i.m13703h();
                    try {
                        th = null;
                        if (Http2Stream.this.m13554f() != null) {
                            Throwable streamResetException = Http2Stream.this.f30482l;
                            if (streamResetException == null) {
                                ErrorCode2 errorCode2M13554f = Http2Stream.this.m13554f();
                                if (errorCode2M13554f == null) {
                                    Intrinsics2.m13095k();
                                    throw null;
                                }
                                streamResetException = new StreamResetException(errorCode2M13554f);
                            }
                            th = streamResetException;
                        }
                        if (this.f30491h) {
                            throw new IOException("stream closed");
                        }
                        Buffer3 buffer4 = this.f30490g;
                        long j5 = buffer4.f30708g;
                        if (j5 > j4) {
                            jMo13392p0 = buffer4.mo13392p0(buffer3, Math.min(j2, j5));
                            Http2Stream http2Stream = Http2Stream.this;
                            long j6 = http2Stream.f30471a + jMo13392p0;
                            http2Stream.f30471a = j6;
                            long j7 = j6 - http2Stream.f30472b;
                            if (th == null && j7 >= http2Stream.f30484n.f30402z.m13579a() / 2) {
                                Http2Stream http2Stream2 = Http2Stream.this;
                                http2Stream2.f30484n.m13529b0(http2Stream2.f30483m, j7);
                                Http2Stream http2Stream3 = Http2Stream.this;
                                http2Stream3.f30472b = http2Stream3.f30471a;
                            }
                        } else {
                            if (this.f30493j || th != null) {
                                jMo13392p0 = -1;
                            } else {
                                Http2Stream.this.m13560l();
                                z = true;
                                j3 = -1;
                            }
                            Http2Stream.this.f30479i.m13564l();
                        }
                        j3 = jMo13392p0;
                        z = false;
                        Http2Stream.this.f30479i.m13564l();
                    } catch (Throwable th2) {
                        Http2Stream.this.f30479i.m13564l();
                        throw th2;
                    }
                }
                if (!z) {
                    if (j3 != -1) {
                        m13562a(j3);
                        return j3;
                    }
                    if (th == null) {
                        return -1L;
                    }
                    throw th;
                }
                j4 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: g1.j0.j.o$d */
    /* JADX INFO: compiled from: Http2Stream.kt */
    public final class d extends AsyncTimeout {
        public d() {
        }

        @Override // p524h1.AsyncTimeout
        /* JADX INFO: renamed from: j */
        public IOException mo13563j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p524h1.AsyncTimeout
        /* JADX INFO: renamed from: k */
        public void mo13453k() {
            Http2Stream.this.m13553e(ErrorCode2.CANCEL);
            Http2Connection http2Connection = Http2Stream.this.f30484n;
            synchronized (http2Connection) {
                long j2 = http2Connection.f30399w;
                long j3 = http2Connection.f30398v;
                if (j2 < j3) {
                    return;
                }
                http2Connection.f30398v = j3 + 1;
                http2Connection.f30401y = System.nanoTime() + ((long) 1000000000);
                TaskQueue2 taskQueue2 = http2Connection.f30392p;
                String strM1550A = outline.m1550A(new StringBuilder(), http2Connection.f30387k, " ping");
                taskQueue2.m13419c(new TaskQueue8(strM1550A, true, strM1550A, true, http2Connection), 0L);
            }
        }

        /* JADX INFO: renamed from: l */
        public final void m13564l() throws IOException {
            if (m13704i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    static {
        new a(null);
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers2 headers2) {
        Intrinsics2.m13090f(http2Connection, "connection");
        this.f30483m = i;
        this.f30484n = http2Connection;
        this.f30474d = http2Connection.f30375A.m13579a();
        ArrayDeque<Headers2> arrayDeque = new ArrayDeque<>();
        this.f30475e = arrayDeque;
        this.f30477g = new c(http2Connection.f30402z.m13579a(), z2);
        this.f30478h = new b(z);
        this.f30479i = new d();
        this.f30480j = new d();
        if (headers2 == null) {
            if (!m13556h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!m13556h())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(headers2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    /* JADX INFO: renamed from: a */
    public final void m13549a() throws IOException {
        boolean z;
        boolean zM13557i;
        byte[] bArr = Util9.f30070a;
        synchronized (this) {
            c cVar = this.f30477g;
            if (cVar.f30493j || !cVar.f30491h) {
                z = false;
            } else {
                b bVar = this.f30478h;
                if (bVar.f30487h || bVar.f30486g) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zM13557i = m13557i();
        }
        if (z) {
            m13551c(ErrorCode2.CANCEL, null);
        } else {
            if (zM13557i) {
                return;
            }
            this.f30484n.m13533u(this.f30483m);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13550b() throws IOException {
        b bVar = this.f30478h;
        if (bVar.f30486g) {
            throw new IOException("stream closed");
        }
        if (bVar.f30487h) {
            throw new IOException("stream finished");
        }
        if (this.f30481k != null) {
            IOException iOException = this.f30482l;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode2 errorCode2 = this.f30481k;
            if (errorCode2 != null) {
                throw new StreamResetException(errorCode2);
            }
            Intrinsics2.m13095k();
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13551c(ErrorCode2 errorCode2, IOException iOException) throws IOException {
        Intrinsics2.m13090f(errorCode2, "rstStatusCode");
        if (m13552d(errorCode2, iOException)) {
            Http2Connection http2Connection = this.f30484n;
            int i = this.f30483m;
            Objects.requireNonNull(http2Connection);
            Intrinsics2.m13090f(errorCode2, "statusCode");
            http2Connection.f30381G.m13566D(i, errorCode2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13552d(ErrorCode2 errorCode2, IOException iOException) {
        byte[] bArr = Util9.f30070a;
        synchronized (this) {
            if (this.f30481k != null) {
                return false;
            }
            if (this.f30477g.f30493j && this.f30478h.f30487h) {
                return false;
            }
            this.f30481k = errorCode2;
            this.f30482l = iOException;
            notifyAll();
            this.f30484n.m13533u(this.f30483m);
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13553e(ErrorCode2 errorCode2) {
        Intrinsics2.m13090f(errorCode2, "errorCode");
        if (m13552d(errorCode2, null)) {
            this.f30484n.m13528R(this.f30483m, errorCode2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized ErrorCode2 m13554f() {
        return this.f30481k;
    }

    /* JADX INFO: renamed from: g */
    public final Sink m13555g() {
        synchronized (this) {
            if (!(this.f30476f || m13556h())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f30478h;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m13556h() {
        return this.f30484n.f30384h == ((this.f30483m & 1) == 1);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m13557i() {
        if (this.f30481k != null) {
            return false;
        }
        c cVar = this.f30477g;
        if (cVar.f30493j || cVar.f30491h) {
            b bVar = this.f30478h;
            if ((bVar.f30487h || bVar.f30486g) && this.f30476f) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m13558j(Headers2 headers2, boolean z) {
        boolean zM13557i;
        Intrinsics2.m13090f(headers2, "headers");
        byte[] bArr = Util9.f30070a;
        synchronized (this) {
            if (this.f30476f && z) {
                Objects.requireNonNull(this.f30477g);
            } else {
                this.f30476f = true;
                this.f30475e.add(headers2);
            }
            if (z) {
                this.f30477g.f30493j = true;
            }
            zM13557i = m13557i();
            notifyAll();
        }
        if (zM13557i) {
            return;
        }
        this.f30484n.m13533u(this.f30483m);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m13559k(ErrorCode2 errorCode2) {
        Intrinsics2.m13090f(errorCode2, "errorCode");
        if (this.f30481k == null) {
            this.f30481k = errorCode2;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13560l() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: g1.j0.j.o$b */
    /* JADX INFO: compiled from: Http2Stream.kt */
    public final class b implements Sink {

        /* JADX INFO: renamed from: f */
        public final Buffer3 f30485f;

        /* JADX INFO: renamed from: g */
        public boolean f30486g;

        /* JADX INFO: renamed from: h */
        public boolean f30487h;

        public b(boolean z) {
            this.f30487h = z;
            this.f30485f = new Buffer3();
        }

        @Override // p524h1.Sink
        /* JADX INFO: renamed from: U */
        public void mo13415U(Buffer3 buffer3, long j2) throws IOException {
            Intrinsics2.m13090f(buffer3, "source");
            byte[] bArr = Util9.f30070a;
            this.f30485f.mo13415U(buffer3, j2);
            while (this.f30485f.f30708g >= 16384) {
                m13561a(false);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m13561a(boolean z) throws IOException {
            long jMin;
            boolean z2;
            synchronized (Http2Stream.this) {
                Http2Stream.this.f30480j.m13703h();
                while (true) {
                    try {
                        Http2Stream http2Stream = Http2Stream.this;
                        if (http2Stream.f30473c < http2Stream.f30474d || this.f30487h || this.f30486g || http2Stream.m13554f() != null) {
                            break;
                        } else {
                            Http2Stream.this.m13560l();
                        }
                    } catch (Throwable th) {
                        Http2Stream.this.f30480j.m13564l();
                        throw th;
                    }
                }
                Http2Stream.this.f30480j.m13564l();
                Http2Stream.this.m13550b();
                Http2Stream http2Stream2 = Http2Stream.this;
                jMin = Math.min(http2Stream2.f30474d - http2Stream2.f30473c, this.f30485f.f30708g);
                Http2Stream http2Stream3 = Http2Stream.this;
                http2Stream3.f30473c += jMin;
                z2 = z && jMin == this.f30485f.f30708g && http2Stream3.m13554f() == null;
            }
            Http2Stream.this.f30480j.m13703h();
            try {
                Http2Stream http2Stream4 = Http2Stream.this;
                http2Stream4.f30484n.m13526H(http2Stream4.f30483m, z2, this.f30485f, jMin);
            } finally {
                Http2Stream.this.f30480j.m13564l();
            }
        }

        @Override // p524h1.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            byte[] bArr = Util9.f30070a;
            synchronized (http2Stream) {
                if (this.f30486g) {
                    return;
                }
                boolean z = Http2Stream.this.m13554f() == null;
                Http2Stream http2Stream2 = Http2Stream.this;
                if (!http2Stream2.f30478h.f30487h) {
                    if (this.f30485f.f30708g > 0) {
                        while (this.f30485f.f30708g > 0) {
                            m13561a(true);
                        }
                    } else if (z) {
                        http2Stream2.f30484n.m13526H(http2Stream2.f30483m, true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.f30486g = true;
                }
                Http2Stream.this.f30484n.f30381G.flush();
                Http2Stream.this.m13549a();
            }
        }

        @Override // p524h1.Sink
        /* JADX INFO: renamed from: d */
        public Timeout2 mo13505d() {
            return Http2Stream.this.f30480j;
        }

        @Override // p524h1.Sink, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            byte[] bArr = Util9.f30070a;
            synchronized (http2Stream) {
                Http2Stream.this.m13550b();
            }
            while (this.f30485f.f30708g > 0) {
                m13561a(false);
                Http2Stream.this.f30484n.f30381G.flush();
            }
        }

        public /* synthetic */ b(Http2Stream http2Stream, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
