package p524h1;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.Charsets2;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s._ArraysJvm;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p524h1.p525b0.ByteString2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: h1.j, reason: use source file name */
/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ByteString3 implements Serializable, Comparable<ByteString3> {

    /* JADX INFO: renamed from: h */
    public transient int f30713h;

    /* JADX INFO: renamed from: i */
    public transient String f30714i;

    /* JADX INFO: renamed from: j */
    public final byte[] f30715j;

    /* JADX INFO: renamed from: g */
    public static final a f30712g = new a(null);

    /* JADX INFO: renamed from: f */
    public static final ByteString3 f30711f = new ByteString3(new byte[0]);

    /* JADX INFO: renamed from: h1.j$a */
    /* JADX INFO: compiled from: ByteString.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: d */
        public static ByteString3 m13774d(a aVar, byte[] bArr, int i, int i2, int i3) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            Objects.requireNonNull(aVar);
            Intrinsics2.m13090f(bArr, "$this$toByteString");
            SkuDao.a.m14085f(bArr.length, i, i2);
            return new ByteString3(_ArraysJvm.m13031e(bArr, i, i2 + i));
        }

        /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        public final ByteString3 m13775a(String str) {
            int i;
            int i2;
            char cCharAt;
            Intrinsics2.m13090f(str, "$this$decodeBase64");
            byte[] bArr = C6457a.f30689a;
            Intrinsics2.m13090f(str, "$this$decodeBase64ToArray");
            int length = str.length();
            while (length > 0 && ((cCharAt = str.charAt((i2 = length - 1))) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                length = i2;
            }
            int i3 = (int) ((((long) length) * 6) / 8);
            byte[] bArrCopyOf = new byte[i3];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i4 >= length) {
                    int i8 = i5 % 4;
                    if (i8 != 1) {
                        if (i8 == 2) {
                            bArrCopyOf[i7] = (byte) ((i6 << 12) >> 16);
                            i7++;
                        } else if (i8 == 3) {
                            int i9 = i6 << 6;
                            int i10 = i7 + 1;
                            bArrCopyOf[i7] = (byte) (i9 >> 16);
                            i7 = i10 + 1;
                            bArrCopyOf[i10] = (byte) (i9 >> 8);
                        }
                        if (i7 != i3) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                            Intrinsics2.m13086b(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
                        }
                    }
                    if (bArrCopyOf != null) {
                        return new ByteString3(bArrCopyOf);
                    }
                    return null;
                }
                char cCharAt2 = str.charAt(i4);
                if ('A' <= cCharAt2 && 'Z' >= cCharAt2) {
                    i = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && 'z' >= cCharAt2) {
                    i = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && '9' >= cCharAt2) {
                    i = cCharAt2 + 4;
                } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                    i = 62;
                } else {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                    } else {
                        i = 63;
                    }
                    i4++;
                }
                i6 = (i6 << 6) | i;
                i5++;
                if (i5 % 4 == 0) {
                    int i11 = i7 + 1;
                    bArrCopyOf[i7] = (byte) (i6 >> 16);
                    int i12 = i11 + 1;
                    bArrCopyOf[i11] = (byte) (i6 >> 8);
                    bArrCopyOf[i12] = (byte) i6;
                    i7 = i12 + 1;
                }
                i4++;
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new ByteString3(bArrCopyOf);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final ByteString3 m13776b(String str) {
            Intrinsics2.m13090f(str, "$this$decodeHex");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(outline.m1599u("Unexpected hex string: ", str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (ByteString2.m13708a(str.charAt(i2 + 1)) + (ByteString2.m13708a(str.charAt(i2)) << 4));
            }
            return new ByteString3(bArr);
        }

        /* JADX INFO: renamed from: c */
        public final ByteString3 m13777c(String str) {
            Intrinsics2.m13090f(str, "$this$encodeUtf8");
            Intrinsics2.m13090f(str, "$this$asUtf8ToByteArray");
            byte[] bytes = str.getBytes(Charsets2.f29452a);
            Intrinsics2.m13086b(bytes, "(this as java.lang.String).getBytes(charset)");
            ByteString3 byteString3 = new ByteString3(bytes);
            byteString3.f30714i = str;
            return byteString3;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ByteString3(byte[] bArr) {
        Intrinsics2.m13090f(bArr, "data");
        this.f30715j = bArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = objectInputStream.readInt();
        Objects.requireNonNull(f30712g);
        Intrinsics2.m13090f(objectInputStream, "$this$readByteString");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(outline.m1590l("byteCount < 0: ", i).toString());
        }
        byte[] bArr = new byte[i];
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        ByteString3 byteString3 = new ByteString3(bArr);
        Field declaredField = ByteString3.class.getDeclaredField("j");
        Intrinsics2.m13086b(declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString3.f30715j);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f30715j.length);
        objectOutputStream.write(this.f30715j);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    public int compareTo(ByteString3 byteString3) {
        ByteString3 byteString4 = byteString3;
        Intrinsics2.m13090f(byteString4, "other");
        int iMo13765j = mo13765j();
        int iMo13765j2 = byteString4.mo13765j();
        int iMin = Math.min(iMo13765j, iMo13765j2);
        for (int i = 0; i < iMin; i++) {
            int iMo13768q = mo13768q(i) & 255;
            int iMo13768q2 = byteString4.mo13768q(i) & 255;
            if (iMo13768q != iMo13768q2) {
                if (iMo13768q < iMo13768q2) {
                    return -1;
                }
                return 1;
            }
        }
        if (iMo13765j == iMo13765j2) {
            return 0;
        }
        if (iMo13765j < iMo13765j2) {
            return -1;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString3) {
            ByteString3 byteString3 = (ByteString3) obj;
            int iMo13765j = byteString3.mo13765j();
            byte[] bArr = this.f30715j;
            if (iMo13765j == bArr.length && byteString3.mo13770u(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public String mo13763f() {
        byte[] bArr = this.f30715j;
        byte[] bArr2 = C6457a.f30689a;
        byte[] bArr3 = C6457a.f30689a;
        Intrinsics2.m13090f(bArr, "$this$encodeBase64");
        Intrinsics2.m13090f(bArr3, "map");
        byte[] bArr4 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr4[i2] = bArr3[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr4[i6] = bArr3[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr4[i7] = bArr3[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr4[i8] = bArr3[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr4[i2] = bArr3[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr4[i9] = bArr3[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr4[i10] = b5;
            bArr4[i10 + 1] = b5;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i11];
            int i12 = i2 + 1;
            bArr4[i2] = bArr3[(b6 & 255) >> 2];
            int i13 = i12 + 1;
            bArr4[i12] = bArr3[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr4[i13] = bArr3[(b7 & 15) << 2];
            bArr4[i13 + 1] = (byte) 61;
        }
        Intrinsics2.m13090f(bArr4, "$this$toUtf8String");
        return new String(bArr4, Charsets2.f29452a);
    }

    /* JADX INFO: renamed from: h */
    public ByteString3 mo13764h(String str) {
        Intrinsics2.m13090f(str, "algorithm");
        byte[] bArrDigest = MessageDigest.getInstance(str).digest(this.f30715j);
        Intrinsics2.m13086b(bArrDigest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new ByteString3(bArrDigest);
    }

    public int hashCode() {
        int i = this.f30713h;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f30715j);
        this.f30713h = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public int mo13765j() {
        return this.f30715j.length;
    }

    /* JADX INFO: renamed from: l */
    public String mo13766l() {
        byte[] bArr = this.f30715j;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = ByteString2.f30702a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: m */
    public byte[] mo13767m() {
        return this.f30715j;
    }

    /* JADX INFO: renamed from: q */
    public byte mo13768q(int i) {
        return this.f30715j[i];
    }

    /* JADX INFO: renamed from: s */
    public boolean mo13769s(int i, ByteString3 byteString3, int i2, int i3) {
        Intrinsics2.m13090f(byteString3, "other");
        return byteString3.mo13770u(i2, this.f30715j, i, i3);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0142  */
    /* JADX WARN: Code duplicated, block: B:141:0x0149  */
    /* JADX WARN: Code duplicated, block: B:143:0x014d  */
    /* JADX WARN: Code duplicated, block: B:144:0x014f  */
    /* JADX WARN: Code duplicated, block: B:203:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:206:0x01de  */
    /* JADX WARN: Code duplicated, block: B:208:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:209:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:213:0x01ee A[EDGE_INSN: B:213:0x01ee->B:214:0x01ef BREAK  A[LOOP:0: B:9:0x0014->B:274:0x0014]] */
    /* JADX WARN: Code duplicated, block: B:240:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:272:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0078  */
    /* JADX WARN: Code duplicated, block: B:53:0x007a  */
    /* JADX WARN: Code duplicated, block: B:85:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ce  */
    public String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte[] bArr = this.f30715j;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        loop0: while (i7 < length) {
            byte b = bArr[i7];
            if (b < 0) {
                if ((b >> 5) != -2) {
                    if ((b >> 4) != -2) {
                        if ((b >> 3) != -2) {
                            if (i8 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                        int i10 = i7 + 3;
                        if (length > i10) {
                            byte b2 = bArr[i7];
                            byte b3 = bArr[i7 + 1];
                            if (!((b3 & 192) == 128)) {
                                if (i8 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            byte b4 = bArr[i7 + 2];
                            if (!((b4 & 192) == 128)) {
                                if (i8 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            byte b5 = bArr[i10];
                            if (!((b5 & 192) == 128)) {
                                if (i8 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            int i11 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i11 <= 1114111) {
                                if (55296 > i11 || 57343 < i11) {
                                    if (i11 >= 65536) {
                                        int i12 = i8 + 1;
                                        if (i8 == 64) {
                                            break;
                                        }
                                        if (i11 != 10 && i11 != 13) {
                                            if (!((i11 >= 0 && 31 >= i11) || (127 <= i11 && 159 >= i11))) {
                                                if (i11 == 65533) {
                                                    if (i11 < 65536) {
                                                        i6 = 1;
                                                    } else {
                                                        i6 = 2;
                                                    }
                                                    i9 += i6;
                                                    i7 += 4;
                                                    i8 = i12;
                                                }
                                            }
                                        } else if (i11 == 65533) {
                                            if (i11 < 65536) {
                                                i6 = 1;
                                            } else {
                                                i6 = 2;
                                            }
                                            i9 += i6;
                                            i7 += 4;
                                            i8 = i12;
                                        }
                                        i9 = -1;
                                        break;
                                    }
                                    if (i8 == 64) {
                                        break;
                                    }
                                    i9 = -1;
                                    break;
                                }
                                if (i8 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            if (i8 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                        if (i8 == 64) {
                            break;
                        }
                        i9 = -1;
                        break;
                    }
                    int i13 = i7 + 2;
                    if (length > i13) {
                        byte b6 = bArr[i7];
                        byte b7 = bArr[i7 + 1];
                        if (!((b7 & 192) == 128)) {
                            if (i8 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                        byte b8 = bArr[i13];
                        if (!((b8 & 192) == 128)) {
                            if (i8 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                        int i14 = ((b8 ^ (-123008)) ^ (b7 << 6)) ^ (b6 << 12);
                        if (i14 >= 2048) {
                            if (55296 > i14 || 57343 < i14) {
                                int i15 = i8 + 1;
                                if (i8 == 64) {
                                    break;
                                }
                                if (i14 != 10 && i14 != 13) {
                                    if (!((i14 >= 0 && 31 >= i14) || (127 <= i14 && 159 >= i14))) {
                                        if (i14 == 65533) {
                                            if (i14 < 65536) {
                                                i5 = 1;
                                            } else {
                                                i5 = 2;
                                            }
                                            i9 += i5;
                                            i7 += 3;
                                            i8 = i15;
                                        }
                                    }
                                } else if (i14 == 65533) {
                                    if (i14 < 65536) {
                                        i5 = 1;
                                    } else {
                                        i5 = 2;
                                    }
                                    i9 += i5;
                                    i7 += 3;
                                    i8 = i15;
                                }
                                i9 = -1;
                                break;
                            }
                            if (i8 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                        if (i8 == 64) {
                            break;
                        }
                        i9 = -1;
                        break;
                    }
                    if (i8 == 64) {
                        break;
                    }
                    i9 = -1;
                    break;
                }
                int i16 = i7 + 1;
                if (length > i16) {
                    byte b9 = bArr[i7];
                    byte b10 = bArr[i16];
                    if (!((b10 & 192) == 128)) {
                        if (i8 == 64) {
                            break;
                        }
                        i9 = -1;
                        break;
                    }
                    int i17 = (b10 ^ 3968) ^ (b9 << 6);
                    if (i17 >= 128) {
                        int i18 = i8 + 1;
                        if (i8 == 64) {
                            break;
                        }
                        if (i17 != 10 && i17 != 13) {
                            if (!((i17 >= 0 && 31 >= i17) || (127 <= i17 && 159 >= i17))) {
                                if (i17 == 65533) {
                                    if (i17 < 65536) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    i9 += i4;
                                    i7 += 2;
                                    i8 = i18;
                                }
                            }
                        } else if (i17 == 65533) {
                            if (i17 < 65536) {
                                i4 = 1;
                            } else {
                                i4 = 2;
                            }
                            i9 += i4;
                            i7 += 2;
                            i8 = i18;
                        }
                        i9 = -1;
                        break;
                    }
                    if (i8 == 64) {
                        break;
                    }
                    i9 = -1;
                    break;
                }
                if (i8 == 64) {
                    break;
                }
                i9 = -1;
                break;
            }
            int i19 = i8 + 1;
            if (i8 == 64) {
                break;
            }
            if (b != 10 && b != 13) {
                if (!((b >= 0 && 31 >= b) || (127 <= b && 159 >= b))) {
                    if (b != 65533) {
                        if (b < 65536) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        i9 += i;
                        i7++;
                        while (true) {
                            i8 = i19;
                            if (i7 < length) {
                                continue;
                            }
                            i9 += i3;
                            i7 = i2;
                        }
                    }
                }
                i9 = -1;
                break;
            }
            if (b != 65533) {
                if (b < 65536) {
                    i = 1;
                } else {
                    i = 2;
                }
                i9 += i;
                i7++;
                while (true) {
                    i8 = i19;
                    if (i7 < length && bArr[i7] >= 0) {
                        i2 = i7 + 1;
                        byte b11 = bArr[i7];
                        i19 = i8 + 1;
                        if (i8 == 64) {
                            break loop0;
                        }
                        if (b11 != 10 && b11 != 13) {
                            if (!((b11 >= 0 && 31 >= b11) || (127 <= b11 && 159 >= b11))) {
                                if (b11 == 65533) {
                                    if (b11 < 65536) {
                                        i3 = 1;
                                    } else {
                                        i3 = 2;
                                    }
                                    i9 += i3;
                                    i7 = i2;
                                }
                            }
                        } else if (b11 == 65533) {
                            if (b11 < 65536) {
                                i3 = 1;
                            } else {
                                i3 = 2;
                            }
                            i9 += i3;
                            i7 = i2;
                        }
                    }
                }
            }
            i9 = -1;
            break;
        }
        if (i9 != -1) {
            String strM13772w = m13772w();
            String strSubstring = strM13772w.substring(0, i9);
            Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String strM12993j = StringsJVM.m12993j(StringsJVM.m12993j(StringsJVM.m12993j(strSubstring, "\\", "\\\\", false, 4), "\n", "\\n", false, 4), "\r", "\\r", false, 4);
            if (i9 >= strM13772w.length()) {
                return "[text=" + strM12993j + ']';
            }
            StringBuilder sbM1556G = outline.m1556G("[size=");
            sbM1556G.append(this.f30715j.length);
            sbM1556G.append(" text=");
            sbM1556G.append(strM12993j);
            sbM1556G.append("…]");
            return sbM1556G.toString();
        }
        if (this.f30715j.length <= 64) {
            StringBuilder sbM1556G2 = outline.m1556G("[hex=");
            sbM1556G2.append(mo13766l());
            sbM1556G2.append(']');
            return sbM1556G2.toString();
        }
        StringBuilder sbM1556G3 = outline.m1556G("[size=");
        sbM1556G3.append(this.f30715j.length);
        sbM1556G3.append(" hex=");
        byte[] bArr2 = this.f30715j;
        if (64 <= bArr2.length) {
            sbM1556G3.append((64 == bArr2.length ? this : new ByteString3(_ArraysJvm.m13031e(bArr2, 0, 64))).mo13766l());
            sbM1556G3.append("…]");
            return sbM1556G3.toString();
        }
        StringBuilder sbM1556G4 = outline.m1556G("endIndex > length(");
        sbM1556G4.append(this.f30715j.length);
        sbM1556G4.append(')');
        throw new IllegalArgumentException(sbM1556G4.toString().toString());
    }

    /* JADX INFO: renamed from: u */
    public boolean mo13770u(int i, byte[] bArr, int i2, int i3) {
        Intrinsics2.m13090f(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f30715j;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && SkuDao.a.m14079c(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public ByteString3 mo13771v() {
        byte b;
        int i = 0;
        while (true) {
            byte[] bArr = this.f30715j;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics2.m13086b(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b4 = bArrCopyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        bArrCopyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString3(bArrCopyOf);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: w */
    public String m13772w() {
        String str = this.f30714i;
        if (str != null) {
            return str;
        }
        byte[] bArrMo13767m = mo13767m();
        Intrinsics2.m13090f(bArrMo13767m, "$this$toUtf8String");
        String str2 = new String(bArrMo13767m, Charsets2.f29452a);
        this.f30714i = str2;
        return str2;
    }

    /* JADX INFO: renamed from: x */
    public void mo13773x(Buffer3 buffer3, int i, int i2) {
        Intrinsics2.m13090f(buffer3, "buffer");
        Intrinsics2.m13090f(this, "$this$commonWrite");
        Intrinsics2.m13090f(buffer3, "buffer");
        buffer3.m13720I0(this.f30715j, i, i2);
    }
}
