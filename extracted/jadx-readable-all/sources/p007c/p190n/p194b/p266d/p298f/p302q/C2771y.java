package p007c.p190n.p194b.p266d.p298f.p302q;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: c.n.b.d.f.q.y */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2771y extends AbstractDialogInterfaceOnClickListenerC2729g {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Intent f11931f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Activity f11932g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11933h;

    public C2771y(Intent intent, Activity activity, int i) {
        this.f11931f = intent;
        this.f11932g = activity;
        this.f11933h = i;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractDialogInterfaceOnClickListenerC2729g
    /* JADX INFO: renamed from: a */
    public final void mo5593a() {
        Intent intent = this.f11931f;
        if (intent != null) {
            this.f11932g.startActivityForResult(intent, this.f11933h);
        }
    }
}
