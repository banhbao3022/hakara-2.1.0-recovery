package p007c.p190n.p194b.p209b.p210a2;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.PriorityTaskManager;

/* JADX INFO: renamed from: c.n.b.b.a2.e0, reason: use source file name */
/* JADX INFO: compiled from: PriorityDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class PriorityDataSource implements DataSource3 {

    /* JADX INFO: renamed from: a */
    public final DataSource3 f5989a;

    /* JADX INFO: renamed from: b */
    public final PriorityTaskManager f5990b;

    /* JADX INFO: renamed from: c */
    public final int f5991c;

    public PriorityDataSource(DataSource3 dataSource3, PriorityTaskManager priorityTaskManager, int i) {
        Objects.requireNonNull(dataSource3);
        this.f5989a = dataSource3;
        Objects.requireNonNull(priorityTaskManager);
        this.f5990b = priorityTaskManager;
        this.f5991c = i;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: c */
    public void mo2915c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f5989a.mo2915c(transferListener);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    public void close() throws IOException {
        this.f5989a.close();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws IOException {
        this.f5990b.m3233a(this.f5991c);
        return this.f5989a.mo2913h(dataSpec);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: j */
    public Map<String, List<String>> mo2916j() {
        return this.f5989a.mo2916j();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        return this.f5989a.mo2914n();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.f5990b.m3233a(this.f5991c);
        return this.f5989a.read(bArr, i, i2);
    }
}
