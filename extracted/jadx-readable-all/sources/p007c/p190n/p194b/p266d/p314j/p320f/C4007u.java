package p007c.p190n.p194b.p266d.p314j.p320f;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;

/* JADX INFO: renamed from: c.n.b.d.j.f.u */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4007u<R extends InterfaceC2638k> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: n */
    public final InterfaceC3998t<R, Status> f22882n;

    public C4007u(InterfaceC3998t<R, Status> interfaceC3998t) {
        super((AbstractC2632e) null);
        this.f22882n = interfaceC3998t;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: f */
    public final R mo4929f(Status status) {
        return (R) this.f22882n.mo9108a(status);
    }
}
