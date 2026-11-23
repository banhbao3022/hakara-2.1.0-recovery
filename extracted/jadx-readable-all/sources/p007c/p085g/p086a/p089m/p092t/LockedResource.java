package p007c.p085g.p086a.p089m.p092t;

import java.util.Objects;
import p007c.p085g.p086a.p112s.p113k.FactoryPools;
import p007c.p085g.p086a.p112s.p113k.StateVerifier;
import p636z0.p725k.p738k.Pools2;

/* JADX INFO: renamed from: c.g.a.m.t.v, reason: use source file name */
/* JADX INFO: compiled from: LockedResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class LockedResource<Z> implements Resource2<Z>, FactoryPools.d {

    /* JADX INFO: renamed from: f */
    public static final Pools2<LockedResource<?>> f3365f = FactoryPools.m2055a(20, new a());

    /* JADX INFO: renamed from: g */
    public final StateVerifier f3366g = new StateVerifier.b();

    /* JADX INFO: renamed from: h */
    public Resource2<Z> f3367h;

    /* JADX INFO: renamed from: i */
    public boolean f3368i;

    /* JADX INFO: renamed from: j */
    public boolean f3369j;

    /* JADX INFO: renamed from: c.g.a.m.t.v$a */
    /* JADX INFO: compiled from: LockedResource.java */
    public class a implements FactoryPools.b<LockedResource<?>> {
        @Override // p007c.p085g.p086a.p112s.p113k.FactoryPools.b
        public LockedResource<?> create() {
            return new LockedResource<>();
        }
    }

    /* JADX INFO: renamed from: a */
    public static <Z> LockedResource<Z> m1843a(Resource2<Z> resource2) {
        LockedResource<Z> lockedResource = (LockedResource) f3365f.mo2057a();
        Objects.requireNonNull(lockedResource, "Argument must not be null");
        lockedResource.f3369j = false;
        lockedResource.f3368i = true;
        lockedResource.f3367h = resource2;
        return lockedResource;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: b */
    public synchronized void mo1830b() {
        this.f3366g.mo2059a();
        this.f3369j = true;
        if (!this.f3368i) {
            this.f3367h.mo1830b();
            this.f3367h = null;
            f3365f.mo2058b(this);
        }
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: c */
    public int mo1831c() {
        return this.f3367h.mo1831c();
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: d */
    public Class<Z> mo1832d() {
        return this.f3367h.mo1832d();
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m1844e() {
        this.f3366g.mo2059a();
        if (!this.f3368i) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f3368i = false;
        if (this.f3369j) {
            mo1830b();
        }
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    public Z get() {
        return this.f3367h.get();
    }

    @Override // p007c.p085g.p086a.p112s.p113k.FactoryPools.d
    /* JADX INFO: renamed from: l */
    public StateVerifier mo1785l() {
        return this.f3366g;
    }
}
