package p636z0.p725k.p729e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat2;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat3;
import p636z0.p725k.p736i.FontsContractCompat2;

/* JADX INFO: renamed from: z0.k.e.f, reason: use source file name */
/* JADX INFO: compiled from: TypefaceCompatApi24Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatApi24Impl extends TypefaceCompatBaseImpl2 {

    /* JADX INFO: renamed from: b */
    public static final Class<?> f37865b;

    /* JADX INFO: renamed from: c */
    public static final Constructor<?> f37866c;

    /* JADX INFO: renamed from: d */
    public static final Method f37867d;

    /* JADX INFO: renamed from: e */
    public static final Method f37868e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f37866c = constructor;
        f37865b = cls;
        f37867d = method2;
        f37868e = method;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16180f(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f37867d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Typeface m16181g(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f37865b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f37868e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p636z0.p725k.p729e.TypefaceCompatBaseImpl2
    /* JADX INFO: renamed from: a */
    public Typeface mo16178a(Context context, FontResourcesParserCompat2 fontResourcesParserCompat2, Resources resources, int i) {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f37866c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (FontResourcesParserCompat3 fontResourcesParserCompat3 : fontResourcesParserCompat2.f37822a) {
            int i2 = fontResourcesParserCompat3.f37828f;
            File fileM16031B = C8162a.m16031B(context);
            if (fileM16031B == null) {
                map = null;
            } else {
                try {
                    if (C8162a.m16069n(fileM16031B, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(fileM16031B);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                fileM16031B.delete();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                            map = null;
                        }
                    } else {
                        fileM16031B.delete();
                        map = null;
                    }
                } catch (Throwable th3) {
                    fileM16031B.delete();
                    throw th3;
                }
            }
            if (map == null || !m16180f(objNewInstance, map, fontResourcesParserCompat3.f37827e, fontResourcesParserCompat3.f37824b, fontResourcesParserCompat3.f37825c)) {
                return null;
            }
        }
        return m16181g(objNewInstance);
    }

    @Override // p636z0.p725k.p729e.TypefaceCompatBaseImpl2
    /* JADX INFO: renamed from: b */
    public Typeface mo16179b(Context context, CancellationSignal cancellationSignal, FontsContractCompat2[] fontsContractCompat2Arr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = f37866c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        for (FontsContractCompat2 fontsContractCompat2 : fontsContractCompat2Arr) {
            Uri uri = fontsContractCompat2.f37926a;
            ByteBuffer byteBufferM16037H = (ByteBuffer) simpleArrayMap.get(uri);
            if (byteBufferM16037H == null) {
                byteBufferM16037H = C8162a.m16037H(context, cancellationSignal, uri);
                simpleArrayMap.put(uri, byteBufferM16037H);
            }
            if (byteBufferM16037H == null || !m16180f(objNewInstance, byteBufferM16037H, fontsContractCompat2.f37927b, fontsContractCompat2.f37928c, fontsContractCompat2.f37929d)) {
                return null;
            }
        }
        Typeface typefaceM16181g = m16181g(objNewInstance);
        if (typefaceM16181g == null) {
            return null;
        }
        return Typeface.create(typefaceM16181g, i);
    }
}
