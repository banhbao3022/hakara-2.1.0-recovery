package p500e1.p501a;

import java.util.concurrent.Executor;
import p477d1.p485u.CoroutineContextImpl4;

/* JADX INFO: renamed from: e1.a.j0, reason: use source file name */
/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Executors2 implements Executor {

    /* JADX INFO: renamed from: f */
    public final CoroutineDispatcher f29766f;

    public Executors2(CoroutineDispatcher coroutineDispatcher) {
        this.f29766f = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f29766f.mo13118F0(CoroutineContextImpl4.f29535f, runnable);
    }

    public String toString() {
        return this.f29766f.toString();
    }
}
