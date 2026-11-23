package p007c.p190n.p194b.p209b.p215n1;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.n1.u, reason: use source file name */
/* JADX INFO: compiled from: AudioTrackPositionTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class AudioTrackPositionTracker {

    /* JADX INFO: renamed from: A */
    public long f7133A;

    /* JADX INFO: renamed from: B */
    public long f7134B;

    /* JADX INFO: renamed from: C */
    public long f7135C;

    /* JADX INFO: renamed from: D */
    public boolean f7136D;

    /* JADX INFO: renamed from: E */
    public long f7137E;

    /* JADX INFO: renamed from: F */
    public long f7138F;

    /* JADX INFO: renamed from: a */
    public final a f7139a;

    /* JADX INFO: renamed from: b */
    public final long[] f7140b;

    /* JADX INFO: renamed from: c */
    public AudioTrack f7141c;

    /* JADX INFO: renamed from: d */
    public int f7142d;

    /* JADX INFO: renamed from: e */
    public int f7143e;

    /* JADX INFO: renamed from: f */
    public AudioTimestampPoller f7144f;

    /* JADX INFO: renamed from: g */
    public int f7145g;

    /* JADX INFO: renamed from: h */
    public boolean f7146h;

    /* JADX INFO: renamed from: i */
    public long f7147i;

    /* JADX INFO: renamed from: j */
    public float f7148j;

    /* JADX INFO: renamed from: k */
    public boolean f7149k;

    /* JADX INFO: renamed from: l */
    public long f7150l;

    /* JADX INFO: renamed from: m */
    public long f7151m;

    /* JADX INFO: renamed from: n */
    public Method f7152n;

    /* JADX INFO: renamed from: o */
    public long f7153o;

    /* JADX INFO: renamed from: p */
    public boolean f7154p;

    /* JADX INFO: renamed from: q */
    public boolean f7155q;

    /* JADX INFO: renamed from: r */
    public long f7156r;

    /* JADX INFO: renamed from: s */
    public long f7157s;

    /* JADX INFO: renamed from: t */
    public long f7158t;

    /* JADX INFO: renamed from: u */
    public long f7159u;

    /* JADX INFO: renamed from: v */
    public int f7160v;

    /* JADX INFO: renamed from: w */
    public int f7161w;

    /* JADX INFO: renamed from: x */
    public long f7162x;

    /* JADX INFO: renamed from: y */
    public long f7163y;

    /* JADX INFO: renamed from: z */
    public long f7164z;

    /* JADX INFO: renamed from: c.n.b.b.n1.u$a */
    /* JADX INFO: compiled from: AudioTrackPositionTracker.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3575a(long j2);

        /* JADX INFO: renamed from: b */
        void mo3576b(int i, long j2);

        /* JADX INFO: renamed from: c */
        void mo3577c(long j2);

        /* JADX INFO: renamed from: d */
        void mo3578d(long j2, long j3, long j4, long j5);

        /* JADX INFO: renamed from: e */
        void mo3579e(long j2, long j3, long j4, long j5);
    }

    public AudioTrackPositionTracker(a aVar) {
        Objects.requireNonNull(aVar);
        this.f7139a = aVar;
        if (Util6.f6307a >= 18) {
            try {
                this.f7152n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f7140b = new long[10];
    }

    /* JADX INFO: renamed from: a */
    public final long m3570a(long j2) {
        return (j2 * 1000000) / ((long) this.f7145g);
    }

    /* JADX INFO: renamed from: b */
    public final long m3571b() {
        AudioTrack audioTrack = this.f7141c;
        Objects.requireNonNull(audioTrack);
        if (this.f7162x != -9223372036854775807L) {
            return Math.min(this.f7133A, this.f7164z + ((((SystemClock.elapsedRealtime() * 1000) - this.f7162x) * ((long) this.f7145g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f7146h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f7159u = this.f7157s;
            }
            playbackHeadPosition += this.f7159u;
        }
        if (Util6.f6307a <= 29) {
            if (playbackHeadPosition == 0 && this.f7157s > 0 && playState == 3) {
                if (this.f7163y == -9223372036854775807L) {
                    this.f7163y = SystemClock.elapsedRealtime();
                }
                return this.f7157s;
            }
            this.f7163y = -9223372036854775807L;
        }
        if (this.f7157s > playbackHeadPosition) {
            this.f7158t++;
        }
        this.f7157s = playbackHeadPosition;
        return playbackHeadPosition + (this.f7158t << 32);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX INFO: renamed from: c */
    public boolean m3572c(long j2) {
        boolean z;
        if (j2 <= m3571b()) {
            if (this.f7146h) {
                AudioTrack audioTrack = this.f7141c;
                Objects.requireNonNull(audioTrack);
                if (audioTrack.getPlayState() == 2 && m3571b() == 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m3573d() {
        this.f7150l = 0L;
        this.f7161w = 0;
        this.f7160v = 0;
        this.f7151m = 0L;
        this.f7135C = 0L;
        this.f7138F = 0L;
        this.f7149k = false;
        this.f7141c = null;
        this.f7144f = null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX INFO: renamed from: e */
    public void m3574e(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.f7141c = audioTrack;
        this.f7142d = i2;
        this.f7143e = i3;
        this.f7144f = new AudioTimestampPoller(audioTrack);
        this.f7145g = audioTrack.getSampleRate();
        if (z) {
            z2 = Util6.f6307a < 23 && (i == 5 || i == 6);
        }
        this.f7146h = z2;
        boolean zM3096E = Util6.m3096E(i);
        this.f7155q = zM3096E;
        this.f7147i = zM3096E ? m3570a(i3 / i2) : -9223372036854775807L;
        this.f7157s = 0L;
        this.f7158t = 0L;
        this.f7159u = 0L;
        this.f7154p = false;
        this.f7162x = -9223372036854775807L;
        this.f7163y = -9223372036854775807L;
        this.f7156r = 0L;
        this.f7153o = 0L;
        this.f7148j = 1.0f;
    }
}
