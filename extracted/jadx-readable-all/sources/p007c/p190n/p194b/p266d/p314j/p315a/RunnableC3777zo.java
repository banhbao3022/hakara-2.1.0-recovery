package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.zo */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3777zo implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f22361f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22362g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2963dp f22363h;

    public RunnableC3777zo(TextureViewSurfaceTextureListenerC2963dp textureViewSurfaceTextureListenerC2963dp, int i, int i2) {
        this.f22363h = textureViewSurfaceTextureListenerC2963dp;
        this.f22361f = i;
        this.f22362g = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3000ep interfaceC3000ep = this.f22363h.f13357v;
        if (interfaceC3000ep != null) {
            ((C3333np) interfaceC3000ep).m7907j(this.f22361f, this.f22362g);
        }
    }
}
