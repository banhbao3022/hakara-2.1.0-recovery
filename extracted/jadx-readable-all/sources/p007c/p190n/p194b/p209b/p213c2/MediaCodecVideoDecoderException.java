package p007c.p190n.p194b.p209b.p213c2;

import android.view.Surface;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecDecoderException;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecInfo;

/* JADX INFO: renamed from: c.n.b.b.c2.p, reason: use source file name */
/* JADX INFO: compiled from: MediaCodecVideoDecoderException.java */
/* JADX INFO: loaded from: classes.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public MediaCodecVideoDecoderException(Throwable th, MediaCodecInfo mediaCodecInfo, Surface surface) {
        super(th, mediaCodecInfo);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
