package p007c.p190n.p385d.p390k;

import java.util.Arrays;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.k.t, reason: use source file name */
/* JADX INFO: compiled from: DependencyCycleException.java */
/* JADX INFO: loaded from: classes.dex */
public class DependencyCycleException extends DependencyException {

    /* JADX INFO: renamed from: f */
    public final List<Component3<?>> f26402f;

    /* JADX WARN: Illegal instructions before constructor call */
    public DependencyCycleException(List<Component3<?>> list) {
        StringBuilder sbM1556G = outline.m1556G("Dependency cycle detected: ");
        sbM1556G.append(Arrays.toString(list.toArray()));
        super(sbM1556G.toString());
        this.f26402f = list;
    }
}
