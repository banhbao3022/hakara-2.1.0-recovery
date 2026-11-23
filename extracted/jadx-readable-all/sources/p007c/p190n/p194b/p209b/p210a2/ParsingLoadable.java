package p007c.p190n.p194b.p209b.p210a2;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;

/* JADX INFO: renamed from: c.n.b.b.a2.d0, reason: use source file name */
/* JADX INFO: compiled from: ParsingLoadable.java */
/* JADX INFO: loaded from: classes.dex */
public final class ParsingLoadable<T> implements Loader.e {

    /* JADX INFO: renamed from: a */
    public final long f5978a;

    /* JADX INFO: renamed from: b */
    public final DataSpec f5979b;

    /* JADX INFO: renamed from: c */
    public final int f5980c;

    /* JADX INFO: renamed from: d */
    public final StatsDataSource f5981d;

    /* JADX INFO: renamed from: e */
    public final a<? extends T> f5982e;

    /* JADX INFO: renamed from: f */
    public volatile T f5983f;

    /* JADX INFO: renamed from: c.n.b.b.a2.d0$a */
    /* JADX INFO: compiled from: ParsingLoadable.java */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        T mo2912a(Uri uri, InputStream inputStream) throws IOException;
    }

    public ParsingLoadable(DataSource3 dataSource3, Uri uri, int i, a<? extends T> aVar) {
        DataSpec.b bVar = new DataSpec.b();
        bVar.f6147a = uri;
        bVar.f6155i = 1;
        this(dataSource3, bVar.m3005a(), i, aVar);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
    /* JADX INFO: renamed from: a */
    public final void mo2909a() throws IOException {
        this.f5981d.f5997b = 0L;
        DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(this.f5981d, this.f5979b);
        try {
            if (!dataSourceInputStream.f6134i) {
                dataSourceInputStream.f6131f.mo2913h(dataSourceInputStream.f6132g);
                dataSourceInputStream.f6134i = true;
            }
            Uri uriMo2914n = this.f5981d.mo2914n();
            Objects.requireNonNull(uriMo2914n);
            this.f5983f = this.f5982e.mo2912a(uriMo2914n, dataSourceInputStream);
        } finally {
            int i = Util6.f6307a;
            try {
                dataSourceInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
    /* JADX INFO: renamed from: b */
    public final void mo2910b() {
    }

    public ParsingLoadable(DataSource3 dataSource3, DataSpec dataSpec, int i, a<? extends T> aVar) {
        this.f5981d = new StatsDataSource(dataSource3);
        this.f5979b = dataSpec;
        this.f5980c = i;
        this.f5982e = aVar;
        this.f5978a = LoadEventInfo.m4367a();
    }
}
