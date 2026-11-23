package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ap */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2851ap implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2963dp f12245f;

    public RunnableC2851ap(TextureViewSurfaceTextureListenerC2963dp textureViewSurfaceTextureListenerC2963dp) {
        this.f12245f = textureViewSurfaceTextureListenerC2963dp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3000ep interfaceC3000ep = this.f12245f.f13357v;
        if (interfaceC3000ep != null) {
            ((C3333np) interfaceC3000ep).m7904g();
            ((C3333np) this.f12245f.f13357v).m7906i();
        }
    }
}
