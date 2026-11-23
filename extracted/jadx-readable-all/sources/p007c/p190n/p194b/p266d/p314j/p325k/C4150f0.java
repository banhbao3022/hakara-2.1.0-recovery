package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.f0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4150f0 extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Long f23144j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f23145k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f23146l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Bundle f23147m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean f23148n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean f23149o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C4177h f23150p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4150f0(C4177h c4177h, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(true);
        this.f23150p = c4177h;
        this.f23144j = l;
        this.f23145k = str;
        this.f23146l = str2;
        this.f23147m = bundle;
        this.f23148n = z;
        this.f23149o = z2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        Long l = this.f23144j;
        this.f23150p.f23204k.logEvent(this.f23145k, this.f23146l, this.f23147m, this.f23148n, this.f23149o, l == null ? this.f23205f : l.longValue());
    }
}
