package p509g1.p510j0.p515h;

import com.facebook.stetho.websocket.CloseCodes;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p477d1.p481d0.Regex2;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s.Collections4;
import p477d1.p483s.Maps7;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Challenge;
import p509g1.Cookie;
import p509g1.CookieJar;
import p509g1.Headers2;
import p509g1.HttpUrl;
import p509g1.Response3;
import p509g1.p510j0.Util9;
import p524h1.Buffer3;
import p524h1.ByteString3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: g1.j0.h.e, reason: use source file name */
/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpHeaders2 {

    /* JADX INFO: renamed from: a */
    public static final ByteString3 f30285a;

    /* JADX INFO: renamed from: b */
    public static final ByteString3 f30286b;

    static {
        ByteString3.a aVar = ByteString3.f30712g;
        f30285a = aVar.m13777c("\"\\");
        f30286b = aVar.m13777c("\t ,=");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m13485a(Response3 response3) {
        Intrinsics2.m13090f(response3, "$this$promisesBody");
        if (Intrinsics2.m13085a(response3.f29990g.f29952c, "HEAD")) {
            return false;
        }
        int i = response3.f29993j;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && Util9.m13371k(response3) == -1 && !StringsJVM.m12989f("chunked", Response3.m13336c(response3, "Transfer-Encoding", null, 2), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00f8 A[EDGE_INSN: B:111:0x00f8->B:52:0x00f8 BREAK  A[LOOP:4: B:46:0x00e4->B:94:0x0198], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:63:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0140  */
    /* JADX WARN: Code duplicated, block: B:78:0x0153  */
    /* JADX WARN: Code duplicated, block: B:81:0x0160 A[LOOP:5: B:71:0x0133->B:81:0x0160, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x017b  */
    /* JADX INFO: renamed from: b */
    public static final void m13486b(Buffer3 buffer3, List<Challenge> list) throws EOFException {
        String strM13487c;
        int iM13380t;
        int i;
        int i2;
        byte b;
        boolean z;
        String str;
        String strM13487c2;
        boolean z2;
        Buffer3 buffer4;
        long jMo13712E;
        String string;
        List<Challenge> list2 = list;
        while (true) {
            String strM13487c3 = null;
            String strM13755u0 = null;
            while (true) {
                if (strM13487c3 == null) {
                    m13489e(buffer3);
                    strM13487c3 = m13487c(buffer3);
                    if (strM13487c3 == null) {
                        return;
                    }
                }
                boolean zM13489e = m13489e(buffer3);
                strM13487c = m13487c(buffer3);
                if (strM13487c == null) {
                    if (buffer3.mo13759y()) {
                        list2.add(new Challenge(strM13487c3, Maps7.f29520f));
                        return;
                    }
                    return;
                }
                byte b2 = (byte) 61;
                iM13380t = Util9.m13380t(buffer3, b2);
                boolean zM13489e2 = m13489e(buffer3);
                i2 = 1;
                if (!zM13489e && (zM13489e2 || buffer3.mo13759y())) {
                    break;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int iM13380t2 = Util9.m13380t(buffer3, b2) + iM13380t;
                while (true) {
                    if (strM13487c != null) {
                        if (iM13380t2 == 0) {
                            break;
                            break;
                        }
                        if (iM13380t2 <= 1) {
                            return;
                        }
                        b = (byte) 34;
                        if (buffer3.mo13759y()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (buffer3.readByte() == b) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            buffer4 = new Buffer3();
                            while (true) {
                                jMo13712E = buffer3.mo13712E(f30285a);
                                if (jMo13712E != -1) {
                                    if (buffer3.m13740b0(jMo13712E) == b) {
                                        buffer4.mo13415U(buffer3, jMo13712E);
                                        buffer3.readByte();
                                        strM13755u0 = buffer4.m13755u0();
                                    } else {
                                        str = strM13487c3;
                                        if (buffer3.f30708g == jMo13712E + 1) {
                                            strM13487c2 = null;
                                            break;
                                        }
                                        buffer4.mo13415U(buffer3, jMo13712E);
                                        buffer3.readByte();
                                        buffer4.mo13415U(buffer3, 1L);
                                        strM13487c3 = str;
                                        strM13755u0 = null;
                                    }
                                }
                                strM13487c2 = strM13755u0;
                                str = strM13487c3;
                                break;
                            }
                        } else {
                            str = strM13487c3;
                            strM13487c2 = m13487c(buffer3);
                        }
                        if (strM13487c2 != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    strM13487c = m13487c(buffer3);
                    if (m13489e(buffer3)) {
                        break;
                    }
                    iM13380t2 = Util9.m13380t(buffer3, b2);
                    if (iM13380t2 == 0) {
                        break;
                    }
                    if (iM13380t2 <= 1 || m13489e(buffer3)) {
                        return;
                    }
                    b = (byte) 34;
                    if (buffer3.mo13759y() || buffer3.m13740b0(0L) != b) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (buffer3.readByte() == b) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        buffer4 = new Buffer3();
                        while (true) {
                            jMo13712E = buffer3.mo13712E(f30285a);
                            if (jMo13712E != -1) {
                                if (buffer3.m13740b0(jMo13712E) == b) {
                                    buffer4.mo13415U(buffer3, jMo13712E);
                                    buffer3.readByte();
                                    strM13755u0 = buffer4.m13755u0();
                                } else {
                                    str = strM13487c3;
                                    if (buffer3.f30708g == jMo13712E + 1) {
                                        strM13487c2 = null;
                                        break;
                                    }
                                    buffer4.mo13415U(buffer3, jMo13712E);
                                    buffer3.readByte();
                                    buffer4.mo13415U(buffer3, 1L);
                                    strM13487c3 = str;
                                    strM13755u0 = null;
                                }
                            }
                            strM13487c2 = strM13755u0;
                            str = strM13487c3;
                            break;
                        }
                    } else {
                        str = strM13487c3;
                        strM13487c2 = m13487c(buffer3);
                    }
                    if (strM13487c2 != null || ((String) linkedHashMap.put(strM13487c, strM13487c2)) != null) {
                        return;
                    }
                    if (!m13489e(buffer3) && !buffer3.mo13759y()) {
                        return;
                    }
                    strM13487c = null;
                    strM13487c3 = str;
                    strM13755u0 = null;
                    list2 = list;
                }
                list2.add(new Challenge(strM13487c3, linkedHashMap));
                strM13487c3 = strM13487c;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strM13487c);
            Intrinsics2.m13089e("=", "$this$repeat");
            if (!(iM13380t >= 0)) {
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + iM13380t + '.').toString());
            }
            if (iM13380t == 0) {
                string = "";
            } else if (iM13380t != 1) {
                int length = "=".length();
                if (length == 0) {
                    string = "";
                } else if (length != 1) {
                    StringBuilder sb2 = new StringBuilder("=".length() * iM13380t);
                    if (1 <= iM13380t) {
                        while (true) {
                            sb2.append((CharSequence) "=");
                            if (i2 == iM13380t) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    string = sb2.toString();
                    Intrinsics2.m13088d(string, "sb.toString()");
                } else {
                    char cCharAt = "=".charAt(0);
                    char[] cArr = new char[iM13380t];
                    for (i = 0; i < iM13380t; i++) {
                        cArr[i] = cCharAt;
                    }
                    string = new String(cArr);
                }
            } else {
                string = "=".toString();
            }
            sb.append(string);
            Map mapSingletonMap = Collections.singletonMap(strM13755u0, sb.toString());
            Intrinsics2.m13086b(mapSingletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list2.add(new Challenge(strM13487c3, (Map<String, String>) mapSingletonMap));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m13487c(Buffer3 buffer3) {
        long jMo13712E = buffer3.mo13712E(f30286b);
        if (jMo13712E == -1) {
            jMo13712E = buffer3.f30708g;
        }
        if (jMo13712E != 0) {
            return buffer3.m13758x0(jMo13712E);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    /* JADX INFO: renamed from: d */
    public static final void m13488d(CookieJar cookieJar, HttpUrl httpUrl, Headers2 headers2) {
        List<Cookie> listUnmodifiableList;
        String str;
        List<String> list;
        int i;
        Cookie cookie;
        long j2;
        boolean z;
        ?? r6;
        String str2;
        Intrinsics2.m13090f(cookieJar, "$this$receiveHeaders");
        String str3 = "url";
        Intrinsics2.m13090f(httpUrl, "url");
        Intrinsics2.m13090f(headers2, "headers");
        if (cookieJar == CookieJar.f30615a) {
            return;
        }
        Cookie.a aVar = Cookie.f30605e;
        Objects.requireNonNull(aVar);
        Intrinsics2.m13090f(httpUrl, "url");
        Intrinsics2.m13090f(headers2, "headers");
        List<String> listM13654q = headers2.m13654q("Set-Cookie");
        int size = listM13654q.size();
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList = null;
        while (i3 < size) {
            String str4 = listM13654q.get(i3);
            Intrinsics2.m13090f(httpUrl, str3);
            Intrinsics2.m13090f(str4, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics2.m13090f(httpUrl, str3);
            Intrinsics2.m13090f(str4, "setCookie");
            byte[] bArr = Util9.f30070a;
            char c2 = ';';
            int iM13366f = Util9.m13366f(str4, ';', i2, str4.length());
            int iM13366f2 = Util9.m13366f(str4, '=', i2, iM13366f);
            if (iM13366f2 != iM13366f) {
                String strM13386z = Util9.m13386z(str4, i2, iM13366f2);
                if (!(strM13386z.length() == 0) && Util9.m13373m(strM13386z) == -1) {
                    String strM13386z2 = Util9.m13386z(str4, iM13366f2 + 1, iM13366f);
                    if (Util9.m13373m(strM13386z2) == -1) {
                        int i4 = iM13366f + 1;
                        int length = str4.length();
                        long j3 = -1;
                        long jM13635b = 253402300799999L;
                        String str5 = null;
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = true;
                        String str6 = null;
                        while (true) {
                            str = str3;
                            if (i4 >= length) {
                                list = listM13654q;
                                i = size;
                                if (j3 == Long.MIN_VALUE) {
                                    j2 = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    long j4 = jCurrentTimeMillis + (j3 <= 9223372036854775L ? j3 * ((long) CloseCodes.NORMAL_CLOSURE) : Long.MAX_VALUE);
                                    j2 = (j4 < jCurrentTimeMillis || j4 > 253402300799999L) ? 253402300799999L : j4;
                                } else {
                                    j2 = jM13635b;
                                }
                                String str7 = httpUrl.f30647g;
                                if (str5 != null) {
                                    if (!Intrinsics2.m13085a(str7, str5)) {
                                        if (StringsJVM.m12988e(str7, str5, false, 2) && str7.charAt((str7.length() - str5.length()) - 1) == '.') {
                                            byte[] bArr2 = Util9.f30070a;
                                            Intrinsics2.m13090f(str7, "$this$canParseAsIpAddress");
                                            z = Util9.f30075f.m12982a(str7) ? false : true;
                                        }
                                    }
                                    if (!z) {
                                        break;
                                    }
                                } else {
                                    str5 = str7;
                                }
                                if (str7.length() != str5.length()) {
                                    Objects.requireNonNull(PublicSuffixDatabase.f34070d);
                                    if (PublicSuffixDatabase.f34069c.m14475a(str5) == null) {
                                        break;
                                    }
                                }
                                String strSubstring = "/";
                                String str8 = str6;
                                if (str8 != null) {
                                    r6 = 0;
                                    if (StringsJVM.m12997n(str8, "/", false, 2)) {
                                        str2 = str8;
                                    }
                                    cookie = new Cookie(strM13386z, strM13386z2, j2, str5, str2, z2, z3, z4, z5, null);
                                    break;
                                }
                                r6 = 0;
                                String strM13665b = httpUrl.m13665b();
                                int iM13014x = Strings5.m13014x(strM13665b, '/', r6, r6, 6);
                                if (iM13014x != 0) {
                                    strSubstring = strM13665b.substring(r6, iM13014x);
                                    Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                }
                                str2 = strSubstring;
                                cookie = new Cookie(strM13386z, strM13386z2, j2, str5, str2, z2, z3, z4, z5, null);
                                break;
                            }
                            int iM13366f3 = Util9.m13366f(str4, c2, i4, length);
                            List<String> list2 = listM13654q;
                            int iM13366f4 = Util9.m13366f(str4, '=', i4, iM13366f3);
                            String strM13386z3 = Util9.m13386z(str4, i4, iM13366f4);
                            String strM13386z4 = iM13366f4 < iM13366f3 ? Util9.m13386z(str4, iM13366f4 + 1, iM13366f3) : "";
                            int i5 = size;
                            if (StringsJVM.m12989f(strM13386z3, "expires", true)) {
                                try {
                                    jM13635b = aVar.m13635b(strM13386z4, 0, strM13386z4.length());
                                    z4 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (StringsJVM.m12989f(strM13386z3, "max-age", true)) {
                                try {
                                    long j5 = Long.parseLong(strM13386z4);
                                    j3 = j5 > 0 ? j5 : Long.MIN_VALUE;
                                } catch (NumberFormatException e) {
                                    if (!new Regex2("-?\\d+").m12982a(strM13386z4)) {
                                        throw e;
                                    }
                                    j3 = StringsJVM.m12997n(strM13386z4, "-", false, 2) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                z4 = true;
                            } else if (StringsJVM.m12989f(strM13386z3, "domain", true)) {
                                if (!(!StringsJVM.m12988e(strM13386z4, ".", false, 2))) {
                                    throw new IllegalArgumentException("Failed requirement.".toString());
                                }
                                String strM14084e0 = SkuDao.a.m14084e0(Strings5.m12999B(strM13386z4, "."));
                                if (strM14084e0 == null) {
                                    throw new IllegalArgumentException();
                                }
                                str5 = strM14084e0;
                                z5 = false;
                            } else if (StringsJVM.m12989f(strM13386z3, "path", true)) {
                                str6 = strM13386z4;
                            } else if (StringsJVM.m12989f(strM13386z3, "secure", true)) {
                                z2 = true;
                            } else if (StringsJVM.m12989f(strM13386z3, "httponly", true)) {
                                z3 = true;
                            }
                            i4 = iM13366f3 + 1;
                            str3 = str;
                            listM13654q = list2;
                            size = i5;
                            c2 = ';';
                        }
                    } else {
                        str = str3;
                        list = listM13654q;
                        i = size;
                        cookie = null;
                    }
                } else {
                    str = str3;
                    list = listM13654q;
                    i = size;
                }
                cookie = null;
                break;
            } else {
                str = str3;
                list = listM13654q;
                i = size;
                cookie = null;
            }
            if (cookie != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cookie);
            }
            i3++;
            str3 = str;
            listM13654q = list;
            size = i;
            i2 = 0;
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics2.m13086b(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
        } else {
            listUnmodifiableList = Collections4.f29519f;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        cookieJar.mo13637a(httpUrl, listUnmodifiableList);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m13489e(Buffer3 buffer3) throws EOFException {
        boolean z = false;
        while (!buffer3.mo13759y()) {
            byte bM13740b0 = buffer3.m13740b0(0L);
            if (bM13740b0 == 9 || bM13740b0 == 32) {
                buffer3.readByte();
            } else {
                if (bM13740b0 != 44) {
                    break;
                }
                buffer3.readByte();
                z = true;
            }
        }
        return z;
    }
}
