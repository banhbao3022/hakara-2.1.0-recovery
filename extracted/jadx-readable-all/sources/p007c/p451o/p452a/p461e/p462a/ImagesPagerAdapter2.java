package p007c.p451o.p452a.p461e.p462a;

import p007c.p187m.p188a.p189a.OnViewDragListener;
import p007c.p187m.p188a.p189a.PhotoView;

/* JADX INFO: renamed from: c.o.a.e.a.b, reason: use source file name */
/* JADX INFO: compiled from: ImagesPagerAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImagesPagerAdapter2 implements OnViewDragListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PhotoView f27868a;

    public ImagesPagerAdapter2(PhotoView photoView) {
        this.f27868a = photoView;
    }

    @Override // p007c.p187m.p188a.p189a.OnViewDragListener
    /* JADX INFO: renamed from: a */
    public final void mo2716a(float f, float f2) {
        PhotoView photoView = this.f27868a;
        photoView.setAllowParentInterceptOnEdge(photoView.getScale() == 1.0f);
    }
}
