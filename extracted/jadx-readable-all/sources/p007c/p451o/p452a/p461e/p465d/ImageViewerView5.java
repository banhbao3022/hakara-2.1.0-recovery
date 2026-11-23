package p007c.p451o.p452a.p461e.p465d;

import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c.o.a.e.d.e, reason: use source file name */
/* JADX INFO: compiled from: ImageViewerView.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageViewerView5 extends Lambda implements InterfaceC6153a<Boolean> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ImageViewerView f27920g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewerView5(ImageViewerView imageViewerView) {
        super(0);
        this.f27920g = imageViewerView;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Boolean mo2c() {
        return Boolean.valueOf(this.f27920g.getShouldDismissToBottom());
    }
}
