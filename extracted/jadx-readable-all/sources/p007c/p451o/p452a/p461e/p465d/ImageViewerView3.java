package p007c.p451o.p452a.p461e.p465d;

import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c.o.a.e.d.c, reason: use source file name */
/* JADX INFO: compiled from: ImageViewerView.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageViewerView3 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ImageViewerView f27918g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewerView3(ImageViewerView imageViewerView) {
        super(0);
        this.f27918g = imageViewerView;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        ImageViewerView imageViewerView = this.f27918g;
        imageViewerView.f27901n.setAlpha(1.0f);
        C5729a.m12429B(imageViewerView.f27903p);
        C5729a.m12430C(imageViewerView.f27906s);
        return Unit.f29502a;
    }
}
