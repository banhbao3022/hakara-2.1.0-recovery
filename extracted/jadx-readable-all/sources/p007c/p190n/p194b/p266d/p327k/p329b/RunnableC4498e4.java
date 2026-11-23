package p007c.p190n.p194b.p266d.p327k.p329b;

import com.facebook.stetho.inspector.network.DecompressionHelper;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.e4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4498e4 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final URL f23843f;

    /* JADX INFO: renamed from: g */
    public final byte[] f23844g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC4462b4 f23845h;

    /* JADX INFO: renamed from: i */
    public final String f23846i;

    /* JADX INFO: renamed from: j */
    public final Map<String, String> f23847j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4739z3 f23848k;

    public RunnableC4498e4(C4739z3 c4739z3, String str, URL url, byte[] bArr, Map<String, String> map, InterfaceC4462b4 interfaceC4462b4) {
        this.f23848k = c4739z3;
        C2622l.m5359e(str);
        Objects.requireNonNull(url, "null reference");
        Objects.requireNonNull(interfaceC4462b4, "null reference");
        this.f23843f = url;
        this.f23844g = bArr;
        this.f23845h = interfaceC4462b4;
        this.f23846i = str;
        this.f23847j = map;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnectionM10912s;
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        Throwable th;
        IOException iOException;
        int i;
        int responseCode;
        this.f23848k.mo10380a();
        OutputStream outputStream = null;
        try {
            httpURLConnectionM10912s = this.f23848k.m10912s(this.f23843f);
            try {
                Map<String, String> map3 = this.f23847j;
                if (map3 != null) {
                    for (Map.Entry<String, String> entry : map3.entrySet()) {
                        httpURLConnectionM10912s.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                if (this.f23844g != null) {
                    byte[] bArrM10804T = this.f23848k.m10641h().m10804T(this.f23844g);
                    this.f23848k.mo10684l().f24426n.m10812b("Uploading data. size", Integer.valueOf(bArrM10804T.length));
                    httpURLConnectionM10912s.setDoOutput(true);
                    httpURLConnectionM10912s.addRequestProperty("Content-Encoding", DecompressionHelper.GZIP_ENCODING);
                    httpURLConnectionM10912s.setFixedLengthStreamingMode(bArrM10804T.length);
                    httpURLConnectionM10912s.connect();
                    OutputStream outputStream2 = httpURLConnectionM10912s.getOutputStream();
                    try {
                        outputStream2.write(bArrM10804T);
                        outputStream2.close();
                    } catch (IOException e) {
                        map2 = null;
                        iOException = e;
                        outputStream = outputStream2;
                        responseCode = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e2) {
                                this.f23848k.mo10684l().f24418f.m10813c("Error closing HTTP compressed POST connection output stream. appId", C4662s3.m10738s(this.f23846i), e2);
                            }
                        }
                        if (httpURLConnectionM10912s != null) {
                            httpURLConnectionM10912s.disconnect();
                        }
                        this.f23848k.mo10686n().m10758v(new RunnableC4450a4(this.f23846i, this.f23845h, responseCode, iOException, null, map2, null));
                    } catch (Throwable th2) {
                        map = null;
                        th = th2;
                        outputStream = outputStream2;
                        i = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                this.f23848k.mo10684l().f24418f.m10813c("Error closing HTTP compressed POST connection output stream. appId", C4662s3.m10738s(this.f23846i), e3);
                            }
                        }
                        if (httpURLConnectionM10912s != null) {
                            httpURLConnectionM10912s.disconnect();
                        }
                        this.f23848k.mo10686n().m10758v(new RunnableC4450a4(this.f23846i, this.f23845h, i, null, null, map, null));
                        throw th;
                    }
                }
                responseCode = httpURLConnectionM10912s.getResponseCode();
                try {
                    Map<String, List<String>> headerFields = httpURLConnectionM10912s.getHeaderFields();
                    try {
                        byte[] bArrM10911t = C4739z3.m10911t(httpURLConnectionM10912s);
                        httpURLConnectionM10912s.disconnect();
                        this.f23848k.mo10686n().m10758v(new RunnableC4450a4(this.f23846i, this.f23845h, responseCode, null, bArrM10911t, headerFields, null));
                    } catch (IOException e4) {
                        e = e4;
                        map2 = headerFields;
                        iOException = e;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnectionM10912s != null) {
                            httpURLConnectionM10912s.disconnect();
                        }
                        this.f23848k.mo10686n().m10758v(new RunnableC4450a4(this.f23846i, this.f23845h, responseCode, iOException, null, map2, null));
                    } catch (Throwable th3) {
                        th = th3;
                        i = responseCode;
                        map = headerFields;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnectionM10912s != null) {
                            httpURLConnectionM10912s.disconnect();
                        }
                        this.f23848k.mo10686n().m10758v(new RunnableC4450a4(this.f23846i, this.f23845h, i, null, null, map, null));
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    map2 = null;
                } catch (Throwable th4) {
                    map = null;
                    th = th4;
                    i = responseCode;
                }
            } catch (IOException e6) {
                e = e6;
                map2 = null;
                iOException = e;
                responseCode = 0;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnectionM10912s != null) {
                    httpURLConnectionM10912s.disconnect();
                }
                this.f23848k.mo10686n().m10758v(new RunnableC4450a4(this.f23846i, this.f23845h, responseCode, iOException, null, map2, null));
            } catch (Throwable th5) {
                th = th5;
                map = null;
                th = th;
                i = 0;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnectionM10912s != null) {
                    httpURLConnectionM10912s.disconnect();
                }
                this.f23848k.mo10686n().m10758v(new RunnableC4450a4(this.f23846i, this.f23845h, i, null, null, map, null));
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            httpURLConnectionM10912s = null;
            map2 = null;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnectionM10912s = null;
            map = null;
        }
    }
}
