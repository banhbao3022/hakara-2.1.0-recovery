package p007c.p190n.p194b.p209b.p210a2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.b.a2.x, reason: use source file name */
/* JADX INFO: compiled from: DummyDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class DummyDataSource implements DataSource3 {

    /* JADX INFO: renamed from: a */
    public static final DummyDataSource f6236a = new DummyDataSource();

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: c */
    public void mo2915c(TransferListener transferListener) {
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    public void close() {
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws IOException {
        throw new IOException("DummyDataSource cannot be opened");
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: j */
    public /* synthetic */ Map mo2916j() {
        return DataSource2.m2999a(this);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        return null;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
