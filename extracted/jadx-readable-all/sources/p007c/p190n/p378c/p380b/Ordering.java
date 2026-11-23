package p007c.p190n.p378c.p380b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: c.n.c.b.k0, reason: use source file name */
/* JADX INFO: compiled from: Ordering.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Ordering<T> implements Comparator<T> {
    /* JADX INFO: renamed from: a */
    public static <T> Ordering<T> m11609a(Comparator<T> comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    /* JADX INFO: renamed from: b */
    public <S extends T> Ordering<S> mo11608b() {
        return new ReverseOrdering(this);
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);
}
