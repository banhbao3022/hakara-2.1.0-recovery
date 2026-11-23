package p007c.p190n.p194b.p209b.p215n1;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.n1.t, reason: use source file name */
/* JADX INFO: compiled from: AudioTimestampPoller.java */
/* JADX INFO: loaded from: classes.dex */
public final class AudioTimestampPoller {

    /* JADX INFO: renamed from: a */
    public final a f7122a;

    /* JADX INFO: renamed from: b */
    public int f7123b;

    /* JADX INFO: renamed from: c */
    public long f7124c;

    /* JADX INFO: renamed from: d */
    public long f7125d;

    /* JADX INFO: renamed from: e */
    public long f7126e;

    /* JADX INFO: renamed from: f */
    public long f7127f;

    /* JADX INFO: renamed from: c.n.b.b.n1.t$a */
    /* JADX INFO: compiled from: AudioTimestampPoller.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final AudioTrack f7128a;

        /* JADX INFO: renamed from: b */
        public final AudioTimestamp f7129b = new AudioTimestamp();

        /* JADX INFO: renamed from: c */
        public long f7130c;

        /* JADX INFO: renamed from: d */
        public long f7131d;

        /* JADX INFO: renamed from: e */
        public long f7132e;

        public a(AudioTrack audioTrack) {
            this.f7128a = audioTrack;
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
        if (Util6.f6307a >= 19) {
            this.f7122a = new a(audioTrack);
            m3568a();
        } else {
            this.f7122a = null;
            m3569b(3);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3568a() {
        if (this.f7122a != null) {
            m3569b(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3569b(int i) {
        this.f7123b = i;
        if (i == 0) {
            this.f7126e = 0L;
            this.f7127f = -1L;
            this.f7124c = System.nanoTime() / 1000;
            this.f7125d = 10000L;
            return;
        }
        if (i == 1) {
            this.f7125d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f7125d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f7125d = 500000L;
        }
    }
}
