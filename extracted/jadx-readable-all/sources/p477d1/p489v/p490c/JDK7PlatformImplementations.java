package p477d1.p489v.p490c;

import p477d1.p489v.PlatformImplementations;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.v.c.a, reason: use source file name */
/* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
/* JADX INFO: loaded from: classes.dex */
public class JDK7PlatformImplementations extends PlatformImplementations {
    @Override // p477d1.p489v.PlatformImplementations
    /* JADX INFO: renamed from: a */
    public void mo13074a(Throwable th, Throwable th2) {
        Intrinsics2.m13089e(th, "cause");
        Intrinsics2.m13089e(th2, "exception");
        th.addSuppressed(th2);
    }
}
