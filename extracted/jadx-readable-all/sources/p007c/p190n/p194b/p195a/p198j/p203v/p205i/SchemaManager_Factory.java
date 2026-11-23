package p007c.p190n.p194b.p195a.p198j.p203v.p205i;

import android.content.Context;
import p005b1.p006a.Provider;

/* JADX INFO: renamed from: c.n.b.a.j.v.i.a0, reason: use source file name */
/* JADX INFO: compiled from: SchemaManager_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class SchemaManager_Factory implements Provider {

    /* JADX INFO: renamed from: a */
    public final Provider<Context> f5877a;

    /* JADX INFO: renamed from: b */
    public final Provider<String> f5878b;

    /* JADX INFO: renamed from: c */
    public final Provider<Integer> f5879c;

    public SchemaManager_Factory(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f5877a = provider;
        this.f5878b = provider2;
        this.f5879c = provider3;
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        return new SchemaManager5(this.f5877a.get(), this.f5878b.get(), this.f5879c.get().intValue());
    }
}
