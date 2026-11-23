package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qk1 implements zc2<lv1> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 rv1Var;
        ExecutorService executorServiceM8587a = wr1.f21313b.m8587a(1, Executors.defaultThreadFactory(), 2);
        if (executorServiceM8587a instanceof lv1) {
            rv1Var = (lv1) executorServiceM8587a;
        } else {
            rv1Var = executorServiceM8587a instanceof ScheduledExecutorService ? new rv1((ScheduledExecutorService) executorServiceM8587a) : new nv1(executorServiceM8587a);
        }
        Objects.requireNonNull(rv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return rv1Var;
    }
}
