package p007c.p190n.p194b.p266d.p298f.p302q;

import android.content.Intent;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2668j;

/* JADX INFO: renamed from: c.n.b.d.f.q.z */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2773z extends AbstractDialogInterfaceOnClickListenerC2729g {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Intent f11934f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC2668j f11935g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11936h;

    public C2773z(Intent intent, InterfaceC2668j interfaceC2668j, int i) {
        this.f11934f = intent;
        this.f11935g = interfaceC2668j;
        this.f11936h = i;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractDialogInterfaceOnClickListenerC2729g
    /* JADX INFO: renamed from: a */
    public final void mo5593a() {
        Intent intent = this.f11934f;
        if (intent != null) {
            this.f11935g.startActivityForResult(intent, this.f11936h);
        }
    }
}
