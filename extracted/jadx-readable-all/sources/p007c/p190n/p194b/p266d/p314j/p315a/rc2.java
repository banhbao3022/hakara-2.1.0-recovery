package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rc2 implements Iterator {

    /* JADX INFO: renamed from: f */
    public int f18743f = 0;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ sc2 f18744g;

    public rc2(sc2 sc2Var) {
        this.f18744g = sc2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18743f < this.f18744g.f19527g.size() || this.f18744g.f19528h.hasNext();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f18743f >= this.f18744g.f19527g.size()) {
            sc2 sc2Var = this.f18744g;
            sc2Var.f19527g.add((E) sc2Var.f19528h.next());
            return next();
        }
        List<E> list = this.f18744g.f19527g;
        int i = this.f18743f;
        this.f18743f = i + 1;
        return list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
