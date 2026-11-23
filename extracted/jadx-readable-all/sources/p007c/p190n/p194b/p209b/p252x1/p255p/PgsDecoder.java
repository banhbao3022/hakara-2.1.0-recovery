package p007c.p190n.p194b.p209b.p252x1.p255p;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.zip.Inflater;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p252x1.SubtitleDecoderException;

/* JADX INFO: renamed from: c.n.b.b.x1.p.a, reason: use source file name */
/* JADX INFO: compiled from: PgsDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class PgsDecoder extends SimpleSubtitleDecoder {

    /* JADX INFO: renamed from: n */
    public final ParsableByteArray f9988n;

    /* JADX INFO: renamed from: o */
    public final ParsableByteArray f9989o;

    /* JADX INFO: renamed from: p */
    public final a f9990p;

    /* JADX INFO: renamed from: q */
    public Inflater f9991q;

    /* JADX INFO: renamed from: c.n.b.b.x1.p.a$a */
    /* JADX INFO: compiled from: PgsDecoder.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final ParsableByteArray f9992a = new ParsableByteArray();

        /* JADX INFO: renamed from: b */
        public final int[] f9993b = new int[256];

        /* JADX INFO: renamed from: c */
        public boolean f9994c;

        /* JADX INFO: renamed from: d */
        public int f9995d;

        /* JADX INFO: renamed from: e */
        public int f9996e;

        /* JADX INFO: renamed from: f */
        public int f9997f;

        /* JADX INFO: renamed from: g */
        public int f9998g;

        /* JADX INFO: renamed from: h */
        public int f9999h;

        /* JADX INFO: renamed from: i */
        public int f10000i;

        /* JADX INFO: renamed from: a */
        public void m4440a() {
            this.f9995d = 0;
            this.f9996e = 0;
            this.f9997f = 0;
            this.f9998g = 0;
            this.f9999h = 0;
            this.f10000i = 0;
            this.f9992a.m3221z(0);
            this.f9994c = false;
        }
    }

    public PgsDecoder() {
        super("PgsDecoder");
        this.f9988n = new ParsableByteArray();
        this.f9989o = new ParsableByteArray();
        this.f9990p = new a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    @Override // p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder
    /* JADX INFO: renamed from: j */
    public Subtitle mo4394j(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        ParsableByteArray parsableByteArray;
        Cue cueM4392a;
        ParsableByteArray parsableByteArray2;
        int i2;
        int iM3214s;
        int i3;
        int i4;
        int iM3216u;
        PgsDecoder pgsDecoder = this;
        ParsableByteArray parsableByteArray3 = pgsDecoder.f9988n;
        parsableByteArray3.f6392a = bArr;
        parsableByteArray3.f6394c = i;
        int i5 = 0;
        parsableByteArray3.f6393b = 0;
        if (parsableByteArray3.m3196a() > 0 && parsableByteArray3.m3198c() == 120) {
            if (pgsDecoder.f9991q == null) {
                pgsDecoder.f9991q = new Inflater();
            }
            if (Util6.m3094C(parsableByteArray3, pgsDecoder.f9989o, pgsDecoder.f9991q)) {
                ParsableByteArray parsableByteArray4 = pgsDecoder.f9989o;
                parsableByteArray3.m3192B(parsableByteArray4.f6392a, parsableByteArray4.f6394c);
            }
        }
        pgsDecoder.f9990p.m4440a();
        ArrayList arrayList = new ArrayList();
        while (pgsDecoder.f9988n.m3196a() >= 3) {
            ParsableByteArray parsableByteArray5 = pgsDecoder.f9988n;
            a aVar = pgsDecoder.f9990p;
            int i6 = parsableByteArray5.f6394c;
            int iM3214s2 = parsableByteArray5.m3214s();
            int iM3219x = parsableByteArray5.m3219x();
            int i7 = parsableByteArray5.f6393b + iM3219x;
            if (i7 > i6) {
                parsableByteArray5.m3194D(i6);
                cueM4392a = null;
            } else {
                if (iM3214s2 != 128) {
                    switch (iM3214s2) {
                        case 20:
                            Objects.requireNonNull(aVar);
                            if (iM3219x % 5 == 2) {
                                parsableByteArray5.m3195E(2);
                                Arrays.fill(aVar.f9993b, i5);
                                int i8 = iM3219x / 5;
                                int i9 = 0;
                                while (i9 < i8) {
                                    int iM3214s3 = parsableByteArray5.m3214s();
                                    int iM3214s4 = parsableByteArray5.m3214s();
                                    double d = iM3214s4;
                                    double dM3214s = parsableByteArray5.m3214s() - 128;
                                    arrayList = arrayList;
                                    double dM3214s2 = parsableByteArray5.m3214s() - 128;
                                    aVar.f9993b[iM3214s3] = (Util6.m3121i((int) ((1.402d * dM3214s) + d), 0, 255) << 16) | (parsableByteArray5.m3214s() << 24) | (Util6.m3121i((int) ((d - (0.34414d * dM3214s2)) - (dM3214s * 0.71414d)), 0, 255) << 8) | Util6.m3121i((int) ((dM3214s2 * 1.772d) + d), 0, 255);
                                    i9++;
                                    parsableByteArray5 = parsableByteArray5;
                                }
                                parsableByteArray = parsableByteArray5;
                                aVar.f9994c = true;
                            } else {
                                parsableByteArray = parsableByteArray5;
                            }
                            break;
                        case 21:
                            Objects.requireNonNull(aVar);
                            if (iM3219x >= 4) {
                                parsableByteArray5.m3195E(3);
                                int i10 = iM3219x - 4;
                                if (!((parsableByteArray5.m3214s() & 128) != 0)) {
                                    ParsableByteArray parsableByteArray6 = aVar.f9992a;
                                    i3 = parsableByteArray6.f6393b;
                                    i4 = parsableByteArray6.f6394c;
                                    if (i3 < i4 && i10 > 0) {
                                        int iMin = Math.min(i10, i4 - i3);
                                        parsableByteArray5.m3200e(aVar.f9992a.f6392a, i3, iMin);
                                        aVar.f9992a.m3194D(i3 + iMin);
                                    }
                                } else if (i10 >= 7 && (iM3216u = parsableByteArray5.m3216u()) >= 4) {
                                    aVar.f9999h = parsableByteArray5.m3219x();
                                    aVar.f10000i = parsableByteArray5.m3219x();
                                    aVar.f9992a.m3221z(iM3216u - 4);
                                    i10 -= 7;
                                    ParsableByteArray parsableByteArray7 = aVar.f9992a;
                                    i3 = parsableByteArray7.f6393b;
                                    i4 = parsableByteArray7.f6394c;
                                    if (i3 < i4) {
                                        int iMin2 = Math.min(i10, i4 - i3);
                                        parsableByteArray5.m3200e(aVar.f9992a.f6392a, i3, iMin2);
                                        aVar.f9992a.m3194D(i3 + iMin2);
                                    }
                                }
                            }
                            parsableByteArray = parsableByteArray5;
                            break;
                        case 22:
                            Objects.requireNonNull(aVar);
                            if (iM3219x >= 19) {
                                aVar.f9995d = parsableByteArray5.m3219x();
                                aVar.f9996e = parsableByteArray5.m3219x();
                                parsableByteArray5.m3195E(11);
                                aVar.f9997f = parsableByteArray5.m3219x();
                                aVar.f9998g = parsableByteArray5.m3219x();
                            }
                            parsableByteArray = parsableByteArray5;
                            break;
                        default:
                            parsableByteArray = parsableByteArray5;
                            break;
                    }
                    cueM4392a = null;
                } else {
                    parsableByteArray = parsableByteArray5;
                    if (aVar.f9995d == 0 || aVar.f9996e == 0 || aVar.f9999h == 0 || aVar.f10000i == 0 || (i2 = (parsableByteArray2 = aVar.f9992a).f6394c) == 0 || parsableByteArray2.f6393b != i2 || !aVar.f9994c) {
                        cueM4392a = null;
                    } else {
                        parsableByteArray2.m3194D(0);
                        int i11 = aVar.f9999h * aVar.f10000i;
                        int[] iArr = new int[i11];
                        int i12 = 0;
                        while (i12 < i11) {
                            int iM3214s5 = aVar.f9992a.m3214s();
                            if (iM3214s5 != 0) {
                                iM3214s = i12 + 1;
                                iArr[i12] = aVar.f9993b[iM3214s5];
                            } else {
                                int iM3214s6 = aVar.f9992a.m3214s();
                                if (iM3214s6 != 0) {
                                    iM3214s = ((iM3214s6 & 64) == 0 ? iM3214s6 & 63 : ((iM3214s6 & 63) << 8) | aVar.f9992a.m3214s()) + i12;
                                    Arrays.fill(iArr, i12, iM3214s, (iM3214s6 & 128) == 0 ? 0 : aVar.f9993b[aVar.f9992a.m3214s()]);
                                }
                            }
                            i12 = iM3214s;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, aVar.f9999h, aVar.f10000i, Bitmap.Config.ARGB_8888);
                        Cue.b bVar = new Cue.b();
                        bVar.f9804b = bitmapCreateBitmap;
                        float f = aVar.f9997f;
                        float f2 = aVar.f9995d;
                        bVar.f9809g = f / f2;
                        bVar.f9810h = 0;
                        float f3 = aVar.f9998g;
                        float f4 = aVar.f9996e;
                        bVar.f9806d = f3 / f4;
                        bVar.f9807e = 0;
                        bVar.f9808f = 0;
                        bVar.f9813k = aVar.f9999h / f2;
                        bVar.f9814l = aVar.f10000i / f4;
                        cueM4392a = bVar.m4392a();
                    }
                    aVar.m4440a();
                }
                parsableByteArray.m3194D(i7);
            }
            if (cueM4392a != null) {
                arrayList.add(cueM4392a);
            }
            pgsDecoder = this;
            i5 = 0;
        }
        return new PgsSubtitle(Collections.unmodifiableList(arrayList));
    }
}
