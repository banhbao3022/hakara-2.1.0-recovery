package p007c.p190n.p194b.p266d.p297e;

import android.os.Bundle;

/* JADX INFO: renamed from: c.n.b.d.e.q */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2590q extends AbstractC2593t<Void> {
    public C2590q(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // p007c.p190n.p194b.p266d.p297e.AbstractC2593t
    /* JADX INFO: renamed from: a */
    public final void mo5185a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m5188c(null);
        } else {
            m5187b(new C2592s(4, "Invalid response to one way request"));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p297e.AbstractC2593t
    /* JADX INFO: renamed from: d */
    public final boolean mo5186d() {
        return true;
    }
}
