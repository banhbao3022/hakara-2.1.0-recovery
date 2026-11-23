package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pp0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3169j9 f18051a;

    public pp0(InterfaceC3169j9 interfaceC3169j9) {
        this.f18051a = interfaceC3169j9;
    }

    /* JADX INFO: renamed from: a */
    public final void m8139a(long j2) throws RemoteException {
        op0 op0Var = new op0("creation");
        op0Var.f17713a = Long.valueOf(j2);
        op0Var.f17715c = "nativeObjectNotCreated";
        m8143e(op0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m8140b(long j2, int i) throws RemoteException {
        op0 op0Var = new op0("interstitial");
        op0Var.f17713a = Long.valueOf(j2);
        op0Var.f17715c = "onAdFailedToLoad";
        op0Var.f17716d = Integer.valueOf(i);
        m8143e(op0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m8141c(long j2, int i) throws RemoteException {
        op0 op0Var = new op0("rewarded");
        op0Var.f17713a = Long.valueOf(j2);
        op0Var.f17715c = "onRewardedAdFailedToLoad";
        op0Var.f17716d = Integer.valueOf(i);
        m8143e(op0Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m8142d(long j2, int i) throws RemoteException {
        op0 op0Var = new op0("rewarded");
        op0Var.f17713a = Long.valueOf(j2);
        op0Var.f17715c = "onRewardedAdFailedToShow";
        op0Var.f17716d = Integer.valueOf(i);
        m8143e(op0Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m8143e(op0 op0Var) throws RemoteException {
        String strM8051a = op0.m8051a(op0Var);
        String strValueOf = String.valueOf(strM8051a);
        C2096e.m4590z(strValueOf.length() != 0 ? "Dispatching AFMA event on publisher webview: ".concat(strValueOf) : new String("Dispatching AFMA event on publisher webview: "));
        this.f18051a.mo7219t(strM8051a);
    }
}
