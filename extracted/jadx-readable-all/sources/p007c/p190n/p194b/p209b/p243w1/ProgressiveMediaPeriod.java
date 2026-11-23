package p007c.p190n.p194b.p209b.p243w1;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.FormatHolder;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.SeekParameters;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.DefaultLoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.Loader;
import p007c.p190n.p194b.p209b.p210a2.StatsDataSource;
import p007c.p190n.p194b.p209b.p212b2.ConditionVariable;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.p238l.IcyHeaders;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.i0, reason: use source file name */
/* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.b<a>, Loader.f, SampleQueue.b {

    /* JADX INFO: renamed from: f */
    public static final Map<String, String> f8886f;

    /* JADX INFO: renamed from: g */
    public static final Format f8887g;

    /* JADX INFO: renamed from: B */
    public boolean f8889B;

    /* JADX INFO: renamed from: C */
    public boolean f8890C;

    /* JADX INFO: renamed from: D */
    public boolean f8891D;

    /* JADX INFO: renamed from: E */
    public e f8892E;

    /* JADX INFO: renamed from: F */
    public SeekMap f8893F;

    /* JADX INFO: renamed from: H */
    public boolean f8895H;

    /* JADX INFO: renamed from: J */
    public boolean f8897J;

    /* JADX INFO: renamed from: K */
    public boolean f8898K;

    /* JADX INFO: renamed from: L */
    public int f8899L;

    /* JADX INFO: renamed from: N */
    public long f8901N;

    /* JADX INFO: renamed from: P */
    public boolean f8903P;

    /* JADX INFO: renamed from: Q */
    public int f8904Q;

    /* JADX INFO: renamed from: R */
    public boolean f8905R;

    /* JADX INFO: renamed from: S */
    public boolean f8906S;

    /* JADX INFO: renamed from: h */
    public final Uri f8907h;

    /* JADX INFO: renamed from: i */
    public final DataSource3 f8908i;

    /* JADX INFO: renamed from: j */
    public final DrmSessionManager2 f8909j;

    /* JADX INFO: renamed from: k */
    public final LoadErrorHandlingPolicy f8910k;

    /* JADX INFO: renamed from: l */
    public final MediaSourceEventListener.a f8911l;

    /* JADX INFO: renamed from: m */
    public final DrmSessionEventListener2.a f8912m;

    /* JADX INFO: renamed from: n */
    public final b f8913n;

    /* JADX INFO: renamed from: o */
    public final Allocator f8914o;

    /* JADX INFO: renamed from: p */
    public final String f8915p;

    /* JADX INFO: renamed from: q */
    public final long f8916q;

    /* JADX INFO: renamed from: s */
    public final ProgressiveMediaExtractor f8918s;

    /* JADX INFO: renamed from: x */
    public MediaPeriod.a f8923x;

    /* JADX INFO: renamed from: y */
    public IcyHeaders f8924y;

    /* JADX INFO: renamed from: r */
    public final Loader f8917r = new Loader("Loader:ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: t */
    public final ConditionVariable f8919t = new ConditionVariable();

    /* JADX INFO: renamed from: u */
    public final Runnable f8920u = new Runnable() { // from class: c.n.b.b.w1.h
        @Override // java.lang.Runnable
        public final void run() {
            this.f8883f.m4126z();
        }
    };

    /* JADX INFO: renamed from: v */
    public final Runnable f8921v = new Runnable() { // from class: c.n.b.b.w1.j
        @Override // java.lang.Runnable
        public final void run() {
            ProgressiveMediaPeriod progressiveMediaPeriod = this.f8949f;
            if (progressiveMediaPeriod.f8906S) {
                return;
            }
            MediaPeriod.a aVar = progressiveMediaPeriod.f8923x;
            Objects.requireNonNull(aVar);
            aVar.mo3428i(progressiveMediaPeriod);
        }
    };

    /* JADX INFO: renamed from: w */
    public final Handler f8922w = Util6.m3124l();

    /* JADX INFO: renamed from: A */
    public d[] f8888A = new d[0];

    /* JADX INFO: renamed from: z */
    public SampleQueue[] f8925z = new SampleQueue[0];

    /* JADX INFO: renamed from: O */
    public long f8902O = -9223372036854775807L;

    /* JADX INFO: renamed from: M */
    public long f8900M = -1;

    /* JADX INFO: renamed from: G */
    public long f8894G = -9223372036854775807L;

    /* JADX INFO: renamed from: I */
    public int f8896I = 1;

    /* JADX INFO: renamed from: c.n.b.b.w1.i0$a */
    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class a implements Loader.e, IcyDataSource.a {

        /* JADX INFO: renamed from: b */
        public final Uri f8927b;

        /* JADX INFO: renamed from: c */
        public final StatsDataSource f8928c;

        /* JADX INFO: renamed from: d */
        public final ProgressiveMediaExtractor f8929d;

        /* JADX INFO: renamed from: e */
        public final ExtractorOutput f8930e;

        /* JADX INFO: renamed from: f */
        public final ConditionVariable f8931f;

        /* JADX INFO: renamed from: h */
        public volatile boolean f8933h;

        /* JADX INFO: renamed from: j */
        public long f8935j;

        /* JADX INFO: renamed from: m */
        public TrackOutput2 f8938m;

        /* JADX INFO: renamed from: n */
        public boolean f8939n;

        /* JADX INFO: renamed from: g */
        public final PositionHolder f8932g = new PositionHolder();

        /* JADX INFO: renamed from: i */
        public boolean f8934i = true;

        /* JADX INFO: renamed from: l */
        public long f8937l = -1;

        /* JADX INFO: renamed from: a */
        public final long f8926a = LoadEventInfo.m4367a();

        /* JADX INFO: renamed from: k */
        public DataSpec f8936k = m4127c(0);

        public a(Uri uri, DataSource3 dataSource3, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            this.f8927b = uri;
            this.f8928c = new StatsDataSource(dataSource3);
            this.f8929d = progressiveMediaExtractor;
            this.f8930e = extractorOutput;
            this.f8931f = conditionVariable;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x011d */
        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo2909a() throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p209b.p243w1.ProgressiveMediaPeriod.a.mo2909a():void");
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
        /* JADX INFO: renamed from: b */
        public void mo2910b() {
            this.f8933h = true;
        }

        /* JADX INFO: renamed from: c */
        public final DataSpec m4127c(long j2) {
            DataSpec.b bVar = new DataSpec.b();
            bVar.f6147a = this.f8927b;
            bVar.f6152f = j2;
            bVar.f6154h = ProgressiveMediaPeriod.this.f8915p;
            bVar.f6155i = 6;
            bVar.f6151e = ProgressiveMediaPeriod.f8886f;
            return bVar.m3005a();
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.i0$b */
    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public interface b {
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.i0$c */
    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class c implements SampleStream {

        /* JADX INFO: renamed from: f */
        public final int f8941f;

        public c(int i) {
            this.f8941f = i;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
        /* JADX INFO: renamed from: a */
        public void mo4128a() throws IOException {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            progressiveMediaPeriod.f8925z[this.f8941f].m4173x();
            progressiveMediaPeriod.f8917r.m2900f(((DefaultLoadErrorHandlingPolicy) progressiveMediaPeriod.f8910k).m3025b(progressiveMediaPeriod.f8896I));
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
        /* JADX INFO: renamed from: c */
        public boolean mo4129c() {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            return !progressiveMediaPeriod.m4120E() && progressiveMediaPeriod.f8925z[this.f8941f].m4171v(progressiveMediaPeriod.f8905R);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
        /* JADX INFO: renamed from: j */
        public int mo4130j(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            int i = this.f8941f;
            if (progressiveMediaPeriod.m4120E()) {
                return -3;
            }
            progressiveMediaPeriod.m4116A(i);
            int iM4149B = progressiveMediaPeriod.f8925z[i].m4149B(formatHolder, decoderInputBuffer, z, progressiveMediaPeriod.f8905R);
            if (iM4149B == -3) {
                progressiveMediaPeriod.m4117B(i);
            }
            return iM4149B;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
        /* JADX INFO: renamed from: o */
        public int mo4131o(long j2) {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            int i = this.f8941f;
            if (progressiveMediaPeriod.m4120E()) {
                return 0;
            }
            progressiveMediaPeriod.m4116A(i);
            SampleQueue sampleQueue = progressiveMediaPeriod.f8925z[i];
            int iM4167r = sampleQueue.m4167r(j2, progressiveMediaPeriod.f8905R);
            sampleQueue.m4155H(iM4167r);
            if (iM4167r != 0) {
                return iM4167r;
            }
            progressiveMediaPeriod.m4117B(i);
            return iM4167r;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.i0$d */
    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final int f8943a;

        /* JADX INFO: renamed from: b */
        public final boolean f8944b;

        public d(int i, boolean z) {
            this.f8943a = i;
            this.f8944b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f8943a == dVar.f8943a && this.f8944b == dVar.f8944b;
        }

        public int hashCode() {
            return (this.f8943a * 31) + (this.f8944b ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.i0$e */
    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final TrackGroupArray f8945a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f8946b;

        /* JADX INFO: renamed from: c */
        public final boolean[] f8947c;

        /* JADX INFO: renamed from: d */
        public final boolean[] f8948d;

        public e(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f8945a = trackGroupArray;
            this.f8946b = zArr;
            int i = trackGroupArray.f9068g;
            this.f8947c = new boolean[i];
            this.f8948d = new boolean[i];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f8886f = Collections.unmodifiableMap(map);
        Format.b bVar = new Format.b();
        bVar.f6948a = "icy";
        bVar.f6958k = "application/x-icy";
        f8887g = bVar.m3519a();
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource3 dataSource3, ExtractorsFactory2 extractorsFactory2, DrmSessionManager2 drmSessionManager2, DrmSessionEventListener2.a aVar, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.a aVar2, b bVar, Allocator allocator, String str, int i) {
        this.f8907h = uri;
        this.f8908i = dataSource3;
        this.f8909j = drmSessionManager2;
        this.f8912m = aVar;
        this.f8910k = loadErrorHandlingPolicy;
        this.f8911l = aVar2;
        this.f8913n = bVar;
        this.f8914o = allocator;
        this.f8915p = str;
        this.f8916q = i;
        this.f8918s = new BundledExtractorsAdapter(extractorsFactory2);
    }

    /* JADX INFO: renamed from: A */
    public final void m4116A(int i) {
        m4122v();
        e eVar = this.f8892E;
        boolean[] zArr = eVar.f8948d;
        if (zArr[i]) {
            return;
        }
        Format format = eVar.f8945a.f9069h[i].f9065g[0];
        this.f8911l.m4099b(MimeTypes.m3167i(format.f6934q), format, 0, null, this.f8901N);
        zArr[i] = true;
    }

    /* JADX INFO: renamed from: B */
    public final void m4117B(int i) {
        m4122v();
        boolean[] zArr = this.f8892E.f8946b;
        if (this.f8903P && zArr[i] && !this.f8925z[i].m4171v(false)) {
            this.f8902O = 0L;
            this.f8903P = false;
            this.f8898K = true;
            this.f8901N = 0L;
            this.f8904Q = 0;
            for (SampleQueue sampleQueue : this.f8925z) {
                sampleQueue.m4151D(false);
            }
            MediaPeriod.a aVar = this.f8923x;
            Objects.requireNonNull(aVar);
            aVar.mo3428i(this);
        }
    }

    /* JADX INFO: renamed from: C */
    public final TrackOutput2 m4118C(d dVar) {
        int length = this.f8925z.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.f8888A[i])) {
                return this.f8925z[i];
            }
        }
        Allocator allocator = this.f8914o;
        Looper looper = this.f8922w.getLooper();
        DrmSessionManager2 drmSessionManager2 = this.f8909j;
        DrmSessionEventListener2.a aVar = this.f8912m;
        Objects.requireNonNull(looper);
        Objects.requireNonNull(drmSessionManager2);
        Objects.requireNonNull(aVar);
        SampleQueue sampleQueue = new SampleQueue(allocator, looper, drmSessionManager2, aVar);
        sampleQueue.f9000f = this;
        int i2 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f8888A, i2);
        dVarArr[length] = dVar;
        int i3 = Util6.f6307a;
        this.f8888A = dVarArr;
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.f8925z, i2);
        sampleQueueArr[length] = sampleQueue;
        this.f8925z = sampleQueueArr;
        return sampleQueue;
    }

    /* JADX INFO: renamed from: D */
    public final void m4119D() {
        a aVar = new a(this.f8907h, this.f8908i, this.f8918s, this, this.f8919t);
        if (this.f8890C) {
            C2096e.m4570f(m4125y());
            long j2 = this.f8894G;
            if (j2 != -9223372036854775807L && this.f8902O > j2) {
                this.f8905R = true;
                this.f8902O = -9223372036854775807L;
                return;
            }
            SeekMap seekMap = this.f8893F;
            Objects.requireNonNull(seekMap);
            long j3 = seekMap.mo3717h(this.f8902O).f8520a.f8526c;
            long j4 = this.f8902O;
            aVar.f8932g.f8519a = j3;
            aVar.f8935j = j4;
            aVar.f8934i = true;
            aVar.f8939n = false;
            for (SampleQueue sampleQueue : this.f8925z) {
                sampleQueue.f9015u = this.f8902O;
            }
            this.f8902O = -9223372036854775807L;
        }
        this.f8904Q = m4123w();
        this.f8911l.m4111n(new LoadEventInfo(aVar.f8926a, aVar.f8936k, this.f8917r.m2902h(aVar, this, ((DefaultLoadErrorHandlingPolicy) this.f8910k).m3025b(this.f8896I))), 1, -1, null, 0, null, aVar.f8935j, this.f8894G);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m4120E() {
        return this.f8898K || m4125y();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorOutput
    /* JADX INFO: renamed from: a */
    public void mo3772a(final SeekMap seekMap) {
        this.f8922w.post(new Runnable() { // from class: c.n.b.b.w1.i
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod progressiveMediaPeriod = this.f8884f;
                SeekMap seekMap2 = seekMap;
                progressiveMediaPeriod.f8893F = progressiveMediaPeriod.f8924y == null ? seekMap2 : new SeekMap.b(-9223372036854775807L);
                progressiveMediaPeriod.f8894G = seekMap2.mo3718i();
                boolean z = progressiveMediaPeriod.f8900M == -1 && seekMap2.mo3718i() == -9223372036854775807L;
                progressiveMediaPeriod.f8895H = z;
                progressiveMediaPeriod.f8896I = z ? 7 : 1;
                ((ProgressiveMediaSource) progressiveMediaPeriod.f8913n).m4135y(progressiveMediaPeriod.f8894G, seekMap2.mo3716d(), progressiveMediaPeriod.f8895H);
                if (progressiveMediaPeriod.f8890C) {
                    return;
                }
                progressiveMediaPeriod.m4126z();
            }
        });
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: b */
    public long mo4068b() {
        if (this.f8899L == 0) {
            return Long.MIN_VALUE;
        }
        return mo4072g();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleQueue.b
    /* JADX INFO: renamed from: c */
    public void mo4121c(Format format) {
        this.f8922w.post(this.f8920u);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: d */
    public boolean mo4069d(long j2) {
        if (this.f8905R || this.f8917r.m2898d() || this.f8903P) {
            return false;
        }
        if (this.f8890C && this.f8899L == 0) {
            return false;
        }
        boolean zM3141b = this.f8919t.m3141b();
        if (this.f8917r.m2899e()) {
            return zM3141b;
        }
        m4119D();
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public boolean mo4070e() {
        boolean z;
        if (this.f8917r.m2899e()) {
            ConditionVariable conditionVariable = this.f8919t;
            synchronized (conditionVariable) {
                z = conditionVariable.f6327b;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: f */
    public long mo4071f(long j2, SeekParameters seekParameters) {
        m4122v();
        if (!this.f8893F.mo3716d()) {
            return 0L;
        }
        SeekMap.a aVarMo3717h = this.f8893F.mo3717h(j2);
        return seekParameters.m3454a(j2, aVarMo3717h.f8520a.f8525b, aVarMo3717h.f8521b.f8525b);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: g */
    public long mo4072g() {
        long jM4124x;
        boolean z;
        m4122v();
        boolean[] zArr = this.f8892E.f8946b;
        if (this.f8905R) {
            return Long.MIN_VALUE;
        }
        if (m4125y()) {
            return this.f8902O;
        }
        if (this.f8891D) {
            int length = this.f8925z.length;
            jM4124x = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    SampleQueue sampleQueue = this.f8925z[i];
                    synchronized (sampleQueue) {
                        z = sampleQueue.f9018x;
                    }
                    if (!z) {
                        jM4124x = Math.min(jM4124x, this.f8925z[i].m4163n());
                    }
                }
            }
        } else {
            jM4124x = Long.MAX_VALUE;
        }
        if (jM4124x == Long.MAX_VALUE) {
            jM4124x = m4124x();
        }
        return jM4124x == Long.MIN_VALUE ? this.f8901N : jM4124x;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: h */
    public void mo4073h(long j2) {
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.f
    /* JADX INFO: renamed from: i */
    public void mo2911i() {
        for (SampleQueue sampleQueue : this.f8925z) {
            sampleQueue.m4150C();
        }
        BundledExtractorsAdapter bundledExtractorsAdapter = (BundledExtractorsAdapter) this.f8918s;
        Extractor extractor = bundledExtractorsAdapter.f9025b;
        if (extractor != null) {
            extractor.release();
            bundledExtractorsAdapter.f9025b = null;
        }
        bundledExtractorsAdapter.f9026c = null;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorOutput
    /* JADX INFO: renamed from: j */
    public void mo3773j() {
        this.f8889B = true;
        this.f8922w.post(this.f8920u);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: k */
    public void mo2903k(Loader.e eVar, long j2, long j3, boolean z) {
        a aVar = (a) eVar;
        StatsDataSource statsDataSource = aVar.f8928c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(aVar.f8926a, aVar.f8936k, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        Objects.requireNonNull(this.f8910k);
        this.f8911l.m4102e(loadEventInfo, 1, -1, null, 0, null, aVar.f8935j, this.f8894G);
        if (z) {
            return;
        }
        if (this.f8900M == -1) {
            this.f8900M = aVar.f8937l;
        }
        for (SampleQueue sampleQueue : this.f8925z) {
            sampleQueue.m4151D(false);
        }
        if (this.f8899L > 0) {
            MediaPeriod.a aVar2 = this.f8923x;
            Objects.requireNonNull(aVar2);
            aVar2.mo3428i(this);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: l */
    public void mo2904l(Loader.e eVar, long j2, long j3) {
        SeekMap seekMap;
        a aVar = (a) eVar;
        if (this.f8894G == -9223372036854775807L && (seekMap = this.f8893F) != null) {
            boolean zMo3716d = seekMap.mo3716d();
            long jM4124x = m4124x();
            long j4 = jM4124x == Long.MIN_VALUE ? 0L : jM4124x + 10000;
            this.f8894G = j4;
            ((ProgressiveMediaSource) this.f8913n).m4135y(j4, zMo3716d, this.f8895H);
        }
        StatsDataSource statsDataSource = aVar.f8928c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(aVar.f8926a, aVar.f8936k, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        Objects.requireNonNull(this.f8910k);
        this.f8911l.m4105h(loadEventInfo, 1, -1, null, 0, null, aVar.f8935j, this.f8894G);
        if (this.f8900M == -1) {
            this.f8900M = aVar.f8937l;
        }
        this.f8905R = true;
        MediaPeriod.a aVar2 = this.f8923x;
        Objects.requireNonNull(aVar2);
        aVar2.mo3428i(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: m */
    public void mo4074m() throws IOException {
        this.f8917r.m2900f(((DefaultLoadErrorHandlingPolicy) this.f8910k).m3025b(this.f8896I));
        if (this.f8905R && !this.f8890C) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: n */
    public long mo4075n(long j2) {
        boolean z;
        m4122v();
        boolean[] zArr = this.f8892E.f8946b;
        if (!this.f8893F.mo3716d()) {
            j2 = 0;
        }
        this.f8898K = false;
        this.f8901N = j2;
        if (m4125y()) {
            this.f8902O = j2;
            return j2;
        }
        if (this.f8896I != 7) {
            int length = this.f8925z.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (!this.f8925z[i].m4153F(j2, false) && (zArr[i] || !this.f8891D)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                return j2;
            }
        }
        this.f8903P = false;
        this.f8902O = j2;
        this.f8905R = false;
        if (this.f8917r.m2899e()) {
            for (SampleQueue sampleQueue : this.f8925z) {
                sampleQueue.m4158i();
            }
            this.f8917r.m2897b();
        } else {
            this.f8917r.f5962f = null;
            for (SampleQueue sampleQueue2 : this.f8925z) {
                sampleQueue2.m4151D(false);
            }
        }
        return j2;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorOutput
    /* JADX INFO: renamed from: o */
    public TrackOutput2 mo3774o(int i, int i2) {
        return m4118C(new d(i, false));
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: p */
    public long mo4076p() {
        if (!this.f8898K) {
            return -9223372036854775807L;
        }
        if (!this.f8905R && m4123w() <= this.f8904Q) {
            return -9223372036854775807L;
        }
        this.f8898K = false;
        return this.f8901N;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: q */
    public void mo4077q(MediaPeriod.a aVar, long j2) {
        this.f8923x = aVar;
        this.f8919t.m3141b();
        m4119D();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: r */
    public long mo4078r(ExoTrackSelection2[] exoTrackSelection2Arr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        m4122v();
        e eVar = this.f8892E;
        TrackGroupArray trackGroupArray = eVar.f8945a;
        boolean[] zArr3 = eVar.f8947c;
        int i = this.f8899L;
        int i2 = 0;
        for (int i3 = 0; i3 < exoTrackSelection2Arr.length; i3++) {
            if (sampleStreamArr[i3] != null && (exoTrackSelection2Arr[i3] == null || !zArr[i3])) {
                int i4 = ((c) sampleStreamArr[i3]).f8941f;
                C2096e.m4570f(zArr3[i4]);
                this.f8899L--;
                zArr3[i4] = false;
                sampleStreamArr[i3] = null;
            }
        }
        boolean z = !this.f8897J ? j2 == 0 : i != 0;
        for (int i5 = 0; i5 < exoTrackSelection2Arr.length; i5++) {
            if (sampleStreamArr[i5] == null && exoTrackSelection2Arr[i5] != null) {
                ExoTrackSelection2 exoTrackSelection2 = exoTrackSelection2Arr[i5];
                C2096e.m4570f(exoTrackSelection2.length() == 1);
                C2096e.m4570f(exoTrackSelection2.mo4517i(0) == 0);
                int iM4193a = trackGroupArray.m4193a(exoTrackSelection2.mo4512a());
                C2096e.m4570f(!zArr3[iM4193a]);
                this.f8899L++;
                zArr3[iM4193a] = true;
                sampleStreamArr[i5] = new c(iM4193a);
                zArr2[i5] = true;
                if (!z) {
                    SampleQueue sampleQueue = this.f8925z[iM4193a];
                    z = (sampleQueue.m4153F(j2, true) || sampleQueue.m4165p() == 0) ? false : true;
                }
            }
        }
        if (this.f8899L == 0) {
            this.f8903P = false;
            this.f8898K = false;
            if (this.f8917r.m2899e()) {
                SampleQueue[] sampleQueueArr = this.f8925z;
                int length = sampleQueueArr.length;
                while (i2 < length) {
                    sampleQueueArr[i2].m4158i();
                    i2++;
                }
                this.f8917r.m2897b();
            } else {
                for (SampleQueue sampleQueue2 : this.f8925z) {
                    sampleQueue2.m4151D(false);
                }
            }
        } else if (z) {
            j2 = mo4075n(j2);
            while (i2 < sampleStreamArr.length) {
                if (sampleStreamArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f8897J = true;
        return j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: s */
    public TrackGroupArray mo4079s() {
        m4122v();
        return this.f8892E.f8945a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: t */
    public Loader.c mo2905t(Loader.e eVar, long j2, long j3, IOException iOException, int i) {
        Loader.c cVarM2895c;
        SeekMap seekMap;
        a aVar = (a) eVar;
        if (this.f8900M == -1) {
            this.f8900M = aVar.f8937l;
        }
        StatsDataSource statsDataSource = aVar.f8928c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(aVar.f8926a, aVar.f8936k, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        long jM3026c = ((DefaultLoadErrorHandlingPolicy) this.f8910k).m3026c(new LoadErrorHandlingPolicy.a(loadEventInfo, new MediaLoadData(1, -1, null, 0, null, C.m3237c(aVar.f8935j), C.m3237c(this.f8894G)), iOException, i));
        if (jM3026c == -9223372036854775807L) {
            cVarM2895c = Loader.f5959c;
        } else {
            int iM4123w = m4123w();
            boolean z = false;
            boolean z2 = iM4123w > this.f8904Q;
            if (this.f8900M == -1 && ((seekMap = this.f8893F) == null || seekMap.mo3718i() == -9223372036854775807L)) {
                if (!this.f8890C || m4120E()) {
                    this.f8898K = this.f8890C;
                    this.f8901N = 0L;
                    this.f8904Q = 0;
                    for (SampleQueue sampleQueue : this.f8925z) {
                        sampleQueue.m4151D(false);
                    }
                    aVar.f8932g.f8519a = 0L;
                    aVar.f8935j = 0L;
                    aVar.f8934i = true;
                    aVar.f8939n = false;
                } else {
                    this.f8903P = true;
                }
                if (z) {
                    cVarM2895c = Loader.m2895c(z2, jM3026c);
                } else {
                    cVarM2895c = Loader.f5958b;
                }
            } else {
                this.f8904Q = iM4123w;
            }
            z = true;
            if (z) {
                cVarM2895c = Loader.m2895c(z2, jM3026c);
            } else {
                cVarM2895c = Loader.f5958b;
            }
        }
        boolean zM2906a = true ^ cVarM2895c.m2906a();
        this.f8911l.m4107j(loadEventInfo, 1, -1, null, 0, null, aVar.f8935j, this.f8894G, iOException, zM2906a);
        if (zM2906a) {
            Objects.requireNonNull(this.f8910k);
        }
        return cVarM2895c;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: u */
    public void mo4080u(long j2, boolean z) {
        m4122v();
        if (m4125y()) {
            return;
        }
        boolean[] zArr = this.f8892E.f8947c;
        int length = this.f8925z.length;
        for (int i = 0; i < length; i++) {
            this.f8925z[i].m4157h(j2, z, zArr[i]);
        }
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* JADX INFO: renamed from: v */
    public final void m4122v() {
        C2096e.m4570f(this.f8890C);
        Objects.requireNonNull(this.f8892E);
        Objects.requireNonNull(this.f8893F);
    }

    /* JADX INFO: renamed from: w */
    public final int m4123w() {
        int iM4169t = 0;
        for (SampleQueue sampleQueue : this.f8925z) {
            iM4169t += sampleQueue.m4169t();
        }
        return iM4169t;
    }

    /* JADX INFO: renamed from: x */
    public final long m4124x() {
        long jMax = Long.MIN_VALUE;
        for (SampleQueue sampleQueue : this.f8925z) {
            jMax = Math.max(jMax, sampleQueue.m4163n());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m4125y() {
        return this.f8902O != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: z */
    public final void m4126z() {
        if (this.f8906S || this.f8890C || !this.f8889B || this.f8893F == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.f8925z) {
            if (sampleQueue.m4168s() == null) {
                return;
            }
        }
        this.f8919t.m3140a();
        int length = this.f8925z.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            Format formatM4168s = this.f8925z[i].m4168s();
            Objects.requireNonNull(formatM4168s);
            String str = formatM4168s.f6934q;
            boolean zM3169k = MimeTypes.m3169k(str);
            boolean z = zM3169k || MimeTypes.m3171m(str);
            zArr[i] = z;
            this.f8891D = z | this.f8891D;
            IcyHeaders icyHeaders = this.f8924y;
            if (icyHeaders != null) {
                if (zM3169k || this.f8888A[i].f8944b) {
                    Metadata metadata = formatM4168s.f6932o;
                    Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.m4008a(icyHeaders);
                    Format.b bVarM3515a = formatM4168s.m3515a();
                    bVarM3515a.f6956i = metadata2;
                    formatM4168s = bVarM3515a.m3519a();
                }
                if (zM3169k && formatM4168s.f6928k == -1 && formatM4168s.f6929l == -1 && icyHeaders.f8701f != -1) {
                    Format.b bVarM3515a2 = formatM4168s.m3515a();
                    bVarM3515a2.f6953f = icyHeaders.f8701f;
                    formatM4168s = bVarM3515a2.m3519a();
                }
            }
            trackGroupArr[i] = new TrackGroup(formatM4168s.m3516b(this.f8909j.mo3680b(formatM4168s)));
        }
        this.f8892E = new e(new TrackGroupArray(trackGroupArr), zArr);
        this.f8890C = true;
        MediaPeriod.a aVar = this.f8923x;
        Objects.requireNonNull(aVar);
        aVar.mo3429j(this);
    }
}
