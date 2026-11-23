package p526i1.p536d.p543c.p548k;

import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: i1.d.c.k.c, reason: use source file name */
/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Logger7 {

    /* JADX INFO: renamed from: a */
    public Logger6 f30926a;

    /* JADX WARN: Multi-variable type inference failed */
    public Logger7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Logger7(Logger6 logger6) {
        Intrinsics2.m13090f(logger6, "level");
        this.f30926a = logger6;
    }

    /* JADX INFO: renamed from: a */
    public final void m13850a(String str) {
        Intrinsics2.m13090f(str, "msg");
        m13851b(Logger6.DEBUG, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m13851b(Logger6 logger6, String str) {
        if (this.f30926a.compareTo(logger6) <= 0) {
            mo13849f(logger6, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13852c(String str) {
        Intrinsics2.m13090f(str, "msg");
        m13851b(Logger6.ERROR, str);
    }

    /* JADX INFO: renamed from: d */
    public final void m13853d(String str) {
        Intrinsics2.m13090f(str, "msg");
        m13851b(Logger6.INFO, str);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13854e(Logger6 logger6) {
        Intrinsics2.m13090f(logger6, "lvl");
        return this.f30926a.compareTo(logger6) <= 0;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo13849f(Logger6 logger6, String str);

    public /* synthetic */ Logger7(Logger6 logger6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Logger6.INFO : logger6);
    }
}
