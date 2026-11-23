package p007c.p190n.p378c.p380b;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: renamed from: c.n.c.b.u, reason: use source file name */
/* JADX INFO: compiled from: ImmutableMultimap.java */
/* JADX INFO: loaded from: classes.dex */
public class ImmutableMultimap<V> extends UnmodifiableIterator<V> {

    /* JADX INFO: renamed from: f */
    public Iterator<? extends ImmutableCollection<V>> f26272f;

    /* JADX INFO: renamed from: g */
    public Iterator<V> f26273g = Iterators2.f26288h;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ImmutableMultimap2 f26274h;

    public ImmutableMultimap(ImmutableMultimap2 immutableMultimap2) {
        this.f26274h = immutableMultimap2;
        this.f26272f = immutableMultimap2.f26275i.values().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f26273g.hasNext() || this.f26272f.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        if (!this.f26273g.hasNext()) {
            this.f26273g = this.f26272f.next().iterator();
        }
        return this.f26273g.next();
    }
}
