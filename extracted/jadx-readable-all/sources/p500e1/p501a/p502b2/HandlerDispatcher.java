package p500e1.p501a.p502b2;

import android.os.Handler;
import android.os.Looper;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;
import p477d1.p478a0._Ranges;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p500e1.p501a.CancellableContinuation;
import p500e1.p501a.CancellableContinuationImpl4;
import p500e1.p501a.Delay;
import p500e1.p501a.MainCoroutineDispatcher;

/* JADX INFO: renamed from: e1.a.b2.a, reason: use source file name */
/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerDispatcher extends HandlerDispatcher2 implements Delay {
    private volatile HandlerDispatcher _immediate;

    /* JADX INFO: renamed from: g */
    public final HandlerDispatcher f29625g;

    /* JADX INFO: renamed from: h */
    public final Handler f29626h;

    /* JADX INFO: renamed from: i */
    public final String f29627i;

    /* JADX INFO: renamed from: j */
    public final boolean f29628j;

    /* JADX INFO: renamed from: e1.a.b2.a$a */
    /* JADX INFO: compiled from: Runnable.kt */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CancellableContinuation f29630g;

        public a(CancellableContinuation cancellableContinuation) {
            this.f29630g = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f29630g.mo13255j(HandlerDispatcher.this, Unit.f29502a);
        }
    }

    /* JADX INFO: renamed from: e1.a.b2.a$b */
    /* JADX INFO: compiled from: HandlerDispatcher.kt */
    public static final class b extends Lambda implements InterfaceC6164l<Throwable, Unit> {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Runnable f29632h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable) {
            super(1);
            this.f29632h = runnable;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Throwable th) {
            HandlerDispatcher.this.f29626h.removeCallbacks(this.f29632h);
            return Unit.f29502a;
        }
    }

    public HandlerDispatcher(Handler handler, String str, boolean z) {
        super(null);
        this.f29626h = handler;
        this.f29627i = str;
        this.f29628j = z;
        this._immediate = z ? this : null;
        HandlerDispatcher handlerDispatcher = this._immediate;
        if (handlerDispatcher == null) {
            handlerDispatcher = new HandlerDispatcher(handler, str, true);
            this._immediate = handlerDispatcher;
        }
        this.f29625g = handlerDispatcher;
    }

    @Override // p500e1.p501a.CoroutineDispatcher
    /* JADX INFO: renamed from: F0 */
    public void mo13118F0(CoroutineContext coroutineContext, Runnable runnable) {
        this.f29626h.post(runnable);
    }

    @Override // p500e1.p501a.CoroutineDispatcher
    /* JADX INFO: renamed from: G0 */
    public boolean mo13119G0(CoroutineContext coroutineContext) {
        return !this.f29628j || (Intrinsics2.m13085a(Looper.myLooper(), this.f29626h.getLooper()) ^ true);
    }

    @Override // p500e1.p501a.MainCoroutineDispatcher
    /* JADX INFO: renamed from: H0 */
    public MainCoroutineDispatcher mo13122H0() {
        return this.f29625g;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HandlerDispatcher) && ((HandlerDispatcher) obj).f29626h == this.f29626h;
    }

    @Override // p500e1.p501a.Delay
    /* JADX INFO: renamed from: h */
    public void mo13123h(long j2, CancellableContinuation<? super Unit> cancellableContinuation) {
        a aVar = new a(cancellableContinuation);
        this.f29626h.postDelayed(aVar, _Ranges.m12966a(j2, 4611686018427387903L));
        ((CancellableContinuationImpl4) cancellableContinuation).mo13254i(new b(aVar));
    }

    public int hashCode() {
        return System.identityHashCode(this.f29626h);
    }

    @Override // p500e1.p501a.MainCoroutineDispatcher, p500e1.p501a.CoroutineDispatcher
    public String toString() {
        String strM13272I0 = m13272I0();
        if (strM13272I0 != null) {
            return strM13272I0;
        }
        String string = this.f29627i;
        if (string == null) {
            string = this.f29626h.toString();
        }
        return this.f29628j ? outline.m1599u(string, ".immediate") : string;
    }

    public /* synthetic */ HandlerDispatcher(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public HandlerDispatcher(Handler handler, String str) {
        this(handler, str, false);
    }
}
