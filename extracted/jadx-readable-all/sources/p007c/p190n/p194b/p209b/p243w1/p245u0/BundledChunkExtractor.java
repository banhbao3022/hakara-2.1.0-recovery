package p007c.p190n.p194b.p209b.p243w1.p245u0;

import android.util.SparseArray;
import java.io.IOException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DataReader;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.DummyTrackOutput;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.u0.d, reason: use source file name */
/* JADX INFO: compiled from: BundledChunkExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class BundledChunkExtractor implements ExtractorOutput, ChunkExtractor {

    /* JADX INFO: renamed from: f */
    public static final PositionHolder f9092f = new PositionHolder();

    /* JADX INFO: renamed from: g */
    public final Extractor f9093g;

    /* JADX INFO: renamed from: h */
    public final int f9094h;

    /* JADX INFO: renamed from: i */
    public final Format f9095i;

    /* JADX INFO: renamed from: j */
    public final SparseArray<a> f9096j = new SparseArray<>();

    /* JADX INFO: renamed from: k */
    public boolean f9097k;

    /* JADX INFO: renamed from: l */
    public ChunkExtractor.a f9098l;

    /* JADX INFO: renamed from: m */
    public long f9099m;

    /* JADX INFO: renamed from: n */
    public SeekMap f9100n;

    /* JADX INFO: renamed from: o */
    public Format[] f9101o;

    /* JADX INFO: renamed from: c.n.b.b.w1.u0.d$a */
    /* JADX INFO: compiled from: BundledChunkExtractor.java */
    public static final class a implements TrackOutput2 {

        /* JADX INFO: renamed from: a */
        public final int f9102a;

        /* JADX INFO: renamed from: b */
        public final int f9103b;

        /* JADX INFO: renamed from: c */
        public final Format f9104c;

        /* JADX INFO: renamed from: d */
        public final DummyTrackOutput f9105d = new DummyTrackOutput();

        /* JADX INFO: renamed from: e */
        public Format f9106e;

        /* JADX INFO: renamed from: f */
        public TrackOutput2 f9107f;

        /* JADX INFO: renamed from: g */
        public long f9108g;

        public a(int i, int i2, Format format) {
            this.f9102a = i;
            this.f9103b = i2;
            this.f9104c = format;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: a */
        public int mo3756a(DataReader dataReader, int i, boolean z, int i2) throws IOException {
            TrackOutput2 trackOutput2 = this.f9107f;
            int i3 = Util6.f6307a;
            return trackOutput2.mo3757b(dataReader, i, z);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: b */
        public /* synthetic */ int mo3757b(DataReader dataReader, int i, boolean z) {
            return TrackOutput.m3926a(this, dataReader, i, z);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: c */
        public /* synthetic */ void mo3758c(ParsableByteArray parsableByteArray, int i) {
            TrackOutput.m3927b(this, parsableByteArray, i);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: d */
        public void mo3759d(long j2, int i, int i2, int i3, TrackOutput2.a aVar) {
            long j3 = this.f9108g;
            if (j3 != -9223372036854775807L && j2 >= j3) {
                this.f9107f = this.f9105d;
            }
            TrackOutput2 trackOutput2 = this.f9107f;
            int i4 = Util6.f6307a;
            trackOutput2.mo3759d(j2, i, i2, i3, aVar);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: e */
        public void mo3760e(Format format) {
            Format format2 = this.f9104c;
            if (format2 != null) {
                format = format.m3518e(format2);
            }
            this.f9106e = format;
            TrackOutput2 trackOutput2 = this.f9107f;
            int i = Util6.f6307a;
            trackOutput2.mo3760e(format);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: f */
        public void mo3761f(ParsableByteArray parsableByteArray, int i, int i2) {
            TrackOutput2 trackOutput2 = this.f9107f;
            int i3 = Util6.f6307a;
            trackOutput2.mo3758c(parsableByteArray, i);
        }

        /* JADX INFO: renamed from: g */
        public void m4201g(ChunkExtractor.a aVar, long j2) {
            if (aVar == null) {
                this.f9107f = this.f9105d;
                return;
            }
            this.f9108g = j2;
            TrackOutput2 trackOutput2M4198b = ((BaseMediaChunkOutput) aVar).m4198b(this.f9102a, this.f9103b);
            this.f9107f = trackOutput2M4198b;
            Format format = this.f9106e;
            if (format != null) {
                trackOutput2M4198b.mo3760e(format);
            }
        }
    }

    public BundledChunkExtractor(Extractor extractor, int i, Format format) {
        this.f9093g = extractor;
        this.f9094h = i;
        this.f9095i = format;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorOutput
    /* JADX INFO: renamed from: a */
    public void mo3772a(SeekMap seekMap) {
        this.f9100n = seekMap;
    }

    /* JADX INFO: renamed from: b */
    public void m4199b(ChunkExtractor.a aVar, long j2, long j3) {
        this.f9098l = aVar;
        this.f9099m = j3;
        if (!this.f9097k) {
            this.f9093g.mo3751f(this);
            if (j2 != -9223372036854775807L) {
                this.f9093g.mo3752g(0L, j2);
            }
            this.f9097k = true;
            return;
        }
        Extractor extractor = this.f9093g;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        extractor.mo3752g(0L, j2);
        for (int i = 0; i < this.f9096j.size(); i++) {
            this.f9096j.valueAt(i).m4201g(aVar, j3);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m4200c(ExtractorInput extractorInput) throws IOException {
        int iMo3750e = this.f9093g.mo3750e(extractorInput, f9092f);
        C2096e.m4570f(iMo3750e != 1);
        return iMo3750e == 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorOutput
    /* JADX INFO: renamed from: j */
    public void mo3773j() {
        Format[] formatArr = new Format[this.f9096j.size()];
        for (int i = 0; i < this.f9096j.size(); i++) {
            Format format = this.f9096j.valueAt(i).f9106e;
            C2096e.m4572h(format);
            formatArr[i] = format;
        }
        this.f9101o = formatArr;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorOutput
    /* JADX INFO: renamed from: o */
    public TrackOutput2 mo3774o(int i, int i2) {
        a aVar = this.f9096j.get(i);
        if (aVar == null) {
            C2096e.m4570f(this.f9101o == null);
            aVar = new a(i, i2, i2 == this.f9094h ? this.f9095i : null);
            aVar.m4201g(this.f9098l, this.f9099m);
            this.f9096j.put(i, aVar);
        }
        return aVar;
    }
}
