package p500e1.p501a;

import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: e1.a.w, reason: use source file name */
/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CompletionState3 {

    /* JADX INFO: renamed from: a */
    public final Object f29814a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6164l<Throwable, Unit> f29815b;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletionState3(Object obj, InterfaceC6164l<? super Throwable, Unit> interfaceC6164l) {
        this.f29814a = obj;
        this.f29815b = interfaceC6164l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletionState3)) {
            return false;
        }
        CompletionState3 completionState3 = (CompletionState3) obj;
        return Intrinsics2.m13085a(this.f29814a, completionState3.f29814a) && Intrinsics2.m13085a(this.f29815b, completionState3.f29815b);
    }

    public int hashCode() {
        Object obj = this.f29814a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        InterfaceC6164l<Throwable, Unit> interfaceC6164l = this.f29815b;
        return iHashCode + (interfaceC6164l != null ? interfaceC6164l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("CompletedWithCancellation(result=");
        sbM1556G.append(this.f29814a);
        sbM1556G.append(", onCancellation=");
        sbM1556G.append(this.f29815b);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }
}
