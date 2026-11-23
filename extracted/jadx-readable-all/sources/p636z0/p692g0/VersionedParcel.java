package p636z0.p692g0;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: z0.g0.b, reason: use source file name */
/* JADX INFO: compiled from: VersionedParcel.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class VersionedParcel {

    /* JADX INFO: renamed from: a */
    public final ArrayMap<String, Method> f36673a;

    /* JADX INFO: renamed from: b */
    public final ArrayMap<String, Method> f36674b;

    /* JADX INFO: renamed from: c */
    public final ArrayMap<String, Class> f36675c;

    public VersionedParcel(ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        this.f36673a = arrayMap;
        this.f36674b = arrayMap2;
        this.f36675c = arrayMap3;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo15622a();

    /* JADX INFO: renamed from: b */
    public abstract VersionedParcel mo15623b();

    /* JADX INFO: renamed from: c */
    public final Class m15624c(Class<? extends VersionedParcelable> cls) throws ClassNotFoundException {
        Class orDefault = this.f36675c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f36675c.put(cls.getName(), cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: d */
    public final Method m15625d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.f36673a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f36673a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final Method m15626e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.f36674b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class clsM15624c = m15624c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM15624c.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f36674b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo15627f();

    /* JADX INFO: renamed from: g */
    public abstract byte[] mo15628g();

    /* JADX INFO: renamed from: h */
    public abstract CharSequence mo15629h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo15630i(int i);

    /* JADX INFO: renamed from: j */
    public abstract int mo15631j();

    /* JADX INFO: renamed from: k */
    public int m15632k(int i, int i2) {
        return !mo15630i(i2) ? i : mo15631j();
    }

    /* JADX INFO: renamed from: l */
    public abstract <T extends Parcelable> T mo15633l();

    /* JADX INFO: renamed from: m */
    public <T extends Parcelable> T m15634m(T t, int i) {
        return !mo15630i(i) ? t : (T) mo15633l();
    }

    /* JADX INFO: renamed from: n */
    public abstract String mo15635n();

    /* JADX INFO: renamed from: o */
    public <T extends VersionedParcelable> T m15636o() {
        String strMo15635n = mo15635n();
        if (strMo15635n == null) {
            return null;
        }
        try {
            return (T) m15625d(strMo15635n).invoke(null, mo15623b());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo15637p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo15638q(boolean z);

    /* JADX INFO: renamed from: r */
    public abstract void mo15639r(byte[] bArr);

    /* JADX INFO: renamed from: s */
    public abstract void mo15640s(CharSequence charSequence);

    /* JADX INFO: renamed from: t */
    public abstract void mo15641t(int i);

    /* JADX INFO: renamed from: u */
    public abstract void mo15642u(Parcelable parcelable);

    /* JADX INFO: renamed from: v */
    public abstract void mo15643v(String str);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public void m15644w(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            mo15643v(null);
            return;
        }
        try {
            mo15643v(m15624c(versionedParcelable.getClass()).getName());
            VersionedParcel versionedParcelMo15623b = mo15623b();
            try {
                m15626e(versionedParcelable.getClass()).invoke(null, versionedParcelable, versionedParcelMo15623b);
                versionedParcelMo15623b.mo15622a();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}
