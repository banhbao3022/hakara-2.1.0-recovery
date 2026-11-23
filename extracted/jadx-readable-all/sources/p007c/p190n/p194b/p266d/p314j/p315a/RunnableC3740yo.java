package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: renamed from: c.n.b.d.j.a.yo */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3740yo implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2963dp f21936f;

    public RunnableC3740yo(TextureViewSurfaceTextureListenerC2963dp textureViewSurfaceTextureListenerC2963dp) {
        this.f21936f = textureViewSurfaceTextureListenerC2963dp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3000ep interfaceC3000ep = this.f21936f.f13357v;
        if (interfaceC3000ep != null) {
            C3333np c3333np = (C3333np) interfaceC3000ep;
            c3333np.f17197i.m8898b();
            C2267h1.f10713a.post(new RunnableC3222kp(c3333np));
        }
    }
}
