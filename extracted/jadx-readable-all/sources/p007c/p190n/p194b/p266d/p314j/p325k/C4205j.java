package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4205j extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Bundle f23243j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4177h f23244k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4205j(C4177h c4177h, Bundle bundle) {
        super(true);
        this.f23244k = c4177h;
        this.f23243j = bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23244k.f23204k.setConditionalUserProperty(this.f23243j, this.f23205f);
    }
}
