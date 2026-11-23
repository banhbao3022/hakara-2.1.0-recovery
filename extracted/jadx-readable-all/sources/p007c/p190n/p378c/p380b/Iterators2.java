package p007c.p190n.p378c.p380b;

/* JADX INFO: renamed from: c.n.c.b.y, reason: use source file name */
/* JADX INFO: compiled from: Iterators.java */
/* JADX INFO: loaded from: classes.dex */
public final class Iterators2<T> extends AbstractIndexedListIterator<T> {

    /* JADX INFO: renamed from: h */
    public static final AbstractIndexedListIterator<Object> f26288h = new Iterators2(new Object[0], 0, 0, 0);

    /* JADX INFO: renamed from: i */
    public final T[] f26289i;

    /* JADX INFO: renamed from: j */
    public final int f26290j;

    public Iterators2(T[] tArr, int i, int i2, int i3) {
        super(i2, i3);
        this.f26289i = tArr;
        this.f26290j = i;
    }

    @Override // p007c.p190n.p378c.p380b.AbstractIndexedListIterator
    /* JADX INFO: renamed from: a */
    public T mo11580a(int i) {
        return this.f26289i[this.f26290j + i];
    }
}
