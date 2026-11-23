package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.stetho.common.Utf8Charset;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: c.n.b.d.j.a.nk */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3328nk implements gk2 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC3290mj f17137c;

    /* JADX INFO: renamed from: a */
    public final Map<String, C3436qh> f17135a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public long f17136b = 0;

    /* JADX INFO: renamed from: d */
    public final int f17138d = 5242880;

    public C3328nk(InterfaceC3290mj interfaceC3290mj, int i) {
        this.f17137c = interfaceC3290mj;
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m7868f(C3326ni c3326ni, long j2) throws IOException {
        long j3 = c3326ni.f17108f - c3326ni.f17109g;
        if (j2 >= 0 && j2 <= j3) {
            int i = (int) j2;
            if (i == j2) {
                byte[] bArr = new byte[i];
                new DataInputStream(c3326ni).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j2);
        sb.append(", maxLength=");
        sb.append(j3);
        throw new IOException(sb.toString());
    }

    /* JADX INFO: renamed from: g */
    public static void m7869g(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: h */
    public static int m7870h(InputStream inputStream) throws IOException {
        return (m7875n(inputStream) << 24) | m7875n(inputStream) | (m7875n(inputStream) << 8) | (m7875n(inputStream) << 16);
    }

    /* JADX INFO: renamed from: i */
    public static void m7871i(OutputStream outputStream, long j2) throws IOException {
        outputStream.write((byte) j2);
        outputStream.write((byte) (j2 >>> 8));
        outputStream.write((byte) (j2 >>> 16));
        outputStream.write((byte) (j2 >>> 24));
        outputStream.write((byte) (j2 >>> 32));
        outputStream.write((byte) (j2 >>> 40));
        outputStream.write((byte) (j2 >>> 48));
        outputStream.write((byte) (j2 >>> 56));
    }

    /* JADX INFO: renamed from: j */
    public static long m7872j(InputStream inputStream) throws IOException {
        return (((long) m7875n(inputStream)) & 255) | ((((long) m7875n(inputStream)) & 255) << 8) | ((((long) m7875n(inputStream)) & 255) << 16) | ((((long) m7875n(inputStream)) & 255) << 24) | ((((long) m7875n(inputStream)) & 255) << 32) | ((((long) m7875n(inputStream)) & 255) << 40) | ((((long) m7875n(inputStream)) & 255) << 48) | ((255 & ((long) m7875n(inputStream))) << 56);
    }

    /* JADX INFO: renamed from: k */
    public static void m7873k(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(Utf8Charset.NAME);
        int length = bytes.length;
        m7871i(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    /* JADX INFO: renamed from: l */
    public static String m7874l(C3326ni c3326ni) throws IOException {
        return new String(m7868f(c3326ni, m7872j(c3326ni)), Utf8Charset.NAME);
    }

    /* JADX INFO: renamed from: n */
    public static int m7875n(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: o */
    public static final String m7876o(String str) {
        int length = str.length() / 2;
        String strValueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String strValueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized hj2 m7877a(String str) {
        C3436qh c3436qh = this.f17135a.get(str);
        if (c3436qh == null) {
            return null;
        }
        File fileM7881e = m7881e(str);
        try {
            C3326ni c3326ni = new C3326ni(new BufferedInputStream(new FileInputStream(fileM7881e)), fileM7881e.length());
            try {
                C3436qh c3436qhM8202a = C3436qh.m8202a(c3326ni);
                if (!TextUtils.equals(str, c3436qhM8202a.f18281b)) {
                    C3282mb.m7681b("%s: key=%s, found=%s", fileM7881e.getAbsolutePath(), str, c3436qhM8202a.f18281b);
                    C3436qh c3436qhRemove = this.f17135a.remove(str);
                    if (c3436qhRemove != null) {
                        this.f17136b -= c3436qhRemove.f18280a;
                    }
                    c3326ni.close();
                    return null;
                }
                byte[] bArrM7868f = m7868f(c3326ni, c3326ni.f17108f - c3326ni.f17109g);
                hj2 hj2Var = new hj2();
                hj2Var.f14877a = bArrM7868f;
                hj2Var.f14878b = c3436qh.f18282c;
                hj2Var.f14879c = c3436qh.f18283d;
                hj2Var.f14880d = c3436qh.f18284e;
                hj2Var.f14881e = c3436qh.f18285f;
                hj2Var.f14882f = c3436qh.f18286g;
                List<tr2> list = c3436qh.f18287h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (tr2 tr2Var : list) {
                    treeMap.put(tr2Var.f19974a, tr2Var.f19975b);
                }
                hj2Var.f14883g = treeMap;
                hj2Var.f14884h = Collections.unmodifiableList(c3436qh.f18287h);
                c3326ni.close();
                return hj2Var;
            } catch (Throwable th) {
                c3326ni.close();
                throw th;
            }
        } catch (IOException e) {
            C3282mb.m7681b("%s: %s", fileM7881e.getAbsolutePath(), e.toString());
            m7880d(str);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7878b(String str, hj2 hj2Var) {
        long j2 = this.f17136b;
        int length = hj2Var.f14877a.length;
        int i = this.f17138d;
        if (j2 + ((long) length) > i && length > i * 0.9f) {
            return;
        }
        File fileM7881e = m7881e(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileM7881e));
            C3436qh c3436qh = new C3436qh(str, hj2Var);
            try {
                m7869g(bufferedOutputStream, 538247942);
                m7873k(bufferedOutputStream, str);
                String str2 = c3436qh.f18282c;
                if (str2 == null) {
                    str2 = "";
                }
                m7873k(bufferedOutputStream, str2);
                m7871i(bufferedOutputStream, c3436qh.f18283d);
                m7871i(bufferedOutputStream, c3436qh.f18284e);
                m7871i(bufferedOutputStream, c3436qh.f18285f);
                m7871i(bufferedOutputStream, c3436qh.f18286g);
                List<tr2> list = c3436qh.f18287h;
                if (list != null) {
                    m7869g(bufferedOutputStream, list.size());
                    for (tr2 tr2Var : list) {
                        m7873k(bufferedOutputStream, tr2Var.f19974a);
                        m7873k(bufferedOutputStream, tr2Var.f19975b);
                    }
                } else {
                    m7869g(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.write(hj2Var.f14877a);
                bufferedOutputStream.close();
                c3436qh.f18280a = fileM7881e.length();
                m7882m(str, c3436qh);
                if (this.f17136b >= this.f17138d) {
                    if (C3282mb.f16709a) {
                        C3282mb.m7680a("Pruning old cache entries.", new Object[0]);
                    }
                    long j3 = this.f17136b;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator<Map.Entry<String, C3436qh>> it = this.f17135a.entrySet().iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            jElapsedRealtime = jElapsedRealtime;
                            break;
                        }
                        C3436qh value = it.next().getValue();
                        if (m7881e(value.f18281b).delete()) {
                            this.f17136b -= value.f18280a;
                        } else {
                            String str3 = value.f18281b;
                            C3282mb.m7681b("Could not delete cache entry for key=%s, filename=%s", str3, m7876o(str3));
                        }
                        it.remove();
                        i2++;
                        if (this.f17136b < this.f17138d * 0.9f) {
                            break;
                        } else {
                            jElapsedRealtime = jElapsedRealtime;
                        }
                    }
                    if (C3282mb.f16709a) {
                        C3282mb.m7680a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f17136b - j3), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                    }
                }
            } catch (IOException e) {
                C3282mb.m7681b("%s", e.toString());
                bufferedOutputStream.close();
                C3282mb.m7681b("Failed to write header for %s", fileM7881e.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException unused) {
            if (!fileM7881e.delete()) {
                C3282mb.m7681b("Could not clean up file %s", fileM7881e.getAbsolutePath());
            }
            if (!this.f17137c.zza().exists()) {
                C3282mb.m7681b("Re-initializing cache after external clearing.", new Object[0]);
                this.f17135a.clear();
                this.f17136b = 0L;
                m7879c();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7879c() {
        try {
            File fileZza = this.f17137c.zza();
            if (!fileZza.exists()) {
                if (fileZza.mkdirs()) {
                    return;
                }
                C3282mb.m7682c("Unable to create cache dir %s", fileZza.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                try {
                    long length = file.length();
                    C3326ni c3326ni = new C3326ni(new BufferedInputStream(new FileInputStream(file)), length);
                    try {
                        C3436qh c3436qhM8202a = C3436qh.m8202a(c3326ni);
                        c3436qhM8202a.f18280a = length;
                        m7882m(c3436qhM8202a.f18281b, c3436qhM8202a);
                        c3326ni.close();
                    } catch (Throwable th) {
                        c3326ni.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m7880d(String str) {
        boolean zDelete = m7881e(str).delete();
        C3436qh c3436qhRemove = this.f17135a.remove(str);
        if (c3436qhRemove != null) {
            this.f17136b -= c3436qhRemove.f18280a;
        }
        if (zDelete) {
            return;
        }
        C3282mb.m7681b("Could not delete cache entry for key=%s, filename=%s", str, m7876o(str));
    }

    /* JADX INFO: renamed from: e */
    public final File m7881e(String str) {
        return new File(this.f17137c.zza(), m7876o(str));
    }

    /* JADX INFO: renamed from: m */
    public final void m7882m(String str, C3436qh c3436qh) {
        if (this.f17135a.containsKey(str)) {
            this.f17136b = (c3436qh.f18280a - this.f17135a.get(str).f18280a) + this.f17136b;
        } else {
            this.f17136b += c3436qh.f18280a;
        }
        this.f17135a.put(str, c3436qh);
    }

    public C3328nk(File file, int i) {
        this.f17137c = new C3472rg(file);
    }
}
