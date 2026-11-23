package p555j.p556a.p557a.p558a.p559a.p582l;

import android.widget.ImageView;
import mtp.media.karaoke.data.model.Image;
import p007c.p085g.p086a.RequestBuilder;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.FunctionReferenceImpl;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p619l.GlideRequest;
import p555j.p556a.p557a.p619l.GlideRequests;

/* JADX INFO: renamed from: j.a.a.a.a.l.h, reason: use source file name */
/* JADX INFO: compiled from: ImageFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ImageFragment3 extends FunctionReferenceImpl implements InterfaceC6168p<ImageView, Image, Unit> {
    public ImageFragment3(ImageFragment imageFragment) {
        super(2, imageFragment, ImageFragment.class, "loadPosterImage", "loadPosterImage(Landroid/widget/ImageView;Lmtp/media/karaoke/data/model/Image;)V", 0);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public Unit mo5l(ImageView imageView, Image image) {
        String image2;
        ImageView imageView2 = imageView;
        Image image3 = image;
        Intrinsics2.m13089e(imageView2, "p1");
        ImageFragment imageFragment = (ImageFragment) this.f29585g;
        ImageFragment.b bVar = ImageFragment.f31617f0;
        GlideRequests glideRequestsM14100m0 = SkuDao.a.m14100m0(imageFragment);
        if (image3 == null || (image2 = image3.getImage()) == null) {
            image2 = "";
        }
        RequestBuilder requestBuilderMo1653m = glideRequestsM14100m0.mo1653m();
        requestBuilderMo1653m.mo1645Q(image2);
        ((GlideRequest) requestBuilderMo1653m).m1642N(imageView2);
        return Unit.f29502a;
    }
}
