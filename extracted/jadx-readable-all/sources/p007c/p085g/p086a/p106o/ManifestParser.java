package p007c.p085g.p086a.p106o;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.g.a.o.e, reason: use source file name */
/* JADX INFO: compiled from: ManifestParser.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ManifestParser {

    /* JADX INFO: renamed from: a */
    public final Context f3702a;

    public ManifestParser(Context context) {
        this.f3702a = context;
    }

    /* JADX INFO: renamed from: a */
    public static GlideModule m1963a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof GlideModule) {
                    return (GlideModule) objNewInstance;
                }
                throw new RuntimeException(outline.m1598t("Expected instanceof GlideModule, but found: ", objNewInstance));
            } catch (IllegalAccessException e) {
                m1964b(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                m1964b(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m1964b(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m1964b(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1964b(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}
