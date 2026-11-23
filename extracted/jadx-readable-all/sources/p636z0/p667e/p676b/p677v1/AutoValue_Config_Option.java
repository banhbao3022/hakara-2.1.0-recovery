package p636z0.p667e.p676b.p677v1;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.e.b.v1.n, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_Config_Option.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_Config_Option<T> extends Config3.a<T> {

    /* JADX INFO: renamed from: a */
    public final String f36214a;

    /* JADX INFO: renamed from: b */
    public final Class<T> f36215b;

    /* JADX INFO: renamed from: c */
    public final Object f36216c;

    public AutoValue_Config_Option(String str, Class<T> cls, Object obj) {
        Objects.requireNonNull(str, "Null id");
        this.f36214a = str;
        Objects.requireNonNull(cls, "Null valueClass");
        this.f36215b = cls;
        this.f36216c = obj;
    }

    @Override // p636z0.p667e.p676b.p677v1.Config3.a
    /* JADX INFO: renamed from: a */
    public String mo15383a() {
        return this.f36214a;
    }

    @Override // p636z0.p667e.p676b.p677v1.Config3.a
    /* JADX INFO: renamed from: b */
    public Object mo15384b() {
        return this.f36216c;
    }

    @Override // p636z0.p667e.p676b.p677v1.Config3.a
    /* JADX INFO: renamed from: c */
    public Class<T> mo15385c() {
        return this.f36215b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Config3.a)) {
            return false;
        }
        Config3.a aVar = (Config3.a) obj;
        if (this.f36214a.equals(aVar.mo15383a()) && this.f36215b.equals(aVar.mo15385c())) {
            Object obj2 = this.f36216c;
            if (obj2 == null) {
                if (aVar.mo15384b() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.mo15384b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f36214a.hashCode() ^ 1000003) * 1000003) ^ this.f36215b.hashCode()) * 1000003;
        Object obj = this.f36216c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Option{id=");
        sbM1556G.append(this.f36214a);
        sbM1556G.append(", valueClass=");
        sbM1556G.append(this.f36215b);
        sbM1556G.append(", token=");
        sbM1556G.append(this.f36216c);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
