package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.SystemClock;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;

/* JADX INFO: renamed from: c.n.b.d.j.a.me */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C3285me implements ps2 {

    /* JADX INFO: renamed from: a */
    public final C2879bg f16733a = new C2879bg(4096);

    public C3285me(C3321nd c3321nd) {
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:155:0x02f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:158:0x030f  */
    /* JADX WARN: Code duplicated, block: B:172:0x034d  */
    /* JADX WARN: Code duplicated, block: B:176:0x036e A[LOOP:0: B:3:0x000a->B:176:0x036e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x02b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0386 A[SYNTHETIC] */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ps2
    /* JADX INFO: renamed from: a */
    public lv2 mo4798a(AbstractC3679x0<?> abstractC3679x0) throws Throwable {
        C3145im c3145im;
        byte[] bArr;
        String strValueOf;
        String str;
        int i;
        C3150ir c3150ir;
        lv2 lv2Var;
        C3150ir c3150ir2;
        int i2;
        C2872b9 c2872b9;
        int i3;
        Map mapEmptyMap;
        byte[] bArr2;
        byte[] bArrM5989a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z = true;
            try {
                hj2 hj2Var = abstractC3679x0.f21412o;
                if (hj2Var == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str2 = hj2Var.f14878b;
                    if (str2 != null) {
                        map.put("If-None-Match", str2);
                    }
                    long j2 = hj2Var.f14880d;
                    if (j2 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        map.put("If-Modified-Since", simpleDateFormat.format(new Date(j2)));
                    }
                    mapEmptyMap = map;
                }
                String str3 = abstractC3679x0.f21405h;
                HashMap map2 = new HashMap();
                map2.putAll(mapEmptyMap);
                map2.putAll(abstractC3679x0.mo4829q());
                URL url = new URL(str3);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int i4 = abstractC3679x0.f21414q.f12243a;
                httpURLConnection.setConnectTimeout(i4);
                httpURLConnection.setReadTimeout(i4);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str4 : map2.keySet()) {
                        httpURLConnection.setRequestProperty(str4, (String) map2.get(str4));
                    }
                    if (abstractC3679x0.f21404g != 0) {
                        httpURLConnection.setRequestMethod("POST");
                        byte[] bArrMo4830s = abstractC3679x0.mo4830s();
                        if (bArrMo4830s != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey(HttpHeaders.CONTENT_TYPE)) {
                                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(bArrMo4830s);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod("GET");
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (!z) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                    if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                        c3145im = new C3145im(responseCode, C3111hp.m7152a(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    } else {
                        try {
                            c3145im = new C3145im(responseCode, C3111hp.m7152a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new C3183jn(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            if (!z) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e) {
                                    e = e;
                                    c3145im = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                        c3150ir = new C3150ir("socket", new C2871b8());
                                    } else {
                                        if (e instanceof MalformedURLException) {
                                            strValueOf = String.valueOf(abstractC3679x0.f21405h);
                                            if (strValueOf.length() != 0) {
                                                str = "Bad URL ".concat(strValueOf);
                                            } else {
                                                str = new String("Bad URL ");
                                            }
                                            throw new RuntimeException(str, e);
                                        }
                                        if (c3145im != null) {
                                            throw new mw2(e);
                                        }
                                        i = c3145im.f15295a;
                                        C3282mb.m7682c("Unexpected response code %d for %s", Integer.valueOf(i), abstractC3679x0.f21405h);
                                        if (bArr != null) {
                                            lv2Var = new lv2(i, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, (List<tr2>) Collections.unmodifiableList(c3145im.f15296b));
                                            if (i == 401) {
                                            }
                                            c3150ir = new C3150ir("auth", new ji2(lv2Var));
                                        } else {
                                            c3150ir = new C3150ir("network", new lu2());
                                        }
                                    }
                                    c3150ir2 = c3150ir;
                                    ao2 ao2Var = abstractC3679x0.f21414q;
                                    i2 = ao2Var.f12243a;
                                    try {
                                        c2872b9 = c3150ir2.f15357b;
                                        i3 = ao2Var.f12244b + 1;
                                        ao2Var.f12244b = i3;
                                        ao2Var.f12243a = i2 + i2;
                                        if (i3 <= 1) {
                                            throw c2872b9;
                                        }
                                        abstractC3679x0.m8702f(String.format("%s-retry [timeout=%s]", c3150ir2.f15356a, Integer.valueOf(i2)));
                                    } catch (C2872b9 e2) {
                                        abstractC3679x0.m8702f(String.format("%s-timeout-giveup [timeout=%s]", c3150ir2.f15356a, Integer.valueOf(i2)));
                                        throw e2;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        int i5 = c3145im.f15295a;
                        List listUnmodifiableList = Collections.unmodifiableList(c3145im.f15296b);
                        if (i5 == 304) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            hj2 hj2Var2 = abstractC3679x0.f21412o;
                            if (hj2Var2 == null) {
                                return new lv2(304, (byte[]) null, true, jElapsedRealtime2, (List<tr2>) listUnmodifiableList);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!listUnmodifiableList.isEmpty()) {
                                Iterator it = listUnmodifiableList.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((tr2) it.next()).f19974a);
                                }
                            }
                            ArrayList arrayList = new ArrayList(listUnmodifiableList);
                            List<tr2> list = hj2Var2.f14884h;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (tr2 tr2Var : hj2Var2.f14884h) {
                                        if (!treeSet.contains(tr2Var.f19974a)) {
                                            arrayList.add(tr2Var);
                                        }
                                    }
                                }
                            } else if (!hj2Var2.f14883g.isEmpty()) {
                                for (Map.Entry<String, String> entry : hj2Var2.f14883g.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new tr2(entry.getKey(), entry.getValue()));
                                    }
                                }
                            }
                            return new lv2(304, hj2Var2.f14877a, true, jElapsedRealtime2, (List<tr2>) arrayList);
                        }
                        InputStream inputStream = c3145im.f15298d;
                        if (inputStream == null) {
                            inputStream = null;
                        }
                        if (inputStream != null) {
                            int i6 = c3145im.f15297c;
                            try {
                                C2879bg c2879bg = this.f16733a;
                                C3188js c3188js = new C3188js(c2879bg, i6);
                                try {
                                    bArrM5989a = c2879bg.m5989a(1024);
                                    while (true) {
                                        try {
                                            int i7 = inputStream.read(bArrM5989a);
                                            if (i7 == -1) {
                                                break;
                                            }
                                            c3188js.write(bArrM5989a, 0, i7);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused) {
                                                C3282mb.m7680a("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            c2879bg.m5990b(bArrM5989a);
                                            c3188js.close();
                                            throw th;
                                        }
                                        e = e;
                                        bArr = null;
                                        if (e instanceof SocketTimeoutException) {
                                            c3150ir = new C3150ir("socket", new C2871b8());
                                        } else {
                                            if (e instanceof MalformedURLException) {
                                                strValueOf = String.valueOf(abstractC3679x0.f21405h);
                                                if (strValueOf.length() != 0) {
                                                    str = "Bad URL ".concat(strValueOf);
                                                } else {
                                                    str = new String("Bad URL ");
                                                }
                                                throw new RuntimeException(str, e);
                                            }
                                            if (c3145im != null) {
                                                throw new mw2(e);
                                            }
                                            i = c3145im.f15295a;
                                            C3282mb.m7682c("Unexpected response code %d for %s", Integer.valueOf(i), abstractC3679x0.f21405h);
                                            if (bArr != null) {
                                                lv2Var = new lv2(i, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, (List<tr2>) Collections.unmodifiableList(c3145im.f15296b));
                                                if (i == 401 && i != 403) {
                                                    if (i < 400 || i > 499) {
                                                        throw new C2982e7(lv2Var);
                                                    }
                                                    throw new cn2(lv2Var);
                                                }
                                                c3150ir = new C3150ir("auth", new ji2(lv2Var));
                                            } else {
                                                c3150ir = new C3150ir("network", new lu2());
                                            }
                                        }
                                        c3150ir2 = c3150ir;
                                        ao2 ao2Var2 = abstractC3679x0.f21414q;
                                        i2 = ao2Var2.f12243a;
                                        c2872b9 = c3150ir2.f15357b;
                                        i3 = ao2Var2.f12244b + 1;
                                        ao2Var2.f12244b = i3;
                                        ao2Var2.f12243a = i2 + i2;
                                        if (i3 <= 1) {
                                            throw c2872b9;
                                        }
                                        abstractC3679x0.m8702f(String.format("%s-retry [timeout=%s]", c3150ir2.f15356a, Integer.valueOf(i2)));
                                    }
                                    byte[] byteArray = c3188js.toByteArray();
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused2) {
                                        C3282mb.m7680a("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    c2879bg.m5990b(bArrM5989a);
                                    c3188js.close();
                                    bArr2 = byteArray;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArrM5989a = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                bArr = null;
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (C3282mb.f16709a || jElapsedRealtime3 > 3000) {
                                Object[] objArr = new Object[5];
                                objArr[0] = abstractC3679x0;
                                objArr[1] = Long.valueOf(jElapsedRealtime3);
                                objArr[2] = bArr2 != null ? Integer.valueOf(bArr2.length) : "null";
                                objArr[3] = Integer.valueOf(i5);
                                objArr[4] = Integer.valueOf(abstractC3679x0.f21414q.f12244b);
                                C3282mb.m7681b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            }
                            if (i5 < 200 || i5 > 299) {
                                throw new IOException();
                            }
                            return new lv2(i5, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, (List<tr2>) listUnmodifiableList);
                        } catch (IOException e4) {
                            e = e4;
                            bArr = bArr2;
                        }
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e6) {
                e = e6;
            }
        }
    }
}
