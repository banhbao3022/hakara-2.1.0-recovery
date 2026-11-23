package p500e1.p501a.p504d2;

import p007c.p451o.p452a.C5729a;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.p503c2.SystemProps;

/* JADX INFO: renamed from: e1.a.d2.b, reason: use source file name */
/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Dispatcher extends Dispatcher2 {

    /* JADX INFO: renamed from: l */
    public static final CoroutineDispatcher f29709l;

    /* JADX INFO: renamed from: m */
    public static final Dispatcher f29710m;

    static {
        Dispatcher dispatcher = new Dispatcher();
        f29710m = dispatcher;
        int i = SystemProps.f29670a;
        f29709l = new Dispatcher3(dispatcher, C5729a.m12440M("kotlinx.coroutines.io.parallelism", 64 < i ? i : 64, 0, 0, 12, null), "Dispatchers.IO", 1);
    }

    public Dispatcher() {
        super(0, 0, null, 7, null);
    }

    @Override // p500e1.p501a.p504d2.Dispatcher2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p500e1.p501a.p504d2.Dispatcher2, p500e1.p501a.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Default";
    }
}
