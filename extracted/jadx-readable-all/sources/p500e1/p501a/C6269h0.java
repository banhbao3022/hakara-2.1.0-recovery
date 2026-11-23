package p500e1.p501a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p007c.p451o.p452a.C5729a;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p486i.IntrinsicsJvm;
import p500e1.p501a.p503c2.DispatchedContinuation2;
import p500e1.p501a.p503c2.Scopes2;

/* JADX INFO: renamed from: e1.a.h0 */
/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C6269h0<T> extends Scopes2<T> {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29744j = AtomicIntegerFieldUpdater.newUpdater(C6269h0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public C6269h0(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
        this._decision = 0;
    }

    @Override // p500e1.p501a.p503c2.Scopes2, p500e1.p501a.AbstractCoroutine
    /* JADX INFO: renamed from: R */
    public void mo13111R(Object obj) {
        boolean z;
        while (true) {
            int i = this._decision;
            z = false;
            if (i != 0) {
                if (i == 1) {
                    break;
                } else {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f29744j.compareAndSet(this, 0, 2)) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        DispatchedContinuation2.m13142b(IntrinsicsJvm.m13064b(this.f29668i), C5729a.m12432E(obj, this.f29668i), null, 2);
    }

    /* JADX INFO: renamed from: V */
    public final Object m13219V() {
        boolean z;
        while (true) {
            int i = this._decision;
            z = false;
            if (i != 0) {
                if (i == 2) {
                    break;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
            if (f29744j.compareAndSet(this, 0, 1)) {
                z = true;
                break;
            }
        }
        if (z) {
            return Intrinsics.COROUTINE_SUSPENDED;
        }
        Object objM13259a = C6273i1.m13259a(m13242x());
        if (objM13259a instanceof CompletionState2) {
            throw ((CompletionState2) objM13259a).f29810b;
        }
        return objM13259a;
    }

    @Override // p500e1.p501a.p503c2.Scopes2, p500e1.p501a.C6270h1
    /* JADX INFO: renamed from: d */
    public void mo13162d(Object obj) {
        mo13111R(obj);
    }
}
