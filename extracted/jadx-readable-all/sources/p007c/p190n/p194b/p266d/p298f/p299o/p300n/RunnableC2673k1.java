package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.k1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2673k1 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LifecycleCallback f11721f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f11722g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2676l1 f11723h;

    public RunnableC2673k1(C2676l1 c2676l1, LifecycleCallback lifecycleCallback, String str) {
        this.f11723h = c2676l1;
        this.f11721f = lifecycleCallback;
        this.f11722g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2676l1 c2676l1 = this.f11723h;
        if (c2676l1.f11727e0 > 0) {
            LifecycleCallback lifecycleCallback = this.f11721f;
            Bundle bundle = c2676l1.f11728f0;
            lifecycleCallback.mo5505d(bundle != null ? bundle.getBundle(this.f11722g) : null);
        }
        if (this.f11723h.f11727e0 >= 2) {
            this.f11721f.mo5555g();
        }
        if (this.f11723h.f11727e0 >= 3) {
            this.f11721f.mo5554e();
        }
        if (this.f11723h.f11727e0 >= 4) {
            this.f11721f.mo5556h();
        }
        if (this.f11723h.f11727e0 >= 5) {
            Objects.requireNonNull(this.f11721f);
        }
    }
}
