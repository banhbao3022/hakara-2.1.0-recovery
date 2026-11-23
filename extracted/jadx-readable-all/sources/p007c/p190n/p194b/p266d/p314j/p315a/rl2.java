package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rl2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ IOException f18947f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ vl2 f18948g;

    public rl2(vl2 vl2Var, IOException iOException) {
        this.f18948g = vl2Var;
        this.f18947f = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wl2 wl2Var = this.f18948g.f20844j;
        IOException iOException = this.f18947f;
        C3002er c3002er = (C3002er) wl2Var;
        InterfaceC2965dr interfaceC2965dr = c3002er.f13662r;
        if (interfaceC2965dr != null) {
            if (c3002er.f13657m.f21292k) {
                interfaceC2965dr.mo6426a("onLoadException", iOException);
            } else {
                interfaceC2965dr.mo6427b("onLoadError", iOException);
            }
        }
    }
}
