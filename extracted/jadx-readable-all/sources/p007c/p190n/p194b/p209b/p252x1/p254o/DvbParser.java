package p007c.p190n.p194b.p209b.p252x1.p254o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.x1.o.b, reason: use source file name */
/* JADX INFO: compiled from: DvbParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class DvbParser {

    /* JADX INFO: renamed from: a */
    public static final byte[] f9937a = {0, 7, 8, 15};

    /* JADX INFO: renamed from: b */
    public static final byte[] f9938b = {0, 119, -120, -1};

    /* JADX INFO: renamed from: c */
    public static final byte[] f9939c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: d */
    public final Paint f9940d;

    /* JADX INFO: renamed from: e */
    public final Paint f9941e;

    /* JADX INFO: renamed from: f */
    public final Canvas f9942f;

    /* JADX INFO: renamed from: g */
    public final b f9943g;

    /* JADX INFO: renamed from: h */
    public final a f9944h;

    /* JADX INFO: renamed from: i */
    public final h f9945i;

    /* JADX INFO: renamed from: j */
    public Bitmap f9946j;

    /* JADX INFO: renamed from: c.n.b.b.x1.o.b$a */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f9947a;

        /* JADX INFO: renamed from: b */
        public final int[] f9948b;

        /* JADX INFO: renamed from: c */
        public final int[] f9949c;

        /* JADX INFO: renamed from: d */
        public final int[] f9950d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f9947a = i;
            this.f9948b = iArr;
            this.f9949c = iArr2;
            this.f9950d = iArr3;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.o.b$b */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f9951a;

        /* JADX INFO: renamed from: b */
        public final int f9952b;

        /* JADX INFO: renamed from: c */
        public final int f9953c;

        /* JADX INFO: renamed from: d */
        public final int f9954d;

        /* JADX INFO: renamed from: e */
        public final int f9955e;

        /* JADX INFO: renamed from: f */
        public final int f9956f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f9951a = i;
            this.f9952b = i2;
            this.f9953c = i3;
            this.f9954d = i4;
            this.f9955e = i5;
            this.f9956f = i6;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.o.b$c */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f9957a;

        /* JADX INFO: renamed from: b */
        public final boolean f9958b;

        /* JADX INFO: renamed from: c */
        public final byte[] f9959c;

        /* JADX INFO: renamed from: d */
        public final byte[] f9960d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f9957a = i;
            this.f9958b = z;
            this.f9959c = bArr;
            this.f9960d = bArr2;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.o.b$d */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final int f9961a;

        /* JADX INFO: renamed from: b */
        public final int f9962b;

        /* JADX INFO: renamed from: c */
        public final SparseArray<e> f9963c;

        public d(int i, int i2, int i3, SparseArray<e> sparseArray) {
            this.f9961a = i2;
            this.f9962b = i3;
            this.f9963c = sparseArray;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.o.b$e */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final int f9964a;

        /* JADX INFO: renamed from: b */
        public final int f9965b;

        public e(int i, int i2) {
            this.f9964a = i;
            this.f9965b = i2;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.o.b$f */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public final int f9966a;

        /* JADX INFO: renamed from: b */
        public final boolean f9967b;

        /* JADX INFO: renamed from: c */
        public final int f9968c;

        /* JADX INFO: renamed from: d */
        public final int f9969d;

        /* JADX INFO: renamed from: e */
        public final int f9970e;

        /* JADX INFO: renamed from: f */
        public final int f9971f;

        /* JADX INFO: renamed from: g */
        public final int f9972g;

        /* JADX INFO: renamed from: h */
        public final int f9973h;

        /* JADX INFO: renamed from: i */
        public final int f9974i;

        /* JADX INFO: renamed from: j */
        public final SparseArray<g> f9975j;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<g> sparseArray) {
            this.f9966a = i;
            this.f9967b = z;
            this.f9968c = i2;
            this.f9969d = i3;
            this.f9970e = i5;
            this.f9971f = i6;
            this.f9972g = i7;
            this.f9973h = i8;
            this.f9974i = i9;
            this.f9975j = sparseArray;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.o.b$g */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public final int f9976a;

        /* JADX INFO: renamed from: b */
        public final int f9977b;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f9976a = i3;
            this.f9977b = i4;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.o.b$h */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class h {

        /* JADX INFO: renamed from: a */
        public final int f9978a;

        /* JADX INFO: renamed from: b */
        public final int f9979b;

        /* JADX INFO: renamed from: c */
        public final SparseArray<f> f9980c = new SparseArray<>();

        /* JADX INFO: renamed from: d */
        public final SparseArray<a> f9981d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        public final SparseArray<c> f9982e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        public final SparseArray<a> f9983f = new SparseArray<>();

        /* JADX INFO: renamed from: g */
        public final SparseArray<c> f9984g = new SparseArray<>();

        /* JADX INFO: renamed from: h */
        public b f9985h;

        /* JADX INFO: renamed from: i */
        public d f9986i;

        public h(int i, int i2) {
            this.f9978a = i;
            this.f9979b = i2;
        }
    }

    public DvbParser(int i, int i2) {
        Paint paint = new Paint();
        this.f9940d = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f9941e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f9942f = new Canvas();
        this.f9943g = new b(719, 575, 0, 719, 0, 575);
        this.f9944h = new a(0, new int[]{0, -1, -16777216, -8421505}, m4434b(), m4435c());
        this.f9945i = new h(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4433a(int i, int i2, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) parsableBitArray.m3183g(i2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static int[] m4434b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m4436d(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m4436d(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m4435c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m4436d(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m4436d(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m4436d(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m4436d(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m4436d(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static int m4436d(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0198  */
    /* JADX WARN: Code duplicated, block: B:103:0x019c  */
    /* JADX WARN: Code duplicated, block: B:104:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:118:0x020b A[LOOP:3: B:87:0x0163->B:118:0x020b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x016a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:93:0x017d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x0184 A[PHI: r1
  0x0184: PHI (r1v4 int) = (r1v3 int), (r1v22 int) binds: [B:88:0x0167, B:95:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x018c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0192 A[DONT_INVERT] */
    /* JADX INFO: renamed from: e */
    public static void m4437e(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        boolean z;
        int iM3183g;
        boolean z2;
        int i5;
        int iM3183g2;
        int iM3183g3;
        int iM3183g4;
        boolean z3;
        int iM3183g5;
        int i6;
        int iM3183g6;
        boolean z4;
        int iM3183g7;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        int i7 = i2;
        int i8 = i3;
        byte[] bArrM4433a = null;
        byte[] bArrM4433a2 = null;
        byte[] bArrM4433a3 = null;
        while (parsableBitArray.m3178b() != 0) {
            int i9 = 8;
            int iM3183g8 = parsableBitArray.m3183g(8);
            if (iM3183g8 != 240) {
                int i10 = 4;
                int i11 = 2;
                switch (iM3183g8) {
                    case 16:
                        if (i == 3) {
                            bArr3 = bArrM4433a == null ? f9938b : bArrM4433a;
                        } else {
                            if (i == 2) {
                                bArr3 = bArrM4433a3 == null ? f9937a : bArrM4433a3;
                            } else {
                                bArr2 = null;
                            }
                            i4 = i7;
                            z = false;
                            while (true) {
                                iM3183g = parsableBitArray.m3183g(2);
                                if (iM3183g == 0) {
                                    if (parsableBitArray.m3182f()) {
                                        iM3183g3 = parsableBitArray.m3183g(3) + 3;
                                        iM3183g4 = parsableBitArray.m3183g(2);
                                    } else if (parsableBitArray.m3182f()) {
                                        iM3183g = 0;
                                        z2 = z;
                                        i5 = 1;
                                    } else {
                                        iM3183g2 = parsableBitArray.m3183g(2);
                                        if (iM3183g2 != 0) {
                                            z = true;
                                        } else if (iM3183g2 != 1) {
                                            z2 = z;
                                            iM3183g = 0;
                                            i5 = 2;
                                        } else if (iM3183g2 != 2) {
                                            iM3183g3 = parsableBitArray.m3183g(4) + 12;
                                            iM3183g4 = parsableBitArray.m3183g(2);
                                        } else if (iM3183g2 != 3) {
                                            iM3183g3 = parsableBitArray.m3183g(8) + 29;
                                            iM3183g4 = parsableBitArray.m3183g(2);
                                        }
                                        z2 = z;
                                        iM3183g = 0;
                                        i5 = 0;
                                    }
                                    i5 = iM3183g3;
                                    iM3183g = iM3183g4;
                                    z2 = z;
                                } else {
                                    z2 = z;
                                    i5 = 1;
                                }
                                if (i5 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        iM3183g = bArr2[iM3183g];
                                    }
                                    paint.setColor(iArr[iM3183g]);
                                    canvas.drawRect(i4, i8, i4 + i5, i8 + 1, paint);
                                }
                                i4 += i5;
                                if (z2) {
                                    parsableBitArray.m3179c();
                                    i7 = i4;
                                } else {
                                    z = z2;
                                }
                            }
                        }
                        bArr2 = bArr3;
                        i4 = i7;
                        z = false;
                        while (true) {
                            iM3183g = parsableBitArray.m3183g(2);
                            if (iM3183g == 0) {
                                if (parsableBitArray.m3182f()) {
                                    iM3183g3 = parsableBitArray.m3183g(3) + 3;
                                    iM3183g4 = parsableBitArray.m3183g(2);
                                } else if (parsableBitArray.m3182f()) {
                                    iM3183g = 0;
                                    z2 = z;
                                    i5 = 1;
                                } else {
                                    iM3183g2 = parsableBitArray.m3183g(2);
                                    if (iM3183g2 != 0) {
                                        z = true;
                                    } else if (iM3183g2 != 1) {
                                        z2 = z;
                                        iM3183g = 0;
                                        i5 = 2;
                                    } else if (iM3183g2 != 2) {
                                        iM3183g3 = parsableBitArray.m3183g(4) + 12;
                                        iM3183g4 = parsableBitArray.m3183g(2);
                                    } else if (iM3183g2 != 3) {
                                        iM3183g3 = parsableBitArray.m3183g(8) + 29;
                                        iM3183g4 = parsableBitArray.m3183g(2);
                                    }
                                    z2 = z;
                                    iM3183g = 0;
                                    i5 = 0;
                                }
                                i5 = iM3183g3;
                                iM3183g = iM3183g4;
                                z2 = z;
                            } else {
                                z2 = z;
                                i5 = 1;
                            }
                            if (i5 == 0) {
                            }
                            i4 += i5;
                            if (z2) {
                                parsableBitArray.m3179c();
                                i7 = i4;
                            } else {
                                z = z2;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i == 3 ? bArrM4433a2 == null ? f9939c : bArrM4433a2 : null;
                        int i12 = i7;
                        boolean z5 = false;
                        while (true) {
                            int iM3183g9 = parsableBitArray.m3183g(i10);
                            if (iM3183g9 != 0) {
                                z3 = z5;
                                iM3183g5 = iM3183g9;
                                i6 = 1;
                            } else if (parsableBitArray.m3182f()) {
                                if (parsableBitArray.m3182f()) {
                                    int iM3183g10 = parsableBitArray.m3183g(i11);
                                    if (iM3183g10 == 0) {
                                        iM3183g9 = 0;
                                        z3 = z5;
                                        iM3183g5 = iM3183g9;
                                        i6 = 1;
                                    } else if (iM3183g10 == 1) {
                                        z3 = z5;
                                        iM3183g5 = 0;
                                        i6 = 2;
                                    } else if (iM3183g10 == i11) {
                                        iM3183g6 = parsableBitArray.m3183g(i10) + 9;
                                        iM3183g5 = parsableBitArray.m3183g(i10);
                                    } else if (iM3183g10 != 3) {
                                        z3 = z5;
                                        iM3183g5 = 0;
                                        i6 = 0;
                                    } else {
                                        iM3183g6 = parsableBitArray.m3183g(i9) + 25;
                                        iM3183g5 = parsableBitArray.m3183g(i10);
                                    }
                                } else {
                                    iM3183g6 = parsableBitArray.m3183g(i11) + i10;
                                    iM3183g5 = parsableBitArray.m3183g(i10);
                                }
                                z3 = z5;
                                i6 = iM3183g6;
                            } else {
                                int iM3183g11 = parsableBitArray.m3183g(3);
                                if (iM3183g11 != 0) {
                                    z3 = z5;
                                    i6 = iM3183g11 + 2;
                                    iM3183g5 = 0;
                                } else {
                                    z5 = true;
                                    z3 = z5;
                                    iM3183g5 = 0;
                                    i6 = 0;
                                }
                            }
                            if (i6 != 0 && paint != null) {
                                if (bArr4 != 0) {
                                    iM3183g5 = bArr4[iM3183g5];
                                }
                                paint.setColor(iArr[iM3183g5]);
                                canvas.drawRect(i12, i8, i12 + i6, i8 + 1, paint);
                            }
                            i12 += i6;
                            if (z3) {
                                parsableBitArray.m3179c();
                                i7 = i12;
                            } else {
                                z5 = z3;
                                i11 = 2;
                                i10 = 4;
                                i9 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i13 = i7;
                        boolean z6 = false;
                        while (true) {
                            int iM3183g12 = parsableBitArray.m3183g(8);
                            if (iM3183g12 != 0) {
                                z4 = z6;
                                iM3183g7 = 1;
                            } else if (parsableBitArray.m3182f()) {
                                z4 = z6;
                                iM3183g7 = parsableBitArray.m3183g(7);
                                iM3183g12 = parsableBitArray.m3183g(8);
                            } else {
                                int iM3183g13 = parsableBitArray.m3183g(7);
                                if (iM3183g13 != 0) {
                                    z4 = z6;
                                    iM3183g7 = iM3183g13;
                                    iM3183g12 = 0;
                                } else {
                                    iM3183g12 = 0;
                                    z4 = true;
                                    iM3183g7 = 0;
                                }
                            }
                            if (iM3183g7 != 0 && paint != null) {
                                paint.setColor(iArr[iM3183g12]);
                                canvas.drawRect(i13, i8, i13 + iM3183g7, i8 + 1, paint);
                            }
                            i13 += iM3183g7;
                            if (z4) {
                                i7 = i13;
                            } else {
                                z6 = z4;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iM3183g8) {
                            case 32:
                                bArrM4433a3 = m4433a(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArrM4433a = m4433a(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArrM4433a2 = m4433a(16, 8, parsableBitArray);
                                break;
                        }
                        break;
                }
            } else {
                i8 += 2;
                i7 = i2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static a m4438f(ParsableBitArray parsableBitArray, int i) {
        int[] iArr;
        int iM3183g;
        int iM3183g2;
        int iM3183g3;
        int iM3183g4;
        int i2 = 8;
        int iM3183g5 = parsableBitArray.m3183g(8);
        parsableBitArray.m3189m(8);
        int i3 = i - 2;
        int i4 = 4;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrM4434b = m4434b();
        int[] iArrM4435c = m4435c();
        while (i3 > 0) {
            int iM3183g6 = parsableBitArray.m3183g(i2);
            int iM3183g7 = parsableBitArray.m3183g(i2);
            int i5 = i3 - 2;
            if ((iM3183g7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM3183g7 & 64) != 0 ? iArrM4434b : iArrM4435c;
            }
            if ((iM3183g7 & 1) != 0) {
                iM3183g3 = parsableBitArray.m3183g(i2);
                iM3183g = parsableBitArray.m3183g(i2);
                iM3183g4 = parsableBitArray.m3183g(i2);
                iM3183g2 = parsableBitArray.m3183g(i2);
                i3 = i5 - 4;
            } else {
                int iM3183g8 = parsableBitArray.m3183g(6) << 2;
                int iM3183g9 = parsableBitArray.m3183g(i4) << i4;
                int iM3183g10 = parsableBitArray.m3183g(i4) << i4;
                i3 = i5 - 2;
                iM3183g = iM3183g9;
                iM3183g2 = parsableBitArray.m3183g(2) << 6;
                iM3183g3 = iM3183g8;
                iM3183g4 = iM3183g10;
            }
            if (iM3183g3 == 0) {
                iM3183g = 0;
                iM3183g4 = 0;
                iM3183g2 = 255;
            }
            double d2 = iM3183g3;
            double d3 = iM3183g - 128;
            double d4 = iM3183g4 - 128;
            iArr[iM3183g6] = m4436d((byte) (255 - (iM3183g2 & 255)), Util6.m3121i((int) ((1.402d * d3) + d2), 0, 255), Util6.m3121i((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), Util6.m3121i((int) ((d4 * 1.772d) + d2), 0, 255));
            iArr2 = iArr2;
            iM3183g5 = iM3183g5;
            i2 = 8;
            i4 = 4;
        }
        return new a(iM3183g5, iArr2, iArrM4434b, iArrM4435c);
    }

    /* JADX INFO: renamed from: g */
    public static c m4439g(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int iM3183g = parsableBitArray.m3183g(16);
        parsableBitArray.m3189m(4);
        int iM3183g2 = parsableBitArray.m3183g(2);
        boolean zM3182f = parsableBitArray.m3182f();
        parsableBitArray.m3189m(1);
        byte[] bArr2 = Util6.f6312f;
        if (iM3183g2 != 1) {
            if (iM3183g2 == 0) {
                int iM3183g3 = parsableBitArray.m3183g(16);
                int iM3183g4 = parsableBitArray.m3183g(16);
                if (iM3183g3 > 0) {
                    bArr2 = new byte[iM3183g3];
                    parsableBitArray.m3185i(bArr2, 0, iM3183g3);
                }
                if (iM3183g4 > 0) {
                    bArr = new byte[iM3183g4];
                    parsableBitArray.m3185i(bArr, 0, iM3183g4);
                }
            }
            return new c(iM3183g, zM3182f, bArr2, bArr);
        }
        parsableBitArray.m3189m(parsableBitArray.m3183g(8) * 16);
        bArr = bArr2;
        return new c(iM3183g, zM3182f, bArr2, bArr);
    }
}
