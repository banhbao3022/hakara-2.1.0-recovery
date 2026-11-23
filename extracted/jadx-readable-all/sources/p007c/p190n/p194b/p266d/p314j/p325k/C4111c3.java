package p007c.p190n.p194b.p266d.p314j.p325k;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.k.c3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4111c3<T> extends AbstractC4097b3<T> {

    /* JADX INFO: renamed from: f */
    public final T f23100f;

    public C4111c3(T t) {
        this.f23100f = t;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4097b3
    /* JADX INFO: renamed from: b */
    public final boolean mo9337b() {
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4097b3
    /* JADX INFO: renamed from: c */
    public final T mo9338c() {
        return this.f23100f;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C4111c3) {
            return this.f23100f.equals(((C4111c3) obj).f23100f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23100f.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f23100f);
        return outline.m1587i(strValueOf.length() + 13, "Optional.of(", strValueOf, ")");
    }
}
