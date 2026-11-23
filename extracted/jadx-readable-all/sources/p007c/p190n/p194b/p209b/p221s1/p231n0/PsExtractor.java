package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Map;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.b0, reason: use source file name */
/* JADX INFO: compiled from: PsExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class PsExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public final TimestampAdjuster f8102a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<a> f8103b;

    /* JADX INFO: renamed from: c */
    public final ParsableByteArray f8104c;

    /* JADX INFO: renamed from: d */
    public final PsDurationReader f8105d;

    /* JADX INFO: renamed from: e */
    public boolean f8106e;

    /* JADX INFO: renamed from: f */
    public boolean f8107f;

    /* JADX INFO: renamed from: g */
    public boolean f8108g;

    /* JADX INFO: renamed from: h */
    public long f8109h;

    /* JADX INFO: renamed from: i */
    public PsBinarySearchSeeker f8110i;

    /* JADX INFO: renamed from: j */
    public ExtractorOutput f8111j;

    /* JADX INFO: renamed from: k */
    public boolean f8112k;

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.b0$a */
    /* JADX INFO: compiled from: PsExtractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final ElementaryStreamReader f8113a;

        /* JADX INFO: renamed from: b */
        public final TimestampAdjuster f8114b;

        /* JADX INFO: renamed from: c */
        public final ParsableBitArray f8115c = new ParsableBitArray(new byte[64]);

        /* JADX INFO: renamed from: d */
        public boolean f8116d;

        /* JADX INFO: renamed from: e */
        public boolean f8117e;

        /* JADX INFO: renamed from: f */
        public boolean f8118f;

        /* JADX INFO: renamed from: g */
        public int f8119g;

        /* JADX INFO: renamed from: h */
        public long f8120h;

        public a(ElementaryStreamReader elementaryStreamReader, TimestampAdjuster timestampAdjuster) {
            this.f8113a = elementaryStreamReader;
            this.f8114b = timestampAdjuster;
        }
    }

    static {
        C1776d c1776d = new ExtractorsFactory2() { // from class: c.n.b.b.s1.n0.d
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new PsExtractor()};
            }

            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: b */
            public /* synthetic */ Extractor[] mo3746b(Uri uri, Map map) {
                return ExtractorsFactory.m3807a(this, uri, map);
            }
        };
    }

    public PsExtractor() {
        this(new TimestampAdjuster(0L));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        byte[] bArr = new byte[14];
        extractorInput.mo3739o(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        extractorInput.mo3733f(bArr[13] & 7);
        extractorInput.mo3739o(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        C2096e.m4572h(this.f8111j);
        long jMo3729a = extractorInput.mo3729a();
        int i = 1;
        long j2 = -9223372036854775807L;
        if (jMo3729a != -1) {
            PsDurationReader psDurationReader = this.f8105d;
            if (!psDurationReader.f8095c) {
                if (!psDurationReader.f8097e) {
                    long jMo3729a2 = extractorInput.mo3729a();
                    int iMin = (int) Math.min(20000L, jMo3729a2);
                    long j3 = jMo3729a2 - ((long) iMin);
                    if (extractorInput.mo3740p() != j3) {
                        positionHolder.f8519a = j3;
                    } else {
                        psDurationReader.f8094b.m3221z(iMin);
                        extractorInput.mo3736k();
                        extractorInput.mo3739o(psDurationReader.f8094b.f6392a, 0, iMin);
                        ParsableByteArray parsableByteArray = psDurationReader.f8094b;
                        int i2 = parsableByteArray.f6393b;
                        for (int i3 = parsableByteArray.f6394c - 4; i3 >= i2; i3--) {
                            if (psDurationReader.m3863b(parsableByteArray.f6392a, i3) == 442) {
                                parsableByteArray.m3194D(i3 + 4);
                                long jM3861c = PsDurationReader.m3861c(parsableByteArray);
                                if (jM3861c != -9223372036854775807L) {
                                    j2 = jM3861c;
                                    break;
                                }
                            }
                        }
                        psDurationReader.f8099g = j2;
                        psDurationReader.f8097e = true;
                        i = 0;
                    }
                } else {
                    if (psDurationReader.f8099g == -9223372036854775807L) {
                        psDurationReader.m3862a(extractorInput);
                        return 0;
                    }
                    if (psDurationReader.f8096d) {
                        long j4 = psDurationReader.f8098f;
                        if (j4 == -9223372036854775807L) {
                            psDurationReader.m3862a(extractorInput);
                            return 0;
                        }
                        psDurationReader.f8100h = psDurationReader.f8093a.m3085b(psDurationReader.f8099g) - psDurationReader.f8093a.m3085b(j4);
                        psDurationReader.m3862a(extractorInput);
                        return 0;
                    }
                    int iMin2 = (int) Math.min(20000L, extractorInput.mo3729a());
                    long j5 = 0;
                    if (extractorInput.mo3740p() != j5) {
                        positionHolder.f8519a = j5;
                    } else {
                        psDurationReader.f8094b.m3221z(iMin2);
                        extractorInput.mo3736k();
                        extractorInput.mo3739o(psDurationReader.f8094b.f6392a, 0, iMin2);
                        ParsableByteArray parsableByteArray2 = psDurationReader.f8094b;
                        int i4 = parsableByteArray2.f6394c;
                        for (int i5 = parsableByteArray2.f6393b; i5 < i4 - 3; i5++) {
                            if (psDurationReader.m3863b(parsableByteArray2.f6392a, i5) == 442) {
                                parsableByteArray2.m3194D(i5 + 4);
                                long jM3861c2 = PsDurationReader.m3861c(parsableByteArray2);
                                if (jM3861c2 != -9223372036854775807L) {
                                    j2 = jM3861c2;
                                    break;
                                }
                            }
                        }
                        psDurationReader.f8098f = j2;
                        psDurationReader.f8096d = true;
                        i = 0;
                    }
                }
                return i;
            }
        }
        if (!this.f8112k) {
            this.f8112k = true;
            PsDurationReader psDurationReader2 = this.f8105d;
            long j6 = psDurationReader2.f8100h;
            if (j6 != -9223372036854775807L) {
                PsBinarySearchSeeker psBinarySearchSeeker = new PsBinarySearchSeeker(psDurationReader2.f8093a, j6, jMo3729a);
                this.f8110i = psBinarySearchSeeker;
                this.f8111j.mo3772a(psBinarySearchSeeker.f7526a);
            } else {
                this.f8111j.mo3772a(new SeekMap.b(j6));
            }
        }
        PsBinarySearchSeeker psBinarySearchSeeker2 = this.f8110i;
        if (psBinarySearchSeeker2 != null && psBinarySearchSeeker2.m3711b()) {
            return this.f8110i.m3710a(extractorInput, positionHolder);
        }
        extractorInput.mo3736k();
        long jMo3732e = jMo3729a != -1 ? jMo3729a - extractorInput.mo3732e() : -1L;
        if ((jMo3732e != -1 && jMo3732e < 4) || !extractorInput.mo3731d(this.f8104c.f6392a, 0, 4, true)) {
            return -1;
        }
        this.f8104c.m3194D(0);
        int iM3201f = this.f8104c.m3201f();
        if (iM3201f == 441) {
            return -1;
        }
        if (iM3201f == 442) {
            extractorInput.mo3739o(this.f8104c.f6392a, 0, 10);
            this.f8104c.m3194D(9);
            extractorInput.mo3737l((this.f8104c.m3214s() & 7) + 14);
            return 0;
        }
        if (iM3201f == 443) {
            extractorInput.mo3739o(this.f8104c.f6392a, 0, 2);
            this.f8104c.m3194D(0);
            extractorInput.mo3737l(this.f8104c.m3219x() + 6);
            return 0;
        }
        if (((iM3201f & (-256)) >> 8) != 1) {
            extractorInput.mo3737l(1);
            return 0;
        }
        int i6 = iM3201f & 255;
        a aVar = this.f8103b.get(i6);
        if (!this.f8106e) {
            if (aVar == null) {
                ElementaryStreamReader h262Reader = null;
                if (i6 == 189) {
                    h262Reader = new Ac3Reader();
                    this.f8107f = true;
                    this.f8109h = extractorInput.mo3740p();
                } else if ((i6 & 224) == 192) {
                    h262Reader = new MpegAudioReader();
                    this.f8107f = true;
                    this.f8109h = extractorInput.mo3740p();
                } else if ((i6 & 240) == 224) {
                    h262Reader = new H262Reader();
                    this.f8108g = true;
                    this.f8109h = extractorInput.mo3740p();
                }
                if (h262Reader != null) {
                    h262Reader.mo3873e(this.f8111j, new TsPayloadReader.d(i6, 256));
                    aVar = new a(h262Reader, this.f8102a);
                    this.f8103b.put(i6, aVar);
                }
            }
            if (extractorInput.mo3740p() > ((this.f8107f && this.f8108g) ? this.f8109h + 8192 : 1048576L)) {
                this.f8106e = true;
                this.f8111j.mo3773j();
            }
        }
        extractorInput.mo3739o(this.f8104c.f6392a, 0, 2);
        this.f8104c.m3194D(0);
        int iM3219x = this.f8104c.m3219x() + 6;
        if (aVar == null) {
            extractorInput.mo3737l(iM3219x);
        } else {
            this.f8104c.m3221z(iM3219x);
            extractorInput.readFully(this.f8104c.f6392a, 0, iM3219x);
            this.f8104c.m3194D(6);
            ParsableByteArray parsableByteArray3 = this.f8104c;
            parsableByteArray3.m3200e(aVar.f8115c.f6388a, 0, 3);
            aVar.f8115c.m3187k(0);
            aVar.f8115c.m3189m(8);
            aVar.f8116d = aVar.f8115c.m3182f();
            aVar.f8117e = aVar.f8115c.m3182f();
            aVar.f8115c.m3189m(6);
            int iM3183g = aVar.f8115c.m3183g(8);
            aVar.f8119g = iM3183g;
            parsableByteArray3.m3200e(aVar.f8115c.f6388a, 0, iM3183g);
            aVar.f8115c.m3187k(0);
            aVar.f8120h = 0L;
            if (aVar.f8116d) {
                aVar.f8115c.m3189m(4);
                long jM3183g = ((long) aVar.f8115c.m3183g(3)) << 30;
                aVar.f8115c.m3189m(1);
                long jM3183g2 = jM3183g | ((long) (aVar.f8115c.m3183g(15) << 15));
                aVar.f8115c.m3189m(1);
                long jM3183g3 = jM3183g2 | ((long) aVar.f8115c.m3183g(15));
                aVar.f8115c.m3189m(1);
                if (!aVar.f8118f && aVar.f8117e) {
                    aVar.f8115c.m3189m(4);
                    long jM3183g4 = ((long) aVar.f8115c.m3183g(3)) << 30;
                    aVar.f8115c.m3189m(1);
                    long jM3183g5 = jM3183g4 | ((long) (aVar.f8115c.m3183g(15) << 15));
                    aVar.f8115c.m3189m(1);
                    long jM3183g6 = jM3183g5 | ((long) aVar.f8115c.m3183g(15));
                    aVar.f8115c.m3189m(1);
                    aVar.f8114b.m3085b(jM3183g6);
                    aVar.f8118f = true;
                }
                aVar.f8120h = aVar.f8114b.m3085b(jM3183g3);
            }
            aVar.f8113a.mo3874f(aVar.f8120h, 4);
            aVar.f8113a.mo3870b(parsableByteArray3);
            aVar.f8113a.mo3872d();
            ParsableByteArray parsableByteArray4 = this.f8104c;
            parsableByteArray4.m3193C(parsableByteArray4.f6392a.length);
        }
        return 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f8111j = extractorOutput;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        if ((this.f8102a.m3087d() == -9223372036854775807L) || (this.f8102a.m3086c() != 0 && this.f8102a.m3086c() != j3)) {
            this.f8102a.m3088e(j3);
        }
        PsBinarySearchSeeker psBinarySearchSeeker = this.f8110i;
        if (psBinarySearchSeeker != null) {
            psBinarySearchSeeker.m3714e(j3);
        }
        for (int i = 0; i < this.f8103b.size(); i++) {
            a aVarValueAt = this.f8103b.valueAt(i);
            aVarValueAt.f8118f = false;
            aVarValueAt.f8113a.mo3871c();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }

    public PsExtractor(TimestampAdjuster timestampAdjuster) {
        this.f8102a = timestampAdjuster;
        this.f8104c = new ParsableByteArray(4096);
        this.f8103b = new SparseArray<>();
        this.f8105d = new PsDurationReader();
    }
}
