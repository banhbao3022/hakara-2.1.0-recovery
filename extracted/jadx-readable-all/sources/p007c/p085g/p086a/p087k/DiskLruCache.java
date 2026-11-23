package p007c.p085g.p086a.p087k;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.g.a.k.a, reason: use source file name */
/* JADX INFO: compiled from: DiskLruCache.java */
/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache implements Closeable {

    /* JADX INFO: renamed from: f */
    public final File f2932f;

    /* JADX INFO: renamed from: g */
    public final File f2933g;

    /* JADX INFO: renamed from: h */
    public final File f2934h;

    /* JADX INFO: renamed from: i */
    public final File f2935i;

    /* JADX INFO: renamed from: j */
    public final int f2936j;

    /* JADX INFO: renamed from: k */
    public long f2937k;

    /* JADX INFO: renamed from: l */
    public final int f2938l;

    /* JADX INFO: renamed from: n */
    public Writer f2940n;

    /* JADX INFO: renamed from: p */
    public int f2942p;

    /* JADX INFO: renamed from: m */
    public long f2939m = 0;

    /* JADX INFO: renamed from: o */
    public final LinkedHashMap<String, d> f2941o = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: q */
    public long f2943q = 0;

    /* JADX INFO: renamed from: r */
    public final ThreadPoolExecutor f2944r = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: s */
    public final Callable<Void> f2945s = new a();

    /* JADX INFO: renamed from: c.g.a.k.a$a */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (DiskLruCache.this) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (diskLruCache.f2940n == null) {
                    return null;
                }
                diskLruCache.m1674t0();
                if (DiskLruCache.this.m1668H()) {
                    DiskLruCache.this.m1673g0();
                    DiskLruCache.this.f2942p = 0;
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: c.g.a.k.a$b */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public static final class b implements ThreadFactory {
        public b(a aVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* JADX INFO: renamed from: c.g.a.k.a$c */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final d f2947a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f2948b;

        /* JADX INFO: renamed from: c */
        public boolean f2949c;

        public c(d dVar, a aVar) {
            this.f2947a = dVar;
            this.f2948b = dVar.f2955e ? null : new boolean[DiskLruCache.this.f2938l];
        }

        /* JADX INFO: renamed from: a */
        public void m1676a() throws IOException {
            DiskLruCache.m1663a(DiskLruCache.this, this, false);
        }

        /* JADX INFO: renamed from: b */
        public File m1677b(int i) throws IOException {
            File file;
            synchronized (DiskLruCache.this) {
                d dVar = this.f2947a;
                if (dVar.f2956f != this) {
                    throw new IllegalStateException();
                }
                if (!dVar.f2955e) {
                    this.f2948b[i] = true;
                }
                file = dVar.f2954d[i];
                if (!DiskLruCache.this.f2932f.exists()) {
                    DiskLruCache.this.f2932f.mkdirs();
                }
            }
            return file;
        }
    }

    /* JADX INFO: renamed from: c.g.a.k.a$d */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class d {

        /* JADX INFO: renamed from: a */
        public final String f2951a;

        /* JADX INFO: renamed from: b */
        public final long[] f2952b;

        /* JADX INFO: renamed from: c */
        public File[] f2953c;

        /* JADX INFO: renamed from: d */
        public File[] f2954d;

        /* JADX INFO: renamed from: e */
        public boolean f2955e;

        /* JADX INFO: renamed from: f */
        public c f2956f;

        /* JADX INFO: renamed from: g */
        public long f2957g;

        public d(String str, a aVar) {
            this.f2951a = str;
            int i = DiskLruCache.this.f2938l;
            this.f2952b = new long[i];
            this.f2953c = new File[i];
            this.f2954d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < DiskLruCache.this.f2938l; i2++) {
                sb.append(i2);
                this.f2953c[i2] = new File(DiskLruCache.this.f2932f, sb.toString());
                sb.append(".tmp");
                this.f2954d[i2] = new File(DiskLruCache.this.f2932f, sb.toString());
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: a */
        public String m1678a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.f2952b) {
                sb.append(' ');
                sb.append(j2);
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: b */
        public final IOException m1679b(String[] strArr) throws IOException {
            StringBuilder sbM1556G = outline.m1556G("unexpected journal line: ");
            sbM1556G.append(Arrays.toString(strArr));
            throw new IOException(sbM1556G.toString());
        }
    }

    /* JADX INFO: renamed from: c.g.a.k.a$e */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class e {

        /* JADX INFO: renamed from: a */
        public final File[] f2959a;

        public e(DiskLruCache diskLruCache, String str, long j2, File[] fileArr, long[] jArr, a aVar) {
            this.f2959a = fileArr;
        }
    }

    public DiskLruCache(File file, int i, int i2, long j2) {
        this.f2932f = file;
        this.f2936j = i;
        this.f2933g = new File(file, "journal");
        this.f2934h = new File(file, "journal.tmp");
        this.f2935i = new File(file, "journal.bkp");
        this.f2938l = i2;
        this.f2937k = j2;
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: B */
    public static void m1661B(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: O */
    public static DiskLruCache m1662O(File file, int i, int i2, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m1666n0(file2, file3, false);
            }
        }
        DiskLruCache diskLruCache = new DiskLruCache(file, i, i2, j2);
        if (diskLruCache.f2933g.exists()) {
            try {
                diskLruCache.m1670b0();
                diskLruCache.m1669R();
                return diskLruCache;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                diskLruCache.close();
                Util3.m1682a(diskLruCache.f2932f);
            }
        }
        file.mkdirs();
        DiskLruCache diskLruCache2 = new DiskLruCache(file, i, i2, j2);
        diskLruCache2.m1673g0();
        return diskLruCache2;
    }

    /* JADX INFO: renamed from: a */
    public static void m1663a(DiskLruCache diskLruCache, c cVar, boolean z) throws IOException {
        synchronized (diskLruCache) {
            d dVar = cVar.f2947a;
            if (dVar.f2956f != cVar) {
                throw new IllegalStateException();
            }
            if (z && !dVar.f2955e) {
                for (int i = 0; i < diskLruCache.f2938l; i++) {
                    if (!cVar.f2948b[i]) {
                        cVar.m1676a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!dVar.f2954d[i].exists()) {
                        cVar.m1676a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < diskLruCache.f2938l; i2++) {
                File file = dVar.f2954d[i2];
                if (!z) {
                    m1665h(file);
                } else if (file.exists()) {
                    File file2 = dVar.f2953c[i2];
                    file.renameTo(file2);
                    long j2 = dVar.f2952b[i2];
                    long length = file2.length();
                    dVar.f2952b[i2] = length;
                    diskLruCache.f2939m = (diskLruCache.f2939m - j2) + length;
                }
            }
            diskLruCache.f2942p++;
            dVar.f2956f = null;
            if (dVar.f2955e || z) {
                dVar.f2955e = true;
                diskLruCache.f2940n.append((CharSequence) "CLEAN");
                diskLruCache.f2940n.append(' ');
                diskLruCache.f2940n.append((CharSequence) dVar.f2951a);
                diskLruCache.f2940n.append((CharSequence) dVar.m1678a());
                diskLruCache.f2940n.append('\n');
                if (z) {
                    long j3 = diskLruCache.f2943q;
                    diskLruCache.f2943q = 1 + j3;
                    dVar.f2957g = j3;
                }
            } else {
                diskLruCache.f2941o.remove(dVar.f2951a);
                diskLruCache.f2940n.append((CharSequence) "REMOVE");
                diskLruCache.f2940n.append(' ');
                diskLruCache.f2940n.append((CharSequence) dVar.f2951a);
                diskLruCache.f2940n.append('\n');
            }
            m1661B(diskLruCache.f2940n);
            if (diskLruCache.f2939m > diskLruCache.f2937k || diskLruCache.m1668H()) {
                diskLruCache.f2944r.submit(diskLruCache.f2945s);
            }
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: f */
    public static void m1664f(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m1665h(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m1666n0(File file, File file2, boolean z) throws IOException {
        if (z) {
            m1665h(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: D */
    public synchronized e m1667D(String str) throws IOException {
        m1671c();
        d dVar = this.f2941o.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f2955e) {
            return null;
        }
        for (File file : dVar.f2953c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f2942p++;
        this.f2940n.append((CharSequence) "READ");
        this.f2940n.append(' ');
        this.f2940n.append((CharSequence) str);
        this.f2940n.append('\n');
        if (m1668H()) {
            this.f2944r.submit(this.f2945s);
        }
        return new e(this, str, dVar.f2957g, dVar.f2953c, dVar.f2952b, null);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m1668H() {
        int i = this.f2942p;
        return i >= 2000 && i >= this.f2941o.size();
    }

    /* JADX INFO: renamed from: R */
    public final void m1669R() throws IOException {
        m1665h(this.f2934h);
        Iterator<d> it = this.f2941o.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.f2956f == null) {
                while (i < this.f2938l) {
                    this.f2939m += next.f2952b[i];
                    i++;
                }
            } else {
                next.f2956f = null;
                while (i < this.f2938l) {
                    m1665h(next.f2953c[i]);
                    m1665h(next.f2954d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m1670b0() throws IOException {
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.f2933g), Util3.f2966a);
        try {
            String strM1681c = strictLineReader.m1681c();
            String strM1681c2 = strictLineReader.m1681c();
            String strM1681c3 = strictLineReader.m1681c();
            String strM1681c4 = strictLineReader.m1681c();
            String strM1681c5 = strictLineReader.m1681c();
            if (!"libcore.io.DiskLruCache".equals(strM1681c) || !"1".equals(strM1681c2) || !Integer.toString(this.f2936j).equals(strM1681c3) || !Integer.toString(this.f2938l).equals(strM1681c4) || !"".equals(strM1681c5)) {
                throw new IOException("unexpected journal header: [" + strM1681c + ", " + strM1681c2 + ", " + strM1681c4 + ", " + strM1681c5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m1672f0(strictLineReader.m1681c());
                    i++;
                } catch (EOFException unused) {
                    this.f2942p = i - this.f2941o.size();
                    if (strictLineReader.f2964j == -1) {
                        m1673g0();
                    } else {
                        this.f2940n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2933g, true), Util3.f2966a));
                    }
                    try {
                        strictLineReader.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                strictLineReader.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1671c() {
        if (this.f2940n == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f2940n == null) {
            return;
        }
        Iterator it = new ArrayList(this.f2941o.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f2956f;
            if (cVar != null) {
                cVar.m1676a();
            }
        }
        m1674t0();
        m1664f(this.f2940n);
        this.f2940n = null;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m1672f0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException(outline.m1599u("unexpected journal line: ", str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f2941o.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = this.f2941o.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring, null);
            this.f2941o.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f2956f = new c(dVar, null);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException(outline.m1599u("unexpected journal line: ", str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.f2955e = true;
        dVar.f2956f = null;
        if (strArrSplit.length != DiskLruCache.this.f2938l) {
            dVar.m1679b(strArrSplit);
            throw null;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                dVar.f2952b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                dVar.m1679b(strArrSplit);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final synchronized void m1673g0() throws IOException {
        try {
            Writer writer = this.f2940n;
            if (writer != null) {
                m1664f(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2934h), Util3.f2966a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f2936j));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f2938l));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f2941o.values()) {
                    if (dVar.f2956f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f2951a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f2951a + dVar.m1678a() + '\n');
                    }
                }
                m1664f(bufferedWriter);
                if (this.f2933g.exists()) {
                    m1666n0(this.f2933g, this.f2935i, true);
                }
                m1666n0(this.f2934h, this.f2933g, false);
                this.f2935i.delete();
                this.f2940n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2933g, true), Util3.f2966a));
            } catch (Throwable th) {
                m1664f(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m1674t0() throws IOException {
        while (this.f2939m > this.f2937k) {
            String key = this.f2941o.entrySet().iterator().next().getKey();
            synchronized (this) {
                m1671c();
                d dVar = this.f2941o.get(key);
                if (dVar != null && dVar.f2956f == null) {
                    for (int i = 0; i < this.f2938l; i++) {
                        File file = dVar.f2953c[i];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j2 = this.f2939m;
                        long[] jArr = dVar.f2952b;
                        this.f2939m = j2 - jArr[i];
                        jArr[i] = 0;
                    }
                    this.f2942p++;
                    this.f2940n.append((CharSequence) "REMOVE");
                    this.f2940n.append(' ');
                    this.f2940n.append((CharSequence) key);
                    this.f2940n.append('\n');
                    this.f2941o.remove(key);
                    if (m1668H()) {
                        this.f2944r.submit(this.f2945s);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public c m1675u(String str) throws IOException {
        synchronized (this) {
            m1671c();
            d dVar = this.f2941o.get(str);
            if (dVar == null) {
                dVar = new d(str, null);
                this.f2941o.put(str, dVar);
            } else if (dVar.f2956f != null) {
                return null;
            }
            c cVar = new c(dVar, null);
            dVar.f2956f = cVar;
            this.f2940n.append((CharSequence) "DIRTY");
            this.f2940n.append(' ');
            this.f2940n.append((CharSequence) str);
            this.f2940n.append('\n');
            m1661B(this.f2940n);
            return cVar;
        }
    }
}
