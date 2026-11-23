package p636z0.p725k.p729e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat2;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat3;
import p636z0.p725k.p736i.FontsContractCompat2;

/* JADX INFO: renamed from: z0.k.e.e, reason: use source file name */
/* JADX INFO: compiled from: TypefaceCompatApi21Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl2 {

    /* JADX INFO: renamed from: b */
    public static Class<?> f37860b = null;

    /* JADX INFO: renamed from: c */
    public static Constructor<?> f37861c = null;

    /* JADX INFO: renamed from: d */
    public static Method f37862d = null;

    /* JADX INFO: renamed from: e */
    public static Method f37863e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f37864f = false;

    /* JADX INFO: renamed from: f */
    public static boolean m16176f(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m16177g();
        try {
            return ((Boolean) f37862d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m16177g() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f37864f) {
            return;
        }
        f37864f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f37861c = constructor;
        f37860b = cls;
        f37862d = method2;
        f37863e = method;
    }

    @Override // p636z0.p725k.p729e.TypefaceCompatBaseImpl2
    /* JADX INFO: renamed from: a */
    public Typeface mo16178a(Context context, FontResourcesParserCompat2 fontResourcesParserCompat2, Resources resources, int i) throws NoSuchMethodException {
        m16177g();
        try {
            Object objNewInstance = f37861c.newInstance(new Object[0]);
            for (FontResourcesParserCompat3 fontResourcesParserCompat3 : fontResourcesParserCompat2.f37822a) {
                File fileM16031B = C8162a.m16031B(context);
                if (fileM16031B == null) {
                    return null;
                }
                try {
                    if (!C8162a.m16069n(fileM16031B, resources, fontResourcesParserCompat3.f37828f)) {
                        return null;
                    }
                    if (!m16176f(objNewInstance, fileM16031B.getPath(), fontResourcesParserCompat3.f37824b, fontResourcesParserCompat3.f37825c)) {
                        return null;
                    }
                    fileM16031B.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM16031B.delete();
                }
            }
            m16177g();
            try {
                Object objNewInstance2 = Array.newInstance(f37860b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f37863e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p636z0.p725k.p729e.TypefaceCompatBaseImpl2
    /* JADX INFO: renamed from: b */
    public Typeface mo16179b(Context context, CancellationSignal cancellationSignal, FontsContractCompat2[] fontsContractCompat2Arr, int i) {
        File file;
        if (fontsContractCompat2Arr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(((FontsContractCompat2) TypefaceCompatBaseImpl2.m16195e(fontsContractCompat2Arr, i, new TypefaceCompatBaseImpl(this))).f37926a, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                    file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (ErrnoException unused) {
            }
            if (file != null && file.canRead()) {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceCreateFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                Typeface typefaceMo16192c = mo16192c(context, fileInputStream);
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceMo16192c;
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
