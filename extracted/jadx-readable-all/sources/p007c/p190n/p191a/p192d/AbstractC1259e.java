package p007c.p190n.p191a.p192d;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.a.d.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC1259e {

    /* JADX INFO: renamed from: c.n.a.d.e$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static final class a extends Exception {
        public a(@RecentlyNonNull String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: c.n.a.d.e$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        @RecentlyNonNull
        String name();

        boolean required() default true;
    }

    /* JADX INFO: renamed from: a */
    public void m2732a(@RecentlyNonNull Map<String, String> map) throws a {
        HashMap map2 = new HashMap();
        for (Field field : getClass().getFields()) {
            b bVar = (b) field.getAnnotation(b.class);
            if (bVar != null) {
                map2.put(bVar.name(), field);
            }
        }
        if (map2.isEmpty()) {
            C2622l.m5226A3("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Field field2 = (Field) map2.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException unused) {
                    String key = entry.getKey();
                    StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 49);
                    sb.append("Server option \"");
                    sb.append(key);
                    sb.append("\" could not be set: Illegal Access");
                    C2622l.m5226A3(sb.toString());
                } catch (IllegalArgumentException unused2) {
                    String key2 = entry.getKey();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(key2).length() + 43);
                    sb2.append("Server option \"");
                    sb2.append(key2);
                    sb2.append("\" could not be set: Bad Type");
                    C2622l.m5226A3(sb2.toString());
                }
            } else {
                String key3 = entry.getKey();
                String value = entry.getValue();
                StringBuilder sb3 = new StringBuilder(String.valueOf(key3).length() + 31 + String.valueOf(value).length());
                outline.m1572W(sb3, "Unexpected server option: ", key3, " = \"", value);
                sb3.append("\"");
                C2622l.m5318U2(sb3.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder();
        for (Field field3 : map2.values()) {
            if (((b) field3.getAnnotation(b.class)).required()) {
                String strValueOf = String.valueOf(((b) field3.getAnnotation(b.class)).name());
                C2622l.m5226A3(strValueOf.length() != 0 ? "Required server option missing: ".concat(strValueOf) : new String("Required server option missing: "));
                if (sb4.length() > 0) {
                    sb4.append(", ");
                }
                sb4.append(((b) field3.getAnnotation(b.class)).name());
            }
        }
        if (sb4.length() > 0) {
            String strValueOf2 = String.valueOf(sb4.toString());
            throw new a(strValueOf2.length() != 0 ? "Required server option(s) missing: ".concat(strValueOf2) : new String("Required server option(s) missing: "));
        }
    }
}
