package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.q */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4303q extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f23409j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4177h f23410k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4303q(C4177h c4177h, String str) {
        super(true);
        this.f23410k = c4177h;
        this.f23409j = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23410k.f23204k.endAdUnitExposure(this.f23409j, this.f23206g);
    }
}
