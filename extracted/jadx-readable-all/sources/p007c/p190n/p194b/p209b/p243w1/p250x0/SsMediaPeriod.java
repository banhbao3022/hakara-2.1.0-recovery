package p007c.p190n.p194b.p209b.p243w1.p250x0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.SeekParameters;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.LoaderErrorThrower;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p243w1.CompositeSequenceableLoader;
import p007c.p190n.p194b.p209b.p243w1.CompositeSequenceableLoaderFactory;
import p007c.p190n.p194b.p209b.p243w1.DefaultCompositeSequenceableLoaderFactory;
import p007c.p190n.p194b.p209b.p243w1.MediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener;
import p007c.p190n.p194b.p209b.p243w1.SampleStream;
import p007c.p190n.p194b.p209b.p243w1.SequenceableLoader;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSampleStream;
import p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifest;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;

/* JADX INFO: renamed from: c.n.b.b.w1.x0.e, reason: use source file name */
/* JADX INFO: compiled from: SsMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class SsMediaPeriod implements MediaPeriod, SequenceableLoader.a<ChunkSampleStream<SsChunkSource>> {

    /* JADX INFO: renamed from: f */
    public final SsChunkSource.a f9684f;

    /* JADX INFO: renamed from: g */
    public final TransferListener f9685g;

    /* JADX INFO: renamed from: h */
    public final LoaderErrorThrower f9686h;

    /* JADX INFO: renamed from: i */
    public final DrmSessionManager2 f9687i;

    /* JADX INFO: renamed from: j */
    public final DrmSessionEventListener2.a f9688j;

    /* JADX INFO: renamed from: k */
    public final LoadErrorHandlingPolicy f9689k;

    /* JADX INFO: renamed from: l */
    public final MediaSourceEventListener.a f9690l;

    /* JADX INFO: renamed from: m */
    public final Allocator f9691m;

    /* JADX INFO: renamed from: n */
    public final TrackGroupArray f9692n;

    /* JADX INFO: renamed from: o */
    public final CompositeSequenceableLoaderFactory f9693o;

    /* JADX INFO: renamed from: p */
    public MediaPeriod.a f9694p;

    /* JADX INFO: renamed from: q */
    public SsManifest f9695q;

    /* JADX INFO: renamed from: r */
    public ChunkSampleStream<SsChunkSource>[] f9696r;

    /* JADX INFO: renamed from: s */
    public SequenceableLoader f9697s;

    public SsMediaPeriod(SsManifest ssManifest, SsChunkSource.a aVar, TransferListener transferListener, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager2 drmSessionManager2, DrmSessionEventListener2.a aVar2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.a aVar3, LoaderErrorThrower loaderErrorThrower, Allocator allocator) {
        this.f9695q = ssManifest;
        this.f9684f = aVar;
        this.f9685g = transferListener;
        this.f9686h = loaderErrorThrower;
        this.f9687i = drmSessionManager2;
        this.f9688j = aVar2;
        this.f9689k = loadErrorHandlingPolicy;
        this.f9690l = aVar3;
        this.f9691m = allocator;
        this.f9693o = compositeSequenceableLoaderFactory;
        TrackGroup[] trackGroupArr = new TrackGroup[ssManifest.f9703f.length];
        int i = 0;
        while (true) {
            SsManifest.b[] bVarArr = ssManifest.f9703f;
            if (i >= bVarArr.length) {
                this.f9692n = new TrackGroupArray(trackGroupArr);
                ChunkSampleStream<SsChunkSource>[] chunkSampleStreamArr = new ChunkSampleStream[0];
                this.f9696r = chunkSampleStreamArr;
                Objects.requireNonNull((DefaultCompositeSequenceableLoaderFactory) compositeSequenceableLoaderFactory);
                this.f9697s = new CompositeSequenceableLoader(chunkSampleStreamArr);
                return;
            }
            Format[] formatArr = bVarArr[i].f9718j;
            Format[] formatArr2 = new Format[formatArr.length];
            for (int i2 = 0; i2 < formatArr.length; i2++) {
                Format format = formatArr[i2];
                formatArr2[i2] = format.m3516b(drmSessionManager2.mo3680b(format));
            }
            trackGroupArr[i] = new TrackGroup(formatArr2);
            i++;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: b */
    public long mo4068b() {
        return this.f9697s.mo4068b();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: d */
    public boolean mo4069d(long j2) {
        return this.f9697s.mo4069d(j2);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public boolean mo4070e() {
        return this.f9697s.mo4070e();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: f */
    public long mo4071f(long j2, SeekParameters seekParameters) {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.f9696r) {
            if (chunkSampleStream.f9122f == 2) {
                return chunkSampleStream.f9126j.mo4217f(j2, seekParameters);
            }
        }
        return j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: g */
    public long mo4072g() {
        return this.f9697s.mo4072g();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: h */
    public void mo4073h(long j2) {
        this.f9697s.mo4073h(j2);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader.a
    /* JADX INFO: renamed from: i */
    public void mo3428i(SequenceableLoader sequenceableLoader) {
        this.f9694p.mo3428i(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: m */
    public void mo4074m() throws IOException {
        this.f9686h.mo2896a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: n */
    public long mo4075n(long j2) {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.f9696r) {
            chunkSampleStream.m4205D(j2);
        }
        return j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: p */
    public long mo4076p() {
        return -9223372036854775807L;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: q */
    public void mo4077q(MediaPeriod.a aVar, long j2) {
        this.f9694p = aVar;
        aVar.mo3429j(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: r */
    public long mo4078r(ExoTrackSelection2[] exoTrackSelection2Arr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < exoTrackSelection2Arr.length) {
            if (sampleStreamArr[i2] != null) {
                ChunkSampleStream chunkSampleStream = (ChunkSampleStream) sampleStreamArr[i2];
                if (exoTrackSelection2Arr[i2] == null || !zArr[i2]) {
                    chunkSampleStream.m4203B(null);
                    sampleStreamArr[i2] = null;
                } else {
                    ((SsChunkSource) chunkSampleStream.f9126j).mo4368b(exoTrackSelection2Arr[i2]);
                    arrayList.add(chunkSampleStream);
                }
            }
            if (sampleStreamArr[i2] != null || exoTrackSelection2Arr[i2] == null) {
                i = i2;
            } else {
                ExoTrackSelection2 exoTrackSelection2 = exoTrackSelection2Arr[i2];
                int iM4193a = this.f9692n.m4193a(exoTrackSelection2.mo4512a());
                i = i2;
                ChunkSampleStream chunkSampleStream2 = new ChunkSampleStream(this.f9695q.f9703f[iM4193a].f9709a, null, null, this.f9684f.mo4370a(this.f9686h, this.f9695q, iM4193a, exoTrackSelection2, this.f9685g), this, this.f9691m, j2, this.f9687i, this.f9688j, this.f9689k, this.f9690l);
                arrayList.add(chunkSampleStream2);
                sampleStreamArr[i] = chunkSampleStream2;
                zArr2[i] = true;
            }
            i2 = i + 1;
        }
        ChunkSampleStream<SsChunkSource>[] chunkSampleStreamArr = new ChunkSampleStream[arrayList.size()];
        this.f9696r = chunkSampleStreamArr;
        arrayList.toArray(chunkSampleStreamArr);
        CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory = this.f9693o;
        ChunkSampleStream<SsChunkSource>[] chunkSampleStreamArr2 = this.f9696r;
        Objects.requireNonNull((DefaultCompositeSequenceableLoaderFactory) compositeSequenceableLoaderFactory);
        this.f9697s = new CompositeSequenceableLoader(chunkSampleStreamArr2);
        return j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: s */
    public TrackGroupArray mo4079s() {
        return this.f9692n;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: u */
    public void mo4080u(long j2, boolean z) {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.f9696r) {
            chunkSampleStream.m4206u(j2, z);
        }
    }
}
