package p007c.p190n.p378c.p380b;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.c.b.j0, reason: use source file name */
/* JADX INFO: compiled from: NaturalOrdering.java */
/* JADX INFO: loaded from: classes.dex */
public final class NaturalOrdering extends Ordering<Comparable> implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final NaturalOrdering f26194f = new NaturalOrdering();

    private Object readResolve() {
        return f26194f;
    }

    @Override // p007c.p190n.p378c.p380b.Ordering
    /* JADX INFO: renamed from: b */
    public <S extends Comparable> Ordering<S> mo11608b() {
        return ReverseNaturalOrdering.f26247f;
    }

    @Override // p007c.p190n.p378c.p380b.Ordering, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
