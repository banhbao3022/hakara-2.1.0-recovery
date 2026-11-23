package p007c.p085g.p086a.p089m.p098v;

import java.util.Objects;
import p007c.p085g.p086a.p089m.p092t.Resource2;

/* JADX INFO: renamed from: c.g.a.m.v.b, reason: use source file name */
/* JADX INFO: compiled from: SimpleResource.java */
/* JADX INFO: loaded from: classes.dex */
public class SimpleResource<T> implements Resource2<T> {

    /* JADX INFO: renamed from: f */
    public final T f3511f;

    public SimpleResource(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f3511f = t;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: b */
    public void mo1830b() {
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: c */
    public final int mo1831c() {
        return 1;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: d */
    public Class<T> mo1832d() {
        return (Class<T>) this.f3511f.getClass();
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    public final T get() {
        return this.f3511f;
    }
}
