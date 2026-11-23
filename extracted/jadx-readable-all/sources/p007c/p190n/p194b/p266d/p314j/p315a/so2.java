package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class so2 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: f */
    public static final so2 f19639f = new so2();

    /* JADX INFO: renamed from: g */
    public volatile long f19640g;

    /* JADX INFO: renamed from: h */
    public final Handler f19641h;

    /* JADX INFO: renamed from: i */
    public final HandlerThread f19642i;

    /* JADX INFO: renamed from: j */
    public Choreographer f19643j;

    /* JADX INFO: renamed from: k */
    public int f19644k;

    public so2() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f19642i = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f19641h = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.f19640g = j2;
        this.f19643j.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f19643j = Choreographer.getInstance();
            return true;
        }
        if (i == 1) {
            int i2 = this.f19644k + 1;
            this.f19644k = i2;
            if (i2 == 1) {
                this.f19643j.postFrameCallback(this);
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i3 = this.f19644k - 1;
        this.f19644k = i3;
        if (i3 == 0) {
            this.f19643j.removeFrameCallback(this);
            this.f19640g = 0L;
        }
        return true;
    }
}
