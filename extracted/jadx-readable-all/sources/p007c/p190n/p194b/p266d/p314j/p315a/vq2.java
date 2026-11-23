package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vq2 {

    /* JADX INFO: renamed from: a */
    public final Executor f20911a;

    public vq2(Handler handler) {
        this.f20911a = new zo2(handler);
    }

    /* JADX INFO: renamed from: a */
    public final void m8585a(AbstractC3679x0<?> abstractC3679x0, C3092h6<?> c3092h6, Runnable runnable) {
        synchronized (abstractC3679x0.f21407j) {
            abstractC3679x0.f21411n = true;
        }
        abstractC3679x0.m8702f("post-response");
        Executor executor = this.f20911a;
        ((zo2) executor).f22377f.post(new aq2(abstractC3679x0, c3092h6, runnable));
    }

    /* JADX INFO: renamed from: b */
    public final void m8586b(AbstractC3679x0<?> abstractC3679x0, C2872b9 c2872b9) {
        abstractC3679x0.m8702f("post-error");
        C3092h6 c3092h6 = new C3092h6(c2872b9);
        Executor executor = this.f20911a;
        ((zo2) executor).f22377f.post(new aq2(abstractC3679x0, c3092h6, null));
    }
}
