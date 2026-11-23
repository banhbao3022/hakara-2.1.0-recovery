package p500e1.p501a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;

/* JADX INFO: renamed from: e1.a.a1 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C6208a1 extends AbstractC6261e1 {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29619j = AtomicIntegerFieldUpdater.newUpdater(C6208a1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* JADX INFO: renamed from: k */
    public final InterfaceC6164l<Throwable, Unit> f29620k;

    /* JADX WARN: Multi-variable type inference failed */
    public C6208a1(InterfaceC6164l<? super Throwable, Unit> interfaceC6164l) {
        this.f29620k = interfaceC6164l;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Unit mo3b(Throwable th) {
        mo13120q(th);
        return Unit.f29502a;
    }

    @Override // p500e1.p501a.CompletionHandler2
    /* JADX INFO: renamed from: q */
    public void mo13120q(Throwable th) {
        if (f29619j.compareAndSet(this, 0, 1)) {
            this.f29620k.mo3b(th);
        }
    }
}
