package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class at1<F, T> extends AbstractSequentialList<T> implements Serializable {

    /* JADX INFO: renamed from: f */
    public final List<F> f12272f;

    /* JADX INFO: renamed from: g */
    public final cs1<? super F, ? extends T> f12273g;

    public at1(List<F> list, cs1<? super F, ? extends T> cs1Var) {
        this.f12272f = list;
        this.f12273g = cs1Var;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f12272f.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new zs1(this, this.f12272f.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12272f.size();
    }
}
