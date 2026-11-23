package p509g1.p510j0.p512e;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.TypeCastException;
import p477d1.Unit;
import p477d1.p481d0.Regex2;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p513f.Task2;
import p509g1.p510j0.p513f.TaskQueue2;
import p509g1.p510j0.p513f.TaskRunner;
import p509g1.p510j0.p518k.FileSystem2;
import p509g1.p510j0.p519l.Platform;
import p524h1.BufferedSink;
import p524h1.BufferedSource;
import p524h1.Okio;
import p524h1.RealBufferedSink;
import p524h1.Sink;
import p524h1.Source;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: g1.j0.e.e, reason: use source file name */
/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DiskLruCache2 implements Closeable, Flushable {

    /* JADX INFO: renamed from: f */
    public static final String f30100f;

    /* JADX INFO: renamed from: g */
    public static final String f30101g;

    /* JADX INFO: renamed from: h */
    public static final String f30102h;

    /* JADX INFO: renamed from: i */
    public static final String f30103i;

    /* JADX INFO: renamed from: j */
    public static final String f30104j;

    /* JADX INFO: renamed from: k */
    public static final long f30105k;

    /* JADX INFO: renamed from: l */
    public static final Regex2 f30106l;

    /* JADX INFO: renamed from: m */
    public static final String f30107m;

    /* JADX INFO: renamed from: n */
    public static final String f30108n;

    /* JADX INFO: renamed from: o */
    public static final String f30109o;

    /* JADX INFO: renamed from: p */
    public static final String f30110p;

    /* JADX INFO: renamed from: A */
    public boolean f30111A;

    /* JADX INFO: renamed from: B */
    public boolean f30112B;

    /* JADX INFO: renamed from: C */
    public boolean f30113C;

    /* JADX INFO: renamed from: D */
    public boolean f30114D;

    /* JADX INFO: renamed from: E */
    public long f30115E;

    /* JADX INFO: renamed from: F */
    public final TaskQueue2 f30116F;

    /* JADX INFO: renamed from: G */
    public final e f30117G;

    /* JADX INFO: renamed from: H */
    public final FileSystem2 f30118H;

    /* JADX INFO: renamed from: I */
    public final File f30119I;

    /* JADX INFO: renamed from: J */
    public final int f30120J;

    /* JADX INFO: renamed from: K */
    public final int f30121K;

    /* JADX INFO: renamed from: q */
    public long f30122q;

    /* JADX INFO: renamed from: r */
    public final File f30123r;

    /* JADX INFO: renamed from: s */
    public final File f30124s;

    /* JADX INFO: renamed from: t */
    public final File f30125t;

    /* JADX INFO: renamed from: u */
    public long f30126u;

    /* JADX INFO: renamed from: v */
    public BufferedSink f30127v;

    /* JADX INFO: renamed from: w */
    public final LinkedHashMap<String, c> f30128w;

    /* JADX INFO: renamed from: x */
    public int f30129x;

    /* JADX INFO: renamed from: y */
    public boolean f30130y;

    /* JADX INFO: renamed from: z */
    public boolean f30131z;

    /* JADX INFO: renamed from: g1.j0.e.e$a */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.j0.e.e$b */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class b {

        /* JADX INFO: renamed from: a */
        public final boolean[] f30132a;

        /* JADX INFO: renamed from: b */
        public boolean f30133b;

        /* JADX INFO: renamed from: c */
        public final c f30134c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DiskLruCache2 f30135d;

        /* JADX INFO: renamed from: g1.j0.e.e$b$a */
        /* JADX INFO: compiled from: DiskLruCache.kt */
        public static final class a extends Lambda implements InterfaceC6164l<IOException, Unit> {
            public a(int i) {
                super(1);
            }

            @Override // p477d1.p493x.p494b.InterfaceC6164l
            /* JADX INFO: renamed from: b */
            public Unit mo3b(IOException iOException) {
                Intrinsics2.m13090f(iOException, "it");
                synchronized (b.this.f30135d) {
                    b.this.m13410c();
                }
                return Unit.f29502a;
            }
        }

        public b(DiskLruCache2 diskLruCache2, c cVar) {
            Intrinsics2.m13090f(cVar, "entry");
            this.f30135d = diskLruCache2;
            this.f30134c = cVar;
            this.f30132a = cVar.f30140d ? null : new boolean[diskLruCache2.f30121K];
        }

        /* JADX INFO: renamed from: a */
        public final void m13408a() throws IOException {
            synchronized (this.f30135d) {
                if (!(!this.f30133b)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (Intrinsics2.m13085a(this.f30134c.f30142f, this)) {
                    this.f30135d.m13401c(this, false);
                }
                this.f30133b = true;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m13409b() throws IOException {
            synchronized (this.f30135d) {
                if (!(!this.f30133b)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (Intrinsics2.m13085a(this.f30134c.f30142f, this)) {
                    this.f30135d.m13401c(this, true);
                }
                this.f30133b = true;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m13410c() throws IOException {
            if (Intrinsics2.m13085a(this.f30134c.f30142f, this)) {
                DiskLruCache2 diskLruCache2 = this.f30135d;
                if (diskLruCache2.f30131z) {
                    diskLruCache2.m13401c(this, false);
                } else {
                    this.f30134c.f30141e = true;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final Sink m13411d(int i) {
            synchronized (this.f30135d) {
                if (!(!this.f30133b)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!Intrinsics2.m13085a(this.f30134c.f30142f, this)) {
                    return new Okio();
                }
                c cVar = this.f30134c;
                if (!cVar.f30140d) {
                    boolean[] zArr = this.f30132a;
                    if (zArr == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    zArr[i] = true;
                }
                try {
                    return new FaultHidingSink(this.f30135d.f30118H.mo13583b(cVar.f30139c.get(i)), new a(i));
                } catch (FileNotFoundException unused) {
                    return new Okio();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g1.j0.e.e$c */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final long[] f30137a;

        /* JADX INFO: renamed from: b */
        public final List<File> f30138b;

        /* JADX INFO: renamed from: c */
        public final List<File> f30139c;

        /* JADX INFO: renamed from: d */
        public boolean f30140d;

        /* JADX INFO: renamed from: e */
        public boolean f30141e;

        /* JADX INFO: renamed from: f */
        public b f30142f;

        /* JADX INFO: renamed from: g */
        public int f30143g;

        /* JADX INFO: renamed from: h */
        public long f30144h;

        /* JADX INFO: renamed from: i */
        public final String f30145i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ DiskLruCache2 f30146j;

        public c(DiskLruCache2 diskLruCache2, String str) {
            Intrinsics2.m13090f(str, "key");
            this.f30146j = diskLruCache2;
            this.f30145i = str;
            this.f30137a = new long[diskLruCache2.f30121K];
            this.f30138b = new ArrayList();
            this.f30139c = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i = diskLruCache2.f30121K;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.f30138b.add(new File(diskLruCache2.f30119I, sb.toString()));
                sb.append(".tmp");
                this.f30139c.add(new File(diskLruCache2.f30119I, sb.toString()));
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: a */
        public final d m13412a() {
            DiskLruCache2 diskLruCache2 = this.f30146j;
            byte[] bArr = Util9.f30070a;
            if (!this.f30140d) {
                return null;
            }
            if (!diskLruCache2.f30131z && (this.f30142f != null || this.f30141e)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f30137a.clone();
            try {
                int i = this.f30146j.f30121K;
                for (int i2 = 0; i2 < i; i2++) {
                    Source sourceMo13582a = this.f30146j.f30118H.mo13582a(this.f30138b.get(i2));
                    if (!this.f30146j.f30131z) {
                        this.f30143g++;
                        sourceMo13582a = new DiskLruCache3(this, sourceMo13582a, sourceMo13582a);
                    }
                    arrayList.add(sourceMo13582a);
                }
                return new d(this.f30146j, this.f30145i, this.f30144h, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util9.m13364d((Source) it.next());
                }
                try {
                    this.f30146j.m13403f0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m13413b(BufferedSink bufferedSink) throws IOException {
            Intrinsics2.m13090f(bufferedSink, "writer");
            for (long j2 : this.f30137a) {
                bufferedSink.mo13761z(32).mo13760y0(j2);
            }
        }
    }

    /* JADX INFO: renamed from: g1.j0.e.e$d */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class d implements Closeable {

        /* JADX INFO: renamed from: f */
        public final String f30147f;

        /* JADX INFO: renamed from: g */
        public final long f30148g;

        /* JADX INFO: renamed from: h */
        public final List<Source> f30149h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ DiskLruCache2 f30150i;

        /* JADX WARN: Multi-variable type inference failed */
        public d(DiskLruCache2 diskLruCache2, String str, long j2, List<? extends Source> list, long[] jArr) {
            Intrinsics2.m13090f(str, "key");
            Intrinsics2.m13090f(list, "sources");
            Intrinsics2.m13090f(jArr, "lengths");
            this.f30150i = diskLruCache2;
            this.f30147f = str;
            this.f30148g = j2;
            this.f30149h = list;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<Source> it = this.f30149h.iterator();
            while (it.hasNext()) {
                Util9.m13364d(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: g1.j0.e.e$e */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    public static final class e extends Task2 {
        public e(String str) {
            super(str, false, 2, null);
        }

        @Override // p509g1.p510j0.p513f.Task2
        /* JADX INFO: renamed from: a */
        public long mo13414a() {
            synchronized (DiskLruCache2.this) {
                try {
                    DiskLruCache2 diskLruCache2 = DiskLruCache2.this;
                    if (!diskLruCache2.f30111A || diskLruCache2.f30112B) {
                        return -1L;
                    }
                    try {
                        diskLruCache2.m13404g0();
                    } catch (IOException unused) {
                        DiskLruCache2.this.f30113C = true;
                    }
                    try {
                        if (DiskLruCache2.this.m13394B()) {
                            DiskLruCache2.this.m13400b0();
                            DiskLruCache2.this.f30129x = 0;
                        }
                    } catch (IOException unused2) {
                        DiskLruCache2 diskLruCache3 = DiskLruCache2.this;
                        diskLruCache3.f30114D = true;
                        Okio okio = new Okio();
                        Intrinsics2.m13090f(okio, "$this$buffer");
                        diskLruCache3.f30127v = new RealBufferedSink(okio);
                    }
                    return -1L;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g1.j0.e.e$f */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    public static final class f extends Lambda implements InterfaceC6164l<IOException, Unit> {
        public f() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(IOException iOException) {
            Intrinsics2.m13090f(iOException, "it");
            DiskLruCache2 diskLruCache2 = DiskLruCache2.this;
            byte[] bArr = Util9.f30070a;
            diskLruCache2.f30130y = true;
            return Unit.f29502a;
        }
    }

    static {
        new a(null);
        f30100f = "journal";
        f30101g = "journal.tmp";
        f30102h = "journal.bkp";
        f30103i = "libcore.io.DiskLruCache";
        f30104j = "1";
        f30105k = -1L;
        f30106l = new Regex2("[a-z0-9_-]{1,120}");
        f30107m = "CLEAN";
        f30108n = "DIRTY";
        f30109o = "REMOVE";
        f30110p = "READ";
    }

    public DiskLruCache2(FileSystem2 fileSystem2, File file, int i, int i2, long j2, TaskRunner taskRunner) {
        Intrinsics2.m13090f(fileSystem2, "fileSystem");
        Intrinsics2.m13090f(file, "directory");
        Intrinsics2.m13090f(taskRunner, "taskRunner");
        this.f30118H = fileSystem2;
        this.f30119I = file;
        this.f30120J = i;
        this.f30121K = i2;
        this.f30122q = j2;
        this.f30128w = new LinkedHashMap<>(0, 0.75f, true);
        this.f30116F = taskRunner.m13427f();
        this.f30117G = new e(outline.m1550A(new StringBuilder(), Util9.f30076g, " Cache"));
        if (!(j2 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.f30123r = new File(file, f30100f);
        this.f30124s = new File(file, f30101g);
        this.f30125t = new File(file, f30102h);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m13394B() {
        int i = this.f30129x;
        return i >= 2000 && i >= this.f30128w.size();
    }

    /* JADX INFO: renamed from: D */
    public final BufferedSink m13395D() throws FileNotFoundException {
        FaultHidingSink faultHidingSink = new FaultHidingSink(this.f30118H.mo13588g(this.f30123r), new f());
        Intrinsics2.m13090f(faultHidingSink, "$this$buffer");
        return new RealBufferedSink(faultHidingSink);
    }

    /* JADX INFO: renamed from: H */
    public final void m13396H() throws IOException {
        this.f30118H.mo13587f(this.f30124s);
        Iterator<c> it = this.f30128w.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            Intrinsics2.m13086b(next, "i.next()");
            c cVar = next;
            int i = 0;
            if (cVar.f30142f == null) {
                int i2 = this.f30121K;
                while (i < i2) {
                    this.f30126u += cVar.f30137a[i];
                    i++;
                }
            } else {
                cVar.f30142f = null;
                int i3 = this.f30121K;
                while (i < i3) {
                    this.f30118H.mo13587f(cVar.f30138b.get(i));
                    this.f30118H.mo13587f(cVar.f30139c.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m13397O() throws IOException {
        BufferedSource bufferedSourceM14083e = SkuDao.a.m14083e(this.f30118H.mo13582a(this.f30123r));
        try {
            String strMo13741e0 = bufferedSourceM14083e.mo13741e0();
            String strMo13741e1 = bufferedSourceM14083e.mo13741e0();
            String strMo13741e2 = bufferedSourceM14083e.mo13741e0();
            String strMo13741e3 = bufferedSourceM14083e.mo13741e0();
            String strMo13741e4 = bufferedSourceM14083e.mo13741e0();
            if (!(!Intrinsics2.m13085a(f30103i, strMo13741e0)) && !(!Intrinsics2.m13085a(f30104j, strMo13741e1)) && !(!Intrinsics2.m13085a(String.valueOf(this.f30120J), strMo13741e2)) && !(!Intrinsics2.m13085a(String.valueOf(this.f30121K), strMo13741e3))) {
                int i = 0;
                if (!(strMo13741e4.length() > 0)) {
                    while (true) {
                        try {
                            m13398R(bufferedSourceM14083e.mo13741e0());
                            i++;
                        } catch (EOFException unused) {
                            this.f30129x = i - this.f30128w.size();
                            if (bufferedSourceM14083e.mo13759y()) {
                                this.f30127v = m13395D();
                            } else {
                                m13400b0();
                            }
                            C5729a.m12455j(bufferedSourceM14083e, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strMo13741e0 + ", " + strMo13741e1 + ", " + strMo13741e3 + ", " + strMo13741e4 + ']');
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5729a.m12455j(bufferedSourceM14083e, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m13398R(String str) throws IOException {
        String strSubstring;
        int iM13011u = Strings5.m13011u(str, ' ', 0, false, 6);
        if (iM13011u == -1) {
            throw new IOException(outline.m1599u("unexpected journal line: ", str));
        }
        int i = iM13011u + 1;
        int iM13011u2 = Strings5.m13011u(str, ' ', i, false, 4);
        if (iM13011u2 == -1) {
            strSubstring = str.substring(i);
            Intrinsics2.m13086b(strSubstring, "(this as java.lang.String).substring(startIndex)");
            String str2 = f30109o;
            if (iM13011u == str2.length() && StringsJVM.m12997n(str, str2, false, 2)) {
                this.f30128w.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM13011u2);
            Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        c cVar = this.f30128w.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.f30128w.put(strSubstring, cVar);
        }
        if (iM13011u2 != -1) {
            String str3 = f30107m;
            if (iM13011u == str3.length() && StringsJVM.m12997n(str, str3, false, 2)) {
                String strSubstring2 = str.substring(iM13011u2 + 1);
                Intrinsics2.m13086b(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                List listM13001D = Strings5.m13001D(strSubstring2, new char[]{' '}, false, 0, 6);
                cVar.f30140d = true;
                cVar.f30142f = null;
                Intrinsics2.m13090f(listM13001D, "strings");
                if (listM13001D.size() != cVar.f30146j.f30121K) {
                    throw new IOException("unexpected journal line: " + listM13001D);
                }
                try {
                    int size = listM13001D.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        cVar.f30137a[i2] = Long.parseLong((String) listM13001D.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + listM13001D);
                }
            }
        }
        if (iM13011u2 == -1) {
            String str4 = f30108n;
            if (iM13011u == str4.length() && StringsJVM.m12997n(str, str4, false, 2)) {
                cVar.f30142f = new b(this, cVar);
                return;
            }
        }
        if (iM13011u2 == -1) {
            String str5 = f30110p;
            if (iM13011u == str5.length() && StringsJVM.m12997n(str, str5, false, 2)) {
                return;
            }
        }
        throw new IOException(outline.m1599u("unexpected journal line: ", str));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m13399a() {
        if (!(!this.f30112B)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final synchronized void m13400b0() throws IOException {
        BufferedSink bufferedSink = this.f30127v;
        if (bufferedSink != null) {
            bufferedSink.close();
        }
        BufferedSink bufferedSinkM14081d = SkuDao.a.m14081d(this.f30118H.mo13583b(this.f30124s));
        try {
            bufferedSinkM14081d.mo13728P(f30103i).mo13761z(10);
            bufferedSinkM14081d.mo13728P(f30104j).mo13761z(10);
            bufferedSinkM14081d.mo13760y0(this.f30120J);
            bufferedSinkM14081d.mo13761z(10);
            bufferedSinkM14081d.mo13760y0(this.f30121K);
            bufferedSinkM14081d.mo13761z(10);
            bufferedSinkM14081d.mo13761z(10);
            for (c cVar : this.f30128w.values()) {
                if (cVar.f30142f != null) {
                    bufferedSinkM14081d.mo13728P(f30108n).mo13761z(32);
                    bufferedSinkM14081d.mo13728P(cVar.f30145i);
                    bufferedSinkM14081d.mo13761z(10);
                } else {
                    bufferedSinkM14081d.mo13728P(f30107m).mo13761z(32);
                    bufferedSinkM14081d.mo13728P(cVar.f30145i);
                    cVar.m13413b(bufferedSinkM14081d);
                    bufferedSinkM14081d.mo13761z(10);
                }
            }
            C5729a.m12455j(bufferedSinkM14081d, null);
            if (this.f30118H.mo13585d(this.f30123r)) {
                this.f30118H.mo13586e(this.f30123r, this.f30125t);
            }
            this.f30118H.mo13586e(this.f30124s, this.f30123r);
            this.f30118H.mo13587f(this.f30125t);
            this.f30127v = m13395D();
            this.f30130y = false;
            this.f30114D = false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5729a.m12455j(bufferedSinkM14081d, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m13401c(b bVar, boolean z) throws IOException {
        Intrinsics2.m13090f(bVar, "editor");
        c cVar = bVar.f30134c;
        if (!Intrinsics2.m13085a(cVar.f30142f, bVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z && !cVar.f30140d) {
            int i = this.f30121K;
            for (int i2 = 0; i2 < i; i2++) {
                boolean[] zArr = bVar.f30132a;
                if (zArr == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                if (!zArr[i2]) {
                    bVar.m13408a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!this.f30118H.mo13585d(cVar.f30139c.get(i2))) {
                    bVar.m13408a();
                    return;
                }
            }
        }
        int i3 = this.f30121K;
        for (int i4 = 0; i4 < i3; i4++) {
            File file = cVar.f30139c.get(i4);
            if (!z || cVar.f30141e) {
                this.f30118H.mo13587f(file);
            } else if (this.f30118H.mo13585d(file)) {
                File file2 = cVar.f30138b.get(i4);
                this.f30118H.mo13586e(file, file2);
                long j2 = cVar.f30137a[i4];
                long jMo13589h = this.f30118H.mo13589h(file2);
                cVar.f30137a[i4] = jMo13589h;
                this.f30126u = (this.f30126u - j2) + jMo13589h;
            }
        }
        cVar.f30142f = null;
        if (cVar.f30141e) {
            m13403f0(cVar);
            return;
        }
        this.f30129x++;
        BufferedSink bufferedSink = this.f30127v;
        if (bufferedSink == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        if (cVar.f30140d || z) {
            cVar.f30140d = true;
            bufferedSink.mo13728P(f30107m).mo13761z(32);
            bufferedSink.mo13728P(cVar.f30145i);
            cVar.m13413b(bufferedSink);
            bufferedSink.mo13761z(10);
            if (z) {
                long j3 = this.f30115E;
                this.f30115E = 1 + j3;
                cVar.f30144h = j3;
            }
        } else {
            this.f30128w.remove(cVar.f30145i);
            bufferedSink.mo13728P(f30109o).mo13761z(32);
            bufferedSink.mo13728P(cVar.f30145i);
            bufferedSink.mo13761z(10);
        }
        bufferedSink.flush();
        if (this.f30126u > this.f30122q || m13394B()) {
            TaskQueue2.m13416d(this.f30116F, this.f30117G, 0L, 2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f30111A && !this.f30112B) {
            Collection<c> collectionValues = this.f30128w.values();
            Intrinsics2.m13086b(collectionValues, "lruEntries.values");
            Object[] array = collectionValues.toArray(new c[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            for (c cVar : (c[]) array) {
                b bVar = cVar.f30142f;
                if (bVar != null && bVar != null) {
                    bVar.m13410c();
                }
            }
            m13404g0();
            BufferedSink bufferedSink = this.f30127v;
            if (bufferedSink == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            bufferedSink.close();
            this.f30127v = null;
            this.f30112B = true;
            return;
        }
        this.f30112B = true;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized b m13402f(String str, long j2) throws IOException {
        Intrinsics2.m13090f(str, "key");
        m13407u();
        m13399a();
        m13406n0(str);
        c cVar = this.f30128w.get(str);
        if (j2 != f30105k && (cVar == null || cVar.f30144h != j2)) {
            return null;
        }
        if ((cVar != null ? cVar.f30142f : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f30143g != 0) {
            return null;
        }
        if (!this.f30113C && !this.f30114D) {
            BufferedSink bufferedSink = this.f30127v;
            if (bufferedSink == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            bufferedSink.mo13728P(f30108n).mo13761z(32).mo13728P(str).mo13761z(10);
            bufferedSink.flush();
            if (this.f30130y) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, str);
                this.f30128w.put(str, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.f30142f = bVar;
            return bVar;
        }
        TaskQueue2.m13416d(this.f30116F, this.f30117G, 0L, 2);
        return null;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m13403f0(c cVar) throws IOException {
        BufferedSink bufferedSink;
        Intrinsics2.m13090f(cVar, "entry");
        if (!this.f30131z) {
            if (cVar.f30143g > 0 && (bufferedSink = this.f30127v) != null) {
                bufferedSink.mo13728P(f30108n);
                bufferedSink.mo13761z(32);
                bufferedSink.mo13728P(cVar.f30145i);
                bufferedSink.mo13761z(10);
                bufferedSink.flush();
            }
            if (cVar.f30143g > 0 || cVar.f30142f != null) {
                cVar.f30141e = true;
                return true;
            }
        }
        b bVar = cVar.f30142f;
        if (bVar != null) {
            bVar.m13410c();
        }
        int i = this.f30121K;
        for (int i2 = 0; i2 < i; i2++) {
            this.f30118H.mo13587f(cVar.f30138b.get(i2));
            long j2 = this.f30126u;
            long[] jArr = cVar.f30137a;
            this.f30126u = j2 - jArr[i2];
            jArr[i2] = 0;
        }
        this.f30129x++;
        BufferedSink bufferedSink2 = this.f30127v;
        if (bufferedSink2 != null) {
            bufferedSink2.mo13728P(f30109o);
            bufferedSink2.mo13761z(32);
            bufferedSink2.mo13728P(cVar.f30145i);
            bufferedSink2.mo13761z(10);
        }
        this.f30128w.remove(cVar.f30145i);
        if (m13394B()) {
            TaskQueue2.m13416d(this.f30116F, this.f30117G, 0L, 2);
        }
        return true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f30111A) {
            m13399a();
            m13404g0();
            BufferedSink bufferedSink = this.f30127v;
            if (bufferedSink != null) {
                bufferedSink.flush();
            } else {
                Intrinsics2.m13095k();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m13404g0() throws IOException {
        boolean z;
        do {
            z = false;
            if (this.f30126u <= this.f30122q) {
                this.f30113C = false;
                return;
            }
            for (c cVar : this.f30128w.values()) {
                if (!cVar.f30141e) {
                    Intrinsics2.m13086b(cVar, "toEvict");
                    m13403f0(cVar);
                    z = true;
                    break;
                }
            }
        } while (z);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized d m13405h(String str) throws IOException {
        Intrinsics2.m13090f(str, "key");
        m13407u();
        m13399a();
        m13406n0(str);
        c cVar = this.f30128w.get(str);
        if (cVar == null) {
            return null;
        }
        Intrinsics2.m13086b(cVar, "lruEntries[key] ?: return null");
        d dVarM13412a = cVar.m13412a();
        if (dVarM13412a == null) {
            return null;
        }
        this.f30129x++;
        BufferedSink bufferedSink = this.f30127v;
        if (bufferedSink == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        bufferedSink.mo13728P(f30110p).mo13761z(32).mo13728P(str).mo13761z(10);
        if (m13394B()) {
            TaskQueue2.m13416d(this.f30116F, this.f30117G, 0L, 2);
        }
        return dVarM13412a;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m13406n0(String str) {
        if (f30106l.m12982a(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m13407u() throws IOException {
        boolean z;
        byte[] bArr = Util9.f30070a;
        if (this.f30111A) {
            return;
        }
        if (this.f30118H.mo13585d(this.f30125t)) {
            if (this.f30118H.mo13585d(this.f30123r)) {
                this.f30118H.mo13587f(this.f30125t);
            } else {
                this.f30118H.mo13586e(this.f30125t, this.f30123r);
            }
        }
        FileSystem2 fileSystem2 = this.f30118H;
        File file = this.f30125t;
        Intrinsics2.m13090f(fileSystem2, "$this$isCivilized");
        Intrinsics2.m13090f(file, "file");
        Sink sinkMo13583b = fileSystem2.mo13583b(file);
        try {
            try {
                fileSystem2.mo13587f(file);
                C5729a.m12455j(sinkMo13583b, null);
                z = true;
            } catch (IOException unused) {
                C5729a.m12455j(sinkMo13583b, null);
                fileSystem2.mo13587f(file);
                z = false;
            }
            this.f30131z = z;
            if (this.f30118H.mo13585d(this.f30123r)) {
                try {
                    m13397O();
                    m13396H();
                    this.f30111A = true;
                    return;
                } catch (IOException e2) {
                    Objects.requireNonNull(Platform.f30547c);
                    Platform.f30545a.m13605i("DiskLruCache " + this.f30119I + " is corrupt: " + e2.getMessage() + ", removing", 5, e2);
                    try {
                        close();
                        this.f30118H.mo13584c(this.f30119I);
                        this.f30112B = false;
                        m13400b0();
                        this.f30111A = true;
                    } catch (Throwable th) {
                        this.f30112B = false;
                        throw th;
                    }
                }
            }
            m13400b0();
            this.f30111A = true;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C5729a.m12455j(sinkMo13583b, th2);
                throw th3;
            }
        }
    }
}
