package p007c.p190n.p194b.p195a.p196i;

import com.facebook.stetho.inspector.network.DecompressionHelper;
import com.facebook.stetho.server.http.HttpHeaders;
import com.facebook.stetho.server.http.HttpStatus;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p195a.p196i.p197f.AutoValue_LogResponse;
import p007c.p190n.p194b.p195a.p196i.p197f.LogResponse;
import p007c.p190n.p385d.p413o.EncodingException;
import p007c.p190n.p385d.p413o.p415j.JsonDataEncoderBuilder4;

/* JADX INFO: renamed from: c.n.b.a.i.b, reason: use source file name */
/* JADX INFO: compiled from: CctTransportBackend.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CctTransportBackend {

    /* JADX INFO: renamed from: a */
    public final CctTransportBackend3 f5528a;

    public CctTransportBackend(CctTransportBackend3 cctTransportBackend3) {
        this.f5528a = cctTransportBackend3;
    }

    /* JADX INFO: renamed from: a */
    public Object m2754a(Object obj) throws IOException {
        CctTransportBackend3 cctTransportBackend3 = this.f5528a;
        CctTransportBackend3.a aVar = (CctTransportBackend3.a) obj;
        Objects.requireNonNull(cctTransportBackend3);
        C1095a.m2397m("CctTransportBackend", "Making request to: %s", aVar.f5537a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f5537a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cctTransportBackend3.f5536g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "2.3.3"));
        httpURLConnection.setRequestProperty("Content-Encoding", DecompressionHelper.GZIP_ENCODING);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", DecompressionHelper.GZIP_ENCODING);
        String str = aVar.f5539c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    ((JsonDataEncoderBuilder4) cctTransportBackend3.f5530a).m12055b(aVar.f5538b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    C1095a.m2402r("CctTransportBackend", "Status Code: " + responseCode);
                    C1095a.m2402r("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField(HttpHeaders.CONTENT_TYPE));
                    C1095a.m2402r("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new CctTransportBackend3.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new CctTransportBackend3.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = DecompressionHelper.GZIP_ENCODING.equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            CctTransportBackend3.b bVar = new CctTransportBackend3.b(responseCode, null, ((AutoValue_LogResponse) LogResponse.m2793a(new BufferedReader(new InputStreamReader(gZIPInputStream)))).f5638a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th4;
            }
        } catch (EncodingException e) {
            e = e;
            C1095a.m2399o("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new CctTransportBackend3.b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            C1095a.m2399o("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new CctTransportBackend3.b(HttpStatus.HTTP_INTERNAL_SERVER_ERROR, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            C1095a.m2399o("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new CctTransportBackend3.b(HttpStatus.HTTP_INTERNAL_SERVER_ERROR, null, 0L);
        } catch (IOException e4) {
            e = e4;
            C1095a.m2399o("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new CctTransportBackend3.b(400, null, 0L);
        }
    }
}
