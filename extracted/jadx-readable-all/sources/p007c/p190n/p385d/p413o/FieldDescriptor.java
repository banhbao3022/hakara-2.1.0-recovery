package p007c.p190n.p385d.p413o;

import java.util.Collections;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.o.d, reason: use source file name */
/* JADX INFO: compiled from: FieldDescriptor.java */
/* JADX INFO: loaded from: classes.dex */
public final class FieldDescriptor {

    /* JADX INFO: renamed from: a */
    public final String f27015a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, Object> f27016b;

    public FieldDescriptor(String str, Map<Class<?>, Object> map) {
        this.f27015a = str;
        this.f27016b = map;
    }

    /* JADX INFO: renamed from: a */
    public static FieldDescriptor m12045a(String str) {
        return new FieldDescriptor(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.f27015a.equals(fieldDescriptor.f27015a) && this.f27016b.equals(fieldDescriptor.f27016b);
    }

    public int hashCode() {
        return this.f27016b.hashCode() + (this.f27015a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("FieldDescriptor{name=");
        sbM1556G.append(this.f27015a);
        sbM1556G.append(", properties=");
        sbM1556G.append(this.f27016b.values());
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
