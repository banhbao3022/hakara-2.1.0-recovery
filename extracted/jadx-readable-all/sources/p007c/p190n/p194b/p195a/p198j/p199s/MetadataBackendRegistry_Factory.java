package p007c.p190n.p194b.p195a.p198j.p199s;

import android.content.Context;
import p005b1.p006a.Provider;

/* JADX INFO: renamed from: c.n.b.a.j.s.l, reason: use source file name */
/* JADX INFO: compiled from: MetadataBackendRegistry_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class MetadataBackendRegistry_Factory implements Provider {

    /* JADX INFO: renamed from: a */
    public final Provider<Context> f5784a;

    /* JADX INFO: renamed from: b */
    public final Provider<CreationContextFactory> f5785b;

    public MetadataBackendRegistry_Factory(Provider<Context> provider, Provider<CreationContextFactory> provider2) {
        this.f5784a = provider;
        this.f5785b = provider2;
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        return new MetadataBackendRegistry(this.f5784a.get(), this.f5785b.get());
    }
}
