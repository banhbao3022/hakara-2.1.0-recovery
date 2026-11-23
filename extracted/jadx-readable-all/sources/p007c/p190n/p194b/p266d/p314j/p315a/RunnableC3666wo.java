package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.wo */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3666wo implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2963dp f21274f;

    public RunnableC3666wo(TextureViewSurfaceTextureListenerC2963dp textureViewSurfaceTextureListenerC2963dp) {
        this.f21274f = textureViewSurfaceTextureListenerC2963dp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3000ep interfaceC3000ep = this.f21274f.f13357v;
        if (interfaceC3000ep != null) {
            C3333np c3333np = (C3333np) interfaceC3000ep;
            c3333np.m7900c("ended", new String[0]);
            c3333np.m7901d();
        }
    }
}
