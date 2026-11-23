package p007c.p451o.p452a.p461e.p465d;

import android.view.View;
import java.util.Objects;
import p477d1.Unit;
import p477d1.p479b0.KDeclarationContainer;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.FunctionReference;
import p477d1.p493x.p495c.Reflection;

/* JADX INFO: renamed from: c.o.a.e.d.g, reason: use source file name */
/* JADX INFO: compiled from: ImageViewerView.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ImageViewerView7 extends FunctionReference implements InterfaceC6168p<Float, Integer, Unit> {
    public ImageViewerView7(ImageViewerView imageViewerView) {
        super(2, imageViewerView);
    }

    @Override // p477d1.p493x.p495c.CallableReference
    /* JADX INFO: renamed from: i */
    public final String mo12497i() {
        return "handleSwipeViewMove";
    }

    @Override // p477d1.p493x.p495c.CallableReference
    /* JADX INFO: renamed from: j */
    public final KDeclarationContainer mo12498j() {
        return Reflection.m13097a(ImageViewerView.class);
    }

    @Override // p477d1.p493x.p495c.CallableReference
    /* JADX INFO: renamed from: k */
    public final String mo12499k() {
        return "handleSwipeViewMove(FI)V";
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public Unit mo5l(Float f, Integer num) {
        float fFloatValue = f.floatValue();
        int iIntValue = num.intValue();
        ImageViewerView imageViewerView = (ImageViewerView) this.f29585g;
        int i = ImageViewerView.f27887f;
        Objects.requireNonNull(imageViewerView);
        float fAbs = 1.0f - (Math.abs(fFloatValue) * ((1.0f / iIntValue) / 4.0f));
        imageViewerView.f27901n.setAlpha(fAbs);
        View view = imageViewerView.f27899l;
        if (view != null) {
            view.setAlpha(fAbs);
        }
        return Unit.f29502a;
    }
}
