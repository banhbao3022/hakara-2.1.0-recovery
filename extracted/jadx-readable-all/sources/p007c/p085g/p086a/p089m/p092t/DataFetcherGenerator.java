package p007c.p085g.p086a.p089m.p092t;

import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;

/* JADX INFO: renamed from: c.g.a.m.t.g, reason: use source file name */
/* JADX INFO: compiled from: DataFetcherGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public interface DataFetcherGenerator {

    /* JADX INFO: renamed from: c.g.a.m.t.g$a */
    /* JADX INFO: compiled from: DataFetcherGenerator.java */
    public interface a {
        /* JADX INFO: renamed from: f */
        void mo1735f(Key key, Exception exc, DataFetcher<?> dataFetcher, DataSource dataSource);

        /* JADX INFO: renamed from: h */
        void mo1736h();

        /* JADX INFO: renamed from: j */
        void mo1737j(Key key, Object obj, DataFetcher<?> dataFetcher, DataSource dataSource, Key key2);
    }

    /* JADX INFO: renamed from: a */
    boolean mo1734a();

    void cancel();
}
