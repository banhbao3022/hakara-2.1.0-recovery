package p500e1.p501a;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: e1.a.u, reason: use source file name */
/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CancellableContinuationImpl6 {

    /* JADX INFO: renamed from: a */
    public final Object f29803a;

    /* JADX INFO: renamed from: b */
    public final CancellableContinuationImpl3 f29804b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6164l<Throwable, Unit> f29805c;

    /* JADX INFO: renamed from: d */
    public final Object f29806d;

    /* JADX INFO: renamed from: e */
    public final Throwable f29807e;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl6(Object obj, CancellableContinuationImpl3 cancellableContinuationImpl3, InterfaceC6164l<? super Throwable, Unit> interfaceC6164l, Object obj2, Throwable th) {
        this.f29803a = obj;
        this.f29804b = cancellableContinuationImpl3;
        this.f29805c = interfaceC6164l;
        this.f29806d = obj2;
        this.f29807e = th;
    }

    /* JADX INFO: renamed from: a */
    public static CancellableContinuationImpl6 m13293a(CancellableContinuationImpl6 cancellableContinuationImpl6, Object obj, CancellableContinuationImpl3 cancellableContinuationImpl3, InterfaceC6164l interfaceC6164l, Object obj2, Throwable th, int i) {
        Object obj3 = (i & 1) != 0 ? cancellableContinuationImpl6.f29803a : null;
        if ((i & 2) != 0) {
            cancellableContinuationImpl3 = cancellableContinuationImpl6.f29804b;
        }
        CancellableContinuationImpl3 cancellableContinuationImpl4 = cancellableContinuationImpl3;
        InterfaceC6164l<Throwable, Unit> interfaceC6164l2 = (i & 4) != 0 ? cancellableContinuationImpl6.f29805c : null;
        Object obj4 = (i & 8) != 0 ? cancellableContinuationImpl6.f29806d : null;
        if ((i & 16) != 0) {
            th = cancellableContinuationImpl6.f29807e;
        }
        Objects.requireNonNull(cancellableContinuationImpl6);
        return new CancellableContinuationImpl6(obj3, cancellableContinuationImpl4, interfaceC6164l2, obj4, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancellableContinuationImpl6)) {
            return false;
        }
        CancellableContinuationImpl6 cancellableContinuationImpl6 = (CancellableContinuationImpl6) obj;
        return Intrinsics2.m13085a(this.f29803a, cancellableContinuationImpl6.f29803a) && Intrinsics2.m13085a(this.f29804b, cancellableContinuationImpl6.f29804b) && Intrinsics2.m13085a(this.f29805c, cancellableContinuationImpl6.f29805c) && Intrinsics2.m13085a(this.f29806d, cancellableContinuationImpl6.f29806d) && Intrinsics2.m13085a(this.f29807e, cancellableContinuationImpl6.f29807e);
    }

    public int hashCode() {
        Object obj = this.f29803a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        CancellableContinuationImpl3 cancellableContinuationImpl3 = this.f29804b;
        int iHashCode2 = (iHashCode + (cancellableContinuationImpl3 != null ? cancellableContinuationImpl3.hashCode() : 0)) * 31;
        InterfaceC6164l<Throwable, Unit> interfaceC6164l = this.f29805c;
        int iHashCode3 = (iHashCode2 + (interfaceC6164l != null ? interfaceC6164l.hashCode() : 0)) * 31;
        Object obj2 = this.f29806d;
        int iHashCode4 = (iHashCode3 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Throwable th = this.f29807e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("CompletedContinuation(result=");
        sbM1556G.append(this.f29803a);
        sbM1556G.append(", cancelHandler=");
        sbM1556G.append(this.f29804b);
        sbM1556G.append(", onCancellation=");
        sbM1556G.append(this.f29805c);
        sbM1556G.append(", idempotentResume=");
        sbM1556G.append(this.f29806d);
        sbM1556G.append(", cancelCause=");
        sbM1556G.append(this.f29807e);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    public /* synthetic */ CancellableContinuationImpl6(Object obj, CancellableContinuationImpl3 cancellableContinuationImpl3, InterfaceC6164l interfaceC6164l, Object obj2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : cancellableContinuationImpl3, (i & 4) != 0 ? null : interfaceC6164l, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
