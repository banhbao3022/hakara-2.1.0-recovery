package p007c.p190n.p194b.p209b.p233t1;

import android.media.MediaCodec;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderException;

/* JADX INFO: renamed from: c.n.b.b.t1.j, reason: use source file name */
/* JADX INFO: compiled from: MediaCodecDecoderException.java */
/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    /* JADX WARN: Illegal instructions before constructor call */
    public MediaCodecDecoderException(Throwable th, MediaCodecInfo mediaCodecInfo) {
        StringBuilder sbM1556G = outline.m1556G("Decoder failed: ");
        sbM1556G.append(mediaCodecInfo == null ? null : mediaCodecInfo.f8552a);
        super(sbM1556G.toString(), th);
        if (Util6.f6307a < 21 || !(th instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) th).getDiagnosticInfo();
    }
}
