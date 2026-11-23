package p007c.p190n.p194b.p266d.p314j.p315a;

import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class bi2 {

    /* JADX INFO: renamed from: a */
    public AudioTrack f12697a;

    /* JADX INFO: renamed from: b */
    public boolean f12698b;

    /* JADX INFO: renamed from: c */
    public int f12699c;

    /* JADX INFO: renamed from: d */
    public long f12700d;

    /* JADX INFO: renamed from: e */
    public long f12701e;

    /* JADX INFO: renamed from: f */
    public long f12702f;

    /* JADX INFO: renamed from: g */
    public long f12703g;

    /* JADX INFO: renamed from: h */
    public long f12704h;

    /* JADX INFO: renamed from: i */
    public long f12705i;

    /* JADX INFO: renamed from: a */
    public void mo6016a(AudioTrack audioTrack, boolean z) {
        this.f12697a = audioTrack;
        this.f12698b = z;
        this.f12703g = -9223372036854775807L;
        this.f12700d = 0L;
        this.f12701e = 0L;
        this.f12702f = 0L;
        if (audioTrack != null) {
            this.f12699c = audioTrack.getSampleRate();
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m6017b() {
        if (this.f12703g != -9223372036854775807L) {
            return Math.min(this.f12705i, ((((SystemClock.elapsedRealtime() * 1000) - this.f12703g) * ((long) this.f12699c)) / 1000000) + this.f12704h);
        }
        int playState = this.f12697a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) this.f12697a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f12698b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f12702f = this.f12700d;
            }
            playbackHeadPosition += this.f12702f;
        }
        if (this.f12700d > playbackHeadPosition) {
            this.f12701e++;
        }
        this.f12700d = playbackHeadPosition;
        return playbackHeadPosition + (this.f12701e << 32);
    }

    /* JADX INFO: renamed from: c */
    public boolean mo6018c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public long mo6019d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    public long mo6020e() {
        throw new UnsupportedOperationException();
    }
}
