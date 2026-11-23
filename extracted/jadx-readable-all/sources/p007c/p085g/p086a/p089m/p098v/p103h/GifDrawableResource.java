package p007c.p085g.p086a.p089m.p098v.p103h;

import android.graphics.Bitmap;
import p007c.p085g.p086a.p089m.p092t.Initializable;
import p007c.p085g.p086a.p089m.p098v.p101f.DrawableResource;

/* JADX INFO: renamed from: c.g.a.m.v.h.e, reason: use source file name */
/* JADX INFO: compiled from: GifDrawableResource.java */
/* JADX INFO: loaded from: classes.dex */
public class GifDrawableResource extends DrawableResource<GifDrawable> implements Initializable {
    public GifDrawableResource(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    @Override // p007c.p085g.p086a.p089m.p098v.p101f.DrawableResource, p007c.p085g.p086a.p089m.p092t.Initializable
    /* JADX INFO: renamed from: a */
    public void mo1840a() {
        ((GifDrawable) this.f3606f).m1925b().prepareToDraw();
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: b */
    public void mo1830b() {
        ((GifDrawable) this.f3606f).stop();
        GifDrawable gifDrawable = (GifDrawable) this.f3606f;
        gifDrawable.f3621i = true;
        GifFrameLoader gifFrameLoader = gifDrawable.f3618f.f3628a;
        gifFrameLoader.f3632c.clear();
        Bitmap bitmap = gifFrameLoader.f3641l;
        if (bitmap != null) {
            gifFrameLoader.f3634e.mo1752d(bitmap);
            gifFrameLoader.f3641l = null;
        }
        gifFrameLoader.f3635f = false;
        GifFrameLoader.a aVar = gifFrameLoader.f3638i;
        if (aVar != null) {
            gifFrameLoader.f3633d.m1654n(aVar);
            gifFrameLoader.f3638i = null;
        }
        GifFrameLoader.a aVar2 = gifFrameLoader.f3640k;
        if (aVar2 != null) {
            gifFrameLoader.f3633d.m1654n(aVar2);
            gifFrameLoader.f3640k = null;
        }
        GifFrameLoader.a aVar3 = gifFrameLoader.f3643n;
        if (aVar3 != null) {
            gifFrameLoader.f3633d.m1654n(aVar3);
            gifFrameLoader.f3643n = null;
        }
        gifFrameLoader.f3630a.clear();
        gifFrameLoader.f3639j = true;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: c */
    public int mo1831c() {
        GifFrameLoader gifFrameLoader = ((GifDrawable) this.f3606f).f3618f.f3628a;
        return gifFrameLoader.f3630a.getByteSize() + gifFrameLoader.f3644o;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: d */
    public Class<GifDrawable> mo1832d() {
        return GifDrawable.class;
    }
}
