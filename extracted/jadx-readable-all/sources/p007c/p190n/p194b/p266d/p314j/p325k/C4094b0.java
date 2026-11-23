package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.b0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4094b0 extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f23074j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ BinderC4274nc f23075k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C4177h f23076l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4094b0(C4177h c4177h, String str, BinderC4274nc binderC4274nc) {
        super(true);
        this.f23076l = c4177h;
        this.f23074j = str;
        this.f23075k = binderC4274nc;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23076l.f23204k.getMaxUserProperties(this.f23074j, this.f23075k);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: b */
    public final void mo9389b() {
        this.f23075k.mo10100V(null);
    }
}
