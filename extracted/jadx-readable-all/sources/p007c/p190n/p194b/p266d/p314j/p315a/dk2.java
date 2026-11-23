package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dk2 {

    /* JADX INFO: renamed from: a */
    public static final int f13294a = jo2.m7375g("vide");

    /* JADX INFO: renamed from: b */
    public static final int f13295b = jo2.m7375g("soun");

    /* JADX INFO: renamed from: c */
    public static final int f13296c = jo2.m7375g("text");

    /* JADX INFO: renamed from: d */
    public static final int f13297d = jo2.m7375g("sbtl");

    /* JADX INFO: renamed from: e */
    public static final int f13298e = jo2.m7375g("subt");

    /* JADX INFO: renamed from: f */
    public static final int f13299f = jo2.m7375g("clcp");

    /* JADX INFO: renamed from: g */
    public static final int f13300g = jo2.m7375g("cenc");

    /* JADX INFO: renamed from: h */
    public static final int f13301h = jo2.m7375g("meta");

    /* JADX WARN: Code duplicated, block: B:292:0x053c A[PHI: r8
  0x053c: PHI (r8v49 int) = (r8v46 int), (r8v45 int) binds: [B:290:0x0534, B:288:0x0528] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00df  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0 A[DONT_INVERT, PHI: r11 r14 r15
  0x00e0: PHI (r11v5 int) = (r11v4 int), (r11v6 int), (r11v7 int) binds: [B:56:0x00ce, B:63:0x00df, B:62:0x00da] A[DONT_GENERATE, DONT_INLINE]
  0x00e0: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:56:0x00ce, B:63:0x00df, B:62:0x00da] A[DONT_GENERATE, DONT_INLINE]
  0x00e0: PHI (r15v4 int) = (r15v3 int), (r15v3 int), (r15v5 int) binds: [B:56:0x00ce, B:63:0x00df, B:62:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    /* JADX INFO: renamed from: a */
    public static nk2 m6369a(uj2 uj2Var, vj2 vj2Var, long j2, yi2 yi2Var, boolean z) throws fh2 {
        int i;
        long jM6394k;
        int i2;
        nk2 nk2Var;
        Pair pairCreate;
        vj2 vj2VarM8509b;
        int i3;
        int i4;
        int i5;
        String str;
        List<byte[]> list;
        String str2;
        int iM6393j;
        int iIntValue;
        int iIntValue2;
        String str3;
        int i6;
        String str4;
        String str5;
        long j3;
        List listSingletonList;
        uj2 uj2VarM8510c = uj2Var.m8510c(wj2.f21149E);
        do2 do2Var = uj2VarM8510c.m8509b(wj2.f21173S).f20809P0;
        do2Var.m6389f(16);
        int iM6395l = do2Var.m6395l();
        if (iM6395l == f13295b) {
            i = 1;
        } else if (iM6395l == f13294a) {
            i = 2;
        } else if (iM6395l == f13296c || iM6395l == f13297d || iM6395l == f13298e || iM6395l == f13299f) {
            i = 3;
        } else {
            i = iM6395l == f13301h ? 4 : -1;
        }
        if (i == -1) {
            return null;
        }
        do2 do2Var2 = uj2Var.m8509b(wj2.f21169O).f20809P0;
        do2Var2.m6389f(8);
        int iM6395l2 = (do2Var2.m6395l() >> 24) & 255;
        do2Var2.m6390g(iM6395l2 == 0 ? 8 : 16);
        int iM6395l3 = do2Var2.m6395l();
        do2Var2.m6390g(4);
        int i7 = do2Var2.f13341b;
        int i8 = iM6395l2 == 0 ? 4 : 8;
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                do2Var2.m6390g(i8);
            } else {
                if (do2Var2.f13340a[i7 + i9] != -1) {
                    jM6394k = iM6395l2 == 0 ? do2Var2.m6394k() : do2Var2.m6398o();
                    if (jM6394k != 0) {
                        break;
                    }
                    break;
                }
                i9++;
            }
            jM6394k = -9223372036854775807L;
            break;
        }
        do2Var2.m6390g(16);
        int iM6395l4 = do2Var2.m6395l();
        int iM6395l5 = do2Var2.m6395l();
        do2Var2.m6390g(4);
        int iM6395l6 = do2Var2.m6395l();
        int iM6395l7 = do2Var2.m6395l();
        int i10 = 65536;
        if (iM6395l4 == 0) {
            if (iM6395l5 != 65536) {
                iM6395l4 = 0;
            } else if (iM6395l6 != -65536) {
                iM6395l4 = 0;
                iM6395l5 = 65536;
            } else if (iM6395l7 == 0) {
                i2 = 90;
            } else {
                iM6395l4 = 0;
                iM6395l5 = 65536;
                iM6395l6 = -65536;
            }
            if (iM6395l4 != 0) {
                if (iM6395l5 == -65536) {
                    if (iM6395l6 == 65536) {
                        i10 = iM6395l6;
                    } else if (iM6395l7 == 0) {
                        i2 = 270;
                    }
                    iM6395l6 = i10;
                    iM6395l4 = 0;
                    iM6395l5 = -65536;
                } else {
                    iM6395l4 = 0;
                }
                if (iM6395l4 != -65536) {
                    i2 = 0;
                } else {
                    i2 = 0;
                }
            } else if (iM6395l4 != -65536) {
                i2 = 0;
            } else {
                i2 = 0;
            }
        } else if (iM6395l4 != 0) {
            if (iM6395l5 == -65536) {
                if (iM6395l6 == 65536) {
                    i10 = iM6395l6;
                } else if (iM6395l7 == 0) {
                    i2 = 270;
                }
                iM6395l6 = i10;
                iM6395l4 = 0;
                iM6395l5 = -65536;
            } else {
                iM6395l4 = 0;
            }
            if (iM6395l4 != -65536) {
                i2 = 0;
            } else {
                i2 = 0;
            }
        } else if (iM6395l4 != -65536 && iM6395l5 == 0 && iM6395l6 == 0 && iM6395l7 == -65536) {
            i2 = 180;
        } else {
            i2 = 0;
        }
        ck2 ck2Var = new ck2(iM6395l3, jM6394k, i2);
        long j4 = j2 == -9223372036854775807L ? ck2Var.f13044b : j2;
        do2 do2Var3 = vj2Var.f20809P0;
        do2Var3.m6389f(8);
        do2Var3.m6390g(((do2Var3.m6395l() >> 24) & 255) == 0 ? 8 : 16);
        long jM6394k2 = do2Var3.m6394k();
        long jM7373e = j4 != -9223372036854775807L ? jo2.m7373e(j4, 1000000L, jM6394k2) : -9223372036854775807L;
        uj2 uj2VarM8510c2 = uj2VarM8510c.m8510c(wj2.f21151F).m8510c(wj2.f21153G);
        do2 do2Var4 = uj2VarM8510c.m8509b(wj2.f21172R).f20809P0;
        do2Var4.m6389f(8);
        int iM6395l8 = (do2Var4.m6395l() >> 24) & 255;
        do2Var4.m6390g(iM6395l8 == 0 ? 8 : 16);
        long jM6394k3 = do2Var4.m6394k();
        do2Var4.m6390g(iM6395l8 == 0 ? 4 : 8);
        int iM6393j2 = do2Var4.m6393j();
        StringBuilder sb = new StringBuilder(3);
        sb.append((char) (((iM6393j2 >> 10) & 31) + 96));
        sb.append((char) (((iM6393j2 >> 5) & 31) + 96));
        sb.append((char) ((iM6393j2 & 31) + 96));
        Pair pairCreate2 = Pair.create(Long.valueOf(jM6394k3), sb.toString());
        do2 do2Var5 = uj2VarM8510c2.m8509b(wj2.f21174T).f20809P0;
        int i11 = ck2Var.f13043a;
        int i12 = ck2Var.f13045c;
        String str6 = (String) pairCreate2.second;
        do2Var5.m6389f(12);
        int iM6395l9 = do2Var5.m6395l();
        zj2 zj2Var = new zj2(iM6395l9);
        int i13 = 0;
        while (i13 < iM6395l9) {
            int i14 = do2Var5.f13341b;
            int iM6395l10 = do2Var5.m6395l();
            int i15 = iM6395l9;
            String str7 = "childAtomSize should be positive";
            C2622l.m5321V1(iM6395l10 > 0, "childAtomSize should be positive");
            int iM6395l11 = do2Var5.m6395l();
            long j5 = jM6394k2;
            if (iM6395l11 == wj2.f21183b || iM6395l11 == wj2.f21185c || iM6395l11 == wj2.f21180Z || iM6395l11 == wj2.f21202k0 || iM6395l11 == wj2.f21187d || iM6395l11 == wj2.f21189e || iM6395l11 == wj2.f21191f || iM6395l11 == wj2.f21160J0 || iM6395l11 == wj2.f21162K0) {
                pairCreate2 = pairCreate2;
                int i16 = i13;
                ck2Var = ck2Var;
                i12 = i12;
                i3 = i;
                Object obj = "childAtomSize should be positive";
                do2Var5.m6389f(i14 + 16);
                do2Var5.m6390g(16);
                int iM6393j3 = do2Var5.m6393j();
                int iM6393j4 = do2Var5.m6393j();
                do2Var5.m6390g(50);
                int i17 = do2Var5.f13341b;
                if (iM6395l11 == wj2.f21180Z) {
                    i4 = i16;
                    i5 = iM6395l10;
                    iM6395l11 = m6371c(do2Var5, i14, i5, zj2Var, i4);
                    do2Var5.m6389f(i17);
                } else {
                    i4 = i16;
                    i5 = iM6395l10;
                }
                boolean z2 = false;
                String str8 = null;
                List<byte[]> listSingletonList2 = null;
                float fM6397n = 1.0f;
                byte[] bArrCopyOfRange = null;
                int i18 = -1;
                while (i17 - i14 < i5) {
                    do2Var5.m6389f(i17);
                    int i19 = do2Var5.f13341b;
                    int iM6395l12 = do2Var5.m6395l();
                    if (iM6395l12 == 0) {
                        if (do2Var5.f13341b - i14 == i5) {
                            break;
                        }
                        iM6395l12 = 0;
                    }
                    Object obj2 = obj;
                    C2622l.m5321V1(iM6395l12 > 0, obj2);
                    int iM6395l13 = do2Var5.m6395l();
                    if (iM6395l13 == wj2.f21155H) {
                        C2622l.m5322V2(str8 == null);
                        do2Var5.m6389f(i19 + 8);
                        ko2 ko2VarM7534a = ko2.m7534a(do2Var5);
                        list = ko2VarM7534a.f16005a;
                        zj2Var.f22308c = ko2VarM7534a.f16006b;
                        if (!z2) {
                            fM6397n = ko2VarM7534a.f16007c;
                        }
                        str2 = "video/avc";
                    } else {
                        if (iM6395l13 != wj2.f21157I) {
                            if (iM6395l13 != wj2.f21164L0) {
                                if (iM6395l13 != wj2.f21193g) {
                                    if (iM6395l13 != wj2.f21159J) {
                                        if (iM6395l13 == wj2.f21198i0) {
                                            do2Var5.m6389f(i19 + 8);
                                            fM6397n = do2Var5.m6397n() / do2Var5.m6397n();
                                            obj = obj2;
                                            z2 = true;
                                        } else if (iM6395l13 == wj2.f21156H0) {
                                            int i20 = i19 + 8;
                                            while (true) {
                                                if (i20 - i19 >= iM6395l12) {
                                                    obj = obj2;
                                                    bArrCopyOfRange = null;
                                                    break;
                                                }
                                                do2Var5.m6389f(i20);
                                                int iM6395l14 = do2Var5.m6395l();
                                                obj = obj2;
                                                if (do2Var5.m6395l() == wj2.f21158I0) {
                                                    bArrCopyOfRange = Arrays.copyOfRange(do2Var5.f13340a, i20, iM6395l14 + i20);
                                                } else {
                                                    i20 += iM6395l14;
                                                    obj2 = obj;
                                                }
                                            }
                                        } else {
                                            obj = obj2;
                                            if (iM6395l13 == wj2.f21154G0) {
                                                int iM6392i = do2Var5.m6392i();
                                                do2Var5.m6390g(3);
                                                if (iM6392i == 0) {
                                                    int iM6392i2 = do2Var5.m6392i();
                                                    if (iM6392i2 == 0) {
                                                        i18 = 0;
                                                    } else if (iM6392i2 == 1) {
                                                        i18 = 1;
                                                    } else if (iM6392i2 == 2) {
                                                        i18 = 2;
                                                    } else if (iM6392i2 == 3) {
                                                        i18 = 3;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                        break;
                                    }
                                    C2622l.m5322V2(str8 == null);
                                    Pair<String, byte[]> pairM6370b = m6370b(do2Var5, i19);
                                    String str9 = (String) pairM6370b.first;
                                    listSingletonList2 = Collections.singletonList((byte[]) pairM6370b.second);
                                    str8 = str9;
                                    obj = obj2;
                                    break;
                                }
                                C2622l.m5322V2(str8 == null);
                                str = "video/3gpp";
                            } else {
                                C2622l.m5322V2(str8 == null);
                                str = iM6395l11 == wj2.f21160J0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            }
                            str8 = str;
                            obj = obj2;
                            break;
                            break;
                        }
                        C2622l.m5322V2(str8 == null);
                        do2Var5.m6389f(i19 + 8);
                        po2 po2VarM8138a = po2.m8138a(do2Var5);
                        list = po2VarM8138a.f18049a;
                        zj2Var.f22308c = po2VarM8138a.f18050b;
                        str2 = "video/hevc";
                        i17 += iM6395l12;
                    }
                    str8 = str2;
                    listSingletonList2 = list;
                    obj = obj2;
                    break;
                    i17 += iM6395l12;
                }
                if (str8 != null) {
                    zj2Var.f22307b = ch2.m6181a(Integer.toString(i11), str8, null, -1, iM6393j3, iM6393j4, listSingletonList2, i12, fM6397n, bArrCopyOfRange, i18, null, yi2Var);
                }
            } else {
                if (iM6395l11 == wj2.f21197i || iM6395l11 == wj2.f21182a0 || iM6395l11 == wj2.f21207n || iM6395l11 == wj2.f21211p || iM6395l11 == wj2.f21215r || iM6395l11 == wj2.f21221u || iM6395l11 == wj2.f21217s || iM6395l11 == wj2.f21219t || iM6395l11 == wj2.f21228x0 || iM6395l11 == wj2.f21230y0 || iM6395l11 == wj2.f21203l || iM6395l11 == wj2.f21205m || iM6395l11 == wj2.f21199j || iM6395l11 == wj2.f21168N0) {
                    i3 = i;
                    do2Var5.m6389f(i14 + 16);
                    if (z) {
                        iM6393j = do2Var5.m6393j();
                        do2Var5.m6390g(6);
                    } else {
                        do2Var5.m6390g(8);
                        iM6393j = 0;
                    }
                    if (iM6393j == 0 || iM6393j == 1) {
                        int iM6393j5 = do2Var5.m6393j();
                        do2Var5.m6390g(6);
                        byte[] bArr = do2Var5.f13340a;
                        int i21 = do2Var5.f13341b;
                        int i22 = i21 + 1;
                        do2Var5.f13341b = i22;
                        byte b = bArr[i21];
                        int i23 = i22 + 1;
                        do2Var5.f13341b = i23;
                        byte b2 = bArr[i22];
                        do2Var5.f13341b = i23 + 2;
                        iIntValue = (b2 & 255) | ((b & 255) << 8);
                        if (iM6393j == 1) {
                            do2Var5.m6390g(16);
                        }
                        iIntValue2 = iM6393j5;
                    } else if (iM6393j == 2) {
                        do2Var5.m6390g(16);
                        iIntValue = (int) Math.round(Double.longBitsToDouble(do2Var5.m6396m()));
                        iIntValue2 = do2Var5.m6397n();
                        do2Var5.m6390g(20);
                    }
                    int i24 = do2Var5.f13341b;
                    if (iM6395l11 == wj2.f21182a0) {
                        iM6395l11 = m6371c(do2Var5, i14, iM6395l10, zj2Var, i13);
                        do2Var5.m6389f(i24);
                    }
                    if (iM6395l11 == wj2.f21207n) {
                        str3 = "audio/ac3";
                    } else if (iM6395l11 == wj2.f21211p) {
                        str3 = "audio/eac3";
                    } else if (iM6395l11 == wj2.f21215r) {
                        str3 = "audio/vnd.dts";
                    } else if (iM6395l11 == wj2.f21217s || iM6395l11 == wj2.f21219t) {
                        str3 = "audio/vnd.dts.hd";
                    } else if (iM6395l11 == wj2.f21221u) {
                        str3 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (iM6395l11 == wj2.f21228x0) {
                        str3 = "audio/3gpp";
                    } else if (iM6395l11 == wj2.f21230y0) {
                        str3 = "audio/amr-wb";
                    } else if (iM6395l11 == wj2.f21203l || iM6395l11 == wj2.f21205m) {
                        str3 = "audio/raw";
                    } else if (iM6395l11 == wj2.f21199j) {
                        str3 = "audio/mpeg";
                    } else {
                        str3 = iM6395l11 == wj2.f21168N0 ? "audio/alac" : null;
                    }
                    byte[] bArr2 = null;
                    while (i24 - i14 < iM6395l10) {
                        do2Var5.m6389f(i24);
                        int iM6395l15 = do2Var5.m6395l();
                        int i25 = i12;
                        C2622l.m5321V1(iM6395l15 > 0, str7);
                        int iM6395l16 = do2Var5.m6395l();
                        int i26 = i13;
                        int i27 = wj2.f21159J;
                        int i28 = iM6395l10;
                        if (iM6395l16 == i27 || (z && iM6395l16 == wj2.f21201k)) {
                            boolean z3 = false;
                            if (iM6395l16 != i27) {
                                i6 = do2Var5.f13341b;
                                while (true) {
                                    if (i6 - i24 >= iM6395l15) {
                                        str4 = str7;
                                        i6 = -1;
                                        break;
                                    }
                                    do2Var5.m6389f(i6);
                                    int iM6395l17 = do2Var5.m6395l();
                                    if (iM6395l17 > 0) {
                                        z3 = true;
                                    }
                                    C2622l.m5321V1(z3, str7);
                                    str4 = str7;
                                    if (do2Var5.m6395l() == wj2.f21159J) {
                                        break;
                                    }
                                    i6 += iM6395l17;
                                    str7 = str4;
                                    z3 = false;
                                }
                            } else {
                                i6 = i24;
                                str4 = str7;
                            }
                            if (i6 != -1) {
                                Pair<String, byte[]> pairM6370b2 = m6370b(do2Var5, i6);
                                String str10 = (String) pairM6370b2.first;
                                byte[] bArr3 = (byte[]) pairM6370b2.second;
                                if ("audio/mp4a-latm".equals(str10)) {
                                    co2 co2Var = new co2(bArr3, bArr3.length);
                                    int iM8661a = wn2.m8661a(co2Var);
                                    int iM8662b = wn2.m8662b(co2Var);
                                    int iM6217a = co2Var.m6217a(4);
                                    if (iM8661a == 5 || iM8661a == 29) {
                                        iM8662b = wn2.m8662b(co2Var);
                                        if (wn2.m8661a(co2Var) == 22) {
                                            iM6217a = co2Var.m6217a(4);
                                        }
                                    }
                                    int i29 = wn2.f21273c[iM6217a];
                                    C2622l.m5366f1(i29 != -1);
                                    Pair pairCreate3 = Pair.create(Integer.valueOf(iM8662b), Integer.valueOf(i29));
                                    iIntValue = ((Integer) pairCreate3.first).intValue();
                                    iIntValue2 = ((Integer) pairCreate3.second).intValue();
                                }
                                bArr2 = bArr3;
                                str3 = str10;
                            }
                            i24 += iM6395l15;
                            str7 = str4;
                            i12 = i25;
                            i13 = i26;
                            iM6395l10 = i28;
                        } else {
                            if (iM6395l16 == wj2.f21209o) {
                                do2Var5.m6389f(i24 + 8);
                                String string = Integer.toString(i11);
                                int i30 = oh2.f17624b[(do2Var5.m6392i() & 192) >> 6];
                                int iM6392i3 = do2Var5.m6392i();
                                int i31 = oh2.f17625c[(iM6392i3 & 56) >> 3];
                                if ((iM6392i3 & 4) != 0) {
                                    i31++;
                                }
                                zj2Var.f22307b = ch2.m6182b(string, "audio/ac3", i31, i30, yi2Var, str6);
                            } else if (iM6395l16 == wj2.f21213q) {
                                do2Var5.m6389f(i24 + 8);
                                String string2 = Integer.toString(i11);
                                do2Var5.m6390g(2);
                                int i32 = oh2.f17624b[(do2Var5.m6392i() & 192) >> 6];
                                int iM6392i4 = do2Var5.m6392i();
                                int i33 = oh2.f17625c[(iM6392i4 & 14) >> 1];
                                if ((iM6392i4 & 1) != 0) {
                                    i33++;
                                }
                                zj2Var.f22307b = ch2.m6182b(string2, "audio/eac3", i33, i32, yi2Var, str6);
                            } else if (iM6395l16 == wj2.f21223v) {
                                zj2Var.f22307b = ch2.m6182b(Integer.toString(i11), str3, iIntValue2, iIntValue, yi2Var, str6);
                            } else if (iM6395l16 == wj2.f21168N0) {
                                bArr2 = new byte[iM6395l15];
                                do2Var5.m6389f(i24);
                                System.arraycopy(do2Var5.f13340a, do2Var5.f13341b, bArr2, 0, iM6395l15);
                                do2Var5.f13341b += iM6395l15;
                            }
                            str4 = str7;
                        }
                        i24 += iM6395l15;
                        str7 = str4;
                        i12 = i25;
                        i13 = i26;
                        iM6395l10 = i28;
                    }
                    i13 = i13;
                    iM6395l10 = iM6395l10;
                    i12 = i12;
                    if (zj2Var.f22307b == null && str3 != null) {
                        zj2Var.f22307b = ch2.m6183c(Integer.toString(i11), str3, null, -1, iIntValue2, iIntValue, true != "audio/raw".equals(str3) ? -1 : 2, bArr2 == null ? null : Collections.singletonList(bArr2), yi2Var, 0, str6);
                    }
                    i4 = i13;
                    i5 = iM6395l10;
                } else {
                    int i34 = wj2.f21200j0;
                    if (iM6395l11 == i34 || iM6395l11 == wj2.f21220t0 || iM6395l11 == wj2.f21222u0 || iM6395l11 == wj2.f21224v0 || iM6395l11 == wj2.f21226w0) {
                        do2Var5.m6389f(i14 + 16);
                        String str11 = "application/ttml+xml";
                        if (iM6395l11 == i34) {
                            i3 = i;
                        } else {
                            if (iM6395l11 == wj2.f21220t0) {
                                int i35 = iM6395l10 - 16;
                                byte[] bArr4 = new byte[i35];
                                i3 = i;
                                System.arraycopy(do2Var5.f13340a, do2Var5.f13341b, bArr4, 0, i35);
                                do2Var5.f13341b += i35;
                                listSingletonList = Collections.singletonList(bArr4);
                                j3 = Long.MAX_VALUE;
                                str5 = "application/x-quicktime-tx3g";
                            } else {
                                i3 = i;
                                if (iM6395l11 == wj2.f21222u0) {
                                    str11 = "application/x-mp4-vtt";
                                } else if (iM6395l11 == wj2.f21224v0) {
                                    str5 = "application/ttml+xml";
                                    j3 = 0;
                                    listSingletonList = null;
                                } else {
                                    if (iM6395l11 != wj2.f21226w0) {
                                        throw new IllegalStateException();
                                    }
                                    zj2Var.f22309d = 1;
                                    str11 = "application/x-mp4-cea-608";
                                }
                            }
                            zj2Var.f22307b = ch2.m6184d(Integer.toString(i11), str5, null, 0, str6, yi2Var, j3, listSingletonList);
                        }
                        j3 = Long.MAX_VALUE;
                        listSingletonList = null;
                        str5 = str11;
                        zj2Var.f22307b = ch2.m6184d(Integer.toString(i11), str5, null, 0, str6, yi2Var, j3, listSingletonList);
                    } else {
                        if (iM6395l11 == wj2.f21166M0) {
                            zj2Var.f22307b = new ch2(Integer.toString(i11), null, "application/x-camera-motion", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, yi2Var, null);
                        }
                        i3 = i;
                    }
                    i4 = i13;
                    i5 = iM6395l10;
                }
                i4 = i13;
                i5 = iM6395l10;
            }
            do2Var5.m6389f(i14 + i5);
            i13 = i4 + 1;
            iM6395l9 = i15;
            jM6394k2 = j5;
            i = i3;
            pairCreate2 = pairCreate2;
            ck2Var = ck2Var;
            i12 = i12;
        }
        Pair pair = pairCreate2;
        ck2 ck2Var2 = ck2Var;
        long j6 = jM6394k2;
        int i36 = i;
        uj2 uj2VarM8510c3 = uj2Var.m8510c(wj2.f21170P);
        if (uj2VarM8510c3 == null || (vj2VarM8509b = uj2VarM8510c3.m8509b(wj2.f21171Q)) == null) {
            nk2Var = null;
            pairCreate = Pair.create(null, null);
        } else {
            do2 do2Var6 = vj2VarM8509b.f20809P0;
            do2Var6.m6389f(8);
            int iM6395l18 = (do2Var6.m6395l() >> 24) & 255;
            int iM6397n = do2Var6.m6397n();
            long[] jArr = new long[iM6397n];
            long[] jArr2 = new long[iM6397n];
            for (int i37 = 0; i37 < iM6397n; i37++) {
                jArr[i37] = iM6395l18 == 1 ? do2Var6.m6398o() : do2Var6.m6394k();
                jArr2[i37] = iM6395l18 == 1 ? do2Var6.m6396m() : do2Var6.m6395l();
                byte[] bArr5 = do2Var6.f13340a;
                int i38 = do2Var6.f13341b;
                int i39 = i38 + 1;
                do2Var6.f13341b = i39;
                byte b3 = bArr5[i38];
                do2Var6.f13341b = i39 + 1;
                if (((short) ((bArr5[i39] & 255) | ((b3 & 255) << 8))) != 1) {
                    throw new IllegalArgumentException("Unsupported media rate.");
                }
                do2Var6.m6390g(2);
            }
            pairCreate = Pair.create(jArr, jArr2);
            nk2Var = null;
        }
        return zj2Var.f22307b == null ? nk2Var : new nk2(ck2Var2.f13043a, i36, ((Long) pair.first).longValue(), j6, jM7373e, zj2Var.f22307b, zj2Var.f22309d, zj2Var.f22306a, zj2Var.f22308c, (long[]) pairCreate.first, (long[]) pairCreate.second);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX INFO: renamed from: b */
    public static Pair<String, byte[]> m6370b(do2 do2Var, int i) {
        do2Var.m6389f(i + 12);
        do2Var.m6390g(1);
        m6372d(do2Var);
        do2Var.m6390g(2);
        int iM6392i = do2Var.m6392i();
        if ((iM6392i & 128) != 0) {
            do2Var.m6390g(2);
        }
        if ((iM6392i & 64) != 0) {
            do2Var.m6390g(do2Var.m6393j());
        }
        if ((iM6392i & 32) != 0) {
            do2Var.m6390g(2);
        }
        do2Var.m6390g(1);
        m6372d(do2Var);
        int iM6392i2 = do2Var.m6392i();
        String str = null;
        if (iM6392i2 == 32) {
            str = "video/mp4v-es";
        } else if (iM6392i2 == 33) {
            str = "video/avc";
        } else if (iM6392i2 == 35) {
            str = "video/hevc";
        } else if (iM6392i2 == 64) {
            str = "audio/mp4a-latm";
        } else {
            if (iM6392i2 == 107) {
                return Pair.create("audio/mpeg", null);
            }
            if (iM6392i2 == 165) {
                str = "audio/ac3";
            } else if (iM6392i2 != 166) {
                switch (iM6392i2) {
                    case 102:
                    case 103:
                    case 104:
                        str = "audio/mp4a-latm";
                        break;
                    default:
                        switch (iM6392i2) {
                            case 169:
                            case 172:
                                return Pair.create("audio/vnd.dts", null);
                            case 170:
                            case 171:
                                return Pair.create("audio/vnd.dts.hd", null);
                        }
                }
            } else {
                str = "audio/eac3";
            }
        }
        do2Var.m6390g(12);
        do2Var.m6390g(1);
        int iM6372d = m6372d(do2Var);
        byte[] bArr = new byte[iM6372d];
        System.arraycopy(do2Var.f13340a, do2Var.f13341b, bArr, 0, iM6372d);
        do2Var.f13341b += iM6372d;
        return Pair.create(str, bArr);
    }

    /* JADX INFO: renamed from: c */
    public static int m6371c(do2 do2Var, int i, int i2, zj2 zj2Var, int i3) {
        int i4 = do2Var.f13341b;
        while (true) {
            if (i4 - i >= i2) {
                return 0;
            }
            do2Var.m6389f(i4);
            int iM6395l = do2Var.m6395l();
            int i5 = 1;
            C2622l.m5321V1(iM6395l > 0, "childAtomSize should be positive");
            if (do2Var.m6395l() == wj2.f21176V) {
                int i6 = i4 + 8;
                Pair pairCreate = null;
                Integer numValueOf = null;
                ok2 ok2Var = null;
                boolean z = false;
                while (i6 - i4 < iM6395l) {
                    do2Var.m6389f(i6);
                    int iM6395l2 = do2Var.m6395l();
                    int iM6395l3 = do2Var.m6395l();
                    if (iM6395l3 == wj2.f21184b0) {
                        numValueOf = Integer.valueOf(do2Var.m6395l());
                    } else if (iM6395l3 == wj2.f21177W) {
                        do2Var.m6390g(4);
                        z = do2Var.m6395l() == f13300g;
                    } else if (iM6395l3 == wj2.f21178X) {
                        int i7 = i6 + 8;
                        while (true) {
                            if (i7 - i6 >= iM6395l2) {
                                ok2Var = null;
                                break;
                            }
                            do2Var.m6389f(i7);
                            int iM6395l4 = do2Var.m6395l();
                            if (do2Var.m6395l() == wj2.f21179Y) {
                                do2Var.m6390g(6);
                                boolean z2 = do2Var.m6392i() == i5;
                                int iM6392i = do2Var.m6392i();
                                byte[] bArr = new byte[16];
                                System.arraycopy(do2Var.f13340a, do2Var.f13341b, bArr, 0, 16);
                                do2Var.f13341b += 16;
                                ok2Var = new ok2(z2, iM6392i, bArr);
                                break;
                            }
                            i7 += iM6395l4;
                            i5 = 1;
                        }
                    }
                    i6 += iM6395l2;
                    i5 = 1;
                }
                if (z) {
                    C2622l.m5321V1(numValueOf != null, "frma atom is mandatory");
                    C2622l.m5321V1(ok2Var != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, ok2Var);
                }
                if (pairCreate != null) {
                    zj2Var.f22306a[i3] = (ok2) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            i4 += iM6395l;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m6372d(do2 do2Var) {
        int iM6392i = do2Var.m6392i();
        int i = iM6392i & 127;
        while ((iM6392i & 128) == 128) {
            iM6392i = do2Var.m6392i();
            i = (i << 7) | (iM6392i & 127);
        }
        return i;
    }
}
