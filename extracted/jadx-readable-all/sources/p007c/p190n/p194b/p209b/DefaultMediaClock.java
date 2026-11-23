package p007c.p190n.p194b.p209b;

import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Clock2;
import p007c.p190n.p194b.p209b.p212b2.MediaClock;
import p007c.p190n.p194b.p209b.p212b2.StandaloneMediaClock;

/* JADX INFO: renamed from: c.n.b.b.f0, reason: use source file name */
/* JADX INFO: compiled from: DefaultMediaClock.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultMediaClock implements MediaClock {

    /* JADX INFO: renamed from: f */
    public final StandaloneMediaClock f6597f;

    /* JADX INFO: renamed from: g */
    public final a f6598g;

    /* JADX INFO: renamed from: h */
    public Renderer2 f6599h;

    /* JADX INFO: renamed from: i */
    public MediaClock f6600i;

    /* JADX INFO: renamed from: j */
    public boolean f6601j = true;

    /* JADX INFO: renamed from: k */
    public boolean f6602k;

    /* JADX INFO: renamed from: c.n.b.b.f0$a */
    /* JADX INFO: compiled from: DefaultMediaClock.java */
    public interface a {
    }

    public DefaultMediaClock(a aVar, Clock2 clock2) {
        this.f6598g = aVar;
        this.f6597f = new StandaloneMediaClock(clock2);
    }

    @Override // p007c.p190n.p194b.p209b.p212b2.MediaClock
    /* JADX INFO: renamed from: b */
    public PlaybackParameters mo3064b() {
        MediaClock mediaClock = this.f6600i;
        return mediaClock != null ? mediaClock.mo3064b() : this.f6597f.f6288j;
    }

    @Override // p007c.p190n.p194b.p209b.p212b2.MediaClock
    /* JADX INFO: renamed from: d */
    public long mo3066d() {
        if (this.f6601j) {
            return this.f6597f.mo3066d();
        }
        MediaClock mediaClock = this.f6600i;
        Objects.requireNonNull(mediaClock);
        return mediaClock.mo3066d();
    }

    @Override // p007c.p190n.p194b.p209b.p212b2.MediaClock
    /* JADX INFO: renamed from: w */
    public void mo3067w(PlaybackParameters playbackParameters) {
        MediaClock mediaClock = this.f6600i;
        if (mediaClock != null) {
            mediaClock.mo3067w(playbackParameters);
            playbackParameters = this.f6600i.mo3064b();
        }
        this.f6597f.mo3067w(playbackParameters);
    }
}
