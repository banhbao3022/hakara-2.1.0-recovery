package p636z0.p770y;

import android.annotation.SuppressLint;
import java.util.HashMap;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.y.r, reason: use source file name */
/* JADX INFO: compiled from: NavigatorProvider.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"TypeParameterUnusedInFormals"})
public class NavigatorProvider {

    /* JADX INFO: renamed from: a */
    public static final HashMap<Class<?>, String> f39085a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, Navigator<? extends NavDestination>> f39086b = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static String m16926b(Class<? extends Navigator> cls) {
        HashMap<Class<?>, String> map = f39085a;
        String strValue = map.get(cls);
        if (strValue == null) {
            Navigator.b bVar = (Navigator.b) cls.getAnnotation(Navigator.b.class);
            strValue = bVar != null ? bVar.value() : null;
            if (!m16927e(strValue)) {
                StringBuilder sbM1556G = outline.m1556G("No @Navigator.Name annotation found for ");
                sbM1556G.append(cls.getSimpleName());
                throw new IllegalArgumentException(sbM1556G.toString());
            }
            map.put(cls, strValue);
        }
        return strValue;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m16927e(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final Navigator<? extends NavDestination> m16928a(Navigator<? extends NavDestination> navigator) {
        String strM16926b = m16926b(navigator.getClass());
        if (m16927e(strM16926b)) {
            return this.f39086b.put(strM16926b, navigator);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* JADX INFO: renamed from: c */
    public final <T extends Navigator<?>> T m16929c(Class<T> cls) {
        return (T) m16930d(m16926b(cls));
    }

    /* JADX INFO: renamed from: d */
    public <T extends Navigator<?>> T m16930d(String str) {
        if (!m16927e(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator<? extends NavDestination> navigator = this.f39086b.get(str);
        if (navigator != null) {
            return navigator;
        }
        throw new IllegalStateException(outline.m1600v("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
