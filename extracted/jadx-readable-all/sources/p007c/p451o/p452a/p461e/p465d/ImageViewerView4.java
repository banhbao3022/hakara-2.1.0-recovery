package p007c.p451o.p452a.p461e.p465d;

import p007c.p451o.p452a.p453c.p455b.p457b.SwipeDirection;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c.o.a.e.d.d, reason: use source file name */
/* JADX INFO: compiled from: ImageViewerView.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageViewerView4 extends Lambda implements InterfaceC6164l<SwipeDirection, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ImageViewerView f27919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewerView4(ImageViewerView imageViewerView) {
        super(1);
        this.f27919g = imageViewerView;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(SwipeDirection swipeDirection) {
        SwipeDirection swipeDirection2 = swipeDirection;
        Intrinsics2.m13090f(swipeDirection2, "it");
        this.f27919g.f27889B = swipeDirection2;
        return Unit.f29502a;
    }
}
