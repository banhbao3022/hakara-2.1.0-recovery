package p007c.p190n.p194b.p195a.p198j.p200t.p201a;

import p005b1.p006a.Provider;

/* JADX INFO: renamed from: c.n.b.a.j.t.a.b, reason: use source file name */
/* JADX INFO: compiled from: InstanceFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class InstanceFactory<T> implements Provider {

    /* JADX INFO: renamed from: a */
    public final T f5789a;

    public InstanceFactory(T t) {
        this.f5789a = t;
    }

    @Override // p005b1.p006a.Provider
    public T get() {
        return this.f5789a;
    }
}
