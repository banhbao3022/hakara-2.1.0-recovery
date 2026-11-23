package p007c.p190n.p194b.p209b.p215n1;

import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.n1.n, reason: use source file name */
/* JADX INFO: compiled from: AudioAttributes.java */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributes {

    /* JADX INFO: renamed from: a */
    public static final AudioAttributes f7096a;

    /* JADX INFO: renamed from: b */
    public final int f7097b;

    /* JADX INFO: renamed from: c */
    public final int f7098c;

    /* JADX INFO: renamed from: d */
    public final int f7099d;

    /* JADX INFO: renamed from: e */
    public final int f7100e;

    /* JADX INFO: renamed from: f */
    public android.media.AudioAttributes f7101f;

    /* JADX INFO: renamed from: c.n.b.b.n1.n$b */
    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f7102a = 0;

        /* JADX INFO: renamed from: b */
        public int f7103b = 1;

        /* JADX INFO: renamed from: c */
        public int f7104c = 1;
    }

    static {
        b bVar = new b();
        f7096a = new AudioAttributes(bVar.f7102a, 0, bVar.f7103b, bVar.f7104c, null);
    }

    public AudioAttributes(int i, int i2, int i3, int i4, a aVar) {
        this.f7097b = i;
        this.f7098c = i2;
        this.f7099d = i3;
        this.f7100e = i4;
    }

    /* JADX INFO: renamed from: a */
    public android.media.AudioAttributes m3558a() {
        if (this.f7101f == null) {
            android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(this.f7097b).setFlags(this.f7098c).setUsage(this.f7099d);
            if (Util6.f6307a >= 29) {
                usage.setAllowedCapturePolicy(this.f7100e);
            }
            this.f7101f = usage.build();
        }
        return this.f7101f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        AudioAttributes audioAttributes = (AudioAttributes) obj;
        return this.f7097b == audioAttributes.f7097b && this.f7098c == audioAttributes.f7098c && this.f7099d == audioAttributes.f7099d && this.f7100e == audioAttributes.f7100e;
    }

    public int hashCode() {
        return ((((((527 + this.f7097b) * 31) + this.f7098c) * 31) + this.f7099d) * 31) + this.f7100e;
    }
}
