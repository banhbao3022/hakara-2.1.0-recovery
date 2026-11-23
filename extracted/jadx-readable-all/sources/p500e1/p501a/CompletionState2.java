package p500e1.p501a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p477d1.p493x.p495c.DefaultConstructorMarker;

/* JADX INFO: renamed from: e1.a.v, reason: use source file name */
/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes.dex */
public class CompletionState2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29809a = AtomicIntegerFieldUpdater.newUpdater(CompletionState2.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* JADX INFO: renamed from: b */
    public final Throwable f29810b;

    public CompletionState2(Throwable th, boolean z) {
        this.f29810b = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: a */
    public final boolean m13294a() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.f29810b + ']';
    }

    public /* synthetic */ CompletionState2(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
