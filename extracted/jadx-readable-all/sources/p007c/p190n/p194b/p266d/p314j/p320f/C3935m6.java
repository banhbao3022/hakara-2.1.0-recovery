package p007c.p190n.p194b.p266d.p314j.p320f;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: c.n.b.d.j.f.m6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3935m6<T> implements InterfaceC4059z6<T> {

    /* JADX INFO: renamed from: a */
    public static final int[] f22791a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final Unsafe f22792b = C4015u7.m9248n();

    /* JADX INFO: renamed from: c */
    public final int[] f22793c;

    /* JADX INFO: renamed from: d */
    public final Object[] f22794d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3895i6 f22795e;

    /* JADX INFO: renamed from: f */
    public final boolean f22796f;

    /* JADX INFO: renamed from: g */
    public final boolean f22797g;

    /* JADX INFO: renamed from: h */
    public final int[] f22798h;

    /* JADX INFO: renamed from: i */
    public final int f22799i;

    /* JADX INFO: renamed from: j */
    public final int f22800j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC3975q6 f22801k;

    /* JADX INFO: renamed from: l */
    public final AbstractC3984r5 f22802l;

    /* JADX INFO: renamed from: m */
    public final AbstractC3946n7<?, ?> f22803m;

    /* JADX INFO: renamed from: n */
    public final AbstractC3963p4<?> f22804n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC3865f6 f22805o;

    public C3935m6(int[] iArr, Object[] objArr, int i, int i2, InterfaceC3895i6 interfaceC3895i6, boolean z, int[] iArr2, int i3, int i4, InterfaceC3975q6 interfaceC3975q6, AbstractC3984r5 abstractC3984r5, AbstractC3946n7 abstractC3946n7, AbstractC3963p4 abstractC3963p4, InterfaceC3865f6 interfaceC3865f6) {
        this.f22793c = iArr;
        this.f22794d = objArr;
        boolean z2 = interfaceC3895i6 instanceof AbstractC4057z4;
        this.f22797g = z;
        this.f22796f = abstractC3963p4 != null && abstractC3963p4.mo9178f(interfaceC3895i6);
        this.f22798h = iArr2;
        this.f22799i = i3;
        this.f22800j = i4;
        this.f22801k = interfaceC3975q6;
        this.f22802l = abstractC3984r5;
        this.f22803m = abstractC3946n7;
        this.f22804n = abstractC3963p4;
        this.f22795e = interfaceC3895i6;
        this.f22805o = interfaceC3865f6;
    }

    /* JADX INFO: renamed from: A */
    public static <T> double m9112A(T t, long j2) {
        return ((Double) C4015u7.m9252r(t, j2)).doubleValue();
    }

    /* JADX INFO: renamed from: B */
    public static <T> float m9113B(T t, long j2) {
        return ((Float) C4015u7.m9252r(t, j2)).floatValue();
    }

    /* JADX INFO: renamed from: C */
    public static <T> int m9114C(T t, long j2) {
        return ((Integer) C4015u7.m9252r(t, j2)).intValue();
    }

    /* JADX INFO: renamed from: D */
    public static <T> long m9115D(T t, long j2) {
        return ((Long) C4015u7.m9252r(t, j2)).longValue();
    }

    /* JADX INFO: renamed from: E */
    public static <T> boolean m9116E(T t, long j2) {
        return ((Boolean) C4015u7.m9252r(t, j2)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0365  */
    /* JADX WARN: Code duplicated, block: B:188:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:191:0x03ba  */
    /* JADX INFO: renamed from: h */
    public static C3935m6 m9117h(InterfaceC3875g6 interfaceC3875g6, InterfaceC3975q6 interfaceC3975q6, AbstractC3984r5 abstractC3984r5, AbstractC3946n7 abstractC3946n7, AbstractC3963p4 abstractC3963p4, InterfaceC3865f6 interfaceC3865f6) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        boolean z;
        int i17;
        int iObjectFieldOffset;
        int i18;
        int iObjectFieldOffset2;
        int i19;
        int iObjectFieldOffset3;
        String str;
        Field fieldM9118i;
        char cCharAt9;
        int i20;
        int i21;
        Field fieldM9118i2;
        Field fieldM9118i3;
        int i22;
        char cCharAt10;
        int i23;
        char cCharAt11;
        int i24;
        char cCharAt12;
        int i25;
        char cCharAt13;
        char cCharAt14;
        if (!(interfaceC3875g6 instanceof C4023v6)) {
            throw new NoSuchMethodError();
        }
        C4023v6 c4023v6 = (C4023v6) interfaceC3875g6;
        int i26 = 0;
        boolean z2 = ((c4023v6.f22966d & 1) == 1 ? (char) 1 : (char) 2) == 2;
        String str2 = c4023v6.f22964b;
        int length = str2.length();
        int iCharAt3 = str2.charAt(0);
        if (iCharAt3 >= 55296) {
            int i27 = iCharAt3 & 8191;
            int i28 = 1;
            int i29 = 13;
            while (true) {
                i = i28 + 1;
                cCharAt14 = str2.charAt(i28);
                if (cCharAt14 < 55296) {
                    break;
                }
                i27 |= (cCharAt14 & 8191) << i29;
                i29 += 13;
                i28 = i;
            }
            iCharAt3 = i27 | (cCharAt14 << i29);
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int iCharAt4 = str2.charAt(i);
        if (iCharAt4 >= 55296) {
            int i31 = iCharAt4 & 8191;
            int i32 = 13;
            while (true) {
                i25 = i30 + 1;
                cCharAt13 = str2.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i25;
            }
            iCharAt4 = i31 | (cCharAt13 << i32);
            i30 = i25;
        }
        if (iCharAt4 == 0) {
            iArr = f22791a;
            i5 = 0;
            i4 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i6 = 0;
            i3 = 0;
        } else {
            int i33 = i30 + 1;
            int iCharAt5 = str2.charAt(i30);
            if (iCharAt5 >= 55296) {
                int i34 = iCharAt5 & 8191;
                int i35 = 13;
                while (true) {
                    i14 = i33 + 1;
                    cCharAt8 = str2.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i14;
                }
                iCharAt5 = i34 | (cCharAt8 << i35);
                i33 = i14;
            }
            int i36 = i33 + 1;
            int iCharAt6 = str2.charAt(i33);
            if (iCharAt6 >= 55296) {
                int i37 = iCharAt6 & 8191;
                int i38 = 13;
                while (true) {
                    i13 = i36 + 1;
                    cCharAt7 = str2.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i13;
                }
                iCharAt6 = i37 | (cCharAt7 << i38);
                i36 = i13;
            }
            int i39 = i36 + 1;
            iCharAt = str2.charAt(i36);
            if (iCharAt >= 55296) {
                int i40 = iCharAt & 8191;
                int i41 = 13;
                while (true) {
                    i12 = i39 + 1;
                    cCharAt6 = str2.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i12;
                }
                iCharAt = i40 | (cCharAt6 << i41);
                i39 = i12;
            }
            int i42 = i39 + 1;
            int iCharAt7 = str2.charAt(i39);
            if (iCharAt7 >= 55296) {
                int i43 = iCharAt7 & 8191;
                int i44 = 13;
                while (true) {
                    i11 = i42 + 1;
                    cCharAt5 = str2.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i11;
                }
                iCharAt7 = i43 | (cCharAt5 << i44);
                i42 = i11;
            }
            int i45 = i42 + 1;
            iCharAt2 = str2.charAt(i42);
            if (iCharAt2 >= 55296) {
                int i46 = iCharAt2 & 8191;
                int i47 = 13;
                while (true) {
                    i10 = i45 + 1;
                    cCharAt4 = str2.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i10;
                }
                iCharAt2 = i46 | (cCharAt4 << i47);
                i45 = i10;
            }
            int i48 = i45 + 1;
            int iCharAt8 = str2.charAt(i45);
            if (iCharAt8 >= 55296) {
                int i49 = iCharAt8 & 8191;
                int i50 = 13;
                while (true) {
                    i9 = i48 + 1;
                    cCharAt3 = str2.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i9;
                }
                iCharAt8 = i49 | (cCharAt3 << i50);
                i48 = i9;
            }
            int i51 = i48 + 1;
            int iCharAt9 = str2.charAt(i48);
            if (iCharAt9 >= 55296) {
                int i52 = iCharAt9 & 8191;
                int i53 = i51;
                int i54 = 13;
                while (true) {
                    i8 = i53 + 1;
                    cCharAt2 = str2.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i53 = i8;
                }
                iCharAt9 = i52 | (cCharAt2 << i54);
                i2 = i8;
            } else {
                i2 = i51;
            }
            int i55 = i2 + 1;
            int iCharAt10 = str2.charAt(i2);
            if (iCharAt10 >= 55296) {
                int i56 = iCharAt10 & 8191;
                int i57 = i55;
                int i58 = 13;
                while (true) {
                    i7 = i57 + 1;
                    cCharAt = str2.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i57 = i7;
                }
                iCharAt10 = i56 | (cCharAt << i58);
                i55 = i7;
            }
            int[] iArr2 = new int[iCharAt10 + iCharAt8 + iCharAt9];
            i3 = (iCharAt5 << 1) + iCharAt6;
            i4 = iCharAt7;
            iArr = iArr2;
            i5 = iCharAt8;
            i6 = iCharAt10;
            i26 = iCharAt5;
            i30 = i55;
        }
        Unsafe unsafe = f22792b;
        Object[] objArr = c4023v6.f22965c;
        int i59 = i30;
        Class<?> cls = c4023v6.f22963a.getClass();
        int i60 = i3;
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr2 = new Object[iCharAt2 << 1];
        int i61 = i6 + i5;
        int i62 = i6;
        int i63 = i59;
        int i64 = i61;
        int i65 = 0;
        int i66 = 0;
        while (i63 < length) {
            int i67 = i63 + 1;
            int iCharAt11 = str2.charAt(i63);
            int i68 = length;
            if (iCharAt11 >= 55296) {
                int i69 = iCharAt11 & 8191;
                int i70 = i67;
                int i71 = 13;
                while (true) {
                    i24 = i70 + 1;
                    cCharAt12 = str2.charAt(i70);
                    i15 = i6;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i24;
                    i6 = i15;
                }
                iCharAt11 = i69 | (cCharAt12 << i71);
                i16 = i24;
            } else {
                i15 = i6;
                i16 = i67;
            }
            int i72 = i16 + 1;
            int iCharAt12 = str2.charAt(i16);
            if (iCharAt12 >= 55296) {
                int i73 = iCharAt12 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i23 = i74 + 1;
                    cCharAt11 = str2.charAt(i74);
                    z = z2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i23;
                    z2 = z;
                }
                iCharAt12 = i73 | (cCharAt11 << i75);
                i17 = i23;
            } else {
                z = z2;
                i17 = i72;
            }
            int i76 = iCharAt12 & 255;
            int i77 = i4;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            if (i76 >= 51) {
                int i78 = i17 + 1;
                int iCharAt13 = str2.charAt(i17);
                char c2 = 55296;
                if (iCharAt13 >= 55296) {
                    int i79 = 13;
                    int i80 = iCharAt13 & 8191;
                    int i81 = i78;
                    while (true) {
                        i22 = i81 + 1;
                        cCharAt10 = str2.charAt(i81);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i80 |= (cCharAt10 & 8191) << i79;
                        i79 += 13;
                        i81 = i22;
                        c2 = 55296;
                    }
                    iCharAt13 = i80 | (cCharAt10 << i79);
                    i21 = i22;
                } else {
                    i21 = i78;
                }
                int i82 = i21;
                int i83 = i76 - 51;
                if (i83 == 9 || i83 == 17) {
                    objArr2[((i66 / 3) << 1) + 1] = objArr[i60];
                    i60++;
                } else if (i83 == 12 && (iCharAt3 & 1) == 1) {
                    objArr2[((i66 / 3) << 1) + 1] = objArr[i60];
                    i60++;
                }
                int i84 = iCharAt13 << 1;
                Object obj = objArr[i84];
                if (obj instanceof Field) {
                    fieldM9118i2 = (Field) obj;
                } else {
                    fieldM9118i2 = m9118i(cls, (String) obj);
                    objArr[i84] = fieldM9118i2;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9118i2);
                int i85 = i84 + 1;
                Object obj2 = objArr[i85];
                if (obj2 instanceof Field) {
                    fieldM9118i3 = (Field) obj2;
                } else {
                    fieldM9118i3 = m9118i(cls, (String) obj2);
                    objArr[i85] = fieldM9118i3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM9118i3);
                str2 = str2;
                i18 = i82;
                i19 = 0;
                c4023v6 = c4023v6;
            } else {
                int i86 = i60 + 1;
                Field fieldM9118i4 = m9118i(cls, (String) objArr[i60]);
                if (i76 == 9 || i76 == 17) {
                    c4023v6 = c4023v6;
                    objArr2[((i66 / 3) << 1) + 1] = fieldM9118i4.getType();
                } else {
                    if (i76 == 27 || i76 == 49) {
                        c4023v6 = c4023v6;
                        i20 = i86 + 1;
                        objArr2[((i66 / 3) << 1) + 1] = objArr[i86];
                    } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                        c4023v6 = c4023v6;
                        if ((iCharAt3 & 1) == 1) {
                            i20 = i86 + 1;
                            objArr2[((i66 / 3) << 1) + 1] = objArr[i86];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9118i4);
                        if ((iCharAt3 & 1) == 1 || i76 > 17) {
                            i18 = i17;
                            iObjectFieldOffset2 = 0;
                            i19 = 0;
                        } else {
                            int i87 = i17 + 1;
                            int iCharAt14 = str.charAt(i17);
                            if (iCharAt14 >= 55296) {
                                str = str2;
                                int i88 = iCharAt14 & 8191;
                                int i89 = 13;
                                while (true) {
                                    i18 = i87 + 1;
                                    cCharAt9 = str.charAt(i87);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i88 |= (cCharAt9 & 8191) << i89;
                                    i89 += 13;
                                    i87 = i18;
                                }
                                iCharAt14 = i88 | (cCharAt9 << i89);
                            } else {
                                str = str2;
                                i18 = i87;
                            }
                            int i90 = (iCharAt14 / 32) + (i26 << 1);
                            Object obj3 = objArr[i90];
                            if (obj3 instanceof Field) {
                                fieldM9118i = (Field) obj3;
                            } else {
                                fieldM9118i = m9118i(cls, (String) obj3);
                                objArr[i90] = fieldM9118i;
                            }
                            str2 = str;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM9118i);
                            i19 = iCharAt14 % 32;
                        }
                        if (i76 >= 18 && i76 <= 49) {
                            iArr[i64] = iObjectFieldOffset;
                            i64++;
                        }
                        i60 = i86;
                        iObjectFieldOffset3 = iObjectFieldOffset2;
                    } else if (i76 == 50) {
                        int i91 = i62 + 1;
                        iArr[i62] = i66;
                        int i92 = (i66 / 3) << 1;
                        int i93 = i86 + 1;
                        objArr2[i92] = objArr[i86];
                        if ((iCharAt12 & 2048) != 0) {
                            i86 = i93 + 1;
                            objArr2[i92 + 1] = objArr[i93];
                            i62 = i91;
                        } else {
                            i62 = i91;
                            i86 = i93;
                        }
                    }
                    i86 = i20;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9118i4);
                    if ((iCharAt3 & 1) == 1) {
                        i18 = i17;
                        iObjectFieldOffset2 = 0;
                        i19 = 0;
                    } else {
                        i18 = i17;
                        iObjectFieldOffset2 = 0;
                        i19 = 0;
                    }
                    if (i76 >= 18) {
                        iArr[i64] = iObjectFieldOffset;
                        i64++;
                    }
                    i60 = i86;
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9118i4);
                if ((iCharAt3 & 1) == 1) {
                    i18 = i17;
                    iObjectFieldOffset2 = 0;
                    i19 = 0;
                } else {
                    i18 = i17;
                    iObjectFieldOffset2 = 0;
                    i19 = 0;
                }
                if (i76 >= 18) {
                    iArr[i64] = iObjectFieldOffset;
                    i64++;
                }
                i60 = i86;
                iObjectFieldOffset3 = iObjectFieldOffset2;
            }
            int i94 = i66 + 1;
            iArr3[i66] = iCharAt11;
            int i95 = i94 + 1;
            iArr3[i94] = ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & 512) != 0 ? 536870912 : 0) | (i76 << 20) | iObjectFieldOffset;
            i66 = i95 + 1;
            iArr3[i95] = (i19 << 20) | iObjectFieldOffset3;
            str2 = str2;
            i4 = i77;
            length = i68;
            c4023v6 = c4023v6;
            i6 = i15;
            z2 = z;
            i63 = i18;
            iCharAt = iCharAt;
            iArr3 = iArr3;
        }
        return new C3935m6(iArr3, objArr2, iCharAt, i4, c4023v6.f22963a, z2, iArr, i6, i61, interfaceC3975q6, abstractC3984r5, abstractC3946n7, abstractC3963p4, interfaceC3865f6);
    }

    /* JADX INFO: renamed from: i */
    public static Field m9118i(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(outline.m1558I(string, name.length() + outline.m1558I(str, 40)));
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(outline.m1550A(sb, " not found. Known fields are ", string));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m9119j(int i, Object obj, InterfaceC3887h8 interfaceC3887h8) throws IOException {
        if (obj instanceof String) {
            ((C3943n4) interfaceC3887h8).f22821a.mo9101r(i, (String) obj);
        } else {
            ((C3943n4) interfaceC3887h8).f22821a.mo9094c(i, (AbstractC3823b4) obj);
        }
    }

    /* JADX INFO: renamed from: k */
    public static <UT, UB> void m9120k(AbstractC3946n7<UT, UB> abstractC3946n7, T t, InterfaceC3887h8 interfaceC3887h8) throws IOException {
        abstractC3946n7.mo9158a(abstractC3946n7.mo9164g(t), interfaceC3887h8);
    }

    /* JADX INFO: renamed from: z */
    public static List<?> m9121z(Object obj, long j2) {
        return (List) C4015u7.m9252r(obj, j2);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9 A[LOOP:1: B:47:0x00b7->B:52:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: a */
    public final boolean mo9122a(T t) {
        int i;
        List list;
        InterfaceC4059z6 interfaceC4059z6M9138u;
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= this.f22799i) {
                return !this.f22796f || this.f22804n.mo9175c(t).m9194a();
            }
            int i6 = this.f22798h[i4];
            int i7 = this.f22793c[i6];
            int iM9140w = m9140w(i6);
            if (this.f22797g) {
                i = 0;
            } else {
                int i8 = this.f22793c[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = f22792b.getInt(t, i9);
                    i3 = i9;
                }
            }
            if (((268435456 & iM9140w) != 0) && !m9133p(t, i6, i5, i)) {
                return false;
            }
            int i10 = (267386880 & iM9140w) >>> 20;
            if (i10 == 9 || i10 == 17) {
                if (m9133p(t, i6, i5, i) && !m9138u(i6).mo9122a(C4015u7.m9252r(t, iM9140w & 1048575))) {
                    return false;
                }
            } else if (i10 == 27) {
                list = (List) C4015u7.m9252r(t, iM9140w & 1048575);
                if (!list.isEmpty()) {
                    interfaceC4059z6M9138u = m9138u(i6);
                    for (i2 = 0; i2 < list.size(); i2++) {
                        if (!interfaceC4059z6M9138u.mo9122a(list.get(i2))) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (i10 == 60 || i10 == 68) {
                if (m9132o(t, i7, i6) && !m9138u(i6).mo9122a(C4015u7.m9252r(t, iM9140w & 1048575))) {
                    return false;
                }
            } else if (i10 == 49) {
                list = (List) C4015u7.m9252r(t, iM9140w & 1048575);
                if (!list.isEmpty()) {
                    interfaceC4059z6M9138u = m9138u(i6);
                    while (i2 < list.size()) {
                        if (!interfaceC4059z6M9138u.mo9122a(list.get(i2))) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (i10 == 50 && !this.f22805o.mo9020h(C4015u7.m9252r(t, iM9140w & 1048575)).isEmpty()) {
                Objects.requireNonNull(this.f22805o.mo9018c(m9139v(i6)));
                throw null;
            }
            i4++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: b */
    public final int mo9123b(T t) {
        int i;
        int iM9081t;
        int iM8967G;
        int iM9073i;
        int iM9075k;
        int iM9081t2;
        int iM8967G2;
        int iM9073i2;
        int iM9075k2;
        int i2 = 267386880;
        if (this.f22797g) {
            Unsafe unsafe = f22792b;
            int iM1578b = 0;
            for (int i3 = 0; i3 < this.f22793c.length; i3 += 3) {
                int iM9140w = m9140w(i3);
                int i4 = (iM9140w & 267386880) >>> 20;
                int[] iArr = this.f22793c;
                int i5 = iArr[i3];
                long j2 = iM9140w & 1048575;
                if (i4 >= EnumC4021v4.f22920O.f22959g0 && i4 <= EnumC4021v4.f22933b0.f22959g0) {
                    int i6 = iArr[i3 + 2];
                }
                switch (i4) {
                    case 0:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9081t(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 1:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9079o(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 2:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9058A(i5, C4015u7.m9246l(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 3:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9059C(i5, C4015u7.m9246l(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 4:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9063J(i5, C4015u7.m9244j(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 5:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9061G(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 6:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9066N(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 7:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9082u(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 8:
                        if (m9131n(t, i3)) {
                            Object objM9252r = C4015u7.m9252r(t, j2);
                            iM9081t2 = objM9252r instanceof AbstractC3823b4 ? AbstractC3923l4.m9083v(i5, (AbstractC3823b4) objM9252r) : AbstractC3923l4.m9085x(i5, (String) objM9252r);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 9:
                        if (m9131n(t, i3)) {
                            iM9081t2 = C3826b7.m8986h(i5, C4015u7.m9252r(t, j2), m9138u(i3));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 10:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9083v(i5, (AbstractC3823b4) C4015u7.m9252r(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 11:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9064L(i5, C4015u7.m9244j(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 12:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9068Q(i5, C4015u7.m9244j(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 13:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9067P(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 14:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9062H(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 15:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9065M(i5, C4015u7.m9244j(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 16:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9060E(i5, C4015u7.m9246l(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 17:
                        if (m9131n(t, i3)) {
                            iM9081t2 = AbstractC3923l4.m9084w(i5, (InterfaceC3895i6) C4015u7.m9252r(t, j2), m9138u(i3));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 18:
                        iM9081t2 = C3826b7.m8978R(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 19:
                        iM9081t2 = C3826b7.m8977Q(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 20:
                        iM9081t2 = C3826b7.m8969I(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 21:
                        iM9081t2 = C3826b7.m8970J(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 22:
                        iM9081t2 = C3826b7.m8974N(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 23:
                        iM9081t2 = C3826b7.m8978R(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 24:
                        iM9081t2 = C3826b7.m8977Q(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 25:
                        List<?> listM9121z = m9121z(t, j2);
                        Class<?> cls = C3826b7.f22526a;
                        int size = listM9121z.size();
                        iM9081t2 = size == 0 ? 0 : size * AbstractC3923l4.m9082u(i5);
                        iM1578b += iM9081t2;
                        break;
                    case 26:
                        iM9081t2 = C3826b7.m8987i(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 27:
                        iM9081t2 = C3826b7.m8988j(i5, m9121z(t, j2), m9138u(i3));
                        iM1578b += iM9081t2;
                        break;
                    case 28:
                        iM9081t2 = C3826b7.m8990l(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 29:
                        iM9081t2 = C3826b7.m8975O(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 30:
                        iM9081t2 = C3826b7.m8972L(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 31:
                        iM9081t2 = C3826b7.m8977Q(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 32:
                        iM9081t2 = C3826b7.m8978R(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 33:
                        iM9081t2 = C3826b7.m8976P(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 34:
                        iM9081t2 = C3826b7.m8971K(i5, m9121z(t, j2));
                        iM1578b += iM9081t2;
                        break;
                    case 35:
                        iM8967G2 = C3826b7.m8967G((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 36:
                        iM8967G2 = C3826b7.m8965E((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 37:
                        iM8967G2 = C3826b7.m8995q((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 38:
                        iM8967G2 = C3826b7.m8997s((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 39:
                        iM8967G2 = C3826b7.m9003y((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 40:
                        iM8967G2 = C3826b7.m8967G((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 41:
                        iM8967G2 = C3826b7.m8965E((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 42:
                        List list = (List) unsafe.getObject(t, j2);
                        Class<?> cls2 = C3826b7.f22526a;
                        iM8967G2 = list.size();
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 43:
                        iM8967G2 = C3826b7.m8961A((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 44:
                        iM8967G2 = C3826b7.m9001w((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 45:
                        iM8967G2 = C3826b7.m8965E((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 46:
                        iM8967G2 = C3826b7.m8967G((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 47:
                        iM8967G2 = C3826b7.m8963C((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 48:
                        iM8967G2 = C3826b7.m8999u((List) unsafe.getObject(t, j2));
                        if (iM8967G2 > 0) {
                            iM9073i2 = AbstractC3923l4.m9073i(i5);
                            iM9075k2 = AbstractC3923l4.m9075k(iM8967G2);
                            iM1578b = outline.m1578b(iM9075k2, iM9073i2, iM8967G2, iM1578b);
                        }
                        break;
                    case 49:
                        iM9081t2 = C3826b7.m8991m(i5, m9121z(t, j2), m9138u(i3));
                        iM1578b += iM9081t2;
                        break;
                    case 50:
                        iM9081t2 = this.f22805o.mo9017b(i5, C4015u7.m9252r(t, j2), m9139v(i3));
                        iM1578b += iM9081t2;
                        break;
                    case 51:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9081t(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 52:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9079o(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 53:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9058A(i5, m9115D(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 54:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9059C(i5, m9115D(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 55:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9063J(i5, m9114C(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 56:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9061G(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 57:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9066N(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 58:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9082u(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 59:
                        if (m9132o(t, i5, i3)) {
                            Object objM9252r2 = C4015u7.m9252r(t, j2);
                            iM9081t2 = objM9252r2 instanceof AbstractC3823b4 ? AbstractC3923l4.m9083v(i5, (AbstractC3823b4) objM9252r2) : AbstractC3923l4.m9085x(i5, (String) objM9252r2);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 60:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = C3826b7.m8986h(i5, C4015u7.m9252r(t, j2), m9138u(i3));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 61:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9083v(i5, (AbstractC3823b4) C4015u7.m9252r(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 62:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9064L(i5, m9114C(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 63:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9068Q(i5, m9114C(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 64:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9067P(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 65:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9062H(i5);
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 66:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9065M(i5, m9114C(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 67:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9060E(i5, m9115D(t, j2));
                            iM1578b += iM9081t2;
                        }
                        break;
                    case 68:
                        if (m9132o(t, i5, i3)) {
                            iM9081t2 = AbstractC3923l4.m9084w(i5, (InterfaceC3895i6) C4015u7.m9252r(t, j2), m9138u(i3));
                            iM1578b += iM9081t2;
                        }
                        break;
                }
            }
            AbstractC3946n7<?, ?> abstractC3946n7 = this.f22803m;
            return abstractC3946n7.mo9163f(abstractC3946n7.mo9164g(t)) + iM1578b;
        }
        Unsafe unsafe2 = f22792b;
        int i7 = -1;
        int i8 = 0;
        int iM1578b2 = 0;
        int i9 = 0;
        while (i8 < this.f22793c.length) {
            int iM9140w2 = m9140w(i8);
            int[] iArr2 = this.f22793c;
            int i10 = iArr2[i8];
            int i11 = (i2 & iM9140w2) >>> 20;
            if (i11 <= 17) {
                int i12 = iArr2[i8 + 2];
                int i13 = i12 & 1048575;
                i = 1 << (i12 >>> 20);
                if (i13 != i7) {
                    i9 = unsafe2.getInt(t, i13);
                    i7 = i13;
                }
            } else {
                i = 0;
            }
            long j3 = iM9140w2 & 1048575;
            switch (i11) {
                case 0:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9081t(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 1:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9079o(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 2:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9058A(i10, unsafe2.getLong(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 3:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9059C(i10, unsafe2.getLong(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 4:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9063J(i10, unsafe2.getInt(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 5:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9061G(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 6:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9066N(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 7:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9082u(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 8:
                    if ((i9 & i) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        iM9081t = object instanceof AbstractC3823b4 ? AbstractC3923l4.m9083v(i10, (AbstractC3823b4) object) : AbstractC3923l4.m9085x(i10, (String) object);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 9:
                    if ((i9 & i) != 0) {
                        iM9081t = C3826b7.m8986h(i10, unsafe2.getObject(t, j3), m9138u(i8));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 10:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9083v(i10, (AbstractC3823b4) unsafe2.getObject(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 11:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9064L(i10, unsafe2.getInt(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 12:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9068Q(i10, unsafe2.getInt(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 13:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9067P(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 14:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9062H(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 15:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9065M(i10, unsafe2.getInt(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 16:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9060E(i10, unsafe2.getLong(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 17:
                    if ((i9 & i) != 0) {
                        iM9081t = AbstractC3923l4.m9084w(i10, (InterfaceC3895i6) unsafe2.getObject(t, j3), m9138u(i8));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 18:
                    iM9081t = C3826b7.m8978R(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 19:
                    iM9081t = C3826b7.m8977Q(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 20:
                    iM9081t = C3826b7.m8969I(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 21:
                    iM9081t = C3826b7.m8970J(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 22:
                    iM9081t = C3826b7.m8974N(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 23:
                    iM9081t = C3826b7.m8978R(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 24:
                    iM9081t = C3826b7.m8977Q(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 25:
                    List list2 = (List) unsafe2.getObject(t, j3);
                    Class<?> cls3 = C3826b7.f22526a;
                    int size2 = list2.size();
                    iM9081t = size2 == 0 ? 0 : size2 * AbstractC3923l4.m9082u(i10);
                    iM1578b2 += iM9081t;
                    break;
                case 26:
                    iM9081t = C3826b7.m8987i(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 27:
                    iM9081t = C3826b7.m8988j(i10, (List) unsafe2.getObject(t, j3), m9138u(i8));
                    iM1578b2 += iM9081t;
                    break;
                case 28:
                    iM9081t = C3826b7.m8990l(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 29:
                    iM9081t = C3826b7.m8975O(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 30:
                    iM9081t = C3826b7.m8972L(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 31:
                    iM9081t = C3826b7.m8977Q(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 32:
                    iM9081t = C3826b7.m8978R(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 33:
                    iM9081t = C3826b7.m8976P(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 34:
                    iM9081t = C3826b7.m8971K(i10, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9081t;
                    break;
                case 35:
                    iM8967G = C3826b7.m8967G((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 36:
                    iM8967G = C3826b7.m8965E((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 37:
                    iM8967G = C3826b7.m8995q((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 38:
                    iM8967G = C3826b7.m8997s((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 39:
                    iM8967G = C3826b7.m9003y((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 40:
                    iM8967G = C3826b7.m8967G((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 41:
                    iM8967G = C3826b7.m8965E((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 42:
                    List list3 = (List) unsafe2.getObject(t, j3);
                    Class<?> cls4 = C3826b7.f22526a;
                    iM8967G = list3.size();
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 43:
                    iM8967G = C3826b7.m8961A((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 44:
                    iM8967G = C3826b7.m9001w((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 45:
                    iM8967G = C3826b7.m8965E((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 46:
                    iM8967G = C3826b7.m8967G((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 47:
                    iM8967G = C3826b7.m8963C((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 48:
                    iM8967G = C3826b7.m8999u((List) unsafe2.getObject(t, j3));
                    if (iM8967G > 0) {
                        iM9073i = AbstractC3923l4.m9073i(i10);
                        iM9075k = AbstractC3923l4.m9075k(iM8967G);
                        iM1578b2 = outline.m1578b(iM9075k, iM9073i, iM8967G, iM1578b2);
                    }
                    break;
                case 49:
                    iM9081t = C3826b7.m8991m(i10, (List) unsafe2.getObject(t, j3), m9138u(i8));
                    iM1578b2 += iM9081t;
                    break;
                case 50:
                    iM9081t = this.f22805o.mo9017b(i10, unsafe2.getObject(t, j3), m9139v(i8));
                    iM1578b2 += iM9081t;
                    break;
                case 51:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9081t(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 52:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9079o(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 53:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9058A(i10, m9115D(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 54:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9059C(i10, m9115D(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 55:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9063J(i10, m9114C(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 56:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9061G(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 57:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9066N(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 58:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9082u(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 59:
                    if (m9132o(t, i10, i8)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        iM9081t = object2 instanceof AbstractC3823b4 ? AbstractC3923l4.m9083v(i10, (AbstractC3823b4) object2) : AbstractC3923l4.m9085x(i10, (String) object2);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 60:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = C3826b7.m8986h(i10, unsafe2.getObject(t, j3), m9138u(i8));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 61:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9083v(i10, (AbstractC3823b4) unsafe2.getObject(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 62:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9064L(i10, m9114C(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 63:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9068Q(i10, m9114C(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 64:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9067P(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 65:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9062H(i10);
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 66:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9065M(i10, m9114C(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 67:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9060E(i10, m9115D(t, j3));
                        iM1578b2 += iM9081t;
                    }
                    break;
                case 68:
                    if (m9132o(t, i10, i8)) {
                        iM9081t = AbstractC3923l4.m9084w(i10, (InterfaceC3895i6) unsafe2.getObject(t, j3), m9138u(i8));
                        iM1578b2 += iM9081t;
                    }
                    break;
            }
            i8 += 3;
            i2 = 267386880;
        }
        AbstractC3946n7<?, ?> abstractC3946n8 = this.f22803m;
        int iMo9163f = abstractC3946n8.mo9163f(abstractC3946n8.mo9164g(t)) + iM1578b2;
        if (!this.f22796f) {
            return iMo9163f;
        }
        C3973q4<T> c3973q4Mo9175c = this.f22804n.mo9175c(t);
        int iM9189g = 0;
        for (int i14 = 0; i14 < c3973q4Mo9175c.f22847b.m8937f(); i14++) {
            Map.Entry entryM8934c = c3973q4Mo9175c.f22847b.m8934c(i14);
            iM9189g += C3973q4.m9189g((InterfaceC3993s4) entryM8934c.getKey(), entryM8934c.getValue());
        }
        for (Map.Entry entry : c3973q4Mo9175c.f22847b.m8938g()) {
            iM9189g += C3973q4.m9189g((InterfaceC3993s4) entry.getKey(), entry.getValue());
        }
        return iMo9163f + iM9189g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: c */
    public final void mo9124c(T t) {
        int i;
        int i2 = this.f22799i;
        while (true) {
            i = this.f22800j;
            if (i2 >= i) {
                break;
            }
            long jM9140w = m9140w(this.f22798h[i2]) & 1048575;
            Object objM9252r = C4015u7.m9252r(t, jM9140w);
            if (objM9252r != null) {
                C4015u7.m9238d(t, jM9140w, this.f22805o.mo9019g(objM9252r));
            }
            i2++;
        }
        int length = this.f22798h.length;
        while (i < length) {
            this.f22802l.mo9207a(t, this.f22798h[i]);
            i++;
        }
        this.f22803m.mo9160c(t);
        if (this.f22796f) {
            this.f22804n.mo9177e(t);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: d */
    public final void mo9125d(T t, InterfaceC3887h8 interfaceC3887h8) throws IOException {
        Iterator itM9195b;
        Map.Entry<?, ?> entry;
        Objects.requireNonNull(interfaceC3887h8);
        if (!this.f22797g) {
            m9136s(t, interfaceC3887h8);
            return;
        }
        if (this.f22796f) {
            C3973q4<T> c3973q4Mo9175c = this.f22804n.mo9175c(t);
            if (c3973q4Mo9175c.f22847b.isEmpty()) {
                itM9195b = null;
                entry = null;
            } else {
                itM9195b = c3973q4Mo9175c.m9195b();
                entry = (Map.Entry) itM9195b.next();
            }
        } else {
            itM9195b = null;
            entry = null;
        }
        int length = this.f22793c.length;
        for (int i = 0; i < length; i += 3) {
            int iM9140w = m9140w(i);
            int i2 = this.f22793c[i];
            while (entry != null && this.f22804n.mo9173a(entry) <= i2) {
                this.f22804n.mo9174b(interfaceC3887h8, entry);
                entry = itM9195b.hasNext() ? (Map.Entry) itM9195b.next() : null;
            }
            switch ((267386880 & iM9140w) >>> 20) {
                case 0:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).m9150a(i2, C4015u7.m9251q(t, iM9140w & 1048575));
                    }
                    break;
                case 1:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).m9151b(i2, C4015u7.m9250p(t, iM9140w & 1048575));
                    }
                    break;
                case 2:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9093b(i2, C4015u7.m9246l(t, iM9140w & 1048575));
                    }
                    break;
                case 3:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9093b(i2, C4015u7.m9246l(t, iM9140w & 1048575));
                    }
                    break;
                case 4:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9087D(i2, C4015u7.m9244j(t, iM9140w & 1048575));
                    }
                    break;
                case 5:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9104z(i2, C4015u7.m9246l(t, iM9140w & 1048575));
                    }
                    break;
                case 6:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9089I(i2, C4015u7.m9244j(t, iM9140w & 1048575));
                    }
                    break;
                case 7:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9102s(i2, C4015u7.m9247m(t, iM9140w & 1048575));
                    }
                    break;
                case 8:
                    if (m9131n(t, i)) {
                        m9119j(i2, C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8);
                    }
                    break;
                case 9:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).m9152c(i2, C4015u7.m9252r(t, iM9140w & 1048575), m9138u(i));
                    }
                    break;
                case 10:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9094c(i2, (AbstractC3823b4) C4015u7.m9252r(t, iM9140w & 1048575));
                    }
                    break;
                case 11:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9088F(i2, C4015u7.m9244j(t, iM9140w & 1048575));
                    }
                    break;
                case 12:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9087D(i2, C4015u7.m9244j(t, iM9140w & 1048575));
                    }
                    break;
                case 13:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9089I(i2, C4015u7.m9244j(t, iM9140w & 1048575));
                    }
                    break;
                case 14:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9104z(i2, C4015u7.m9246l(t, iM9140w & 1048575));
                    }
                    break;
                case 15:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).m9156g(i2, C4015u7.m9244j(t, iM9140w & 1048575));
                    }
                    break;
                case 16:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).m9153d(i2, C4015u7.m9246l(t, iM9140w & 1048575));
                    }
                    break;
                case 17:
                    if (m9131n(t, i)) {
                        ((C3943n4) interfaceC3887h8).m9155f(i2, C4015u7.m9252r(t, iM9140w & 1048575), m9138u(i));
                    }
                    break;
                case 18:
                    C3826b7.m8981c(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 19:
                    C3826b7.m8985g(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 20:
                    C3826b7.m8989k(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 21:
                    C3826b7.m8992n(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 22:
                    C3826b7.m9000v(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 23:
                    C3826b7.m8996r(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 24:
                    C3826b7.m8962B(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 25:
                    C3826b7.m8968H(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 26:
                    C3826b7.m8979a(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8);
                    break;
                case 27:
                    C3826b7.m8980b(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, m9138u(i));
                    break;
                case 28:
                    C3826b7.m8983e(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8);
                    break;
                case 29:
                    C3826b7.m9002x(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 30:
                    C3826b7.m8966F(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 31:
                    C3826b7.m8964D(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 32:
                    C3826b7.m8998t(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 33:
                    C3826b7.m9004z(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 34:
                    C3826b7.m8993o(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, false);
                    break;
                case 35:
                    C3826b7.m8981c(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 36:
                    C3826b7.m8985g(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 37:
                    C3826b7.m8989k(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 38:
                    C3826b7.m8992n(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 39:
                    C3826b7.m9000v(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 40:
                    C3826b7.m8996r(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 41:
                    C3826b7.m8962B(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 42:
                    C3826b7.m8968H(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 43:
                    C3826b7.m9002x(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 44:
                    C3826b7.m8966F(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 45:
                    C3826b7.m8964D(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 46:
                    C3826b7.m8998t(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 47:
                    C3826b7.m9004z(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 48:
                    C3826b7.m8993o(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, true);
                    break;
                case 49:
                    C3826b7.m8984f(this.f22793c[i], (List) C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8, m9138u(i));
                    break;
                case 50:
                    m9129l(interfaceC3887h8, i2, C4015u7.m9252r(t, iM9140w & 1048575), i);
                    break;
                case 51:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).m9150a(i2, m9112A(t, iM9140w & 1048575));
                    }
                    break;
                case 52:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).m9151b(i2, m9113B(t, iM9140w & 1048575));
                    }
                    break;
                case 53:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9093b(i2, m9115D(t, iM9140w & 1048575));
                    }
                    break;
                case 54:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9093b(i2, m9115D(t, iM9140w & 1048575));
                    }
                    break;
                case 55:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9087D(i2, m9114C(t, iM9140w & 1048575));
                    }
                    break;
                case 56:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9104z(i2, m9115D(t, iM9140w & 1048575));
                    }
                    break;
                case 57:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9089I(i2, m9114C(t, iM9140w & 1048575));
                    }
                    break;
                case 58:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9102s(i2, m9116E(t, iM9140w & 1048575));
                    }
                    break;
                case 59:
                    if (m9132o(t, i2, i)) {
                        m9119j(i2, C4015u7.m9252r(t, iM9140w & 1048575), interfaceC3887h8);
                    }
                    break;
                case 60:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).m9152c(i2, C4015u7.m9252r(t, iM9140w & 1048575), m9138u(i));
                    }
                    break;
                case 61:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9094c(i2, (AbstractC3823b4) C4015u7.m9252r(t, iM9140w & 1048575));
                    }
                    break;
                case 62:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9088F(i2, m9114C(t, iM9140w & 1048575));
                    }
                    break;
                case 63:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9087D(i2, m9114C(t, iM9140w & 1048575));
                    }
                    break;
                case 64:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9089I(i2, m9114C(t, iM9140w & 1048575));
                    }
                    break;
                case 65:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9104z(i2, m9115D(t, iM9140w & 1048575));
                    }
                    break;
                case 66:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).m9156g(i2, m9114C(t, iM9140w & 1048575));
                    }
                    break;
                case 67:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).m9153d(i2, m9115D(t, iM9140w & 1048575));
                    }
                    break;
                case 68:
                    if (m9132o(t, i2, i)) {
                        ((C3943n4) interfaceC3887h8).m9155f(i2, C4015u7.m9252r(t, iM9140w & 1048575), m9138u(i));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f22804n.mo9174b(interfaceC3887h8, entry);
            entry = itM9195b.hasNext() ? (Map.Entry) itM9195b.next() : null;
        }
        m9120k(this.f22803m, t, interfaceC3887h8);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c1  */
    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: e */
    public final boolean mo9126e(T t, T t2) {
        int length = this.f22793c.length;
        int i = 0;
        while (true) {
            boolean zM8994p = true;
            if (i >= length) {
                if (!this.f22803m.mo9164g(t).equals(this.f22803m.mo9164g(t2))) {
                    return false;
                }
                if (this.f22796f) {
                    return this.f22804n.mo9175c(t).equals(this.f22804n.mo9175c(t2));
                }
                return true;
            }
            int iM9140w = m9140w(i);
            long j2 = iM9140w & 1048575;
            switch ((iM9140w & 267386880) >>> 20) {
                case 0:
                    if (!m9142y(t, t2, i) || Double.doubleToLongBits(C4015u7.m9251q(t, j2)) != Double.doubleToLongBits(C4015u7.m9251q(t2, j2))) {
                        zM8994p = false;
                    }
                    break;
                case 1:
                    if (!m9142y(t, t2, i) || Float.floatToIntBits(C4015u7.m9250p(t, j2)) != Float.floatToIntBits(C4015u7.m9250p(t2, j2))) {
                        zM8994p = false;
                    }
                    break;
                case 2:
                    if (!m9142y(t, t2, i) || C4015u7.m9246l(t, j2) != C4015u7.m9246l(t2, j2)) {
                        zM8994p = false;
                    }
                    break;
                case 3:
                    if (!m9142y(t, t2, i) || C4015u7.m9246l(t, j2) != C4015u7.m9246l(t2, j2)) {
                        zM8994p = false;
                    }
                    break;
                case 4:
                    if (!m9142y(t, t2, i) || C4015u7.m9244j(t, j2) != C4015u7.m9244j(t2, j2)) {
                        zM8994p = false;
                    }
                    break;
                case 5:
                    if (!m9142y(t, t2, i) || C4015u7.m9246l(t, j2) != C4015u7.m9246l(t2, j2)) {
                        zM8994p = false;
                    }
                    break;
                case 6:
                    if (!m9142y(t, t2, i) || C4015u7.m9244j(t, j2) != C4015u7.m9244j(t2, j2)) {
                        zM8994p = false;
                    }
                    break;
                case 7:
                    if (!m9142y(t, t2, i) || C4015u7.m9247m(t, j2) != C4015u7.m9247m(t2, j2)) {
                        zM8994p = false;
                    }
                    break;
                case 8:
                    if (!m9142y(t, t2, i) || !C3826b7.m8994p(C4015u7.m9252r(t, j2), C4015u7.m9252r(t2, j2))) {
                        zM8994p = false;
                    }
                    break;
                case 9:
                    if (!m9142y(t, t2, i) || !C3826b7.m8994p(C4015u7.m9252r(t, j2), C4015u7.m9252r(t2, j2))) {
                        zM8994p = false;
                    }
                    break;
                case 10:
                    if (!m9142y(t, t2, i) || !C3826b7.m8994p(C4015u7.m9252r(t, j2), C4015u7.m9252r(t2, j2))) {
                        zM8994p = false;
                    }
                    break;
                case 11:
                    if (!m9142y(t, t2, i) || C4015u7.m9244j(t, j2) != C4015u7.m9244j(t2, j2)) {
                        zM8994p = false;
                    }
                    break;
                case 12:
                    if (!m9142y(t, t2, i) || C4015u7.m9244j(t, j2) != C4015u7.m9244j(t2, j2)) {
                        zM8994p = false;
                    }
                    break;
                case 13:
                    if (!m9142y(t, t2, i) || C4015u7.m9244j(t, j2) != C4015u7.m9244j(t2, j2)) {
                        zM8994p = false;
                    }
                    break;
                case 14:
                    if (!m9142y(t, t2, i) || C4015u7.m9246l(t, j2) != C4015u7.m9246l(t2, j2)) {
                        zM8994p = false;
                    }
                    break;
                case 15:
                    if (!m9142y(t, t2, i) || C4015u7.m9244j(t, j2) != C4015u7.m9244j(t2, j2)) {
                        zM8994p = false;
                    }
                    break;
                case 16:
                    if (!m9142y(t, t2, i) || C4015u7.m9246l(t, j2) != C4015u7.m9246l(t2, j2)) {
                        zM8994p = false;
                    }
                    break;
                case 17:
                    if (!m9142y(t, t2, i) || !C3826b7.m8994p(C4015u7.m9252r(t, j2), C4015u7.m9252r(t2, j2))) {
                        zM8994p = false;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zM8994p = C3826b7.m8994p(C4015u7.m9252r(t, j2), C4015u7.m9252r(t2, j2));
                    break;
                case 50:
                    zM8994p = C3826b7.m8994p(C4015u7.m9252r(t, j2), C4015u7.m9252r(t2, j2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jM9141x = m9141x(i) & 1048575;
                    if (C4015u7.m9244j(t, jM9141x) != C4015u7.m9244j(t2, jM9141x) || !C3826b7.m8994p(C4015u7.m9252r(t, j2), C4015u7.m9252r(t2, j2))) {
                        zM8994p = false;
                    }
                    break;
            }
            if (!zM8994p) {
                return false;
            }
            i += 3;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: f */
    public final void mo9127f(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f22793c.length; i += 3) {
            int iM9140w = m9140w(i);
            long j2 = 1048575 & iM9140w;
            int i2 = this.f22793c[i];
            switch ((iM9140w & 267386880) >>> 20) {
                case 0:
                    if (m9131n(t2, i)) {
                        C4015u7.f22897f.mo9255a(t, j2, C4015u7.m9251q(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 1:
                    if (m9131n(t2, i)) {
                        C4015u7.f22897f.mo9256b(t, j2, C4015u7.m9250p(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 2:
                    if (m9131n(t2, i)) {
                        C4015u7.m9237c(t, j2, C4015u7.m9246l(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 3:
                    if (m9131n(t2, i)) {
                        C4015u7.m9237c(t, j2, C4015u7.m9246l(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 4:
                    if (m9131n(t2, i)) {
                        C4015u7.f22897f.m9263c(t, j2, C4015u7.m9244j(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 5:
                    if (m9131n(t2, i)) {
                        C4015u7.m9237c(t, j2, C4015u7.m9246l(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 6:
                    if (m9131n(t2, i)) {
                        C4015u7.f22897f.m9263c(t, j2, C4015u7.m9244j(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 7:
                    if (m9131n(t2, i)) {
                        C4015u7.f22897f.mo9257e(t, j2, C4015u7.m9247m(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 8:
                    if (m9131n(t2, i)) {
                        C4015u7.m9238d(t, j2, C4015u7.m9252r(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 9:
                    m9130m(t, t2, i);
                    break;
                case 10:
                    if (m9131n(t2, i)) {
                        C4015u7.m9238d(t, j2, C4015u7.m9252r(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 11:
                    if (m9131n(t2, i)) {
                        C4015u7.f22897f.m9263c(t, j2, C4015u7.m9244j(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 12:
                    if (m9131n(t2, i)) {
                        C4015u7.f22897f.m9263c(t, j2, C4015u7.m9244j(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 13:
                    if (m9131n(t2, i)) {
                        C4015u7.f22897f.m9263c(t, j2, C4015u7.m9244j(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 14:
                    if (m9131n(t2, i)) {
                        C4015u7.m9237c(t, j2, C4015u7.m9246l(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 15:
                    if (m9131n(t2, i)) {
                        C4015u7.f22897f.m9263c(t, j2, C4015u7.m9244j(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 16:
                    if (m9131n(t2, i)) {
                        C4015u7.m9237c(t, j2, C4015u7.m9246l(t2, j2));
                        m9134q(t, i);
                    }
                    break;
                case 17:
                    m9130m(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f22802l.mo9208b(t, t2, j2);
                    break;
                case 50:
                    InterfaceC3865f6 interfaceC3865f6 = this.f22805o;
                    Class<?> cls = C3826b7.f22526a;
                    C4015u7.m9238d(t, j2, interfaceC3865f6.mo9016a(C4015u7.m9252r(t, j2), C4015u7.m9252r(t2, j2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m9132o(t2, i2, i)) {
                        C4015u7.m9238d(t, j2, C4015u7.m9252r(t2, j2));
                        m9135r(t, i2, i);
                    }
                    break;
                case 60:
                    m9137t(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m9132o(t2, i2, i)) {
                        C4015u7.m9238d(t, j2, C4015u7.m9252r(t2, j2));
                        m9135r(t, i2, i);
                    }
                    break;
                case 68:
                    m9137t(t, t2, i);
                    break;
            }
        }
        AbstractC3946n7<?, ?> abstractC3946n7 = this.f22803m;
        Class<?> cls2 = C3826b7.f22526a;
        abstractC3946n7.mo9161d(t, abstractC3946n7.mo9162e(abstractC3946n7.mo9164g(t), abstractC3946n7.mo9164g(t2)));
        if (this.f22796f) {
            C3826b7.m8982d(this.f22804n, t, t2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01e1 A[PHI: r2
  0x01e1: PHI (r2v32 int) = (r2v10 int), (r2v33 int) binds: [B:81:0x01de, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: g */
    public final int mo9128g(T t) {
        int i;
        int iM8931b;
        int i2;
        int length = this.f22793c.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM9140w = m9140w(i4);
            int i5 = this.f22793c[i4];
            long j2 = 1048575 & iM9140w;
            int iHashCode = 37;
            int i6 = 1231;
            switch ((iM9140w & 267386880) >>> 20) {
                case 0:
                    i = i3 * 53;
                    iM8931b = C3814a5.m8931b(Double.doubleToLongBits(C4015u7.m9251q(t, j2)));
                    i3 = iM8931b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM8931b = Float.floatToIntBits(C4015u7.m9250p(t, j2));
                    i3 = iM8931b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM8931b = C3814a5.m8931b(C4015u7.m9246l(t, j2));
                    i3 = iM8931b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM8931b = C3814a5.m8931b(C4015u7.m9246l(t, j2));
                    i3 = iM8931b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iM8931b = C4015u7.m9244j(t, j2);
                    i3 = iM8931b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iM8931b = C3814a5.m8931b(C4015u7.m9246l(t, j2));
                    i3 = iM8931b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iM8931b = C4015u7.m9244j(t, j2);
                    i3 = iM8931b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zM9247m = C4015u7.m9247m(t, j2);
                    Charset charset = C3814a5.f22506a;
                    if (!zM9247m) {
                        i6 = 1237;
                    }
                    i3 = i2 + i6;
                    break;
                case 8:
                    i = i3 * 53;
                    iM8931b = ((String) C4015u7.m9252r(t, j2)).hashCode();
                    i3 = iM8931b + i;
                    break;
                case 9:
                    Object objM9252r = C4015u7.m9252r(t, j2);
                    if (objM9252r != null) {
                        iHashCode = objM9252r.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM8931b = C4015u7.m9252r(t, j2).hashCode();
                    i3 = iM8931b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iM8931b = C4015u7.m9244j(t, j2);
                    i3 = iM8931b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iM8931b = C4015u7.m9244j(t, j2);
                    i3 = iM8931b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iM8931b = C4015u7.m9244j(t, j2);
                    i3 = iM8931b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iM8931b = C3814a5.m8931b(C4015u7.m9246l(t, j2));
                    i3 = iM8931b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iM8931b = C4015u7.m9244j(t, j2);
                    i3 = iM8931b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iM8931b = C3814a5.m8931b(C4015u7.m9246l(t, j2));
                    i3 = iM8931b + i;
                    break;
                case 17:
                    Object objM9252r2 = C4015u7.m9252r(t, j2);
                    if (objM9252r2 != null) {
                        iHashCode = objM9252r2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iM8931b = C4015u7.m9252r(t, j2).hashCode();
                    i3 = iM8931b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM8931b = C4015u7.m9252r(t, j2).hashCode();
                    i3 = iM8931b + i;
                    break;
                case 51:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = C3814a5.m8931b(Double.doubleToLongBits(m9112A(t, j2)));
                        i3 = iM8931b + i;
                    }
                    break;
                case 52:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = Float.floatToIntBits(m9113B(t, j2));
                        i3 = iM8931b + i;
                    }
                    break;
                case 53:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = C3814a5.m8931b(m9115D(t, j2));
                        i3 = iM8931b + i;
                    }
                    break;
                case 54:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = C3814a5.m8931b(m9115D(t, j2));
                        i3 = iM8931b + i;
                    }
                    break;
                case 55:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = m9114C(t, j2);
                        i3 = iM8931b + i;
                    }
                    break;
                case 56:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = C3814a5.m8931b(m9115D(t, j2));
                        i3 = iM8931b + i;
                    }
                    break;
                case 57:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = m9114C(t, j2);
                        i3 = iM8931b + i;
                    }
                    break;
                case 58:
                    if (m9132o(t, i5, i4)) {
                        i2 = i3 * 53;
                        boolean zM9116E = m9116E(t, j2);
                        Charset charset2 = C3814a5.f22506a;
                        if (!zM9116E) {
                            i6 = 1237;
                        }
                        i3 = i2 + i6;
                    }
                    break;
                case 59:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = ((String) C4015u7.m9252r(t, j2)).hashCode();
                        i3 = iM8931b + i;
                    }
                    break;
                case 60:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = C4015u7.m9252r(t, j2).hashCode();
                        i3 = iM8931b + i;
                    }
                    break;
                case 61:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = C4015u7.m9252r(t, j2).hashCode();
                        i3 = iM8931b + i;
                    }
                    break;
                case 62:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = m9114C(t, j2);
                        i3 = iM8931b + i;
                    }
                    break;
                case 63:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = m9114C(t, j2);
                        i3 = iM8931b + i;
                    }
                    break;
                case 64:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = m9114C(t, j2);
                        i3 = iM8931b + i;
                    }
                    break;
                case 65:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = C3814a5.m8931b(m9115D(t, j2));
                        i3 = iM8931b + i;
                    }
                    break;
                case 66:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = m9114C(t, j2);
                        i3 = iM8931b + i;
                    }
                    break;
                case 67:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = C3814a5.m8931b(m9115D(t, j2));
                        i3 = iM8931b + i;
                    }
                    break;
                case 68:
                    if (m9132o(t, i5, i4)) {
                        i = i3 * 53;
                        iM8931b = C4015u7.m9252r(t, j2).hashCode();
                        i3 = iM8931b + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f22803m.mo9164g(t).hashCode() + (i3 * 53);
        return this.f22796f ? (iHashCode2 * 53) + this.f22804n.mo9175c(t).hashCode() : iHashCode2;
    }

    /* JADX INFO: renamed from: l */
    public final <K, V> void m9129l(InterfaceC3887h8 interfaceC3887h8, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            C3845d6<?, ?> c3845d6Mo9018c = this.f22805o.mo9018c(this.f22794d[(i2 / 3) << 1]);
            Map<?, ?> mapMo9020h = this.f22805o.mo9020h(obj);
            C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
            Objects.requireNonNull(c3943n4);
            Iterator<Map.Entry<?, ?>> it = mapMo9020h.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                c3943n4.f22821a.mo9086B(i, 2);
                next.getKey();
                next.getValue();
                Objects.requireNonNull(c3845d6Mo9018c);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m9130m(T t, T t2, int i) {
        long j2 = this.f22793c[i + 1] & 1048575;
        if (m9131n(t2, i)) {
            Object objM9252r = C4015u7.m9252r(t, j2);
            Object objM9252r2 = C4015u7.m9252r(t2, j2);
            if (objM9252r != null && objM9252r2 != null) {
                C4015u7.m9238d(t, j2, C3814a5.m8930a(objM9252r, objM9252r2));
                m9134q(t, i);
            } else if (objM9252r2 != null) {
                C4015u7.m9238d(t, j2, objM9252r2);
                m9134q(t, i);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m9131n(T t, int i) {
        if (!this.f22797g) {
            int i2 = this.f22793c[i + 2];
            return (C4015u7.m9244j(t, (long) (i2 & 1048575)) & (1 << (i2 >>> 20))) != 0;
        }
        int i3 = this.f22793c[i + 1];
        long j2 = i3 & 1048575;
        switch ((i3 & 267386880) >>> 20) {
            case 0:
                return C4015u7.m9251q(t, j2) != 0.0d;
            case 1:
                return C4015u7.m9250p(t, j2) != 0.0f;
            case 2:
                return C4015u7.m9246l(t, j2) != 0;
            case 3:
                return C4015u7.m9246l(t, j2) != 0;
            case 4:
                return C4015u7.m9244j(t, j2) != 0;
            case 5:
                return C4015u7.m9246l(t, j2) != 0;
            case 6:
                return C4015u7.m9244j(t, j2) != 0;
            case 7:
                return C4015u7.m9247m(t, j2);
            case 8:
                Object objM9252r = C4015u7.m9252r(t, j2);
                if (objM9252r instanceof String) {
                    return !((String) objM9252r).isEmpty();
                }
                if (objM9252r instanceof AbstractC3823b4) {
                    return !AbstractC3823b4.f22519f.equals(objM9252r);
                }
                throw new IllegalArgumentException();
            case 9:
                return C4015u7.m9252r(t, j2) != null;
            case 10:
                return !AbstractC3823b4.f22519f.equals(C4015u7.m9252r(t, j2));
            case 11:
                return C4015u7.m9244j(t, j2) != 0;
            case 12:
                return C4015u7.m9244j(t, j2) != 0;
            case 13:
                return C4015u7.m9244j(t, j2) != 0;
            case 14:
                return C4015u7.m9246l(t, j2) != 0;
            case 15:
                return C4015u7.m9244j(t, j2) != 0;
            case 16:
                return C4015u7.m9246l(t, j2) != 0;
            case 17:
                return C4015u7.m9252r(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9132o(T t, int i, int i2) {
        return C4015u7.m9244j(t, (long) (this.f22793c[i2 + 2] & 1048575)) == i;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m9133p(T t, int i, int i2, int i3) {
        if (this.f22797g) {
            return m9131n(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m9134q(T t, int i) {
        if (this.f22797g) {
            return;
        }
        int i2 = this.f22793c[i + 2];
        long j2 = i2 & 1048575;
        C4015u7.f22897f.m9263c(t, j2, C4015u7.m9244j(t, j2) | (1 << (i2 >>> 20)));
    }

    /* JADX INFO: renamed from: r */
    public final void m9135r(T t, int i, int i2) {
        C4015u7.f22897f.m9263c(t, this.f22793c[i2 + 2] & 1048575, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: s */
    public final void m9136s(T t, InterfaceC3887h8 interfaceC3887h8) throws IOException {
        Iterator itM9195b;
        Map.Entry<?, ?> entry;
        int i;
        if (this.f22796f) {
            C3973q4<T> c3973q4Mo9175c = this.f22804n.mo9175c(t);
            if (c3973q4Mo9175c.f22847b.isEmpty()) {
                itM9195b = null;
                entry = null;
            } else {
                itM9195b = c3973q4Mo9175c.m9195b();
                entry = (Map.Entry) itM9195b.next();
            }
        } else {
            itM9195b = null;
            entry = null;
        }
        int i2 = -1;
        int length = this.f22793c.length;
        Unsafe unsafe = f22792b;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int iM9140w = m9140w(i3);
            int[] iArr = this.f22793c;
            int i5 = iArr[i3];
            int i6 = (267386880 & iM9140w) >>> 20;
            if (this.f22797g || i6 > 17) {
                i = 0;
            } else {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & 1048575;
                if (i8 != i2) {
                    i4 = unsafe.getInt(t, i8);
                    i2 = i8;
                }
                i = 1 << (i7 >>> 20);
            }
            while (entry != null && this.f22804n.mo9173a(entry) <= i5) {
                this.f22804n.mo9174b(interfaceC3887h8, entry);
                entry = itM9195b.hasNext() ? (Map.Entry) itM9195b.next() : null;
            }
            long j2 = iM9140w & 1048575;
            int i9 = i3;
            switch (i6) {
                case 0:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).m9150a(i5, C4015u7.m9251q(t, j2));
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 1:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).m9151b(i5, C4015u7.m9250p(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 2:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9093b(i5, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 3:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9093b(i5, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 4:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9087D(i5, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 5:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9104z(i5, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 6:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9089I(i5, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 7:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9102s(i5, C4015u7.m9247m(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 8:
                    if ((i & i4) != 0) {
                        m9119j(i5, unsafe.getObject(t, j2), interfaceC3887h8);
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 9:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).m9152c(i5, unsafe.getObject(t, j2), m9138u(i9));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 10:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9094c(i5, (AbstractC3823b4) unsafe.getObject(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 11:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9088F(i5, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 12:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9087D(i5, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 13:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9089I(i5, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 14:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9104z(i5, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 15:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).m9156g(i5, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 16:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).m9153d(i5, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 17:
                    if ((i & i4) != 0) {
                        ((C3943n4) interfaceC3887h8).m9155f(i5, unsafe.getObject(t, j2), m9138u(i9));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 18:
                    C3826b7.m8981c(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 19:
                    C3826b7.m8985g(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 20:
                    C3826b7.m8989k(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 21:
                    C3826b7.m8992n(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 22:
                    C3826b7.m9000v(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 23:
                    C3826b7.m8996r(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 24:
                    C3826b7.m8962B(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 25:
                    C3826b7.m8968H(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 26:
                    C3826b7.m8979a(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8);
                    break;
                case 27:
                    C3826b7.m8980b(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, m9138u(i9));
                    break;
                case 28:
                    C3826b7.m8983e(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8);
                    break;
                case 29:
                    C3826b7.m9002x(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 30:
                    C3826b7.m8966F(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 31:
                    C3826b7.m8964D(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 32:
                    C3826b7.m8998t(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 33:
                    C3826b7.m9004z(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 34:
                    C3826b7.m8993o(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 35:
                    C3826b7.m8981c(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 36:
                    C3826b7.m8985g(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 37:
                    C3826b7.m8989k(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 38:
                    C3826b7.m8992n(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 39:
                    C3826b7.m9000v(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 40:
                    C3826b7.m8996r(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 41:
                    C3826b7.m8962B(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 42:
                    C3826b7.m8968H(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 43:
                    C3826b7.m9002x(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 44:
                    C3826b7.m8966F(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 45:
                    C3826b7.m8964D(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 46:
                    C3826b7.m8998t(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 47:
                    C3826b7.m9004z(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 48:
                    C3826b7.m8993o(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, true);
                    break;
                case 49:
                    C3826b7.m8984f(this.f22793c[i9], (List) unsafe.getObject(t, j2), interfaceC3887h8, m9138u(i9));
                    break;
                case 50:
                    m9129l(interfaceC3887h8, i5, unsafe.getObject(t, j2), i9);
                    break;
                case 51:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).m9150a(i5, m9112A(t, j2));
                    }
                    break;
                case 52:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).m9151b(i5, m9113B(t, j2));
                    }
                    break;
                case 53:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9093b(i5, m9115D(t, j2));
                    }
                    break;
                case 54:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9093b(i5, m9115D(t, j2));
                    }
                    break;
                case 55:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9087D(i5, m9114C(t, j2));
                    }
                    break;
                case 56:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9104z(i5, m9115D(t, j2));
                    }
                    break;
                case 57:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9089I(i5, m9114C(t, j2));
                    }
                    break;
                case 58:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9102s(i5, m9116E(t, j2));
                    }
                    break;
                case 59:
                    if (m9132o(t, i5, i9)) {
                        m9119j(i5, unsafe.getObject(t, j2), interfaceC3887h8);
                    }
                    break;
                case 60:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).m9152c(i5, unsafe.getObject(t, j2), m9138u(i9));
                    }
                    break;
                case 61:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9094c(i5, (AbstractC3823b4) unsafe.getObject(t, j2));
                    }
                    break;
                case 62:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9088F(i5, m9114C(t, j2));
                    }
                    break;
                case 63:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9087D(i5, m9114C(t, j2));
                    }
                    break;
                case 64:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9089I(i5, m9114C(t, j2));
                    }
                    break;
                case 65:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).f22821a.mo9104z(i5, m9115D(t, j2));
                    }
                    break;
                case 66:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).m9156g(i5, m9114C(t, j2));
                    }
                    break;
                case 67:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).m9153d(i5, m9115D(t, j2));
                    }
                    break;
                case 68:
                    if (m9132o(t, i5, i9)) {
                        ((C3943n4) interfaceC3887h8).m9155f(i5, unsafe.getObject(t, j2), m9138u(i9));
                    }
                    break;
            }
            i3 = i9 + 3;
        }
        while (entry != null) {
            this.f22804n.mo9174b(interfaceC3887h8, entry);
            entry = itM9195b.hasNext() ? (Map.Entry) itM9195b.next() : null;
        }
        m9120k(this.f22803m, t, interfaceC3887h8);
    }

    /* JADX INFO: renamed from: t */
    public final void m9137t(T t, T t2, int i) {
        int[] iArr = this.f22793c;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long j2 = i2 & 1048575;
        if (m9132o(t2, i3, i)) {
            Object objM9252r = C4015u7.m9252r(t, j2);
            Object objM9252r2 = C4015u7.m9252r(t2, j2);
            if (objM9252r != null && objM9252r2 != null) {
                C4015u7.m9238d(t, j2, C3814a5.m8930a(objM9252r, objM9252r2));
                m9135r(t, i3, i);
            } else if (objM9252r2 != null) {
                C4015u7.m9238d(t, j2, objM9252r2);
                m9135r(t, i3, i);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC4059z6 m9138u(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.f22794d;
        InterfaceC4059z6 interfaceC4059z6 = (InterfaceC4059z6) objArr[i2];
        if (interfaceC4059z6 != null) {
            return interfaceC4059z6;
        }
        InterfaceC4059z6<T> interfaceC4059z6M9222a = C4005t6.f22879a.m9222a((Class) objArr[i2 + 1]);
        this.f22794d[i2] = interfaceC4059z6M9222a;
        return interfaceC4059z6M9222a;
    }

    /* JADX INFO: renamed from: v */
    public final Object m9139v(int i) {
        return this.f22794d[(i / 3) << 1];
    }

    /* JADX INFO: renamed from: w */
    public final int m9140w(int i) {
        return this.f22793c[i + 1];
    }

    /* JADX INFO: renamed from: x */
    public final int m9141x(int i) {
        return this.f22793c[i + 2];
    }

    /* JADX INFO: renamed from: y */
    public final boolean m9142y(T t, T t2, int i) {
        return m9131n(t, i) == m9131n(t2, i);
    }
}
