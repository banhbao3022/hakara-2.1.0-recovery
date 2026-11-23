package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.os.Handler;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p636z0.p691g.ArraySet2;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.v */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2695v extends AbstractDialogInterfaceOnCancelListenerC2649c1 {

    /* JADX INFO: renamed from: k */
    public final ArraySet2<C2644b<?>> f11762k;

    /* JADX INFO: renamed from: l */
    public C2659g f11763l;

    public C2695v(InterfaceC2668j interfaceC2668j) {
        super(interfaceC2668j);
        this.f11762k = new ArraySet2<>();
        interfaceC2668j.mo5540a("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: e */
    public void mo5554e() {
        if (this.f11762k.isEmpty()) {
            return;
        }
        this.f11763l.m5514a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: g */
    public void mo5555g() {
        this.f11644g = true;
        if (this.f11762k.isEmpty()) {
            return;
        }
        this.f11763l.m5514a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: h */
    public void mo5556h() {
        this.f11644g = false;
        C2659g c2659g = this.f11763l;
        Objects.requireNonNull(c2659g);
        synchronized (C2659g.f11660h) {
            if (c2659g.f11669q == this) {
                c2659g.f11669q = null;
                c2659g.f11670r.clear();
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractDialogInterfaceOnCancelListenerC2649c1
    /* JADX INFO: renamed from: i */
    public final void mo5507i(C2602b c2602b, int i) {
        C2659g c2659g = this.f11763l;
        if (c2659g.m5516d(c2602b, i)) {
            return;
        }
        Handler handler = c2659g.f11672t;
        handler.sendMessage(handler.obtainMessage(5, i, 0, c2602b));
    }
}
