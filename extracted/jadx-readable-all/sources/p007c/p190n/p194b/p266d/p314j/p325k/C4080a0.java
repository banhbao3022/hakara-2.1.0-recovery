package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.j.k.a0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4080a0 extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f23022j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f23023k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C4177h f23024l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4080a0(C4177h c4177h, String str, Object obj) {
        super(false);
        this.f23024l = c4177h;
        this.f23022j = str;
        this.f23023k = obj;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23024l.f23204k.logHealthData(5, this.f23022j, new BinderC2800b(this.f23023k), new BinderC2800b(null), new BinderC2800b(null));
    }
}
