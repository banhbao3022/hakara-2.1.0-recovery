package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.l */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4233l extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f23277j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f23278k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ BinderC4274nc f23279l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C4177h f23280m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4233l(C4177h c4177h, String str, String str2, BinderC4274nc binderC4274nc) {
        super(true);
        this.f23280m = c4177h;
        this.f23277j = str;
        this.f23278k = str2;
        this.f23279l = binderC4274nc;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23280m.f23204k.getConditionalUserProperties(this.f23277j, this.f23278k, this.f23279l);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: b */
    public final void mo9389b() {
        this.f23279l.mo10100V(null);
    }
}
