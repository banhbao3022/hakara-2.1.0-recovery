package p509g1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.i, reason: use source file name */
/* JADX INFO: compiled from: Challenge.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Challenge {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f30037a;

    /* JADX INFO: renamed from: b */
    public final String f30038b;

    public Challenge(String str, Map<String, String> map) {
        String lowerCase;
        Intrinsics2.m13090f(str, "scheme");
        Intrinsics2.m13090f(map, "authParams");
        this.f30038b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                Intrinsics2.m13086b(locale, "US");
                lowerCase = key.toLowerCase(locale);
                Intrinsics2.m13086b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics2.m13086b(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f30037a = mapUnmodifiableMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (Intrinsics2.m13085a(challenge.f30038b, this.f30038b) && Intrinsics2.m13085a(challenge.f30037a, this.f30037a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f30037a.hashCode() + outline.m1569T(this.f30038b, 899, 31);
    }

    public String toString() {
        return this.f30038b + " authParams=" + this.f30037a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(String str, String str2) {
        Intrinsics2.m13090f(str, "scheme");
        Intrinsics2.m13090f(str2, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", str2);
        Intrinsics2.m13086b(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(str, (Map<String, String>) mapSingletonMap);
    }
}
