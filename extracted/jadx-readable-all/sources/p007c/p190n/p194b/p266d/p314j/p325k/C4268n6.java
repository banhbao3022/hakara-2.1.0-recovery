package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: c.n.b.d.j.k.n6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4268n6<T> implements InterfaceC4431z6<T> {

    /* JADX INFO: renamed from: a */
    public static final int[] f23350a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final Unsafe f23351b = C4353t7.m10234m();

    /* JADX INFO: renamed from: c */
    public final int[] f23352c;

    /* JADX INFO: renamed from: d */
    public final Object[] f23353d;

    /* JADX INFO: renamed from: e */
    public final int f23354e;

    /* JADX INFO: renamed from: f */
    public final int f23355f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4240l6 f23356g;

    /* JADX INFO: renamed from: h */
    public final boolean f23357h;

    /* JADX INFO: renamed from: i */
    public final boolean f23358i;

    /* JADX INFO: renamed from: j */
    public final boolean f23359j;

    /* JADX INFO: renamed from: k */
    public final int[] f23360k;

    /* JADX INFO: renamed from: l */
    public final int f23361l;

    /* JADX INFO: renamed from: m */
    public final int f23362m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC4324r6 f23363n;

    /* JADX INFO: renamed from: o */
    public final AbstractC4378v5 f23364o;

    /* JADX INFO: renamed from: p */
    public final AbstractC4269n7<?, ?> f23365p;

    /* JADX INFO: renamed from: q */
    public final AbstractC4308q4<?> f23366q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC4142e6 f23367r;

    public C4268n6(int[] iArr, Object[] objArr, int i, int i2, InterfaceC4240l6 interfaceC4240l6, boolean z, int[] iArr2, int i3, int i4, InterfaceC4324r6 interfaceC4324r6, AbstractC4378v5 abstractC4378v5, AbstractC4269n7 abstractC4269n7, AbstractC4308q4 abstractC4308q4, InterfaceC4142e6 interfaceC4142e6) {
        this.f23352c = iArr;
        this.f23353d = objArr;
        this.f23354e = i;
        this.f23355f = i2;
        this.f23358i = interfaceC4240l6 instanceof AbstractC4099b5;
        this.f23359j = z;
        this.f23357h = abstractC4308q4 != null && abstractC4308q4.mo10165h(interfaceC4240l6);
        this.f23360k = iArr2;
        this.f23361l = i3;
        this.f23362m = i4;
        this.f23363n = interfaceC4324r6;
        this.f23364o = abstractC4378v5;
        this.f23365p = abstractC4269n7;
        this.f23366q = abstractC4308q4;
        this.f23356g = interfaceC4240l6;
        this.f23367r = interfaceC4142e6;
    }

    /* JADX INFO: renamed from: A */
    public static <T> double m10033A(T t, long j2) {
        return ((Double) C4353t7.m10241t(t, j2)).doubleValue();
    }

    /* JADX INFO: renamed from: H */
    public static <T> float m10034H(T t, long j2) {
        return ((Float) C4353t7.m10241t(t, j2)).floatValue();
    }

    /* JADX INFO: renamed from: L */
    public static <T> int m10035L(T t, long j2) {
        return ((Integer) C4353t7.m10241t(t, j2)).intValue();
    }

    /* JADX INFO: renamed from: N */
    public static <T> long m10036N(T t, long j2) {
        return ((Long) C4353t7.m10241t(t, j2)).longValue();
    }

    /* JADX INFO: renamed from: O */
    public static C4255m7 m10037O(Object obj) {
        AbstractC4099b5 abstractC4099b5 = (AbstractC4099b5) obj;
        C4255m7 c4255m7 = abstractC4099b5.zzb;
        if (c4255m7 != C4255m7.f23317a) {
            return c4255m7;
        }
        C4255m7 c4255m7M10010c = C4255m7.m10010c();
        abstractC4099b5.zzb = c4255m7M10010c;
        return c4255m7M10010c;
    }

    /* JADX INFO: renamed from: P */
    public static <T> boolean m10038P(T t, long j2) {
        return ((Boolean) C4353t7.m10241t(t, j2)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:182:0x03a5  */
    /* JADX INFO: renamed from: n */
    public static C4268n6 m10039n(InterfaceC4212j6 interfaceC4212j6, InterfaceC4324r6 interfaceC4324r6, AbstractC4378v5 abstractC4378v5, AbstractC4269n7 abstractC4269n7, AbstractC4308q4 abstractC4308q4, InterfaceC4142e6 interfaceC4142e6) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        int i7;
        char cCharAt4;
        int i8;
        char cCharAt5;
        int i9;
        char cCharAt6;
        int i10;
        char cCharAt7;
        int i11;
        char cCharAt8;
        int i12;
        int i13;
        int i14;
        int i15;
        C4405x6 c4405x6;
        int i16;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i17;
        Field fieldM10040q;
        int i18;
        char cCharAt9;
        int i19;
        int i20;
        Field fieldM10040q2;
        Field fieldM10040q3;
        int i21;
        char cCharAt10;
        int i22;
        char cCharAt11;
        int i23;
        char cCharAt12;
        int i24;
        char cCharAt13;
        if (!(interfaceC4212j6 instanceof C4405x6)) {
            throw new NoSuchMethodError();
        }
        C4405x6 c4405x7 = (C4405x6) interfaceC4212j6;
        int i25 = 0;
        boolean z = ((c4405x7.f23626d & 1) == 1 ? (char) 1 : (char) 2) == 2;
        String str = c4405x7.f23624b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i26 = 1;
            while (true) {
                i = i26 + 1;
                if (str.charAt(i26) < 55296) {
                    break;
                }
                i26 = i;
            }
        } else {
            i = 1;
        }
        int i27 = i + 1;
        int iCharAt5 = str.charAt(i);
        if (iCharAt5 >= 55296) {
            int i28 = iCharAt5 & 8191;
            int i29 = 13;
            while (true) {
                i24 = i27 + 1;
                cCharAt13 = str.charAt(i27);
                if (cCharAt13 < 55296) {
                    break;
                }
                i28 |= (cCharAt13 & 8191) << i29;
                i29 += 13;
                i27 = i24;
            }
            iCharAt5 = i28 | (cCharAt13 << i29);
            i27 = i24;
        }
        if (iCharAt5 == 0) {
            iArr = f23350a;
            i3 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i2 = 0;
            iCharAt4 = 0;
        } else {
            int i30 = i27 + 1;
            int iCharAt6 = str.charAt(i27);
            if (iCharAt6 >= 55296) {
                int i31 = iCharAt6 & 8191;
                int i32 = 13;
                while (true) {
                    i11 = i30 + 1;
                    cCharAt8 = str.charAt(i30);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i31 |= (cCharAt8 & 8191) << i32;
                    i32 += 13;
                    i30 = i11;
                }
                iCharAt6 = i31 | (cCharAt8 << i32);
                i30 = i11;
            }
            int i33 = i30 + 1;
            int iCharAt7 = str.charAt(i30);
            if (iCharAt7 >= 55296) {
                int i34 = iCharAt7 & 8191;
                int i35 = 13;
                while (true) {
                    i10 = i33 + 1;
                    cCharAt7 = str.charAt(i33);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt7 & 8191) << i35;
                    i35 += 13;
                    i33 = i10;
                }
                iCharAt7 = i34 | (cCharAt7 << i35);
                i33 = i10;
            }
            int i36 = i33 + 1;
            iCharAt = str.charAt(i33);
            if (iCharAt >= 55296) {
                int i37 = iCharAt & 8191;
                int i38 = 13;
                while (true) {
                    i9 = i36 + 1;
                    cCharAt6 = str.charAt(i36);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt6 & 8191) << i38;
                    i38 += 13;
                    i36 = i9;
                }
                iCharAt = i37 | (cCharAt6 << i38);
                i36 = i9;
            }
            int i39 = i36 + 1;
            iCharAt2 = str.charAt(i36);
            if (iCharAt2 >= 55296) {
                int i40 = iCharAt2 & 8191;
                int i41 = 13;
                while (true) {
                    i8 = i39 + 1;
                    cCharAt5 = str.charAt(i39);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt5 & 8191) << i41;
                    i41 += 13;
                    i39 = i8;
                }
                iCharAt2 = i40 | (cCharAt5 << i41);
                i39 = i8;
            }
            int i42 = i39 + 1;
            iCharAt3 = str.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i7 = i42 + 1;
                    cCharAt4 = str.charAt(i42);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt4 & 8191) << i44;
                    i44 += 13;
                    i42 = i7;
                }
                iCharAt3 = i43 | (cCharAt4 << i44);
                i42 = i7;
            }
            int i45 = i42 + 1;
            int iCharAt8 = str.charAt(i42);
            if (iCharAt8 >= 55296) {
                int i46 = iCharAt8 & 8191;
                int i47 = 13;
                while (true) {
                    i6 = i45 + 1;
                    cCharAt3 = str.charAt(i45);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt3 & 8191) << i47;
                    i47 += 13;
                    i45 = i6;
                }
                iCharAt8 = i46 | (cCharAt3 << i47);
                i45 = i6;
            }
            int i48 = i45 + 1;
            int iCharAt9 = str.charAt(i45);
            if (iCharAt9 >= 55296) {
                int i49 = iCharAt9 & 8191;
                int i50 = 13;
                while (true) {
                    i5 = i48 + 1;
                    cCharAt2 = str.charAt(i48);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt2 & 8191) << i50;
                    i50 += 13;
                    i48 = i5;
                }
                iCharAt9 = i49 | (cCharAt2 << i50);
                i48 = i5;
            }
            int i51 = i48 + 1;
            iCharAt4 = str.charAt(i48);
            if (iCharAt4 >= 55296) {
                int i52 = iCharAt4 & 8191;
                int i53 = i51;
                int i54 = 13;
                while (true) {
                    i4 = i53 + 1;
                    cCharAt = str.charAt(i53);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i52 |= (cCharAt & 8191) << i54;
                    i54 += 13;
                    i53 = i4;
                }
                iCharAt4 = i52 | (cCharAt << i54);
                i51 = i4;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt8 + iCharAt9];
            i2 = (iCharAt6 << 1) + iCharAt7;
            i3 = iCharAt8;
            iArr = iArr2;
            i25 = iCharAt6;
            i27 = i51;
        }
        Unsafe unsafe = f23351b;
        Object[] objArr = c4405x7.f23625c;
        Class<?> cls = c4405x7.f23623a.getClass();
        int i55 = i27;
        int[] iArr3 = new int[iCharAt3 * 3];
        Object[] objArr2 = new Object[iCharAt3 << 1];
        int i56 = iCharAt4 + i3;
        int i57 = iCharAt4;
        int i58 = i55;
        int i59 = i56;
        int i60 = 0;
        int i61 = 0;
        while (i58 < length) {
            int i62 = i58 + 1;
            int iCharAt10 = str.charAt(i58);
            int i63 = length;
            if (iCharAt10 >= 55296) {
                int i64 = iCharAt10 & 8191;
                int i65 = i62;
                int i66 = 13;
                while (true) {
                    i23 = i65 + 1;
                    cCharAt12 = str.charAt(i65);
                    i12 = iCharAt4;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt12 & 8191) << i66;
                    i66 += 13;
                    i65 = i23;
                    iCharAt4 = i12;
                }
                iCharAt10 = i64 | (cCharAt12 << i66);
                i13 = i23;
            } else {
                i12 = iCharAt4;
                i13 = i62;
            }
            int i67 = i13 + 1;
            int iCharAt11 = str.charAt(i13);
            if (iCharAt11 >= 55296) {
                int i68 = iCharAt11 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i22 = i69 + 1;
                    cCharAt11 = str.charAt(i69);
                    i14 = iCharAt2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt11 & 8191) << i70;
                    i70 += 13;
                    i69 = i22;
                    iCharAt2 = i14;
                }
                iCharAt11 = i68 | (cCharAt11 << i70);
                i15 = i22;
            } else {
                i14 = iCharAt2;
                i15 = i67;
            }
            int i71 = iCharAt11 & 255;
            int i72 = iCharAt;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i60] = i61;
                i60++;
            }
            if (i71 >= 51) {
                int i73 = i15 + 1;
                int iCharAt12 = str.charAt(i15);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i74 = 13;
                    int i75 = iCharAt12 & 8191;
                    int i76 = i73;
                    while (true) {
                        i21 = i76 + 1;
                        cCharAt10 = str.charAt(i76);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i75 |= (cCharAt10 & 8191) << i74;
                        i74 += 13;
                        i76 = i21;
                        c2 = 55296;
                    }
                    iCharAt12 = i75 | (cCharAt10 << i74);
                    i20 = i21;
                } else {
                    i20 = i73;
                }
                int i77 = i20;
                int i78 = i71 - 51;
                c4405x6 = c4405x7;
                if (i78 == 9 || i78 == 17) {
                    objArr2[((i61 / 3) << 1) + 1] = objArr[i2];
                    i2++;
                } else if (i78 == 12 && !z) {
                    objArr2[((i61 / 3) << 1) + 1] = objArr[i2];
                    i2++;
                }
                int i79 = iCharAt12 << 1;
                Object obj = objArr[i79];
                if (obj instanceof Field) {
                    fieldM10040q2 = (Field) obj;
                } else {
                    fieldM10040q2 = m10040q(cls, (String) obj);
                    objArr[i79] = fieldM10040q2;
                }
                int i80 = i2;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10040q2);
                int i81 = i79 + 1;
                Object obj2 = objArr[i81];
                if (obj2 instanceof Field) {
                    fieldM10040q3 = (Field) obj2;
                } else {
                    fieldM10040q3 = m10040q(cls, (String) obj2);
                    objArr[i81] = fieldM10040q3;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM10040q3);
                str = str;
                z = z;
                i15 = i77;
                i16 = i80;
                iObjectFieldOffset2 = iObjectFieldOffset3;
                objArr2 = objArr2;
                i17 = 0;
            } else {
                c4405x6 = c4405x7;
                i16 = i2 + 1;
                Field fieldM10040q4 = m10040q(cls, (String) objArr[i2]);
                if (i71 == 9 || i71 == 17) {
                    objArr2[((i61 / 3) << 1) + 1] = fieldM10040q4.getType();
                } else {
                    if (i71 == 27 || i71 == 49) {
                        i19 = i16 + 1;
                        objArr2[((i61 / 3) << 1) + 1] = objArr[i16];
                    } else {
                        if (i71 == 12 || i71 == 30 || i71 == 44) {
                            if (!z) {
                                i19 = i16 + 1;
                                objArr2[((i61 / 3) << 1) + 1] = objArr[i16];
                            }
                        } else if (i71 == 50) {
                            int i82 = i57 + 1;
                            iArr[i57] = i61;
                            int i83 = (i61 / 3) << 1;
                            i19 = i16 + 1;
                            objArr2[i83] = objArr[i16];
                            if ((iCharAt11 & 2048) != 0) {
                                i16 = i19 + 1;
                                objArr2[i83 + 1] = objArr[i19];
                                i57 = i82;
                            } else {
                                i57 = i82;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10040q4);
                        if ((iCharAt11 & 4096) == 4096 || i71 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i17 = 0;
                        } else {
                            int i84 = i15 + 1;
                            int iCharAt13 = str.charAt(i15);
                            if (iCharAt13 >= 55296) {
                                int i85 = iCharAt13 & 8191;
                                int i86 = 13;
                                while (true) {
                                    i18 = i84 + 1;
                                    cCharAt9 = str.charAt(i84);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i85 |= (cCharAt9 & 8191) << i86;
                                    i86 += 13;
                                    i84 = i18;
                                }
                                iCharAt13 = i85 | (cCharAt9 << i86);
                                i84 = i18;
                            }
                            int i87 = (iCharAt13 / 32) + (i25 << 1);
                            Object obj3 = objArr[i87];
                            if (obj3 instanceof Field) {
                                fieldM10040q = (Field) obj3;
                            } else {
                                fieldM10040q = m10040q(cls, (String) obj3);
                                objArr[i87] = fieldM10040q;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM10040q);
                            i17 = iCharAt13 % 32;
                            i15 = i84;
                        }
                        if (i71 >= 18 && i71 <= 49) {
                            iArr[i59] = iObjectFieldOffset;
                            i59++;
                        }
                    }
                    i16 = i19;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10040q4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i17 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i17 = 0;
                }
                if (i71 >= 18) {
                    iArr[i59] = iObjectFieldOffset;
                    i59++;
                }
            }
            int i88 = i61 + 1;
            iArr3[i61] = iCharAt10;
            int i89 = i88 + 1;
            iArr3[i88] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i71 << 20) | iObjectFieldOffset;
            i61 = i89 + 1;
            iArr3[i89] = (i17 << 20) | iObjectFieldOffset2;
            z = z;
            i58 = i15;
            iCharAt = i72;
            length = i63;
            iCharAt4 = i12;
            iCharAt2 = i14;
            objArr2 = objArr2;
            str = str;
            i2 = i16;
            c4405x7 = c4405x6;
        }
        return new C4268n6(iArr3, objArr2, iCharAt, iCharAt2, c4405x7.f23623a, z, iArr, iCharAt4, i56, interfaceC4324r6, abstractC4378v5, abstractC4269n7, abstractC4308q4, interfaceC4142e6);
    }

    /* JADX INFO: renamed from: q */
    public static Field m10040q(Class<?> cls, String str) {
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

    /* JADX INFO: renamed from: r */
    public static List<?> m10041r(Object obj, long j2) {
        return (List) C4353t7.m10241t(obj, j2);
    }

    /* JADX INFO: renamed from: s */
    public static void m10042s(int i, Object obj, InterfaceC4158f8 interfaceC4158f8) throws IOException {
        if (obj instanceof String) {
            ((C4266n4) interfaceC4158f8).f23336a.mo9983k(i, (String) obj);
        } else {
            ((C4266n4) interfaceC4158f8).f23336a.mo9980h(i, (AbstractC4402x3) obj);
        }
    }

    /* JADX INFO: renamed from: t */
    public static <UT, UB> void m10043t(AbstractC4269n7<UT, UB> abstractC4269n7, T t, InterfaceC4158f8 interfaceC4158f8) throws IOException {
        abstractC4269n7.mo10082g(abstractC4269n7.mo10086k(t), interfaceC4158f8);
    }

    /* JADX INFO: renamed from: B */
    public final int m10044B(int i, int i2) {
        int length = (this.f23352c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f23352c[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: C */
    public final Object m10045C(int i) {
        return this.f23353d[(i / 3) << 1];
    }

    /* JADX INFO: renamed from: D */
    public final void m10046D(T t, int i) {
        int i2 = this.f23352c[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        C4353t7.f23479e.m10253e(t, j2, (1 << (i2 >>> 20)) | C4353t7.m10223b(t, j2));
    }

    /* JADX INFO: renamed from: E */
    public final void m10047E(T t, int i, int i2) {
        C4353t7.f23479e.m10253e(t, this.f23352c[i2 + 2] & 1048575, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: F */
    public final void m10048F(T t, InterfaceC4158f8 interfaceC4158f8) throws IOException {
        Iterator itM10276l;
        Map.Entry<?, ?> entry;
        int i;
        if (this.f23357h) {
            C4364u4<T> c4364u4Mo10159b = this.f23366q.mo10159b(t);
            if (c4364u4Mo10159b.f23500b.isEmpty()) {
                itM10276l = null;
                entry = null;
            } else {
                itM10276l = c4364u4Mo10159b.m10276l();
                entry = (Map.Entry) itM10276l.next();
            }
        } else {
            itM10276l = null;
            entry = null;
        }
        int length = this.f23352c.length;
        Unsafe unsafe = f23351b;
        int i2 = 1048575;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM10052K = m10052K(i4);
            int[] iArr = this.f23352c;
            int i5 = iArr[i4];
            int i6 = (iM10052K & 267386880) >>> 20;
            if (i6 <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & 1048575;
                if (i8 != i2) {
                    i3 = unsafe.getInt(t, i8);
                    i2 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            while (entry != null && this.f23366q.mo10158a(entry) <= i5) {
                this.f23366q.mo10164g(interfaceC4158f8, entry);
                entry = itM10276l.hasNext() ? (Map.Entry) itM10276l.next() : null;
            }
            long j2 = iM10052K & 1048575;
            switch (i6) {
                case 0:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).m10026a(i5, C4353t7.m10240s(t, j2));
                        continue;
                    }
                    break;
                case 1:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).m10027b(i5, C4353t7.m10237p(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9979g(i5, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9979g(i5, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9987s(i5, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9990z(i5, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9974G(i5, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 7:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9984l(i5, C4353t7.m10236o(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    if ((i & i3) != 0) {
                        m10042s(i5, unsafe.getObject(t, j2), interfaceC4158f8);
                    } else {
                        continue;
                    }
                    break;
                case 9:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).m10029d(i5, unsafe.getObject(t, j2), m10068o(i4));
                    } else {
                        continue;
                    }
                    break;
                case 10:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9980h(i5, (AbstractC4402x3) unsafe.getObject(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 11:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9989y(i5, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 12:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9987s(i5, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 13:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9974G(i5, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 14:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9990z(i5, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 15:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).m10032g(i5, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 16:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).m10031f(i5, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    break;
                case 17:
                    if ((i & i3) != 0) {
                        ((C4266n4) interfaceC4158f8).m10030e(i5, unsafe.getObject(t, j2), m10068o(i4));
                    } else {
                        continue;
                    }
                    break;
                case 18:
                    C4101b7.m9471j(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 19:
                    C4101b7.m9480s(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 20:
                    C4101b7.m9484w(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 21:
                    C4101b7.m9487z(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 22:
                    C4101b7.m9453L(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 23:
                    C4101b7.m9447F(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 24:
                    C4101b7.m9458Q(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 25:
                    C4101b7.m9461T(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 26:
                    C4101b7.m9469h(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8);
                    break;
                case 27:
                    C4101b7.m9470i(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, m10068o(i4));
                    break;
                case 28:
                    C4101b7.m9478q(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8);
                    break;
                case 29:
                    C4101b7.m9456O(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 30:
                    C4101b7.m9460S(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 31:
                    C4101b7.m9459R(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 32:
                    C4101b7.m9450I(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 33:
                    C4101b7.m9457P(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 34:
                    C4101b7.m9444C(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, false);
                    break;
                case 35:
                    C4101b7.m9471j(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 36:
                    C4101b7.m9480s(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 37:
                    C4101b7.m9484w(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 38:
                    C4101b7.m9487z(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 39:
                    C4101b7.m9453L(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 40:
                    C4101b7.m9447F(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 41:
                    C4101b7.m9458Q(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 42:
                    C4101b7.m9461T(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 43:
                    C4101b7.m9456O(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 44:
                    C4101b7.m9460S(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 45:
                    C4101b7.m9459R(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 46:
                    C4101b7.m9450I(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 47:
                    C4101b7.m9457P(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 48:
                    C4101b7.m9444C(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, true);
                    break;
                case 49:
                    C4101b7.m9479r(this.f23352c[i4], (List) unsafe.getObject(t, j2), interfaceC4158f8, m10068o(i4));
                    break;
                case 50:
                    m10070u(interfaceC4158f8, i5, unsafe.getObject(t, j2), i4);
                    break;
                case 51:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).m10026a(i5, m10033A(t, j2));
                    }
                    break;
                case 52:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).m10027b(i5, m10034H(t, j2));
                    }
                    break;
                case 53:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9979g(i5, m10036N(t, j2));
                    }
                    break;
                case 54:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9979g(i5, m10036N(t, j2));
                    }
                    break;
                case 55:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9987s(i5, m10035L(t, j2));
                    }
                    break;
                case 56:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9990z(i5, m10036N(t, j2));
                    }
                    break;
                case 57:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9974G(i5, m10035L(t, j2));
                    }
                    break;
                case 58:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9984l(i5, m10038P(t, j2));
                    }
                    break;
                case 59:
                    if (m10074y(t, i5, i4)) {
                        m10042s(i5, unsafe.getObject(t, j2), interfaceC4158f8);
                    }
                    break;
                case 60:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).m10029d(i5, unsafe.getObject(t, j2), m10068o(i4));
                    }
                    break;
                case 61:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9980h(i5, (AbstractC4402x3) unsafe.getObject(t, j2));
                    }
                    break;
                case 62:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9989y(i5, m10035L(t, j2));
                    }
                    break;
                case 63:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9987s(i5, m10035L(t, j2));
                    }
                    break;
                case 64:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9974G(i5, m10035L(t, j2));
                    }
                    break;
                case 65:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9990z(i5, m10036N(t, j2));
                    }
                    break;
                case 66:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).m10032g(i5, m10035L(t, j2));
                    }
                    break;
                case 67:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).m10031f(i5, m10036N(t, j2));
                    }
                    break;
                case 68:
                    if (m10074y(t, i5, i4)) {
                        ((C4266n4) interfaceC4158f8).m10030e(i5, unsafe.getObject(t, j2), m10068o(i4));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f23366q.mo10164g(interfaceC4158f8, entry);
            entry = itM10276l.hasNext() ? (Map.Entry) itM10276l.next() : null;
        }
        m10043t(this.f23365p, t, interfaceC4158f8);
    }

    /* JADX INFO: renamed from: G */
    public final void m10049G(T t, T t2, int i) {
        int[] iArr = this.f23352c;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long j2 = i2 & 1048575;
        if (m10074y(t2, i3, i)) {
            Object objM10241t = m10074y(t, i3, i) ? C4353t7.m10241t(t, j2) : null;
            Object objM10241t2 = C4353t7.m10241t(t2, j2);
            if (objM10241t != null && objM10241t2 != null) {
                C4353t7.m10228g(t, j2, C4127d5.m9547c(objM10241t, objM10241t2));
                m10047E(t, i3, i);
            } else if (objM10241t2 != null) {
                C4353t7.m10228g(t, j2, objM10241t2);
                m10047E(t, i3, i);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final InterfaceC4183h5 m10050I(int i) {
        return (InterfaceC4183h5) this.f23353d[((i / 3) << 1) + 1];
    }

    /* JADX INFO: renamed from: J */
    public final boolean m10051J(T t, T t2, int i) {
        return m10073x(t, i) == m10073x(t2, i);
    }

    /* JADX INFO: renamed from: K */
    public final int m10052K(int i) {
        return this.f23352c[i + 1];
    }

    /* JADX INFO: renamed from: M */
    public final int m10053M(int i) {
        return this.f23352c[i + 2];
    }

    /* JADX INFO: renamed from: Q */
    public final int m10054Q(int i) {
        if (i < this.f23354e || i > this.f23355f) {
            return -1;
        }
        return m10044B(i, 0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: a */
    public final int mo10055a(T t) {
        int i;
        int iM9545a;
        int length = this.f23352c.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iM10052K = m10052K(i3);
            int i4 = this.f23352c[i3];
            long j2 = 1048575 & iM10052K;
            int iHashCode = 37;
            switch ((iM10052K & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iM9545a = C4127d5.m9545a(Double.doubleToLongBits(C4353t7.m10240s(t, j2)));
                    i2 = iM9545a + i;
                    break;
                case 1:
                    i = i2 * 53;
                    iM9545a = Float.floatToIntBits(C4353t7.m10237p(t, j2));
                    i2 = iM9545a + i;
                    break;
                case 2:
                    i = i2 * 53;
                    iM9545a = C4127d5.m9545a(C4353t7.m10232k(t, j2));
                    i2 = iM9545a + i;
                    break;
                case 3:
                    i = i2 * 53;
                    iM9545a = C4127d5.m9545a(C4353t7.m10232k(t, j2));
                    i2 = iM9545a + i;
                    break;
                case 4:
                    i = i2 * 53;
                    iM9545a = C4353t7.m10223b(t, j2);
                    i2 = iM9545a + i;
                    break;
                case 5:
                    i = i2 * 53;
                    iM9545a = C4127d5.m9545a(C4353t7.m10232k(t, j2));
                    i2 = iM9545a + i;
                    break;
                case 6:
                    i = i2 * 53;
                    iM9545a = C4353t7.m10223b(t, j2);
                    i2 = iM9545a + i;
                    break;
                case 7:
                    i = i2 * 53;
                    iM9545a = C4127d5.m9546b(C4353t7.m10236o(t, j2));
                    i2 = iM9545a + i;
                    break;
                case 8:
                    i = i2 * 53;
                    iM9545a = ((String) C4353t7.m10241t(t, j2)).hashCode();
                    i2 = iM9545a + i;
                    break;
                case 9:
                    Object objM10241t = C4353t7.m10241t(t, j2);
                    if (objM10241t != null) {
                        iHashCode = objM10241t.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iM9545a = C4353t7.m10241t(t, j2).hashCode();
                    i2 = iM9545a + i;
                    break;
                case 11:
                    i = i2 * 53;
                    iM9545a = C4353t7.m10223b(t, j2);
                    i2 = iM9545a + i;
                    break;
                case 12:
                    i = i2 * 53;
                    iM9545a = C4353t7.m10223b(t, j2);
                    i2 = iM9545a + i;
                    break;
                case 13:
                    i = i2 * 53;
                    iM9545a = C4353t7.m10223b(t, j2);
                    i2 = iM9545a + i;
                    break;
                case 14:
                    i = i2 * 53;
                    iM9545a = C4127d5.m9545a(C4353t7.m10232k(t, j2));
                    i2 = iM9545a + i;
                    break;
                case 15:
                    i = i2 * 53;
                    iM9545a = C4353t7.m10223b(t, j2);
                    i2 = iM9545a + i;
                    break;
                case 16:
                    i = i2 * 53;
                    iM9545a = C4127d5.m9545a(C4353t7.m10232k(t, j2));
                    i2 = iM9545a + i;
                    break;
                case 17:
                    Object objM10241t2 = C4353t7.m10241t(t, j2);
                    if (objM10241t2 != null) {
                        iHashCode = objM10241t2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
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
                    i = i2 * 53;
                    iM9545a = C4353t7.m10241t(t, j2).hashCode();
                    i2 = iM9545a + i;
                    break;
                case 50:
                    i = i2 * 53;
                    iM9545a = C4353t7.m10241t(t, j2).hashCode();
                    i2 = iM9545a + i;
                    break;
                case 51:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = C4127d5.m9545a(Double.doubleToLongBits(m10033A(t, j2)));
                        i2 = iM9545a + i;
                    }
                    break;
                case 52:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = Float.floatToIntBits(m10034H(t, j2));
                        i2 = iM9545a + i;
                    }
                    break;
                case 53:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = C4127d5.m9545a(m10036N(t, j2));
                        i2 = iM9545a + i;
                    }
                    break;
                case 54:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = C4127d5.m9545a(m10036N(t, j2));
                        i2 = iM9545a + i;
                    }
                    break;
                case 55:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = m10035L(t, j2);
                        i2 = iM9545a + i;
                    }
                    break;
                case 56:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = C4127d5.m9545a(m10036N(t, j2));
                        i2 = iM9545a + i;
                    }
                    break;
                case 57:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = m10035L(t, j2);
                        i2 = iM9545a + i;
                    }
                    break;
                case 58:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = C4127d5.m9546b(m10038P(t, j2));
                        i2 = iM9545a + i;
                    }
                    break;
                case 59:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = ((String) C4353t7.m10241t(t, j2)).hashCode();
                        i2 = iM9545a + i;
                    }
                    break;
                case 60:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = C4353t7.m10241t(t, j2).hashCode();
                        i2 = iM9545a + i;
                    }
                    break;
                case 61:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = C4353t7.m10241t(t, j2).hashCode();
                        i2 = iM9545a + i;
                    }
                    break;
                case 62:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = m10035L(t, j2);
                        i2 = iM9545a + i;
                    }
                    break;
                case 63:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = m10035L(t, j2);
                        i2 = iM9545a + i;
                    }
                    break;
                case 64:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = m10035L(t, j2);
                        i2 = iM9545a + i;
                    }
                    break;
                case 65:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = C4127d5.m9545a(m10036N(t, j2));
                        i2 = iM9545a + i;
                    }
                    break;
                case 66:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = m10035L(t, j2);
                        i2 = iM9545a + i;
                    }
                    break;
                case 67:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = C4127d5.m9545a(m10036N(t, j2));
                        i2 = iM9545a + i;
                    }
                    break;
                case 68:
                    if (m10074y(t, i4, i3)) {
                        i = i2 * 53;
                        iM9545a = C4353t7.m10241t(t, j2).hashCode();
                        i2 = iM9545a + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f23365p.mo10086k(t).hashCode() + (i2 * 53);
        return this.f23357h ? (iHashCode2 * 53) + this.f23366q.mo10159b(t).hashCode() : iHashCode2;
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
    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: b */
    public final int mo10056b(T t) {
        int i;
        int iM9968u;
        int iM9455N;
        int iM9944D;
        int iM9951L;
        int iM9968u2;
        int iM9455N2;
        int iM9944D2;
        int iM9951L2;
        if (this.f23359j) {
            Unsafe unsafe = f23351b;
            int iM1578b = 0;
            for (int i2 = 0; i2 < this.f23352c.length; i2 += 3) {
                int iM10052K = m10052K(i2);
                int i3 = (iM10052K & 267386880) >>> 20;
                int[] iArr = this.f23352c;
                int i4 = iArr[i2];
                long j2 = iM10052K & 1048575;
                if (i3 >= EnumC4377v4.f23527O.f23566g0 && i3 <= EnumC4377v4.f23540b0.f23566g0) {
                    int i5 = iArr[i2 + 2];
                }
                switch (i3) {
                    case 0:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9968u(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 1:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9964n(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 2:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9943B(i4, C4353t7.m10232k(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 3:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9945E(i4, C4353t7.m10232k(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 4:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9948I(i4, C4353t7.m10223b(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 5:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9953N(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 6:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9958S(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 7:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9969v(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 8:
                        if (m10073x(t, i2)) {
                            Object objM10241t = C4353t7.m10241t(t, j2);
                            iM9968u2 = objM10241t instanceof AbstractC4402x3 ? AbstractC4238l4.m9970w(i4, (AbstractC4402x3) objM10241t) : AbstractC4238l4.m9965o(i4, (String) objM10241t);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 9:
                        if (m10073x(t, i2)) {
                            iM9968u2 = C4101b7.m9462a(i4, C4353t7.m10241t(t, j2), m10068o(i2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 10:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9970w(i4, (AbstractC4402x3) C4353t7.m10241t(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 11:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9952M(i4, C4353t7.m10223b(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 12:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9960U(i4, C4353t7.m10223b(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 13:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9959T(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 14:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9956Q(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 15:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9955P(i4, C4353t7.m10223b(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 16:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9949J(i4, C4353t7.m10232k(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 17:
                        if (m10073x(t, i2)) {
                            iM9968u2 = AbstractC4238l4.m9971x(i4, (InterfaceC4240l6) C4353t7.m10241t(t, j2), m10068o(i2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 18:
                        iM9968u2 = C4101b7.m9454M(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 19:
                        iM9968u2 = C4101b7.m9451J(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 20:
                        iM9968u2 = C4101b7.m9474m(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 21:
                        iM9968u2 = C4101b7.m9481t(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 22:
                        iM9968u2 = C4101b7.m9442A(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 23:
                        iM9968u2 = C4101b7.m9454M(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 24:
                        iM9968u2 = C4101b7.m9451J(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 25:
                        List<?> listM10041r = m10041r(t, j2);
                        Class<?> cls = C4101b7.f23089a;
                        int size = listM10041r.size();
                        iM9968u2 = size == 0 ? 0 : size * AbstractC4238l4.m9969v(i4);
                        iM1578b += iM9968u2;
                        break;
                    case 26:
                        iM9968u2 = C4101b7.m9463b(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 27:
                        iM9968u2 = C4101b7.m9464c(i4, m10041r(t, j2), m10068o(i2));
                        iM1578b += iM9968u2;
                        break;
                    case 28:
                        iM9968u2 = C4101b7.m9475n(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 29:
                        iM9968u2 = C4101b7.m9445D(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 30:
                        iM9968u2 = C4101b7.m9485x(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 31:
                        iM9968u2 = C4101b7.m9451J(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 32:
                        iM9968u2 = C4101b7.m9454M(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 33:
                        iM9968u2 = C4101b7.m9448G(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 34:
                        iM9968u2 = C4101b7.m9482u(i4, m10041r(t, j2));
                        iM1578b += iM9968u2;
                        break;
                    case 35:
                        iM9455N2 = C4101b7.m9455N((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 36:
                        iM9455N2 = C4101b7.m9452K((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 37:
                        iM9455N2 = C4101b7.m9465d((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 38:
                        iM9455N2 = C4101b7.m9477p((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 39:
                        iM9455N2 = C4101b7.m9443B((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 40:
                        iM9455N2 = C4101b7.m9455N((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 41:
                        iM9455N2 = C4101b7.m9452K((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 42:
                        List list = (List) unsafe.getObject(t, j2);
                        Class<?> cls2 = C4101b7.f23089a;
                        iM9455N2 = list.size();
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 43:
                        iM9455N2 = C4101b7.m9446E((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 44:
                        iM9455N2 = C4101b7.m9486y((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 45:
                        iM9455N2 = C4101b7.m9452K((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 46:
                        iM9455N2 = C4101b7.m9455N((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 47:
                        iM9455N2 = C4101b7.m9449H((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 48:
                        iM9455N2 = C4101b7.m9483v((List) unsafe.getObject(t, j2));
                        if (iM9455N2 > 0) {
                            iM9944D2 = AbstractC4238l4.m9944D(i4);
                            iM9951L2 = AbstractC4238l4.m9951L(iM9455N2);
                            iM1578b = outline.m1578b(iM9951L2, iM9944D2, iM9455N2, iM1578b);
                        }
                        break;
                    case 49:
                        iM9968u2 = C4101b7.m9476o(i4, m10041r(t, j2), m10068o(i2));
                        iM1578b += iM9968u2;
                        break;
                    case 50:
                        iM9968u2 = this.f23367r.mo9565h(i4, C4353t7.m10241t(t, j2), m10045C(i2));
                        iM1578b += iM9968u2;
                        break;
                    case 51:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9968u(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 52:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9964n(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 53:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9943B(i4, m10036N(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 54:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9945E(i4, m10036N(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 55:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9948I(i4, m10035L(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 56:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9953N(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 57:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9958S(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 58:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9969v(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 59:
                        if (m10074y(t, i4, i2)) {
                            Object objM10241t2 = C4353t7.m10241t(t, j2);
                            iM9968u2 = objM10241t2 instanceof AbstractC4402x3 ? AbstractC4238l4.m9970w(i4, (AbstractC4402x3) objM10241t2) : AbstractC4238l4.m9965o(i4, (String) objM10241t2);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 60:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = C4101b7.m9462a(i4, C4353t7.m10241t(t, j2), m10068o(i2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 61:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9970w(i4, (AbstractC4402x3) C4353t7.m10241t(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 62:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9952M(i4, m10035L(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 63:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9960U(i4, m10035L(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 64:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9959T(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 65:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9956Q(i4);
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 66:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9955P(i4, m10035L(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 67:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9949J(i4, m10036N(t, j2));
                            iM1578b += iM9968u2;
                        }
                        break;
                    case 68:
                        if (m10074y(t, i4, i2)) {
                            iM9968u2 = AbstractC4238l4.m9971x(i4, (InterfaceC4240l6) C4353t7.m10241t(t, j2), m10068o(i2));
                            iM1578b += iM9968u2;
                        }
                        break;
                }
            }
            AbstractC4269n7<?, ?> abstractC4269n7 = this.f23365p;
            return abstractC4269n7.mo10094s(abstractC4269n7.mo10086k(t)) + iM1578b;
        }
        Unsafe unsafe2 = f23351b;
        int iM1578b2 = 0;
        int i6 = 1048575;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f23352c.length; i8 += 3) {
            int iM10052K2 = m10052K(i8);
            int[] iArr2 = this.f23352c;
            int i9 = iArr2[i8];
            int i10 = (iM10052K2 & 267386880) >>> 20;
            if (i10 <= 17) {
                int i11 = iArr2[i8 + 2];
                int i12 = i11 & 1048575;
                i = 1 << (i11 >>> 20);
                if (i12 != i6) {
                    i7 = unsafe2.getInt(t, i12);
                    i6 = i12;
                }
            } else {
                i = 0;
            }
            long j3 = iM10052K2 & 1048575;
            switch (i10) {
                case 0:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9968u(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 1:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9964n(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 2:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9943B(i9, unsafe2.getLong(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 3:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9945E(i9, unsafe2.getLong(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 4:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9948I(i9, unsafe2.getInt(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 5:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9953N(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 6:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9958S(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 7:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9969v(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 8:
                    if ((i7 & i) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        iM9968u = object instanceof AbstractC4402x3 ? AbstractC4238l4.m9970w(i9, (AbstractC4402x3) object) : AbstractC4238l4.m9965o(i9, (String) object);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 9:
                    if ((i7 & i) != 0) {
                        iM9968u = C4101b7.m9462a(i9, unsafe2.getObject(t, j3), m10068o(i8));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 10:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9970w(i9, (AbstractC4402x3) unsafe2.getObject(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 11:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9952M(i9, unsafe2.getInt(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 12:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9960U(i9, unsafe2.getInt(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 13:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9959T(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 14:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9956Q(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 15:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9955P(i9, unsafe2.getInt(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 16:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9949J(i9, unsafe2.getLong(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 17:
                    if ((i7 & i) != 0) {
                        iM9968u = AbstractC4238l4.m9971x(i9, (InterfaceC4240l6) unsafe2.getObject(t, j3), m10068o(i8));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 18:
                    iM9968u = C4101b7.m9454M(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 19:
                    iM9968u = C4101b7.m9451J(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 20:
                    iM9968u = C4101b7.m9474m(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 21:
                    iM9968u = C4101b7.m9481t(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 22:
                    iM9968u = C4101b7.m9442A(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 23:
                    iM9968u = C4101b7.m9454M(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 24:
                    iM9968u = C4101b7.m9451J(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 25:
                    List list2 = (List) unsafe2.getObject(t, j3);
                    Class<?> cls3 = C4101b7.f23089a;
                    int size2 = list2.size();
                    iM9968u = size2 == 0 ? 0 : size2 * AbstractC4238l4.m9969v(i9);
                    iM1578b2 += iM9968u;
                    break;
                case 26:
                    iM9968u = C4101b7.m9463b(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 27:
                    iM9968u = C4101b7.m9464c(i9, (List) unsafe2.getObject(t, j3), m10068o(i8));
                    iM1578b2 += iM9968u;
                    break;
                case 28:
                    iM9968u = C4101b7.m9475n(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 29:
                    iM9968u = C4101b7.m9445D(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 30:
                    iM9968u = C4101b7.m9485x(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 31:
                    iM9968u = C4101b7.m9451J(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 32:
                    iM9968u = C4101b7.m9454M(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 33:
                    iM9968u = C4101b7.m9448G(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 34:
                    iM9968u = C4101b7.m9482u(i9, (List) unsafe2.getObject(t, j3));
                    iM1578b2 += iM9968u;
                    break;
                case 35:
                    iM9455N = C4101b7.m9455N((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 36:
                    iM9455N = C4101b7.m9452K((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 37:
                    iM9455N = C4101b7.m9465d((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 38:
                    iM9455N = C4101b7.m9477p((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 39:
                    iM9455N = C4101b7.m9443B((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 40:
                    iM9455N = C4101b7.m9455N((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 41:
                    iM9455N = C4101b7.m9452K((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 42:
                    List list3 = (List) unsafe2.getObject(t, j3);
                    Class<?> cls4 = C4101b7.f23089a;
                    iM9455N = list3.size();
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 43:
                    iM9455N = C4101b7.m9446E((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 44:
                    iM9455N = C4101b7.m9486y((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 45:
                    iM9455N = C4101b7.m9452K((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 46:
                    iM9455N = C4101b7.m9455N((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 47:
                    iM9455N = C4101b7.m9449H((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 48:
                    iM9455N = C4101b7.m9483v((List) unsafe2.getObject(t, j3));
                    if (iM9455N > 0) {
                        iM9944D = AbstractC4238l4.m9944D(i9);
                        iM9951L = AbstractC4238l4.m9951L(iM9455N);
                        iM1578b2 = outline.m1578b(iM9951L, iM9944D, iM9455N, iM1578b2);
                    }
                    break;
                case 49:
                    iM9968u = C4101b7.m9476o(i9, (List) unsafe2.getObject(t, j3), m10068o(i8));
                    iM1578b2 += iM9968u;
                    break;
                case 50:
                    iM9968u = this.f23367r.mo9565h(i9, unsafe2.getObject(t, j3), m10045C(i8));
                    iM1578b2 += iM9968u;
                    break;
                case 51:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9968u(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 52:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9964n(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 53:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9943B(i9, m10036N(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 54:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9945E(i9, m10036N(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 55:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9948I(i9, m10035L(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 56:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9953N(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 57:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9958S(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 58:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9969v(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 59:
                    if (m10074y(t, i9, i8)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        iM9968u = object2 instanceof AbstractC4402x3 ? AbstractC4238l4.m9970w(i9, (AbstractC4402x3) object2) : AbstractC4238l4.m9965o(i9, (String) object2);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 60:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = C4101b7.m9462a(i9, unsafe2.getObject(t, j3), m10068o(i8));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 61:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9970w(i9, (AbstractC4402x3) unsafe2.getObject(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 62:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9952M(i9, m10035L(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 63:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9960U(i9, m10035L(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 64:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9959T(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 65:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9956Q(i9);
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 66:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9955P(i9, m10035L(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 67:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9949J(i9, m10036N(t, j3));
                        iM1578b2 += iM9968u;
                    }
                    break;
                case 68:
                    if (m10074y(t, i9, i8)) {
                        iM9968u = AbstractC4238l4.m9971x(i9, (InterfaceC4240l6) unsafe2.getObject(t, j3), m10068o(i8));
                        iM1578b2 += iM9968u;
                    }
                    break;
            }
        }
        AbstractC4269n7<?, ?> abstractC4269n8 = this.f23365p;
        int iMo10094s = abstractC4269n8.mo10094s(abstractC4269n8.mo10086k(t)) + iM1578b2;
        if (!this.f23357h) {
            return iMo10094s;
        }
        C4364u4<T> c4364u4Mo10159b = this.f23366q.mo10159b(t);
        int iM10265a = 0;
        for (int i13 = 0; i13 < c4364u4Mo10159b.f23500b.m9350e(); i13++) {
            Map.Entry entryM9349d = c4364u4Mo10159b.f23500b.m9349d(i13);
            iM10265a += C4364u4.m10265a((InterfaceC4390w4) entryM9349d.getKey(), entryM9349d.getValue());
        }
        for (Map.Entry entry : c4364u4Mo10159b.f23500b.m9352g()) {
            iM10265a += C4364u4.m10265a((InterfaceC4390w4) entry.getKey(), entry.getValue());
        }
        return iMo10094s + iM10265a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: c */
    public final void mo10057c(T t, InterfaceC4158f8 interfaceC4158f8) throws IOException {
        Iterator itM10276l;
        Map.Entry<?, ?> entry;
        Objects.requireNonNull(interfaceC4158f8);
        if (!this.f23359j) {
            m10048F(t, interfaceC4158f8);
            return;
        }
        if (this.f23357h) {
            C4364u4<T> c4364u4Mo10159b = this.f23366q.mo10159b(t);
            if (c4364u4Mo10159b.f23500b.isEmpty()) {
                itM10276l = null;
                entry = null;
            } else {
                itM10276l = c4364u4Mo10159b.m10276l();
                entry = (Map.Entry) itM10276l.next();
            }
        } else {
            itM10276l = null;
            entry = null;
        }
        int length = this.f23352c.length;
        for (int i = 0; i < length; i += 3) {
            int iM10052K = m10052K(i);
            int i2 = this.f23352c[i];
            while (entry != null && this.f23366q.mo10158a(entry) <= i2) {
                this.f23366q.mo10164g(interfaceC4158f8, entry);
                entry = itM10276l.hasNext() ? (Map.Entry) itM10276l.next() : null;
            }
            switch ((267386880 & iM10052K) >>> 20) {
                case 0:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).m10026a(i2, C4353t7.m10240s(t, iM10052K & 1048575));
                    }
                    break;
                case 1:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).m10027b(i2, C4353t7.m10237p(t, iM10052K & 1048575));
                    }
                    break;
                case 2:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9979g(i2, C4353t7.m10232k(t, iM10052K & 1048575));
                    }
                    break;
                case 3:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9979g(i2, C4353t7.m10232k(t, iM10052K & 1048575));
                    }
                    break;
                case 4:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9987s(i2, C4353t7.m10223b(t, iM10052K & 1048575));
                    }
                    break;
                case 5:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9990z(i2, C4353t7.m10232k(t, iM10052K & 1048575));
                    }
                    break;
                case 6:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9974G(i2, C4353t7.m10223b(t, iM10052K & 1048575));
                    }
                    break;
                case 7:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9984l(i2, C4353t7.m10236o(t, iM10052K & 1048575));
                    }
                    break;
                case 8:
                    if (m10073x(t, i)) {
                        m10042s(i2, C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8);
                    }
                    break;
                case 9:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).m10029d(i2, C4353t7.m10241t(t, iM10052K & 1048575), m10068o(i));
                    }
                    break;
                case 10:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9980h(i2, (AbstractC4402x3) C4353t7.m10241t(t, iM10052K & 1048575));
                    }
                    break;
                case 11:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9989y(i2, C4353t7.m10223b(t, iM10052K & 1048575));
                    }
                    break;
                case 12:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9987s(i2, C4353t7.m10223b(t, iM10052K & 1048575));
                    }
                    break;
                case 13:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9974G(i2, C4353t7.m10223b(t, iM10052K & 1048575));
                    }
                    break;
                case 14:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9990z(i2, C4353t7.m10232k(t, iM10052K & 1048575));
                    }
                    break;
                case 15:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).m10032g(i2, C4353t7.m10223b(t, iM10052K & 1048575));
                    }
                    break;
                case 16:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).m10031f(i2, C4353t7.m10232k(t, iM10052K & 1048575));
                    }
                    break;
                case 17:
                    if (m10073x(t, i)) {
                        ((C4266n4) interfaceC4158f8).m10030e(i2, C4353t7.m10241t(t, iM10052K & 1048575), m10068o(i));
                    }
                    break;
                case 18:
                    C4101b7.m9471j(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 19:
                    C4101b7.m9480s(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 20:
                    C4101b7.m9484w(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 21:
                    C4101b7.m9487z(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 22:
                    C4101b7.m9453L(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 23:
                    C4101b7.m9447F(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 24:
                    C4101b7.m9458Q(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 25:
                    C4101b7.m9461T(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 26:
                    C4101b7.m9469h(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8);
                    break;
                case 27:
                    C4101b7.m9470i(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, m10068o(i));
                    break;
                case 28:
                    C4101b7.m9478q(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8);
                    break;
                case 29:
                    C4101b7.m9456O(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 30:
                    C4101b7.m9460S(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 31:
                    C4101b7.m9459R(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 32:
                    C4101b7.m9450I(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 33:
                    C4101b7.m9457P(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 34:
                    C4101b7.m9444C(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, false);
                    break;
                case 35:
                    C4101b7.m9471j(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 36:
                    C4101b7.m9480s(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 37:
                    C4101b7.m9484w(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 38:
                    C4101b7.m9487z(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 39:
                    C4101b7.m9453L(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 40:
                    C4101b7.m9447F(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 41:
                    C4101b7.m9458Q(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 42:
                    C4101b7.m9461T(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 43:
                    C4101b7.m9456O(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 44:
                    C4101b7.m9460S(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 45:
                    C4101b7.m9459R(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 46:
                    C4101b7.m9450I(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 47:
                    C4101b7.m9457P(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 48:
                    C4101b7.m9444C(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, true);
                    break;
                case 49:
                    C4101b7.m9479r(this.f23352c[i], (List) C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8, m10068o(i));
                    break;
                case 50:
                    m10070u(interfaceC4158f8, i2, C4353t7.m10241t(t, iM10052K & 1048575), i);
                    break;
                case 51:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).m10026a(i2, m10033A(t, iM10052K & 1048575));
                    }
                    break;
                case 52:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).m10027b(i2, m10034H(t, iM10052K & 1048575));
                    }
                    break;
                case 53:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9979g(i2, m10036N(t, iM10052K & 1048575));
                    }
                    break;
                case 54:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9979g(i2, m10036N(t, iM10052K & 1048575));
                    }
                    break;
                case 55:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9987s(i2, m10035L(t, iM10052K & 1048575));
                    }
                    break;
                case 56:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9990z(i2, m10036N(t, iM10052K & 1048575));
                    }
                    break;
                case 57:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9974G(i2, m10035L(t, iM10052K & 1048575));
                    }
                    break;
                case 58:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9984l(i2, m10038P(t, iM10052K & 1048575));
                    }
                    break;
                case 59:
                    if (m10074y(t, i2, i)) {
                        m10042s(i2, C4353t7.m10241t(t, iM10052K & 1048575), interfaceC4158f8);
                    }
                    break;
                case 60:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).m10029d(i2, C4353t7.m10241t(t, iM10052K & 1048575), m10068o(i));
                    }
                    break;
                case 61:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9980h(i2, (AbstractC4402x3) C4353t7.m10241t(t, iM10052K & 1048575));
                    }
                    break;
                case 62:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9989y(i2, m10035L(t, iM10052K & 1048575));
                    }
                    break;
                case 63:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9987s(i2, m10035L(t, iM10052K & 1048575));
                    }
                    break;
                case 64:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9974G(i2, m10035L(t, iM10052K & 1048575));
                    }
                    break;
                case 65:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).f23336a.mo9990z(i2, m10036N(t, iM10052K & 1048575));
                    }
                    break;
                case 66:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).m10032g(i2, m10035L(t, iM10052K & 1048575));
                    }
                    break;
                case 67:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).m10031f(i2, m10036N(t, iM10052K & 1048575));
                    }
                    break;
                case 68:
                    if (m10074y(t, i2, i)) {
                        ((C4266n4) interfaceC4158f8).m10030e(i2, C4353t7.m10241t(t, iM10052K & 1048575), m10068o(i));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f23366q.mo10164g(interfaceC4158f8, entry);
            entry = itM10276l.hasNext() ? (Map.Entry) itM10276l.next() : null;
        }
        m10043t(this.f23365p, t, interfaceC4158f8);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de A[LOOP:1: B:47:0x00cc->B:52:0x00de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: d */
    public final boolean mo10058d(T t) {
        int i;
        int i2;
        List list;
        InterfaceC4431z6 interfaceC4431z6M10068o;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.f23361l) {
                return !this.f23357h || this.f23366q.mo10159b(t).m10277m();
            }
            int i7 = this.f23360k[i6];
            int i8 = this.f23352c[i7];
            int iM10052K = m10052K(i7);
            int i9 = this.f23352c[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = f23351b.getInt(t, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i4;
                i2 = i5;
            }
            if (((268435456 & iM10052K) != 0) && !m10075z(t, i7, i, i2, i11)) {
                return false;
            }
            int i12 = (267386880 & iM10052K) >>> 20;
            if (i12 == 9 || i12 == 17) {
                if (m10075z(t, i7, i, i2, i11) && !m10068o(i7).mo10058d(C4353t7.m10241t(t, iM10052K & 1048575))) {
                    return false;
                }
            } else if (i12 == 27) {
                list = (List) C4353t7.m10241t(t, iM10052K & 1048575);
                if (!list.isEmpty()) {
                    interfaceC4431z6M10068o = m10068o(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!interfaceC4431z6M10068o.mo10058d(list.get(i3))) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (i12 == 60 || i12 == 68) {
                if (m10074y(t, i8, i7) && !m10068o(i7).mo10058d(C4353t7.m10241t(t, iM10052K & 1048575))) {
                    return false;
                }
            } else if (i12 == 49) {
                list = (List) C4353t7.m10241t(t, iM10052K & 1048575);
                if (!list.isEmpty()) {
                    interfaceC4431z6M10068o = m10068o(i7);
                    while (i3 < list.size()) {
                        if (!interfaceC4431z6M10068o.mo10058d(list.get(i3))) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (i12 == 50 && !this.f23367r.mo9559b(C4353t7.m10241t(t, iM10052K & 1048575)).isEmpty()) {
                Objects.requireNonNull(this.f23367r.mo9564g(m10045C(i7)));
                throw null;
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: e */
    public final void mo10059e(T t) {
        int i;
        int i2 = this.f23361l;
        while (true) {
            i = this.f23362m;
            if (i2 >= i) {
                break;
            }
            long jM10052K = m10052K(this.f23360k[i2]) & 1048575;
            Object objM10241t = C4353t7.m10241t(t, jM10052K);
            if (objM10241t != null) {
                C4353t7.m10228g(t, jM10052K, this.f23367r.mo9561d(objM10241t));
            }
            i2++;
        }
        int length = this.f23360k.length;
        while (i < length) {
            this.f23364o.mo10287c(t, this.f23360k[i]);
            i++;
        }
        this.f23365p.mo10092q(t);
        if (this.f23357h) {
            this.f23366q.mo10167j(t);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c1  */
    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: f */
    public final boolean mo10060f(T t, T t2) {
        int length = this.f23352c.length;
        int i = 0;
        while (true) {
            boolean zM9473l = true;
            if (i >= length) {
                if (!this.f23365p.mo10086k(t).equals(this.f23365p.mo10086k(t2))) {
                    return false;
                }
                if (this.f23357h) {
                    return this.f23366q.mo10159b(t).equals(this.f23366q.mo10159b(t2));
                }
                return true;
            }
            int iM10052K = m10052K(i);
            long j2 = iM10052K & 1048575;
            switch ((iM10052K & 267386880) >>> 20) {
                case 0:
                    if (!m10051J(t, t2, i) || Double.doubleToLongBits(C4353t7.m10240s(t, j2)) != Double.doubleToLongBits(C4353t7.m10240s(t2, j2))) {
                        zM9473l = false;
                    }
                    break;
                case 1:
                    if (!m10051J(t, t2, i) || Float.floatToIntBits(C4353t7.m10237p(t, j2)) != Float.floatToIntBits(C4353t7.m10237p(t2, j2))) {
                        zM9473l = false;
                    }
                    break;
                case 2:
                    if (!m10051J(t, t2, i) || C4353t7.m10232k(t, j2) != C4353t7.m10232k(t2, j2)) {
                        zM9473l = false;
                    }
                    break;
                case 3:
                    if (!m10051J(t, t2, i) || C4353t7.m10232k(t, j2) != C4353t7.m10232k(t2, j2)) {
                        zM9473l = false;
                    }
                    break;
                case 4:
                    if (!m10051J(t, t2, i) || C4353t7.m10223b(t, j2) != C4353t7.m10223b(t2, j2)) {
                        zM9473l = false;
                    }
                    break;
                case 5:
                    if (!m10051J(t, t2, i) || C4353t7.m10232k(t, j2) != C4353t7.m10232k(t2, j2)) {
                        zM9473l = false;
                    }
                    break;
                case 6:
                    if (!m10051J(t, t2, i) || C4353t7.m10223b(t, j2) != C4353t7.m10223b(t2, j2)) {
                        zM9473l = false;
                    }
                    break;
                case 7:
                    if (!m10051J(t, t2, i) || C4353t7.m10236o(t, j2) != C4353t7.m10236o(t2, j2)) {
                        zM9473l = false;
                    }
                    break;
                case 8:
                    if (!m10051J(t, t2, i) || !C4101b7.m9473l(C4353t7.m10241t(t, j2), C4353t7.m10241t(t2, j2))) {
                        zM9473l = false;
                    }
                    break;
                case 9:
                    if (!m10051J(t, t2, i) || !C4101b7.m9473l(C4353t7.m10241t(t, j2), C4353t7.m10241t(t2, j2))) {
                        zM9473l = false;
                    }
                    break;
                case 10:
                    if (!m10051J(t, t2, i) || !C4101b7.m9473l(C4353t7.m10241t(t, j2), C4353t7.m10241t(t2, j2))) {
                        zM9473l = false;
                    }
                    break;
                case 11:
                    if (!m10051J(t, t2, i) || C4353t7.m10223b(t, j2) != C4353t7.m10223b(t2, j2)) {
                        zM9473l = false;
                    }
                    break;
                case 12:
                    if (!m10051J(t, t2, i) || C4353t7.m10223b(t, j2) != C4353t7.m10223b(t2, j2)) {
                        zM9473l = false;
                    }
                    break;
                case 13:
                    if (!m10051J(t, t2, i) || C4353t7.m10223b(t, j2) != C4353t7.m10223b(t2, j2)) {
                        zM9473l = false;
                    }
                    break;
                case 14:
                    if (!m10051J(t, t2, i) || C4353t7.m10232k(t, j2) != C4353t7.m10232k(t2, j2)) {
                        zM9473l = false;
                    }
                    break;
                case 15:
                    if (!m10051J(t, t2, i) || C4353t7.m10223b(t, j2) != C4353t7.m10223b(t2, j2)) {
                        zM9473l = false;
                    }
                    break;
                case 16:
                    if (!m10051J(t, t2, i) || C4353t7.m10232k(t, j2) != C4353t7.m10232k(t2, j2)) {
                        zM9473l = false;
                    }
                    break;
                case 17:
                    if (!m10051J(t, t2, i) || !C4101b7.m9473l(C4353t7.m10241t(t, j2), C4353t7.m10241t(t2, j2))) {
                        zM9473l = false;
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
                    zM9473l = C4101b7.m9473l(C4353t7.m10241t(t, j2), C4353t7.m10241t(t2, j2));
                    break;
                case 50:
                    zM9473l = C4101b7.m9473l(C4353t7.m10241t(t, j2), C4353t7.m10241t(t2, j2));
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
                    long jM10053M = m10053M(i) & 1048575;
                    if (C4353t7.m10223b(t, jM10053M) != C4353t7.m10223b(t2, jM10053M) || !C4101b7.m9473l(C4353t7.m10241t(t, j2), C4353t7.m10241t(t2, j2))) {
                        zM9473l = false;
                    }
                    break;
            }
            if (!zM9473l) {
                return false;
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0299  */
    /* JADX WARN: Code duplicated, block: B:102:0x029f  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:107:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02db  */
    /* JADX WARN: Code duplicated, block: B:113:0x030a  */
    /* JADX WARN: Code duplicated, block: B:115:0x031a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0332  */
    /* JADX WARN: Code duplicated, block: B:122:0x034e A[PHI: r0 r17 r26 r27 r28
  0x034e: PHI (r0v17 int) = (r0v10 int), (r0v16 int), (r0v18 int) binds: [B:121:0x034c, B:111:0x0307, B:117:0x031d] A[DONT_GENERATE, DONT_INLINE]
  0x034e: PHI (r17v7 int) = (r17v4 int), (r17v6 int), (r17v8 int) binds: [B:121:0x034c, B:111:0x0307, B:117:0x031d] A[DONT_GENERATE, DONT_INLINE]
  0x034e: PHI (r26v3 int) = (r26v0 int), (r26v2 int), (r26v4 int) binds: [B:121:0x034c, B:111:0x0307, B:117:0x031d] A[DONT_GENERATE, DONT_INLINE]
  0x034e: PHI (r27v4 int) = (r27v1 int), (r27v3 int), (r27v5 int) binds: [B:121:0x034c, B:111:0x0307, B:117:0x031d] A[DONT_GENERATE, DONT_INLINE]
  0x034e: PHI (r28v4 sun.misc.Unsafe) = (r28v1 sun.misc.Unsafe), (r28v3 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe) binds: [B:121:0x034c, B:111:0x0307, B:117:0x031d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x0367 A[PHI: r0 r17 r26 r27 r28
  0x0367: PHI (r0v14 int) = (r0v10 int), (r0v16 int) binds: [B:121:0x034c, B:111:0x0307] A[DONT_GENERATE, DONT_INLINE]
  0x0367: PHI (r17v5 int) = (r17v4 int), (r17v6 int) binds: [B:121:0x034c, B:111:0x0307] A[DONT_GENERATE, DONT_INLINE]
  0x0367: PHI (r26v1 int) = (r26v0 int), (r26v2 int) binds: [B:121:0x034c, B:111:0x0307] A[DONT_GENERATE, DONT_INLINE]
  0x0367: PHI (r27v2 int) = (r27v1 int), (r27v3 int) binds: [B:121:0x034c, B:111:0x0307] A[DONT_GENERATE, DONT_INLINE]
  0x0367: PHI (r28v2 sun.misc.Unsafe) = (r28v1 sun.misc.Unsafe), (r28v3 sun.misc.Unsafe) binds: [B:121:0x034c, B:111:0x0307] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0107  */
    /* JADX WARN: Code duplicated, block: B:45:0x0111  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x013d  */
    /* JADX WARN: Code duplicated, block: B:53:0x014b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0151  */
    /* JADX WARN: Code duplicated, block: B:55:0x015b  */
    /* JADX WARN: Code duplicated, block: B:57:0x016a  */
    /* JADX WARN: Code duplicated, block: B:59:0x016f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0174  */
    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    /* JADX WARN: Code duplicated, block: B:64:0x018d  */
    /* JADX WARN: Code duplicated, block: B:66:0x019b  */
    /* JADX WARN: Code duplicated, block: B:67:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x0203  */
    /* JADX WARN: Code duplicated, block: B:83:0x0213  */
    /* JADX WARN: Code duplicated, block: B:85:0x022c  */
    /* JADX WARN: Code duplicated, block: B:87:0x023c  */
    /* JADX WARN: Code duplicated, block: B:88:0x024c  */
    /* JADX WARN: Code duplicated, block: B:90:0x025d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0277  */
    /* JADX WARN: Code duplicated, block: B:96:0x028a  */
    /* JADX WARN: Code duplicated, block: B:98:0x028d  */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00a4. Please report as an issue. */
    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: g */
    public final void mo10061g(T t, byte[] bArr, int i, int i2, C4389w3 c4389w3) throws IOException {
        int i3;
        int iM5350c0;
        int iM10054Q;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        Unsafe unsafe;
        long j2;
        C4268n6<T> c4268n6;
        int i7;
        C4268n6<T> c4268n7;
        int i8;
        T t2;
        Unsafe unsafe2;
        int i9;
        Unsafe unsafe3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        InterfaceC4197i5 interfaceC4197i5Mo9340b;
        int size;
        int i15;
        int i16;
        int i17;
        int i18;
        Unsafe unsafe4;
        int i19;
        Unsafe unsafe5;
        Unsafe unsafe6;
        T t3;
        T t4;
        boolean z;
        C4268n6<T> c4268n8;
        Object object;
        Unsafe unsafe7;
        if (!this.f23359j) {
            m10067m(t, bArr, i, i2, 0, c4389w3);
            return;
        }
        Unsafe unsafe8 = f23351b;
        int i20 = -1;
        int i21 = 1048575;
        T t5 = t;
        byte[] bArr2 = bArr;
        int iM10064j = i;
        int i22 = i2;
        C4389w3 c4389w4 = c4389w3;
        C4268n6<T> c4268n9 = this;
        int i23 = -1;
        int i24 = 0;
        int i25 = 1048575;
        int i26 = 0;
        while (iM10064j < i22) {
            int i27 = iM10064j + 1;
            byte b = bArr2[iM10064j];
            if (b < 0) {
                iM5350c0 = C2622l.m5350c0(b, bArr2, i27, c4389w4);
                i3 = c4389w4.f23583a;
            } else {
                i3 = b;
                iM5350c0 = i27;
            }
            int i28 = i3 >>> 3;
            int i29 = i3 & 7;
            if (i28 > i23) {
                int i30 = i24 / 3;
                if (i28 < c4268n9.f23354e || i28 > c4268n9.f23355f) {
                    i4 = -1;
                } else {
                    iM10054Q = c4268n9.m10044B(i28, i30);
                }
                if (i4 == i20) {
                    i8 = i28;
                    unsafe5 = unsafe8;
                    i24 = 0;
                } else {
                    iArr = c4268n9.f23352c;
                    i5 = iArr[i4 + 1];
                    i6 = (i5 & 267386880) >>> 20;
                    unsafe = unsafe8;
                    j2 = i5 & i21;
                    c4268n6 = c4268n9;
                    if (i6 <= 17) {
                        int i31 = iArr[i4 + 2];
                        i16 = 1 << (i31 >>> 20);
                        i17 = 1048575;
                        i18 = i31 & 1048575;
                        if (i18 != i25) {
                            if (i25 != 1048575) {
                                long j3 = i25;
                                unsafe7 = unsafe;
                                unsafe7.putInt(t5, j3, i26);
                                i17 = 1048575;
                            } else {
                                unsafe7 = unsafe;
                            }
                            if (i18 != i17) {
                                i26 = unsafe7.getInt(t5, i18);
                            }
                            unsafe4 = unsafe7;
                            i25 = i18;
                        } else {
                            i29 = i29;
                            unsafe4 = unsafe;
                        }
                        switch (i6) {
                            case 0:
                                i8 = i28;
                                i19 = i4;
                                unsafe5 = unsafe4;
                                i22 = i22;
                                c4268n7 = c4268n6;
                                t2 = t5;
                                if (i29 == 1) {
                                    C4353t7.m10225d(t2, j2, Double.longBitsToDouble(C2622l.m5362e2(bArr2, iM5350c0)));
                                    iM10064j = iM5350c0 + 8;
                                    i26 |= i16;
                                    unsafe2 = unsafe5;
                                    i7 = i19;
                                }
                                i24 = i19;
                                break;
                            case 1:
                                i8 = i28;
                                i19 = i4;
                                unsafe5 = unsafe4;
                                i22 = i22;
                                c4268n7 = c4268n6;
                                t2 = t5;
                                if (i29 == 5) {
                                    C4353t7.f23479e.mo10248d(t2, j2, Float.intBitsToFloat(C2622l.m5385j0(bArr2, iM5350c0)));
                                    iM10064j = iM5350c0 + 4;
                                    i26 |= i16;
                                    unsafe2 = unsafe5;
                                    i7 = i19;
                                }
                                i24 = i19;
                                break;
                            case 2:
                            case 3:
                                i8 = i28;
                                i19 = i4;
                                unsafe5 = unsafe4;
                                i22 = i22;
                                t2 = t5;
                                if (i29 == 0) {
                                    iM10064j = C2622l.m5249F1(bArr2, iM5350c0, c4389w4);
                                    unsafe5.putLong(t, j2, c4389w4.f23584b);
                                    i26 |= i16;
                                    unsafe2 = unsafe5;
                                    c4268n7 = c4268n6;
                                    i7 = i19;
                                }
                                i24 = i19;
                                break;
                            case 4:
                            case 11:
                                i8 = i28;
                                i19 = i4;
                                unsafe5 = unsafe4;
                                i22 = i22;
                                t2 = t5;
                                if (i29 == 0) {
                                    iM10064j = C2622l.m5395l0(bArr2, iM5350c0, c4389w4);
                                    unsafe5.putInt(t2, j2, c4389w4.f23583a);
                                    c4268n7 = c4268n6;
                                    i26 |= i16;
                                    unsafe2 = unsafe5;
                                    i7 = i19;
                                }
                                i24 = i19;
                                break;
                            case 5:
                            case 14:
                                i8 = i28;
                                i19 = i4;
                                unsafe6 = unsafe4;
                                t3 = t5;
                                if (i29 == 1) {
                                    unsafe5 = unsafe6;
                                    i22 = i22;
                                    t2 = t3;
                                    unsafe6.putLong(t, j2, C2622l.m5362e2(bArr2, iM5350c0));
                                    iM10064j = iM5350c0 + 8;
                                    c4268n7 = c4268n6;
                                    i26 |= i16;
                                    unsafe2 = unsafe5;
                                    i7 = i19;
                                }
                                unsafe5 = unsafe6;
                                i24 = i19;
                                break;
                            case 6:
                            case 13:
                                i8 = i28;
                                i19 = i4;
                                unsafe6 = unsafe4;
                                t4 = t5;
                                if (i29 == 5) {
                                    unsafe6.putInt(t4, j2, C2622l.m5385j0(bArr2, iM5350c0));
                                    iM10064j = iM5350c0 + 4;
                                    unsafe5 = unsafe6;
                                    c4268n7 = c4268n6;
                                    t2 = t4;
                                    i26 |= i16;
                                    unsafe2 = unsafe5;
                                    i7 = i19;
                                }
                                unsafe5 = unsafe6;
                                i24 = i19;
                                break;
                            case 7:
                                i8 = i28;
                                i19 = i4;
                                unsafe6 = unsafe4;
                                t4 = t5;
                                if (i29 == 0) {
                                    iM10064j = C2622l.m5249F1(bArr2, iM5350c0, c4389w4);
                                    if (c4389w4.f23584b != 0) {
                                        c4268n6 = c4268n6;
                                        z = true;
                                    } else {
                                        c4268n6 = c4268n6;
                                        z = false;
                                    }
                                    C4353t7.f23479e.mo10249g(t4, j2, z);
                                    unsafe5 = unsafe6;
                                    c4268n7 = c4268n6;
                                    t2 = t4;
                                    i26 |= i16;
                                    unsafe2 = unsafe5;
                                    i7 = i19;
                                }
                                unsafe5 = unsafe6;
                                i24 = i19;
                                break;
                            case 8:
                                i8 = i28;
                                i19 = i4;
                                unsafe6 = unsafe4;
                                t4 = t5;
                                c4268n8 = c4268n6;
                                if (i29 == 2) {
                                    if ((536870912 & i5) == 0) {
                                        iM10064j = C2622l.m5387j2(bArr2, iM5350c0, c4389w4);
                                    } else {
                                        iM10064j = C2622l.m5265I2(bArr2, iM5350c0, c4389w4);
                                    }
                                    unsafe6.putObject(t4, j2, c4389w4.f23585c);
                                    unsafe5 = unsafe6;
                                    c4268n7 = c4268n8;
                                    t2 = t4;
                                    i26 |= i16;
                                    unsafe2 = unsafe5;
                                    i7 = i19;
                                }
                                unsafe5 = unsafe6;
                                i24 = i19;
                                break;
                            case 9:
                                i8 = i28;
                                i19 = i4;
                                unsafe5 = unsafe4;
                                t4 = t5;
                                c4268n8 = c4268n6;
                                if (i29 == 2) {
                                    iM10064j = C2622l.m5370g0(c4268n8.m10068o(i19), bArr2, iM5350c0, i22, c4389w4);
                                    object = unsafe5.getObject(t4, j2);
                                    if (object == null) {
                                        unsafe5.putObject(t4, j2, c4389w4.f23585c);
                                    } else {
                                        unsafe5.putObject(t4, j2, C4127d5.m9547c(object, c4389w4.f23585c));
                                    }
                                    c4268n7 = c4268n8;
                                    t2 = t4;
                                    i26 |= i16;
                                    unsafe2 = unsafe5;
                                    i7 = i19;
                                }
                                i24 = i19;
                                break;
                            case 10:
                                i8 = i28;
                                i19 = i4;
                                unsafe5 = unsafe4;
                                t4 = t5;
                                c4268n8 = c4268n6;
                                if (i29 == 2) {
                                    iM10064j = C2622l.m5343a3(bArr2, iM5350c0, c4389w4);
                                    unsafe5.putObject(t4, j2, c4389w4.f23585c);
                                    c4268n7 = c4268n8;
                                    t2 = t4;
                                    i26 |= i16;
                                    unsafe2 = unsafe5;
                                    i7 = i19;
                                }
                                i24 = i19;
                                break;
                            case 12:
                                i8 = i28;
                                i19 = i4;
                                unsafe5 = unsafe4;
                                t4 = t5;
                                c4268n8 = c4268n6;
                                if (i29 == 0) {
                                    iM10064j = C2622l.m5395l0(bArr2, iM5350c0, c4389w4);
                                    unsafe5.putInt(t4, j2, c4389w4.f23583a);
                                    c4268n7 = c4268n8;
                                    t2 = t4;
                                    i26 |= i16;
                                    unsafe2 = unsafe5;
                                    i7 = i19;
                                }
                                i24 = i19;
                                break;
                            case 15:
                                i8 = i28;
                                i19 = i4;
                                unsafe5 = unsafe4;
                                t4 = t5;
                                c4268n8 = c4268n6;
                                if (i29 == 0) {
                                    iM10064j = C2622l.m5395l0(bArr2, iM5350c0, c4389w4);
                                    unsafe5.putInt(t4, j2, AbstractC4154f4.m9598k(c4389w4.f23583a));
                                    c4268n7 = c4268n8;
                                    t2 = t4;
                                    i26 |= i16;
                                    unsafe2 = unsafe5;
                                    i7 = i19;
                                }
                                i24 = i19;
                                break;
                            case 16:
                                if (i29 == 0) {
                                    i8 = i28;
                                    i19 = i4;
                                    unsafe5 = unsafe4;
                                    i24 = i19;
                                } else {
                                    iM10064j = C2622l.m5249F1(bArr2, iM5350c0, c4389w4);
                                    i19 = i4;
                                    i8 = i28;
                                    T t6 = t5;
                                    unsafe4.putLong(t, j2, AbstractC4154f4.m9596b(c4389w4.f23584b));
                                    i26 |= i16;
                                    i22 = i22;
                                    unsafe2 = unsafe4;
                                    c4268n7 = c4268n6;
                                    t2 = t6;
                                    i7 = i19;
                                }
                                break;
                            default:
                                i8 = i28;
                                i19 = i4;
                                unsafe5 = unsafe4;
                                i24 = i19;
                                break;
                        }
                        i23 = i8;
                        unsafe8 = unsafe3;
                        i20 = -1;
                        i21 = 1048575;
                    } else {
                        i7 = i4;
                        c4268n7 = c4268n6;
                        i8 = i28;
                        i22 = i22;
                        t2 = t5;
                        unsafe2 = unsafe;
                        if (i6 == 27) {
                            if (i6 <= 49) {
                                long j4 = i5;
                                i13 = iM5350c0;
                                i9 = i7;
                                i10 = i25;
                                i11 = i26;
                                unsafe3 = unsafe2;
                                iM10064j = m10065k(t, bArr, i13, i2, i3, i8, i29, i9, j4, i6, j2, c4389w3);
                                if (iM10064j == i13) {
                                    i14 = iM10064j;
                                    i24 = i9;
                                    i25 = i10;
                                    i26 = i11;
                                    iM10064j = C2622l.m5345b0(i3, bArr, i14, i2, m10037O(t), c4389w3);
                                } else {
                                    i24 = i9;
                                    i25 = i10;
                                    i26 = i11;
                                }
                                c4268n9 = this;
                                t5 = t;
                                bArr2 = bArr;
                                i22 = i2;
                                c4389w4 = c4389w3;
                            } else {
                                i9 = i7;
                                unsafe3 = unsafe2;
                                i10 = i25;
                                i11 = i26;
                                i12 = iM5350c0;
                                if (i6 == 50) {
                                    iM10064j = m10064j(t, bArr, i12, i2, i3, i8, i29, i5, i6, j2, i9, c4389w3);
                                    if (iM10064j == i12) {
                                        i24 = i9;
                                        i25 = i10;
                                        i26 = i11;
                                    }
                                    c4268n9 = this;
                                    t5 = t;
                                    bArr2 = bArr;
                                    i22 = i2;
                                    c4389w4 = c4389w3;
                                } else if (i29 == 2) {
                                    m10066l(t, bArr, i12, i2, i9, j2, c4389w3);
                                    throw null;
                                }
                                i14 = iM10064j;
                                i24 = i9;
                                i25 = i10;
                                i26 = i11;
                                iM10064j = C2622l.m5345b0(i3, bArr, i14, i2, m10037O(t), c4389w3);
                                c4268n9 = this;
                                t5 = t;
                                bArr2 = bArr;
                                i22 = i2;
                                c4389w4 = c4389w3;
                            }
                            i23 = i8;
                            unsafe8 = unsafe3;
                            i20 = -1;
                            i21 = 1048575;
                        } else if (i29 == 2) {
                            interfaceC4197i5Mo9340b = (InterfaceC4197i5) unsafe2.getObject(t2, j2);
                            if (!interfaceC4197i5Mo9340b.zza()) {
                                size = interfaceC4197i5Mo9340b.size();
                                if (size == 0) {
                                    i15 = 10;
                                } else {
                                    i15 = size << 1;
                                }
                                interfaceC4197i5Mo9340b = interfaceC4197i5Mo9340b.mo9340b(i15);
                                unsafe2.putObject(t2, j2, interfaceC4197i5Mo9340b);
                            }
                            iM10064j = C2622l.m5360e0(c4268n7.m10068o(i7), i3, bArr, iM5350c0, i2, interfaceC4197i5Mo9340b, c4389w3);
                        } else {
                            i9 = i7;
                            unsafe3 = unsafe2;
                            i10 = i25;
                            i11 = i26;
                            i12 = iM5350c0;
                        }
                        iM10064j = i12;
                        i14 = iM10064j;
                        i24 = i9;
                        i25 = i10;
                        i26 = i11;
                        iM10064j = C2622l.m5345b0(i3, bArr, i14, i2, m10037O(t), c4389w3);
                        c4268n9 = this;
                        t5 = t;
                        bArr2 = bArr;
                        i22 = i2;
                        c4389w4 = c4389w3;
                        i23 = i8;
                        unsafe8 = unsafe3;
                        i20 = -1;
                        i21 = 1048575;
                    }
                    unsafe3 = unsafe2;
                    t5 = t2;
                    i22 = i22;
                    int i32 = i7;
                    c4268n9 = c4268n7;
                    i24 = i32;
                    i23 = i8;
                    unsafe8 = unsafe3;
                    i20 = -1;
                    i21 = 1048575;
                }
                i14 = iM5350c0;
                unsafe3 = unsafe5;
                iM10064j = C2622l.m5345b0(i3, bArr, i14, i2, m10037O(t), c4389w3);
                c4268n9 = this;
                t5 = t;
                bArr2 = bArr;
                i22 = i2;
                c4389w4 = c4389w3;
                i23 = i8;
                unsafe8 = unsafe3;
                i20 = -1;
                i21 = 1048575;
            } else {
                iM10054Q = c4268n9.m10054Q(i28);
            }
            i4 = iM10054Q;
            if (i4 == i20) {
                i8 = i28;
                unsafe5 = unsafe8;
                i24 = 0;
            } else {
                iArr = c4268n9.f23352c;
                i5 = iArr[i4 + 1];
                i6 = (i5 & 267386880) >>> 20;
                unsafe = unsafe8;
                j2 = i5 & i21;
                c4268n6 = c4268n9;
                if (i6 <= 17) {
                    int i33 = iArr[i4 + 2];
                    i16 = 1 << (i33 >>> 20);
                    i17 = 1048575;
                    i18 = i33 & 1048575;
                    if (i18 != i25) {
                        if (i25 != 1048575) {
                            long j5 = i25;
                            unsafe7 = unsafe;
                            unsafe7.putInt(t5, j5, i26);
                            i17 = 1048575;
                        } else {
                            unsafe7 = unsafe;
                        }
                        if (i18 != i17) {
                            i26 = unsafe7.getInt(t5, i18);
                        }
                        unsafe4 = unsafe7;
                        i25 = i18;
                    } else {
                        i29 = i29;
                        unsafe4 = unsafe;
                    }
                    switch (i6) {
                        case 0:
                            i8 = i28;
                            i19 = i4;
                            unsafe5 = unsafe4;
                            i22 = i22;
                            c4268n7 = c4268n6;
                            t2 = t5;
                            if (i29 == 1) {
                                C4353t7.m10225d(t2, j2, Double.longBitsToDouble(C2622l.m5362e2(bArr2, iM5350c0)));
                                iM10064j = iM5350c0 + 8;
                                i26 |= i16;
                                unsafe2 = unsafe5;
                                i7 = i19;
                            }
                            i24 = i19;
                            break;
                        case 1:
                            i8 = i28;
                            i19 = i4;
                            unsafe5 = unsafe4;
                            i22 = i22;
                            c4268n7 = c4268n6;
                            t2 = t5;
                            if (i29 == 5) {
                                C4353t7.f23479e.mo10248d(t2, j2, Float.intBitsToFloat(C2622l.m5385j0(bArr2, iM5350c0)));
                                iM10064j = iM5350c0 + 4;
                                i26 |= i16;
                                unsafe2 = unsafe5;
                                i7 = i19;
                            }
                            i24 = i19;
                            break;
                        case 2:
                        case 3:
                            i8 = i28;
                            i19 = i4;
                            unsafe5 = unsafe4;
                            i22 = i22;
                            t2 = t5;
                            if (i29 == 0) {
                                iM10064j = C2622l.m5249F1(bArr2, iM5350c0, c4389w4);
                                unsafe5.putLong(t, j2, c4389w4.f23584b);
                                i26 |= i16;
                                unsafe2 = unsafe5;
                                c4268n7 = c4268n6;
                                i7 = i19;
                            }
                            i24 = i19;
                            break;
                        case 4:
                        case 11:
                            i8 = i28;
                            i19 = i4;
                            unsafe5 = unsafe4;
                            i22 = i22;
                            t2 = t5;
                            if (i29 == 0) {
                                iM10064j = C2622l.m5395l0(bArr2, iM5350c0, c4389w4);
                                unsafe5.putInt(t2, j2, c4389w4.f23583a);
                                c4268n7 = c4268n6;
                                i26 |= i16;
                                unsafe2 = unsafe5;
                                i7 = i19;
                            }
                            i24 = i19;
                            break;
                        case 5:
                        case 14:
                            i8 = i28;
                            i19 = i4;
                            unsafe6 = unsafe4;
                            t3 = t5;
                            if (i29 == 1) {
                                unsafe5 = unsafe6;
                                i22 = i22;
                                t2 = t3;
                                unsafe6.putLong(t, j2, C2622l.m5362e2(bArr2, iM5350c0));
                                iM10064j = iM5350c0 + 8;
                                c4268n7 = c4268n6;
                                i26 |= i16;
                                unsafe2 = unsafe5;
                                i7 = i19;
                            }
                            unsafe5 = unsafe6;
                            i24 = i19;
                            break;
                        case 6:
                        case 13:
                            i8 = i28;
                            i19 = i4;
                            unsafe6 = unsafe4;
                            t4 = t5;
                            if (i29 == 5) {
                                unsafe6.putInt(t4, j2, C2622l.m5385j0(bArr2, iM5350c0));
                                iM10064j = iM5350c0 + 4;
                                unsafe5 = unsafe6;
                                c4268n7 = c4268n6;
                                t2 = t4;
                                i26 |= i16;
                                unsafe2 = unsafe5;
                                i7 = i19;
                            }
                            unsafe5 = unsafe6;
                            i24 = i19;
                            break;
                        case 7:
                            i8 = i28;
                            i19 = i4;
                            unsafe6 = unsafe4;
                            t4 = t5;
                            if (i29 == 0) {
                                iM10064j = C2622l.m5249F1(bArr2, iM5350c0, c4389w4);
                                if (c4389w4.f23584b != 0) {
                                    c4268n6 = c4268n6;
                                    z = true;
                                } else {
                                    c4268n6 = c4268n6;
                                    z = false;
                                }
                                C4353t7.f23479e.mo10249g(t4, j2, z);
                                unsafe5 = unsafe6;
                                c4268n7 = c4268n6;
                                t2 = t4;
                                i26 |= i16;
                                unsafe2 = unsafe5;
                                i7 = i19;
                            }
                            unsafe5 = unsafe6;
                            i24 = i19;
                            break;
                        case 8:
                            i8 = i28;
                            i19 = i4;
                            unsafe6 = unsafe4;
                            t4 = t5;
                            c4268n8 = c4268n6;
                            if (i29 == 2) {
                                if ((536870912 & i5) == 0) {
                                    iM10064j = C2622l.m5387j2(bArr2, iM5350c0, c4389w4);
                                } else {
                                    iM10064j = C2622l.m5265I2(bArr2, iM5350c0, c4389w4);
                                }
                                unsafe6.putObject(t4, j2, c4389w4.f23585c);
                                unsafe5 = unsafe6;
                                c4268n7 = c4268n8;
                                t2 = t4;
                                i26 |= i16;
                                unsafe2 = unsafe5;
                                i7 = i19;
                            }
                            unsafe5 = unsafe6;
                            i24 = i19;
                            break;
                        case 9:
                            i8 = i28;
                            i19 = i4;
                            unsafe5 = unsafe4;
                            t4 = t5;
                            c4268n8 = c4268n6;
                            if (i29 == 2) {
                                iM10064j = C2622l.m5370g0(c4268n8.m10068o(i19), bArr2, iM5350c0, i22, c4389w4);
                                object = unsafe5.getObject(t4, j2);
                                if (object == null) {
                                    unsafe5.putObject(t4, j2, c4389w4.f23585c);
                                } else {
                                    unsafe5.putObject(t4, j2, C4127d5.m9547c(object, c4389w4.f23585c));
                                }
                                c4268n7 = c4268n8;
                                t2 = t4;
                                i26 |= i16;
                                unsafe2 = unsafe5;
                                i7 = i19;
                            }
                            i24 = i19;
                            break;
                        case 10:
                            i8 = i28;
                            i19 = i4;
                            unsafe5 = unsafe4;
                            t4 = t5;
                            c4268n8 = c4268n6;
                            if (i29 == 2) {
                                iM10064j = C2622l.m5343a3(bArr2, iM5350c0, c4389w4);
                                unsafe5.putObject(t4, j2, c4389w4.f23585c);
                                c4268n7 = c4268n8;
                                t2 = t4;
                                i26 |= i16;
                                unsafe2 = unsafe5;
                                i7 = i19;
                            }
                            i24 = i19;
                            break;
                        case 12:
                            i8 = i28;
                            i19 = i4;
                            unsafe5 = unsafe4;
                            t4 = t5;
                            c4268n8 = c4268n6;
                            if (i29 == 0) {
                                iM10064j = C2622l.m5395l0(bArr2, iM5350c0, c4389w4);
                                unsafe5.putInt(t4, j2, c4389w4.f23583a);
                                c4268n7 = c4268n8;
                                t2 = t4;
                                i26 |= i16;
                                unsafe2 = unsafe5;
                                i7 = i19;
                            }
                            i24 = i19;
                            break;
                        case 15:
                            i8 = i28;
                            i19 = i4;
                            unsafe5 = unsafe4;
                            t4 = t5;
                            c4268n8 = c4268n6;
                            if (i29 == 0) {
                                iM10064j = C2622l.m5395l0(bArr2, iM5350c0, c4389w4);
                                unsafe5.putInt(t4, j2, AbstractC4154f4.m9598k(c4389w4.f23583a));
                                c4268n7 = c4268n8;
                                t2 = t4;
                                i26 |= i16;
                                unsafe2 = unsafe5;
                                i7 = i19;
                            }
                            i24 = i19;
                            break;
                        case 16:
                            if (i29 == 0) {
                                i8 = i28;
                                i19 = i4;
                                unsafe5 = unsafe4;
                                i24 = i19;
                            } else {
                                iM10064j = C2622l.m5249F1(bArr2, iM5350c0, c4389w4);
                                i19 = i4;
                                i8 = i28;
                                T t7 = t5;
                                unsafe4.putLong(t, j2, AbstractC4154f4.m9596b(c4389w4.f23584b));
                                i26 |= i16;
                                i22 = i22;
                                unsafe2 = unsafe4;
                                c4268n7 = c4268n6;
                                t2 = t7;
                                i7 = i19;
                            }
                            break;
                        default:
                            i8 = i28;
                            i19 = i4;
                            unsafe5 = unsafe4;
                            i24 = i19;
                            break;
                    }
                    i23 = i8;
                    unsafe8 = unsafe3;
                    i20 = -1;
                    i21 = 1048575;
                } else {
                    i7 = i4;
                    c4268n7 = c4268n6;
                    i8 = i28;
                    i22 = i22;
                    t2 = t5;
                    unsafe2 = unsafe;
                    if (i6 == 27) {
                        if (i6 <= 49) {
                            long j6 = i5;
                            i13 = iM5350c0;
                            i9 = i7;
                            i10 = i25;
                            i11 = i26;
                            unsafe3 = unsafe2;
                            iM10064j = m10065k(t, bArr, i13, i2, i3, i8, i29, i9, j6, i6, j2, c4389w3);
                            if (iM10064j == i13) {
                                i14 = iM10064j;
                                i24 = i9;
                                i25 = i10;
                                i26 = i11;
                                iM10064j = C2622l.m5345b0(i3, bArr, i14, i2, m10037O(t), c4389w3);
                            } else {
                                i24 = i9;
                                i25 = i10;
                                i26 = i11;
                            }
                            c4268n9 = this;
                            t5 = t;
                            bArr2 = bArr;
                            i22 = i2;
                            c4389w4 = c4389w3;
                        } else {
                            i9 = i7;
                            unsafe3 = unsafe2;
                            i10 = i25;
                            i11 = i26;
                            i12 = iM5350c0;
                            if (i6 == 50) {
                                iM10064j = m10064j(t, bArr, i12, i2, i3, i8, i29, i5, i6, j2, i9, c4389w3);
                                if (iM10064j == i12) {
                                    i24 = i9;
                                    i25 = i10;
                                    i26 = i11;
                                }
                                c4268n9 = this;
                                t5 = t;
                                bArr2 = bArr;
                                i22 = i2;
                                c4389w4 = c4389w3;
                            } else if (i29 == 2) {
                                m10066l(t, bArr, i12, i2, i9, j2, c4389w3);
                                throw null;
                            }
                            i14 = iM10064j;
                            i24 = i9;
                            i25 = i10;
                            i26 = i11;
                            iM10064j = C2622l.m5345b0(i3, bArr, i14, i2, m10037O(t), c4389w3);
                            c4268n9 = this;
                            t5 = t;
                            bArr2 = bArr;
                            i22 = i2;
                            c4389w4 = c4389w3;
                        }
                        i23 = i8;
                        unsafe8 = unsafe3;
                        i20 = -1;
                        i21 = 1048575;
                    } else if (i29 == 2) {
                        interfaceC4197i5Mo9340b = (InterfaceC4197i5) unsafe2.getObject(t2, j2);
                        if (!interfaceC4197i5Mo9340b.zza()) {
                            size = interfaceC4197i5Mo9340b.size();
                            if (size == 0) {
                                i15 = 10;
                            } else {
                                i15 = size << 1;
                            }
                            interfaceC4197i5Mo9340b = interfaceC4197i5Mo9340b.mo9340b(i15);
                            unsafe2.putObject(t2, j2, interfaceC4197i5Mo9340b);
                        }
                        iM10064j = C2622l.m5360e0(c4268n7.m10068o(i7), i3, bArr, iM5350c0, i2, interfaceC4197i5Mo9340b, c4389w3);
                    } else {
                        i9 = i7;
                        unsafe3 = unsafe2;
                        i10 = i25;
                        i11 = i26;
                        i12 = iM5350c0;
                    }
                    iM10064j = i12;
                    i14 = iM10064j;
                    i24 = i9;
                    i25 = i10;
                    i26 = i11;
                    iM10064j = C2622l.m5345b0(i3, bArr, i14, i2, m10037O(t), c4389w3);
                    c4268n9 = this;
                    t5 = t;
                    bArr2 = bArr;
                    i22 = i2;
                    c4389w4 = c4389w3;
                    i23 = i8;
                    unsafe8 = unsafe3;
                    i20 = -1;
                    i21 = 1048575;
                }
                unsafe3 = unsafe2;
                t5 = t2;
                i22 = i22;
                int i34 = i7;
                c4268n9 = c4268n7;
                i24 = i34;
                i23 = i8;
                unsafe8 = unsafe3;
                i20 = -1;
                i21 = 1048575;
            }
            i14 = iM5350c0;
            unsafe3 = unsafe5;
            iM10064j = C2622l.m5345b0(i3, bArr, i14, i2, m10037O(t), c4389w3);
            c4268n9 = this;
            t5 = t;
            bArr2 = bArr;
            i22 = i2;
            c4389w4 = c4389w3;
            i23 = i8;
            unsafe8 = unsafe3;
            i20 = -1;
            i21 = 1048575;
        }
        int i35 = i25;
        int i36 = i26;
        Unsafe unsafe9 = unsafe8;
        if (i35 != 1048575) {
            unsafe9.putInt(t, i35, i36);
        }
        if (iM10064j != i2) {
            throw C4239l5.m10001g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: h */
    public final void mo10062h(T t, C4210j4 c4210j4, C4280o4 c4280o4) throws IOException {
        Objects.requireNonNull(c4280o4);
        AbstractC4269n7<?, ?> abstractC4269n7 = this.f23365p;
        AbstractC4308q4<?> abstractC4308q4 = this.f23366q;
        C4364u4 c4364u4Mo10166i = null;
        Object objMo10160c = null;
        while (true) {
            try {
                int iM9884a = c4210j4.m9884a();
                int iM10054Q = m10054Q(iM9884a);
                if (iM10054Q >= 0) {
                    int iM10052K = m10052K(iM10054Q);
                    switch ((267386880 & iM10052K) >>> 20) {
                        case 0:
                            C4353t7.m10225d(t, iM10052K & 1048575, c4210j4.m9897p());
                            m10046D(t, iM10054Q);
                            break;
                        case 1:
                            C4353t7.f23479e.mo10248d(t, iM10052K & 1048575, c4210j4.m9901t());
                            m10046D(t, iM10054Q);
                            break;
                        case 2:
                            C4353t7.m10227f(t, iM10052K & 1048575, c4210j4.m9905x());
                            m10046D(t, iM10054Q);
                            break;
                        case 3:
                            C4353t7.m10227f(t, iM10052K & 1048575, c4210j4.m9903v());
                            m10046D(t, iM10054Q);
                            break;
                        case 4:
                            C4353t7.f23479e.m10253e(t, iM10052K & 1048575, c4210j4.m9907z());
                            m10046D(t, iM10054Q);
                            break;
                        case 5:
                            C4353t7.m10227f(t, iM10052K & 1048575, c4210j4.m9864B());
                            m10046D(t, iM10054Q);
                            break;
                        case 6:
                            C4353t7.m10226e(t, iM10052K & 1048575, c4210j4.m9866D());
                            m10046D(t, iM10054Q);
                            break;
                        case 7:
                            C4353t7.m10229h(t, iM10052K & 1048575, c4210j4.m9869G());
                            m10046D(t, iM10054Q);
                            break;
                        case 8:
                            m10071v(t, iM10052K, c4210j4);
                            m10046D(t, iM10054Q);
                            break;
                        case 9:
                            if (m10073x(t, iM10054Q)) {
                                long j2 = iM10052K & 1048575;
                                C4353t7.m10228g(t, j2, C4127d5.m9547c(C4353t7.m10241t(t, j2), c4210j4.m9885b(m10068o(iM10054Q), c4280o4)));
                            } else {
                                C4353t7.m10228g(t, iM10052K & 1048575, c4210j4.m9885b(m10068o(iM10054Q), c4280o4));
                                m10046D(t, iM10054Q);
                            }
                            break;
                        case 10:
                            C4353t7.m10228g(t, iM10052K & 1048575, c4210j4.m9873K());
                            m10046D(t, iM10054Q);
                            break;
                        case 11:
                            C4353t7.m10226e(t, iM10052K & 1048575, c4210j4.m9875M());
                            m10046D(t, iM10054Q);
                            break;
                        case 12:
                            int iM9877O = c4210j4.m9877O();
                            InterfaceC4183h5 interfaceC4183h5M10050I = m10050I(iM10054Q);
                            if (interfaceC4183h5M10050I == null || interfaceC4183h5M10050I.mo9829b(iM9877O)) {
                                C4353t7.m10226e(t, iM10052K & 1048575, iM9877O);
                                m10046D(t, iM10054Q);
                            } else {
                                objMo10160c = C4101b7.m9467f(iM9884a, iM9877O, objMo10160c, abstractC4269n7);
                            }
                            break;
                        case 13:
                            C4353t7.m10226e(t, iM10052K & 1048575, c4210j4.m9879Q());
                            m10046D(t, iM10054Q);
                            break;
                        case 14:
                            C4353t7.m10227f(t, iM10052K & 1048575, c4210j4.m9881S());
                            m10046D(t, iM10054Q);
                            break;
                        case 15:
                            C4353t7.m10226e(t, iM10052K & 1048575, c4210j4.m9882T());
                            m10046D(t, iM10054Q);
                            break;
                        case 16:
                            C4353t7.m10227f(t, iM10052K & 1048575, c4210j4.m9883U());
                            m10046D(t, iM10054Q);
                            break;
                        case 17:
                            if (m10073x(t, iM10054Q)) {
                                long j3 = iM10052K & 1048575;
                                C4353t7.m10228g(t, j3, C4127d5.m9547c(C4353t7.m10241t(t, j3), c4210j4.m9891h(m10068o(iM10054Q), c4280o4)));
                            } else {
                                C4353t7.m10228g(t, iM10052K & 1048575, c4210j4.m9891h(m10068o(iM10054Q), c4280o4));
                                m10046D(t, iM10054Q);
                            }
                            break;
                        case 18:
                            c4210j4.m9887d(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 19:
                            c4210j4.m9892j(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 20:
                            c4210j4.m9900s(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 21:
                            c4210j4.m9895n(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 22:
                            c4210j4.m9902u(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 23:
                            c4210j4.m9904w(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 24:
                            c4210j4.m9906y(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 25:
                            c4210j4.m9863A(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 26:
                            if ((536870912 & iM10052K) != 0) {
                                c4210j4.m9867E(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            } else {
                                c4210j4.m9865C(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            }
                            break;
                        case 27:
                            c4210j4.m9888e(this.f23364o.mo10285a(t, iM10052K & 1048575), m10068o(iM10054Q), c4280o4);
                            break;
                        case 28:
                            c4210j4.m9868F(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 29:
                            c4210j4.m9870H(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 30:
                            List<Integer> listMo10285a = this.f23364o.mo10285a(t, iM10052K & 1048575);
                            c4210j4.m9872J(listMo10285a);
                            objMo10160c = C4101b7.m9468g(iM9884a, listMo10285a, m10050I(iM10054Q), objMo10160c, abstractC4269n7);
                            break;
                        case 31:
                            c4210j4.m9874L(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 32:
                            c4210j4.m9876N(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 33:
                            c4210j4.m9878P(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 34:
                            c4210j4.m9880R(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 35:
                            c4210j4.m9887d(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 36:
                            c4210j4.m9892j(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 37:
                            c4210j4.m9900s(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 38:
                            c4210j4.m9895n(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 39:
                            c4210j4.m9902u(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 40:
                            c4210j4.m9904w(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 41:
                            c4210j4.m9906y(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 42:
                            c4210j4.m9863A(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 43:
                            c4210j4.m9870H(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 44:
                            List<Integer> listMo10285a2 = this.f23364o.mo10285a(t, iM10052K & 1048575);
                            c4210j4.m9872J(listMo10285a2);
                            objMo10160c = C4101b7.m9468g(iM9884a, listMo10285a2, m10050I(iM10054Q), objMo10160c, abstractC4269n7);
                            break;
                        case 45:
                            c4210j4.m9874L(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 46:
                            c4210j4.m9876N(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 47:
                            c4210j4.m9878P(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 48:
                            c4210j4.m9880R(this.f23364o.mo10285a(t, iM10052K & 1048575));
                            break;
                        case 49:
                            c4210j4.m9893k(this.f23364o.mo10285a(t, iM10052K & 1048575), m10068o(iM10054Q), c4280o4);
                            break;
                        case 50:
                            Object objM10045C = m10045C(iM10054Q);
                            long jM10052K = m10052K(iM10054Q) & 1048575;
                            Object objM10241t = C4353t7.m10241t(t, jM10052K);
                            if (objM10241t == null) {
                                objM10241t = this.f23367r.mo9560c(objM10045C);
                                C4353t7.m10228g(t, jM10052K, objM10241t);
                            } else if (this.f23367r.mo9562e(objM10241t)) {
                                Object objMo9560c = this.f23367r.mo9560c(objM10045C);
                                this.f23367r.mo9563f(objMo9560c, objM10241t);
                                C4353t7.m10228g(t, jM10052K, objMo9560c);
                                objM10241t = objMo9560c;
                            }
                            c4210j4.m9890g(this.f23367r.mo9558a(objM10241t), this.f23367r.mo9564g(objM10045C), c4280o4);
                            throw null;
                        case 51:
                            C4353t7.m10228g(t, iM10052K & 1048575, Double.valueOf(c4210j4.m9897p()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 52:
                            C4353t7.m10228g(t, iM10052K & 1048575, Float.valueOf(c4210j4.m9901t()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 53:
                            C4353t7.m10228g(t, iM10052K & 1048575, Long.valueOf(c4210j4.m9905x()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 54:
                            C4353t7.m10228g(t, iM10052K & 1048575, Long.valueOf(c4210j4.m9903v()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 55:
                            C4353t7.m10228g(t, iM10052K & 1048575, Integer.valueOf(c4210j4.m9907z()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 56:
                            C4353t7.m10228g(t, iM10052K & 1048575, Long.valueOf(c4210j4.m9864B()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 57:
                            C4353t7.m10228g(t, iM10052K & 1048575, Integer.valueOf(c4210j4.m9866D()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 58:
                            C4353t7.m10228g(t, iM10052K & 1048575, Boolean.valueOf(c4210j4.m9869G()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 59:
                            m10071v(t, iM10052K, c4210j4);
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 60:
                            if (m10074y(t, iM9884a, iM10054Q)) {
                                long j4 = iM10052K & 1048575;
                                C4353t7.m10228g(t, j4, C4127d5.m9547c(C4353t7.m10241t(t, j4), c4210j4.m9885b(m10068o(iM10054Q), c4280o4)));
                            } else {
                                C4353t7.m10228g(t, iM10052K & 1048575, c4210j4.m9885b(m10068o(iM10054Q), c4280o4));
                                m10046D(t, iM10054Q);
                            }
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 61:
                            C4353t7.m10228g(t, iM10052K & 1048575, c4210j4.m9873K());
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 62:
                            C4353t7.m10228g(t, iM10052K & 1048575, Integer.valueOf(c4210j4.m9875M()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 63:
                            int iM9877O2 = c4210j4.m9877O();
                            InterfaceC4183h5 interfaceC4183h5M10050I2 = m10050I(iM10054Q);
                            if (interfaceC4183h5M10050I2 == null || interfaceC4183h5M10050I2.mo9829b(iM9877O2)) {
                                C4353t7.m10228g(t, iM10052K & 1048575, Integer.valueOf(iM9877O2));
                                m10047E(t, iM9884a, iM10054Q);
                            } else {
                                objMo10160c = C4101b7.m9467f(iM9884a, iM9877O2, objMo10160c, abstractC4269n7);
                            }
                            break;
                        case 64:
                            C4353t7.m10228g(t, iM10052K & 1048575, Integer.valueOf(c4210j4.m9879Q()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 65:
                            C4353t7.m10228g(t, iM10052K & 1048575, Long.valueOf(c4210j4.m9881S()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 66:
                            C4353t7.m10228g(t, iM10052K & 1048575, Integer.valueOf(c4210j4.m9882T()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 67:
                            C4353t7.m10228g(t, iM10052K & 1048575, Long.valueOf(c4210j4.m9883U()));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        case 68:
                            C4353t7.m10228g(t, iM10052K & 1048575, c4210j4.m9891h(m10068o(iM10054Q), c4280o4));
                            m10047E(t, iM9884a, iM10054Q);
                            break;
                        default:
                            if (objMo10160c == null) {
                                try {
                                    objMo10160c = abstractC4269n7.mo10076a();
                                } catch (C4225k5 unused) {
                                    abstractC4269n7.mo10084i(c4210j4);
                                    if (objMo10160c == null) {
                                        objMo10160c = abstractC4269n7.mo10090o(t);
                                    }
                                    if (!abstractC4269n7.m10085j((Object) objMo10160c, c4210j4)) {
                                        for (int i = this.f23361l; i < this.f23362m; i++) {
                                            m10069p(t, this.f23360k[i], objMo10160c, abstractC4269n7);
                                        }
                                        if (objMo10160c != null) {
                                            abstractC4269n7.mo10089n(t, (Object) objMo10160c);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                break;
                            }
                            if (!abstractC4269n7.m10085j((Object) objMo10160c, c4210j4)) {
                                for (int i2 = this.f23361l; i2 < this.f23362m; i2++) {
                                    m10069p(t, this.f23360k[i2], objMo10160c, abstractC4269n7);
                                }
                                if (objMo10160c != null) {
                                    abstractC4269n7.mo10089n(t, (Object) objMo10160c);
                                    return;
                                }
                                return;
                            }
                            break;
                            break;
                    }
                } else {
                    if (iM9884a == Integer.MAX_VALUE) {
                        for (int i3 = this.f23361l; i3 < this.f23362m; i3++) {
                            m10069p(t, this.f23360k[i3], objMo10160c, abstractC4269n7);
                        }
                        if (objMo10160c != null) {
                            abstractC4269n7.mo10089n(t, (Object) objMo10160c);
                            return;
                        }
                        return;
                    }
                    Object objMo10161d = !this.f23357h ? null : abstractC4308q4.mo10161d(c4280o4, this.f23356g, iM9884a);
                    if (objMo10161d != null) {
                        if (c4364u4Mo10166i == null) {
                            c4364u4Mo10166i = abstractC4308q4.mo10166i(t);
                        }
                        C4364u4 c4364u4 = c4364u4Mo10166i;
                        objMo10160c = abstractC4308q4.mo10160c(c4210j4, objMo10161d, c4280o4, c4364u4, objMo10160c, abstractC4269n7);
                        c4364u4Mo10166i = c4364u4;
                    } else {
                        abstractC4269n7.mo10084i(c4210j4);
                        if (objMo10160c == null) {
                            objMo10160c = abstractC4269n7.mo10090o(t);
                        }
                        if (!abstractC4269n7.m10085j((Object) objMo10160c, c4210j4)) {
                            for (int i4 = this.f23361l; i4 < this.f23362m; i4++) {
                                m10069p(t, this.f23360k[i4], objMo10160c, abstractC4269n7);
                            }
                            if (objMo10160c != null) {
                                abstractC4269n7.mo10089n(t, (Object) objMo10160c);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.f23361l; i5 < this.f23362m; i5++) {
                    m10069p(t, this.f23360k[i5], objMo10160c, abstractC4269n7);
                }
                if (objMo10160c != null) {
                    abstractC4269n7.mo10089n(t, (Object) objMo10160c);
                }
                throw th;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    /* JADX INFO: renamed from: i */
    public final void mo10063i(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f23352c.length; i += 3) {
            int iM10052K = m10052K(i);
            long j2 = 1048575 & iM10052K;
            int i2 = this.f23352c[i];
            switch ((iM10052K & 267386880) >>> 20) {
                case 0:
                    if (m10073x(t2, i)) {
                        C4353t7.m10225d(t, j2, C4353t7.m10240s(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 1:
                    if (m10073x(t2, i)) {
                        C4353t7.f23479e.mo10248d(t, j2, C4353t7.m10237p(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 2:
                    if (m10073x(t2, i)) {
                        C4353t7.m10227f(t, j2, C4353t7.m10232k(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 3:
                    if (m10073x(t2, i)) {
                        C4353t7.m10227f(t, j2, C4353t7.m10232k(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 4:
                    if (m10073x(t2, i)) {
                        C4353t7.f23479e.m10253e(t, j2, C4353t7.m10223b(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 5:
                    if (m10073x(t2, i)) {
                        C4353t7.m10227f(t, j2, C4353t7.m10232k(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 6:
                    if (m10073x(t2, i)) {
                        C4353t7.f23479e.m10253e(t, j2, C4353t7.m10223b(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 7:
                    if (m10073x(t2, i)) {
                        C4353t7.f23479e.mo10249g(t, j2, C4353t7.m10236o(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 8:
                    if (m10073x(t2, i)) {
                        C4353t7.m10228g(t, j2, C4353t7.m10241t(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 9:
                    m10072w(t, t2, i);
                    break;
                case 10:
                    if (m10073x(t2, i)) {
                        C4353t7.m10228g(t, j2, C4353t7.m10241t(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 11:
                    if (m10073x(t2, i)) {
                        C4353t7.f23479e.m10253e(t, j2, C4353t7.m10223b(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 12:
                    if (m10073x(t2, i)) {
                        C4353t7.f23479e.m10253e(t, j2, C4353t7.m10223b(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 13:
                    if (m10073x(t2, i)) {
                        C4353t7.f23479e.m10253e(t, j2, C4353t7.m10223b(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 14:
                    if (m10073x(t2, i)) {
                        C4353t7.m10227f(t, j2, C4353t7.m10232k(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 15:
                    if (m10073x(t2, i)) {
                        C4353t7.f23479e.m10253e(t, j2, C4353t7.m10223b(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 16:
                    if (m10073x(t2, i)) {
                        C4353t7.m10227f(t, j2, C4353t7.m10232k(t2, j2));
                        m10046D(t, i);
                    }
                    break;
                case 17:
                    m10072w(t, t2, i);
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
                    this.f23364o.mo10286b(t, t2, j2);
                    break;
                case 50:
                    InterfaceC4142e6 interfaceC4142e6 = this.f23367r;
                    Class<?> cls = C4101b7.f23089a;
                    C4353t7.m10228g(t, j2, interfaceC4142e6.mo9563f(C4353t7.m10241t(t, j2), C4353t7.m10241t(t2, j2)));
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
                    if (m10074y(t2, i2, i)) {
                        C4353t7.m10228g(t, j2, C4353t7.m10241t(t2, j2));
                        m10047E(t, i2, i);
                    }
                    break;
                case 60:
                    m10049G(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m10074y(t2, i2, i)) {
                        C4353t7.m10228g(t, j2, C4353t7.m10241t(t2, j2));
                        m10047E(t, i2, i);
                    }
                    break;
                case 68:
                    m10049G(t, t2, i);
                    break;
            }
        }
        AbstractC4269n7<?, ?> abstractC4269n7 = this.f23365p;
        Class<?> cls2 = C4101b7.f23089a;
        abstractC4269n7.mo10083h(t, abstractC4269n7.mo10091p(abstractC4269n7.mo10086k(t), abstractC4269n7.mo10086k(t2)));
        if (this.f23357h) {
            C4101b7.m9472k(this.f23366q, t, t2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m10064j(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, C4389w3 c4389w3) throws IOException {
        int iM5249F1;
        Unsafe unsafe = f23351b;
        long j3 = this.f23352c[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j2, Double.valueOf(Double.longBitsToDouble(C2622l.m5362e2(bArr, i))));
                iM5249F1 = i + 8;
                unsafe.putInt(t, j3, i4);
                return iM5249F1;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j2, Float.valueOf(Float.intBitsToFloat(C2622l.m5385j0(bArr, i))));
                iM5249F1 = i + 4;
                unsafe.putInt(t, j3, i4);
                return iM5249F1;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                iM5249F1 = C2622l.m5249F1(bArr, i, c4389w3);
                unsafe.putObject(t, j2, Long.valueOf(c4389w3.f23584b));
                unsafe.putInt(t, j3, i4);
                return iM5249F1;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                iM5249F1 = C2622l.m5395l0(bArr, i, c4389w3);
                unsafe.putObject(t, j2, Integer.valueOf(c4389w3.f23583a));
                unsafe.putInt(t, j3, i4);
                return iM5249F1;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j2, Long.valueOf(C2622l.m5362e2(bArr, i)));
                iM5249F1 = i + 8;
                unsafe.putInt(t, j3, i4);
                return iM5249F1;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j2, Integer.valueOf(C2622l.m5385j0(bArr, i)));
                iM5249F1 = i + 4;
                unsafe.putInt(t, j3, i4);
                return iM5249F1;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                iM5249F1 = C2622l.m5249F1(bArr, i, c4389w3);
                unsafe.putObject(t, j2, Boolean.valueOf(c4389w3.f23584b != 0));
                unsafe.putInt(t, j3, i4);
                return iM5249F1;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iM5395l0 = C2622l.m5395l0(bArr, i, c4389w3);
                int i9 = c4389w3.f23583a;
                if (i9 == 0) {
                    unsafe.putObject(t, j2, "");
                } else {
                    if ((i6 & 536870912) != 0 && !C4367u7.m10279b(bArr, iM5395l0, iM5395l0 + i9)) {
                        throw C4239l5.m10002h();
                    }
                    unsafe.putObject(t, j2, new String(bArr, iM5395l0, i9, C4127d5.f23112a));
                    iM5395l0 += i9;
                }
                unsafe.putInt(t, j3, i4);
                return iM5395l0;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iM5370g0 = C2622l.m5370g0(m10068o(i8), bArr, i, i2, c4389w3);
                Object object = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j2) : null;
                if (object == null) {
                    unsafe.putObject(t, j2, c4389w3.f23585c);
                } else {
                    unsafe.putObject(t, j2, C4127d5.m9547c(object, c4389w3.f23585c));
                }
                unsafe.putInt(t, j3, i4);
                return iM5370g0;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                iM5249F1 = C2622l.m5343a3(bArr, i, c4389w3);
                unsafe.putObject(t, j2, c4389w3.f23585c);
                unsafe.putInt(t, j3, i4);
                return iM5249F1;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iM5395l1 = C2622l.m5395l0(bArr, i, c4389w3);
                int i10 = c4389w3.f23583a;
                InterfaceC4183h5 interfaceC4183h5 = (InterfaceC4183h5) this.f23353d[((i8 / 3) << 1) + 1];
                if (interfaceC4183h5 != null && !interfaceC4183h5.mo9829b(i10)) {
                    m10037O(t).m10011a(i3, Long.valueOf(i10));
                    return iM5395l1;
                }
                unsafe.putObject(t, j2, Integer.valueOf(i10));
                iM5249F1 = iM5395l1;
                unsafe.putInt(t, j3, i4);
                return iM5249F1;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                iM5249F1 = C2622l.m5395l0(bArr, i, c4389w3);
                unsafe.putObject(t, j2, Integer.valueOf(AbstractC4154f4.m9598k(c4389w3.f23583a)));
                unsafe.putInt(t, j3, i4);
                return iM5249F1;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                iM5249F1 = C2622l.m5249F1(bArr, i, c4389w3);
                unsafe.putObject(t, j2, Long.valueOf(AbstractC4154f4.m9596b(c4389w3.f23584b)));
                unsafe.putInt(t, j3, i4);
                return iM5249F1;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                iM5249F1 = C2622l.m5365f0(m10068o(i8), bArr, i, i2, (i3 & (-8)) | 4, c4389w3);
                Object object2 = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j2) : null;
                if (object2 == null) {
                    unsafe.putObject(t, j2, c4389w3.f23585c);
                } else {
                    unsafe.putObject(t, j2, C4127d5.m9547c(object2, c4389w3.f23585c));
                }
                unsafe.putInt(t, j3, i4);
                return iM5249F1;
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final int m10065k(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j2, int i7, long j3, C4389w3 c4389w3) throws IOException {
        int iM5395l0;
        int iM5395l1 = i;
        Unsafe unsafe = f23351b;
        InterfaceC4197i5 interfaceC4197i5Mo9340b = (InterfaceC4197i5) unsafe.getObject(t, j3);
        if (!interfaceC4197i5Mo9340b.zza()) {
            int size = interfaceC4197i5Mo9340b.size();
            interfaceC4197i5Mo9340b = interfaceC4197i5Mo9340b.mo9340b(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j3, interfaceC4197i5Mo9340b);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    C4252m4 c4252m4 = (C4252m4) interfaceC4197i5Mo9340b;
                    int iM5395l2 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                    int i8 = c4389w3.f23583a + iM5395l2;
                    while (iM5395l2 < i8) {
                        c4252m4.m10006f(Double.longBitsToDouble(C2622l.m5362e2(bArr, iM5395l2)));
                        iM5395l2 += 8;
                    }
                    if (iM5395l2 == i8) {
                        return iM5395l2;
                    }
                    throw C4239l5.m9995a();
                }
                if (i5 == 1) {
                    C4252m4 c4252m5 = (C4252m4) interfaceC4197i5Mo9340b;
                    c4252m5.m10006f(Double.longBitsToDouble(C2622l.m5362e2(bArr, i)));
                    while (true) {
                        int i9 = iM5395l1 + 8;
                        if (i9 >= i2) {
                            return i9;
                        }
                        iM5395l1 = C2622l.m5395l0(bArr, i9, c4389w3);
                        if (i3 != c4389w3.f23583a) {
                            return i9;
                        }
                        c4252m5.m10006f(Double.longBitsToDouble(C2622l.m5362e2(bArr, iM5395l1)));
                    }
                }
                return iM5395l1;
            case 19:
            case 36:
                if (i5 == 2) {
                    C4085a5 c4085a5 = (C4085a5) interfaceC4197i5Mo9340b;
                    int iM5395l3 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                    int i10 = c4389w3.f23583a + iM5395l3;
                    while (iM5395l3 < i10) {
                        c4085a5.m9341f(Float.intBitsToFloat(C2622l.m5385j0(bArr, iM5395l3)));
                        iM5395l3 += 4;
                    }
                    if (iM5395l3 == i10) {
                        return iM5395l3;
                    }
                    throw C4239l5.m9995a();
                }
                if (i5 == 5) {
                    C4085a5 c4085a6 = (C4085a5) interfaceC4197i5Mo9340b;
                    c4085a6.m9341f(Float.intBitsToFloat(C2622l.m5385j0(bArr, i)));
                    while (true) {
                        int i11 = iM5395l1 + 4;
                        if (i11 >= i2) {
                            return i11;
                        }
                        iM5395l1 = C2622l.m5395l0(bArr, i11, c4389w3);
                        if (i3 != c4389w3.f23583a) {
                            return i11;
                        }
                        c4085a6.m9341f(Float.intBitsToFloat(C2622l.m5385j0(bArr, iM5395l1)));
                    }
                }
                return iM5395l1;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    C4430z5 c4430z5 = (C4430z5) interfaceC4197i5Mo9340b;
                    int iM5395l4 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                    int i12 = c4389w3.f23583a + iM5395l4;
                    while (iM5395l4 < i12) {
                        iM5395l4 = C2622l.m5249F1(bArr, iM5395l4, c4389w3);
                        c4430z5.m10343f(c4389w3.f23584b);
                    }
                    if (iM5395l4 == i12) {
                        return iM5395l4;
                    }
                    throw C4239l5.m9995a();
                }
                if (i5 == 0) {
                    C4430z5 c4430z6 = (C4430z5) interfaceC4197i5Mo9340b;
                    int iM5249F1 = C2622l.m5249F1(bArr, iM5395l1, c4389w3);
                    c4430z6.m10343f(c4389w3.f23584b);
                    while (iM5249F1 < i2) {
                        int iM5395l5 = C2622l.m5395l0(bArr, iM5249F1, c4389w3);
                        if (i3 != c4389w3.f23583a) {
                            return iM5249F1;
                        }
                        iM5249F1 = C2622l.m5249F1(bArr, iM5395l5, c4389w3);
                        c4430z6.m10343f(c4389w3.f23584b);
                    }
                    return iM5249F1;
                }
                return iM5395l1;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C2622l.m5400m0(bArr, iM5395l1, interfaceC4197i5Mo9340b, c4389w3);
                }
                if (i5 == 0) {
                    return C2622l.m5340a0(i3, bArr, i, i2, interfaceC4197i5Mo9340b, c4389w3);
                }
                return iM5395l1;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    C4430z5 c4430z7 = (C4430z5) interfaceC4197i5Mo9340b;
                    int iM5395l6 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                    int i13 = c4389w3.f23583a + iM5395l6;
                    while (iM5395l6 < i13) {
                        c4430z7.m10343f(C2622l.m5362e2(bArr, iM5395l6));
                        iM5395l6 += 8;
                    }
                    if (iM5395l6 == i13) {
                        return iM5395l6;
                    }
                    throw C4239l5.m9995a();
                }
                if (i5 == 1) {
                    C4430z5 c4430z8 = (C4430z5) interfaceC4197i5Mo9340b;
                    c4430z8.m10343f(C2622l.m5362e2(bArr, i));
                    while (true) {
                        int i14 = iM5395l1 + 8;
                        if (i14 >= i2) {
                            return i14;
                        }
                        iM5395l1 = C2622l.m5395l0(bArr, i14, c4389w3);
                        if (i3 != c4389w3.f23583a) {
                            return i14;
                        }
                        c4430z8.m10343f(C2622l.m5362e2(bArr, iM5395l1));
                    }
                }
                return iM5395l1;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    C4141e5 c4141e5 = (C4141e5) interfaceC4197i5Mo9340b;
                    int iM5395l7 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                    int i15 = c4389w3.f23583a + iM5395l7;
                    while (iM5395l7 < i15) {
                        c4141e5.m9555j(C2622l.m5385j0(bArr, iM5395l7));
                        iM5395l7 += 4;
                    }
                    if (iM5395l7 == i15) {
                        return iM5395l7;
                    }
                    throw C4239l5.m9995a();
                }
                if (i5 == 5) {
                    C4141e5 c4141e6 = (C4141e5) interfaceC4197i5Mo9340b;
                    c4141e6.m9555j(C2622l.m5385j0(bArr, i));
                    while (true) {
                        int i16 = iM5395l1 + 4;
                        if (i16 >= i2) {
                            return i16;
                        }
                        iM5395l1 = C2622l.m5395l0(bArr, i16, c4389w3);
                        if (i3 != c4389w3.f23583a) {
                            return i16;
                        }
                        c4141e6.m9555j(C2622l.m5385j0(bArr, iM5395l1));
                    }
                }
                return iM5395l1;
            case 25:
            case 42:
                if (i5 == 2) {
                    C4376v3 c4376v3 = (C4376v3) interfaceC4197i5Mo9340b;
                    iM5395l0 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                    int i17 = c4389w3.f23583a + iM5395l0;
                    while (iM5395l0 < i17) {
                        iM5395l0 = C2622l.m5249F1(bArr, iM5395l0, c4389w3);
                        c4376v3.m10282f(c4389w3.f23584b != 0);
                    }
                    if (iM5395l0 != i17) {
                        throw C4239l5.m9995a();
                    }
                    return iM5395l0;
                }
                if (i5 == 0) {
                    C4376v3 c4376v4 = (C4376v3) interfaceC4197i5Mo9340b;
                    iM5395l1 = C2622l.m5249F1(bArr, iM5395l1, c4389w3);
                    c4376v4.m10282f(c4389w3.f23584b != 0);
                    while (iM5395l1 < i2) {
                        int iM5395l8 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                        if (i3 == c4389w3.f23583a) {
                            iM5395l1 = C2622l.m5249F1(bArr, iM5395l8, c4389w3);
                            c4376v4.m10282f(c4389w3.f23584b != 0);
                        }
                    }
                }
                return iM5395l1;
            case 26:
                if (i5 == 2) {
                    if ((j2 & 536870912) == 0) {
                        iM5395l1 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                        int i18 = c4389w3.f23583a;
                        if (i18 < 0) {
                            throw C4239l5.m9996b();
                        }
                        if (i18 == 0) {
                            interfaceC4197i5Mo9340b.add("");
                        } else {
                            interfaceC4197i5Mo9340b.add(new String(bArr, iM5395l1, i18, C4127d5.f23112a));
                            iM5395l1 += i18;
                        }
                        while (iM5395l1 < i2) {
                            int iM5395l9 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                            if (i3 == c4389w3.f23583a) {
                                iM5395l1 = C2622l.m5395l0(bArr, iM5395l9, c4389w3);
                                int i19 = c4389w3.f23583a;
                                if (i19 < 0) {
                                    throw C4239l5.m9996b();
                                }
                                if (i19 == 0) {
                                    interfaceC4197i5Mo9340b.add("");
                                } else {
                                    interfaceC4197i5Mo9340b.add(new String(bArr, iM5395l1, i19, C4127d5.f23112a));
                                    iM5395l1 += i19;
                                }
                            }
                        }
                    } else {
                        iM5395l1 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                        int i20 = c4389w3.f23583a;
                        if (i20 < 0) {
                            throw C4239l5.m9996b();
                        }
                        if (i20 == 0) {
                            interfaceC4197i5Mo9340b.add("");
                        } else {
                            int i21 = iM5395l1 + i20;
                            if (!C4367u7.m10279b(bArr, iM5395l1, i21)) {
                                throw C4239l5.m10002h();
                            }
                            interfaceC4197i5Mo9340b.add(new String(bArr, iM5395l1, i20, C4127d5.f23112a));
                            iM5395l1 = i21;
                        }
                        while (iM5395l1 < i2) {
                            int iM5395l10 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                            if (i3 == c4389w3.f23583a) {
                                iM5395l1 = C2622l.m5395l0(bArr, iM5395l10, c4389w3);
                                int i22 = c4389w3.f23583a;
                                if (i22 < 0) {
                                    throw C4239l5.m9996b();
                                }
                                if (i22 == 0) {
                                    interfaceC4197i5Mo9340b.add("");
                                } else {
                                    int i23 = iM5395l1 + i22;
                                    if (!C4367u7.m10279b(bArr, iM5395l1, i23)) {
                                        throw C4239l5.m10002h();
                                    }
                                    interfaceC4197i5Mo9340b.add(new String(bArr, iM5395l1, i22, C4127d5.f23112a));
                                    iM5395l1 = i23;
                                }
                            }
                        }
                    }
                }
                return iM5395l1;
            case 27:
                if (i5 == 2) {
                    return C2622l.m5360e0(m10068o(i6), i3, bArr, i, i2, interfaceC4197i5Mo9340b, c4389w3);
                }
                return iM5395l1;
            case 28:
                if (i5 == 2) {
                    int iM5395l11 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                    int i24 = c4389w3.f23583a;
                    if (i24 < 0) {
                        throw C4239l5.m9996b();
                    }
                    if (i24 > bArr.length - iM5395l11) {
                        throw C4239l5.m9995a();
                    }
                    if (i24 == 0) {
                        interfaceC4197i5Mo9340b.add(AbstractC4402x3.f23614f);
                    } else {
                        interfaceC4197i5Mo9340b.add(AbstractC4402x3.m10331m(bArr, iM5395l11, i24));
                        iM5395l11 += i24;
                    }
                    while (iM5395l11 < i2) {
                        int iM5395l12 = C2622l.m5395l0(bArr, iM5395l11, c4389w3);
                        if (i3 != c4389w3.f23583a) {
                            return iM5395l11;
                        }
                        iM5395l11 = C2622l.m5395l0(bArr, iM5395l12, c4389w3);
                        int i25 = c4389w3.f23583a;
                        if (i25 < 0) {
                            throw C4239l5.m9996b();
                        }
                        if (i25 > bArr.length - iM5395l11) {
                            throw C4239l5.m9995a();
                        }
                        if (i25 == 0) {
                            interfaceC4197i5Mo9340b.add(AbstractC4402x3.f23614f);
                        } else {
                            interfaceC4197i5Mo9340b.add(AbstractC4402x3.m10331m(bArr, iM5395l11, i25));
                            iM5395l11 += i25;
                        }
                    }
                    return iM5395l11;
                }
                return iM5395l1;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iM5395l0 = C2622l.m5340a0(i3, bArr, i, i2, interfaceC4197i5Mo9340b, c4389w3);
                    }
                    return iM5395l1;
                }
                iM5395l0 = C2622l.m5400m0(bArr, iM5395l1, interfaceC4197i5Mo9340b, c4389w3);
                AbstractC4099b5 abstractC4099b5 = (AbstractC4099b5) t;
                C4255m7 c4255m7 = abstractC4099b5.zzb;
                if (c4255m7 == C4255m7.f23317a) {
                    c4255m7 = null;
                }
                C4255m7 c4255m8 = (C4255m7) C4101b7.m9468g(i4, interfaceC4197i5Mo9340b, (InterfaceC4183h5) this.f23353d[((i6 / 3) << 1) + 1], c4255m7, this.f23365p);
                if (c4255m8 != null) {
                    abstractC4099b5.zzb = c4255m8;
                }
                return iM5395l0;
            case 33:
            case 47:
                if (i5 == 2) {
                    C4141e5 c4141e7 = (C4141e5) interfaceC4197i5Mo9340b;
                    int iM5395l13 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                    int i26 = c4389w3.f23583a + iM5395l13;
                    while (iM5395l13 < i26) {
                        iM5395l13 = C2622l.m5395l0(bArr, iM5395l13, c4389w3);
                        c4141e7.m9555j(AbstractC4154f4.m9598k(c4389w3.f23583a));
                    }
                    if (iM5395l13 == i26) {
                        return iM5395l13;
                    }
                    throw C4239l5.m9995a();
                }
                if (i5 == 0) {
                    C4141e5 c4141e8 = (C4141e5) interfaceC4197i5Mo9340b;
                    int iM5395l14 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                    c4141e8.m9555j(AbstractC4154f4.m9598k(c4389w3.f23583a));
                    while (iM5395l14 < i2) {
                        int iM5395l15 = C2622l.m5395l0(bArr, iM5395l14, c4389w3);
                        if (i3 != c4389w3.f23583a) {
                            return iM5395l14;
                        }
                        iM5395l14 = C2622l.m5395l0(bArr, iM5395l15, c4389w3);
                        c4141e8.m9555j(AbstractC4154f4.m9598k(c4389w3.f23583a));
                    }
                    return iM5395l14;
                }
                return iM5395l1;
            case 34:
            case 48:
                if (i5 == 2) {
                    C4430z5 c4430z9 = (C4430z5) interfaceC4197i5Mo9340b;
                    int iM5395l16 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                    int i27 = c4389w3.f23583a + iM5395l16;
                    while (iM5395l16 < i27) {
                        iM5395l16 = C2622l.m5249F1(bArr, iM5395l16, c4389w3);
                        c4430z9.m10343f(AbstractC4154f4.m9596b(c4389w3.f23584b));
                    }
                    if (iM5395l16 == i27) {
                        return iM5395l16;
                    }
                    throw C4239l5.m9995a();
                }
                if (i5 == 0) {
                    C4430z5 c4430z10 = (C4430z5) interfaceC4197i5Mo9340b;
                    int iM5249F2 = C2622l.m5249F1(bArr, iM5395l1, c4389w3);
                    c4430z10.m10343f(AbstractC4154f4.m9596b(c4389w3.f23584b));
                    while (iM5249F2 < i2) {
                        int iM5395l17 = C2622l.m5395l0(bArr, iM5249F2, c4389w3);
                        if (i3 != c4389w3.f23583a) {
                            return iM5249F2;
                        }
                        iM5249F2 = C2622l.m5249F1(bArr, iM5395l17, c4389w3);
                        c4430z10.m10343f(AbstractC4154f4.m9596b(c4389w3.f23584b));
                    }
                    return iM5249F2;
                }
                return iM5395l1;
            case 49:
                if (i5 == 3) {
                    InterfaceC4431z6 interfaceC4431z6M10068o = m10068o(i6);
                    int i28 = (i3 & (-8)) | 4;
                    iM5395l1 = C2622l.m5365f0(interfaceC4431z6M10068o, bArr, i, i2, i28, c4389w3);
                    interfaceC4197i5Mo9340b.add(c4389w3.f23585c);
                    while (iM5395l1 < i2) {
                        int iM5395l18 = C2622l.m5395l0(bArr, iM5395l1, c4389w3);
                        if (i3 == c4389w3.f23583a) {
                            iM5395l1 = C2622l.m5365f0(interfaceC4431z6M10068o, bArr, iM5395l18, i2, i28, c4389w3);
                            interfaceC4197i5Mo9340b.add(c4389w3.f23585c);
                        }
                    }
                }
                return iM5395l1;
            default:
                return iM5395l1;
        }
    }

    /* JADX INFO: renamed from: l */
    public final <K, V> int m10066l(T t, byte[] bArr, int i, int i2, int i3, long j2, C4389w3 c4389w3) throws IOException {
        Unsafe unsafe = f23351b;
        Object obj = this.f23353d[(i3 / 3) << 1];
        Object object = unsafe.getObject(t, j2);
        if (this.f23367r.mo9562e(object)) {
            Object objMo9560c = this.f23367r.mo9560c(obj);
            this.f23367r.mo9563f(objMo9560c, object);
            unsafe.putObject(t, j2, objMo9560c);
            object = objMo9560c;
        }
        C4114c6<?, ?> c4114c6Mo9564g = this.f23367r.mo9564g(obj);
        this.f23367r.mo9558a(object);
        int iM5395l0 = C2622l.m5395l0(bArr, i, c4389w3);
        int i4 = c4389w3.f23583a;
        if (i4 < 0 || i4 > i2 - iM5395l0) {
            throw C4239l5.m9995a();
        }
        Objects.requireNonNull(c4114c6Mo9564g);
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13381. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: m */
    public final int m10067m(T r33, byte[] r34, int r35, int r36, int r37, p007c.p190n.p194b.p266d.p314j.p325k.C4389w3 r38) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p314j.p325k.C4268n6.m10067m(java.lang.Object, byte[], int, int, int, c.n.b.d.j.k.w3):int");
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC4431z6 m10068o(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.f23353d;
        InterfaceC4431z6 interfaceC4431z6 = (InterfaceC4431z6) objArr[i2];
        if (interfaceC4431z6 != null) {
            return interfaceC4431z6;
        }
        InterfaceC4431z6<T> interfaceC4431z6M10311a = C4392w6.f23587a.m10311a((Class) objArr[i2 + 1]);
        this.f23353d[i2] = interfaceC4431z6M10311a;
        return interfaceC4431z6M10311a;
    }

    /* JADX INFO: renamed from: p */
    public final <UT, UB> UB m10069p(Object obj, int i, UB ub, AbstractC4269n7<UT, UB> abstractC4269n7) {
        int[] iArr = this.f23352c;
        int i2 = iArr[i];
        Object objM10241t = C4353t7.m10241t(obj, iArr[i + 1] & 1048575);
        if (objM10241t == null) {
            return ub;
        }
        int i3 = (i / 3) << 1;
        InterfaceC4183h5 interfaceC4183h5 = (InterfaceC4183h5) this.f23353d[i3 + 1];
        if (interfaceC4183h5 == null) {
            return ub;
        }
        Map<?, ?> mapMo9558a = this.f23367r.mo9558a(objM10241t);
        this.f23367r.mo9564g(this.f23353d[i3]);
        for (Map.Entry<?, ?> entry : mapMo9558a.entrySet()) {
            if (!interfaceC4183h5.mo9829b(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    abstractC4269n7.mo10076a();
                }
                entry.getKey();
                entry.getValue();
                Objects.requireNonNull(null);
                throw null;
            }
        }
        return ub;
    }

    /* JADX INFO: renamed from: u */
    public final <K, V> void m10070u(InterfaceC4158f8 interfaceC4158f8, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f23367r.mo9564g(this.f23353d[(i2 / 3) << 1]);
            Map<?, ?> mapMo9559b = this.f23367r.mo9559b(obj);
            C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
            Objects.requireNonNull(c4266n4);
            Iterator<Map.Entry<?, ?>> it = mapMo9559b.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                c4266n4.f23336a.mo9978f(i, 2);
                next.getKey();
                next.getValue();
                Objects.requireNonNull(null);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m10071v(Object obj, int i, C4210j4 c4210j4) throws IOException {
        if ((536870912 & i) != 0) {
            C4353t7.m10228g(obj, i & 1048575, c4210j4.m9871I());
        } else if (!this.f23358i) {
            C4353t7.m10228g(obj, i & 1048575, c4210j4.m9873K());
        } else {
            c4210j4.m9886c(2);
            C4353t7.m10228g(obj, i & 1048575, c4210j4.f23249a.mo9613q());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m10072w(T t, T t2, int i) {
        long j2 = this.f23352c[i + 1] & 1048575;
        if (m10073x(t2, i)) {
            Object objM10241t = C4353t7.m10241t(t, j2);
            Object objM10241t2 = C4353t7.m10241t(t2, j2);
            if (objM10241t != null && objM10241t2 != null) {
                C4353t7.m10228g(t, j2, C4127d5.m9547c(objM10241t, objM10241t2));
                m10046D(t, i);
            } else if (objM10241t2 != null) {
                C4353t7.m10228g(t, j2, objM10241t2);
                m10046D(t, i);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10073x(T t, int i) {
        int[] iArr = this.f23352c;
        int i2 = iArr[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            return (C4353t7.m10223b(t, j2) & (1 << (i2 >>> 20))) != 0;
        }
        int i3 = iArr[i + 1];
        long j3 = i3 & 1048575;
        switch ((i3 & 267386880) >>> 20) {
            case 0:
                return C4353t7.m10240s(t, j3) != 0.0d;
            case 1:
                return C4353t7.m10237p(t, j3) != 0.0f;
            case 2:
                return C4353t7.m10232k(t, j3) != 0;
            case 3:
                return C4353t7.m10232k(t, j3) != 0;
            case 4:
                return C4353t7.m10223b(t, j3) != 0;
            case 5:
                return C4353t7.m10232k(t, j3) != 0;
            case 6:
                return C4353t7.m10223b(t, j3) != 0;
            case 7:
                return C4353t7.m10236o(t, j3);
            case 8:
                Object objM10241t = C4353t7.m10241t(t, j3);
                if (objM10241t instanceof String) {
                    return !((String) objM10241t).isEmpty();
                }
                if (objM10241t instanceof AbstractC4402x3) {
                    return !AbstractC4402x3.f23614f.equals(objM10241t);
                }
                throw new IllegalArgumentException();
            case 9:
                return C4353t7.m10241t(t, j3) != null;
            case 10:
                return !AbstractC4402x3.f23614f.equals(C4353t7.m10241t(t, j3));
            case 11:
                return C4353t7.m10223b(t, j3) != 0;
            case 12:
                return C4353t7.m10223b(t, j3) != 0;
            case 13:
                return C4353t7.m10223b(t, j3) != 0;
            case 14:
                return C4353t7.m10232k(t, j3) != 0;
            case 15:
                return C4353t7.m10223b(t, j3) != 0;
            case 16:
                return C4353t7.m10232k(t, j3) != 0;
            case 17:
                return C4353t7.m10241t(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m10074y(T t, int i, int i2) {
        return C4353t7.m10223b(t, (long) (this.f23352c[i2 + 2] & 1048575)) == i;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m10075z(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m10073x(t, i);
        }
        return (i3 & i4) != 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6
    public final T zza() {
        return (T) this.f23363n.mo10171a(this.f23356g);
    }
}
