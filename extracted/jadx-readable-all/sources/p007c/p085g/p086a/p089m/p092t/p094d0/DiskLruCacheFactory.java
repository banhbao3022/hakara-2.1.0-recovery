package p007c.p085g.p086a.p089m.p092t.p094d0;

import java.io.File;

/* JADX INFO: renamed from: c.g.a.m.t.d0.d, reason: use source file name */
/* JADX INFO: compiled from: DiskLruCacheFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class DiskLruCacheFactory implements DiskCache.a {

    /* JADX INFO: renamed from: a */
    public final long f3156a;

    /* JADX INFO: renamed from: b */
    public final c f3157b;

    /* JADX INFO: renamed from: c.g.a.m.t.d0.d$a */
    /* JADX INFO: compiled from: DiskLruCacheFactory.java */
    public class a implements c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f3158a;

        public a(String str) {
            this.f3158a = str;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.p094d0.DiskLruCacheFactory.c
        /* JADX INFO: renamed from: a */
        public File mo1779a() {
            return new File(this.f3158a);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.d0.d$b */
    /* JADX INFO: compiled from: DiskLruCacheFactory.java */
    public class b implements c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f3159a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f3160b;

        public b(String str, String str2) {
            this.f3159a = str;
            this.f3160b = str2;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.p094d0.DiskLruCacheFactory.c
        /* JADX INFO: renamed from: a */
        public File mo1779a() {
            return new File(this.f3159a, this.f3160b);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.d0.d$c */
    /* JADX INFO: compiled from: DiskLruCacheFactory.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        File mo1779a();
    }

    public DiskLruCacheFactory(String str, long j2) {
        this(new a(str), j2);
    }

    public DiskLruCacheFactory(String str, String str2, long j2) {
        this(new b(str, str2), j2);
    }

    public DiskLruCacheFactory(c cVar, long j2) {
        this.f3156a = j2;
        this.f3157b = cVar;
    }
}
