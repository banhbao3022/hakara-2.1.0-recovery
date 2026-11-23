package p007c.p190n.p194b.p209b;

import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.a0, reason: use source file name */
/* JADX INFO: compiled from: BasePlayer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BasePlayer implements Player2 {

    /* JADX INFO: renamed from: a */
    public final Timeline.c f5927a = new Timeline.c();

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: g */
    public final int mo2882g() {
        long jM3375s;
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this;
        if (exoPlayerImpl.mo3331c()) {
            PlaybackInfo playbackInfo = exoPlayerImpl.f6657x;
            jM3375s = playbackInfo.f5938k.equals(playbackInfo.f5930c) ? C.m3237c(exoPlayerImpl.f6657x.f5944q) : exoPlayerImpl.getDuration();
        } else {
            jM3375s = exoPlayerImpl.m3375s();
        }
        long duration = exoPlayerImpl.getDuration();
        if (jM3375s == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return Util6.m3121i((int) ((jM3375s * 100) / duration), 0, 100);
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: m */
    public final int mo2883m() {
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this;
        Timeline timeline = exoPlayerImpl.f6657x.f5929b;
        if (timeline.m3470q()) {
            return -1;
        }
        int iMo3337j = exoPlayerImpl.mo3337j();
        int i = exoPlayerImpl.f6650q;
        if (i == 1) {
            i = 0;
        }
        return timeline.mo3466l(iMo3337j, i, exoPlayerImpl.f6651r);
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: o */
    public final int mo2884o() {
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this;
        Timeline timeline = exoPlayerImpl.f6657x.f5929b;
        if (timeline.m3470q()) {
            return -1;
        }
        int iMo3337j = exoPlayerImpl.mo3337j();
        int i = exoPlayerImpl.f6650q;
        if (i == 1) {
            i = 0;
        }
        return timeline.mo3460e(iMo3337j, i, exoPlayerImpl.f6651r);
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    public final void stop() {
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this;
        PlaybackInfo playbackInfo = exoPlayerImpl.f6657x;
        PlaybackInfo playbackInfoM2887a = playbackInfo.m2887a(playbackInfo.f5930c);
        playbackInfoM2887a.f5944q = playbackInfoM2887a.f5946s;
        playbackInfoM2887a.f5945r = 0L;
        PlaybackInfo playbackInfoM2893g = playbackInfoM2887a.m2893g(1);
        exoPlayerImpl.f6652s++;
        exoPlayerImpl.f6640g.f6693l.m3071a(6).sendToTarget();
        exoPlayerImpl.m3373A(playbackInfoM2893g, false, 4, 0, 1, false);
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: x */
    public final void mo2885x(long j2) {
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this;
        exoPlayerImpl.mo3333e(exoPlayerImpl.mo3337j(), j2);
    }
}
