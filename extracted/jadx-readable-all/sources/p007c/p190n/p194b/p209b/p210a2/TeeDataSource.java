package p007c.p190n.p194b.p209b.p210a2;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.b.a2.g0, reason: use source file name */
/* JADX INFO: compiled from: TeeDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class TeeDataSource implements DataSource3 {

    /* JADX INFO: renamed from: a */
    public final DataSource3 f6004a;

    /* JADX INFO: renamed from: b */
    public final DataSink f6005b;

    /* JADX INFO: renamed from: c */
    public boolean f6006c;

    /* JADX INFO: renamed from: d */
    public long f6007d;

    public TeeDataSource(DataSource3 dataSource3, DataSink dataSink) {
        Objects.requireNonNull(dataSource3);
        this.f6004a = dataSource3;
        Objects.requireNonNull(dataSink);
        this.f6005b = dataSink;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: c */
    public void mo2915c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f6004a.mo2915c(transferListener);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    public void close() throws IOException {
        try {
            this.f6004a.close();
        } finally {
            if (this.f6006c) {
                this.f6006c = false;
                this.f6005b.close();
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws IOException {
        long jMo2913h = this.f6004a.mo2913h(dataSpec);
        this.f6007d = jMo2913h;
        if (jMo2913h == 0) {
            return 0L;
        }
        if (dataSpec.f6143g == -1 && jMo2913h != -1) {
            dataSpec = dataSpec.m3004e(0L, jMo2913h);
        }
        this.f6006c = true;
        this.f6005b.mo2945h(dataSpec);
        return this.f6007d;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: j */
    public Map<String, List<String>> mo2916j() {
        return this.f6004a.mo2916j();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        return this.f6004a.mo2914n();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f6007d == 0) {
            return -1;
        }
        int i3 = this.f6004a.read(bArr, i, i2);
        if (i3 > 0) {
            this.f6005b.mo2944g(bArr, i, i3);
            long j2 = this.f6007d;
            if (j2 != -1) {
                this.f6007d = j2 - ((long) i3);
            }
        }
        return i3;
    }
}
