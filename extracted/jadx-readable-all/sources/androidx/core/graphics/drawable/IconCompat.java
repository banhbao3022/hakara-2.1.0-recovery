package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: a */
    public static final PorterDuff.Mode f674a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public int f675b;

    /* JADX INFO: renamed from: c */
    public Object f676c;

    /* JADX INFO: renamed from: d */
    public byte[] f677d;

    /* JADX INFO: renamed from: e */
    public Parcelable f678e;

    /* JADX INFO: renamed from: f */
    public int f679f;

    /* JADX INFO: renamed from: g */
    public int f680g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f681h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f682i;

    /* JADX INFO: renamed from: j */
    public String f683j;

    /* JADX INFO: renamed from: k */
    public String f684k;

    public IconCompat() {
        this.f675b = -1;
        this.f677d = null;
        this.f678e = null;
        this.f679f = 0;
        this.f680g = 0;
        this.f681h = null;
        this.f682i = f674a;
        this.f683j = null;
    }

    /* JADX INFO: renamed from: b */
    public static IconCompat m343b(Icon icon) {
        Objects.requireNonNull(icon);
        int iM348j = m348j(icon);
        if (iM348j == 2) {
            return m345d(null, m347h(icon), m346f(icon));
        }
        if (iM348j == 4) {
            Uri uriM349l = m349l(icon);
            if (uriM349l == null) {
                throw new IllegalArgumentException("Uri must not be null.");
            }
            String string = uriM349l.toString();
            if (string == null) {
                throw new IllegalArgumentException("Uri must not be null.");
            }
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f676c = string;
            return iconCompat;
        }
        if (iM348j != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f676c = icon;
            return iconCompat2;
        }
        Uri uriM349l2 = m349l(icon);
        if (uriM349l2 == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
        String string2 = uriM349l2.toString();
        if (string2 == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f676c = string2;
        return iconCompat3;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m344c(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2, (-(bitmap.getHeight() - iMin)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: d */
    public static IconCompat m345d(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f679f = i;
        if (resources != null) {
            try {
                iconCompat.f676c = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f676c = str;
        }
        iconCompat.f684k = str;
        return iconCompat;
    }

    /* JADX INFO: renamed from: f */
    public static int m346f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m347h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m348j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        }
    }

    /* JADX INFO: renamed from: l */
    public static Uri m349l(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m350e() {
        int i = this.f675b;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m346f((Icon) this.f676c);
        }
        if (i == 2) {
            return this.f679f;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* JADX INFO: renamed from: g */
    public String m351g() {
        int i = this.f675b;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m347h((Icon) this.f676c);
        }
        if (i == 2) {
            return TextUtils.isEmpty(this.f684k) ? ((String) this.f676c).split(":", -1)[0] : this.f684k;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* JADX INFO: renamed from: i */
    public int m352i() {
        int i = this.f675b;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : m348j((Icon) this.f676c);
    }

    /* JADX INFO: renamed from: k */
    public Uri m353k() {
        int i = this.f675b;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m349l((Icon) this.f676c);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f676c);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX INFO: renamed from: m */
    public InputStream m354m(Context context) {
        Uri uriM353k = m353k();
        String scheme = uriM353k.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM353k);
            } catch (Exception e) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriM353k, e);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f676c));
        } catch (FileNotFoundException e2) {
            Log.w("IconCompat", "Unable to load image from path: " + uriM353k, e2);
            return null;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public Icon m355n() {
        return m356o(null);
    }

    /* JADX INFO: renamed from: o */
    public Icon m356o(Context context) {
        Icon iconCreateWithBitmap;
        switch (this.f675b) {
            case -1:
                return (Icon) this.f676c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f676c);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(m351g(), this.f679f);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f676c, this.f679f, this.f680g);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f676c);
                break;
            case 5:
                iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(m344c((Bitmap) this.f676c, false)) : Icon.createWithAdaptiveBitmap((Bitmap) this.f676c);
                break;
            case 6:
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmapContentUri(m353k());
                } else {
                    if (context == null) {
                        StringBuilder sbM1556G = outline.m1556G("Context is required to resolve the file uri of the icon: ");
                        sbM1556G.append(m353k());
                        throw new IllegalArgumentException(sbM1556G.toString());
                    }
                    InputStream inputStreamM354m = m354m(context);
                    if (inputStreamM354m == null) {
                        StringBuilder sbM1556G2 = outline.m1556G("Cannot load adaptive icon from uri: ");
                        sbM1556G2.append(m353k());
                        throw new IllegalStateException(sbM1556G2.toString());
                    }
                    if (i < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(m344c(BitmapFactory.decodeStream(inputStreamM354m), false));
                    } else {
                        iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamM354m));
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f681h;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f682i;
        if (mode != f674a) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public String toString() {
        String str;
        if (this.f675b == -1) {
            return String.valueOf(this.f676c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f675b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f675b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f676c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f676c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f684k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m350e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f679f);
                if (this.f680g != 0) {
                    sb.append(" off=");
                    sb.append(this.f680g);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f676c);
                break;
        }
        if (this.f681h != null) {
            sb.append(" tint=");
            sb.append(this.f681h);
        }
        if (this.f682i != f674a) {
            sb.append(" mode=");
            sb.append(this.f682i);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f675b = -1;
        this.f677d = null;
        this.f678e = null;
        this.f679f = 0;
        this.f680g = 0;
        this.f681h = null;
        this.f682i = f674a;
        this.f683j = null;
        this.f675b = i;
    }
}
