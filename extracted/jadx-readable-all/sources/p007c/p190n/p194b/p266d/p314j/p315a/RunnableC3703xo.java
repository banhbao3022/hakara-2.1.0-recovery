package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.xo */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3703xo implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f21624f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f21625g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2963dp f21626h;

    public RunnableC3703xo(TextureViewSurfaceTextureListenerC2963dp textureViewSurfaceTextureListenerC2963dp, String str, String str2) {
        this.f21626h = textureViewSurfaceTextureListenerC2963dp;
        this.f21624f = str;
        this.f21625g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3000ep interfaceC3000ep = this.f21626h.f13357v;
        if (interfaceC3000ep != null) {
            ((C3333np) interfaceC3000ep).m7905h(this.f21624f, this.f21625g);
        }
    }
}
