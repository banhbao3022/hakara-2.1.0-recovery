package p007c.p190n.p194b.p367f.p368a.p375f;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.review.ReviewInfo;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.f.h */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5134h extends BinderC5133g<ReviewInfo> {
    public BinderC5134h(C5135i c5135i, C5151o c5151o) {
        super(c5135i, new C5089f("OnRequestInstallCallback"), c5151o);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p190n.p194b.p367f.p368a.p375f.BinderC5133g, p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5087e
    /* JADX INFO: renamed from: j3 */
    public final void mo11530j3(Bundle bundle) throws RemoteException {
        this.f26092h.f26094b.m11549b();
        this.f26090f.m11533b(4, "onGetLaunchReviewFlowInfo", new Object[0]);
        this.f26091g.m11573b((T) new C5127a((PendingIntent) bundle.get("confirmation_intent")));
    }
}
