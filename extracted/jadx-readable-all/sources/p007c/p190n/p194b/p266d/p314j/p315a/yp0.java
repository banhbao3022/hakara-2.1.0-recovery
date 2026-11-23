package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yp0 implements np0 {

    /* JADX INFO: renamed from: a */
    public final long f21965a;

    /* JADX INFO: renamed from: b */
    public final pp0 f21966b;

    /* JADX INFO: renamed from: c */
    public final kh1 f21967c;

    public yp0(long j2, Context context, pp0 pp0Var, AbstractC3264lu abstractC3264lu, String str) {
        this.f21965a = j2;
        this.f21966b = pp0Var;
        C3340nw c3340nwMo7639u = abstractC3264lu.mo7639u();
        Objects.requireNonNull(c3340nwMo7639u);
        Objects.requireNonNull(context);
        c3340nwMo7639u.f17462a = context;
        c3340nwMo7639u.f17463b = str;
        this.f21967c = c3340nwMo7639u.m7945a().f17771h.mo4613a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.np0
    /* JADX INFO: renamed from: a */
    public final void mo7909a() {
        try {
            this.f21967c.mo6916w4(new xp0(this));
            this.f21967c.mo6915t0(new BinderC2800b(null));
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.np0
    /* JADX INFO: renamed from: b */
    public final void mo7910b() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.np0
    /* JADX INFO: renamed from: c */
    public final void mo7911c(ew2 ew2Var) {
        try {
            this.f21967c.mo6902D3(ew2Var, new wp0(this));
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }
}
