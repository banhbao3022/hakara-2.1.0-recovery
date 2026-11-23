package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gt1<K, V> extends vs1<K, V> {

    /* JADX INFO: renamed from: i */
    public static final vs1<Object, Object> f14676i = new gt1(null, new Object[0], 0);

    /* JADX INFO: renamed from: j */
    public final transient Object f14677j;

    /* JADX INFO: renamed from: k */
    public final transient Object[] f14678k;

    /* JADX INFO: renamed from: l */
    public final transient int f14679l;

    public gt1(Object obj, Object[] objArr, int i) {
        this.f14677j = obj;
        this.f14678k = objArr;
        this.f14679l = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* JADX INFO: renamed from: e */
    public static <K, V> gt1<K, V> m7029e(int i, Object[] objArr) {
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            return (gt1) f14676i;
        }
        ?? r0 = 0;
        int i5 = 0;
        if (i == 1) {
            C2622l.m5336Z0(objArr[0], objArr[1]);
            return new gt1<>(null, objArr, 1);
        }
        C2622l.m5338Z2(i, objArr.length >> 1, "index");
        int iM8752u = xs1.m8752u(i);
        if (i == 1) {
            C2622l.m5336Z0(objArr[0], objArr[1]);
        } else {
            int i6 = iM8752u - 1;
            if (iM8752u <= 128) {
                bArr = new byte[iM8752u];
                Arrays.fill(bArr, (byte) -1);
                while (i5 < i) {
                    int i7 = i5 + i5;
                    Object obj = objArr[i7];
                    Object obj2 = objArr[i7 ^ 1];
                    C2622l.m5336Z0(obj, obj2);
                    int iM5466z1 = C2622l.m5466z1(obj.hashCode());
                    while (true) {
                        i4 = iM5466z1 & i6;
                        int i8 = bArr[i4] & 255;
                        if (i8 == 255) {
                            break;
                        }
                        if (objArr[i8].equals(obj)) {
                            throw m7030f(obj, obj2, objArr, i8);
                        }
                        iM5466z1 = i4 + 1;
                    }
                    bArr[i4] = (byte) i7;
                    i5++;
                }
            } else if (iM8752u <= 32768) {
                bArr = new short[iM8752u];
                Arrays.fill(bArr, (short) -1);
                while (i5 < i) {
                    int i9 = i5 + i5;
                    Object obj3 = objArr[i9];
                    Object obj4 = objArr[i9 ^ 1];
                    C2622l.m5336Z0(obj3, obj4);
                    int iM5466z2 = C2622l.m5466z1(obj3.hashCode());
                    while (true) {
                        i3 = iM5466z2 & i6;
                        char c2 = (char) bArr[i3];
                        if (c2 == 65535) {
                            break;
                        }
                        if (objArr[c2].equals(obj3)) {
                            throw m7030f(obj3, obj4, objArr, c2);
                        }
                        iM5466z2 = i3 + 1;
                    }
                    bArr[i3] = (short) i9;
                    i5++;
                }
            } else {
                bArr = new int[iM8752u];
                Arrays.fill((int[]) bArr, -1);
                while (i5 < i) {
                    int i10 = i5 + i5;
                    Object obj5 = objArr[i10];
                    Object obj6 = objArr[i10 ^ 1];
                    C2622l.m5336Z0(obj5, obj6);
                    int iM5466z3 = C2622l.m5466z1(obj5.hashCode());
                    while (true) {
                        i2 = iM5466z3 & i6;
                        ?? r8 = bArr[i2];
                        if (r8 == -1) {
                            break;
                        }
                        if (objArr[r8].equals(obj5)) {
                            throw m7030f(obj5, obj6, objArr, r8);
                        }
                        iM5466z3 = i2 + 1;
                    }
                    bArr[i2] = i10;
                    i5++;
                }
            }
            r0 = bArr;
        }
        return new gt1<>(r0, objArr, i);
    }

    /* JADX INFO: renamed from: f */
    public static IllegalArgumentException m7030f(Object obj, Object obj2, Object[] objArr, int i) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(objArr[i]);
        String strValueOf4 = String.valueOf(objArr[i ^ 1]);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + strValueOf3.length() + strValueOf4.length());
        outline.m1572W(sb, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
        return new IllegalArgumentException(outline.m1553D(sb, " and ", strValueOf3, "=", strValueOf4));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.vs1, java.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.f14677j;
        Object[] objArr = this.f14678k;
        int i = this.f14679l;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        }
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int iM5466z1 = C2622l.m5466z1(obj.hashCode());
            while (true) {
                int i2 = iM5466z1 & length;
                int i3 = bArr[i2] & 255;
                if (i3 == 255) {
                    return null;
                }
                if (objArr[i3].equals(obj)) {
                    return (V) objArr[i3 ^ 1];
                }
                iM5466z1 = i2 + 1;
            }
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int iM5466z2 = C2622l.m5466z1(obj.hashCode());
            while (true) {
                int i4 = iM5466z2 & length2;
                char c2 = (char) sArr[i4];
                if (c2 == 65535) {
                    return null;
                }
                if (objArr[c2].equals(obj)) {
                    return (V) objArr[c2 ^ 1];
                }
                iM5466z2 = i4 + 1;
            }
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int iM5466z3 = C2622l.m5466z1(obj.hashCode());
            while (true) {
                int i5 = iM5466z3 & length3;
                int i6 = iArr[i5];
                if (i6 == -1) {
                    return null;
                }
                if (objArr[i6].equals(obj)) {
                    return (V) objArr[i6 ^ 1];
                }
                iM5466z3 = i5 + 1;
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f14679l;
    }
}
