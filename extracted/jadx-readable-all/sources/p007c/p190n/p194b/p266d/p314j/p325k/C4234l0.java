package p007c.p190n.p194b.p266d.p314j.p325k;

import android.app.Activity;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.j.k.l0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4234l0 extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Activity f23281j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4177h.b f23282k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4234l0(C4177h.b bVar, Activity activity) {
        super(true);
        this.f23282k = bVar;
        this.f23281j = activity;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        C4177h.this.f23204k.onActivityStopped(new BinderC2800b(this.f23281j), this.f23206g);
    }
}
