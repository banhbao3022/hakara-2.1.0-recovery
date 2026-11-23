package p007c.p190n.p430e;

import java.math.BigInteger;
import java.util.Objects;
import p007c.p190n.p430e.p432e0.LazilyParsedNumber;

/* JADX INFO: renamed from: c.n.e.v, reason: use source file name */
/* JADX INFO: compiled from: JsonPrimitive.java */
/* JADX INFO: loaded from: classes.dex */
public final class JsonPrimitive extends JsonElement {

    /* JADX INFO: renamed from: a */
    public final Object f27583a;

    public JsonPrimitive(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f27583a = bool;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m12326m(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.f27583a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (this.f27583a == null) {
            return jsonPrimitive.f27583a == null;
        }
        if (m12326m(this) && m12326m(jsonPrimitive)) {
            return m12328h().longValue() == jsonPrimitive.m12328h().longValue();
        }
        Object obj2 = this.f27583a;
        if (!(obj2 instanceof Number) || !(jsonPrimitive.f27583a instanceof Number)) {
            return obj2.equals(jsonPrimitive.f27583a);
        }
        double dDoubleValue = m12328h().doubleValue();
        double dDoubleValue2 = jsonPrimitive.m12328h().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m12327f() {
        Object obj = this.f27583a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(m12329j());
    }

    /* JADX INFO: renamed from: h */
    public Number m12328h() {
        Object obj = this.f27583a;
        return obj instanceof String ? new LazilyParsedNumber((String) this.f27583a) : (Number) obj;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f27583a == null) {
            return 31;
        }
        if (m12326m(this)) {
            jDoubleToLongBits = m12328h().longValue();
        } else {
            Object obj = this.f27583a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m12328h().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    /* JADX INFO: renamed from: j */
    public String m12329j() {
        Object obj = this.f27583a;
        if (obj instanceof Number) {
            return m12328h().toString();
        }
        return obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public JsonPrimitive(Number number) {
        Objects.requireNonNull(number);
        this.f27583a = number;
    }

    public JsonPrimitive(String str) {
        Objects.requireNonNull(str);
        this.f27583a = str;
    }

    public JsonPrimitive(Character ch) {
        Objects.requireNonNull(ch);
        this.f27583a = ch.toString();
    }
}
