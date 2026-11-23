package p509g1;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import p007c.p451o.p452a.C5729a;
import p477d1.TypeCastException;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s.Collections4;
import p477d1.p483s.Sets5;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p512e.CacheRequest;
import p509g1.p510j0.p512e.DiskLruCache2;
import p509g1.p510j0.p513f.TaskRunner;
import p509g1.p510j0.p515h.StatusLine;
import p509g1.p510j0.p518k.FileSystem2;
import p509g1.p510j0.p519l.Platform;
import p524h1.Buffer3;
import p524h1.Buffer3.a;
import p524h1.BufferedSink;
import p524h1.BufferedSource;
import p524h1.ByteString3;
import p524h1.ForwardingSink;
import p524h1.ForwardingSource;
import p524h1.RealBufferedSink;
import p524h1.RealBufferedSource;
import p524h1.Sink;
import p524h1.Source;

/* JADX INFO: renamed from: g1.c, reason: use source file name */
/* JADX INFO: compiled from: Cache.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Cache2 implements Closeable, Flushable {

    /* JADX INFO: renamed from: f */
    public static final b f29919f = new b(null);

    /* JADX INFO: renamed from: g */
    public final DiskLruCache2 f29920g;

    /* JADX INFO: renamed from: h */
    public int f29921h;

    /* JADX INFO: renamed from: i */
    public int f29922i;

    /* JADX INFO: renamed from: j */
    public int f29923j;

    /* JADX INFO: renamed from: k */
    public int f29924k;

    /* JADX INFO: renamed from: l */
    public int f29925l;

    /* JADX INFO: renamed from: g1.c$a */
    /* JADX INFO: compiled from: Cache.kt */
    public static final class a extends ResponseBody {

        /* JADX INFO: renamed from: f */
        public final BufferedSource f29926f;

        /* JADX INFO: renamed from: g */
        public final DiskLruCache2.d f29927g;

        /* JADX INFO: renamed from: h */
        public final String f29928h;

        /* JADX INFO: renamed from: i */
        public final String f29929i;

        /* JADX INFO: renamed from: g1.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Cache.kt */
        public static final class C8542a extends ForwardingSource {

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ Source f29931h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8542a(Source source, Source source2) {
                super(source2);
                this.f29931h = source;
            }

            @Override // p524h1.ForwardingSource, p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                a.this.f29927g.close();
                this.f30717f.close();
            }
        }

        public a(DiskLruCache2.d dVar, String str, String str2) {
            Intrinsics2.m13090f(dVar, "snapshot");
            this.f29927g = dVar;
            this.f29928h = str;
            this.f29929i = str2;
            Source source = dVar.f30149h.get(1);
            C8542a c8542a = new C8542a(source, source);
            Intrinsics2.m13090f(c8542a, "$this$buffer");
            this.f29926f = new RealBufferedSource(c8542a);
        }

        @Override // p509g1.ResponseBody
        public long contentLength() {
            String str = this.f29929i;
            if (str != null) {
                byte[] bArr = Util9.f30070a;
                Intrinsics2.m13090f(str, "$this$toLongOrDefault");
                try {
                    return Long.parseLong(str);
                } catch (NumberFormatException unused) {
                }
            }
            return -1L;
        }

        @Override // p509g1.ResponseBody
        public MediaType2 contentType() {
            String str = this.f29928h;
            if (str != null) {
                return MediaType2.f30664c.m13688b(str);
            }
            return null;
        }

        @Override // p509g1.ResponseBody
        public BufferedSource source() {
            return this.f29926f;
        }
    }

    /* JADX INFO: renamed from: g1.c$b */
    /* JADX INFO: compiled from: Cache.kt */
    public static final class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final String m13304a(HttpUrl httpUrl) {
            Intrinsics2.m13090f(httpUrl, "url");
            return ByteString3.f30712g.m13777c(httpUrl.f30652l).mo13764h("MD5").mo13766l();
        }

        /* JADX INFO: renamed from: b */
        public final int m13305b(BufferedSource bufferedSource) throws IOException {
            Intrinsics2.m13090f(bufferedSource, "source");
            try {
                long jMo13716G = bufferedSource.mo13716G();
                String strMo13741e0 = bufferedSource.mo13741e0();
                if (jMo13716G >= 0 && jMo13716G <= Integer.MAX_VALUE) {
                    if (!(strMo13741e0.length() > 0)) {
                        return (int) jMo13716G;
                    }
                }
                throw new IOException("expected an int but was \"" + jMo13716G + strMo13741e0 + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* JADX INFO: renamed from: c */
        public final Set<String> m13306c(Headers2 headers2) {
            int size = headers2.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (StringsJVM.m12989f("Vary", headers2.m13650f(i), true)) {
                    String strM13653m = headers2.m13653m(i);
                    if (treeSet == null) {
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        Intrinsics2.m13088d(comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(comparator);
                    }
                    for (String str : Strings5.m13001D(strM13653m, new char[]{','}, false, 0, 6)) {
                        if (str == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        treeSet.add(Strings5.m13004G(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : Sets5.f29521f;
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.c$d */
    /* JADX INFO: compiled from: Cache.kt */
    public final class d implements CacheRequest {

        /* JADX INFO: renamed from: a */
        public final Sink f29944a;

        /* JADX INFO: renamed from: b */
        public final Sink f29945b;

        /* JADX INFO: renamed from: c */
        public boolean f29946c;

        /* JADX INFO: renamed from: d */
        public final DiskLruCache2.b f29947d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Cache2 f29948e;

        /* JADX INFO: renamed from: g1.c$d$a */
        /* JADX INFO: compiled from: Cache.kt */
        public static final class a extends ForwardingSink {
            public a(Sink sink) {
                super(sink);
            }

            @Override // p524h1.ForwardingSink, p524h1.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (d.this.f29948e) {
                    d dVar = d.this;
                    if (dVar.f29946c) {
                        return;
                    }
                    dVar.f29946c = true;
                    dVar.f29948e.f29921h++;
                    this.f30716f.close();
                    d.this.f29947d.m13409b();
                }
            }
        }

        public d(Cache2 cache2, DiskLruCache2.b bVar) {
            Intrinsics2.m13090f(bVar, "editor");
            this.f29948e = cache2;
            this.f29947d = bVar;
            Sink sinkM13411d = bVar.m13411d(1);
            this.f29944a = sinkM13411d;
            this.f29945b = new a(sinkM13411d);
        }

        @Override // p509g1.p510j0.p512e.CacheRequest
        /* JADX INFO: renamed from: a */
        public void mo13310a() {
            synchronized (this.f29948e) {
                if (this.f29946c) {
                    return;
                }
                this.f29946c = true;
                this.f29948e.f29922i++;
                Util9.m13364d(this.f29944a);
                try {
                    this.f29947d.m13408a();
                } catch (IOException unused) {
                }
            }
        }
    }

    public Cache2(File file, long j2, FileSystem2 fileSystem2) {
        Intrinsics2.m13090f(file, "directory");
        Intrinsics2.m13090f(fileSystem2, "fileSystem");
        this.f29920g = new DiskLruCache2(fileSystem2, file, 201105, 2, j2, TaskRunner.f30169a);
    }

    /* JADX INFO: renamed from: a */
    public final void m13303a(Request3 request3) throws IOException {
        Intrinsics2.m13090f(request3, "request");
        DiskLruCache2 diskLruCache2 = this.f29920g;
        String strM13304a = f29919f.m13304a(request3.f29951b);
        synchronized (diskLruCache2) {
            Intrinsics2.m13090f(strM13304a, "key");
            diskLruCache2.m13407u();
            diskLruCache2.m13399a();
            diskLruCache2.m13406n0(strM13304a);
            DiskLruCache2.c cVar = diskLruCache2.f30128w.get(strM13304a);
            if (cVar != null) {
                Intrinsics2.m13086b(cVar, "lruEntries[key] ?: return false");
                diskLruCache2.m13403f0(cVar);
                if (diskLruCache2.f30126u <= diskLruCache2.f30122q) {
                    diskLruCache2.f30113C = false;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f29920g.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f29920g.flush();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache2(File file, long j2) {
        this(file, j2, FileSystem2.f30514a);
        Intrinsics2.m13090f(file, "directory");
    }

    /* JADX INFO: renamed from: g1.c$c */
    /* JADX INFO: compiled from: Cache.kt */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final String f29932a;

        /* JADX INFO: renamed from: b */
        public static final String f29933b;

        /* JADX INFO: renamed from: c */
        public final String f29934c;

        /* JADX INFO: renamed from: d */
        public final Headers2 f29935d;

        /* JADX INFO: renamed from: e */
        public final String f29936e;

        /* JADX INFO: renamed from: f */
        public final Protocol f29937f;

        /* JADX INFO: renamed from: g */
        public final int f29938g;

        /* JADX INFO: renamed from: h */
        public final String f29939h;

        /* JADX INFO: renamed from: i */
        public final Headers2 f29940i;

        /* JADX INFO: renamed from: j */
        public final Handshake f29941j;

        /* JADX INFO: renamed from: k */
        public final long f29942k;

        /* JADX INFO: renamed from: l */
        public final long f29943l;

        /* JADX INFO: renamed from: g1.c$c$a */
        /* JADX INFO: compiled from: Cache.kt */
        public static final class a {
            public a() {
            }

            public a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            new a(null);
            Platform.a aVar = Platform.f30547c;
            Objects.requireNonNull(aVar);
            Objects.requireNonNull(Platform.f30545a);
            f29932a = "OkHttp-Sent-Millis";
            Objects.requireNonNull(aVar);
            Objects.requireNonNull(Platform.f30545a);
            f29933b = "OkHttp-Received-Millis";
        }

        public c(Source source) throws IOException {
            Intrinsics2.m13090f(source, "rawSource");
            try {
                Intrinsics2.m13090f(source, "$this$buffer");
                RealBufferedSource realBufferedSource = new RealBufferedSource(source);
                this.f29934c = realBufferedSource.mo13741e0();
                this.f29936e = realBufferedSource.mo13741e0();
                Headers2.a aVar = new Headers2.a();
                int iM13305b = Cache2.f29919f.m13305b(realBufferedSource);
                for (int i = 0; i < iM13305b; i++) {
                    aVar.m13656b(realBufferedSource.mo13741e0());
                }
                this.f29935d = aVar.m13658d();
                StatusLine statusLineM13498a = StatusLine.f30300a.m13498a(realBufferedSource.mo13741e0());
                this.f29937f = statusLineM13498a.f30301b;
                this.f29938g = statusLineM13498a.f30302c;
                this.f29939h = statusLineM13498a.f30303d;
                Headers2.a aVar2 = new Headers2.a();
                int iM13305b2 = Cache2.f29919f.m13305b(realBufferedSource);
                for (int i2 = 0; i2 < iM13305b2; i2++) {
                    aVar2.m13656b(realBufferedSource.mo13741e0());
                }
                String str = f29932a;
                String strM13659e = aVar2.m13659e(str);
                String str2 = f29933b;
                String strM13659e2 = aVar2.m13659e(str2);
                aVar2.m13660f(str);
                aVar2.m13660f(str2);
                this.f29942k = strM13659e != null ? Long.parseLong(strM13659e) : 0L;
                this.f29943l = strM13659e2 != null ? Long.parseLong(strM13659e2) : 0L;
                this.f29940i = aVar2.m13658d();
                if (StringsJVM.m12997n(this.f29934c, "https://", false, 2)) {
                    String strMo13741e0 = realBufferedSource.mo13741e0();
                    if (strMo13741e0.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strMo13741e0 + '\"');
                    }
                    this.f29941j = Handshake.f30630a.m13648b(!realBufferedSource.mo13759y() ? TlsVersion.f30045l.m13355a(realBufferedSource.mo13741e0()) : TlsVersion.SSL_3_0, CipherSuite.f30065s.m13357b(realBufferedSource.mo13741e0()), m13307a(realBufferedSource), m13307a(realBufferedSource));
                } else {
                    this.f29941j = null;
                }
                source.close();
            } catch (Throwable th) {
                source.close();
                throw th;
            }
        }

        /* JADX INFO: renamed from: a */
        public final List<Certificate> m13307a(BufferedSource bufferedSource) throws IOException {
            int iM13305b = Cache2.f29919f.m13305b(bufferedSource);
            if (iM13305b == -1) {
                return Collections4.f29519f;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iM13305b);
                for (int i = 0; i < iM13305b; i++) {
                    String strMo13741e0 = ((RealBufferedSource) bufferedSource).mo13741e0();
                    Buffer3 buffer3 = new Buffer3();
                    ByteString3 byteString3M13775a = ByteString3.f30712g.m13775a(strMo13741e0);
                    if (byteString3M13775a == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    buffer3.m13717G0(byteString3M13775a);
                    arrayList.add(certificateFactory.generateCertificate(buffer3.new a()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m13308b(BufferedSink bufferedSink, List<? extends Certificate> list) throws IOException {
            try {
                RealBufferedSink realBufferedSink = (RealBufferedSink) bufferedSink;
                realBufferedSink.mo13760y0(list.size());
                realBufferedSink.mo13761z(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] encoded = list.get(i).getEncoded();
                    ByteString3.a aVar = ByteString3.f30712g;
                    Intrinsics2.m13086b(encoded, "bytes");
                    realBufferedSink.mo13728P(ByteString3.a.m13774d(aVar, encoded, 0, 0, 3).mo13763f()).mo13761z(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m13309c(DiskLruCache2.b bVar) throws IOException {
            Intrinsics2.m13090f(bVar, "editor");
            Sink sinkM13411d = bVar.m13411d(0);
            Intrinsics2.m13090f(sinkM13411d, "$this$buffer");
            RealBufferedSink realBufferedSink = new RealBufferedSink(sinkM13411d);
            try {
                realBufferedSink.mo13728P(this.f29934c).mo13761z(10);
                realBufferedSink.mo13728P(this.f29936e).mo13761z(10);
                realBufferedSink.mo13760y0(this.f29935d.size());
                realBufferedSink.mo13761z(10);
                int size = this.f29935d.size();
                for (int i = 0; i < size; i++) {
                    realBufferedSink.mo13728P(this.f29935d.m13650f(i)).mo13728P(": ").mo13728P(this.f29935d.m13653m(i)).mo13761z(10);
                }
                realBufferedSink.mo13728P(new StatusLine(this.f29937f, this.f29938g, this.f29939h).toString()).mo13761z(10);
                realBufferedSink.mo13760y0(this.f29940i.size() + 2);
                realBufferedSink.mo13761z(10);
                int size2 = this.f29940i.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    realBufferedSink.mo13728P(this.f29940i.m13650f(i2)).mo13728P(": ").mo13728P(this.f29940i.m13653m(i2)).mo13761z(10);
                }
                realBufferedSink.mo13728P(f29932a).mo13728P(": ").mo13760y0(this.f29942k).mo13761z(10);
                realBufferedSink.mo13728P(f29933b).mo13728P(": ").mo13760y0(this.f29943l).mo13761z(10);
                if (StringsJVM.m12997n(this.f29934c, "https://", false, 2)) {
                    realBufferedSink.mo13761z(10);
                    Handshake handshake = this.f29941j;
                    if (handshake == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    realBufferedSink.mo13728P(handshake.f30633d.f30066t).mo13761z(10);
                    m13308b(realBufferedSink, this.f29941j.m13646b());
                    m13308b(realBufferedSink, this.f29941j.f30634e);
                    realBufferedSink.mo13728P(this.f29941j.f30632c.f30046m).mo13761z(10);
                }
                C5729a.m12455j(realBufferedSink, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C5729a.m12455j(realBufferedSink, th);
                    throw th2;
                }
            }
        }

        public c(Response3 response3) {
            Headers2 headers2M13658d;
            Intrinsics2.m13090f(response3, "response");
            this.f29934c = response3.f29990g.f29951b.f30652l;
            b bVar = Cache2.f29919f;
            Objects.requireNonNull(bVar);
            Intrinsics2.m13090f(response3, "$this$varyHeaders");
            Response3 response4 = response3.f29997n;
            if (response4 != null) {
                Headers2 headers2 = response4.f29990g.f29953d;
                Set<String> setM13306c = bVar.m13306c(response3.f29995l);
                if (setM13306c.isEmpty()) {
                    headers2M13658d = Util9.f30071b;
                } else {
                    Headers2.a aVar = new Headers2.a();
                    int size = headers2.size();
                    for (int i = 0; i < size; i++) {
                        String strM13650f = headers2.m13650f(i);
                        if (setM13306c.contains(strM13650f)) {
                            aVar.m13655a(strM13650f, headers2.m13653m(i));
                        }
                    }
                    headers2M13658d = aVar.m13658d();
                }
                this.f29935d = headers2M13658d;
                this.f29936e = response3.f29990g.f29952c;
                this.f29937f = response3.f29991h;
                this.f29938g = response3.f29993j;
                this.f29939h = response3.f29992i;
                this.f29940i = response3.f29995l;
                this.f29941j = response3.f29994k;
                this.f29942k = response3.f30000q;
                this.f29943l = response3.f30001r;
                return;
            }
            Intrinsics2.m13095k();
            throw null;
        }
    }
}
