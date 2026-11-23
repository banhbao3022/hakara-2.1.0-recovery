package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sc2<E> extends AbstractList<E> {

    /* JADX INFO: renamed from: f */
    public static final tc2 f19526f = tc2.m8414b(sc2.class);

    /* JADX INFO: renamed from: g */
    public final List<E> f19527g;

    /* JADX INFO: renamed from: h */
    public final Iterator<E> f19528h;

    public sc2(List<E> list, Iterator<E> it) {
        this.f19527g = list;
        this.f19528h = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        if (this.f19527g.size() > i) {
            return this.f19527g.get(i);
        }
        if (!this.f19528h.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f19527g.add(this.f19528h.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new rc2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        tc2 tc2Var = f19526f;
        tc2Var.mo7995a("potentially expensive size() call");
        tc2Var.mo7995a("blowup running");
        while (this.f19528h.hasNext()) {
            this.f19527g.add(this.f19528h.next());
        }
        return this.f19527g.size();
    }
}
