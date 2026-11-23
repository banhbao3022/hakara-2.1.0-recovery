package p007c.p190n.p194b.p209b;

import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.b1, reason: use source file name */
/* JADX INFO: compiled from: PlaybackParameters.java */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackParameters {

    /* JADX INFO: renamed from: a */
    public static final PlaybackParameters f6259a = new PlaybackParameters(1.0f);

    /* JADX INFO: renamed from: b */
    public final float f6260b;

    /* JADX INFO: renamed from: c */
    public final float f6261c;

    /* JADX INFO: renamed from: d */
    public final int f6262d;

    public PlaybackParameters(float f) {
        this(f, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PlaybackParameters.class != obj.getClass()) {
            return false;
        }
        PlaybackParameters playbackParameters = (PlaybackParameters) obj;
        return this.f6260b == playbackParameters.f6260b && this.f6261c == playbackParameters.f6261c;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f6261c) + ((Float.floatToRawIntBits(this.f6260b) + 527) * 31);
    }

    public String toString() {
        return Util6.m3126n("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f6260b), Float.valueOf(this.f6261c));
    }

    public PlaybackParameters(float f, float f2) {
        C2096e.m4566b(f > 0.0f);
        C2096e.m4566b(f2 > 0.0f);
        this.f6260b = f;
        this.f6261c = f2;
        this.f6262d = Math.round(f * 1000.0f);
    }
}
