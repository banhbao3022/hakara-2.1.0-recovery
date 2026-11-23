package p007c.p190n.p194b.p209b.p210a2.p211j0;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.q, reason: use source file name */
/* JADX INFO: compiled from: LeastRecentlyUsedCacheEvictor.java */
/* JADX INFO: loaded from: classes.dex */
public final class LeastRecentlyUsedCacheEvictor implements CacheEvictor {

    /* JADX INFO: renamed from: a */
    public final long f6110a;

    /* JADX INFO: renamed from: b */
    public final TreeSet<CacheSpan> f6111b = new TreeSet<>(new Comparator() { // from class: c.n.b.b.a2.j0.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            CacheSpan cacheSpan = (CacheSpan) obj;
            CacheSpan cacheSpan2 = (CacheSpan) obj2;
            long j2 = cacheSpan.f6079k;
            long j3 = cacheSpan2.f6079k;
            if (j2 - j3 == 0) {
                return cacheSpan.compareTo(cacheSpan2);
            }
            return j2 < j3 ? -1 : 1;
        }
    });

    /* JADX INFO: renamed from: c */
    public long f6112c;

    public LeastRecentlyUsedCacheEvictor(long j2) {
        this.f6110a = j2;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CacheEvictor
    /* JADX INFO: renamed from: a */
    public void mo2954a(Cache cache, String str, long j2, long j3) {
        if (j3 != -1) {
            m2986g(cache, j3);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.Cache.b
    /* JADX INFO: renamed from: b */
    public void mo2939b(Cache cache, CacheSpan cacheSpan) {
        this.f6111b.remove(cacheSpan);
        this.f6112c -= cacheSpan.f6076h;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.Cache.b
    /* JADX INFO: renamed from: c */
    public void mo2940c(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        this.f6111b.remove(cacheSpan);
        this.f6112c -= cacheSpan.f6076h;
        mo2941d(cache, cacheSpan2);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.Cache.b
    /* JADX INFO: renamed from: d */
    public void mo2941d(Cache cache, CacheSpan cacheSpan) {
        this.f6111b.add(cacheSpan);
        this.f6112c += cacheSpan.f6076h;
        m2986g(cache, 0L);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CacheEvictor
    /* JADX INFO: renamed from: e */
    public void mo2955e() {
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CacheEvictor
    /* JADX INFO: renamed from: f */
    public boolean mo2956f() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m2986g(Cache cache, long j2) {
        while (this.f6112c + j2 > this.f6110a && !this.f6111b.isEmpty()) {
            cache.mo2933d(this.f6111b.first());
        }
    }
}
