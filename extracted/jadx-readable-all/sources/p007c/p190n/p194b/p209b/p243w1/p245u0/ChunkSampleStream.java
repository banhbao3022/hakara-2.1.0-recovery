package p007c.p190n.p194b.p209b.p243w1.p245u0;

import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.FormatHolder;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.DefaultLoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.Loader;
import p007c.p190n.p194b.p209b.p210a2.StatsDataSource;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;
import p007c.p190n.p194b.p209b.p243w1.MediaLoadData;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener;
import p007c.p190n.p194b.p209b.p243w1.SampleQueue;
import p007c.p190n.p194b.p209b.p243w1.SampleStream;
import p007c.p190n.p194b.p209b.p243w1.SequenceableLoader;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource;
import p007c.p190n.p194b.p209b.p243w1.p246v0.DashMediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.p246v0.PlayerEmsgHandler;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.u0.h, reason: use source file name */
/* JADX INFO: compiled from: ChunkSampleStream.java */
/* JADX INFO: loaded from: classes.dex */
public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Loader.b<Chunk>, Loader.f {

    /* JADX INFO: renamed from: A */
    public BaseMediaChunk f9120A;

    /* JADX INFO: renamed from: B */
    public boolean f9121B;

    /* JADX INFO: renamed from: f */
    public final int f9122f;

    /* JADX INFO: renamed from: g */
    public final int[] f9123g;

    /* JADX INFO: renamed from: h */
    public final Format[] f9124h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f9125i;

    /* JADX INFO: renamed from: j */
    public final T f9126j;

    /* JADX INFO: renamed from: k */
    public final SequenceableLoader.a<ChunkSampleStream<T>> f9127k;

    /* JADX INFO: renamed from: l */
    public final MediaSourceEventListener.a f9128l;

    /* JADX INFO: renamed from: m */
    public final LoadErrorHandlingPolicy f9129m;

    /* JADX INFO: renamed from: n */
    public final Loader f9130n;

    /* JADX INFO: renamed from: o */
    public final ChunkHolder f9131o;

    /* JADX INFO: renamed from: p */
    public final ArrayList<BaseMediaChunk> f9132p;

    /* JADX INFO: renamed from: q */
    public final List<BaseMediaChunk> f9133q;

    /* JADX INFO: renamed from: r */
    public final SampleQueue f9134r;

    /* JADX INFO: renamed from: s */
    public final SampleQueue[] f9135s;

    /* JADX INFO: renamed from: t */
    public final BaseMediaChunkOutput f9136t;

    /* JADX INFO: renamed from: u */
    public Chunk f9137u;

    /* JADX INFO: renamed from: v */
    public Format f9138v;

    /* JADX INFO: renamed from: w */
    public b<T> f9139w;

    /* JADX INFO: renamed from: x */
    public long f9140x;

    /* JADX INFO: renamed from: y */
    public long f9141y;

    /* JADX INFO: renamed from: z */
    public int f9142z;

    /* JADX INFO: renamed from: c.n.b.b.w1.u0.h$a */
    /* JADX INFO: compiled from: ChunkSampleStream.java */
    public final class a implements SampleStream {

        /* JADX INFO: renamed from: f */
        public final ChunkSampleStream<T> f9143f;

        /* JADX INFO: renamed from: g */
        public final SampleQueue f9144g;

        /* JADX INFO: renamed from: h */
        public final int f9145h;

        /* JADX INFO: renamed from: i */
        public boolean f9146i;

        public a(ChunkSampleStream<T> chunkSampleStream, SampleQueue sampleQueue, int i) {
            this.f9143f = chunkSampleStream;
            this.f9144g = sampleQueue;
            this.f9145h = i;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
        /* JADX INFO: renamed from: a */
        public void mo4128a() {
        }

        /* JADX INFO: renamed from: b */
        public final void m4212b() {
            if (this.f9146i) {
                return;
            }
            ChunkSampleStream chunkSampleStream = ChunkSampleStream.this;
            MediaSourceEventListener.a aVar = chunkSampleStream.f9128l;
            int[] iArr = chunkSampleStream.f9123g;
            int i = this.f9145h;
            aVar.m4099b(iArr[i], chunkSampleStream.f9124h[i], 0, null, chunkSampleStream.f9141y);
            this.f9146i = true;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
        /* JADX INFO: renamed from: c */
        public boolean mo4129c() {
            return !ChunkSampleStream.this.m4210y() && this.f9144g.m4171v(ChunkSampleStream.this.f9121B);
        }

        /* JADX INFO: renamed from: d */
        public void m4213d() {
            C2096e.m4570f(ChunkSampleStream.this.f9125i[this.f9145h]);
            ChunkSampleStream.this.f9125i[this.f9145h] = false;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
        /* JADX INFO: renamed from: j */
        public int mo4130j(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
            if (ChunkSampleStream.this.m4210y()) {
                return -3;
            }
            BaseMediaChunk baseMediaChunk = ChunkSampleStream.this.f9120A;
            if (baseMediaChunk != null && baseMediaChunk.m4196e(this.f9145h + 1) <= this.f9144g.m4165p()) {
                return -3;
            }
            m4212b();
            return this.f9144g.m4149B(formatHolder, decoderInputBuffer, z, ChunkSampleStream.this.f9121B);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
        /* JADX INFO: renamed from: o */
        public int mo4131o(long j2) {
            if (ChunkSampleStream.this.m4210y()) {
                return 0;
            }
            int iM4167r = this.f9144g.m4167r(j2, ChunkSampleStream.this.f9121B);
            BaseMediaChunk baseMediaChunk = ChunkSampleStream.this.f9120A;
            if (baseMediaChunk != null) {
                iM4167r = Math.min(iM4167r, baseMediaChunk.m4196e(this.f9145h + 1) - this.f9144g.m4165p());
            }
            this.f9144g.m4155H(iM4167r);
            if (iM4167r > 0) {
                m4212b();
            }
            return iM4167r;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.u0.h$b */
    /* JADX INFO: compiled from: ChunkSampleStream.java */
    public interface b<T extends ChunkSource> {
    }

    public ChunkSampleStream(int i, int[] iArr, Format[] formatArr, T t, SequenceableLoader.a<ChunkSampleStream<T>> aVar, Allocator allocator, long j2, DrmSessionManager2 drmSessionManager2, DrmSessionEventListener2.a aVar2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.a aVar3) {
        this.f9122f = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f9123g = iArr;
        this.f9124h = formatArr == null ? new Format[0] : formatArr;
        this.f9126j = t;
        this.f9127k = aVar;
        this.f9128l = aVar3;
        this.f9129m = loadErrorHandlingPolicy;
        this.f9130n = new Loader("Loader:ChunkSampleStream");
        this.f9131o = new ChunkHolder();
        ArrayList<BaseMediaChunk> arrayList = new ArrayList<>();
        this.f9132p = arrayList;
        this.f9133q = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f9135s = new SampleQueue[length];
        this.f9125i = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        SampleQueue[] sampleQueueArr = new SampleQueue[i3];
        Looper looperMyLooper = Looper.myLooper();
        Objects.requireNonNull(looperMyLooper);
        Objects.requireNonNull(drmSessionManager2);
        Objects.requireNonNull(aVar2);
        SampleQueue sampleQueue = new SampleQueue(allocator, looperMyLooper, drmSessionManager2, aVar2);
        this.f9134r = sampleQueue;
        iArr2[0] = i;
        sampleQueueArr[0] = sampleQueue;
        while (i2 < length) {
            SampleQueue sampleQueue2 = new SampleQueue(allocator, null, null, null);
            this.f9135s[i2] = sampleQueue2;
            int i4 = i2 + 1;
            sampleQueueArr[i4] = sampleQueue2;
            iArr2[i4] = this.f9123g[i2];
            i2 = i4;
        }
        this.f9136t = new BaseMediaChunkOutput(iArr2, sampleQueueArr);
        this.f9140x = j2;
        this.f9141y = j2;
    }

    /* JADX INFO: renamed from: A */
    public final int m4202A(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f9132p.size()) {
                return this.f9132p.size() - 1;
            }
        } while (this.f9132p.get(i2).m4196e(0) <= i);
        return i2 - 1;
    }

    /* JADX INFO: renamed from: B */
    public void m4203B(b<T> bVar) {
        this.f9139w = bVar;
        this.f9134r.m4148A();
        for (SampleQueue sampleQueue : this.f9135s) {
            sampleQueue.m4148A();
        }
        this.f9130n.m2901g(this);
    }

    /* JADX INFO: renamed from: C */
    public final void m4204C() {
        this.f9134r.m4151D(false);
        for (SampleQueue sampleQueue : this.f9135s) {
            sampleQueue.m4151D(false);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m4205D(long j2) {
        BaseMediaChunk baseMediaChunk;
        boolean zM4153F;
        this.f9141y = j2;
        if (m4210y()) {
            this.f9140x = j2;
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < this.f9132p.size()) {
                baseMediaChunk = this.f9132p.get(i2);
                long j3 = baseMediaChunk.f9115g;
                if (j3 == j2 && baseMediaChunk.f9085k == -9223372036854775807L) {
                    break;
                } else if (j3 <= j2) {
                    i2++;
                }
            }
            baseMediaChunk = null;
            break;
        }
        if (baseMediaChunk != null) {
            SampleQueue sampleQueue = this.f9134r;
            int iM4196e = baseMediaChunk.m4196e(0);
            synchronized (sampleQueue) {
                sampleQueue.m4152E();
                int i3 = sampleQueue.f9012r;
                if (iM4196e < i3 || iM4196e > sampleQueue.f9011q + i3) {
                    zM4153F = false;
                } else {
                    sampleQueue.f9015u = Long.MIN_VALUE;
                    sampleQueue.f9014t = iM4196e - i3;
                    zM4153F = true;
                }
            }
        } else {
            zM4153F = this.f9134r.m4153F(j2, j2 < mo4068b());
        }
        if (zM4153F) {
            this.f9142z = m4202A(this.f9134r.m4165p(), 0);
            SampleQueue[] sampleQueueArr = this.f9135s;
            int length = sampleQueueArr.length;
            while (i < length) {
                sampleQueueArr[i].m4153F(j2, true);
                i++;
            }
            return;
        }
        this.f9140x = j2;
        this.f9121B = false;
        this.f9132p.clear();
        this.f9142z = 0;
        if (!this.f9130n.m2899e()) {
            this.f9130n.f5962f = null;
            m4204C();
            return;
        }
        this.f9134r.m4158i();
        SampleQueue[] sampleQueueArr2 = this.f9135s;
        int length2 = sampleQueueArr2.length;
        while (i < length2) {
            sampleQueueArr2[i].m4158i();
            i++;
        }
        this.f9130n.m2897b();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
    /* JADX INFO: renamed from: a */
    public void mo4128a() throws IOException {
        this.f9130n.m2900f(Integer.MIN_VALUE);
        this.f9134r.m4173x();
        if (this.f9130n.m2899e()) {
            return;
        }
        this.f9126j.mo4214a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: b */
    public long mo4068b() {
        if (m4210y()) {
            return this.f9140x;
        }
        if (this.f9121B) {
            return Long.MIN_VALUE;
        }
        return m4208w().f9116h;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
    /* JADX INFO: renamed from: c */
    public boolean mo4129c() {
        return !m4210y() && this.f9134r.m4171v(this.f9121B);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: d */
    public boolean mo4069d(long j2) {
        List<BaseMediaChunk> listEmptyList;
        long j3;
        int i = 0;
        if (this.f9121B || this.f9130n.m2899e() || this.f9130n.m2898d()) {
            return false;
        }
        boolean zM4210y = m4210y();
        if (zM4210y) {
            listEmptyList = Collections.emptyList();
            j3 = this.f9140x;
        } else {
            listEmptyList = this.f9133q;
            j3 = m4208w().f9116h;
        }
        this.f9126j.mo4220j(j2, j3, listEmptyList, this.f9131o);
        ChunkHolder chunkHolder = this.f9131o;
        boolean z = chunkHolder.f9119b;
        Chunk chunk = chunkHolder.f9118a;
        chunkHolder.f9118a = null;
        chunkHolder.f9119b = false;
        if (z) {
            this.f9140x = -9223372036854775807L;
            this.f9121B = true;
            return true;
        }
        if (chunk == null) {
            return false;
        }
        this.f9137u = chunk;
        if (chunk instanceof BaseMediaChunk) {
            BaseMediaChunk baseMediaChunk = (BaseMediaChunk) chunk;
            if (zM4210y) {
                long j4 = baseMediaChunk.f9115g;
                long j5 = this.f9140x;
                if (j4 != j5) {
                    this.f9134r.f9015u = j5;
                    for (SampleQueue sampleQueue : this.f9135s) {
                        sampleQueue.f9015u = this.f9140x;
                    }
                }
                this.f9140x = -9223372036854775807L;
            }
            BaseMediaChunkOutput baseMediaChunkOutput = this.f9136t;
            baseMediaChunk.f9087m = baseMediaChunkOutput;
            int[] iArr = new int[baseMediaChunkOutput.f9091b.length];
            while (true) {
                SampleQueue[] sampleQueueArr = baseMediaChunkOutput.f9091b;
                if (i >= sampleQueueArr.length) {
                    break;
                }
                iArr[i] = sampleQueueArr[i].m4169t();
                i++;
            }
            baseMediaChunk.f9088n = iArr;
            this.f9132p.add(baseMediaChunk);
        } else if (chunk instanceof InitializationChunk) {
            ((InitializationChunk) chunk).f9157k = this.f9136t;
        }
        this.f9128l.m4111n(new LoadEventInfo(chunk.f9109a, chunk.f9110b, this.f9130n.m2902h(chunk, this, ((DefaultLoadErrorHandlingPolicy) this.f9129m).m3025b(chunk.f9111c))), chunk.f9111c, this.f9122f, chunk.f9112d, chunk.f9113e, chunk.f9114f, chunk.f9115g, chunk.f9116h);
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public boolean mo4070e() {
        return this.f9130n.m2899e();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: g */
    public long mo4072g() {
        if (this.f9121B) {
            return Long.MIN_VALUE;
        }
        if (m4210y()) {
            return this.f9140x;
        }
        long jMax = this.f9141y;
        BaseMediaChunk baseMediaChunkM4208w = m4208w();
        if (!baseMediaChunkM4208w.mo4222d()) {
            if (this.f9132p.size() > 1) {
                ArrayList<BaseMediaChunk> arrayList = this.f9132p;
                baseMediaChunkM4208w = arrayList.get(arrayList.size() - 2);
            } else {
                baseMediaChunkM4208w = null;
            }
        }
        if (baseMediaChunkM4208w != null) {
            jMax = Math.max(jMax, baseMediaChunkM4208w.f9116h);
        }
        return Math.max(jMax, this.f9134r.m4163n());
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: h */
    public void mo4073h(long j2) {
        if (this.f9130n.m2898d() || m4210y()) {
            return;
        }
        if (this.f9130n.m2899e()) {
            Chunk chunk = this.f9137u;
            Objects.requireNonNull(chunk);
            boolean z = chunk instanceof BaseMediaChunk;
            if (!(z && m4209x(this.f9132p.size() - 1)) && this.f9126j.mo4215c(j2, chunk, this.f9133q)) {
                this.f9130n.m2897b();
                if (z) {
                    this.f9120A = (BaseMediaChunk) chunk;
                    return;
                }
                return;
            }
            return;
        }
        int iMo4218h = this.f9126j.mo4218h(j2, this.f9133q);
        if (iMo4218h < this.f9132p.size()) {
            C2096e.m4570f(!this.f9130n.m2899e());
            int size = this.f9132p.size();
            while (true) {
                if (iMo4218h >= size) {
                    iMo4218h = -1;
                    break;
                } else if (!m4209x(iMo4218h)) {
                    break;
                } else {
                    iMo4218h++;
                }
            }
            if (iMo4218h == -1) {
                return;
            }
            long j3 = m4208w().f9116h;
            BaseMediaChunk baseMediaChunkM4207v = m4207v(iMo4218h);
            if (this.f9132p.isEmpty()) {
                this.f9140x = this.f9141y;
            }
            this.f9121B = false;
            this.f9128l.m4113p(this.f9122f, baseMediaChunkM4207v.f9115g, j3);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.f
    /* JADX INFO: renamed from: i */
    public void mo2911i() {
        this.f9134r.m4150C();
        for (SampleQueue sampleQueue : this.f9135s) {
            sampleQueue.m4150C();
        }
        this.f9126j.release();
        b<T> bVar = this.f9139w;
        if (bVar != null) {
            DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) bVar;
            synchronized (dashMediaPeriod) {
                PlayerEmsgHandler.c cVarRemove = dashMediaPeriod.f9187t.remove(this);
                if (cVarRemove != null) {
                    cVarRemove.f9243a.m4150C();
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
    /* JADX INFO: renamed from: j */
    public int mo4130j(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
        if (m4210y()) {
            return -3;
        }
        BaseMediaChunk baseMediaChunk = this.f9120A;
        if (baseMediaChunk != null && baseMediaChunk.m4196e(0) <= this.f9134r.m4165p()) {
            return -3;
        }
        m4211z();
        return this.f9134r.m4149B(formatHolder, decoderInputBuffer, z, this.f9121B);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: k */
    public void mo2903k(Loader.e eVar, long j2, long j3, boolean z) {
        Chunk chunk = (Chunk) eVar;
        this.f9137u = null;
        this.f9120A = null;
        long j4 = chunk.f9109a;
        DataSpec dataSpec = chunk.f9110b;
        StatsDataSource statsDataSource = chunk.f9117i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        Objects.requireNonNull(this.f9129m);
        this.f9128l.m4102e(loadEventInfo, chunk.f9111c, this.f9122f, chunk.f9112d, chunk.f9113e, chunk.f9114f, chunk.f9115g, chunk.f9116h);
        if (z) {
            return;
        }
        if (m4210y()) {
            m4204C();
        } else if (chunk instanceof BaseMediaChunk) {
            m4207v(this.f9132p.size() - 1);
            if (this.f9132p.isEmpty()) {
                this.f9140x = this.f9141y;
            }
        }
        this.f9127k.mo3428i(this);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: l */
    public void mo2904l(Loader.e eVar, long j2, long j3) {
        Chunk chunk = (Chunk) eVar;
        this.f9137u = null;
        this.f9126j.mo4219i(chunk);
        long j4 = chunk.f9109a;
        DataSpec dataSpec = chunk.f9110b;
        StatsDataSource statsDataSource = chunk.f9117i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        Objects.requireNonNull(this.f9129m);
        this.f9128l.m4105h(loadEventInfo, chunk.f9111c, this.f9122f, chunk.f9112d, chunk.f9113e, chunk.f9114f, chunk.f9115g, chunk.f9116h);
        this.f9127k.mo3428i(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
    /* JADX INFO: renamed from: o */
    public int mo4131o(long j2) {
        if (m4210y()) {
            return 0;
        }
        int iM4167r = this.f9134r.m4167r(j2, this.f9121B);
        BaseMediaChunk baseMediaChunk = this.f9120A;
        if (baseMediaChunk != null) {
            iM4167r = Math.min(iM4167r, baseMediaChunk.m4196e(0) - this.f9134r.m4165p());
        }
        this.f9134r.m4155H(iM4167r);
        m4211z();
        return iM4167r;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: t */
    public Loader.c mo2905t(Loader.e eVar, long j2, long j3, IOException iOException, int i) {
        Loader.c cVarM2895c;
        Chunk chunk = (Chunk) eVar;
        long j4 = chunk.f9117i.f5997b;
        boolean z = chunk instanceof BaseMediaChunk;
        int size = this.f9132p.size() - 1;
        boolean z2 = (j4 != 0 && z && m4209x(size)) ? false : true;
        long j5 = chunk.f9109a;
        DataSpec dataSpec = chunk.f9110b;
        StatsDataSource statsDataSource = chunk.f9117i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j5, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, j4);
        LoadErrorHandlingPolicy.a aVar = new LoadErrorHandlingPolicy.a(loadEventInfo, new MediaLoadData(chunk.f9111c, this.f9122f, chunk.f9112d, chunk.f9113e, chunk.f9114f, C.m3237c(chunk.f9115g), C.m3237c(chunk.f9116h)), iOException, i);
        if (!this.f9126j.mo4216e(chunk, z2, iOException, z2 ? ((DefaultLoadErrorHandlingPolicy) this.f9129m).m3024a(aVar) : -9223372036854775807L)) {
            cVarM2895c = null;
        } else if (z2) {
            cVarM2895c = Loader.f5958b;
            if (z) {
                C2096e.m4570f(m4207v(size) == chunk);
                if (this.f9132p.isEmpty()) {
                    this.f9140x = this.f9141y;
                }
            }
        } else {
            Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            cVarM2895c = null;
        }
        if (cVarM2895c == null) {
            long jM3026c = ((DefaultLoadErrorHandlingPolicy) this.f9129m).m3026c(aVar);
            cVarM2895c = jM3026c != -9223372036854775807L ? Loader.m2895c(false, jM3026c) : Loader.f5959c;
        }
        boolean z3 = !cVarM2895c.m2906a();
        this.f9128l.m4107j(loadEventInfo, chunk.f9111c, this.f9122f, chunk.f9112d, chunk.f9113e, chunk.f9114f, chunk.f9115g, chunk.f9116h, iOException, z3);
        if (z3) {
            this.f9137u = null;
            Objects.requireNonNull(this.f9129m);
            this.f9127k.mo3428i(this);
        }
        return cVarM2895c;
    }

    /* JADX INFO: renamed from: u */
    public void m4206u(long j2, boolean z) {
        long j3;
        if (m4210y()) {
            return;
        }
        SampleQueue sampleQueue = this.f9134r;
        int i = sampleQueue.f9012r;
        sampleQueue.m4157h(j2, z, true);
        SampleQueue sampleQueue2 = this.f9134r;
        int i2 = sampleQueue2.f9012r;
        if (i2 > i) {
            synchronized (sampleQueue2) {
                j3 = sampleQueue2.f9011q == 0 ? Long.MIN_VALUE : sampleQueue2.f9008n[sampleQueue2.f9013s];
            }
            int i3 = 0;
            while (true) {
                SampleQueue[] sampleQueueArr = this.f9135s;
                if (i3 >= sampleQueueArr.length) {
                    break;
                }
                sampleQueueArr[i3].m4157h(j3, z, this.f9125i[i3]);
                i3++;
            }
        }
        int iMin = Math.min(m4202A(i2, 0), this.f9142z);
        if (iMin > 0) {
            Util6.m3103L(this.f9132p, 0, iMin);
            this.f9142z -= iMin;
        }
    }

    /* JADX INFO: renamed from: v */
    public final BaseMediaChunk m4207v(int i) {
        BaseMediaChunk baseMediaChunk = this.f9132p.get(i);
        ArrayList<BaseMediaChunk> arrayList = this.f9132p;
        Util6.m3103L(arrayList, i, arrayList.size());
        this.f9142z = Math.max(this.f9142z, this.f9132p.size());
        int i2 = 0;
        this.f9134r.m4160k(baseMediaChunk.m4196e(0));
        while (true) {
            SampleQueue[] sampleQueueArr = this.f9135s;
            if (i2 >= sampleQueueArr.length) {
                return baseMediaChunk;
            }
            SampleQueue sampleQueue = sampleQueueArr[i2];
            i2++;
            sampleQueue.m4160k(baseMediaChunk.m4196e(i2));
        }
    }

    /* JADX INFO: renamed from: w */
    public final BaseMediaChunk m4208w() {
        ArrayList<BaseMediaChunk> arrayList = this.f9132p;
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m4209x(int i) {
        int iM4165p;
        BaseMediaChunk baseMediaChunk = this.f9132p.get(i);
        if (this.f9134r.m4165p() > baseMediaChunk.m4196e(0)) {
            return true;
        }
        int i2 = 0;
        do {
            SampleQueue[] sampleQueueArr = this.f9135s;
            if (i2 >= sampleQueueArr.length) {
                return false;
            }
            iM4165p = sampleQueueArr[i2].m4165p();
            i2++;
        } while (iM4165p <= baseMediaChunk.m4196e(i2));
        return true;
    }

    /* JADX INFO: renamed from: y */
    public boolean m4210y() {
        return this.f9140x != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: z */
    public final void m4211z() {
        int iM4202A = m4202A(this.f9134r.m4165p(), this.f9142z - 1);
        while (true) {
            int i = this.f9142z;
            if (i > iM4202A) {
                return;
            }
            this.f9142z = i + 1;
            BaseMediaChunk baseMediaChunk = this.f9132p.get(i);
            Format format = baseMediaChunk.f9112d;
            if (!format.equals(this.f9138v)) {
                this.f9128l.m4099b(this.f9122f, format, baseMediaChunk.f9113e, baseMediaChunk.f9114f, baseMediaChunk.f9115g);
            }
            this.f9138v = format;
        }
    }
}
