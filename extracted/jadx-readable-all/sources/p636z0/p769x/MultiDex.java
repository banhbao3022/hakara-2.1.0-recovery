package p636z0.p769x;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.x.a, reason: use source file name */
/* JADX INFO: compiled from: MultiDex.java */
/* JADX INFO: loaded from: classes.dex */
public final class MultiDex {

    /* JADX INFO: renamed from: a */
    public static final Set<File> f38973a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static final boolean f38974b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (strNextToken != null && strNextToken2 != null) {
                try {
                    int i = Integer.parseInt(strNextToken);
                    int i2 = Integer.parseInt(strNextToken2);
                    if (i > 2 || (i == 2 && i2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sbM1561L = outline.m1561L("VM with version ", property);
        sbM1561L.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sbM1561L.toString());
        f38974b = z;
    }

    /* JADX INFO: renamed from: a */
    public static void m16889a(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field fieldM16892d = m16892d(obj, str);
        Object[] objArr2 = (Object[]) fieldM16892d.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldM16892d.set(obj, objArr3);
    }

    /* JADX INFO: renamed from: b */
    public static void m16890b(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sbM1556G = outline.m1556G("Clearing old secondary dex dir (");
            sbM1556G.append(file.getPath());
            sbM1556G.append(").");
            Log.i("MultiDex", sbM1556G.toString());
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                StringBuilder sbM1556G2 = outline.m1556G("Failed to list secondary dex dir content (");
                sbM1556G2.append(file.getPath());
                sbM1556G2.append(").");
                Log.w("MultiDex", sbM1556G2.toString());
                return;
            }
            for (File file2 : fileArrListFiles) {
                StringBuilder sbM1556G3 = outline.m1556G("Trying to delete old file ");
                sbM1556G3.append(file2.getPath());
                sbM1556G3.append(" of size ");
                sbM1556G3.append(file2.length());
                Log.i("MultiDex", sbM1556G3.toString());
                if (file2.delete()) {
                    StringBuilder sbM1556G4 = outline.m1556G("Deleted old file ");
                    sbM1556G4.append(file2.getPath());
                    Log.i("MultiDex", sbM1556G4.toString());
                } else {
                    StringBuilder sbM1556G5 = outline.m1556G("Failed to delete old file ");
                    sbM1556G5.append(file2.getPath());
                    Log.w("MultiDex", sbM1556G5.toString());
                }
            }
            if (file.delete()) {
                StringBuilder sbM1556G6 = outline.m1556G("Deleted old secondary dex dir ");
                sbM1556G6.append(file.getPath());
                Log.i("MultiDex", sbM1556G6.toString());
            } else {
                StringBuilder sbM1556G7 = outline.m1556G("Failed to delete secondary dex dir ");
                sbM1556G7.append(file.getPath());
                Log.w("MultiDex", sbM1556G7.toString());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m16891c(Context context, File file, File file2, String str, String str2, boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        ClassLoader classLoader;
        Set<File> set = f38973a;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
            IOException e = null;
            try {
                classLoader = context.getClassLoader();
                if (!(classLoader instanceof BaseDexClassLoader)) {
                    Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                    classLoader = null;
                }
            } catch (RuntimeException e2) {
                Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e2);
            }
            if (classLoader == null) {
                return;
            }
            try {
                m16890b(context);
            } catch (Throwable th) {
                Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
            }
            File file3 = new File(file2, "code_cache");
            try {
                m16894f(file3);
            } catch (IOException unused) {
                file3 = new File(context.getFilesDir(), "code_cache");
                m16894f(file3);
            }
            File file4 = new File(file3, str);
            m16894f(file4);
            MultiDexExtractor2 multiDexExtractor2 = new MultiDexExtractor2(file, file4);
            try {
                try {
                    m16893e(classLoader, file4, multiDexExtractor2.m16902u(context, str2, false));
                } catch (IOException e3) {
                    if (!z) {
                        throw e3;
                    }
                    Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e3);
                    m16893e(classLoader, file4, multiDexExtractor2.m16902u(context, str2, true));
                }
                try {
                    multiDexExtractor2.close();
                } catch (IOException e4) {
                    e = e4;
                }
                if (e != null) {
                    throw e;
                }
            } catch (Throwable th2) {
                try {
                    multiDexExtractor2.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static Field m16892d(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder sbM1562M = outline.m1562M("Field ", str, " not found in ");
        sbM1562M.append(obj.getClass());
        throw new NoSuchFieldException(sbM1562M.toString());
    }

    /* JADX INFO: renamed from: e */
    public static void m16893e(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod;
        IOException[] iOExceptionArr;
        if (list.isEmpty()) {
            return;
        }
        Object obj = m16892d(classLoader, "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        Class<?> superclass = obj.getClass();
        while (true) {
            if (superclass == null) {
                StringBuilder sbM1562M = outline.m1562M("Method ", "makeDexElements", " with parameters ");
                sbM1562M.append(Arrays.asList(clsArr));
                sbM1562M.append(" not found in ");
                sbM1562M.append(obj.getClass());
                throw new NoSuchMethodException(sbM1562M.toString());
            }
            try {
                declaredMethod = superclass.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                    break;
                }
                break;
            } catch (NoSuchMethodException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        m16889a(obj, "dexElements", (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList));
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
            }
            Field fieldM16892d = m16892d(obj, "dexElementsSuppressedExceptions");
            IOException[] iOExceptionArr2 = (IOException[]) fieldM16892d.get(obj);
            if (iOExceptionArr2 == null) {
                iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
            } else {
                IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                arrayList.toArray(iOExceptionArr3);
                System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                iOExceptionArr = iOExceptionArr3;
            }
            fieldM16892d.set(obj, iOExceptionArr);
            IOException iOException = new IOException("I/O exception during makeDexElement");
            iOException.initCause((Throwable) arrayList.get(0));
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m16894f(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            StringBuilder sbM1556G = outline.m1556G("Failed to create dir ");
            sbM1556G.append(file.getPath());
            sbM1556G.append(". Parent file is null.");
            Log.e("MultiDex", sbM1556G.toString());
        } else {
            StringBuilder sbM1556G2 = outline.m1556G("Failed to create dir ");
            sbM1556G2.append(file.getPath());
            sbM1556G2.append(". parent file is a dir ");
            sbM1556G2.append(parentFile.isDirectory());
            sbM1556G2.append(", a file ");
            sbM1556G2.append(parentFile.isFile());
            sbM1556G2.append(", exists ");
            sbM1556G2.append(parentFile.exists());
            sbM1556G2.append(", readable ");
            sbM1556G2.append(parentFile.canRead());
            sbM1556G2.append(", writable ");
            sbM1556G2.append(parentFile.canWrite());
            Log.e("MultiDex", sbM1556G2.toString());
        }
        StringBuilder sbM1556G3 = outline.m1556G("Failed to create directory ");
        sbM1556G3.append(file.getPath());
        throw new IOException(sbM1556G3.toString());
    }
}
