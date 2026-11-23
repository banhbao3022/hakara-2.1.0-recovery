package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xp0 extends AbstractBinderC2846ak {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ yp0 f21634f;

    public xp0(yp0 yp0Var) {
        this.f21634f = yp0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2883bk
    /* JADX INFO: renamed from: Q1 */
    public final void mo6028Q1(InterfaceC3624vj interfaceC3624vj) throws RemoteException {
        yp0 yp0Var = this.f21634f;
        pp0 pp0Var = yp0Var.f21966b;
        long j2 = yp0Var.f21965a;
        Objects.requireNonNull(pp0Var);
        op0 op0Var = new op0("rewarded");
        op0Var.f17713a = Long.valueOf(j2);
        op0Var.f17715c = "onUserEarnedReward";
        op0Var.f17717e = interfaceC3624vj.mo8121c();
        op0Var.f17718f = Integer.valueOf(interfaceC3624vj.mo8122d());
        pp0Var.m8143e(op0Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2883bk
    /* JADX INFO: renamed from: c */
    public final void mo6029c() throws RemoteException {
        yp0 yp0Var = this.f21634f;
        pp0 pp0Var = yp0Var.f21966b;
        long j2 = yp0Var.f21965a;
        Objects.requireNonNull(pp0Var);
        op0 op0Var = new op0("rewarded");
        op0Var.f17713a = Long.valueOf(j2);
        op0Var.f17715c = "onRewardedAdOpened";
        pp0Var.m8143e(op0Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2883bk
    /* JADX INFO: renamed from: d */
    public final void mo6030d() throws RemoteException {
        yp0 yp0Var = this.f21634f;
        pp0 pp0Var = yp0Var.f21966b;
        long j2 = yp0Var.f21965a;
        Objects.requireNonNull(pp0Var);
        op0 op0Var = new op0("rewarded");
        op0Var.f17713a = Long.valueOf(j2);
        op0Var.f17715c = "onRewardedAdClosed";
        pp0Var.m8143e(op0Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2883bk
    /* JADX INFO: renamed from: d0 */
    public final void mo6031d0(int i) throws RemoteException {
        yp0 yp0Var = this.f21634f;
        yp0Var.f21966b.m8142d(yp0Var.f21965a, i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2883bk
    /* JADX INFO: renamed from: h */
    public final void mo6032h() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2883bk
    /* JADX INFO: renamed from: m0 */
    public final void mo6033m0(yv2 yv2Var) throws RemoteException {
        yp0 yp0Var = this.f21634f;
        yp0Var.f21966b.m8142d(yp0Var.f21965a, yv2Var.f22116f);
    }
}
