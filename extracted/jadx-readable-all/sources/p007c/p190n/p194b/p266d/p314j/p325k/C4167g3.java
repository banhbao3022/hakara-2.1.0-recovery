package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.k.g3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4167g3<T> implements InterfaceC4125d3<T> {

    /* JADX INFO: renamed from: f */
    public volatile InterfaceC4125d3<T> f23167f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f23168g;

    /* JADX INFO: renamed from: h */
    @NullableDecl
    public T f23169h;

    public C4167g3(InterfaceC4125d3<T> interfaceC4125d3) {
        Objects.requireNonNull(interfaceC4125d3);
        this.f23167f = interfaceC4125d3;
    }

    public final String toString() {
        Object objM1587i = this.f23167f;
        if (objM1587i == null) {
            String strValueOf = String.valueOf(this.f23169h);
            objM1587i = outline.m1587i(strValueOf.length() + 25, "<supplier that returned ", strValueOf, ">");
        }
        String strValueOf2 = String.valueOf(objM1587i);
        return outline.m1587i(strValueOf2.length() + 19, "Suppliers.memoize(", strValueOf2, ")");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4125d3
    public final T zza() {
        if (!this.f23168g) {
            synchronized (this) {
                if (!this.f23168g) {
                    T tZza = this.f23167f.zza();
                    this.f23169h = tZza;
                    this.f23168g = true;
                    this.f23167f = null;
                    return tZza;
                }
            }
        }
        return this.f23169h;
    }
}
