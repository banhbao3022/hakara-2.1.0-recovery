package p007c.p190n.p194b.p209b.p218q1;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.p210a2.DataSourceInputStream;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.HttpDataSource;
import p007c.p190n.p194b.p209b.p210a2.StatsDataSource;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p380b.RegularImmutableMap;

/* JADX INFO: renamed from: c.n.b.b.q1.f0, reason: use source file name */
/* JADX INFO: compiled from: HttpMediaDrmCallback.java */
/* JADX INFO: loaded from: classes.dex */
public final class HttpMediaDrmCallback implements MediaDrmCallback {

    /* JADX INFO: renamed from: a */
    public final HttpDataSource.c f7336a;

    /* JADX INFO: renamed from: b */
    public final String f7337b;

    /* JADX INFO: renamed from: c */
    public final boolean f7338c;

    /* JADX INFO: renamed from: d */
    public final Map<String, String> f7339d;

    public HttpMediaDrmCallback(String str, HttpDataSource.c cVar) {
        this(str, false, cVar);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m3664b(HttpDataSource.c cVar, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        Map<String, List<String>> map2;
        List<String> list;
        StatsDataSource statsDataSource = new StatsDataSource(cVar.mo2953a());
        DataSpec.b bVar = new DataSpec.b();
        bVar.f6147a = Uri.parse(str);
        bVar.f6151e = map;
        bVar.f6149c = 2;
        bVar.f6150d = bArr;
        bVar.f6155i = 1;
        DataSpec dataSpecM3005a = bVar.m3005a();
        int i = 0;
        DataSpec dataSpecM3005a2 = dataSpecM3005a;
        int i2 = 0;
        while (true) {
            try {
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(statsDataSource, dataSpecM3005a2);
                try {
                    byte[] bArrM3110S = Util6.m3110S(dataSourceInputStream);
                    int i3 = Util6.f6307a;
                    try {
                        dataSourceInputStream.close();
                    } catch (IOException unused) {
                    }
                    return bArrM3110S;
                } catch (HttpDataSource.f e) {
                    try {
                        int i4 = e.f6242f;
                        String str2 = null;
                        if (((i4 == 307 || i4 == 308) && i2 < 5) && (map2 = e.f6243g) != null && (list = map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = list.get(i);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i2++;
                        DataSpec.b bVarM3001a = dataSpecM3005a2.m3001a();
                        bVarM3001a.f6147a = Uri.parse(str2);
                        dataSpecM3005a2 = bVarM3001a.m3005a();
                        int i5 = Util6.f6307a;
                        try {
                            dataSourceInputStream.close();
                        } catch (IOException unused2) {
                        }
                    } catch (Throwable th) {
                        int i6 = Util6.f6307a;
                        try {
                            dataSourceInputStream.close();
                        } catch (IOException unused3) {
                        }
                        throw th;
                    }
                }
            } catch (Exception e2) {
                Uri uri = statsDataSource.f5998c;
                Objects.requireNonNull(uri);
                throw new MediaDrmCallbackException(dataSpecM3005a, uri, statsDataSource.mo2916j(), statsDataSource.f5997b, e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m3665a(UUID uuid, ExoMediaDrm.b bVar) throws MediaDrmCallbackException {
        String str;
        String str2 = bVar.f7320b;
        if (this.f7338c || TextUtils.isEmpty(str2)) {
            str2 = this.f7337b;
        }
        if (TextUtils.isEmpty(str2)) {
            DataSpec.b bVar2 = new DataSpec.b();
            bVar2.f6147a = Uri.EMPTY;
            throw new MediaDrmCallbackException(bVar2.m3005a(), Uri.EMPTY, RegularImmutableMap.f26222i, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C.f6407e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = C.f6405c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put(HttpHeaders.CONTENT_TYPE, str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f7339d) {
            map.putAll(this.f7339d);
        }
        return m3664b(this.f7336a, str2, bVar.f7319a, map);
    }

    /* JADX INFO: renamed from: c */
    public byte[] m3666c(UUID uuid, ExoMediaDrm.e eVar) throws MediaDrmCallbackException {
        return m3664b(this.f7336a, eVar.f7322b + "&signedRequest=" + Util6.m3127o(eVar.f7321a), null, Collections.emptyMap());
    }

    public HttpMediaDrmCallback(String str, boolean z, HttpDataSource.c cVar) {
        C2096e.m4566b((z && TextUtils.isEmpty(str)) ? false : true);
        this.f7336a = cVar;
        this.f7337b = str;
        this.f7338c = z;
        this.f7339d = new HashMap();
    }
}
