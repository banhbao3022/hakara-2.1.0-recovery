package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.i1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2667i1 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LifecycleCallback f11707f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f11708g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ FragmentC2670j1 f11709h;

    public RunnableC2667i1(FragmentC2670j1 fragmentC2670j1, LifecycleCallback lifecycleCallback, String str) {
        this.f11709h = fragmentC2670j1;
        this.f11707f = lifecycleCallback;
        this.f11708g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentC2670j1 fragmentC2670j1 = this.f11709h;
        if (fragmentC2670j1.f11714h > 0) {
            LifecycleCallback lifecycleCallback = this.f11707f;
            Bundle bundle = fragmentC2670j1.f11715i;
            lifecycleCallback.mo5505d(bundle != null ? bundle.getBundle(this.f11708g) : null);
        }
        if (this.f11709h.f11714h >= 2) {
            this.f11707f.mo5555g();
        }
        if (this.f11709h.f11714h >= 3) {
            this.f11707f.mo5554e();
        }
        if (this.f11709h.f11714h >= 4) {
            this.f11707f.mo5556h();
        }
        if (this.f11709h.f11714h >= 5) {
            Objects.requireNonNull(this.f11707f);
        }
    }
}
