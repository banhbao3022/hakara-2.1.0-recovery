package p526i1.p536d.p543c.p545h;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: i1.d.c.h.e, reason: use source file name */
/* JADX INFO: compiled from: Properties.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Properties {

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f30914a;

    /* JADX WARN: Multi-variable type inference failed */
    public Properties() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Properties(Map<String, Object> map) {
        Intrinsics2.m13090f(map, "data");
        this.f30914a = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Properties) && Intrinsics2.m13085a(this.f30914a, ((Properties) obj).f30914a);
        }
        return true;
    }

    public int hashCode() {
        Map<String, Object> map = this.f30914a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Properties(data=");
        sbM1556G.append(this.f30914a);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    public /* synthetic */ Properties(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : map);
    }
}
