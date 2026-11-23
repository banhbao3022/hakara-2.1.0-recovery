package p007c.p190n.p385d.p390k;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: c.n.d.k.q, reason: use source file name */
/* JADX INFO: compiled from: CycleDetector.java */
/* JADX INFO: loaded from: classes.dex */
public class CycleDetector2 {

    /* JADX INFO: renamed from: a */
    public final Component3<?> f26394a;

    /* JADX INFO: renamed from: b */
    public final Set<CycleDetector2> f26395b = new HashSet();

    /* JADX INFO: renamed from: c */
    public final Set<CycleDetector2> f26396c = new HashSet();

    public CycleDetector2(Component3<?> component3) {
        this.f26394a = component3;
    }

    /* JADX INFO: renamed from: a */
    public boolean m11699a() {
        return this.f26396c.isEmpty();
    }
}
