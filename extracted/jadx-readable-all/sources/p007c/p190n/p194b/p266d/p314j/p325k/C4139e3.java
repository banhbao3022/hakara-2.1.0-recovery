package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.Serializable;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.k.e3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4139e3<T> implements InterfaceC4125d3<T>, Serializable {

    /* JADX INFO: renamed from: f */
    public final InterfaceC4125d3<T> f23124f;

    /* JADX INFO: renamed from: g */
    public volatile transient boolean f23125g;

    /* JADX INFO: renamed from: h */
    @NullableDecl
    public transient T f23126h;

    public C4139e3(InterfaceC4125d3<T> interfaceC4125d3) {
        Objects.requireNonNull(interfaceC4125d3);
        this.f23124f = interfaceC4125d3;
    }

    public final String toString() {
        Object objM1587i;
        if (this.f23125g) {
            String strValueOf = String.valueOf(this.f23126h);
            objM1587i = outline.m1587i(strValueOf.length() + 25, "<supplier that returned ", strValueOf, ">");
        } else {
            objM1587i = this.f23124f;
        }
        String strValueOf2 = String.valueOf(objM1587i);
        return outline.m1587i(strValueOf2.length() + 19, "Suppliers.memoize(", strValueOf2, ")");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4125d3
    public final T zza() {
        if (!this.f23125g) {
            synchronized (this) {
                if (!this.f23125g) {
                    T tZza = this.f23124f.zza();
                    this.f23126h = tZza;
                    this.f23125g = true;
                    return tZza;
                }
            }
        }
        return this.f23126h;
    }
}
