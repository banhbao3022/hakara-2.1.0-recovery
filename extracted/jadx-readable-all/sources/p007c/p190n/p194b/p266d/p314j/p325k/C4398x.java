package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.x */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4398x extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f23596j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f23597k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f23598l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ BinderC4274nc f23599m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C4177h f23600n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4398x(C4177h c4177h, String str, String str2, boolean z, BinderC4274nc binderC4274nc) {
        super(true);
        this.f23600n = c4177h;
        this.f23596j = str;
        this.f23597k = str2;
        this.f23598l = z;
        this.f23599m = binderC4274nc;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23600n.f23204k.getUserProperties(this.f23596j, this.f23597k, this.f23598l, this.f23599m);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: b */
    public final void mo9389b() {
        this.f23599m.mo10100V(null);
    }
}
