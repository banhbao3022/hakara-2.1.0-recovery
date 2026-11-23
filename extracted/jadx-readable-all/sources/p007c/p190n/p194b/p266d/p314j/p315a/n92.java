package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class n92<T> implements ba2<T> {

    /* JADX INFO: renamed from: a */
    public static final int[] f17043a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final Unsafe f17044b = za2.m8869r();

    /* JADX INFO: renamed from: c */
    public final int[] f17045c;

    /* JADX INFO: renamed from: d */
    public final Object[] f17046d;

    /* JADX INFO: renamed from: e */
    public final int f17047e;

    /* JADX INFO: renamed from: f */
    public final int f17048f;

    /* JADX INFO: renamed from: g */
    public final l92 f17049g;

    /* JADX INFO: renamed from: h */
    public final boolean f17050h;

    /* JADX INFO: renamed from: i */
    public final boolean f17051i;

    /* JADX INFO: renamed from: j */
    public final boolean f17052j;

    /* JADX INFO: renamed from: k */
    public final int[] f17053k;

    /* JADX INFO: renamed from: l */
    public final int f17054l;

    /* JADX INFO: renamed from: m */
    public final int f17055m;

    /* JADX INFO: renamed from: n */
    public final a92 f17056n;

    /* JADX INFO: renamed from: o */
    public final oa2<?, ?> f17057o;

    /* JADX INFO: renamed from: p */
    public final t72<?> f17058p;

    /* JADX INFO: renamed from: q */
    public final h92 f17059q;

    public n92(int[] iArr, Object[] objArr, int i, int i2, l92 l92Var, boolean z, int[] iArr2, int i3, int i4, p92 p92Var, a92 a92Var, oa2 oa2Var, t72 t72Var, h92 h92Var) {
        this.f17045c = iArr;
        this.f17046d = objArr;
        this.f17047e = i;
        this.f17048f = i2;
        this.f17051i = l92Var instanceof g82;
        this.f17052j = z;
        this.f17050h = t72Var != null && t72Var.mo8400a(l92Var);
        this.f17053k = iArr2;
        this.f17054l = i3;
        this.f17055m = i4;
        this.f17056n = a92Var;
        this.f17057o = oa2Var;
        this.f17058p = t72Var;
        this.f17049g = l92Var;
        this.f17059q = h92Var;
    }

    /* JADX INFO: renamed from: C */
    public static final void m7780C(int i, Object obj, p72 p72Var) throws IOException {
        if (obj instanceof String) {
            p72Var.f17875a.mo7668k(i, (String) obj);
        } else {
            p72Var.f17875a.mo7669l(i, (g72) obj);
        }
    }

    /* JADX INFO: renamed from: D */
    public static pa2 m7781D(Object obj) {
        g82 g82Var = (g82) obj;
        pa2 pa2Var = g82Var.zzc;
        if (pa2Var != pa2.f17890a) {
            return pa2Var;
        }
        pa2 pa2VarM8091a = pa2.m8091a();
        g82Var.zzc = pa2VarM8091a;
        return pa2VarM8091a;
    }

    /* JADX INFO: renamed from: F */
    public static n92 m7782F(j92 j92Var, p92 p92Var, a92 a92Var, oa2 oa2Var, t72 t72Var, h92 h92Var) {
        if (j92Var instanceof u92) {
            return m7783G((u92) j92Var, p92Var, a92Var, oa2Var, t72Var, h92Var);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0275  */
    /* JADX WARN: Code duplicated, block: B:128:0x0278  */
    /* JADX WARN: Code duplicated, block: B:131:0x0290  */
    /* JADX WARN: Code duplicated, block: B:132:0x0293  */
    /* JADX WARN: Code duplicated, block: B:180:0x0392  */
    /* JADX INFO: renamed from: G */
    public static <T> n92<T> m7783G(u92 u92Var, p92 p92Var, a92 a92Var, oa2<?, ?> oa2Var, t72<?> t72Var, h92 h92Var) {
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
        int i16;
        int[] iArr2;
        int i17;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        Field fieldM7784H;
        char cCharAt9;
        int i20;
        int i21;
        int i22;
        int i23;
        Object obj;
        Field fieldM7784H2;
        int i24;
        Object obj2;
        Field fieldM7784H3;
        int i25;
        char cCharAt10;
        int i26;
        char cCharAt11;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        int i29 = 0;
        boolean z = ((u92Var.f20254d & 1) == 1 ? (char) 1 : (char) 2) == 2;
        String str = u92Var.f20252b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (str.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int iCharAt5 = str.charAt(i);
        if (iCharAt5 >= 55296) {
            int i32 = iCharAt5 & 8191;
            int i33 = 13;
            while (true) {
                i28 = i31 + 1;
                cCharAt13 = str.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i28;
            }
            iCharAt5 = i32 | (cCharAt13 << i33);
            i31 = i28;
        }
        if (iCharAt5 == 0) {
            iArr = f17043a;
            i3 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i2 = 0;
            iCharAt4 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt6 = str.charAt(i31);
            if (iCharAt6 >= 55296) {
                int i35 = iCharAt6 & 8191;
                int i36 = 13;
                while (true) {
                    i11 = i34 + 1;
                    cCharAt8 = str.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i11;
                }
                iCharAt6 = i35 | (cCharAt8 << i36);
                i34 = i11;
            }
            int i37 = i34 + 1;
            int iCharAt7 = str.charAt(i34);
            if (iCharAt7 >= 55296) {
                int i38 = iCharAt7 & 8191;
                int i39 = 13;
                while (true) {
                    i10 = i37 + 1;
                    cCharAt7 = str.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i10;
                }
                iCharAt7 = i38 | (cCharAt7 << i39);
                i37 = i10;
            }
            int i40 = i37 + 1;
            iCharAt = str.charAt(i37);
            if (iCharAt >= 55296) {
                int i41 = iCharAt & 8191;
                int i42 = 13;
                while (true) {
                    i9 = i40 + 1;
                    cCharAt6 = str.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i9;
                }
                iCharAt = i41 | (cCharAt6 << i42);
                i40 = i9;
            }
            int i43 = i40 + 1;
            iCharAt2 = str.charAt(i40);
            if (iCharAt2 >= 55296) {
                int i44 = iCharAt2 & 8191;
                int i45 = 13;
                while (true) {
                    i8 = i43 + 1;
                    cCharAt5 = str.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i8;
                }
                iCharAt2 = i44 | (cCharAt5 << i45);
                i43 = i8;
            }
            int i46 = i43 + 1;
            iCharAt3 = str.charAt(i43);
            if (iCharAt3 >= 55296) {
                int i47 = iCharAt3 & 8191;
                int i48 = 13;
                while (true) {
                    i7 = i46 + 1;
                    cCharAt4 = str.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i7;
                }
                iCharAt3 = i47 | (cCharAt4 << i48);
                i46 = i7;
            }
            int i49 = i46 + 1;
            int iCharAt8 = str.charAt(i46);
            if (iCharAt8 >= 55296) {
                int i50 = iCharAt8 & 8191;
                int i51 = 13;
                while (true) {
                    i6 = i49 + 1;
                    cCharAt3 = str.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i6;
                }
                iCharAt8 = i50 | (cCharAt3 << i51);
                i49 = i6;
            }
            int i52 = i49 + 1;
            int iCharAt9 = str.charAt(i49);
            if (iCharAt9 >= 55296) {
                int i53 = iCharAt9 & 8191;
                int i54 = 13;
                while (true) {
                    i5 = i52 + 1;
                    cCharAt2 = str.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i5;
                }
                iCharAt9 = i53 | (cCharAt2 << i54);
                i52 = i5;
            }
            int i55 = i52 + 1;
            iCharAt4 = str.charAt(i52);
            if (iCharAt4 >= 55296) {
                int i56 = iCharAt4 & 8191;
                int i57 = i55;
                int i58 = 13;
                while (true) {
                    i4 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i57 = i4;
                }
                iCharAt4 = i56 | (cCharAt << i58);
                i55 = i4;
            }
            int[] iArr3 = new int[iCharAt4 + iCharAt8 + iCharAt9];
            i2 = iCharAt6 + iCharAt6 + iCharAt7;
            i3 = iCharAt8;
            iArr = iArr3;
            i29 = iCharAt6;
            i31 = i55;
        }
        Unsafe unsafe = f17044b;
        Object[] objArr = u92Var.f20253c;
        Class<?> cls = u92Var.f20251a.getClass();
        int i59 = i31;
        int[] iArr4 = new int[iCharAt3 * 3];
        Object[] objArr2 = new Object[iCharAt3 + iCharAt3];
        int i60 = iCharAt4 + i3;
        int i61 = iCharAt4;
        int i62 = i59;
        int i63 = i60;
        int i64 = 0;
        int i65 = 0;
        while (i62 < length) {
            int i66 = i62 + 1;
            int iCharAt10 = str.charAt(i62);
            int i67 = length;
            if (iCharAt10 >= 55296) {
                int i68 = iCharAt10 & 8191;
                int i69 = i66;
                int i70 = 13;
                while (true) {
                    i27 = i69 + 1;
                    cCharAt12 = str.charAt(i69);
                    i12 = iCharAt4;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i27;
                    iCharAt4 = i12;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i13 = i27;
            } else {
                i12 = iCharAt4;
                i13 = i66;
            }
            int i71 = i13 + 1;
            int iCharAt11 = str.charAt(i13);
            if (iCharAt11 >= 55296) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i26 = i73 + 1;
                    cCharAt11 = str.charAt(i73);
                    i14 = iCharAt2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i26;
                    iCharAt2 = i14;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i15 = i26;
            } else {
                i14 = iCharAt2;
                i15 = i71;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i65] = i64;
                i65++;
            }
            if (i75 >= 51) {
                int i77 = i15 + 1;
                int iCharAt12 = str.charAt(i15);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = 13;
                    int i79 = iCharAt12 & 8191;
                    int i80 = i77;
                    while (true) {
                        i25 = i80 + 1;
                        cCharAt10 = str.charAt(i80);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i78;
                        i78 += 13;
                        i80 = i25;
                        c2 = 55296;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i78);
                    i21 = i25;
                } else {
                    i21 = i77;
                }
                int i81 = i21;
                int i82 = i75 - 51;
                if (i82 == 9 || i82 == 17) {
                    int i83 = i64 / 3;
                    i22 = i2 + 1;
                    objArr2[i83 + i83 + 1] = objArr[i2];
                } else {
                    if (i82 == 12 && !z) {
                        int i84 = i64 / 3;
                        i22 = i2 + 1;
                        objArr2[i84 + i84 + 1] = objArr[i2];
                    }
                    i23 = iCharAt12 + iCharAt12;
                    obj = objArr[i23];
                    if (obj instanceof Field) {
                        fieldM7784H2 = (Field) obj;
                    } else {
                        fieldM7784H2 = m7784H(cls, (String) obj);
                        objArr[i23] = fieldM7784H2;
                    }
                    i16 = i29;
                    iArr2 = iArr4;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM7784H2);
                    i24 = i23 + 1;
                    obj2 = objArr[i24];
                    if (obj2 instanceof Field) {
                        fieldM7784H3 = (Field) obj2;
                    } else {
                        fieldM7784H3 = m7784H(cls, (String) obj2);
                        objArr[i24] = fieldM7784H3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM7784H3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    str = str;
                    i17 = i2;
                    i15 = i81;
                    cls = cls;
                    i18 = 0;
                }
                i2 = i22;
                i23 = iCharAt12 + iCharAt12;
                obj = objArr[i23];
                if (obj instanceof Field) {
                    fieldM7784H2 = (Field) obj;
                } else {
                    fieldM7784H2 = m7784H(cls, (String) obj);
                    objArr[i23] = fieldM7784H2;
                }
                i16 = i29;
                iArr2 = iArr4;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM7784H2);
                i24 = i23 + 1;
                obj2 = objArr[i24];
                if (obj2 instanceof Field) {
                    fieldM7784H3 = (Field) obj2;
                } else {
                    fieldM7784H3 = m7784H(cls, (String) obj2);
                    objArr[i24] = fieldM7784H3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM7784H3);
                iObjectFieldOffset = iObjectFieldOffset4;
                str = str;
                i17 = i2;
                i15 = i81;
                cls = cls;
                i18 = 0;
            } else {
                i16 = i29;
                iArr2 = iArr4;
                i17 = i2 + 1;
                Field fieldM7784H4 = m7784H(cls, (String) objArr[i2]);
                if (i75 == 9 || i75 == 17) {
                    int i85 = i64 / 3;
                    objArr2[i85 + i85 + 1] = fieldM7784H4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        int i86 = i64 / 3;
                        i20 = i17 + 1;
                        objArr2[i86 + i86 + 1] = objArr[i17];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        if (!z) {
                            int i87 = i64 / 3;
                            i20 = i17 + 1;
                            objArr2[i87 + i87 + 1] = objArr[i17];
                        }
                    } else if (i75 == 50) {
                        int i88 = i61 + 1;
                        iArr[i61] = i64;
                        int i89 = i64 / 3;
                        int i90 = i89 + i89;
                        int i91 = i17 + 1;
                        objArr2[i90] = objArr[i17];
                        if ((iCharAt11 & 2048) != 0) {
                            i17 = i91 + 1;
                            objArr2[i90 + 1] = objArr[i91];
                            i61 = i88;
                        } else {
                            i61 = i88;
                            i17 = i91;
                        }
                    }
                    i17 = i20;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM7784H4);
                    if ((iCharAt11 & 4096) == 4096 || i75 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i18 = 0;
                    } else {
                        int i92 = i15 + 1;
                        int iCharAt13 = str.charAt(i15);
                        if (iCharAt13 >= 55296) {
                            int i93 = iCharAt13 & 8191;
                            int i94 = 13;
                            while (true) {
                                i19 = i92 + 1;
                                cCharAt9 = str.charAt(i92);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i93 |= (cCharAt9 & 8191) << i94;
                                i94 += 13;
                                i92 = i19;
                            }
                            iCharAt13 = i93 | (cCharAt9 << i94);
                        } else {
                            i19 = i92;
                        }
                        int i95 = (iCharAt13 / 32) + i16 + i16;
                        Object obj3 = objArr[i95];
                        if (obj3 instanceof Field) {
                            fieldM7784H = (Field) obj3;
                        } else {
                            fieldM7784H = m7784H(cls, (String) obj3);
                            objArr[i95] = fieldM7784H;
                        }
                        i18 = iCharAt13 % 32;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM7784H);
                        i15 = i19;
                    }
                    if (i75 >= 18 && i75 <= 49) {
                        iArr[i63] = iObjectFieldOffset;
                        i63++;
                    }
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM7784H4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i18 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i18 = 0;
                }
                if (i75 >= 18) {
                    iArr[i63] = iObjectFieldOffset;
                    i63++;
                }
            }
            int i96 = i64 + 1;
            iArr2[i64] = iCharAt10;
            int i97 = i96 + 1;
            iArr2[i96] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i75 << 20) | iObjectFieldOffset;
            i64 = i97 + 1;
            iArr2[i97] = (i18 << 20) | iObjectFieldOffset2;
            i29 = i16;
            cls = cls;
            i62 = i15;
            str = str;
            iCharAt = i76;
            length = i67;
            iCharAt4 = i12;
            iCharAt2 = i14;
            i2 = i17;
            iArr4 = iArr2;
        }
        return new n92<>(iArr4, objArr2, iCharAt, iCharAt2, u92Var.f20251a, z, iArr, iCharAt4, i60, p92Var, a92Var, oa2Var, t72Var, h92Var);
    }

    /* JADX INFO: renamed from: H */
    public static Field m7784H(Class<?> cls, String str) {
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
            StringBuilder sb = new StringBuilder(outline.m1578b(String.valueOf(str).length(), 40, name.length(), String.valueOf(string).length()));
            outline.m1572W(sb, "Field ", str, " for ", name);
            throw new RuntimeException(outline.m1550A(sb, " not found. Known fields are ", string));
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m7785n(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: renamed from: o */
    public static <T> double m7786o(T t, long j2) {
        return ((Double) za2.m8867p(t, j2)).doubleValue();
    }

    /* JADX INFO: renamed from: p */
    public static <T> float m7787p(T t, long j2) {
        return ((Float) za2.m8867p(t, j2)).floatValue();
    }

    /* JADX INFO: renamed from: q */
    public static <T> int m7788q(T t, long j2) {
        return ((Integer) za2.m8867p(t, j2)).intValue();
    }

    /* JADX INFO: renamed from: r */
    public static <T> long m7789r(T t, long j2) {
        return ((Long) za2.m8867p(t, j2)).longValue();
    }

    /* JADX INFO: renamed from: s */
    public static <T> boolean m7790s(T t, long j2) {
        return ((Boolean) za2.m8867p(t, j2)).booleanValue();
    }

    /* JADX INFO: renamed from: A */
    public final int m7791A(int i, int i2) {
        int length = (this.f17045c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f17045c[i4];
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

    /* JADX INFO: renamed from: B */
    public final void m7792B(T t, p72 p72Var) throws IOException {
        int i;
        if (this.f17050h) {
            this.f17058p.mo8401b(t);
            throw null;
        }
        int length = this.f17045c.length;
        Unsafe unsafe = f17044b;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < length) {
            int iM7807d = m7807d(i3);
            int[] iArr = this.f17045c;
            int i6 = iArr[i3];
            int i7 = (iM7807d >>> 20) & 255;
            if (i7 <= 17) {
                int i8 = iArr[i3 + 2];
                int i9 = i8 & i2;
                if (i9 != i4) {
                    i5 = unsafe.getInt(t, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j2 = iM7807d & i2;
            switch (i7) {
                case 0:
                    if ((i5 & i) != 0) {
                        p72Var.m8082b(i6, za2.m8865n(t, j2));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        p72Var.m8081a(i6, za2.m8863l(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        p72Var.f17875a.mo7665h(i6, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        p72Var.f17875a.mo7665h(i6, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        p72Var.f17875a.mo7662e(i6, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        p72Var.f17875a.mo7666i(i6, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        p72Var.f17875a.mo7664g(i6, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        p72Var.f17875a.mo7667j(i6, za2.m8861j(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        m7780C(i6, unsafe.getObject(t, j2), p72Var);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        p72Var.m8085e(i6, unsafe.getObject(t, j2), m7801P(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        p72Var.f17875a.mo7669l(i6, (g72) unsafe.getObject(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        p72Var.f17875a.mo7663f(i6, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i5 & i) != 0) {
                        p72Var.f17875a.mo7662e(i6, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        p72Var.f17875a.mo7664g(i6, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        p72Var.f17875a.mo7666i(i6, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        p72Var.m8083c(i6, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i5 & i) != 0) {
                        p72Var.m8084d(i6, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        p72Var.m8086f(i6, unsafe.getObject(t, j2), m7801P(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    da2.m6326d(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    da2.m6327e(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    da2.m6328f(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    da2.m6329g(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    da2.m6333k(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    da2.m6331i(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    da2.m6336n(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    da2.m6339q(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    da2.m6340r(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var);
                    break;
                case 27:
                    da2.m6342t(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, m7801P(i3));
                    break;
                case 28:
                    da2.m6341s(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var);
                    break;
                case 29:
                    da2.m6334l(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    break;
                case 30:
                    da2.m6338p(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    break;
                case 31:
                    da2.m6337o(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    break;
                case 32:
                    da2.m6332j(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    break;
                case 33:
                    da2.m6335m(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    break;
                case 34:
                    da2.m6330h(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, false);
                    break;
                case 35:
                    da2.m6326d(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 36:
                    da2.m6327e(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 37:
                    da2.m6328f(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 38:
                    da2.m6329g(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 39:
                    da2.m6333k(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 40:
                    da2.m6331i(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 41:
                    da2.m6336n(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 42:
                    da2.m6339q(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 43:
                    da2.m6334l(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 44:
                    da2.m6338p(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 45:
                    da2.m6337o(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 46:
                    da2.m6332j(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 47:
                    da2.m6335m(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 48:
                    da2.m6330h(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, true);
                    break;
                case 49:
                    da2.m6343u(this.f17045c[i3], (List) unsafe.getObject(t, j2), p72Var, m7801P(i3));
                    break;
                case 50:
                    if (unsafe.getObject(t, j2) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (m7813x(t, i6, i3)) {
                        p72Var.m8082b(i6, m7786o(t, j2));
                    }
                    break;
                case 52:
                    if (m7813x(t, i6, i3)) {
                        p72Var.m8081a(i6, m7787p(t, j2));
                    }
                    break;
                case 53:
                    if (m7813x(t, i6, i3)) {
                        p72Var.f17875a.mo7665h(i6, m7789r(t, j2));
                    }
                    break;
                case 54:
                    if (m7813x(t, i6, i3)) {
                        p72Var.f17875a.mo7665h(i6, m7789r(t, j2));
                    }
                    break;
                case 55:
                    if (m7813x(t, i6, i3)) {
                        p72Var.f17875a.mo7662e(i6, m7788q(t, j2));
                    }
                    break;
                case 56:
                    if (m7813x(t, i6, i3)) {
                        p72Var.f17875a.mo7666i(i6, m7789r(t, j2));
                    }
                    break;
                case 57:
                    if (m7813x(t, i6, i3)) {
                        p72Var.f17875a.mo7664g(i6, m7788q(t, j2));
                    }
                    break;
                case 58:
                    if (m7813x(t, i6, i3)) {
                        p72Var.f17875a.mo7667j(i6, m7790s(t, j2));
                    }
                    break;
                case 59:
                    if (m7813x(t, i6, i3)) {
                        m7780C(i6, unsafe.getObject(t, j2), p72Var);
                    }
                    break;
                case 60:
                    if (m7813x(t, i6, i3)) {
                        p72Var.m8085e(i6, unsafe.getObject(t, j2), m7801P(i3));
                    }
                    break;
                case 61:
                    if (m7813x(t, i6, i3)) {
                        p72Var.f17875a.mo7669l(i6, (g72) unsafe.getObject(t, j2));
                    }
                    break;
                case 62:
                    if (m7813x(t, i6, i3)) {
                        p72Var.f17875a.mo7663f(i6, m7788q(t, j2));
                    }
                    break;
                case 63:
                    if (m7813x(t, i6, i3)) {
                        p72Var.f17875a.mo7662e(i6, m7788q(t, j2));
                    }
                    break;
                case 64:
                    if (m7813x(t, i6, i3)) {
                        p72Var.f17875a.mo7664g(i6, m7788q(t, j2));
                    }
                    break;
                case 65:
                    if (m7813x(t, i6, i3)) {
                        p72Var.f17875a.mo7666i(i6, m7789r(t, j2));
                    }
                    break;
                case 66:
                    if (m7813x(t, i6, i3)) {
                        p72Var.m8083c(i6, m7788q(t, j2));
                    }
                    break;
                case 67:
                    if (m7813x(t, i6, i3)) {
                        p72Var.m8084d(i6, m7789r(t, j2));
                    }
                    break;
                case 68:
                    if (m7813x(t, i6, i3)) {
                        p72Var.m8086f(i6, unsafe.getObject(t, j2), m7801P(i3));
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        oa2<?, ?> oa2Var = this.f17057o;
        oa2Var.mo7994r(oa2Var.mo7986j(t), p72Var);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12001. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: E */
    public final int m7793E(T r29, byte[] r30, int r31, int r32, int r33, p007c.p190n.p194b.p266d.p314j.p315a.w62 r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p314j.p315a.n92.m7793E(java.lang.Object, byte[], int, int, int, c.n.b.d.j.a.w62):int");
    }

    /* JADX INFO: renamed from: I */
    public final void m7794I(T t, T t2, int i) {
        long j2 = this.f17045c[i + 1] & 1048575;
        if (m7811v(t2, i)) {
            Object objM8867p = za2.m8867p(t, j2);
            Object objM8867p2 = za2.m8867p(t2, j2);
            if (objM8867p != null && objM8867p2 != null) {
                za2.f22222e.m8789p(t, j2, p82.m8090c(objM8867p, objM8867p2));
                m7812w(t, i);
            } else if (objM8867p2 != null) {
                za2.f22222e.m8789p(t, j2, objM8867p2);
                m7812w(t, i);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m7795J(T t, T t2, int i) {
        int[] iArr = this.f17045c;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long j2 = i2 & 1048575;
        if (m7813x(t2, i3, i)) {
            Object objM8867p = m7813x(t, i3, i) ? za2.m8867p(t, j2) : null;
            Object objM8867p2 = za2.m8867p(t2, j2);
            if (objM8867p != null && objM8867p2 != null) {
                za2.f22222e.m8789p(t, j2, p82.m8090c(objM8867p, objM8867p2));
                m7814y(t, i3, i);
            } else if (objM8867p2 != null) {
                za2.f22222e.m8789p(t, j2, objM8867p2);
                m7814y(t, i3, i);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final int m7796K(T t) {
        int i;
        int iM7971u;
        int iM7971u2;
        int iM7971u3;
        int iM7972v;
        int iM7971u4;
        int iM7970t;
        int iM7971u5;
        int iM7971u6;
        int iMo5719m;
        int iM7971u7;
        int iM6319Q;
        int iM7971u8;
        int iM7972v2;
        int iM6315M;
        int iM7969s;
        int iM7971u9;
        int i2;
        int iM7971u10;
        int iMo5719m2;
        int iM7971u11;
        Unsafe unsafe = f17044b;
        int i3 = 1048575;
        int i4 = 0;
        int iM1578b = 0;
        int i5 = 1048575;
        int i6 = 0;
        while (i4 < this.f17045c.length) {
            int iM7807d = m7807d(i4);
            int[] iArr = this.f17045c;
            int i7 = iArr[i4];
            int i8 = (iM7807d >>> 20) & 255;
            if (i8 <= 17) {
                int i9 = iArr[i4 + 2];
                int i10 = i9 & i3;
                i = 1 << (i9 >>> 20);
                if (i10 != i5) {
                    i6 = unsafe.getInt(t, i10);
                    i5 = i10;
                }
            } else {
                i = 0;
            }
            long j2 = i3 & iM7807d;
            switch (i8) {
                case 0:
                    if ((i6 & i) != 0) {
                        iM7971u = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u + 8;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 1:
                    if ((i6 & i) != 0) {
                        iM7971u2 = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u2 + 4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 2:
                    if ((i6 & i) != 0) {
                        long j3 = unsafe.getLong(t, j2);
                        iM7971u3 = o72.m7971u(i7 << 3);
                        iM7972v = o72.m7972v(j3);
                        iM6319Q = iM7971u3 + iM7972v;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 3:
                    if ((i6 & i) != 0) {
                        long j4 = unsafe.getLong(t, j2);
                        iM7971u3 = o72.m7971u(i7 << 3);
                        iM7972v = o72.m7972v(j4);
                        iM6319Q = iM7971u3 + iM7972v;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 4:
                    if ((i6 & i) != 0) {
                        int i11 = unsafe.getInt(t, j2);
                        iM7971u4 = o72.m7971u(i7 << 3);
                        iM7970t = o72.m7970t(i11);
                        iM6319Q = iM7970t + iM7971u4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 5:
                    if ((i6 & i) != 0) {
                        iM7971u = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u + 8;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 6:
                    if ((i6 & i) != 0) {
                        iM7971u2 = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u2 + 4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 7:
                    if ((i6 & i) != 0) {
                        iM7971u5 = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u5 + 1;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 8:
                    if ((i6 & i) != 0) {
                        Object object = unsafe.getObject(t, j2);
                        if (!(object instanceof g72)) {
                            iM7971u4 = o72.m7971u(i7 << 3);
                            iM7970t = o72.m7973w((String) object);
                            iM6319Q = iM7970t + iM7971u4;
                            iM1578b += iM6319Q;
                        } else {
                            iM7971u6 = o72.m7971u(i7 << 3);
                            iMo5719m = ((g72) object).mo5719m();
                            iM7971u7 = o72.m7971u(iMo5719m);
                            iM1578b = outline.m1578b(iM7971u7, iMo5719m, iM7971u6, iM1578b);
                        }
                    }
                    break;
                case 9:
                    if ((i6 & i) != 0) {
                        iM6319Q = da2.m6319Q(i7, unsafe.getObject(t, j2), m7801P(i4));
                        iM1578b += iM6319Q;
                    }
                    break;
                case 10:
                    if ((i6 & i) != 0) {
                        g72 g72Var = (g72) unsafe.getObject(t, j2);
                        iM7971u6 = o72.m7971u(i7 << 3);
                        iMo5719m = g72Var.mo5719m();
                        iM7971u7 = o72.m7971u(iMo5719m);
                        iM1578b = outline.m1578b(iM7971u7, iMo5719m, iM7971u6, iM1578b);
                    }
                    break;
                case 11:
                    if ((i6 & i) != 0) {
                        int i12 = unsafe.getInt(t, j2);
                        iM7971u4 = o72.m7971u(i7 << 3);
                        iM7970t = o72.m7971u(i12);
                        iM6319Q = iM7970t + iM7971u4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 12:
                    if ((i6 & i) != 0) {
                        int i13 = unsafe.getInt(t, j2);
                        iM7971u4 = o72.m7971u(i7 << 3);
                        iM7970t = o72.m7970t(i13);
                        iM6319Q = iM7970t + iM7971u4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 13:
                    if ((i6 & i) != 0) {
                        iM7971u2 = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u2 + 4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 14:
                    if ((i6 & i) != 0) {
                        iM7971u = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u + 8;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 15:
                    if ((i6 & i) != 0) {
                        int i14 = unsafe.getInt(t, j2);
                        iM7971u4 = o72.m7971u(i7 << 3);
                        iM7970t = o72.m7971u((i14 >> 31) ^ (i14 + i14));
                        iM6319Q = iM7970t + iM7971u4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 16:
                    if ((i & i6) != 0) {
                        long j5 = unsafe.getLong(t, j2);
                        iM7971u8 = o72.m7971u(i7 << 3);
                        iM7972v2 = o72.m7972v((j5 >> 63) ^ (j5 + j5));
                        iM6319Q = iM7972v2 + iM7971u8;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 17:
                    if ((i6 & i) != 0) {
                        iM6319Q = o72.m7968c(i7, (l92) unsafe.getObject(t, j2), m7801P(i4));
                        iM1578b += iM6319Q;
                    }
                    break;
                case 18:
                    iM6319Q = da2.m6316N(i7, (List) unsafe.getObject(t, j2));
                    iM1578b += iM6319Q;
                    break;
                case 19:
                    iM6319Q = da2.m6314L(i7, (List) unsafe.getObject(t, j2));
                    iM1578b += iM6319Q;
                    break;
                case 20:
                    iM6319Q = da2.m6346x(i7, (List) unsafe.getObject(t, j2));
                    iM1578b += iM6319Q;
                    break;
                case 21:
                    iM6319Q = da2.m6348z(i7, (List) unsafe.getObject(t, j2), false);
                    iM1578b += iM6319Q;
                    break;
                case 22:
                    iM6319Q = da2.m6308F(i7, (List) unsafe.getObject(t, j2), false);
                    iM1578b += iM6319Q;
                    break;
                case 23:
                    iM6319Q = da2.m6316N(i7, (List) unsafe.getObject(t, j2));
                    iM1578b += iM6319Q;
                    break;
                case 24:
                    iM6319Q = da2.m6314L(i7, (List) unsafe.getObject(t, j2));
                    iM1578b += iM6319Q;
                    break;
                case 25:
                    iM6319Q = da2.m6317O(i7, (List) unsafe.getObject(t, j2));
                    iM1578b += iM6319Q;
                    break;
                case 26:
                    iM6319Q = da2.m6318P(i7, (List) unsafe.getObject(t, j2));
                    iM1578b += iM6319Q;
                    break;
                case 27:
                    iM6319Q = da2.m6320R(i7, (List) unsafe.getObject(t, j2), m7801P(i4));
                    iM1578b += iM6319Q;
                    break;
                case 28:
                    iM6319Q = da2.m6321S(i7, (List) unsafe.getObject(t, j2));
                    iM1578b += iM6319Q;
                    break;
                case 29:
                    iM6319Q = da2.m6310H(i7, (List) unsafe.getObject(t, j2), false);
                    iM1578b += iM6319Q;
                    break;
                case 30:
                    iM6319Q = da2.m6306D(i7, (List) unsafe.getObject(t, j2), false);
                    iM1578b += iM6319Q;
                    break;
                case 31:
                    iM6319Q = da2.m6314L(i7, (List) unsafe.getObject(t, j2));
                    iM1578b += iM6319Q;
                    break;
                case 32:
                    iM6319Q = da2.m6316N(i7, (List) unsafe.getObject(t, j2));
                    iM1578b += iM6319Q;
                    break;
                case 33:
                    iM6319Q = da2.m6312J(i7, (List) unsafe.getObject(t, j2), false);
                    iM1578b += iM6319Q;
                    break;
                case 34:
                    iM6319Q = da2.m6304B(i7, (List) unsafe.getObject(t, j2), false);
                    iM1578b += iM6319Q;
                    break;
                case 35:
                    iM6315M = da2.m6315M((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 36:
                    iM6315M = da2.m6313K((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 37:
                    iM6315M = da2.m6345w((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 38:
                    iM6315M = da2.m6347y((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 39:
                    iM6315M = da2.m6307E((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 40:
                    iM6315M = da2.m6315M((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 41:
                    iM6315M = da2.m6313K((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(t, j2);
                    Class<?> cls = da2.f13197a;
                    iM6315M = list.size();
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 43:
                    iM6315M = da2.m6309G((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 44:
                    iM6315M = da2.m6305C((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 45:
                    iM6315M = da2.m6313K((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 46:
                    iM6315M = da2.m6315M((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 47:
                    iM6315M = da2.m6311I((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 48:
                    iM6315M = da2.m6303A((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i7);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i2 = iM7971u9 + iM7969s + iM6315M;
                        iM1578b += i2;
                    }
                    break;
                case 49:
                    iM6319Q = da2.m6322T(i7, (List) unsafe.getObject(t, j2), m7801P(i4));
                    iM1578b += iM6319Q;
                    break;
                case 50:
                    h92.m7105a(i7, unsafe.getObject(t, j2), m7802Q(i4));
                    break;
                case 51:
                    if (m7813x(t, i7, i4)) {
                        iM7971u = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u + 8;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 52:
                    if (m7813x(t, i7, i4)) {
                        iM7971u2 = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u2 + 4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 53:
                    if (m7813x(t, i7, i4)) {
                        long jM7789r = m7789r(t, j2);
                        iM7971u3 = o72.m7971u(i7 << 3);
                        iM7972v = o72.m7972v(jM7789r);
                        iM6319Q = iM7971u3 + iM7972v;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 54:
                    if (m7813x(t, i7, i4)) {
                        long jM7789r2 = m7789r(t, j2);
                        iM7971u3 = o72.m7971u(i7 << 3);
                        iM7972v = o72.m7972v(jM7789r2);
                        iM6319Q = iM7971u3 + iM7972v;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 55:
                    if (m7813x(t, i7, i4)) {
                        int iM7788q = m7788q(t, j2);
                        iM7971u4 = o72.m7971u(i7 << 3);
                        iM7970t = o72.m7970t(iM7788q);
                        iM6319Q = iM7970t + iM7971u4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 56:
                    if (m7813x(t, i7, i4)) {
                        iM7971u = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u + 8;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 57:
                    if (m7813x(t, i7, i4)) {
                        iM7971u2 = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u2 + 4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 58:
                    if (m7813x(t, i7, i4)) {
                        iM7971u5 = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u5 + 1;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 59:
                    if (m7813x(t, i7, i4)) {
                        Object object2 = unsafe.getObject(t, j2);
                        if (!(object2 instanceof g72)) {
                            iM7971u4 = o72.m7971u(i7 << 3);
                            iM7970t = o72.m7973w((String) object2);
                            iM6319Q = iM7970t + iM7971u4;
                            iM1578b += iM6319Q;
                        } else {
                            iM7971u10 = o72.m7971u(i7 << 3);
                            iMo5719m2 = ((g72) object2).mo5719m();
                            iM7971u11 = o72.m7971u(iMo5719m2);
                            i2 = iM7971u11 + iMo5719m2 + iM7971u10;
                            iM1578b += i2;
                        }
                    }
                    break;
                case 60:
                    if (m7813x(t, i7, i4)) {
                        iM6319Q = da2.m6319Q(i7, unsafe.getObject(t, j2), m7801P(i4));
                        iM1578b += iM6319Q;
                    }
                    break;
                case 61:
                    if (m7813x(t, i7, i4)) {
                        g72 g72Var2 = (g72) unsafe.getObject(t, j2);
                        iM7971u10 = o72.m7971u(i7 << 3);
                        iMo5719m2 = g72Var2.mo5719m();
                        iM7971u11 = o72.m7971u(iMo5719m2);
                        i2 = iM7971u11 + iMo5719m2 + iM7971u10;
                        iM1578b += i2;
                    }
                    break;
                case 62:
                    if (m7813x(t, i7, i4)) {
                        int iM7788q2 = m7788q(t, j2);
                        iM7971u4 = o72.m7971u(i7 << 3);
                        iM7970t = o72.m7971u(iM7788q2);
                        iM6319Q = iM7970t + iM7971u4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 63:
                    if (m7813x(t, i7, i4)) {
                        int iM7788q3 = m7788q(t, j2);
                        iM7971u4 = o72.m7971u(i7 << 3);
                        iM7970t = o72.m7970t(iM7788q3);
                        iM6319Q = iM7970t + iM7971u4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 64:
                    if (m7813x(t, i7, i4)) {
                        iM7971u2 = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u2 + 4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 65:
                    if (m7813x(t, i7, i4)) {
                        iM7971u = o72.m7971u(i7 << 3);
                        iM6319Q = iM7971u + 8;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 66:
                    if (m7813x(t, i7, i4)) {
                        int iM7788q4 = m7788q(t, j2);
                        iM7971u4 = o72.m7971u(i7 << 3);
                        iM7970t = o72.m7971u((iM7788q4 >> 31) ^ (iM7788q4 + iM7788q4));
                        iM6319Q = iM7970t + iM7971u4;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 67:
                    if (m7813x(t, i7, i4)) {
                        long jM7789r3 = m7789r(t, j2);
                        iM7971u8 = o72.m7971u(i7 << 3);
                        iM7972v2 = o72.m7972v((jM7789r3 >> 63) ^ (jM7789r3 + jM7789r3));
                        iM6319Q = iM7972v2 + iM7971u8;
                        iM1578b += iM6319Q;
                    }
                    break;
                case 68:
                    if (m7813x(t, i7, i4)) {
                        iM6319Q = o72.m7968c(i7, (l92) unsafe.getObject(t, j2), m7801P(i4));
                        iM1578b += iM6319Q;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        oa2<?, ?> oa2Var = this.f17057o;
        int iMo7993q = oa2Var.mo7993q(oa2Var.mo7986j(t)) + iM1578b;
        if (!this.f17050h) {
            return iMo7993q;
        }
        this.f17058p.mo8401b(t);
        throw null;
    }

    /* JADX INFO: renamed from: L */
    public final int m7797L(T t) {
        int iM7971u;
        int iM7971u2;
        int iM7971u3;
        int iM7972v;
        int iM7971u4;
        int iM7970t;
        int iM7971u5;
        int iM7971u6;
        int iMo5719m;
        int iM7971u7;
        int iM6319Q;
        int iM7971u8;
        int iM7972v2;
        int iM6315M;
        int iM7969s;
        int iM7971u9;
        int i;
        Unsafe unsafe = f17044b;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17045c.length; i3 += 3) {
            int iM7807d = m7807d(i3);
            int i4 = (iM7807d >>> 20) & 255;
            int[] iArr = this.f17045c;
            int i5 = iArr[i3];
            long j2 = iM7807d & 1048575;
            if (i4 >= y72.f21765O.f21804g0 && i4 <= y72.f21778b0.f21804g0) {
                int i6 = iArr[i3 + 2];
            }
            switch (i4) {
                case 0:
                    if (m7811v(t, i3)) {
                        iM7971u = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u + 8;
                        i2 += iM6319Q;
                    }
                    break;
                case 1:
                    if (m7811v(t, i3)) {
                        iM7971u2 = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u2 + 4;
                        i2 += iM6319Q;
                    }
                    break;
                case 2:
                    if (m7811v(t, i3)) {
                        long jM8859h = za2.m8859h(t, j2);
                        iM7971u3 = o72.m7971u(i5 << 3);
                        iM7972v = o72.m7972v(jM8859h);
                        iM6319Q = iM7972v + iM7971u3;
                        i2 += iM6319Q;
                    }
                    break;
                case 3:
                    if (m7811v(t, i3)) {
                        long jM8859h2 = za2.m8859h(t, j2);
                        iM7971u3 = o72.m7971u(i5 << 3);
                        iM7972v = o72.m7972v(jM8859h2);
                        iM6319Q = iM7972v + iM7971u3;
                        i2 += iM6319Q;
                    }
                    break;
                case 4:
                    if (m7811v(t, i3)) {
                        int iM8857f = za2.m8857f(t, j2);
                        iM7971u4 = o72.m7971u(i5 << 3);
                        iM7970t = o72.m7970t(iM8857f);
                        iM6319Q = iM7970t + iM7971u4;
                        i2 += iM6319Q;
                    }
                    break;
                case 5:
                    if (m7811v(t, i3)) {
                        iM7971u = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u + 8;
                        i2 += iM6319Q;
                    }
                    break;
                case 6:
                    if (m7811v(t, i3)) {
                        iM7971u2 = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u2 + 4;
                        i2 += iM6319Q;
                    }
                    break;
                case 7:
                    if (m7811v(t, i3)) {
                        iM7971u5 = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u5 + 1;
                        i2 += iM6319Q;
                    }
                    break;
                case 8:
                    if (m7811v(t, i3)) {
                        Object objM8867p = za2.m8867p(t, j2);
                        if (objM8867p instanceof g72) {
                            iM7971u6 = o72.m7971u(i5 << 3);
                            iMo5719m = ((g72) objM8867p).mo5719m();
                            iM7971u7 = o72.m7971u(iMo5719m);
                            i = iM7971u7 + iMo5719m + iM7971u6;
                            i2 += i;
                        } else {
                            iM7971u4 = o72.m7971u(i5 << 3);
                            iM7970t = o72.m7973w((String) objM8867p);
                            iM6319Q = iM7970t + iM7971u4;
                            i2 += iM6319Q;
                        }
                    }
                    break;
                case 9:
                    if (m7811v(t, i3)) {
                        iM6319Q = da2.m6319Q(i5, za2.m8867p(t, j2), m7801P(i3));
                        i2 += iM6319Q;
                    }
                    break;
                case 10:
                    if (m7811v(t, i3)) {
                        g72 g72Var = (g72) za2.m8867p(t, j2);
                        iM7971u6 = o72.m7971u(i5 << 3);
                        iMo5719m = g72Var.mo5719m();
                        iM7971u7 = o72.m7971u(iMo5719m);
                        i = iM7971u7 + iMo5719m + iM7971u6;
                        i2 += i;
                    }
                    break;
                case 11:
                    if (m7811v(t, i3)) {
                        int iM8857f2 = za2.m8857f(t, j2);
                        iM7971u4 = o72.m7971u(i5 << 3);
                        iM7970t = o72.m7971u(iM8857f2);
                        iM6319Q = iM7970t + iM7971u4;
                        i2 += iM6319Q;
                    }
                    break;
                case 12:
                    if (m7811v(t, i3)) {
                        int iM8857f3 = za2.m8857f(t, j2);
                        iM7971u4 = o72.m7971u(i5 << 3);
                        iM7970t = o72.m7970t(iM8857f3);
                        iM6319Q = iM7970t + iM7971u4;
                        i2 += iM6319Q;
                    }
                    break;
                case 13:
                    if (m7811v(t, i3)) {
                        iM7971u2 = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u2 + 4;
                        i2 += iM6319Q;
                    }
                    break;
                case 14:
                    if (m7811v(t, i3)) {
                        iM7971u = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u + 8;
                        i2 += iM6319Q;
                    }
                    break;
                case 15:
                    if (m7811v(t, i3)) {
                        int iM8857f4 = za2.m8857f(t, j2);
                        iM7971u4 = o72.m7971u(i5 << 3);
                        iM7970t = o72.m7971u((iM8857f4 >> 31) ^ (iM8857f4 + iM8857f4));
                        iM6319Q = iM7970t + iM7971u4;
                        i2 += iM6319Q;
                    }
                    break;
                case 16:
                    if (m7811v(t, i3)) {
                        long jM8859h3 = za2.m8859h(t, j2);
                        iM7971u8 = o72.m7971u(i5 << 3);
                        iM7972v2 = o72.m7972v((jM8859h3 >> 63) ^ (jM8859h3 + jM8859h3));
                        iM6319Q = iM7972v2 + iM7971u8;
                        i2 += iM6319Q;
                    }
                    break;
                case 17:
                    if (m7811v(t, i3)) {
                        iM6319Q = o72.m7968c(i5, (l92) za2.m8867p(t, j2), m7801P(i3));
                        i2 += iM6319Q;
                    }
                    break;
                case 18:
                    iM6319Q = da2.m6316N(i5, (List) za2.m8867p(t, j2));
                    i2 += iM6319Q;
                    break;
                case 19:
                    iM6319Q = da2.m6314L(i5, (List) za2.m8867p(t, j2));
                    i2 += iM6319Q;
                    break;
                case 20:
                    iM6319Q = da2.m6346x(i5, (List) za2.m8867p(t, j2));
                    i2 += iM6319Q;
                    break;
                case 21:
                    iM6319Q = da2.m6348z(i5, (List) za2.m8867p(t, j2), false);
                    i2 += iM6319Q;
                    break;
                case 22:
                    iM6319Q = da2.m6308F(i5, (List) za2.m8867p(t, j2), false);
                    i2 += iM6319Q;
                    break;
                case 23:
                    iM6319Q = da2.m6316N(i5, (List) za2.m8867p(t, j2));
                    i2 += iM6319Q;
                    break;
                case 24:
                    iM6319Q = da2.m6314L(i5, (List) za2.m8867p(t, j2));
                    i2 += iM6319Q;
                    break;
                case 25:
                    iM6319Q = da2.m6317O(i5, (List) za2.m8867p(t, j2));
                    i2 += iM6319Q;
                    break;
                case 26:
                    iM6319Q = da2.m6318P(i5, (List) za2.m8867p(t, j2));
                    i2 += iM6319Q;
                    break;
                case 27:
                    iM6319Q = da2.m6320R(i5, (List) za2.m8867p(t, j2), m7801P(i3));
                    i2 += iM6319Q;
                    break;
                case 28:
                    iM6319Q = da2.m6321S(i5, (List) za2.m8867p(t, j2));
                    i2 += iM6319Q;
                    break;
                case 29:
                    iM6319Q = da2.m6310H(i5, (List) za2.m8867p(t, j2), false);
                    i2 += iM6319Q;
                    break;
                case 30:
                    iM6319Q = da2.m6306D(i5, (List) za2.m8867p(t, j2), false);
                    i2 += iM6319Q;
                    break;
                case 31:
                    iM6319Q = da2.m6314L(i5, (List) za2.m8867p(t, j2));
                    i2 += iM6319Q;
                    break;
                case 32:
                    iM6319Q = da2.m6316N(i5, (List) za2.m8867p(t, j2));
                    i2 += iM6319Q;
                    break;
                case 33:
                    iM6319Q = da2.m6312J(i5, (List) za2.m8867p(t, j2), false);
                    i2 += iM6319Q;
                    break;
                case 34:
                    iM6319Q = da2.m6304B(i5, (List) za2.m8867p(t, j2), false);
                    i2 += iM6319Q;
                    break;
                case 35:
                    iM6315M = da2.m6315M((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 36:
                    iM6315M = da2.m6313K((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 37:
                    iM6315M = da2.m6345w((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 38:
                    iM6315M = da2.m6347y((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 39:
                    iM6315M = da2.m6307E((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 40:
                    iM6315M = da2.m6315M((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 41:
                    iM6315M = da2.m6313K((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(t, j2);
                    Class<?> cls = da2.f13197a;
                    iM6315M = list.size();
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 43:
                    iM6315M = da2.m6309G((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 44:
                    iM6315M = da2.m6305C((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 45:
                    iM6315M = da2.m6313K((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 46:
                    iM6315M = da2.m6315M((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 47:
                    iM6315M = da2.m6311I((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 48:
                    iM6315M = da2.m6303A((List) unsafe.getObject(t, j2));
                    if (iM6315M > 0) {
                        iM7969s = o72.m7969s(i5);
                        iM7971u9 = o72.m7971u(iM6315M);
                        i = iM7971u9 + iM7969s + iM6315M;
                        i2 += i;
                    }
                    break;
                case 49:
                    iM6319Q = da2.m6322T(i5, (List) za2.m8867p(t, j2), m7801P(i3));
                    i2 += iM6319Q;
                    break;
                case 50:
                    h92.m7105a(i5, za2.m8867p(t, j2), m7802Q(i3));
                    break;
                case 51:
                    if (m7813x(t, i5, i3)) {
                        iM7971u = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u + 8;
                        i2 += iM6319Q;
                    }
                    break;
                case 52:
                    if (m7813x(t, i5, i3)) {
                        iM7971u2 = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u2 + 4;
                        i2 += iM6319Q;
                    }
                    break;
                case 53:
                    if (m7813x(t, i5, i3)) {
                        long jM7789r = m7789r(t, j2);
                        iM7971u3 = o72.m7971u(i5 << 3);
                        iM7972v = o72.m7972v(jM7789r);
                        iM6319Q = iM7972v + iM7971u3;
                        i2 += iM6319Q;
                    }
                    break;
                case 54:
                    if (m7813x(t, i5, i3)) {
                        long jM7789r2 = m7789r(t, j2);
                        iM7971u3 = o72.m7971u(i5 << 3);
                        iM7972v = o72.m7972v(jM7789r2);
                        iM6319Q = iM7972v + iM7971u3;
                        i2 += iM6319Q;
                    }
                    break;
                case 55:
                    if (m7813x(t, i5, i3)) {
                        int iM7788q = m7788q(t, j2);
                        iM7971u4 = o72.m7971u(i5 << 3);
                        iM7970t = o72.m7970t(iM7788q);
                        iM6319Q = iM7970t + iM7971u4;
                        i2 += iM6319Q;
                    }
                    break;
                case 56:
                    if (m7813x(t, i5, i3)) {
                        iM7971u = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u + 8;
                        i2 += iM6319Q;
                    }
                    break;
                case 57:
                    if (m7813x(t, i5, i3)) {
                        iM7971u2 = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u2 + 4;
                        i2 += iM6319Q;
                    }
                    break;
                case 58:
                    if (m7813x(t, i5, i3)) {
                        iM7971u5 = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u5 + 1;
                        i2 += iM6319Q;
                    }
                    break;
                case 59:
                    if (m7813x(t, i5, i3)) {
                        Object objM8867p2 = za2.m8867p(t, j2);
                        if (objM8867p2 instanceof g72) {
                            iM7971u6 = o72.m7971u(i5 << 3);
                            iMo5719m = ((g72) objM8867p2).mo5719m();
                            iM7971u7 = o72.m7971u(iMo5719m);
                            i = iM7971u7 + iMo5719m + iM7971u6;
                            i2 += i;
                        } else {
                            iM7971u4 = o72.m7971u(i5 << 3);
                            iM7970t = o72.m7973w((String) objM8867p2);
                            iM6319Q = iM7970t + iM7971u4;
                            i2 += iM6319Q;
                        }
                    }
                    break;
                case 60:
                    if (m7813x(t, i5, i3)) {
                        iM6319Q = da2.m6319Q(i5, za2.m8867p(t, j2), m7801P(i3));
                        i2 += iM6319Q;
                    }
                    break;
                case 61:
                    if (m7813x(t, i5, i3)) {
                        g72 g72Var2 = (g72) za2.m8867p(t, j2);
                        iM7971u6 = o72.m7971u(i5 << 3);
                        iMo5719m = g72Var2.mo5719m();
                        iM7971u7 = o72.m7971u(iMo5719m);
                        i = iM7971u7 + iMo5719m + iM7971u6;
                        i2 += i;
                    }
                    break;
                case 62:
                    if (m7813x(t, i5, i3)) {
                        int iM7788q2 = m7788q(t, j2);
                        iM7971u4 = o72.m7971u(i5 << 3);
                        iM7970t = o72.m7971u(iM7788q2);
                        iM6319Q = iM7970t + iM7971u4;
                        i2 += iM6319Q;
                    }
                    break;
                case 63:
                    if (m7813x(t, i5, i3)) {
                        int iM7788q3 = m7788q(t, j2);
                        iM7971u4 = o72.m7971u(i5 << 3);
                        iM7970t = o72.m7970t(iM7788q3);
                        iM6319Q = iM7970t + iM7971u4;
                        i2 += iM6319Q;
                    }
                    break;
                case 64:
                    if (m7813x(t, i5, i3)) {
                        iM7971u2 = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u2 + 4;
                        i2 += iM6319Q;
                    }
                    break;
                case 65:
                    if (m7813x(t, i5, i3)) {
                        iM7971u = o72.m7971u(i5 << 3);
                        iM6319Q = iM7971u + 8;
                        i2 += iM6319Q;
                    }
                    break;
                case 66:
                    if (m7813x(t, i5, i3)) {
                        int iM7788q4 = m7788q(t, j2);
                        iM7971u4 = o72.m7971u(i5 << 3);
                        iM7970t = o72.m7971u((iM7788q4 >> 31) ^ (iM7788q4 + iM7788q4));
                        iM6319Q = iM7970t + iM7971u4;
                        i2 += iM6319Q;
                    }
                    break;
                case 67:
                    if (m7813x(t, i5, i3)) {
                        long jM7789r3 = m7789r(t, j2);
                        iM7971u8 = o72.m7971u(i5 << 3);
                        iM7972v2 = o72.m7972v((jM7789r3 >> 63) ^ (jM7789r3 + jM7789r3));
                        iM6319Q = iM7972v2 + iM7971u8;
                        i2 += iM6319Q;
                    }
                    break;
                case 68:
                    if (m7813x(t, i5, i3)) {
                        iM6319Q = o72.m7968c(i5, (l92) za2.m8867p(t, j2), m7801P(i3));
                        i2 += iM6319Q;
                    }
                    break;
            }
        }
        oa2<?, ?> oa2Var = this.f17057o;
        return oa2Var.mo7993q(oa2Var.mo7986j(t)) + i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final int m7798M(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j2, int i7, long j3, w62 w62Var) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iM5390k0;
        int iM5390k1 = i;
        Unsafe unsafe = f17044b;
        o82 o82VarMo5705l = (o82) unsafe.getObject(t, j3);
        if (!o82VarMo5705l.zza()) {
            int size = o82VarMo5705l.size();
            o82VarMo5705l = o82VarMo5705l.mo5705l(size == 0 ? 10 : size + size);
            unsafe.putObject(t, j3, o82VarMo5705l);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    q72 q72Var = (q72) o82VarMo5705l;
                    int iM5390k2 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                    int i12 = w62Var.f21009a + iM5390k2;
                    while (iM5390k2 < i12) {
                        q72Var.m8193f(Double.longBitsToDouble(C2622l.m5348b3(bArr, iM5390k2)));
                        iM5390k2 += 8;
                    }
                    if (iM5390k2 == i12) {
                        return iM5390k2;
                    }
                    throw r82.m8260a();
                }
                if (i5 == 1) {
                    q72 q72Var2 = (q72) o82VarMo5705l;
                    q72Var2.m8193f(Double.longBitsToDouble(C2622l.m5348b3(bArr, i)));
                    while (true) {
                        i8 = iM5390k1 + 8;
                        if (i8 < i2) {
                            int iM5390k3 = C2622l.m5390k0(bArr, i8, w62Var);
                            if (i3 == w62Var.f21009a) {
                                q72Var2.m8193f(Double.longBitsToDouble(C2622l.m5348b3(bArr, iM5390k3)));
                                iM5390k1 = iM5390k3;
                            }
                        }
                    }
                    return i8;
                }
                return iM5390k1;
            case 19:
            case 36:
                if (i5 == 2) {
                    a82 a82Var = (a82) o82VarMo5705l;
                    int iM5390k4 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                    int i13 = w62Var.f21009a + iM5390k4;
                    while (iM5390k4 < i13) {
                        a82Var.m5702f(Float.intBitsToFloat(C2622l.m5260H2(bArr, iM5390k4)));
                        iM5390k4 += 4;
                    }
                    if (iM5390k4 == i13) {
                        return iM5390k4;
                    }
                    throw r82.m8260a();
                }
                if (i5 == 5) {
                    a82 a82Var2 = (a82) o82VarMo5705l;
                    a82Var2.m5702f(Float.intBitsToFloat(C2622l.m5260H2(bArr, i)));
                    while (true) {
                        i9 = iM5390k1 + 4;
                        if (i9 < i2) {
                            int iM5390k5 = C2622l.m5390k0(bArr, i9, w62Var);
                            if (i3 == w62Var.f21009a) {
                                a82Var2.m5702f(Float.intBitsToFloat(C2622l.m5260H2(bArr, iM5390k5)));
                                iM5390k1 = iM5390k5;
                            }
                        }
                    }
                    return i9;
                }
                return iM5390k1;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    b92 b92Var = (b92) o82VarMo5705l;
                    int iM5390k6 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                    int i14 = w62Var.f21009a + iM5390k6;
                    while (iM5390k6 < i14) {
                        iM5390k6 = C2622l.m5382i2(bArr, iM5390k6, w62Var);
                        b92Var.m5938j(w62Var.f21010b);
                    }
                    if (iM5390k6 == i14) {
                        return iM5390k6;
                    }
                    throw r82.m8260a();
                }
                if (i5 == 0) {
                    b92 b92Var2 = (b92) o82VarMo5705l;
                    int iM5382i2 = C2622l.m5382i2(bArr, iM5390k1, w62Var);
                    b92Var2.m5938j(w62Var.f21010b);
                    while (iM5382i2 < i2) {
                        int iM5390k7 = C2622l.m5390k0(bArr, iM5382i2, w62Var);
                        if (i3 != w62Var.f21009a) {
                            return iM5382i2;
                        }
                        iM5382i2 = C2622l.m5382i2(bArr, iM5390k7, w62Var);
                        b92Var2.m5938j(w62Var.f21010b);
                    }
                    return iM5382i2;
                }
                return iM5390k1;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C2622l.m5261H3(bArr, iM5390k1, o82VarMo5705l, w62Var);
                }
                if (i5 == 0) {
                    return C2622l.m5246E3(i3, bArr, i, i2, o82VarMo5705l, w62Var);
                }
                return iM5390k1;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    b92 b92Var3 = (b92) o82VarMo5705l;
                    int iM5390k8 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                    int i15 = w62Var.f21009a + iM5390k8;
                    while (iM5390k8 < i15) {
                        b92Var3.m5938j(C2622l.m5348b3(bArr, iM5390k8));
                        iM5390k8 += 8;
                    }
                    if (iM5390k8 == i15) {
                        return iM5390k8;
                    }
                    throw r82.m8260a();
                }
                if (i5 == 1) {
                    b92 b92Var4 = (b92) o82VarMo5705l;
                    b92Var4.m5938j(C2622l.m5348b3(bArr, i));
                    while (true) {
                        i10 = iM5390k1 + 8;
                        if (i10 < i2) {
                            int iM5390k9 = C2622l.m5390k0(bArr, i10, w62Var);
                            if (i3 == w62Var.f21009a) {
                                b92Var4.m5938j(C2622l.m5348b3(bArr, iM5390k9));
                                iM5390k1 = iM5390k9;
                            }
                        }
                    }
                    return i10;
                }
                return iM5390k1;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    h82 h82Var = (h82) o82VarMo5705l;
                    int iM5390k10 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                    int i16 = w62Var.f21009a + iM5390k10;
                    while (iM5390k10 < i16) {
                        h82Var.m7102j(C2622l.m5260H2(bArr, iM5390k10));
                        iM5390k10 += 4;
                    }
                    if (iM5390k10 == i16) {
                        return iM5390k10;
                    }
                    throw r82.m8260a();
                }
                if (i5 == 5) {
                    h82 h82Var2 = (h82) o82VarMo5705l;
                    h82Var2.m7102j(C2622l.m5260H2(bArr, i));
                    while (true) {
                        i11 = iM5390k1 + 4;
                        if (i11 < i2) {
                            int iM5390k11 = C2622l.m5390k0(bArr, i11, w62Var);
                            if (i3 == w62Var.f21009a) {
                                h82Var2.m7102j(C2622l.m5260H2(bArr, iM5390k11));
                                iM5390k1 = iM5390k11;
                            }
                        }
                    }
                    return i11;
                }
                return iM5390k1;
            case 25:
            case 42:
                if (i5 == 2) {
                    x62 x62Var = (x62) o82VarMo5705l;
                    iM5390k0 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                    int i17 = w62Var.f21009a + iM5390k0;
                    while (iM5390k0 < i17) {
                        iM5390k0 = C2622l.m5382i2(bArr, iM5390k0, w62Var);
                        x62Var.m8719f(w62Var.f21010b != 0);
                    }
                    if (iM5390k0 != i17) {
                        throw r82.m8260a();
                    }
                    return iM5390k0;
                }
                if (i5 == 0) {
                    x62 x62Var2 = (x62) o82VarMo5705l;
                    int iM5382i3 = C2622l.m5382i2(bArr, iM5390k1, w62Var);
                    x62Var2.m8719f(w62Var.f21010b != 0);
                    while (iM5382i3 < i2) {
                        int iM5390k12 = C2622l.m5390k0(bArr, iM5382i3, w62Var);
                        if (i3 != w62Var.f21009a) {
                            return iM5382i3;
                        }
                        iM5382i3 = C2622l.m5382i2(bArr, iM5390k12, w62Var);
                        x62Var2.m8719f(w62Var.f21010b != 0);
                    }
                    return iM5382i3;
                }
                return iM5390k1;
            case 26:
                if (i5 == 2) {
                    if ((j2 & 536870912) == 0) {
                        iM5390k1 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                        int i18 = w62Var.f21009a;
                        if (i18 < 0) {
                            throw r82.m8261b();
                        }
                        if (i18 == 0) {
                            o82VarMo5705l.add("");
                        } else {
                            o82VarMo5705l.add(new String(bArr, iM5390k1, i18, p82.f17879a));
                            iM5390k1 += i18;
                        }
                        while (iM5390k1 < i2) {
                            int iM5390k13 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                            if (i3 == w62Var.f21009a) {
                                iM5390k1 = C2622l.m5390k0(bArr, iM5390k13, w62Var);
                                int i19 = w62Var.f21009a;
                                if (i19 < 0) {
                                    throw r82.m8261b();
                                }
                                if (i19 == 0) {
                                    o82VarMo5705l.add("");
                                } else {
                                    o82VarMo5705l.add(new String(bArr, iM5390k1, i19, p82.f17879a));
                                    iM5390k1 += i19;
                                }
                            }
                        }
                    } else {
                        iM5390k1 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                        int i20 = w62Var.f21009a;
                        if (i20 < 0) {
                            throw r82.m8261b();
                        }
                        if (i20 == 0) {
                            o82VarMo5705l.add("");
                        } else {
                            int i21 = iM5390k1 + i20;
                            if (!cb2.m6157a(bArr, iM5390k1, i21)) {
                                throw r82.m8267h();
                            }
                            o82VarMo5705l.add(new String(bArr, iM5390k1, i20, p82.f17879a));
                            iM5390k1 = i21;
                        }
                        while (iM5390k1 < i2) {
                            int iM5390k14 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                            if (i3 == w62Var.f21009a) {
                                iM5390k1 = C2622l.m5390k0(bArr, iM5390k14, w62Var);
                                int i22 = w62Var.f21009a;
                                if (i22 < 0) {
                                    throw r82.m8261b();
                                }
                                if (i22 == 0) {
                                    o82VarMo5705l.add("");
                                } else {
                                    int i23 = iM5390k1 + i22;
                                    if (!cb2.m6157a(bArr, iM5390k1, i23)) {
                                        throw r82.m8267h();
                                    }
                                    o82VarMo5705l.add(new String(bArr, iM5390k1, i22, p82.f17879a));
                                    iM5390k1 = i23;
                                }
                            }
                        }
                    }
                }
                return iM5390k1;
            case 27:
                if (i5 == 2) {
                    return C2622l.m5276K3(m7801P(i6), i3, bArr, i, i2, o82VarMo5705l, w62Var);
                }
                return iM5390k1;
            case 28:
                if (i5 == 2) {
                    int iM5390k15 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                    int i24 = w62Var.f21009a;
                    if (i24 < 0) {
                        throw r82.m8261b();
                    }
                    if (i24 > bArr.length - iM5390k15) {
                        throw r82.m8260a();
                    }
                    if (i24 == 0) {
                        o82VarMo5705l.add(g72.f14513f);
                    } else {
                        o82VarMo5705l.add(g72.m6939G(bArr, iM5390k15, i24));
                        iM5390k15 += i24;
                    }
                    while (iM5390k15 < i2) {
                        int iM5390k16 = C2622l.m5390k0(bArr, iM5390k15, w62Var);
                        if (i3 != w62Var.f21009a) {
                            return iM5390k15;
                        }
                        iM5390k15 = C2622l.m5390k0(bArr, iM5390k16, w62Var);
                        int i25 = w62Var.f21009a;
                        if (i25 < 0) {
                            throw r82.m8261b();
                        }
                        if (i25 > bArr.length - iM5390k15) {
                            throw r82.m8260a();
                        }
                        if (i25 == 0) {
                            o82VarMo5705l.add(g72.f14513f);
                        } else {
                            o82VarMo5705l.add(g72.m6939G(bArr, iM5390k15, i25));
                            iM5390k15 += i25;
                        }
                    }
                    return iM5390k15;
                }
                return iM5390k1;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iM5390k0 = C2622l.m5246E3(i3, bArr, i, i2, o82VarMo5705l, w62Var);
                    }
                    return iM5390k1;
                }
                iM5390k0 = C2622l.m5261H3(bArr, iM5390k1, o82VarMo5705l, w62Var);
                g82 g82Var = (g82) t;
                pa2 pa2Var = g82Var.zzc;
                if (pa2Var == pa2.f17890a) {
                    pa2Var = null;
                }
                Object objM6324b = da2.m6324b(i4, o82VarMo5705l, m7803R(i6), pa2Var, this.f17057o);
                if (objM6324b != null) {
                    g82Var.zzc = (pa2) objM6324b;
                    return iM5390k0;
                }
                return iM5390k0;
            case 33:
            case 47:
                if (i5 == 2) {
                    h82 h82Var3 = (h82) o82VarMo5705l;
                    int iM5390k17 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                    int i26 = w62Var.f21009a + iM5390k17;
                    while (iM5390k17 < i26) {
                        iM5390k17 = C2622l.m5390k0(bArr, iM5390k17, w62Var);
                        h82Var3.m7102j(j72.m7318d(w62Var.f21009a));
                    }
                    if (iM5390k17 == i26) {
                        return iM5390k17;
                    }
                    throw r82.m8260a();
                }
                if (i5 == 0) {
                    h82 h82Var4 = (h82) o82VarMo5705l;
                    int iM5390k18 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                    h82Var4.m7102j(j72.m7318d(w62Var.f21009a));
                    while (iM5390k18 < i2) {
                        int iM5390k19 = C2622l.m5390k0(bArr, iM5390k18, w62Var);
                        if (i3 != w62Var.f21009a) {
                            return iM5390k18;
                        }
                        iM5390k18 = C2622l.m5390k0(bArr, iM5390k19, w62Var);
                        h82Var4.m7102j(j72.m7318d(w62Var.f21009a));
                    }
                    return iM5390k18;
                }
                return iM5390k1;
            case 34:
            case 48:
                if (i5 == 2) {
                    b92 b92Var5 = (b92) o82VarMo5705l;
                    int iM5390k20 = C2622l.m5390k0(bArr, iM5390k1, w62Var);
                    int i27 = w62Var.f21009a + iM5390k20;
                    while (iM5390k20 < i27) {
                        iM5390k20 = C2622l.m5382i2(bArr, iM5390k20, w62Var);
                        b92Var5.m5938j(j72.m7319e(w62Var.f21010b));
                    }
                    if (iM5390k20 == i27) {
                        return iM5390k20;
                    }
                    throw r82.m8260a();
                }
                if (i5 == 0) {
                    b92 b92Var6 = (b92) o82VarMo5705l;
                    int iM5382i4 = C2622l.m5382i2(bArr, iM5390k1, w62Var);
                    b92Var6.m5938j(j72.m7319e(w62Var.f21010b));
                    while (iM5382i4 < i2) {
                        int iM5390k21 = C2622l.m5390k0(bArr, iM5382i4, w62Var);
                        if (i3 != w62Var.f21009a) {
                            return iM5382i4;
                        }
                        iM5382i4 = C2622l.m5382i2(bArr, iM5390k21, w62Var);
                        b92Var6.m5938j(j72.m7319e(w62Var.f21010b));
                    }
                    return iM5382i4;
                }
                return iM5390k1;
            default:
                if (i5 == 3) {
                    ba2 ba2VarM7801P = m7801P(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iM5231B3 = C2622l.m5231B3(ba2VarM7801P, bArr, i, i2, i28, w62Var);
                    o82VarMo5705l.add(w62Var.f21011c);
                    while (iM5231B3 < i2) {
                        int iM5390k22 = C2622l.m5390k0(bArr, iM5231B3, w62Var);
                        if (i3 != w62Var.f21009a) {
                            return iM5231B3;
                        }
                        iM5231B3 = C2622l.m5231B3(ba2VarM7801P, bArr, iM5390k22, i2, i28, w62Var);
                        o82VarMo5705l.add(w62Var.f21011c);
                    }
                    return iM5231B3;
                }
                return iM5390k1;
        }
    }

    /* JADX INFO: renamed from: N */
    public final int m7799N(Object obj, byte[] bArr, int i, int i2, int i3, long j2) throws IOException {
        Unsafe unsafe = f17044b;
        Object objM7802Q = m7802Q(i3);
        Object object = unsafe.getObject(obj, j2);
        if (!((g92) object).f14524g) {
            g92<K, V> g92VarM6980b = g92.f14523f.m6980b();
            h92.m7107c(g92VarM6980b, object);
            unsafe.putObject(obj, j2, g92VarM6980b);
        }
        throw null;
    }

    /* JADX INFO: renamed from: O */
    public final int m7800O(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, w62 w62Var) throws IOException {
        Unsafe unsafe = f17044b;
        long j3 = this.f17045c[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j2, Double.valueOf(Double.longBitsToDouble(C2622l.m5348b3(bArr, i))));
                unsafe.putInt(t, j3, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j2, Float.valueOf(Float.intBitsToFloat(C2622l.m5260H2(bArr, i))));
                unsafe.putInt(t, j3, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iM5382i2 = C2622l.m5382i2(bArr, i, w62Var);
                unsafe.putObject(t, j2, Long.valueOf(w62Var.f21010b));
                unsafe.putInt(t, j3, i4);
                return iM5382i2;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iM5390k0 = C2622l.m5390k0(bArr, i, w62Var);
                unsafe.putObject(t, j2, Integer.valueOf(w62Var.f21009a));
                unsafe.putInt(t, j3, i4);
                return iM5390k0;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j2, Long.valueOf(C2622l.m5348b3(bArr, i)));
                unsafe.putInt(t, j3, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j2, Integer.valueOf(C2622l.m5260H2(bArr, i)));
                unsafe.putInt(t, j3, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iM5382i3 = C2622l.m5382i2(bArr, i, w62Var);
                unsafe.putObject(t, j2, Boolean.valueOf(w62Var.f21010b != 0));
                unsafe.putInt(t, j3, i4);
                return iM5382i3;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iM5390k1 = C2622l.m5390k0(bArr, i, w62Var);
                int i9 = w62Var.f21009a;
                if (i9 == 0) {
                    unsafe.putObject(t, j2, "");
                } else {
                    if ((i6 & 536870912) != 0 && !cb2.m6157a(bArr, iM5390k1, iM5390k1 + i9)) {
                        throw r82.m8267h();
                    }
                    unsafe.putObject(t, j2, new String(bArr, iM5390k1, i9, p82.f17879a));
                    iM5390k1 += i9;
                }
                unsafe.putInt(t, j3, i4);
                return iM5390k1;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iM5463y3 = C2622l.m5463y3(m7801P(i8), bArr, i, i2, w62Var);
                Object object = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j2) : null;
                if (object == null) {
                    unsafe.putObject(t, j2, w62Var.f21011c);
                } else {
                    unsafe.putObject(t, j2, p82.m8090c(object, w62Var.f21011c));
                }
                unsafe.putInt(t, j3, i4);
                return iM5463y3;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iM5453w3 = C2622l.m5453w3(bArr, i, w62Var);
                unsafe.putObject(t, j2, w62Var.f21011c);
                unsafe.putInt(t, j3, i4);
                return iM5453w3;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iM5390k2 = C2622l.m5390k0(bArr, i, w62Var);
                int i10 = w62Var.f21009a;
                j82 j82VarM7803R = m7803R(i8);
                if (j82VarM7803R == null || j82VarM7803R.mo5728b(i10)) {
                    unsafe.putObject(t, j2, Integer.valueOf(i10));
                    unsafe.putInt(t, j3, i4);
                } else {
                    m7781D(t).m8093c(i3, Long.valueOf(i10));
                }
                return iM5390k2;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iM5390k3 = C2622l.m5390k0(bArr, i, w62Var);
                unsafe.putObject(t, j2, Integer.valueOf(j72.m7318d(w62Var.f21009a)));
                unsafe.putInt(t, j3, i4);
                return iM5390k3;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iM5382i4 = C2622l.m5382i2(bArr, i, w62Var);
                unsafe.putObject(t, j2, Long.valueOf(j72.m7319e(w62Var.f21010b)));
                unsafe.putInt(t, j3, i4);
                return iM5382i4;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                int iM5231B3 = C2622l.m5231B3(m7801P(i8), bArr, i, i2, (i3 & (-8)) | 4, w62Var);
                Object object2 = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j2) : null;
                if (object2 == null) {
                    unsafe.putObject(t, j2, w62Var.f21011c);
                } else {
                    unsafe.putObject(t, j2, p82.m8090c(object2, w62Var.f21011c));
                }
                unsafe.putInt(t, j3, i4);
                return iM5231B3;
            default:
                return i;
        }
    }

    /* JADX INFO: renamed from: P */
    public final ba2 m7801P(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f17046d;
        ba2 ba2Var = (ba2) objArr[i3];
        if (ba2Var != null) {
            return ba2Var;
        }
        ba2<T> ba2VarM8349a = s92.f19505a.m8349a((Class) objArr[i3 + 1]);
        this.f17046d[i3] = ba2VarM8349a;
        return ba2VarM8349a;
    }

    /* JADX INFO: renamed from: Q */
    public final Object m7802Q(int i) {
        int i2 = i / 3;
        return this.f17046d[i2 + i2];
    }

    /* JADX INFO: renamed from: R */
    public final j82 m7803R(int i) {
        int i2 = i / 3;
        return (j82) this.f17046d[i2 + i2 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:102:0x024a  */
    /* JADX WARN: Code duplicated, block: B:103:0x024c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0251  */
    /* JADX WARN: Code duplicated, block: B:108:0x0273 A[PHI: r0
  0x0273: PHI (r0v12 int) = (r0v8 int), (r0v13 int) binds: [B:117:0x02af, B:106:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x0275  */
    /* JADX WARN: Code duplicated, block: B:111:0x0279  */
    /* JADX WARN: Code duplicated, block: B:116:0x0291  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b1 A[PHI: r0
  0x02b1: PHI (r0v11 int) = (r0v8 int), (r0v13 int) binds: [B:117:0x02af, B:106:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x012e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0133  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142  */
    /* JADX WARN: Code duplicated, block: B:62:0x014c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x015b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x016f  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:73:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x01de  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0203  */
    /* JADX WARN: Code duplicated, block: B:92:0x020d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x021c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0222  */
    /* JADX WARN: Code duplicated, block: B:99:0x0225  */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0090. Please report as an issue. */
    /* JADX INFO: renamed from: S */
    public final int m7804S(T t, byte[] bArr, int i, int i2, w62 w62Var) throws IOException {
        int iM7815z;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        byte[] bArr2;
        long j2;
        int i7;
        int i8;
        int i9;
        int i10;
        o82 o82VarMo5705l;
        int size;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        byte[] bArr3;
        long j3;
        long j4;
        int i18;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        boolean z;
        int i19;
        long j10;
        long j11;
        Object object;
        long j12;
        long j13;
        Unsafe unsafe = f17044b;
        int i20 = -1;
        n92<T> n92Var = this;
        T t2 = t;
        byte[] bArr4 = bArr;
        int iM7800O = i;
        int i21 = i2;
        w62 w62Var2 = w62Var;
        int i22 = 0;
        int i23 = 1048575;
        int i24 = -1;
        int i25 = 0;
        while (iM7800O < i21) {
            int iM5234C1 = iM7800O + 1;
            int i26 = bArr4[iM7800O];
            if (i26 < 0) {
                iM5234C1 = C2622l.m5234C1(i26, bArr4, iM5234C1, w62Var2);
                i26 = w62Var2.f21009a;
            }
            int i27 = iM5234C1;
            int i28 = i26 >>> 3;
            int i29 = i26 & 7;
            if (i28 > i24) {
                int i30 = i25 / 3;
                if (i28 < n92Var.f17047e || i28 > n92Var.f17048f) {
                    i3 = -1;
                } else {
                    iM7815z = n92Var.m7791A(i28, i30);
                }
                if (i3 == i20) {
                    i7 = i26;
                    i8 = i28;
                    i12 = i27;
                    i25 = 0;
                } else {
                    iArr = n92Var.f17045c;
                    i4 = iArr[i3 + 1];
                    i5 = (i4 >>> 20) & 255;
                    i6 = i21;
                    bArr2 = bArr4;
                    j2 = i4 & 1048575;
                    i7 = i26;
                    if (i5 <= 17) {
                        int i31 = iArr[i3 + 2];
                        i13 = 1 << (i31 >>> 20);
                        i14 = i31 & 1048575;
                        if (i14 != i23) {
                            if (i23 != 1048575) {
                                unsafe.putInt(t2, i23, i22);
                            }
                            if (i14 != 1048575) {
                                i22 = unsafe.getInt(t2, i14);
                            }
                            i15 = i22;
                            i16 = i14;
                        } else {
                            j2 = j2;
                            i15 = i22;
                            i16 = i23;
                        }
                        switch (i5) {
                            case 0:
                                i8 = i28;
                                i17 = i3;
                                bArr3 = bArr2;
                                j3 = j2;
                                if (i29 == 1) {
                                    za2.m8866o(t2, j3, Double.longBitsToDouble(C2622l.m5348b3(bArr3, i27)));
                                    i18 = i27 + 8;
                                    iM7800O = i18;
                                    i22 = i15 | i13;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                }
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                            case 1:
                                i8 = i28;
                                i17 = i3;
                                bArr3 = bArr2;
                                j4 = j2;
                                if (i29 == 5) {
                                    za2.f22222e.mo8620e(t2, j4, Float.intBitsToFloat(C2622l.m5260H2(bArr3, i27)));
                                    i18 = i27 + 4;
                                    iM7800O = i18;
                                    i22 = i15 | i13;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                }
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                            case 2:
                            case 3:
                                i8 = i28;
                                i17 = i3;
                                bArr3 = bArr2;
                                j5 = j2;
                                if (i29 == 0) {
                                    int iM5382i2 = C2622l.m5382i2(bArr3, i27, w62Var2);
                                    unsafe.putLong(t, j5, w62Var2.f21010b);
                                    i22 = i15 | i13;
                                    iM7800O = iM5382i2;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                }
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                            case 4:
                            case 11:
                                i8 = i28;
                                i17 = i3;
                                bArr3 = bArr2;
                                j6 = j2;
                                if (i29 == 0) {
                                    iM7800O = C2622l.m5390k0(bArr3, i27, w62Var2);
                                    unsafe.putInt(t2, j6, w62Var2.f21009a);
                                    i22 = i15 | i13;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                }
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                            case 5:
                            case 14:
                                i8 = i28;
                                bArr3 = bArr2;
                                j7 = j2;
                                if (i29 == 1) {
                                    i17 = i3;
                                    i6 = i6;
                                    unsafe.putLong(t, j7, C2622l.m5348b3(bArr3, i27));
                                    i18 = i27 + 8;
                                    iM7800O = i18;
                                    i22 = i15 | i13;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                }
                                i17 = i3;
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                            case 6:
                            case 13:
                                i8 = i28;
                                bArr3 = bArr2;
                                j8 = j2;
                                if (i29 == 5) {
                                    unsafe.putInt(t2, j8, C2622l.m5260H2(bArr3, i27));
                                    i18 = i27 + 4;
                                    i17 = i3;
                                    i6 = i6;
                                    iM7800O = i18;
                                    i22 = i15 | i13;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                }
                                i17 = i3;
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                            case 7:
                                i8 = i28;
                                bArr3 = bArr2;
                                j9 = j2;
                                if (i29 == 0) {
                                    int iM5382i3 = C2622l.m5382i2(bArr3, i27, w62Var2);
                                    if (w62Var2.f21010b != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    za2.f22222e.mo8618c(t2, j9, z);
                                    i6 = i6;
                                    iM7800O = iM5382i3;
                                    i17 = i3;
                                    i22 = i15 | i13;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                }
                                i17 = i3;
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                            case 8:
                                i8 = i28;
                                i19 = i6;
                                bArr3 = bArr2;
                                j10 = j2;
                                if (i29 == 2) {
                                    if ((536870912 & i4) == 0) {
                                        iM7800O = C2622l.m5393k3(bArr3, i27, w62Var2);
                                    } else {
                                        iM7800O = C2622l.m5418p3(bArr3, i27, w62Var2);
                                    }
                                    unsafe.putObject(t2, j10, w62Var2.f21011c);
                                    i17 = i3;
                                    i6 = i19;
                                    i22 = i15 | i13;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                }
                                i17 = i3;
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                            case 9:
                                i8 = i28;
                                bArr3 = bArr2;
                                j11 = j2;
                                if (i29 == 2) {
                                    i19 = i6;
                                    iM7800O = C2622l.m5463y3(n92Var.m7801P(i3), bArr3, i27, i19, w62Var2);
                                    object = unsafe.getObject(t2, j11);
                                    if (object == null) {
                                        unsafe.putObject(t2, j11, w62Var2.f21011c);
                                    } else {
                                        unsafe.putObject(t2, j11, p82.m8090c(object, w62Var2.f21011c));
                                    }
                                    i17 = i3;
                                    i6 = i19;
                                    i22 = i15 | i13;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                }
                                i17 = i3;
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                            case 10:
                                i8 = i28;
                                bArr3 = bArr2;
                                j12 = j2;
                                if (i29 == 2) {
                                    iM7800O = C2622l.m5453w3(bArr3, i27, w62Var2);
                                    unsafe.putObject(t2, j12, w62Var2.f21011c);
                                    i17 = i3;
                                    i22 = i15 | i13;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                }
                                i17 = i3;
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                            case 12:
                                i8 = i28;
                                bArr3 = bArr2;
                                j13 = j2;
                                if (i29 == 0) {
                                    iM7800O = C2622l.m5390k0(bArr3, i27, w62Var2);
                                    unsafe.putInt(t2, j13, w62Var2.f21009a);
                                    i17 = i3;
                                    i22 = i15 | i13;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                }
                                i17 = i3;
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                            case 15:
                                i8 = i28;
                                bArr3 = bArr2;
                                if (i29 == 0) {
                                    iM7800O = C2622l.m5390k0(bArr3, i27, w62Var2);
                                    unsafe.putInt(t2, j2, j72.m7318d(w62Var2.f21009a));
                                    i17 = i3;
                                    i22 = i15 | i13;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                }
                                i17 = i3;
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                            case 16:
                                if (i29 == 0) {
                                    bArr3 = bArr2;
                                    int iM5382i4 = C2622l.m5382i2(bArr3, i27, w62Var2);
                                    i8 = i28;
                                    unsafe.putLong(t, j2, j72.m7319e(w62Var2.f21010b));
                                    i22 = i15 | i13;
                                    iM7800O = iM5382i4;
                                    i17 = i3;
                                    i25 = i17;
                                    i23 = i16;
                                    i21 = i6;
                                    bArr4 = bArr3;
                                    break;
                                }
                            default:
                                i8 = i28;
                                i17 = i3;
                                i25 = i17;
                                i22 = i15;
                                i23 = i16;
                                i12 = i27;
                                break;
                        }
                    } else {
                        i8 = i28;
                        i9 = i3;
                        if (i5 == 27) {
                            i10 = i27;
                            if (i5 <= 49) {
                                iM7800O = m7798M(t, bArr, i10, i2, i7 == true ? 1 : 0, i8, i29, i9, i4, i5, j2, w62Var);
                                if (iM7800O != i10) {
                                    i25 = i9;
                                } else {
                                    i27 = iM7800O;
                                    i25 = i9;
                                    i12 = i27;
                                }
                                n92Var = this;
                                t2 = t;
                                bArr4 = bArr;
                                i21 = i2;
                                w62Var2 = w62Var;
                            } else if (i5 == 50) {
                                iM7800O = m7800O(t, bArr, i10, i2, i7 == true ? 1 : 0, i8, i29, i4, i5, j2, i9, w62Var);
                                if (iM7800O != i10) {
                                    i25 = i9;
                                } else {
                                    i27 = iM7800O;
                                    i25 = i9;
                                    i12 = i27;
                                }
                                n92Var = this;
                                t2 = t;
                                bArr4 = bArr;
                                i21 = i2;
                                w62Var2 = w62Var;
                            } else if (i29 == 2) {
                                m7799N(t, bArr, i10, i2, i9, j2);
                                throw null;
                            }
                        } else if (i29 == 2) {
                            o82VarMo5705l = (o82) unsafe.getObject(t2, j2);
                            if (!o82VarMo5705l.zza()) {
                                size = o82VarMo5705l.size();
                                if (size == 0) {
                                    i11 = 10;
                                } else {
                                    i11 = size + size;
                                }
                                o82VarMo5705l = o82VarMo5705l.mo5705l(i11);
                                unsafe.putObject(t2, j2, o82VarMo5705l);
                            }
                            bArr4 = bArr2;
                            iM7800O = C2622l.m5276K3(n92Var.m7801P(i9), i7 == true ? 1 : 0, bArr, i27, i2, o82VarMo5705l, w62Var);
                            i21 = i6;
                            i25 = i9;
                        } else {
                            i10 = i27;
                        }
                        i27 = i10;
                        i25 = i9;
                        i12 = i27;
                    }
                    i24 = i8;
                    i20 = -1;
                }
                iM7800O = C2622l.m5286M3(i7 == true ? 1 : 0, bArr, i12, i2, m7781D(t), w62Var);
                n92Var = this;
                t2 = t;
                bArr4 = bArr;
                i21 = i2;
                w62Var2 = w62Var;
                i24 = i8;
                i20 = -1;
            } else {
                iM7815z = n92Var.m7815z(i28);
            }
            i3 = iM7815z;
            if (i3 == i20) {
                i7 = i26;
                i8 = i28;
                i12 = i27;
                i25 = 0;
            } else {
                iArr = n92Var.f17045c;
                i4 = iArr[i3 + 1];
                i5 = (i4 >>> 20) & 255;
                i6 = i21;
                bArr2 = bArr4;
                j2 = i4 & 1048575;
                i7 = i26;
                if (i5 <= 17) {
                    int i32 = iArr[i3 + 2];
                    i13 = 1 << (i32 >>> 20);
                    i14 = i32 & 1048575;
                    if (i14 != i23) {
                        if (i23 != 1048575) {
                            unsafe.putInt(t2, i23, i22);
                        }
                        if (i14 != 1048575) {
                            i22 = unsafe.getInt(t2, i14);
                        }
                        i15 = i22;
                        i16 = i14;
                    } else {
                        j2 = j2;
                        i15 = i22;
                        i16 = i23;
                    }
                    switch (i5) {
                        case 0:
                            i8 = i28;
                            i17 = i3;
                            bArr3 = bArr2;
                            j3 = j2;
                            if (i29 == 1) {
                                za2.m8866o(t2, j3, Double.longBitsToDouble(C2622l.m5348b3(bArr3, i27)));
                                i18 = i27 + 8;
                                iM7800O = i18;
                                i22 = i15 | i13;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                            }
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                        case 1:
                            i8 = i28;
                            i17 = i3;
                            bArr3 = bArr2;
                            j4 = j2;
                            if (i29 == 5) {
                                za2.f22222e.mo8620e(t2, j4, Float.intBitsToFloat(C2622l.m5260H2(bArr3, i27)));
                                i18 = i27 + 4;
                                iM7800O = i18;
                                i22 = i15 | i13;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                            }
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                        case 2:
                        case 3:
                            i8 = i28;
                            i17 = i3;
                            bArr3 = bArr2;
                            j5 = j2;
                            if (i29 == 0) {
                                int iM5382i5 = C2622l.m5382i2(bArr3, i27, w62Var2);
                                unsafe.putLong(t, j5, w62Var2.f21010b);
                                i22 = i15 | i13;
                                iM7800O = iM5382i5;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                            }
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                        case 4:
                        case 11:
                            i8 = i28;
                            i17 = i3;
                            bArr3 = bArr2;
                            j6 = j2;
                            if (i29 == 0) {
                                iM7800O = C2622l.m5390k0(bArr3, i27, w62Var2);
                                unsafe.putInt(t2, j6, w62Var2.f21009a);
                                i22 = i15 | i13;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                            }
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                        case 5:
                        case 14:
                            i8 = i28;
                            bArr3 = bArr2;
                            j7 = j2;
                            if (i29 == 1) {
                                i17 = i3;
                                i6 = i6;
                                unsafe.putLong(t, j7, C2622l.m5348b3(bArr3, i27));
                                i18 = i27 + 8;
                                iM7800O = i18;
                                i22 = i15 | i13;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                            }
                            i17 = i3;
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                        case 6:
                        case 13:
                            i8 = i28;
                            bArr3 = bArr2;
                            j8 = j2;
                            if (i29 == 5) {
                                unsafe.putInt(t2, j8, C2622l.m5260H2(bArr3, i27));
                                i18 = i27 + 4;
                                i17 = i3;
                                i6 = i6;
                                iM7800O = i18;
                                i22 = i15 | i13;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                            }
                            i17 = i3;
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                        case 7:
                            i8 = i28;
                            bArr3 = bArr2;
                            j9 = j2;
                            if (i29 == 0) {
                                int iM5382i6 = C2622l.m5382i2(bArr3, i27, w62Var2);
                                if (w62Var2.f21010b != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                za2.f22222e.mo8618c(t2, j9, z);
                                i6 = i6;
                                iM7800O = iM5382i6;
                                i17 = i3;
                                i22 = i15 | i13;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                            }
                            i17 = i3;
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                        case 8:
                            i8 = i28;
                            i19 = i6;
                            bArr3 = bArr2;
                            j10 = j2;
                            if (i29 == 2) {
                                if ((536870912 & i4) == 0) {
                                    iM7800O = C2622l.m5393k3(bArr3, i27, w62Var2);
                                } else {
                                    iM7800O = C2622l.m5418p3(bArr3, i27, w62Var2);
                                }
                                unsafe.putObject(t2, j10, w62Var2.f21011c);
                                i17 = i3;
                                i6 = i19;
                                i22 = i15 | i13;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                            }
                            i17 = i3;
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                        case 9:
                            i8 = i28;
                            bArr3 = bArr2;
                            j11 = j2;
                            if (i29 == 2) {
                                i19 = i6;
                                iM7800O = C2622l.m5463y3(n92Var.m7801P(i3), bArr3, i27, i19, w62Var2);
                                object = unsafe.getObject(t2, j11);
                                if (object == null) {
                                    unsafe.putObject(t2, j11, w62Var2.f21011c);
                                } else {
                                    unsafe.putObject(t2, j11, p82.m8090c(object, w62Var2.f21011c));
                                }
                                i17 = i3;
                                i6 = i19;
                                i22 = i15 | i13;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                            }
                            i17 = i3;
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                        case 10:
                            i8 = i28;
                            bArr3 = bArr2;
                            j12 = j2;
                            if (i29 == 2) {
                                iM7800O = C2622l.m5453w3(bArr3, i27, w62Var2);
                                unsafe.putObject(t2, j12, w62Var2.f21011c);
                                i17 = i3;
                                i22 = i15 | i13;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                            }
                            i17 = i3;
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                        case 12:
                            i8 = i28;
                            bArr3 = bArr2;
                            j13 = j2;
                            if (i29 == 0) {
                                iM7800O = C2622l.m5390k0(bArr3, i27, w62Var2);
                                unsafe.putInt(t2, j13, w62Var2.f21009a);
                                i17 = i3;
                                i22 = i15 | i13;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                            }
                            i17 = i3;
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                        case 15:
                            i8 = i28;
                            bArr3 = bArr2;
                            if (i29 == 0) {
                                iM7800O = C2622l.m5390k0(bArr3, i27, w62Var2);
                                unsafe.putInt(t2, j2, j72.m7318d(w62Var2.f21009a));
                                i17 = i3;
                                i22 = i15 | i13;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                            }
                            i17 = i3;
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                        case 16:
                            if (i29 == 0) {
                                bArr3 = bArr2;
                                int iM5382i7 = C2622l.m5382i2(bArr3, i27, w62Var2);
                                i8 = i28;
                                unsafe.putLong(t, j2, j72.m7319e(w62Var2.f21010b));
                                i22 = i15 | i13;
                                iM7800O = iM5382i7;
                                i17 = i3;
                                i25 = i17;
                                i23 = i16;
                                i21 = i6;
                                bArr4 = bArr3;
                                break;
                            }
                        default:
                            i8 = i28;
                            i17 = i3;
                            i25 = i17;
                            i22 = i15;
                            i23 = i16;
                            i12 = i27;
                            break;
                    }
                } else {
                    i8 = i28;
                    i9 = i3;
                    if (i5 == 27) {
                        i10 = i27;
                        if (i5 <= 49) {
                            iM7800O = m7798M(t, bArr, i10, i2, i7 == true ? 1 : 0, i8, i29, i9, i4, i5, j2, w62Var);
                            if (iM7800O != i10) {
                                i25 = i9;
                            } else {
                                i27 = iM7800O;
                                i25 = i9;
                                i12 = i27;
                            }
                            n92Var = this;
                            t2 = t;
                            bArr4 = bArr;
                            i21 = i2;
                            w62Var2 = w62Var;
                        } else if (i5 == 50) {
                            iM7800O = m7800O(t, bArr, i10, i2, i7 == true ? 1 : 0, i8, i29, i4, i5, j2, i9, w62Var);
                            if (iM7800O != i10) {
                                i25 = i9;
                            } else {
                                i27 = iM7800O;
                                i25 = i9;
                                i12 = i27;
                            }
                            n92Var = this;
                            t2 = t;
                            bArr4 = bArr;
                            i21 = i2;
                            w62Var2 = w62Var;
                        } else if (i29 == 2) {
                            m7799N(t, bArr, i10, i2, i9, j2);
                            throw null;
                        }
                    } else if (i29 == 2) {
                        o82VarMo5705l = (o82) unsafe.getObject(t2, j2);
                        if (!o82VarMo5705l.zza()) {
                            size = o82VarMo5705l.size();
                            if (size == 0) {
                                i11 = 10;
                            } else {
                                i11 = size + size;
                            }
                            o82VarMo5705l = o82VarMo5705l.mo5705l(i11);
                            unsafe.putObject(t2, j2, o82VarMo5705l);
                        }
                        bArr4 = bArr2;
                        iM7800O = C2622l.m5276K3(n92Var.m7801P(i9), i7 == true ? 1 : 0, bArr, i27, i2, o82VarMo5705l, w62Var);
                        i21 = i6;
                        i25 = i9;
                    } else {
                        i10 = i27;
                    }
                    i27 = i10;
                    i25 = i9;
                    i12 = i27;
                }
                i24 = i8;
                i20 = -1;
            }
            iM7800O = C2622l.m5286M3(i7 == true ? 1 : 0, bArr, i12, i2, m7781D(t), w62Var);
            n92Var = this;
            t2 = t;
            bArr4 = bArr;
            i21 = i2;
            w62Var2 = w62Var;
            i24 = i8;
            i20 = -1;
        }
        if (i23 != 1048575) {
            unsafe.putInt(t, i23, i22);
        }
        if (iM7800O == i2) {
            return iM7800O;
        }
        throw r82.m8266g();
    }

    /* JADX INFO: renamed from: a */
    public final Object m7805a(Object obj, int i, Object obj2) {
        int[] iArr = this.f17045c;
        int i2 = iArr[i];
        Object objM8867p = za2.m8867p(obj, iArr[i + 1] & 1048575);
        if (objM8867p == null || m7803R(i) == null) {
            return obj2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m7806b(Object obj, int i, k72 k72Var) throws IOException {
        if ((536870912 & i) != 0) {
            k72Var.m7479p(2);
            za2.f22222e.m8789p(obj, i & 1048575, k72Var.f15896a.mo7091r());
        } else if (!this.f17051i) {
            za2.f22222e.m8789p(obj, i & 1048575, k72Var.m7454H());
        } else {
            k72Var.m7479p(2);
            za2.f22222e.m8789p(obj, i & 1048575, k72Var.f15896a.mo7090q());
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: c */
    public final int mo5948c(T t) {
        return this.f17052j ? m7797L(t) : m7796K(t);
    }

    /* JADX INFO: renamed from: d */
    public final int m7807d(int i) {
        return this.f17045c[i + 1];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: e */
    public final int mo5949e(T t) {
        int i;
        int iM8088a;
        int length = this.f17045c.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iM7807d = m7807d(i3);
            int i4 = this.f17045c[i3];
            long j2 = 1048575 & iM7807d;
            int iHashCode = 37;
            switch ((iM7807d >>> 20) & 255) {
                case 0:
                    i = i2 * 53;
                    iM8088a = p82.m8088a(Double.doubleToLongBits(za2.m8865n(t, j2)));
                    i2 = iM8088a + i;
                    break;
                case 1:
                    i = i2 * 53;
                    iM8088a = Float.floatToIntBits(za2.m8863l(t, j2));
                    i2 = iM8088a + i;
                    break;
                case 2:
                    i = i2 * 53;
                    iM8088a = p82.m8088a(za2.m8859h(t, j2));
                    i2 = iM8088a + i;
                    break;
                case 3:
                    i = i2 * 53;
                    iM8088a = p82.m8088a(za2.m8859h(t, j2));
                    i2 = iM8088a + i;
                    break;
                case 4:
                    i = i2 * 53;
                    iM8088a = za2.m8857f(t, j2);
                    i2 = iM8088a + i;
                    break;
                case 5:
                    i = i2 * 53;
                    iM8088a = p82.m8088a(za2.m8859h(t, j2));
                    i2 = iM8088a + i;
                    break;
                case 6:
                    i = i2 * 53;
                    iM8088a = za2.m8857f(t, j2);
                    i2 = iM8088a + i;
                    break;
                case 7:
                    i = i2 * 53;
                    iM8088a = p82.m8089b(za2.m8861j(t, j2));
                    i2 = iM8088a + i;
                    break;
                case 8:
                    i = i2 * 53;
                    iM8088a = ((String) za2.m8867p(t, j2)).hashCode();
                    i2 = iM8088a + i;
                    break;
                case 9:
                    Object objM8867p = za2.m8867p(t, j2);
                    if (objM8867p != null) {
                        iHashCode = objM8867p.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iM8088a = za2.m8867p(t, j2).hashCode();
                    i2 = iM8088a + i;
                    break;
                case 11:
                    i = i2 * 53;
                    iM8088a = za2.m8857f(t, j2);
                    i2 = iM8088a + i;
                    break;
                case 12:
                    i = i2 * 53;
                    iM8088a = za2.m8857f(t, j2);
                    i2 = iM8088a + i;
                    break;
                case 13:
                    i = i2 * 53;
                    iM8088a = za2.m8857f(t, j2);
                    i2 = iM8088a + i;
                    break;
                case 14:
                    i = i2 * 53;
                    iM8088a = p82.m8088a(za2.m8859h(t, j2));
                    i2 = iM8088a + i;
                    break;
                case 15:
                    i = i2 * 53;
                    iM8088a = za2.m8857f(t, j2);
                    i2 = iM8088a + i;
                    break;
                case 16:
                    i = i2 * 53;
                    iM8088a = p82.m8088a(za2.m8859h(t, j2));
                    i2 = iM8088a + i;
                    break;
                case 17:
                    Object objM8867p2 = za2.m8867p(t, j2);
                    if (objM8867p2 != null) {
                        iHashCode = objM8867p2.hashCode();
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
                    iM8088a = za2.m8867p(t, j2).hashCode();
                    i2 = iM8088a + i;
                    break;
                case 50:
                    i = i2 * 53;
                    iM8088a = za2.m8867p(t, j2).hashCode();
                    i2 = iM8088a + i;
                    break;
                case 51:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = p82.m8088a(Double.doubleToLongBits(m7786o(t, j2)));
                        i2 = iM8088a + i;
                    }
                    break;
                case 52:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = Float.floatToIntBits(m7787p(t, j2));
                        i2 = iM8088a + i;
                    }
                    break;
                case 53:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = p82.m8088a(m7789r(t, j2));
                        i2 = iM8088a + i;
                    }
                    break;
                case 54:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = p82.m8088a(m7789r(t, j2));
                        i2 = iM8088a + i;
                    }
                    break;
                case 55:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = m7788q(t, j2);
                        i2 = iM8088a + i;
                    }
                    break;
                case 56:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = p82.m8088a(m7789r(t, j2));
                        i2 = iM8088a + i;
                    }
                    break;
                case 57:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = m7788q(t, j2);
                        i2 = iM8088a + i;
                    }
                    break;
                case 58:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = p82.m8089b(m7790s(t, j2));
                        i2 = iM8088a + i;
                    }
                    break;
                case 59:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = ((String) za2.m8867p(t, j2)).hashCode();
                        i2 = iM8088a + i;
                    }
                    break;
                case 60:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = za2.m8867p(t, j2).hashCode();
                        i2 = iM8088a + i;
                    }
                    break;
                case 61:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = za2.m8867p(t, j2).hashCode();
                        i2 = iM8088a + i;
                    }
                    break;
                case 62:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = m7788q(t, j2);
                        i2 = iM8088a + i;
                    }
                    break;
                case 63:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = m7788q(t, j2);
                        i2 = iM8088a + i;
                    }
                    break;
                case 64:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = m7788q(t, j2);
                        i2 = iM8088a + i;
                    }
                    break;
                case 65:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = p82.m8088a(m7789r(t, j2));
                        i2 = iM8088a + i;
                    }
                    break;
                case 66:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = m7788q(t, j2);
                        i2 = iM8088a + i;
                    }
                    break;
                case 67:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = p82.m8088a(m7789r(t, j2));
                        i2 = iM8088a + i;
                    }
                    break;
                case 68:
                    if (m7813x(t, i4, i3)) {
                        i = i2 * 53;
                        iM8088a = za2.m8867p(t, j2).hashCode();
                        i2 = iM8088a + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f17057o.mo7986j(t).hashCode() + (i2 * 53);
        if (!this.f17050h) {
            return iHashCode2;
        }
        this.f17058p.mo8401b(t);
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: f */
    public final void mo5950f(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f17045c.length; i += 3) {
            int iM7807d = m7807d(i);
            long j2 = 1048575 & iM7807d;
            int i2 = this.f17045c[i];
            switch ((iM7807d >>> 20) & 255) {
                case 0:
                    if (m7811v(t2, i)) {
                        za2.m8866o(t, j2, za2.m8865n(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 1:
                    if (m7811v(t2, i)) {
                        za2.f22222e.mo8620e(t, j2, za2.m8863l(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 2:
                    if (m7811v(t2, i)) {
                        za2.m8860i(t, j2, za2.m8859h(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 3:
                    if (m7811v(t2, i)) {
                        za2.m8860i(t, j2, za2.m8859h(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 4:
                    if (m7811v(t2, i)) {
                        za2.f22222e.m8785l(t, j2, za2.m8857f(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 5:
                    if (m7811v(t2, i)) {
                        za2.m8860i(t, j2, za2.m8859h(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 6:
                    if (m7811v(t2, i)) {
                        za2.f22222e.m8785l(t, j2, za2.m8857f(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 7:
                    if (m7811v(t2, i)) {
                        za2.f22222e.mo8618c(t, j2, za2.m8861j(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 8:
                    if (m7811v(t2, i)) {
                        za2.f22222e.m8789p(t, j2, za2.m8867p(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 9:
                    m7794I(t, t2, i);
                    break;
                case 10:
                    if (m7811v(t2, i)) {
                        za2.f22222e.m8789p(t, j2, za2.m8867p(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 11:
                    if (m7811v(t2, i)) {
                        za2.f22222e.m8785l(t, j2, za2.m8857f(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 12:
                    if (m7811v(t2, i)) {
                        za2.f22222e.m8785l(t, j2, za2.m8857f(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 13:
                    if (m7811v(t2, i)) {
                        za2.f22222e.m8785l(t, j2, za2.m8857f(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 14:
                    if (m7811v(t2, i)) {
                        za2.m8860i(t, j2, za2.m8859h(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 15:
                    if (m7811v(t2, i)) {
                        za2.f22222e.m8785l(t, j2, za2.m8857f(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 16:
                    if (m7811v(t2, i)) {
                        za2.m8860i(t, j2, za2.m8859h(t2, j2));
                        m7812w(t, i);
                    }
                    break;
                case 17:
                    m7794I(t, t2, i);
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
                    this.f17056n.mo5709c(t, t2, j2);
                    break;
                case 50:
                    Class<?> cls = da2.f13197a;
                    za2.f22222e.m8789p(t, j2, h92.m7107c(za2.m8867p(t, j2), za2.m8867p(t2, j2)));
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
                    if (m7813x(t2, i2, i)) {
                        za2.f22222e.m8789p(t, j2, za2.m8867p(t2, j2));
                        m7814y(t, i2, i);
                    }
                    break;
                case 60:
                    m7795J(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m7813x(t2, i2, i)) {
                        za2.f22222e.m8789p(t, j2, za2.m8867p(t2, j2));
                        m7814y(t, i2, i);
                    }
                    break;
                case 68:
                    m7795J(t, t2, i);
                    break;
            }
        }
        oa2<?, ?> oa2Var = this.f17057o;
        Class<?> cls2 = da2.f13197a;
        oa2Var.mo7985i(t, oa2Var.mo7991o(oa2Var.mo7986j(t), oa2Var.mo7986j(t2)));
        if (this.f17050h) {
            this.f17058p.mo8401b(t2);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc A[LOOP:1: B:45:0x00bb->B:50:0x00cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: g */
    public final boolean mo5951g(T t) {
        int i;
        int i2;
        List list;
        ba2 ba2VarM7801P;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.f17054l) {
            int i7 = this.f17053k[i6];
            int i8 = this.f17045c[i7];
            int iM7807d = m7807d(i7);
            int i9 = this.f17045c[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = f17044b.getInt(t, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i4;
                i2 = i5;
            }
            if ((268435456 & iM7807d) != 0 && !m7810u(t, i7, i, i2, i11)) {
                return false;
            }
            int i12 = (iM7807d >>> 20) & 255;
            if (i12 == 9 || i12 == 17) {
                if (m7810u(t, i7, i, i2, i11) && !m7801P(i7).mo5951g(za2.m8867p(t, iM7807d & 1048575))) {
                    return false;
                }
            } else if (i12 == 27) {
                list = (List) za2.m8867p(t, iM7807d & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ba2VarM7801P = m7801P(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!ba2VarM7801P.mo5951g(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i12 == 60 || i12 == 68) {
                if (m7813x(t, i8, i7) && !m7801P(i7).mo5951g(za2.m8867p(t, iM7807d & 1048575))) {
                    return false;
                }
            } else if (i12 == 49) {
                list = (List) za2.m8867p(t, iM7807d & 1048575);
                if (list.isEmpty()) {
                    ba2VarM7801P = m7801P(i7);
                    while (i3 < list.size()) {
                        if (!ba2VarM7801P.mo5951g(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i12 == 50 && !((g92) za2.m8867p(t, iM7807d & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
        if (!this.f17050h) {
            return true;
        }
        this.f17058p.mo8401b(t);
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: h */
    public final void mo5952h(T t) {
        int i;
        int i2 = this.f17054l;
        while (true) {
            i = this.f17055m;
            if (i2 >= i) {
                break;
            }
            long jM7807d = m7807d(this.f17053k[i2]) & 1048575;
            Object objM8867p = za2.m8867p(t, jM7807d);
            if (objM8867p != null) {
                ((g92) objM8867p).f14524g = false;
                za2.f22222e.m8789p(t, jM7807d, objM8867p);
            }
            i2++;
        }
        int length = this.f17053k.length;
        while (i < length) {
            this.f17056n.mo5708b(t, this.f17053k[i]);
            i++;
        }
        this.f17057o.mo7989m(t);
        if (this.f17050h) {
            this.f17058p.mo8403d(t);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: i */
    public final boolean mo5953i(T t, T t2) {
        boolean zM6323a;
        int length = this.f17045c.length;
        for (int i = 0; i < length; i += 3) {
            int iM7807d = m7807d(i);
            long j2 = iM7807d & 1048575;
            switch ((iM7807d >>> 20) & 255) {
                case 0:
                    if (!m7809t(t, t2, i) || Double.doubleToLongBits(za2.m8865n(t, j2)) != Double.doubleToLongBits(za2.m8865n(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!m7809t(t, t2, i) || Float.floatToIntBits(za2.m8863l(t, j2)) != Float.floatToIntBits(za2.m8863l(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!m7809t(t, t2, i) || za2.m8859h(t, j2) != za2.m8859h(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!m7809t(t, t2, i) || za2.m8859h(t, j2) != za2.m8859h(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!m7809t(t, t2, i) || za2.m8857f(t, j2) != za2.m8857f(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!m7809t(t, t2, i) || za2.m8859h(t, j2) != za2.m8859h(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!m7809t(t, t2, i) || za2.m8857f(t, j2) != za2.m8857f(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!m7809t(t, t2, i) || za2.m8861j(t, j2) != za2.m8861j(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!m7809t(t, t2, i) || !da2.m6323a(za2.m8867p(t, j2), za2.m8867p(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!m7809t(t, t2, i) || !da2.m6323a(za2.m8867p(t, j2), za2.m8867p(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!m7809t(t, t2, i) || !da2.m6323a(za2.m8867p(t, j2), za2.m8867p(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!m7809t(t, t2, i) || za2.m8857f(t, j2) != za2.m8857f(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!m7809t(t, t2, i) || za2.m8857f(t, j2) != za2.m8857f(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!m7809t(t, t2, i) || za2.m8857f(t, j2) != za2.m8857f(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!m7809t(t, t2, i) || za2.m8859h(t, j2) != za2.m8859h(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!m7809t(t, t2, i) || za2.m8857f(t, j2) != za2.m8857f(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!m7809t(t, t2, i) || za2.m8859h(t, j2) != za2.m8859h(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!m7809t(t, t2, i) || !da2.m6323a(za2.m8867p(t, j2), za2.m8867p(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zM6323a = da2.m6323a(za2.m8867p(t, j2), za2.m8867p(t2, j2));
                    break;
                case 50:
                    zM6323a = da2.m6323a(za2.m8867p(t, j2), za2.m8867p(t2, j2));
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
                    long jM7808m = m7808m(i) & 1048575;
                    if (za2.m8857f(t, jM7808m) != za2.m8857f(t2, jM7808m) || !da2.m6323a(za2.m8867p(t, j2), za2.m8867p(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zM6323a) {
                return false;
            }
        }
        if (!this.f17057o.mo7986j(t).equals(this.f17057o.mo7986j(t2))) {
            return false;
        }
        if (!this.f17050h) {
            return true;
        }
        this.f17058p.mo8401b(t);
        this.f17058p.mo8401b(t2);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: j */
    public final void mo5954j(T t, k72 k72Var, s72 s72Var) throws IOException {
        Objects.requireNonNull(s72Var);
        oa2<?, ?> oa2Var = this.f17057o;
        t72<?> t72Var = this.f17058p;
        x72 x72VarMo8402c = null;
        Object objMo8404e = null;
        while (true) {
            try {
                int iM7483v = k72Var.m7483v();
                int iM7815z = m7815z(iM7483v);
                if (iM7815z >= 0) {
                    int iM7807d = m7807d(iM7815z);
                    switch ((iM7807d >>> 20) & 255) {
                        case 0:
                            k72Var.m7479p(1);
                            za2.m8866o(t, iM7807d & 1048575, k72Var.f15896a.mo7082i());
                            m7812w(t, iM7815z);
                            break;
                        case 1:
                            k72Var.m7479p(5);
                            za2.m8864m(t, iM7807d & 1048575, k72Var.f15896a.mo7083j());
                            m7812w(t, iM7815z);
                            break;
                        case 2:
                            za2.m8860i(t, iM7807d & 1048575, k72Var.m7447A());
                            m7812w(t, iM7815z);
                            break;
                        case 3:
                            k72Var.m7479p(0);
                            za2.m8860i(t, iM7807d & 1048575, k72Var.f15896a.mo7084k());
                            m7812w(t, iM7815z);
                            break;
                        case 4:
                            k72Var.m7479p(0);
                            za2.m8858g(t, iM7807d & 1048575, k72Var.f15896a.mo7086m());
                            m7812w(t, iM7815z);
                            break;
                        case 5:
                            za2.m8860i(t, iM7807d & 1048575, k72Var.m7449C());
                            m7812w(t, iM7815z);
                            break;
                        case 6:
                            za2.m8858g(t, iM7807d & 1048575, k72Var.m7450D());
                            m7812w(t, iM7815z);
                            break;
                        case 7:
                            k72Var.m7479p(0);
                            za2.m8862k(t, iM7807d & 1048575, k72Var.f15896a.mo7089p());
                            m7812w(t, iM7815z);
                            break;
                        case 8:
                            m7806b(t, iM7807d, k72Var);
                            m7812w(t, iM7815z);
                            break;
                        case 9:
                            if (m7811v(t, iM7815z)) {
                                long j2 = iM7807d & 1048575;
                                za2.m8868q(t, j2, p82.m8090c(za2.m8867p(t, j2), k72Var.m7452F(m7801P(iM7815z), s72Var)));
                            } else {
                                za2.m8868q(t, iM7807d & 1048575, k72Var.m7452F(m7801P(iM7815z), s72Var));
                                m7812w(t, iM7815z);
                            }
                            break;
                        case 10:
                            za2.m8868q(t, iM7807d & 1048575, k72Var.m7454H());
                            m7812w(t, iM7815z);
                            break;
                        case 11:
                            za2.m8858g(t, iM7807d & 1048575, k72Var.m7455I());
                            m7812w(t, iM7815z);
                            break;
                        case 12:
                            k72Var.m7479p(0);
                            int iMo7094u = k72Var.f15896a.mo7094u();
                            j82 j82VarM7803R = m7803R(iM7815z);
                            if (j82VarM7803R == null || j82VarM7803R.mo5728b(iMo7094u)) {
                                za2.m8858g(t, iM7807d & 1048575, iMo7094u);
                                m7812w(t, iM7815z);
                            } else {
                                objMo8404e = da2.m6325c(iM7483v, iMo7094u, objMo8404e, oa2Var);
                            }
                            break;
                        case 13:
                            k72Var.m7479p(5);
                            za2.m8858g(t, iM7807d & 1048575, k72Var.f15896a.mo7095v());
                            m7812w(t, iM7815z);
                            break;
                        case 14:
                            za2.m8860i(t, iM7807d & 1048575, k72Var.m7458L());
                            m7812w(t, iM7815z);
                            break;
                        case 15:
                            za2.m8858g(t, iM7807d & 1048575, k72Var.m7459M());
                            m7812w(t, iM7815z);
                            break;
                        case 16:
                            za2.m8860i(t, iM7807d & 1048575, k72Var.m7460N());
                            m7812w(t, iM7815z);
                            break;
                        case 17:
                            if (m7811v(t, iM7815z)) {
                                long j3 = iM7807d & 1048575;
                                za2.m8868q(t, j3, p82.m8090c(za2.m8867p(t, j3), k72Var.m7453G(m7801P(iM7815z), s72Var)));
                            } else {
                                za2.m8868q(t, iM7807d & 1048575, k72Var.m7453G(m7801P(iM7815z), s72Var));
                                m7812w(t, iM7815z);
                            }
                            break;
                        case 18:
                            k72Var.m7461O(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 19:
                            k72Var.m7462P(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 20:
                            k72Var.m7464a(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 21:
                            k72Var.m7463Q(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 22:
                            k72Var.m7465b(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 23:
                            k72Var.m7466c(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 24:
                            k72Var.m7467d(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 25:
                            k72Var.m7468e(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 26:
                            if (m7785n(iM7807d)) {
                                k72Var.m7469f(this.f17056n.mo5707a(t, iM7807d & 1048575), true);
                            } else {
                                k72Var.m7469f(this.f17056n.mo5707a(t, iM7807d & 1048575), false);
                            }
                            break;
                        case 27:
                            k72Var.m7470g(this.f17056n.mo5707a(t, iM7807d & 1048575), m7801P(iM7815z), s72Var);
                            break;
                        case 28:
                            k72Var.m7472i(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 29:
                            k72Var.m7473j(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 30:
                            List<Integer> listMo5707a = this.f17056n.mo5707a(t, iM7807d & 1048575);
                            k72Var.m7474k(listMo5707a);
                            objMo8404e = da2.m6324b(iM7483v, listMo5707a, m7803R(iM7815z), objMo8404e, oa2Var);
                            break;
                        case 31:
                            k72Var.m7475l(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 32:
                            k72Var.m7476m(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 33:
                            k72Var.m7477n(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 34:
                            k72Var.m7478o(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 35:
                            k72Var.m7461O(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 36:
                            k72Var.m7462P(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 37:
                            k72Var.m7464a(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 38:
                            k72Var.m7463Q(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 39:
                            k72Var.m7465b(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 40:
                            k72Var.m7466c(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 41:
                            k72Var.m7467d(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 42:
                            k72Var.m7468e(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 43:
                            k72Var.m7473j(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 44:
                            List<Integer> listMo5707a2 = this.f17056n.mo5707a(t, iM7807d & 1048575);
                            k72Var.m7474k(listMo5707a2);
                            objMo8404e = da2.m6324b(iM7483v, listMo5707a2, m7803R(iM7815z), objMo8404e, oa2Var);
                            break;
                        case 45:
                            k72Var.m7475l(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 46:
                            k72Var.m7476m(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 47:
                            k72Var.m7477n(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 48:
                            k72Var.m7478o(this.f17056n.mo5707a(t, iM7807d & 1048575));
                            break;
                        case 49:
                            k72Var.m7471h(this.f17056n.mo5707a(t, iM7807d & 1048575), m7801P(iM7815z), s72Var);
                            break;
                        case 50:
                            Object objM7802Q = m7802Q(iM7815z);
                            long jM7807d = m7807d(iM7815z) & 1048575;
                            Object objM8867p = za2.m8867p(t, jM7807d);
                            if (objM8867p == null) {
                                objM8867p = g92.f14523f.m6980b();
                                za2.m8868q(t, jM7807d, objM8867p);
                            } else if (h92.m7106b(objM8867p)) {
                                Object objM6980b = g92.m6978a().m6980b();
                                h92.m7107c(objM6980b, objM8867p);
                                za2.m8868q(t, jM7807d, objM6980b);
                                objM8867p = objM6980b;
                            }
                            throw null;
                        case 51:
                            za2.m8868q(t, iM7807d & 1048575, Double.valueOf(k72Var.m7485x()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 52:
                            za2.m8868q(t, iM7807d & 1048575, Float.valueOf(k72Var.m7486y()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 53:
                            za2.m8868q(t, iM7807d & 1048575, Long.valueOf(k72Var.m7447A()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 54:
                            za2.m8868q(t, iM7807d & 1048575, Long.valueOf(k72Var.m7487z()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 55:
                            za2.m8868q(t, iM7807d & 1048575, Integer.valueOf(k72Var.m7448B()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 56:
                            za2.m8868q(t, iM7807d & 1048575, Long.valueOf(k72Var.m7449C()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 57:
                            za2.m8868q(t, iM7807d & 1048575, Integer.valueOf(k72Var.m7450D()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 58:
                            za2.m8868q(t, iM7807d & 1048575, Boolean.valueOf(k72Var.m7451E()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 59:
                            m7806b(t, iM7807d, k72Var);
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 60:
                            if (m7813x(t, iM7483v, iM7815z)) {
                                long j4 = iM7807d & 1048575;
                                za2.m8868q(t, j4, p82.m8090c(za2.m8867p(t, j4), k72Var.m7452F(m7801P(iM7815z), s72Var)));
                            } else {
                                za2.m8868q(t, iM7807d & 1048575, k72Var.m7452F(m7801P(iM7815z), s72Var));
                                m7812w(t, iM7815z);
                            }
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 61:
                            za2.m8868q(t, iM7807d & 1048575, k72Var.m7454H());
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 62:
                            za2.m8868q(t, iM7807d & 1048575, Integer.valueOf(k72Var.m7455I()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 63:
                            int iM7456J = k72Var.m7456J();
                            j82 j82VarM7803R2 = m7803R(iM7815z);
                            if (j82VarM7803R2 == null || j82VarM7803R2.mo5728b(iM7456J)) {
                                za2.m8868q(t, iM7807d & 1048575, Integer.valueOf(iM7456J));
                                m7814y(t, iM7483v, iM7815z);
                            } else {
                                objMo8404e = da2.m6325c(iM7483v, iM7456J, objMo8404e, oa2Var);
                            }
                            break;
                        case 64:
                            za2.m8868q(t, iM7807d & 1048575, Integer.valueOf(k72Var.m7457K()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 65:
                            za2.m8868q(t, iM7807d & 1048575, Long.valueOf(k72Var.m7458L()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 66:
                            za2.m8868q(t, iM7807d & 1048575, Integer.valueOf(k72Var.m7459M()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 67:
                            za2.m8868q(t, iM7807d & 1048575, Long.valueOf(k72Var.m7460N()));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        case 68:
                            za2.m8868q(t, iM7807d & 1048575, k72Var.m7453G(m7801P(iM7815z), s72Var));
                            m7814y(t, iM7483v, iM7815z);
                            break;
                        default:
                            if (objMo8404e == null) {
                                try {
                                    objMo8404e = oa2Var.mo7983g();
                                } catch (q82 unused) {
                                    oa2Var.mo7977a(k72Var);
                                    if (objMo8404e == null) {
                                        objMo8404e = oa2Var.mo7987k(t);
                                    }
                                    if (!oa2Var.m7990n(objMo8404e, k72Var)) {
                                        for (int i = this.f17054l; i < this.f17055m; i++) {
                                            m7805a(t, this.f17053k[i], objMo8404e);
                                        }
                                        if (objMo8404e != null) {
                                            oa2Var.mo7988l(t, objMo8404e);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                break;
                            }
                            if (!oa2Var.m7990n(objMo8404e, k72Var)) {
                                for (int i2 = this.f17054l; i2 < this.f17055m; i2++) {
                                    m7805a(t, this.f17053k[i2], objMo8404e);
                                }
                                oa2Var.mo7988l(t, objMo8404e);
                                return;
                            }
                            break;
                            break;
                    }
                } else {
                    if (iM7483v == Integer.MAX_VALUE) {
                        for (int i3 = this.f17054l; i3 < this.f17055m; i3++) {
                            m7805a(t, this.f17053k[i3], objMo8404e);
                        }
                        if (objMo8404e != null) {
                            oa2Var.mo7988l(t, objMo8404e);
                            return;
                        }
                        return;
                    }
                    Object objMo8405f = !this.f17050h ? null : t72Var.mo8405f(s72Var, this.f17049g, iM7483v);
                    if (objMo8405f != null) {
                        if (x72VarMo8402c == null) {
                            x72VarMo8402c = t72Var.mo8402c(t);
                        }
                        x72 x72Var = x72VarMo8402c;
                        objMo8404e = t72Var.mo8404e(k72Var, objMo8405f, s72Var, x72Var, objMo8404e, oa2Var);
                        x72VarMo8402c = x72Var;
                    } else {
                        oa2Var.mo7977a(k72Var);
                        if (objMo8404e == null) {
                            objMo8404e = oa2Var.mo7987k(t);
                        }
                        if (!oa2Var.m7990n(objMo8404e, k72Var)) {
                            for (int i4 = this.f17054l; i4 < this.f17055m; i4++) {
                                m7805a(t, this.f17053k[i4], objMo8404e);
                            }
                            if (objMo8404e != null) {
                                oa2Var.mo7988l(t, objMo8404e);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.f17054l; i5 < this.f17055m; i5++) {
                    m7805a(t, this.f17053k[i5], objMo8404e);
                }
                if (objMo8404e != null) {
                    oa2Var.mo7988l(t, objMo8404e);
                }
                throw th;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: k */
    public final void mo5955k(T t, p72 p72Var) throws IOException {
        if (!this.f17052j) {
            m7792B(t, p72Var);
            return;
        }
        if (this.f17050h) {
            this.f17058p.mo8401b(t);
            throw null;
        }
        int length = this.f17045c.length;
        for (int i = 0; i < length; i += 3) {
            int iM7807d = m7807d(i);
            int[] iArr = this.f17045c;
            int i2 = iArr[i];
            switch ((iM7807d >>> 20) & 255) {
                case 0:
                    if (m7811v(t, i)) {
                        p72Var.m8082b(i2, za2.m8865n(t, iM7807d & 1048575));
                    }
                    break;
                case 1:
                    if (m7811v(t, i)) {
                        p72Var.m8081a(i2, za2.m8863l(t, iM7807d & 1048575));
                    }
                    break;
                case 2:
                    if (m7811v(t, i)) {
                        p72Var.f17875a.mo7665h(i2, za2.m8859h(t, iM7807d & 1048575));
                    }
                    break;
                case 3:
                    if (m7811v(t, i)) {
                        p72Var.f17875a.mo7665h(i2, za2.m8859h(t, iM7807d & 1048575));
                    }
                    break;
                case 4:
                    if (m7811v(t, i)) {
                        p72Var.f17875a.mo7662e(i2, za2.m8857f(t, iM7807d & 1048575));
                    }
                    break;
                case 5:
                    if (m7811v(t, i)) {
                        p72Var.f17875a.mo7666i(i2, za2.m8859h(t, iM7807d & 1048575));
                    }
                    break;
                case 6:
                    if (m7811v(t, i)) {
                        p72Var.f17875a.mo7664g(i2, za2.m8857f(t, iM7807d & 1048575));
                    }
                    break;
                case 7:
                    if (m7811v(t, i)) {
                        p72Var.f17875a.mo7667j(i2, za2.m8861j(t, iM7807d & 1048575));
                    }
                    break;
                case 8:
                    if (m7811v(t, i)) {
                        m7780C(i2, za2.m8867p(t, iM7807d & 1048575), p72Var);
                    }
                    break;
                case 9:
                    if (m7811v(t, i)) {
                        p72Var.m8085e(i2, za2.m8867p(t, iM7807d & 1048575), m7801P(i));
                    }
                    break;
                case 10:
                    if (m7811v(t, i)) {
                        p72Var.f17875a.mo7669l(i2, (g72) za2.m8867p(t, iM7807d & 1048575));
                    }
                    break;
                case 11:
                    if (m7811v(t, i)) {
                        p72Var.f17875a.mo7663f(i2, za2.m8857f(t, iM7807d & 1048575));
                    }
                    break;
                case 12:
                    if (m7811v(t, i)) {
                        p72Var.f17875a.mo7662e(i2, za2.m8857f(t, iM7807d & 1048575));
                    }
                    break;
                case 13:
                    if (m7811v(t, i)) {
                        p72Var.f17875a.mo7664g(i2, za2.m8857f(t, iM7807d & 1048575));
                    }
                    break;
                case 14:
                    if (m7811v(t, i)) {
                        p72Var.f17875a.mo7666i(i2, za2.m8859h(t, iM7807d & 1048575));
                    }
                    break;
                case 15:
                    if (m7811v(t, i)) {
                        p72Var.m8083c(i2, za2.m8857f(t, iM7807d & 1048575));
                    }
                    break;
                case 16:
                    if (m7811v(t, i)) {
                        p72Var.m8084d(i2, za2.m8859h(t, iM7807d & 1048575));
                    }
                    break;
                case 17:
                    if (m7811v(t, i)) {
                        p72Var.m8086f(i2, za2.m8867p(t, iM7807d & 1048575), m7801P(i));
                    }
                    break;
                case 18:
                    da2.m6326d(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 19:
                    da2.m6327e(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 20:
                    da2.m6328f(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 21:
                    da2.m6329g(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 22:
                    da2.m6333k(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 23:
                    da2.m6331i(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 24:
                    da2.m6336n(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 25:
                    da2.m6339q(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 26:
                    da2.m6340r(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var);
                    break;
                case 27:
                    da2.m6342t(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, m7801P(i));
                    break;
                case 28:
                    da2.m6341s(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var);
                    break;
                case 29:
                    da2.m6334l(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 30:
                    da2.m6338p(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 31:
                    da2.m6337o(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 32:
                    da2.m6332j(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 33:
                    da2.m6335m(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 34:
                    da2.m6330h(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, false);
                    break;
                case 35:
                    da2.m6326d(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 36:
                    da2.m6327e(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 37:
                    da2.m6328f(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 38:
                    da2.m6329g(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 39:
                    da2.m6333k(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 40:
                    da2.m6331i(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 41:
                    da2.m6336n(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 42:
                    da2.m6339q(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 43:
                    da2.m6334l(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 44:
                    da2.m6338p(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 45:
                    da2.m6337o(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 46:
                    da2.m6332j(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 47:
                    da2.m6335m(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 48:
                    da2.m6330h(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, true);
                    break;
                case 49:
                    da2.m6343u(iArr[i], (List) za2.m8867p(t, iM7807d & 1048575), p72Var, m7801P(i));
                    break;
                case 50:
                    if (za2.m8867p(t, iM7807d & 1048575) != null) {
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (m7813x(t, i2, i)) {
                        p72Var.m8082b(i2, m7786o(t, iM7807d & 1048575));
                    }
                    break;
                case 52:
                    if (m7813x(t, i2, i)) {
                        p72Var.m8081a(i2, m7787p(t, iM7807d & 1048575));
                    }
                    break;
                case 53:
                    if (m7813x(t, i2, i)) {
                        p72Var.f17875a.mo7665h(i2, m7789r(t, iM7807d & 1048575));
                    }
                    break;
                case 54:
                    if (m7813x(t, i2, i)) {
                        p72Var.f17875a.mo7665h(i2, m7789r(t, iM7807d & 1048575));
                    }
                    break;
                case 55:
                    if (m7813x(t, i2, i)) {
                        p72Var.f17875a.mo7662e(i2, m7788q(t, iM7807d & 1048575));
                    }
                    break;
                case 56:
                    if (m7813x(t, i2, i)) {
                        p72Var.f17875a.mo7666i(i2, m7789r(t, iM7807d & 1048575));
                    }
                    break;
                case 57:
                    if (m7813x(t, i2, i)) {
                        p72Var.f17875a.mo7664g(i2, m7788q(t, iM7807d & 1048575));
                    }
                    break;
                case 58:
                    if (m7813x(t, i2, i)) {
                        p72Var.f17875a.mo7667j(i2, m7790s(t, iM7807d & 1048575));
                    }
                    break;
                case 59:
                    if (m7813x(t, i2, i)) {
                        m7780C(i2, za2.m8867p(t, iM7807d & 1048575), p72Var);
                    }
                    break;
                case 60:
                    if (m7813x(t, i2, i)) {
                        p72Var.m8085e(i2, za2.m8867p(t, iM7807d & 1048575), m7801P(i));
                    }
                    break;
                case 61:
                    if (m7813x(t, i2, i)) {
                        p72Var.f17875a.mo7669l(i2, (g72) za2.m8867p(t, iM7807d & 1048575));
                    }
                    break;
                case 62:
                    if (m7813x(t, i2, i)) {
                        p72Var.f17875a.mo7663f(i2, m7788q(t, iM7807d & 1048575));
                    }
                    break;
                case 63:
                    if (m7813x(t, i2, i)) {
                        p72Var.f17875a.mo7662e(i2, m7788q(t, iM7807d & 1048575));
                    }
                    break;
                case 64:
                    if (m7813x(t, i2, i)) {
                        p72Var.f17875a.mo7664g(i2, m7788q(t, iM7807d & 1048575));
                    }
                    break;
                case 65:
                    if (m7813x(t, i2, i)) {
                        p72Var.f17875a.mo7666i(i2, m7789r(t, iM7807d & 1048575));
                    }
                    break;
                case 66:
                    if (m7813x(t, i2, i)) {
                        p72Var.m8083c(i2, m7788q(t, iM7807d & 1048575));
                    }
                    break;
                case 67:
                    if (m7813x(t, i2, i)) {
                        p72Var.m8084d(i2, m7789r(t, iM7807d & 1048575));
                    }
                    break;
                case 68:
                    if (m7813x(t, i2, i)) {
                        p72Var.m8086f(i2, za2.m8867p(t, iM7807d & 1048575), m7801P(i));
                    }
                    break;
            }
        }
        oa2<?, ?> oa2Var = this.f17057o;
        oa2Var.mo7994r(oa2Var.mo7986j(t), p72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: l */
    public final void mo5956l(T t, byte[] bArr, int i, int i2, w62 w62Var) throws IOException {
        if (this.f17052j) {
            m7804S(t, bArr, i, i2, w62Var);
        } else {
            m7793E(t, bArr, i, i2, 0, w62Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m7808m(int i) {
        return this.f17045c[i + 2];
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7809t(T t, T t2, int i) {
        return m7811v(t, i) == m7811v(t2, i);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7810u(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m7811v(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m7811v(T t, int i) {
        int[] iArr = this.f17045c;
        int i2 = iArr[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            return (za2.m8857f(t, j2) & (1 << (i2 >>> 20))) != 0;
        }
        int i3 = iArr[i + 1];
        long j3 = i3 & 1048575;
        switch ((i3 >>> 20) & 255) {
            case 0:
                return za2.m8865n(t, j3) != 0.0d;
            case 1:
                return za2.m8863l(t, j3) != 0.0f;
            case 2:
                return za2.m8859h(t, j3) != 0;
            case 3:
                return za2.m8859h(t, j3) != 0;
            case 4:
                return za2.m8857f(t, j3) != 0;
            case 5:
                return za2.m8859h(t, j3) != 0;
            case 6:
                return za2.m8857f(t, j3) != 0;
            case 7:
                return za2.m8861j(t, j3);
            case 8:
                Object objM8867p = za2.m8867p(t, j3);
                if (objM8867p instanceof String) {
                    return !((String) objM8867p).isEmpty();
                }
                if (objM8867p instanceof g72) {
                    return !g72.f14513f.equals(objM8867p);
                }
                throw new IllegalArgumentException();
            case 9:
                return za2.m8867p(t, j3) != null;
            case 10:
                return !g72.f14513f.equals(za2.m8867p(t, j3));
            case 11:
                return za2.m8857f(t, j3) != 0;
            case 12:
                return za2.m8857f(t, j3) != 0;
            case 13:
                return za2.m8857f(t, j3) != 0;
            case 14:
                return za2.m8859h(t, j3) != 0;
            case 15:
                return za2.m8857f(t, j3) != 0;
            case 16:
                return za2.m8859h(t, j3) != 0;
            case 17:
                return za2.m8867p(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m7812w(T t, int i) {
        int i2 = this.f17045c[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        za2.f22222e.m8785l(t, j2, (1 << (i2 >>> 20)) | za2.m8857f(t, j2));
    }

    /* JADX INFO: renamed from: x */
    public final boolean m7813x(T t, int i, int i2) {
        return za2.m8857f(t, (long) (this.f17045c[i2 + 2] & 1048575)) == i;
    }

    /* JADX INFO: renamed from: y */
    public final void m7814y(T t, int i, int i2) {
        za2.f22222e.m8785l(t, this.f17045c[i2 + 2] & 1048575, i);
    }

    /* JADX INFO: renamed from: z */
    public final int m7815z(int i) {
        if (i < this.f17047e || i > this.f17048f) {
            return -1;
        }
        return m7791A(i, 0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    public final T zza() {
        return (T) ((g82) this.f17049g).mo5663u(4, null, null);
    }
}
