package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class it1<E> extends xs1<E> {

    /* JADX INFO: renamed from: i */
    public final transient E f15380i;

    /* JADX INFO: renamed from: j */
    public transient int f15381j;

    public it1(E e) {
        Objects.requireNonNull(e);
        this.f15380i = e;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: c */
    public final kt1<E> iterator() {
        return new ys1(this.f15380i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15380i.equals(obj);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xs1, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f15381j;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f15380i.hashCode();
        this.f15381j = iHashCode;
        return iHashCode;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xs1, p007c.p190n.p194b.p266d.p314j.p315a.qs1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new ys1(this.f15380i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: s */
    public final int mo6095s(Object[] objArr, int i) {
        objArr[i] = this.f15380i;
        return i + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f15380i.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xs1
    /* JADX INFO: renamed from: v */
    public final boolean mo7303v() {
        return this.f15381j != 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xs1
    /* JADX INFO: renamed from: x */
    public final ts1<E> mo6519x() {
        E e = this.f15380i;
        ns1<Object> ns1Var = ts1.f19979g;
        Object[] objArr = {e};
        C2622l.m5421q1(objArr, 1);
        return ts1.m8450v(objArr, 1);
    }

    public it1(E e, int i) {
        this.f15380i = e;
        this.f15381j = i;
    }
}
