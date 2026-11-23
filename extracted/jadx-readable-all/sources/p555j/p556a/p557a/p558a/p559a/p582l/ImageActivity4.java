package p555j.p556a.p557a.p558a.p559a.p582l;

import android.widget.ImageView;
import java.util.Objects;
import mtp.media.karaoke.data.model.Image;
import mtp.media.karaoke.p628ui.screen.image.ImageActivity;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.RequestBuilder;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.FunctionReferenceImpl;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p619l.GlideRequest;
import p555j.p556a.p557a.p619l.GlideRequests;

/* JADX INFO: renamed from: j.a.a.a.a.l.c, reason: use source file name */
/* JADX INFO: compiled from: ImageActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ImageActivity4 extends FunctionReferenceImpl implements InterfaceC6168p<ImageView, Image, Unit> {
    public ImageActivity4(ImageActivity imageActivity) {
        super(2, imageActivity, ImageActivity.class, "loadPosterImage", "loadPosterImage(Landroid/widget/ImageView;Lmtp/media/karaoke/data/model/Image;)V", 0);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public Unit mo5l(ImageView imageView, Image image) {
        String image2;
        ImageView imageView2 = imageView;
        Image image3 = image;
        Intrinsics2.m13089e(imageView2, "p1");
        ImageActivity imageActivity = (ImageActivity) this.f29585g;
        ImageActivity.C7282d c7282d = ImageActivity.f33613y;
        Objects.requireNonNull(imageActivity);
        GlideRequests glideRequests = (GlideRequests) Glide.m1624b(imageActivity).f2861m.m1948c(imageActivity);
        if (image3 == null || (image2 = image3.getImage()) == null) {
            image2 = "";
        }
        RequestBuilder requestBuilderMo1653m = glideRequests.mo1653m();
        requestBuilderMo1653m.mo1645Q(image2);
        ((GlideRequest) requestBuilderMo1653m).m1642N(imageView2);
        return Unit.f29502a;
    }
}
