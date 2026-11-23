package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.y */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4411y extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ BinderC4274nc f23631j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4177h f23632k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4411y(C4177h c4177h, BinderC4274nc binderC4274nc) {
        super(true);
        this.f23632k = c4177h;
        this.f23631j = binderC4274nc;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23632k.f23204k.getCurrentScreenClass(this.f23631j);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: b */
    public final void mo9389b() {
        this.f23631j.mo10100V(null);
    }
}
