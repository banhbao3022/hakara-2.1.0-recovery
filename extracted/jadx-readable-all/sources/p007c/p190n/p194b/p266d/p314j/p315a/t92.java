package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class t92<E> extends u62<E> implements RandomAccess {

    /* JADX INFO: renamed from: g */
    public static final t92<Object> f19797g;

    /* JADX INFO: renamed from: h */
    public E[] f19798h;

    /* JADX INFO: renamed from: i */
    public int f19799i;

    static {
        t92<Object> t92Var = new t92<>(new Object[0], 0);
        f19797g = t92Var;
        t92Var.f20226f = false;
    }

    public t92(E[] eArr, int i) {
        this.f19798h = eArr;
        this.f19799i = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m8471c();
        if (i < 0 || i > (i2 = this.f19799i)) {
            throw new IndexOutOfBoundsException(m8409h(i));
        }
        E[] eArr = this.f19798h;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f19798h, i, eArr2, i + 1, this.f19799i - i);
            this.f19798h = eArr2;
        }
        this.f19798h[i] = e;
        this.f19799i++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: f */
    public final void m8408f(int i) {
        if (i < 0 || i >= this.f19799i) {
            throw new IndexOutOfBoundsException(m8409h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m8408f(i);
        return this.f19798h[i];
    }

    /* JADX INFO: renamed from: h */
    public final String m8409h(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f19799i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o82
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ o82 mo5705l(int i) {
        if (i >= this.f19799i) {
            return new t92(Arrays.copyOf(this.f19798h, i), this.f19799i);
        }
        throw new IllegalArgumentException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        m8471c();
        m8408f(i);
        E[] eArr = this.f19798h;
        E e = eArr[i];
        int i2 = this.f19799i;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f19799i--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m8471c();
        m8408f(i);
        E[] eArr = this.f19798h;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19799i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m8471c();
        int i = this.f19799i;
        E[] eArr = this.f19798h;
        if (i == eArr.length) {
            this.f19798h = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f19798h;
        int i2 = this.f19799i;
        this.f19799i = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
