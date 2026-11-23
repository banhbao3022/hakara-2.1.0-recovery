package p007c.p190n.p194b.p209b.p221s1.p226i0;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.stetho.dumpapp.Framer;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.LongArray;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.NalUnitUtil;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p213c2.AvcConfig;
import p007c.p190n.p194b.p209b.p213c2.ColorInfo;
import p007c.p190n.p194b.p209b.p213c2.DolbyVisionConfig;
import p007c.p190n.p194b.p209b.p213c2.HevcConfig;
import p007c.p190n.p194b.p209b.p215n1.AacUtil;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p209b.p221s1.ChunkIndex;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;

/* JADX INFO: renamed from: c.n.b.b.s1.i0.e, reason: use source file name */
/* JADX INFO: compiled from: MatroskaExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public class MatroskaExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public static final byte[] f7686a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f7687b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f7688c;

    /* JADX INFO: renamed from: d */
    public static final UUID f7689d;

    /* JADX INFO: renamed from: e */
    public static final Map<String, Integer> f7690e;

    /* JADX INFO: renamed from: A */
    public boolean f7691A;

    /* JADX INFO: renamed from: B */
    public int f7692B;

    /* JADX INFO: renamed from: C */
    public long f7693C;

    /* JADX INFO: renamed from: D */
    public boolean f7694D;

    /* JADX INFO: renamed from: E */
    public long f7695E;

    /* JADX INFO: renamed from: F */
    public long f7696F;

    /* JADX INFO: renamed from: G */
    public long f7697G;

    /* JADX INFO: renamed from: H */
    public LongArray f7698H;

    /* JADX INFO: renamed from: I */
    public LongArray f7699I;

    /* JADX INFO: renamed from: J */
    public boolean f7700J;

    /* JADX INFO: renamed from: K */
    public boolean f7701K;

    /* JADX INFO: renamed from: L */
    public int f7702L;

    /* JADX INFO: renamed from: M */
    public long f7703M;

    /* JADX INFO: renamed from: N */
    public long f7704N;

    /* JADX INFO: renamed from: O */
    public int f7705O;

    /* JADX INFO: renamed from: P */
    public int f7706P;

    /* JADX INFO: renamed from: Q */
    public int[] f7707Q;

    /* JADX INFO: renamed from: R */
    public int f7708R;

    /* JADX INFO: renamed from: S */
    public int f7709S;

    /* JADX INFO: renamed from: T */
    public int f7710T;

    /* JADX INFO: renamed from: U */
    public int f7711U;

    /* JADX INFO: renamed from: V */
    public boolean f7712V;

    /* JADX INFO: renamed from: W */
    public int f7713W;

    /* JADX INFO: renamed from: X */
    public int f7714X;

    /* JADX INFO: renamed from: Y */
    public int f7715Y;

    /* JADX INFO: renamed from: Z */
    public boolean f7716Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f7717a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f7718b0;

    /* JADX INFO: renamed from: c0 */
    public int f7719c0;

    /* JADX INFO: renamed from: d0 */
    public byte f7720d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f7721e0;

    /* JADX INFO: renamed from: f */
    public final EbmlReader f7722f;

    /* JADX INFO: renamed from: f0 */
    public ExtractorOutput f7723f0;

    /* JADX INFO: renamed from: g */
    public final VarintReader f7724g;

    /* JADX INFO: renamed from: h */
    public final SparseArray<c> f7725h;

    /* JADX INFO: renamed from: i */
    public final boolean f7726i;

    /* JADX INFO: renamed from: j */
    public final ParsableByteArray f7727j;

    /* JADX INFO: renamed from: k */
    public final ParsableByteArray f7728k;

    /* JADX INFO: renamed from: l */
    public final ParsableByteArray f7729l;

    /* JADX INFO: renamed from: m */
    public final ParsableByteArray f7730m;

    /* JADX INFO: renamed from: n */
    public final ParsableByteArray f7731n;

    /* JADX INFO: renamed from: o */
    public final ParsableByteArray f7732o;

    /* JADX INFO: renamed from: p */
    public final ParsableByteArray f7733p;

    /* JADX INFO: renamed from: q */
    public final ParsableByteArray f7734q;

    /* JADX INFO: renamed from: r */
    public final ParsableByteArray f7735r;

    /* JADX INFO: renamed from: s */
    public final ParsableByteArray f7736s;

    /* JADX INFO: renamed from: t */
    public ByteBuffer f7737t;

    /* JADX INFO: renamed from: u */
    public long f7738u;

    /* JADX INFO: renamed from: v */
    public long f7739v;

    /* JADX INFO: renamed from: w */
    public long f7740w;

    /* JADX INFO: renamed from: x */
    public long f7741x;

    /* JADX INFO: renamed from: y */
    public long f7742y;

    /* JADX INFO: renamed from: z */
    public c f7743z;

    /* JADX INFO: renamed from: c.n.b.b.s1.i0.e$b */
    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public final class b implements EbmlProcessor {
        public b(a aVar) {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:210:0x0332  */
        /* JADX WARN: Code duplicated, block: B:346:0x04dd  */
        /* JADX WARN: Code duplicated, block: B:465:0x07e4  */
        /* JADX WARN: Code duplicated, block: B:467:0x07ec  */
        /* JADX WARN: Code duplicated, block: B:470:0x080f  */
        /* JADX WARN: Code duplicated, block: B:485:0x0841  */
        /* JADX WARN: Code duplicated, block: B:490:0x0858  */
        /* JADX WARN: Code duplicated, block: B:491:0x085a  */
        /* JADX WARN: Code duplicated, block: B:494:0x0867  */
        /* JADX WARN: Code duplicated, block: B:495:0x0873  */
        /* JADX WARN: Code duplicated, block: B:497:0x0879  */
        /* JADX WARN: Code duplicated, block: B:499:0x087d  */
        /* JADX WARN: Code duplicated, block: B:501:0x0882  */
        /* JADX WARN: Code duplicated, block: B:504:0x088a  */
        /* JADX WARN: Code duplicated, block: B:506:0x088f  */
        /* JADX WARN: Code duplicated, block: B:509:0x0894  */
        /* JADX WARN: Code duplicated, block: B:512:0x08a4  */
        /* JADX WARN: Code duplicated, block: B:515:0x08aa  */
        /* JADX WARN: Code duplicated, block: B:517:0x08b2  */
        /* JADX WARN: Code duplicated, block: B:537:0x096e  */
        /* JADX WARN: Code duplicated, block: B:539:0x097b  */
        /* JADX WARN: Code duplicated, block: B:542:0x0980  */
        /* JADX WARN: Code duplicated, block: B:544:0x0988  */
        /* JADX WARN: Code duplicated, block: B:545:0x0995  */
        /* JADX WARN: Code duplicated, block: B:548:0x099a  */
        /* JADX WARN: Code duplicated, block: B:554:0x09b3  */
        /* JADX WARN: Code duplicated, block: B:555:0x09b5  */
        /* JADX WARN: Code duplicated, block: B:557:0x09bf  */
        /* JADX WARN: Code duplicated, block: B:558:0x09c2  */
        /* JADX WARN: Code duplicated, block: B:560:0x09cc  */
        /* JADX WARN: Code duplicated, block: B:566:0x09e4  */
        /* JADX WARN: Code duplicated, block: B:568:0x09fe  */
        /* JADX WARN: Code duplicated, block: B:570:0x0a06  */
        /* JADX WARN: Code duplicated, block: B:584:0x0a34  */
        /* JADX INFO: renamed from: a */
        public void m3789a(int i) throws ParserException {
            boolean z;
            MatroskaExtractor matroskaExtractor;
            byte b;
            int i2;
            String str;
            boolean z2;
            int iM3136x;
            String str2;
            int i3;
            String str3;
            ArrayList arrayList;
            Pair pair;
            String str4;
            String str5;
            String str6;
            int i4;
            List<byte[]> list;
            String str7;
            int i5;
            List<byte[]> list2;
            List<byte[]> list3;
            int i6;
            List<byte[]> list4;
            List<byte[]> list5;
            int i7;
            String str8;
            List<byte[]> listSingletonList;
            List<byte[]> listM11637B;
            List<byte[]> list6;
            byte[] bArr;
            int i8;
            Format.b bVar;
            int i9;
            int i10;
            float f;
            ColorInfo colorInfo;
            String str9;
            int iIntValue;
            Map<String, Integer> map;
            byte[] bArr2;
            int i11;
            int i12;
            int i13;
            String str10;
            DolbyVisionConfig dolbyVisionConfigM3258a;
            List<byte[]> list7;
            SeekMap bVar2;
            int i14;
            int i15;
            MatroskaExtractor matroskaExtractor2 = MatroskaExtractor.this;
            C2096e.m4572h(matroskaExtractor2.f7723f0);
            int i16 = 0;
            if (i == 160) {
                if (matroskaExtractor2.f7702L != 2) {
                    return;
                }
                int i17 = 0;
                for (int i18 = 0; i18 < matroskaExtractor2.f7706P; i18++) {
                    i17 += matroskaExtractor2.f7707Q[i18];
                }
                c cVar = matroskaExtractor2.f7725h.get(matroskaExtractor2.f7708R);
                Objects.requireNonNull(cVar.f7768X);
                int i19 = 0;
                while (i19 < matroskaExtractor2.f7706P) {
                    long j2 = matroskaExtractor2.f7703M + ((long) ((cVar.f7774e * i19) / CloseCodes.NORMAL_CLOSURE));
                    int i20 = matroskaExtractor2.f7710T;
                    if (i19 == 0 && !matroskaExtractor2.f7712V) {
                        i20 |= 1;
                    }
                    int i21 = matroskaExtractor2.f7707Q[i19];
                    int i22 = i17 - i21;
                    matroskaExtractor2.m3782d(cVar, j2, i20, i21, i22);
                    i19++;
                    i17 = i22;
                }
                matroskaExtractor2.f7702L = 0;
                return;
            }
            if (i != 174) {
                if (i == 19899) {
                    int i23 = matroskaExtractor2.f7692B;
                    if (i23 != -1) {
                        long j3 = matroskaExtractor2.f7693C;
                        if (j3 != -1) {
                            if (i23 == 475249515) {
                                matroskaExtractor2.f7695E = j3;
                                return;
                            }
                            return;
                        }
                    }
                    throw new ParserException("Mandatory element SeekID or SeekPosition not found");
                }
                if (i == 25152) {
                    matroskaExtractor2.m3781b(i);
                    c cVar2 = matroskaExtractor2.f7743z;
                    if (cVar2.f7777h) {
                        TrackOutput2.a aVar = cVar2.f7779j;
                        if (aVar == null) {
                            throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
                        }
                        cVar2.f7781l = new DrmInitData(new DrmInitData.b(C.f6403a, "video/webm", aVar.f8528b));
                        return;
                    }
                    return;
                }
                if (i == 28032) {
                    matroskaExtractor2.m3781b(i);
                    c cVar3 = matroskaExtractor2.f7743z;
                    if (cVar3.f7777h && cVar3.f7778i != null) {
                        throw new ParserException("Combining encryption and compression is not supported");
                    }
                    return;
                }
                if (i == 357149030) {
                    if (matroskaExtractor2.f7740w == -9223372036854775807L) {
                        matroskaExtractor2.f7740w = 1000000L;
                    }
                    long j4 = matroskaExtractor2.f7741x;
                    if (j4 != -9223372036854775807L) {
                        matroskaExtractor2.f7742y = matroskaExtractor2.m3785l(j4);
                        return;
                    }
                    return;
                }
                if (i == 374648427) {
                    if (matroskaExtractor2.f7725h.size() == 0) {
                        throw new ParserException("No valid tracks were found");
                    }
                    matroskaExtractor2.f7723f0.mo3773j();
                    return;
                }
                if (i != 475249515) {
                    return;
                }
                if (!matroskaExtractor2.f7691A) {
                    ExtractorOutput extractorOutput = matroskaExtractor2.f7723f0;
                    LongArray longArray = matroskaExtractor2.f7698H;
                    LongArray longArray2 = matroskaExtractor2.f7699I;
                    if (matroskaExtractor2.f7739v == -1 || matroskaExtractor2.f7742y == -9223372036854775807L || longArray == null || (i14 = longArray.f6358a) == 0 || longArray2 == null || longArray2.f6358a != i14) {
                        bVar2 = new SeekMap.b(matroskaExtractor2.f7742y);
                    } else {
                        int[] iArrCopyOf = new int[i14];
                        long[] jArrCopyOf = new long[i14];
                        long[] jArrCopyOf2 = new long[i14];
                        long[] jArrCopyOf3 = new long[i14];
                        for (int i24 = 0; i24 < i14; i24++) {
                            jArrCopyOf3[i24] = longArray.m3158b(i24);
                            jArrCopyOf[i24] = longArray2.m3158b(i24) + matroskaExtractor2.f7739v;
                        }
                        while (true) {
                            i15 = i14 - 1;
                            if (i16 >= i15) {
                                break;
                            }
                            int i25 = i16 + 1;
                            iArrCopyOf[i16] = (int) (jArrCopyOf[i25] - jArrCopyOf[i16]);
                            jArrCopyOf2[i16] = jArrCopyOf3[i25] - jArrCopyOf3[i16];
                            i16 = i25;
                        }
                        iArrCopyOf[i15] = (int) ((matroskaExtractor2.f7739v + matroskaExtractor2.f7738u) - jArrCopyOf[i15]);
                        jArrCopyOf2[i15] = matroskaExtractor2.f7742y - jArrCopyOf3[i15];
                        long j5 = jArrCopyOf2[i15];
                        if (j5 <= 0) {
                            Log.w("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j5);
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
                        }
                        bVar2 = new ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                    }
                    extractorOutput.mo3772a(bVar2);
                    matroskaExtractor2.f7691A = true;
                }
                matroskaExtractor2.f7698H = null;
                matroskaExtractor2.f7699I = null;
                return;
            }
            c cVar4 = matroskaExtractor2.f7743z;
            C2096e.m4572h(cVar4);
            String str11 = cVar4.f7771b;
            if (str11 == null) {
                throw new ParserException("CodecId is missing in TrackEntry element");
            }
            switch (str11) {
                case "V_MPEG4/ISO/AP":
                case "V_MPEG4/ISO/SP":
                case "A_MS/ACM":
                case "A_TRUEHD":
                case "A_VORBIS":
                case "A_MPEG/L2":
                case "A_MPEG/L3":
                case "V_MS/VFW/FOURCC":
                case "S_DVBSUB":
                case "V_MPEG4/ISO/ASP":
                case "V_MPEG4/ISO/AVC":
                case "S_VOBSUB":
                case "A_DTS/LOSSLESS":
                case "A_AAC":
                case "A_AC3":
                case "A_DTS":
                case "V_AV1":
                case "V_VP8":
                case "V_VP9":
                case "S_HDMV/PGS":
                case "V_THEORA":
                case "A_DTS/EXPRESS":
                case "A_PCM/FLOAT/IEEE":
                case "A_PCM/INT/BIG":
                case "A_PCM/INT/LIT":
                case "S_TEXT/ASS":
                case "V_MPEGH/ISO/HEVC":
                case "S_TEXT/UTF8":
                case "V_MPEG2":
                case "A_EAC3":
                case "A_FLAC":
                case "A_OPUS":
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                ExtractorOutput extractorOutput2 = matroskaExtractor2.f7723f0;
                int i26 = cVar4.f7772c;
                String str12 = cVar4.f7771b;
                str12.hashCode();
                switch (str12) {
                    case "V_MPEG4/ISO/AP":
                        b = 0;
                        break;
                    case "V_MPEG4/ISO/SP":
                        b = 1;
                        break;
                    case "A_MS/ACM":
                        b = 2;
                        break;
                    case "A_TRUEHD":
                        b = 3;
                        break;
                    case "A_VORBIS":
                        b = 4;
                        break;
                    case "A_MPEG/L2":
                        b = 5;
                        break;
                    case "A_MPEG/L3":
                        b = 6;
                        break;
                    case "V_MS/VFW/FOURCC":
                        b = 7;
                        break;
                    case "S_DVBSUB":
                        b = 8;
                        break;
                    case "V_MPEG4/ISO/ASP":
                        b = 9;
                        break;
                    case "V_MPEG4/ISO/AVC":
                        b = 10;
                        break;
                    case "S_VOBSUB":
                        b = 11;
                        break;
                    case "A_DTS/LOSSLESS":
                        b = 12;
                        break;
                    case "A_AAC":
                        b = 13;
                        break;
                    case "A_AC3":
                        b = 14;
                        break;
                    case "A_DTS":
                        b = 15;
                        break;
                    case "V_AV1":
                        b = 16;
                        break;
                    case "V_VP8":
                        b = 17;
                        break;
                    case "V_VP9":
                        b = 18;
                        break;
                    case "S_HDMV/PGS":
                        b = 19;
                        break;
                    case "V_THEORA":
                        b = 20;
                        break;
                    case "A_DTS/EXPRESS":
                        b = 21;
                        break;
                    case "A_PCM/FLOAT/IEEE":
                        b = 22;
                        break;
                    case "A_PCM/INT/BIG":
                        b = 23;
                        break;
                    case "A_PCM/INT/LIT":
                        b = 24;
                        break;
                    case "S_TEXT/ASS":
                        b = 25;
                        break;
                    case "V_MPEGH/ISO/HEVC":
                        b = 26;
                        break;
                    case "S_TEXT/UTF8":
                        b = 27;
                        break;
                    case "V_MPEG2":
                        b = 28;
                        break;
                    case "A_EAC3":
                        b = 29;
                        break;
                    case "A_FLAC":
                        b = 30;
                        break;
                    case "A_OPUS":
                        b = 31;
                        break;
                    default:
                        b = -1;
                        break;
                }
                String str13 = "video/x-unknown";
                String str14 = "audio/x-unknown";
                String str15 = "audio/raw";
                switch (b) {
                    case 0:
                    case 1:
                    case 9:
                        i2 = 1;
                        byte[] bArr3 = cVar4.f7780k;
                        str = "video/mp4v-es";
                        listSingletonList = bArr3 == null ? null : Collections.singletonList(bArr3);
                        i4 = i2;
                        str2 = str;
                        list3 = listSingletonList;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null && (dolbyVisionConfigM3258a = DolbyVisionConfig.m3258a(new ParsableByteArray(bArr))) != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i27 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i28 = i27 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9 || (i11 = cVar4.f7785p) == i9) {
                                f = -1.0f;
                            } else {
                                f = (cVar4.f7783n * i10) / (cVar4.f7782m * i11);
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f || cVar4.f7749E == -1.0f || cVar4.f7750F == -1.0f || cVar4.f7751G == -1.0f || cVar4.f7752H == -1.0f || cVar4.f7753I == -1.0f || cVar4.f7754J == -1.0f || cVar4.f7755K == -1.0f || cVar4.f7756L == -1.0f || cVar4.f7757M == -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = new byte[25];
                                    ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder.put((byte) 0);
                                    byteBufferOrder.putShort((short) ((cVar4.f7748D * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((cVar4.f7749E * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((cVar4.f7750F * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((cVar4.f7751G * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((cVar4.f7752H * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((cVar4.f7753I * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((cVar4.f7754J * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((cVar4.f7755K * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) (cVar4.f7756L + 0.5f));
                                    byteBufferOrder.putShort((short) (cVar4.f7757M + 0.5f));
                                    byteBufferOrder.putShort((short) cVar4.f7746B);
                                    byteBufferOrder.putShort((short) cVar4.f7747C);
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0 && Float.compare(cVar4.f7788s, 0.0f) == 0 && Float.compare(cVar4.f7789t, 0.0f) == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0 || Float.compare(cVar4.f7789t, 180.0f) == 0) {
                                    iIntValue = 180;
                                } else if (Float.compare(cVar4.f7789t, -90.0f) == 0) {
                                    iIntValue = 270;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15) && !"text/x-ssa".equals(str15) && !"application/vobsub".equals(str15) && !"application/pgs".equals(str15) && !"application/dvbsubs".equals(str15)) {
                                throw new ParserException("Unexpected MIME type.");
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null && !MatroskaExtractor.f7690e.containsKey(str10)) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i28;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o;
                        trackOutput2Mo3774o.mo3760e(formatM3519a);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 2:
                        ParsableByteArray parsableByteArray = new ParsableByteArray(cVar4.m3790a(cVar4.f7771b));
                        try {
                            int iM3207l = parsableByteArray.m3207l();
                            if (iM3207l != 1) {
                                if (iM3207l == 65534) {
                                    parsableByteArray.m3194D(24);
                                    long jM3208m = parsableByteArray.m3208m();
                                    UUID uuid = MatroskaExtractor.f7689d;
                                    if (jM3208m != uuid.getMostSignificantBits() || parsableByteArray.m3208m() != uuid.getLeastSignificantBits()) {
                                    }
                                    if (z2) {
                                        iM3136x = Util6.m3136x(cVar4.f7760P);
                                        if (iM3136x == 0) {
                                            StringBuilder sbM1556G = outline.m1556G("Unsupported PCM bit depth: ");
                                            sbM1556G.append(cVar4.f7760P);
                                            sbM1556G.append(". Setting mimeType to ");
                                            sbM1556G.append("audio/x-unknown");
                                            Log.w("MatroskaExtractor", sbM1556G.toString());
                                        }
                                        i5 = 1;
                                        list2 = null;
                                        str7 = null;
                                        i6 = -1;
                                        list6 = list2;
                                        bArr = cVar4.f7758N;
                                        if (bArr != null) {
                                            str7 = dolbyVisionConfigM3258a.f6445a;
                                            str15 = "video/dolby-vision";
                                        }
                                        int i29 = (cVar4.f7766V ? 1 : 0) | 0;
                                        if (cVar4.f7765U) {
                                            i8 = 2;
                                        } else {
                                            i8 = 0;
                                        }
                                        int i210 = i29 | i8;
                                        bVar = new Format.b();
                                        if (MimeTypes.m3169k(str15)) {
                                            bVar.f6971x = cVar4.f7759O;
                                            bVar.f6972y = cVar4.f7761Q;
                                            bVar.f6973z = iM3136x;
                                        } else if (MimeTypes.m3171m(str15)) {
                                            if (cVar4.f7786q == 0) {
                                                i12 = cVar4.f7784o;
                                                i9 = -1;
                                                if (i12 == -1) {
                                                    i12 = cVar4.f7782m;
                                                }
                                                cVar4.f7784o = i12;
                                                i13 = cVar4.f7785p;
                                                if (i13 == -1) {
                                                    i13 = cVar4.f7783n;
                                                }
                                                cVar4.f7785p = i13;
                                            } else {
                                                i9 = -1;
                                            }
                                            i10 = cVar4.f7784o;
                                            if (i10 != i9) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (cVar4.f7793x) {
                                                if (cVar4.f7748D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                            } else {
                                                colorInfo = null;
                                            }
                                            str9 = cVar4.f7770a;
                                            if (str9 != null) {
                                                map = MatroskaExtractor.f7690e;
                                                if (map.containsKey(str9)) {
                                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar4.f7787r == 0) {
                                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            bVar.f6963p = cVar4.f7782m;
                                            bVar.f6964q = cVar4.f7783n;
                                            bVar.f6967t = f;
                                            bVar.f6966s = iIntValue;
                                            bVar.f6968u = cVar4.f7791v;
                                            bVar.f6969v = cVar4.f7792w;
                                            bVar.f6970w = colorInfo;
                                            i5 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str15)) {
                                            }
                                            i5 = 3;
                                        }
                                        str10 = cVar4.f7770a;
                                        if (str10 != null) {
                                            bVar.f6949b = cVar4.f7770a;
                                        }
                                        bVar.m3520b(i26);
                                        bVar.f6958k = str15;
                                        bVar.f6959l = i6;
                                        bVar.f6950c = cVar4.f7767W;
                                        bVar.f6951d = i210;
                                        bVar.f6960m = list6;
                                        bVar.f6955h = str7;
                                        bVar.f6961n = cVar4.f7781l;
                                        Format formatM3519a2 = bVar.m3519a();
                                        TrackOutput2 trackOutput2Mo3774o2 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                                        cVar4.f7768X = trackOutput2Mo3774o2;
                                        trackOutput2Mo3774o2.mo3760e(formatM3519a2);
                                        matroskaExtractor = matroskaExtractor2;
                                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                                    } else {
                                        outline.m1567R("Non-PCM MS/ACM is unsupported. Setting mimeType to ", "audio/x-unknown", "MatroskaExtractor");
                                    }
                                    str2 = str14;
                                    i4 = 1;
                                    list3 = null;
                                    str6 = null;
                                    list5 = list3;
                                    i7 = i4;
                                    str8 = str6;
                                    i3 = -1;
                                    list7 = list5;
                                    str15 = str2;
                                    str7 = str8;
                                    i5 = i7;
                                    i6 = i3;
                                    list6 = list7;
                                    iM3136x = -1;
                                    bArr = cVar4.f7758N;
                                    if (bArr != null) {
                                        str7 = dolbyVisionConfigM3258a.f6445a;
                                        str15 = "video/dolby-vision";
                                    }
                                    int i211 = (cVar4.f7766V ? 1 : 0) | 0;
                                    if (cVar4.f7765U) {
                                        i8 = 2;
                                    } else {
                                        i8 = 0;
                                    }
                                    int i212 = i211 | i8;
                                    bVar = new Format.b();
                                    if (MimeTypes.m3169k(str15)) {
                                        bVar.f6971x = cVar4.f7759O;
                                        bVar.f6972y = cVar4.f7761Q;
                                        bVar.f6973z = iM3136x;
                                    } else if (MimeTypes.m3171m(str15)) {
                                        if (cVar4.f7786q == 0) {
                                            i12 = cVar4.f7784o;
                                            i9 = -1;
                                            if (i12 == -1) {
                                                i12 = cVar4.f7782m;
                                            }
                                            cVar4.f7784o = i12;
                                            i13 = cVar4.f7785p;
                                            if (i13 == -1) {
                                                i13 = cVar4.f7783n;
                                            }
                                            cVar4.f7785p = i13;
                                        } else {
                                            i9 = -1;
                                        }
                                        i10 = cVar4.f7784o;
                                        if (i10 != i9) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (cVar4.f7793x) {
                                            if (cVar4.f7748D != -1.0f) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = null;
                                            }
                                            colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                        } else {
                                            colorInfo = null;
                                        }
                                        str9 = cVar4.f7770a;
                                        if (str9 != null) {
                                            map = MatroskaExtractor.f7690e;
                                            if (map.containsKey(str9)) {
                                                iIntValue = map.get(cVar4.f7770a).intValue();
                                            } else {
                                                iIntValue = -1;
                                            }
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (cVar4.f7787r == 0) {
                                            if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                                iIntValue = 180;
                                            } else {
                                                iIntValue = 180;
                                            }
                                        }
                                        bVar.f6963p = cVar4.f7782m;
                                        bVar.f6964q = cVar4.f7783n;
                                        bVar.f6967t = f;
                                        bVar.f6966s = iIntValue;
                                        bVar.f6968u = cVar4.f7791v;
                                        bVar.f6969v = cVar4.f7792w;
                                        bVar.f6970w = colorInfo;
                                        i5 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str15)) {
                                        }
                                        i5 = 3;
                                    }
                                    str10 = cVar4.f7770a;
                                    if (str10 != null) {
                                        bVar.f6949b = cVar4.f7770a;
                                    }
                                    bVar.m3520b(i26);
                                    bVar.f6958k = str15;
                                    bVar.f6959l = i6;
                                    bVar.f6950c = cVar4.f7767W;
                                    bVar.f6951d = i212;
                                    bVar.f6960m = list6;
                                    bVar.f6955h = str7;
                                    bVar.f6961n = cVar4.f7781l;
                                    Format formatM3519a3 = bVar.m3519a();
                                    TrackOutput2 trackOutput2Mo3774o3 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                                    cVar4.f7768X = trackOutput2Mo3774o3;
                                    trackOutput2Mo3774o3.mo3760e(formatM3519a3);
                                    matroskaExtractor = matroskaExtractor2;
                                    matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                                }
                                z2 = false;
                                if (z2) {
                                    iM3136x = Util6.m3136x(cVar4.f7760P);
                                    if (iM3136x == 0) {
                                        StringBuilder sbM1556G2 = outline.m1556G("Unsupported PCM bit depth: ");
                                        sbM1556G2.append(cVar4.f7760P);
                                        sbM1556G2.append(". Setting mimeType to ");
                                        sbM1556G2.append("audio/x-unknown");
                                        Log.w("MatroskaExtractor", sbM1556G2.toString());
                                    }
                                    i5 = 1;
                                    list2 = null;
                                    str7 = null;
                                    i6 = -1;
                                    list6 = list2;
                                    bArr = cVar4.f7758N;
                                    if (bArr != null) {
                                        str7 = dolbyVisionConfigM3258a.f6445a;
                                        str15 = "video/dolby-vision";
                                    }
                                    int i213 = (cVar4.f7766V ? 1 : 0) | 0;
                                    if (cVar4.f7765U) {
                                        i8 = 2;
                                    } else {
                                        i8 = 0;
                                    }
                                    int i214 = i213 | i8;
                                    bVar = new Format.b();
                                    if (MimeTypes.m3169k(str15)) {
                                        bVar.f6971x = cVar4.f7759O;
                                        bVar.f6972y = cVar4.f7761Q;
                                        bVar.f6973z = iM3136x;
                                    } else if (MimeTypes.m3171m(str15)) {
                                        if (cVar4.f7786q == 0) {
                                            i12 = cVar4.f7784o;
                                            i9 = -1;
                                            if (i12 == -1) {
                                                i12 = cVar4.f7782m;
                                            }
                                            cVar4.f7784o = i12;
                                            i13 = cVar4.f7785p;
                                            if (i13 == -1) {
                                                i13 = cVar4.f7783n;
                                            }
                                            cVar4.f7785p = i13;
                                        } else {
                                            i9 = -1;
                                        }
                                        i10 = cVar4.f7784o;
                                        if (i10 != i9) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (cVar4.f7793x) {
                                            if (cVar4.f7748D != -1.0f) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = null;
                                            }
                                            colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                        } else {
                                            colorInfo = null;
                                        }
                                        str9 = cVar4.f7770a;
                                        if (str9 != null) {
                                            map = MatroskaExtractor.f7690e;
                                            if (map.containsKey(str9)) {
                                                iIntValue = map.get(cVar4.f7770a).intValue();
                                            } else {
                                                iIntValue = -1;
                                            }
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (cVar4.f7787r == 0) {
                                            if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                                iIntValue = 180;
                                            } else {
                                                iIntValue = 180;
                                            }
                                        }
                                        bVar.f6963p = cVar4.f7782m;
                                        bVar.f6964q = cVar4.f7783n;
                                        bVar.f6967t = f;
                                        bVar.f6966s = iIntValue;
                                        bVar.f6968u = cVar4.f7791v;
                                        bVar.f6969v = cVar4.f7792w;
                                        bVar.f6970w = colorInfo;
                                        i5 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str15)) {
                                        }
                                        i5 = 3;
                                    }
                                    str10 = cVar4.f7770a;
                                    if (str10 != null) {
                                        bVar.f6949b = cVar4.f7770a;
                                    }
                                    bVar.m3520b(i26);
                                    bVar.f6958k = str15;
                                    bVar.f6959l = i6;
                                    bVar.f6950c = cVar4.f7767W;
                                    bVar.f6951d = i214;
                                    bVar.f6960m = list6;
                                    bVar.f6955h = str7;
                                    bVar.f6961n = cVar4.f7781l;
                                    Format formatM3519a4 = bVar.m3519a();
                                    TrackOutput2 trackOutput2Mo3774o4 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                                    cVar4.f7768X = trackOutput2Mo3774o4;
                                    trackOutput2Mo3774o4.mo3760e(formatM3519a4);
                                    matroskaExtractor = matroskaExtractor2;
                                    matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                                } else {
                                    outline.m1567R("Non-PCM MS/ACM is unsupported. Setting mimeType to ", "audio/x-unknown", "MatroskaExtractor");
                                }
                                str2 = str14;
                                i4 = 1;
                                list3 = null;
                                str6 = null;
                                list5 = list3;
                                i7 = i4;
                                str8 = str6;
                                i3 = -1;
                                list7 = list5;
                                str15 = str2;
                                str7 = str8;
                                i5 = i7;
                                i6 = i3;
                                list6 = list7;
                                iM3136x = -1;
                                bArr = cVar4.f7758N;
                                if (bArr != null) {
                                    str7 = dolbyVisionConfigM3258a.f6445a;
                                    str15 = "video/dolby-vision";
                                }
                                int i215 = (cVar4.f7766V ? 1 : 0) | 0;
                                if (cVar4.f7765U) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                int i216 = i215 | i8;
                                bVar = new Format.b();
                                if (MimeTypes.m3169k(str15)) {
                                    bVar.f6971x = cVar4.f7759O;
                                    bVar.f6972y = cVar4.f7761Q;
                                    bVar.f6973z = iM3136x;
                                } else if (MimeTypes.m3171m(str15)) {
                                    if (cVar4.f7786q == 0) {
                                        i12 = cVar4.f7784o;
                                        i9 = -1;
                                        if (i12 == -1) {
                                            i12 = cVar4.f7782m;
                                        }
                                        cVar4.f7784o = i12;
                                        i13 = cVar4.f7785p;
                                        if (i13 == -1) {
                                            i13 = cVar4.f7783n;
                                        }
                                        cVar4.f7785p = i13;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = cVar4.f7784o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (cVar4.f7793x) {
                                        if (cVar4.f7748D != -1.0f) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = null;
                                        }
                                        colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str9 = cVar4.f7770a;
                                    if (str9 != null) {
                                        map = MatroskaExtractor.f7690e;
                                        if (map.containsKey(str9)) {
                                            iIntValue = map.get(cVar4.f7770a).intValue();
                                        } else {
                                            iIntValue = -1;
                                        }
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (cVar4.f7787r == 0) {
                                        if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    bVar.f6963p = cVar4.f7782m;
                                    bVar.f6964q = cVar4.f7783n;
                                    bVar.f6967t = f;
                                    bVar.f6966s = iIntValue;
                                    bVar.f6968u = cVar4.f7791v;
                                    bVar.f6969v = cVar4.f7792w;
                                    bVar.f6970w = colorInfo;
                                    i5 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str15)) {
                                    }
                                    i5 = 3;
                                }
                                str10 = cVar4.f7770a;
                                if (str10 != null) {
                                    bVar.f6949b = cVar4.f7770a;
                                }
                                bVar.m3520b(i26);
                                bVar.f6958k = str15;
                                bVar.f6959l = i6;
                                bVar.f6950c = cVar4.f7767W;
                                bVar.f6951d = i216;
                                bVar.f6960m = list6;
                                bVar.f6955h = str7;
                                bVar.f6961n = cVar4.f7781l;
                                Format formatM3519a5 = bVar.m3519a();
                                TrackOutput2 trackOutput2Mo3774o5 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                                cVar4.f7768X = trackOutput2Mo3774o5;
                                trackOutput2Mo3774o5.mo3760e(formatM3519a5);
                                matroskaExtractor = matroskaExtractor2;
                                matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                                break;
                            }
                            z2 = true;
                            if (z2) {
                                iM3136x = Util6.m3136x(cVar4.f7760P);
                                if (iM3136x == 0) {
                                    StringBuilder sbM1556G3 = outline.m1556G("Unsupported PCM bit depth: ");
                                    sbM1556G3.append(cVar4.f7760P);
                                    sbM1556G3.append(". Setting mimeType to ");
                                    sbM1556G3.append("audio/x-unknown");
                                    Log.w("MatroskaExtractor", sbM1556G3.toString());
                                }
                                i5 = 1;
                                list2 = null;
                                str7 = null;
                                i6 = -1;
                                list6 = list2;
                                bArr = cVar4.f7758N;
                                if (bArr != null) {
                                    str7 = dolbyVisionConfigM3258a.f6445a;
                                    str15 = "video/dolby-vision";
                                }
                                int i217 = (cVar4.f7766V ? 1 : 0) | 0;
                                if (cVar4.f7765U) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                int i218 = i217 | i8;
                                bVar = new Format.b();
                                if (MimeTypes.m3169k(str15)) {
                                    bVar.f6971x = cVar4.f7759O;
                                    bVar.f6972y = cVar4.f7761Q;
                                    bVar.f6973z = iM3136x;
                                } else if (MimeTypes.m3171m(str15)) {
                                    if (cVar4.f7786q == 0) {
                                        i12 = cVar4.f7784o;
                                        i9 = -1;
                                        if (i12 == -1) {
                                            i12 = cVar4.f7782m;
                                        }
                                        cVar4.f7784o = i12;
                                        i13 = cVar4.f7785p;
                                        if (i13 == -1) {
                                            i13 = cVar4.f7783n;
                                        }
                                        cVar4.f7785p = i13;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = cVar4.f7784o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (cVar4.f7793x) {
                                        if (cVar4.f7748D != -1.0f) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = null;
                                        }
                                        colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str9 = cVar4.f7770a;
                                    if (str9 != null) {
                                        map = MatroskaExtractor.f7690e;
                                        if (map.containsKey(str9)) {
                                            iIntValue = map.get(cVar4.f7770a).intValue();
                                        } else {
                                            iIntValue = -1;
                                        }
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (cVar4.f7787r == 0) {
                                        if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    bVar.f6963p = cVar4.f7782m;
                                    bVar.f6964q = cVar4.f7783n;
                                    bVar.f6967t = f;
                                    bVar.f6966s = iIntValue;
                                    bVar.f6968u = cVar4.f7791v;
                                    bVar.f6969v = cVar4.f7792w;
                                    bVar.f6970w = colorInfo;
                                    i5 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str15)) {
                                    }
                                    i5 = 3;
                                }
                                str10 = cVar4.f7770a;
                                if (str10 != null) {
                                    bVar.f6949b = cVar4.f7770a;
                                }
                                bVar.m3520b(i26);
                                bVar.f6958k = str15;
                                bVar.f6959l = i6;
                                bVar.f6950c = cVar4.f7767W;
                                bVar.f6951d = i218;
                                bVar.f6960m = list6;
                                bVar.f6955h = str7;
                                bVar.f6961n = cVar4.f7781l;
                                Format formatM3519a6 = bVar.m3519a();
                                TrackOutput2 trackOutput2Mo3774o6 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                                cVar4.f7768X = trackOutput2Mo3774o6;
                                trackOutput2Mo3774o6.mo3760e(formatM3519a6);
                                matroskaExtractor = matroskaExtractor2;
                                matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                            } else {
                                outline.m1567R("Non-PCM MS/ACM is unsupported. Setting mimeType to ", "audio/x-unknown", "MatroskaExtractor");
                            }
                            str2 = str14;
                            i4 = 1;
                            list3 = null;
                            str6 = null;
                            list5 = list3;
                            i7 = i4;
                            str8 = str6;
                            i3 = -1;
                            list7 = list5;
                            str15 = str2;
                            str7 = str8;
                            i5 = i7;
                            i6 = i3;
                            list6 = list7;
                            iM3136x = -1;
                            bArr = cVar4.f7758N;
                            if (bArr != null) {
                                str7 = dolbyVisionConfigM3258a.f6445a;
                                str15 = "video/dolby-vision";
                            }
                            int i219 = (cVar4.f7766V ? 1 : 0) | 0;
                            if (cVar4.f7765U) {
                                i8 = 2;
                            } else {
                                i8 = 0;
                            }
                            int i2110 = i219 | i8;
                            bVar = new Format.b();
                            if (MimeTypes.m3169k(str15)) {
                                bVar.f6971x = cVar4.f7759O;
                                bVar.f6972y = cVar4.f7761Q;
                                bVar.f6973z = iM3136x;
                            } else if (MimeTypes.m3171m(str15)) {
                                if (cVar4.f7786q == 0) {
                                    i12 = cVar4.f7784o;
                                    i9 = -1;
                                    if (i12 == -1) {
                                        i12 = cVar4.f7782m;
                                    }
                                    cVar4.f7784o = i12;
                                    i13 = cVar4.f7785p;
                                    if (i13 == -1) {
                                        i13 = cVar4.f7783n;
                                    }
                                    cVar4.f7785p = i13;
                                } else {
                                    i9 = -1;
                                }
                                i10 = cVar4.f7784o;
                                if (i10 != i9) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (cVar4.f7793x) {
                                    if (cVar4.f7748D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                } else {
                                    colorInfo = null;
                                }
                                str9 = cVar4.f7770a;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f7690e;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(cVar4.f7770a).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (cVar4.f7787r == 0) {
                                    if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.f6963p = cVar4.f7782m;
                                bVar.f6964q = cVar4.f7783n;
                                bVar.f6967t = f;
                                bVar.f6966s = iIntValue;
                                bVar.f6968u = cVar4.f7791v;
                                bVar.f6969v = cVar4.f7792w;
                                bVar.f6970w = colorInfo;
                                i5 = 2;
                            } else {
                                if ("application/x-subrip".equals(str15)) {
                                }
                                i5 = 3;
                            }
                            str10 = cVar4.f7770a;
                            if (str10 != null) {
                                bVar.f6949b = cVar4.f7770a;
                            }
                            bVar.m3520b(i26);
                            bVar.f6958k = str15;
                            bVar.f6959l = i6;
                            bVar.f6950c = cVar4.f7767W;
                            bVar.f6951d = i2110;
                            bVar.f6960m = list6;
                            bVar.f6955h = str7;
                            bVar.f6961n = cVar4.f7781l;
                            Format formatM3519a7 = bVar.m3519a();
                            TrackOutput2 trackOutput2Mo3774o7 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                            cVar4.f7768X = trackOutput2Mo3774o7;
                            trackOutput2Mo3774o7.mo3760e(formatM3519a7);
                            matroskaExtractor = matroskaExtractor2;
                            matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            throw new ParserException("Error parsing MS/ACM codec private");
                        }
                        break;
                    case 3:
                        cVar4.f7764T = new d();
                        str14 = "audio/true-hd";
                        str2 = str14;
                        i4 = 1;
                        list3 = null;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i2111 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i2112 = i2111 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i2112;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a8 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o8 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o8;
                        trackOutput2Mo3774o8.mo3760e(formatM3519a8);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 4:
                        byte[] bArrM3790a = cVar4.m3790a(cVar4.f7771b);
                        try {
                            if (bArrM3790a[0] != 2) {
                                throw new ParserException("Error parsing vorbis codec private");
                            }
                            int i30 = 1;
                            int i31 = 0;
                            while ((bArrM3790a[i30] & 255) == 255) {
                                i31 += 255;
                                i30++;
                            }
                            int i32 = i30 + 1;
                            int i33 = i31 + (bArrM3790a[i30] & 255);
                            int i34 = 0;
                            while ((bArrM3790a[i32] & 255) == 255) {
                                i34 += 255;
                                i32++;
                            }
                            int i35 = i32 + 1;
                            int i36 = i34 + (bArrM3790a[i32] & 255);
                            if (bArrM3790a[i35] != 1) {
                                throw new ParserException("Error parsing vorbis codec private");
                            }
                            byte[] bArr4 = new byte[i33];
                            System.arraycopy(bArrM3790a, i35, bArr4, 0, i33);
                            int i37 = i35 + i33;
                            if (bArrM3790a[i37] != 3) {
                                throw new ParserException("Error parsing vorbis codec private");
                            }
                            int i38 = i37 + i36;
                            if (bArrM3790a[i38] != 5) {
                                throw new ParserException("Error parsing vorbis codec private");
                            }
                            byte[] bArr5 = new byte[bArrM3790a.length - i38];
                            System.arraycopy(bArrM3790a, i38, bArr5, 0, bArrM3790a.length - i38);
                            ArrayList arrayList2 = new ArrayList(2);
                            arrayList2.add(bArr4);
                            arrayList2.add(bArr5);
                            str2 = "audio/vorbis";
                            i3 = 8192;
                            arrayList = arrayList2;
                            str8 = null;
                            i7 = 1;
                            list7 = arrayList;
                            str15 = str2;
                            str7 = str8;
                            i5 = i7;
                            i6 = i3;
                            list6 = list7;
                            iM3136x = -1;
                            bArr = cVar4.f7758N;
                            if (bArr != null) {
                                str7 = dolbyVisionConfigM3258a.f6445a;
                                str15 = "video/dolby-vision";
                            }
                            int i2113 = (cVar4.f7766V ? 1 : 0) | 0;
                            if (cVar4.f7765U) {
                                i8 = 2;
                            } else {
                                i8 = 0;
                            }
                            int i2114 = i2113 | i8;
                            bVar = new Format.b();
                            if (MimeTypes.m3169k(str15)) {
                                bVar.f6971x = cVar4.f7759O;
                                bVar.f6972y = cVar4.f7761Q;
                                bVar.f6973z = iM3136x;
                            } else if (MimeTypes.m3171m(str15)) {
                                if (cVar4.f7786q == 0) {
                                    i12 = cVar4.f7784o;
                                    i9 = -1;
                                    if (i12 == -1) {
                                        i12 = cVar4.f7782m;
                                    }
                                    cVar4.f7784o = i12;
                                    i13 = cVar4.f7785p;
                                    if (i13 == -1) {
                                        i13 = cVar4.f7783n;
                                    }
                                    cVar4.f7785p = i13;
                                } else {
                                    i9 = -1;
                                }
                                i10 = cVar4.f7784o;
                                if (i10 != i9) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (cVar4.f7793x) {
                                    if (cVar4.f7748D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                } else {
                                    colorInfo = null;
                                }
                                str9 = cVar4.f7770a;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f7690e;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(cVar4.f7770a).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (cVar4.f7787r == 0) {
                                    if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.f6963p = cVar4.f7782m;
                                bVar.f6964q = cVar4.f7783n;
                                bVar.f6967t = f;
                                bVar.f6966s = iIntValue;
                                bVar.f6968u = cVar4.f7791v;
                                bVar.f6969v = cVar4.f7792w;
                                bVar.f6970w = colorInfo;
                                i5 = 2;
                            } else {
                                if ("application/x-subrip".equals(str15)) {
                                }
                                i5 = 3;
                            }
                            str10 = cVar4.f7770a;
                            if (str10 != null) {
                                bVar.f6949b = cVar4.f7770a;
                            }
                            bVar.m3520b(i26);
                            bVar.f6958k = str15;
                            bVar.f6959l = i6;
                            bVar.f6950c = cVar4.f7767W;
                            bVar.f6951d = i2114;
                            bVar.f6960m = list6;
                            bVar.f6955h = str7;
                            bVar.f6961n = cVar4.f7781l;
                            Format formatM3519a9 = bVar.m3519a();
                            TrackOutput2 trackOutput2Mo3774o9 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                            cVar4.f7768X = trackOutput2Mo3774o9;
                            trackOutput2Mo3774o9.mo3760e(formatM3519a9);
                            matroskaExtractor = matroskaExtractor2;
                            matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        } catch (ArrayIndexOutOfBoundsException unused2) {
                            throw new ParserException("Error parsing vorbis codec private");
                        }
                        break;
                    case 5:
                        str3 = "audio/mpeg-L2";
                        str2 = str3;
                        i3 = 4096;
                        arrayList = null;
                        str8 = null;
                        i7 = 1;
                        list7 = arrayList;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i2115 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i2116 = i2115 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i2116;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a10 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o10 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o10;
                        trackOutput2Mo3774o10.mo3760e(formatM3519a10);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 6:
                        str3 = "audio/mpeg";
                        str2 = str3;
                        i3 = 4096;
                        arrayList = null;
                        str8 = null;
                        i7 = 1;
                        list7 = arrayList;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i2117 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i2118 = i2117 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i2118;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a11 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o11 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o11;
                        trackOutput2Mo3774o11.mo3760e(formatM3519a11);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 7:
                        ParsableByteArray parsableByteArray2 = new ParsableByteArray(cVar4.m3790a(cVar4.f7771b));
                        try {
                            parsableByteArray2.m3195E(16);
                            long jM3205j = parsableByteArray2.m3205j();
                            if (jM3205j == 1482049860) {
                                pair = new Pair("video/divx", null);
                            } else if (jM3205j == 859189832) {
                                pair = new Pair("video/3gpp", null);
                            } else if (jM3205j == 826496599) {
                                int i39 = parsableByteArray2.f6393b + 20;
                                byte[] bArr6 = parsableByteArray2.f6392a;
                                while (true) {
                                    if (i39 >= bArr6.length - 4) {
                                        throw new ParserException("Failed to find FourCC VC1 initialization data");
                                    }
                                    if (bArr6[i39] == 0 && bArr6[i39 + 1] == 0 && bArr6[i39 + 2] == 1 && bArr6[i39 + 3] == 15) {
                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr6, i39, bArr6.length)));
                                    } else {
                                        i39++;
                                    }
                                }
                            } else {
                                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                pair = new Pair("video/x-unknown", null);
                            }
                            str = (String) pair.first;
                            listM11637B = (List) pair.second;
                            i2 = 1;
                            listSingletonList = listM11637B;
                            i4 = i2;
                            str2 = str;
                            list3 = listSingletonList;
                            str6 = null;
                            list5 = list3;
                            i7 = i4;
                            str8 = str6;
                            i3 = -1;
                            list7 = list5;
                            str15 = str2;
                            str7 = str8;
                            i5 = i7;
                            i6 = i3;
                            list6 = list7;
                            iM3136x = -1;
                            bArr = cVar4.f7758N;
                            if (bArr != null) {
                                str7 = dolbyVisionConfigM3258a.f6445a;
                                str15 = "video/dolby-vision";
                            }
                            int i2119 = (cVar4.f7766V ? 1 : 0) | 0;
                            if (cVar4.f7765U) {
                                i8 = 2;
                            } else {
                                i8 = 0;
                            }
                            int i21110 = i2119 | i8;
                            bVar = new Format.b();
                            if (MimeTypes.m3169k(str15)) {
                                bVar.f6971x = cVar4.f7759O;
                                bVar.f6972y = cVar4.f7761Q;
                                bVar.f6973z = iM3136x;
                            } else if (MimeTypes.m3171m(str15)) {
                                if (cVar4.f7786q == 0) {
                                    i12 = cVar4.f7784o;
                                    i9 = -1;
                                    if (i12 == -1) {
                                        i12 = cVar4.f7782m;
                                    }
                                    cVar4.f7784o = i12;
                                    i13 = cVar4.f7785p;
                                    if (i13 == -1) {
                                        i13 = cVar4.f7783n;
                                    }
                                    cVar4.f7785p = i13;
                                } else {
                                    i9 = -1;
                                }
                                i10 = cVar4.f7784o;
                                if (i10 != i9) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (cVar4.f7793x) {
                                    if (cVar4.f7748D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                } else {
                                    colorInfo = null;
                                }
                                str9 = cVar4.f7770a;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f7690e;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(cVar4.f7770a).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (cVar4.f7787r == 0) {
                                    if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.f6963p = cVar4.f7782m;
                                bVar.f6964q = cVar4.f7783n;
                                bVar.f6967t = f;
                                bVar.f6966s = iIntValue;
                                bVar.f6968u = cVar4.f7791v;
                                bVar.f6969v = cVar4.f7792w;
                                bVar.f6970w = colorInfo;
                                i5 = 2;
                            } else {
                                if ("application/x-subrip".equals(str15)) {
                                }
                                i5 = 3;
                            }
                            str10 = cVar4.f7770a;
                            if (str10 != null) {
                                bVar.f6949b = cVar4.f7770a;
                            }
                            bVar.m3520b(i26);
                            bVar.f6958k = str15;
                            bVar.f6959l = i6;
                            bVar.f6950c = cVar4.f7767W;
                            bVar.f6951d = i21110;
                            bVar.f6960m = list6;
                            bVar.f6955h = str7;
                            bVar.f6961n = cVar4.f7781l;
                            Format formatM3519a12 = bVar.m3519a();
                            TrackOutput2 trackOutput2Mo3774o12 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                            cVar4.f7768X = trackOutput2Mo3774o12;
                            trackOutput2Mo3774o12.mo3760e(formatM3519a12);
                            matroskaExtractor = matroskaExtractor2;
                            matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        } catch (ArrayIndexOutOfBoundsException unused3) {
                            throw new ParserException("Error parsing FourCC private data");
                        }
                        break;
                    case 8:
                        byte[] bArr7 = new byte[4];
                        System.arraycopy(cVar4.m3790a(cVar4.f7771b), 0, bArr7, 0, 4);
                        ImmutableList2 immutableList2M11637B = ImmutableList2.m11637B(bArr7);
                        str = "application/dvbsubs";
                        listM11637B = immutableList2M11637B;
                        i2 = 1;
                        listSingletonList = listM11637B;
                        i4 = i2;
                        str2 = str;
                        list3 = listSingletonList;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i21111 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i21112 = i21111 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i21112;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a13 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o13 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o13;
                        trackOutput2Mo3774o13.mo3760e(formatM3519a13);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 10:
                        AvcConfig avcConfigM3257b = AvcConfig.m3257b(new ParsableByteArray(cVar4.m3790a(cVar4.f7771b)));
                        List<byte[]> list8 = avcConfigM3257b.f6434a;
                        cVar4.f7769Y = avcConfigM3257b.f6435b;
                        str4 = avcConfigM3257b.f6439f;
                        str5 = "video/avc";
                        list4 = list8;
                        str15 = str5;
                        str7 = str4;
                        iM3136x = -1;
                        list = list4;
                        i5 = 1;
                        list2 = list;
                        i6 = -1;
                        list6 = list2;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i21113 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i21114 = i21113 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i21114;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a14 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o14 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o14;
                        trackOutput2Mo3774o14.mo3760e(formatM3519a14);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 11:
                        str = "application/vobsub";
                        listM11637B = ImmutableList2.m11637B(cVar4.m3790a(cVar4.f7771b));
                        i2 = 1;
                        listSingletonList = listM11637B;
                        i4 = i2;
                        str2 = str;
                        list3 = listSingletonList;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i21115 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i21116 = i21115 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i21116;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a15 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o15 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o15;
                        trackOutput2Mo3774o15.mo3760e(formatM3519a15);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 12:
                        str13 = "audio/vnd.dts.hd";
                        str14 = str13;
                        str2 = str14;
                        i4 = 1;
                        list3 = null;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i21117 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i21118 = i21117 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i21118;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a16 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o16 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o16;
                        trackOutput2Mo3774o16.mo3760e(formatM3519a16);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 13:
                        List<byte[]> listSingletonList2 = Collections.singletonList(cVar4.m3790a(cVar4.f7771b));
                        AacUtil.b bVarM3554e = AacUtil.m3554e(cVar4.f7780k);
                        cVar4.f7761Q = bVarM3554e.f7083a;
                        cVar4.f7759O = bVarM3554e.f7084b;
                        str6 = bVarM3554e.f7085c;
                        str2 = "audio/mp4a-latm";
                        i4 = 1;
                        list5 = listSingletonList2;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i21119 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i211110 = i21119 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i211110;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a17 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o17 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o17;
                        trackOutput2Mo3774o17.mo3760e(formatM3519a17);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 14:
                        str13 = "audio/ac3";
                        str14 = str13;
                        str2 = str14;
                        i4 = 1;
                        list3 = null;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i211111 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i211112 = i211111 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i211112;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a18 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o18 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o18;
                        trackOutput2Mo3774o18.mo3760e(formatM3519a18);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 15:
                    case 21:
                        str13 = "audio/vnd.dts";
                        str14 = str13;
                        str2 = str14;
                        i4 = 1;
                        list3 = null;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i211113 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i211114 = i211113 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i211114;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a19 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o19 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o19;
                        trackOutput2Mo3774o19.mo3760e(formatM3519a19);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 16:
                        str13 = "video/av01";
                        str14 = str13;
                        str2 = str14;
                        i4 = 1;
                        list3 = null;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i211115 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i211116 = i211115 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i211116;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a110 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o110 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o110;
                        trackOutput2Mo3774o110.mo3760e(formatM3519a110);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 17:
                        str13 = "video/x-vnd.on2.vp8";
                        str14 = str13;
                        str2 = str14;
                        i4 = 1;
                        list3 = null;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i211117 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i211118 = i211117 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i211118;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a111 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o111 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o111;
                        trackOutput2Mo3774o111.mo3760e(formatM3519a111);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 18:
                        str13 = "video/x-vnd.on2.vp9";
                        str14 = str13;
                        str2 = str14;
                        i4 = 1;
                        list3 = null;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i211119 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i2111110 = i211119 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i2111110;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a112 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o112 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o112;
                        trackOutput2Mo3774o112.mo3760e(formatM3519a112);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 19:
                        str13 = "application/pgs";
                        str14 = str13;
                        str2 = str14;
                        i4 = 1;
                        list3 = null;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i2111111 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i2111112 = i2111111 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i2111112;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a113 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o113 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o113;
                        trackOutput2Mo3774o113.mo3760e(formatM3519a113);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 20:
                        str14 = str13;
                        str2 = str14;
                        i4 = 1;
                        list3 = null;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i2111113 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i2111114 = i2111113 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i2111114;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a114 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o114 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o114;
                        trackOutput2Mo3774o114.mo3760e(formatM3519a114);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 22:
                        if (cVar4.f7760P == 32) {
                            iM3136x = 4;
                            i5 = 1;
                            list2 = null;
                            str7 = null;
                            i6 = -1;
                            list6 = list2;
                            bArr = cVar4.f7758N;
                            if (bArr != null) {
                                str7 = dolbyVisionConfigM3258a.f6445a;
                                str15 = "video/dolby-vision";
                            }
                            int i2111115 = (cVar4.f7766V ? 1 : 0) | 0;
                            if (cVar4.f7765U) {
                                i8 = 2;
                            } else {
                                i8 = 0;
                            }
                            int i2111116 = i2111115 | i8;
                            bVar = new Format.b();
                            if (MimeTypes.m3169k(str15)) {
                                bVar.f6971x = cVar4.f7759O;
                                bVar.f6972y = cVar4.f7761Q;
                                bVar.f6973z = iM3136x;
                            } else if (MimeTypes.m3171m(str15)) {
                                if (cVar4.f7786q == 0) {
                                    i12 = cVar4.f7784o;
                                    i9 = -1;
                                    if (i12 == -1) {
                                        i12 = cVar4.f7782m;
                                    }
                                    cVar4.f7784o = i12;
                                    i13 = cVar4.f7785p;
                                    if (i13 == -1) {
                                        i13 = cVar4.f7783n;
                                    }
                                    cVar4.f7785p = i13;
                                } else {
                                    i9 = -1;
                                }
                                i10 = cVar4.f7784o;
                                if (i10 != i9) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (cVar4.f7793x) {
                                    if (cVar4.f7748D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                } else {
                                    colorInfo = null;
                                }
                                str9 = cVar4.f7770a;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f7690e;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(cVar4.f7770a).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (cVar4.f7787r == 0) {
                                    if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.f6963p = cVar4.f7782m;
                                bVar.f6964q = cVar4.f7783n;
                                bVar.f6967t = f;
                                bVar.f6966s = iIntValue;
                                bVar.f6968u = cVar4.f7791v;
                                bVar.f6969v = cVar4.f7792w;
                                bVar.f6970w = colorInfo;
                                i5 = 2;
                            } else {
                                if ("application/x-subrip".equals(str15)) {
                                }
                                i5 = 3;
                            }
                            str10 = cVar4.f7770a;
                            if (str10 != null) {
                                bVar.f6949b = cVar4.f7770a;
                            }
                            bVar.m3520b(i26);
                            bVar.f6958k = str15;
                            bVar.f6959l = i6;
                            bVar.f6950c = cVar4.f7767W;
                            bVar.f6951d = i2111116;
                            bVar.f6960m = list6;
                            bVar.f6955h = str7;
                            bVar.f6961n = cVar4.f7781l;
                            Format formatM3519a115 = bVar.m3519a();
                            TrackOutput2 trackOutput2Mo3774o115 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                            cVar4.f7768X = trackOutput2Mo3774o115;
                            trackOutput2Mo3774o115.mo3760e(formatM3519a115);
                            matroskaExtractor = matroskaExtractor2;
                            matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        } else {
                            StringBuilder sbM1556G4 = outline.m1556G("Unsupported floating point PCM bit depth: ");
                            sbM1556G4.append(cVar4.f7760P);
                            sbM1556G4.append(". Setting mimeType to ");
                            sbM1556G4.append("audio/x-unknown");
                            Log.w("MatroskaExtractor", sbM1556G4.toString());
                            str2 = str14;
                            i4 = 1;
                            list3 = null;
                            str6 = null;
                            list5 = list3;
                            i7 = i4;
                            str8 = str6;
                            i3 = -1;
                            list7 = list5;
                            str15 = str2;
                            str7 = str8;
                            i5 = i7;
                            i6 = i3;
                            list6 = list7;
                            iM3136x = -1;
                            bArr = cVar4.f7758N;
                            if (bArr != null) {
                                str7 = dolbyVisionConfigM3258a.f6445a;
                                str15 = "video/dolby-vision";
                            }
                            int i2111117 = (cVar4.f7766V ? 1 : 0) | 0;
                            if (cVar4.f7765U) {
                                i8 = 2;
                            } else {
                                i8 = 0;
                            }
                            int i2111118 = i2111117 | i8;
                            bVar = new Format.b();
                            if (MimeTypes.m3169k(str15)) {
                                bVar.f6971x = cVar4.f7759O;
                                bVar.f6972y = cVar4.f7761Q;
                                bVar.f6973z = iM3136x;
                            } else if (MimeTypes.m3171m(str15)) {
                                if (cVar4.f7786q == 0) {
                                    i12 = cVar4.f7784o;
                                    i9 = -1;
                                    if (i12 == -1) {
                                        i12 = cVar4.f7782m;
                                    }
                                    cVar4.f7784o = i12;
                                    i13 = cVar4.f7785p;
                                    if (i13 == -1) {
                                        i13 = cVar4.f7783n;
                                    }
                                    cVar4.f7785p = i13;
                                } else {
                                    i9 = -1;
                                }
                                i10 = cVar4.f7784o;
                                if (i10 != i9) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (cVar4.f7793x) {
                                    if (cVar4.f7748D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                } else {
                                    colorInfo = null;
                                }
                                str9 = cVar4.f7770a;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f7690e;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(cVar4.f7770a).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (cVar4.f7787r == 0) {
                                    if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.f6963p = cVar4.f7782m;
                                bVar.f6964q = cVar4.f7783n;
                                bVar.f6967t = f;
                                bVar.f6966s = iIntValue;
                                bVar.f6968u = cVar4.f7791v;
                                bVar.f6969v = cVar4.f7792w;
                                bVar.f6970w = colorInfo;
                                i5 = 2;
                            } else {
                                if ("application/x-subrip".equals(str15)) {
                                }
                                i5 = 3;
                            }
                            str10 = cVar4.f7770a;
                            if (str10 != null) {
                                bVar.f6949b = cVar4.f7770a;
                            }
                            bVar.m3520b(i26);
                            bVar.f6958k = str15;
                            bVar.f6959l = i6;
                            bVar.f6950c = cVar4.f7767W;
                            bVar.f6951d = i2111118;
                            bVar.f6960m = list6;
                            bVar.f6955h = str7;
                            bVar.f6961n = cVar4.f7781l;
                            Format formatM3519a116 = bVar.m3519a();
                            TrackOutput2 trackOutput2Mo3774o116 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                            cVar4.f7768X = trackOutput2Mo3774o116;
                            trackOutput2Mo3774o116.mo3760e(formatM3519a116);
                            matroskaExtractor = matroskaExtractor2;
                            matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        }
                        break;
                    case 23:
                        int i40 = cVar4.f7760P;
                        if (i40 == 8) {
                            iM3136x = 3;
                            list = null;
                            str7 = null;
                            i5 = 1;
                            list2 = list;
                            i6 = -1;
                            list6 = list2;
                            bArr = cVar4.f7758N;
                            if (bArr != null) {
                                str7 = dolbyVisionConfigM3258a.f6445a;
                                str15 = "video/dolby-vision";
                            }
                            int i2111119 = (cVar4.f7766V ? 1 : 0) | 0;
                            if (cVar4.f7765U) {
                                i8 = 2;
                            } else {
                                i8 = 0;
                            }
                            int i21111110 = i2111119 | i8;
                            bVar = new Format.b();
                            if (MimeTypes.m3169k(str15)) {
                                bVar.f6971x = cVar4.f7759O;
                                bVar.f6972y = cVar4.f7761Q;
                                bVar.f6973z = iM3136x;
                            } else if (MimeTypes.m3171m(str15)) {
                                if (cVar4.f7786q == 0) {
                                    i12 = cVar4.f7784o;
                                    i9 = -1;
                                    if (i12 == -1) {
                                        i12 = cVar4.f7782m;
                                    }
                                    cVar4.f7784o = i12;
                                    i13 = cVar4.f7785p;
                                    if (i13 == -1) {
                                        i13 = cVar4.f7783n;
                                    }
                                    cVar4.f7785p = i13;
                                } else {
                                    i9 = -1;
                                }
                                i10 = cVar4.f7784o;
                                if (i10 != i9) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (cVar4.f7793x) {
                                    if (cVar4.f7748D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                } else {
                                    colorInfo = null;
                                }
                                str9 = cVar4.f7770a;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f7690e;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(cVar4.f7770a).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (cVar4.f7787r == 0) {
                                    if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.f6963p = cVar4.f7782m;
                                bVar.f6964q = cVar4.f7783n;
                                bVar.f6967t = f;
                                bVar.f6966s = iIntValue;
                                bVar.f6968u = cVar4.f7791v;
                                bVar.f6969v = cVar4.f7792w;
                                bVar.f6970w = colorInfo;
                                i5 = 2;
                            } else {
                                if ("application/x-subrip".equals(str15)) {
                                }
                                i5 = 3;
                            }
                            str10 = cVar4.f7770a;
                            if (str10 != null) {
                                bVar.f6949b = cVar4.f7770a;
                            }
                            bVar.m3520b(i26);
                            bVar.f6958k = str15;
                            bVar.f6959l = i6;
                            bVar.f6950c = cVar4.f7767W;
                            bVar.f6951d = i21111110;
                            bVar.f6960m = list6;
                            bVar.f6955h = str7;
                            bVar.f6961n = cVar4.f7781l;
                            Format formatM3519a117 = bVar.m3519a();
                            TrackOutput2 trackOutput2Mo3774o117 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                            cVar4.f7768X = trackOutput2Mo3774o117;
                            trackOutput2Mo3774o117.mo3760e(formatM3519a117);
                            matroskaExtractor = matroskaExtractor2;
                            matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        } else if (i40 == 16) {
                            iM3136x = 268435456;
                            i5 = 1;
                            list2 = null;
                            str7 = null;
                            i6 = -1;
                            list6 = list2;
                            bArr = cVar4.f7758N;
                            if (bArr != null) {
                                str7 = dolbyVisionConfigM3258a.f6445a;
                                str15 = "video/dolby-vision";
                            }
                            int i21111111 = (cVar4.f7766V ? 1 : 0) | 0;
                            if (cVar4.f7765U) {
                                i8 = 2;
                            } else {
                                i8 = 0;
                            }
                            int i21111112 = i21111111 | i8;
                            bVar = new Format.b();
                            if (MimeTypes.m3169k(str15)) {
                                bVar.f6971x = cVar4.f7759O;
                                bVar.f6972y = cVar4.f7761Q;
                                bVar.f6973z = iM3136x;
                            } else if (MimeTypes.m3171m(str15)) {
                                if (cVar4.f7786q == 0) {
                                    i12 = cVar4.f7784o;
                                    i9 = -1;
                                    if (i12 == -1) {
                                        i12 = cVar4.f7782m;
                                    }
                                    cVar4.f7784o = i12;
                                    i13 = cVar4.f7785p;
                                    if (i13 == -1) {
                                        i13 = cVar4.f7783n;
                                    }
                                    cVar4.f7785p = i13;
                                } else {
                                    i9 = -1;
                                }
                                i10 = cVar4.f7784o;
                                if (i10 != i9) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (cVar4.f7793x) {
                                    if (cVar4.f7748D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                } else {
                                    colorInfo = null;
                                }
                                str9 = cVar4.f7770a;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f7690e;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(cVar4.f7770a).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (cVar4.f7787r == 0) {
                                    if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.f6963p = cVar4.f7782m;
                                bVar.f6964q = cVar4.f7783n;
                                bVar.f6967t = f;
                                bVar.f6966s = iIntValue;
                                bVar.f6968u = cVar4.f7791v;
                                bVar.f6969v = cVar4.f7792w;
                                bVar.f6970w = colorInfo;
                                i5 = 2;
                            } else {
                                if ("application/x-subrip".equals(str15)) {
                                }
                                i5 = 3;
                            }
                            str10 = cVar4.f7770a;
                            if (str10 != null) {
                                bVar.f6949b = cVar4.f7770a;
                            }
                            bVar.m3520b(i26);
                            bVar.f6958k = str15;
                            bVar.f6959l = i6;
                            bVar.f6950c = cVar4.f7767W;
                            bVar.f6951d = i21111112;
                            bVar.f6960m = list6;
                            bVar.f6955h = str7;
                            bVar.f6961n = cVar4.f7781l;
                            Format formatM3519a118 = bVar.m3519a();
                            TrackOutput2 trackOutput2Mo3774o118 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                            cVar4.f7768X = trackOutput2Mo3774o118;
                            trackOutput2Mo3774o118.mo3760e(formatM3519a118);
                            matroskaExtractor = matroskaExtractor2;
                            matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        } else {
                            StringBuilder sbM1556G5 = outline.m1556G("Unsupported big endian PCM bit depth: ");
                            sbM1556G5.append(cVar4.f7760P);
                            sbM1556G5.append(". Setting mimeType to ");
                            sbM1556G5.append("audio/x-unknown");
                            Log.w("MatroskaExtractor", sbM1556G5.toString());
                            str2 = str14;
                            i4 = 1;
                            list3 = null;
                            str6 = null;
                            list5 = list3;
                            i7 = i4;
                            str8 = str6;
                            i3 = -1;
                            list7 = list5;
                            str15 = str2;
                            str7 = str8;
                            i5 = i7;
                            i6 = i3;
                            list6 = list7;
                            iM3136x = -1;
                            bArr = cVar4.f7758N;
                            if (bArr != null) {
                                str7 = dolbyVisionConfigM3258a.f6445a;
                                str15 = "video/dolby-vision";
                            }
                            int i21111113 = (cVar4.f7766V ? 1 : 0) | 0;
                            if (cVar4.f7765U) {
                                i8 = 2;
                            } else {
                                i8 = 0;
                            }
                            int i21111114 = i21111113 | i8;
                            bVar = new Format.b();
                            if (MimeTypes.m3169k(str15)) {
                                bVar.f6971x = cVar4.f7759O;
                                bVar.f6972y = cVar4.f7761Q;
                                bVar.f6973z = iM3136x;
                            } else if (MimeTypes.m3171m(str15)) {
                                if (cVar4.f7786q == 0) {
                                    i12 = cVar4.f7784o;
                                    i9 = -1;
                                    if (i12 == -1) {
                                        i12 = cVar4.f7782m;
                                    }
                                    cVar4.f7784o = i12;
                                    i13 = cVar4.f7785p;
                                    if (i13 == -1) {
                                        i13 = cVar4.f7783n;
                                    }
                                    cVar4.f7785p = i13;
                                } else {
                                    i9 = -1;
                                }
                                i10 = cVar4.f7784o;
                                if (i10 != i9) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (cVar4.f7793x) {
                                    if (cVar4.f7748D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                } else {
                                    colorInfo = null;
                                }
                                str9 = cVar4.f7770a;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f7690e;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(cVar4.f7770a).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (cVar4.f7787r == 0) {
                                    if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.f6963p = cVar4.f7782m;
                                bVar.f6964q = cVar4.f7783n;
                                bVar.f6967t = f;
                                bVar.f6966s = iIntValue;
                                bVar.f6968u = cVar4.f7791v;
                                bVar.f6969v = cVar4.f7792w;
                                bVar.f6970w = colorInfo;
                                i5 = 2;
                            } else {
                                if ("application/x-subrip".equals(str15)) {
                                }
                                i5 = 3;
                            }
                            str10 = cVar4.f7770a;
                            if (str10 != null) {
                                bVar.f6949b = cVar4.f7770a;
                            }
                            bVar.m3520b(i26);
                            bVar.f6958k = str15;
                            bVar.f6959l = i6;
                            bVar.f6950c = cVar4.f7767W;
                            bVar.f6951d = i21111114;
                            bVar.f6960m = list6;
                            bVar.f6955h = str7;
                            bVar.f6961n = cVar4.f7781l;
                            Format formatM3519a119 = bVar.m3519a();
                            TrackOutput2 trackOutput2Mo3774o119 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                            cVar4.f7768X = trackOutput2Mo3774o119;
                            trackOutput2Mo3774o119.mo3760e(formatM3519a119);
                            matroskaExtractor = matroskaExtractor2;
                            matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        }
                        break;
                    case 24:
                        iM3136x = Util6.m3136x(cVar4.f7760P);
                        if (iM3136x == 0) {
                            StringBuilder sbM1556G6 = outline.m1556G("Unsupported little endian PCM bit depth: ");
                            sbM1556G6.append(cVar4.f7760P);
                            sbM1556G6.append(". Setting mimeType to ");
                            sbM1556G6.append("audio/x-unknown");
                            Log.w("MatroskaExtractor", sbM1556G6.toString());
                            str2 = str14;
                            i4 = 1;
                            list3 = null;
                            str6 = null;
                            list5 = list3;
                            i7 = i4;
                            str8 = str6;
                            i3 = -1;
                            list7 = list5;
                            str15 = str2;
                            str7 = str8;
                            i5 = i7;
                            i6 = i3;
                            list6 = list7;
                            iM3136x = -1;
                            bArr = cVar4.f7758N;
                            if (bArr != null) {
                                str7 = dolbyVisionConfigM3258a.f6445a;
                                str15 = "video/dolby-vision";
                            }
                            int i21111115 = (cVar4.f7766V ? 1 : 0) | 0;
                            if (cVar4.f7765U) {
                                i8 = 2;
                            } else {
                                i8 = 0;
                            }
                            int i21111116 = i21111115 | i8;
                            bVar = new Format.b();
                            if (MimeTypes.m3169k(str15)) {
                                bVar.f6971x = cVar4.f7759O;
                                bVar.f6972y = cVar4.f7761Q;
                                bVar.f6973z = iM3136x;
                            } else if (MimeTypes.m3171m(str15)) {
                                if (cVar4.f7786q == 0) {
                                    i12 = cVar4.f7784o;
                                    i9 = -1;
                                    if (i12 == -1) {
                                        i12 = cVar4.f7782m;
                                    }
                                    cVar4.f7784o = i12;
                                    i13 = cVar4.f7785p;
                                    if (i13 == -1) {
                                        i13 = cVar4.f7783n;
                                    }
                                    cVar4.f7785p = i13;
                                } else {
                                    i9 = -1;
                                }
                                i10 = cVar4.f7784o;
                                if (i10 != i9) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (cVar4.f7793x) {
                                    if (cVar4.f7748D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                                } else {
                                    colorInfo = null;
                                }
                                str9 = cVar4.f7770a;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f7690e;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(cVar4.f7770a).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (cVar4.f7787r == 0) {
                                    if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.f6963p = cVar4.f7782m;
                                bVar.f6964q = cVar4.f7783n;
                                bVar.f6967t = f;
                                bVar.f6966s = iIntValue;
                                bVar.f6968u = cVar4.f7791v;
                                bVar.f6969v = cVar4.f7792w;
                                bVar.f6970w = colorInfo;
                                i5 = 2;
                            } else {
                                if ("application/x-subrip".equals(str15)) {
                                }
                                i5 = 3;
                            }
                            str10 = cVar4.f7770a;
                            if (str10 != null) {
                                bVar.f6949b = cVar4.f7770a;
                            }
                            bVar.m3520b(i26);
                            bVar.f6958k = str15;
                            bVar.f6959l = i6;
                            bVar.f6950c = cVar4.f7767W;
                            bVar.f6951d = i21111116;
                            bVar.f6960m = list6;
                            bVar.f6955h = str7;
                            bVar.f6961n = cVar4.f7781l;
                            Format formatM3519a1110 = bVar.m3519a();
                            TrackOutput2 trackOutput2Mo3774o1110 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                            cVar4.f7768X = trackOutput2Mo3774o1110;
                            trackOutput2Mo3774o1110.mo3760e(formatM3519a1110);
                            matroskaExtractor = matroskaExtractor2;
                            matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        }
                        i5 = 1;
                        list2 = null;
                        str7 = null;
                        i6 = -1;
                        list6 = list2;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i21111117 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i21111118 = i21111117 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i21111118;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a1111 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o1111 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o1111;
                        trackOutput2Mo3774o1111.mo3760e(formatM3519a1111);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 25:
                        byte[] bArr8 = MatroskaExtractor.f7687b;
                        byte[] bArrM3790a2 = cVar4.m3790a(cVar4.f7771b);
                        AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
                        Object[] objArr = {bArr8, bArrM3790a2};
                        str = "text/x-ssa";
                        listM11637B = ImmutableList2.m11641v(objArr);
                        i2 = 1;
                        listSingletonList = listM11637B;
                        i4 = i2;
                        str2 = str;
                        list3 = listSingletonList;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i21111119 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i211111110 = i21111119 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i211111110;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a1112 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o1112 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o1112;
                        trackOutput2Mo3774o1112.mo3760e(formatM3519a1112);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 26:
                        HevcConfig hevcConfigM3268a = HevcConfig.m3268a(new ParsableByteArray(cVar4.m3790a(cVar4.f7771b)));
                        List<byte[]> list9 = hevcConfigM3268a.f6468a;
                        cVar4.f7769Y = hevcConfigM3268a.f6469b;
                        str4 = hevcConfigM3268a.f6470c;
                        str5 = "video/hevc";
                        list4 = list9;
                        str15 = str5;
                        str7 = str4;
                        iM3136x = -1;
                        list = list4;
                        i5 = 1;
                        list2 = list;
                        i6 = -1;
                        list6 = list2;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i211111111 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i211111112 = i211111111 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i211111112;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a1113 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o1113 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o1113;
                        trackOutput2Mo3774o1113.mo3760e(formatM3519a1113);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 27:
                        str13 = "application/x-subrip";
                        str14 = str13;
                        str2 = str14;
                        i4 = 1;
                        list3 = null;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i211111113 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i211111114 = i211111113 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i211111114;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a1114 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o1114 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o1114;
                        trackOutput2Mo3774o1114.mo3760e(formatM3519a1114);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 28:
                        str13 = "video/mpeg2";
                        str14 = str13;
                        str2 = str14;
                        i4 = 1;
                        list3 = null;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i211111115 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i211111116 = i211111115 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i211111116;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a1115 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o1115 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o1115;
                        trackOutput2Mo3774o1115.mo3760e(formatM3519a1115);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 29:
                        str13 = "audio/eac3";
                        str14 = str13;
                        str2 = str14;
                        i4 = 1;
                        list3 = null;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i211111117 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i211111118 = i211111117 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i211111118;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a1116 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o1116 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o1116;
                        trackOutput2Mo3774o1116.mo3760e(formatM3519a1116);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 30:
                        str = "audio/flac";
                        listM11637B = Collections.singletonList(cVar4.m3790a(cVar4.f7771b));
                        i2 = 1;
                        listSingletonList = listM11637B;
                        i4 = i2;
                        str2 = str;
                        list3 = listSingletonList;
                        str6 = null;
                        list5 = list3;
                        i7 = i4;
                        str8 = str6;
                        i3 = -1;
                        list7 = list5;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i211111119 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i2111111110 = i211111119 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i2111111110;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a1117 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o1117 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o1117;
                        trackOutput2Mo3774o1117.mo3760e(formatM3519a1117);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    case 31:
                        ArrayList arrayList3 = new ArrayList(3);
                        arrayList3.add(cVar4.m3790a(cVar4.f7771b));
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(cVar4.f7762R).array());
                        arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(cVar4.f7763S).array());
                        i3 = 5760;
                        str2 = "audio/opus";
                        arrayList = arrayList3;
                        str8 = null;
                        i7 = 1;
                        list7 = arrayList;
                        str15 = str2;
                        str7 = str8;
                        i5 = i7;
                        i6 = i3;
                        list6 = list7;
                        iM3136x = -1;
                        bArr = cVar4.f7758N;
                        if (bArr != null) {
                            str7 = dolbyVisionConfigM3258a.f6445a;
                            str15 = "video/dolby-vision";
                        }
                        int i2111111111 = (cVar4.f7766V ? 1 : 0) | 0;
                        if (cVar4.f7765U) {
                            i8 = 2;
                        } else {
                            i8 = 0;
                        }
                        int i2111111112 = i2111111111 | i8;
                        bVar = new Format.b();
                        if (MimeTypes.m3169k(str15)) {
                            bVar.f6971x = cVar4.f7759O;
                            bVar.f6972y = cVar4.f7761Q;
                            bVar.f6973z = iM3136x;
                        } else if (MimeTypes.m3171m(str15)) {
                            if (cVar4.f7786q == 0) {
                                i12 = cVar4.f7784o;
                                i9 = -1;
                                if (i12 == -1) {
                                    i12 = cVar4.f7782m;
                                }
                                cVar4.f7784o = i12;
                                i13 = cVar4.f7785p;
                                if (i13 == -1) {
                                    i13 = cVar4.f7783n;
                                }
                                cVar4.f7785p = i13;
                            } else {
                                i9 = -1;
                            }
                            i10 = cVar4.f7784o;
                            if (i10 != i9) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (cVar4.f7793x) {
                                if (cVar4.f7748D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                colorInfo = new ColorInfo(cVar4.f7794y, cVar4.f7745A, cVar4.f7795z, bArr2);
                            } else {
                                colorInfo = null;
                            }
                            str9 = cVar4.f7770a;
                            if (str9 != null) {
                                map = MatroskaExtractor.f7690e;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(cVar4.f7770a).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (cVar4.f7787r == 0) {
                                if (Float.compare(cVar4.f7790u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(cVar4.f7789t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(cVar4.f7789t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.f6963p = cVar4.f7782m;
                            bVar.f6964q = cVar4.f7783n;
                            bVar.f6967t = f;
                            bVar.f6966s = iIntValue;
                            bVar.f6968u = cVar4.f7791v;
                            bVar.f6969v = cVar4.f7792w;
                            bVar.f6970w = colorInfo;
                            i5 = 2;
                        } else {
                            if ("application/x-subrip".equals(str15)) {
                            }
                            i5 = 3;
                        }
                        str10 = cVar4.f7770a;
                        if (str10 != null) {
                            bVar.f6949b = cVar4.f7770a;
                        }
                        bVar.m3520b(i26);
                        bVar.f6958k = str15;
                        bVar.f6959l = i6;
                        bVar.f6950c = cVar4.f7767W;
                        bVar.f6951d = i2111111112;
                        bVar.f6960m = list6;
                        bVar.f6955h = str7;
                        bVar.f6961n = cVar4.f7781l;
                        Format formatM3519a1118 = bVar.m3519a();
                        TrackOutput2 trackOutput2Mo3774o1118 = extractorOutput2.mo3774o(cVar4.f7772c, i5);
                        cVar4.f7768X = trackOutput2Mo3774o1118;
                        trackOutput2Mo3774o1118.mo3760e(formatM3519a1118);
                        matroskaExtractor = matroskaExtractor2;
                        matroskaExtractor.f7725h.put(cVar4.f7772c, cVar4);
                        break;
                    default:
                        throw new ParserException("Unrecognized codec identifier.");
                }
            } else {
                matroskaExtractor = matroskaExtractor2;
            }
            matroskaExtractor.f7743z = null;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.i0.e$d */
    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final byte[] f7796a = new byte[10];

        /* JADX INFO: renamed from: b */
        public boolean f7797b;

        /* JADX INFO: renamed from: c */
        public int f7798c;

        /* JADX INFO: renamed from: d */
        public long f7799d;

        /* JADX INFO: renamed from: e */
        public int f7800e;

        /* JADX INFO: renamed from: f */
        public int f7801f;

        /* JADX INFO: renamed from: g */
        public int f7802g;

        @RequiresNonNull({"#1.output"})
        /* JADX INFO: renamed from: a */
        public void m3791a(c cVar) {
            if (this.f7798c > 0) {
                cVar.f7768X.mo3759d(this.f7799d, this.f7800e, this.f7801f, this.f7802g, cVar.f7779j);
                this.f7798c = 0;
            }
        }
    }

    static {
        C1722a c1722a = new ExtractorsFactory2() { // from class: c.n.b.b.s1.i0.a
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new MatroskaExtractor()};
            }

            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: b */
            public /* synthetic */ Extractor[] mo3746b(Uri uri, Map map) {
                return ExtractorsFactory.m3807a(this, uri, map);
            }
        };
        f7686a = new byte[]{Framer.STDOUT_FRAME_PREFIX, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        f7687b = Util6.m3093B("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        f7688c = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f7689d = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f7690e = Collections.unmodifiableMap(map);
    }

    public MatroskaExtractor() {
        this(0);
    }

    /* JADX INFO: renamed from: h */
    public static int[] m3778h(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m3779i(long j2, String str, long j3) {
        C2096e.m4566b(j2 != -9223372036854775807L);
        int i = (int) (j2 / 3600000000L);
        long j4 = j2 - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j4 / 60000000);
        long j5 = j4 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j5 / 1000000);
        return Util6.m3093B(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j5 - (((long) i3) * 1000000)) / j3))));
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* JADX INFO: renamed from: a */
    public final void m3780a(int i) throws ParserException {
        if (this.f7698H == null || this.f7699I == null) {
            throw new ParserException(outline.m1592n("Element ", i, " must be in a Cues"));
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* JADX INFO: renamed from: b */
    public final void m3781b(int i) throws ParserException {
        if (this.f7743z == null) {
            throw new ParserException(outline.m1592n("Element ", i, " must be in a TrackEntry"));
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public final boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        Sniffer sniffer = new Sniffer();
        long jMo3729a = extractorInput.mo3729a();
        long j2 = 1024;
        if (jMo3729a != -1 && jMo3729a <= 1024) {
            j2 = jMo3729a;
        }
        int i = (int) j2;
        extractorInput.mo3739o(sniffer.f7803a.f6392a, 0, 4);
        sniffer.f7804b = 4;
        for (long jM3215t = sniffer.f7803a.m3215t(); jM3215t != 440786851; jM3215t = ((jM3215t << 8) & (-256)) | ((long) (sniffer.f7803a.f6392a[0] & 255))) {
            int i2 = sniffer.f7804b + 1;
            sniffer.f7804b = i2;
            if (i2 == i) {
                return false;
            }
            extractorInput.mo3739o(sniffer.f7803a.f6392a, 0, 1);
        }
        long jM3792a = sniffer.m3792a(extractorInput);
        long j3 = sniffer.f7804b;
        if (jM3792a == Long.MIN_VALUE) {
            return false;
        }
        if (jMo3729a != -1 && j3 + jM3792a >= jMo3729a) {
            return false;
        }
        while (true) {
            long j4 = sniffer.f7804b;
            long j5 = j3 + jM3792a;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (sniffer.m3792a(extractorInput) == Long.MIN_VALUE) {
                return false;
            }
            long jM3792a2 = sniffer.m3792a(extractorInput);
            if (jM3792a2 < 0 || jM3792a2 > 2147483647L) {
                return false;
            }
            if (jM3792a2 != 0) {
                int i3 = (int) jM3792a2;
                extractorInput.mo3733f(i3);
                sniffer.f7804b += i3;
            }
        }
    }

    @RequiresNonNull({"#1.output"})
    /* JADX INFO: renamed from: d */
    public final void m3782d(c cVar, long j2, int i, int i2, int i3) {
        byte[] bArrM3779i;
        int i4;
        int i5;
        int i6 = i;
        d dVar = cVar.f7764T;
        if (dVar == null) {
            if ("S_TEXT/UTF8".equals(cVar.f7771b) || "S_TEXT/ASS".equals(cVar.f7771b)) {
                if (this.f7706P > 1) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j3 = this.f7704N;
                    if (j3 == -9223372036854775807L) {
                        Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = cVar.f7771b;
                        byte[] bArr = this.f7733p.f6392a;
                        str.hashCode();
                        if (str.equals("S_TEXT/ASS")) {
                            bArrM3779i = m3779i(j3, "%01d:%02d:%02d:%02d", 10000L);
                            i4 = 21;
                        } else {
                            if (!str.equals("S_TEXT/UTF8")) {
                                throw new IllegalArgumentException();
                            }
                            bArrM3779i = m3779i(j3, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                        }
                        System.arraycopy(bArrM3779i, 0, bArr, i4, bArrM3779i.length);
                        int i7 = this.f7733p.f6393b;
                        while (true) {
                            ParsableByteArray parsableByteArray = this.f7733p;
                            if (i7 >= parsableByteArray.f6394c) {
                                break;
                            }
                            if (parsableByteArray.f6392a[i7] == 0) {
                                parsableByteArray.m3193C(i7);
                                break;
                            }
                            i7++;
                        }
                        TrackOutput2 trackOutput2 = cVar.f7768X;
                        ParsableByteArray parsableByteArray2 = this.f7733p;
                        trackOutput2.mo3758c(parsableByteArray2, parsableByteArray2.f6394c);
                        i5 = i2 + this.f7733p.f6394c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((268435456 & i6) != 0) {
                if (this.f7706P > 1) {
                    i6 &= -268435457;
                } else {
                    ParsableByteArray parsableByteArray3 = this.f7736s;
                    int i8 = parsableByteArray3.f6394c;
                    cVar.f7768X.mo3761f(parsableByteArray3, i8, 2);
                    i5 += i8;
                }
            }
            cVar.f7768X.mo3759d(j2, i6, i5, i3, cVar.f7779j);
        } else if (dVar.f7797b) {
            int i9 = dVar.f7798c;
            int i10 = i9 + 1;
            dVar.f7798c = i10;
            if (i9 == 0) {
                dVar.f7799d = j2;
                dVar.f7800e = i6;
                dVar.f7801f = 0;
            }
            dVar.f7801f += i2;
            dVar.f7802g = i3;
            if (i10 >= 16) {
                dVar.m3791a(cVar);
            }
        }
        this.f7701K = true;
    }

    /* JADX WARN: Code duplicated, block: B:367:0x0773  */
    /* JADX WARN: Code duplicated, block: B:478:0x08b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x08b6 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v152 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r4v140 */
    /* JADX WARN: Type inference failed for: r4v53, types: [int] */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public final int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i;
        int i2;
        String str;
        ?? r4;
        long j2;
        int i3;
        int[] iArr;
        boolean z;
        boolean z2 = false;
        this.f7701K = false;
        boolean z3 = true;
        boolean z4 = true;
        while (z4 && !this.f7701K) {
            DefaultEbmlReader defaultEbmlReader = (DefaultEbmlReader) this.f7722f;
            C2096e.m4572h(defaultEbmlReader.f7680d);
            boolean z5 = z2;
            boolean z6 = z3;
            while (true) {
                DefaultEbmlReader.b bVarPeek = defaultEbmlReader.f7678b.peek();
                if (bVarPeek == null || extractorInput.mo3740p() < bVarPeek.f7685b) {
                    if (defaultEbmlReader.f7681e == 0) {
                        long jM3795c = defaultEbmlReader.f7679c.m3795c(extractorInput, z6, z5, 4);
                        if (jM3795c == -2) {
                            extractorInput.mo3736k();
                            while (true) {
                                extractorInput.mo3739o(defaultEbmlReader.f7677a, z5 ? 1 : 0, 4);
                                int iM3794b = VarintReader.m3794b(defaultEbmlReader.f7677a[z5 ? 1 : 0]);
                                if (iM3794b != -1 && iM3794b <= 4) {
                                    int iM3793a = (int) VarintReader.m3793a(defaultEbmlReader.f7677a, iM3794b, z5);
                                    Objects.requireNonNull(MatroskaExtractor.this);
                                    if (iM3793a == 357149030 || iM3793a == 524531317 || iM3793a == 475249515 || iM3793a == 374648427) {
                                        extractorInput.mo3737l(iM3794b);
                                        jM3795c = iM3793a;
                                    }
                                }
                                extractorInput.mo3737l(z6 ? 1 : 0);
                            }
                        }
                        if (jM3795c == -1) {
                            z4 = false;
                        } else {
                            defaultEbmlReader.f7682f = (int) jM3795c;
                            defaultEbmlReader.f7681e = z6 ? 1 : 0;
                        }
                    }
                    if (defaultEbmlReader.f7681e == z6) {
                        defaultEbmlReader.f7683g = defaultEbmlReader.f7679c.m3795c(extractorInput, z5, z6, 8);
                        defaultEbmlReader.f7681e = 2;
                    }
                    EbmlProcessor ebmlProcessor = defaultEbmlReader.f7680d;
                    int i4 = defaultEbmlReader.f7682f;
                    Objects.requireNonNull(MatroskaExtractor.this);
                    switch (i4) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 241:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        extractorInput.mo3737l((int) defaultEbmlReader.f7683g);
                        z5 = false;
                        defaultEbmlReader.f7681e = 0;
                        z6 = true;
                    } else if (i == z6) {
                        long jMo3740p = extractorInput.mo3740p();
                        defaultEbmlReader.f7678b.push(new DefaultEbmlReader.b(defaultEbmlReader.f7682f, defaultEbmlReader.f7683g + jMo3740p, null));
                        EbmlProcessor ebmlProcessor2 = defaultEbmlReader.f7680d;
                        int i5 = defaultEbmlReader.f7682f;
                        long j3 = defaultEbmlReader.f7683g;
                        MatroskaExtractor matroskaExtractor = MatroskaExtractor.this;
                        C2096e.m4572h(matroskaExtractor.f7723f0);
                        if (i5 == 160) {
                            i2 = 0;
                            matroskaExtractor.f7712V = false;
                        } else if (i5 == 174) {
                            i2 = 0;
                            matroskaExtractor.f7743z = new c(null);
                        } else if (i5 != 187) {
                            if (i5 == 19899) {
                                matroskaExtractor.f7692B = -1;
                                matroskaExtractor.f7693C = -1L;
                            } else if (i5 == 20533) {
                                matroskaExtractor.m3781b(i5);
                                matroskaExtractor.f7743z.f7777h = true;
                            } else if (i5 == 21968) {
                                matroskaExtractor.m3781b(i5);
                                matroskaExtractor.f7743z.f7793x = true;
                            } else if (i5 == 408125543) {
                                long j4 = matroskaExtractor.f7739v;
                                if (j4 != -1 && j4 != jMo3740p) {
                                    throw new ParserException("Multiple Segment elements not supported");
                                }
                                matroskaExtractor.f7739v = jMo3740p;
                                matroskaExtractor.f7738u = j3;
                            } else if (i5 == 475249515) {
                                matroskaExtractor.f7698H = new LongArray();
                                matroskaExtractor.f7699I = new LongArray();
                            } else if (i5 == 524531317 && !matroskaExtractor.f7691A) {
                                if (!matroskaExtractor.f7726i || matroskaExtractor.f7695E == -1) {
                                    matroskaExtractor.f7723f0.mo3772a(new SeekMap.b(matroskaExtractor.f7742y));
                                    matroskaExtractor.f7691A = true;
                                } else {
                                    matroskaExtractor.f7694D = true;
                                }
                            }
                            i2 = 0;
                        } else {
                            i2 = 0;
                            matroskaExtractor.f7700J = false;
                        }
                        defaultEbmlReader.f7681e = i2;
                    } else if (i == 2) {
                        long j5 = defaultEbmlReader.f7683g;
                        if (j5 > 8) {
                            StringBuilder sbM1556G = outline.m1556G("Invalid integer size: ");
                            sbM1556G.append(defaultEbmlReader.f7683g);
                            throw new ParserException(sbM1556G.toString());
                        }
                        EbmlProcessor ebmlProcessor3 = defaultEbmlReader.f7680d;
                        int i6 = defaultEbmlReader.f7682f;
                        long jM3777a = defaultEbmlReader.m3777a(extractorInput, (int) j5);
                        MatroskaExtractor matroskaExtractor2 = MatroskaExtractor.this;
                        Objects.requireNonNull(matroskaExtractor2);
                        if (i6 != 20529) {
                            if (i6 != 20530) {
                                switch (i6) {
                                    case 131:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7773d = (int) jM3777a;
                                        break;
                                    case 136:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7766V = jM3777a == 1;
                                        break;
                                    case 155:
                                        matroskaExtractor2.f7704N = matroskaExtractor2.m3785l(jM3777a);
                                        break;
                                    case 159:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7759O = (int) jM3777a;
                                        break;
                                    case 176:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7782m = (int) jM3777a;
                                        break;
                                    case 179:
                                        matroskaExtractor2.m3780a(i6);
                                        matroskaExtractor2.f7698H.m3157a(matroskaExtractor2.m3785l(jM3777a));
                                        break;
                                    case 186:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7783n = (int) jM3777a;
                                        break;
                                    case 215:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7772c = (int) jM3777a;
                                        break;
                                    case 231:
                                        matroskaExtractor2.f7697G = matroskaExtractor2.m3785l(jM3777a);
                                        break;
                                    case 238:
                                        matroskaExtractor2.f7711U = (int) jM3777a;
                                        break;
                                    case 241:
                                        if (!matroskaExtractor2.f7700J) {
                                            matroskaExtractor2.m3780a(i6);
                                            matroskaExtractor2.f7699I.m3157a(jM3777a);
                                            matroskaExtractor2.f7700J = true;
                                        }
                                        break;
                                    case 251:
                                        matroskaExtractor2.f7712V = true;
                                        break;
                                    case 16871:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7776g = (int) jM3777a;
                                        break;
                                    case 16980:
                                        if (jM3777a != 3) {
                                            throw new ParserException(outline.m1595q("ContentCompAlgo ", jM3777a, " not supported"));
                                        }
                                        break;
                                    case 17029:
                                        if (jM3777a < 1 || jM3777a > 2) {
                                            throw new ParserException(outline.m1595q("DocTypeReadVersion ", jM3777a, " not supported"));
                                        }
                                        break;
                                    case 17143:
                                        if (jM3777a != 1) {
                                            throw new ParserException(outline.m1595q("EBMLReadVersion ", jM3777a, " not supported"));
                                        }
                                        break;
                                    case 18401:
                                        if (jM3777a != 5) {
                                            throw new ParserException(outline.m1595q("ContentEncAlgo ", jM3777a, " not supported"));
                                        }
                                        break;
                                    case 18408:
                                        if (jM3777a != 1) {
                                            throw new ParserException(outline.m1595q("AESSettingsCipherMode ", jM3777a, " not supported"));
                                        }
                                        break;
                                    case 21420:
                                        matroskaExtractor2.f7693C = jM3777a + matroskaExtractor2.f7739v;
                                        break;
                                    case 21432:
                                        int i7 = (int) jM3777a;
                                        matroskaExtractor2.m3781b(i6);
                                        if (i7 == 0) {
                                            matroskaExtractor2.f7743z.f7792w = 0;
                                        } else if (i7 == 1) {
                                            matroskaExtractor2.f7743z.f7792w = 2;
                                        } else if (i7 == 3) {
                                            matroskaExtractor2.f7743z.f7792w = 1;
                                        } else if (i7 == 15) {
                                            matroskaExtractor2.f7743z.f7792w = 3;
                                        }
                                        break;
                                    case 21680:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7784o = (int) jM3777a;
                                        break;
                                    case 21682:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7786q = (int) jM3777a;
                                        break;
                                    case 21690:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7785p = (int) jM3777a;
                                        break;
                                    case 21930:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7765U = jM3777a == 1;
                                        break;
                                    case 21998:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7775f = (int) jM3777a;
                                        break;
                                    case 22186:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7762R = jM3777a;
                                        break;
                                    case 22203:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7763S = jM3777a;
                                        break;
                                    case 25188:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7760P = (int) jM3777a;
                                        break;
                                    case 30321:
                                        matroskaExtractor2.m3781b(i6);
                                        int i8 = (int) jM3777a;
                                        if (i8 == 0) {
                                            matroskaExtractor2.f7743z.f7787r = 0;
                                        } else if (i8 == 1) {
                                            matroskaExtractor2.f7743z.f7787r = 1;
                                        } else if (i8 == 2) {
                                            matroskaExtractor2.f7743z.f7787r = 2;
                                        } else if (i8 == 3) {
                                            matroskaExtractor2.f7743z.f7787r = 3;
                                        }
                                        break;
                                    case 2352003:
                                        matroskaExtractor2.m3781b(i6);
                                        matroskaExtractor2.f7743z.f7774e = (int) jM3777a;
                                        break;
                                    case 2807729:
                                        matroskaExtractor2.f7740w = jM3777a;
                                        break;
                                    default:
                                        switch (i6) {
                                            case 21945:
                                                matroskaExtractor2.m3781b(i6);
                                                int i9 = (int) jM3777a;
                                                if (i9 == 1) {
                                                    matroskaExtractor2.f7743z.f7745A = 2;
                                                } else if (i9 == 2) {
                                                    matroskaExtractor2.f7743z.f7745A = 1;
                                                }
                                                break;
                                            case 21946:
                                                matroskaExtractor2.m3781b(i6);
                                                int i10 = (int) jM3777a;
                                                if (i10 == 1) {
                                                    matroskaExtractor2.f7743z.f7795z = 3;
                                                } else if (i10 == 16) {
                                                    matroskaExtractor2.f7743z.f7795z = 6;
                                                } else if (i10 == 18) {
                                                    matroskaExtractor2.f7743z.f7795z = 7;
                                                } else if (i10 == 6 || i10 == 7) {
                                                    matroskaExtractor2.f7743z.f7795z = 3;
                                                }
                                                break;
                                            case 21947:
                                                matroskaExtractor2.m3781b(i6);
                                                c cVar = matroskaExtractor2.f7743z;
                                                cVar.f7793x = true;
                                                int i11 = (int) jM3777a;
                                                if (i11 == 1) {
                                                    cVar.f7794y = 1;
                                                } else if (i11 == 9) {
                                                    cVar.f7794y = 6;
                                                } else if (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) {
                                                    cVar.f7794y = 2;
                                                }
                                                break;
                                            case 21948:
                                                matroskaExtractor2.m3781b(i6);
                                                matroskaExtractor2.f7743z.f7746B = (int) jM3777a;
                                                break;
                                            case 21949:
                                                matroskaExtractor2.m3781b(i6);
                                                matroskaExtractor2.f7743z.f7747C = (int) jM3777a;
                                                break;
                                        }
                                        break;
                                }
                            } else if (jM3777a != 1) {
                                throw new ParserException(outline.m1595q("ContentEncodingScope ", jM3777a, " not supported"));
                            }
                        } else if (jM3777a != 0) {
                            throw new ParserException(outline.m1595q("ContentEncodingOrder ", jM3777a, " not supported"));
                        }
                        defaultEbmlReader.f7681e = 0;
                    } else if (i == 3) {
                        long j6 = defaultEbmlReader.f7683g;
                        if (j6 > 2147483647L) {
                            StringBuilder sbM1556G2 = outline.m1556G("String element size: ");
                            sbM1556G2.append(defaultEbmlReader.f7683g);
                            throw new ParserException(sbM1556G2.toString());
                        }
                        EbmlProcessor ebmlProcessor4 = defaultEbmlReader.f7680d;
                        int i12 = defaultEbmlReader.f7682f;
                        int i13 = (int) j6;
                        if (i13 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i13];
                            extractorInput.readFully(bArr, 0, i13);
                            while (i13 > 0) {
                                int i14 = i13 - 1;
                                if (bArr[i14] == 0) {
                                    i13 = i14;
                                } else {
                                    str = new String(bArr, 0, i13);
                                }
                            }
                            str = new String(bArr, 0, i13);
                        }
                        MatroskaExtractor matroskaExtractor3 = MatroskaExtractor.this;
                        Objects.requireNonNull(matroskaExtractor3);
                        if (i12 == 134) {
                            matroskaExtractor3.m3781b(i12);
                            matroskaExtractor3.f7743z.f7771b = str;
                        } else if (i12 != 17026) {
                            if (i12 == 21358) {
                                matroskaExtractor3.m3781b(i12);
                                matroskaExtractor3.f7743z.f7770a = str;
                            } else if (i12 == 2274716) {
                                matroskaExtractor3.m3781b(i12);
                                matroskaExtractor3.f7743z.f7767W = str;
                            }
                        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                            throw new ParserException(outline.m1600v("DocType ", str, " not supported"));
                        }
                        defaultEbmlReader.f7681e = 0;
                    } else if (i == 4) {
                        EbmlProcessor ebmlProcessor5 = defaultEbmlReader.f7680d;
                        int i15 = defaultEbmlReader.f7682f;
                        int i16 = (int) defaultEbmlReader.f7683g;
                        MatroskaExtractor matroskaExtractor4 = MatroskaExtractor.this;
                        Objects.requireNonNull(matroskaExtractor4);
                        if (i15 == 161 || i15 == 163) {
                            if (matroskaExtractor4.f7702L == 0) {
                                matroskaExtractor4.f7708R = (int) matroskaExtractor4.f7724g.m3795c(extractorInput, z5, z6, 8);
                                matroskaExtractor4.f7709S = matroskaExtractor4.f7724g.f7808d;
                                matroskaExtractor4.f7704N = -9223372036854775807L;
                                matroskaExtractor4.f7702L = z6 ? 1 : 0;
                                matroskaExtractor4.f7729l.m3221z(z5 ? 1 : 0);
                            }
                            c cVar2 = matroskaExtractor4.f7725h.get(matroskaExtractor4.f7708R);
                            if (cVar2 == null) {
                                extractorInput.mo3737l(i16 - matroskaExtractor4.f7709S);
                                matroskaExtractor4.f7702L = z5 ? 1 : 0;
                            } else {
                                Objects.requireNonNull(cVar2.f7768X);
                                if (matroskaExtractor4.f7702L == z6) {
                                    matroskaExtractor4.m3783j(extractorInput, 3);
                                    int i17 = (matroskaExtractor4.f7729l.f6392a[2] & 6) >> (z6 ? 1 : 0);
                                    byte b2 = 255;
                                    if (i17 == 0) {
                                        matroskaExtractor4.f7706P = z6 ? 1 : 0;
                                        int[] iArrM3778h = m3778h(matroskaExtractor4.f7707Q, z6 ? 1 : 0);
                                        matroskaExtractor4.f7707Q = iArrM3778h;
                                        iArrM3778h[z5 ? 1 : 0] = (i16 - matroskaExtractor4.f7709S) - 3;
                                    } else {
                                        matroskaExtractor4.m3783j(extractorInput, 4);
                                        int i18 = (matroskaExtractor4.f7729l.f6392a[3] & 255) + (z6 ? 1 : 0);
                                        matroskaExtractor4.f7706P = i18;
                                        int[] iArrM3778h2 = m3778h(matroskaExtractor4.f7707Q, i18);
                                        matroskaExtractor4.f7707Q = iArrM3778h2;
                                        if (i17 == 2) {
                                            int i19 = (i16 - matroskaExtractor4.f7709S) - 4;
                                            int i20 = matroskaExtractor4.f7706P;
                                            Arrays.fill(iArrM3778h2, z5 ? 1 : 0, i20, i19 / i20);
                                        } else if (i17 == z6) {
                                            int i21 = 0;
                                            int i22 = 0;
                                            int i23 = 4;
                                            while (true) {
                                                int i24 = matroskaExtractor4.f7706P;
                                                if (i21 < i24 - 1) {
                                                    matroskaExtractor4.f7707Q[i21] = z5 ? 1 : 0;
                                                    do {
                                                        i23++;
                                                        matroskaExtractor4.m3783j(extractorInput, i23);
                                                        i3 = matroskaExtractor4.f7729l.f6392a[i23 - 1] & 255;
                                                        iArr = matroskaExtractor4.f7707Q;
                                                        iArr[i21] = iArr[i21] + i3;
                                                    } while (i3 == 255);
                                                    i22 += iArr[i21];
                                                    i21++;
                                                } else {
                                                    matroskaExtractor4.f7707Q[i24 - 1] = ((i16 - matroskaExtractor4.f7709S) - i23) - i22;
                                                }
                                            }
                                        } else {
                                            if (i17 != 3) {
                                                throw new ParserException(outline.m1590l("Unexpected lacing value: ", i17));
                                            }
                                            int i25 = 0;
                                            int i26 = 0;
                                            int i27 = 4;
                                            ?? r3 = z5;
                                            boolean z7 = z6;
                                            while (true) {
                                                int i28 = matroskaExtractor4.f7706P;
                                                if (i25 < i28 - 1) {
                                                    matroskaExtractor4.f7707Q[i25] = r3;
                                                    i27++;
                                                    matroskaExtractor4.m3783j(extractorInput, i27);
                                                    int i29 = i27 - 1;
                                                    if (matroskaExtractor4.f7729l.f6392a[i29] == 0) {
                                                        throw new ParserException("No valid varint length mask found");
                                                    }
                                                    int i30 = 8;
                                                    int i31 = 0;
                                                    while (true) {
                                                        if (i31 < i30) {
                                                            int i32 = r4 << (7 - i31);
                                                            if ((matroskaExtractor4.f7729l.f6392a[i29] & i32) != 0) {
                                                                r4 = z7;
                                                                i27 += i31;
                                                                matroskaExtractor4.m3783j(extractorInput, i27);
                                                                int i33 = i29 + 1;
                                                                j2 = (~i32) & matroskaExtractor4.f7729l.f6392a[i29] & b2;
                                                                while (true) {
                                                                    int i34 = i33;
                                                                    if (i34 < i27) {
                                                                        i33 = i34 + 1;
                                                                        j2 = (j2 << 8) | ((long) (matroskaExtractor4.f7729l.f6392a[i34] & 255));
                                                                    } else if (i25 > 0) {
                                                                        j2 -= (1 << ((i31 * 7) + 6)) - 1;
                                                                    }
                                                                }
                                                            } else {
                                                                r4 = z7;
                                                                i31++;
                                                                i30 = 8;
                                                                r4 = 1;
                                                                b2 = 255;
                                                            }
                                                        } else {
                                                            r4 = z7;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (j2 < -2147483648L || j2 > 2147483647L) {
                                                        throw new ParserException("EBML lacing sample size out of range.");
                                                    }
                                                    int i35 = (int) j2;
                                                    int[] iArr2 = matroskaExtractor4.f7707Q;
                                                    if (i25 != 0) {
                                                        i35 += iArr2[i25 - 1];
                                                    }
                                                    iArr2[i25] = i35;
                                                    i26 += iArr2[i25];
                                                    i25++;
                                                    r3 = 0;
                                                    z7 = true;
                                                    b2 = 255;
                                                } else {
                                                    matroskaExtractor4.f7707Q[i28 - 1] = ((i16 - matroskaExtractor4.f7709S) - i27) - i26;
                                                }
                                            }
                                        }
                                    }
                                    byte[] bArr2 = matroskaExtractor4.f7729l.f6392a;
                                    matroskaExtractor4.f7703M = matroskaExtractor4.m3785l((bArr2[1] & 255) | (bArr2[0] << 8)) + matroskaExtractor4.f7697G;
                                    matroskaExtractor4.f7710T = (cVar2.f7773d == 2 || (i15 == 163 && (matroskaExtractor4.f7729l.f6392a[2] & 128) == 128)) ? 1 : 0;
                                    matroskaExtractor4.f7702L = 2;
                                    matroskaExtractor4.f7705O = 0;
                                }
                                if (i15 == 163) {
                                    while (true) {
                                        int i36 = matroskaExtractor4.f7705O;
                                        if (i36 < matroskaExtractor4.f7706P) {
                                            matroskaExtractor4.m3782d(cVar2, ((long) ((matroskaExtractor4.f7705O * cVar2.f7774e) / CloseCodes.NORMAL_CLOSURE)) + matroskaExtractor4.f7703M, matroskaExtractor4.f7710T, matroskaExtractor4.m3786m(extractorInput, cVar2, matroskaExtractor4.f7707Q[i36]), 0);
                                            matroskaExtractor4.f7705O++;
                                        } else {
                                            matroskaExtractor4.f7702L = 0;
                                        }
                                    }
                                } else {
                                    while (true) {
                                        int i37 = matroskaExtractor4.f7705O;
                                        if (i37 < matroskaExtractor4.f7706P) {
                                            int[] iArr3 = matroskaExtractor4.f7707Q;
                                            iArr3[i37] = matroskaExtractor4.m3786m(extractorInput, cVar2, iArr3[i37]);
                                            matroskaExtractor4.f7705O++;
                                        }
                                    }
                                }
                            }
                        } else if (i15 != 165) {
                            if (i15 == 16877) {
                                matroskaExtractor4.m3781b(i15);
                                c cVar3 = matroskaExtractor4.f7743z;
                                int i38 = cVar3.f7776g;
                                if (i38 == 1685485123 || i38 == 1685480259) {
                                    byte[] bArr3 = new byte[i16];
                                    cVar3.f7758N = bArr3;
                                    extractorInput.readFully(bArr3, z5 ? 1 : 0, i16);
                                } else {
                                    extractorInput.mo3737l(i16);
                                }
                            } else if (i15 == 16981) {
                                matroskaExtractor4.m3781b(i15);
                                byte[] bArr4 = new byte[i16];
                                matroskaExtractor4.f7743z.f7778i = bArr4;
                                extractorInput.readFully(bArr4, z5 ? 1 : 0, i16);
                            } else if (i15 == 18402) {
                                byte[] bArr5 = new byte[i16];
                                extractorInput.readFully(bArr5, z5 ? 1 : 0, i16);
                                matroskaExtractor4.m3781b(i15);
                                matroskaExtractor4.f7743z.f7779j = new TrackOutput2.a(z6 ? 1 : 0, bArr5, z5 ? 1 : 0, z5 ? 1 : 0);
                            } else if (i15 == 21419) {
                                Arrays.fill(matroskaExtractor4.f7731n.f6392a, z5 ? (byte) 1 : (byte) 0);
                                extractorInput.readFully(matroskaExtractor4.f7731n.f6392a, 4 - i16, i16);
                                matroskaExtractor4.f7731n.m3194D(z5 ? 1 : 0);
                                matroskaExtractor4.f7692B = (int) matroskaExtractor4.f7731n.m3215t();
                            } else if (i15 == 25506) {
                                matroskaExtractor4.m3781b(i15);
                                byte[] bArr6 = new byte[i16];
                                matroskaExtractor4.f7743z.f7780k = bArr6;
                                extractorInput.readFully(bArr6, z5 ? 1 : 0, i16);
                            } else {
                                if (i15 != 30322) {
                                    throw new ParserException(outline.m1590l("Unexpected id: ", i15));
                                }
                                matroskaExtractor4.m3781b(i15);
                                byte[] bArr7 = new byte[i16];
                                matroskaExtractor4.f7743z.f7791v = bArr7;
                                extractorInput.readFully(bArr7, z5 ? 1 : 0, i16);
                            }
                        } else if (matroskaExtractor4.f7702L == 2) {
                            c cVar4 = matroskaExtractor4.f7725h.get(matroskaExtractor4.f7708R);
                            if (matroskaExtractor4.f7711U == 4 && "V_VP9".equals(cVar4.f7771b)) {
                                ParsableByteArray parsableByteArray = matroskaExtractor4.f7736s;
                                byte[] bArr8 = parsableByteArray.f6392a;
                                if (bArr8.length < i16) {
                                    bArr8 = new byte[i16];
                                }
                                parsableByteArray.m3192B(bArr8, i16);
                                extractorInput.readFully(matroskaExtractor4.f7736s.f6392a, z5 ? 1 : 0, i16);
                            } else {
                                extractorInput.mo3737l(i16);
                            }
                        }
                        defaultEbmlReader.f7681e = 0;
                    } else {
                        if (i != 5) {
                            throw new ParserException(outline.m1590l("Invalid element type ", i));
                        }
                        long j7 = defaultEbmlReader.f7683g;
                        if (j7 != 4 && j7 != 8) {
                            StringBuilder sbM1556G3 = outline.m1556G("Invalid float size: ");
                            sbM1556G3.append(defaultEbmlReader.f7683g);
                            throw new ParserException(sbM1556G3.toString());
                        }
                        EbmlProcessor ebmlProcessor6 = defaultEbmlReader.f7680d;
                        int i39 = defaultEbmlReader.f7682f;
                        int i40 = (int) j7;
                        long jM3777a2 = defaultEbmlReader.m3777a(extractorInput, i40);
                        double dIntBitsToFloat = i40 == 4 ? Float.intBitsToFloat((int) jM3777a2) : Double.longBitsToDouble(jM3777a2);
                        MatroskaExtractor matroskaExtractor5 = MatroskaExtractor.this;
                        Objects.requireNonNull(matroskaExtractor5);
                        if (i39 == 181) {
                            matroskaExtractor5.m3781b(i39);
                            matroskaExtractor5.f7743z.f7761Q = (int) dIntBitsToFloat;
                        } else if (i39 != 17545) {
                            switch (i39) {
                                case 21969:
                                    matroskaExtractor5.m3781b(i39);
                                    matroskaExtractor5.f7743z.f7748D = (float) dIntBitsToFloat;
                                    break;
                                case 21970:
                                    matroskaExtractor5.m3781b(i39);
                                    matroskaExtractor5.f7743z.f7749E = (float) dIntBitsToFloat;
                                    break;
                                case 21971:
                                    matroskaExtractor5.m3781b(i39);
                                    matroskaExtractor5.f7743z.f7750F = (float) dIntBitsToFloat;
                                    break;
                                case 21972:
                                    matroskaExtractor5.m3781b(i39);
                                    matroskaExtractor5.f7743z.f7751G = (float) dIntBitsToFloat;
                                    break;
                                case 21973:
                                    matroskaExtractor5.m3781b(i39);
                                    matroskaExtractor5.f7743z.f7752H = (float) dIntBitsToFloat;
                                    break;
                                case 21974:
                                    matroskaExtractor5.m3781b(i39);
                                    matroskaExtractor5.f7743z.f7753I = (float) dIntBitsToFloat;
                                    break;
                                case 21975:
                                    matroskaExtractor5.m3781b(i39);
                                    matroskaExtractor5.f7743z.f7754J = (float) dIntBitsToFloat;
                                    break;
                                case 21976:
                                    matroskaExtractor5.m3781b(i39);
                                    matroskaExtractor5.f7743z.f7755K = (float) dIntBitsToFloat;
                                    break;
                                case 21977:
                                    matroskaExtractor5.m3781b(i39);
                                    matroskaExtractor5.f7743z.f7756L = (float) dIntBitsToFloat;
                                    break;
                                case 21978:
                                    matroskaExtractor5.m3781b(i39);
                                    matroskaExtractor5.f7743z.f7757M = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    switch (i39) {
                                        case 30323:
                                            matroskaExtractor5.m3781b(i39);
                                            matroskaExtractor5.f7743z.f7788s = (float) dIntBitsToFloat;
                                            break;
                                        case 30324:
                                            matroskaExtractor5.m3781b(i39);
                                            matroskaExtractor5.f7743z.f7789t = (float) dIntBitsToFloat;
                                            break;
                                        case 30325:
                                            matroskaExtractor5.m3781b(i39);
                                            matroskaExtractor5.f7743z.f7790u = (float) dIntBitsToFloat;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            matroskaExtractor5.f7741x = (long) dIntBitsToFloat;
                        }
                        defaultEbmlReader.f7681e = z5 ? 1 : 0;
                    }
                } else {
                    ((b) defaultEbmlReader.f7680d).m3789a(defaultEbmlReader.f7678b.pop().f7684a);
                }
                z4 = true;
            }
            if (z4) {
                long jMo3740p2 = extractorInput.mo3740p();
                if (this.f7694D) {
                    this.f7696F = jMo3740p2;
                    positionHolder.f8519a = this.f7695E;
                    this.f7694D = false;
                } else {
                    if (this.f7691A) {
                        long j8 = this.f7696F;
                        if (j8 != -1) {
                            positionHolder.f8519a = j8;
                            this.f7696F = -1L;
                        }
                        if (z) {
                            return 1;
                        }
                    }
                    z = false;
                    if (z) {
                        return 1;
                    }
                }
                z = true;
                if (z) {
                    return 1;
                }
            }
            z2 = false;
            z3 = true;
        }
        if (z4) {
            return 0;
        }
        for (int i41 = 0; i41 < this.f7725h.size(); i41++) {
            c cVarValueAt = this.f7725h.valueAt(i41);
            Objects.requireNonNull(cVarValueAt.f7768X);
            d dVar = cVarValueAt.f7764T;
            if (dVar != null) {
                dVar.m3791a(cVarValueAt);
            }
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public final void mo3751f(ExtractorOutput extractorOutput) {
        this.f7723f0 = extractorOutput;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        this.f7697G = -9223372036854775807L;
        this.f7702L = 0;
        DefaultEbmlReader defaultEbmlReader = (DefaultEbmlReader) this.f7722f;
        defaultEbmlReader.f7681e = 0;
        defaultEbmlReader.f7678b.clear();
        VarintReader varintReader = defaultEbmlReader.f7679c;
        varintReader.f7807c = 0;
        varintReader.f7808d = 0;
        VarintReader varintReader2 = this.f7724g;
        varintReader2.f7807c = 0;
        varintReader2.f7808d = 0;
        m3784k();
        for (int i = 0; i < this.f7725h.size(); i++) {
            d dVar = this.f7725h.valueAt(i).f7764T;
            if (dVar != null) {
                dVar.f7797b = false;
                dVar.f7798c = 0;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3783j(ExtractorInput extractorInput, int i) throws IOException {
        ParsableByteArray parsableByteArray = this.f7729l;
        if (parsableByteArray.f6394c >= i) {
            return;
        }
        byte[] bArr = parsableByteArray.f6392a;
        if (bArr.length < i) {
            parsableByteArray.m3197b(Math.max(bArr.length * 2, i));
        }
        ParsableByteArray parsableByteArray2 = this.f7729l;
        byte[] bArr2 = parsableByteArray2.f6392a;
        int i2 = parsableByteArray2.f6394c;
        extractorInput.readFully(bArr2, i2, i - i2);
        this.f7729l.m3193C(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m3784k() {
        this.f7713W = 0;
        this.f7714X = 0;
        this.f7715Y = 0;
        this.f7716Z = false;
        this.f7717a0 = false;
        this.f7718b0 = false;
        this.f7719c0 = 0;
        this.f7720d0 = (byte) 0;
        this.f7721e0 = false;
        this.f7732o.m3221z(0);
    }

    /* JADX INFO: renamed from: l */
    public final long m3785l(long j2) throws ParserException {
        long j3 = this.f7740w;
        if (j3 != -9223372036854775807L) {
            return Util6.m3104M(j2, j3, 1000L);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    @RequiresNonNull({"#2.output"})
    /* JADX INFO: renamed from: m */
    public final int m3786m(ExtractorInput extractorInput, c cVar, int i) throws IOException {
        int i2;
        int i3;
        if ("S_TEXT/UTF8".equals(cVar.f7771b)) {
            m3787n(extractorInput, f7686a, i);
            int i4 = this.f7714X;
            m3784k();
            return i4;
        }
        if ("S_TEXT/ASS".equals(cVar.f7771b)) {
            m3787n(extractorInput, f7688c, i);
            int i5 = this.f7714X;
            m3784k();
            return i5;
        }
        TrackOutput2 trackOutput2 = cVar.f7768X;
        if (!this.f7716Z) {
            if (cVar.f7777h) {
                this.f7710T &= -1073741825;
                if (!this.f7717a0) {
                    extractorInput.readFully(this.f7729l.f6392a, 0, 1);
                    this.f7713W++;
                    byte[] bArr = this.f7729l.f6392a;
                    if ((bArr[0] & 128) == 128) {
                        throw new ParserException("Extension bit is set in signal byte");
                    }
                    this.f7720d0 = bArr[0];
                    this.f7717a0 = true;
                }
                byte b2 = this.f7720d0;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.f7710T |= 1073741824;
                    if (!this.f7721e0) {
                        extractorInput.readFully(this.f7734q.f6392a, 0, 8);
                        this.f7713W += 8;
                        this.f7721e0 = true;
                        ParsableByteArray parsableByteArray = this.f7729l;
                        parsableByteArray.f6392a[0] = (byte) ((z ? 128 : 0) | 8);
                        parsableByteArray.m3194D(0);
                        trackOutput2.mo3761f(this.f7729l, 1, 1);
                        this.f7714X++;
                        this.f7734q.m3194D(0);
                        trackOutput2.mo3761f(this.f7734q, 8, 1);
                        this.f7714X += 8;
                    }
                    if (z) {
                        if (!this.f7718b0) {
                            extractorInput.readFully(this.f7729l.f6392a, 0, 1);
                            this.f7713W++;
                            this.f7729l.m3194D(0);
                            this.f7719c0 = this.f7729l.m3214s();
                            this.f7718b0 = true;
                        }
                        int i6 = this.f7719c0 * 4;
                        this.f7729l.m3221z(i6);
                        extractorInput.readFully(this.f7729l.f6392a, 0, i6);
                        this.f7713W += i6;
                        short s = (short) ((this.f7719c0 / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f7737t;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f7737t = ByteBuffer.allocate(i7);
                        }
                        this.f7737t.position(0);
                        this.f7737t.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i3 = this.f7719c0;
                            if (i8 >= i3) {
                                break;
                            }
                            int iM3217v = this.f7729l.m3217v();
                            if (i8 % 2 == 0) {
                                this.f7737t.putShort((short) (iM3217v - i9));
                            } else {
                                this.f7737t.putInt(iM3217v - i9);
                            }
                            i8++;
                            i9 = iM3217v;
                        }
                        int i10 = (i - this.f7713W) - i9;
                        if (i3 % 2 == 1) {
                            this.f7737t.putInt(i10);
                        } else {
                            this.f7737t.putShort((short) i10);
                            this.f7737t.putInt(0);
                        }
                        this.f7735r.m3192B(this.f7737t.array(), i7);
                        trackOutput2.mo3761f(this.f7735r, i7, 1);
                        this.f7714X += i7;
                    }
                }
            } else {
                byte[] bArr2 = cVar.f7778i;
                if (bArr2 != null) {
                    ParsableByteArray parsableByteArray2 = this.f7732o;
                    int length = bArr2.length;
                    parsableByteArray2.f6392a = bArr2;
                    parsableByteArray2.f6394c = length;
                    parsableByteArray2.f6393b = 0;
                }
            }
            if (cVar.f7775f > 0) {
                this.f7710T |= 268435456;
                this.f7736s.m3221z(0);
                this.f7729l.m3221z(4);
                ParsableByteArray parsableByteArray3 = this.f7729l;
                byte[] bArr3 = parsableByteArray3.f6392a;
                bArr3[0] = (byte) ((i >> 24) & 255);
                bArr3[1] = (byte) ((i >> 16) & 255);
                bArr3[2] = (byte) ((i >> 8) & 255);
                bArr3[3] = (byte) (i & 255);
                trackOutput2.mo3761f(parsableByteArray3, 4, 2);
                this.f7714X += 4;
            }
            this.f7716Z = true;
        }
        int i11 = i + this.f7732o.f6394c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f7771b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f7771b)) {
            if (cVar.f7764T != null) {
                C2096e.m4570f(this.f7732o.f6394c == 0);
                d dVar = cVar.f7764T;
                if (!dVar.f7797b) {
                    extractorInput.mo3739o(dVar.f7796a, 0, 10);
                    extractorInput.mo3736k();
                    byte[] bArr4 = dVar.f7796a;
                    if (bArr4[4] == -8 && bArr4[5] == 114 && bArr4[6] == 111 && (bArr4[7] & 254) == 186) {
                        i2 = 40 << ((bArr4[(bArr4[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
                    } else {
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        dVar.f7797b = true;
                    }
                }
            }
            while (true) {
                int i12 = this.f7713W;
                if (i12 >= i11) {
                    break;
                }
                int iM3788o = m3788o(extractorInput, trackOutput2, i11 - i12);
                this.f7713W += iM3788o;
                this.f7714X += iM3788o;
            }
        } else {
            byte[] bArr5 = this.f7728k.f6392a;
            bArr5[0] = 0;
            bArr5[1] = 0;
            bArr5[2] = 0;
            int i13 = cVar.f7769Y;
            int i14 = 4 - i13;
            while (this.f7713W < i11) {
                int i15 = this.f7715Y;
                if (i15 == 0) {
                    int iMin = Math.min(i13, this.f7732o.m3196a());
                    extractorInput.readFully(bArr5, i14 + iMin, i13 - iMin);
                    if (iMin > 0) {
                        ParsableByteArray parsableByteArray4 = this.f7732o;
                        System.arraycopy(parsableByteArray4.f6392a, parsableByteArray4.f6393b, bArr5, i14, iMin);
                        parsableByteArray4.f6393b += iMin;
                    }
                    this.f7713W += i13;
                    this.f7728k.m3194D(0);
                    this.f7715Y = this.f7728k.m3217v();
                    this.f7727j.m3194D(0);
                    trackOutput2.mo3758c(this.f7727j, 4);
                    this.f7714X += 4;
                } else {
                    int iM3788o2 = m3788o(extractorInput, trackOutput2, i15);
                    this.f7713W += iM3788o2;
                    this.f7714X += iM3788o2;
                    this.f7715Y -= iM3788o2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f7771b)) {
            this.f7730m.m3194D(0);
            trackOutput2.mo3758c(this.f7730m, 4);
            this.f7714X += 4;
        }
        int i16 = this.f7714X;
        m3784k();
        return i16;
    }

    /* JADX INFO: renamed from: n */
    public final void m3787n(ExtractorInput extractorInput, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        ParsableByteArray parsableByteArray = this.f7733p;
        byte[] bArr2 = parsableByteArray.f6392a;
        if (bArr2.length < length) {
            parsableByteArray.m3191A(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        extractorInput.readFully(this.f7733p.f6392a, bArr.length, i);
        this.f7733p.m3194D(0);
        this.f7733p.m3193C(length);
    }

    /* JADX INFO: renamed from: o */
    public final int m3788o(ExtractorInput extractorInput, TrackOutput2 trackOutput2, int i) throws IOException {
        int iM3196a = this.f7732o.m3196a();
        if (iM3196a <= 0) {
            return trackOutput2.mo3757b(extractorInput, i, false);
        }
        int iMin = Math.min(i, iM3196a);
        trackOutput2.mo3758c(this.f7732o, iMin);
        return iMin;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public final void release() {
    }

    public MatroskaExtractor(int i) {
        DefaultEbmlReader defaultEbmlReader = new DefaultEbmlReader();
        this.f7739v = -1L;
        this.f7740w = -9223372036854775807L;
        this.f7741x = -9223372036854775807L;
        this.f7742y = -9223372036854775807L;
        this.f7695E = -1L;
        this.f7696F = -1L;
        this.f7697G = -9223372036854775807L;
        this.f7722f = defaultEbmlReader;
        defaultEbmlReader.f7680d = new b(null);
        this.f7726i = (i & 1) == 0;
        this.f7724g = new VarintReader();
        this.f7725h = new SparseArray<>();
        this.f7729l = new ParsableByteArray(4);
        this.f7730m = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.f7731n = new ParsableByteArray(4);
        this.f7727j = new ParsableByteArray(NalUnitUtil.f6368a);
        this.f7728k = new ParsableByteArray(4);
        this.f7732o = new ParsableByteArray();
        this.f7733p = new ParsableByteArray();
        this.f7734q = new ParsableByteArray(8);
        this.f7735r = new ParsableByteArray();
        this.f7736s = new ParsableByteArray();
        this.f7707Q = new int[1];
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.i0.e$c */
    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public static final class c {

        /* JADX INFO: renamed from: N */
        public byte[] f7758N;

        /* JADX INFO: renamed from: T */
        public d f7764T;

        /* JADX INFO: renamed from: U */
        public boolean f7765U;

        /* JADX INFO: renamed from: X */
        public TrackOutput2 f7768X;

        /* JADX INFO: renamed from: Y */
        public int f7769Y;

        /* JADX INFO: renamed from: a */
        public String f7770a;

        /* JADX INFO: renamed from: b */
        public String f7771b;

        /* JADX INFO: renamed from: c */
        public int f7772c;

        /* JADX INFO: renamed from: d */
        public int f7773d;

        /* JADX INFO: renamed from: e */
        public int f7774e;

        /* JADX INFO: renamed from: f */
        public int f7775f;

        /* JADX INFO: renamed from: g */
        public int f7776g;

        /* JADX INFO: renamed from: h */
        public boolean f7777h;

        /* JADX INFO: renamed from: i */
        public byte[] f7778i;

        /* JADX INFO: renamed from: j */
        public TrackOutput2.a f7779j;

        /* JADX INFO: renamed from: k */
        public byte[] f7780k;

        /* JADX INFO: renamed from: l */
        public DrmInitData f7781l;

        /* JADX INFO: renamed from: m */
        public int f7782m = -1;

        /* JADX INFO: renamed from: n */
        public int f7783n = -1;

        /* JADX INFO: renamed from: o */
        public int f7784o = -1;

        /* JADX INFO: renamed from: p */
        public int f7785p = -1;

        /* JADX INFO: renamed from: q */
        public int f7786q = 0;

        /* JADX INFO: renamed from: r */
        public int f7787r = -1;

        /* JADX INFO: renamed from: s */
        public float f7788s = 0.0f;

        /* JADX INFO: renamed from: t */
        public float f7789t = 0.0f;

        /* JADX INFO: renamed from: u */
        public float f7790u = 0.0f;

        /* JADX INFO: renamed from: v */
        public byte[] f7791v = null;

        /* JADX INFO: renamed from: w */
        public int f7792w = -1;

        /* JADX INFO: renamed from: x */
        public boolean f7793x = false;

        /* JADX INFO: renamed from: y */
        public int f7794y = -1;

        /* JADX INFO: renamed from: z */
        public int f7795z = -1;

        /* JADX INFO: renamed from: A */
        public int f7745A = -1;

        /* JADX INFO: renamed from: B */
        public int f7746B = CloseCodes.NORMAL_CLOSURE;

        /* JADX INFO: renamed from: C */
        public int f7747C = 200;

        /* JADX INFO: renamed from: D */
        public float f7748D = -1.0f;

        /* JADX INFO: renamed from: E */
        public float f7749E = -1.0f;

        /* JADX INFO: renamed from: F */
        public float f7750F = -1.0f;

        /* JADX INFO: renamed from: G */
        public float f7751G = -1.0f;

        /* JADX INFO: renamed from: H */
        public float f7752H = -1.0f;

        /* JADX INFO: renamed from: I */
        public float f7753I = -1.0f;

        /* JADX INFO: renamed from: J */
        public float f7754J = -1.0f;

        /* JADX INFO: renamed from: K */
        public float f7755K = -1.0f;

        /* JADX INFO: renamed from: L */
        public float f7756L = -1.0f;

        /* JADX INFO: renamed from: M */
        public float f7757M = -1.0f;

        /* JADX INFO: renamed from: O */
        public int f7759O = 1;

        /* JADX INFO: renamed from: P */
        public int f7760P = -1;

        /* JADX INFO: renamed from: Q */
        public int f7761Q = 8000;

        /* JADX INFO: renamed from: R */
        public long f7762R = 0;

        /* JADX INFO: renamed from: S */
        public long f7763S = 0;

        /* JADX INFO: renamed from: V */
        public boolean f7766V = true;

        /* JADX INFO: renamed from: W */
        public String f7767W = "eng";

        public c() {
        }

        @EnsuresNonNull({"codecPrivate"})
        /* JADX INFO: renamed from: a */
        public final byte[] m3790a(String str) throws ParserException {
            byte[] bArr = this.f7780k;
            if (bArr != null) {
                return bArr;
            }
            throw new ParserException(outline.m1599u("Missing CodecPrivate for codec ", str));
        }

        public c(a aVar) {
        }
    }
}
