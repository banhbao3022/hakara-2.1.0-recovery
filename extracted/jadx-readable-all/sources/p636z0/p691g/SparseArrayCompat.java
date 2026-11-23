package p636z0.p691g;

/* JADX INFO: renamed from: z0.g.i, reason: use source file name */
/* JADX INFO: compiled from: SparseArrayCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {

    /* JADX INFO: renamed from: f */
    public static final Object f36668f = new Object();

    /* JADX INFO: renamed from: g */
    public boolean f36669g;

    /* JADX INFO: renamed from: h */
    public int[] f36670h;

    /* JADX INFO: renamed from: i */
    public Object[] f36671i;

    /* JADX INFO: renamed from: j */
    public int f36672j;

    public SparseArrayCompat() {
        this(10);
    }

    /* JADX INFO: renamed from: a */
    public void m15613a(int i, E e) {
        int i2 = this.f36672j;
        if (i2 != 0 && i <= this.f36670h[i2 - 1]) {
            m15619j(i, e);
            return;
        }
        if (this.f36669g && i2 >= this.f36670h.length) {
            m15615d();
        }
        int i3 = this.f36672j;
        if (i3 >= this.f36670h.length) {
            int iM15582e = ContainerHelpers.m15582e(i3 + 1);
            int[] iArr = new int[iM15582e];
            Object[] objArr = new Object[iM15582e];
            int[] iArr2 = this.f36670h;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f36671i;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f36670h = iArr;
            this.f36671i = objArr;
        }
        this.f36670h[i3] = i;
        this.f36671i[i3] = e;
        this.f36672j = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> clone() {
        try {
            SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) super.clone();
            sparseArrayCompat.f36670h = (int[]) this.f36670h.clone();
            sparseArrayCompat.f36671i = (Object[]) this.f36671i.clone();
            return sparseArrayCompat;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15615d() {
        int i = this.f36672j;
        int[] iArr = this.f36670h;
        Object[] objArr = this.f36671i;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f36668f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f36669g = false;
        this.f36672j = i2;
    }

    /* JADX INFO: renamed from: e */
    public E m15616e(int i) {
        return m15617g(i, null);
    }

    /* JADX INFO: renamed from: g */
    public E m15617g(int i, E e) {
        int iM15578a = ContainerHelpers.m15578a(this.f36670h, this.f36672j, i);
        if (iM15578a >= 0) {
            Object[] objArr = this.f36671i;
            if (objArr[iM15578a] != f36668f) {
                return (E) objArr[iM15578a];
            }
        }
        return e;
    }

    /* JADX INFO: renamed from: i */
    public int m15618i(int i) {
        if (this.f36669g) {
            m15615d();
        }
        return this.f36670h[i];
    }

    /* JADX INFO: renamed from: j */
    public void m15619j(int i, E e) {
        int iM15578a = ContainerHelpers.m15578a(this.f36670h, this.f36672j, i);
        if (iM15578a >= 0) {
            this.f36671i[iM15578a] = e;
            return;
        }
        int i2 = ~iM15578a;
        int i3 = this.f36672j;
        if (i2 < i3) {
            Object[] objArr = this.f36671i;
            if (objArr[i2] == f36668f) {
                this.f36670h[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f36669g && i3 >= this.f36670h.length) {
            m15615d();
            i2 = ~ContainerHelpers.m15578a(this.f36670h, this.f36672j, i);
        }
        int i4 = this.f36672j;
        if (i4 >= this.f36670h.length) {
            int iM15582e = ContainerHelpers.m15582e(i4 + 1);
            int[] iArr = new int[iM15582e];
            Object[] objArr2 = new Object[iM15582e];
            int[] iArr2 = this.f36670h;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f36671i;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f36670h = iArr;
            this.f36671i = objArr2;
        }
        int i5 = this.f36672j;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f36670h;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f36671i;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f36672j - i2);
        }
        this.f36670h[i2] = i;
        this.f36671i[i2] = e;
        this.f36672j++;
    }

    /* JADX INFO: renamed from: k */
    public int m15620k() {
        if (this.f36669g) {
            m15615d();
        }
        return this.f36672j;
    }

    /* JADX INFO: renamed from: l */
    public E m15621l(int i) {
        if (this.f36669g) {
            m15615d();
        }
        return (E) this.f36671i[i];
    }

    public String toString() {
        if (m15620k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f36672j * 28);
        sb.append('{');
        for (int i = 0; i < this.f36672j; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m15618i(i));
            sb.append('=');
            E eM15621l = m15621l(i);
            if (eM15621l != this) {
                sb.append(eM15621l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public SparseArrayCompat(int i) {
        this.f36669g = false;
        if (i == 0) {
            this.f36670h = ContainerHelpers.f36631a;
            this.f36671i = ContainerHelpers.f36633c;
        } else {
            int iM15582e = ContainerHelpers.m15582e(i);
            this.f36670h = new int[iM15582e];
            this.f36671i = new Object[iM15582e];
        }
    }
}
