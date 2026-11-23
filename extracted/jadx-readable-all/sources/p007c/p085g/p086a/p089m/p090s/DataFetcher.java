package p007c.p085g.p086a.p089m.p090s;

import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;

/* JADX INFO: renamed from: c.g.a.m.s.d, reason: use source file name */
/* JADX INFO: compiled from: DataFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public interface DataFetcher<T> {

    /* JADX INFO: renamed from: c.g.a.m.s.d$a */
    /* JADX INFO: compiled from: DataFetcher.java */
    public interface a<T> {
        /* JADX INFO: renamed from: c */
        void mo1720c(Exception exc);

        /* JADX INFO: renamed from: f */
        void mo1721f(T t);
    }

    /* JADX INFO: renamed from: a */
    Class<T> mo1712a();

    /* JADX INFO: renamed from: b */
    void mo1715b();

    void cancel();

    /* JADX INFO: renamed from: d */
    DataSource mo1717d();

    /* JADX INFO: renamed from: e */
    void mo1718e(Priority priority, a<? super T> aVar);
}
