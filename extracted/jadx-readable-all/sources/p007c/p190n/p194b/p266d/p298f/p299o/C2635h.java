package p007c.p190n.p194b.p266d.p298f.p299o;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;

/* JADX INFO: renamed from: c.n.b.d.f.o.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2635h<R extends InterfaceC2638k> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: n */
    public final R f11625n;

    public C2635h(AbstractC2632e abstractC2632e, R r) {
        super(abstractC2632e);
        this.f11625n = r;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: f */
    public final R mo4929f(Status status) {
        return this.f11625n;
    }
}
