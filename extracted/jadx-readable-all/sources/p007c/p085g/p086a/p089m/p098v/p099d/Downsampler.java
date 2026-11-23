package p007c.p085g.p086a.p089m.p098v.p099d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.DecodeFormat;
import p007c.p085g.p086a.p089m.Option;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.PreferredColorSpace;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p112s.LogTime;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.m.v.d.n, reason: use source file name */
/* JADX INFO: compiled from: Downsampler.java */
/* JADX INFO: loaded from: classes.dex */
public final class Downsampler {

    /* JADX INFO: renamed from: a */
    public static final Option<DecodeFormat> f3559a = Option.m1705a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.PREFER_ARGB_8888);

    /* JADX INFO: renamed from: b */
    public static final Option<PreferredColorSpace> f3560b = Option.m1705a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", PreferredColorSpace.SRGB);

    /* JADX INFO: renamed from: c */
    public static final Option<Boolean> f3561c;

    /* JADX INFO: renamed from: d */
    public static final Option<Boolean> f3562d;

    /* JADX INFO: renamed from: e */
    public static final Set<String> f3563e;

    /* JADX INFO: renamed from: f */
    public static final b f3564f;

    /* JADX INFO: renamed from: g */
    public static final Set<ImageHeaderParser.ImageType> f3565g;

    /* JADX INFO: renamed from: h */
    public static final Queue<BitmapFactory.Options> f3566h;

    /* JADX INFO: renamed from: i */
    public final BitmapPool f3567i;

    /* JADX INFO: renamed from: j */
    public final DisplayMetrics f3568j;

    /* JADX INFO: renamed from: k */
    public final ArrayPool f3569k;

    /* JADX INFO: renamed from: l */
    public final List<ImageHeaderParser> f3570l;

    /* JADX INFO: renamed from: m */
    public final HardwareConfigState f3571m = HardwareConfigState.m1908a();

    /* JADX INFO: renamed from: c.g.a.m.v.d.n$a */
    /* JADX INFO: compiled from: Downsampler.java */
    public class a implements b {
        @Override // p007c.p085g.p086a.p089m.p098v.p099d.Downsampler.b
        /* JADX INFO: renamed from: a */
        public void mo1872a(BitmapPool bitmapPool, Bitmap bitmap) {
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.Downsampler.b
        /* JADX INFO: renamed from: b */
        public void mo1873b() {
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.n$b */
    /* JADX INFO: compiled from: Downsampler.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo1872a(BitmapPool bitmapPool, Bitmap bitmap) throws IOException;

        /* JADX INFO: renamed from: b */
        void mo1873b();
    }

    static {
        Option<DownsampleStrategy> option = DownsampleStrategy.f3557f;
        Boolean bool = Boolean.FALSE;
        f3561c = Option.m1705a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f3562d = Option.m1705a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f3563e = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f3564f = new a();
        f3565g = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = Util4.f3828a;
        f3566h = new ArrayDeque(0);
    }

    public Downsampler(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, BitmapPool bitmapPool, ArrayPool arrayPool) {
        this.f3570l = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.f3568j = displayMetrics;
        Objects.requireNonNull(bitmapPool, "Argument must not be null");
        this.f3567i = bitmapPool;
        Objects.requireNonNull(arrayPool, "Argument must not be null");
        this.f3569k = arrayPool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m1896d(p007c.p085g.p086a.p089m.p098v.p099d.ImageReader r5, android.graphics.BitmapFactory.Options r6, p007c.p085g.p086a.p089m.p098v.p099d.Downsampler.b r7, p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.mo1873b()
            r5.mo1912c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = p007c.p085g.p086a.p089m.p098v.p099d.TransformationUtils.f3525e
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo1911b(r6)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalArgumentException -> L21
            r4.unlock()
            return r5
        L1f:
            r5 = move-exception
            goto L48
        L21:
            r4 = move-exception
            java.io.IOException r1 = m1901i(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L1f
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L32
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L1f
        L32:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L47
            r8.mo1752d(r0)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            android.graphics.Bitmap r5 = m1896d(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            java.util.concurrent.locks.Lock r6 = p007c.p085g.p086a.p089m.p098v.p099d.TransformationUtils.f3525e
            r6.unlock()
            return r5
        L46:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L47:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L48:
            java.util.concurrent.locks.Lock r6 = p007c.p085g.p086a.p089m.p098v.p099d.TransformationUtils.f3525e
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p085g.p086a.p089m.p098v.p099d.Downsampler.m1896d(c.g.a.m.v.d.t, android.graphics.BitmapFactory$Options, c.g.a.m.v.d.n$b, c.g.a.m.t.c0.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: e */
    public static String m1897e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder sbM1556G = outline.m1556G(" (");
        sbM1556G.append(bitmap.getAllocationByteCount());
        sbM1556G.append(")");
        String string = sbM1556G.toString();
        StringBuilder sbM1556G2 = outline.m1556G("[");
        sbM1556G2.append(bitmap.getWidth());
        sbM1556G2.append("x");
        sbM1556G2.append(bitmap.getHeight());
        sbM1556G2.append("] ");
        sbM1556G2.append(bitmap.getConfig());
        sbM1556G2.append(string);
        return sbM1556G2.toString();
    }

    /* JADX INFO: renamed from: f */
    public static int m1898f(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* JADX INFO: renamed from: g */
    public static int[] m1899g(ImageReader imageReader, BitmapFactory.Options options, b bVar, BitmapPool bitmapPool) throws IOException {
        options.inJustDecodeBounds = true;
        m1896d(imageReader, options, bVar, bitmapPool);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1900h(int i) {
        return i == 90 || i == 270;
    }

    /* JADX INFO: renamed from: i */
    public static IOException m1901i(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        StringBuilder sbM1559J = outline.m1559J("Exception decoding bitmap, outWidth: ", i, ", outHeight: ", i2, ", outMimeType: ");
        sbM1559J.append(str);
        sbM1559J.append(", inBitmap: ");
        sbM1559J.append(m1897e(options.inBitmap));
        return new IOException(sbM1559J.toString(), illegalArgumentException);
    }

    /* JADX INFO: renamed from: j */
    public static void m1902j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX INFO: renamed from: k */
    public static int m1903k(double d) {
        return (int) (d + 0.5d);
    }

    /* JADX INFO: renamed from: a */
    public final Resource2<Bitmap> m1904a(ImageReader imageReader, int i, int i2, Options options, b bVar) throws IOException {
        Queue<BitmapFactory.Options> queue;
        BitmapFactory.Options optionsPoll;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f3569k.mo1745e(65536, byte[].class);
        synchronized (Downsampler.class) {
            queue = f3566h;
            synchronized (queue) {
                optionsPoll = queue.poll();
            }
            if (optionsPoll == null) {
                optionsPoll = new BitmapFactory.Options();
                m1902j(optionsPoll);
            }
            options2 = optionsPoll;
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) options.m1707c(f3559a);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) options.m1707c(f3560b);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.m1707c(DownsampleStrategy.f3557f);
        boolean zBooleanValue = ((Boolean) options.m1707c(f3561c)).booleanValue();
        Option<Boolean> option = f3562d;
        try {
            BitmapResource bitmapResourceM1881e = BitmapResource.m1881e(m1906c(imageReader, options2, downsampleStrategy, decodeFormat, preferredColorSpace, options.m1707c(option) != null && ((Boolean) options.m1707c(option)).booleanValue(), i, i2, zBooleanValue, bVar), this.f3567i);
            m1902j(options2);
            synchronized (queue) {
                queue.offer(options2);
            }
            return bitmapResourceM1881e;
        } finally {
            m1902j(options2);
            Queue<BitmapFactory.Options> queue2 = f3566h;
            synchronized (queue2) {
                queue2.offer(options2);
                this.f3569k.mo1744d(bArr);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Resource2<Bitmap> m1905b(InputStream inputStream, int i, int i2, Options options, b bVar) throws IOException {
        return m1904a(new ImageReader.a(inputStream, this.f3570l, this.f3569k), i, i2, options, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:97:0x0238  */
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
    /* JADX INFO: renamed from: c */
    public final Bitmap m1906c(ImageReader imageReader, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, b bVar) throws IOException {
        int i3;
        boolean z3;
        int i4;
        int i5;
        String str;
        boolean zHasAlpha;
        int iRound;
        int i6;
        int i7;
        boolean z4;
        Bitmap bitmap;
        ColorSpace colorSpace;
        Bitmap.Config config;
        int i8;
        int i9;
        int iMax;
        int iFloor;
        double dFloor;
        int iRound2;
        int i10;
        double dMo1895b;
        int i11;
        boolean z5;
        int i12 = LogTime.f3820b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int[] iArrM1899g = m1899g(imageReader, options, bVar, this.f3567i);
        int i13 = iArrM1899g[0];
        int i14 = iArrM1899g[1];
        String str2 = options.outMimeType;
        boolean z6 = (i13 == -1 || i14 == -1) ? false : z;
        int iMo1910a = imageReader.mo1910a();
        switch (iMo1910a) {
            case 3:
            case 4:
                i3 = 180;
                break;
            case 5:
            case 6:
                i3 = 90;
                break;
            case 7:
            case 8:
                i3 = 270;
                break;
            default:
                i3 = 0;
                break;
        }
        switch (iMo1910a) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        if (i == Integer.MIN_VALUE) {
            i4 = m1900h(i3) ? i14 : i13;
        } else {
            i4 = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            i5 = m1900h(i3) ? i13 : i14;
        } else {
            i5 = i2;
        }
        ImageHeaderParser.ImageType imageTypeMo1913d = imageReader.mo1913d();
        BitmapPool bitmapPool = this.f3567i;
        String str3 = ", target density: ";
        boolean z7 = z6;
        String str4 = ", density: ";
        boolean z8 = z3;
        String str5 = "Downsampler";
        if (i13 <= 0 || i14 <= 0) {
            int i15 = 3;
            if (Log.isLoggable(str5, i15)) {
                Log.d(str5, "Unable to determine dimensions for: " + imageTypeMo1913d + " with target [" + i4 + "x" + i5 + "]");
            }
        } else {
            if (m1900h(i3)) {
                i9 = i14;
                i8 = i13;
            } else {
                i8 = i14;
                i9 = i13;
            }
            float fMo1895b = downsampleStrategy.mo1895b(i9, i8, i4, i5);
            if (fMo1895b <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + fMo1895b + " from: " + downsampleStrategy + ", source: [" + i13 + "x" + i14 + "], target: [" + i4 + "x" + i5 + "]");
            }
            int i16 = i3;
            int iMo1894a = downsampleStrategy.mo1894a(i9, i8, i4, i5);
            if (iMo1894a == 0) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f = i9;
            float f2 = i8;
            i5 = i5;
            i4 = i4;
            int iM1903k = i9 / m1903k(fMo1895b * f);
            int iM1903k2 = i8 / m1903k(fMo1895b * f2);
            int iMax2 = iMo1894a == 1 ? Math.max(iM1903k, iM1903k2) : Math.min(iM1903k, iM1903k2);
            int i17 = Build.VERSION.SDK_INT;
            if (i17 > 23 || !f3563e.contains(options.outMimeType)) {
                iMax = Math.max(1, Integer.highestOneBit(iMax2));
                if (iMo1894a == 1 && iMax < 1.0f / fMo1895b) {
                    iMax <<= 1;
                }
            } else {
                iMax = 1;
            }
            options.inSampleSize = iMax;
            if (imageTypeMo1913d == ImageHeaderParser.ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f / fMin);
                iRound2 = (int) Math.ceil(f2 / fMin);
                int i18 = iMax / 8;
                if (i18 > 0) {
                    iFloor /= i18;
                    iRound2 /= i18;
                }
            } else {
                if (imageTypeMo1913d == ImageHeaderParser.ImageType.PNG || imageTypeMo1913d == ImageHeaderParser.ImageType.PNG_A) {
                    float f3 = iMax;
                    iFloor = (int) Math.floor(f / f3);
                    dFloor = Math.floor(f2 / f3);
                } else if (imageTypeMo1913d != ImageHeaderParser.ImageType.WEBP && imageTypeMo1913d != ImageHeaderParser.ImageType.WEBP_A) {
                    if (i9 % iMax == 0 && i8 % iMax == 0) {
                        iFloor = i9 / iMax;
                        iRound2 = i8 / iMax;
                    } else {
                        int[] iArrM1899g2 = m1899g(imageReader, options, bVar, bitmapPool);
                        i10 = iArrM1899g2[0];
                        iRound2 = iArrM1899g2[1];
                    }
                    dMo1895b = downsampleStrategy.mo1895b(i10, iRound2, i4, i5);
                    int iM1898f = m1898f(dMo1895b);
                    int iM1903k3 = m1903k(((double) iM1898f) * dMo1895b);
                    options.inTargetDensity = m1903k((dMo1895b / ((double) (iM1903k3 / iM1898f))) * ((double) iM1903k3));
                    int iM1898f2 = m1898f(dMo1895b);
                    options.inDensity = iM1898f2;
                    i11 = options.inTargetDensity;
                    if (i11 > 0 || iM1898f2 <= 0 || i11 == iM1898f2) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z5) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    str5 = "Downsampler";
                    if (Log.isLoggable(str5, 2)) {
                        i14 = i14;
                        i13 = i13;
                        StringBuilder sbM1559J = outline.m1559J("Calculate scaling, source: [", i13, "x", i14, "], degreesToRotate: ");
                        sbM1559J.append(i16);
                        sbM1559J.append(", target: [");
                        sbM1559J.append(i4);
                        sbM1559J.append("x");
                        sbM1559J.append(i5);
                        sbM1559J.append("], power of two scaled: [");
                        sbM1559J.append(i10);
                        sbM1559J.append("x");
                        sbM1559J.append(iRound2);
                        sbM1559J.append("], exact scale factor: ");
                        sbM1559J.append(fMo1895b);
                        sbM1559J.append(", power of 2 sample size: ");
                        sbM1559J.append(iMax);
                        sbM1559J.append(", adjusted scale factor: ");
                        sbM1559J.append(dMo1895b);
                        str3 = ", target density: ";
                        sbM1559J.append(str3);
                        sbM1559J.append(options.inTargetDensity);
                        str4 = ", density: ";
                        sbM1559J.append(str4);
                        sbM1559J.append(options.inDensity);
                        Log.v(str5, sbM1559J.toString());
                    } else {
                        str4 = str4;
                        str3 = ", target density: ";
                        i14 = i14;
                        i13 = i13;
                    }
                } else if (i17 >= 24) {
                    float f4 = iMax;
                    iFloor = Math.round(f / f4);
                    iRound2 = Math.round(f2 / f4);
                } else {
                    float f5 = iMax;
                    iFloor = (int) Math.floor(f / f5);
                    dFloor = Math.floor(f2 / f5);
                }
                iRound2 = (int) dFloor;
            }
            i10 = iFloor;
            dMo1895b = downsampleStrategy.mo1895b(i10, iRound2, i4, i5);
            int iM1898f3 = m1898f(dMo1895b);
            int iM1903k4 = m1903k(((double) iM1898f3) * dMo1895b);
            options.inTargetDensity = m1903k((dMo1895b / ((double) (iM1903k4 / iM1898f3))) * ((double) iM1903k4));
            int iM1898f4 = m1898f(dMo1895b);
            options.inDensity = iM1898f4;
            i11 = options.inTargetDensity;
            if (i11 > 0) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (z5) {
                options.inScaled = true;
            } else {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            }
            str5 = "Downsampler";
            if (Log.isLoggable(str5, 2)) {
                i14 = i14;
                i13 = i13;
                StringBuilder sbM1559J2 = outline.m1559J("Calculate scaling, source: [", i13, "x", i14, "], degreesToRotate: ");
                sbM1559J2.append(i16);
                sbM1559J2.append(", target: [");
                sbM1559J2.append(i4);
                sbM1559J2.append("x");
                sbM1559J2.append(i5);
                sbM1559J2.append("], power of two scaled: [");
                sbM1559J2.append(i10);
                sbM1559J2.append("x");
                sbM1559J2.append(iRound2);
                sbM1559J2.append("], exact scale factor: ");
                sbM1559J2.append(fMo1895b);
                sbM1559J2.append(", power of 2 sample size: ");
                sbM1559J2.append(iMax);
                sbM1559J2.append(", adjusted scale factor: ");
                sbM1559J2.append(dMo1895b);
                str3 = ", target density: ";
                sbM1559J2.append(str3);
                sbM1559J2.append(options.inTargetDensity);
                str4 = ", density: ";
                sbM1559J2.append(str4);
                sbM1559J2.append(options.inDensity);
                Log.v(str5, sbM1559J2.toString());
            } else {
                str4 = str4;
                str3 = ", target density: ";
                i14 = i14;
                i13 = i13;
            }
        }
        String str6 = str5;
        boolean zM1909b = this.f3571m.m1909b(i4, i5, z7, z8);
        if (zM1909b) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (zM1909b) {
            str = str3;
        } else {
            str = str3;
            if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                try {
                    zHasAlpha = imageReader.mo1913d().hasAlpha();
                } catch (IOException e) {
                    if (Log.isLoggable(str6, 3)) {
                        Log.d(str6, "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e);
                    }
                    zHasAlpha = false;
                }
                Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config2;
                if (config2 == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                }
            } else {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
        }
        int i19 = Build.VERSION.SDK_INT;
        int i20 = options.inSampleSize;
        if (i13 < 0 || i14 < 0 || !z2) {
            int i21 = options.inTargetDensity;
            float f6 = i21 > 0 && (i7 = options.inDensity) > 0 && i21 != i7 ? i21 / options.inDensity : 1.0f;
            float f7 = i20;
            int iCeil = (int) Math.ceil(i13 / f7);
            int iCeil2 = (int) Math.ceil(i14 / f7);
            iRound = Math.round(iCeil * f6);
            int iRound3 = Math.round(iCeil2 * f6);
            if (Log.isLoggable(str6, 2)) {
                StringBuilder sbM1559J3 = outline.m1559J("Calculated target [", iRound, "x", iRound3, "] for source [");
                sbM1559J3.append(i13);
                sbM1559J3.append("x");
                sbM1559J3.append(i14);
                sbM1559J3.append("], sampleSize: ");
                sbM1559J3.append(i20);
                sbM1559J3.append(", targetDensity: ");
                sbM1559J3.append(options.inTargetDensity);
                sbM1559J3.append(str4);
                sbM1559J3.append(options.inDensity);
                sbM1559J3.append(", density multiplier: ");
                sbM1559J3.append(f6);
                Log.v(str6, sbM1559J3.toString());
            }
            i6 = iRound3;
        } else {
            i6 = i5;
            iRound = i4;
        }
        if (iRound > 0 && i6 > 0) {
            BitmapPool bitmapPool2 = this.f3567i;
            if (i19 >= 26) {
                config = options.inPreferredConfig != Bitmap.Config.HARDWARE ? options.outConfig : null;
            }
            if (config == null) {
                config = options.inPreferredConfig;
            }
            options.inBitmap = bitmapPool2.mo1751c(iRound, i6, config);
        }
        if (i19 >= 28) {
            options.inPreferredColorSpace = ColorSpace.get(preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i19 >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap bitmapM1896d = m1896d(imageReader, options, bVar, this.f3567i);
        bVar.mo1872a(this.f3567i, bitmapM1896d);
        if (Log.isLoggable(str6, 2)) {
            StringBuilder sbM1556G = outline.m1556G("Decoded ");
            sbM1556G.append(m1897e(bitmapM1896d));
            sbM1556G.append(" from [");
            sbM1556G.append(i13);
            sbM1556G.append("x");
            sbM1556G.append(i14);
            sbM1556G.append("] ");
            sbM1556G.append(str2);
            sbM1556G.append(" with inBitmap ");
            sbM1556G.append(m1897e(options.inBitmap));
            sbM1556G.append(" for [");
            sbM1556G.append(i);
            sbM1556G.append("x");
            sbM1556G.append(i2);
            sbM1556G.append("], sample size: ");
            sbM1556G.append(options.inSampleSize);
            sbM1556G.append(str4);
            sbM1556G.append(options.inDensity);
            sbM1556G.append(str);
            sbM1556G.append(options.inTargetDensity);
            sbM1556G.append(", thread: ");
            sbM1556G.append(Thread.currentThread().getName());
            sbM1556G.append(", duration: ");
            sbM1556G.append(LogTime.m2040a(jElapsedRealtimeNanos));
            Log.v(str6, sbM1556G.toString());
        }
        if (bitmapM1896d == null) {
            return null;
        }
        bitmapM1896d.setDensity(this.f3568j.densityDpi);
        BitmapPool bitmapPool3 = this.f3567i;
        switch (iMo1910a) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z4 = true;
                break;
            default:
                z4 = false;
                break;
        }
        if (z4) {
            Matrix matrix = new Matrix();
            switch (iMo1910a) {
                case 2:
                    matrix.setScale(-1.0f, 1.0f);
                    break;
                case 3:
                    matrix.setRotate(180.0f);
                    break;
                case 4:
                    matrix.setRotate(180.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 5:
                    matrix.setRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 6:
                    matrix.setRotate(90.0f);
                    break;
                case 7:
                    matrix.setRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 8:
                    matrix.setRotate(-90.0f);
                    break;
            }
            RectF rectF = new RectF(0.0f, 0.0f, bitmapM1896d.getWidth(), bitmapM1896d.getHeight());
            matrix.mapRect(rectF);
            Bitmap bitmapMo1753e = bitmapPool3.mo1753e(Math.round(rectF.width()), Math.round(rectF.height()), TransformationUtils.m1878e(bitmapM1896d));
            matrix.postTranslate(-rectF.left, -rectF.top);
            bitmapMo1753e.setHasAlpha(bitmapM1896d.hasAlpha());
            TransformationUtils.m1874a(bitmapM1896d, bitmapMo1753e, matrix);
            bitmap = bitmapMo1753e;
        } else {
            bitmap = bitmapM1896d;
        }
        if (bitmapM1896d.equals(bitmap)) {
            return bitmap;
        }
        this.f3567i.mo1752d(bitmapM1896d);
        return bitmap;
    }
}
