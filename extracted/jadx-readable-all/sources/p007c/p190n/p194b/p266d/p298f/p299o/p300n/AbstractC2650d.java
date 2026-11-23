package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a.b;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2650d<R extends InterfaceC2638k, A extends C2628a.b> extends BasePendingResult<R> implements InterfaceC2653e<R> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2650d(C2628a<?> c2628a, AbstractC2632e abstractC2632e) {
        super(abstractC2632e);
        C2622l.m5379i(abstractC2632e, "GoogleApiClient must not be null");
        C2622l.m5379i(c2628a, "Api must not be null");
        if (c2628a.f11606b == null) {
            throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo4930m(A a) throws RemoteException;

    /* JADX INFO: renamed from: n */
    public final void m5509n(Status status) {
        C2622l.m5344b(!status.m12654H(), "Failed result must not be success");
        mo4931a(mo4929f(status));
    }
}
