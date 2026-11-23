package p636z0.p644b.p646d.p647a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p636z0.p644b.p653h.ResourceManagerInternal;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p727d.p728c.ColorStateListInflaterCompat;
import p636z0.p725k.p727d.p728c.ResourcesCompat;

/* JADX INFO: renamed from: z0.b.d.a.a, reason: use source file name */
/* JADX INFO: compiled from: AppCompatResources.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class AppCompatResources {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f34589a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap<Context, SparseArray<a>> f34590b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c */
    public static final Object f34591c = new Object();

    /* JADX INFO: renamed from: z0.b.d.a.a$a */
    /* JADX INFO: compiled from: AppCompatResources.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final ColorStateList f34592a;

        /* JADX INFO: renamed from: b */
        public final Configuration f34593b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.f34592a = colorStateList;
            this.f34593b = configuration;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ColorStateList m14706a(Context context, int i) {
        ColorStateList colorStateListM16152a;
        ColorStateList colorStateList;
        ColorStateList colorStateListM16152a2;
        ColorStateList colorStateList2;
        ResourcesCompat.a aVar;
        a aVar2;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        synchronized (f34591c) {
            SparseArray<a> sparseArray = f34590b.get(context);
            colorStateListM16152a = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (aVar2 = sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (aVar2.f34593b.equals(context.getResources().getConfiguration())) {
                colorStateList = aVar2.f34592a;
            } else {
                sparseArray.remove(i);
                colorStateList = null;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = f34589a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 >= 28 && i2 <= 31) {
            colorStateListM16152a2 = null;
        } else {
            Resources resources2 = context.getResources();
            try {
                colorStateListM16152a2 = ColorStateListInflaterCompat.m16152a(resources2, resources2.getXml(i), context.getTheme());
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
                colorStateListM16152a2 = null;
            }
        }
        if (colorStateListM16152a2 != null) {
            synchronized (f34591c) {
                WeakHashMap<Context, SparseArray<a>> weakHashMap = f34590b;
                SparseArray<a> sparseArray2 = weakHashMap.get(context);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(context, sparseArray2);
                }
                sparseArray2.append(i, new a(colorStateListM16152a2, context.getResources().getConfiguration()));
            }
            return colorStateListM16152a2;
        }
        Object obj = ContextCompat.f37815a;
        Resources resources3 = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal2 = ResourcesCompat.f37835a;
        if (Build.VERSION.SDK_INT >= 23) {
            return resources3.getColorStateList(i, theme);
        }
        ResourcesCompat.b bVar = new ResourcesCompat.b(resources3, theme);
        synchronized (ResourcesCompat.f37837c) {
            SparseArray<ResourcesCompat.a> sparseArray3 = ResourcesCompat.f37836b.get(bVar);
            if (sparseArray3 == null || sparseArray3.size() <= 0 || (aVar = sparseArray3.get(i)) == null) {
                colorStateList2 = null;
            } else if (aVar.f37839b.equals(resources3.getConfiguration())) {
                colorStateList2 = aVar.f37838a;
            } else {
                sparseArray3.remove(i);
                colorStateList2 = null;
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal3 = ResourcesCompat.f37835a;
        TypedValue typedValue2 = threadLocal3.get();
        if (typedValue2 == null) {
            typedValue2 = new TypedValue();
            threadLocal3.set(typedValue2);
        }
        resources3.getValue(i, typedValue2, true);
        int i3 = typedValue2.type;
        if (!(i3 >= 28 && i3 <= 31)) {
            try {
                colorStateListM16152a = ColorStateListInflaterCompat.m16152a(resources3, resources3.getXml(i), theme);
            } catch (Exception e2) {
                Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListM16152a == null) {
            return resources3.getColorStateList(i);
        }
        synchronized (ResourcesCompat.f37837c) {
            WeakHashMap<ResourcesCompat.b, SparseArray<ResourcesCompat.a>> weakHashMap2 = ResourcesCompat.f37836b;
            SparseArray<ResourcesCompat.a> sparseArray4 = weakHashMap2.get(bVar);
            if (sparseArray4 == null) {
                sparseArray4 = new SparseArray<>();
                weakHashMap2.put(bVar, sparseArray4);
            }
            sparseArray4.append(i, new ResourcesCompat.a(colorStateListM16152a, bVar.f37840a.getConfiguration()));
        }
        return colorStateListM16152a;
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m14707b(Context context, int i) {
        return ResourceManagerInternal.m14931d().m14938f(context, i);
    }
}
