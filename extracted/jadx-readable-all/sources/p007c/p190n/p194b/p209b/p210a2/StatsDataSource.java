package p007c.p190n.p194b.p209b.p210a2;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.b.a2.f0, reason: use source file name */
/* JADX INFO: compiled from: StatsDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class StatsDataSource implements DataSource3 {

    /* JADX INFO: renamed from: a */
    public final DataSource3 f5996a;

    /* JADX INFO: renamed from: b */
    public long f5997b;

    /* JADX INFO: renamed from: c */
    public Uri f5998c;

    /* JADX INFO: renamed from: d */
    public Map<String, List<String>> f5999d;

    public StatsDataSource(DataSource3 dataSource3) {
        Objects.requireNonNull(dataSource3);
        this.f5996a = dataSource3;
        this.f5998c = Uri.EMPTY;
        this.f5999d = Collections.emptyMap();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: c */
    public void mo2915c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f5996a.mo2915c(transferListener);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    public void close() throws IOException {
        this.f5996a.close();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws IOException {
        this.f5998c = dataSpec.f6137a;
        this.f5999d = Collections.emptyMap();
        long jMo2913h = this.f5996a.mo2913h(dataSpec);
        Uri uriMo2914n = mo2914n();
        Objects.requireNonNull(uriMo2914n);
        this.f5998c = uriMo2914n;
        this.f5999d = mo2916j();
        return jMo2913h;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: j */
    public Map<String, List<String>> mo2916j() {
        return this.f5996a.mo2916j();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        return this.f5996a.mo2914n();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f5996a.read(bArr, i, i2);
        if (i3 != -1) {
            this.f5997b += (long) i3;
        }
        return i3;
    }
}
