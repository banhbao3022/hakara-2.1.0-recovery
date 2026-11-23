package p526i1.p536d.p543c.p544g;

import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p536d.p543c.Koin;
import p526i1.p536d.p543c.KoinApplication;
import p526i1.p536d.p543c.p546i.KoinAppAlreadyStartedException;

/* JADX INFO: renamed from: i1.d.c.g.a, reason: use source file name */
/* JADX INFO: compiled from: GlobalContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GlobalContext implements KoinContext {

    /* JADX INFO: renamed from: a */
    public Koin f30895a;

    @Override // p526i1.p536d.p543c.p544g.KoinContext
    /* JADX INFO: renamed from: a */
    public void mo13845a(KoinApplication koinApplication) {
        Intrinsics2.m13090f(koinApplication, "koinApplication");
        synchronized (this) {
            if (this.f30895a != null) {
                throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
            }
            this.f30895a = koinApplication.f30890b;
        }
    }

    @Override // p526i1.p536d.p543c.p544g.KoinContext
    public Koin get() {
        Koin koin = this.f30895a;
        if (koin != null) {
            return koin;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }
}
