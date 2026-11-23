package p007c.p190n.p194b.p266d.p267a.p282z.p283a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractBinderC2918ch;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.uv2;

/* JADX INFO: renamed from: c.n.b.d.a.z.a.x */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2241x extends AbstractBinderC2918ch {

    /* JADX INFO: renamed from: g */
    public final AdOverlayInfoParcel f10683g;

    /* JADX INFO: renamed from: h */
    public final Activity f10684h;

    /* JADX INFO: renamed from: i */
    public boolean f10685i = false;

    /* JADX INFO: renamed from: j */
    public boolean f10686j = false;

    public BinderC2241x(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f10683g = adOverlayInfoParcel;
        this.f10684h = activity;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: H */
    public final void mo4674H(InterfaceC2799a interfaceC2799a) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: Y1 */
    public final void mo4682Y1(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f10685i);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4705a() {
        if (this.f10686j) {
            return;
        }
        InterfaceC2235r interfaceC2235r = this.f10683g.f28469h;
        if (interfaceC2235r != null) {
            interfaceC2235r.mo4699J3(4);
        }
        this.f10686j = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: c */
    public final void mo4685c() throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: c6 */
    public final void mo4686c6(Bundle bundle) {
        InterfaceC2235r interfaceC2235r;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14386k5)).booleanValue()) {
            this.f10684h.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10683g;
        if (adOverlayInfoParcel == null) {
            this.f10684h.finish();
            return;
        }
        if (z) {
            this.f10684h.finish();
            return;
        }
        if (bundle == null) {
            uv2 uv2Var = adOverlayInfoParcel.f28468g;
            if (uv2Var != null) {
                uv2Var.mo2739i0();
            }
            if (this.f10684h.getIntent() != null && this.f10684h.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (interfaceC2235r = this.f10683g.f28469h) != null) {
                interfaceC2235r.mo4698F3();
            }
        }
        C2216a c2216a = C2330u.f10884a.f10887b;
        Activity activity = this.f10684h;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f10683g;
        C2223f c2223f = adOverlayInfoParcel2.f28467f;
        if (C2216a.m4668b(activity, c2223f, adOverlayInfoParcel2.f28475n, c2223f.f10640n)) {
            return;
        }
        this.f10684h.finish();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: d */
    public final void mo4687d() throws RemoteException {
        InterfaceC2235r interfaceC2235r = this.f10683g.f28469h;
        if (interfaceC2235r != null) {
            interfaceC2235r.mo4702r0();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: d2 */
    public final void mo4688d2(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: f */
    public final boolean mo4689f() throws RemoteException {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: h */
    public final void mo4690h() throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: i */
    public final void mo4691i() throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: j */
    public final void mo4692j() throws RemoteException {
        InterfaceC2235r interfaceC2235r = this.f10683g.f28469h;
        if (interfaceC2235r != null) {
            interfaceC2235r.mo4701i1();
        }
        if (this.f10684h.isFinishing()) {
            m4705a();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: k */
    public final void mo4693k() throws RemoteException {
        if (this.f10685i) {
            this.f10684h.finish();
            return;
        }
        this.f10685i = true;
        InterfaceC2235r interfaceC2235r = this.f10683g.f28469h;
        if (interfaceC2235r != null) {
            interfaceC2235r.mo4700O5();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: l */
    public final void mo4694l() throws RemoteException {
        if (this.f10684h.isFinishing()) {
            m4705a();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: n */
    public final void mo4695n() throws RemoteException {
        if (this.f10684h.isFinishing()) {
            m4705a();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: q */
    public final void mo4696q() throws RemoteException {
    }
}
