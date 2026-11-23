package p007c.p190n.p378c.p380b;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.n0, reason: use source file name */
/* JADX INFO: compiled from: RegularImmutableSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class RegularImmutableSet<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: i */
    public static final RegularImmutableSet<Object> f26240i = new RegularImmutableSet<>(new Object[0], 0, null, 0, 0);

    /* JADX INFO: renamed from: j */
    public final transient Object[] f26241j;

    /* JADX INFO: renamed from: k */
    public final transient Object[] f26242k;

    /* JADX INFO: renamed from: l */
    public final transient int f26243l;

    /* JADX INFO: renamed from: m */
    public final transient int f26244m;

    /* JADX INFO: renamed from: n */
    public final transient int f26245n;

    public RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f26241j = objArr;
        this.f26242k = objArr2;
        this.f26243l = i2;
        this.f26244m = i;
        this.f26245n = i3;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f26242k;
        if (obj == null || objArr == null) {
            return false;
        }
        int iM11009q0 = C4799a.m11009q0(obj);
        while (true) {
            int i = iM11009q0 & this.f26243l;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iM11009q0 = i + 1;
        }
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: f */
    public int mo11618f(Object[] objArr, int i) {
        System.arraycopy(this.f26241j, 0, objArr, i, this.f26245n);
        return i + this.f26245n;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: h */
    public Object[] mo11619h() {
        return this.f26241j;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f26244m;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: j */
    public int mo11620j() {
        return this.f26245n;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: m */
    public int mo11621m() {
        return 0;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: q */
    public boolean mo11622q() {
        return false;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableSet, p007c.p190n.p378c.p380b.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: s */
    public UnmodifiableIterator<E> iterator() {
        return mo11629c().listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f26245n;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableSet
    /* JADX INFO: renamed from: y */
    public ImmutableList2<E> mo11628y() {
        return ImmutableList2.m11640u(this.f26241j, this.f26245n);
    }
}
