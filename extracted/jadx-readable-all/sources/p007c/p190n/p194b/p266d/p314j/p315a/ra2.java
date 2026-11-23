package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ListIterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ra2 implements ListIterator<String> {

    /* JADX INFO: renamed from: f */
    public final ListIterator<String> f18730f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18731g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ta2 f18732h;

    public ra2(ta2 ta2Var, int i) {
        this.f18732h = ta2Var;
        this.f18731g = i;
        this.f18730f = ta2Var.f19806f.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f18730f.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18730f.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f18730f.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18730f.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f18730f.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18730f.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
