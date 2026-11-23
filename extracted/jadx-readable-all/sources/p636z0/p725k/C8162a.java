package p636z0.p725k;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.stetho.server.http.HttpStatus;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p727d.p728c.ComplexColorCompat;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat2;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat3;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat4;
import p636z0.p725k.p729e.PathParser2;
import p636z0.p725k.p729e.p730l.TintAwareDrawable;
import p636z0.p725k.p729e.p730l.WrappedDrawable;
import p636z0.p725k.p729e.p730l.WrappedDrawableApi21;
import p636z0.p725k.p736i.FontRequest;
import p636z0.p725k.p737j.PrecomputedTextCompat;
import p636z0.p725k.p742m.TextViewCompat;

/* JADX INFO: renamed from: z0.k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8162a {

    /* JADX INFO: renamed from: a */
    public static Method f37645a;

    /* JADX INFO: renamed from: b */
    public static boolean f37646b;

    /* JADX INFO: renamed from: c */
    public static Method f37647c;

    /* JADX INFO: renamed from: d */
    public static boolean f37648d;

    /* JADX INFO: renamed from: e */
    public static Field f37649e;

    /* JADX INFO: renamed from: f */
    public static boolean f37650f;

    /* JADX INFO: renamed from: g */
    public static Method f37651g;

    /* JADX INFO: renamed from: h */
    public static boolean f37652h;

    /* JADX INFO: renamed from: i */
    public static Field f37653i;

    /* JADX INFO: renamed from: j */
    public static boolean f37654j;

    /* JADX INFO: renamed from: A */
    public static String m16030A(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = 640;
        if (i >= 29) {
            i2 = 269222528;
        } else if (i >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: B */
    public static File m16031B(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder sbM1556G = outline.m1556G(".font");
        sbM1556G.append(Process.myPid());
        sbM1556G.append("-");
        sbM1556G.append(Process.myTid());
        sbM1556G.append("-");
        String string = sbM1556G.toString();
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, outline.m1590l(string, i));
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static PrecomputedTextCompat.a m16032C(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new PrecomputedTextCompat.a(textView.getTextMetricsParams());
        }
        PrecomputedTextCompat.a.C8571a c8571a = new PrecomputedTextCompat.a.C8571a(new TextPaint(textView.getPaint()));
        if (i >= 23) {
            c8571a.f37961c = textView.getBreakStrategy();
            c8571a.f37962d = textView.getHyphenationFrequency();
        }
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (textView.getInputType() & 15) != 3) {
            boolean z = textView.getLayoutDirection() == 1;
            switch (textView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    textDirectionHeuristic = !z ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        c8571a.f37960b = textDirectionHeuristic;
        return new PrecomputedTextCompat.a(c8571a.f37959a, textDirectionHeuristic, c8571a.f37961c, c8571a.f37962d);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m16033D(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m16034E(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: F */
    public static int m16035F(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* JADX INFO: renamed from: G */
    public static int m16036G(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: H */
    public static ByteBuffer m16037H(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: I */
    public static TypedArray m16038I(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: J */
    public static FontResourcesParserCompat m16039J(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C8163b.f37656b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(4);
            String string3 = typedArrayObtainAttributes.getString(5);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(2, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(3, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
            String string4 = typedArrayObtainAttributes.getString(6);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlPullParser.next() != 3) {
                    m16052W(xmlPullParser);
                }
                return new FontResourcesParserCompat4(new FontRequest(string, string2, string3, m16040K(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C8163b.f37657c);
                        int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i2 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
                        int i4 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
                        String string6 = typedArrayObtainAttributes2.getString(i4);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlPullParser.next() != 3) {
                            m16052W(xmlPullParser);
                        }
                        arrayList.add(new FontResourcesParserCompat3(string6, i, z, string5, i3, resourceId2));
                    } else {
                        m16052W(xmlPullParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new FontResourcesParserCompat2((FontResourcesParserCompat3[]) arrayList.toArray(new FontResourcesParserCompat3[arrayList.size()]));
            }
        } else {
            m16052W(xmlPullParser);
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static List<List<byte[]>> m16040K(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m16053X(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m16053X(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m16041L(TextView textView, int i) {
        m16062g(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m16042M(TextView textView, int i) {
        m16062g(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: N */
    public static boolean m16043N(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (!f37646b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f37645a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f37646b = true;
        }
        Method method = f37645a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f37645a = null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public static void m16044O(TextView textView, int i) {
        m16062g(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m16045P(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z);
            return;
        }
        if (!f37654j) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f37653i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            f37654j = true;
        }
        Field field = f37653i;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e2) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m16046Q(TextView textView, PrecomputedTextCompat precomputedTextCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Objects.requireNonNull(precomputedTextCompat);
            textView.setText((CharSequence) null);
            return;
        }
        PrecomputedTextCompat.a aVarM16032C = m16032C(textView);
        Objects.requireNonNull(precomputedTextCompat);
        if (!aVarM16032C.m16214a(null)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView.setText(precomputedTextCompat);
    }

    /* JADX INFO: renamed from: R */
    public static void m16047R(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m16048S(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* JADX INFO: renamed from: T */
    public static void m16049T(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* JADX INFO: renamed from: U */
    public static void m16050U(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX INFO: renamed from: V */
    public static void m16051V(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f37652h) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f37651g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f37652h = true;
        }
        Method method = f37651g;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public static void m16052W(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public static List<byte[]> m16053X(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Y */
    public static Drawable m16054Y(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof TintAwareDrawable)) ? new WrappedDrawableApi21(drawable) : drawable;
    }

    /* JADX INFO: renamed from: Z */
    public static ActionMode.Callback m16055Z(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof TextViewCompat) || callback == null) ? callback : new TextViewCompat(callback, textView);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX INFO: renamed from: a */
    public static boolean m16056a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean z;
        int i2;
        int i3;
        boolean zM16057b = m16057b(i, rect, rect2);
        if (m16057b(i, rect, rect3) || !zM16057b) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (rect.right <= rect3.left) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (rect.top >= rect3.bottom) {
                z = true;
            } else {
                z = false;
            }
        } else if (rect.left >= rect3.right) {
            z = true;
        } else {
            z = false;
        }
        if (!z || i == 17 || i == 66) {
            return true;
        }
        int iM16035F = m16035F(i, rect, rect2);
        if (i == 17) {
            i2 = rect.left;
            i3 = rect3.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect3.top;
        } else if (i == 66) {
            i2 = rect3.right;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect3.bottom;
            i3 = rect.bottom;
        }
        return iM16035F < Math.max(1, i2 - i3);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16057b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: c */
    public static void m16058c(Object obj, StringBuilder sb) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16059d(PathParser2[] pathParser2Arr, PathParser2[] pathParser2Arr2) {
        if (pathParser2Arr == null || pathParser2Arr2 == null || pathParser2Arr.length != pathParser2Arr2.length) {
            return false;
        }
        for (int i = 0; i < pathParser2Arr.length; i++) {
            if (pathParser2Arr[i].f37855a != pathParser2Arr2[i].f37855a || pathParser2Arr[i].f37856b.length != pathParser2Arr2[i].f37856b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m16060e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m16061f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m16062g(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: h */
    public static <T> T m16063h(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: i */
    public static int m16064i(Context context, String str) {
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        int i = Build.VERSION.SDK_INT;
        String strPermissionToOp = i >= 23 ? AppOpsManager.permissionToOp(str) : null;
        if (strPermissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if ((i >= 23 ? ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName) : 1) != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public static void m16065j(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m16066k(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static void m16067l(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m16067l(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof WrappedDrawable) {
            m16067l(((WrappedDrawable) drawable).mo16197b());
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Drawable child = drawableContainerState.getChild(i);
            if (child != null) {
                m16067l(child);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static float[] m16068m(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m16069n(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zM16070o = m16070o(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zM16070o;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m16070o(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098 A[Catch: NumberFormatException -> 0x00ba, LOOP:3: B:29:0x006d->B:49:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b2), top: B:71:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x009d A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b2), top: B:71:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b2), top: B:71:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (r13 == false) goto L42;
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p636z0.p725k.p729e.PathParser2[] m16071p(java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p636z0.p725k.C8162a.m16071p(java.lang.String):z0.k.e.c[]");
    }

    /* JADX INFO: renamed from: q */
    public static Path m16072q(String str) {
        Path path = new Path();
        PathParser2[] pathParser2ArrM16071p = m16071p(str);
        if (pathParser2ArrM16071p == null) {
            return null;
        }
        try {
            PathParser2.m16170b(pathParser2ArrM16071p, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(outline.m1599u("Error in parsing ", str), e);
        }
    }

    /* JADX INFO: renamed from: r */
    public static PathParser2[] m16073r(PathParser2[] pathParser2Arr) {
        if (pathParser2Arr == null) {
            return null;
        }
        PathParser2[] pathParser2Arr2 = new PathParser2[pathParser2Arr.length];
        for (int i = 0; i < pathParser2Arr.length; i++) {
            pathParser2Arr2[i] = new PathParser2(pathParser2Arr[i]);
        }
        return pathParser2Arr2;
    }

    /* JADX INFO: renamed from: s */
    public static Drawable m16074s(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f37650f) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f37649e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f37650f = true;
        }
        Field field = f37649e;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f37649e = null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static int m16075t(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!f37648d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f37647c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f37648d = true;
        }
        Method method = f37647c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                f37647c = null;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public static ComplexColorCompat m16076u(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        ComplexColorCompat complexColorCompatM16154a;
        if (m16033D(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new ComplexColorCompat(null, null, typedValue.data);
            }
            try {
                complexColorCompatM16154a = ComplexColorCompat.m16154a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                complexColorCompatM16154a = null;
            }
            if (complexColorCompatM16154a != null) {
                return complexColorCompatM16154a;
            }
        }
        return new ComplexColorCompat(null, null, i2);
    }

    /* JADX INFO: renamed from: v */
    public static int m16077v(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m16033D(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* JADX INFO: renamed from: w */
    public static int m16078w(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m16033D(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* JADX INFO: renamed from: x */
    public static String m16079x(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m16033D(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static Intent m16080y(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM16030A = m16030A(activity, activity.getComponentName());
            if (strM16030A == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strM16030A);
            try {
                return m16030A(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM16030A + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: z */
    public static Intent m16081z(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM16030A = m16030A(context, componentName);
        if (strM16030A == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM16030A);
        return m16030A(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }
}
