package p007c.p190n.p194b.p266d.p314j.p325k;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: c.n.b.d.j.k.a3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4083a3<T> extends AbstractC4097b3<T> {

    /* JADX INFO: renamed from: f */
    public static final C4083a3<Object> f23027f = new C4083a3<>();

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4097b3
    /* JADX INFO: renamed from: b */
    public final boolean mo9337b() {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4097b3
    /* JADX INFO: renamed from: c */
    public final T mo9338c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
