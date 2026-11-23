package p007c.p190n.p194b.p209b.p221s1.p228k0;

import p007c.p190n.p194b.p209b.Format;

/* JADX INFO: renamed from: c.n.b.b.s1.k0.m, reason: use source file name */
/* JADX INFO: compiled from: Track.java */
/* JADX INFO: loaded from: classes.dex */
public final class Track {

    /* JADX INFO: renamed from: a */
    public final int f7978a;

    /* JADX INFO: renamed from: b */
    public final int f7979b;

    /* JADX INFO: renamed from: c */
    public final long f7980c;

    /* JADX INFO: renamed from: d */
    public final long f7981d;

    /* JADX INFO: renamed from: e */
    public final long f7982e;

    /* JADX INFO: renamed from: f */
    public final Format f7983f;

    /* JADX INFO: renamed from: g */
    public final int f7984g;

    /* JADX INFO: renamed from: h */
    public final long[] f7985h;

    /* JADX INFO: renamed from: i */
    public final long[] f7986i;

    /* JADX INFO: renamed from: j */
    public final int f7987j;

    /* JADX INFO: renamed from: k */
    public final TrackEncryptionBox[] f7988k;

    public Track(int i, int i2, long j2, long j3, long j4, Format format, int i3, TrackEncryptionBox[] trackEncryptionBoxArr, int i4, long[] jArr, long[] jArr2) {
        this.f7978a = i;
        this.f7979b = i2;
        this.f7980c = j2;
        this.f7981d = j3;
        this.f7982e = j4;
        this.f7983f = format;
        this.f7984g = i3;
        this.f7988k = trackEncryptionBoxArr;
        this.f7987j = i4;
        this.f7985h = jArr;
        this.f7986i = jArr2;
    }

    /* JADX INFO: renamed from: a */
    public TrackEncryptionBox m3841a(int i) {
        TrackEncryptionBox[] trackEncryptionBoxArr = this.f7988k;
        if (trackEncryptionBoxArr == null) {
            return null;
        }
        return trackEncryptionBoxArr[i];
    }
}
