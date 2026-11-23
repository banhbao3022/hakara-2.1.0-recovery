package p007c.p190n.p194b.p209b.p212b2;

import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.PlaybackParameters;

/* JADX INFO: renamed from: c.n.b.b.b2.c0, reason: use source file name */
/* JADX INFO: compiled from: StandaloneMediaClock.java */
/* JADX INFO: loaded from: classes.dex */
public final class StandaloneMediaClock implements MediaClock {

    /* JADX INFO: renamed from: f */
    public final Clock2 f6284f;

    /* JADX INFO: renamed from: g */
    public boolean f6285g;

    /* JADX INFO: renamed from: h */
    public long f6286h;

    /* JADX INFO: renamed from: i */
    public long f6287i;

    /* JADX INFO: renamed from: j */
    public PlaybackParameters f6288j = PlaybackParameters.f6259a;

    public StandaloneMediaClock(Clock2 clock2) {
        this.f6284f = clock2;
    }

    /* JADX INFO: renamed from: a */
    public void m3063a(long j2) {
        this.f6286h = j2;
        if (this.f6285g) {
            this.f6287i = this.f6284f.mo3068a();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p212b2.MediaClock
    /* JADX INFO: renamed from: b */
    public PlaybackParameters mo3064b() {
        return this.f6288j;
    }

    /* JADX INFO: renamed from: c */
    public void m3065c() {
        if (this.f6285g) {
            return;
        }
        this.f6287i = this.f6284f.mo3068a();
        this.f6285g = true;
    }

    @Override // p007c.p190n.p194b.p209b.p212b2.MediaClock
    /* JADX INFO: renamed from: d */
    public long mo3066d() {
        long j2 = this.f6286h;
        if (!this.f6285g) {
            return j2;
        }
        long jMo3068a = this.f6284f.mo3068a() - this.f6287i;
        PlaybackParameters playbackParameters = this.f6288j;
        return playbackParameters.f6260b == 1.0f ? j2 + C.m3236b(jMo3068a) : j2 + (jMo3068a * ((long) playbackParameters.f6262d));
    }

    @Override // p007c.p190n.p194b.p209b.p212b2.MediaClock
    /* JADX INFO: renamed from: w */
    public void mo3067w(PlaybackParameters playbackParameters) {
        if (this.f6285g) {
            m3063a(mo3066d());
        }
        this.f6288j = playbackParameters;
    }
}
