package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.k.v6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4379v6<E> extends AbstractC4335s3<E> implements RandomAccess {

    /* JADX INFO: renamed from: g */
    public static final C4379v6<Object> f23569g;

    /* JADX INFO: renamed from: h */
    public E[] f23570h;

    /* JADX INFO: renamed from: i */
    public int f23571i;

    static {
        C4379v6<Object> c4379v6 = new C4379v6<>(new Object[0], 0);
        f23569g = c4379v6;
        c4379v6.f23452f = false;
    }

    public C4379v6(E[] eArr, int i) {
        this.f23570h = eArr;
        this.f23571i = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m10203c();
        int i = this.f23571i;
        E[] eArr = this.f23570h;
        if (i == eArr.length) {
            this.f23570h = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f23570h;
        int i2 = this.f23571i;
        this.f23571i = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4197i5
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC4197i5 mo9340b(int i) {
        if (i >= this.f23571i) {
            return new C4379v6(Arrays.copyOf(this.f23570h, i), this.f23571i);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: f */
    public final void m10288f(int i) {
        if (i < 0 || i >= this.f23571i) {
            throw new IndexOutOfBoundsException(m10289h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m10288f(i);
        return this.f23570h[i];
    }

    /* JADX INFO: renamed from: h */
    public final String m10289h(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f23571i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        m10203c();
        m10288f(i);
        E[] eArr = this.f23570h;
        E e = eArr[i];
        int i2 = this.f23571i;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f23571i--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m10203c();
        m10288f(i);
        E[] eArr = this.f23570h;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23571i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m10203c();
        if (i >= 0 && i <= (i2 = this.f23571i)) {
            E[] eArr = this.f23570h;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[outline.m1602x(i2, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.f23570h, i, eArr2, i + 1, this.f23571i - i);
                this.f23570h = eArr2;
            }
            this.f23570h[i] = e;
            this.f23571i++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m10289h(i));
    }
}
