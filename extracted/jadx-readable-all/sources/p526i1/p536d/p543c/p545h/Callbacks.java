package p526i1.p536d.p543c.p545h;

import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: i1.d.c.h.b, reason: use source file name */
/* JADX INFO: compiled from: Callbacks.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Callbacks<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6164l<T, Unit> f30908a;

    /* JADX WARN: Multi-variable type inference failed */
    public Callbacks() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Callbacks(InterfaceC6164l<? super T, Unit> interfaceC6164l) {
        this.f30908a = interfaceC6164l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Callbacks) && Intrinsics2.m13085a(this.f30908a, ((Callbacks) obj).f30908a);
        }
        return true;
    }

    public int hashCode() {
        InterfaceC6164l<T, Unit> interfaceC6164l = this.f30908a;
        if (interfaceC6164l != null) {
            return interfaceC6164l.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Callbacks(onClose=");
        sbM1556G.append(this.f30908a);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    public /* synthetic */ Callbacks(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC6164l);
    }
}
