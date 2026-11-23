package p007c.p114h.p145f.p146b;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import android.view.Surface;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.io.IOException;
import java.nio.ByteBuffer;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p115a.p119d.CameraPreviewPresenter;

/* JADX INFO: renamed from: c.h.f.b.k, reason: use source file name */
/* JADX INFO: compiled from: VideoEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class VideoEncoder {

    /* JADX INFO: renamed from: a */
    public Surface f4354a;

    /* JADX INFO: renamed from: b */
    public MediaMuxer f4355b;

    /* JADX INFO: renamed from: c */
    public MediaCodec f4356c;

    /* JADX INFO: renamed from: d */
    public MediaCodec.BufferInfo f4357d = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: e */
    public int f4358e;

    /* JADX INFO: renamed from: f */
    public boolean f4359f;

    /* JADX INFO: renamed from: g */
    public VideoParams f4360g;

    /* JADX INFO: renamed from: h */
    public a f4361h;

    /* JADX INFO: renamed from: i */
    public long f4362i;

    /* JADX INFO: renamed from: j */
    public long f4363j;

    /* JADX INFO: renamed from: k */
    public long f4364k;

    /* JADX INFO: renamed from: c.h.f.b.k$a */
    /* JADX INFO: compiled from: VideoEncoder.java */
    public interface a {
    }

    public VideoEncoder(VideoParams videoParams, a aVar) throws IOException {
        this.f4360g = videoParams;
        this.f4361h = aVar;
        VideoParams videoParams2 = this.f4360g;
        int i = videoParams2.f4365a;
        i = i % 2 != 0 ? i - 1 : i;
        int i2 = videoParams2.f4366b;
        i2 = i2 % 2 != 0 ? i2 - 1 : i2;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger(CainMediaMetadataRetriever.METADATA_KEY_BITRATE, videoParams.f4367c);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 25);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
        int i3 = i * i2 >= 2073600 ? 2048 : 512;
        mediaFormatCreateVideoFormat.setInteger("profile", 8);
        mediaFormatCreateVideoFormat.setInteger("level", i3);
        Log.d("VideoEncoder", "format: " + mediaFormatCreateVideoFormat);
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f4356c = mediaCodecCreateEncoderByType;
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f4354a = this.f4356c.createInputSurface();
        this.f4356c.start();
        this.f4355b = new MediaMuxer(videoParams.f4368d, 0);
        this.f4358e = -1;
        this.f4359f = false;
    }

    /* JADX INFO: renamed from: a */
    public void m2212a(boolean z) {
        HWMediaRecorder hWMediaRecorder;
        OnRecordStateListener onRecordStateListener;
        Log.d("VideoEncoder", "drainEncoder(" + z + ")");
        if (z) {
            Log.d("VideoEncoder", "sending EOS to encoder");
            this.f4356c.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.f4356c.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.f4356c.dequeueOutputBuffer(this.f4357d, 10000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                } else {
                    Log.d("VideoEncoder", "no output available, spinning to await EOS");
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.f4356c.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.f4359f) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.f4356c.getOutputFormat();
                StringBuilder sbM1556G = outline.m1556G("encoder output format changed: ");
                sbM1556G.append(outputFormat.getString("mime"));
                Log.d("VideoEncoder", sbM1556G.toString());
                this.f4358e = this.f4355b.addTrack(outputFormat);
                this.f4355b.start();
                this.f4359f = true;
            } else if (iDequeueOutputBuffer < 0) {
                outline.m1565P("unexpected result from encoder.dequeueOutputBuffer: ", iDequeueOutputBuffer, "VideoEncoder");
            } else {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    throw new RuntimeException(outline.m1592n("encoderOutputBuffer ", iDequeueOutputBuffer, " was null"));
                }
                if ((this.f4357d.flags & 2) != 0) {
                    Log.d("VideoEncoder", "ignoring BUFFER_FLAG_CODEC_CONFIG");
                    this.f4357d.size = 0;
                }
                MediaCodec.BufferInfo bufferInfo = this.f4357d;
                if (bufferInfo.size != 0) {
                    if (!this.f4359f) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    long j2 = this.f4363j;
                    if (j2 > 0 && bufferInfo.presentationTimeUs < j2) {
                        bufferInfo.presentationTimeUs = j2 + 10000;
                    }
                    long j3 = bufferInfo.presentationTimeUs;
                    this.f4363j = j3;
                    long j4 = this.f4362i;
                    if (j4 == 0) {
                        this.f4362i = j3;
                    } else {
                        this.f4364k = j3 - j4;
                    }
                    byteBuffer.position(bufferInfo.offset);
                    MediaCodec.BufferInfo bufferInfo2 = this.f4357d;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                    this.f4355b.writeSampleData(this.f4358e, byteBuffer, this.f4357d);
                    Log.d("VideoEncoder", "sent " + this.f4357d.size + " bytes to muxer, ts=" + this.f4357d.presentationTimeUs);
                    a aVar = this.f4361h;
                    if (aVar != null && (hWMediaRecorder = ((VideoRecorder) aVar).f4382p) != null && (onRecordStateListener = hWMediaRecorder.f4321e) != null) {
                        long j5 = ((CameraPreviewPresenter) onRecordStateListener).f3894e.f4370f;
                    }
                }
                this.f4356c.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.f4357d.flags & 4) != 0) {
                    if (z) {
                        Log.d("VideoEncoder", "end of stream reached");
                        return;
                    } else {
                        Log.w("VideoEncoder", "reached end of stream unexpectedly");
                        return;
                    }
                }
            }
        }
    }
}
