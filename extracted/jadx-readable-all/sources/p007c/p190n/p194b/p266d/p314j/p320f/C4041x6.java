package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.f.x6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4041x6<E> extends AbstractC3813a4<E> implements RandomAccess {

    /* JADX INFO: renamed from: g */
    public static final C4041x6<Object> f22987g;

    /* JADX INFO: renamed from: h */
    public E[] f22988h;

    /* JADX INFO: renamed from: i */
    public int f22989i;

    static {
        C4041x6<Object> c4041x6 = new C4041x6<>(new Object[0], 0);
        f22987g = c4041x6;
        c4041x6.f22505f = false;
    }

    public C4041x6(E[] eArr, int i) {
        this.f22988h = eArr;
        this.f22989i = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m8928c();
        int i = this.f22989i;
        E[] eArr = this.f22988h;
        if (i == eArr.length) {
            this.f22988h = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f22988h;
        int i2 = this.f22989i;
        this.f22989i = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m9300f(int i) {
        if (i < 0 || i >= this.f22989i) {
            throw new IndexOutOfBoundsException(m9301h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m9300f(i);
        return this.f22988h[i];
    }

    /* JADX INFO: renamed from: h */
    public final String m9301h(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f22989i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3894i5
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC3894i5 mo8958r(int i) {
        if (i >= this.f22989i) {
            return new C4041x6(Arrays.copyOf(this.f22988h, i), this.f22989i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        m8928c();
        m9300f(i);
        E[] eArr = this.f22988h;
        E e = eArr[i];
        int i2 = this.f22989i;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f22989i--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m8928c();
        m9300f(i);
        E[] eArr = this.f22988h;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22989i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m8928c();
        if (i >= 0 && i <= (i2 = this.f22989i)) {
            E[] eArr = this.f22988h;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[outline.m1602x(i2, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.f22988h, i, eArr2, i + 1, this.f22989i - i);
                this.f22988h = eArr2;
            }
            this.f22988h[i] = e;
            this.f22989i++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m9301h(i));
    }
}
