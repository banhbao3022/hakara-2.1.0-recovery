package p007c.p190n.p194b.p209b.p210a2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.a2.s, reason: use source file name */
/* JADX INFO: compiled from: DefaultDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultDataSource implements DataSource3 {

    /* JADX INFO: renamed from: a */
    public final Context f6193a;

    /* JADX INFO: renamed from: b */
    public final List<TransferListener> f6194b;

    /* JADX INFO: renamed from: c */
    public final DataSource3 f6195c;

    /* JADX INFO: renamed from: d */
    public DataSource3 f6196d;

    /* JADX INFO: renamed from: e */
    public DataSource3 f6197e;

    /* JADX INFO: renamed from: f */
    public DataSource3 f6198f;

    /* JADX INFO: renamed from: g */
    public DataSource3 f6199g;

    /* JADX INFO: renamed from: h */
    public DataSource3 f6200h;

    /* JADX INFO: renamed from: i */
    public DataSource3 f6201i;

    /* JADX INFO: renamed from: j */
    public DataSource3 f6202j;

    /* JADX INFO: renamed from: k */
    public DataSource3 f6203k;

    public DefaultDataSource(Context context, boolean z) {
        this(context, null, 8000, 8000, z);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: c */
    public void mo2915c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f6195c.mo2915c(transferListener);
        this.f6194b.add(transferListener);
        DataSource3 dataSource3 = this.f6196d;
        if (dataSource3 != null) {
            dataSource3.mo2915c(transferListener);
        }
        DataSource3 dataSource4 = this.f6197e;
        if (dataSource4 != null) {
            dataSource4.mo2915c(transferListener);
        }
        DataSource3 dataSource5 = this.f6198f;
        if (dataSource5 != null) {
            dataSource5.mo2915c(transferListener);
        }
        DataSource3 dataSource6 = this.f6199g;
        if (dataSource6 != null) {
            dataSource6.mo2915c(transferListener);
        }
        DataSource3 dataSource7 = this.f6200h;
        if (dataSource7 != null) {
            dataSource7.mo2915c(transferListener);
        }
        DataSource3 dataSource8 = this.f6201i;
        if (dataSource8 != null) {
            dataSource8.mo2915c(transferListener);
        }
        DataSource3 dataSource9 = this.f6202j;
        if (dataSource9 != null) {
            dataSource9.mo2915c(transferListener);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    public void close() throws IOException {
        DataSource3 dataSource3 = this.f6203k;
        if (dataSource3 != null) {
            try {
                dataSource3.close();
            } finally {
                this.f6203k = null;
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws IOException {
        boolean z = true;
        C2096e.m4570f(this.f6203k == null);
        String scheme = dataSpec.f6137a.getScheme();
        Uri uri = dataSpec.f6137a;
        int i = Util6.f6307a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z = false;
        }
        if (z) {
            String path = dataSpec.f6137a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f6196d == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f6196d = fileDataSource;
                    m3015q(fileDataSource);
                }
                this.f6203k = this.f6196d;
            } else {
                if (this.f6197e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(this.f6193a);
                    this.f6197e = assetDataSource;
                    m3015q(assetDataSource);
                }
                this.f6203k = this.f6197e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f6197e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(this.f6193a);
                this.f6197e = assetDataSource2;
                m3015q(assetDataSource2);
            }
            this.f6203k = this.f6197e;
        } else if ("content".equals(scheme)) {
            if (this.f6198f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(this.f6193a);
                this.f6198f = contentDataSource;
                m3015q(contentDataSource);
            }
            this.f6203k = this.f6198f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f6199g == null) {
                try {
                    DataSource3 dataSource3 = (DataSource3) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f6199g = dataSource3;
                    m3015q(dataSource3);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.f6199g == null) {
                    this.f6199g = this.f6195c;
                }
            }
            this.f6203k = this.f6199g;
        } else if ("udp".equals(scheme)) {
            if (this.f6200h == null) {
                UdpDataSource udpDataSource = new UdpDataSource();
                this.f6200h = udpDataSource;
                m3015q(udpDataSource);
            }
            this.f6203k = this.f6200h;
        } else if ("data".equals(scheme)) {
            if (this.f6201i == null) {
                DataSchemeDataSource dataSchemeDataSource = new DataSchemeDataSource();
                this.f6201i = dataSchemeDataSource;
                m3015q(dataSchemeDataSource);
            }
            this.f6203k = this.f6201i;
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            if (this.f6202j == null) {
                RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f6193a);
                this.f6202j = rawResourceDataSource;
                m3015q(rawResourceDataSource);
            }
            this.f6203k = this.f6202j;
        } else {
            this.f6203k = this.f6195c;
        }
        return this.f6203k.mo2913h(dataSpec);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: j */
    public Map<String, List<String>> mo2916j() {
        DataSource3 dataSource3 = this.f6203k;
        return dataSource3 == null ? Collections.emptyMap() : dataSource3.mo2916j();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        DataSource3 dataSource3 = this.f6203k;
        if (dataSource3 == null) {
            return null;
        }
        return dataSource3.mo2914n();
    }

    /* JADX INFO: renamed from: q */
    public final void m3015q(DataSource3 dataSource3) {
        for (int i = 0; i < this.f6194b.size(); i++) {
            dataSource3.mo2915c(this.f6194b.get(i));
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        DataSource3 dataSource3 = this.f6203k;
        Objects.requireNonNull(dataSource3);
        return dataSource3.read(bArr, i, i2);
    }

    public DefaultDataSource(Context context, String str, boolean z) {
        this(context, str, 8000, 8000, z);
    }

    public DefaultDataSource(Context context, String str, int i, int i2, boolean z) {
        DefaultHttpDataSource.a aVar = new DefaultHttpDataSource.a();
        aVar.f6226b = str;
        aVar.f6227c = i;
        aVar.f6228d = i2;
        aVar.f6229e = z;
        this(context, aVar.mo2953a());
    }

    public DefaultDataSource(Context context, DataSource3 dataSource3) {
        this.f6193a = context.getApplicationContext();
        Objects.requireNonNull(dataSource3);
        this.f6195c = dataSource3;
        this.f6194b = new ArrayList();
    }
}
