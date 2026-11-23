package p007c.p190n.p378c.p380b;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.c.b.w0, reason: use source file name */
/* JADX INFO: compiled from: SingletonImmutableSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class SingletonImmutableSet<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: i */
    public final transient E f26283i;

    /* JADX INFO: renamed from: j */
    @LazyInit
    public transient int f26284j;

    public SingletonImmutableSet(E e) {
        Objects.requireNonNull(e);
        this.f26283i = e;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f26283i.equals(obj);
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: f */
    public int mo11618f(Object[] objArr, int i) {
        objArr[i] = this.f26283i;
        return i + 1;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f26284j;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f26283i.hashCode();
        this.f26284j = iHashCode;
        return iHashCode;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: q */
    public boolean mo11622q() {
        return false;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableSet, p007c.p190n.p378c.p380b.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: s */
    public UnmodifiableIterator<E> iterator() {
        return new Iterators(this.f26283i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sbM1555F = outline.m1555F('[');
        sbM1555F.append(this.f26283i.toString());
        sbM1555F.append(']');
        return sbM1555F.toString();
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableSet
    /* JADX INFO: renamed from: y */
    public ImmutableList2<E> mo11628y() {
        return ImmutableList2.m11637B(this.f26283i);
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableSet
    /* JADX INFO: renamed from: z */
    public boolean mo11663z() {
        return this.f26284j != 0;
    }

    public SingletonImmutableSet(E e, int i) {
        this.f26283i = e;
        this.f26284j = i;
    }
}
