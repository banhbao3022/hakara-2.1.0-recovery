package p007c.p190n.p194b.p209b.p210a2;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p378c.p379a.Charsets;

/* JADX INFO: renamed from: c.n.b.b.a2.j, reason: use source file name */
/* JADX INFO: compiled from: DataSchemeDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class DataSchemeDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public DataSpec f6024e;

    /* JADX INFO: renamed from: f */
    public byte[] f6025f;

    /* JADX INFO: renamed from: g */
    public int f6026g;

    /* JADX INFO: renamed from: h */
    public int f6027h;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    public void close() {
        if (this.f6025f != null) {
            this.f6025f = null;
            m2923r();
        }
        this.f6024e = null;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws IOException {
        m2924s(dataSpec);
        this.f6024e = dataSpec;
        this.f6027h = (int) dataSpec.f6142f;
        Uri uri = dataSpec.f6137a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new ParserException(outline.m1599u("Unsupported scheme: ", scheme));
        }
        String[] strArrM3106O = Util6.m3106O(uri.getSchemeSpecificPart(), ",");
        if (strArrM3106O.length != 2) {
            throw new ParserException(outline.m1596r("Unexpected URI format: ", uri));
        }
        String str = strArrM3106O[1];
        if (strArrM3106O[0].contains(";base64")) {
            try {
                this.f6025f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(outline.m1599u("Error while parsing Base64 encoded string: ", str), e);
            }
        } else {
            this.f6025f = Util6.m3093B(URLDecoder.decode(str, Charsets.f26129a.name()));
        }
        long j2 = dataSpec.f6143g;
        int length = j2 != -1 ? ((int) j2) + this.f6027h : this.f6025f.length;
        this.f6026g = length;
        if (length > this.f6025f.length || this.f6027h > length) {
            this.f6025f = null;
            throw new DataSourceException(0);
        }
        m2925t(dataSpec);
        return ((long) this.f6026g) - ((long) this.f6027h);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        DataSpec dataSpec = this.f6024e;
        if (dataSpec != null) {
            return dataSpec.f6137a;
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f6026g - this.f6027h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f6025f;
        int i4 = Util6.f6307a;
        System.arraycopy(bArr2, this.f6027h, bArr, i, iMin);
        this.f6027h += iMin;
        m2922q(iMin);
        return iMin;
    }
}
