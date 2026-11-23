package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class l41 implements uv2 {

    /* JADX INFO: renamed from: f */
    public InterfaceC3011f f16279f;

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uv2
    /* JADX INFO: renamed from: i0 */
    public final synchronized void mo2739i0() {
        InterfaceC3011f interfaceC3011f = this.f16279f;
        if (interfaceC3011f != null) {
            try {
                interfaceC3011f.mo6273a();
            } catch (RemoteException e) {
                C2622l.m5241D3("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
