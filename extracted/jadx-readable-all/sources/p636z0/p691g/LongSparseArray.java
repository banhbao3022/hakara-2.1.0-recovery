package p636z0.p691g;

/* JADX INFO: renamed from: z0.g.e, reason: use source file name */
/* JADX INFO: compiled from: LongSparseArray.java */
/* JADX INFO: loaded from: classes.dex */
public class LongSparseArray<E> implements Cloneable {

    /* JADX INFO: renamed from: f */
    public static final Object f36634f = new Object();

    /* JADX INFO: renamed from: g */
    public boolean f36635g;

    /* JADX INFO: renamed from: h */
    public long[] f36636h;

    /* JADX INFO: renamed from: i */
    public Object[] f36637i;

    /* JADX INFO: renamed from: j */
    public int f36638j;

    public LongSparseArray() {
        this(10);
    }

    /* JADX INFO: renamed from: a */
    public void m15584a(long j2, E e) {
        int i = this.f36638j;
        if (i != 0 && j2 <= this.f36636h[i - 1]) {
            m15593m(j2, e);
            return;
        }
        if (this.f36635g && i >= this.f36636h.length) {
            m15588g();
        }
        int i2 = this.f36638j;
        if (i2 >= this.f36636h.length) {
            int iM15583f = ContainerHelpers.m15583f(i2 + 1);
            long[] jArr = new long[iM15583f];
            Object[] objArr = new Object[iM15583f];
            long[] jArr2 = this.f36636h;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f36637i;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f36636h = jArr;
            this.f36637i = objArr;
        }
        this.f36636h[i2] = j2;
        this.f36637i[i2] = e;
        this.f36638j = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public void m15585b() {
        int i = this.f36638j;
        Object[] objArr = this.f36637i;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f36638j = 0;
        this.f36635g = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public LongSparseArray<E> clone() {
        try {
            LongSparseArray<E> longSparseArray = (LongSparseArray) super.clone();
            longSparseArray.f36636h = (long[]) this.f36636h.clone();
            longSparseArray.f36637i = (Object[]) this.f36637i.clone();
            return longSparseArray;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m15587e(long j2) {
        if (this.f36635g) {
            m15588g();
        }
        return ContainerHelpers.m15579b(this.f36636h, this.f36638j, j2) >= 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m15588g() {
        int i = this.f36638j;
        long[] jArr = this.f36636h;
        Object[] objArr = this.f36637i;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f36634f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f36635g = false;
        this.f36638j = i2;
    }

    /* JADX INFO: renamed from: i */
    public E m15589i(long j2) {
        return m15590j(j2, null);
    }

    /* JADX INFO: renamed from: j */
    public E m15590j(long j2, E e) {
        int iM15579b = ContainerHelpers.m15579b(this.f36636h, this.f36638j, j2);
        if (iM15579b >= 0) {
            Object[] objArr = this.f36637i;
            if (objArr[iM15579b] != f36634f) {
                return (E) objArr[iM15579b];
            }
        }
        return e;
    }

    /* JADX INFO: renamed from: k */
    public boolean m15591k() {
        return m15595o() == 0;
    }

    /* JADX INFO: renamed from: l */
    public long m15592l(int i) {
        if (this.f36635g) {
            m15588g();
        }
        return this.f36636h[i];
    }

    /* JADX INFO: renamed from: m */
    public void m15593m(long j2, E e) {
        int iM15579b = ContainerHelpers.m15579b(this.f36636h, this.f36638j, j2);
        if (iM15579b >= 0) {
            this.f36637i[iM15579b] = e;
            return;
        }
        int i = ~iM15579b;
        int i2 = this.f36638j;
        if (i < i2) {
            Object[] objArr = this.f36637i;
            if (objArr[i] == f36634f) {
                this.f36636h[i] = j2;
                objArr[i] = e;
                return;
            }
        }
        if (this.f36635g && i2 >= this.f36636h.length) {
            m15588g();
            i = ~ContainerHelpers.m15579b(this.f36636h, this.f36638j, j2);
        }
        int i3 = this.f36638j;
        if (i3 >= this.f36636h.length) {
            int iM15583f = ContainerHelpers.m15583f(i3 + 1);
            long[] jArr = new long[iM15583f];
            Object[] objArr2 = new Object[iM15583f];
            long[] jArr2 = this.f36636h;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f36637i;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f36636h = jArr;
            this.f36637i = objArr2;
        }
        int i4 = this.f36638j;
        if (i4 - i != 0) {
            long[] jArr3 = this.f36636h;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f36637i;
            System.arraycopy(objArr4, i, objArr4, i5, this.f36638j - i);
        }
        this.f36636h[i] = j2;
        this.f36637i[i] = e;
        this.f36638j++;
    }

    /* JADX INFO: renamed from: n */
    public void m15594n(long j2) {
        int iM15579b = ContainerHelpers.m15579b(this.f36636h, this.f36638j, j2);
        if (iM15579b >= 0) {
            Object[] objArr = this.f36637i;
            Object obj = objArr[iM15579b];
            Object obj2 = f36634f;
            if (obj != obj2) {
                objArr[iM15579b] = obj2;
                this.f36635g = true;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public int m15595o() {
        if (this.f36635g) {
            m15588g();
        }
        return this.f36638j;
    }

    /* JADX INFO: renamed from: p */
    public E m15596p(int i) {
        if (this.f36635g) {
            m15588g();
        }
        return (E) this.f36637i[i];
    }

    public String toString() {
        if (m15595o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f36638j * 28);
        sb.append('{');
        for (int i = 0; i < this.f36638j; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m15592l(i));
            sb.append('=');
            E eM15596p = m15596p(i);
            if (eM15596p != this) {
                sb.append(eM15596p);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public LongSparseArray(int i) {
        this.f36635g = false;
        if (i == 0) {
            this.f36636h = ContainerHelpers.f36632b;
            this.f36637i = ContainerHelpers.f36633c;
        } else {
            int iM15583f = ContainerHelpers.m15583f(i);
            this.f36636h = new long[iM15583f];
            this.f36637i = new Object[iM15583f];
        }
    }
}
