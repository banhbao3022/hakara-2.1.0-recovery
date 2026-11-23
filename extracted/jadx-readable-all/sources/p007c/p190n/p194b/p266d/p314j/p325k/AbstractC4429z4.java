package p007c.p190n.p194b.p266d.p314j.p325k;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import p007c.p190n.p194b.p266d.p314j.p325k.C4280o4;

/* JADX INFO: renamed from: c.n.b.d.j.k.z4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4429z4<T extends C4280o4> {

    /* JADX INFO: renamed from: a */
    public static final Logger f23652a = Logger.getLogger(AbstractC4238l4.class.getName());

    /* JADX INFO: renamed from: b */
    public static String f23653b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* JADX INFO: renamed from: b */
    public static <T extends C4280o4> T m10341b(Class<T> cls) {
        String str;
        ClassLoader classLoader = AbstractC4429z4.class.getClassLoader();
        if (cls.equals(C4280o4.class)) {
            str = f23653b;
        } else {
            if (!cls.getPackage().equals(AbstractC4429z4.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((AbstractC4429z4) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m10342a());
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC4429z4.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC4429z4) it.next()).m10342a()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = f23652a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract T m10342a();
}
