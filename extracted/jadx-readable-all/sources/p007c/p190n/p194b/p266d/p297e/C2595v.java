package p007c.p190n.p194b.p266d.p297e;

import android.os.Bundle;

/* JADX INFO: renamed from: c.n.b.d.e.v */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2595v extends AbstractC2593t<Bundle> {
    public C2595v(int i, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // p007c.p190n.p194b.p266d.p297e.AbstractC2593t
    /* JADX INFO: renamed from: a */
    public final void mo5185a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m5188c(bundle2);
    }

    @Override // p007c.p190n.p194b.p266d.p297e.AbstractC2593t
    /* JADX INFO: renamed from: d */
    public final boolean mo5186d() {
        return false;
    }
}
