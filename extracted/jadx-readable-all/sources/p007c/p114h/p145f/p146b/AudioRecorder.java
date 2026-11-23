package p007c.p114h.p145f.p146b;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.SystemClock;
import android.view.Surface;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.h.f.b.c, reason: use source file name */
/* JADX INFO: compiled from: AudioRecorder.java */
/* JADX INFO: loaded from: classes.dex */
public final class AudioRecorder implements Runnable {

    /* JADX INFO: renamed from: f */
    public int f4296f = 8192;

    /* JADX INFO: renamed from: g */
    public AudioRecord f4297g;

    /* JADX INFO: renamed from: h */
    public AudioTranscoder f4298h;

    /* JADX INFO: renamed from: i */
    public AudioEncoder f4299i;

    /* JADX INFO: renamed from: j */
    public AudioParams f4300j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f4301k;

    /* JADX INFO: renamed from: l */
    public int f4302l;

    /* JADX INFO: renamed from: m */
    public HWMediaRecorder f4303m;

    /* JADX INFO: renamed from: a */
    public void m2196a(AudioParams audioParams) throws Exception {
        this.f4300j = audioParams;
        if (this.f4297g != null) {
            m2197b();
        }
        AudioEncoder audioEncoder = this.f4299i;
        if (audioEncoder != null) {
            audioEncoder.m2195b();
        }
        float fM15334w = C7804v0.m15334w(audioParams.f4294e);
        try {
            int i = (int) (((double) (audioParams.f4290a * 4)) * 0.02d);
            this.f4302l = i;
            float f = (i / fM15334w) * 2.0f;
            if (this.f4296f < f) {
                this.f4296f = (int) f;
            } else {
                this.f4296f = 8192;
            }
            this.f4297g = new AudioRecord(1, audioParams.f4290a, audioParams.f4291b, audioParams.f4293d, this.f4302l);
            int i2 = audioParams.f4291b == 16 ? 1 : 2;
            AudioEncoder audioEncoder2 = new AudioEncoder(audioParams.f4292c, audioParams.f4290a, i2);
            this.f4299i = audioEncoder2;
            audioEncoder2.f4289n = this.f4296f;
            String str = audioParams.f4295f;
            audioEncoder2.f4285j = str;
            if (str == null) {
                throw new IllegalStateException("No Output Path found.");
            }
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", audioEncoder2.f4277b, audioEncoder2.f4278c);
            audioEncoder2.f4279d = mediaFormatCreateAudioFormat;
            mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
            audioEncoder2.f4279d.setInteger(CainMediaMetadataRetriever.METADATA_KEY_BITRATE, audioEncoder2.f4276a);
            audioEncoder2.f4279d.setInteger("max-input-size", audioEncoder2.f4289n);
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            audioEncoder2.f4280e = mediaCodecCreateEncoderByType;
            mediaCodecCreateEncoderByType.configure(audioEncoder2.f4279d, (Surface) null, (MediaCrypto) null, 1);
            audioEncoder2.f4280e.start();
            audioEncoder2.f4282g = audioEncoder2.f4280e.getInputBuffers();
            audioEncoder2.f4283h = audioEncoder2.f4280e.getOutputBuffers();
            audioEncoder2.f4284i = new MediaCodec.BufferInfo();
            audioEncoder2.f4281f = new MediaMuxer(audioEncoder2.f4285j, 0);
            audioEncoder2.f4287l = 0;
            audioEncoder2.f4288m = 0L;
            AudioTranscoder audioTranscoder = new AudioTranscoder();
            this.f4298h = audioTranscoder;
            audioTranscoder.f4309f = Math.max(0.1f, Math.min(fM15334w, 8.0f));
            AudioTranscoder audioTranscoder2 = this.f4298h;
            int i3 = audioParams.f4290a;
            int i4 = audioParams.f4293d;
            Objects.requireNonNull(audioTranscoder2);
            if (i4 != 2) {
                throw new AudioTranscoder.a(audioTranscoder2, i3, i2, i4);
            }
            int i5 = audioTranscoder2.f4305b;
            if (i5 == -1) {
                i5 = i3;
            }
            if (audioTranscoder2.f4307d != i3 || audioTranscoder2.f4306c != i2 || audioTranscoder2.f4311h != i5) {
                audioTranscoder2.f4307d = i3;
                audioTranscoder2.f4306c = i2;
                audioTranscoder2.f4311h = i5;
            }
            AudioTranscoder audioTranscoder3 = this.f4298h;
            audioTranscoder3.f4305b = audioParams.f4290a;
            audioTranscoder3.f4308e = new Sonic(audioTranscoder3.f4307d, audioTranscoder3.f4306c, audioTranscoder3.f4309f, audioTranscoder3.f4310g, audioTranscoder3.f4311h);
            audioTranscoder3.f4314k = audioTranscoder3.f4304a;
            audioTranscoder3.f4315l = 0L;
            audioTranscoder3.f4316m = 0L;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m2197b() {
        AudioRecord audioRecord = this.f4297g;
        if (audioRecord != null) {
            try {
                try {
                    audioRecord.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f4297g = null;
            } catch (Throwable th) {
                this.f4297g = null;
                throw th;
            }
        }
        AudioEncoder audioEncoder = this.f4299i;
        if (audioEncoder != null) {
            audioEncoder.m2195b();
            this.f4299i = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        long j2;
        boolean z = true;
        while (true) {
            j2 = 0;
            try {
                try {
                    if (!this.f4301k || !z) {
                        break;
                    }
                    synchronized (this) {
                        if (this.f4297g.getState() == 1) {
                            this.f4297g.startRecording();
                            HWMediaRecorder hWMediaRecorder = this.f4303m;
                            if (hWMediaRecorder != null) {
                                hWMediaRecorder.m2202c();
                            }
                            z = false;
                        }
                    }
                    SystemClock.sleep(10L);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                try {
                    m2197b();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
        }
        int i = this.f4302l;
        byte[] bArr = new byte[i];
        while (this.f4301k) {
            synchronized (this) {
                AudioRecord audioRecord = this.f4297g;
                if (audioRecord != null) {
                    int i2 = audioRecord.read(bArr, 0, i);
                    if (i2 > 0) {
                        this.f4298h.m2199b(ByteBuffer.wrap(bArr, 0, i2).order(ByteOrder.LITTLE_ENDIAN));
                    } else {
                        Thread.sleep(100L);
                    }
                    AudioTranscoder audioTranscoder = this.f4298h;
                    ByteBuffer byteBuffer = audioTranscoder.f4314k;
                    audioTranscoder.f4314k = audioTranscoder.f4304a;
                    if (byteBuffer != null && byteBuffer.hasRemaining()) {
                        int iRemaining = byteBuffer.remaining();
                        byte[] bArr2 = new byte[iRemaining];
                        byteBuffer.get(bArr2);
                        synchronized (this) {
                            AudioEncoder audioEncoder = this.f4299i;
                            if (audioEncoder != null) {
                                audioEncoder.m2194a(bArr2, iRemaining);
                            }
                        }
                        break;
                    }
                    Thread.sleep(5L);
                } else {
                    break;
                }
            }
        }
        synchronized (this) {
            AudioTranscoder audioTranscoder2 = this.f4298h;
            if (audioTranscoder2 != null) {
                audioTranscoder2.m2198a();
                AudioTranscoder audioTranscoder3 = this.f4298h;
                ByteBuffer byteBuffer2 = audioTranscoder3.f4314k;
                audioTranscoder3.f4314k = audioTranscoder3.f4304a;
                if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
                    int iRemaining2 = byteBuffer2.remaining();
                    byte[] bArr3 = new byte[iRemaining2];
                    byteBuffer2.get(bArr3);
                    synchronized (this) {
                        AudioEncoder audioEncoder2 = this.f4299i;
                        if (audioEncoder2 != null) {
                            audioEncoder2.m2194a(bArr3, iRemaining2);
                        }
                    }
                }
            }
            AudioEncoder audioEncoder3 = this.f4299i;
            if (audioEncoder3 != null) {
                audioEncoder3.m2194a(null, -1);
            }
        }
        AudioEncoder audioEncoder4 = this.f4299i;
        if (audioEncoder4 != null) {
            j2 = audioEncoder4.f4288m;
        }
        try {
            m2197b();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        HWMediaRecorder hWMediaRecorder2 = this.f4303m;
        if (hWMediaRecorder2 != null) {
            hWMediaRecorder2.m2201b(new RecordInfo(this.f4300j.f4295f, j2, MediaType.AUDIO));
        }
    }
}
