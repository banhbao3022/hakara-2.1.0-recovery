package p555j.p556a.p557a.p558a.p559a.p590r;

import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import java.io.File;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p080e.p081a.ExecuteCallback;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.r.v */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6819v implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31922a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f31923b;

    public C6819v(SingActivity singActivity, String str) {
        this.f31922a = singActivity;
        this.f31923b = str;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        if (i != 0) {
            return;
        }
        Intrinsics2.m13089e("removeAudioFromVideo success", "message");
        new File(this.f31923b).delete();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f31922a.m14442U(R.id.preloading);
        Intrinsics2.m13088d(lottieAnimationView, "preloading");
        SkuDao.a.m14061M(lottieAnimationView);
        ((LottieAnimationView) this.f31922a.m14442U(R.id.preloading)).m12546c();
        SingActivity singActivity = this.f31922a;
        singActivity.f33904H = true;
        TextView textView = (TextView) singActivity.m14442U(R.id.txtProgress);
        Intrinsics2.m13088d(textView, "txtProgress");
        textView.setText(this.f31922a.getResources().getText(R.string.text_start));
    }
}
