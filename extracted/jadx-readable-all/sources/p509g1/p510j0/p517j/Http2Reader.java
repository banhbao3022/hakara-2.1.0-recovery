package p509g1.p510j0.p517j;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p478a0.Progressions;
import p477d1.p478a0._Ranges;
import p477d1.p483s._Collections;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p524h1.Buffer3;
import p524h1.BufferedSource;
import p524h1.ByteString3;
import p524h1.Source;
import p524h1.Timeout2;

/* JADX INFO: renamed from: g1.j0.j.n, reason: use source file name */
/* JADX INFO: compiled from: Http2Reader.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Http2Reader implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final Logger f30459f;

    /* JADX INFO: renamed from: g */
    public static final a f30460g = new a(null);

    /* JADX INFO: renamed from: h */
    public final b f30461h;

    /* JADX INFO: renamed from: i */
    public final Hpack.a f30462i;

    /* JADX INFO: renamed from: j */
    public final BufferedSource f30463j;

    /* JADX INFO: renamed from: k */
    public final boolean f30464k;

    /* JADX INFO: renamed from: g1.j0.j.n$a */
    /* JADX INFO: compiled from: Http2Reader.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final int m13548a(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.j0.j.n$b */
    /* JADX INFO: compiled from: Http2Reader.kt */
    public static final class b implements Source {

        /* JADX INFO: renamed from: f */
        public int f30465f;

        /* JADX INFO: renamed from: g */
        public int f30466g;

        /* JADX INFO: renamed from: h */
        public int f30467h;

        /* JADX INFO: renamed from: i */
        public int f30468i;

        /* JADX INFO: renamed from: j */
        public int f30469j;

        /* JADX INFO: renamed from: k */
        public final BufferedSource f30470k;

        public b(BufferedSource bufferedSource) {
            Intrinsics2.m13090f(bufferedSource, "source");
            this.f30470k = bufferedSource;
        }

        @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // p524h1.Source
        /* JADX INFO: renamed from: d */
        public Timeout2 mo13391d() {
            return this.f30470k.mo13391d();
        }

        @Override // p524h1.Source
        /* JADX INFO: renamed from: p0 */
        public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
            int i;
            int i2;
            Intrinsics2.m13090f(buffer3, "sink");
            do {
                int i3 = this.f30468i;
                if (i3 != 0) {
                    long jMo13392p0 = this.f30470k.mo13392p0(buffer3, Math.min(j2, i3));
                    if (jMo13392p0 == -1) {
                        return -1L;
                    }
                    this.f30468i -= (int) jMo13392p0;
                    return jMo13392p0;
                }
                this.f30470k.skip(this.f30469j);
                this.f30469j = 0;
                if ((this.f30466g & 4) != 0) {
                    return -1L;
                }
                i = this.f30467h;
                int iM13379s = Util9.m13379s(this.f30470k);
                this.f30468i = iM13379s;
                this.f30465f = iM13379s;
                int i4 = this.f30470k.readByte() & 255;
                this.f30466g = this.f30470k.readByte() & 255;
                Objects.requireNonNull(Http2Reader.f30460g);
                Logger logger = Http2Reader.f30459f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Http2.f30372e.m13522b(true, this.f30467h, this.f30465f, i4, this.f30466g));
                }
                i2 = this.f30470k.readInt() & Integer.MAX_VALUE;
                this.f30467h = i2;
                if (i4 != 9) {
                    throw new IOException(i4 + " != TYPE_CONTINUATION");
                }
            } while (i2 == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
    }

    /* JADX INFO: renamed from: g1.j0.j.n$c */
    /* JADX INFO: compiled from: Http2Reader.kt */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo13534a();

        /* JADX INFO: renamed from: e */
        void mo13535e(boolean z, Settings2 settings2);

        /* JADX INFO: renamed from: g */
        void mo13536g(boolean z, int i, int i2, List<Header> list);

        /* JADX INFO: renamed from: i */
        void mo13537i(int i, long j2);

        /* JADX INFO: renamed from: j */
        void mo13538j(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException;

        /* JADX INFO: renamed from: k */
        void mo13539k(boolean z, int i, int i2);

        /* JADX INFO: renamed from: m */
        void mo13540m(int i, int i2, int i3, boolean z);

        /* JADX INFO: renamed from: n */
        void mo13541n(int i, ErrorCode2 errorCode2);

        /* JADX INFO: renamed from: o */
        void mo13542o(int i, int i2, List<Header> list) throws IOException;

        /* JADX INFO: renamed from: p */
        void mo13543p(int i, ErrorCode2 errorCode2, ByteString3 byteString3);
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        Intrinsics2.m13086b(logger, "Logger.getLogger(Http2::class.java.name)");
        f30459f = logger;
    }

    public Http2Reader(BufferedSource bufferedSource, boolean z) {
        Intrinsics2.m13090f(bufferedSource, "source");
        this.f30463j = bufferedSource;
        this.f30464k = z;
        b bVar = new b(bufferedSource);
        this.f30461h = bVar;
        this.f30462i = new Hpack.a(bVar, 4096, 0, 4, null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final boolean m13544a(boolean z, c cVar) throws IOException {
        Intrinsics2.m13090f(cVar, "handler");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        try {
            this.f30463j.mo13757w0(9L);
            int iM13379s = Util9.m13379s(this.f30463j);
            if (iM13379s > 16384) {
                throw new IOException(outline.m1590l("FRAME_SIZE_ERROR: ", iM13379s));
            }
            int i4 = this.f30463j.readByte() & 255;
            int i5 = this.f30463j.readByte() & 255;
            int i6 = this.f30463j.readInt() & Integer.MAX_VALUE;
            Logger logger = f30459f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.f30372e.m13522b(true, i6, iM13379s, i4, i5));
            }
            if (z && i4 != 4) {
                StringBuilder sbM1556G = outline.m1556G("Expected a SETTINGS frame but was ");
                sbM1556G.append(Http2.f30372e.m13521a(i4));
                throw new IOException(sbM1556G.toString());
            }
            switch (i4) {
                case 0:
                    if (i6 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z2 = (i5 & 1) != 0;
                    if ((i5 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    if ((i5 & 8) != 0) {
                        byte b2 = this.f30463j.readByte();
                        byte[] bArr = Util9.f30070a;
                        i = b2 & 255;
                    }
                    cVar.mo13538j(z2, i6, this.f30463j, f30460g.m13548a(iM13379s, i5, i));
                    this.f30463j.skip(i);
                    return true;
                case 1:
                    if (i6 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z3 = (i5 & 1) != 0;
                    if ((i5 & 8) != 0) {
                        byte b3 = this.f30463j.readByte();
                        byte[] bArr2 = Util9.f30070a;
                        i3 = b3 & 255;
                    }
                    if ((i5 & 32) != 0) {
                        m13547h(cVar, i6);
                        iM13379s -= 5;
                    }
                    cVar.mo13536g(z3, i6, -1, m13546f(f30460g.m13548a(iM13379s, i5, i3), i3, i5, i6));
                    return true;
                case 2:
                    if (iM13379s != 5) {
                        throw new IOException(outline.m1592n("TYPE_PRIORITY length: ", iM13379s, " != 5"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    m13547h(cVar, i6);
                    return true;
                case 3:
                    if (iM13379s != 4) {
                        throw new IOException(outline.m1592n("TYPE_RST_STREAM length: ", iM13379s, " != 4"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i7 = this.f30463j.readInt();
                    ErrorCode2 errorCode2M13506a = ErrorCode2.f30336m.m13506a(i7);
                    if (errorCode2M13506a == null) {
                        throw new IOException(outline.m1590l("TYPE_RST_STREAM unexpected error code: ", i7));
                    }
                    cVar.mo13541n(i6, errorCode2M13506a);
                    return true;
                case 4:
                    if (i6 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((i5 & 1) != 0) {
                        if (iM13379s != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        cVar.mo13534a();
                    } else {
                        if (iM13379s % 6 != 0) {
                            throw new IOException(outline.m1590l("TYPE_SETTINGS length % 6 != 0: ", iM13379s));
                        }
                        Settings2 settings2 = new Settings2();
                        Progressions progressionsM12969d = _Ranges.m12969d(_Ranges.m12970e(0, iM13379s), 6);
                        int i8 = progressionsM12969d.f29431g;
                        int i9 = progressionsM12969d.f29432h;
                        int i10 = progressionsM12969d.f29433i;
                        if (i10 < 0 ? i8 >= i9 : i8 <= i9) {
                            while (true) {
                                short s = this.f30463j.readShort();
                                byte[] bArr3 = Util9.f30070a;
                                int i11 = s & 65535;
                                int i12 = this.f30463j.readInt();
                                if (i11 != 2) {
                                    if (i11 == 3) {
                                        i11 = 4;
                                    } else if (i11 == 4) {
                                        i11 = 7;
                                        if (i12 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                    } else if (i11 == 5 && (i12 < 16384 || i12 > 16777215)) {
                                        throw new IOException(outline.m1590l("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", i12));
                                    }
                                } else if (i12 != 0 && i12 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                settings2.m13581c(i11, i12);
                                if (i8 != i9) {
                                    i8 += i10;
                                }
                            }
                        }
                        cVar.mo13535e(false, settings2);
                    }
                    return true;
                case 5:
                    if (i6 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    if ((i5 & 8) != 0) {
                        byte b4 = this.f30463j.readByte();
                        byte[] bArr4 = Util9.f30070a;
                        i2 = b4 & 255;
                    }
                    cVar.mo13542o(i6, this.f30463j.readInt() & Integer.MAX_VALUE, m13546f(f30460g.m13548a(iM13379s - 4, i5, i2), i2, i5, i6));
                    return true;
                case 6:
                    if (iM13379s != 8) {
                        throw new IOException(outline.m1590l("TYPE_PING length != 8: ", iM13379s));
                    }
                    if (i6 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    cVar.mo13539k((i5 & 1) != 0, this.f30463j.readInt(), this.f30463j.readInt());
                    return true;
                case 7:
                    if (iM13379s < 8) {
                        throw new IOException(outline.m1590l("TYPE_GOAWAY length < 8: ", iM13379s));
                    }
                    if (i6 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i13 = this.f30463j.readInt();
                    int i14 = this.f30463j.readInt();
                    int i15 = iM13379s - 8;
                    ErrorCode2 errorCode2M13506a2 = ErrorCode2.f30336m.m13506a(i14);
                    if (errorCode2M13506a2 == null) {
                        throw new IOException(outline.m1590l("TYPE_GOAWAY unexpected error code: ", i14));
                    }
                    ByteString3 byteString3Mo13748m = ByteString3.f30711f;
                    if (i15 > 0) {
                        byteString3Mo13748m = this.f30463j.mo13748m(i15);
                    }
                    cVar.mo13543p(i13, errorCode2M13506a2, byteString3Mo13748m);
                    return true;
                case 8:
                    if (iM13379s != 4) {
                        throw new IOException(outline.m1590l("TYPE_WINDOW_UPDATE length !=4: ", iM13379s));
                    }
                    int i16 = this.f30463j.readInt();
                    byte[] bArr5 = Util9.f30070a;
                    long j2 = ((long) i16) & 2147483647L;
                    if (j2 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    cVar.mo13537i(i6, j2);
                    return true;
                default:
                    this.f30463j.skip(iM13379s);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13545c(c cVar) throws IOException {
        Intrinsics2.m13090f(cVar, "handler");
        if (this.f30464k) {
            if (!m13544a(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.f30463j;
        ByteString3 byteString3 = Http2.f30368a;
        ByteString3 byteString3Mo13748m = bufferedSource.mo13748m(byteString3.mo13765j());
        Logger logger = f30459f;
        if (logger.isLoggable(Level.FINE)) {
            StringBuilder sbM1556G = outline.m1556G("<< CONNECTION ");
            sbM1556G.append(byteString3Mo13748m.mo13766l());
            logger.fine(Util9.m13369i(sbM1556G.toString(), new Object[0]));
        }
        if (!Intrinsics2.m13085a(byteString3, byteString3Mo13748m)) {
            StringBuilder sbM1556G2 = outline.m1556G("Expected a connection header but was ");
            sbM1556G2.append(byteString3Mo13748m.m13772w());
            throw new IOException(sbM1556G2.toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30463j.close();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX INFO: renamed from: f */
    public final List<Header> m13546f(int i, int i2, int i3, int i4) throws IOException {
        boolean z;
        b bVar = this.f30461h;
        bVar.f30468i = i;
        bVar.f30465f = i;
        bVar.f30469j = i2;
        bVar.f30466g = i3;
        bVar.f30467h = i4;
        Hpack.a aVar = this.f30462i;
        while (!aVar.f30351b.mo13759y()) {
            byte b2 = aVar.f30351b.readByte();
            byte[] bArr = Util9.f30070a;
            int i5 = b2 & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((i5 & 128) == 128) {
                int iM13514g = aVar.m13514g(i5, 127) - 1;
                if (iM13514g >= 0) {
                    Hpack hpack = Hpack.f30349c;
                    if (iM13514g <= Hpack.f30347a.length - 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    Hpack hpack2 = Hpack.f30349c;
                    int iM13509b = aVar.m13509b(iM13514g - Hpack.f30347a.length);
                    if (iM13509b >= 0) {
                        Header[] headerArr = aVar.f30352c;
                        if (iM13509b < headerArr.length) {
                            List<Header> list = aVar.f30350a;
                            Header header = headerArr[iM13509b];
                            if (header == null) {
                                Intrinsics2.m13095k();
                                throw null;
                            }
                            list.add(header);
                        }
                    }
                    StringBuilder sbM1556G = outline.m1556G("Header index too large ");
                    sbM1556G.append(iM13514g + 1);
                    throw new IOException(sbM1556G.toString());
                }
                Hpack hpack3 = Hpack.f30349c;
                aVar.f30350a.add(Hpack.f30347a[iM13514g]);
            } else if (i5 == 64) {
                Hpack hpack4 = Hpack.f30349c;
                ByteString3 byteString3M13513f = aVar.m13513f();
                hpack4.m13507a(byteString3M13513f);
                aVar.m13512e(-1, new Header(byteString3M13513f, aVar.m13513f()));
            } else if ((i5 & 64) == 64) {
                aVar.m13512e(-1, new Header(aVar.m13511d(aVar.m13514g(i5, 63) - 1), aVar.m13513f()));
            } else if ((i5 & 32) == 32) {
                int iM13514g2 = aVar.m13514g(i5, 31);
                aVar.f30357h = iM13514g2;
                if (iM13514g2 < 0 || iM13514g2 > aVar.f30356g) {
                    StringBuilder sbM1556G2 = outline.m1556G("Invalid dynamic table size update ");
                    sbM1556G2.append(aVar.f30357h);
                    throw new IOException(sbM1556G2.toString());
                }
                int i6 = aVar.f30355f;
                if (iM13514g2 < i6) {
                    if (iM13514g2 == 0) {
                        aVar.m13508a();
                    } else {
                        aVar.m13510c(i6 - iM13514g2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                Hpack hpack5 = Hpack.f30349c;
                ByteString3 byteString3M13513f2 = aVar.m13513f();
                hpack5.m13507a(byteString3M13513f2);
                aVar.f30350a.add(new Header(byteString3M13513f2, aVar.m13513f()));
            } else {
                aVar.f30350a.add(new Header(aVar.m13511d(aVar.m13514g(i5, 15) - 1), aVar.m13513f()));
            }
        }
        Hpack.a aVar2 = this.f30462i;
        List<Header> listM13049n = _Collections.m13049n(aVar2.f30350a);
        aVar2.f30350a.clear();
        return listM13049n;
    }

    /* JADX INFO: renamed from: h */
    public final void m13547h(c cVar, int i) throws IOException {
        int i2 = this.f30463j.readInt();
        boolean z = (i2 & ((int) 2147483648L)) != 0;
        byte b2 = this.f30463j.readByte();
        byte[] bArr = Util9.f30070a;
        cVar.mo13540m(i, i2 & Integer.MAX_VALUE, (b2 & 255) + 1, z);
    }
}
