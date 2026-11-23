package p623k1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p509g1.Headers2;
import p509g1.HttpUrl;
import p509g1.MediaType2;

/* JADX INFO: renamed from: k1.x, reason: use source file name */
/* JADX INFO: compiled from: RequestFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class RequestFactory {

    /* JADX INFO: renamed from: a */
    public final Method f33256a;

    /* JADX INFO: renamed from: b */
    public final HttpUrl f33257b;

    /* JADX INFO: renamed from: c */
    public final String f33258c;

    /* JADX INFO: renamed from: d */
    public final String f33259d;

    /* JADX INFO: renamed from: e */
    public final Headers2 f33260e;

    /* JADX INFO: renamed from: f */
    public final MediaType2 f33261f;

    /* JADX INFO: renamed from: g */
    public final boolean f33262g;

    /* JADX INFO: renamed from: h */
    public final boolean f33263h;

    /* JADX INFO: renamed from: i */
    public final boolean f33264i;

    /* JADX INFO: renamed from: j */
    public final ParameterHandler3<?>[] f33265j;

    /* JADX INFO: renamed from: k */
    public final boolean f33266k;

    /* JADX INFO: renamed from: k1.x$a */
    /* JADX INFO: compiled from: RequestFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final Pattern f33267a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: b */
        public static final Pattern f33268b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: c */
        public final Retrofit f33269c;

        /* JADX INFO: renamed from: d */
        public final Method f33270d;

        /* JADX INFO: renamed from: e */
        public final Annotation[] f33271e;

        /* JADX INFO: renamed from: f */
        public final Annotation[][] f33272f;

        /* JADX INFO: renamed from: g */
        public final Type[] f33273g;

        /* JADX INFO: renamed from: h */
        public boolean f33274h;

        /* JADX INFO: renamed from: i */
        public boolean f33275i;

        /* JADX INFO: renamed from: j */
        public boolean f33276j;

        /* JADX INFO: renamed from: k */
        public boolean f33277k;

        /* JADX INFO: renamed from: l */
        public boolean f33278l;

        /* JADX INFO: renamed from: m */
        public boolean f33279m;

        /* JADX INFO: renamed from: n */
        public boolean f33280n;

        /* JADX INFO: renamed from: o */
        public boolean f33281o;

        /* JADX INFO: renamed from: p */
        public String f33282p;

        /* JADX INFO: renamed from: q */
        public boolean f33283q;

        /* JADX INFO: renamed from: r */
        public boolean f33284r;

        /* JADX INFO: renamed from: s */
        public boolean f33285s;

        /* JADX INFO: renamed from: t */
        public String f33286t;

        /* JADX INFO: renamed from: u */
        public Headers2 f33287u;

        /* JADX INFO: renamed from: v */
        public MediaType2 f33288v;

        /* JADX INFO: renamed from: w */
        public Set<String> f33289w;

        /* JADX INFO: renamed from: x */
        public ParameterHandler3<?>[] f33290x;

        /* JADX INFO: renamed from: y */
        public boolean f33291y;

        public a(Retrofit retrofit, Method method) {
            this.f33269c = retrofit;
            this.f33270d = method;
            this.f33271e = method.getAnnotations();
            this.f33273g = method.getGenericParameterTypes();
            this.f33272f = method.getParameterAnnotations();
        }

        /* JADX INFO: renamed from: a */
        public static Class<?> m14311a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        /* JADX INFO: renamed from: b */
        public final void m14312b(String str, String str2, boolean z) {
            String str3 = this.f33282p;
            if (str3 != null) {
                throw Utils8.m14290j(this.f33270d, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f33282p = str;
            this.f33283q = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f33267a.matcher(strSubstring).find()) {
                    throw Utils8.m14290j(this.f33270d, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f33286t = str2;
            Matcher matcher = f33267a.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f33289w = linkedHashSet;
        }

        /* JADX INFO: renamed from: c */
        public final void m14313c(int i, Type type) {
            if (Utils8.m14288h(type)) {
                throw Utils8.m14292l(this.f33270d, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public RequestFactory(a aVar) {
        this.f33256a = aVar.f33270d;
        this.f33257b = aVar.f33269c.f33116c;
        this.f33258c = aVar.f33282p;
        this.f33259d = aVar.f33286t;
        this.f33260e = aVar.f33287u;
        this.f33261f = aVar.f33288v;
        this.f33262g = aVar.f33283q;
        this.f33263h = aVar.f33284r;
        this.f33264i = aVar.f33285s;
        this.f33265j = aVar.f33290x;
        this.f33266k = aVar.f33291y;
    }
}
