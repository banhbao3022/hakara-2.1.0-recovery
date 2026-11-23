package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.o */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4275o extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Bundle f23374j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4177h f23375k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4275o(C4177h c4177h, Bundle bundle) {
        super(true);
        this.f23375k = c4177h;
        this.f23374j = bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23375k.f23204k.setConsent(this.f23374j, this.f23205f);
    }
}
