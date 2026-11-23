package p007c.p085g.p086a.p089m.p092t.p094d0;

import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p092t.Engine;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p112s.LruCache;

/* JADX INFO: renamed from: c.g.a.m.t.d0.g, reason: use source file name */
/* JADX INFO: compiled from: LruResourceCache.java */
/* JADX INFO: loaded from: classes.dex */
public class LruResourceCache extends LruCache<Key, Resource2<?>> implements MemoryCache {

    /* JADX INFO: renamed from: d */
    public MemoryCache.a f3168d;

    public LruResourceCache(long j2) {
        super(j2);
    }

    @Override // p007c.p085g.p086a.p112s.LruCache
    /* JADX INFO: renamed from: b */
    public int mo1781b(Resource2<?> resource2) {
        Resource2<?> resource3 = resource2;
        if (resource3 == null) {
            return 1;
        }
        return resource3.mo1831c();
    }

    @Override // p007c.p085g.p086a.p112s.LruCache
    /* JADX INFO: renamed from: c */
    public void mo1782c(Key key, Resource2<?> resource2) {
        Resource2<?> resource3 = resource2;
        MemoryCache.a aVar = this.f3168d;
        if (aVar == null || resource3 == null) {
            return;
        }
        ((Engine) aVar).f3283f.m1845a(resource3, true);
    }
}
