package p007c.p190n.p194b.p266d.p314j.p315a;

import android.media.AudioTrack;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ai2 extends Thread {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AudioTrack f12178f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ii2 f12179g;

    public ai2(ii2 ii2Var, AudioTrack audioTrack) {
        this.f12179g = ii2Var;
        this.f12178f = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f12178f.flush();
            this.f12178f.release();
        } finally {
            this.f12179g.f15230e.open();
        }
    }
}
