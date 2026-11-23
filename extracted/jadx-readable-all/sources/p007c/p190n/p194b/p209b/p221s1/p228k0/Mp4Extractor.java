package p007c.p190n.p194b.p209b.p221s1.p228k0;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.NalUnitUtil;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p215n1.Ac4Util;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.GaplessInfoHolder;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.SeekPoint;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.p239m.Id3Frame;
import p007c.p190n.p194b.p209b.p234u1.p239m.InternalFrame;
import p007c.p190n.p194b.p209b.p234u1.p239m.TextInformationFrame;
import p007c.p190n.p194b.p209b.p234u1.p240n.MdtaMetadataEntry;
import p007c.p190n.p194b.p209b.p234u1.p240n.MotionPhotoMetadata;
import p007c.p190n.p194b.p209b.p234u1.p240n.SlowMotionData;
import p007c.p190n.p194b.p209b.p234u1.p240n.SmtaMetadataEntry;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p379a.Function;

/* JADX INFO: renamed from: c.n.b.b.s1.k0.i, reason: use source file name */
/* JADX INFO: compiled from: Mp4Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class Mp4Extractor implements Extractor, SeekMap {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f7938a = 0;

    /* JADX INFO: renamed from: b */
    public final int f7939b;

    /* JADX INFO: renamed from: c */
    public final ParsableByteArray f7940c;

    /* JADX INFO: renamed from: d */
    public final ParsableByteArray f7941d;

    /* JADX INFO: renamed from: e */
    public final ParsableByteArray f7942e;

    /* JADX INFO: renamed from: f */
    public final ParsableByteArray f7943f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque<Atom.a> f7944g;

    /* JADX INFO: renamed from: h */
    public final SefReader f7945h;

    /* JADX INFO: renamed from: i */
    public final List<Metadata.b> f7946i;

    /* JADX INFO: renamed from: j */
    public int f7947j;

    /* JADX INFO: renamed from: k */
    public int f7948k;

    /* JADX INFO: renamed from: l */
    public long f7949l;

    /* JADX INFO: renamed from: m */
    public int f7950m;

    /* JADX INFO: renamed from: n */
    public ParsableByteArray f7951n;

    /* JADX INFO: renamed from: o */
    public int f7952o;

    /* JADX INFO: renamed from: p */
    public int f7953p;

    /* JADX INFO: renamed from: q */
    public int f7954q;

    /* JADX INFO: renamed from: r */
    public int f7955r;

    /* JADX INFO: renamed from: s */
    public ExtractorOutput f7956s;

    /* JADX INFO: renamed from: t */
    public a[] f7957t;

    /* JADX INFO: renamed from: u */
    public long[][] f7958u;

    /* JADX INFO: renamed from: v */
    public int f7959v;

    /* JADX INFO: renamed from: w */
    public long f7960w;

    /* JADX INFO: renamed from: x */
    public int f7961x;

    /* JADX INFO: renamed from: y */
    public MotionPhotoMetadata f7962y;

    /* JADX INFO: renamed from: c.n.b.b.s1.k0.i$a */
    /* JADX INFO: compiled from: Mp4Extractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Track f7963a;

        /* JADX INFO: renamed from: b */
        public final TrackSampleTable f7964b;

        /* JADX INFO: renamed from: c */
        public final TrackOutput2 f7965c;

        /* JADX INFO: renamed from: d */
        public int f7966d;

        public a(Track track, TrackSampleTable trackSampleTable, TrackOutput2 trackOutput2) {
            this.f7963a = track;
            this.f7964b = trackSampleTable;
            this.f7965c = trackOutput2;
        }
    }

    static {
        C1741b c1741b = new ExtractorsFactory2() { // from class: c.n.b.b.s1.k0.b
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new Mp4Extractor()};
            }

            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: b */
            public /* synthetic */ Extractor[] mo3746b(Uri uri, Map map) {
                return ExtractorsFactory.m3807a(this, uri, map);
            }
        };
    }

    public Mp4Extractor() {
        this(0);
    }

    /* JADX INFO: renamed from: k */
    public static long m3837k(TrackSampleTable trackSampleTable, long j2, long j3) {
        int iM3842a = trackSampleTable.m3842a(j2);
        if (iM3842a == -1) {
            iM3842a = trackSampleTable.m3843b(j2);
        }
        return iM3842a == -1 ? j3 : Math.min(trackSampleTable.f8014c[iM3842a], j3);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        return Sniffer2.m3840a(extractorInput, false, (this.f7939b & 2) != 0);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: d */
    public boolean mo3716d() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:229:0x0447  */
    /* JADX WARN: Code duplicated, block: B:250:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:251:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:253:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:260:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:263:0x050e  */
    /* JADX WARN: Code duplicated, block: B:278:0x0536  */
    /* JADX WARN: Code duplicated, block: B:281:0x053c  */
    /* JADX WARN: Code duplicated, block: B:287:0x056e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0592  */
    /* JADX WARN: Code duplicated, block: B:292:0x0596  */
    /* JADX WARN: Code duplicated, block: B:294:0x059c  */
    /* JADX WARN: Code duplicated, block: B:330:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:332:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:334:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:335:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:338:0x0609  */
    /* JADX WARN: Code duplicated, block: B:339:0x060b  */
    /* JADX WARN: Code duplicated, block: B:341:0x0629  */
    /* JADX WARN: Code duplicated, block: B:343:0x0639  */
    /* JADX WARN: Code duplicated, block: B:355:0x044a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0659 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i;
        int i2;
        char c2;
        boolean z;
        boolean z2;
        long j2;
        long jMo3729a;
        Atom.a aVarPeek;
        long j3;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        long j4;
        long j5;
        boolean z5;
        boolean z6;
        boolean z7;
        long j6;
        long j7;
        long j8;
        ParsableByteArray parsableByteArray;
        int i5;
        while (true) {
            int i6 = this.f7947j;
            int i7 = 4;
            int i8 = 2;
            if (i6 == 0) {
                if (this.f7950m != 0) {
                    j2 = this.f7949l;
                    if (j2 == 1) {
                        extractorInput.readFully(this.f7943f.f6392a, 8, 8);
                        this.f7950m += 8;
                        this.f7949l = this.f7943f.m3218w();
                    } else if (j2 == 0) {
                        jMo3729a = extractorInput.mo3729a();
                        if (jMo3729a == -1 && (aVarPeek = this.f7944g.peek()) != null) {
                            jMo3729a = aVarPeek.f7854b;
                        }
                        if (jMo3729a != -1) {
                            this.f7949l = (jMo3729a - extractorInput.mo3740p()) + ((long) this.f7950m);
                        }
                    }
                    j3 = this.f7949l;
                    i3 = this.f7950m;
                    if (j3 >= i3) {
                        throw new ParserException("Atom size less than header length (unsupported).");
                    }
                    i4 = this.f7948k;
                    if (i4 != 1836019574 || i4 == 1953653099 || i4 == 1835297121 || i4 == 1835626086 || i4 == 1937007212 || i4 == 1701082227 || i4 == 1835365473) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        long jMo3740p = extractorInput.mo3740p();
                        j6 = this.f7949l;
                        j7 = this.f7950m;
                        j8 = (jMo3740p + j6) - j7;
                        if (j6 != j7 && this.f7948k == 1835365473) {
                            this.f7942e.m3221z(8);
                            extractorInput.mo3739o(this.f7942e.f6392a, 0, 8);
                            parsableByteArray = this.f7942e;
                            byte[] bArr = AtomParsers.f7858a;
                            i5 = parsableByteArray.f6393b;
                            parsableByteArray.m3195E(4);
                            if (parsableByteArray.m3201f() != 1751411826) {
                                i5 += 4;
                            }
                            parsableByteArray.m3194D(i5);
                            extractorInput.mo3737l(this.f7942e.f6393b);
                            extractorInput.mo3736k();
                        }
                        this.f7944g.push(new Atom.a(this.f7948k, j8));
                        if (this.f7949l == this.f7950m) {
                            m3839l(j8);
                        } else {
                            m3838j();
                        }
                    } else {
                        if (i4 != 1835296868 || i4 == 1836476516 || i4 == 1751411826 || i4 == 1937011556 || i4 == 1937011827 || i4 == 1937011571 || i4 == 1668576371 || i4 == 1701606260 || i4 == 1937011555 || i4 == 1937011578 || i4 == 1937013298 || i4 == 1937007471 || i4 == 1668232756 || i4 == 1953196132 || i4 == 1718909296 || i4 == 1969517665 || i4 == 1801812339 || i4 == 1768715124) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            if (i3 == 8) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            C2096e.m4570f(z5);
                            if (this.f7949l <= 2147483647L) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            C2096e.m4570f(z6);
                            ParsableByteArray parsableByteArray2 = new ParsableByteArray((int) this.f7949l);
                            System.arraycopy(this.f7943f.f6392a, 0, parsableByteArray2.f6392a, 0, 8);
                            this.f7951n = parsableByteArray2;
                            this.f7947j = 1;
                        } else {
                            long jMo3740p2 = extractorInput.mo3740p();
                            j4 = this.f7950m;
                            j5 = jMo3740p2 - j4;
                            if (this.f7948k == 1836086884) {
                                this.f7962y = new MotionPhotoMetadata(0L, j5, -9223372036854775807L, j5 + j4, this.f7949l - j4);
                            }
                            this.f7951n = null;
                            this.f7947j = 1;
                        }
                    }
                    z7 = true;
                } else if (extractorInput.mo3730b(this.f7943f.f6392a, 0, 8, true)) {
                    this.f7950m = 8;
                    this.f7943f.m3194D(0);
                    this.f7949l = this.f7943f.m3215t();
                    this.f7948k = this.f7943f.m3201f();
                    j2 = this.f7949l;
                    if (j2 == 1) {
                        extractorInput.readFully(this.f7943f.f6392a, 8, 8);
                        this.f7950m += 8;
                        this.f7949l = this.f7943f.m3218w();
                    } else if (j2 == 0) {
                        jMo3729a = extractorInput.mo3729a();
                        if (jMo3729a == -1) {
                            jMo3729a = aVarPeek.f7854b;
                        }
                        if (jMo3729a != -1) {
                            this.f7949l = (jMo3729a - extractorInput.mo3740p()) + ((long) this.f7950m);
                        }
                    }
                    j3 = this.f7949l;
                    i3 = this.f7950m;
                    if (j3 >= i3) {
                        throw new ParserException("Atom size less than header length (unsupported).");
                    }
                    i4 = this.f7948k;
                    if (i4 != 1836019574) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        long jMo3740p3 = extractorInput.mo3740p();
                        j6 = this.f7949l;
                        j7 = this.f7950m;
                        j8 = (jMo3740p3 + j6) - j7;
                        if (j6 != j7) {
                            this.f7942e.m3221z(8);
                            extractorInput.mo3739o(this.f7942e.f6392a, 0, 8);
                            parsableByteArray = this.f7942e;
                            byte[] bArr2 = AtomParsers.f7858a;
                            i5 = parsableByteArray.f6393b;
                            parsableByteArray.m3195E(4);
                            if (parsableByteArray.m3201f() != 1751411826) {
                                i5 += 4;
                            }
                            parsableByteArray.m3194D(i5);
                            extractorInput.mo3737l(this.f7942e.f6393b);
                            extractorInput.mo3736k();
                        }
                        this.f7944g.push(new Atom.a(this.f7948k, j8));
                        if (this.f7949l == this.f7950m) {
                            m3839l(j8);
                        } else {
                            m3838j();
                        }
                    } else {
                        if (i4 != 1835296868) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            if (i3 == 8) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            C2096e.m4570f(z5);
                            if (this.f7949l <= 2147483647L) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            C2096e.m4570f(z6);
                            ParsableByteArray parsableByteArray3 = new ParsableByteArray((int) this.f7949l);
                            System.arraycopy(this.f7943f.f6392a, 0, parsableByteArray3.f6392a, 0, 8);
                            this.f7951n = parsableByteArray3;
                            this.f7947j = 1;
                        } else {
                            long jMo3740p4 = extractorInput.mo3740p();
                            j4 = this.f7950m;
                            j5 = jMo3740p4 - j4;
                            if (this.f7948k == 1836086884) {
                                this.f7962y = new MotionPhotoMetadata(0L, j5, -9223372036854775807L, j5 + j4, this.f7949l - j4);
                            }
                            this.f7951n = null;
                            this.f7947j = 1;
                        }
                    }
                    z7 = true;
                } else {
                    if (this.f7961x == 2 && (this.f7939b & 2) != 0) {
                        ExtractorOutput extractorOutput = this.f7956s;
                        Objects.requireNonNull(extractorOutput);
                        TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(0, 4);
                        MotionPhotoMetadata motionPhotoMetadata = this.f7962y;
                        Metadata metadata = motionPhotoMetadata != null ? new Metadata(motionPhotoMetadata) : null;
                        Format.b bVar = new Format.b();
                        bVar.f6956i = metadata;
                        trackOutput2Mo3774o.mo3760e(bVar.m3519a());
                        extractorOutput.mo3773j();
                        extractorOutput.mo3772a(new SeekMap.b(-9223372036854775807L));
                    }
                    z7 = false;
                }
                if (!z7) {
                    return -1;
                }
            } else {
                if (i6 != 1) {
                    if (i6 == 2) {
                        long jMo3740p5 = extractorInput.mo3740p();
                        if (this.f7952o == -1) {
                            long j9 = Long.MAX_VALUE;
                            long j10 = Long.MAX_VALUE;
                            long j11 = Long.MAX_VALUE;
                            int i9 = -1;
                            int i10 = -1;
                            boolean z8 = true;
                            boolean z9 = true;
                            int i11 = 0;
                            while (true) {
                                a[] aVarArr = this.f7957t;
                                int i12 = Util6.f6307a;
                                if (i11 >= aVarArr.length) {
                                    break;
                                }
                                a aVar = aVarArr[i11];
                                int i13 = aVar.f7966d;
                                TrackSampleTable trackSampleTable = aVar.f7964b;
                                if (i13 != trackSampleTable.f8013b) {
                                    long j12 = trackSampleTable.f8014c[i13];
                                    long j13 = this.f7958u[i11][i13];
                                    long j14 = j12 - jMo3740p5;
                                    boolean z10 = j14 < 0 || j14 >= 262144;
                                    if ((!z10 && z9) || (z10 == z9 && j14 < j11)) {
                                        i10 = i11;
                                        z9 = z10;
                                        j10 = j13;
                                        j11 = j14;
                                    }
                                    if (j13 < j9) {
                                        i9 = i11;
                                        z8 = z10;
                                        j9 = j13;
                                    }
                                }
                                i11++;
                            }
                            if (j9 == Long.MAX_VALUE || !z8 || j10 < j9 + 10485760) {
                                i9 = i10;
                            }
                            this.f7952o = i9;
                            if (i9 == -1) {
                                return -1;
                            }
                        }
                        a[] aVarArr2 = this.f7957t;
                        int i14 = Util6.f6307a;
                        a aVar2 = aVarArr2[this.f7952o];
                        TrackOutput2 trackOutput2 = aVar2.f7965c;
                        int i15 = aVar2.f7966d;
                        TrackSampleTable trackSampleTable2 = aVar2.f7964b;
                        long j15 = trackSampleTable2.f8014c[i15];
                        int i16 = trackSampleTable2.f8015d[i15];
                        long j16 = (j15 - jMo3740p5) + ((long) this.f7953p);
                        if (j16 < 0 || j16 >= 262144) {
                            positionHolder.f8519a = j15;
                            return 1;
                        }
                        if (aVar2.f7963a.f7984g == 1) {
                            j16 += 8;
                            i16 -= 8;
                        }
                        extractorInput.mo3737l((int) j16);
                        Track track = aVar2.f7963a;
                        int i17 = track.f7987j;
                        if (i17 == 0) {
                            if ("audio/ac4".equals(track.f7983f.f6934q)) {
                                if (this.f7954q == 0) {
                                    Ac4Util.m3556a(i16, this.f7942e);
                                    trackOutput2.mo3758c(this.f7942e, 7);
                                    this.f7954q += 7;
                                }
                                i16 += 7;
                            }
                            while (true) {
                                int i18 = this.f7954q;
                                if (i18 >= i16) {
                                    break;
                                }
                                int iMo3757b = trackOutput2.mo3757b(extractorInput, i16 - i18, false);
                                this.f7953p += iMo3757b;
                                this.f7954q += iMo3757b;
                                this.f7955r -= iMo3757b;
                            }
                        } else {
                            byte[] bArr3 = this.f7941d.f6392a;
                            bArr3[0] = 0;
                            bArr3[1] = 0;
                            bArr3[2] = 0;
                            int i19 = 4 - i17;
                            while (this.f7954q < i16) {
                                int i20 = this.f7955r;
                                if (i20 == 0) {
                                    extractorInput.readFully(bArr3, i19, i17);
                                    this.f7953p += i17;
                                    this.f7941d.m3194D(0);
                                    int iM3201f = this.f7941d.m3201f();
                                    if (iM3201f < 0) {
                                        throw new ParserException("Invalid NAL length");
                                    }
                                    this.f7955r = iM3201f;
                                    this.f7940c.m3194D(0);
                                    trackOutput2.mo3758c(this.f7940c, 4);
                                    this.f7954q += 4;
                                    i16 += i19;
                                } else {
                                    int iMo3757b2 = trackOutput2.mo3757b(extractorInput, i20, false);
                                    this.f7953p += iMo3757b2;
                                    this.f7954q += iMo3757b2;
                                    this.f7955r -= iMo3757b2;
                                }
                            }
                        }
                        TrackSampleTable trackSampleTable3 = aVar2.f7964b;
                        trackOutput2.mo3759d(trackSampleTable3.f8017f[i15], trackSampleTable3.f8018g[i15], i16, 0, null);
                        aVar2.f7966d++;
                        this.f7952o = -1;
                        this.f7953p = 0;
                        this.f7954q = 0;
                        this.f7955r = 0;
                        return 0;
                    }
                    if (i6 != 3) {
                        throw new IllegalStateException();
                    }
                    SefReader sefReader = this.f7945h;
                    List<Metadata.b> list = this.f7946i;
                    int i21 = sefReader.f7973d;
                    if (i21 != 0) {
                        if (i21 != 1) {
                            short s = 2816;
                            if (i21 == 2) {
                                long jMo3729a2 = extractorInput.mo3729a();
                                int i22 = (sefReader.f7974e - 12) - 8;
                                ParsableByteArray parsableByteArray4 = new ParsableByteArray(i22);
                                extractorInput.readFully(parsableByteArray4.f6392a, 0, i22);
                                int i23 = 0;
                                while (i23 < i22 / 12) {
                                    parsableByteArray4.m3195E(i8);
                                    short sM3204i = parsableByteArray4.m3204i();
                                    if (sM3204i != 2192 && sM3204i != s) {
                                        if (sM3204i != 2817 && sM3204i != 2819 && sM3204i != 2820) {
                                            parsableByteArray4.m3195E(8);
                                        }
                                        i23++;
                                        s = 2816;
                                        i8 = 2;
                                    }
                                    sefReader.f7972c.add(new SefReader.a(sM3204i, (jMo3729a2 - ((long) sefReader.f7974e)) - ((long) parsableByteArray4.m3203h()), parsableByteArray4.m3203h()));
                                    i23++;
                                    s = 2816;
                                    i8 = 2;
                                }
                                if (sefReader.f7972c.isEmpty()) {
                                    positionHolder.f8519a = 0L;
                                } else {
                                    sefReader.f7973d = 3;
                                    positionHolder.f8519a = sefReader.f7972c.get(0).f7975a;
                                }
                            } else {
                                if (i21 != 3) {
                                    throw new IllegalStateException();
                                }
                                long jMo3740p6 = extractorInput.mo3740p();
                                int iMo3729a = (int) ((extractorInput.mo3729a() - extractorInput.mo3740p()) - ((long) sefReader.f7974e));
                                ParsableByteArray parsableByteArray5 = new ParsableByteArray(iMo3729a);
                                extractorInput.readFully(parsableByteArray5.f6392a, 0, iMo3729a);
                                int i24 = 0;
                                while (i24 < sefReader.f7972c.size()) {
                                    SefReader.a aVar3 = sefReader.f7972c.get(i24);
                                    parsableByteArray5.m3194D((int) (aVar3.f7975a - jMo3740p6));
                                    parsableByteArray5.m3195E(i7);
                                    int iM3203h = parsableByteArray5.m3203h();
                                    switch (parsableByteArray5.m3211p(iM3203h)) {
                                        case "SlowMotion_Data":
                                            i2 = 0;
                                            break;
                                        case "Super_SlowMotion_Edit_Data":
                                            i2 = 1;
                                            break;
                                        case "Super_SlowMotion_Data":
                                            i2 = 2;
                                            break;
                                        case "Super_SlowMotion_Deflickering_On":
                                            i2 = 3;
                                            break;
                                        case "Super_SlowMotion_BGM":
                                            i2 = 4;
                                            break;
                                        default:
                                            i2 = -1;
                                            break;
                                    }
                                    if (i2 == 0) {
                                        c2 = 2192;
                                    } else if (i2 == 1) {
                                        c2 = 2819;
                                    } else if (i2 == 2) {
                                        c2 = 2816;
                                    } else if (i2 == 3) {
                                        c2 = 2820;
                                    } else {
                                        if (i2 != i7) {
                                            throw new ParserException("Invalid SEF name");
                                        }
                                        c2 = 2817;
                                    }
                                    int i25 = aVar3.f7976b - (iM3203h + 8);
                                    if (c2 == 2192) {
                                        ArrayList arrayList = new ArrayList();
                                        List<String> listM11579a = SefReader.f7971b.m11579a(parsableByteArray5.m3211p(i25));
                                        for (int i26 = 0; i26 < listM11579a.size(); i26++) {
                                            List<String> listM11579a2 = SefReader.f7970a.m11579a(listM11579a.get(i26));
                                            if (listM11579a2.size() != 3) {
                                                throw new ParserException();
                                            }
                                            try {
                                                arrayList.add(new SlowMotionData.b(Long.parseLong(listM11579a2.get(0)), Long.parseLong(listM11579a2.get(1)), 1 << (Integer.parseInt(listM11579a2.get(2)) - 1)));
                                            } catch (NumberFormatException e) {
                                                throw new ParserException(e);
                                            }
                                        }
                                        list.add(new SlowMotionData(arrayList));
                                    } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                        throw new IllegalStateException();
                                    }
                                    i24++;
                                    i7 = 4;
                                }
                                positionHolder.f8519a = 0L;
                            }
                        } else {
                            ParsableByteArray parsableByteArray6 = new ParsableByteArray(8);
                            extractorInput.readFully(parsableByteArray6.f6392a, 0, 8);
                            sefReader.f7974e = parsableByteArray6.m3203h() + 8;
                            if (parsableByteArray6.m3201f() != 1397048916) {
                                positionHolder.f8519a = 0L;
                            } else {
                                positionHolder.f8519a = extractorInput.mo3740p() - ((long) (sefReader.f7974e - 12));
                                sefReader.f7973d = 2;
                            }
                        }
                        i = 1;
                    } else {
                        long jMo3729a3 = extractorInput.mo3729a();
                        positionHolder.f8519a = (jMo3729a3 == -1 || jMo3729a3 < 8) ? 0L : jMo3729a3 - 8;
                        i = 1;
                        sefReader.f7973d = 1;
                    }
                    if (positionHolder.f8519a == 0) {
                        m3838j();
                    }
                    return i;
                }
                long j17 = this.f7949l - ((long) this.f7950m);
                long jMo3740p7 = extractorInput.mo3740p() + j17;
                ParsableByteArray parsableByteArray7 = this.f7951n;
                if (parsableByteArray7 != null) {
                    extractorInput.readFully(parsableByteArray7.f6392a, this.f7950m, (int) j17);
                    if (this.f7948k == 1718909296) {
                        parsableByteArray7.m3194D(8);
                        int iM3201f2 = parsableByteArray7.m3201f();
                        int i27 = iM3201f2 != 1751476579 ? iM3201f2 != 1903435808 ? 0 : 1 : 2;
                        if (i27 == 0) {
                            parsableByteArray7.m3195E(4);
                            do {
                                if (parsableByteArray7.m3196a() <= 0) {
                                    i27 = 0;
                                    break;
                                }
                                int iM3201f3 = parsableByteArray7.m3201f();
                                i27 = iM3201f3 != 1751476579 ? iM3201f3 != 1903435808 ? 0 : 1 : 2;
                            } while (i27 == 0);
                        }
                        this.f7961x = i27;
                    } else if (!this.f7944g.isEmpty()) {
                        this.f7944g.peek().f7855c.add(new Atom.b(this.f7948k, parsableByteArray7));
                    }
                } else {
                    if (j17 < 262144) {
                        extractorInput.mo3737l((int) j17);
                    } else {
                        positionHolder.f8519a = extractorInput.mo3740p() + j17;
                        z = true;
                    }
                    m3839l(jMo3740p7);
                    if (z || this.f7947j == 2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        return 1;
                    }
                }
                z = false;
                m3839l(jMo3740p7);
                if (z) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return 1;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f7956s = extractorOutput;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        this.f7944g.clear();
        this.f7950m = 0;
        this.f7952o = -1;
        this.f7953p = 0;
        this.f7954q = 0;
        this.f7955r = 0;
        if (j2 == 0) {
            if (this.f7947j != 3) {
                m3838j();
                return;
            }
            SefReader sefReader = this.f7945h;
            sefReader.f7972c.clear();
            sefReader.f7973d = 0;
            this.f7946i.clear();
            return;
        }
        a[] aVarArr = this.f7957t;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                TrackSampleTable trackSampleTable = aVar.f7964b;
                int iM3842a = trackSampleTable.m3842a(j3);
                if (iM3842a == -1) {
                    iM3842a = trackSampleTable.m3843b(j3);
                }
                aVar.f7966d = iM3842a;
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: h */
    public SeekMap.a mo3717h(long j2) {
        long j3;
        long jM3837k;
        long j4;
        long j5;
        int iM3843b;
        long j6 = j2;
        a[] aVarArr = this.f7957t;
        Objects.requireNonNull(aVarArr);
        if (aVarArr.length == 0) {
            return new SeekMap.a(SeekPoint.f8524a);
        }
        long j7 = -1;
        int i = this.f7959v;
        if (i != -1) {
            TrackSampleTable trackSampleTable = this.f7957t[i].f7964b;
            int iM3842a = trackSampleTable.m3842a(j6);
            if (iM3842a == -1) {
                iM3842a = trackSampleTable.m3843b(j6);
            }
            if (iM3842a == -1) {
                return new SeekMap.a(SeekPoint.f8524a);
            }
            long j8 = trackSampleTable.f8017f[iM3842a];
            j3 = trackSampleTable.f8014c[iM3842a];
            if (j8 >= j6 || iM3842a >= trackSampleTable.f8013b - 1 || (iM3843b = trackSampleTable.m3843b(j6)) == -1 || iM3843b == iM3842a) {
                j5 = -9223372036854775807L;
            } else {
                long j9 = trackSampleTable.f8017f[iM3843b];
                long j10 = trackSampleTable.f8014c[iM3843b];
                j5 = j9;
                j7 = j10;
            }
            jM3837k = j7;
            j4 = j5;
            j6 = j8;
        } else {
            j3 = Long.MAX_VALUE;
            jM3837k = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr2 = this.f7957t;
            if (i2 >= aVarArr2.length) {
                break;
            }
            if (i2 != this.f7959v) {
                TrackSampleTable trackSampleTable2 = aVarArr2[i2].f7964b;
                long jM3837k2 = m3837k(trackSampleTable2, j6, j3);
                if (j4 != -9223372036854775807L) {
                    jM3837k = m3837k(trackSampleTable2, j4, jM3837k);
                }
                j3 = jM3837k2;
            }
            i2++;
        }
        SeekPoint seekPoint = new SeekPoint(j6, j3);
        return j4 == -9223372036854775807L ? new SeekMap.a(seekPoint) : new SeekMap.a(seekPoint, new SeekPoint(j4, jM3837k));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: i */
    public long mo3718i() {
        return this.f7960w;
    }

    /* JADX INFO: renamed from: j */
    public final void m3838j() {
        this.f7947j = 0;
        this.f7950m = 0;
    }

    /* JADX WARN: Code duplicated, block: B:232:0x048d  */
    /* JADX WARN: Code duplicated, block: B:285:0x058f A[PHI: r0
  0x058f: PHI (r0v31 c.n.b.b.u1.a) = (r0v19 c.n.b.b.u1.a), (r0v19 c.n.b.b.u1.a), (r0v25 c.n.b.b.u1.a), (r0v19 c.n.b.b.u1.a) binds: [B:273:0x055e, B:274:0x0560, B:363:0x058f, B:270:0x0556] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX INFO: renamed from: l */
    public final void m3839l(long j2) throws ParserException {
        Mp4Extractor mp4Extractor;
        ArrayList arrayList;
        boolean z;
        Metadata metadata;
        int i;
        Metadata metadata2;
        Metadata metadata3;
        Metadata metadata4;
        Mp4Extractor mp4Extractor2;
        Metadata metadata5;
        ArrayList arrayList2;
        int i2;
        int i3;
        MdtaMetadataEntry mdtaMetadataEntry;
        ArrayList arrayList3;
        boolean z2;
        Metadata metadata6;
        boolean z3;
        Id3Frame id3FrameM3834d;
        String str;
        Mp4Extractor mp4Extractor3 = this;
        while (!mp4Extractor3.f7944g.isEmpty() && mp4Extractor3.f7944g.peek().f7854b == j2) {
            Atom.a aVarPop = mp4Extractor3.f7944g.pop();
            if (aVarPop.f7853a == 1836019574) {
                ArrayList arrayList4 = new ArrayList();
                boolean z4 = mp4Extractor3.f7961x == 1;
                GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
                Atom.b bVarM3810c = aVarPop.m3810c(1969517665);
                int i4 = 1768715124;
                int i5 = 1751411826;
                int i6 = 1835365473;
                int i7 = 4;
                int i8 = 8;
                Metadata metadata7 = null;
                if (bVarM3810c != null) {
                    byte[] bArr = AtomParsers.f7858a;
                    ParsableByteArray parsableByteArray = bVarM3810c.f7857b;
                    parsableByteArray.m3194D(8);
                    Metadata metadata8 = null;
                    String strM3210o = null;
                    while (parsableByteArray.m3196a() >= i8) {
                        int i9 = parsableByteArray.f6393b;
                        int iM3201f = parsableByteArray.m3201f();
                        int i10 = i4;
                        int iM3201f2 = parsableByteArray.m3201f();
                        if (iM3201f2 == i6) {
                            parsableByteArray.m3194D(i9);
                            int i11 = i9 + iM3201f;
                            parsableByteArray.m3195E(i8);
                            int i12 = parsableByteArray.f6393b;
                            parsableByteArray.m3195E(i7);
                            if (parsableByteArray.m3201f() != i5) {
                                i12 += 4;
                            }
                            parsableByteArray.m3194D(i12);
                            int i13 = i10;
                            while (true) {
                                int i14 = parsableByteArray.f6393b;
                                if (i14 < i11) {
                                    int iM3201f3 = parsableByteArray.m3201f();
                                    if (parsableByteArray.m3201f() == i13) {
                                        parsableByteArray.m3194D(i14);
                                        int i15 = i14 + iM3201f3;
                                        parsableByteArray.m3195E(i8);
                                        ArrayList arrayList5 = new ArrayList();
                                        while (true) {
                                            int i16 = parsableByteArray.f6393b;
                                            if (i16 >= i15) {
                                                break;
                                            }
                                            int iM3201f4 = parsableByteArray.m3201f() + i16;
                                            int iM3201f5 = parsableByteArray.m3201f();
                                            int i17 = (iM3201f5 >> 24) & 255;
                                            int i18 = i15;
                                            ArrayList arrayList6 = arrayList4;
                                            if (i17 == 169 || i17 == 253) {
                                                z3 = z4;
                                                int i19 = 16777215 & iM3201f5;
                                                if (i19 == 6516084) {
                                                    id3FrameM3834d = MetadataUtil.m3831a(iM3201f5, parsableByteArray);
                                                } else if (i19 == 7233901 || i19 == 7631467) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TIT2", parsableByteArray);
                                                } else if (i19 == 6516589 || i19 == 7828084) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TCOM", parsableByteArray);
                                                } else if (i19 == 6578553) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TDRC", parsableByteArray);
                                                } else if (i19 == 4280916) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TPE1", parsableByteArray);
                                                } else if (i19 == 7630703) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TSSE", parsableByteArray);
                                                } else if (i19 == 6384738) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TALB", parsableByteArray);
                                                } else if (i19 == 7108978) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "USLT", parsableByteArray);
                                                } else if (i19 == 6776174) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TCON", parsableByteArray);
                                                } else if (i19 == 6779504) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TIT1", parsableByteArray);
                                                } else {
                                                    Log.d("MetadataUtil", "Skipped unknown metadata entry: " + Atom.m3808a(iM3201f5));
                                                    id3FrameM3834d = null;
                                                }
                                            } else if (iM3201f5 == 1735291493) {
                                                try {
                                                    int iM3836f = MetadataUtil.m3836f(parsableByteArray);
                                                    if (iM3836f > 0) {
                                                        String[] strArr = MetadataUtil.f7937a;
                                                        if (iM3836f <= strArr.length) {
                                                            str = strArr[iM3836f - 1];
                                                        } else {
                                                            str = strM3210o;
                                                        }
                                                    } else {
                                                        str = strM3210o;
                                                    }
                                                    if (str != null) {
                                                        id3FrameM3834d = new TextInformationFrame("TCON", strM3210o, str);
                                                        z3 = z4;
                                                    } else {
                                                        Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                        z3 = z4;
                                                        id3FrameM3834d = null;
                                                    }
                                                } catch (Throwable th) {
                                                    parsableByteArray.m3194D(iM3201f4);
                                                    throw th;
                                                }
                                            } else {
                                                if (iM3201f5 == 1684632427) {
                                                    id3FrameM3834d = MetadataUtil.m3833c(iM3201f5, "TPOS", parsableByteArray);
                                                } else if (iM3201f5 == 1953655662) {
                                                    id3FrameM3834d = MetadataUtil.m3833c(iM3201f5, "TRCK", parsableByteArray);
                                                } else if (iM3201f5 == 1953329263) {
                                                    id3FrameM3834d = MetadataUtil.m3835e(iM3201f5, "TBPM", parsableByteArray, true, false);
                                                } else if (iM3201f5 == 1668311404) {
                                                    id3FrameM3834d = MetadataUtil.m3835e(iM3201f5, "TCMP", parsableByteArray, true, true);
                                                } else if (iM3201f5 == 1668249202) {
                                                    id3FrameM3834d = MetadataUtil.m3832b(parsableByteArray);
                                                } else if (iM3201f5 == 1631670868) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TPE2", parsableByteArray);
                                                } else if (iM3201f5 == 1936682605) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TSOT", parsableByteArray);
                                                } else if (iM3201f5 == 1936679276) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TSO2", parsableByteArray);
                                                } else if (iM3201f5 == 1936679282) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TSOA", parsableByteArray);
                                                } else if (iM3201f5 == 1936679265) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TSOP", parsableByteArray);
                                                } else if (iM3201f5 == 1936679791) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TSOC", parsableByteArray);
                                                } else if (iM3201f5 == 1920233063) {
                                                    id3FrameM3834d = MetadataUtil.m3835e(iM3201f5, "ITUNESADVISORY", parsableByteArray, false, false);
                                                } else if (iM3201f5 == 1885823344) {
                                                    id3FrameM3834d = MetadataUtil.m3835e(iM3201f5, "ITUNESGAPLESS", parsableByteArray, false, true);
                                                } else if (iM3201f5 == 1936683886) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TVSHOWSORT", parsableByteArray);
                                                } else if (iM3201f5 == 1953919848) {
                                                    id3FrameM3834d = MetadataUtil.m3834d(iM3201f5, "TVSHOW", parsableByteArray);
                                                } else if (iM3201f5 == 757935405) {
                                                    int i20 = -1;
                                                    int i21 = -1;
                                                    String strM3210o2 = strM3210o;
                                                    while (true) {
                                                        int i22 = parsableByteArray.f6393b;
                                                        if (i22 >= iM3201f4) {
                                                            break;
                                                        }
                                                        int iM3201f6 = parsableByteArray.m3201f();
                                                        int iM3201f7 = parsableByteArray.m3201f();
                                                        boolean z5 = z4;
                                                        parsableByteArray.m3195E(4);
                                                        if (iM3201f7 == 1835360622) {
                                                            strM3210o = parsableByteArray.m3210o(iM3201f6 - 12);
                                                        } else if (iM3201f7 == 1851878757) {
                                                            strM3210o2 = parsableByteArray.m3210o(iM3201f6 - 12);
                                                        } else {
                                                            if (iM3201f7 == 1684108385) {
                                                                i21 = iM3201f6;
                                                                i20 = i22;
                                                            }
                                                            parsableByteArray.m3195E(iM3201f6 - 12);
                                                        }
                                                        z4 = z5;
                                                    }
                                                    z3 = z4;
                                                    if (strM3210o == null || strM3210o2 == null || i20 == -1) {
                                                        id3FrameM3834d = null;
                                                    } else {
                                                        parsableByteArray.m3194D(i20);
                                                        parsableByteArray.m3195E(16);
                                                        id3FrameM3834d = new InternalFrame(strM3210o, strM3210o2, parsableByteArray.m3210o(i21 - 16));
                                                    }
                                                } else {
                                                    z3 = z4;
                                                    Log.d("MetadataUtil", "Skipped unknown metadata entry: " + Atom.m3808a(iM3201f5));
                                                    id3FrameM3834d = null;
                                                }
                                                z3 = z4;
                                            }
                                            parsableByteArray.m3194D(iM3201f4);
                                            if (id3FrameM3834d != null) {
                                                arrayList5.add(id3FrameM3834d);
                                            }
                                            strM3210o = null;
                                            i15 = i18;
                                            arrayList4 = arrayList6;
                                            z4 = z3;
                                        }
                                        arrayList3 = arrayList4;
                                        z2 = z4;
                                        if (!arrayList5.isEmpty()) {
                                            metadata6 = new Metadata(arrayList5);
                                            break;
                                        }
                                        break;
                                    }
                                    parsableByteArray.m3194D(i14 + iM3201f3);
                                    i8 = 8;
                                    strM3210o = null;
                                    i13 = 1768715124;
                                } else {
                                    arrayList3 = arrayList4;
                                    z2 = z4;
                                }
                                metadata6 = null;
                                break;
                            }
                            metadata7 = metadata6;
                        } else {
                            arrayList3 = arrayList4;
                            z2 = z4;
                            if (iM3201f2 == 1936553057) {
                                parsableByteArray.m3194D(i9);
                                int i23 = i9 + iM3201f;
                                parsableByteArray.m3195E(12);
                                while (true) {
                                    int i24 = parsableByteArray.f6393b;
                                    if (i24 < i23) {
                                        int iM3201f8 = parsableByteArray.m3201f();
                                        if (parsableByteArray.m3201f() != 1935766900) {
                                            parsableByteArray.m3194D(i24 + iM3201f8);
                                        } else if (iM3201f8 >= 14) {
                                            parsableByteArray.m3195E(5);
                                            int iM3214s = parsableByteArray.m3214s();
                                            if (iM3214s == 12 || iM3214s == 13) {
                                                float f = iM3214s == 12 ? 240.0f : 120.0f;
                                                parsableByteArray.m3195E(1);
                                                metadata8 = new Metadata(new SmtaMetadataEntry(f, parsableByteArray.m3214s()));
                                                break;
                                            }
                                        }
                                    }
                                    metadata8 = null;
                                    break;
                                }
                            }
                        }
                        parsableByteArray.m3194D(i9 + iM3201f);
                        i8 = 8;
                        strM3210o = null;
                        i4 = 1768715124;
                        i5 = 1751411826;
                        i6 = 1835365473;
                        i7 = 4;
                        arrayList4 = arrayList3;
                        z4 = z2;
                    }
                    arrayList = arrayList4;
                    z = z4;
                    Pair pairCreate = Pair.create(metadata7, metadata8);
                    metadata2 = (Metadata) pairCreate.first;
                    metadata = (Metadata) pairCreate.second;
                    if (metadata2 != null) {
                        gaplessInfoHolder.m3924b(metadata2);
                    }
                    i = 1835365473;
                } else {
                    arrayList = arrayList4;
                    z = z4;
                    metadata = null;
                    i = 1835365473;
                    metadata2 = null;
                }
                Metadata metadata9 = metadata2;
                Atom.a aVarM3809b = aVarPop.m3809b(i);
                if (aVarM3809b != null) {
                    byte[] bArr2 = AtomParsers.f7858a;
                    Atom.b bVarM3810c2 = aVarM3809b.m3810c(1751411826);
                    Atom.b bVarM3810c3 = aVarM3809b.m3810c(1801812339);
                    Atom.b bVarM3810c4 = aVarM3809b.m3810c(1768715124);
                    if (bVarM3810c2 == null || bVarM3810c3 == null || bVarM3810c4 == null) {
                        metadata3 = metadata9;
                        metadata4 = null;
                    } else {
                        ParsableByteArray parsableByteArray2 = bVarM3810c2.f7857b;
                        parsableByteArray2.m3194D(16);
                        if (parsableByteArray2.m3201f() != 1835299937) {
                            metadata3 = metadata9;
                        } else {
                            ParsableByteArray parsableByteArray3 = bVarM3810c3.f7857b;
                            parsableByteArray3.m3194D(12);
                            int iM3201f9 = parsableByteArray3.m3201f();
                            String[] strArr2 = new String[iM3201f9];
                            for (int i25 = 0; i25 < iM3201f9; i25++) {
                                int iM3201f10 = parsableByteArray3.m3201f();
                                parsableByteArray3.m3195E(4);
                                strArr2[i25] = parsableByteArray3.m3211p(iM3201f10 - 8);
                            }
                            int i26 = 8;
                            ParsableByteArray parsableByteArray4 = bVarM3810c4.f7857b;
                            parsableByteArray4.m3194D(8);
                            ArrayList arrayList7 = new ArrayList();
                            while (parsableByteArray4.m3196a() > i26) {
                                int i27 = parsableByteArray4.f6393b;
                                int iM3201f11 = parsableByteArray4.m3201f();
                                int iM3201f12 = parsableByteArray4.m3201f() - 1;
                                if (iM3201f12 < 0 || iM3201f12 >= iM3201f9) {
                                    i3 = iM3201f9;
                                    strArr2 = strArr2;
                                    metadata9 = metadata9;
                                    outline.m1565P("Skipped metadata with unknown key index: ", iM3201f12, "AtomParsers");
                                } else {
                                    String str2 = strArr2[iM3201f12];
                                    int i28 = i27 + iM3201f11;
                                    while (true) {
                                        int i29 = parsableByteArray4.f6393b;
                                        if (i29 >= i28) {
                                            i3 = iM3201f9;
                                            mdtaMetadataEntry = null;
                                            break;
                                        }
                                        int iM3201f13 = parsableByteArray4.m3201f();
                                        i3 = iM3201f9;
                                        if (parsableByteArray4.m3201f() == 1684108385) {
                                            int iM3201f14 = parsableByteArray4.m3201f();
                                            int iM3201f15 = parsableByteArray4.m3201f();
                                            int i30 = iM3201f13 - 16;
                                            byte[] bArr3 = new byte[i30];
                                            System.arraycopy(parsableByteArray4.f6392a, parsableByteArray4.f6393b, bArr3, 0, i30);
                                            parsableByteArray4.f6393b += i30;
                                            mdtaMetadataEntry = new MdtaMetadataEntry(str2, bArr3, iM3201f15, iM3201f14);
                                            break;
                                        }
                                        parsableByteArray4.m3194D(i29 + iM3201f13);
                                        iM3201f9 = i3;
                                    }
                                    if (mdtaMetadataEntry != null) {
                                        arrayList7.add(mdtaMetadataEntry);
                                    }
                                }
                                parsableByteArray4.m3194D(i27 + iM3201f11);
                                i26 = 8;
                                iM3201f9 = i3;
                                strArr2 = strArr2;
                                metadata9 = metadata9;
                            }
                            metadata3 = metadata9;
                            if (!arrayList7.isEmpty()) {
                                metadata4 = new Metadata(arrayList7);
                            }
                        }
                        metadata4 = null;
                    }
                } else {
                    metadata3 = metadata9;
                    metadata4 = null;
                }
                Metadata metadata10 = metadata4;
                List<TrackSampleTable> listM3815e = AtomParsers.m3815e(aVarPop, gaplessInfoHolder, -9223372036854775807L, null, (mp4Extractor3.f7939b & 1) != 0, z, new Function() { // from class: c.n.b.b.s1.k0.a
                    @Override // p007c.p190n.p378c.p379a.Function
                    public final Object apply(Object obj) {
                        Track track = (Track) obj;
                        int i31 = Mp4Extractor.f7938a;
                        return track;
                    }
                });
                ExtractorOutput extractorOutput = mp4Extractor3.f7956s;
                Objects.requireNonNull(extractorOutput);
                ArrayList arrayList8 = (ArrayList) listM3815e;
                int size = arrayList8.size();
                long j3 = -9223372036854775807L;
                long j4 = -9223372036854775807L;
                int size2 = -1;
                int i31 = 0;
                while (i31 < size) {
                    TrackSampleTable trackSampleTable = (TrackSampleTable) arrayList8.get(i31);
                    if (trackSampleTable.f8013b == 0) {
                        metadata5 = metadata;
                        mp4Extractor2 = mp4Extractor3;
                        arrayList2 = arrayList;
                    } else {
                        Track track = trackSampleTable.f8012a;
                        long j5 = track.f7982e;
                        if (j5 == j4) {
                            j5 = trackSampleTable.f8019h;
                        }
                        long jMax = Math.max(j3, j5);
                        a aVar = new a(track, trackSampleTable, extractorOutput.mo3774o(i31, track.f7979b));
                        int i32 = trackSampleTable.f8016e + 30;
                        Format.b bVarM3515a = track.f7983f.m3515a();
                        bVarM3515a.f6959l = i32;
                        int i33 = track.f7979b;
                        if (i33 == 2 && j5 > 0 && (i2 = trackSampleTable.f8013b) > 1) {
                            bVarM3515a.f6965r = i2 / (j5 / 1000000.0f);
                        }
                        if (i33 == 1) {
                            int i34 = gaplessInfoHolder.f8512b;
                            if ((i34 == -1 || gaplessInfoHolder.f8513c == -1) ? false : true) {
                                bVarM3515a.f6944A = i34;
                                bVarM3515a.f6945B = gaplessInfoHolder.f8513c;
                            }
                        }
                        Metadata[] metadataArr = new Metadata[2];
                        metadataArr[0] = metadata;
                        mp4Extractor2 = this;
                        metadataArr[1] = mp4Extractor2.f7946i.isEmpty() ? null : new Metadata(mp4Extractor2.f7946i);
                        Metadata metadata11 = new Metadata(new Metadata.b[0]);
                        if (i33 != 1) {
                            if (i33 != 2 || metadata10 == null) {
                                metadata5 = metadata;
                                break;
                            }
                            int i35 = 0;
                            while (true) {
                                Metadata.b[] bVarArr = metadata10.f8661f;
                                if (i35 >= bVarArr.length) {
                                    metadata5 = metadata;
                                    break;
                                }
                                Metadata.b bVar = bVarArr[i35];
                                if (bVar instanceof MdtaMetadataEntry) {
                                    MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) bVar;
                                    metadata5 = metadata;
                                    if ("com.android.capture.fps".equals(mdtaMetadataEntry2.f8754f)) {
                                        metadata11 = new Metadata(mdtaMetadataEntry2);
                                        break;
                                    }
                                } else {
                                    metadata5 = metadata;
                                }
                                i35++;
                                metadata = metadata5;
                            }
                        } else if (metadata3 == null) {
                            metadata5 = metadata;
                            break;
                        } else {
                            metadata5 = metadata;
                            metadata11 = metadata3;
                        }
                        for (int i36 = 0; i36 < 2; i36++) {
                            metadata11 = metadata11.m4009b(metadataArr[i36]);
                        }
                        if (metadata11.f8661f.length > 0) {
                            bVarM3515a.f6956i = metadata11;
                        }
                        aVar.f7965c.mo3760e(bVarM3515a.m3519a());
                        if (track.f7979b == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(aVar);
                        j3 = jMax;
                    }
                    i31++;
                    j4 = -9223372036854775807L;
                    arrayList = arrayList2;
                    mp4Extractor3 = mp4Extractor2;
                    arrayList8 = arrayList8;
                    size = size;
                    metadata = metadata5;
                }
                mp4Extractor = mp4Extractor3;
                long j6 = 0;
                mp4Extractor.f7959v = size2;
                mp4Extractor.f7960w = j3;
                a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
                mp4Extractor.f7957t = aVarArr;
                long[][] jArr = new long[aVarArr.length][];
                int[] iArr = new int[aVarArr.length];
                long[] jArr2 = new long[aVarArr.length];
                boolean[] zArr = new boolean[aVarArr.length];
                for (int i37 = 0; i37 < aVarArr.length; i37++) {
                    jArr[i37] = new long[aVarArr[i37].f7964b.f8013b];
                    jArr2[i37] = aVarArr[i37].f7964b.f8017f[0];
                }
                int i38 = 0;
                while (i38 < aVarArr.length) {
                    long j7 = Long.MAX_VALUE;
                    int i39 = -1;
                    for (int i40 = 0; i40 < aVarArr.length; i40++) {
                        if (!zArr[i40] && jArr2[i40] <= j7) {
                            j7 = jArr2[i40];
                            i39 = i40;
                        }
                    }
                    int i41 = iArr[i39];
                    jArr[i39][i41] = j6;
                    j6 += (long) aVarArr[i39].f7964b.f8015d[i41];
                    int i42 = i41 + 1;
                    iArr[i39] = i42;
                    if (i42 < jArr[i39].length) {
                        jArr2[i39] = aVarArr[i39].f7964b.f8017f[i42];
                    } else {
                        zArr[i39] = true;
                        i38++;
                    }
                }
                mp4Extractor.f7958u = jArr;
                extractorOutput.mo3773j();
                extractorOutput.mo3772a(mp4Extractor);
                mp4Extractor.f7944g.clear();
                mp4Extractor.f7947j = 2;
            } else {
                mp4Extractor = mp4Extractor3;
                if (!mp4Extractor.f7944g.isEmpty()) {
                    mp4Extractor.f7944g.peek().f7856d.add(aVarPop);
                }
            }
            mp4Extractor3 = mp4Extractor;
        }
        if (mp4Extractor3.f7947j != 2) {
            m3838j();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }

    public Mp4Extractor(int i) {
        this.f7939b = i;
        this.f7947j = (i & 4) != 0 ? 3 : 0;
        this.f7945h = new SefReader();
        this.f7946i = new ArrayList();
        this.f7943f = new ParsableByteArray(16);
        this.f7944g = new ArrayDeque<>();
        this.f7940c = new ParsableByteArray(NalUnitUtil.f6368a);
        this.f7941d = new ParsableByteArray(4);
        this.f7942e = new ParsableByteArray();
        this.f7952o = -1;
    }
}
