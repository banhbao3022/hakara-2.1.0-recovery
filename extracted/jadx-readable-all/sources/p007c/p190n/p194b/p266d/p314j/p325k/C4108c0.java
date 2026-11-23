package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.c0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4108c0 extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f23098j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4177h f23099k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4108c0(C4177h c4177h, boolean z) {
        super(true);
        this.f23099k = c4177h;
        this.f23098j = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23099k.f23204k.setDataCollectionEnabled(this.f23098j);
    }
}
