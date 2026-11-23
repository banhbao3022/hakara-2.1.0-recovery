package p555j.p556a.p557a.p558a.p559a.p573i;

import android.widget.ImageView;
import mtp.media.karaoke.p628ui.screen.profile.ProfileFragment;
import p007c.p085g.p086a.RequestBuilder;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.FunctionReferenceImpl;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p619l.GlideRequest;

/* JADX INFO: renamed from: j.a.a.a.a.i.e, reason: use source file name */
/* JADX INFO: compiled from: ProfileFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ProfileFragment5 extends FunctionReferenceImpl implements InterfaceC6168p<ImageView, String, Unit> {
    public ProfileFragment5(ProfileFragment profileFragment) {
        super(2, profileFragment, ProfileFragment.class, "loadPosterImage", "loadPosterImage(Landroid/widget/ImageView;Ljava/lang/String;)V", 0);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public Unit mo5l(ImageView imageView, String str) {
        ImageView imageView2 = imageView;
        Intrinsics2.m13089e(imageView2, "p1");
        ProfileFragment profileFragment = (ProfileFragment) this.f29585g;
        ProfileFragment.C7315c c7315c = ProfileFragment.f33788d0;
        RequestBuilder requestBuilderMo1653m = SkuDao.a.m14100m0(profileFragment).mo1653m();
        requestBuilderMo1653m.mo1645Q(str);
        ((GlideRequest) requestBuilderMo1653m).m1642N(imageView2);
        return Unit.f29502a;
    }
}
