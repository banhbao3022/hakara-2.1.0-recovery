package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wp0 extends AbstractBinderC2995ek {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ yp0 f21293f;

    public wp0(yp0 yp0Var) {
        this.f21293f = yp0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3032fk
    /* JADX INFO: renamed from: c */
    public final void mo6360c() throws RemoteException {
        yp0 yp0Var = this.f21293f;
        pp0 pp0Var = yp0Var.f21966b;
        long j2 = yp0Var.f21965a;
        Objects.requireNonNull(pp0Var);
        op0 op0Var = new op0("rewarded");
        op0Var.f17713a = Long.valueOf(j2);
        op0Var.f17715c = "onRewardedAdLoaded";
        pp0Var.m8143e(op0Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3032fk
    /* JADX INFO: renamed from: s */
    public final void mo6361s(yv2 yv2Var) throws RemoteException {
        yp0 yp0Var = this.f21293f;
        yp0Var.f21966b.m8141c(yp0Var.f21965a, yv2Var.f22116f);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3032fk
    /* JADX INFO: renamed from: y */
    public final void mo6362y(int i) throws RemoteException {
        yp0 yp0Var = this.f21293f;
        yp0Var.f21966b.m8141c(yp0Var.f21965a, i);
    }
}
