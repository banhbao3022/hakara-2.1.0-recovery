package p007c.p190n.p194b.p209b.p217p1;

import android.media.MediaCodec;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.p1.b, reason: use source file name */
/* JADX INFO: compiled from: CryptoInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class CryptoInfo {

    /* JADX INFO: renamed from: a */
    public byte[] f7263a;

    /* JADX INFO: renamed from: b */
    public byte[] f7264b;

    /* JADX INFO: renamed from: c */
    public int f7265c;

    /* JADX INFO: renamed from: d */
    public int[] f7266d;

    /* JADX INFO: renamed from: e */
    public int[] f7267e;

    /* JADX INFO: renamed from: f */
    public int f7268f;

    /* JADX INFO: renamed from: g */
    public int f7269g;

    /* JADX INFO: renamed from: h */
    public int f7270h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f7271i;

    /* JADX INFO: renamed from: j */
    public final b f7272j;

    /* JADX INFO: renamed from: c.n.b.b.p1.b$b */
    /* JADX INFO: compiled from: CryptoInfo.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final MediaCodec.CryptoInfo f7273a;

        /* JADX INFO: renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f7274b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public b(MediaCodec.CryptoInfo cryptoInfo, a aVar) {
            this.f7273a = cryptoInfo;
        }
    }

    public CryptoInfo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f7271i = cryptoInfo;
        this.f7272j = Util6.f6307a >= 24 ? new b(cryptoInfo, null) : null;
    }
}
