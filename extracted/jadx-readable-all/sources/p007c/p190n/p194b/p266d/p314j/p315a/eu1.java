package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eu1 extends AbstractExecutorService implements lv1 {
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new yv1(Executors.callable(runnable, t));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return (kv1) super.submit(runnable);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lv1
    /* JADX INFO: renamed from: u0 */
    public final <T> kv1<T> mo6691u0(Callable<T> callable) {
        return (kv1) super.submit(callable);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lv1
    /* JADX INFO: renamed from: x0 */
    public final kv1<?> mo6692x0(Runnable runnable) {
        return (kv1) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, @NullableDecl Object obj) {
        return (kv1) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new yv1(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return (kv1) super.submit(callable);
    }
}
