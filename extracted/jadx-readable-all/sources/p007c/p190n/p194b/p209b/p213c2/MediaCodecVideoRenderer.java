package p007c.p190n.p194b.p209b.p213c2;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.ExoPlaybackException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.FormatHolder;
import p007c.p190n.p194b.p209b.RendererConfiguration;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderCounters;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p217p1.DecoderReuseEvaluation;
import p007c.p190n.p194b.p209b.p233t1.C1827c;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecDecoderException;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecInfo;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecSelector;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil;
import p007c.p190n.p194b.p209b.p243w1.SampleStream;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.c2.q, reason: use source file name */
/* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer {

    /* JADX INFO: renamed from: J0 */
    public static final int[] f6471J0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: K0 */
    public static boolean f6472K0;

    /* JADX INFO: renamed from: L0 */
    public static boolean f6473L0;

    /* JADX INFO: renamed from: M0 */
    public final Context f6474M0;

    /* JADX INFO: renamed from: N0 */
    public final VideoFrameReleaseHelper f6475N0;

    /* JADX INFO: renamed from: O0 */
    public final VideoRendererEventListener2.a f6476O0;

    /* JADX INFO: renamed from: P0 */
    public final long f6477P0;

    /* JADX INFO: renamed from: Q0 */
    public final int f6478Q0;

    /* JADX INFO: renamed from: R0 */
    public final boolean f6479R0;

    /* JADX INFO: renamed from: S0 */
    public a f6480S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f6481T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f6482U0;

    /* JADX INFO: renamed from: V0 */
    public Surface f6483V0;

    /* JADX INFO: renamed from: W0 */
    public Surface f6484W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f6485X0;

    /* JADX INFO: renamed from: Y0 */
    public int f6486Y0;

    /* JADX INFO: renamed from: Z0 */
    public boolean f6487Z0;

    /* JADX INFO: renamed from: a1 */
    public boolean f6488a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f6489b1;

    /* JADX INFO: renamed from: c1 */
    public long f6490c1;

    /* JADX INFO: renamed from: d1 */
    public long f6491d1;

    /* JADX INFO: renamed from: e1 */
    public long f6492e1;

    /* JADX INFO: renamed from: f1 */
    public int f6493f1;

    /* JADX INFO: renamed from: g1 */
    public int f6494g1;

    /* JADX INFO: renamed from: h1 */
    public int f6495h1;

    /* JADX INFO: renamed from: i1 */
    public long f6496i1;

    /* JADX INFO: renamed from: j1 */
    public long f6497j1;

    /* JADX INFO: renamed from: k1 */
    public long f6498k1;

    /* JADX INFO: renamed from: l1 */
    public int f6499l1;

    /* JADX INFO: renamed from: m1 */
    public int f6500m1;

    /* JADX INFO: renamed from: n1 */
    public int f6501n1;

    /* JADX INFO: renamed from: o1 */
    public int f6502o1;

    /* JADX INFO: renamed from: p1 */
    public float f6503p1;

    /* JADX INFO: renamed from: q1 */
    public int f6504q1;

    /* JADX INFO: renamed from: r1 */
    public int f6505r1;

    /* JADX INFO: renamed from: s1 */
    public int f6506s1;

    /* JADX INFO: renamed from: t1 */
    public float f6507t1;

    /* JADX INFO: renamed from: u1 */
    public boolean f6508u1;

    /* JADX INFO: renamed from: v1 */
    public int f6509v1;

    /* JADX INFO: renamed from: w1 */
    public b f6510w1;

    /* JADX INFO: renamed from: x1 */
    public VideoFrameMetadataListener f6511x1;

    /* JADX INFO: renamed from: c.n.b.b.c2.q$a */
    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f6512a;

        /* JADX INFO: renamed from: b */
        public final int f6513b;

        /* JADX INFO: renamed from: c */
        public final int f6514c;

        public a(int i, int i2, int i3) {
            this.f6512a = i;
            this.f6513b = i2;
            this.f6514c = i3;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.c2.q$b */
    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public final class b implements MediaCodecAdapter.b, Handler.Callback {

        /* JADX INFO: renamed from: f */
        public final Handler f6515f;

        public b(MediaCodecAdapter mediaCodecAdapter) {
            Handler handlerM3125m = Util6.m3125m(this);
            this.f6515f = handlerM3125m;
            mediaCodecAdapter.mo3942h(this, handlerM3125m);
        }

        /* JADX INFO: renamed from: a */
        public final void m3309a(long j2) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.f6510w1) {
                return;
            }
            if (j2 == Long.MAX_VALUE) {
                mediaCodecVideoRenderer.f8567D0 = true;
                return;
            }
            try {
                mediaCodecVideoRenderer.m3285P0(j2);
            } catch (ExoPlaybackException e) {
                MediaCodecVideoRenderer.this.f8569E0 = e;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3310b(MediaCodecAdapter mediaCodecAdapter, long j2, long j3) {
            if (Util6.f6307a >= 30) {
                m3309a(j2);
            } else {
                this.f6515f.sendMessageAtFrontOfQueue(Message.obtain(this.f6515f, 0, (int) (j2 >> 32), (int) j2));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m3309a((Util6.m3112U(message.arg1) << 32) | Util6.m3112U(message.arg2));
            return true;
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:610:0x0829  */
    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: F0 */
    public static boolean m3269F0() {
        /*
            Method dump skipped, instruction units count: 3046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p209b.p213c2.MediaCodecVideoRenderer.m3269F0():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: G0 */
    public static int m3270G0(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        int iM3119g;
        if (i != -1 && i2 != -1) {
            str.hashCode();
            int i3 = 4;
            switch (str) {
                case "video/dolby-vision":
                case "video/avc":
                    String str2 = Util6.f6310d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Util6.f6309c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !mediaCodecInfo.f8557f)))) {
                        iM3119g = Util6.m3119g(i2, 16) * Util6.m3119g(i, 16) * 16 * 16;
                        i3 = 2;
                        return (iM3119g * 3) / (i3 * 2);
                    }
                    break;
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    iM3119g = i * i2;
                    i3 = 2;
                    return (iM3119g * 3) / (i3 * 2);
                case "video/hevc":
                case "video/x-vnd.on2.vp9":
                    iM3119g = i * i2;
                    return (iM3119g * 3) / (i3 * 2);
                default:
                    return -1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: H0 */
    public static List<MediaCodecInfo> m3271H0(MediaCodecSelector mediaCodecSelector, Format format, boolean z, boolean z2) throws MediaCodecUtil.c {
        Pair<Integer, Integer> pairM3986c;
        String str = format.f6934q;
        if (str == null) {
            return Collections.emptyList();
        }
        List<MediaCodecInfo> listMo3932a = mediaCodecSelector.mo3932a(str, z, z2);
        Pattern pattern = MediaCodecUtil.f8634a;
        ArrayList arrayList = new ArrayList(listMo3932a);
        MediaCodecUtil.m3993j(arrayList, new C1827c(format));
        if ("video/dolby-vision".equals(str) && (pairM3986c = MediaCodecUtil.m3986c(format)) != null) {
            int iIntValue = ((Integer) pairM3986c.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                arrayList.addAll(mediaCodecSelector.mo3932a("video/hevc", z, z2));
            } else if (iIntValue == 512) {
                arrayList.addAll(mediaCodecSelector.mo3932a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: I0 */
    public static int m3272I0(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.f6935r == -1) {
            return m3270G0(mediaCodecInfo, format.f6934q, format.f6939v, format.f6940w);
        }
        int size = format.f6936s.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += format.f6936s.get(i).length;
        }
        return format.f6935r + length;
    }

    /* JADX INFO: renamed from: J0 */
    public static boolean m3273J0(long j2) {
        return j2 < -30000;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: B */
    public void mo3030B() {
        final VideoRendererEventListener2.a aVar;
        final DecoderCounters decoderCounters;
        m3275D0();
        m3274C0();
        this.f6485X0 = false;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f6475N0;
        if (videoFrameReleaseHelper.f6518b != null) {
            VideoFrameReleaseHelper.a aVar2 = videoFrameReleaseHelper.f6520d;
            if (aVar2 != null) {
                aVar2.f6534a.unregisterDisplayListener(aVar2);
            }
            VideoFrameReleaseHelper.b bVar = videoFrameReleaseHelper.f6519c;
            Objects.requireNonNull(bVar);
            bVar.f6538h.sendEmptyMessage(2);
        }
        this.f6510w1 = null;
        try {
            super.mo3030B();
            aVar = this.f6476O0;
            decoderCounters = this.f8571F0;
            Objects.requireNonNull(aVar);
            synchronized (decoderCounters) {
            }
        } finally {
            aVar = this.f6476O0;
            decoderCounters = this.f8571F0;
            Objects.requireNonNull(aVar);
            synchronized (decoderCounters) {
                Handler handler = aVar.f6542a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: c.n.b.b.c2.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoRendererEventListener2.a aVar3 = aVar;
                            DecoderCounters decoderCounters2 = decoderCounters;
                            Objects.requireNonNull(aVar3);
                            synchronized (decoderCounters2) {
                            }
                            VideoRendererEventListener2 videoRendererEventListener2 = aVar3.f6543b;
                            int i = Util6.f6307a;
                            videoRendererEventListener2.mo1140R(decoderCounters2);
                        }
                    });
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: C */
    public void mo3031C(boolean z, boolean z2) throws ExoPlaybackException {
        super.mo3031C(z, z2);
        RendererConfiguration rendererConfiguration = this.f6250h;
        Objects.requireNonNull(rendererConfiguration);
        boolean z3 = rendererConfiguration.f6665b;
        C2096e.m4570f((z3 && this.f6509v1 == 0) ? false : true);
        if (this.f6508u1 != z3) {
            this.f6508u1 = z3;
            m3977n0();
        }
        final VideoRendererEventListener2.a aVar = this.f6476O0;
        final DecoderCounters decoderCounters = this.f8571F0;
        Handler handler = aVar.f6542a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: c.n.b.b.c2.c
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRendererEventListener2.a aVar2 = aVar;
                    DecoderCounters decoderCounters2 = decoderCounters;
                    VideoRendererEventListener2 videoRendererEventListener2 = aVar2.f6543b;
                    int i = Util6.f6307a;
                    videoRendererEventListener2.mo1135J(decoderCounters2);
                }
            });
        }
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f6475N0;
        if (videoFrameReleaseHelper.f6518b != null) {
            VideoFrameReleaseHelper.b bVar = videoFrameReleaseHelper.f6519c;
            Objects.requireNonNull(bVar);
            bVar.f6538h.sendEmptyMessage(1);
            VideoFrameReleaseHelper.a aVar2 = videoFrameReleaseHelper.f6520d;
            if (aVar2 != null) {
                aVar2.f6534a.registerDisplayListener(aVar2, Util6.m3124l());
            }
            videoFrameReleaseHelper.m3315d();
        }
        this.f6488a1 = z2;
        this.f6489b1 = false;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m3274C0() {
        MediaCodecAdapter mediaCodecAdapter;
        this.f6487Z0 = false;
        if (Util6.f6307a < 23 || !this.f6508u1 || (mediaCodecAdapter = this.f8583O) == null) {
            return;
        }
        this.f6510w1 = new b(mediaCodecAdapter);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: D */
    public void mo3032D(long j2, boolean z) throws ExoPlaybackException {
        super.mo3032D(j2, z);
        m3274C0();
        this.f6475N0.m3314b();
        this.f6496i1 = -9223372036854775807L;
        this.f6490c1 = -9223372036854775807L;
        this.f6494g1 = 0;
        if (z) {
            m3288S0();
        } else {
            this.f6491d1 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m3275D0() {
        this.f6504q1 = -1;
        this.f6505r1 = -1;
        this.f6507t1 = -1.0f;
        this.f6506s1 = -1;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: E */
    public void mo3033E() {
        Surface surface;
        try {
            super.mo3033E();
            surface = this.f6484W0;
            if (surface != null) {
                if (this.f6483V0 == surface) {
                    this.f6483V0 = null;
                }
            }
        } finally {
            if (this.f6484W0 != null) {
                Surface surface2 = this.f6483V0;
                surface = this.f6484W0;
                if (surface2 == surface) {
                    this.f6483V0 = null;
                }
                surface.release();
                this.f6484W0 = null;
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m3276E0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            if (!f6472K0) {
                f6473L0 = m3269F0();
                f6472K0 = true;
            }
        }
        return f6473L0;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: F */
    public void mo3034F() {
        this.f6493f1 = 0;
        this.f6492e1 = SystemClock.elapsedRealtime();
        this.f6497j1 = SystemClock.elapsedRealtime() * 1000;
        this.f6498k1 = 0L;
        this.f6499l1 = 0;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f6475N0;
        videoFrameReleaseHelper.f6521e = true;
        videoFrameReleaseHelper.m3314b();
        videoFrameReleaseHelper.m3317f(false);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: G */
    public void mo3035G() {
        this.f6491d1 = -9223372036854775807L;
        m3278K0();
        final int i = this.f6499l1;
        if (i != 0) {
            final VideoRendererEventListener2.a aVar = this.f6476O0;
            final long j2 = this.f6498k1;
            Handler handler = aVar.f6542a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.n.b.b.c2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener2.a aVar2 = aVar;
                        long j3 = j2;
                        int i2 = i;
                        VideoRendererEventListener2 videoRendererEventListener2 = aVar2.f6543b;
                        int i3 = Util6.f6307a;
                        videoRendererEventListener2.mo1143X(j3, i2);
                    }
                });
            }
            this.f6498k1 = 0L;
            this.f6499l1 = 0;
        }
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f6475N0;
        videoFrameReleaseHelper.f6521e = false;
        videoFrameReleaseHelper.m3313a();
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: K */
    public DecoderReuseEvaluation mo3277K(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation decoderReuseEvaluationM3953c = mediaCodecInfo.m3953c(format, format2);
        int i = decoderReuseEvaluationM3953c.f7297e;
        int i2 = format2.f6939v;
        a aVar = this.f6480S0;
        if (i2 > aVar.f6512a || format2.f6940w > aVar.f6513b) {
            i |= 256;
        }
        if (m3272I0(mediaCodecInfo, format2) > this.f6480S0.f6514c) {
            i |= 64;
        }
        int i3 = i;
        return new DecoderReuseEvaluation(mediaCodecInfo.f8552a, format, format2, i3 != 0 ? 0 : decoderReuseEvaluationM3953c.f7296d, i3);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m3278K0() {
        if (this.f6493f1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            final long j2 = jElapsedRealtime - this.f6492e1;
            final VideoRendererEventListener2.a aVar = this.f6476O0;
            final int i = this.f6493f1;
            Handler handler = aVar.f6542a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.n.b.b.c2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener2.a aVar2 = aVar;
                        int i2 = i;
                        long j3 = j2;
                        VideoRendererEventListener2 videoRendererEventListener2 = aVar2.f6543b;
                        int i3 = Util6.f6307a;
                        videoRendererEventListener2.mo1156x(i2, j3);
                    }
                });
            }
            this.f6493f1 = 0;
            this.f6492e1 = jElapsedRealtime;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x014c  */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x014c, please report this as an issue */
    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: L */
    public void mo3279L(MediaCodecInfo mediaCodecInfo, MediaCodecAdapter mediaCodecAdapter, Format format, MediaCrypto mediaCrypto, float f) {
        String str;
        a aVar;
        Point point;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z;
        Pair<Integer, Integer> pairM3986c;
        int iM3270G0;
        String str2 = mediaCodecInfo.f8554c;
        Format[] formatArr = this.f6254l;
        Objects.requireNonNull(formatArr);
        int iMax = format.f6939v;
        int iMax2 = format.f6940w;
        int iM3272I0 = m3272I0(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            if (iM3272I0 != -1 && (iM3270G0 = m3270G0(mediaCodecInfo, format.f6934q, format.f6939v, format.f6940w)) != -1) {
                iM3272I0 = Math.min((int) (iM3272I0 * 1.5f), iM3270G0);
            }
            aVar = new a(iMax, iMax2, iM3272I0);
            str = str2;
        } else {
            int length = formatArr.length;
            int i = 0;
            boolean z2 = false;
            while (i < length) {
                Format formatM3519a = formatArr[i];
                if (format.f6914C != null && formatM3519a.f6914C == null) {
                    Format.b bVarM3515a = formatM3519a.m3515a();
                    bVarM3515a.f6970w = format.f6914C;
                    formatM3519a = bVarM3515a.m3519a();
                }
                if (mediaCodecInfo.m3953c(format, formatM3519a).f7296d != 0) {
                    int i2 = formatM3519a.f6939v;
                    z2 |= i2 == -1 || formatM3519a.f6940w == -1;
                    int iMax3 = Math.max(iMax, i2);
                    int iMax4 = Math.max(iMax2, formatM3519a.f6940w);
                    iM3272I0 = Math.max(iM3272I0, m3272I0(mediaCodecInfo, formatM3519a));
                    iMax2 = iMax4;
                    iMax = iMax3;
                }
                i++;
                formatArr = formatArr;
            }
            if (z2) {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i3 = format.f6940w;
                int i4 = format.f6939v;
                boolean z3 = i3 > i4;
                int i5 = z3 ? i3 : i4;
                if (z3) {
                    i3 = i4;
                }
                float f2 = i3 / i5;
                int[] iArr = f6471J0;
                int length2 = iArr.length;
                int i6 = 0;
                while (true) {
                    Point pointM3950a = null;
                    if (i6 < length2) {
                        int i7 = length2;
                        int i8 = iArr[i6];
                        int[] iArr2 = iArr;
                        int i9 = (int) (i8 * f2);
                        if (i8 > i5 && i9 > i3) {
                            int i10 = i3;
                            float f3 = f2;
                            if (Util6.f6307a >= 21) {
                                int i11 = z3 ? i9 : i8;
                                if (!z3) {
                                    i8 = i9;
                                }
                                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = mediaCodecInfo.f8555d;
                                if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                                    pointM3950a = MediaCodecInfo.m3950a(videoCapabilities, i11, i8);
                                }
                                point = pointM3950a;
                                str = str2;
                                if (!mediaCodecInfo.m3957g(point.x, point.y, format.f6941x)) {
                                    i6++;
                                    length2 = i7;
                                    iArr = iArr2;
                                    i3 = i10;
                                    f2 = f3;
                                    str2 = str;
                                }
                            } else {
                                str = str2;
                                try {
                                    int iM3119g = Util6.m3119g(i8, 16) * 16;
                                    int iM3119g2 = Util6.m3119g(i9, 16) * 16;
                                    if (iM3119g * iM3119g2 <= MediaCodecUtil.m3992i()) {
                                        int i12 = z3 ? iM3119g2 : iM3119g;
                                        if (!z3) {
                                            iM3119g = iM3119g2;
                                        }
                                        point = new Point(i12, iM3119g);
                                    } else {
                                        i6++;
                                        length2 = i7;
                                        iArr = iArr2;
                                        i3 = i10;
                                        f2 = f3;
                                        str2 = str;
                                    }
                                } catch (MediaCodecUtil.c unused) {
                                    point = null;
                                }
                            }
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            iM3272I0 = Math.max(iM3272I0, m3270G0(mediaCodecInfo, format.f6934q, iMax, iMax2));
                            Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    str = str2;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        iM3272I0 = Math.max(iM3272I0, m3270G0(mediaCodecInfo, format.f6934q, iMax, iMax2));
                        Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                str = str2;
            }
            aVar = new a(iMax, iMax2, iM3272I0);
        }
        this.f6480S0 = aVar;
        boolean z4 = this.f6479R0;
        int i13 = this.f6508u1 ? this.f6509v1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.f6939v);
        mediaFormat.setInteger("height", format.f6940w);
        C1095a.m2379F(mediaFormat, format.f6936s);
        float f4 = format.f6941x;
        if (f4 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f4);
        }
        C1095a.m2404t(mediaFormat, "rotation-degrees", format.f6942y);
        ColorInfo colorInfo = format.f6914C;
        if (colorInfo != null) {
            C1095a.m2404t(mediaFormat, "color-transfer", colorInfo.f6442h);
            C1095a.m2404t(mediaFormat, "color-standard", colorInfo.f6440f);
            C1095a.m2404t(mediaFormat, "color-range", colorInfo.f6441g);
            byte[] bArr = colorInfo.f6443i;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(format.f6934q) && (pairM3986c = MediaCodecUtil.m3986c(format)) != null) {
            C1095a.m2404t(mediaFormat, "profile", ((Integer) pairM3986c.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f6512a);
        mediaFormat.setInteger("max-height", aVar.f6513b);
        C1095a.m2404t(mediaFormat, "max-input-size", aVar.f6514c);
        int i14 = Util6.f6307a;
        if (i14 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z4) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i13 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i13);
        }
        if (this.f6483V0 == null) {
            if (!m3289T0(mediaCodecInfo)) {
                throw new IllegalStateException();
            }
            if (this.f6484W0 == null) {
                this.f6484W0 = DummySurface.m3261c(this.f6474M0, mediaCodecInfo.f8557f);
            }
            this.f6483V0 = this.f6484W0;
        }
        mediaCodecAdapter.mo3935a(mediaFormat, this.f6483V0, mediaCrypto, 0);
        if (i14 < 23 || !this.f6508u1) {
            return;
        }
        this.f6510w1 = new b(mediaCodecAdapter);
    }

    /* JADX INFO: renamed from: L0 */
    public void m3280L0() {
        this.f6489b1 = true;
        if (this.f6487Z0) {
            return;
        }
        this.f6487Z0 = true;
        VideoRendererEventListener2.a aVar = this.f6476O0;
        Surface surface = this.f6483V0;
        Handler handler = aVar.f6542a;
        if (handler != null) {
            handler.post(new RunnableC1496d(aVar, surface));
        }
        this.f6485X0 = true;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: M */
    public MediaCodecDecoderException mo3281M(Throwable th, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecVideoDecoderException(th, mediaCodecInfo, this.f6483V0);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m3282M0() {
        int i = this.f6500m1;
        if (i == -1 && this.f6501n1 == -1) {
            return;
        }
        if (this.f6504q1 == i && this.f6505r1 == this.f6501n1 && this.f6506s1 == this.f6502o1 && this.f6507t1 == this.f6503p1) {
            return;
        }
        this.f6476O0.m3327a(i, this.f6501n1, this.f6502o1, this.f6503p1);
        this.f6504q1 = this.f6500m1;
        this.f6505r1 = this.f6501n1;
        this.f6506s1 = this.f6502o1;
        this.f6507t1 = this.f6503p1;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m3283N0() {
        int i = this.f6504q1;
        if (i == -1 && this.f6505r1 == -1) {
            return;
        }
        this.f6476O0.m3327a(i, this.f6505r1, this.f6506s1, this.f6507t1);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m3284O0(long j2, long j3, Format format) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.f6511x1;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.m3311a(j2, j3, format, this.f8585Q);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m3285P0(long j2) throws ExoPlaybackException {
        m3961B0(j2);
        m3282M0();
        this.f8571F0.f7279e++;
        m3280L0();
        super.mo3302h0(j2);
        if (this.f6508u1) {
            return;
        }
        this.f6495h1--;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m3286Q0(MediaCodecAdapter mediaCodecAdapter, int i) {
        m3282M0();
        C2096e.m4565a("releaseOutputBuffer");
        mediaCodecAdapter.mo3943i(i, true);
        C2096e.m4574j();
        this.f6497j1 = SystemClock.elapsedRealtime() * 1000;
        this.f8571F0.f7279e++;
        this.f6494g1 = 0;
        m3280L0();
    }

    /* JADX INFO: renamed from: R0 */
    public void m3287R0(MediaCodecAdapter mediaCodecAdapter, int i, long j2) {
        m3282M0();
        C2096e.m4565a("releaseOutputBuffer");
        mediaCodecAdapter.mo3939e(i, j2);
        C2096e.m4574j();
        this.f6497j1 = SystemClock.elapsedRealtime() * 1000;
        this.f8571F0.f7279e++;
        this.f6494g1 = 0;
        m3280L0();
    }

    /* JADX INFO: renamed from: S0 */
    public final void m3288S0() {
        this.f6491d1 = this.f6477P0 > 0 ? SystemClock.elapsedRealtime() + this.f6477P0 : -9223372036854775807L;
    }

    /* JADX INFO: renamed from: T0 */
    public final boolean m3289T0(MediaCodecInfo mediaCodecInfo) {
        return Util6.f6307a >= 23 && !this.f6508u1 && !m3276E0(mediaCodecInfo.f8552a) && (!mediaCodecInfo.f8557f || DummySurface.m3260b(this.f6474M0));
    }

    /* JADX INFO: renamed from: U0 */
    public void m3290U0(MediaCodecAdapter mediaCodecAdapter, int i) {
        C2096e.m4565a("skipVideoBuffer");
        mediaCodecAdapter.mo3943i(i, false);
        C2096e.m4574j();
        this.f8571F0.f7280f++;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: V */
    public boolean mo3291V() {
        return this.f6508u1 && Util6.f6307a < 23;
    }

    /* JADX INFO: renamed from: V0 */
    public void m3292V0(int i) {
        DecoderCounters decoderCounters = this.f8571F0;
        decoderCounters.f7281g += i;
        this.f6493f1 += i;
        int i2 = this.f6494g1 + i;
        this.f6494g1 = i2;
        decoderCounters.f7282h = Math.max(i2, decoderCounters.f7282h);
        int i3 = this.f6478Q0;
        if (i3 <= 0 || this.f6493f1 < i3) {
            return;
        }
        m3278K0();
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: W */
    public float mo3293W(float f, Format format, Format[] formatArr) {
        float fMax = -1.0f;
        for (Format format2 : formatArr) {
            float f2 = format2.f6941x;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    /* JADX INFO: renamed from: W0 */
    public void m3294W0(long j2) {
        DecoderCounters decoderCounters = this.f8571F0;
        decoderCounters.f7284j += j2;
        decoderCounters.f7285k++;
        this.f6498k1 += j2;
        this.f6499l1++;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: X */
    public List<MediaCodecInfo> mo3295X(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws MediaCodecUtil.c {
        return m3271H0(mediaCodecSelector, format, z, this.f6508u1);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    @TargetApi(29)
    /* JADX INFO: renamed from: Z */
    public void mo3296Z(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f6482U0) {
            ByteBuffer byteBuffer = decoderInputBuffer.f7290k;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    MediaCodecAdapter mediaCodecAdapter = this.f8583O;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    mediaCodecAdapter.mo3938d(bundle);
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: c */
    public boolean mo3297c() {
        Surface surface;
        if (super.mo3297c() && (this.f6487Z0 || (((surface = this.f6484W0) != null && this.f6483V0 == surface) || this.f8583O == null || this.f6508u1))) {
            this.f6491d1 = -9223372036854775807L;
            return true;
        }
        if (this.f6491d1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f6491d1) {
            return true;
        }
        this.f6491d1 = -9223372036854775807L;
        return false;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: d0 */
    public void mo3298d0(final String str, final long j2, final long j3) {
        final VideoRendererEventListener2.a aVar = this.f6476O0;
        Handler handler = aVar.f6542a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: c.n.b.b.c2.f
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRendererEventListener2.a aVar2 = aVar;
                    String str2 = str;
                    long j4 = j2;
                    long j5 = j3;
                    VideoRendererEventListener2 videoRendererEventListener2 = aVar2.f6543b;
                    int i = Util6.f6307a;
                    videoRendererEventListener2.mo1151i(str2, j4, j5);
                }
            });
        }
        this.f6481T0 = m3276E0(str);
        MediaCodecInfo mediaCodecInfo = this.f8590V;
        Objects.requireNonNull(mediaCodecInfo);
        boolean z = false;
        if (Util6.f6307a >= 29 && "video/x-vnd.on2.vp9".equals(mediaCodecInfo.f8553b)) {
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.m3954d()) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.f6482U0 = z;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: e0 */
    public void mo3299e0(final String str) {
        final VideoRendererEventListener2.a aVar = this.f6476O0;
        Handler handler = aVar.f6542a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: c.n.b.b.c2.b
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRendererEventListener2.a aVar2 = aVar;
                    String str2 = str;
                    VideoRendererEventListener2 videoRendererEventListener2 = aVar2.f6543b;
                    int i = Util6.f6307a;
                    videoRendererEventListener2.mo1149f(str2);
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: f0 */
    public DecoderReuseEvaluation mo3300f0(FormatHolder formatHolder) throws ExoPlaybackException {
        final DecoderReuseEvaluation decoderReuseEvaluationMo3300f0 = super.mo3300f0(formatHolder);
        final VideoRendererEventListener2.a aVar = this.f6476O0;
        final Format format = formatHolder.f7259b;
        Handler handler = aVar.f6542a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: c.n.b.b.c2.g
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRendererEventListener2.a aVar2 = aVar;
                    Format format2 = format;
                    DecoderReuseEvaluation decoderReuseEvaluation = decoderReuseEvaluationMo3300f0;
                    VideoRendererEventListener2 videoRendererEventListener2 = aVar2.f6543b;
                    int i = Util6.f6307a;
                    videoRendererEventListener2.mo1136K(format2, decoderReuseEvaluation);
                }
            });
        }
        return decoderReuseEvaluationMo3300f0;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: g0 */
    public void mo3301g0(Format format, MediaFormat mediaFormat) {
        MediaCodecAdapter mediaCodecAdapter = this.f8583O;
        if (mediaCodecAdapter != null) {
            mediaCodecAdapter.mo3944j(this.f6486Y0);
        }
        if (this.f6508u1) {
            this.f6500m1 = format.f6939v;
            this.f6501n1 = format.f6940w;
        } else {
            Objects.requireNonNull(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f6500m1 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f6501n1 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f = format.f6943z;
        this.f6503p1 = f;
        if (Util6.f6307a >= 21) {
            int i = format.f6942y;
            if (i == 90 || i == 270) {
                int i2 = this.f6500m1;
                this.f6500m1 = this.f6501n1;
                this.f6501n1 = i2;
                this.f6503p1 = 1.0f / f;
            }
        } else {
            this.f6502o1 = format.f6942y;
        }
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f6475N0;
        videoFrameReleaseHelper.f6523g = format.f6941x;
        FixedFrameRateEstimator fixedFrameRateEstimator = videoFrameReleaseHelper.f6517a;
        fixedFrameRateEstimator.f6455a.m3267c();
        fixedFrameRateEstimator.f6456b.m3267c();
        fixedFrameRateEstimator.f6457c = false;
        fixedFrameRateEstimator.f6458d = -9223372036854775807L;
        fixedFrameRateEstimator.f6459e = 0;
        videoFrameReleaseHelper.m3316e();
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2, p007c.p190n.p194b.p209b.RendererCapabilities
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: h0 */
    public void mo3302h0(long j2) {
        super.mo3302h0(j2);
        if (this.f6508u1) {
            return;
        }
        this.f6495h1--;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: i0 */
    public void mo3303i0() {
        m3274C0();
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: j0 */
    public void mo3304j0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z = this.f6508u1;
        if (!z) {
            this.f6495h1++;
        }
        if (Util6.f6307a >= 23 || !z) {
            return;
        }
        m3285P0(decoderInputBuffer.f7289j);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: l0 */
    public boolean mo3305l0(long j2, long j3, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j4, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        boolean z3;
        long j5;
        boolean z4;
        boolean z5;
        long j6;
        long j7;
        Objects.requireNonNull(mediaCodecAdapter);
        if (this.f6490c1 == -9223372036854775807L) {
            this.f6490c1 = j2;
        }
        if (j4 != this.f6496i1) {
            VideoFrameReleaseHelper videoFrameReleaseHelper = this.f6475N0;
            long j8 = videoFrameReleaseHelper.f6530n;
            if (j8 != -1) {
                videoFrameReleaseHelper.f6532p = j8;
                videoFrameReleaseHelper.f6533q = videoFrameReleaseHelper.f6531o;
            }
            videoFrameReleaseHelper.f6529m++;
            FixedFrameRateEstimator fixedFrameRateEstimator = videoFrameReleaseHelper.f6517a;
            long j9 = j4 * 1000;
            fixedFrameRateEstimator.f6455a.m3266b(j9);
            if (fixedFrameRateEstimator.f6455a.m3265a()) {
                fixedFrameRateEstimator.f6457c = false;
            } else if (fixedFrameRateEstimator.f6458d != -9223372036854775807L) {
                if (fixedFrameRateEstimator.f6457c) {
                    FixedFrameRateEstimator.a aVar = fixedFrameRateEstimator.f6456b;
                    long j10 = aVar.f6463d;
                    if (j10 == 0 ? false : aVar.f6466g[(int) ((j10 - 1) % 15)]) {
                        fixedFrameRateEstimator.f6456b.m3267c();
                        fixedFrameRateEstimator.f6456b.m3266b(fixedFrameRateEstimator.f6458d);
                    }
                } else {
                    fixedFrameRateEstimator.f6456b.m3267c();
                    fixedFrameRateEstimator.f6456b.m3266b(fixedFrameRateEstimator.f6458d);
                }
                fixedFrameRateEstimator.f6457c = true;
                fixedFrameRateEstimator.f6456b.m3266b(j9);
            }
            if (fixedFrameRateEstimator.f6457c && fixedFrameRateEstimator.f6456b.m3265a()) {
                FixedFrameRateEstimator.a aVar2 = fixedFrameRateEstimator.f6455a;
                fixedFrameRateEstimator.f6455a = fixedFrameRateEstimator.f6456b;
                fixedFrameRateEstimator.f6456b = aVar2;
                fixedFrameRateEstimator.f6457c = false;
            }
            fixedFrameRateEstimator.f6458d = j9;
            fixedFrameRateEstimator.f6459e = fixedFrameRateEstimator.f6455a.m3265a() ? 0 : fixedFrameRateEstimator.f6459e + 1;
            videoFrameReleaseHelper.m3316e();
            this.f6496i1 = j4;
        }
        long j11 = this.f8575H0;
        long j12 = j4 - j11;
        if (z && !z2) {
            m3290U0(mediaCodecAdapter, i);
            return true;
        }
        double d = this.f8581M;
        boolean z6 = this.f6252j == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j13 = (long) ((j4 - j2) / d);
        if (z6) {
            j13 -= jElapsedRealtime - j3;
        }
        if (this.f6483V0 == this.f6484W0) {
            if (!m3273J0(j13)) {
                return false;
            }
            m3290U0(mediaCodecAdapter, i);
            m3294W0(j13);
            return true;
        }
        long j14 = jElapsedRealtime - this.f6497j1;
        boolean z7 = this.f6489b1 ? !this.f6487Z0 : z6 || this.f6488a1;
        if (this.f6491d1 != -9223372036854775807L || j2 < j11) {
            z3 = false;
        } else {
            if (!z7) {
                if (z6) {
                    if (m3273J0(j13) && j14 > 100000) {
                    }
                }
                z3 = false;
            }
            z3 = true;
        }
        if (z3) {
            long jNanoTime = System.nanoTime();
            m3284O0(j12, jNanoTime, format);
            if (Util6.f6307a >= 21) {
                m3287R0(mediaCodecAdapter, i, jNanoTime);
            } else {
                m3286Q0(mediaCodecAdapter, i);
            }
            m3294W0(j13);
            return true;
        }
        if (!z6 || j2 == this.f6490c1) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long j15 = (j13 * 1000) + jNanoTime2;
        VideoFrameReleaseHelper videoFrameReleaseHelper2 = this.f6475N0;
        if (videoFrameReleaseHelper2.f6532p == -1 || !videoFrameReleaseHelper2.f6517a.m3264a()) {
            j5 = j12;
        } else {
            FixedFrameRateEstimator fixedFrameRateEstimator2 = videoFrameReleaseHelper2.f6517a;
            if (fixedFrameRateEstimator2.m3264a()) {
                FixedFrameRateEstimator.a aVar3 = fixedFrameRateEstimator2.f6455a;
                long j16 = aVar3.f6464e;
                if (j16 == 0) {
                    j7 = 0;
                    j5 = j12;
                } else {
                    j5 = j12;
                    j7 = aVar3.f6465f / j16;
                }
            } else {
                j5 = j12;
                j7 = -9223372036854775807L;
            }
            long j17 = videoFrameReleaseHelper2.f6533q + ((long) (((videoFrameReleaseHelper2.f6529m - videoFrameReleaseHelper2.f6532p) * j7) / videoFrameReleaseHelper2.f6526j));
            if (Math.abs(j15 - j17) <= 20000000) {
                j15 = j17;
            } else {
                videoFrameReleaseHelper2.m3314b();
            }
        }
        videoFrameReleaseHelper2.f6530n = videoFrameReleaseHelper2.f6529m;
        videoFrameReleaseHelper2.f6531o = j15;
        VideoFrameReleaseHelper.b bVar = videoFrameReleaseHelper2.f6519c;
        if (bVar != null && videoFrameReleaseHelper2.f6527k != -9223372036854775807L) {
            long j18 = bVar.f6537g;
            if (j18 != -9223372036854775807L) {
                long j19 = videoFrameReleaseHelper2.f6527k;
                long j20 = (((j15 - j18) / j19) * j19) + j18;
                if (j15 <= j20) {
                    j6 = j20 - j19;
                } else {
                    j6 = j20;
                    j20 = j19 + j20;
                }
                if (j20 - j15 >= j15 - j6) {
                    j20 = j6;
                }
                j15 = j20 - videoFrameReleaseHelper2.f6528l;
            }
        }
        long j21 = (j15 - jNanoTime2) / 1000;
        boolean z8 = this.f6491d1 != -9223372036854775807L;
        if (((j21 > (-500000L) ? 1 : (j21 == (-500000L) ? 0 : -1)) < 0) && !z2) {
            SampleStream sampleStream = this.f6253k;
            Objects.requireNonNull(sampleStream);
            int iMo4131o = sampleStream.mo4131o(j2 - this.f6255m);
            if (iMo4131o == 0) {
                z5 = false;
            } else {
                DecoderCounters decoderCounters = this.f8571F0;
                decoderCounters.f7283i++;
                int i4 = this.f6495h1 + iMo4131o;
                if (z8) {
                    decoderCounters.f7280f += i4;
                } else {
                    m3292V0(i4);
                }
                if (m3969T()) {
                    m3973b0();
                }
                z5 = true;
            }
            if (z5) {
                return false;
            }
        }
        if (m3273J0(j21) && !z2) {
            if (z8) {
                m3290U0(mediaCodecAdapter, i);
                z4 = true;
            } else {
                C2096e.m4565a("dropVideoBuffer");
                mediaCodecAdapter.mo3943i(i, false);
                C2096e.m4574j();
                z4 = true;
                m3292V0(1);
            }
            m3294W0(j21);
            return z4;
        }
        if (Util6.f6307a >= 21) {
            if (j21 >= 50000) {
                return false;
            }
            m3284O0(j5, j15, format);
            m3287R0(mediaCodecAdapter, i, j15);
            m3294W0(j21);
            return true;
        }
        if (j21 >= 30000) {
            return false;
        }
        if (j21 > 11000) {
            try {
                Thread.sleep((j21 - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        m3284O0(j5, j15, format);
        m3286Q0(mediaCodecAdapter, i);
        m3294W0(j21);
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer, p007c.p190n.p194b.p209b.BaseRenderer, p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: m */
    public void mo3045m(float f, float f2) throws ExoPlaybackException {
        super.mo3045m(f, f2);
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f6475N0;
        videoFrameReleaseHelper.f6526j = f;
        videoFrameReleaseHelper.m3314b();
        videoFrameReleaseHelper.m3317f(false);
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer, p007c.p190n.p194b.p209b.PlayerMessage.b
    /* JADX INFO: renamed from: p */
    public void mo3047p(int i, Object obj) throws ExoPlaybackException {
        int iIntValue;
        if (i != 1) {
            if (i == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.f6486Y0 = iIntValue2;
                MediaCodecAdapter mediaCodecAdapter = this.f8583O;
                if (mediaCodecAdapter != null) {
                    mediaCodecAdapter.mo3944j(iIntValue2);
                    return;
                }
                return;
            }
            if (i == 6) {
                this.f6511x1 = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i == 102 && this.f6509v1 != (iIntValue = ((Integer) obj).intValue())) {
                this.f6509v1 = iIntValue;
                if (this.f6508u1) {
                    m3977n0();
                    return;
                }
                return;
            }
            return;
        }
        Surface surfaceM3261c = (Surface) obj;
        if (surfaceM3261c == null) {
            Surface surface = this.f6484W0;
            if (surface != null) {
                surfaceM3261c = surface;
            } else {
                MediaCodecInfo mediaCodecInfo = this.f8590V;
                if (mediaCodecInfo != null && m3289T0(mediaCodecInfo)) {
                    surfaceM3261c = DummySurface.m3261c(this.f6474M0, mediaCodecInfo.f8557f);
                    this.f6484W0 = surfaceM3261c;
                }
            }
        }
        if (this.f6483V0 == surfaceM3261c) {
            if (surfaceM3261c == null || surfaceM3261c == this.f6484W0) {
                return;
            }
            m3283N0();
            if (this.f6485X0) {
                VideoRendererEventListener2.a aVar = this.f6476O0;
                Surface surface2 = this.f6483V0;
                Handler handler = aVar.f6542a;
                if (handler != null) {
                    handler.post(new RunnableC1496d(aVar, surface2));
                    return;
                }
                return;
            }
            return;
        }
        this.f6483V0 = surfaceM3261c;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f6475N0;
        Objects.requireNonNull(videoFrameReleaseHelper);
        Surface surface3 = surfaceM3261c instanceof DummySurface ? null : surfaceM3261c;
        if (videoFrameReleaseHelper.f6522f != surface3) {
            videoFrameReleaseHelper.m3313a();
            videoFrameReleaseHelper.f6522f = surface3;
            videoFrameReleaseHelper.m3317f(true);
        }
        this.f6485X0 = false;
        int i2 = this.f6252j;
        MediaCodecAdapter mediaCodecAdapter2 = this.f8583O;
        if (mediaCodecAdapter2 != null) {
            if (Util6.f6307a < 23 || surfaceM3261c == null || this.f6481T0) {
                m3977n0();
                m3973b0();
            } else {
                mediaCodecAdapter2.mo3946l(surfaceM3261c);
            }
        }
        if (surfaceM3261c == null || surfaceM3261c == this.f6484W0) {
            m3275D0();
            m3274C0();
            return;
        }
        m3283N0();
        m3274C0();
        if (i2 == 2) {
            m3288S0();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: p0 */
    public void mo3306p0() {
        super.mo3306p0();
        this.f6495h1 = 0;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: v0 */
    public boolean mo3307v0(MediaCodecInfo mediaCodecInfo) {
        return this.f6483V0 != null || m3289T0(mediaCodecInfo);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecRenderer
    /* JADX INFO: renamed from: x0 */
    public int mo3308x0(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.c {
        int i = 0;
        if (!MimeTypes.m3171m(format.f6934q)) {
            return 0;
        }
        boolean z = format.f6937t != null;
        List<MediaCodecInfo> listM3271H0 = m3271H0(mediaCodecSelector, format, z, false);
        if (z && listM3271H0.isEmpty()) {
            listM3271H0 = m3271H0(mediaCodecSelector, format, false, false);
        }
        if (listM3271H0.isEmpty()) {
            return 1;
        }
        if (!MediaCodecRenderer.m3959y0(format)) {
            return 2;
        }
        MediaCodecInfo mediaCodecInfo = listM3271H0.get(0);
        boolean zM3955e = mediaCodecInfo.m3955e(format);
        int i2 = mediaCodecInfo.m3956f(format) ? 16 : 8;
        if (zM3955e) {
            List<MediaCodecInfo> listM3271H1 = m3271H0(mediaCodecSelector, format, z, true);
            if (!listM3271H1.isEmpty()) {
                MediaCodecInfo mediaCodecInfo2 = listM3271H1.get(0);
                if (mediaCodecInfo2.m3955e(format) && mediaCodecInfo2.m3956f(format)) {
                    i = 32;
                }
            }
        }
        return (zM3955e ? 4 : 3) | i2 | i;
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j2) {
        this(context, mediaCodecSelector, j2, null, null, -1);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j2, Handler handler, VideoRendererEventListener2 videoRendererEventListener2, int i) {
        this(context, MediaCodecAdapter.a.f8551a, mediaCodecSelector, j2, false, handler, videoRendererEventListener2, i);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j2, boolean z, Handler handler, VideoRendererEventListener2 videoRendererEventListener2, int i) {
        this(context, MediaCodecAdapter.a.f8551a, mediaCodecSelector, j2, z, handler, videoRendererEventListener2, i);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.a aVar, MediaCodecSelector mediaCodecSelector, long j2, boolean z, Handler handler, VideoRendererEventListener2 videoRendererEventListener2, int i) {
        super(2, aVar, mediaCodecSelector, z, 30.0f);
        this.f6477P0 = j2;
        this.f6478Q0 = i;
        Context applicationContext = context.getApplicationContext();
        this.f6474M0 = applicationContext;
        this.f6475N0 = new VideoFrameReleaseHelper(applicationContext);
        this.f6476O0 = new VideoRendererEventListener2.a(handler, videoRendererEventListener2);
        this.f6479R0 = "NVIDIA".equals(Util6.f6309c);
        this.f6491d1 = -9223372036854775807L;
        this.f6500m1 = -1;
        this.f6501n1 = -1;
        this.f6503p1 = -1.0f;
        this.f6486Y0 = 1;
        this.f6509v1 = 0;
        m3275D0();
    }
}
