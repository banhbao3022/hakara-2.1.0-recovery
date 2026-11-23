package p007c.p190n.p194b.p266d.p314j.p315a;

import android.media.MediaCodec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class si2 {

    /* JADX INFO: renamed from: a */
    public byte[] f19569a;

    /* JADX INFO: renamed from: b */
    public byte[] f19570b;

    /* JADX INFO: renamed from: c */
    public int f19571c;

    /* JADX INFO: renamed from: d */
    public int[] f19572d;

    /* JADX INFO: renamed from: e */
    public int[] f19573e;

    /* JADX INFO: renamed from: f */
    public int f19574f;

    /* JADX INFO: renamed from: g */
    public final MediaCodec.CryptoInfo f19575g;

    /* JADX INFO: renamed from: h */
    public final ri2 f19576h;

    public si2() {
        int i = jo2.f15673a;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f19575g = cryptoInfo;
        this.f19576h = i >= 24 ? new ri2(cryptoInfo) : null;
    }
}
