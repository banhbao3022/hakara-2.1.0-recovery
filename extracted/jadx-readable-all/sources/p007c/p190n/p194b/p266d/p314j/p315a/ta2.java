package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ta2 extends AbstractList<String> implements RandomAccess, w82 {

    /* JADX INFO: renamed from: f */
    public final w82 f19806f;

    public ta2(w82 w82Var) {
        this.f19806f = w82Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w82
    /* JADX INFO: renamed from: J */
    public final void mo8410J(g72 g72Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w82
    /* JADX INFO: renamed from: Y */
    public final Object mo8411Y(int i) {
        return this.f19806f.mo8411Y(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w82
    /* JADX INFO: renamed from: g */
    public final List<?> mo8412g() {
        return this.f19806f.mo8412g();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((v82) this.f19806f).get(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w82
    /* JADX INFO: renamed from: i */
    public final w82 mo8413i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new sa2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new ra2(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19806f.size();
    }
}
