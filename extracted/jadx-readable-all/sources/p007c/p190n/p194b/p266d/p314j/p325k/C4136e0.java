package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.j.k.e0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4136e0 extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f23119j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f23120k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f23121l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean f23122m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C4177h f23123n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4136e0(C4177h c4177h, String str, String str2, Object obj, boolean z) {
        super(true);
        this.f23123n = c4177h;
        this.f23119j = str;
        this.f23120k = str2;
        this.f23121l = obj;
        this.f23122m = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23123n.f23204k.setUserProperty(this.f23119j, this.f23120k, new BinderC2800b(this.f23121l), this.f23122m, this.f23205f);
    }
}
