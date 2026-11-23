package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class hv1<V> implements kv1<V> {

    /* JADX INFO: renamed from: f */
    public static final kv1<?> f15025f = new hv1(null);

    /* JADX INFO: renamed from: g */
    public static final Logger f15026g = Logger.getLogger(hv1.class.getName());

    /* JADX INFO: renamed from: h */
    @NullableDecl
    public final V f15027h;

    public hv1(@NullableDecl V v) {
        this.f15027h = v;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kv1
    /* JADX INFO: renamed from: f */
    public final void mo6230f(Runnable runnable, Executor executor) {
        C2622l.m5289N1(runnable, "Runnable was null.");
        C2622l.m5289N1(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f15026g;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", outline.m1553D(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f15027h;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws ExecutionException {
        Objects.requireNonNull(timeUnit);
        return this.f15027h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f15027h);
        return outline.m1553D(new StringBuilder(String.valueOf(string).length() + 27 + strValueOf.length()), string, "[status=SUCCESS, result=[", strValueOf, "]]");
    }
}
