package p636z0.p770y;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.y.p, reason: use source file name */
/* JADX INFO: compiled from: NavType.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class NavType<T> {

    /* JADX INFO: renamed from: a */
    public static final NavType<Integer> f39068a = new c(false);

    /* JADX INFO: renamed from: b */
    public static final NavType<Integer> f39069b = new d(false);

    /* JADX INFO: renamed from: c */
    public static final NavType<int[]> f39070c = new e(true);

    /* JADX INFO: renamed from: d */
    public static final NavType<Long> f39071d = new f(false);

    /* JADX INFO: renamed from: e */
    public static final NavType<long[]> f39072e = new g(true);

    /* JADX INFO: renamed from: f */
    public static final NavType<Float> f39073f = new h(false);

    /* JADX INFO: renamed from: g */
    public static final NavType<float[]> f39074g = new i(true);

    /* JADX INFO: renamed from: h */
    public static final NavType<Boolean> f39075h = new j(false);

    /* JADX INFO: renamed from: i */
    public static final NavType<boolean[]> f39076i = new k(true);

    /* JADX INFO: renamed from: j */
    public static final NavType<String> f39077j = new a(true);

    /* JADX INFO: renamed from: k */
    public static final NavType<String[]> f39078k = new b(true);

    /* JADX INFO: renamed from: l */
    public final boolean f39079l;

    /* JADX INFO: renamed from: z0.y.p$a */
    /* JADX INFO: compiled from: NavType.java */
    public class a extends NavType<String> {
        public a(boolean z) {
            super(z);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public String mo16920a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return "string";
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public String mo16924e(String str) {
            return str;
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    /* JADX INFO: renamed from: z0.y.p$b */
    /* JADX INFO: compiled from: NavType.java */
    public class b extends NavType<String[]> {
        public b(boolean z) {
            super(z);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public String[] mo16920a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return "string[]";
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public String[] mo16924e(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    /* JADX INFO: renamed from: z0.y.p$c */
    /* JADX INFO: compiled from: NavType.java */
    public class c extends NavType<Integer> {
        public c(boolean z) {
            super(z);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public Integer mo16920a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return "integer";
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public Integer mo16924e(String str) {
            return str.startsWith("0x") ? Integer.valueOf(Integer.parseInt(str.substring(2), 16)) : Integer.valueOf(Integer.parseInt(str));
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* JADX INFO: renamed from: z0.y.p$d */
    /* JADX INFO: compiled from: NavType.java */
    public class d extends NavType<Integer> {
        public d(boolean z) {
            super(z);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public Integer mo16920a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return "reference";
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public Integer mo16924e(String str) {
            return str.startsWith("0x") ? Integer.valueOf(Integer.parseInt(str.substring(2), 16)) : Integer.valueOf(Integer.parseInt(str));
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* JADX INFO: renamed from: z0.y.p$e */
    /* JADX INFO: compiled from: NavType.java */
    public class e extends NavType<int[]> {
        public e(boolean z) {
            super(z);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public int[] mo16920a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return "integer[]";
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public int[] mo16924e(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    /* JADX INFO: renamed from: z0.y.p$f */
    /* JADX INFO: compiled from: NavType.java */
    public class f extends NavType<Long> {
        public f(boolean z) {
            super(z);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public Long mo16920a(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return "long";
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public Long mo16924e(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            return str.startsWith("0x") ? Long.valueOf(Long.parseLong(str.substring(2), 16)) : Long.valueOf(Long.parseLong(str));
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, Long l) {
            bundle.putLong(str, l.longValue());
        }
    }

    /* JADX INFO: renamed from: z0.y.p$g */
    /* JADX INFO: compiled from: NavType.java */
    public class g extends NavType<long[]> {
        public g(boolean z) {
            super(z);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public long[] mo16920a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return "long[]";
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public long[] mo16924e(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    /* JADX INFO: renamed from: z0.y.p$h */
    /* JADX INFO: compiled from: NavType.java */
    public class h extends NavType<Float> {
        public h(boolean z) {
            super(z);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public Float mo16920a(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return "float";
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public Float mo16924e(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, Float f) {
            bundle.putFloat(str, f.floatValue());
        }
    }

    /* JADX INFO: renamed from: z0.y.p$i */
    /* JADX INFO: compiled from: NavType.java */
    public class i extends NavType<float[]> {
        public i(boolean z) {
            super(z);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public float[] mo16920a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return "float[]";
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public float[] mo16924e(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    /* JADX INFO: renamed from: z0.y.p$j */
    /* JADX INFO: compiled from: NavType.java */
    public class j extends NavType<Boolean> {
        public j(boolean z) {
            super(z);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public Boolean mo16920a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return "boolean";
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public Boolean mo16924e(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: z0.y.p$k */
    /* JADX INFO: compiled from: NavType.java */
    public class k extends NavType<boolean[]> {
        public k(boolean z) {
            super(z);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public boolean[] mo16920a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return "boolean[]";
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public boolean[] mo16924e(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* JADX INFO: renamed from: z0.y.p$l */
    /* JADX INFO: compiled from: NavType.java */
    public static final class l<D extends Enum> extends p<D> {

        /* JADX INFO: renamed from: n */
        public final Class<D> f39080n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.f39080n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @Override // p636z0.p770y.NavType.p, p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return this.f39080n.getName();
        }

        @Override // p636z0.p770y.NavType.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D mo16924e(String str) {
            for (D d : this.f39080n.getEnumConstants()) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            StringBuilder sbM1562M = outline.m1562M("Enum value ", str, " not found for type ");
            sbM1562M.append(this.f39080n.getName());
            sbM1562M.append(".");
            throw new IllegalArgumentException(sbM1562M.toString());
        }
    }

    /* JADX INFO: renamed from: z0.y.p$m */
    /* JADX INFO: compiled from: NavType.java */
    public static final class m<D extends Parcelable> extends NavType<D[]> {

        /* JADX INFO: renamed from: m */
        public final Class<D[]> f39081m;

        public m(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
            try {
                this.f39081m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public Object mo16920a(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return this.f39081m.getName();
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public Object mo16924e(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            this.f39081m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            return this.f39081m.equals(((m) obj).f39081m);
        }

        public int hashCode() {
            return this.f39081m.hashCode();
        }
    }

    /* JADX INFO: renamed from: z0.y.p$n */
    /* JADX INFO: compiled from: NavType.java */
    public static final class n<D> extends NavType<D> {

        /* JADX INFO: renamed from: m */
        public final Class<D> f39082m;

        public n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f39082m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public D mo16920a(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return this.f39082m.getName();
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public D mo16924e(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, D d) {
            this.f39082m.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return this.f39082m.equals(((n) obj).f39082m);
        }

        public int hashCode() {
            return this.f39082m.hashCode();
        }
    }

    /* JADX INFO: renamed from: z0.y.p$o */
    /* JADX INFO: compiled from: NavType.java */
    public static final class o<D extends Serializable> extends NavType<D[]> {

        /* JADX INFO: renamed from: m */
        public final Class<D[]> f39083m;

        public o(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            try {
                this.f39083m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public Object mo16920a(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return this.f39083m.getName();
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: c */
        public Object mo16924e(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, Object obj) {
            ?? r4 = (Serializable[]) obj;
            this.f39083m.cast(r4);
            bundle.putSerializable(str, r4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o.class != obj.getClass()) {
                return false;
            }
            return this.f39083m.equals(((o) obj).f39083m);
        }

        public int hashCode() {
            return this.f39083m.hashCode();
        }
    }

    public NavType(boolean z) {
        this.f39079l = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo16920a(Bundle bundle, String str);

    /* JADX INFO: renamed from: b */
    public abstract String mo16921b();

    /* JADX INFO: renamed from: c */
    public abstract T mo16924e(String str);

    /* JADX INFO: renamed from: d */
    public abstract void mo16923d(Bundle bundle, String str, T t);

    public String toString() {
        return mo16921b();
    }

    /* JADX INFO: renamed from: z0.y.p$p */
    /* JADX INFO: compiled from: NavType.java */
    public static class p<D extends Serializable> extends NavType<D> {

        /* JADX INFO: renamed from: m */
        public final Class<D> f39084m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            if (!cls.isEnum()) {
                this.f39084m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: a */
        public Object mo16920a(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: b */
        public String mo16921b() {
            return this.f39084m.getName();
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: d */
        public void mo16923d(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            this.f39084m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        @Override // p636z0.p770y.NavType
        /* JADX INFO: renamed from: e */
        public D mo16924e(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                return this.f39084m.equals(((p) obj).f39084m);
            }
            return false;
        }

        public int hashCode() {
            return this.f39084m.hashCode();
        }

        public p(boolean z, Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f39084m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }
    }
}
