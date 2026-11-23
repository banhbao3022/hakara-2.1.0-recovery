package p555j.p556a.p557a.p558a.p559a.p582l;

import android.widget.ImageView;
import java.util.ArrayList;
import mtp.media.karaoke.data.model.Image;
import p007c.p451o.p452a.StfalconImageViewer;
import p007c.p451o.p452a.p461e.p463b.BuilderData;
import p477d1.Unit;
import p477d1.p483s._Collections;
import p477d1.p493x.p494b.InterfaceC6169q;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: j.a.a.a.a.l.g, reason: use source file name */
/* JADX INFO: compiled from: ImageFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ImageFragment2 extends Lambda implements InterfaceC6169q<Integer, ImageView, Image, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ImageFragment.c f31626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFragment2(ImageFragment.c cVar) {
        super(3);
        this.f31626g = cVar;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6169q
    /* JADX INFO: renamed from: f */
    public Unit mo13079f(Integer num, ImageView imageView, Image image) {
        int iIntValue = num.intValue();
        ImageView imageView2 = imageView;
        Intrinsics2.m13089e(imageView2, "imageView");
        Intrinsics2.m13089e(image, "<anonymous parameter 2>");
        ImageFragment imageFragment = ImageFragment.this;
        ImageFragment.b bVar = ImageFragment.f31617f0;
        ArrayList arrayList = (ArrayList) imageFragment.mo13882Z0().f32034q.m421d();
        StfalconImageViewer.a aVar = new StfalconImageViewer.a(imageFragment.m16528G0(), arrayList != null ? _Collections.m13050o(arrayList) : null, new ImageFragment4(new ImageFragment3(imageFragment)));
        BuilderData<T> builderData = aVar.f27816b;
        builderData.f27870b = iIntValue;
        builderData.f27875g = imageView2;
        builderData.f27872d = false;
        aVar.m12472a();
        return Unit.f29502a;
    }
}
