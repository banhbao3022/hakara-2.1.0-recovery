package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.UUID;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nj2 {

    /* JADX INFO: renamed from: a */
    public final byte[] f17128a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final Stack<mj2> f17129b = new Stack<>();

    /* JADX INFO: renamed from: c */
    public final tj2 f17130c = new tj2();

    /* JADX INFO: renamed from: d */
    public int f17131d;

    /* JADX INFO: renamed from: e */
    public int f17132e;

    /* JADX INFO: renamed from: f */
    public long f17133f;

    /* JADX INFO: renamed from: g */
    public pj2 f17134g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:229:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:256:0x0470  */
    /* JADX WARN: Code duplicated, block: B:258:0x0478  */
    /* JADX WARN: Code duplicated, block: B:259:0x0494  */
    /* JADX WARN: Code duplicated, block: B:261:0x049a  */
    /* JADX WARN: Code duplicated, block: B:350:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:351:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:354:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:355:0x06da  */
    /* JADX WARN: Code duplicated, block: B:357:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:359:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:361:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:364:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:366:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:369:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:372:0x070f  */
    /* JADX WARN: Code duplicated, block: B:375:0x0717  */
    /* JADX WARN: Code duplicated, block: B:377:0x071d  */
    /* JADX WARN: Code duplicated, block: B:397:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:399:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:401:0x080b  */
    /* JADX WARN: Code duplicated, block: B:403:0x0813  */
    /* JADX WARN: Code duplicated, block: B:404:0x082b  */
    /* JADX WARN: Code duplicated, block: B:406:0x0833  */
    /* JADX WARN: Code duplicated, block: B:447:0x093e  */
    /* JADX WARN: Code duplicated, block: B:448:0x0940  */
    /* JADX WARN: Code duplicated, block: B:449:0x0942  */
    /* JADX WARN: Code duplicated, block: B:450:0x0944  */
    /* JADX WARN: Code duplicated, block: B:451:0x0946  */
    /* JADX WARN: Code duplicated, block: B:455:0x094c  */
    /* JADX WARN: Code duplicated, block: B:457:0x094f  */
    /* JADX WARN: Code duplicated, block: B:459:0x0952  */
    /* JADX WARN: Code duplicated, block: B:461:0x0955  */
    /* JADX WARN: Code duplicated, block: B:470:0x0985  */
    /* JADX WARN: Code duplicated, block: B:471:0x098c  */
    /* JADX WARN: Code duplicated, block: B:474:0x099a  */
    /* JADX WARN: Code duplicated, block: B:476:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:478:0x09af  */
    /* JADX WARN: Code duplicated, block: B:480:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:481:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:484:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:486:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:488:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:490:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:492:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:494:0x0a2d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:495:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:497:0x0a33 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:498:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:500:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:502:0x0a3d  */
    /* JADX WARN: Code duplicated, block: B:504:0x0a42 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:505:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:515:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:516:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:517:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:525:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:526:0x0aa3  */
    /* JADX WARN: Code duplicated, block: B:527:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:529:0x0ab0  */
    /* JADX WARN: Code duplicated, block: B:530:0x0ab4  */
    /* JADX WARN: Code duplicated, block: B:531:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:534:0x0ac5 A[LOOP:0: B:7:0x000e->B:534:0x0ac5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:539:0x0949 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
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
    /* JADX INFO: renamed from: a */
    public final boolean m7866a(bj2 bj2Var) throws InterruptedException, IOException {
        boolean z;
        ?? r2;
        char c2;
        nj2 nj2Var;
        pj2 pj2Var;
        int i;
        rj2 rj2Var;
        long j2;
        int i2;
        long j3;
        rj2 rj2Var2;
        int i3;
        long j4;
        long j5;
        long j6;
        int i4;
        String str;
        long j7;
        int i5;
        long jM7867b;
        double dLongBitsToDouble;
        byte b;
        List<byte[]> listSingletonList;
        List<byte[]> list;
        String str2;
        String str3;
        ArrayList arrayList;
        String str4;
        int i6;
        List list2;
        int i7;
        int i8;
        String str5;
        boolean z2;
        int iM7376h;
        int i9;
        int i10;
        int i11;
        ch2 ch2Var;
        int i12;
        int i13;
        int i14;
        float f;
        mo2 mo2Var;
        byte[] bArr;
        int i15;
        int i16;
        int i17;
        rj2 rj2Var3;
        jj2 ij2Var;
        yn2 yn2Var;
        int i18;
        yn2 yn2Var2;
        nj2 nj2Var2 = this;
        C2622l.m5322V2(nj2Var2.f17134g != null);
        while (true) {
            if (nj2Var2.f17129b.isEmpty()) {
                z = true;
                r2 = 0;
                c2 = 5;
                nj2Var = this;
            } else {
                if (bj2Var.f12710d >= nj2Var2.f17129b.peek().f16780b) {
                    pj2 pj2Var2 = nj2Var2.f17134g;
                    int i19 = nj2Var2.f17129b.pop().f16779a;
                    rj2 rj2Var4 = pj2Var2.f17998a;
                    Objects.requireNonNull(rj2Var4);
                    if (i19 == 160) {
                        if (rj2Var4.f18865G != 2) {
                            return true;
                        }
                        if (!rj2Var4.f18884Z) {
                            rj2Var4.f18873O |= 1;
                        }
                        rj2Var4.m8287j(rj2Var4.f18888e.get(rj2Var4.f18871M), rj2Var4.f18866H);
                        rj2Var4.f18865G = 0;
                        return true;
                    }
                    if (i19 != 174) {
                        if (i19 == 19899) {
                            int i20 = rj2Var4.f18907x;
                            if (i20 != -1) {
                                long j8 = rj2Var4.f18908y;
                                if (j8 != -1) {
                                    if (i20 != 475249515) {
                                        return true;
                                    }
                                    rj2Var4.f18859A = j8;
                                    return true;
                                }
                            }
                            throw new fh2("Mandatory element SeekID or SeekPosition not found");
                        }
                        if (i19 == 25152) {
                            qj2 qj2Var = rj2Var4.f18905v;
                            if (!qj2Var.f18340e) {
                                return true;
                            }
                            kj2 kj2Var = qj2Var.f18342g;
                            if (kj2Var == null) {
                                throw new fh2("Encrypted Track found but ContentEncKeyID was not found");
                            }
                            qj2Var.f18344i = new yi2(new xi2(og2.f17616b, "video/webm", kj2Var.f15966b, false));
                            return true;
                        }
                        if (i19 == 28032) {
                            qj2 qj2Var2 = rj2Var4.f18905v;
                            if (!qj2Var2.f18340e || qj2Var2.f18341f == null) {
                                return true;
                            }
                            throw new fh2("Combining encryption and compression is not supported");
                        }
                        if (i19 == 357149030) {
                            if (rj2Var4.f18902s == -9223372036854775807L) {
                                rj2Var4.f18902s = 1000000L;
                            }
                            long j9 = rj2Var4.f18903t;
                            if (j9 == -9223372036854775807L) {
                                return true;
                            }
                            rj2Var4.f18904u = rj2Var4.m8289l(j9);
                            return true;
                        }
                        if (i19 == 374648427) {
                            if (rj2Var4.f18888e.size() == 0) {
                                throw new fh2("No valid tracks were found");
                            }
                            ((vl2) rj2Var4.f18885a0).m8571p();
                            return true;
                        }
                        if (i19 != 475249515 || rj2Var4.f18906w) {
                            return true;
                        }
                        dj2 dj2Var = rj2Var4.f18885a0;
                        if (rj2Var4.f18901r == -1 || rj2Var4.f18904u == -9223372036854775807L || (yn2Var = rj2Var4.f18862D) == null || (i18 = yn2Var.f21934a) == 0 || (yn2Var2 = rj2Var4.f18863E) == null || yn2Var2.f21934a != i18) {
                            rj2Var4.f18862D = null;
                            rj2Var4.f18863E = null;
                            ij2Var = new ij2(rj2Var4.f18904u);
                        } else {
                            int[] iArr = new int[i18];
                            long[] jArr = new long[i18];
                            long[] jArr2 = new long[i18];
                            long[] jArr3 = new long[i18];
                            for (int i21 = 0; i21 < i18; i21++) {
                                jArr3[i21] = rj2Var4.f18862D.m8810b(i21);
                                jArr[i21] = rj2Var4.f18863E.m8810b(i21) + rj2Var4.f18901r;
                            }
                            int i22 = 0;
                            while (true) {
                                int i23 = i18 - 1;
                                if (i22 < i23) {
                                    int i24 = i22 + 1;
                                    iArr[i22] = (int) (jArr[i24] - jArr[i22]);
                                    jArr2[i22] = jArr3[i24] - jArr3[i22];
                                    i22 = i24;
                                } else {
                                    iArr[i23] = (int) ((rj2Var4.f18901r + rj2Var4.f18900q) - jArr[i23]);
                                    jArr2[i23] = rj2Var4.f18904u - jArr3[i23];
                                    rj2Var4.f18862D = null;
                                    rj2Var4.f18863E = null;
                                    ij2Var = new aj2(iArr, jArr, jArr2, jArr3);
                                }
                            }
                        }
                        vl2 vl2Var = (vl2) dj2Var;
                        vl2Var.f20855u = ij2Var;
                        vl2Var.f20852r.post(vl2Var.f20850p);
                        rj2Var4.f18906w = true;
                        return true;
                    }
                    String str6 = rj2Var4.f18905v.f18336a;
                    if ("V_VP8".equals(str6) || "V_VP9".equals(str6) || "V_MPEG2".equals(str6) || "V_MPEG4/ISO/SP".equals(str6) || "V_MPEG4/ISO/ASP".equals(str6) || "V_MPEG4/ISO/AP".equals(str6) || "V_MPEG4/ISO/AVC".equals(str6) || "V_MPEGH/ISO/HEVC".equals(str6) || "V_MS/VFW/FOURCC".equals(str6) || "V_THEORA".equals(str6) || "A_OPUS".equals(str6) || "A_VORBIS".equals(str6) || "A_AAC".equals(str6) || "A_MPEG/L2".equals(str6) || "A_MPEG/L3".equals(str6) || "A_AC3".equals(str6) || "A_EAC3".equals(str6) || "A_TRUEHD".equals(str6) || "A_DTS".equals(str6) || "A_DTS/EXPRESS".equals(str6) || "A_DTS/LOSSLESS".equals(str6) || "A_FLAC".equals(str6) || "A_MS/ACM".equals(str6) || "A_PCM/INT/LIT".equals(str6) || "S_TEXT/UTF8".equals(str6) || "S_VOBSUB".equals(str6) || "S_HDMV/PGS".equals(str6) || "S_DVBSUB".equals(str6)) {
                        qj2 qj2Var3 = rj2Var4.f18905v;
                        dj2 dj2Var2 = rj2Var4.f18885a0;
                        int i25 = qj2Var3.f18337b;
                        switch (qj2Var3.f18336a) {
                            case "V_MPEG4/ISO/AP":
                                b = 5;
                                break;
                            case "V_MPEG4/ISO/SP":
                                b = 3;
                                break;
                            case "A_MS/ACM":
                                b = 22;
                                break;
                            case "A_TRUEHD":
                                b = 17;
                                break;
                            case "A_VORBIS":
                                b = 10;
                                break;
                            case "A_MPEG/L2":
                                b = 13;
                                break;
                            case "A_MPEG/L3":
                                b = 14;
                                break;
                            case "V_MS/VFW/FOURCC":
                                b = 8;
                                break;
                            case "S_DVBSUB":
                                b = 27;
                                break;
                            case "V_MPEG4/ISO/ASP":
                                b = 4;
                                break;
                            case "V_MPEG4/ISO/AVC":
                                b = 6;
                                break;
                            case "S_VOBSUB":
                                b = 25;
                                break;
                            case "A_DTS/LOSSLESS":
                                b = 20;
                                break;
                            case "A_AAC":
                                b = 12;
                                break;
                            case "A_AC3":
                                b = 15;
                                break;
                            case "A_DTS":
                                b = 18;
                                break;
                            case "V_VP8":
                                b = 0;
                                break;
                            case "V_VP9":
                                b = 1;
                                break;
                            case "S_HDMV/PGS":
                                b = 26;
                                break;
                            case "V_THEORA":
                                b = 9;
                                break;
                            case "A_DTS/EXPRESS":
                                b = 19;
                                break;
                            case "A_PCM/INT/LIT":
                                b = 23;
                                break;
                            case "V_MPEGH/ISO/HEVC":
                                b = 7;
                                break;
                            case "S_TEXT/UTF8":
                                b = 24;
                                break;
                            case "V_MPEG2":
                                b = 2;
                                break;
                            case "A_EAC3":
                                b = 16;
                                break;
                            case "A_FLAC":
                                b = 21;
                                break;
                            case "A_OPUS":
                                b = 11;
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        String str7 = "video/x-unknown";
                        switch (b) {
                            case 0:
                                dj2Var2 = dj2Var2;
                                str7 = "video/x-vnd.on2.vp8";
                                str3 = str7;
                                listSingletonList = null;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z3 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z3 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13 || (i15 = qj2Var3.f18348m) == i13) {
                                        f = -1.0f;
                                    } else {
                                        f = (qj2Var3.f18346k * i14) / (qj2Var3.f18345j * i15);
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f || qj2Var3.f18359x == -1.0f || qj2Var3.f18360y == -1.0f || qj2Var3.f18361z == -1.0f || qj2Var3.f18320A == -1.0f || qj2Var3.f18321B == -1.0f || qj2Var3.f18322C == -1.0f || qj2Var3.f18323D == -1.0f || qj2Var3.f18324E == -1.0f || qj2Var3.f18325F == -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = new byte[25];
                                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                                            byteBufferWrap.put((byte) 0);
                                            byteBufferWrap.putShort((short) ((qj2Var3.f18358w * 50000.0f) + 0.5f));
                                            byteBufferWrap.putShort((short) ((qj2Var3.f18359x * 50000.0f) + 0.5f));
                                            byteBufferWrap.putShort((short) ((qj2Var3.f18360y * 50000.0f) + 0.5f));
                                            byteBufferWrap.putShort((short) ((qj2Var3.f18361z * 50000.0f) + 0.5f));
                                            byteBufferWrap.putShort((short) ((qj2Var3.f18320A * 50000.0f) + 0.5f));
                                            byteBufferWrap.putShort((short) ((qj2Var3.f18321B * 50000.0f) + 0.5f));
                                            byteBufferWrap.putShort((short) ((qj2Var3.f18322C * 50000.0f) + 0.5f));
                                            byteBufferWrap.putShort((short) ((qj2Var3.f18323D * 50000.0f) + 0.5f));
                                            byteBufferWrap.putShort((short) (qj2Var3.f18324E + 0.5f));
                                            byteBufferWrap.putShort((short) (qj2Var3.f18325F + 0.5f));
                                            byteBufferWrap.putShort((short) qj2Var3.f18356u);
                                            byteBufferWrap.putShort((short) qj2Var3.f18357v);
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4) && !"application/pgs".equals(str4) && !"application/dvbsubs".equals(str4)) {
                                            throw new fh2("Unexpected MIME type.");
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o;
                                ((km2) lj2VarM8570o).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray = rj2Var3.f18888e;
                                qj2 qj2Var4 = rj2Var3.f18905v;
                                sparseArray.put(qj2Var4.f18337b, qj2Var4);
                                break;
                            case 1:
                                dj2Var2 = dj2Var2;
                                str7 = "video/x-vnd.on2.vp9";
                                str3 = str7;
                                listSingletonList = null;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z4 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z4 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o2 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o2;
                                ((km2) lj2VarM8570o2).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray2 = rj2Var3.f18888e;
                                qj2 qj2Var5 = rj2Var3.f18905v;
                                sparseArray2.put(qj2Var5.f18337b, qj2Var5);
                                break;
                            case 2:
                                dj2Var2 = dj2Var2;
                                str7 = "video/mpeg2";
                                str3 = str7;
                                listSingletonList = null;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z5 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z5 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o3 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o3;
                                ((km2) lj2VarM8570o3).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray3 = rj2Var3.f18888e;
                                qj2 qj2Var6 = rj2Var3.f18905v;
                                sparseArray3.put(qj2Var6.f18337b, qj2Var6);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                dj2Var2 = dj2Var2;
                                byte[] bArr2 = qj2Var3.f18343h;
                                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                                str7 = "video/mp4v-es";
                                str3 = str7;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z6 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z6 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o4 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o4;
                                ((km2) lj2VarM8570o4).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray4 = rj2Var3.f18888e;
                                qj2 qj2Var7 = rj2Var3.f18905v;
                                sparseArray4.put(qj2Var7.f18337b, qj2Var7);
                                break;
                            case 6:
                                ko2 ko2VarM7534a = ko2.m7534a(new do2(qj2Var3.f18343h));
                                list = ko2VarM7534a.f16005a;
                                qj2Var3.f18335P = ko2VarM7534a.f16006b;
                                str2 = "video/avc";
                                List<byte[]> list3 = list;
                                str3 = str2;
                                listSingletonList = list3;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z7 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z7 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o5 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o5;
                                ((km2) lj2VarM8570o5).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray5 = rj2Var3.f18888e;
                                qj2 qj2Var8 = rj2Var3.f18905v;
                                sparseArray5.put(qj2Var8.f18337b, qj2Var8);
                                break;
                            case 7:
                                po2 po2VarM8138a = po2.m8138a(new do2(qj2Var3.f18343h));
                                list = po2VarM8138a.f18049a;
                                qj2Var3.f18335P = po2VarM8138a.f18050b;
                                str2 = "video/hevc";
                                List<byte[]> list4 = list;
                                str3 = str2;
                                listSingletonList = list4;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z8 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z8 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o6 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o6;
                                ((km2) lj2VarM8570o6).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray6 = rj2Var3.f18888e;
                                qj2 qj2Var9 = rj2Var3.f18905v;
                                sparseArray6.put(qj2Var9.f18337b, qj2Var9);
                                break;
                            case 8:
                                dj2Var2 = dj2Var2;
                                do2 do2Var = new do2(qj2Var3.f18343h);
                                try {
                                    do2Var.m6390g(16);
                                    byte[] bArr3 = do2Var.f13340a;
                                    int i26 = do2Var.f13341b;
                                    int i27 = i26 + 1;
                                    do2Var.f13341b = i27;
                                    byte b2 = bArr3[i26];
                                    int i28 = i27 + 1;
                                    do2Var.f13341b = i28;
                                    byte b3 = bArr3[i27];
                                    int i29 = i28 + 1;
                                    do2Var.f13341b = i29;
                                    byte b4 = bArr3[i28];
                                    int i30 = i29 + 1;
                                    do2Var.f13341b = i30;
                                    if ((((((long) b3) & 255) << 8) | (((long) b2) & 255) | ((((long) b4) & 255) << 16) | ((((long) bArr3[i29]) & 255) << 24)) != 826496599) {
                                        listSingletonList = null;
                                    } else {
                                        int i31 = i30 + 20;
                                        while (true) {
                                            int length = bArr3.length;
                                            if (i31 >= length - 4) {
                                                throw new fh2("Failed to find FourCC VC1 initialization data");
                                            }
                                            if (bArr3[i31] == 0 && bArr3[i31 + 1] == 0 && bArr3[i31 + 2] == 1 && bArr3[i31 + 3] == 15) {
                                                listSingletonList = Collections.singletonList(Arrays.copyOfRange(bArr3, i31, length));
                                            } else {
                                                i31++;
                                            }
                                        }
                                    }
                                    if (listSingletonList != null) {
                                        str7 = "video/wvc1";
                                    } else {
                                        Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                                    }
                                    str3 = str7;
                                    i9 = -1;
                                    list2 = listSingletonList;
                                    str4 = str3;
                                    i8 = i9;
                                    i7 = -1;
                                    boolean z9 = qj2Var3.f18332M;
                                    if (true != qj2Var3.f18331L) {
                                        i10 = 0;
                                    } else {
                                        i10 = 2;
                                    }
                                    i11 = (z9 ? 1 : 0) | i10;
                                    if (C2622l.m5406n1(str4)) {
                                        ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                        i12 = 1;
                                    } else if (C2622l.m5329X1(str4)) {
                                        if (qj2Var3.f18349n == 0) {
                                            i16 = qj2Var3.f18347l;
                                            i13 = -1;
                                            if (i16 == -1) {
                                                i16 = qj2Var3.f18345j;
                                            }
                                            qj2Var3.f18347l = i16;
                                            i17 = qj2Var3.f18348m;
                                            if (i17 == -1) {
                                                i17 = qj2Var3.f18346k;
                                            }
                                            qj2Var3.f18348m = i17;
                                        } else {
                                            i13 = -1;
                                        }
                                        i14 = qj2Var3.f18347l;
                                        if (i14 != i13) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (qj2Var3.f18352q) {
                                            if (qj2Var3.f18358w != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                        } else {
                                            mo2Var = null;
                                        }
                                        ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                        i12 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str4)) {
                                            ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str4)) {
                                            }
                                            ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                        }
                                        i12 = 3;
                                    }
                                    lj2 lj2VarM8570o7 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                    qj2Var3.f18334O = lj2VarM8570o7;
                                    ((km2) lj2VarM8570o7).m7515a(ch2Var);
                                    rj2Var3 = rj2Var4;
                                    SparseArray<qj2> sparseArray7 = rj2Var3.f18888e;
                                    qj2 qj2Var10 = rj2Var3.f18905v;
                                    sparseArray7.put(qj2Var10.f18337b, qj2Var10);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    throw new fh2("Error parsing FourCC VC1 codec private");
                                }
                                break;
                            case 9:
                                dj2Var2 = dj2Var2;
                                str3 = str7;
                                listSingletonList = null;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z10 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z10 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o8 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o8;
                                ((km2) lj2VarM8570o8).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray8 = rj2Var3.f18888e;
                                qj2 qj2Var11 = rj2Var3.f18905v;
                                sparseArray8.put(qj2Var11.f18337b, qj2Var11);
                                break;
                            case 10:
                                byte[] bArr4 = qj2Var3.f18343h;
                                try {
                                    if (bArr4[0] != 2) {
                                        throw new fh2("Error parsing vorbis codec private");
                                    }
                                    int i32 = 0;
                                    int i33 = 1;
                                    while (true) {
                                        int i34 = bArr4[i33];
                                        if (i34 != -1) {
                                            int i35 = i33 + 1;
                                            int i36 = i32 + i34;
                                            int i37 = 0;
                                            while (true) {
                                                int i38 = bArr4[i35];
                                                if (i38 != -1) {
                                                    int i39 = i35 + 1;
                                                    int i40 = i37 + i38;
                                                    if (bArr4[i39] != 1) {
                                                        throw new fh2("Error parsing vorbis codec private");
                                                    }
                                                    byte[] bArr5 = new byte[i36];
                                                    System.arraycopy(bArr4, i39, bArr5, 0, i36);
                                                    int i41 = i39 + i36;
                                                    if (bArr4[i41] != 3) {
                                                        throw new fh2("Error parsing vorbis codec private");
                                                    }
                                                    int i42 = i41 + i40;
                                                    if (bArr4[i42] != 5) {
                                                        throw new fh2("Error parsing vorbis codec private");
                                                    }
                                                    int length2 = bArr4.length - i42;
                                                    byte[] bArr6 = new byte[length2];
                                                    System.arraycopy(bArr4, i42, bArr6, 0, length2);
                                                    ArrayList arrayList2 = new ArrayList(2);
                                                    arrayList2.add(bArr5);
                                                    arrayList2.add(bArr6);
                                                    arrayList = arrayList2;
                                                    str4 = "audio/vorbis";
                                                    i6 = 8192;
                                                    list2 = arrayList;
                                                    i7 = i6;
                                                    i8 = -1;
                                                    boolean z11 = qj2Var3.f18332M;
                                                    if (true != qj2Var3.f18331L) {
                                                        i10 = 0;
                                                    } else {
                                                        i10 = 2;
                                                    }
                                                    i11 = (z11 ? 1 : 0) | i10;
                                                    if (C2622l.m5406n1(str4)) {
                                                        ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                                        i12 = 1;
                                                    } else if (C2622l.m5329X1(str4)) {
                                                        if (qj2Var3.f18349n == 0) {
                                                            i16 = qj2Var3.f18347l;
                                                            i13 = -1;
                                                            if (i16 == -1) {
                                                                i16 = qj2Var3.f18345j;
                                                            }
                                                            qj2Var3.f18347l = i16;
                                                            i17 = qj2Var3.f18348m;
                                                            if (i17 == -1) {
                                                                i17 = qj2Var3.f18346k;
                                                            }
                                                            qj2Var3.f18348m = i17;
                                                        } else {
                                                            i13 = -1;
                                                        }
                                                        i14 = qj2Var3.f18347l;
                                                        if (i14 != i13) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (qj2Var3.f18352q) {
                                                            if (qj2Var3.f18358w != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                                        } else {
                                                            mo2Var = null;
                                                        }
                                                        ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                                        i12 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str4)) {
                                                            ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                                        } else {
                                                            if ("application/vobsub".equals(str4)) {
                                                            }
                                                            ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                                        }
                                                        i12 = 3;
                                                    }
                                                    lj2 lj2VarM8570o9 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                                    qj2Var3.f18334O = lj2VarM8570o9;
                                                    ((km2) lj2VarM8570o9).m7515a(ch2Var);
                                                    rj2Var3 = rj2Var4;
                                                    SparseArray<qj2> sparseArray9 = rj2Var3.f18888e;
                                                    qj2 qj2Var12 = rj2Var3.f18905v;
                                                    sparseArray9.put(qj2Var12.f18337b, qj2Var12);
                                                } else {
                                                    i37 += 255;
                                                    i35++;
                                                }
                                            }
                                        } else {
                                            i32 += 255;
                                            i33++;
                                        }
                                    }
                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                    throw new fh2("Error parsing vorbis codec private");
                                }
                                break;
                            case 11:
                                ArrayList arrayList3 = new ArrayList(3);
                                arrayList3.add(qj2Var3.f18343h);
                                arrayList3.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(qj2Var3.f18329J).array());
                                arrayList3.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(qj2Var3.f18330K).array());
                                i6 = 5760;
                                arrayList = arrayList3;
                                str4 = "audio/opus";
                                list2 = arrayList;
                                i7 = i6;
                                i8 = -1;
                                boolean z12 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z12 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o10 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o10;
                                ((km2) lj2VarM8570o10).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray10 = rj2Var3.f18888e;
                                qj2 qj2Var13 = rj2Var3.f18905v;
                                sparseArray10.put(qj2Var13.f18337b, qj2Var13);
                                break;
                            case 12:
                                dj2Var2 = dj2Var2;
                                listSingletonList = Collections.singletonList(qj2Var3.f18343h);
                                str3 = "audio/mp4a-latm";
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z13 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z13 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o11 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o11;
                                ((km2) lj2VarM8570o11).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray11 = rj2Var3.f18888e;
                                qj2 qj2Var14 = rj2Var3.f18905v;
                                sparseArray11.put(qj2Var14.f18337b, qj2Var14);
                                break;
                            case 13:
                                str4 = "audio/mpeg-L2";
                                i7 = 4096;
                                i8 = -1;
                                list2 = null;
                                boolean z14 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z14 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o12 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o12;
                                ((km2) lj2VarM8570o12).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray12 = rj2Var3.f18888e;
                                qj2 qj2Var15 = rj2Var3.f18905v;
                                sparseArray12.put(qj2Var15.f18337b, qj2Var15);
                                break;
                            case 14:
                                str4 = "audio/mpeg";
                                i7 = 4096;
                                i8 = -1;
                                list2 = null;
                                boolean z15 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z15 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o13 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o13;
                                ((km2) lj2VarM8570o13).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray13 = rj2Var3.f18888e;
                                qj2 qj2Var16 = rj2Var3.f18905v;
                                sparseArray13.put(qj2Var16.f18337b, qj2Var16);
                                break;
                            case 15:
                                str5 = "audio/ac3";
                                str7 = str5;
                                str3 = str7;
                                listSingletonList = null;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z16 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z16 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o14 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o14;
                                ((km2) lj2VarM8570o14).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray14 = rj2Var3.f18888e;
                                qj2 qj2Var17 = rj2Var3.f18905v;
                                sparseArray14.put(qj2Var17.f18337b, qj2Var17);
                                break;
                            case 16:
                                str5 = "audio/eac3";
                                str7 = str5;
                                str3 = str7;
                                listSingletonList = null;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z17 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z17 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o15 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o15;
                                ((km2) lj2VarM8570o15).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray15 = rj2Var3.f18888e;
                                qj2 qj2Var18 = rj2Var3.f18905v;
                                sparseArray15.put(qj2Var18.f18337b, qj2Var18);
                                break;
                            case 17:
                                str5 = "audio/true-hd";
                                str7 = str5;
                                str3 = str7;
                                listSingletonList = null;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z18 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z18 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o16 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o16;
                                ((km2) lj2VarM8570o16).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray16 = rj2Var3.f18888e;
                                qj2 qj2Var19 = rj2Var3.f18905v;
                                sparseArray16.put(qj2Var19.f18337b, qj2Var19);
                                break;
                            case 18:
                            case 19:
                                str5 = "audio/vnd.dts";
                                str7 = str5;
                                str3 = str7;
                                listSingletonList = null;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z19 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z19 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o17 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o17;
                                ((km2) lj2VarM8570o17).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray17 = rj2Var3.f18888e;
                                qj2 qj2Var110 = rj2Var3.f18905v;
                                sparseArray17.put(qj2Var110.f18337b, qj2Var110);
                                break;
                            case 20:
                                str5 = "audio/vnd.dts.hd";
                                str7 = str5;
                                str3 = str7;
                                listSingletonList = null;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z110 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z110 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o18 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o18;
                                ((km2) lj2VarM8570o18).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray18 = rj2Var3.f18888e;
                                qj2 qj2Var111 = rj2Var3.f18905v;
                                sparseArray18.put(qj2Var111.f18337b, qj2Var111);
                                break;
                            case 21:
                                dj2Var2 = dj2Var2;
                                listSingletonList = Collections.singletonList(qj2Var3.f18343h);
                                str3 = "audio/x-flac";
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z111 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z111 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o19 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o19;
                                ((km2) lj2VarM8570o19).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray19 = rj2Var3.f18888e;
                                qj2 qj2Var112 = rj2Var3.f18905v;
                                sparseArray19.put(qj2Var112.f18337b, qj2Var112);
                                break;
                            case 22:
                                dj2Var2 = dj2Var2;
                                do2 do2Var2 = new do2(qj2Var3.f18343h);
                                try {
                                    byte[] bArr7 = do2Var2.f13340a;
                                    int i43 = do2Var2.f13341b;
                                    int i44 = i43 + 1;
                                    do2Var2.f13341b = i44;
                                    byte b5 = bArr7[i43];
                                    do2Var2.f13341b = i44 + 1;
                                    int i45 = ((bArr7[i44] & 255) << 8) | (b5 & 255);
                                    if (i45 != 1) {
                                        if (i45 == 65534) {
                                            do2Var2.m6389f(24);
                                            long jM6396m = do2Var2.m6396m();
                                            UUID uuid = rj2.f18858c;
                                            if (jM6396m != uuid.getMostSignificantBits() || do2Var2.m6396m() != uuid.getLeastSignificantBits()) {
                                            }
                                            if (z2) {
                                                iM7376h = jo2.m7376h(qj2Var3.f18327H);
                                                if (iM7376h != 0) {
                                                    str3 = "audio/raw";
                                                    i9 = iM7376h;
                                                    listSingletonList = null;
                                                    list2 = listSingletonList;
                                                    str4 = str3;
                                                    i8 = i9;
                                                    i7 = -1;
                                                    boolean z112 = qj2Var3.f18332M;
                                                    if (true != qj2Var3.f18331L) {
                                                        i10 = 0;
                                                    } else {
                                                        i10 = 2;
                                                    }
                                                    i11 = (z112 ? 1 : 0) | i10;
                                                    if (C2622l.m5406n1(str4)) {
                                                        ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                                        i12 = 1;
                                                    } else if (C2622l.m5329X1(str4)) {
                                                        if (qj2Var3.f18349n == 0) {
                                                            i16 = qj2Var3.f18347l;
                                                            i13 = -1;
                                                            if (i16 == -1) {
                                                                i16 = qj2Var3.f18345j;
                                                            }
                                                            qj2Var3.f18347l = i16;
                                                            i17 = qj2Var3.f18348m;
                                                            if (i17 == -1) {
                                                                i17 = qj2Var3.f18346k;
                                                            }
                                                            qj2Var3.f18348m = i17;
                                                        } else {
                                                            i13 = -1;
                                                        }
                                                        i14 = qj2Var3.f18347l;
                                                        if (i14 != i13) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (qj2Var3.f18352q) {
                                                            if (qj2Var3.f18358w != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                                        } else {
                                                            mo2Var = null;
                                                        }
                                                        ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                                        i12 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str4)) {
                                                            ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                                        } else {
                                                            if ("application/vobsub".equals(str4)) {
                                                            }
                                                            ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                                        }
                                                        i12 = 3;
                                                    }
                                                    lj2 lj2VarM8570o110 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                                    qj2Var3.f18334O = lj2VarM8570o110;
                                                    ((km2) lj2VarM8570o110).m7515a(ch2Var);
                                                    rj2Var3 = rj2Var4;
                                                    SparseArray<qj2> sparseArray110 = rj2Var3.f18888e;
                                                    qj2 qj2Var113 = rj2Var3.f18905v;
                                                    sparseArray110.put(qj2Var113.f18337b, qj2Var113);
                                                } else {
                                                    int i46 = qj2Var3.f18327H;
                                                    StringBuilder sb = new StringBuilder(75);
                                                    sb.append("Unsupported PCM bit depth: ");
                                                    sb.append(i46);
                                                    sb.append(". Setting mimeType to audio/x-unknown");
                                                    Log.w("MatroskaExtractor", sb.toString());
                                                }
                                            } else {
                                                Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                            }
                                            str3 = "audio/x-unknown";
                                            listSingletonList = null;
                                            i9 = -1;
                                            list2 = listSingletonList;
                                            str4 = str3;
                                            i8 = i9;
                                            i7 = -1;
                                            boolean z113 = qj2Var3.f18332M;
                                            if (true != qj2Var3.f18331L) {
                                                i10 = 0;
                                            } else {
                                                i10 = 2;
                                            }
                                            i11 = (z113 ? 1 : 0) | i10;
                                            if (C2622l.m5406n1(str4)) {
                                                ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                                i12 = 1;
                                            } else if (C2622l.m5329X1(str4)) {
                                                if (qj2Var3.f18349n == 0) {
                                                    i16 = qj2Var3.f18347l;
                                                    i13 = -1;
                                                    if (i16 == -1) {
                                                        i16 = qj2Var3.f18345j;
                                                    }
                                                    qj2Var3.f18347l = i16;
                                                    i17 = qj2Var3.f18348m;
                                                    if (i17 == -1) {
                                                        i17 = qj2Var3.f18346k;
                                                    }
                                                    qj2Var3.f18348m = i17;
                                                } else {
                                                    i13 = -1;
                                                }
                                                i14 = qj2Var3.f18347l;
                                                if (i14 != i13) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (qj2Var3.f18352q) {
                                                    if (qj2Var3.f18358w != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                                } else {
                                                    mo2Var = null;
                                                }
                                                ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                                i12 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str4)) {
                                                    ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str4)) {
                                                    }
                                                    ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                                }
                                                i12 = 3;
                                            }
                                            lj2 lj2VarM8570o111 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                            qj2Var3.f18334O = lj2VarM8570o111;
                                            ((km2) lj2VarM8570o111).m7515a(ch2Var);
                                            rj2Var3 = rj2Var4;
                                            SparseArray<qj2> sparseArray111 = rj2Var3.f18888e;
                                            qj2 qj2Var114 = rj2Var3.f18905v;
                                            sparseArray111.put(qj2Var114.f18337b, qj2Var114);
                                        }
                                        z2 = false;
                                        if (z2) {
                                            iM7376h = jo2.m7376h(qj2Var3.f18327H);
                                            if (iM7376h != 0) {
                                                str3 = "audio/raw";
                                                i9 = iM7376h;
                                                listSingletonList = null;
                                                list2 = listSingletonList;
                                                str4 = str3;
                                                i8 = i9;
                                                i7 = -1;
                                                boolean z114 = qj2Var3.f18332M;
                                                if (true != qj2Var3.f18331L) {
                                                    i10 = 0;
                                                } else {
                                                    i10 = 2;
                                                }
                                                i11 = (z114 ? 1 : 0) | i10;
                                                if (C2622l.m5406n1(str4)) {
                                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                                    i12 = 1;
                                                } else if (C2622l.m5329X1(str4)) {
                                                    if (qj2Var3.f18349n == 0) {
                                                        i16 = qj2Var3.f18347l;
                                                        i13 = -1;
                                                        if (i16 == -1) {
                                                            i16 = qj2Var3.f18345j;
                                                        }
                                                        qj2Var3.f18347l = i16;
                                                        i17 = qj2Var3.f18348m;
                                                        if (i17 == -1) {
                                                            i17 = qj2Var3.f18346k;
                                                        }
                                                        qj2Var3.f18348m = i17;
                                                    } else {
                                                        i13 = -1;
                                                    }
                                                    i14 = qj2Var3.f18347l;
                                                    if (i14 != i13) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (qj2Var3.f18352q) {
                                                        if (qj2Var3.f18358w != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                                    } else {
                                                        mo2Var = null;
                                                    }
                                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                                    i12 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str4)) {
                                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                                    } else {
                                                        if ("application/vobsub".equals(str4)) {
                                                        }
                                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                                    }
                                                    i12 = 3;
                                                }
                                                lj2 lj2VarM8570o112 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                                qj2Var3.f18334O = lj2VarM8570o112;
                                                ((km2) lj2VarM8570o112).m7515a(ch2Var);
                                                rj2Var3 = rj2Var4;
                                                SparseArray<qj2> sparseArray112 = rj2Var3.f18888e;
                                                qj2 qj2Var115 = rj2Var3.f18905v;
                                                sparseArray112.put(qj2Var115.f18337b, qj2Var115);
                                            } else {
                                                int i47 = qj2Var3.f18327H;
                                                StringBuilder sb2 = new StringBuilder(75);
                                                sb2.append("Unsupported PCM bit depth: ");
                                                sb2.append(i47);
                                                sb2.append(". Setting mimeType to audio/x-unknown");
                                                Log.w("MatroskaExtractor", sb2.toString());
                                            }
                                        } else {
                                            Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                        }
                                        str3 = "audio/x-unknown";
                                        listSingletonList = null;
                                        i9 = -1;
                                        list2 = listSingletonList;
                                        str4 = str3;
                                        i8 = i9;
                                        i7 = -1;
                                        boolean z115 = qj2Var3.f18332M;
                                        if (true != qj2Var3.f18331L) {
                                            i10 = 0;
                                        } else {
                                            i10 = 2;
                                        }
                                        i11 = (z115 ? 1 : 0) | i10;
                                        if (C2622l.m5406n1(str4)) {
                                            ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                            i12 = 1;
                                        } else if (C2622l.m5329X1(str4)) {
                                            if (qj2Var3.f18349n == 0) {
                                                i16 = qj2Var3.f18347l;
                                                i13 = -1;
                                                if (i16 == -1) {
                                                    i16 = qj2Var3.f18345j;
                                                }
                                                qj2Var3.f18347l = i16;
                                                i17 = qj2Var3.f18348m;
                                                if (i17 == -1) {
                                                    i17 = qj2Var3.f18346k;
                                                }
                                                qj2Var3.f18348m = i17;
                                            } else {
                                                i13 = -1;
                                            }
                                            i14 = qj2Var3.f18347l;
                                            if (i14 != i13) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (qj2Var3.f18352q) {
                                                if (qj2Var3.f18358w != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                            } else {
                                                mo2Var = null;
                                            }
                                            ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                            i12 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                                ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str4)) {
                                                }
                                                ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                            }
                                            i12 = 3;
                                        }
                                        lj2 lj2VarM8570o113 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                        qj2Var3.f18334O = lj2VarM8570o113;
                                        ((km2) lj2VarM8570o113).m7515a(ch2Var);
                                        rj2Var3 = rj2Var4;
                                        SparseArray<qj2> sparseArray113 = rj2Var3.f18888e;
                                        qj2 qj2Var116 = rj2Var3.f18905v;
                                        sparseArray113.put(qj2Var116.f18337b, qj2Var116);
                                        break;
                                    }
                                    z2 = true;
                                    if (z2) {
                                        iM7376h = jo2.m7376h(qj2Var3.f18327H);
                                        if (iM7376h != 0) {
                                            str3 = "audio/raw";
                                            i9 = iM7376h;
                                            listSingletonList = null;
                                            list2 = listSingletonList;
                                            str4 = str3;
                                            i8 = i9;
                                            i7 = -1;
                                            boolean z116 = qj2Var3.f18332M;
                                            if (true != qj2Var3.f18331L) {
                                                i10 = 0;
                                            } else {
                                                i10 = 2;
                                            }
                                            i11 = (z116 ? 1 : 0) | i10;
                                            if (C2622l.m5406n1(str4)) {
                                                ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                                i12 = 1;
                                            } else if (C2622l.m5329X1(str4)) {
                                                if (qj2Var3.f18349n == 0) {
                                                    i16 = qj2Var3.f18347l;
                                                    i13 = -1;
                                                    if (i16 == -1) {
                                                        i16 = qj2Var3.f18345j;
                                                    }
                                                    qj2Var3.f18347l = i16;
                                                    i17 = qj2Var3.f18348m;
                                                    if (i17 == -1) {
                                                        i17 = qj2Var3.f18346k;
                                                    }
                                                    qj2Var3.f18348m = i17;
                                                } else {
                                                    i13 = -1;
                                                }
                                                i14 = qj2Var3.f18347l;
                                                if (i14 != i13) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (qj2Var3.f18352q) {
                                                    if (qj2Var3.f18358w != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                                } else {
                                                    mo2Var = null;
                                                }
                                                ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                                i12 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str4)) {
                                                    ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str4)) {
                                                    }
                                                    ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                                }
                                                i12 = 3;
                                            }
                                            lj2 lj2VarM8570o114 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                            qj2Var3.f18334O = lj2VarM8570o114;
                                            ((km2) lj2VarM8570o114).m7515a(ch2Var);
                                            rj2Var3 = rj2Var4;
                                            SparseArray<qj2> sparseArray114 = rj2Var3.f18888e;
                                            qj2 qj2Var117 = rj2Var3.f18905v;
                                            sparseArray114.put(qj2Var117.f18337b, qj2Var117);
                                        } else {
                                            int i48 = qj2Var3.f18327H;
                                            StringBuilder sb3 = new StringBuilder(75);
                                            sb3.append("Unsupported PCM bit depth: ");
                                            sb3.append(i48);
                                            sb3.append(". Setting mimeType to audio/x-unknown");
                                            Log.w("MatroskaExtractor", sb3.toString());
                                        }
                                    } else {
                                        Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                    }
                                    str3 = "audio/x-unknown";
                                    listSingletonList = null;
                                    i9 = -1;
                                    list2 = listSingletonList;
                                    str4 = str3;
                                    i8 = i9;
                                    i7 = -1;
                                    boolean z117 = qj2Var3.f18332M;
                                    if (true != qj2Var3.f18331L) {
                                        i10 = 0;
                                    } else {
                                        i10 = 2;
                                    }
                                    i11 = (z117 ? 1 : 0) | i10;
                                    if (C2622l.m5406n1(str4)) {
                                        ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                        i12 = 1;
                                    } else if (C2622l.m5329X1(str4)) {
                                        if (qj2Var3.f18349n == 0) {
                                            i16 = qj2Var3.f18347l;
                                            i13 = -1;
                                            if (i16 == -1) {
                                                i16 = qj2Var3.f18345j;
                                            }
                                            qj2Var3.f18347l = i16;
                                            i17 = qj2Var3.f18348m;
                                            if (i17 == -1) {
                                                i17 = qj2Var3.f18346k;
                                            }
                                            qj2Var3.f18348m = i17;
                                        } else {
                                            i13 = -1;
                                        }
                                        i14 = qj2Var3.f18347l;
                                        if (i14 != i13) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (qj2Var3.f18352q) {
                                            if (qj2Var3.f18358w != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                        } else {
                                            mo2Var = null;
                                        }
                                        ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                        i12 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str4)) {
                                            ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str4)) {
                                            }
                                            ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                        }
                                        i12 = 3;
                                    }
                                    lj2 lj2VarM8570o115 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                    qj2Var3.f18334O = lj2VarM8570o115;
                                    ((km2) lj2VarM8570o115).m7515a(ch2Var);
                                    rj2Var3 = rj2Var4;
                                    SparseArray<qj2> sparseArray115 = rj2Var3.f18888e;
                                    qj2 qj2Var118 = rj2Var3.f18905v;
                                    sparseArray115.put(qj2Var118.f18337b, qj2Var118);
                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                    throw new fh2("Error parsing MS/ACM codec private");
                                }
                                break;
                            case 23:
                                dj2Var2 = dj2Var2;
                                iM7376h = jo2.m7376h(qj2Var3.f18327H);
                                if (iM7376h == 0) {
                                    int i49 = qj2Var3.f18327H;
                                    StringBuilder sb4 = new StringBuilder(75);
                                    sb4.append("Unsupported PCM bit depth: ");
                                    sb4.append(i49);
                                    sb4.append(". Setting mimeType to audio/x-unknown");
                                    Log.w("MatroskaExtractor", sb4.toString());
                                    str3 = "audio/x-unknown";
                                    listSingletonList = null;
                                    i9 = -1;
                                    list2 = listSingletonList;
                                    str4 = str3;
                                    i8 = i9;
                                    i7 = -1;
                                    boolean z118 = qj2Var3.f18332M;
                                    if (true != qj2Var3.f18331L) {
                                        i10 = 0;
                                    } else {
                                        i10 = 2;
                                    }
                                    i11 = (z118 ? 1 : 0) | i10;
                                    if (C2622l.m5406n1(str4)) {
                                        ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                        i12 = 1;
                                    } else if (C2622l.m5329X1(str4)) {
                                        if (qj2Var3.f18349n == 0) {
                                            i16 = qj2Var3.f18347l;
                                            i13 = -1;
                                            if (i16 == -1) {
                                                i16 = qj2Var3.f18345j;
                                            }
                                            qj2Var3.f18347l = i16;
                                            i17 = qj2Var3.f18348m;
                                            if (i17 == -1) {
                                                i17 = qj2Var3.f18346k;
                                            }
                                            qj2Var3.f18348m = i17;
                                        } else {
                                            i13 = -1;
                                        }
                                        i14 = qj2Var3.f18347l;
                                        if (i14 != i13) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (qj2Var3.f18352q) {
                                            if (qj2Var3.f18358w != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                        } else {
                                            mo2Var = null;
                                        }
                                        ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                        i12 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str4)) {
                                            ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str4)) {
                                            }
                                            ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                        }
                                        i12 = 3;
                                    }
                                    lj2 lj2VarM8570o116 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                    qj2Var3.f18334O = lj2VarM8570o116;
                                    ((km2) lj2VarM8570o116).m7515a(ch2Var);
                                    rj2Var3 = rj2Var4;
                                    SparseArray<qj2> sparseArray116 = rj2Var3.f18888e;
                                    qj2 qj2Var119 = rj2Var3.f18905v;
                                    sparseArray116.put(qj2Var119.f18337b, qj2Var119);
                                } else {
                                    str3 = "audio/raw";
                                    i9 = iM7376h;
                                    listSingletonList = null;
                                    list2 = listSingletonList;
                                    str4 = str3;
                                    i8 = i9;
                                    i7 = -1;
                                    boolean z119 = qj2Var3.f18332M;
                                    if (true != qj2Var3.f18331L) {
                                        i10 = 0;
                                    } else {
                                        i10 = 2;
                                    }
                                    i11 = (z119 ? 1 : 0) | i10;
                                    if (C2622l.m5406n1(str4)) {
                                        ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                        i12 = 1;
                                    } else if (C2622l.m5329X1(str4)) {
                                        if (qj2Var3.f18349n == 0) {
                                            i16 = qj2Var3.f18347l;
                                            i13 = -1;
                                            if (i16 == -1) {
                                                i16 = qj2Var3.f18345j;
                                            }
                                            qj2Var3.f18347l = i16;
                                            i17 = qj2Var3.f18348m;
                                            if (i17 == -1) {
                                                i17 = qj2Var3.f18346k;
                                            }
                                            qj2Var3.f18348m = i17;
                                        } else {
                                            i13 = -1;
                                        }
                                        i14 = qj2Var3.f18347l;
                                        if (i14 != i13) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (qj2Var3.f18352q) {
                                            if (qj2Var3.f18358w != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                        } else {
                                            mo2Var = null;
                                        }
                                        ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                        i12 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str4)) {
                                            ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str4)) {
                                            }
                                            ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                        }
                                        i12 = 3;
                                    }
                                    lj2 lj2VarM8570o117 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                    qj2Var3.f18334O = lj2VarM8570o117;
                                    ((km2) lj2VarM8570o117).m7515a(ch2Var);
                                    rj2Var3 = rj2Var4;
                                    SparseArray<qj2> sparseArray117 = rj2Var3.f18888e;
                                    qj2 qj2Var1110 = rj2Var3.f18905v;
                                    sparseArray117.put(qj2Var1110.f18337b, qj2Var1110);
                                }
                                break;
                            case 24:
                                str5 = "application/x-subrip";
                                str7 = str5;
                                str3 = str7;
                                listSingletonList = null;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z1110 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z1110 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o118 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o118;
                                ((km2) lj2VarM8570o118).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray118 = rj2Var3.f18888e;
                                qj2 qj2Var1111 = rj2Var3.f18905v;
                                sparseArray118.put(qj2Var1111.f18337b, qj2Var1111);
                                break;
                            case 25:
                                dj2Var2 = dj2Var2;
                                listSingletonList = Collections.singletonList(qj2Var3.f18343h);
                                str3 = "application/vobsub";
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z1111 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z1111 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o119 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o119;
                                ((km2) lj2VarM8570o119).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray119 = rj2Var3.f18888e;
                                qj2 qj2Var1112 = rj2Var3.f18905v;
                                sparseArray119.put(qj2Var1112.f18337b, qj2Var1112);
                                break;
                            case 26:
                                str5 = "application/pgs";
                                str7 = str5;
                                str3 = str7;
                                listSingletonList = null;
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z1112 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z1112 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o1110 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o1110;
                                ((km2) lj2VarM8570o1110).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray1110 = rj2Var3.f18888e;
                                qj2 qj2Var1113 = rj2Var3.f18905v;
                                sparseArray1110.put(qj2Var1113.f18337b, qj2Var1113);
                                break;
                            case 27:
                                byte[] bArr8 = qj2Var3.f18343h;
                                dj2Var2 = dj2Var2;
                                listSingletonList = Collections.singletonList(new byte[]{bArr8[0], bArr8[1], bArr8[2], bArr8[3]});
                                str3 = "application/dvbsubs";
                                i9 = -1;
                                list2 = listSingletonList;
                                str4 = str3;
                                i8 = i9;
                                i7 = -1;
                                boolean z1113 = qj2Var3.f18332M;
                                if (true != qj2Var3.f18331L) {
                                    i10 = 0;
                                } else {
                                    i10 = 2;
                                }
                                i11 = (z1113 ? 1 : 0) | i10;
                                if (C2622l.m5406n1(str4)) {
                                    ch2Var = ch2.m6183c(Integer.toString(i25), str4, null, i7, qj2Var3.f18326G, qj2Var3.f18328I, i8, list2, qj2Var3.f18344i, i11, qj2Var3.f18333N);
                                    i12 = 1;
                                } else if (C2622l.m5329X1(str4)) {
                                    if (qj2Var3.f18349n == 0) {
                                        i16 = qj2Var3.f18347l;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = qj2Var3.f18345j;
                                        }
                                        qj2Var3.f18347l = i16;
                                        i17 = qj2Var3.f18348m;
                                        if (i17 == -1) {
                                            i17 = qj2Var3.f18346k;
                                        }
                                        qj2Var3.f18348m = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = qj2Var3.f18347l;
                                    if (i14 != i13) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (qj2Var3.f18352q) {
                                        if (qj2Var3.f18358w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        mo2Var = new mo2(qj2Var3.f18353r, qj2Var3.f18355t, qj2Var3.f18354s, bArr);
                                    } else {
                                        mo2Var = null;
                                    }
                                    ch2Var = ch2.m6181a(Integer.toString(i25), str4, null, i7, qj2Var3.f18345j, qj2Var3.f18346k, list2, -1, f, qj2Var3.f18350o, qj2Var3.f18351p, mo2Var, qj2Var3.f18344i);
                                    i12 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        ch2Var = ch2.m6184d(Integer.toString(i25), str4, null, i11, qj2Var3.f18333N, qj2Var3.f18344i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        ch2Var = new ch2(Integer.toString(i25), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, qj2Var3.f18333N, -1, Long.MAX_VALUE, list2, qj2Var3.f18344i, null);
                                    }
                                    i12 = 3;
                                }
                                lj2 lj2VarM8570o1111 = ((vl2) dj2Var2).m8570o(qj2Var3.f18337b, i12);
                                qj2Var3.f18334O = lj2VarM8570o1111;
                                ((km2) lj2VarM8570o1111).m7515a(ch2Var);
                                rj2Var3 = rj2Var4;
                                SparseArray<qj2> sparseArray1111 = rj2Var3.f18888e;
                                qj2 qj2Var1114 = rj2Var3.f18905v;
                                sparseArray1111.put(qj2Var1114.f18337b, qj2Var1114);
                                break;
                            default:
                                throw new fh2("Unrecognized codec identifier.");
                        }
                    } else {
                        rj2Var3 = rj2Var4;
                    }
                    rj2Var3.f18905v = null;
                    return true;
                }
                nj2Var = nj2Var2;
                z = true;
                r2 = 0;
                c2 = 5;
            }
            int i50 = nj2Var.f17131d;
            if (i50 == 0) {
                int i51 = 4;
                long jM8419c = nj2Var.f17130c.m8419c(bj2Var, z, r2, 4);
                if (jM8419c == -2) {
                    bj2Var.f12712f = r2;
                    while (true) {
                        bj2Var.m6023c(nj2Var.f17128a, r2, i51);
                        int iM8417a = tj2.m8417a(nj2Var.f17128a[r2]);
                        if (iM8417a != -1 && iM8417a <= i51) {
                            int iM8418b = (int) tj2.m8418b(nj2Var.f17128a, iM8417a, r2);
                            rj2 rj2Var5 = nj2Var.f17134g.f17998a;
                            if (rj2.m8281i(iM8418b)) {
                                bj2Var.m6022b(iM8417a, r2);
                                jM8419c = iM8418b;
                            }
                        }
                        bj2Var.m6022b(1, r2);
                        i51 = 4;
                    }
                }
                z = true;
                if (jM8419c == -1) {
                    return r2;
                }
                nj2Var.f17132e = (int) jM8419c;
                nj2Var.f17131d = 1;
            } else {
                if (i50 == z) {
                }
                pj2Var = nj2Var.f17134g;
                i = nj2Var.f17132e;
                rj2Var = pj2Var.f17998a;
                switch (i) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 241:
                    case 251:
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
                    case 22186:
                    case 22203:
                    case 25188:
                    case 2352003:
                    case 2807729:
                        c2 = 2;
                        break;
                    case 134:
                    case 17026:
                    case 2274716:
                        c2 = 3;
                        break;
                    case 160:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        c2 = 1;
                        break;
                    case 161:
                    case 163:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        c2 = 4;
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
                        break;
                    default:
                        c2 = 0;
                        break;
                }
                if (c2 != 0) {
                    if (c2 != 1) {
                        if (c2 != 2) {
                            j5 = nj2Var.f17133f;
                            if (j5 <= 8) {
                                pj2Var.f17998a.m8283a(i, nj2Var.m7867b(bj2Var, (int) j5));
                                nj2Var.f17131d = 0;
                                return true;
                            }
                            StringBuilder sb5 = new StringBuilder(42);
                            sb5.append("Invalid integer size: ");
                            sb5.append(j5);
                            throw new fh2(sb5.toString());
                        }
                        if (c2 == 3) {
                            j6 = nj2Var.f17133f;
                            if (j6 <= 2147483647L) {
                                StringBuilder sb6 = new StringBuilder(41);
                                sb6.append("String element size: ");
                                sb6.append(j6);
                                throw new fh2(sb6.toString());
                            }
                            i4 = (int) j6;
                            if (i4 == 0) {
                                str = "";
                            } else {
                                byte[] bArr9 = new byte[i4];
                                bj2Var.m6021a(bArr9, 0, i4, false);
                                str = new String(bArr9);
                            }
                            pj2Var.f17998a.m8285g(i, str);
                            nj2Var.f17131d = 0;
                            return true;
                        }
                        if (c2 != 4) {
                            rj2Var.m8286h(i, (int) nj2Var.f17133f, bj2Var);
                            nj2Var.f17131d = 0;
                            return true;
                        }
                        j7 = nj2Var.f17133f;
                        if (j7 == 4 && j7 != 8) {
                            StringBuilder sb7 = new StringBuilder(40);
                            sb7.append("Invalid float size: ");
                            sb7.append(j7);
                            throw new fh2(sb7.toString());
                        }
                        i5 = (int) j7;
                        jM7867b = nj2Var.m7867b(bj2Var, i5);
                        if (i5 == 4) {
                            dLongBitsToDouble = Float.intBitsToFloat((int) jM7867b);
                        } else {
                            dLongBitsToDouble = Double.longBitsToDouble(jM7867b);
                        }
                        pj2Var.f17998a.m8284e(i, dLongBitsToDouble);
                        nj2Var.f17131d = 0;
                        return true;
                    }
                    j2 = bj2Var.f12710d;
                    nj2Var.f17129b.add(new mj2(i, nj2Var.f17133f + j2));
                    pj2 pj2Var3 = nj2Var.f17134g;
                    i2 = nj2Var.f17132e;
                    j3 = nj2Var.f17133f;
                    rj2Var2 = pj2Var3.f17998a;
                    Objects.requireNonNull(rj2Var2);
                    if (i2 != 160) {
                        i3 = 0;
                        rj2Var2.f18884Z = false;
                    } else if (i2 != 174) {
                        i3 = 0;
                        rj2Var2.f18905v = new qj2(null);
                    } else if (i2 != 187) {
                        if (i2 != 19899) {
                            rj2Var2.f18907x = -1;
                            rj2Var2.f18908y = -1L;
                        } else if (i2 != 20533) {
                            rj2Var2.f18905v.f18340e = true;
                        } else if (i2 != 21968) {
                            rj2Var2.f18905v.f18352q = true;
                        } else if (i2 != 408125543) {
                            j4 = rj2Var2.f18901r;
                            if (j4 == -1 && j4 != j2) {
                                throw new fh2("Multiple Segment elements not supported");
                            }
                            rj2Var2.f18901r = j2;
                            rj2Var2.f18900q = j3;
                        } else if (i2 != 475249515) {
                            rj2Var2.f18862D = new yn2(32);
                            rj2Var2.f18863E = new yn2(32);
                        } else if (i2 == 524531317 && !rj2Var2.f18906w) {
                            if (rj2Var2.f18889f || rj2Var2.f18859A == -1) {
                                vl2 vl2Var2 = (vl2) rj2Var2.f18885a0;
                                vl2Var2.f20855u = new ij2(rj2Var2.f18904u);
                                vl2Var2.f20852r.post(vl2Var2.f20850p);
                                rj2Var2.f18906w = true;
                            } else {
                                rj2Var2.f18909z = true;
                            }
                        }
                        i3 = 0;
                    } else {
                        i3 = 0;
                        rj2Var2.f18864F = false;
                    }
                    nj2Var.f17131d = i3;
                    return true;
                }
                bj2Var.m6022b((int) nj2Var.f17133f, false);
                nj2Var.f17131d = 0;
                nj2Var2 = nj2Var;
            }
            nj2Var.f17133f = nj2Var.f17130c.m8419c(bj2Var, r2, z, 8);
            nj2Var.f17131d = 2;
            pj2Var = nj2Var.f17134g;
            i = nj2Var.f17132e;
            rj2Var = pj2Var.f17998a;
            switch (i) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 241:
                case 251:
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
                case 22186:
                case 22203:
                case 25188:
                case 2352003:
                case 2807729:
                    c2 = 2;
                    break;
                case 134:
                case 17026:
                case 2274716:
                    c2 = 3;
                    break;
                case 160:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    c2 = 1;
                    break;
                case 161:
                case 163:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    c2 = 4;
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
                    break;
                default:
                    c2 = 0;
                    break;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 2) {
                        j5 = nj2Var.f17133f;
                        if (j5 <= 8) {
                            pj2Var.f17998a.m8283a(i, nj2Var.m7867b(bj2Var, (int) j5));
                            nj2Var.f17131d = 0;
                            return true;
                        }
                        StringBuilder sb8 = new StringBuilder(42);
                        sb8.append("Invalid integer size: ");
                        sb8.append(j5);
                        throw new fh2(sb8.toString());
                    }
                    if (c2 == 3) {
                        if (c2 != 4) {
                            rj2Var.m8286h(i, (int) nj2Var.f17133f, bj2Var);
                            nj2Var.f17131d = 0;
                            return true;
                        }
                        j7 = nj2Var.f17133f;
                        if (j7 == 4) {
                        }
                        i5 = (int) j7;
                        jM7867b = nj2Var.m7867b(bj2Var, i5);
                        if (i5 == 4) {
                            dLongBitsToDouble = Float.intBitsToFloat((int) jM7867b);
                        } else {
                            dLongBitsToDouble = Double.longBitsToDouble(jM7867b);
                        }
                        pj2Var.f17998a.m8284e(i, dLongBitsToDouble);
                        nj2Var.f17131d = 0;
                        return true;
                    }
                    j6 = nj2Var.f17133f;
                    if (j6 <= 2147483647L) {
                        StringBuilder sb9 = new StringBuilder(41);
                        sb9.append("String element size: ");
                        sb9.append(j6);
                        throw new fh2(sb9.toString());
                    }
                    i4 = (int) j6;
                    if (i4 == 0) {
                        str = "";
                    } else {
                        byte[] bArr10 = new byte[i4];
                        bj2Var.m6021a(bArr10, 0, i4, false);
                        str = new String(bArr10);
                    }
                    pj2Var.f17998a.m8285g(i, str);
                    nj2Var.f17131d = 0;
                    return true;
                }
                j2 = bj2Var.f12710d;
                nj2Var.f17129b.add(new mj2(i, nj2Var.f17133f + j2));
                pj2 pj2Var4 = nj2Var.f17134g;
                i2 = nj2Var.f17132e;
                j3 = nj2Var.f17133f;
                rj2Var2 = pj2Var4.f17998a;
                Objects.requireNonNull(rj2Var2);
                if (i2 != 160) {
                    i3 = 0;
                    rj2Var2.f18884Z = false;
                } else if (i2 != 174) {
                    i3 = 0;
                    rj2Var2.f18905v = new qj2(null);
                } else if (i2 != 187) {
                    if (i2 != 19899) {
                        rj2Var2.f18907x = -1;
                        rj2Var2.f18908y = -1L;
                    } else if (i2 != 20533) {
                        rj2Var2.f18905v.f18340e = true;
                    } else if (i2 != 21968) {
                        rj2Var2.f18905v.f18352q = true;
                    } else if (i2 != 408125543) {
                        j4 = rj2Var2.f18901r;
                        if (j4 == -1) {
                        }
                        rj2Var2.f18901r = j2;
                        rj2Var2.f18900q = j3;
                    } else if (i2 != 475249515) {
                        rj2Var2.f18862D = new yn2(32);
                        rj2Var2.f18863E = new yn2(32);
                    } else if (i2 == 524531317) {
                        if (rj2Var2.f18889f) {
                            vl2 vl2Var3 = (vl2) rj2Var2.f18885a0;
                            vl2Var3.f20855u = new ij2(rj2Var2.f18904u);
                            vl2Var3.f20852r.post(vl2Var3.f20850p);
                            rj2Var2.f18906w = true;
                        } else {
                            vl2 vl2Var4 = (vl2) rj2Var2.f18885a0;
                            vl2Var4.f20855u = new ij2(rj2Var2.f18904u);
                            vl2Var4.f20852r.post(vl2Var4.f20850p);
                            rj2Var2.f18906w = true;
                        }
                    }
                    i3 = 0;
                } else {
                    i3 = 0;
                    rj2Var2.f18864F = false;
                }
                nj2Var.f17131d = i3;
                return true;
            }
            bj2Var.m6022b((int) nj2Var.f17133f, false);
            nj2Var.f17131d = 0;
            nj2Var2 = nj2Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m7867b(bj2 bj2Var, int i) throws InterruptedException, IOException {
        bj2Var.m6021a(this.f17128a, 0, i, false);
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j2 = (j2 << 8) | ((long) (this.f17128a[i2] & 255));
        }
        return j2;
    }
}
