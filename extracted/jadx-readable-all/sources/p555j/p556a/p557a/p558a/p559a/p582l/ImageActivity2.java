package p555j.p556a.p557a.p558a.p559a.p582l;

import android.widget.ImageView;
import java.util.ArrayList;
import mtp.media.karaoke.data.model.Image;
import mtp.media.karaoke.p628ui.screen.image.ImageActivity;
import p007c.p451o.p452a.StfalconImageViewer;
import p007c.p451o.p452a.p461e.p463b.BuilderData;
import p477d1.Unit;
import p477d1.p483s._Collections;
import p477d1.p493x.p494b.InterfaceC6169q;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p526i1.p530b.p531a.EventBus3;
import p555j.p556a.p557a.p558a.p594d.ImageEvent;

/* JADX INFO: renamed from: j.a.a.a.a.l.a, reason: use source file name */
/* JADX INFO: compiled from: ImageActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ImageActivity2 extends Lambda implements InterfaceC6169q<Integer, ImageView, Image, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ImageActivity.C7283e f31604g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageActivity2(ImageActivity.C7283e c7283e) {
        super(3);
        this.f31604g = c7283e;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6169q
    /* JADX INFO: renamed from: f */
    public Unit mo13079f(Integer num, ImageView imageView, Image image) {
        int iIntValue = num.intValue();
        ImageView imageView2 = imageView;
        Image image2 = image;
        Intrinsics2.m13089e(imageView2, "imageView");
        Intrinsics2.m13089e(image2, "image");
        ImageActivity imageActivity = ImageActivity.this;
        if (!imageActivity.f33617D) {
            if (imageActivity.f33619F) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(image2);
                EventBus3.m13810b().m13815g(new ImageEvent(arrayList));
                imageActivity.finish();
            } else {
                ArrayList arrayList2 = (ArrayList) imageActivity.mo13969R().f32034q.m421d();
                StfalconImageViewer.a aVar = new StfalconImageViewer.a(imageActivity, arrayList2 != null ? _Collections.m13050o(arrayList2) : null, new ImageActivity5(new ImageActivity4(imageActivity)));
                BuilderData<T> builderData = aVar.f27816b;
                builderData.f27870b = iIntValue;
                builderData.f27875g = imageView2;
                Intrinsics2.m13088d(aVar.m12472a(), "StfalconImageViewer.Buil…    }\n            .show()");
            }
        }
        return Unit.f29502a;
    }
}
