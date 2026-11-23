package p007c.p190n.p194b.p209b.p215n1;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.PlaybackParameters;
import p007c.p190n.p194b.p209b.Renderer2;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.n1.y, reason: use source file name */
/* JADX INFO: compiled from: DefaultAudioSink.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: A */
    public long f7176A;

    /* JADX INFO: renamed from: B */
    public long f7177B;

    /* JADX INFO: renamed from: C */
    public long f7178C;

    /* JADX INFO: renamed from: D */
    public int f7179D;

    /* JADX INFO: renamed from: E */
    public boolean f7180E;

    /* JADX INFO: renamed from: F */
    public boolean f7181F;

    /* JADX INFO: renamed from: G */
    public long f7182G;

    /* JADX INFO: renamed from: H */
    public float f7183H;

    /* JADX INFO: renamed from: I */
    public AudioProcessor[] f7184I;

    /* JADX INFO: renamed from: J */
    public ByteBuffer[] f7185J;

    /* JADX INFO: renamed from: K */
    public ByteBuffer f7186K;

    /* JADX INFO: renamed from: L */
    public int f7187L;

    /* JADX INFO: renamed from: M */
    public ByteBuffer f7188M;

    /* JADX INFO: renamed from: N */
    public byte[] f7189N;

    /* JADX INFO: renamed from: O */
    public int f7190O;

    /* JADX INFO: renamed from: P */
    public int f7191P;

    /* JADX INFO: renamed from: Q */
    public boolean f7192Q;

    /* JADX INFO: renamed from: R */
    public boolean f7193R;

    /* JADX INFO: renamed from: S */
    public boolean f7194S;

    /* JADX INFO: renamed from: T */
    public boolean f7195T;

    /* JADX INFO: renamed from: U */
    public int f7196U;

    /* JADX INFO: renamed from: V */
    public AuxEffectInfo f7197V;

    /* JADX INFO: renamed from: W */
    public boolean f7198W;

    /* JADX INFO: renamed from: X */
    public long f7199X;

    /* JADX INFO: renamed from: Y */
    public boolean f7200Y;

    /* JADX INFO: renamed from: Z */
    public boolean f7201Z;

    /* JADX INFO: renamed from: a */
    public final AudioCapabilities f7202a;

    /* JADX INFO: renamed from: b */
    public final b f7203b;

    /* JADX INFO: renamed from: c */
    public final boolean f7204c;

    /* JADX INFO: renamed from: d */
    public final ChannelMappingAudioProcessor f7205d;

    /* JADX INFO: renamed from: e */
    public final TrimmingAudioProcessor f7206e;

    /* JADX INFO: renamed from: f */
    public final AudioProcessor[] f7207f;

    /* JADX INFO: renamed from: g */
    public final AudioProcessor[] f7208g;

    /* JADX INFO: renamed from: h */
    public final ConditionVariable f7209h;

    /* JADX INFO: renamed from: i */
    public final AudioTrackPositionTracker f7210i;

    /* JADX INFO: renamed from: j */
    public final ArrayDeque<e> f7211j;

    /* JADX INFO: renamed from: k */
    public final boolean f7212k;

    /* JADX INFO: renamed from: l */
    public final boolean f7213l;

    /* JADX INFO: renamed from: m */
    public h f7214m;

    /* JADX INFO: renamed from: n */
    public final f<AudioSink.b> f7215n;

    /* JADX INFO: renamed from: o */
    public final f<AudioSink.d> f7216o;

    /* JADX INFO: renamed from: p */
    public AudioSink.c f7217p;

    /* JADX INFO: renamed from: q */
    public c f7218q;

    /* JADX INFO: renamed from: r */
    public c f7219r;

    /* JADX INFO: renamed from: s */
    public AudioTrack f7220s;

    /* JADX INFO: renamed from: t */
    public AudioAttributes f7221t;

    /* JADX INFO: renamed from: u */
    public e f7222u;

    /* JADX INFO: renamed from: v */
    public e f7223v;

    /* JADX INFO: renamed from: w */
    public PlaybackParameters f7224w;

    /* JADX INFO: renamed from: x */
    public ByteBuffer f7225x;

    /* JADX INFO: renamed from: y */
    public int f7226y;

    /* JADX INFO: renamed from: z */
    public long f7227z;

    /* JADX INFO: renamed from: c.n.b.b.n1.y$a */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    public class a extends Thread {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AudioTrack f7228f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, AudioTrack audioTrack) {
            super(str);
            this.f7228f = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f7228f.flush();
                this.f7228f.release();
            } finally {
                DefaultAudioSink.this.f7209h.open();
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.n1.y$b */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        PlaybackParameters mo3609a(PlaybackParameters playbackParameters);

        /* JADX INFO: renamed from: b */
        long mo3610b(long j2);

        /* JADX INFO: renamed from: c */
        long mo3611c();

        /* JADX INFO: renamed from: d */
        boolean mo3612d(boolean z);

        /* JADX INFO: renamed from: e */
        AudioProcessor[] mo3613e();
    }

    /* JADX INFO: renamed from: c.n.b.b.n1.y$c */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final Format f7230a;

        /* JADX INFO: renamed from: b */
        public final int f7231b;

        /* JADX INFO: renamed from: c */
        public final int f7232c;

        /* JADX INFO: renamed from: d */
        public final int f7233d;

        /* JADX INFO: renamed from: e */
        public final int f7234e;

        /* JADX INFO: renamed from: f */
        public final int f7235f;

        /* JADX INFO: renamed from: g */
        public final int f7236g;

        /* JADX INFO: renamed from: h */
        public final int f7237h;

        /* JADX INFO: renamed from: i */
        public final AudioProcessor[] f7238i;

        public c(Format format, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, AudioProcessor[] audioProcessorArr) {
            int iRound;
            this.f7230a = format;
            this.f7231b = i;
            this.f7232c = i2;
            this.f7233d = i3;
            this.f7234e = i4;
            this.f7235f = i5;
            this.f7236g = i6;
            this.f7238i = audioProcessorArr;
            if (i7 != 0) {
                iRound = i7;
            } else {
                if (i2 == 0) {
                    float f = z ? 8.0f : 1.0f;
                    int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
                    C2096e.m4570f(minBufferSize != -2);
                    long j2 = i4;
                    int iM3121i = Util6.m3121i(minBufferSize * 4, ((int) ((250000 * j2) / 1000000)) * i3, Math.max(minBufferSize, ((int) ((j2 * 750000) / 1000000)) * i3));
                    iRound = f != 1.0f ? Math.round(iM3121i * f) : iM3121i;
                } else if (i2 == 1) {
                    iRound = m3618e(50000000L);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                    iRound = m3618e(250000L);
                }
            }
            this.f7237h = iRound;
        }

        /* JADX INFO: renamed from: d */
        public static AudioAttributes m3614d(AudioAttributes audioAttributes, boolean z) {
            return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : audioAttributes.m3558a();
        }

        /* JADX INFO: renamed from: a */
        public AudioTrack m3615a(boolean z, AudioAttributes audioAttributes, int i) throws AudioSink.b {
            try {
                AudioTrack audioTrackM3616b = m3616b(z, audioAttributes, i);
                int state = audioTrackM3616b.getState();
                if (state == 1) {
                    return audioTrackM3616b;
                }
                try {
                    audioTrackM3616b.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.b(state, this.f7234e, this.f7235f, this.f7237h, this.f7230a, m3619f(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.b(0, this.f7234e, this.f7235f, this.f7237h, this.f7230a, m3619f(), e);
            }
        }

        /* JADX INFO: renamed from: b */
        public final AudioTrack m3616b(boolean z, AudioAttributes audioAttributes, int i) {
            int i2;
            int i3 = Util6.f6307a;
            if (i3 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(m3614d(audioAttributes, z)).setAudioFormat(DefaultAudioSink.m3581f(this.f7234e, this.f7235f, this.f7236g)).setTransferMode(1).setBufferSizeInBytes(this.f7237h).setSessionId(i).setOffloadedPlayback(this.f7232c == 1).build();
            }
            if (i3 >= 21) {
                return new AudioTrack(m3614d(audioAttributes, z), DefaultAudioSink.m3581f(this.f7234e, this.f7235f, this.f7236g), this.f7237h, 1, i);
            }
            int i4 = audioAttributes.f7099d;
            int i5 = Util6.f6307a;
            if (i4 != 13) {
                switch (i4) {
                    case 2:
                        i2 = 0;
                        break;
                    case 3:
                        i2 = 8;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i2 = 5;
                        break;
                    case 6:
                        i2 = 2;
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            } else {
                i2 = 1;
            }
            return i == 0 ? new AudioTrack(i2, this.f7234e, this.f7235f, this.f7236g, this.f7237h, 1) : new AudioTrack(i2, this.f7234e, this.f7235f, this.f7236g, this.f7237h, 1, i);
        }

        /* JADX INFO: renamed from: c */
        public long m3617c(long j2) {
            return (j2 * 1000000) / ((long) this.f7234e);
        }

        /* JADX INFO: renamed from: e */
        public final int m3618e(long j2) {
            int i;
            int i2 = this.f7236g;
            switch (i2) {
                case 5:
                    i = 80000;
                    break;
                case 6:
                case 18:
                    i = 768000;
                    break;
                case 7:
                    i = 192000;
                    break;
                case 8:
                    i = 2250000;
                    break;
                case 9:
                    i = 40000;
                    break;
                case 10:
                    i = 100000;
                    break;
                case 11:
                    i = 16000;
                    break;
                case 12:
                    i = 7000;
                    break;
                case 13:
                default:
                    throw new IllegalArgumentException();
                case 14:
                    i = 3062500;
                    break;
                case 15:
                    i = 8000;
                    break;
                case 16:
                    i = 256000;
                    break;
                case 17:
                    i = 336000;
                    break;
            }
            if (i2 == 5) {
                i *= 2;
            }
            return (int) ((j2 * ((long) i)) / 1000000);
        }

        /* JADX INFO: renamed from: f */
        public boolean m3619f() {
            return this.f7232c == 1;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.n1.y$d */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    public static class d implements b {

        /* JADX INFO: renamed from: a */
        public final AudioProcessor[] f7239a;

        /* JADX INFO: renamed from: b */
        public final SilenceSkippingAudioProcessor f7240b;

        /* JADX INFO: renamed from: c */
        public final SonicAudioProcessor f7241c;

        public d(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new SilenceSkippingAudioProcessor(), new SonicAudioProcessor());
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.DefaultAudioSink.b
        /* JADX INFO: renamed from: a */
        public PlaybackParameters mo3609a(PlaybackParameters playbackParameters) {
            SonicAudioProcessor sonicAudioProcessor = this.f7241c;
            float f = playbackParameters.f6260b;
            if (sonicAudioProcessor.f7053c != f) {
                sonicAudioProcessor.f7053c = f;
                sonicAudioProcessor.f7059i = true;
            }
            float f2 = playbackParameters.f6261c;
            if (sonicAudioProcessor.f7054d != f2) {
                sonicAudioProcessor.f7054d = f2;
                sonicAudioProcessor.f7059i = true;
            }
            return playbackParameters;
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.DefaultAudioSink.b
        /* JADX INFO: renamed from: b */
        public long mo3610b(long j2) {
            SonicAudioProcessor sonicAudioProcessor = this.f7241c;
            if (sonicAudioProcessor.f7065o < 1024) {
                return (long) (((double) sonicAudioProcessor.f7053c) * j2);
            }
            long j3 = sonicAudioProcessor.f7064n;
            Sonic2 sonic2 = sonicAudioProcessor.f7060j;
            Objects.requireNonNull(sonic2);
            long j4 = j3 - ((long) ((sonic2.f7038k * sonic2.f7029b) * 2));
            int i = sonicAudioProcessor.f7058h.f7111b;
            int i2 = sonicAudioProcessor.f7057g.f7111b;
            return i == i2 ? Util6.m3104M(j2, j4, sonicAudioProcessor.f7065o) : Util6.m3104M(j2, j4 * ((long) i), sonicAudioProcessor.f7065o * ((long) i2));
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.DefaultAudioSink.b
        /* JADX INFO: renamed from: c */
        public long mo3611c() {
            return this.f7240b.f7025t;
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.DefaultAudioSink.b
        /* JADX INFO: renamed from: d */
        public boolean mo3612d(boolean z) {
            this.f7240b.f7018m = z;
            return z;
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.DefaultAudioSink.b
        /* JADX INFO: renamed from: e */
        public AudioProcessor[] mo3613e() {
            return this.f7239a;
        }

        public d(AudioProcessor[] audioProcessorArr, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, SonicAudioProcessor sonicAudioProcessor) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f7239a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f7240b = silenceSkippingAudioProcessor;
            this.f7241c = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.n1.y$e */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final PlaybackParameters f7242a;

        /* JADX INFO: renamed from: b */
        public final boolean f7243b;

        /* JADX INFO: renamed from: c */
        public final long f7244c;

        /* JADX INFO: renamed from: d */
        public final long f7245d;

        public e(PlaybackParameters playbackParameters, boolean z, long j2, long j3, a aVar) {
            this.f7242a = playbackParameters;
            this.f7243b = z;
            this.f7244c = j2;
            this.f7245d = j3;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.n1.y$f */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    public static final class f<T extends Exception> {

        /* JADX INFO: renamed from: a */
        public final long f7246a;

        /* JADX INFO: renamed from: b */
        public T f7247b;

        /* JADX INFO: renamed from: c */
        public long f7248c;

        public f(long j2) {
            this.f7246a = j2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        /* JADX INFO: renamed from: a */
        public void m3620a(T t) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f7247b == null) {
                this.f7247b = t;
                this.f7248c = this.f7246a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f7248c) {
                T t2 = this.f7247b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f7247b;
                this.f7247b = null;
                throw t3;
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.n1.y$g */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    public final class g implements AudioTrackPositionTracker.a {
        public g(a aVar) {
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioTrackPositionTracker.a
        /* JADX INFO: renamed from: a */
        public void mo3575a(final long j2) {
            final AudioRendererEventListener2.a aVar;
            Handler handler;
            AudioSink.c cVar = DefaultAudioSink.this.f7217p;
            if (cVar == null || (handler = (aVar = MediaCodecAudioRenderer.this.f6980K0).f7115a) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: c.n.b.b.n1.g
                @Override // java.lang.Runnable
                public final void run() {
                    AudioRendererEventListener2.a aVar2 = aVar;
                    long j3 = j2;
                    AudioRendererEventListener2 audioRendererEventListener2 = aVar2.f7116b;
                    int i = Util6.f6307a;
                    audioRendererEventListener2.mo1137L(j3);
                }
            });
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioTrackPositionTracker.a
        /* JADX INFO: renamed from: b */
        public void mo3576b(final int i, final long j2) {
            if (DefaultAudioSink.this.f7217p != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                final long j3 = jElapsedRealtime - defaultAudioSink.f7199X;
                final AudioRendererEventListener2.a aVar = MediaCodecAudioRenderer.this.f6980K0;
                Handler handler = aVar.f7115a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: c.n.b.b.n1.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioRendererEventListener2.a aVar2 = aVar;
                            int i2 = i;
                            long j4 = j2;
                            long j5 = j3;
                            AudioRendererEventListener2 audioRendererEventListener2 = aVar2.f7116b;
                            int i3 = Util6.f6307a;
                            audioRendererEventListener2.mo1142V(i2, j4, j5);
                        }
                    });
                }
            }
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioTrackPositionTracker.a
        /* JADX INFO: renamed from: c */
        public void mo3577c(long j2) {
            Log.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j2);
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioTrackPositionTracker.a
        /* JADX INFO: renamed from: d */
        public void mo3578d(long j2, long j3, long j4, long j5) {
            StringBuilder sbM1560K = outline.m1560K("Spurious audio timestamp (frame position mismatch): ", j2, ", ");
            sbM1560K.append(j3);
            outline.m1570U(sbM1560K, ", ", j4, ", ");
            sbM1560K.append(j5);
            sbM1560K.append(", ");
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            c cVar = defaultAudioSink.f7219r;
            sbM1560K.append(cVar.f7232c == 0 ? defaultAudioSink.f7227z / ((long) cVar.f7231b) : defaultAudioSink.f7176A);
            sbM1560K.append(", ");
            sbM1560K.append(DefaultAudioSink.this.m3596l());
            Log.w("DefaultAudioSink", sbM1560K.toString());
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioTrackPositionTracker.a
        /* JADX INFO: renamed from: e */
        public void mo3579e(long j2, long j3, long j4, long j5) {
            StringBuilder sbM1560K = outline.m1560K("Spurious audio timestamp (system clock mismatch): ", j2, ", ");
            sbM1560K.append(j3);
            outline.m1570U(sbM1560K, ", ", j4, ", ");
            sbM1560K.append(j5);
            sbM1560K.append(", ");
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            c cVar = defaultAudioSink.f7219r;
            sbM1560K.append(cVar.f7232c == 0 ? defaultAudioSink.f7227z / ((long) cVar.f7231b) : defaultAudioSink.f7176A);
            sbM1560K.append(", ");
            sbM1560K.append(DefaultAudioSink.this.m3596l());
            Log.w("DefaultAudioSink", sbM1560K.toString());
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.n1.y$h */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    public final class h {

        /* JADX INFO: renamed from: a */
        public final Handler f7250a = new Handler();

        /* JADX INFO: renamed from: b */
        public final AudioTrack.StreamEventCallback f7251b;

        /* JADX INFO: renamed from: c.n.b.b.n1.y$h$a */
        /* JADX INFO: compiled from: DefaultAudioSink.java */
        public class a extends AudioTrack.StreamEventCallback {
            public a(DefaultAudioSink defaultAudioSink) {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i) {
                Renderer2.a aVar;
                C2096e.m4570f(audioTrack == DefaultAudioSink.this.f7220s);
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.c cVar = defaultAudioSink.f7217p;
                if (cVar == null || !defaultAudioSink.f7194S || (aVar = MediaCodecAudioRenderer.this.f6989T0) == null) {
                    return;
                }
                aVar.mo3370a();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                Renderer2.a aVar;
                C2096e.m4570f(audioTrack == DefaultAudioSink.this.f7220s);
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.c cVar = defaultAudioSink.f7217p;
                if (cVar == null || !defaultAudioSink.f7194S || (aVar = MediaCodecAudioRenderer.this.f6989T0) == null) {
                    return;
                }
                aVar.mo3370a();
            }
        }

        public h() {
            this.f7251b = new a(DefaultAudioSink.this);
        }
    }

    public DefaultAudioSink(AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr) {
        this(audioCapabilities, audioProcessorArr, false);
    }

    /* JADX INFO: renamed from: f */
    public static AudioFormat m3581f(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX INFO: renamed from: h */
    public static Pair<Integer, Integer> m3582h(Format format, AudioCapabilities audioCapabilities) {
        if (audioCapabilities == null) {
            return null;
        }
        String str = format.f6934q;
        Objects.requireNonNull(str);
        int iM3162d = MimeTypes.m3162d(str, format.f6931n);
        int i = 0;
        int i2 = 6;
        if (!(iM3162d == 5 || iM3162d == 6 || iM3162d == 18 || iM3162d == 17 || iM3162d == 7 || iM3162d == 8 || iM3162d == 14)) {
            return null;
        }
        if (iM3162d == 18 && !audioCapabilities.m3559a(18)) {
            iM3162d = 6;
        } else if (iM3162d == 8 && !audioCapabilities.m3559a(8)) {
            iM3162d = 7;
        }
        if (!audioCapabilities.m3559a(iM3162d)) {
            return null;
        }
        if (iM3162d != 18) {
            i = format.f6915D;
            if (i > audioCapabilities.f7108d) {
                return null;
            }
        } else if (Util6.f6307a >= 29) {
            int i3 = format.f6916E;
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
            for (int i4 = 8; i4 > 0; i4--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(18).setSampleRate(i3).setChannelMask(Util6.m3129q(i4)).build(), audioAttributesBuild)) {
                    i = i4;
                    break;
                }
            }
            if (i == 0) {
                Log.w("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        } else {
            i = 6;
        }
        int i5 = Util6.f6307a;
        if (i5 > 28) {
            i2 = i;
        } else if (i == 7) {
            i2 = 8;
        } else if (i != 3 && i != 4 && i != 5) {
            i2 = i;
        }
        if (i5 <= 26 && "fugu".equals(Util6.f6308b) && i2 == 1) {
            i2 = 2;
        }
        int iM3129q = Util6.m3129q(i2);
        if (iM3129q == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM3162d), Integer.valueOf(iM3129q));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m3583q(AudioTrack audioTrack) {
        return Util6.f6307a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m3584r(Format format, AudioAttributes audioAttributes) {
        int iM3129q;
        int i = Util6.f6307a;
        if (i < 29) {
            return false;
        }
        String str = format.f6934q;
        Objects.requireNonNull(str);
        int iM3162d = MimeTypes.m3162d(str, format.f6931n);
        if (iM3162d == 0 || (iM3129q = Util6.m3129q(format.f6915D)) == 0 || !AudioManager.isOffloadedPlaybackSupported(m3581f(format.f6916E, iM3129q, iM3162d), audioAttributes.m3558a())) {
            return false;
        }
        if (!(format.f6918G == 0 && format.f6919H == 0)) {
            if (!(i >= 30 && Util6.f6310d.startsWith("Pixel"))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m3585A() {
        if (this.f7198W || !"audio/raw".equals(this.f7219r.f7230a.f6934q)) {
            return false;
        }
        return !(this.f7204c && Util6.m3095D(this.f7219r.f7230a.f6917F));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX INFO: renamed from: B */
    public final void m3586B(ByteBuffer byteBuffer, long j2) throws Exception {
        int iWrite;
        AudioRendererEventListener2.a aVar;
        Handler handler;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f7188M;
            if (byteBuffer2 != null) {
                C2096e.m4566b(byteBuffer2 == byteBuffer);
            } else {
                this.f7188M = byteBuffer;
                if (Util6.f6307a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f7189N;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f7189N = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f7189N, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f7190O = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i = Util6.f6307a;
            if (i < 21) {
                AudioTrackPositionTracker audioTrackPositionTracker = this.f7210i;
                int iM3571b = audioTrackPositionTracker.f7143e - ((int) (this.f7177B - (audioTrackPositionTracker.m3571b() * ((long) audioTrackPositionTracker.f7142d))));
                if (iM3571b > 0) {
                    iWrite = this.f7220s.write(this.f7189N, this.f7190O, Math.min(iRemaining2, iM3571b));
                    if (iWrite > 0) {
                        this.f7190O += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else if (this.f7198W) {
                C2096e.m4570f(j2 != -9223372036854775807L);
                AudioTrack audioTrack = this.f7220s;
                if (i >= 26) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j2 * 1000);
                } else {
                    if (this.f7225x == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f7225x = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f7225x.putInt(1431633921);
                    }
                    if (this.f7226y == 0) {
                        this.f7225x.putInt(4, iRemaining2);
                        this.f7225x.putLong(8, j2 * 1000);
                        this.f7225x.position(0);
                        this.f7226y = iRemaining2;
                    }
                    int iRemaining3 = this.f7225x.remaining();
                    if (iRemaining3 <= 0) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.f7226y = 0;
                        } else {
                            this.f7226y -= iWrite;
                        }
                    } else {
                        int iWrite2 = audioTrack.write(this.f7225x, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.f7226y = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.f7226y = 0;
                            } else {
                                this.f7226y -= iWrite;
                            }
                        }
                    }
                }
            } else {
                iWrite = this.f7220s.write(byteBuffer, iRemaining2, 1);
            }
            this.f7199X = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                boolean z = (i >= 24 && iWrite == -6) || iWrite == -32;
                if (z && this.f7219r.m3619f()) {
                    this.f7200Y = true;
                }
                AudioSink.d dVar = new AudioSink.d(iWrite, this.f7219r.f7230a, z);
                AudioSink.c cVar = this.f7217p;
                if (cVar != null && (handler = (aVar = MediaCodecAudioRenderer.this.f6980K0).f7115a) != null) {
                    handler.post(new RunnableC1603c(aVar, dVar));
                }
                if (dVar.f7120f) {
                    throw dVar;
                }
                this.f7216o.m3620a(dVar);
                return;
            }
            this.f7216o.f7247b = null;
            if (m3583q(this.f7220s)) {
                long j3 = this.f7178C;
                if (j3 > 0) {
                    this.f7201Z = false;
                }
                if (this.f7194S && this.f7217p != null && iWrite < iRemaining2 && !this.f7201Z) {
                    AudioTrackPositionTracker audioTrackPositionTracker2 = this.f7210i;
                    long jM3237c = C.m3237c(audioTrackPositionTracker2.m3570a(j3 - audioTrackPositionTracker2.m3571b()));
                    Renderer2.a aVar2 = MediaCodecAudioRenderer.this.f6989T0;
                    if (aVar2 != null) {
                        aVar2.mo3371b(jM3237c);
                    }
                }
            }
            int i2 = this.f7219r.f7232c;
            if (i2 == 0) {
                this.f7177B += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i2 != 0) {
                    C2096e.m4570f(byteBuffer == this.f7186K);
                    this.f7178C += (long) (this.f7179D * this.f7187L);
                }
                this.f7188M = null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3587a(long j2) {
        final AudioRendererEventListener2.a aVar;
        Handler handler;
        PlaybackParameters playbackParametersMo3609a = m3585A() ? this.f7203b.mo3609a(m3592g()) : PlaybackParameters.f6259a;
        final boolean zMo3612d = m3585A() ? this.f7203b.mo3612d(m3595k()) : false;
        this.f7211j.add(new e(playbackParametersMo3609a, zMo3612d, Math.max(0L, j2), this.f7219r.m3617c(m3596l()), null));
        AudioProcessor[] audioProcessorArr = this.f7219r.f7238i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.mo3533a()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.f7184I = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f7185J = new ByteBuffer[size];
        m3591e();
        AudioSink.c cVar = this.f7217p;
        if (cVar == null || (handler = (aVar = MediaCodecAudioRenderer.this.f6980K0).f7115a) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: c.n.b.b.n1.a
            @Override // java.lang.Runnable
            public final void run() {
                AudioRendererEventListener2.a aVar2 = aVar;
                boolean z = zMo3612d;
                AudioRendererEventListener2 audioRendererEventListener2 = aVar2.f7116b;
                int i = Util6.f6307a;
                audioRendererEventListener2.mo1132G(z);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m3588b(Format format, int i, int[] iArr) throws AudioSink.a {
        int iIntValue;
        int iIntValue2;
        AudioProcessor[] audioProcessorArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM3137y;
        int[] iArr2;
        int i6 = 1;
        if ("audio/raw".equals(format.f6934q)) {
            C2096e.m4566b(Util6.m3096E(format.f6917F));
            int iM3137y2 = Util6.m3137y(format.f6917F, format.f6915D);
            AudioProcessor[] audioProcessorArr2 = ((this.f7204c && Util6.m3095D(format.f6917F)) ? 1 : 0) != 0 ? this.f7208g : this.f7207f;
            TrimmingAudioProcessor trimmingAudioProcessor = this.f7206e;
            int i7 = format.f6918G;
            int i8 = format.f6919H;
            trimmingAudioProcessor.f7071i = i7;
            trimmingAudioProcessor.f7072j = i8;
            if (Util6.f6307a < 21 && format.f6915D == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i9 = 0; i9 < 6; i9++) {
                    iArr2[i9] = i9;
                }
            } else {
                iArr2 = iArr;
            }
            this.f7205d.f7174i = iArr2;
            AudioProcessor.a aVar = new AudioProcessor.a(format.f6916E, format.f6915D, format.f6917F);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.a aVarMo3547d = audioProcessor.mo3547d(aVar);
                    if (audioProcessor.mo3533a()) {
                        aVar = aVarMo3547d;
                    }
                } catch (AudioProcessor.b e2) {
                    throw new AudioSink.a(e2, format);
                }
            }
            int i10 = aVar.f7113d;
            i5 = aVar.f7111b;
            iIntValue2 = Util6.m3129q(aVar.f7112c);
            audioProcessorArr = audioProcessorArr2;
            i3 = i10;
            iM3137y = Util6.m3137y(i10, aVar.f7112c);
            i4 = iM3137y2;
            i2 = 0;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            int i11 = format.f6916E;
            if (this.f7213l && m3584r(format, this.f7221t)) {
                String str = format.f6934q;
                Objects.requireNonNull(str);
                iIntValue = MimeTypes.m3162d(str, format.f6931n);
                iIntValue2 = Util6.m3129q(format.f6915D);
            } else {
                Pair<Integer, Integer> pairM3582h = m3582h(format, this.f7202a);
                if (pairM3582h == null) {
                    throw new AudioSink.a("Unable to configure passthrough for: " + format, format);
                }
                iIntValue = ((Integer) pairM3582h.first).intValue();
                iIntValue2 = ((Integer) pairM3582h.second).intValue();
                i6 = 2;
            }
            audioProcessorArr = audioProcessorArr3;
            i2 = i6;
            i3 = iIntValue;
            i4 = -1;
            i5 = i11;
            iM3137y = -1;
        }
        if (i3 == 0) {
            throw new AudioSink.a("Invalid output encoding (mode=" + i2 + ") for: " + format, format);
        }
        if (iIntValue2 == 0) {
            throw new AudioSink.a("Invalid output channel config (mode=" + i2 + ") for: " + format, format);
        }
        this.f7200Y = false;
        c cVar = new c(format, i4, i2, iM3137y, i5, iIntValue2, i3, i, this.f7212k, audioProcessorArr);
        if (m3600p()) {
            this.f7218q = cVar;
        } else {
            this.f7219r = cVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public final boolean m3589c() throws p007c.p190n.p194b.p209b.p215n1.AudioSink.d {
        /*
            r9 = this;
            int r0 = r9.f7191P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.f7191P = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.f7191P
            c.n.b.b.n1.p[] r5 = r9.f7184I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.mo3548e()
        L1f:
            r9.m3603u(r7)
            boolean r0 = r4.mo3549g()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.f7191P
            int r0 = r0 + r2
            r9.f7191P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f7188M
            if (r0 == 0) goto L3b
            r9.m3586B(r0, r7)
            java.nio.ByteBuffer r0 = r9.f7188M
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.f7191P = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p209b.p215n1.DefaultAudioSink.m3589c():boolean");
    }

    /* JADX INFO: renamed from: d */
    public void m3590d() {
        if (m3600p()) {
            m3605w();
            AudioTrack audioTrack = this.f7210i.f7141c;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.f7220s.pause();
            }
            if (m3583q(this.f7220s)) {
                h hVar = this.f7214m;
                Objects.requireNonNull(hVar);
                this.f7220s.unregisterStreamEventCallback(hVar.f7251b);
                hVar.f7250a.removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.f7220s;
            this.f7220s = null;
            if (Util6.f6307a < 21 && !this.f7195T) {
                this.f7196U = 0;
            }
            c cVar = this.f7218q;
            if (cVar != null) {
                this.f7219r = cVar;
                this.f7218q = null;
            }
            this.f7210i.m3573d();
            this.f7209h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack2).start();
        }
        this.f7216o.f7247b = null;
        this.f7215n.f7247b = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m3591e() {
        int i = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.f7184I;
            if (i >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i];
            audioProcessor.flush();
            this.f7185J[i] = audioProcessor.mo3546b();
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final PlaybackParameters m3592g() {
        return m3594j().f7242a;
    }

    /* JADX INFO: renamed from: i */
    public int m3593i(Format format) {
        if (!"audio/raw".equals(format.f6934q)) {
            if (this.f7213l && !this.f7200Y && m3584r(format, this.f7221t)) {
                return 2;
            }
            return m3582h(format, this.f7202a) != null ? 2 : 0;
        }
        if (Util6.m3096E(format.f6917F)) {
            int i = format.f6917F;
            return (i == 2 || (this.f7204c && i == 4)) ? 2 : 1;
        }
        StringBuilder sbM1556G = outline.m1556G("Invalid PCM encoding: ");
        sbM1556G.append(format.f6917F);
        Log.w("DefaultAudioSink", sbM1556G.toString());
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final e m3594j() {
        e eVar = this.f7222u;
        if (eVar != null) {
            return eVar;
        }
        return !this.f7211j.isEmpty() ? this.f7211j.getLast() : this.f7223v;
    }

    /* JADX INFO: renamed from: k */
    public boolean m3595k() {
        return m3594j().f7243b;
    }

    /* JADX INFO: renamed from: l */
    public final long m3596l() {
        c cVar = this.f7219r;
        return cVar.f7232c == 0 ? this.f7177B / ((long) cVar.f7233d) : this.f7178C;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00e9  */
    /* JADX INFO: renamed from: m */
    public boolean m3597m(ByteBuffer byteBuffer, long j2, int i) throws Exception {
        boolean z;
        boolean z2;
        int iM3531d;
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4;
        ByteBuffer byteBuffer2 = this.f7186K;
        C2096e.m4566b(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f7218q != null) {
            if (!m3589c()) {
                return false;
            }
            c cVar = this.f7218q;
            c cVar2 = this.f7219r;
            Objects.requireNonNull(cVar);
            if (cVar2.f7232c == cVar.f7232c && cVar2.f7236g == cVar.f7236g && cVar2.f7234e == cVar.f7234e && cVar2.f7235f == cVar.f7235f && cVar2.f7233d == cVar.f7233d) {
                this.f7219r = this.f7218q;
                this.f7218q = null;
                if (m3583q(this.f7220s)) {
                    this.f7220s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f7220s;
                    Format format = this.f7219r.f7230a;
                    audioTrack.setOffloadDelayPadding(format.f6918G, format.f6919H);
                    this.f7201Z = true;
                }
            } else {
                m3602t();
                if (m3598n()) {
                    return false;
                }
                m3590d();
            }
            m3587a(j2);
        }
        if (!m3600p()) {
            try {
                m3599o();
            } catch (AudioSink.b e2) {
                if (e2.f7118f) {
                    throw e2;
                }
                this.f7215n.m3620a(e2);
                return false;
            }
        }
        this.f7215n.f7247b = null;
        if (this.f7181F) {
            this.f7182G = Math.max(0L, j2);
            this.f7180E = false;
            this.f7181F = false;
            if (this.f7212k && Util6.f6307a >= 23) {
                m3607y(this.f7224w);
            }
            m3587a(j2);
            if (this.f7194S) {
                m3601s();
            }
        }
        AudioTrackPositionTracker audioTrackPositionTracker = this.f7210i;
        long jM3596l = m3596l();
        AudioTrack audioTrack2 = audioTrackPositionTracker.f7141c;
        Objects.requireNonNull(audioTrack2);
        int playState = audioTrack2.getPlayState();
        if (audioTrackPositionTracker.f7146h) {
            if (playState == 2) {
                audioTrackPositionTracker.f7154p = false;
            } else if (playState != 1 || audioTrackPositionTracker.m3571b() != 0) {
                z = audioTrackPositionTracker.f7154p;
                boolean zM3572c = audioTrackPositionTracker.m3572c(jM3596l);
                audioTrackPositionTracker.f7154p = zM3572c;
                if (z) {
                    audioTrackPositionTracker.f7139a.mo3576b(audioTrackPositionTracker.f7143e, C.m3237c(audioTrackPositionTracker.f7147i));
                }
                z2 = true;
            }
            z2 = false;
        } else {
            z = audioTrackPositionTracker.f7154p;
            boolean zM3572c2 = audioTrackPositionTracker.m3572c(jM3596l);
            audioTrackPositionTracker.f7154p = zM3572c2;
            if (z && !zM3572c2 && playState != 1) {
                audioTrackPositionTracker.f7139a.mo3576b(audioTrackPositionTracker.f7143e, C.m3237c(audioTrackPositionTracker.f7147i));
            }
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        if (this.f7186K == null) {
            C2096e.m4566b(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar3 = this.f7219r;
            if (cVar3.f7232c != 0 && this.f7179D == 0) {
                int i5 = cVar3.f7236g;
                switch (i5) {
                    case 5:
                    case 6:
                    case 18:
                        iM3531d = !(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) ? 1536 : Ac3Util.f7086a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                        break;
                    case 7:
                    case 8:
                        int iPosition = byteBuffer.position();
                        byte b4 = byteBuffer.get(iPosition);
                        if (b4 != -2) {
                            if (b4 == -1) {
                                i2 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                b3 = byteBuffer.get(iPosition + 7);
                            } else if (b4 != 31) {
                                i2 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                b2 = byteBuffer.get(iPosition + 5);
                            } else {
                                i2 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                b3 = byteBuffer.get(iPosition + 6);
                            }
                            i3 = b3 & 60;
                            iM3531d = (((i3 >> 2) | i2) + 1) * 32;
                        } else {
                            i2 = (byteBuffer.get(iPosition + 5) & 1) << 6;
                            b2 = byteBuffer.get(iPosition + 4);
                        }
                        i3 = b2 & 252;
                        iM3531d = (((i3 >> 2) | i2) + 1) * 32;
                        break;
                    case 9:
                        int iPosition2 = byteBuffer.position();
                        int i6 = Util6.f6307a;
                        int iReverseBytes = byteBuffer.getInt(iPosition2);
                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                            iReverseBytes = Integer.reverseBytes(iReverseBytes);
                        }
                        iM3531d = MpegAudioUtil.m3531d(iReverseBytes);
                        if (iM3531d == -1) {
                            throw new IllegalArgumentException();
                        }
                        break;
                    case 10:
                    case 16:
                        iM3531d = 1024;
                        break;
                    case 11:
                    case 12:
                        iM3531d = 2048;
                        break;
                    case 13:
                    default:
                        throw new IllegalStateException(outline.m1590l("Unexpected audio encoding: ", i5));
                    case 14:
                        int iPosition3 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i7 = iPosition3;
                        while (true) {
                            if (i7 <= iLimit) {
                                int i8 = Util6.f6307a;
                                int iReverseBytes2 = byteBuffer.getInt(i7 + 4);
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                }
                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                    i4 = i7 - iPosition3;
                                } else {
                                    i7++;
                                }
                            } else {
                                i4 = -1;
                            }
                        }
                        if (i4 != -1) {
                            iM3531d = (40 << ((byteBuffer.get((byteBuffer.position() + i4) + ((byteBuffer.get((byteBuffer.position() + i4) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        } else {
                            iM3531d = 0;
                        }
                        break;
                    case 15:
                        iM3531d = 512;
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int iPosition4 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition4);
                        iM3531d = Ac4Util.m3557b(new ParsableBitArray(bArr)).f7095c;
                        break;
                }
                this.f7179D = iM3531d;
                if (iM3531d == 0) {
                    return true;
                }
            }
            if (this.f7222u != null) {
                if (!m3589c()) {
                    return false;
                }
                m3587a(j2);
                this.f7222u = null;
            }
            long j3 = this.f7182G;
            c cVar4 = this.f7219r;
            long j4 = ((((cVar4.f7232c == 0 ? this.f7227z / ((long) cVar4.f7231b) : this.f7176A) - this.f7206e.f7077o) * 1000000) / ((long) cVar4.f7230a.f6916E)) + j3;
            if (!this.f7180E && Math.abs(j4 - j2) > 200000) {
                StringBuilder sbM1560K = outline.m1560K("Discontinuity detected [expected ", j4, ", got ");
                sbM1560K.append(j2);
                sbM1560K.append("]");
                Log.e("DefaultAudioSink", sbM1560K.toString());
                this.f7180E = true;
            }
            if (this.f7180E) {
                if (!m3589c()) {
                    return false;
                }
                long j5 = j2 - j4;
                this.f7182G += j5;
                this.f7180E = false;
                m3587a(j2);
                AudioSink.c cVar5 = this.f7217p;
                if (cVar5 != null && j5 != 0) {
                    MediaCodecAudioRenderer.this.f6987R0 = true;
                }
            }
            if (this.f7219r.f7232c == 0) {
                this.f7227z += (long) byteBuffer.remaining();
            } else {
                this.f7176A += (long) (this.f7179D * i);
            }
            this.f7186K = byteBuffer;
            this.f7187L = i;
        }
        m3603u(j2);
        if (!this.f7186K.hasRemaining()) {
            this.f7186K = null;
            this.f7187L = 0;
            return true;
        }
        AudioTrackPositionTracker audioTrackPositionTracker2 = this.f7210i;
        if (!(audioTrackPositionTracker2.f7163y != -9223372036854775807L && m3596l() > 0 && SystemClock.elapsedRealtime() - audioTrackPositionTracker2.f7163y >= 200)) {
            return false;
        }
        Log.w("DefaultAudioSink", "Resetting stalled audio track");
        m3590d();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m3598n() {
        return m3600p() && this.f7210i.m3572c(m3596l());
    }

    /* JADX INFO: renamed from: o */
    public final void m3599o() throws AudioSink.b {
        AudioRendererEventListener2.a aVar;
        Handler handler;
        this.f7209h.block();
        try {
            c cVar = this.f7219r;
            Objects.requireNonNull(cVar);
            AudioTrack audioTrackM3615a = cVar.m3615a(this.f7198W, this.f7221t, this.f7196U);
            this.f7220s = audioTrackM3615a;
            if (m3583q(audioTrackM3615a)) {
                AudioTrack audioTrack = this.f7220s;
                if (this.f7214m == null) {
                    this.f7214m = new h();
                }
                h hVar = this.f7214m;
                final Handler handler2 = hVar.f7250a;
                Objects.requireNonNull(handler2);
                audioTrack.registerStreamEventCallback(new Executor() { // from class: c.n.b.b.n1.j
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler2.post(runnable);
                    }
                }, hVar.f7251b);
                AudioTrack audioTrack2 = this.f7220s;
                Format format = this.f7219r.f7230a;
                audioTrack2.setOffloadDelayPadding(format.f6918G, format.f6919H);
            }
            this.f7196U = this.f7220s.getAudioSessionId();
            AudioTrackPositionTracker audioTrackPositionTracker = this.f7210i;
            AudioTrack audioTrack3 = this.f7220s;
            c cVar2 = this.f7219r;
            audioTrackPositionTracker.m3574e(audioTrack3, cVar2.f7232c == 2, cVar2.f7236g, cVar2.f7233d, cVar2.f7237h);
            m3608z();
            int i = this.f7197V.f7165a;
            if (i != 0) {
                this.f7220s.attachAuxEffect(i);
                this.f7220s.setAuxEffectSendLevel(this.f7197V.f7166b);
            }
            this.f7181F = true;
        } catch (AudioSink.b e2) {
            if (this.f7219r.m3619f()) {
                this.f7200Y = true;
            }
            AudioSink.c cVar3 = this.f7217p;
            if (cVar3 != null && (handler = (aVar = MediaCodecAudioRenderer.this.f6980K0).f7115a) != null) {
                handler.post(new RunnableC1603c(aVar, e2));
            }
            throw e2;
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m3600p() {
        return this.f7220s != null;
    }

    /* JADX INFO: renamed from: s */
    public void m3601s() {
        this.f7194S = true;
        if (m3600p()) {
            AudioTimestampPoller audioTimestampPoller = this.f7210i.f7144f;
            Objects.requireNonNull(audioTimestampPoller);
            audioTimestampPoller.m3568a();
            this.f7220s.play();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m3602t() {
        if (this.f7193R) {
            return;
        }
        this.f7193R = true;
        AudioTrackPositionTracker audioTrackPositionTracker = this.f7210i;
        long jM3596l = m3596l();
        audioTrackPositionTracker.f7164z = audioTrackPositionTracker.m3571b();
        audioTrackPositionTracker.f7162x = SystemClock.elapsedRealtime() * 1000;
        audioTrackPositionTracker.f7133A = jM3596l;
        this.f7220s.stop();
        this.f7226y = 0;
    }

    /* JADX INFO: renamed from: u */
    public final void m3603u(long j2) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.f7184I.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f7185J[i - 1];
            } else {
                byteBuffer = this.f7186K;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f7109a;
                }
            }
            if (i == length) {
                m3586B(byteBuffer, j2);
            } else {
                AudioProcessor audioProcessor = this.f7184I[i];
                if (i > this.f7191P) {
                    audioProcessor.mo3522c(byteBuffer);
                }
                ByteBuffer byteBufferMo3546b = audioProcessor.mo3546b();
                this.f7185J[i] = byteBufferMo3546b;
                if (byteBufferMo3546b.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m3604v() {
        m3590d();
        for (AudioProcessor audioProcessor : this.f7207f) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.f7208g) {
            audioProcessor2.reset();
        }
        this.f7194S = false;
        this.f7200Y = false;
    }

    /* JADX INFO: renamed from: w */
    public final void m3605w() {
        this.f7227z = 0L;
        this.f7176A = 0L;
        this.f7177B = 0L;
        this.f7178C = 0L;
        this.f7201Z = false;
        this.f7179D = 0;
        this.f7223v = new e(m3592g(), m3595k(), 0L, 0L, null);
        this.f7182G = 0L;
        this.f7222u = null;
        this.f7211j.clear();
        this.f7186K = null;
        this.f7187L = 0;
        this.f7188M = null;
        this.f7193R = false;
        this.f7192Q = false;
        this.f7191P = -1;
        this.f7225x = null;
        this.f7226y = 0;
        this.f7206e.f7077o = 0L;
        m3591e();
    }

    /* JADX INFO: renamed from: x */
    public final void m3606x(PlaybackParameters playbackParameters, boolean z) {
        e eVarM3594j = m3594j();
        if (playbackParameters.equals(eVarM3594j.f7242a) && z == eVarM3594j.f7243b) {
            return;
        }
        e eVar = new e(playbackParameters, z, -9223372036854775807L, -9223372036854775807L, null);
        if (m3600p()) {
            this.f7222u = eVar;
        } else {
            this.f7223v = eVar;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3607y(PlaybackParameters playbackParameters) {
        if (m3600p()) {
            try {
                this.f7220s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(playbackParameters.f6260b).setPitch(playbackParameters.f6261c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                p007c.p190n.p194b.p209b.p212b2.Log.m3156d("DefaultAudioSink", "Failed to set playback params", e2);
            }
            playbackParameters = new PlaybackParameters(this.f7220s.getPlaybackParams().getSpeed(), this.f7220s.getPlaybackParams().getPitch());
            AudioTrackPositionTracker audioTrackPositionTracker = this.f7210i;
            audioTrackPositionTracker.f7148j = playbackParameters.f6260b;
            AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.f7144f;
            if (audioTimestampPoller != null) {
                audioTimestampPoller.m3568a();
            }
        }
        this.f7224w = playbackParameters;
    }

    /* JADX INFO: renamed from: z */
    public final void m3608z() {
        if (m3600p()) {
            if (Util6.f6307a >= 21) {
                this.f7220s.setVolume(this.f7183H);
                return;
            }
            AudioTrack audioTrack = this.f7220s;
            float f2 = this.f7183H;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    public DefaultAudioSink(AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr, boolean z) {
        this(audioCapabilities, new d(audioProcessorArr), z, false, false);
    }

    public DefaultAudioSink(AudioCapabilities audioCapabilities, b bVar, boolean z, boolean z2, boolean z3) {
        this.f7202a = audioCapabilities;
        Objects.requireNonNull(bVar);
        this.f7203b = bVar;
        int i = Util6.f6307a;
        this.f7204c = i >= 21 && z;
        this.f7212k = i >= 23 && z2;
        this.f7213l = i >= 29 && z3;
        this.f7209h = new ConditionVariable(true);
        this.f7210i = new AudioTrackPositionTracker(new g(null));
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.f7205d = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        this.f7206e = trimmingAudioProcessor;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ResamplingAudioProcessor(), channelMappingAudioProcessor, trimmingAudioProcessor);
        Collections.addAll(arrayList, bVar.mo3613e());
        this.f7207f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f7208g = new AudioProcessor[]{new FloatResamplingAudioProcessor()};
        this.f7183H = 1.0f;
        this.f7221t = AudioAttributes.f7096a;
        this.f7196U = 0;
        this.f7197V = new AuxEffectInfo(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.f6259a;
        this.f7223v = new e(playbackParameters, false, 0L, 0L, null);
        this.f7224w = playbackParameters;
        this.f7191P = -1;
        this.f7184I = new AudioProcessor[0];
        this.f7185J = new ByteBuffer[0];
        this.f7211j = new ArrayDeque<>();
        this.f7215n = new f<>(100L);
        this.f7216o = new f<>(100L);
    }
}
