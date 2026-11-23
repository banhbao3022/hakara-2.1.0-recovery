package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.Bundle;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.b.l */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5022l extends BinderC5010i<Void> {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5030n f25859h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC5022l(C5030n c5030n, C5151o<Void> c5151o) {
        super(c5030n, c5151o);
        this.f25859h = c5030n;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.BinderC5010i, p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5110p0
    /* JADX INFO: renamed from: H4 */
    public final void mo11451H4(Bundle bundle, Bundle bundle2) {
        super.mo11451H4(bundle, bundle2);
        if (!this.f25859h.f25883g.compareAndSet(true, false)) {
            C5030n.f25877a.m11533b(5, "Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f25859h.mo11433a();
        }
    }
}
