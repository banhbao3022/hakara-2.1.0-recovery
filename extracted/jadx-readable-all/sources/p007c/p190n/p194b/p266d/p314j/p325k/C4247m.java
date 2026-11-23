package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4247m extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f23297j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f23298k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Bundle f23299l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C4177h f23300m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4247m(C4177h c4177h, String str, String str2, Bundle bundle) {
        super(true);
        this.f23300m = c4177h;
        this.f23297j = str;
        this.f23298k = str2;
        this.f23299l = bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23300m.f23204k.clearConditionalUserProperty(this.f23297j, this.f23298k, this.f23299l);
    }
}
