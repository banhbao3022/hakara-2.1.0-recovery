package p007c.p190n.p194b.p209b.p221s1.p229l0;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
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
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.l0.d, reason: use source file name */
/* JADX INFO: compiled from: OggExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public class OggExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public ExtractorOutput f8040a;

    /* JADX INFO: renamed from: b */
    public StreamReader f8041b;

    /* JADX INFO: renamed from: c */
    public boolean f8042c;

    static {
        C1757a c1757a = new ExtractorsFactory2() { // from class: c.n.b.b.s1.l0.a
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new OggExtractor()};
            }

            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: b */
            public /* synthetic */ Extractor[] mo3746b(Uri uri, Map map) {
                return ExtractorsFactory.m3807a(this, uri, map);
            }
        };
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* JADX INFO: renamed from: a */
    public final boolean m3850a(ExtractorInput extractorInput) throws IOException {
        boolean zM2384K;
        boolean zEquals;
        OggPageHeader oggPageHeader = new OggPageHeader();
        if (oggPageHeader.m3853a(extractorInput, true) && (oggPageHeader.f8049b & 2) == 2) {
            int iMin = Math.min(oggPageHeader.f8053f, 8);
            ParsableByteArray parsableByteArray = new ParsableByteArray(iMin);
            extractorInput.mo3739o(parsableByteArray.f6392a, 0, iMin);
            parsableByteArray.m3194D(0);
            if (parsableByteArray.m3196a() >= 5 && parsableByteArray.m3214s() == 127 && parsableByteArray.m3215t() == 1179402563) {
                this.f8041b = new FlacReader();
            } else {
                parsableByteArray.m3194D(0);
                try {
                    zM2384K = C1095a.m2384K(1, parsableByteArray, true);
                } catch (ParserException unused) {
                    zM2384K = false;
                }
                if (zM2384K) {
                    this.f8041b = new VorbisReader();
                } else {
                    parsableByteArray.m3194D(0);
                    int iM3196a = parsableByteArray.m3196a();
                    byte[] bArr = OpusReader.f8056n;
                    if (iM3196a < bArr.length) {
                        zEquals = false;
                    } else {
                        byte[] bArr2 = new byte[bArr.length];
                        int length = bArr.length;
                        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr2, 0, length);
                        parsableByteArray.f6393b += length;
                        zEquals = Arrays.equals(bArr2, bArr);
                    }
                    if (zEquals) {
                        this.f8041b = new OpusReader();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        try {
            return m3850a(extractorInput);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        boolean z;
        int i;
        OggPacket oggPacket;
        ParsableByteArray parsableByteArray;
        byte[] bArr;
        C2096e.m4572h(this.f8040a);
        if (this.f8041b == null) {
            if (!m3850a(extractorInput)) {
                throw new ParserException("Failed to determine bitstream type");
            }
            extractorInput.mo3736k();
        }
        if (!this.f8042c) {
            TrackOutput2 trackOutput2Mo3774o = this.f8040a.mo3774o(0, 1);
            this.f8040a.mo3773j();
            StreamReader streamReader = this.f8041b;
            streamReader.f8060c = this.f8040a;
            streamReader.f8059b = trackOutput2Mo3774o;
            streamReader.mo3849e(true);
            this.f8042c = true;
        }
        StreamReader streamReader2 = this.f8041b;
        C2096e.m4572h(streamReader2.f8059b);
        int i2 = Util6.f6307a;
        int i3 = streamReader2.f8065h;
        if (i3 == 0) {
            while (true) {
                if (!streamReader2.f8058a.m3852b(extractorInput)) {
                    streamReader2.f8065h = 3;
                    z = false;
                    break;
                }
                long jMo3740p = extractorInput.mo3740p();
                long j2 = streamReader2.f8063f;
                streamReader2.f8068k = jMo3740p - j2;
                if (!streamReader2.mo3848d(streamReader2.f8058a.f8044b, j2, streamReader2.f8067j)) {
                    z = true;
                    break;
                }
                streamReader2.f8063f = extractorInput.mo3740p();
            }
            if (z) {
                Format format = streamReader2.f8067j.f8071a;
                streamReader2.f8066i = format.f6916E;
                if (!streamReader2.f8070m) {
                    streamReader2.f8059b.mo3760e(format);
                    streamReader2.f8070m = true;
                }
                OggSeeker oggSeeker = streamReader2.f8067j.f8072b;
                if (oggSeeker == null) {
                    if (extractorInput.mo3729a() == -1) {
                        streamReader2.f8061d = new StreamReader.c(null);
                    } else {
                        OggPageHeader oggPageHeader = streamReader2.f8058a.f8043a;
                        i = 2;
                        streamReader2.f8061d = new DefaultOggSeeker(streamReader2, streamReader2.f8063f, extractorInput.mo3729a(), oggPageHeader.f8052e + oggPageHeader.f8053f, oggPageHeader.f8050c, (oggPageHeader.f8049b & 4) != 0);
                    }
                    streamReader2.f8065h = i;
                    oggPacket = streamReader2.f8058a;
                    parsableByteArray = oggPacket.f8044b;
                    bArr = parsableByteArray.f6392a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    parsableByteArray.m3192B(Arrays.copyOf(bArr, Math.max(65025, parsableByteArray.f6394c)), oggPacket.f8044b.f6394c);
                    return 0;
                }
                streamReader2.f8061d = oggSeeker;
                i = 2;
                streamReader2.f8065h = i;
                oggPacket = streamReader2.f8058a;
                parsableByteArray = oggPacket.f8044b;
                bArr = parsableByteArray.f6392a;
                if (bArr.length == 65025) {
                    return 0;
                }
                parsableByteArray.m3192B(Arrays.copyOf(bArr, Math.max(65025, parsableByteArray.f6394c)), oggPacket.f8044b.f6394c);
                return 0;
            }
        } else {
            if (i3 == 1) {
                extractorInput.mo3737l((int) streamReader2.f8063f);
                streamReader2.f8065h = 2;
                return 0;
            }
            if (i3 == 2) {
                long jMo3845b = streamReader2.f8061d.mo3845b(extractorInput);
                if (jMo3845b >= 0) {
                    positionHolder.f8519a = jMo3845b;
                    return 1;
                }
                if (jMo3845b < -1) {
                    streamReader2.mo3857b(-(jMo3845b + 2));
                }
                if (!streamReader2.f8069l) {
                    SeekMap seekMapMo3844a = streamReader2.f8061d.mo3844a();
                    C2096e.m4572h(seekMapMo3844a);
                    streamReader2.f8060c.mo3772a(seekMapMo3844a);
                    streamReader2.f8069l = true;
                }
                if (streamReader2.f8068k > 0 || streamReader2.f8058a.m3852b(extractorInput)) {
                    streamReader2.f8068k = 0L;
                    ParsableByteArray parsableByteArray2 = streamReader2.f8058a.f8044b;
                    long jMo3847c = streamReader2.mo3847c(parsableByteArray2);
                    if (jMo3847c >= 0) {
                        long j3 = streamReader2.f8064g;
                        if (j3 + jMo3847c >= streamReader2.f8062e) {
                            long j4 = (j3 * 1000000) / ((long) streamReader2.f8066i);
                            streamReader2.f8059b.mo3758c(parsableByteArray2, parsableByteArray2.f6394c);
                            streamReader2.f8059b.mo3759d(j4, 1, parsableByteArray2.f6394c, 0, null);
                            streamReader2.f8062e = -1L;
                        }
                    }
                    streamReader2.f8064g += jMo3847c;
                    return 0;
                }
                streamReader2.f8065h = 3;
            } else if (i3 != 3) {
                throw new IllegalStateException();
            }
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f8040a = extractorOutput;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        StreamReader streamReader = this.f8041b;
        if (streamReader != null) {
            OggPacket oggPacket = streamReader.f8058a;
            oggPacket.f8043a.m3854b();
            oggPacket.f8044b.m3221z(0);
            oggPacket.f8045c = -1;
            oggPacket.f8047e = false;
            if (j2 == 0) {
                streamReader.mo3849e(!streamReader.f8069l);
                return;
            }
            if (streamReader.f8065h != 0) {
                long j4 = (((long) streamReader.f8066i) * j3) / 1000000;
                streamReader.f8062e = j4;
                OggSeeker oggSeeker = streamReader.f8061d;
                int i = Util6.f6307a;
                oggSeeker.mo3846c(j4);
                streamReader.f8065h = 2;
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }
}
