package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qv1 extends au1<Void> implements Runnable {

    /* JADX INFO: renamed from: m */
    public final Runnable f18546m;

    public qv1(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.f18546m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f18546m.run();
        } catch (Throwable th) {
            mo6532m(th);
            Object obj = ms1.f16843a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }
}
