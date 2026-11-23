package p007c.p190n.p194b.p209b.p215n1;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.ExoPlaybackException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.FormatHolder;
import p007c.p190n.p194b.p209b.PlaybackParameters;
import p007c.p190n.p194b.p209b.Renderer2;
import p007c.p190n.p194b.p209b.RendererConfiguration;
import p007c.p190n.p194b.p209b.p212b2.MediaClock;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderCounters;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p217p1.DecoderReuseEvaluation;
import p007c.p190n.p194b.p209b.p233t1.C1827c;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecInfo;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecSelector;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.n1.b0, reason: use source file name */
/* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {

    /* JADX INFO: renamed from: J0 */
    public final Context f6979J0;

    /* JADX INFO: renamed from: K0 */
    public final AudioRendererEventListener2.a f6980K0;

    /* JADX INFO: renamed from: L0 */
    public final AudioSink f6981L0;

    /* JADX INFO: renamed from: M0 */
    public int f6982M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f6983N0;

    /* JADX INFO: renamed from: O0 */
    public Format f6984O0;

    /* JADX INFO: renamed from: P0 */
    public long f6985P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f6986Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f6987R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f6988S0;

    /* JADX INFO: renamed from: T0 */
    public Renderer2.a f6989T0;

    /* JADX INFO: renamed from: c.n.b.b.n1.b0$b */
    /* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
    public final class b implements AudioSink.c {
        public b(a aVar) {
        }
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, null, null);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: B */
    public void mo3030B() {
        this.f6988S0 = true;
        try {
            ((DefaultAudioSink) this.f6981L0).m3590d();
            try {
                super.mo3030B();
            } finally {
                this.f6980K0.m3567a(this.f8571F0);
            }
        } catch (Throwable th) {
            try {
                super.mo3030B();
                throw th;
            } finally {
                this.f6980K0.m3567a(this.f8571F0);
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: C */
    public void mo3031C(boolean z, boolean z2) throws ExoPlaybackException {
        super.mo3031C(z, z2);
        final AudioRendererEventListener2.a aVar = this.f6980K0;
        final DecoderCounters decoderCounters = this.f8571F0;
        Handler handler = aVar.f7115a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: c.n.b.b.n1.i
                @Override // java.lang.Runnable
                public final void run() {
                    AudioRendererEventListener2.a aVar2 = aVar;
                    DecoderCounters decoderCounters2 = decoderCounters;
                    AudioRendererEventListener2 audioRendererEventListener2 = aVar2.f7116b;
                    int i = Util6.f6307a;
                    audioRendererEventListener2.mo1150g(decoderCounters2);
                }
            });
        }
        RendererConfiguration rendererConfiguration = this.f6250h;
        Objects.requireNonNull(rendererConfiguration);
        if (!rendererConfiguration.f6665b) {
            DefaultAudioSink defaultAudioSink = (DefaultAudioSink) this.f6981L0;
            if (defaultAudioSink.f7198W) {
                defaultAudioSink.f7198W = false;
                defaultAudioSink.m3590d();
                return;
            }
            return;
        }
        DefaultAudioSink defaultAudioSink2 = (DefaultAudioSink) this.f6981L0;
        Objects.requireNonNull(defaultAudioSink2);
        C2096e.m4570f(Util6.f6307a >= 21);
        C2096e.m4570f(defaultAudioSink2.f7195T);
        if (defaultAudioSink2.f7198W) {
            return;
        }
        defaultAudioSink2.f7198W = true;
        defaultAudioSink2.m3590d();
    }

    /* JADX INFO: renamed from: C0 */
    public final int m3524C0(MediaCodecInfo mediaCodecInfo, Format format) {
        int i;
        if (!"OMX.google.raw.decoder".equals(mediaCodecInfo.f8552a) || (i = Util6.f6307a) >= 24 || (i == 23 && Util6.m3098G(this.f6979J0))) {
            return format.f6935r;
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: D */
    public void mo3032D(long j2, boolean z) throws ExoPlaybackException {
        super.mo3032D(j2, z);
        ((DefaultAudioSink) this.f6981L0).m3590d();
        this.f6985P0 = j2;
        this.f6986Q0 = true;
        this.f6987R0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x011a  */
    /* JADX INFO: renamed from: D0 */
    public final void m3525D0() {
        long jMax;
        long jM3570a;
        long jM3133u;
        boolean timestamp;
        Method method;
        AudioSink audioSink = this.f6981L0;
        boolean zMo3368g = mo3368g();
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) audioSink;
        if (!defaultAudioSink.m3600p() || defaultAudioSink.f7181F) {
            jMax = Long.MIN_VALUE;
        } else {
            AudioTrackPositionTracker audioTrackPositionTracker = defaultAudioSink.f7210i;
            AudioTrack audioTrack = audioTrackPositionTracker.f7141c;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                long jM3570a2 = audioTrackPositionTracker.m3570a(audioTrackPositionTracker.m3571b());
                if (jM3570a2 != 0) {
                    long jNanoTime = System.nanoTime() / 1000;
                    if (jNanoTime - audioTrackPositionTracker.f7151m >= 30000) {
                        long[] jArr = audioTrackPositionTracker.f7140b;
                        int i = audioTrackPositionTracker.f7160v;
                        jArr[i] = jM3570a2 - jNanoTime;
                        audioTrackPositionTracker.f7160v = (i + 1) % 10;
                        int i2 = audioTrackPositionTracker.f7161w;
                        if (i2 < 10) {
                            audioTrackPositionTracker.f7161w = i2 + 1;
                        }
                        audioTrackPositionTracker.f7151m = jNanoTime;
                        audioTrackPositionTracker.f7150l = 0L;
                        int i3 = 0;
                        while (true) {
                            int i4 = audioTrackPositionTracker.f7161w;
                            if (i3 >= i4) {
                                break;
                            }
                            audioTrackPositionTracker.f7150l = (audioTrackPositionTracker.f7140b[i3] / ((long) i4)) + audioTrackPositionTracker.f7150l;
                            i3++;
                        }
                    }
                    if (!audioTrackPositionTracker.f7146h) {
                        AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.f7144f;
                        Objects.requireNonNull(audioTimestampPoller);
                        AudioTimestampPoller.a aVar = audioTimestampPoller.f7122a;
                        if (aVar == null || jNanoTime - audioTimestampPoller.f7126e < audioTimestampPoller.f7125d) {
                            timestamp = false;
                        } else {
                            audioTimestampPoller.f7126e = jNanoTime;
                            timestamp = aVar.f7128a.getTimestamp(aVar.f7129b);
                            if (timestamp) {
                                long j2 = aVar.f7129b.framePosition;
                                if (aVar.f7131d > j2) {
                                    aVar.f7130c++;
                                }
                                aVar.f7131d = j2;
                                aVar.f7132e = j2 + (aVar.f7130c << 32);
                            }
                            int i5 = audioTimestampPoller.f7123b;
                            if (i5 != 0) {
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            if (i5 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (timestamp) {
                                            audioTimestampPoller.m3568a();
                                        }
                                    } else if (!timestamp) {
                                        audioTimestampPoller.m3568a();
                                    }
                                } else if (!timestamp) {
                                    audioTimestampPoller.m3568a();
                                } else if (audioTimestampPoller.f7122a.f7132e > audioTimestampPoller.f7127f) {
                                    audioTimestampPoller.m3569b(2);
                                }
                            } else if (timestamp) {
                                AudioTimestampPoller.a aVar2 = audioTimestampPoller.f7122a;
                                if (aVar2.f7129b.nanoTime / 1000 >= audioTimestampPoller.f7124c) {
                                    audioTimestampPoller.f7127f = aVar2.f7132e;
                                    audioTimestampPoller.m3569b(1);
                                } else {
                                    timestamp = false;
                                }
                            } else if (jNanoTime - audioTimestampPoller.f7124c > 500000) {
                                audioTimestampPoller.m3569b(3);
                            }
                        }
                        if (timestamp) {
                            AudioTimestampPoller.a aVar3 = audioTimestampPoller.f7122a;
                            long j3 = aVar3 != null ? aVar3.f7129b.nanoTime / 1000 : -9223372036854775807L;
                            long j4 = aVar3 != null ? aVar3.f7132e : -1L;
                            if (Math.abs(j3 - jNanoTime) > 5000000) {
                                audioTrackPositionTracker.f7139a.mo3579e(j4, j3, jNanoTime, jM3570a2);
                                audioTimestampPoller.m3569b(4);
                            } else if (Math.abs(audioTrackPositionTracker.m3570a(j4) - jM3570a2) > 5000000) {
                                audioTrackPositionTracker.f7139a.mo3578d(j4, j3, jNanoTime, jM3570a2);
                                audioTimestampPoller.m3569b(4);
                            } else if (audioTimestampPoller.f7123b == 4) {
                                audioTimestampPoller.m3568a();
                            }
                        }
                        if (audioTrackPositionTracker.f7155q && (method = audioTrackPositionTracker.f7152n) != null && jNanoTime - audioTrackPositionTracker.f7156r >= 500000) {
                            try {
                                AudioTrack audioTrack2 = audioTrackPositionTracker.f7141c;
                                Objects.requireNonNull(audioTrack2);
                                Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                                int i6 = Util6.f6307a;
                                long jIntValue = (((long) num.intValue()) * 1000) - audioTrackPositionTracker.f7147i;
                                audioTrackPositionTracker.f7153o = jIntValue;
                                long jMax2 = Math.max(jIntValue, 0L);
                                audioTrackPositionTracker.f7153o = jMax2;
                                if (jMax2 > 5000000) {
                                    audioTrackPositionTracker.f7139a.mo3577c(jMax2);
                                    audioTrackPositionTracker.f7153o = 0L;
                                }
                            } catch (Exception unused) {
                                audioTrackPositionTracker.f7152n = null;
                            }
                            audioTrackPositionTracker.f7156r = jNanoTime;
                        }
                    }
                }
            }
            long jNanoTime2 = System.nanoTime() / 1000;
            AudioTimestampPoller audioTimestampPoller2 = audioTrackPositionTracker.f7144f;
            Objects.requireNonNull(audioTimestampPoller2);
            boolean z = audioTimestampPoller2.f7123b == 2;
            if (z) {
                AudioTimestampPoller.a aVar4 = audioTimestampPoller2.f7122a;
                long jM3570a3 = audioTrackPositionTracker.m3570a(aVar4 != null ? aVar4.f7132e : -1L);
                AudioTimestampPoller.a aVar5 = audioTimestampPoller2.f7122a;
                jM3570a = Util6.m3133u(jNanoTime2 - (aVar5 != null ? aVar5.f7129b.nanoTime / 1000 : -9223372036854775807L), audioTrackPositionTracker.f7148j) + jM3570a3;
            } else {
                jM3570a = audioTrackPositionTracker.f7161w == 0 ? audioTrackPositionTracker.m3570a(audioTrackPositionTracker.m3571b()) : audioTrackPositionTracker.f7150l + jNanoTime2;
                if (!zMo3368g) {
                    jM3570a = Math.max(0L, jM3570a - audioTrackPositionTracker.f7153o);
                }
            }
            if (audioTrackPositionTracker.f7136D != z) {
                audioTrackPositionTracker.f7138F = audioTrackPositionTracker.f7135C;
                audioTrackPositionTracker.f7137E = audioTrackPositionTracker.f7134B;
            }
            long j5 = jNanoTime2 - audioTrackPositionTracker.f7138F;
            if (j5 < 1000000) {
                long jM3133u2 = Util6.m3133u(j5, audioTrackPositionTracker.f7148j) + audioTrackPositionTracker.f7137E;
                long j6 = (j5 * 1000) / 1000000;
                jM3570a = (((1000 - j6) * jM3133u2) + (jM3570a * j6)) / 1000;
            }
            if (!audioTrackPositionTracker.f7149k) {
                long j7 = audioTrackPositionTracker.f7134B;
                if (jM3570a > j7) {
                    audioTrackPositionTracker.f7149k = true;
                    audioTrackPositionTracker.f7139a.mo3575a(System.currentTimeMillis() - C.m3237c(Util6.m3138z(C.m3237c(jM3570a - j7), audioTrackPositionTracker.f7148j)));
                }
            }
            audioTrackPositionTracker.f7135C = jNanoTime2;
            audioTrackPositionTracker.f7134B = jM3570a;
            audioTrackPositionTracker.f7136D = z;
            long jMin = Math.min(jM3570a, defaultAudioSink.f7219r.m3617c(defaultAudioSink.m3596l()));
            while (!defaultAudioSink.f7211j.isEmpty() && jMin >= defaultAudioSink.f7211j.getFirst().f7245d) {
                defaultAudioSink.f7223v = defaultAudioSink.f7211j.remove();
            }
            DefaultAudioSink.e eVar = defaultAudioSink.f7223v;
            long j8 = jMin - eVar.f7245d;
            if (eVar.f7242a.equals(PlaybackParameters.f6259a)) {
                jM3133u = defaultAudioSink.f7223v.f7244c + j8;
            } else if (defaultAudioSink.f7211j.isEmpty()) {
                jM3133u = defaultAudioSink.f7203b.mo3610b(j8) + defaultAudioSink.f7223v.f7244c;
            } else {
                DefaultAudioSink.e first = defaultAudioSink.f7211j.getFirst();
                jM3133u = first.f7244c - Util6.m3133u(first.f7245d - jMin, defaultAudioSink.f7223v.f7242a.f6260b);
            }
            jMax = defaultAudioSink.f7219r.m3617c(defaultAudioSink.f7203b.mo3611c()) + jM3133u;
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.f6987R0) {
                jMax = Math.max(this.f6985P0, jMax);
            }
            this.f6985P0 = jMax;
            this.f6987R0 = false;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: E */
    public void mo3033E() {
        try {
            super.mo3033E();
        } finally {
            if (this.f6988S0) {
                this.f6988S0 = false;
                ((DefaultAudioSink) this.f6981L0).m3604v();
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: F */
    public void mo3034F() {
        ((DefaultAudioSink) this.f6981L0).m3601s();
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: G */
    public void mo3035G() {
        m3525D0();
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) this.f6981L0;
        boolean z = false;
        defaultAudioSink.f7194S = false;
        if (defaultAudioSink.m3600p()) {
            AudioTrackPositionTracker audioTrackPositionTracker = defaultAudioSink.f7210i;
            audioTrackPositionTracker.f7150l = 0L;
            audioTrackPositionTracker.f7161w = 0;
            audioTrackPositionTracker.f7160v = 0;
            audioTrackPositionTracker.f7151m = 0L;
            audioTrackPositionTracker.f7135C = 0L;
            audioTrackPositionTracker.f7138F = 0L;
            audioTrackPositionTracker.f7149k = false;
            if (audioTrackPositionTracker.f7162x == -9223372036854775807L) {
                AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.f7144f;
                Objects.requireNonNull(audioTimestampPoller);
                audioTimestampPoller.m3568a();
                z = true;
            }
            if (z) {
                defaultAudioSink.f7220s.pause();
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: K */
    public DecoderReuseEvaluation mo3277K(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation decoderReuseEvaluationM3953c = mediaCodecInfo.m3953c(format, format2);
        int i = decoderReuseEvaluationM3953c.f7297e;
        if (m3524C0(mediaCodecInfo, format2) > this.f6982M0) {
            i |= 64;
        }
        int i2 = i;
        return new DecoderReuseEvaluation(mediaCodecInfo.f8552a, format, format2, i2 != 0 ? 0 : decoderReuseEvaluationM3953c.f7296d, i2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: L */
    public void mo3279L(MediaCodecInfo mediaCodecInfo, MediaCodecAdapter mediaCodecAdapter, Format format, MediaCrypto mediaCrypto, float f) {
        boolean z;
        boolean z2;
        Format[] formatArr = this.f6254l;
        Objects.requireNonNull(formatArr);
        int iM3524C0 = m3524C0(mediaCodecInfo, format);
        boolean z3 = false;
        if (formatArr.length != 1) {
            for (Format format2 : formatArr) {
                if (mediaCodecInfo.m3953c(format, format2).f7296d != 0) {
                    iM3524C0 = Math.max(iM3524C0, m3524C0(mediaCodecInfo, format2));
                }
            }
        }
        this.f6982M0 = iM3524C0;
        String str = mediaCodecInfo.f8552a;
        int i = Util6.f6307a;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Util6.f6309c)) {
            String str2 = Util6.f6308b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f6983N0 = z;
        String str3 = mediaCodecInfo.f8554c;
        int i2 = this.f6982M0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", format.f6915D);
        mediaFormat.setInteger("sample-rate", format.f6916E);
        C1095a.m2379F(mediaFormat, format.f6936s);
        C1095a.m2404t(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                if (i == 23) {
                    String str4 = Util6.f6310d;
                    if ("ZTE B2017G".equals(str4) || "AXON 7 mini".equals(str4)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        if (i <= 28 && "audio/ac4".equals(format.f6934q)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
            AudioSink audioSink = this.f6981L0;
            int i3 = format.f6915D;
            int i4 = format.f6916E;
            Format.b bVar = new Format.b();
            bVar.f6958k = "audio/raw";
            bVar.f6971x = i3;
            bVar.f6972y = i4;
            bVar.f6973z = 4;
            if (((DefaultAudioSink) audioSink).m3593i(bVar.m3519a()) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        mediaCodecAdapter.mo3935a(mediaFormat, null, mediaCrypto, 0);
        if ("audio/raw".equals(mediaCodecInfo.f8553b) && !"audio/raw".equals(format.f6934q)) {
            z3 = true;
        }
        if (!z3) {
            format = null;
        }
        this.f6984O0 = format;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: W */
    public float mo3293W(float f, Format format, Format[] formatArr) {
        int iMax = -1;
        for (Format format2 : formatArr) {
            int i = format2.f6916E;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: X */
    public List<MediaCodecInfo> mo3295X(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws MediaCodecUtil.c {
        MediaCodecInfo mediaCodecInfoM3987d;
        String str = format.f6934q;
        if (str == null) {
            return Collections.emptyList();
        }
        if ((((DefaultAudioSink) this.f6981L0).m3593i(format) != 0) && (mediaCodecInfoM3987d = MediaCodecUtil.m3987d("audio/raw", false, false)) != null) {
            return Collections.singletonList(mediaCodecInfoM3987d);
        }
        List<MediaCodecInfo> listMo3932a = mediaCodecSelector.mo3932a(str, z, false);
        Pattern pattern = MediaCodecUtil.f8634a;
        ArrayList arrayList = new ArrayList(listMo3932a);
        MediaCodecUtil.m3993j(arrayList, new C1827c(format));
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(mediaCodecSelector.mo3932a("audio/eac3", z, false));
            arrayList = arrayList2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // p007c.p190n.p194b.p209b.p212b2.MediaClock
    /* JADX INFO: renamed from: b */
    public PlaybackParameters mo3064b() {
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) this.f6981L0;
        return defaultAudioSink.f7212k ? defaultAudioSink.f7224w : defaultAudioSink.m3592g();
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: c */
    public boolean mo3297c() {
        return ((DefaultAudioSink) this.f6981L0).m3598n() || super.mo3297c();
    }

    @Override // p007c.p190n.p194b.p209b.p212b2.MediaClock
    /* JADX INFO: renamed from: d */
    public long mo3066d() {
        if (this.f6252j == 2) {
            m3525D0();
        }
        return this.f6985P0;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: d0 */
    public void mo3298d0(final String str, final long j2, final long j3) {
        final AudioRendererEventListener2.a aVar = this.f6980K0;
        Handler handler = aVar.f7115a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: c.n.b.b.n1.e
                @Override // java.lang.Runnable
                public final void run() {
                    AudioRendererEventListener2.a aVar2 = aVar;
                    String str2 = str;
                    long j4 = j2;
                    long j5 = j3;
                    AudioRendererEventListener2 audioRendererEventListener2 = aVar2.f7116b;
                    int i = Util6.f6307a;
                    audioRendererEventListener2.mo1155v(str2, j4, j5);
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: e0 */
    public void mo3299e0(final String str) {
        final AudioRendererEventListener2.a aVar = this.f6980K0;
        Handler handler = aVar.f7115a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: c.n.b.b.n1.f
                @Override // java.lang.Runnable
                public final void run() {
                    AudioRendererEventListener2.a aVar2 = aVar;
                    String str2 = str;
                    AudioRendererEventListener2 audioRendererEventListener2 = aVar2.f7116b;
                    int i = Util6.f6307a;
                    audioRendererEventListener2.mo1154u(str2);
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: f0 */
    public DecoderReuseEvaluation mo3300f0(FormatHolder formatHolder) throws ExoPlaybackException {
        final DecoderReuseEvaluation decoderReuseEvaluationMo3300f0 = super.mo3300f0(formatHolder);
        final AudioRendererEventListener2.a aVar = this.f6980K0;
        final Format format = formatHolder.f7259b;
        Handler handler = aVar.f7115a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: c.n.b.b.n1.d
                @Override // java.lang.Runnable
                public final void run() {
                    AudioRendererEventListener2.a aVar2 = aVar;
                    Format format2 = format;
                    DecoderReuseEvaluation decoderReuseEvaluation = decoderReuseEvaluationMo3300f0;
                    AudioRendererEventListener2 audioRendererEventListener2 = aVar2.f7116b;
                    int i = Util6.f6307a;
                    audioRendererEventListener2.mo1129A(format2, decoderReuseEvaluation);
                }
            });
        }
        return decoderReuseEvaluationMo3300f0;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: g */
    public boolean mo3368g() {
        if (this.f8563B0) {
            DefaultAudioSink defaultAudioSink = (DefaultAudioSink) this.f6981L0;
            if (!defaultAudioSink.m3600p() || (defaultAudioSink.f7192Q && !defaultAudioSink.m3598n())) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: g0 */
    public void mo3301g0(Format format, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iM3136x;
        int i;
        Format format2 = this.f6984O0;
        int[] iArr = null;
        if (format2 != null) {
            format = format2;
        } else if (this.f8583O != null) {
            if ("audio/raw".equals(format.f6934q)) {
                iM3136x = format.f6917F;
            } else if (Util6.f6307a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iM3136x = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                iM3136x = Util6.m3136x(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                iM3136x = "audio/raw".equals(format.f6934q) ? format.f6917F : 2;
            }
            Format.b bVar = new Format.b();
            bVar.f6958k = "audio/raw";
            bVar.f6973z = iM3136x;
            bVar.f6944A = format.f6918G;
            bVar.f6945B = format.f6919H;
            bVar.f6971x = mediaFormat.getInteger("channel-count");
            bVar.f6972y = mediaFormat.getInteger("sample-rate");
            Format formatM3519a = bVar.m3519a();
            if (this.f6983N0 && formatM3519a.f6915D == 6 && (i = format.f6915D) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < format.f6915D; i2++) {
                    iArr[i2] = i2;
                }
            }
            format = formatM3519a;
        }
        try {
            ((DefaultAudioSink) this.f6981L0).m3588b(format, 0, iArr);
        } catch (AudioSink.a e) {
            throw m3056z(e, e.f7117f, false);
        }
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2, p007c.p190n.p194b.p209b.RendererCapabilities
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: i0 */
    public void mo3303i0() {
        ((DefaultAudioSink) this.f6981L0).f7180E = true;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: j0 */
    public void mo3304j0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.f6986Q0 || decoderInputBuffer.m3627u()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f7289j - this.f6985P0) > 500000) {
            this.f6985P0 = decoderInputBuffer.f7289j;
        }
        this.f6986Q0 = false;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: l0 */
    public boolean mo3305l0(long j2, long j3, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j4, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        Objects.requireNonNull(byteBuffer);
        if (this.f6984O0 != null && (i2 & 2) != 0) {
            Objects.requireNonNull(mediaCodecAdapter);
            mediaCodecAdapter.mo3943i(i, false);
            return true;
        }
        if (z) {
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.mo3943i(i, false);
            }
            this.f8571F0.f7280f += i3;
            ((DefaultAudioSink) this.f6981L0).f7180E = true;
            return true;
        }
        try {
            if (!((DefaultAudioSink) this.f6981L0).m3597m(byteBuffer, j4, i3)) {
                return false;
            }
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.mo3943i(i, false);
            }
            this.f8571F0.f7279e += i3;
            return true;
        } catch (AudioSink.b e) {
            throw m3056z(e, e.f7119g, e.f7118f);
        } catch (AudioSink.d e2) {
            throw m3056z(e2, format, e2.f7120f);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: o0 */
    public void mo3526o0() throws ExoPlaybackException {
        try {
            DefaultAudioSink defaultAudioSink = (DefaultAudioSink) this.f6981L0;
            if (!defaultAudioSink.f7192Q && defaultAudioSink.m3600p() && defaultAudioSink.m3589c()) {
                defaultAudioSink.m3602t();
                defaultAudioSink.f7192Q = true;
            }
        } catch (AudioSink.d e) {
            throw m3056z(e, e.f7121g, e.f7120f);
        }
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer, p007c.p190n.p194b.p209b.PlayerMessage.b
    /* JADX INFO: renamed from: p */
    public void mo3047p(int i, Object obj) throws ExoPlaybackException {
        if (i == 2) {
            AudioSink audioSink = this.f6981L0;
            float fFloatValue = ((Float) obj).floatValue();
            DefaultAudioSink defaultAudioSink = (DefaultAudioSink) audioSink;
            if (defaultAudioSink.f7183H != fFloatValue) {
                defaultAudioSink.f7183H = fFloatValue;
                defaultAudioSink.m3608z();
            }
            return;
        }
        if (i == 3) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            DefaultAudioSink defaultAudioSink2 = (DefaultAudioSink) this.f6981L0;
            if (defaultAudioSink2.f7221t.equals(audioAttributes)) {
                return;
            }
            defaultAudioSink2.f7221t = audioAttributes;
            if (defaultAudioSink2.f7198W) {
                return;
            }
            defaultAudioSink2.m3590d();
            return;
        }
        if (i == 5) {
            AuxEffectInfo auxEffectInfo = (AuxEffectInfo) obj;
            DefaultAudioSink defaultAudioSink3 = (DefaultAudioSink) this.f6981L0;
            if (defaultAudioSink3.f7197V.equals(auxEffectInfo)) {
                return;
            }
            int i2 = auxEffectInfo.f7165a;
            float f = auxEffectInfo.f7166b;
            AudioTrack audioTrack = defaultAudioSink3.f7220s;
            if (audioTrack != null) {
                if (defaultAudioSink3.f7197V.f7165a != i2) {
                    audioTrack.attachAuxEffect(i2);
                }
                if (i2 != 0) {
                    defaultAudioSink3.f7220s.setAuxEffectSendLevel(f);
                }
            }
            defaultAudioSink3.f7197V = auxEffectInfo;
            return;
        }
        switch (i) {
            case 101:
                DefaultAudioSink defaultAudioSink4 = (DefaultAudioSink) this.f6981L0;
                defaultAudioSink4.m3606x(defaultAudioSink4.m3592g(), ((Boolean) obj).booleanValue());
                break;
            case 102:
                AudioSink audioSink2 = this.f6981L0;
                int iIntValue = ((Integer) obj).intValue();
                DefaultAudioSink defaultAudioSink5 = (DefaultAudioSink) audioSink2;
                if (defaultAudioSink5.f7196U != iIntValue) {
                    defaultAudioSink5.f7196U = iIntValue;
                    defaultAudioSink5.f7195T = iIntValue != 0;
                    defaultAudioSink5.m3590d();
                }
                break;
            case 103:
                this.f6989T0 = (Renderer2.a) obj;
                break;
        }
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer, p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: v */
    public MediaClock mo3053v() {
        return this;
    }

    @Override // p007c.p190n.p194b.p209b.p212b2.MediaClock
    /* JADX INFO: renamed from: w */
    public void mo3067w(PlaybackParameters playbackParameters) {
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) this.f6981L0;
        Objects.requireNonNull(defaultAudioSink);
        PlaybackParameters playbackParameters2 = new PlaybackParameters(Util6.m3120h(playbackParameters.f6260b, 0.1f, 8.0f), Util6.m3120h(playbackParameters.f6261c, 0.1f, 8.0f));
        if (!defaultAudioSink.f7212k || Util6.f6307a < 23) {
            defaultAudioSink.m3606x(playbackParameters2, defaultAudioSink.m3595k());
        } else {
            defaultAudioSink.m3607y(playbackParameters2);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: w0 */
    public boolean mo3527w0(Format format) {
        return ((DefaultAudioSink) this.f6981L0).m3593i(format) != 0;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: x0 */
    public int mo3308x0(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.c {
        if (!MimeTypes.m3169k(format.f6934q)) {
            return 0;
        }
        int i = Util6.f6307a >= 21 ? 32 : 0;
        boolean z = format.f6921J != null;
        boolean zM3959y0 = MediaCodecRenderer.m3959y0(format);
        if (zM3959y0) {
            if ((((DefaultAudioSink) this.f6981L0).m3593i(format) != 0) && (!z || MediaCodecUtil.m3987d("audio/raw", false, false) != null)) {
                return i | 12;
            }
        }
        if ("audio/raw".equals(format.f6934q)) {
            if (!(((DefaultAudioSink) this.f6981L0).m3593i(format) != 0)) {
                return 1;
            }
        }
        AudioSink audioSink = this.f6981L0;
        int i2 = format.f6915D;
        int i3 = format.f6916E;
        Format.b bVar = new Format.b();
        bVar.f6958k = "audio/raw";
        bVar.f6971x = i2;
        bVar.f6972y = i3;
        bVar.f6973z = 2;
        if (!(((DefaultAudioSink) audioSink).m3593i(bVar.m3519a()) != 0)) {
            return 1;
        }
        List<MediaCodecInfo> listMo3295X = mo3295X(mediaCodecSelector, format, false);
        if (listMo3295X.isEmpty()) {
            return 1;
        }
        if (!zM3959y0) {
            return 2;
        }
        MediaCodecInfo mediaCodecInfo = listMo3295X.get(0);
        boolean zM3955e = mediaCodecInfo.m3955e(format);
        return ((zM3955e && mediaCodecInfo.m3956f(format)) ? 16 : 8) | (zM3955e ? 4 : 3) | i;
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener2 audioRendererEventListener2) {
        this(context, mediaCodecSelector, handler, audioRendererEventListener2, (AudioCapabilities) null, new AudioProcessor[0]);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener2 audioRendererEventListener2, AudioCapabilities audioCapabilities, AudioProcessor... audioProcessorArr) {
        this(context, mediaCodecSelector, handler, audioRendererEventListener2, new DefaultAudioSink(audioCapabilities, audioProcessorArr));
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener2 audioRendererEventListener2, AudioSink audioSink) {
        this(context, MediaCodecAdapter.a.f8551a, mediaCodecSelector, false, handler, audioRendererEventListener2, audioSink);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, AudioRendererEventListener2 audioRendererEventListener2, AudioSink audioSink) {
        this(context, MediaCodecAdapter.a.f8551a, mediaCodecSelector, z, handler, audioRendererEventListener2, audioSink);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.a aVar, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, AudioRendererEventListener2 audioRendererEventListener2, AudioSink audioSink) {
        super(1, aVar, mediaCodecSelector, z, 44100.0f);
        this.f6979J0 = context.getApplicationContext();
        this.f6981L0 = audioSink;
        this.f6980K0 = new AudioRendererEventListener2.a(handler, audioRendererEventListener2);
        ((DefaultAudioSink) audioSink).f7217p = new b(null);
    }
}
