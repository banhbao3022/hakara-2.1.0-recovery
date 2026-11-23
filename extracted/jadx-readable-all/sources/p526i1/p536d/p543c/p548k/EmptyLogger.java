package p526i1.p536d.p543c.p548k;

import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: i1.d.c.k.a, reason: use source file name */
/* JADX INFO: compiled from: EmptyLogger.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class EmptyLogger extends Logger7 {
    public EmptyLogger() {
        super(Logger6.NONE);
    }

    @Override // p526i1.p536d.p543c.p548k.Logger7
    /* JADX INFO: renamed from: f */
    public void mo13849f(Logger6 logger6, String str) {
        Intrinsics2.m13090f(logger6, "level");
        Intrinsics2.m13090f(str, "msg");
        System.err.println("should not see this - " + logger6 + " - " + str);
    }
}
