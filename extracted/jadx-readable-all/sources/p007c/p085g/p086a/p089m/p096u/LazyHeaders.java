package p007c.p085g.p086a.p089m.p096u;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.g.a.m.u.j, reason: use source file name */
/* JADX INFO: compiled from: LazyHeaders.java */
/* JADX INFO: loaded from: classes.dex */
public final class LazyHeaders implements Headers {

    /* JADX INFO: renamed from: b */
    public final Map<String, List<LazyHeaderFactory>> f3417b;

    /* JADX INFO: renamed from: c */
    public volatile Map<String, String> f3418c;

    /* JADX INFO: renamed from: c.g.a.m.u.j$a */
    /* JADX INFO: compiled from: LazyHeaders.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final String f3419a;

        /* JADX INFO: renamed from: b */
        public static final Map<String, List<LazyHeaderFactory>> f3420b;

        /* JADX INFO: renamed from: c */
        public Map<String, List<LazyHeaderFactory>> f3421c = f3420b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char cCharAt = property.charAt(i);
                    if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            f3419a = property;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f3420b = Collections.unmodifiableMap(map);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.j$b */
    /* JADX INFO: compiled from: LazyHeaders.java */
    public static final class b implements LazyHeaderFactory {

        /* JADX INFO: renamed from: a */
        public final String f3422a;

        public b(String str) {
            this.f3422a = str;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.LazyHeaderFactory
        /* JADX INFO: renamed from: a */
        public String mo1859a() {
            return this.f3422a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f3422a.equals(((b) obj).f3422a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3422a.hashCode();
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("StringHeaderFactory{value='");
            sbM1556G.append(this.f3422a);
            sbM1556G.append('\'');
            sbM1556G.append('}');
            return sbM1556G.toString();
        }
    }

    public LazyHeaders(Map<String, List<LazyHeaderFactory>> map) {
        this.f3417b = Collections.unmodifiableMap(map);
    }

    @Override // p007c.p085g.p086a.p089m.p096u.Headers
    /* JADX INFO: renamed from: a */
    public Map<String, String> mo1858a() {
        if (this.f3418c == null) {
            synchronized (this) {
                if (this.f3418c == null) {
                    this.f3418c = Collections.unmodifiableMap(m1860b());
                }
            }
        }
        return this.f3418c;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m1860b() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<LazyHeaderFactory>> entry : this.f3417b.entrySet()) {
            List<LazyHeaderFactory> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String strMo1859a = value.get(i).mo1859a();
                if (!TextUtils.isEmpty(strMo1859a)) {
                    sb.append(strMo1859a);
                    if (i != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LazyHeaders) {
            return this.f3417b.equals(((LazyHeaders) obj).f3417b);
        }
        return false;
    }

    public int hashCode() {
        return this.f3417b.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("LazyHeaders{headers=");
        sbM1556G.append(this.f3417b);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
