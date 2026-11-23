package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.u */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2693u implements AbstractC2634g.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BasePendingResult f11757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2664h1 f11758b;

    public C2693u(C2664h1 c2664h1, BasePendingResult basePendingResult) {
        this.f11758b = c2664h1;
        this.f11757a = basePendingResult;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g.a
    /* JADX INFO: renamed from: a */
    public final void mo5495a(Status status) {
        this.f11758b.f11701a.remove(this.f11757a);
    }
}
