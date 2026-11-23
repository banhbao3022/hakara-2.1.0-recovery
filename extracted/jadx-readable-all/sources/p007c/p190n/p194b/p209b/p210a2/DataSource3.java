package p007c.p190n.p194b.p209b.p210a2;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.b.a2.m, reason: use source file name */
/* JADX INFO: compiled from: DataSource.java */
/* JADX INFO: loaded from: classes.dex */
public interface DataSource3 extends DataReader {

    /* JADX INFO: renamed from: c.n.b.b.a2.m$a */
    /* JADX INFO: compiled from: DataSource.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        DataSource3 mo2953a();
    }

    /* JADX INFO: renamed from: c */
    void mo2915c(TransferListener transferListener);

    void close() throws IOException;

    /* JADX INFO: renamed from: h */
    long mo2913h(DataSpec dataSpec) throws IOException;

    /* JADX INFO: renamed from: j */
    Map<String, List<String>> mo2916j();

    /* JADX INFO: renamed from: n */
    Uri mo2914n();
}
