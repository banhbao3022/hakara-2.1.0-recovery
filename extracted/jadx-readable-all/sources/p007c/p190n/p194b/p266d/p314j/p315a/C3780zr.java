package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2281m0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: renamed from: c.n.b.d.j.a.zr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3780zr extends AbstractC3669wr {

    /* JADX INFO: renamed from: i */
    public static final Set<String> f22390i = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: j */
    public static final DecimalFormat f22391j = new DecimalFormat("#,###");

    /* JADX INFO: renamed from: k */
    public File f22392k;

    /* JADX INFO: renamed from: l */
    public boolean f22393l;

    public C3780zr(InterfaceC3704xp interfaceC3704xp) {
        super(interfaceC3704xp);
        File cacheDir = this.f21307f.getCacheDir();
        if (cacheDir == null) {
            C2622l.m5226A3("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f22392k = file;
        if (!file.isDirectory() && !this.f22392k.mkdirs()) {
            String strValueOf = String.valueOf(this.f22392k.getAbsolutePath());
            C2622l.m5226A3(strValueOf.length() != 0 ? "Could not create preload cache directory at ".concat(strValueOf) : new String("Could not create preload cache directory at "));
            this.f22392k = null;
        } else {
            if (this.f22392k.setReadable(true, false) && this.f22392k.setExecutable(true, false)) {
                return;
            }
            String strValueOf2 = String.valueOf(this.f22392k.getAbsolutePath());
            C2622l.m5226A3(strValueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(strValueOf2) : new String("Could not set cache file permissions at "));
            this.f22392k = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:184:0x042d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0447  */
    /* JADX WARN: Code duplicated, block: B:191:0x046b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0494  */
    /* JADX WARN: Code duplicated, block: B:198:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:199:0x04af  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: g */
    public final boolean mo5841g(String str) {
        int i;
        String str2;
        String strConcat;
        String strValueOf;
        String str3;
        FileOutputStream fileOutputStream;
        boolean zDelete;
        FileOutputStream fileOutputStream2 = null;
        if (this.f22392k == null) {
            m8669o(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file = this.f22392k;
            if (file == null) {
                i = 0;
            } else {
                i = 0;
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".done")) {
                        i++;
                    }
                }
            }
            AbstractC3718y2<Integer> abstractC3718y2 = C3052g3.f14401n;
            C2862b c2862b = C2862b.f12493a;
            if (i <= ((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue()) {
                File file3 = new File(this.f22392k, C3331nn.m7884b(str));
                File fileM8905q = m8905q(file3);
                if (file3.isFile() && fileM8905q.isFile()) {
                    int length = (int) file3.length();
                    String strValueOf2 = String.valueOf(str);
                    C2622l.m5318U2(strValueOf2.length() != 0 ? "Stream cache hit at ".concat(strValueOf2) : new String("Stream cache hit at "));
                    C3331nn.f17166a.post(new RunnableC3557tr(this, str, file3.getAbsolutePath(), length));
                    return true;
                }
                String strValueOf3 = String.valueOf(this.f22392k.getAbsolutePath());
                String strValueOf4 = String.valueOf(str);
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Set<String> set = f22390i;
                synchronized (set) {
                    if (set.contains(strConcat2)) {
                        String strValueOf5 = String.valueOf(str);
                        C2622l.m5226A3(strValueOf5.length() != 0 ? "Stream cache already in progress at ".concat(strValueOf5) : new String("Stream cache already in progress at "));
                        m8669o(str, file3.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(strConcat2);
                    String str4 = "error";
                    try {
                        HttpURLConnection httpURLConnectionM8518a = new ur1().m8518a(new C3743yr(str), 265);
                        int responseCode = httpURLConnectionM8518a.getResponseCode();
                        if (responseCode >= 400) {
                            str4 = "badUrl";
                            try {
                                String strValueOf6 = String.valueOf(Integer.toString(responseCode));
                                strConcat = strValueOf6.length() != 0 ? "HTTP request failed. Code: ".concat(strValueOf6) : new String("HTTP request failed. Code: ");
                                try {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32);
                                    sb.append("HTTP status code ");
                                    sb.append(responseCode);
                                    sb.append(" at ");
                                    sb.append(str);
                                    throw new IOException(sb.toString());
                                } catch (IOException e) {
                                    e = e;
                                    str2 = strConcat2;
                                    if (e instanceof RuntimeException) {
                                        C2998en c2998en = C2330u.f10884a.f10893h;
                                        C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "VideoStreamFullFileCache.preload");
                                    }
                                    fileOutputStream2.close();
                                    if (this.f22393l) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26);
                                        sb2.append("Preload aborted for URL \"");
                                        sb2.append(str);
                                        sb2.append("\"");
                                        C2622l.m5458x3(sb2.toString());
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 25);
                                        sb3.append("Preload failed for URL \"");
                                        sb3.append(str);
                                        sb3.append("\"");
                                        C2622l.m5241D3(sb3.toString(), e);
                                    }
                                    if (file3.exists()) {
                                        strValueOf = String.valueOf(file3.getAbsolutePath());
                                        if (strValueOf.length() != 0) {
                                            str3 = "Could not delete partial cache file at ".concat(strValueOf);
                                        } else {
                                            str3 = new String("Could not delete partial cache file at ");
                                        }
                                        C2622l.m5226A3(str3);
                                    }
                                    m8669o(str, file3.getAbsolutePath(), str4, strConcat);
                                    f22390i.remove(str2);
                                    return false;
                                } catch (RuntimeException e2) {
                                    e = e2;
                                    str2 = strConcat2;
                                    if (e instanceof RuntimeException) {
                                        C2998en c2998en2 = C2330u.f10884a.f10893h;
                                        C3696xh.m8734c(c2998en2.f13616e, c2998en2.f13617f).mo8736b(e, "VideoStreamFullFileCache.preload");
                                    }
                                    fileOutputStream2.close();
                                    if (this.f22393l) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 26);
                                        sb4.append("Preload aborted for URL \"");
                                        sb4.append(str);
                                        sb4.append("\"");
                                        C2622l.m5458x3(sb4.toString());
                                    } else {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 25);
                                        sb5.append("Preload failed for URL \"");
                                        sb5.append(str);
                                        sb5.append("\"");
                                        C2622l.m5241D3(sb5.toString(), e);
                                    }
                                    if (file3.exists()) {
                                        strValueOf = String.valueOf(file3.getAbsolutePath());
                                        if (strValueOf.length() != 0) {
                                            str3 = "Could not delete partial cache file at ".concat(strValueOf);
                                        } else {
                                            str3 = new String("Could not delete partial cache file at ");
                                        }
                                        C2622l.m5226A3(str3);
                                    }
                                    m8669o(str, file3.getAbsolutePath(), str4, strConcat);
                                    f22390i.remove(str2);
                                    return false;
                                }
                            } catch (IOException | RuntimeException e3) {
                                e = e3;
                                strConcat = null;
                            }
                        } else {
                            int contentLength = httpURLConnectionM8518a.getContentLength();
                            if (contentLength < 0) {
                                String strValueOf7 = String.valueOf(str);
                                C2622l.m5226A3(strValueOf7.length() != 0 ? "Stream cache aborted, missing content-length header at ".concat(strValueOf7) : new String("Stream cache aborted, missing content-length header at "));
                                m8669o(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                                set.remove(strConcat2);
                                return false;
                            }
                            String str5 = f22391j.format(contentLength);
                            int iIntValue = ((Integer) c2862b.f12496d.m6596a(C3052g3.f14408o)).intValue();
                            if (contentLength > iIntValue) {
                                StringBuilder sb6 = new StringBuilder(String.valueOf(str5).length() + 33 + String.valueOf(str).length());
                                sb6.append("Content length ");
                                sb6.append(str5);
                                sb6.append(" exceeds limit at ");
                                sb6.append(str);
                                C2622l.m5226A3(sb6.toString());
                                String strValueOf8 = String.valueOf(str5);
                                m8669o(str, file3.getAbsolutePath(), "sizeExceeded", strValueOf8.length() != 0 ? "File too big for full file cache. Size: ".concat(strValueOf8) : new String("File too big for full file cache. Size: "));
                                set.remove(strConcat2);
                                return false;
                            }
                            StringBuilder sb7 = new StringBuilder(String.valueOf(str5).length() + 20 + String.valueOf(str).length());
                            sb7.append("Caching ");
                            sb7.append(str5);
                            sb7.append(" bytes from ");
                            sb7.append(str);
                            C2622l.m5318U2(sb7.toString());
                            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionM8518a.getInputStream());
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                            try {
                                FileChannel channel = fileOutputStream3.getChannel();
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                InterfaceC2782b interfaceC2782b = C2330u.f10884a.f10896k;
                                long jMo5623c = interfaceC2782b.mo5623c();
                                String str6 = strConcat2;
                                try {
                                    C2281m0 c2281m0 = new C2281m0(((Long) c2862b.f12496d.m6596a(C3052g3.f14429r)).longValue());
                                    long jLongValue = ((Long) c2862b.f12496d.m6596a(C3052g3.f14422q)).longValue();
                                    int i2 = 0;
                                    while (true) {
                                        int i3 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                        if (i3 >= 0) {
                                            int i4 = i2 + i3;
                                            if (i4 > iIntValue) {
                                                str4 = "sizeExceeded";
                                                String strValueOf9 = String.valueOf(Integer.toString(i4));
                                                String strConcat3 = strValueOf9.length() != 0 ? "File too big for full file cache. Size: ".concat(strValueOf9) : new String("File too big for full file cache. Size: ");
                                                try {
                                                    throw new IOException("stream cache file size limit exceeded");
                                                } catch (IOException | RuntimeException e4) {
                                                    e = e4;
                                                    strConcat = strConcat3;
                                                    str2 = str6;
                                                    fileOutputStream2 = fileOutputStream3;
                                                }
                                            } else {
                                                byteBufferAllocate.flip();
                                                while (channel.write(byteBufferAllocate) > 0) {
                                                }
                                                byteBufferAllocate.clear();
                                                if (interfaceC2782b.mo5623c() - jMo5623c <= 1000 * jLongValue) {
                                                    if (this.f22393l) {
                                                        fileOutputStream = fileOutputStream3;
                                                        try {
                                                            throw new IOException("abort requested");
                                                        } catch (IOException | RuntimeException e5) {
                                                            e = e5;
                                                            str4 = "externalAbort";
                                                        }
                                                    } else {
                                                        if (c2281m0.m4790a()) {
                                                            fileOutputStream = fileOutputStream3;
                                                            try {
                                                                try {
                                                                    C3331nn.f17166a.post(new RunnableC3446qr(this, str, file3.getAbsolutePath(), i4, contentLength));
                                                                } catch (IOException e6) {
                                                                    e = e6;
                                                                }
                                                            } catch (RuntimeException e7) {
                                                                e = e7;
                                                            }
                                                        } else {
                                                            fileOutputStream = fileOutputStream3;
                                                        }
                                                        i2 = i4;
                                                        readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                        interfaceC2782b = interfaceC2782b;
                                                        c2281m0 = c2281m0;
                                                        byteBufferAllocate = byteBufferAllocate;
                                                        channel = channel;
                                                        fileOutputStream3 = fileOutputStream;
                                                        iIntValue = iIntValue;
                                                    }
                                                    str2 = str6;
                                                    fileOutputStream2 = fileOutputStream;
                                                    strConcat = null;
                                                } else {
                                                    FileOutputStream fileOutputStream4 = fileOutputStream3;
                                                    str4 = "downloadTimeout";
                                                    String string = Long.toString(jLongValue);
                                                    StringBuilder sb8 = new StringBuilder(String.valueOf(string).length() + 29);
                                                    sb8.append("Timeout exceeded. Limit: ");
                                                    sb8.append(string);
                                                    sb8.append(" sec");
                                                    String string2 = sb8.toString();
                                                    try {
                                                        throw new IOException("stream cache time limit exceeded");
                                                    } catch (IOException | RuntimeException e8) {
                                                        e = e8;
                                                        strConcat = string2;
                                                        str2 = str6;
                                                        fileOutputStream2 = fileOutputStream4;
                                                    }
                                                }
                                            }
                                        } else {
                                            fileOutputStream = fileOutputStream3;
                                            fileOutputStream.close();
                                            if (C2622l.m5281L3(3)) {
                                                String str7 = f22391j.format(i2);
                                                StringBuilder sb9 = new StringBuilder(String.valueOf(str7).length() + 22 + String.valueOf(str).length());
                                                sb9.append("Preloaded ");
                                                sb9.append(str7);
                                                sb9.append(" bytes from ");
                                                sb9.append(str);
                                                C2622l.m5318U2(sb9.toString());
                                            }
                                            file3.setReadable(true, false);
                                            if (fileM8905q.isFile()) {
                                                fileM8905q.setLastModified(System.currentTimeMillis());
                                            } else {
                                                try {
                                                    fileM8905q.createNewFile();
                                                } catch (IOException unused) {
                                                }
                                            }
                                            C3331nn.f17166a.post(new RunnableC3557tr(this, str, file3.getAbsolutePath(), i2));
                                            str2 = str6;
                                            try {
                                                f22390i.remove(str2);
                                                return true;
                                            } catch (IOException e9) {
                                                e = e9;
                                            } catch (RuntimeException e10) {
                                                e = e10;
                                            }
                                        }
                                    }
                                } catch (IOException | RuntimeException e11) {
                                    e = e11;
                                    fileOutputStream = fileOutputStream3;
                                }
                            } catch (IOException | RuntimeException e12) {
                                e = e12;
                                fileOutputStream = fileOutputStream3;
                                str2 = strConcat2;
                            }
                        }
                    } catch (IOException | RuntimeException e13) {
                        e = e13;
                        str2 = strConcat2;
                        strConcat = null;
                        fileOutputStream2 = null;
                    }
                    if (e instanceof RuntimeException) {
                        C2998en c2998en3 = C2330u.f10884a.f10893h;
                        C3696xh.m8734c(c2998en3.f13616e, c2998en3.f13617f).mo8736b(e, "VideoStreamFullFileCache.preload");
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException | NullPointerException unused2) {
                    }
                    if (this.f22393l) {
                        StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 26);
                        sb10.append("Preload aborted for URL \"");
                        sb10.append(str);
                        sb10.append("\"");
                        C2622l.m5458x3(sb10.toString());
                    } else {
                        StringBuilder sb11 = new StringBuilder(String.valueOf(str).length() + 25);
                        sb11.append("Preload failed for URL \"");
                        sb11.append(str);
                        sb11.append("\"");
                        C2622l.m5241D3(sb11.toString(), e);
                    }
                    if (file3.exists() && !file3.delete()) {
                        strValueOf = String.valueOf(file3.getAbsolutePath());
                        if (strValueOf.length() != 0) {
                            str3 = "Could not delete partial cache file at ".concat(strValueOf);
                        } else {
                            str3 = new String("Could not delete partial cache file at ");
                        }
                        C2622l.m5226A3(str3);
                    }
                    m8669o(str, file3.getAbsolutePath(), str4, strConcat);
                    f22390i.remove(str2);
                    return false;
                }
            }
            File file4 = this.f22392k;
            if (file4 == null) {
                break;
            }
            long j2 = Long.MAX_VALUE;
            File file5 = null;
            for (File file6 : file4.listFiles()) {
                if (!file6.getName().endsWith(".done")) {
                    long jLastModified = file6.lastModified();
                    if (jLastModified < j2) {
                        file5 = file6;
                        j2 = jLastModified;
                    }
                }
            }
            if (file5 != null) {
                zDelete = file5.delete();
                File fileM8905q2 = m8905q(file5);
                if (fileM8905q2.isFile()) {
                    zDelete &= fileM8905q2.delete();
                }
            } else {
                zDelete = false;
            }
        } while (zDelete);
        C2622l.m5226A3("Unable to expire stream cache");
        m8669o(str, null, "expireFailed", null);
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: n */
    public final void mo5842n() {
        this.f22393l = true;
    }

    /* JADX INFO: renamed from: q */
    public final File m8905q(File file) {
        return new File(this.f22392k, String.valueOf(file.getName()).concat(".done"));
    }
}
