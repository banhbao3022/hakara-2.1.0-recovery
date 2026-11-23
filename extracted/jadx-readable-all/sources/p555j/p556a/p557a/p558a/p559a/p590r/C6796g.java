package p555j.p556a.p557a.p558a.p559a.p590r;

import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import mtp.media.karaoke.p628ui.widgets.CircleProgressBar;
import p007c.p154j.OnProgressListener;
import p007c.p154j.Progress;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.r.g */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6796g implements OnProgressListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31843a;

    public C6796g(SingActivity singActivity) {
        this.f31843a = singActivity;
    }

    @Override // p007c.p154j.OnProgressListener
    /* JADX INFO: renamed from: a */
    public final void mo2223a(Progress progress) {
        long j2 = (progress.f4409f * ((long) 100)) / progress.f4410g;
        if (((int) j2) == 1) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f31843a.m14442U(R.id.preloading);
            Intrinsics2.m13088d(lottieAnimationView, "preloading");
            SkuDao.a.m14061M(lottieAnimationView);
            ((LottieAnimationView) this.f31843a.m14442U(R.id.preloading)).m12546c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        sb.append('%');
        String string = sb.toString();
        TextView textView = (TextView) this.f31843a.m14442U(R.id.txtProgress);
        Intrinsics2.m13088d(textView, "txtProgress");
        textView.setText(string);
        CircleProgressBar circleProgressBar = (CircleProgressBar) this.f31843a.m14442U(R.id.recording_progressBar);
        Intrinsics2.m13088d(circleProgressBar, "recording_progressBar");
        circleProgressBar.setProgress(j2);
    }
}
