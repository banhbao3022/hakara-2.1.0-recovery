package p500e1.p501a;

import java.util.Objects;
import p500e1.p501a.p504d2.Dispatcher;

/* JADX INFO: renamed from: e1.a.k0, reason: use source file name */
/* JADX INFO: compiled from: Dispatchers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Dispatchers {

    /* JADX INFO: renamed from: a */
    public static final CoroutineDispatcher f29769a;

    /* JADX INFO: renamed from: b */
    public static final CoroutineDispatcher f29770b;

    static {
        f29769a = CoroutineContext4.f29822a ? Dispatcher.f29710m : CommonPool.f29781h;
        Unconfined2 unconfined2 = Unconfined2.f29818g;
        Objects.requireNonNull(Dispatcher.f29710m);
        f29770b = Dispatcher.f29709l;
    }
}
