package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dm0 implements b70 {

    /* JADX INFO: renamed from: f */
    public final InterfaceC3410ps f13317f;

    public dm0(InterfaceC3410ps interfaceC3410ps) {
        this.f13317f = interfaceC3410ps;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b70
    /* JADX INFO: renamed from: a */
    public final void mo5929a(Context context) {
        InterfaceC3410ps interfaceC3410ps = this.f13317f;
        if (interfaceC3410ps != null) {
            interfaceC3410ps.onPause();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b70
    /* JADX INFO: renamed from: t */
    public final void mo5930t(Context context) {
        InterfaceC3410ps interfaceC3410ps = this.f13317f;
        if (interfaceC3410ps != null) {
            interfaceC3410ps.destroy();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b70
    /* JADX INFO: renamed from: v */
    public final void mo5931v(Context context) {
        InterfaceC3410ps interfaceC3410ps = this.f13317f;
        if (interfaceC3410ps != null) {
            interfaceC3410ps.onResume();
        }
    }
}
