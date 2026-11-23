package p509g1.p510j0.p517j;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Ref;
import p477d1.p493x.p495c.Ref2;
import p477d1.p493x.p495c.Ref3;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p513f.Task2;
import p509g1.p510j0.p513f.TaskQueue2;
import p509g1.p510j0.p513f.TaskRunner;
import p509g1.p510j0.p519l.Platform;
import p524h1.Buffer3;
import p524h1.BufferedSink;
import p524h1.BufferedSource;
import p524h1.ByteString3;

/* JADX INFO: renamed from: g1.j0.j.f, reason: use source file name */
/* JADX INFO: compiled from: Http2Connection.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Http2Connection implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final Settings2 f30373f;

    /* JADX INFO: renamed from: g */
    public static final c f30374g = new c(null);

    /* JADX INFO: renamed from: A */
    public Settings2 f30375A;

    /* JADX INFO: renamed from: B */
    public long f30376B;

    /* JADX INFO: renamed from: C */
    public long f30377C;

    /* JADX INFO: renamed from: D */
    public long f30378D;

    /* JADX INFO: renamed from: E */
    public long f30379E;

    /* JADX INFO: renamed from: F */
    public final Socket f30380F;

    /* JADX INFO: renamed from: G */
    public final Http2Writer f30381G;

    /* JADX INFO: renamed from: H */
    public final e f30382H;

    /* JADX INFO: renamed from: I */
    public final Set<Integer> f30383I;

    /* JADX INFO: renamed from: h */
    public final boolean f30384h;

    /* JADX INFO: renamed from: i */
    public final d f30385i;

    /* JADX INFO: renamed from: j */
    public final Map<Integer, Http2Stream> f30386j;

    /* JADX INFO: renamed from: k */
    public final String f30387k;

    /* JADX INFO: renamed from: l */
    public int f30388l;

    /* JADX INFO: renamed from: m */
    public int f30389m;

    /* JADX INFO: renamed from: n */
    public boolean f30390n;

    /* JADX INFO: renamed from: o */
    public final TaskRunner f30391o;

    /* JADX INFO: renamed from: p */
    public final TaskQueue2 f30392p;

    /* JADX INFO: renamed from: q */
    public final TaskQueue2 f30393q;

    /* JADX INFO: renamed from: r */
    public final TaskQueue2 f30394r;

    /* JADX INFO: renamed from: s */
    public final PushObserver f30395s;

    /* JADX INFO: renamed from: t */
    public long f30396t;

    /* JADX INFO: renamed from: u */
    public long f30397u;

    /* JADX INFO: renamed from: v */
    public long f30398v;

    /* JADX INFO: renamed from: w */
    public long f30399w;

    /* JADX INFO: renamed from: x */
    public long f30400x;

    /* JADX INFO: renamed from: y */
    public long f30401y;

    /* JADX INFO: renamed from: z */
    public final Settings2 f30402z;

    /* JADX INFO: renamed from: g1.j0.j.f$a */
    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class a extends Task2 {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Http2Connection f30403e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ long f30404f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Http2Connection http2Connection, long j2) {
            super(str2, false, 2, null);
            this.f30403e = http2Connection;
            this.f30404f = j2;
        }

        @Override // p509g1.p510j0.p513f.Task2
        /* JADX INFO: renamed from: a */
        public long mo13414a() {
            Http2Connection http2Connection;
            boolean z;
            synchronized (this.f30403e) {
                http2Connection = this.f30403e;
                long j2 = http2Connection.f30397u;
                long j3 = http2Connection.f30396t;
                if (j2 < j3) {
                    z = true;
                } else {
                    http2Connection.f30396t = j3 + 1;
                    z = false;
                }
            }
            if (!z) {
                http2Connection.m13527O(false, 1, 0);
                return this.f30404f;
            }
            ErrorCode2 errorCode2 = ErrorCode2.PROTOCOL_ERROR;
            http2Connection.m13530c(errorCode2, errorCode2, null);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: g1.j0.j.f$b */
    /* JADX INFO: compiled from: Http2Connection.kt */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Socket f30405a;

        /* JADX INFO: renamed from: b */
        public String f30406b;

        /* JADX INFO: renamed from: c */
        public BufferedSource f30407c;

        /* JADX INFO: renamed from: d */
        public BufferedSink f30408d;

        /* JADX INFO: renamed from: e */
        public d f30409e;

        /* JADX INFO: renamed from: f */
        public PushObserver f30410f;

        /* JADX INFO: renamed from: g */
        public int f30411g;

        /* JADX INFO: renamed from: h */
        public boolean f30412h;

        /* JADX INFO: renamed from: i */
        public final TaskRunner f30413i;

        public b(boolean z, TaskRunner taskRunner) {
            Intrinsics2.m13090f(taskRunner, "taskRunner");
            this.f30412h = z;
            this.f30413i = taskRunner;
            this.f30409e = d.f30414a;
            this.f30410f = PushObserver.f30510a;
        }
    }

    /* JADX INFO: renamed from: g1.j0.j.f$c */
    /* JADX INFO: compiled from: Http2Connection.kt */
    public static final class c {
        public c() {
        }

        public c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.j0.j.f$d */
    /* JADX INFO: compiled from: Http2Connection.kt */
    public static abstract class d {

        /* JADX INFO: renamed from: a */
        public static final d f30414a;

        /* JADX INFO: renamed from: g1.j0.j.f$d$a */
        /* JADX INFO: compiled from: Http2Connection.kt */
        public static final class a extends d {
            @Override // p509g1.p510j0.p517j.Http2Connection.d
            /* JADX INFO: renamed from: b */
            public void mo13455b(Http2Stream http2Stream) throws IOException {
                Intrinsics2.m13090f(http2Stream, "stream");
                http2Stream.m13551c(ErrorCode2.REFUSED_STREAM, null);
            }
        }

        /* JADX INFO: renamed from: g1.j0.j.f$d$b */
        /* JADX INFO: compiled from: Http2Connection.kt */
        public static final class b {
            public b() {
            }

            public b(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            new b(null);
            f30414a = new a();
        }

        /* JADX INFO: renamed from: a */
        public void mo13454a(Http2Connection http2Connection, Settings2 settings2) {
            Intrinsics2.m13090f(http2Connection, "connection");
            Intrinsics2.m13090f(settings2, "settings");
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo13455b(Http2Stream http2Stream) throws IOException;
    }

    /* JADX INFO: renamed from: g1.j0.j.f$e */
    /* JADX INFO: compiled from: Http2Connection.kt */
    public final class e implements Http2Reader.c, InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: f */
        public final Http2Reader f30415f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Http2Connection f30416g;

        /* JADX INFO: renamed from: g1.j0.j.f$e$a */
        /* JADX INFO: compiled from: TaskQueue.kt */
        public static final class a extends Task2 {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Http2Stream f30417e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ e f30418f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ List f30419g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z, String str2, boolean z2, Http2Stream http2Stream, e eVar, Http2Stream http2Stream2, int i, List list, boolean z3) {
                super(str2, z2);
                this.f30417e = http2Stream;
                this.f30418f = eVar;
                this.f30419g = list;
            }

            @Override // p509g1.p510j0.p513f.Task2
            /* JADX INFO: renamed from: a */
            public long mo13414a() {
                try {
                    this.f30418f.f30416g.f30385i.mo13455b(this.f30417e);
                    return -1L;
                } catch (IOException e) {
                    Objects.requireNonNull(Platform.f30547c);
                    Platform platform = Platform.f30545a;
                    StringBuilder sbM1556G = outline.m1556G("Http2Connection.Listener failure for ");
                    sbM1556G.append(this.f30418f.f30416g.f30387k);
                    platform.m13605i(sbM1556G.toString(), 4, e);
                    try {
                        this.f30417e.m13551c(ErrorCode2.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g1.j0.j.f$e$b */
        /* JADX INFO: compiled from: TaskQueue.kt */
        public static final class b extends Task2 {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ e f30420e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ int f30421f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ int f30422g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z, String str2, boolean z2, e eVar, int i, int i2) {
                super(str2, z2);
                this.f30420e = eVar;
                this.f30421f = i;
                this.f30422g = i2;
            }

            @Override // p509g1.p510j0.p513f.Task2
            /* JADX INFO: renamed from: a */
            public long mo13414a() {
                this.f30420e.f30416g.m13527O(true, this.f30421f, this.f30422g);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: g1.j0.j.f$e$c */
        /* JADX INFO: compiled from: TaskQueue.kt */
        public static final class c extends Task2 {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ e f30423e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ boolean f30424f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Settings2 f30425g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z, String str2, boolean z2, e eVar, boolean z3, Settings2 settings2) {
                super(str2, z2);
                this.f30423e = eVar;
                this.f30424f = z3;
                this.f30425g = settings2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v0, types: [T, g1.j0.j.s, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v0, types: [T, g1.j0.j.s] */
            @Override // p509g1.p510j0.p513f.Task2
            /* JADX INFO: renamed from: a */
            public long mo13414a() throws Throwable {
                Http2Writer http2Writer;
                Http2Connection http2Connection;
                T t;
                e eVar = this.f30423e;
                boolean z = this.f30424f;
                ?? r10 = this.f30425g;
                Objects.requireNonNull(eVar);
                Intrinsics2.m13090f(r10, "settings");
                Ref2 ref2 = new Ref2();
                Ref3 ref3 = new Ref3();
                Ref3 ref4 = new Ref3();
                Http2Writer http2Writer2 = eVar.f30416g.f30381G;
                synchronized (http2Writer2) {
                    try {
                        Http2Connection http2Connection2 = eVar.f30416g;
                        try {
                            synchronized (http2Connection2) {
                                try {
                                    Settings2 settings2 = eVar.f30416g.f30375A;
                                    if (z) {
                                        ref4.f29604f = r10;
                                    } else {
                                        ?? settings3 = new Settings2();
                                        settings3.m13580b(settings2);
                                        settings3.m13580b(r10);
                                        ref4.f29604f = settings3;
                                    }
                                    long jM13579a = ((long) ((Settings2) ref4.f29604f).m13579a()) - ((long) settings2.m13579a());
                                    ref2.f29603f = jM13579a;
                                    if (jM13579a == 0 || eVar.f30416g.f30386j.isEmpty()) {
                                        t = 0;
                                    } else {
                                        Object[] array = eVar.f30416g.f30386j.values().toArray(new Http2Stream[0]);
                                        if (array == null) {
                                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                                        }
                                        t = (Http2Stream[]) array;
                                    }
                                    ref3.f29604f = t;
                                    Http2Connection http2Connection3 = eVar.f30416g;
                                    Settings2 settings4 = (Settings2) ref4.f29604f;
                                    Objects.requireNonNull(http2Connection3);
                                    Intrinsics2.m13090f(settings4, "<set-?>");
                                    http2Connection3.f30375A = settings4;
                                    TaskQueue2 taskQueue2 = eVar.f30416g.f30394r;
                                    String str = eVar.f30416g.f30387k + " onSettings";
                                    http2Connection = http2Connection2;
                                    http2Writer = http2Writer2;
                                    try {
                                        taskQueue2.m13419c(new TaskQueue3(str, true, str, true, eVar, z, ref4, r10, ref2, ref3), 0L);
                                        try {
                                            eVar.f30416g.f30381G.m13569a((Settings2) ref4.f29604f);
                                        } catch (IOException e) {
                                            Http2Connection.m13523a(eVar.f30416g, e);
                                        }
                                        Http2Stream[] http2StreamArr = (Http2Stream[]) ref3.f29604f;
                                        if (http2StreamArr == null) {
                                            return -1L;
                                        }
                                        if (http2StreamArr == null) {
                                            Intrinsics2.m13095k();
                                            throw null;
                                        }
                                        for (Http2Stream http2Stream : http2StreamArr) {
                                            synchronized (http2Stream) {
                                                long j2 = ref2.f29603f;
                                                http2Stream.f30474d += j2;
                                                if (j2 > 0) {
                                                    http2Stream.notifyAll();
                                                }
                                            }
                                        }
                                        return -1L;
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    http2Connection = http2Connection2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        http2Writer = http2Writer2;
                    }
                }
            }
        }

        public e(Http2Connection http2Connection, Http2Reader http2Reader) {
            Intrinsics2.m13090f(http2Reader, "reader");
            this.f30416g = http2Connection;
            this.f30415f = http2Reader;
        }

        @Override // p509g1.p510j0.p517j.Http2Reader.c
        /* JADX INFO: renamed from: a */
        public void mo13534a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [g1.j0.j.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [d1.q] */
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
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() throws Throwable {
            Throwable th;
            ErrorCode2 errorCode2;
            ErrorCode2 errorCode3 = ErrorCode2.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.f30415f.m13545c(this);
                    while (this.f30415f.m13544a(false, this)) {
                    }
                    ErrorCode2 errorCode4 = ErrorCode2.NO_ERROR;
                    try {
                        this.f30416g.m13530c(errorCode4, ErrorCode2.CANCEL, null);
                        errorCode2 = errorCode4;
                    } catch (IOException e2) {
                        e = e2;
                        ErrorCode2 errorCode5 = ErrorCode2.PROTOCOL_ERROR;
                        Http2Connection http2Connection = this.f30416g;
                        http2Connection.m13530c(errorCode5, errorCode5, e);
                        errorCode2 = http2Connection;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f30416g.m13530c(errorCode2, errorCode3, e);
                    Util9.m13364d(this.f30415f);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
                errorCode2 = errorCode3;
                this.f30416g.m13530c(errorCode2, errorCode3, e);
                Util9.m13364d(this.f30415f);
                throw th;
            }
            Util9.m13364d(this.f30415f);
            errorCode3 = Unit.f29502a;
            return errorCode3;
        }

        @Override // p509g1.p510j0.p517j.Http2Reader.c
        /* JADX INFO: renamed from: e */
        public void mo13535e(boolean z, Settings2 settings2) {
            Intrinsics2.m13090f(settings2, "settings");
            TaskQueue2 taskQueue2 = this.f30416g.f30392p;
            String strM1550A = outline.m1550A(new StringBuilder(), this.f30416g.f30387k, " applyAndAckSettings");
            taskQueue2.m13419c(new c(strM1550A, true, strM1550A, true, this, z, settings2), 0L);
        }

        @Override // p509g1.p510j0.p517j.Http2Reader.c
        /* JADX INFO: renamed from: g */
        public void mo13536g(boolean z, int i, int i2, List<Header> list) {
            Intrinsics2.m13090f(list, "headerBlock");
            if (this.f30416g.m13532h(i)) {
                Http2Connection http2Connection = this.f30416g;
                Objects.requireNonNull(http2Connection);
                Intrinsics2.m13090f(list, "requestHeaders");
                TaskQueue2 taskQueue2 = http2Connection.f30393q;
                String str = http2Connection.f30387k + '[' + i + "] onHeaders";
                taskQueue2.m13419c(new TaskQueue5(str, true, str, true, http2Connection, i, list, z), 0L);
                return;
            }
            synchronized (this.f30416g) {
                Http2Stream http2StreamM13531f = this.f30416g.m13531f(i);
                if (http2StreamM13531f != null) {
                    http2StreamM13531f.m13558j(Util9.m13382v(list), z);
                    return;
                }
                Http2Connection http2Connection2 = this.f30416g;
                if (http2Connection2.f30390n) {
                    return;
                }
                if (i <= http2Connection2.f30388l) {
                    return;
                }
                if (i % 2 == http2Connection2.f30389m % 2) {
                    return;
                }
                Http2Stream http2Stream = new Http2Stream(i, this.f30416g, false, z, Util9.m13382v(list));
                Http2Connection http2Connection3 = this.f30416g;
                http2Connection3.f30388l = i;
                http2Connection3.f30386j.put(Integer.valueOf(i), http2Stream);
                TaskQueue2 taskQueue2M13427f = this.f30416g.f30391o.m13427f();
                String str2 = this.f30416g.f30387k + '[' + i + "] onStream";
                taskQueue2M13427f.m13419c(new a(str2, true, str2, true, http2Stream, this, http2StreamM13531f, i, list, z), 0L);
            }
        }

        @Override // p509g1.p510j0.p517j.Http2Reader.c
        /* JADX INFO: renamed from: i */
        public void mo13537i(int i, long j2) {
            if (i == 0) {
                synchronized (this.f30416g) {
                    Http2Connection http2Connection = this.f30416g;
                    http2Connection.f30379E += j2;
                    http2Connection.notifyAll();
                }
                return;
            }
            Http2Stream http2StreamM13531f = this.f30416g.m13531f(i);
            if (http2StreamM13531f != null) {
                synchronized (http2StreamM13531f) {
                    http2StreamM13531f.f30474d += j2;
                    if (j2 > 0) {
                        http2StreamM13531f.notifyAll();
                    }
                }
            }
        }

        @Override // p509g1.p510j0.p517j.Http2Reader.c
        /* JADX INFO: renamed from: j */
        public void mo13538j(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            boolean z2;
            boolean z3;
            long j2;
            Intrinsics2.m13090f(bufferedSource, "source");
            if (this.f30416g.m13532h(i)) {
                Http2Connection http2Connection = this.f30416g;
                Objects.requireNonNull(http2Connection);
                Intrinsics2.m13090f(bufferedSource, "source");
                Buffer3 buffer3 = new Buffer3();
                long j3 = i2;
                bufferedSource.mo13757w0(j3);
                bufferedSource.mo13392p0(buffer3, j3);
                TaskQueue2 taskQueue2 = http2Connection.f30393q;
                String str = http2Connection.f30387k + '[' + i + "] onData";
                taskQueue2.m13419c(new TaskQueue4(str, true, str, true, http2Connection, i, buffer3, i2, z), 0L);
                return;
            }
            Http2Stream http2StreamM13531f = this.f30416g.m13531f(i);
            if (http2StreamM13531f == null) {
                this.f30416g.m13528R(i, ErrorCode2.PROTOCOL_ERROR);
                long j4 = i2;
                this.f30416g.m13525D(j4);
                bufferedSource.skip(j4);
                return;
            }
            Intrinsics2.m13090f(bufferedSource, "source");
            byte[] bArr = Util9.f30070a;
            Http2Stream.c cVar = http2StreamM13531f.f30477g;
            long j5 = i2;
            Objects.requireNonNull(cVar);
            Intrinsics2.m13090f(bufferedSource, "source");
            while (true) {
                boolean z4 = true;
                if (j5 <= 0) {
                    break;
                }
                synchronized (Http2Stream.this) {
                    z2 = cVar.f30493j;
                    z3 = cVar.f30490g.f30708g + j5 > cVar.f30492i;
                }
                if (z3) {
                    bufferedSource.skip(j5);
                    Http2Stream.this.m13553e(ErrorCode2.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    bufferedSource.skip(j5);
                    break;
                }
                long jMo13392p0 = bufferedSource.mo13392p0(cVar.f30489f, j5);
                if (jMo13392p0 == -1) {
                    throw new EOFException();
                }
                j5 -= jMo13392p0;
                synchronized (Http2Stream.this) {
                    if (cVar.f30491h) {
                        Buffer3 buffer4 = cVar.f30489f;
                        j2 = buffer4.f30708g;
                        buffer4.skip(j2);
                    } else {
                        Buffer3 buffer5 = cVar.f30490g;
                        if (buffer5.f30708g != 0) {
                            z4 = false;
                        }
                        buffer5.mo13734V(cVar.f30489f);
                        if (z4) {
                            Http2Stream http2Stream = Http2Stream.this;
                            if (http2Stream == null) {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                            }
                            http2Stream.notifyAll();
                        }
                        j2 = 0;
                    }
                }
                if (j2 > 0) {
                    cVar.m13562a(j2);
                }
            }
            if (z) {
                http2StreamM13531f.m13558j(Util9.f30071b, true);
            }
        }

        @Override // p509g1.p510j0.p517j.Http2Reader.c
        /* JADX INFO: renamed from: k */
        public void mo13539k(boolean z, int i, int i2) {
            if (!z) {
                TaskQueue2 taskQueue2 = this.f30416g.f30392p;
                String strM1550A = outline.m1550A(new StringBuilder(), this.f30416g.f30387k, " ping");
                taskQueue2.m13419c(new b(strM1550A, true, strM1550A, true, this, i, i2), 0L);
                return;
            }
            synchronized (this.f30416g) {
                try {
                    if (i == 1) {
                        this.f30416g.f30397u++;
                    } else if (i == 2) {
                        this.f30416g.f30399w++;
                    } else if (i == 3) {
                        Http2Connection http2Connection = this.f30416g;
                        http2Connection.f30400x++;
                        http2Connection.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p509g1.p510j0.p517j.Http2Reader.c
        /* JADX INFO: renamed from: m */
        public void mo13540m(int i, int i2, int i3, boolean z) {
        }

        @Override // p509g1.p510j0.p517j.Http2Reader.c
        /* JADX INFO: renamed from: n */
        public void mo13541n(int i, ErrorCode2 errorCode2) {
            Intrinsics2.m13090f(errorCode2, "errorCode");
            if (!this.f30416g.m13532h(i)) {
                Http2Stream http2StreamM13533u = this.f30416g.m13533u(i);
                if (http2StreamM13533u != null) {
                    http2StreamM13533u.m13559k(errorCode2);
                    return;
                }
                return;
            }
            Http2Connection http2Connection = this.f30416g;
            Objects.requireNonNull(http2Connection);
            Intrinsics2.m13090f(errorCode2, "errorCode");
            TaskQueue2 taskQueue2 = http2Connection.f30393q;
            String str = http2Connection.f30387k + '[' + i + "] onReset";
            taskQueue2.m13419c(new TaskQueue7(str, true, str, true, http2Connection, i, errorCode2), 0L);
        }

        @Override // p509g1.p510j0.p517j.Http2Reader.c
        /* JADX INFO: renamed from: o */
        public void mo13542o(int i, int i2, List<Header> list) {
            Intrinsics2.m13090f(list, "requestHeaders");
            Http2Connection http2Connection = this.f30416g;
            Objects.requireNonNull(http2Connection);
            Intrinsics2.m13090f(list, "requestHeaders");
            synchronized (http2Connection) {
                if (http2Connection.f30383I.contains(Integer.valueOf(i2))) {
                    http2Connection.m13528R(i2, ErrorCode2.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.f30383I.add(Integer.valueOf(i2));
                TaskQueue2 taskQueue2 = http2Connection.f30393q;
                String str = http2Connection.f30387k + '[' + i2 + "] onRequest";
                taskQueue2.m13419c(new TaskQueue6(str, true, str, true, http2Connection, i2, list), 0L);
            }
        }

        @Override // p509g1.p510j0.p517j.Http2Reader.c
        /* JADX INFO: renamed from: p */
        public void mo13543p(int i, ErrorCode2 errorCode2, ByteString3 byteString3) {
            int i2;
            Http2Stream[] http2StreamArr;
            Intrinsics2.m13090f(errorCode2, "errorCode");
            Intrinsics2.m13090f(byteString3, "debugData");
            byteString3.mo13765j();
            synchronized (this.f30416g) {
                Object[] array = this.f30416g.f30386j.values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                http2StreamArr = (Http2Stream[]) array;
                this.f30416g.f30390n = true;
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.f30483m > i && http2Stream.m13556h()) {
                    http2Stream.m13559k(ErrorCode2.REFUSED_STREAM);
                    this.f30416g.m13533u(http2Stream.f30483m);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g1.j0.j.f$f */
    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class f extends Task2 {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Http2Connection f30426e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f30427f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ErrorCode2 f30428g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection, int i, ErrorCode2 errorCode2) {
            super(str2, z2);
            this.f30426e = http2Connection;
            this.f30427f = i;
            this.f30428g = errorCode2;
        }

        @Override // p509g1.p510j0.p513f.Task2
        /* JADX INFO: renamed from: a */
        public long mo13414a() {
            try {
                Http2Connection http2Connection = this.f30426e;
                int i = this.f30427f;
                ErrorCode2 errorCode2 = this.f30428g;
                Objects.requireNonNull(http2Connection);
                Intrinsics2.m13090f(errorCode2, "statusCode");
                http2Connection.f30381G.m13566D(i, errorCode2);
                return -1L;
            } catch (IOException e) {
                Http2Connection.m13523a(this.f30426e, e);
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: g1.j0.j.f$g */
    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class g extends Task2 {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Http2Connection f30429e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f30430f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ long f30431g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection, int i, long j2) {
            super(str2, z2);
            this.f30429e = http2Connection;
            this.f30430f = i;
            this.f30431g = j2;
        }

        @Override // p509g1.p510j0.p513f.Task2
        /* JADX INFO: renamed from: a */
        public long mo13414a() {
            try {
                this.f30429e.f30381G.m13567H(this.f30430f, this.f30431g);
                return -1L;
            } catch (IOException e) {
                Http2Connection.m13523a(this.f30429e, e);
                return -1L;
            }
        }
    }

    static {
        Settings2 settings2 = new Settings2();
        settings2.m13581c(7, 65535);
        settings2.m13581c(5, 16384);
        f30373f = settings2;
    }

    public Http2Connection(b bVar) {
        Intrinsics2.m13090f(bVar, "builder");
        boolean z = bVar.f30412h;
        this.f30384h = z;
        this.f30385i = bVar.f30409e;
        this.f30386j = new LinkedHashMap();
        String str = bVar.f30406b;
        if (str == null) {
            Intrinsics2.m13096l("connectionName");
            throw null;
        }
        this.f30387k = str;
        this.f30389m = bVar.f30412h ? 3 : 2;
        TaskRunner taskRunner = bVar.f30413i;
        this.f30391o = taskRunner;
        TaskQueue2 taskQueue2M13427f = taskRunner.m13427f();
        this.f30392p = taskQueue2M13427f;
        this.f30393q = taskRunner.m13427f();
        this.f30394r = taskRunner.m13427f();
        this.f30395s = bVar.f30410f;
        Settings2 settings2 = new Settings2();
        if (bVar.f30412h) {
            settings2.m13581c(7, 16777216);
        }
        this.f30402z = settings2;
        Settings2 settings3 = f30373f;
        this.f30375A = settings3;
        this.f30379E = settings3.m13579a();
        Socket socket = bVar.f30405a;
        if (socket == null) {
            Intrinsics2.m13096l("socket");
            throw null;
        }
        this.f30380F = socket;
        BufferedSink bufferedSink = bVar.f30408d;
        if (bufferedSink == null) {
            Intrinsics2.m13096l("sink");
            throw null;
        }
        this.f30381G = new Http2Writer(bufferedSink, z);
        BufferedSource bufferedSource = bVar.f30407c;
        if (bufferedSource == null) {
            Intrinsics2.m13096l("source");
            throw null;
        }
        this.f30382H = new e(this, new Http2Reader(bufferedSource, z));
        this.f30383I = new LinkedHashSet();
        int i = bVar.f30411g;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            String strM1599u = outline.m1599u(str, " ping");
            taskQueue2M13427f.m13419c(new a(strM1599u, strM1599u, this, nanos), nanos);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m13523a(Http2Connection http2Connection, IOException iOException) {
        Objects.requireNonNull(http2Connection);
        ErrorCode2 errorCode2 = ErrorCode2.PROTOCOL_ERROR;
        http2Connection.m13530c(errorCode2, errorCode2, iOException);
    }

    /* JADX INFO: renamed from: B */
    public final void m13524B(ErrorCode2 errorCode2) throws IOException {
        Intrinsics2.m13090f(errorCode2, "statusCode");
        synchronized (this.f30381G) {
            synchronized (this) {
                if (this.f30390n) {
                    return;
                }
                this.f30390n = true;
                this.f30381G.m13572h(this.f30388l, errorCode2, Util9.f30070a);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final synchronized void m13525D(long j2) {
        long j3 = this.f30376B + j2;
        this.f30376B = j3;
        long j4 = j3 - this.f30377C;
        if (j4 >= this.f30402z.m13579a() / 2) {
            m13529b0(0, j4);
            this.f30377C += j4;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m13526H(int i, boolean z, Buffer3 buffer3, long j2) throws IOException {
        long j3;
        long j4;
        int iMin;
        if (j2 == 0) {
            this.f30381G.m13570c(z, i, buffer3, 0);
            return;
        }
        while (j2 > 0) {
            Ref ref = new Ref();
            synchronized (this) {
                while (true) {
                    try {
                        j3 = this.f30378D;
                        j4 = this.f30379E;
                        if (j3 >= j4) {
                            if (!this.f30386j.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                int iMin2 = (int) Math.min(j2, j4 - j3);
                ref.f29602f = iMin2;
                iMin = Math.min(iMin2, this.f30381G.f30498h);
                ref.f29602f = iMin;
                this.f30378D += (long) iMin;
            }
            j2 -= (long) iMin;
            this.f30381G.m13570c(z && j2 == 0, i, buffer3, iMin);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m13527O(boolean z, int i, int i2) {
        try {
            this.f30381G.m13565B(z, i, i2);
        } catch (IOException e2) {
            ErrorCode2 errorCode2 = ErrorCode2.PROTOCOL_ERROR;
            m13530c(errorCode2, errorCode2, e2);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m13528R(int i, ErrorCode2 errorCode2) {
        Intrinsics2.m13090f(errorCode2, "errorCode");
        TaskQueue2 taskQueue2 = this.f30392p;
        String str = this.f30387k + '[' + i + "] writeSynReset";
        taskQueue2.m13419c(new f(str, true, str, true, this, i, errorCode2), 0L);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m13529b0(int i, long j2) {
        TaskQueue2 taskQueue2 = this.f30392p;
        String str = this.f30387k + '[' + i + "] windowUpdate";
        taskQueue2.m13419c(new g(str, true, str, true, this, i, j2), 0L);
    }

    /* JADX INFO: renamed from: c */
    public final void m13530c(ErrorCode2 errorCode2, ErrorCode2 errorCode3, IOException iOException) {
        int i;
        Intrinsics2.m13090f(errorCode2, "connectionCode");
        Intrinsics2.m13090f(errorCode3, "streamCode");
        byte[] bArr = Util9.f30070a;
        try {
            m13524B(errorCode2);
        } catch (IOException unused) {
        }
        Http2Stream[] http2StreamArr = null;
        synchronized (this) {
            if (!this.f30386j.isEmpty()) {
                Object[] array = this.f30386j.values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                http2StreamArr = (Http2Stream[]) array;
                this.f30386j.clear();
            }
        }
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.m13551c(errorCode3, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f30381G.close();
        } catch (IOException unused3) {
        }
        try {
            this.f30380F.close();
        } catch (IOException unused4) {
        }
        this.f30392p.m13421f();
        this.f30393q.m13421f();
        this.f30394r.m13421f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m13530c(ErrorCode2.NO_ERROR, ErrorCode2.CANCEL, null);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized Http2Stream m13531f(int i) {
        return this.f30386j.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m13532h(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized Http2Stream m13533u(int i) {
        Http2Stream http2StreamRemove;
        http2StreamRemove = this.f30386j.remove(Integer.valueOf(i));
        notifyAll();
        return http2StreamRemove;
    }
}
