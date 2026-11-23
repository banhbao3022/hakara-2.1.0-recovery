package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ct0 extends at0 {
    public ct0(Context context) {
        this.f12271f = new C2844ai(context, C2330u.f10884a.f10903r.m4786a(), this, this);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: c0 */
    public final void mo5563c0(Bundle bundle) {
        synchronized (this.f12267b) {
            try {
                if (!this.f12269d) {
                    this.f12269d = true;
                    try {
                        try {
                            this.f12271f.m5815C().mo6816a1(this.f12270e, new zs0(this));
                        } catch (Throwable th) {
                            C2998en c2998en = C2330u.f10884a.f10893h;
                            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(th, "RemoteSignalsClientTask.onConnected");
                            this.f12266a.m7287b(new ot0(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f12266a.m7287b(new ot0(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
