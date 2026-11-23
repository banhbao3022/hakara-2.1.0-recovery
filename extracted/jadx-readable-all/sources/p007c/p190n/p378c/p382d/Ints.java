package p007c.p190n.p378c.p382d;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.d.a, reason: use source file name */
/* JADX INFO: compiled from: Ints.java */
/* JADX INFO: loaded from: classes.dex */
public class Ints extends AbstractList<Integer> implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: f */
    public final int[] f26294f;

    /* JADX INFO: renamed from: g */
    public final int f26295g;

    /* JADX INFO: renamed from: h */
    public final int f26296h;

    public Ints(int[] iArr, int i, int i2) {
        this.f26294f = iArr;
        this.f26295g = i;
        this.f26296h = i2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f26294f;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.f26295g;
            int i2 = this.f26296h;
            while (i < i2) {
                if (iArr[i] != iIntValue) {
                    i++;
                } else if (i != -1) {
                    return true;
                }
            }
            i = -1;
            if (i != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ints)) {
            return super.equals(obj);
        }
        Ints ints = (Ints) obj;
        int size = size();
        if (ints.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f26294f[this.f26295g + i] != ints.f26294f[ints.f26295g + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        C4799a.m10994j(i, size());
        return Integer.valueOf(this.f26294f[this.f26295g + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = this.f26295g; i2 < this.f26296h; i2++) {
            i = (i * 31) + this.f26294f[i2];
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f26294f;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.f26295g;
            int i2 = this.f26296h;
            while (i < i2) {
                if (iArr[i] != iIntValue) {
                    i++;
                } else if (i >= 0) {
                    return i - this.f26295g;
                }
            }
            i = -1;
            if (i >= 0) {
                return i - this.f26295g;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f26294f;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.f26295g;
            int i2 = this.f26296h - 1;
            while (i2 >= i) {
                if (iArr[i2] != iIntValue) {
                    i2--;
                } else if (i2 >= 0) {
                    return i2 - this.f26295g;
                }
            }
            i2 = -1;
            if (i2 >= 0) {
                return i2 - this.f26295g;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        C4799a.m10994j(i, size());
        int[] iArr = this.f26294f;
        int i2 = this.f26295g + i;
        int i3 = iArr[i2];
        Objects.requireNonNull(num);
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26296h - this.f26295g;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Integer> subList(int i, int i2) {
        C4799a.m11004o(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.f26294f;
        int i3 = this.f26295g;
        return new Ints(iArr, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        sb.append(this.f26294f[this.f26295g]);
        int i = this.f26295g;
        while (true) {
            i++;
            if (i >= this.f26296h) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f26294f[i]);
        }
    }
}
