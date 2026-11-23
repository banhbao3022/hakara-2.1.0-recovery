package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.d0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4122d0 extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4177h.c f23108j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4177h f23109k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4122d0(C4177h c4177h, C4177h.c cVar) {
        super(true);
        this.f23109k = c4177h;
        this.f23108j = cVar;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23109k.f23204k.registerOnMeasurementEventListener(this.f23108j);
    }
}
