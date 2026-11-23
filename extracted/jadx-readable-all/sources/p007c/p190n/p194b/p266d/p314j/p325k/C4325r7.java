package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.ListIterator;

/* JADX INFO: renamed from: c.n.b.d.j.k.r7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4325r7 implements ListIterator<String> {

    /* JADX INFO: renamed from: f */
    public ListIterator<String> f23431f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23432g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4283o7 f23433h;

    public C4325r7(C4283o7 c4283o7, int i) {
        this.f23433h = c4283o7;
        this.f23432g = i;
        this.f23431f = c4283o7.f23385f.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f23431f.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23431f.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f23431f.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23431f.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f23431f.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23431f.previousIndex();
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
