package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zp0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final lq0 f22380f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3059ga f22381g;

    public zp0(lq0 lq0Var, InterfaceC3059ga interfaceC3059ga) {
        this.f22380f = lq0Var;
        this.f22381g = interfaceC3059ga;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lq0 lq0Var = this.f22380f;
        try {
            this.f22381g.mo6615T4(lq0Var.m7603b());
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
    }
}
