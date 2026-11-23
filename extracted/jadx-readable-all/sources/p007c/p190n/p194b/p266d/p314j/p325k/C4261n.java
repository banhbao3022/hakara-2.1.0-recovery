package p007c.p190n.p194b.p266d.p314j.p325k;

import android.app.Activity;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.j.k.n */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4261n extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Activity f23328j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f23329k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f23330l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C4177h f23331m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4261n(C4177h c4177h, Activity activity, String str, String str2) {
        super(true);
        this.f23331m = c4177h;
        this.f23328j = activity;
        this.f23329k = str;
        this.f23330l = str2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        this.f23331m.f23204k.setCurrentScreen(new BinderC2800b(this.f23328j), this.f23329k, this.f23330l, this.f23205f);
    }
}
