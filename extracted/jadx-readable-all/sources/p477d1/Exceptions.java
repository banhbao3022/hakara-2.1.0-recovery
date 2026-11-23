package p477d1;

import p477d1.p489v.PlatformImplementations2;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.a, reason: use source file name */
/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes.dex */
public class Exceptions {
    /* JADX INFO: renamed from: a */
    public static final void m12964a(Throwable th, Throwable th2) {
        Intrinsics2.m13089e(th, "$this$addSuppressed");
        Intrinsics2.m13089e(th2, "exception");
        if (th != th2) {
            PlatformImplementations2.f29559a.mo13074a(th, th2);
        }
    }
}
