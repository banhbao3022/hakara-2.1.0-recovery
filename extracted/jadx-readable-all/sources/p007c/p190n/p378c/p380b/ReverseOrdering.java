package p007c.p190n.p378c.p380b;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: c.n.c.b.p0, reason: use source file name */
/* JADX INFO: compiled from: ReverseOrdering.java */
/* JADX INFO: loaded from: classes.dex */
public final class ReverseOrdering<T> extends Ordering<T> implements Serializable {

    /* JADX INFO: renamed from: f */
    public final Ordering<? super T> f26252f;

    public ReverseOrdering(Ordering<? super T> ordering) {
        this.f26252f = ordering;
    }

    @Override // p007c.p190n.p378c.p380b.Ordering
    /* JADX INFO: renamed from: b */
    public <S extends T> Ordering<S> mo11608b() {
        return this.f26252f;
    }

    @Override // p007c.p190n.p378c.p380b.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f26252f.compare(t2, t);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.f26252f.equals(((ReverseOrdering) obj).f26252f);
        }
        return false;
    }

    public int hashCode() {
        return -this.f26252f.hashCode();
    }

    public String toString() {
        return this.f26252f + ".reverse()";
    }
}
