package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.n.b.d.k.b.n6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4608n6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f24180f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4500e6 f24181g;

    public RunnableC4608n6(C4500e6 c4500e6, long j2) {
        this.f24181g = c4500e6;
        this.f24180f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24181g.m10528w(this.f24180f, true);
        this.f24181g.m10385p().m10767A(new AtomicReference<>());
    }
}
