package p007c.p190n.p194b.p209b.p221s1.p227j0;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p215n1.MpegAudioUtil;
import p007c.p190n.p194b.p209b.p221s1.DummyTrackOutput;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.GaplessInfoHolder;
import p007c.p190n.p194b.p209b.p221s1.Id3Peeker;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.p239m.Id3Decoder;
import p007c.p190n.p194b.p209b.p234u1.p239m.MlltFrame;
import p007c.p190n.p194b.p209b.p234u1.p239m.TextInformationFrame;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.j0.f, reason: use source file name */
/* JADX INFO: compiled from: Mp3Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class Mp3Extractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public static final Id3Decoder.a f7819a;

    /* JADX INFO: renamed from: b */
    public final int f7820b;

    /* JADX INFO: renamed from: c */
    public final long f7821c;

    /* JADX INFO: renamed from: d */
    public final ParsableByteArray f7822d;

    /* JADX INFO: renamed from: e */
    public final MpegAudioUtil.a f7823e;

    /* JADX INFO: renamed from: f */
    public final GaplessInfoHolder f7824f;

    /* JADX INFO: renamed from: g */
    public final Id3Peeker f7825g;

    /* JADX INFO: renamed from: h */
    public final TrackOutput2 f7826h;

    /* JADX INFO: renamed from: i */
    public ExtractorOutput f7827i;

    /* JADX INFO: renamed from: j */
    public TrackOutput2 f7828j;

    /* JADX INFO: renamed from: k */
    public TrackOutput2 f7829k;

    /* JADX INFO: renamed from: l */
    public int f7830l;

    /* JADX INFO: renamed from: m */
    public Metadata f7831m;

    /* JADX INFO: renamed from: n */
    public long f7832n;

    /* JADX INFO: renamed from: o */
    public long f7833o;

    /* JADX INFO: renamed from: p */
    public long f7834p;

    /* JADX INFO: renamed from: q */
    public int f7835q;

    /* JADX INFO: renamed from: r */
    public Seeker f7836r;

    /* JADX INFO: renamed from: s */
    public boolean f7837s;

    /* JADX INFO: renamed from: t */
    public boolean f7838t;

    /* JADX INFO: renamed from: u */
    public long f7839u;

    static {
        C1730a c1730a = new ExtractorsFactory2() { // from class: c.n.b.b.s1.j0.a
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new Mp3Extractor()};
            }

            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: b */
            public /* synthetic */ Extractor[] mo3746b(Uri uri, Map map) {
                return ExtractorsFactory.m3807a(this, uri, map);
            }
        };
        f7819a = new Id3Decoder.a() { // from class: c.n.b.b.s1.j0.b
            @Override // p007c.p190n.p194b.p209b.p234u1.p239m.Id3Decoder.a
            /* JADX INFO: renamed from: a */
            public final boolean mo3796a(int i, int i2, int i3, int i4, int i5) {
                Id3Decoder.a aVar = Mp3Extractor.f7819a;
                return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
            }
        };
    }

    public Mp3Extractor() {
        this(0);
    }

    /* JADX INFO: renamed from: d */
    public static long m3801d(Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int length = metadata.f8661f.length;
        for (int i = 0; i < length; i++) {
            Metadata.b bVar = metadata.f8661f[i];
            if (bVar instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) bVar;
                if (textInformationFrame.f8739f.equals("TLEN")) {
                    return C.m3236b(Long.parseLong(textInformationFrame.f8751h));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3802h(int i, long j2) {
        return ((long) (i & (-128000))) == (j2 & (-128000));
    }

    /* JADX INFO: renamed from: a */
    public final long m3803a(long j2) {
        return ((j2 * 1000000) / ((long) this.f7823e.f7003d)) + this.f7832n;
    }

    /* JADX INFO: renamed from: b */
    public final Seeker m3804b(ExtractorInput extractorInput) throws IOException {
        extractorInput.mo3739o(this.f7822d.f6392a, 0, 4);
        this.f7822d.m3194D(0);
        this.f7823e.m3532a(this.f7822d.m3201f());
        return new ConstantBitrateSeeker(extractorInput.mo3729a(), extractorInput.mo3740p(), this.f7823e);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        return m3806j(extractorInput, true);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0227  */
    /* JADX WARN: Code duplicated, block: B:108:0x023e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0244  */
    /* JADX WARN: Code duplicated, block: B:114:0x0267 A[LOOP:2: B:113:0x0265->B:114:0x0267, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x028a A[LOOP:1: B:109:0x0242->B:116:0x028a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x028f A[EDGE_INSN: B:117:0x028f->B:118:0x0290 BREAK  A[LOOP:1: B:109:0x0242->B:116:0x028a]] */
    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0294  */
    /* JADX WARN: Code duplicated, block: B:121:0x029a  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:132:0x02cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:140:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:143:0x0311  */
    /* JADX WARN: Code duplicated, block: B:144:0x0313  */
    /* JADX WARN: Code duplicated, block: B:146:0x0325  */
    /* JADX WARN: Code duplicated, block: B:148:0x032e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:150:0x0338  */
    /* JADX WARN: Code duplicated, block: B:153:0x0341  */
    /* JADX WARN: Code duplicated, block: B:156:0x034c  */
    /* JADX WARN: Code duplicated, block: B:178:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:180:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:181:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:184:0x0402  */
    /* JADX WARN: Code duplicated, block: B:202:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:67:0x0154  */
    /* JADX WARN: Code duplicated, block: B:69:0x016e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01da  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:96:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0217  */
    /* JADX WARN: Code duplicated, block: B:98:0x021c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i;
        Mp3Extractor mp3Extractor;
        long jMo3740p;
        long j2;
        int iMo3757b;
        int i2;
        int iM3201f;
        ParsableByteArray parsableByteArray;
        MpegAudioUtil.a aVar;
        int i3;
        int iM3201f2;
        int iM3201f3;
        Seeker seekerM3804b;
        GaplessInfoHolder gaplessInfoHolder;
        boolean z;
        int i4;
        GaplessInfoHolder gaplessInfoHolder2;
        int i5;
        int i6;
        int iM3217v;
        XingSeeker xingSeeker;
        Metadata metadata;
        long jMo3740p2;
        MlltSeeker mlltSeeker;
        long jM3801d;
        long jMo3718i;
        long jMo3798b;
        Metadata metadata2;
        int length;
        int i7;
        Metadata.b bVar;
        MlltFrame mlltFrame;
        int length2;
        long[] jArr;
        long[] jArr2;
        long j3;
        int i8;
        int iM3214s;
        ExtractorInput extractorInput2 = extractorInput;
        C2096e.m4572h(this.f7828j);
        int i9 = Util6.f6307a;
        if (this.f7830l == 0) {
            try {
                m3806j(extractorInput2, false);
                if (this.f7836r == null) {
                    parsableByteArray = new ParsableByteArray(this.f7823e.f7002c);
                    extractorInput2.mo3739o(parsableByteArray.f6392a, 0, this.f7823e.f7002c);
                    aVar = this.f7823e;
                    i3 = 21;
                    if ((aVar.f7000a & 1) != 0) {
                        if (aVar.f7004e != 1) {
                            i3 = 36;
                        }
                    } else if (aVar.f7004e == 1) {
                        i3 = 13;
                    }
                    if (parsableByteArray.f6394c >= i3 + 4) {
                        parsableByteArray.m3194D(i3);
                        iM3201f2 = parsableByteArray.m3201f();
                        if (iM3201f2 != 1483304551 && iM3201f2 != 1231971951) {
                            if (parsableByteArray.f6394c >= 40) {
                                parsableByteArray.m3194D(36);
                                if (parsableByteArray.m3201f() == 1447187017) {
                                    iM3201f2 = 1447187017;
                                } else {
                                    iM3201f2 = 0;
                                }
                            } else {
                                iM3201f2 = 0;
                            }
                        }
                    } else if (parsableByteArray.f6394c >= 40) {
                        parsableByteArray.m3194D(36);
                        if (parsableByteArray.m3201f() == 1447187017) {
                            iM3201f2 = 1447187017;
                        } else {
                            iM3201f2 = 0;
                        }
                    } else {
                        iM3201f2 = 0;
                    }
                    String str = ", ";
                    if (iM3201f2 != 1483304551 || iM3201f2 == 1231971951) {
                        mp3Extractor = this;
                        long jMo3729a = extractorInput.mo3729a();
                        long jMo3740p3 = extractorInput.mo3740p();
                        MpegAudioUtil.a aVar2 = mp3Extractor.f7823e;
                        int i10 = aVar2.f7006g;
                        int i11 = aVar2.f7003d;
                        iM3201f3 = parsableByteArray.m3201f();
                        if ((iM3201f3 & 1) == 1 || (iM3217v = parsableByteArray.m3217v()) == 0) {
                            seekerM3804b = null;
                        } else {
                            long jM3104M = Util6.m3104M(iM3217v, ((long) i10) * 1000000, i11);
                            if ((iM3201f3 & 6) != 6) {
                                xingSeeker = new XingSeeker(jMo3740p3, aVar2.f7002c, jM3104M, -1L, null);
                            } else {
                                long jM3215t = parsableByteArray.m3215t();
                                long[] jArr3 = new long[100];
                                for (int i12 = 0; i12 < 100; i12++) {
                                    jArr3[i12] = parsableByteArray.m3214s();
                                }
                                if (jMo3729a != -1) {
                                    long j4 = jMo3740p3 + jM3215t;
                                    if (jMo3729a != j4) {
                                        outline.m1568S(outline.m1560K("XING data size mismatch: ", jMo3729a, ", "), j4, "XingSeeker");
                                    }
                                }
                                xingSeeker = new XingSeeker(jMo3740p3, aVar2.f7002c, jM3104M, jM3215t, jArr3);
                            }
                            seekerM3804b = xingSeeker;
                        }
                        if (seekerM3804b != null) {
                            gaplessInfoHolder = mp3Extractor.f7824f;
                            if (gaplessInfoHolder.f8512b != -1 || gaplessInfoHolder.f8513c == -1) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                extractorInput2 = extractorInput;
                            } else {
                                extractorInput.mo3736k();
                                extractorInput2 = extractorInput;
                                extractorInput2.mo3733f(i4 + 141);
                                extractorInput2.mo3739o(mp3Extractor.f7822d.f6392a, 0, 3);
                                mp3Extractor.f7822d.m3194D(0);
                                gaplessInfoHolder2 = mp3Extractor.f7824f;
                                int iM3216u = mp3Extractor.f7822d.m3216u();
                                Objects.requireNonNull(gaplessInfoHolder2);
                                i5 = iM3216u >> 12;
                                i6 = iM3216u & 4095;
                                if (i5 <= 0 || i6 > 0) {
                                    i4 = i3;
                                    gaplessInfoHolder2.f8512b = i5;
                                    gaplessInfoHolder2.f8513c = i6;
                                }
                            }
                        } else {
                            extractorInput2 = extractorInput;
                        }
                        extractorInput2.mo3737l(mp3Extractor.f7823e.f7002c);
                        if (seekerM3804b != null && !seekerM3804b.mo3716d() && iM3201f2 == 1231971951) {
                            seekerM3804b = m3804b(extractorInput);
                        }
                    } else if (iM3201f2 == 1447187017) {
                        long jMo3729a2 = extractorInput.mo3729a();
                        long jMo3740p4 = extractorInput.mo3740p();
                        MpegAudioUtil.a aVar3 = this.f7823e;
                        parsableByteArray.m3195E(10);
                        int iM3201f4 = parsableByteArray.m3201f();
                        if (iM3201f4 <= 0) {
                            seekerM3804b = null;
                            break;
                        }
                        int i13 = aVar3.f7003d;
                        long jM3104M2 = Util6.m3104M(iM3201f4, ((long) (i13 >= 32000 ? 1152 : 576)) * 1000000, i13);
                        int iM3219x = parsableByteArray.m3219x();
                        int iM3219x2 = parsableByteArray.m3219x();
                        int iM3219x3 = parsableByteArray.m3219x();
                        parsableByteArray.m3195E(2);
                        long j5 = jMo3740p4 + ((long) aVar3.f7002c);
                        long[] jArr4 = new long[iM3219x];
                        long[] jArr5 = new long[iM3219x];
                        int i14 = 0;
                        long j6 = jMo3740p4;
                        while (true) {
                            if (i14 >= iM3219x) {
                                String str2 = str;
                                long j7 = jMo3729a2;
                                if (j7 != -1 && j7 != j6) {
                                    outline.m1568S(outline.m1560K("VBRI data size mismatch: ", j7, str2), j6, "VbriSeeker");
                                }
                                seekerM3804b = new VbriSeeker(jArr4, jArr5, jM3104M2, j6);
                                break;
                            }
                            String str3 = str;
                            long j8 = jMo3729a2;
                            jArr4[i14] = (((long) i14) * jM3104M2) / ((long) iM3219x);
                            jArr5[i14] = Math.max(j6, j5);
                            if (iM3219x3 == 1) {
                                iM3214s = parsableByteArray.m3214s();
                            } else if (iM3219x3 == 2) {
                                iM3214s = parsableByteArray.m3219x();
                            } else if (iM3219x3 == 3) {
                                iM3214s = parsableByteArray.m3216u();
                            } else {
                                if (iM3219x3 != 4) {
                                    seekerM3804b = null;
                                    break;
                                }
                                iM3214s = parsableByteArray.m3217v();
                            }
                            j6 += (long) (iM3214s * iM3219x2);
                            i14++;
                            str = str3;
                            jMo3729a2 = j8;
                        }
                        mp3Extractor = this;
                        extractorInput.mo3737l(mp3Extractor.f7823e.f7002c);
                        extractorInput2 = extractorInput;
                    } else {
                        mp3Extractor = this;
                        extractorInput.mo3736k();
                        seekerM3804b = null;
                    }
                    metadata = mp3Extractor.f7831m;
                    jMo3740p2 = extractorInput.mo3740p();
                    if (metadata != null) {
                        mlltSeeker = null;
                        break;
                    }
                    length = metadata.f8661f.length;
                    i7 = 0;
                    while (true) {
                        if (i7 < length) {
                            mlltSeeker = null;
                            break;
                        }
                        bVar = metadata.f8661f[i7];
                        if (bVar instanceof MlltFrame) {
                            mlltFrame = (MlltFrame) bVar;
                            long jM3801d2 = m3801d(metadata);
                            length2 = mlltFrame.f8746j.length;
                            int i15 = length2 + 1;
                            jArr = new long[i15];
                            jArr2 = new long[i15];
                            jArr[0] = jMo3740p2;
                            jArr2[0] = 0;
                            j3 = 0;
                            for (i8 = 1; i8 <= length2; i8++) {
                                int i16 = i8 - 1;
                                jMo3740p2 += (long) (mlltFrame.f8744h + mlltFrame.f8746j[i16]);
                                j3 += (long) (mlltFrame.f8745i + mlltFrame.f8747k[i16]);
                                jArr[i8] = jMo3740p2;
                                jArr2[i8] = j3;
                            }
                            mlltSeeker = new MlltSeeker(jArr, jArr2, jM3801d2);
                            break;
                        }
                        i7++;
                    }
                    if (mp3Extractor.f7837s) {
                        seekerM3804b = new Seeker.a();
                    } else {
                        if ((mp3Extractor.f7820b & 2) != 0) {
                            if (mlltSeeker != null) {
                                jM3801d = mlltSeeker.f7818c;
                            } else {
                                if (seekerM3804b != null) {
                                    jMo3718i = seekerM3804b.mo3718i();
                                    jMo3798b = seekerM3804b.mo3798b();
                                } else {
                                    jM3801d = m3801d(mp3Extractor.f7831m);
                                }
                                seekerM3804b = new IndexSeeker(jMo3718i, extractorInput.mo3740p(), jMo3798b);
                            }
                            jMo3718i = jM3801d;
                            jMo3798b = -1;
                            seekerM3804b = new IndexSeeker(jMo3718i, extractorInput.mo3740p(), jMo3798b);
                        } else if (mlltSeeker != null) {
                            seekerM3804b = mlltSeeker;
                        } else if (seekerM3804b == null) {
                            seekerM3804b = null;
                        }
                        if (seekerM3804b != null || (!seekerM3804b.mo3716d() && (mp3Extractor.f7820b & 1) != 0)) {
                            seekerM3804b = m3804b(extractorInput);
                        }
                    }
                    mp3Extractor.f7836r = seekerM3804b;
                    mp3Extractor.f7827i.mo3772a(seekerM3804b);
                    TrackOutput2 trackOutput2 = mp3Extractor.f7829k;
                    Format.b bVar2 = new Format.b();
                    MpegAudioUtil.a aVar4 = mp3Extractor.f7823e;
                    bVar2.f6958k = aVar4.f7001b;
                    bVar2.f6959l = 4096;
                    bVar2.f6971x = aVar4.f7004e;
                    bVar2.f6972y = aVar4.f7003d;
                    GaplessInfoHolder gaplessInfoHolder3 = mp3Extractor.f7824f;
                    bVar2.f6944A = gaplessInfoHolder3.f8512b;
                    bVar2.f6945B = gaplessInfoHolder3.f8513c;
                    if ((mp3Extractor.f7820b & 4) != 0) {
                        metadata2 = null;
                    } else {
                        metadata2 = mp3Extractor.f7831m;
                    }
                    bVar2.f6956i = metadata2;
                    trackOutput2.mo3760e(bVar2.m3519a());
                    mp3Extractor.f7834p = extractorInput.mo3740p();
                } else {
                    mp3Extractor = this;
                    if (mp3Extractor.f7834p != 0) {
                        jMo3740p = extractorInput.mo3740p();
                        j2 = mp3Extractor.f7834p;
                        if (jMo3740p < j2) {
                            extractorInput2.mo3737l((int) (j2 - jMo3740p));
                        }
                    }
                }
                if (mp3Extractor.f7835q == 0) {
                    extractorInput.mo3736k();
                    if (m3805i(extractorInput)) {
                        i = -1;
                    } else {
                        mp3Extractor.f7822d.m3194D(0);
                        iM3201f = mp3Extractor.f7822d.m3201f();
                        if (m3802h(iM3201f, mp3Extractor.f7830l) || MpegAudioUtil.m3528a(iM3201f) == -1) {
                            extractorInput2.mo3737l(1);
                            mp3Extractor.f7830l = 0;
                        } else {
                            mp3Extractor.f7823e.m3532a(iM3201f);
                            if (mp3Extractor.f7832n == -9223372036854775807L) {
                                mp3Extractor.f7832n = mp3Extractor.f7836r.mo3797a(extractorInput.mo3740p());
                                if (mp3Extractor.f7821c != -9223372036854775807L) {
                                    mp3Extractor.f7832n = (mp3Extractor.f7821c - mp3Extractor.f7836r.mo3797a(0L)) + mp3Extractor.f7832n;
                                }
                            }
                            MpegAudioUtil.a aVar5 = mp3Extractor.f7823e;
                            mp3Extractor.f7835q = aVar5.f7002c;
                            Seeker seeker = mp3Extractor.f7836r;
                            if (seeker instanceof IndexSeeker) {
                                IndexSeeker indexSeeker = (IndexSeeker) seeker;
                                long jM3803a = mp3Extractor.m3803a(mp3Extractor.f7833o + ((long) aVar5.f7006g));
                                long jMo3740p5 = extractorInput.mo3740p() + ((long) mp3Extractor.f7823e.f7002c);
                                if (!indexSeeker.m3799c(jM3803a)) {
                                    indexSeeker.f7813b.m3157a(jM3803a);
                                    indexSeeker.f7814c.m3157a(jMo3740p5);
                                }
                                if (mp3Extractor.f7838t && indexSeeker.m3799c(mp3Extractor.f7839u)) {
                                    mp3Extractor.f7838t = false;
                                    mp3Extractor.f7829k = mp3Extractor.f7828j;
                                }
                            }
                            iMo3757b = mp3Extractor.f7829k.mo3757b(extractorInput2, mp3Extractor.f7835q, true);
                            if (iMo3757b == -1) {
                                i = -1;
                            } else {
                                i2 = mp3Extractor.f7835q - iMo3757b;
                                mp3Extractor.f7835q = i2;
                                if (i2 <= 0) {
                                    mp3Extractor.f7829k.mo3759d(mp3Extractor.m3803a(mp3Extractor.f7833o), 1, mp3Extractor.f7823e.f7002c, 0, null);
                                    mp3Extractor.f7833o += (long) mp3Extractor.f7823e.f7006g;
                                    mp3Extractor.f7835q = 0;
                                }
                            }
                        }
                        i = 0;
                    }
                } else {
                    iMo3757b = mp3Extractor.f7829k.mo3757b(extractorInput2, mp3Extractor.f7835q, true);
                    if (iMo3757b == -1) {
                        i = -1;
                    } else {
                        i2 = mp3Extractor.f7835q - iMo3757b;
                        mp3Extractor.f7835q = i2;
                        if (i2 <= 0) {
                            mp3Extractor.f7829k.mo3759d(mp3Extractor.m3803a(mp3Extractor.f7833o), 1, mp3Extractor.f7823e.f7002c, 0, null);
                            mp3Extractor.f7833o += (long) mp3Extractor.f7823e.f7006g;
                            mp3Extractor.f7835q = 0;
                        }
                        i = 0;
                    }
                }
            } catch (EOFException unused) {
                i = -1;
                mp3Extractor = this;
            }
        } else {
            if (this.f7836r == null) {
                parsableByteArray = new ParsableByteArray(this.f7823e.f7002c);
                extractorInput2.mo3739o(parsableByteArray.f6392a, 0, this.f7823e.f7002c);
                aVar = this.f7823e;
                i3 = 21;
                if ((aVar.f7000a & 1) != 0) {
                    if (aVar.f7004e != 1) {
                        i3 = 36;
                    }
                } else if (aVar.f7004e == 1) {
                    i3 = 13;
                }
                if (parsableByteArray.f6394c >= i3 + 4) {
                    parsableByteArray.m3194D(i3);
                    iM3201f2 = parsableByteArray.m3201f();
                    if (iM3201f2 != 1483304551) {
                        if (parsableByteArray.f6394c >= 40) {
                            parsableByteArray.m3194D(36);
                            if (parsableByteArray.m3201f() == 1447187017) {
                                iM3201f2 = 1447187017;
                            } else {
                                iM3201f2 = 0;
                            }
                        } else {
                            iM3201f2 = 0;
                        }
                    }
                } else if (parsableByteArray.f6394c >= 40) {
                    parsableByteArray.m3194D(36);
                    if (parsableByteArray.m3201f() == 1447187017) {
                        iM3201f2 = 1447187017;
                    } else {
                        iM3201f2 = 0;
                    }
                } else {
                    iM3201f2 = 0;
                }
                String str4 = ", ";
                if (iM3201f2 != 1483304551) {
                    mp3Extractor = this;
                    long jMo3729a3 = extractorInput.mo3729a();
                    long jMo3740p6 = extractorInput.mo3740p();
                    MpegAudioUtil.a aVar6 = mp3Extractor.f7823e;
                    int i17 = aVar6.f7006g;
                    int i18 = aVar6.f7003d;
                    iM3201f3 = parsableByteArray.m3201f();
                    if ((iM3201f3 & 1) == 1) {
                        seekerM3804b = null;
                    } else {
                        seekerM3804b = null;
                    }
                    if (seekerM3804b != null) {
                        gaplessInfoHolder = mp3Extractor.f7824f;
                        if (gaplessInfoHolder.f8512b != -1) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            extractorInput.mo3736k();
                            extractorInput2 = extractorInput;
                            extractorInput2.mo3733f(i4 + 141);
                            extractorInput2.mo3739o(mp3Extractor.f7822d.f6392a, 0, 3);
                            mp3Extractor.f7822d.m3194D(0);
                            gaplessInfoHolder2 = mp3Extractor.f7824f;
                            int iM3216u2 = mp3Extractor.f7822d.m3216u();
                            Objects.requireNonNull(gaplessInfoHolder2);
                            i5 = iM3216u2 >> 12;
                            i6 = iM3216u2 & 4095;
                            if (i5 <= 0) {
                                i4 = i3;
                                gaplessInfoHolder2.f8512b = i5;
                                gaplessInfoHolder2.f8513c = i6;
                            } else {
                                i4 = i3;
                                gaplessInfoHolder2.f8512b = i5;
                                gaplessInfoHolder2.f8513c = i6;
                            }
                        } else {
                            extractorInput2 = extractorInput;
                        }
                    } else {
                        extractorInput2 = extractorInput;
                    }
                    extractorInput2.mo3737l(mp3Extractor.f7823e.f7002c);
                    if (seekerM3804b != null) {
                        seekerM3804b = m3804b(extractorInput);
                    }
                } else {
                    mp3Extractor = this;
                    long jMo3729a4 = extractorInput.mo3729a();
                    long jMo3740p7 = extractorInput.mo3740p();
                    MpegAudioUtil.a aVar7 = mp3Extractor.f7823e;
                    int i19 = aVar7.f7006g;
                    int i110 = aVar7.f7003d;
                    iM3201f3 = parsableByteArray.m3201f();
                    if ((iM3201f3 & 1) == 1) {
                        seekerM3804b = null;
                    } else {
                        seekerM3804b = null;
                    }
                    if (seekerM3804b != null) {
                        gaplessInfoHolder = mp3Extractor.f7824f;
                        if (gaplessInfoHolder.f8512b != -1) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            extractorInput.mo3736k();
                            extractorInput2 = extractorInput;
                            extractorInput2.mo3733f(i4 + 141);
                            extractorInput2.mo3739o(mp3Extractor.f7822d.f6392a, 0, 3);
                            mp3Extractor.f7822d.m3194D(0);
                            gaplessInfoHolder2 = mp3Extractor.f7824f;
                            int iM3216u3 = mp3Extractor.f7822d.m3216u();
                            Objects.requireNonNull(gaplessInfoHolder2);
                            i5 = iM3216u3 >> 12;
                            i6 = iM3216u3 & 4095;
                            if (i5 <= 0) {
                                i4 = i3;
                                gaplessInfoHolder2.f8512b = i5;
                                gaplessInfoHolder2.f8513c = i6;
                            } else {
                                i4 = i3;
                                gaplessInfoHolder2.f8512b = i5;
                                gaplessInfoHolder2.f8513c = i6;
                            }
                        } else {
                            extractorInput2 = extractorInput;
                        }
                    } else {
                        extractorInput2 = extractorInput;
                    }
                    extractorInput2.mo3737l(mp3Extractor.f7823e.f7002c);
                    if (seekerM3804b != null) {
                        seekerM3804b = m3804b(extractorInput);
                    }
                }
                metadata = mp3Extractor.f7831m;
                jMo3740p2 = extractorInput.mo3740p();
                if (metadata != null) {
                    mlltSeeker = null;
                    break;
                }
                length = metadata.f8661f.length;
                i7 = 0;
                while (true) {
                    if (i7 < length) {
                        mlltSeeker = null;
                        break;
                    }
                    bVar = metadata.f8661f[i7];
                    if (bVar instanceof MlltFrame) {
                        mlltFrame = (MlltFrame) bVar;
                        long jM3801d3 = m3801d(metadata);
                        length2 = mlltFrame.f8746j.length;
                        int i111 = length2 + 1;
                        jArr = new long[i111];
                        jArr2 = new long[i111];
                        jArr[0] = jMo3740p2;
                        jArr2[0] = 0;
                        j3 = 0;
                        while (i8 <= length2) {
                            int i112 = i8 - 1;
                            jMo3740p2 += (long) (mlltFrame.f8744h + mlltFrame.f8746j[i112]);
                            j3 += (long) (mlltFrame.f8745i + mlltFrame.f8747k[i112]);
                            jArr[i8] = jMo3740p2;
                            jArr2[i8] = j3;
                        }
                        mlltSeeker = new MlltSeeker(jArr, jArr2, jM3801d3);
                        break;
                    }
                    i7++;
                }
                if (mp3Extractor.f7837s) {
                    seekerM3804b = new Seeker.a();
                } else {
                    if ((mp3Extractor.f7820b & 2) != 0) {
                        if (mlltSeeker != null) {
                            jM3801d = mlltSeeker.f7818c;
                        } else {
                            if (seekerM3804b != null) {
                                jMo3718i = seekerM3804b.mo3718i();
                                jMo3798b = seekerM3804b.mo3798b();
                            } else {
                                jM3801d = m3801d(mp3Extractor.f7831m);
                            }
                            seekerM3804b = new IndexSeeker(jMo3718i, extractorInput.mo3740p(), jMo3798b);
                        }
                        jMo3718i = jM3801d;
                        jMo3798b = -1;
                        seekerM3804b = new IndexSeeker(jMo3718i, extractorInput.mo3740p(), jMo3798b);
                    } else if (mlltSeeker != null) {
                        seekerM3804b = mlltSeeker;
                    } else if (seekerM3804b == null) {
                        seekerM3804b = null;
                    }
                    if (seekerM3804b != null) {
                        seekerM3804b = m3804b(extractorInput);
                    } else {
                        seekerM3804b = m3804b(extractorInput);
                    }
                }
                mp3Extractor.f7836r = seekerM3804b;
                mp3Extractor.f7827i.mo3772a(seekerM3804b);
                TrackOutput2 trackOutput3 = mp3Extractor.f7829k;
                Format.b bVar3 = new Format.b();
                MpegAudioUtil.a aVar8 = mp3Extractor.f7823e;
                bVar3.f6958k = aVar8.f7001b;
                bVar3.f6959l = 4096;
                bVar3.f6971x = aVar8.f7004e;
                bVar3.f6972y = aVar8.f7003d;
                GaplessInfoHolder gaplessInfoHolder4 = mp3Extractor.f7824f;
                bVar3.f6944A = gaplessInfoHolder4.f8512b;
                bVar3.f6945B = gaplessInfoHolder4.f8513c;
                if ((mp3Extractor.f7820b & 4) != 0) {
                    metadata2 = null;
                } else {
                    metadata2 = mp3Extractor.f7831m;
                }
                bVar3.f6956i = metadata2;
                trackOutput3.mo3760e(bVar3.m3519a());
                mp3Extractor.f7834p = extractorInput.mo3740p();
            } else {
                mp3Extractor = this;
                if (mp3Extractor.f7834p != 0) {
                    jMo3740p = extractorInput.mo3740p();
                    j2 = mp3Extractor.f7834p;
                    if (jMo3740p < j2) {
                        extractorInput2.mo3737l((int) (j2 - jMo3740p));
                    }
                }
            }
            if (mp3Extractor.f7835q == 0) {
                extractorInput.mo3736k();
                if (m3805i(extractorInput)) {
                    i = -1;
                } else {
                    mp3Extractor.f7822d.m3194D(0);
                    iM3201f = mp3Extractor.f7822d.m3201f();
                    if (m3802h(iM3201f, mp3Extractor.f7830l)) {
                    }
                    extractorInput2.mo3737l(1);
                    mp3Extractor.f7830l = 0;
                    i = 0;
                }
            } else {
                iMo3757b = mp3Extractor.f7829k.mo3757b(extractorInput2, mp3Extractor.f7835q, true);
                if (iMo3757b == -1) {
                    i = -1;
                } else {
                    i2 = mp3Extractor.f7835q - iMo3757b;
                    mp3Extractor.f7835q = i2;
                    if (i2 <= 0) {
                        mp3Extractor.f7829k.mo3759d(mp3Extractor.m3803a(mp3Extractor.f7833o), 1, mp3Extractor.f7823e.f7002c, 0, null);
                        mp3Extractor.f7833o += (long) mp3Extractor.f7823e.f7006g;
                        mp3Extractor.f7835q = 0;
                    }
                    i = 0;
                }
            }
        }
        if (i == -1 && (mp3Extractor.f7836r instanceof IndexSeeker)) {
            long jM3803a2 = mp3Extractor.m3803a(mp3Extractor.f7833o);
            if (mp3Extractor.f7836r.mo3718i() != jM3803a2) {
                Seeker seeker2 = mp3Extractor.f7836r;
                ((IndexSeeker) seeker2).f7815d = jM3803a2;
                mp3Extractor.f7827i.mo3772a(seeker2);
            }
        }
        return i;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f7827i = extractorOutput;
        TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(0, 1);
        this.f7828j = trackOutput2Mo3774o;
        this.f7829k = trackOutput2Mo3774o;
        this.f7827i.mo3773j();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        this.f7830l = 0;
        this.f7832n = -9223372036854775807L;
        this.f7833o = 0L;
        this.f7835q = 0;
        this.f7839u = j3;
        Seeker seeker = this.f7836r;
        if (!(seeker instanceof IndexSeeker) || ((IndexSeeker) seeker).m3799c(j3)) {
            return;
        }
        this.f7838t = true;
        this.f7829k = this.f7826h;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3805i(ExtractorInput extractorInput) throws IOException {
        Seeker seeker = this.f7836r;
        if (seeker != null) {
            long jMo3798b = seeker.mo3798b();
            if (jMo3798b != -1 && extractorInput.mo3732e() > jMo3798b - 4) {
                return true;
            }
        }
        try {
            return !extractorInput.mo3731d(this.f7822d.f6392a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3806j(ExtractorInput extractorInput, boolean z) throws IOException {
        int i;
        int iMo3732e;
        int iM3528a;
        int i2 = z ? 32768 : 131072;
        extractorInput.mo3736k();
        if (extractorInput.mo3740p() == 0) {
            Metadata metadataM3925a = this.f7825g.m3925a(extractorInput, (this.f7820b & 4) == 0 ? null : f7819a);
            this.f7831m = metadataM3925a;
            if (metadataM3925a != null) {
                this.f7824f.m3924b(metadataM3925a);
            }
            iMo3732e = (int) extractorInput.mo3732e();
            if (!z) {
                extractorInput.mo3737l(iMo3732e);
            }
            i = 0;
        } else {
            i = 0;
            iMo3732e = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (m3805i(extractorInput)) {
                if (i3 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.f7822d.m3194D(0);
            int iM3201f = this.f7822d.m3201f();
            if ((i == 0 || m3802h(iM3201f, i)) && (iM3528a = MpegAudioUtil.m3528a(iM3201f)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.f7823e.m3532a(iM3201f);
                    i = iM3201f;
                }
                extractorInput.mo3733f(iM3528a - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    throw new ParserException("Searched too many bytes.");
                }
                if (z) {
                    extractorInput.mo3736k();
                    extractorInput.mo3733f(iMo3732e + i5);
                } else {
                    extractorInput.mo3737l(1);
                }
                i4 = i5;
                i = 0;
                i3 = 0;
            }
        }
        if (z) {
            extractorInput.mo3737l(iMo3732e + i4);
        } else {
            extractorInput.mo3736k();
        }
        this.f7830l = i;
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }

    public Mp3Extractor(int i) {
        this(i, -9223372036854775807L);
    }

    public Mp3Extractor(int i, long j2) {
        this.f7820b = i;
        this.f7821c = j2;
        this.f7822d = new ParsableByteArray(10);
        this.f7823e = new MpegAudioUtil.a();
        this.f7824f = new GaplessInfoHolder();
        this.f7832n = -9223372036854775807L;
        this.f7825g = new Id3Peeker();
        DummyTrackOutput dummyTrackOutput = new DummyTrackOutput();
        this.f7826h = dummyTrackOutput;
        this.f7829k = dummyTrackOutput;
    }
}
