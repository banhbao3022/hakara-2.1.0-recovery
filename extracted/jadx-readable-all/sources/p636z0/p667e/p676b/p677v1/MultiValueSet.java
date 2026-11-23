package p636z0.p667e.p676b.p677v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: z0.e.b.v1.x0, reason: use source file name */
/* JADX INFO: compiled from: MultiValueSet.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class MultiValueSet<C> {

    /* JADX INFO: renamed from: a */
    public Set<C> f36311a = new HashSet();

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract MultiValueSet<C> clone();

    /* JADX INFO: renamed from: b */
    public List<C> m15433b() {
        return Collections.unmodifiableList(new ArrayList(this.f36311a));
    }
}
