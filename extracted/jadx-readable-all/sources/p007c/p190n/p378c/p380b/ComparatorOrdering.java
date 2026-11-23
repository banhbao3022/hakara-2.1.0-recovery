package p007c.p190n.p378c.p380b;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: c.n.c.b.m, reason: use source file name */
/* JADX INFO: compiled from: ComparatorOrdering.java */
/* JADX INFO: loaded from: classes.dex */
public final class ComparatorOrdering<T> extends Ordering<T> implements Serializable {

    /* JADX INFO: renamed from: f */
    public final Comparator<T> f26221f;

    public ComparatorOrdering(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.f26221f = comparator;
    }

    @Override // p007c.p190n.p378c.p380b.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f26221f.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.f26221f.equals(((ComparatorOrdering) obj).f26221f);
        }
        return false;
    }

    public int hashCode() {
        return this.f26221f.hashCode();
    }

    public String toString() {
        return this.f26221f.toString();
    }
}
