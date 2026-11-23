package p007c.p190n.p194b.p195a.p198j.p199s;

import android.content.Context;
import p005b1.p006a.Provider;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;

/* JADX INFO: renamed from: c.n.b.a.j.s.j, reason: use source file name */
/* JADX INFO: compiled from: CreationContextFactory_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class CreationContextFactory_Factory implements Provider {

    /* JADX INFO: renamed from: a */
    public final Provider<Context> f5776a;

    /* JADX INFO: renamed from: b */
    public final Provider<Clock> f5777b;

    /* JADX INFO: renamed from: c */
    public final Provider<Clock> f5778c;

    public CreationContextFactory_Factory(Provider<Context> provider, Provider<Clock> provider2, Provider<Clock> provider3) {
        this.f5776a = provider;
        this.f5777b = provider2;
        this.f5778c = provider3;
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        return new CreationContextFactory(this.f5776a.get(), this.f5777b.get(), this.f5778c.get());
    }
}
