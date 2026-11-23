package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Binder;

/* JADX INFO: renamed from: c.n.b.d.j.a.v9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3614v9 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3725y9 f20714f;

    public RunnableC3614v9(C3725y9 c3725y9) {
        this.f20714f = c3725y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3725y9 c3725y9 = this.f20714f;
        if (c3725y9.f21813a == null) {
            return;
        }
        c3725y9.f21813a.mo5133J();
        Binder.flushPendingCommands();
    }
}
