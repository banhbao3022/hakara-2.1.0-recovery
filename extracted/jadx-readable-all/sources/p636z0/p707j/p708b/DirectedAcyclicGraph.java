package p636z0.p707j.p708b;

import java.util.ArrayList;
import java.util.HashSet;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.p738k.Pools2;
import p636z0.p725k.p738k.Pools3;

/* JADX INFO: renamed from: z0.j.b.a, reason: use source file name */
/* JADX INFO: compiled from: DirectedAcyclicGraph.java */
/* JADX INFO: loaded from: classes.dex */
public final class DirectedAcyclicGraph<T> {

    /* JADX INFO: renamed from: a */
    public final Pools2<ArrayList<T>> f37211a = new Pools3(10);

    /* JADX INFO: renamed from: b */
    public final SimpleArrayMap<T, ArrayList<T>> f37212b = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<T> f37213c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final HashSet<T> f37214d = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public void m15871a(T t) {
        if (this.f37212b.m15608e(t) >= 0) {
            return;
        }
        this.f37212b.put(t, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m15872b(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> orDefault = this.f37212b.getOrDefault(t, null);
        if (orDefault != null) {
            int size = orDefault.size();
            for (int i = 0; i < size; i++) {
                m15872b(orDefault.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}
