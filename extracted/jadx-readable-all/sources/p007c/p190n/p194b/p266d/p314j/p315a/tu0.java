package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tu0 implements dl1<ru0, su0> {

    /* JADX INFO: renamed from: a */
    public final Context f19986a;

    /* JADX INFO: renamed from: b */
    public final String f19987b;

    public tu0(Context context, String str, C2920cj c2920cj, int i, byte[] bArr) {
        this.f19986a = context;
        this.f19987b = str;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0248 A[Catch: all -> 0x00cb, TryCatch #6 {all -> 0x00cb, blocks: (B:20:0x009f, B:103:0x0236, B:105:0x0248, B:107:0x0256, B:21:0x00a5, B:23:0x00ae, B:26:0x00c7, B:34:0x00d4, B:35:0x00d7, B:36:0x00d8, B:37:0x00f6, B:39:0x00fc, B:41:0x0114, B:42:0x011e, B:43:0x0128, B:45:0x012d, B:55:0x0165, B:59:0x016c, B:61:0x0177, B:64:0x018a, B:65:0x0190, B:66:0x0191, B:74:0x01a7, B:75:0x01aa, B:80:0x01b2, B:82:0x01be, B:86:0x01e1, B:87:0x01ed, B:88:0x01ee, B:89:0x01fa, B:90:0x01fb, B:91:0x0223), top: B:129:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0256 A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #6 {all -> 0x00cb, blocks: (B:20:0x009f, B:103:0x0236, B:105:0x0248, B:107:0x0256, B:21:0x00a5, B:23:0x00ae, B:26:0x00c7, B:34:0x00d4, B:35:0x00d7, B:36:0x00d8, B:37:0x00f6, B:39:0x00fc, B:41:0x0114, B:42:0x011e, B:43:0x0128, B:45:0x012d, B:55:0x0165, B:59:0x016c, B:61:0x0177, B:64:0x018a, B:65:0x0190, B:66:0x0191, B:74:0x01a7, B:75:0x01aa, B:80:0x01b2, B:82:0x01be, B:86:0x01e1, B:87:0x01ed, B:88:0x01ee, B:89:0x01fa, B:90:0x01fb, B:91:0x0223), top: B:129:0x009f }] */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dl1
    /* JADX INFO: renamed from: a */
    public final su0 mo5679a(ru0 ru0Var) throws Exception {
        HttpURLConnection httpURLConnection;
        su0 su0Var;
        InputStreamReader inputStreamReader;
        ru0 ru0Var2 = ru0Var;
        String str = ru0Var2.f19067a;
        int i = ru0Var2.f19068b;
        Map<String, String> map = ru0Var2.f19069c;
        String str2 = ru0Var2.f19070d;
        long jMo5621a = C2330u.f10884a.f10896k.mo5621a();
        try {
            su0 su0Var2 = new su0();
            String strValueOf = String.valueOf(this.f19987b);
            C2622l.m5458x3(strValueOf.length() != 0 ? "SDK version: ".concat(strValueOf) : new String("SDK version: "));
            String strValueOf2 = String.valueOf(str);
            C2622l.m5318U2(strValueOf2.length() != 0 ? "AdRequestServiceImpl: Sending request: ".concat(strValueOf2) : new String("AdRequestServiceImpl: Sending request: "));
            URL url = new URL(str);
            HashMap map2 = new HashMap();
            int i2 = 0;
            while (true) {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                try {
                    HttpURLConnection httpURLConnection3 = httpURLConnection2;
                    su0 su0Var3 = su0Var2;
                    try {
                        C2330u.f10884a.f10889d.m4765A(this.f19986a, this.f19987b, false, httpURLConnection2, false, i);
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            httpURLConnection = httpURLConnection3;
                            try {
                                try {
                                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                                    httpURLConnection3 = httpURLConnection;
                                } catch (or0 e) {
                                    e = e;
                                    su0Var = su0Var3;
                                    if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14273T4)).booleanValue()) {
                                        throw e;
                                    }
                                    su0Var.f19704d = C2330u.f10884a.f10896k.mo5621a() - jMo5621a;
                                    httpURLConnection.disconnect();
                                    return su0Var;
                                }
                            } catch (Throwable th) {
                                th = th;
                                httpURLConnection.disconnect();
                                throw th;
                            }
                        }
                        httpURLConnection = httpURLConnection3;
                        BufferedOutputStream bufferedOutputStream = null;
                        if (str2.length() > 0) {
                            byte[] bytes = str2.getBytes(bs1.f12807a);
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bytes);
                                    try {
                                        bufferedOutputStream2.close();
                                    } catch (IOException unused) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    if (bufferedOutputStream != null) {
                                        try {
                                            bufferedOutputStream.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        C3553tn c3553tn = new C3553tn(null);
                        c3553tn.m8433a(httpURLConnection, str2.getBytes(bs1.f12807a));
                        int responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (map2.containsKey(key)) {
                                ((List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new ArrayList(value));
                            }
                        }
                        c3553tn.m8434b(httpURLConnection, responseCode);
                        su0Var = su0Var3;
                        try {
                            su0Var.f19701a = responseCode;
                            su0Var.f19702b = map2;
                            su0Var.f19703c = "";
                            if (responseCode >= 200 && responseCode < 300) {
                                try {
                                    inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                                    try {
                                        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                                        StringBuilder sb = new StringBuilder(8192);
                                        char[] cArr = new char[2048];
                                        while (true) {
                                            int i3 = inputStreamReader.read(cArr);
                                            if (i3 == -1) {
                                                break;
                                            }
                                            sb.append(cArr, 0, i3);
                                        }
                                        String string = sb.toString();
                                        try {
                                            inputStreamReader.close();
                                        } catch (IOException unused3) {
                                        }
                                        c3553tn.m8435c(string);
                                        su0Var.f19703c = string;
                                        if (TextUtils.isEmpty(string)) {
                                            if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14363h3)).booleanValue()) {
                                                throw new or0(3);
                                            }
                                        }
                                        su0Var.f19704d = C2330u.f10884a.f10896k.mo5621a() - jMo5621a;
                                        break;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (inputStreamReader != null) {
                                            try {
                                                inputStreamReader.close();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStreamReader = null;
                                }
                            } else {
                                if (responseCode < 300 || responseCode >= 400) {
                                    StringBuilder sb2 = new StringBuilder(46);
                                    sb2.append("Received error HTTP response code: ");
                                    sb2.append(responseCode);
                                    C2622l.m5226A3(sb2.toString());
                                    StringBuilder sb3 = new StringBuilder(46);
                                    sb3.append("Received error HTTP response code: ");
                                    sb3.append(responseCode);
                                    throw new or0(1, sb3.toString());
                                }
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (TextUtils.isEmpty(headerField)) {
                                    C2622l.m5226A3("No location header to follow redirect.");
                                    throw new or0(1, "No location header to follow redirect");
                                }
                                URL url2 = new URL(headerField);
                                int i4 = i2 + 1;
                                if (i4 > ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14253Q2)).intValue()) {
                                    C2622l.m5226A3("Too many redirects.");
                                    throw new or0(1, "Too many redirects");
                                }
                                httpURLConnection.disconnect();
                                i2 = i4;
                                su0Var2 = su0Var;
                                url = url2;
                            }
                        } catch (or0 e2) {
                            e = e2;
                            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14273T4)).booleanValue()) {
                                throw e;
                            }
                            su0Var.f19704d = C2330u.f10884a.f10896k.mo5621a() - jMo5621a;
                        }
                    } catch (or0 e3) {
                        e = e3;
                        httpURLConnection = httpURLConnection3;
                    } catch (Throwable th6) {
                        th = th6;
                        httpURLConnection = httpURLConnection3;
                    }
                } catch (or0 e4) {
                    e = e4;
                    httpURLConnection = httpURLConnection2;
                    su0Var = su0Var2;
                } catch (Throwable th7) {
                    th = th7;
                    httpURLConnection = httpURLConnection2;
                }
            }
            httpURLConnection.disconnect();
            return su0Var;
        } catch (IOException e5) {
            String strValueOf3 = String.valueOf(e5.getMessage());
            String strConcat = strValueOf3.length() != 0 ? "Error while connecting to ad server: ".concat(strValueOf3) : new String("Error while connecting to ad server: ");
            C2622l.m5226A3(strConcat);
            throw new or0(1, strConcat, e5);
        }
    }
}
