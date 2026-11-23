package p007c.p085g.p086a.p089m.p092t;

import java.util.Objects;
import p007c.p085g.p086a.p089m.Key;

/* JADX INFO: renamed from: c.g.a.m.t.q, reason: use source file name */
/* JADX INFO: compiled from: EngineResource.java */
/* JADX INFO: loaded from: classes.dex */
public class EngineResource<Z> implements Resource2<Z> {

    /* JADX INFO: renamed from: f */
    public final boolean f3345f;

    /* JADX INFO: renamed from: g */
    public final boolean f3346g;

    /* JADX INFO: renamed from: h */
    public final Resource2<Z> f3347h;

    /* JADX INFO: renamed from: i */
    public final a f3348i;

    /* JADX INFO: renamed from: j */
    public final Key f3349j;

    /* JADX INFO: renamed from: k */
    public int f3350k;

    /* JADX INFO: renamed from: l */
    public boolean f3351l;

    /* JADX INFO: renamed from: c.g.a.m.t.q$a */
    /* JADX INFO: compiled from: EngineResource.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1814a(Key key, EngineResource<?> engineResource);
    }

    public EngineResource(Resource2<Z> resource2, boolean z, boolean z2, Key key, a aVar) {
        Objects.requireNonNull(resource2, "Argument must not be null");
        this.f3347h = resource2;
        this.f3345f = z;
        this.f3346g = z2;
        this.f3349j = key;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f3348i = aVar;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1829a() {
        if (this.f3351l) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f3350k++;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: b */
    public synchronized void mo1830b() {
        if (this.f3350k > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f3351l) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f3351l = true;
        if (this.f3346g) {
            this.f3347h.mo1830b();
        }
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: c */
    public int mo1831c() {
        return this.f3347h.mo1831c();
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: d */
    public Class<Z> mo1832d() {
        return this.f3347h.mo1832d();
    }

    /* JADX INFO: renamed from: e */
    public void m1833e() {
        boolean z;
        synchronized (this) {
            int i = this.f3350k;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f3350k = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f3348i.mo1814a(this.f3349j, this);
        }
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    public Z get() {
        return this.f3347h.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f3345f + ", listener=" + this.f3348i + ", key=" + this.f3349j + ", acquired=" + this.f3350k + ", isRecycled=" + this.f3351l + ", resource=" + this.f3347h + '}';
    }
}
