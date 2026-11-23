package p636z0.p691g;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: z0.g.b, reason: use source file name */
/* JADX INFO: compiled from: ArraySet.java */
/* JADX INFO: loaded from: classes.dex */
public class ArraySet<E> extends MapCollections<E, E> {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArraySet2 f36620d;

    public ArraySet(ArraySet2 arraySet2) {
        this.f36620d = arraySet2;
    }

    @Override // p636z0.p691g.MapCollections
    /* JADX INFO: renamed from: a */
    public void mo15563a() {
        this.f36620d.clear();
    }

    @Override // p636z0.p691g.MapCollections
    /* JADX INFO: renamed from: b */
    public Object mo15564b(int i, int i2) {
        return this.f36620d.f36628m[i];
    }

    @Override // p636z0.p691g.MapCollections
    /* JADX INFO: renamed from: c */
    public Map<E, E> mo15565c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // p636z0.p691g.MapCollections
    /* JADX INFO: renamed from: d */
    public int mo15566d() {
        return this.f36620d.f36629n;
    }

    @Override // p636z0.p691g.MapCollections
    /* JADX INFO: renamed from: e */
    public int mo15567e(Object obj) {
        return this.f36620d.indexOf(obj);
    }

    @Override // p636z0.p691g.MapCollections
    /* JADX INFO: renamed from: f */
    public int mo15568f(Object obj) {
        return this.f36620d.indexOf(obj);
    }

    @Override // p636z0.p691g.MapCollections
    /* JADX INFO: renamed from: g */
    public void mo15569g(E e, E e2) {
        this.f36620d.add(e);
    }

    @Override // p636z0.p691g.MapCollections
    /* JADX INFO: renamed from: h */
    public void mo15570h(int i) {
        this.f36620d.m15577q(i);
    }

    @Override // p636z0.p691g.MapCollections
    /* JADX INFO: renamed from: i */
    public E mo15571i(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }
}
