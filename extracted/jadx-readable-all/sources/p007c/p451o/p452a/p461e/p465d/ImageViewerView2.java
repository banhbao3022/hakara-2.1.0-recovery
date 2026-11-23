package p007c.p451o.p452a.p461e.p465d;

import android.view.View;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c.o.a.e.d.b, reason: use source file name */
/* JADX INFO: compiled from: ImageViewerView.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageViewerView2 extends Lambda implements InterfaceC6164l<Long, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ImageViewerView f27917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewerView2(ImageViewerView imageViewerView) {
        super(1);
        this.f27917g = imageViewerView;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Long l) {
        long jLongValue = l.longValue();
        C5729a.m12450e(this.f27917g.f27901n, Float.valueOf(0.0f), Float.valueOf(1.0f), jLongValue);
        View overlayView$imageviewer_release = this.f27917g.getOverlayView$imageviewer_release();
        if (overlayView$imageviewer_release != null) {
            C5729a.m12450e(overlayView$imageviewer_release, Float.valueOf(0.0f), Float.valueOf(1.0f), jLongValue);
        }
        return Unit.f29502a;
    }
}
