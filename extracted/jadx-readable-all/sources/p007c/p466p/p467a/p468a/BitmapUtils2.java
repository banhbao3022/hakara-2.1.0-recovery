package p007c.p466p.p467a.p468a;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.p.a.a.c, reason: use source file name */
/* JADX INFO: compiled from: BitmapUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class BitmapUtils2 {

    /* JADX INFO: renamed from: a */
    public static final Rect f27970a = new Rect();

    /* JADX INFO: renamed from: b */
    public static final RectF f27971b = new RectF();

    /* JADX INFO: renamed from: c */
    public static final RectF f27972c = new RectF();

    /* JADX INFO: renamed from: d */
    public static final float[] f27973d = new float[6];

    /* JADX INFO: renamed from: e */
    public static final float[] f27974e = new float[6];

    /* JADX INFO: renamed from: f */
    public static int f27975f;

    /* JADX INFO: renamed from: g */
    public static Pair<String, WeakReference<Bitmap>> f27976g;

    /* JADX INFO: renamed from: c.p.a.a.c$a */
    /* JADX INFO: compiled from: BitmapUtils.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Bitmap f27977a;

        /* JADX INFO: renamed from: b */
        public final int f27978b;

        public a(Bitmap bitmap, int i) {
            this.f27977a = bitmap;
            this.f27978b = i;
        }
    }

    /* JADX INFO: renamed from: c.p.a.a.c$b */
    /* JADX INFO: compiled from: BitmapUtils.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Bitmap f27979a;

        /* JADX INFO: renamed from: b */
        public final int f27980b;

        public b(Bitmap bitmap, int i) {
            this.f27979a = bitmap;
            this.f27980b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m12503a(int i, int i2) {
        int i3 = 1;
        if (f27975f == 0) {
            int iMax = 2048;
            try {
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                egl10.eglGetConfigs(eGLDisplayEglGetDisplay, null, 0, iArr);
                EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
                egl10.eglGetConfigs(eGLDisplayEglGetDisplay, eGLConfigArr, iArr[0], iArr);
                int[] iArr2 = new int[1];
                int i4 = 0;
                for (int i5 = 0; i5 < iArr[0]; i5++) {
                    egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[i5], 12332, iArr2);
                    if (i4 < iArr2[0]) {
                        i4 = iArr2[0];
                    }
                }
                egl10.eglTerminate(eGLDisplayEglGetDisplay);
                iMax = Math.max(i4, 2048);
            } catch (Exception unused) {
            }
            f27975f = iMax;
        }
        if (f27975f > 0) {
            while (true) {
                int i6 = i2 / i3;
                int i7 = f27975f;
                if (i6 <= i7 && i / i3 <= i7) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public static int m12504b(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* JADX INFO: renamed from: c */
    public static a m12505c(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3) {
        int i8 = 1;
        do {
            try {
                return m12506d(context, uri, fArr, i, i2, i3, z, i4, i5, i6, i7, z2, z3, i8);
            } catch (OutOfMemoryError e) {
                i8 *= 2;
            }
        } while (i8 <= 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + "\r\n" + e.getMessage(), e);
    }

    /* JADX INFO: renamed from: d */
    public static a m12506d(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, int i8) throws Throwable {
        Bitmap bitmap;
        Bitmap bitmapM12509g;
        int i9;
        Bitmap bitmapM12508f;
        Rect rectM12517o = m12517o(fArr, i2, i3, z, i4, i5);
        int iWidth = i6 > 0 ? i6 : rectM12517o.width();
        int iHeight = i7 > 0 ? i7 : rectM12517o.height();
        Bitmap bitmap2 = null;
        try {
            a aVarM12512j = m12512j(context, uri, rectM12517o, iWidth, iHeight, i8);
            bitmap = aVarM12512j.f27977a;
            try {
                i9 = aVarM12512j.f27978b;
                bitmapM12509g = bitmap;
            } catch (Exception unused) {
                bitmapM12509g = bitmap;
                i9 = 1;
            }
        } catch (Exception unused2) {
            bitmap = null;
        }
        if (bitmapM12509g != null) {
            if (i > 0 || z2 || z3) {
                try {
                    Matrix matrix = new Matrix();
                    matrix.setRotate(i);
                    matrix.postScale(z2 ? -1.0f : 1.0f, z3 ? -1.0f : 1.0f);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM12509g, 0, 0, bitmapM12509g.getWidth(), bitmapM12509g.getHeight(), matrix, false);
                    if (bitmapCreateBitmap != bitmapM12509g) {
                        bitmapM12509g.recycle();
                    }
                    bitmapM12509g = bitmapCreateBitmap;
                } catch (OutOfMemoryError e) {
                    if (bitmapM12509g != null) {
                        bitmapM12509g.recycle();
                    }
                    throw e;
                }
            }
            if (i % 90 != 0) {
                bitmapM12509g = m12509g(bitmapM12509g, fArr, rectM12517o, i, z, i4, i5);
            }
            return new a(bitmapM12509g, i9);
        }
        try {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int iM12504b = m12504b(rectM12517o.width(), rectM12517o.height(), iWidth, iHeight) * i8;
                options.inSampleSize = iM12504b;
                Bitmap bitmapM12510h = m12510h(context.getContentResolver(), uri, options);
                if (bitmapM12510h != null) {
                    try {
                        int length = fArr.length;
                        float[] fArr2 = new float[length];
                        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                        for (int i10 = 0; i10 < length; i10++) {
                            fArr2[i10] = fArr2[i10] / options.inSampleSize;
                        }
                        bitmapM12508f = m12508f(bitmapM12510h, fArr2, i, z, i4, i5, 1.0f, z2, z3);
                        if (bitmapM12508f != bitmapM12510h) {
                            try {
                                bitmapM12510h.recycle();
                            } catch (OutOfMemoryError e2) {
                                e = e2;
                                bitmap2 = bitmapM12508f;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                }
                                throw e;
                            }
                        }
                    } catch (Throwable th) {
                        bitmapM12510h.recycle();
                        throw th;
                    }
                } else {
                    bitmapM12508f = null;
                }
                return new a(bitmapM12508f, iM12504b);
            } catch (Exception e3) {
                throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e3.getMessage(), e3);
            }
        } catch (OutOfMemoryError e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: e */
    public static a m12507e(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, boolean z2, boolean z3) {
        int i4 = 1;
        do {
            try {
                return new a(m12508f(bitmap, fArr, i, z, i2, i3, 1.0f / i4, z2, z3), i4);
            } catch (OutOfMemoryError e) {
                i4 *= 2;
            }
        } while (i4 <= 8);
        throw e;
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m12508f(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, float f, boolean z2, boolean z3) {
        float f2 = f;
        Rect rectM12517o = m12517o(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        float f3 = z2 ? -f2 : f2;
        if (z3) {
            f2 = -f2;
        }
        matrix.postScale(f3, f2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rectM12517o.left, rectM12517o.top, rectM12517o.width(), rectM12517o.height(), matrix, true);
        if (bitmapCreateBitmap == bitmap) {
            bitmapCreateBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i % 90 != 0 ? m12509g(bitmapCreateBitmap, fArr, rectM12517o, i, z, i2, i3) : bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: g */
    public static Bitmap m12509g(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(i);
        int i7 = (i < 90 || (i > 180 && i < 270)) ? rect.left : rect.right;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= fArr.length) {
                i4 = 0;
                i5 = 0;
                i6 = 0;
                break;
            }
            if (fArr[i9] >= i7 - 1 && fArr[i9] <= i7 + 1) {
                int i10 = i9 + 1;
                int iAbs = (int) Math.abs(Math.sin(radians) * ((double) (rect.bottom - fArr[i10])));
                int iAbs2 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i10] - rect.top)));
                int iAbs3 = (int) Math.abs(((double) (fArr[i10] - rect.top)) / Math.sin(radians));
                int iAbs4 = (int) Math.abs(((double) (rect.bottom - fArr[i10])) / Math.cos(radians));
                i6 = iAbs2;
                i5 = iAbs4;
                i4 = iAbs;
                i8 = iAbs3;
                break;
            }
            i9 += 2;
        }
        rect.set(i4, i6, i8 + i4, i5 + i6);
        if (z) {
            m12513k(rect, i2, i3);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != bitmapCreateBitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m12510h(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) throws FileNotFoundException {
        do {
            InputStream inputStreamOpenInputStream = null;
            try {
                try {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, f27970a, options);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return bitmapDecodeStream;
                } catch (Throwable th) {
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (OutOfMemoryError unused3) {
                options.inSampleSize *= 2;
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        } while (options.inSampleSize <= 512);
        throw new RuntimeException(outline.m1596r("Failed to decode image: ", uri));
    }

    /* JADX INFO: renamed from: i */
    public static a m12511i(Context context, Uri uri, int i, int i2) {
        InputStream inputStreamOpenInputStream;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            try {
                inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, f27970a, options);
                    options.inJustDecodeBounds = false;
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    int i3 = options.outWidth;
                    if (i3 == -1 && options.outHeight == -1) {
                        throw new RuntimeException("File is not a picture");
                    }
                    options.inSampleSize = Math.max(m12504b(i3, options.outHeight, i, i2), m12503a(options.outWidth, options.outHeight));
                    return new a(m12510h(contentResolver, uri, options), options.inSampleSize);
                } catch (Throwable th) {
                    th = th;
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamOpenInputStream = null;
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public static a m12512j(Context context, Uri uri, Rect rect, int i, int i2, int i3) throws Throwable {
        Throwable th;
        BitmapRegionDecoder bitmapRegionDecoder;
        Exception e;
        int i4;
        InputStream inputStream = null;
        BitmapRegionDecoder bitmapRegionDecoder2 = null;
        BitmapRegionDecoder bitmapRegionDecoder3 = null;
        inputStream = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i3 * m12504b(rect.width(), rect.height(), i, i2);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                do {
                    try {
                        try {
                            a aVar = new a(bitmapRegionDecoderNewInstance.decodeRegion(rect, options), options.inSampleSize);
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    inputStreamOpenInputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            bitmapRegionDecoderNewInstance.recycle();
                            return aVar;
                        } catch (OutOfMemoryError unused2) {
                            i4 = options.inSampleSize * 2;
                            options.inSampleSize = i4;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bitmapRegionDecoder2 = bitmapRegionDecoderNewInstance;
                        BitmapRegionDecoder bitmapRegionDecoder4 = bitmapRegionDecoder2;
                        inputStream = inputStreamOpenInputStream;
                        bitmapRegionDecoder = bitmapRegionDecoder4;
                        try {
                            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e.getMessage(), e);
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (bitmapRegionDecoder != null) {
                                throw th;
                            }
                            bitmapRegionDecoder.recycle();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bitmapRegionDecoder3 = bitmapRegionDecoderNewInstance;
                        BitmapRegionDecoder bitmapRegionDecoder5 = bitmapRegionDecoder3;
                        inputStream = inputStreamOpenInputStream;
                        bitmapRegionDecoder = bitmapRegionDecoder5;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (bitmapRegionDecoder != null) {
                            throw th;
                        }
                        bitmapRegionDecoder.recycle();
                        throw th;
                    }
                } while (i4 <= 512);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                if (bitmapRegionDecoderNewInstance != null) {
                    bitmapRegionDecoderNewInstance.recycle();
                }
                return new a(null, 1);
            } catch (Exception e3) {
                e = e3;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e4) {
            e = e4;
            bitmapRegionDecoder = null;
        } catch (Throwable th5) {
            th = th5;
            bitmapRegionDecoder = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m12513k(Rect rect, int i, int i2) {
        if (i != i2 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    /* JADX INFO: renamed from: l */
    public static float m12514l(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* JADX INFO: renamed from: m */
    public static float m12515m(float[] fArr) {
        return (m12519q(fArr) + m12520r(fArr)) / 2.0f;
    }

    /* JADX INFO: renamed from: n */
    public static float m12516n(float[] fArr) {
        return (m12521s(fArr) + m12514l(fArr)) / 2.0f;
    }

    /* JADX INFO: renamed from: o */
    public static Rect m12517o(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, m12519q(fArr))), Math.round(Math.max(0.0f, m12521s(fArr))), Math.round(Math.min(i, m12520r(fArr))), Math.round(Math.min(i2, m12514l(fArr))));
        if (z) {
            m12513k(rect, i3, i4);
        }
        return rect;
    }

    /* JADX INFO: renamed from: p */
    public static float m12518p(float[] fArr) {
        return m12514l(fArr) - m12521s(fArr);
    }

    /* JADX INFO: renamed from: q */
    public static float m12519q(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* JADX INFO: renamed from: r */
    public static float m12520r(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* JADX INFO: renamed from: s */
    public static float m12521s(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* JADX INFO: renamed from: t */
    public static float m12522t(float[] fArr) {
        return m12520r(fArr) - m12519q(fArr);
    }

    /* JADX INFO: renamed from: u */
    public static Bitmap m12523u(Bitmap bitmap, int i, int i2, int i3) {
        if (i > 0 && i2 > 0 && (i3 == 4 || i3 == 3 || i3 == 5)) {
            Bitmap bitmapCreateScaledBitmap = null;
            try {
                if (i3 == 5) {
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                } else {
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float fMax = Math.max(width / i, height / i2);
                    if (fMax > 1.0f || i3 == 4) {
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), false);
                    }
                }
                if (bitmapCreateScaledBitmap != null) {
                    if (bitmapCreateScaledBitmap != bitmap) {
                        bitmap.recycle();
                    }
                    return bitmapCreateScaledBitmap;
                }
            } catch (Exception e) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e);
            }
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: v */
    public static void m12524v(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i) throws FileNotFoundException {
        OutputStream outputStreamOpenOutputStream = null;
        try {
            outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri);
            bitmap.compress(compressFormat, i, outputStreamOpenOutputStream);
        } finally {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
