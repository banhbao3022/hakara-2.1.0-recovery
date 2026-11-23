package p555j.p556a.p557a.p558a.p559a.p590r;

import android.os.CountDownTimer;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;

/* JADX INFO: renamed from: j.a.a.a.a.r.b0 */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CountDownTimerC6787b0 extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31825a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC6787b0(SingActivity singActivity, long j2, long j3) {
        super(j2, j3);
        this.f31825a = singActivity;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        SingActivity singActivity = this.f31825a;
        SingActivity.C7351e c7351e = SingActivity.f33896w;
        singActivity.m14444d0();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j2) {
    }
}
