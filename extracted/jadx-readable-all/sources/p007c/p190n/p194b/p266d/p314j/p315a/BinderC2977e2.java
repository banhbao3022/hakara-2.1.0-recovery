package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.e2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2977e2 extends AbstractBinderC3197k0 {

    /* JADX INFO: renamed from: f */
    public InterfaceC3059ga f13451f;

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: C1 */
    public final void mo6537C1(InterfaceC3059ga interfaceC3059ga) throws RemoteException {
        this.f13451f = interfaceC3059ga;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: I */
    public final void mo6538I(String str) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: K4 */
    public final void mo6539K4(String str) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: T2 */
    public final void mo6540T2(C3125i2 c3125i2) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: X1 */
    public final void mo6541X1(InterfaceC2799a interfaceC2799a, String str) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: Y3 */
    public final void mo6542Y3(InterfaceC3395pd interfaceC3395pd) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: Z1 */
    public final void mo6543Z1(float f) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: Z5 */
    public final void mo6544Z5(InterfaceC3605v0 interfaceC3605v0) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: c */
    public final void mo6545c() throws RemoteException {
        C2622l.m5408n3("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        C3331nn.f17166a.post(new Runnable(this) { // from class: c.n.b.d.j.a.d2

            /* JADX INFO: renamed from: f */
            public final BinderC2977e2 f13160f;

            {
                this.f13160f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC3059ga interfaceC3059ga = this.f13160f.f13451f;
                if (interfaceC3059ga != null) {
                    try {
                        interfaceC3059ga.mo6615T4(Collections.emptyList());
                    } catch (RemoteException e) {
                        C2622l.m5241D3("Could not notify onComplete event.", e);
                    }
                }
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: g2 */
    public final void mo6546g2(String str, InterfaceC2799a interfaceC2799a) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: j */
    public final boolean mo6547j() throws RemoteException {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: k */
    public final float mo6548k() throws RemoteException {
        return 1.0f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: l */
    public final List<C3762z9> mo6549l() throws RemoteException {
        return Collections.emptyList();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: m */
    public final String mo6550m() {
        return "";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: q */
    public final void mo6551q() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: v0 */
    public final void mo6552v0(boolean z) throws RemoteException {
    }
}
