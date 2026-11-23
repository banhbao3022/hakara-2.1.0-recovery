package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.ListIterator;

/* JADX INFO: renamed from: c.n.b.d.j.f.r7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3986r7 implements ListIterator<String> {

    /* JADX INFO: renamed from: f */
    public ListIterator<String> f22864f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22865g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3956o7 f22866h;

    public C3986r7(C3956o7 c3956o7, int i) {
        this.f22866h = c3956o7;
        this.f22865g = i;
        this.f22864f = c3956o7.f22832f.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f22864f.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f22864f.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f22864f.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f22864f.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f22864f.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f22864f.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
