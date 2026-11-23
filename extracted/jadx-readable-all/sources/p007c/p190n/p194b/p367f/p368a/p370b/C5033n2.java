package p007c.p190n.p194b.p367f.p368a.p370b;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0;

/* JADX INFO: renamed from: c.n.b.f.a.b.n2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5033n2 implements InterfaceC5094h0<Executor> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25891a = 0;

    public C5033n2() {
    }

    public C5033n2(byte[] bArr) {
    }

    public C5033n2(char[] cArr) {
    }

    public C5033n2(short[] sArr) {
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [c.n.b.f.a.b.d0, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v6, types: [c.n.b.f.a.b.m0, java.util.concurrent.Executor] */
    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0
    /* JADX INFO: renamed from: a */
    public final Executor mo11416a() {
        int i = this.f25891a;
        if (i == 0) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(ThreadFactoryC4997e2.f25750a);
            Objects.requireNonNull(executorServiceNewSingleThreadExecutor, "Cannot return null from a non-@Nullable @Provides method");
            return executorServiceNewSingleThreadExecutor;
        }
        if (i != 1) {
            return i != 2 ? new C5027m0() : new C4991d0();
        }
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor(ThreadFactoryC4997e2.f25751b);
        Objects.requireNonNull(executorServiceNewSingleThreadExecutor2, "Cannot return null from a non-@Nullable @Provides method");
        return executorServiceNewSingleThreadExecutor2;
    }
}
