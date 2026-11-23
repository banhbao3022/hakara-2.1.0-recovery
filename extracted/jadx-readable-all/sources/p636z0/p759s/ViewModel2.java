package p636z0.p759s;

import java.io.Closeable;
import p007c.p451o.p452a.C5729a;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;

/* JADX INFO: renamed from: z0.s.d, reason: use source file name */
/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModel2 implements Closeable, CoroutineScope {

    /* JADX INFO: renamed from: f */
    public final CoroutineContext f38692f;

    public ViewModel2(CoroutineContext coroutineContext) {
        Intrinsics2.m13089e(coroutineContext, "context");
        this.f38692f = coroutineContext;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C5729a.m12452g(this.f38692f, null, 1, null);
    }

    @Override // p500e1.p501a.CoroutineScope
    /* JADX INFO: renamed from: h */
    public CoroutineContext mo417h() {
        return this.f38692f;
    }
}
