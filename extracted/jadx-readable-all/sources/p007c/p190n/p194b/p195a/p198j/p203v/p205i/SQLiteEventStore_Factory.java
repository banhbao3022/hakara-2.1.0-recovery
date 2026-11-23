package p007c.p190n.p194b.p195a.p198j.p203v.p205i;

import p005b1.p006a.Provider;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;

/* JADX INFO: renamed from: c.n.b.a.j.v.i.u, reason: use source file name */
/* JADX INFO: compiled from: SQLiteEventStore_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class SQLiteEventStore_Factory implements Provider {

    /* JADX INFO: renamed from: a */
    public final Provider<Clock> f5911a;

    /* JADX INFO: renamed from: b */
    public final Provider<Clock> f5912b;

    /* JADX INFO: renamed from: c */
    public final Provider<EventStoreConfig> f5913c;

    /* JADX INFO: renamed from: d */
    public final Provider<SchemaManager5> f5914d;

    public SQLiteEventStore_Factory(Provider<Clock> provider, Provider<Clock> provider2, Provider<EventStoreConfig> provider3, Provider<SchemaManager5> provider4) {
        this.f5911a = provider;
        this.f5912b = provider2;
        this.f5913c = provider3;
        this.f5914d = provider4;
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        return new C1380t(this.f5911a.get(), this.f5912b.get(), this.f5913c.get(), this.f5914d.get());
    }
}
