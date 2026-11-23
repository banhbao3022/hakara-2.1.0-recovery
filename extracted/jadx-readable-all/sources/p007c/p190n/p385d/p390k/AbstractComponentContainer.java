package p007c.p190n.p385d.p390k;

import java.util.Set;
import p007c.p190n.p385d.p420s.Provider2;

/* JADX INFO: renamed from: c.n.d.k.a, reason: use source file name */
/* JADX INFO: compiled from: AbstractComponentContainer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentContainer implements ComponentContainer {
    @Override // p007c.p190n.p385d.p390k.ComponentContainer
    /* JADX INFO: renamed from: a */
    public <T> T mo11684a(Class<T> cls) {
        Provider2<T> provider2Mo11693b = mo11693b(cls);
        if (provider2Mo11693b == null) {
            return null;
        }
        return provider2Mo11693b.get();
    }

    @Override // p007c.p190n.p385d.p390k.ComponentContainer
    /* JADX INFO: renamed from: d */
    public <T> Set<T> mo11685d(Class<T> cls) {
        return mo11694c(cls).get();
    }
}
