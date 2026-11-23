package p555j.p556a.p557a.p558a.p559a.p560a;

import android.widget.SeekBar;
import android.widget.TextView;
import com.cgfay.media.CainMediaPlayer;
import java.util.Timer;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.CoroutineScope2;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p606h.p607a.NowPlayingMetadata;

/* JADX INFO: renamed from: j.a.a.a.a.a.w */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6603w implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ProcessActivity f31042f;

    /* JADX INFO: renamed from: j.a.a.a.a.a.w$a */
    /* JADX INFO: compiled from: ProcessActivity.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.process.ProcessActivity$initialize$1$onStopTrackingTouch$1", m13069f = "ProcessActivity.kt", m13070l = {554}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31043j;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return C6603w.this.new a(continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return C6603w.this.new a(continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31043j;
            if (i == 0) {
                C5729a.m12442O(obj);
                this.f31043j = 1;
                if (C5729a.m12457l(500L, this) == intrinsics) {
                    return intrinsics;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5729a.m12442O(obj);
            }
            ProcessActivity processActivity = C6603w.this.f31042f;
            if (processActivity.f33734M) {
                processActivity.onPlayPause(true);
                ProcessActivity processActivity2 = C6603w.this.f31042f;
                CainMediaPlayer cainMediaPlayer = processActivity2.f33750c0;
                if (cainMediaPlayer != null) {
                    cainMediaPlayer.resume();
                }
                CainMediaPlayer cainMediaPlayer2 = processActivity2.f33750c0;
                if (cainMediaPlayer2 != null) {
                    cainMediaPlayer2.seekTo(processActivity2.currentMs());
                }
                ProcessActivity processActivity3 = C6603w.this.f31042f;
                CainMediaPlayer cainMediaPlayer3 = processActivity3.f33753f0;
                if (cainMediaPlayer3 != null) {
                    cainMediaPlayer3.resume();
                }
                CainMediaPlayer cainMediaPlayer4 = processActivity3.f33753f0;
                if (cainMediaPlayer4 != null) {
                    cainMediaPlayer4.seekTo(processActivity3.currentMs());
                }
                C6603w.this.f31042f.m14413f0();
            }
            return Unit.f29502a;
        }
    }

    public C6603w(ProcessActivity processActivity) {
        this.f31042f = processActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Intrinsics2.m13089e(seekBar, "sb");
        if (z) {
            Timer timer = this.f31042f.f33735N;
            if (timer != null) {
                timer.cancel();
            }
            TextView textView = (TextView) this.f31042f.m14407U(R.id.currTime);
            Intrinsics2.m13088d(textView, "currTime");
            textView.setText(NowPlayingMetadata.f32263a.m14034a((seekBar.getProgress() * this.f31042f.f33737P) / 100));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        Intrinsics2.m13089e(seekBar, "seekBar");
        Timer timer = this.f31042f.f33735N;
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Intrinsics2.m13089e(seekBar, "seekBar");
        ProcessActivity processActivity = this.f31042f;
        ProcessActivity.C7304d c7304d = ProcessActivity.f33721w;
        processActivity.onAudioPause();
        this.f31042f.m14410c0();
        this.f31042f.m14411d0();
        this.f31042f.setSeek(seekBar.getProgress() / 100, this.f31042f.f33747Z);
        ProcessActivity processActivity2 = this.f31042f;
        int i = processActivity2.f33747Z;
        if (i != 0) {
            processActivity2.setPositionRhythm(i);
            Intrinsics2.m13089e(String.valueOf(this.f31042f.f33747Z), "message");
        }
        TextView textView = (TextView) this.f31042f.m14407U(R.id.currTime);
        Intrinsics2.m13088d(textView, "currTime");
        textView.setText(NowPlayingMetadata.f32263a.m14034a(this.f31042f.currentSeconds()));
        ProcessActivity processActivity3 = this.f31042f;
        CainMediaPlayer cainMediaPlayer = processActivity3.f33750c0;
        if (cainMediaPlayer != null) {
            cainMediaPlayer.seekTo(processActivity3.currentMs());
        }
        ProcessActivity processActivity4 = this.f31042f;
        CainMediaPlayer cainMediaPlayer2 = processActivity4.f33753f0;
        if (cainMediaPlayer2 != null) {
            cainMediaPlayer2.seekTo(processActivity4.currentMs());
        }
        CoroutineScope2 coroutineScope2 = CoroutineScope2.f29811f;
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
        C5729a.m12428A(coroutineScope2, MainDispatchers.f29666b, 0, new a(null), 2, null);
    }
}
