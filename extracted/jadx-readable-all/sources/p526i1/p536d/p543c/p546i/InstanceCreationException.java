package p526i1.p536d.p543c.p546i;

import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: i1.d.c.i.d, reason: use source file name */
/* JADX INFO: compiled from: InstanceCreationException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InstanceCreationException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceCreationException(String str, Exception exc) {
        super(str, exc);
        Intrinsics2.m13090f(str, "msg");
        Intrinsics2.m13090f(exc, "parent");
    }
}
