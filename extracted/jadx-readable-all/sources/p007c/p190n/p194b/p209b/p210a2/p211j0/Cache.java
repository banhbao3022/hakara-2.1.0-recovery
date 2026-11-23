package p007c.p190n.p194b.p209b.p210a2.p211j0;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.c, reason: use source file name */
/* JADX INFO: compiled from: Cache.java */
/* JADX INFO: loaded from: classes.dex */
public interface Cache {

    /* JADX INFO: renamed from: c.n.b.b.a2.j0.c$a */
    /* JADX INFO: compiled from: Cache.java */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.j0.c$b */
    /* JADX INFO: compiled from: Cache.java */
    public interface b {
        /* JADX INFO: renamed from: b */
        void mo2939b(Cache cache, CacheSpan cacheSpan);

        /* JADX INFO: renamed from: c */
        void mo2940c(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2);

        /* JADX INFO: renamed from: d */
        void mo2941d(Cache cache, CacheSpan cacheSpan);
    }

    /* JADX INFO: renamed from: a */
    File mo2930a(String str, long j2, long j3) throws a;

    /* JADX INFO: renamed from: b */
    ContentMetadata2 mo2931b(String str);

    /* JADX INFO: renamed from: c */
    void mo2932c(String str, ContentMetadataMutations contentMetadataMutations) throws a;

    /* JADX INFO: renamed from: d */
    void mo2933d(CacheSpan cacheSpan);

    /* JADX INFO: renamed from: e */
    CacheSpan mo2934e(String str, long j2, long j3) throws a;

    /* JADX INFO: renamed from: f */
    CacheSpan mo2935f(String str, long j2, long j3) throws InterruptedException, a;

    /* JADX INFO: renamed from: g */
    void mo2936g(File file, long j2) throws a;

    /* JADX INFO: renamed from: h */
    long mo2937h();

    /* JADX INFO: renamed from: i */
    void mo2938i(CacheSpan cacheSpan);
}
