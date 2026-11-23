package p007c.p190n.p194b.p209b.p221s1.p232o0;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.o0.b, reason: use source file name */
/* JADX INFO: compiled from: WavExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class WavExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public ExtractorOutput f8456a;

    /* JADX INFO: renamed from: b */
    public TrackOutput2 f8457b;

    /* JADX INFO: renamed from: c */
    public b f8458c;

    /* JADX INFO: renamed from: d */
    public int f8459d = -1;

    /* JADX INFO: renamed from: e */
    public long f8460e = -1;

    /* JADX INFO: renamed from: c.n.b.b.s1.o0.b$a */
    /* JADX INFO: compiled from: WavExtractor.java */
    public static final class a implements b {

        /* JADX INFO: renamed from: a */
        public static final int[] f8461a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: b */
        public static final int[] f8462b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: c */
        public final ExtractorOutput f8463c;

        /* JADX INFO: renamed from: d */
        public final TrackOutput2 f8464d;

        /* JADX INFO: renamed from: e */
        public final WavHeader f8465e;

        /* JADX INFO: renamed from: f */
        public final int f8466f;

        /* JADX INFO: renamed from: g */
        public final byte[] f8467g;

        /* JADX INFO: renamed from: h */
        public final ParsableByteArray f8468h;

        /* JADX INFO: renamed from: i */
        public final int f8469i;

        /* JADX INFO: renamed from: j */
        public final Format f8470j;

        /* JADX INFO: renamed from: k */
        public int f8471k;

        /* JADX INFO: renamed from: l */
        public long f8472l;

        /* JADX INFO: renamed from: m */
        public int f8473m;

        /* JADX INFO: renamed from: n */
        public long f8474n;

        public a(ExtractorOutput extractorOutput, TrackOutput2 trackOutput2, WavHeader wavHeader) throws ParserException {
            this.f8463c = extractorOutput;
            this.f8464d = trackOutput2;
            this.f8465e = wavHeader;
            int iMax = Math.max(1, wavHeader.f8485c / 10);
            this.f8469i = iMax;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavHeader.f8488f);
            parsableByteArray.m3207l();
            int iM3207l = parsableByteArray.m3207l();
            this.f8466f = iM3207l;
            int i = wavHeader.f8484b;
            int i2 = (((wavHeader.f8486d - (i * 4)) * 8) / (wavHeader.f8487e * i)) + 1;
            if (iM3207l != i2) {
                throw new ParserException("Expected frames per block: " + i2 + "; got: " + iM3207l);
            }
            int iM3119g = Util6.m3119g(iMax, iM3207l);
            this.f8467g = new byte[wavHeader.f8486d * iM3119g];
            this.f8468h = new ParsableByteArray(iM3207l * 2 * i * iM3119g);
            int i3 = ((wavHeader.f8485c * wavHeader.f8486d) * 8) / iM3207l;
            Format.b bVar = new Format.b();
            bVar.f6958k = "audio/raw";
            bVar.f6953f = i3;
            bVar.f6954g = i3;
            bVar.f6959l = iMax * 2 * i;
            bVar.f6971x = wavHeader.f8484b;
            bVar.f6972y = wavHeader.f8485c;
            bVar.f6973z = 2;
            this.f8470j = bVar.m3519a();
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p232o0.WavExtractor.b
        /* JADX INFO: renamed from: a */
        public void mo3908a(long j2) {
            this.f8471k = 0;
            this.f8472l = j2;
            this.f8473m = 0;
            this.f8474n = 0L;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p232o0.WavExtractor.b
        /* JADX INFO: renamed from: b */
        public void mo3909b(int i, long j2) {
            this.f8463c.mo3772a(new WavSeekMap(this.f8465e, this.f8466f, i, j2));
            this.f8464d.mo3760e(this.f8470j);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003f -> B:12:0x0041). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:7:0x0029
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        @Override // p007c.p190n.p194b.p209b.p221s1.p232o0.WavExtractor.b
        /* JADX INFO: renamed from: c */
        public boolean mo3910c(p007c.p190n.p194b.p209b.p221s1.ExtractorInput r19, long r20) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p209b.p221s1.p232o0.WavExtractor.a.mo3910c(c.n.b.b.s1.i, long):boolean");
        }

        /* JADX INFO: renamed from: d */
        public final int m3911d(int i) {
            return i / (this.f8465e.f8484b * 2);
        }

        /* JADX INFO: renamed from: e */
        public final void m3912e(int i) {
            long jM3104M = this.f8472l + Util6.m3104M(this.f8474n, 1000000L, this.f8465e.f8485c);
            int i2 = i * 2 * this.f8465e.f8484b;
            this.f8464d.mo3759d(jM3104M, 1, i2, this.f8473m - i2, null);
            this.f8474n += (long) i;
            this.f8473m -= i2;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.o0.b$b */
    /* JADX INFO: compiled from: WavExtractor.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo3908a(long j2);

        /* JADX INFO: renamed from: b */
        void mo3909b(int i, long j2) throws ParserException;

        /* JADX INFO: renamed from: c */
        boolean mo3910c(ExtractorInput extractorInput, long j2) throws IOException;
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.o0.b$c */
    /* JADX INFO: compiled from: WavExtractor.java */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public final ExtractorOutput f8475a;

        /* JADX INFO: renamed from: b */
        public final TrackOutput2 f8476b;

        /* JADX INFO: renamed from: c */
        public final WavHeader f8477c;

        /* JADX INFO: renamed from: d */
        public final Format f8478d;

        /* JADX INFO: renamed from: e */
        public final int f8479e;

        /* JADX INFO: renamed from: f */
        public long f8480f;

        /* JADX INFO: renamed from: g */
        public int f8481g;

        /* JADX INFO: renamed from: h */
        public long f8482h;

        public c(ExtractorOutput extractorOutput, TrackOutput2 trackOutput2, WavHeader wavHeader, String str, int i) throws ParserException {
            this.f8475a = extractorOutput;
            this.f8476b = trackOutput2;
            this.f8477c = wavHeader;
            int i2 = (wavHeader.f8484b * wavHeader.f8487e) / 8;
            if (wavHeader.f8486d != i2) {
                StringBuilder sbM1557H = outline.m1557H("Expected block size: ", i2, "; got: ");
                sbM1557H.append(wavHeader.f8486d);
                throw new ParserException(sbM1557H.toString());
            }
            int i3 = wavHeader.f8485c;
            int i4 = i3 * i2 * 8;
            int iMax = Math.max(i2, (i3 * i2) / 10);
            this.f8479e = iMax;
            Format.b bVar = new Format.b();
            bVar.f6958k = str;
            bVar.f6953f = i4;
            bVar.f6954g = i4;
            bVar.f6959l = iMax;
            bVar.f6971x = wavHeader.f8484b;
            bVar.f6972y = wavHeader.f8485c;
            bVar.f6973z = i;
            this.f8478d = bVar.m3519a();
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p232o0.WavExtractor.b
        /* JADX INFO: renamed from: a */
        public void mo3908a(long j2) {
            this.f8480f = j2;
            this.f8481g = 0;
            this.f8482h = 0L;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p232o0.WavExtractor.b
        /* JADX INFO: renamed from: b */
        public void mo3909b(int i, long j2) {
            this.f8475a.mo3772a(new WavSeekMap(this.f8477c, 1, i, j2));
            this.f8476b.mo3760e(this.f8478d);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p232o0.WavExtractor.b
        /* JADX INFO: renamed from: c */
        public boolean mo3910c(ExtractorInput extractorInput, long j2) throws IOException {
            int i;
            int i2;
            long j3 = j2;
            while (j3 > 0 && (i = this.f8481g) < (i2 = this.f8479e)) {
                int iMo3757b = this.f8476b.mo3757b(extractorInput, (int) Math.min(i2 - i, j3), true);
                if (iMo3757b == -1) {
                    j3 = 0;
                } else {
                    this.f8481g += iMo3757b;
                    j3 -= (long) iMo3757b;
                }
            }
            WavHeader wavHeader = this.f8477c;
            int i3 = wavHeader.f8486d;
            int i4 = this.f8481g / i3;
            if (i4 > 0) {
                long jM3104M = this.f8480f + Util6.m3104M(this.f8482h, 1000000L, wavHeader.f8485c);
                int i5 = i4 * i3;
                int i6 = this.f8481g - i5;
                this.f8476b.mo3759d(jM3104M, 1, i5, i6, null);
                this.f8482h += (long) i4;
                this.f8481g = i6;
            }
            return j3 <= 0;
        }
    }

    static {
        C1807a c1807a = new ExtractorsFactory2() { // from class: c.n.b.b.s1.o0.a
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new WavExtractor()};
            }

            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: b */
            public /* synthetic */ Extractor[] mo3746b(Uri uri, Map map) {
                return ExtractorsFactory.m3807a(this, uri, map);
            }
        };
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        return C1095a.m2407w(extractorInput) != null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int iM3136x;
        int i;
        C2096e.m4572h(this.f8457b);
        int i2 = Util6.f6307a;
        if (this.f8458c == null) {
            WavHeader wavHeaderM2407w = C1095a.m2407w(extractorInput);
            if (wavHeaderM2407w == null) {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
            int i3 = wavHeaderM2407w.f8483a;
            if (i3 == 17) {
                this.f8458c = new a(this.f8456a, this.f8457b, wavHeaderM2407w);
            } else if (i3 == 6) {
                this.f8458c = new c(this.f8456a, this.f8457b, wavHeaderM2407w, "audio/g711-alaw", -1);
            } else if (i3 == 7) {
                this.f8458c = new c(this.f8456a, this.f8457b, wavHeaderM2407w, "audio/g711-mlaw", -1);
            } else {
                int i4 = wavHeaderM2407w.f8487e;
                if (i3 == 1) {
                    iM3136x = Util6.m3136x(i4);
                    i = iM3136x;
                } else if (i3 == 3) {
                    iM3136x = i4 == 32 ? 4 : 0;
                    i = iM3136x;
                } else if (i3 != 65534) {
                    i = 0;
                } else {
                    iM3136x = Util6.m3136x(i4);
                    i = iM3136x;
                }
                if (i == 0) {
                    StringBuilder sbM1556G = outline.m1556G("Unsupported WAV format type: ");
                    sbM1556G.append(wavHeaderM2407w.f8483a);
                    throw new ParserException(sbM1556G.toString());
                }
                this.f8458c = new c(this.f8456a, this.f8457b, wavHeaderM2407w, "audio/raw", i);
            }
        }
        if (this.f8459d == -1) {
            Objects.requireNonNull(extractorInput);
            extractorInput.mo3736k();
            ParsableByteArray parsableByteArray = new ParsableByteArray(8);
            WavHeaderReader wavHeaderReaderM3913a = WavHeaderReader.m3913a(extractorInput, parsableByteArray);
            while (true) {
                int i5 = wavHeaderReaderM3913a.f8489a;
                if (i5 == 1684108385) {
                    extractorInput.mo3737l(8);
                    long jMo3740p = extractorInput.mo3740p();
                    long j2 = wavHeaderReaderM3913a.f8490b + jMo3740p;
                    long jMo3729a = extractorInput.mo3729a();
                    if (jMo3729a != -1 && j2 > jMo3729a) {
                        outline.m1568S(outline.m1560K("Data exceeds input length: ", j2, ", "), jMo3729a, "WavHeaderReader");
                        j2 = jMo3729a;
                    }
                    Pair pairCreate = Pair.create(Long.valueOf(jMo3740p), Long.valueOf(j2));
                    this.f8459d = ((Long) pairCreate.first).intValue();
                    long jLongValue = ((Long) pairCreate.second).longValue();
                    this.f8460e = jLongValue;
                    this.f8458c.mo3909b(this.f8459d, jLongValue);
                    break;
                }
                if (i5 != 1380533830 && i5 != 1718449184) {
                    StringBuilder sbM1556G2 = outline.m1556G("Ignoring unknown WAV chunk: ");
                    sbM1556G2.append(wavHeaderReaderM3913a.f8489a);
                    Log.w("WavHeaderReader", sbM1556G2.toString());
                }
                long j3 = wavHeaderReaderM3913a.f8490b + 8;
                if (wavHeaderReaderM3913a.f8489a == 1380533830) {
                    j3 = 12;
                }
                if (j3 > 2147483647L) {
                    StringBuilder sbM1556G3 = outline.m1556G("Chunk is too large (~2GB+) to skip; id: ");
                    sbM1556G3.append(wavHeaderReaderM3913a.f8489a);
                    throw new ParserException(sbM1556G3.toString());
                }
                extractorInput.mo3737l((int) j3);
                wavHeaderReaderM3913a = WavHeaderReader.m3913a(extractorInput, parsableByteArray);
            }
        } else if (extractorInput.mo3740p() == 0) {
            extractorInput.mo3737l(this.f8459d);
        }
        C2096e.m4570f(this.f8460e != -1);
        return this.f8458c.mo3910c(extractorInput, this.f8460e - extractorInput.mo3740p()) ? -1 : 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f8456a = extractorOutput;
        this.f8457b = extractorOutput.mo3774o(0, 1);
        extractorOutput.mo3773j();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        b bVar = this.f8458c;
        if (bVar != null) {
            bVar.mo3908a(j3);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }
}
