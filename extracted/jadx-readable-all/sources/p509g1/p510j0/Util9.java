package p509g1.p510j0;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p481d0.Charsets2;
import p477d1.p481d0.Regex2;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s._Collections;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Headers2;
import p509g1.HttpUrl;
import p509g1.OkHttpClient;
import p509g1.RequestBody;
import p509g1.Response3;
import p509g1.ResponseBody;
import p509g1.p510j0.p517j.Header;
import p524h1.Buffer3;
import p524h1.BufferedSource;
import p524h1.ByteString3;
import p524h1.Options2;
import p524h1.Source;

/* JADX INFO: renamed from: g1.j0.c, reason: use source file name */
/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Util9 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f30070a;

    /* JADX INFO: renamed from: b */
    public static final Headers2 f30071b = Headers2.f30638f.m13663c(new String[0]);

    /* JADX INFO: renamed from: c */
    public static final ResponseBody f30072c;

    /* JADX INFO: renamed from: d */
    public static final Options2 f30073d;

    /* JADX INFO: renamed from: e */
    public static final TimeZone f30074e;

    /* JADX INFO: renamed from: f */
    public static final Regex2 f30075f;

    /* JADX INFO: renamed from: g */
    public static final String f30076g;

    static {
        byte[] bArr = new byte[0];
        f30070a = bArr;
        f30072c = ResponseBody.Companion.m13353d(bArr, null);
        RequestBody.f29980a.m13331b(bArr, null, 0, 0);
        Options2.a aVar = Options2.f30730g;
        ByteString3.a aVar2 = ByteString3.f30712g;
        f30073d = aVar.m13783c(aVar2.m13776b("efbbbf"), aVar2.m13776b("feff"), aVar2.m13776b("fffe"), aVar2.m13776b("0000ffff"), aVar2.m13776b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        if (timeZone == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        f30074e = timeZone;
        f30075f = new Regex2("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = OkHttpClient.class.getName();
        Intrinsics2.m13086b(name, "OkHttpClient::class.java.name");
        String strM12999B = Strings5.m12999B(name, "okhttp3.");
        Intrinsics2.m13089e(strM12999B, "$this$removeSuffix");
        Intrinsics2.m13089e("Client", "suffix");
        Intrinsics2.m13089e(strM12999B, "$this$endsWith");
        Intrinsics2.m13089e("Client", "suffix");
        if (StringsJVM.m12988e(strM12999B, "Client", false, 2)) {
            strM12999B = strM12999B.substring(0, strM12999B.length() - "Client".length());
            Intrinsics2.m13088d(strM12999B, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        f30076g = strM12999B;
    }

    /* JADX INFO: renamed from: A */
    public static final Throwable m13360A(Exception exc, List<? extends Exception> list) {
        Intrinsics2.m13090f(exc, "$this$withSuppressed");
        Intrinsics2.m13090f(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            exc.addSuppressed(it.next());
        }
        return exc;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m13361a(HttpUrl httpUrl, HttpUrl httpUrl2) {
        Intrinsics2.m13090f(httpUrl, "$this$canReuseConnectionFor");
        Intrinsics2.m13090f(httpUrl2, "other");
        return Intrinsics2.m13085a(httpUrl.f30647g, httpUrl2.f30647g) && httpUrl.f30648h == httpUrl2.f30648h && Intrinsics2.m13085a(httpUrl.f30644d, httpUrl2.f30644d);
    }

    /* JADX INFO: renamed from: b */
    public static final int m13362b(String str, long j2, TimeUnit timeUnit) {
        Intrinsics2.m13090f(str, "name");
        if (!(j2 >= 0)) {
            throw new IllegalStateException(outline.m1599u(str, " < 0").toString());
        }
        long millis = timeUnit.toMillis(j2);
        if (!(millis <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(outline.m1599u(str, " too large.").toString());
        }
        if (millis != 0 || j2 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(outline.m1599u(str, " too small.").toString());
    }

    /* JADX INFO: renamed from: c */
    public static final void m13363c(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m13364d(Closeable closeable) {
        Intrinsics2.m13090f(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m13365e(Socket socket) {
        Intrinsics2.m13090f(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static final int m13366f(String str, char c2, int i, int i2) {
        Intrinsics2.m13090f(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public static final int m13367g(String str, String str2, int i, int i2) {
        Intrinsics2.m13090f(str, "$this$delimiterOffset");
        Intrinsics2.m13090f(str2, "delimiters");
        while (i < i2) {
            if (Strings5.m13005o(str2, str.charAt(i), false, 2)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m13368h(Source source, int i, TimeUnit timeUnit) {
        Intrinsics2.m13090f(source, "$this$discard");
        Intrinsics2.m13090f(timeUnit, "timeUnit");
        try {
            return m13381u(source, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final String m13369i(String str, Object... objArr) {
        Intrinsics2.m13090f(str, "format");
        Intrinsics2.m13090f(objArr, "args");
        Locale locale = Locale.US;
        Intrinsics2.m13086b(locale, "Locale.US");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics2.m13086b(str2, "java.lang.String.format(locale, format, *args)");
        return str2;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m13370j(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        Intrinsics2.m13090f(strArr, "$this$hasIntersection");
        Intrinsics2.m13090f(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static final long m13371k(Response3 response3) {
        Intrinsics2.m13090f(response3, "$this$headersContentLength");
        String strM13649c = response3.f29995l.m13649c(HttpHeaders.CONTENT_LENGTH);
        if (strM13649c != null) {
            Intrinsics2.m13090f(strM13649c, "$this$toLongOrDefault");
            try {
                return Long.parseLong(strM13649c);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: l */
    public static final <T> List<T> m13372l(T... tArr) {
        Intrinsics2.m13090f(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics2.m13086b(listUnmodifiableList, "Collections.unmodifiable…sList(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: m */
    public static final int m13373m(String str) {
        Intrinsics2.m13090f(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public static final int m13374n(String str, int i, int i2) {
        Intrinsics2.m13090f(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: o */
    public static final int m13375o(String str, int i, int i2) {
        Intrinsics2.m13090f(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: p */
    public static final String[] m13376p(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        Intrinsics2.m13090f(strArr, "$this$intersect");
        Intrinsics2.m13090f(strArr2, "other");
        Intrinsics2.m13090f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX INFO: renamed from: q */
    public static final int m13377q(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    /* JADX INFO: renamed from: r */
    public static final Charset m13378r(BufferedSource bufferedSource, Charset charset) throws IOException {
        Charset charsetForName;
        Intrinsics2.m13090f(bufferedSource, "$this$readBomAsCharset");
        Intrinsics2.m13090f(charset, "default");
        int iMo13713E0 = bufferedSource.mo13713E0(f30073d);
        if (iMo13713E0 == -1) {
            return charset;
        }
        if (iMo13713E0 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            Intrinsics2.m13086b(charset2, "UTF_8");
            return charset2;
        }
        if (iMo13713E0 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            Intrinsics2.m13086b(charset3, "UTF_16BE");
            return charset3;
        }
        if (iMo13713E0 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            Intrinsics2.m13086b(charset4, "UTF_16LE");
            return charset4;
        }
        if (iMo13713E0 == 3) {
            Charsets2 charsets2 = Charsets2.f29455d;
            charsetForName = Charsets2.f29454c;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                Intrinsics2.m13088d(charsetForName, "Charset.forName(\"UTF-32BE\")");
                Charsets2.f29454c = charsetForName;
            }
        } else {
            if (iMo13713E0 != 4) {
                throw new AssertionError();
            }
            Charsets2 charsets3 = Charsets2.f29455d;
            charsetForName = Charsets2.f29453b;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                Intrinsics2.m13088d(charsetForName, "Charset.forName(\"UTF-32LE\")");
                Charsets2.f29453b = charsetForName;
            }
        }
        return charsetForName;
    }

    /* JADX INFO: renamed from: s */
    public static final int m13379s(BufferedSource bufferedSource) throws IOException {
        Intrinsics2.m13090f(bufferedSource, "$this$readMedium");
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: t */
    public static final int m13380t(Buffer3 buffer3, byte b) throws EOFException {
        Intrinsics2.m13090f(buffer3, "$this$skipAll");
        int i = 0;
        while (!buffer3.mo13759y() && buffer3.m13740b0(0L) == b) {
            i++;
            buffer3.readByte();
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[PHI: r12
  0x0072: PHI (r12v6 boolean) = (r12v5 boolean), (r12v10 boolean) binds: [B:22:0x0070, B:13:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    /* JADX INFO: renamed from: u */
    public static final boolean m13381u(Source source, int i, TimeUnit timeUnit) throws IOException {
        boolean z;
        Intrinsics2.m13090f(source, "$this$skipAll");
        Intrinsics2.m13090f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jMo13698c = source.mo13391d().mo13700e() ? source.mo13391d().mo13698c() - jNanoTime : Long.MAX_VALUE;
        source.mo13391d().mo13699d(Math.min(jMo13698c, timeUnit.toNanos(i)) + jNanoTime);
        try {
            Buffer3 buffer3 = new Buffer3();
            while (source.mo13392p0(buffer3, 8192L) != -1) {
                buffer3.skip(buffer3.f30708g);
            }
            z = true;
            if (jMo13698c == Long.MAX_VALUE) {
                source.mo13391d().mo13696a();
            } else {
                source.mo13391d().mo13699d(jNanoTime + jMo13698c);
            }
        } catch (InterruptedIOException unused) {
            z = false;
            if (jMo13698c == Long.MAX_VALUE) {
                source.mo13391d().mo13696a();
            }
        } catch (Throwable th) {
            if (jMo13698c == Long.MAX_VALUE) {
                source.mo13391d().mo13696a();
            } else {
                source.mo13391d().mo13699d(jNanoTime + jMo13698c);
            }
            throw th;
        }
        return z;
    }

    /* JADX INFO: renamed from: v */
    public static final Headers2 m13382v(List<Header> list) {
        Intrinsics2.m13090f(list, "$this$toHeaders");
        Headers2.a aVar = new Headers2.a();
        for (Header header : list) {
            aVar.m13657c(header.f30345h.m13772w(), header.f30346i.m13772w());
        }
        return aVar.m13658d();
    }

    /* JADX INFO: renamed from: w */
    public static final String m13383w(HttpUrl httpUrl, boolean z) {
        String string;
        Intrinsics2.m13090f(httpUrl, "$this$toHostHeader");
        if (Strings5.m13006p(httpUrl.f30647g, ":", false, 2)) {
            StringBuilder sbM1555F = outline.m1555F('[');
            sbM1555F.append(httpUrl.f30647g);
            sbM1555F.append(']');
            string = sbM1555F.toString();
        } else {
            string = httpUrl.f30647g;
        }
        if (!z && httpUrl.f30648h == HttpUrl.f30642b.m13680b(httpUrl.f30644d)) {
            return string;
        }
        return string + ':' + httpUrl.f30648h;
    }

    /* JADX INFO: renamed from: x */
    public static final <T> List<T> m13384x(List<? extends T> list) {
        Intrinsics2.m13090f(list, "$this$toImmutableList");
        List<T> listUnmodifiableList = Collections.unmodifiableList(_Collections.m13050o(list));
        Intrinsics2.m13086b(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: y */
    public static final int m13385y(String str, int i) {
        if (str != null) {
            try {
                long j2 = Long.parseLong(str);
                if (j2 > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (j2 < 0) {
                    return 0;
                }
                return (int) j2;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: z */
    public static final String m13386z(String str, int i, int i2) {
        Intrinsics2.m13090f(str, "$this$trimSubstring");
        int iM13374n = m13374n(str, i, i2);
        String strSubstring = str.substring(iM13374n, m13375o(str, iM13374n, i2));
        Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
