package p555j.p556a.p557a.p558a.p559a.p590r;

import android.widget.ImageButton;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.CustomSeekBar;
import mtp.media.karaoke.data.model.Duet2;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import mtp.media.karaoke.p628ui.widgets.CircleProgressBar;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants4;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p607a.NowPlayingMetadata;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.r.o */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6812o extends AbstractYouTubePlayerListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SingActivity f31911f;

    public C6812o(SingActivity singActivity) {
        this.f31911f = singActivity;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: a */
    public void mo1291a(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13089e(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        SingActivity singActivity = this.f31911f;
        SingActivity.C7351e c7351e = SingActivity.f33896w;
        float fCurrentSeconds = singActivity.currentSeconds();
        int i = (int) fCurrentSeconds;
        SingActivity singActivity2 = this.f31911f;
        if (i == ((int) singActivity2.f33919W) && i > 10 && singActivity2.f33897A == 2) {
            SingActivity.m14440b0(singActivity2);
            return;
        }
        Intrinsics2.m13089e("=======", "message");
        Intrinsics2.m13089e("songSecond prev " + i, "message");
        Intrinsics2.m13089e("currentTimeFinal Prev " + ((int) this.f31911f.f33920X), "message");
        if (i > 10) {
            this.f31911f.f33920X = fCurrentSeconds;
        }
        StringBuilder sbM1556G = outline.m1556G("currentTimeFinal ");
        sbM1556G.append((int) this.f31911f.f33920X);
        Intrinsics2.m13089e(sbM1556G.toString(), "message");
        SingActivity singActivity3 = this.f31911f;
        if (!singActivity3.f33942t0) {
            singActivity3.f33942t0 = true;
            float f2 = f > fCurrentSeconds ? f - fCurrentSeconds : fCurrentSeconds - f;
            Intrinsics2.m13089e("isSeekYoutube " + f2, "message");
            youTubePlayer.seekTo(this.f31911f.currentSeconds() + f2);
        }
        Intrinsics2.m13089e("songSecond " + i, "message");
        TextView textView = (TextView) this.f31911f.m14442U(R.id.currTime);
        Intrinsics2.m13088d(textView, "currTime");
        NowPlayingMetadata.a aVar = NowPlayingMetadata.f32263a;
        textView.setText(aVar.m14034a(fCurrentSeconds));
        TextView textView2 = (TextView) this.f31911f.m14442U(R.id.timerTextView);
        Intrinsics2.m13088d(textView2, "timerTextView");
        textView2.setText(aVar.m14034a(fCurrentSeconds));
        ((CircleProgressBar) this.f31911f.m14442U(R.id.recording_progressBar)).setProgressWithAnimation(fCurrentSeconds);
        CustomSeekBar customSeekBar = (CustomSeekBar) this.f31911f.m14442U(R.id.songSeekBar);
        Intrinsics2.m13088d(customSeekBar, "songSeekBar");
        customSeekBar.setProgress(i);
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (Math.round(f) % 2 == 0) {
            ImageButton imageButton = (ImageButton) this.f31911f.m14442U(R.id.pointRecording);
            Intrinsics2.m13088d(imageButton, "pointRecording");
            imageButton.setVisibility(0);
        } else {
            ImageButton imageButton2 = (ImageButton) this.f31911f.m14442U(R.id.pointRecording);
            Intrinsics2.m13088d(imageButton2, "pointRecording");
            imageButton2.setVisibility(4);
        }
        SingActivity singActivity4 = this.f31911f;
        int i2 = singActivity4.f33897A;
        if (i2 == 1 || i2 == 2) {
            for (Duet2 duet2 : singActivity4.f33931i0) {
                if (fCurrentSeconds >= duet2.getS() && fCurrentSeconds <= duet2.getE()) {
                    String n = duet2.getN();
                    switch (n.hashCode()) {
                        case 65:
                            if (n.equals("A") && (!Intrinsics2.m13085a(singActivity4.f33921Y, "A"))) {
                                singActivity4.f33921Y = "A";
                                ((LottieAnimationView) singActivity4.m14442U(R.id.duetAnimationA)).m12551h();
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) singActivity4.m14442U(R.id.duetAnimationB);
                                Intrinsics2.m13088d(lottieAnimationView, "duetAnimationB");
                                lottieAnimationView.setProgress(0.0f);
                                ((LottieAnimationView) singActivity4.m14442U(R.id.duetAnimationB)).m12550g();
                            }
                            break;
                        case 66:
                            if (n.equals("B") && (!Intrinsics2.m13085a(singActivity4.f33921Y, "B"))) {
                                singActivity4.f33921Y = "B";
                                ((LottieAnimationView) singActivity4.m14442U(R.id.duetAnimationB)).m12551h();
                                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) singActivity4.m14442U(R.id.duetAnimationA);
                                Intrinsics2.m13088d(lottieAnimationView2, "duetAnimationA");
                                lottieAnimationView2.setProgress(0.0f);
                                ((LottieAnimationView) singActivity4.m14442U(R.id.duetAnimationA)).m12550g();
                            }
                            break;
                        case 67:
                            if (n.equals("C") && (!Intrinsics2.m13085a(singActivity4.f33921Y, "C"))) {
                                singActivity4.f33921Y = "C";
                                ((LottieAnimationView) singActivity4.m14442U(R.id.duetAnimationA)).m12551h();
                                ((LottieAnimationView) singActivity4.m14442U(R.id.duetAnimationB)).m12551h();
                            }
                            break;
                    }
                }
            }
        }
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: g */
    public void mo1297g(YouTubePlayer youTubePlayer, PlayerConstants4 playerConstants4) {
        Intrinsics2.m13089e(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13089e(playerConstants4, "state");
        Intrinsics2.m13089e(playerConstants4.toString(), "message");
        int iOrdinal = playerConstants4.ordinal();
        if (iOrdinal == 2) {
            SingActivity.m14440b0(this.f31911f);
            return;
        }
        if (iOrdinal == 3) {
            SingActivity singActivity = this.f31911f;
            SingActivity.C7351e c7351e = SingActivity.f33896w;
            singActivity.m14455p0();
        } else {
            if (iOrdinal != 6) {
                return;
            }
            SingActivity singActivity2 = this.f31911f;
            singActivity2.f33905I = true;
            if (singActivity2.f33904H) {
                ((LottieAnimationView) singActivity2.m14442U(R.id.preloading)).m12546c();
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f31911f.m14442U(R.id.preloading);
                Intrinsics2.m13088d(lottieAnimationView, "preloading");
                SkuDao.a.m14061M(lottieAnimationView);
                TextView textView = (TextView) this.f31911f.m14442U(R.id.txtProgress);
                Intrinsics2.m13088d(textView, "txtProgress");
                textView.setText(this.f31911f.getResources().getText(R.string.text_start));
            }
        }
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: h */
    public void mo1298h(YouTubePlayer youTubePlayer) {
        Intrinsics2.m13089e(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13089e("youtubeInit", "message");
        SingActivity singActivity = this.f31911f;
        SingActivity.C7351e c7351e = SingActivity.f33896w;
        Song songM421d = singActivity.mo13969R().f31857l.m421d();
        if (songM421d != null) {
            youTubePlayer.mo1321d(String.valueOf(songM421d.getYoutubeId()), 0.0f);
            youTubePlayer.setVolume(0);
        }
        this.f31911f.f33900D = youTubePlayer;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: u */
    public void mo1311u(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13089e(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13089e("duration: " + f, "message");
        Intrinsics2.m13089e("totalTime: " + this.f31911f.f33919W, "message");
    }
}
