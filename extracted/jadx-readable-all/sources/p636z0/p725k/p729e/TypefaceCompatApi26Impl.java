package p636z0.p725k.p729e;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat2;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat3;
import p636z0.p725k.p736i.FontsContractCompat2;

/* JADX INFO: renamed from: z0.k.e.g, reason: use source file name */
/* JADX INFO: compiled from: TypefaceCompatApi26Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {

    /* JADX INFO: renamed from: g */
    public final Class<?> f37869g;

    /* JADX INFO: renamed from: h */
    public final Constructor<?> f37870h;

    /* JADX INFO: renamed from: i */
    public final Method f37871i;

    /* JADX INFO: renamed from: j */
    public final Method f37872j;

    /* JADX INFO: renamed from: k */
    public final Method f37873k;

    /* JADX INFO: renamed from: l */
    public final Method f37874l;

    /* JADX INFO: renamed from: m */
    public final Method f37875m;

    public TypefaceCompatApi26Impl() throws NoSuchMethodException {
        Method methodMo16191p;
        Method method;
        Constructor<?> constructor;
        Method methodM16189n;
        Method methodM16190o;
        Method method2;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            methodM16189n = m16189n(cls2);
            methodM16190o = m16190o(cls2);
            method2 = cls2.getMethod("freeze", new Class[0]);
            method = cls2.getMethod("abortCreation", new Class[0]);
            methodMo16191p = mo16191p(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sbM1556G = outline.m1556G("Unable to collect necessary methods for class ");
            sbM1556G.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sbM1556G.toString(), e);
            methodMo16191p = null;
            method = null;
            constructor = null;
            methodM16189n = null;
            methodM16190o = null;
            method2 = null;
        }
        this.f37869g = cls;
        this.f37870h = constructor;
        this.f37871i = methodM16189n;
        this.f37872j = methodM16190o;
        this.f37873k = method2;
        this.f37874l = method;
        this.f37875m = methodMo16191p;
    }

    /* JADX INFO: renamed from: m */
    private Object m16182m() {
        try {
            return this.f37870h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p636z0.p725k.p729e.TypefaceCompatApi21Impl, p636z0.p725k.p729e.TypefaceCompatBaseImpl2
    /* JADX INFO: renamed from: a */
    public Typeface mo16178a(Context context, FontResourcesParserCompat2 fontResourcesParserCompat2, Resources resources, int i) {
        if (!m16188l()) {
            return super.mo16178a(context, fontResourcesParserCompat2, resources, i);
        }
        Object objM16182m = m16182m();
        if (objM16182m == null) {
            return null;
        }
        for (FontResourcesParserCompat3 fontResourcesParserCompat3 : fontResourcesParserCompat2.f37822a) {
            if (!m16185i(context, objM16182m, fontResourcesParserCompat3.f37823a, fontResourcesParserCompat3.f37827e, fontResourcesParserCompat3.f37824b, fontResourcesParserCompat3.f37825c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontResourcesParserCompat3.f37826d))) {
                m16184h(objM16182m);
                return null;
            }
        }
        if (m16187k(objM16182m)) {
            return mo16186j(objM16182m);
        }
        return null;
    }

    @Override // p636z0.p725k.p729e.TypefaceCompatApi21Impl, p636z0.p725k.p729e.TypefaceCompatBaseImpl2
    /* JADX INFO: renamed from: b */
    public Typeface mo16179b(Context context, CancellationSignal cancellationSignal, FontsContractCompat2[] fontsContractCompat2Arr, int i) {
        Typeface typefaceMo16186j;
        boolean zBooleanValue;
        if (fontsContractCompat2Arr.length < 1) {
            return null;
        }
        if (!m16188l()) {
            FontsContractCompat2 fontsContractCompat2 = (FontsContractCompat2) TypefaceCompatBaseImpl2.m16195e(fontsContractCompat2Arr, i, new TypefaceCompatBaseImpl(this));
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fontsContractCompat2.f37926a, "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(fontsContractCompat2.f37928c).setItalic(fontsContractCompat2.f37929d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (FontsContractCompat2 fontsContractCompat3 : fontsContractCompat2Arr) {
            if (fontsContractCompat3.f37930e == 0) {
                Uri uri = fontsContractCompat3.f37926a;
                if (!map.containsKey(uri)) {
                    map.put(uri, C8162a.m16037H(context, cancellationSignal, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objM16182m = m16182m();
        if (objM16182m == null) {
            return null;
        }
        boolean z = false;
        for (FontsContractCompat2 fontsContractCompat4 : fontsContractCompat2Arr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(fontsContractCompat4.f37926a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f37872j.invoke(objM16182m, byteBuffer, Integer.valueOf(fontsContractCompat4.f37927b), null, Integer.valueOf(fontsContractCompat4.f37928c), Integer.valueOf(fontsContractCompat4.f37929d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    m16184h(objM16182m);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m16184h(objM16182m);
            return null;
        }
        if (m16187k(objM16182m) && (typefaceMo16186j = mo16186j(objM16182m)) != null) {
            return Typeface.create(typefaceMo16186j, i);
        }
        return null;
    }

    @Override // p636z0.p725k.p729e.TypefaceCompatBaseImpl2
    /* JADX INFO: renamed from: d */
    public Typeface mo16183d(Context context, Resources resources, int i, String str, int i2) {
        if (!m16188l()) {
            return super.mo16183d(context, resources, i, str, i2);
        }
        Object objM16182m = m16182m();
        if (objM16182m == null) {
            return null;
        }
        if (!m16185i(context, objM16182m, str, 0, -1, -1, null)) {
            m16184h(objM16182m);
            return null;
        }
        if (m16187k(objM16182m)) {
            return mo16186j(objM16182m);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m16184h(Object obj) {
        try {
            this.f37874l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m16185i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f37871i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public Typeface mo16186j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f37869g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f37875m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m16187k(Object obj) {
        try {
            return ((Boolean) this.f37873k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m16188l() {
        if (this.f37871i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f37871i != null;
    }

    /* JADX INFO: renamed from: n */
    public Method m16189n(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: o */
    public Method m16190o(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* JADX INFO: renamed from: p */
    public Method mo16191p(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
