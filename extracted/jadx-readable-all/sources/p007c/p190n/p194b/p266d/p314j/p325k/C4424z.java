package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.z */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4424z extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Bundle f23644j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ BinderC4274nc f23645k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C4177h f23646l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4424z(C4177h c4177h, Bundle bundle, BinderC4274nc binderC4274nc) {
        super(true);
        this.f23646l = c4177h;
        this.f23644j = bundle;
        this.f23645k = binderC4274nc;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23646l.f23204k.performAction(this.f23644j, this.f23645k, this.f23205f);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: b */
    public final void mo9389b() {
        this.f23645k.mo10100V(null);
    }
}
