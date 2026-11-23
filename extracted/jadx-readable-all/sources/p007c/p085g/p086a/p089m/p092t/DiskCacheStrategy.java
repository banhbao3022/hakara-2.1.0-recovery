package p007c.p085g.p086a.p089m.p092t;

import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.EncodeStrategy;

/* JADX INFO: renamed from: c.g.a.m.t.k, reason: use source file name */
/* JADX INFO: compiled from: DiskCacheStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class DiskCacheStrategy {

    /* JADX INFO: renamed from: a */
    public static final DiskCacheStrategy f3274a;

    /* JADX INFO: renamed from: b */
    public static final DiskCacheStrategy f3275b;

    /* JADX INFO: renamed from: c */
    public static final DiskCacheStrategy f3276c;

    /* JADX INFO: renamed from: d */
    public static final DiskCacheStrategy f3277d;

    /* JADX INFO: renamed from: c.g.a.m.t.k$a */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class a extends DiskCacheStrategy {
        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: a */
        public boolean mo1809a() {
            return true;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: b */
        public boolean mo1810b() {
            return true;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: c */
        public boolean mo1811c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: d */
        public boolean mo1812d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.k$b */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class b extends DiskCacheStrategy {
        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: a */
        public boolean mo1809a() {
            return false;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: b */
        public boolean mo1810b() {
            return false;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: c */
        public boolean mo1811c(DataSource dataSource) {
            return false;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: d */
        public boolean mo1812d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.k$c */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class c extends DiskCacheStrategy {
        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: a */
        public boolean mo1809a() {
            return true;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: b */
        public boolean mo1810b() {
            return false;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: c */
        public boolean mo1811c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: d */
        public boolean mo1812d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.k$d */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class d extends DiskCacheStrategy {
        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: a */
        public boolean mo1809a() {
            return false;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: b */
        public boolean mo1810b() {
            return true;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: c */
        public boolean mo1811c(DataSource dataSource) {
            return false;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: d */
        public boolean mo1812d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.k$e */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class e extends DiskCacheStrategy {
        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: a */
        public boolean mo1809a() {
            return true;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: b */
        public boolean mo1810b() {
            return true;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: c */
        public boolean mo1811c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy
        /* JADX INFO: renamed from: d */
        public boolean mo1812d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    static {
        new a();
        f3274a = new b();
        f3275b = new c();
        f3276c = new d();
        f3277d = new e();
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo1809a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo1810b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo1811c(DataSource dataSource);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo1812d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
