package p007c.p085g.p086a.p112s;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: c.g.a.s.j, reason: use source file name */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class Util4 {

    /* JADX INFO: renamed from: a */
    public static final char[] f3828a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    public static final char[] f3829b = new char[64];

    /* JADX INFO: renamed from: c.g.a.s.j$a */
    /* JADX INFO: compiled from: Util.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3830a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f3830a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3830a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3830a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3830a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3830a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2046a() {
        if (!m2053h()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2047b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: c */
    public static int m2048c(int i, int i2, Bitmap.Config config) {
        int i3 = i * i2;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i4 = a.f3830a[config.ordinal()];
        int i5 = 4;
        if (i4 == 1) {
            i5 = 1;
        } else if (i4 == 2 || i4 == 3) {
            i5 = 2;
        } else if (i4 == 4) {
            i5 = 8;
        }
        return i3 * i5;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: d */
    public static int m2049d(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* JADX INFO: renamed from: e */
    public static <T> List<T> m2050e(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static int m2051f(Object obj, int i) {
        return (i * 31) + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2052g() {
        return !m2053h();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2053h() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2054i(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (i2 > 0 || i2 == Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }
}
