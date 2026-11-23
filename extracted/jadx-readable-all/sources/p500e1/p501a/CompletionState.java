package p500e1.p501a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p477d1.p485u.Continuation;

/* JADX INFO: renamed from: e1.a.k, reason: use source file name */
/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CompletionState extends CompletionState2 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29768c = AtomicIntegerFieldUpdater.newUpdater(CompletionState.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    public CompletionState(Continuation<?> continuation, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + continuation + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }
}
