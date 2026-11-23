package p007c.p451o.p452a.p461e.p464c;

import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c.o.a.e.c.c, reason: use source file name */
/* JADX INFO: compiled from: ImageViewerDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageViewerDialog3 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ImageViewerDialog f27886g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewerDialog3(ImageViewerDialog imageViewerDialog) {
        super(0);
        this.f27886g = imageViewerDialog;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        this.f27886g.f27878a.dismiss();
        return Unit.f29502a;
    }
}
