package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pl1<E> {

    /* JADX INFO: renamed from: a */
    public static final kv1<?> f18024a = cw0.m6231a(null);

    /* JADX INFO: renamed from: b */
    public final lv1 f18025b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f18026c;

    /* JADX INFO: renamed from: d */
    public final ql1<E> f18027d;

    public pl1(lv1 lv1Var, ScheduledExecutorService scheduledExecutorService, ql1<E> ql1Var) {
        this.f18025b = lv1Var;
        this.f18026c = scheduledExecutorService;
        this.f18027d = ql1Var;
    }

    /* JADX INFO: renamed from: a */
    public final <I> ol1<I> m8125a(E e, kv1<I> kv1Var) {
        return new ol1<>(this, e, kv1Var, Collections.singletonList(kv1Var), kv1Var);
    }

    /* JADX INFO: renamed from: b */
    public final hl1 m8126b(E e, kv1<?>... kv1VarArr) {
        return new hl1(this, e, Arrays.asList(kv1VarArr));
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo8127c(E e);
}
