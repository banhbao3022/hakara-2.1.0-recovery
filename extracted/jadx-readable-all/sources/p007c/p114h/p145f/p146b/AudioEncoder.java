package p007c.p114h.p145f.p146b;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import java.nio.ByteBuffer;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.h.f.b.a, reason: use source file name */
/* JADX INFO: compiled from: AudioEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class AudioEncoder {

    /* JADX INFO: renamed from: a */
    public final int f4276a;

    /* JADX INFO: renamed from: b */
    public final int f4277b;

    /* JADX INFO: renamed from: c */
    public final int f4278c;

    /* JADX INFO: renamed from: d */
    public MediaFormat f4279d;

    /* JADX INFO: renamed from: e */
    public MediaCodec f4280e;

    /* JADX INFO: renamed from: f */
    public MediaMuxer f4281f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer[] f4282g;

    /* JADX INFO: renamed from: h */
    public ByteBuffer[] f4283h;

    /* JADX INFO: renamed from: i */
    public MediaCodec.BufferInfo f4284i;

    /* JADX INFO: renamed from: j */
    public String f4285j;

    /* JADX INFO: renamed from: k */
    public int f4286k;

    /* JADX INFO: renamed from: l */
    public int f4287l;

    /* JADX INFO: renamed from: m */
    public long f4288m;

    /* JADX INFO: renamed from: n */
    public int f4289n = 8192;

    public AudioEncoder(int i, int i2, int i3) {
        this.f4276a = i;
        this.f4277b = i2;
        this.f4278c = i3;
    }

    /* JADX INFO: renamed from: a */
    public void m2194a(byte[] bArr, int i) {
        int iDequeueInputBuffer = this.f4280e.dequeueInputBuffer(-1L);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer = this.f4282g[iDequeueInputBuffer];
            byteBuffer.clear();
            if (i < 0) {
                this.f4280e.queueInputBuffer(iDequeueInputBuffer, 0, 0, this.f4288m, 0);
            } else {
                this.f4287l += i;
                byteBuffer.put(bArr, 0, i);
                this.f4280e.queueInputBuffer(iDequeueInputBuffer, 0, i, this.f4288m, 0);
                this.f4288m = (((long) ((this.f4287l / this.f4278c) / 2)) * 1000000) / ((long) this.f4277b);
                StringBuilder sbM1556G = outline.m1556G("encodePCM: presentationUs：");
                sbM1556G.append(this.f4288m);
                sbM1556G.append(", s: ");
                sbM1556G.append(this.f4288m / 1000000.0f);
                Log.d("AudioEncoder", sbM1556G.toString());
            }
        }
        int iDequeueOutputBuffer = 0;
        while (iDequeueOutputBuffer != -1) {
            iDequeueOutputBuffer = this.f4280e.dequeueOutputBuffer(this.f4284i, 0L);
            if (iDequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer2 = this.f4283h[iDequeueOutputBuffer];
                byteBuffer2.position(this.f4284i.offset);
                MediaCodec.BufferInfo bufferInfo = this.f4284i;
                byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
                MediaCodec.BufferInfo bufferInfo2 = this.f4284i;
                if ((bufferInfo2.flags & 2) == 0 || bufferInfo2.size == 0) {
                    this.f4281f.writeSampleData(this.f4286k, this.f4283h[iDequeueOutputBuffer], bufferInfo2);
                    this.f4280e.releaseOutputBuffer(iDequeueOutputBuffer, false);
                } else {
                    this.f4280e.releaseOutputBuffer(iDequeueOutputBuffer, false);
                }
            } else if (iDequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.f4280e.getOutputFormat();
                this.f4279d = outputFormat;
                this.f4286k = this.f4281f.addTrack(outputFormat);
                this.f4281f.start();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2195b() {
        try {
            MediaCodec mediaCodec = this.f4280e;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.f4280e.release();
                this.f4280e = null;
            }
            MediaMuxer mediaMuxer = this.f4281f;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                this.f4281f.release();
                this.f4281f = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
