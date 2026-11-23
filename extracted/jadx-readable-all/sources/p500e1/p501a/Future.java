package p500e1.p501a;

import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;

/* JADX INFO: renamed from: e1.a.f, reason: use source file name */
/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Future extends CancellableContinuationImpl3 {

    /* JADX INFO: renamed from: f */
    public final java.util.concurrent.Future<?> f29740f;

    public Future(java.util.concurrent.Future<?> future) {
        this.f29740f = future;
    }

    @Override // p500e1.p501a.CompletionHandler
    /* JADX INFO: renamed from: a */
    public void mo13213a(Throwable th) {
        this.f29740f.cancel(false);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Throwable th) {
        this.f29740f.cancel(false);
        return Unit.f29502a;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("CancelFutureOnCancel[");
        sbM1556G.append(this.f29740f);
        sbM1556G.append(']');
        return sbM1556G.toString();
    }
}
