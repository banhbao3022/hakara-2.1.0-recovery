package p007c.p190n.p194b.p209b.p221s1.p223f0;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.FlacFrameReader;
import p007c.p190n.p194b.p209b.p221s1.FlacMetadataReader;
import p007c.p190n.p194b.p209b.p221s1.FlacSeekTableSeekMap;
import p007c.p190n.p194b.p209b.p221s1.FlacStreamMetadata;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.p237k.PictureFrame;
import p007c.p190n.p378c.p379a.Charsets;

/* JADX INFO: renamed from: c.n.b.b.s1.f0.d, reason: use source file name */
/* JADX INFO: compiled from: FlacExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class FlacExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public final byte[] f7607a;

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f7608b;

    /* JADX INFO: renamed from: c */
    public final boolean f7609c;

    /* JADX INFO: renamed from: d */
    public final FlacFrameReader.a f7610d;

    /* JADX INFO: renamed from: e */
    public ExtractorOutput f7611e;

    /* JADX INFO: renamed from: f */
    public TrackOutput2 f7612f;

    /* JADX INFO: renamed from: g */
    public int f7613g;

    /* JADX INFO: renamed from: h */
    public Metadata f7614h;

    /* JADX INFO: renamed from: i */
    public FlacStreamMetadata f7615i;

    /* JADX INFO: renamed from: j */
    public int f7616j;

    /* JADX INFO: renamed from: k */
    public int f7617k;

    /* JADX INFO: renamed from: l */
    public FlacBinarySearchSeeker f7618l;

    /* JADX INFO: renamed from: m */
    public int f7619m;

    /* JADX INFO: renamed from: n */
    public long f7620n;

    static {
        C1704a c1704a = new ExtractorsFactory2() { // from class: c.n.b.b.s1.f0.a
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new FlacExtractor()};
            }

            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: b */
            public /* synthetic */ Extractor[] mo3746b(Uri uri, Map map) {
                return ExtractorsFactory.m3807a(this, uri, map);
            }
        };
    }

    public FlacExtractor() {
        this(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m3755a() {
        long j2 = this.f7620n * 1000000;
        FlacStreamMetadata flacStreamMetadata = this.f7615i;
        int i = Util6.f6307a;
        this.f7612f.mo3759d(j2 / ((long) flacStreamMetadata.f8500e), 1, this.f7619m, 0, null);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        C1095a.m2408x(extractorInput, false);
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        extractorInput.mo3739o(parsableByteArray.f6392a, 0, 4);
        return parsableByteArray.m3215t() == 1716281667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        boolean z;
        SeekMap bVar;
        boolean z2;
        long j2;
        boolean zM3859b;
        int i = this.f7613g;
        ?? r4 = 0;
        if (i == 0) {
            boolean z3 = !this.f7609c;
            extractorInput.mo3736k();
            long jMo3732e = extractorInput.mo3732e();
            Metadata metadataM2408x = C1095a.m2408x(extractorInput, z3);
            extractorInput.mo3737l((int) (extractorInput.mo3732e() - jMo3732e));
            this.f7614h = metadataM2408x;
            this.f7613g = 1;
            return 0;
        }
        if (i == 1) {
            byte[] bArr = this.f7607a;
            extractorInput.mo3739o(bArr, 0, bArr.length);
            extractorInput.mo3736k();
            this.f7613g = 2;
            return 0;
        }
        int i2 = 3;
        if (i == 2) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(4);
            extractorInput.readFully(parsableByteArray.f6392a, 0, 4);
            if (parsableByteArray.m3215t() != 1716281667) {
                throw new ParserException("Failed to read FLAC stream marker.");
            }
            this.f7613g = 3;
            return 0;
        }
        int i3 = 7;
        int i4 = 6;
        if (i == 3) {
            FlacMetadataReader flacMetadataReader = new FlacMetadataReader(this.f7615i);
            boolean z4 = false;
            while (!z4) {
                extractorInput.mo3736k();
                ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[4]);
                extractorInput.mo3739o(parsableBitArray.f6388a, r4, 4);
                boolean zM3182f = parsableBitArray.m3182f();
                int iM3183g = parsableBitArray.m3183g(i3);
                int iM3183g2 = parsableBitArray.m3183g(24) + 4;
                if (iM3183g == 0) {
                    byte[] bArr2 = new byte[38];
                    extractorInput.readFully(bArr2, r4, 38);
                    flacMetadataReader.f8091a = new FlacStreamMetadata(bArr2, 4);
                } else {
                    FlacStreamMetadata flacStreamMetadata = flacMetadataReader.f8091a;
                    if (flacStreamMetadata == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iM3183g == i2) {
                        ParsableByteArray parsableByteArray2 = new ParsableByteArray(iM3183g2);
                        extractorInput.readFully(parsableByteArray2.f6392a, r4, iM3183g2);
                        flacMetadataReader.f8091a = flacStreamMetadata.m3918b(C1095a.m2375B(parsableByteArray2));
                    } else if (iM3183g == 4) {
                        ParsableByteArray parsableByteArray3 = new ParsableByteArray(iM3183g2);
                        extractorInput.readFully(parsableByteArray3.f6392a, r4, iM3183g2);
                        parsableByteArray3.m3195E(4);
                        z = zM3182f;
                        flacMetadataReader.f8091a = new FlacStreamMetadata(flacStreamMetadata.f8496a, flacStreamMetadata.f8497b, flacStreamMetadata.f8498c, flacStreamMetadata.f8499d, flacStreamMetadata.f8500e, flacStreamMetadata.f8502g, flacStreamMetadata.f8503h, flacStreamMetadata.f8505j, flacStreamMetadata.f8506k, flacStreamMetadata.m3921f(FlacStreamMetadata.m3915a(Arrays.asList(C1095a.m2376C(parsableByteArray3, r4, r4).f7549a), Collections.emptyList())));
                    } else {
                        z = zM3182f;
                        if (iM3183g == i4) {
                            ParsableByteArray parsableByteArray4 = new ParsableByteArray(iM3183g2);
                            extractorInput.readFully(parsableByteArray4.f6392a, 0, iM3183g2);
                            parsableByteArray4.m3195E(4);
                            int iM3201f = parsableByteArray4.m3201f();
                            String strM3212q = parsableByteArray4.m3212q(parsableByteArray4.m3201f(), Charsets.f26129a);
                            String strM3211p = parsableByteArray4.m3211p(parsableByteArray4.m3201f());
                            int iM3201f2 = parsableByteArray4.m3201f();
                            int iM3201f3 = parsableByteArray4.m3201f();
                            int iM3201f4 = parsableByteArray4.m3201f();
                            int iM3201f5 = parsableByteArray4.m3201f();
                            int iM3201f6 = parsableByteArray4.m3201f();
                            byte[] bArr3 = new byte[iM3201f6];
                            System.arraycopy(parsableByteArray4.f6392a, parsableByteArray4.f6393b, bArr3, 0, iM3201f6);
                            parsableByteArray4.f6393b += iM3201f6;
                            flacMetadataReader.f8091a = new FlacStreamMetadata(flacStreamMetadata.f8496a, flacStreamMetadata.f8497b, flacStreamMetadata.f8498c, flacStreamMetadata.f8499d, flacStreamMetadata.f8500e, flacStreamMetadata.f8502g, flacStreamMetadata.f8503h, flacStreamMetadata.f8505j, flacStreamMetadata.f8506k, flacStreamMetadata.m3921f(FlacStreamMetadata.m3915a(Collections.emptyList(), Collections.singletonList(new PictureFrame(iM3201f, strM3212q, strM3211p, iM3201f2, iM3201f3, iM3201f4, iM3201f5, bArr3)))));
                        } else {
                            extractorInput.mo3737l(iM3183g2);
                        }
                    }
                    FlacStreamMetadata flacStreamMetadata2 = flacMetadataReader.f8091a;
                    int i5 = Util6.f6307a;
                    this.f7615i = flacStreamMetadata2;
                    z4 = z;
                    r4 = 0;
                    i2 = 3;
                    i3 = 7;
                    i4 = 6;
                }
                z = zM3182f;
                FlacStreamMetadata flacStreamMetadata3 = flacMetadataReader.f8091a;
                int i6 = Util6.f6307a;
                this.f7615i = flacStreamMetadata3;
                z4 = z;
                r4 = 0;
                i2 = 3;
                i3 = 7;
                i4 = 6;
            }
            Objects.requireNonNull(this.f7615i);
            this.f7616j = Math.max(this.f7615i.f8498c, 6);
            TrackOutput2 trackOutput2 = this.f7612f;
            int i7 = Util6.f6307a;
            trackOutput2.mo3760e(this.f7615i.m3920e(this.f7607a, this.f7614h));
            this.f7613g = 4;
            return 0;
        }
        if (i == 4) {
            extractorInput.mo3736k();
            ParsableByteArray parsableByteArray5 = new ParsableByteArray(2);
            extractorInput.mo3739o(parsableByteArray5.f6392a, 0, 2);
            int iM3219x = parsableByteArray5.m3219x();
            if ((iM3219x >> 2) != 16382) {
                extractorInput.mo3736k();
                throw new ParserException("First frame does not start with sync code.");
            }
            extractorInput.mo3736k();
            this.f7617k = iM3219x;
            ExtractorOutput extractorOutput = this.f7611e;
            int i8 = Util6.f6307a;
            long jMo3740p = extractorInput.mo3740p();
            long jMo3729a = extractorInput.mo3729a();
            Objects.requireNonNull(this.f7615i);
            FlacStreamMetadata flacStreamMetadata4 = this.f7615i;
            if (flacStreamMetadata4.f8506k != null) {
                bVar = new FlacSeekTableSeekMap(flacStreamMetadata4, jMo3740p);
            } else if (jMo3729a == -1 || flacStreamMetadata4.f8505j <= 0) {
                bVar = new SeekMap.b(flacStreamMetadata4.m3919d());
            } else {
                FlacBinarySearchSeeker flacBinarySearchSeeker = new FlacBinarySearchSeeker(flacStreamMetadata4, this.f7617k, jMo3740p, jMo3729a);
                this.f7618l = flacBinarySearchSeeker;
                bVar = flacBinarySearchSeeker.f7526a;
            }
            extractorOutput.mo3772a(bVar);
            this.f7613g = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        Objects.requireNonNull(this.f7612f);
        Objects.requireNonNull(this.f7615i);
        FlacBinarySearchSeeker flacBinarySearchSeeker2 = this.f7618l;
        if (flacBinarySearchSeeker2 != null && flacBinarySearchSeeker2.m3711b()) {
            return this.f7618l.m3710a(extractorInput, positionHolder);
        }
        if (this.f7620n == -1) {
            FlacStreamMetadata flacStreamMetadata5 = this.f7615i;
            extractorInput.mo3736k();
            extractorInput.mo3733f(1);
            byte[] bArr4 = new byte[1];
            extractorInput.mo3739o(bArr4, 0, 1);
            z2 = (bArr4[0] & 1) == 1;
            extractorInput.mo3733f(2);
            i3 = z2 ? 7 : 6;
            ParsableByteArray parsableByteArray6 = new ParsableByteArray(i3);
            parsableByteArray6.m3193C(C1095a.m2409y(extractorInput, parsableByteArray6.f6392a, 0, i3));
            extractorInput.mo3736k();
            FlacFrameReader.a aVar = new FlacFrameReader.a();
            if (!FlacFrameReader.m3858a(parsableByteArray6, flacStreamMetadata5, z2, aVar)) {
                throw new ParserException();
            }
            this.f7620n = aVar.f8082a;
            return 0;
        }
        ParsableByteArray parsableByteArray7 = this.f7608b;
        int i9 = parsableByteArray7.f6394c;
        if (i9 < 32768) {
            int i10 = extractorInput.read(parsableByteArray7.f6392a, i9, 32768 - i9);
            z2 = i10 == -1;
            if (!z2) {
                this.f7608b.m3193C(i9 + i10);
            } else if (this.f7608b.m3196a() == 0) {
                m3755a();
                return -1;
            }
        } else {
            z2 = false;
        }
        ParsableByteArray parsableByteArray8 = this.f7608b;
        int i11 = parsableByteArray8.f6393b;
        int i12 = this.f7619m;
        int i13 = this.f7616j;
        if (i12 < i13) {
            parsableByteArray8.m3195E(Math.min(i13 - i12, parsableByteArray8.m3196a()));
        }
        ParsableByteArray parsableByteArray9 = this.f7608b;
        Objects.requireNonNull(this.f7615i);
        int i14 = parsableByteArray9.f6393b;
        while (true) {
            if (i14 > parsableByteArray9.f6394c - 16) {
                if (z2) {
                    while (true) {
                        int i15 = parsableByteArray9.f6394c;
                        if (i14 <= i15 - this.f7616j) {
                            parsableByteArray9.m3194D(i14);
                            try {
                                zM3859b = FlacFrameReader.m3859b(parsableByteArray9, this.f7615i, this.f7617k, this.f7610d);
                            } catch (IndexOutOfBoundsException unused) {
                                zM3859b = false;
                            }
                            if (parsableByteArray9.f6393b > parsableByteArray9.f6394c) {
                                zM3859b = false;
                            }
                            if (zM3859b) {
                                parsableByteArray9.m3194D(i14);
                                j2 = this.f7610d.f8082a;
                                break;
                            }
                            i14++;
                        } else {
                            parsableByteArray9.m3194D(i15);
                        }
                    }
                } else {
                    parsableByteArray9.m3194D(i14);
                }
                j2 = -1;
                break;
            }
            parsableByteArray9.m3194D(i14);
            if (FlacFrameReader.m3859b(parsableByteArray9, this.f7615i, this.f7617k, this.f7610d)) {
                parsableByteArray9.m3194D(i14);
                j2 = this.f7610d.f8082a;
                break;
            }
            i14++;
        }
        ParsableByteArray parsableByteArray10 = this.f7608b;
        int i16 = parsableByteArray10.f6393b - i11;
        parsableByteArray10.m3194D(i11);
        this.f7612f.mo3758c(this.f7608b, i16);
        this.f7619m += i16;
        if (j2 != -1) {
            m3755a();
            this.f7619m = 0;
            this.f7620n = j2;
        }
        if (this.f7608b.m3196a() >= 16) {
            return 0;
        }
        int iM3196a = this.f7608b.m3196a();
        ParsableByteArray parsableByteArray11 = this.f7608b;
        byte[] bArr5 = parsableByteArray11.f6392a;
        System.arraycopy(bArr5, parsableByteArray11.f6393b, bArr5, 0, iM3196a);
        this.f7608b.m3194D(0);
        this.f7608b.m3193C(iM3196a);
        return 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f7611e = extractorOutput;
        this.f7612f = extractorOutput.mo3774o(0, 1);
        extractorOutput.mo3773j();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        if (j2 == 0) {
            this.f7613g = 0;
        } else {
            FlacBinarySearchSeeker flacBinarySearchSeeker = this.f7618l;
            if (flacBinarySearchSeeker != null) {
                flacBinarySearchSeeker.m3714e(j3);
            }
        }
        this.f7620n = j3 != 0 ? -1L : 0L;
        this.f7619m = 0;
        this.f7608b.m3221z(0);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }

    public FlacExtractor(int i) {
        this.f7607a = new byte[42];
        this.f7608b = new ParsableByteArray(new byte[32768], 0);
        this.f7609c = (i & 1) != 0;
        this.f7610d = new FlacFrameReader.a();
        this.f7613g = 0;
    }
}
