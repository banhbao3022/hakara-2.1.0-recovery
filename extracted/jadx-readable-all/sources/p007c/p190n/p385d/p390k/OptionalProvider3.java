package p007c.p190n.p385d.p390k;

import p007c.p190n.p385d.p420s.Deferred;
import p007c.p190n.p385d.p420s.Provider2;

/* JADX INFO: renamed from: c.n.d.k.d0, reason: use source file name */
/* JADX INFO: compiled from: OptionalProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class OptionalProvider3<T> implements Provider2<T> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f26367a = 0;

    /* JADX INFO: renamed from: b */
    public Deferred<T> f26368b;

    /* JADX INFO: renamed from: c */
    public volatile Provider2<T> f26369c;

    public OptionalProvider3(Deferred<T> deferred, Provider2<T> provider2) {
        this.f26368b = deferred;
        this.f26369c = provider2;
    }

    @Override // p007c.p190n.p385d.p420s.Provider2
    public T get() {
        return this.f26369c.get();
    }
}
