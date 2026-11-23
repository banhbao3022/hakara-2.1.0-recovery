package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.DeadObjectException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;

/* JADX INFO: renamed from: c.n.b.d.j.a.w9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3651w9 implements AbstractC2717c.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3147io f21020a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3725y9 f21021b;

    public C3651w9(C3725y9 c3725y9, C3147io c3147io) {
        this.f21021b = c3725y9;
        this.f21020a = c3147io;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: Q */
    public final void mo5562Q(int i) {
        this.f21020a.m7287b(new RuntimeException(outline.m1585g(34, "onConnectionSuspended: ", i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: c0 */
    public final void mo5563c0(Bundle bundle) {
        try {
            this.f21020a.m7286a((C3502s9) this.f21021b.f21813a.m5581u());
        } catch (DeadObjectException e) {
            this.f21020a.m7287b(e);
        }
    }
}
