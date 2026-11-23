package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.k.f3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4153f3<T> implements InterfaceC4125d3<T>, Serializable {

    /* JADX INFO: renamed from: f */
    @NullableDecl
    public final T f23154f;

    public C4153f3(@NullableDecl T t) {
        this.f23154f = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C4153f3) {
            return C2622l.m5461y1(this.f23154f, ((C4153f3) obj).f23154f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23154f});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f23154f);
        return outline.m1587i(strValueOf.length() + 22, "Suppliers.ofInstance(", strValueOf, ")");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4125d3
    public final T zza() {
        return this.f23154f;
    }
}
