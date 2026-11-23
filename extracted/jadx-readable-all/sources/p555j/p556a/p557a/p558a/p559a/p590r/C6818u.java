package p555j.p556a.p557a.p558a.p559a.p590r;

import com.cgfay.camera.widget.RecordCountDownView;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;

/* JADX INFO: renamed from: j.a.a.a.a.r.u */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6818u implements RecordCountDownView.InterfaceC5782b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31920a;

    /* JADX INFO: renamed from: j.a.a.a.a.r.u$a */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SingActivity singActivity = C6818u.this.f31920a;
            SingActivity.C7351e c7351e = SingActivity.f33896w;
            singActivity.m14456q0();
            YouTubePlayer youTubePlayer = C6818u.this.f31920a.f33900D;
            if (youTubePlayer != null) {
                youTubePlayer.seekTo(0.0f);
            }
            YouTubePlayer youTubePlayer2 = C6818u.this.f31920a.f33900D;
            if (youTubePlayer2 != null) {
                youTubePlayer2.mo1318U();
            }
            C6818u.this.f31920a.m14455p0();
        }
    }

    public C6818u(SingActivity singActivity) {
        this.f31920a = singActivity;
    }

    @Override // com.cgfay.camera.widget.RecordCountDownView.InterfaceC5782b
    /* JADX INFO: renamed from: a */
    public void mo12567a() {
        this.f31920a.runOnUiThread(new a());
    }

    @Override // com.cgfay.camera.widget.RecordCountDownView.InterfaceC5782b
    /* JADX INFO: renamed from: b */
    public void mo12568b() {
    }
}
