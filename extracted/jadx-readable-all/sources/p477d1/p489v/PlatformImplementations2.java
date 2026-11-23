package p477d1.p489v;

import p477d1.p481d0.Strings5;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.v.b, reason: use source file name */
/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PlatformImplementations2 {

    /* JADX INFO: renamed from: a */
    public static final PlatformImplementations f29559a;

    /* JADX WARN: Code duplicated, block: B:43:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        PlatformImplementations platformImplementations;
        Object objNewInstance;
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property != null) {
            int iM13011u = Strings5.m13011u(property, '.', 0, false, 6);
            try {
                if (iM13011u < 0) {
                    i = Integer.parseInt(property) * 65536;
                } else {
                    int i2 = iM13011u + 1;
                    int iM13011u2 = Strings5.m13011u(property, '.', i2, false, 4);
                    if (iM13011u2 < 0) {
                        iM13011u2 = property.length();
                    }
                    String strSubstring = property.substring(0, iM13011u);
                    Intrinsics2.m13088d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String strSubstring2 = property.substring(i2, iM13011u2);
                    Intrinsics2.m13088d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    i = (Integer.parseInt(strSubstring) * 65536) + Integer.parseInt(strSubstring2);
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i >= 65544) {
            try {
                try {
                    Object objNewInstance2 = Class.forName("d1.v.d.a").newInstance();
                    Intrinsics2.m13088d(objNewInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    try {
                        platformImplementations = (PlatformImplementations) objNewInstance2;
                    } catch (ClassCastException e) {
                        Throwable thInitCause = new ClassCastException("Instance classloader: " + objNewInstance2.getClass().getClassLoader() + ", base type classloader: " + PlatformImplementations.class.getClassLoader()).initCause(e);
                        Intrinsics2.m13088d(thInitCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw thInitCause;
                    }
                } catch (ClassNotFoundException unused2) {
                    if (i >= 65543) {
                        try {
                            objNewInstance = Class.forName("d1.v.c.a").newInstance();
                            Intrinsics2.m13088d(objNewInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                            try {
                                try {
                                    platformImplementations = (PlatformImplementations) objNewInstance;
                                } catch (ClassCastException e2) {
                                    Throwable thInitCause2 = new ClassCastException("Instance classloader: " + objNewInstance.getClass().getClassLoader() + ", base type classloader: " + PlatformImplementations.class.getClassLoader()).initCause(e2);
                                    Intrinsics2.m13088d(thInitCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                                    throw thInitCause2;
                                }
                            } catch (ClassNotFoundException unused3) {
                                platformImplementations = new PlatformImplementations();
                            }
                        } catch (ClassNotFoundException unused4) {
                            Object objNewInstance3 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                            Intrinsics2.m13088d(objNewInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                            try {
                                platformImplementations = (PlatformImplementations) objNewInstance3;
                            } catch (ClassCastException e3) {
                                Throwable thInitCause3 = new ClassCastException("Instance classloader: " + objNewInstance3.getClass().getClassLoader() + ", base type classloader: " + PlatformImplementations.class.getClassLoader()).initCause(e3);
                                Intrinsics2.m13088d(thInitCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                                throw thInitCause3;
                            }
                        }
                    } else {
                        platformImplementations = new PlatformImplementations();
                    }
                }
            } catch (ClassNotFoundException unused5) {
                Object objNewInstance4 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                Intrinsics2.m13088d(objNewInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    platformImplementations = (PlatformImplementations) objNewInstance4;
                } catch (ClassCastException e4) {
                    Throwable thInitCause4 = new ClassCastException("Instance classloader: " + objNewInstance4.getClass().getClassLoader() + ", base type classloader: " + PlatformImplementations.class.getClassLoader()).initCause(e4);
                    Intrinsics2.m13088d(thInitCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw thInitCause4;
                }
            }
        } else if (i >= 65543) {
            objNewInstance = Class.forName("d1.v.c.a").newInstance();
            Intrinsics2.m13088d(objNewInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
            platformImplementations = (PlatformImplementations) objNewInstance;
        } else {
            platformImplementations = new PlatformImplementations();
        }
        f29559a = platformImplementations;
    }
}
