package p007c.p082f.p083a.p084a;

import java.io.Serializable;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.f.a.a.i, reason: use source file name */
/* JADX INFO: compiled from: Vector2.java */
/* JADX INFO: loaded from: classes.dex */
public class Vector2 implements Serializable {

    /* JADX INFO: renamed from: f */
    public float f2848f;

    /* JADX INFO: renamed from: g */
    public float f2849g;

    static {
        new Vector2(1.0f, 0.0f);
        new Vector2(0.0f, 1.0f);
        new Vector2(0.0f, 0.0f);
    }

    public Vector2() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Vector2.class != obj.getClass()) {
            return false;
        }
        Vector2 vector2 = (Vector2) obj;
        return Float.floatToIntBits(this.f2848f) == Float.floatToIntBits(vector2.f2848f) && Float.floatToIntBits(this.f2849g) == Float.floatToIntBits(vector2.f2849g);
    }

    public int hashCode() {
        return ((Float.floatToIntBits(this.f2848f) + 31) * 31) + Float.floatToIntBits(this.f2849g);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("(");
        sbM1556G.append(this.f2848f);
        sbM1556G.append(",");
        sbM1556G.append(this.f2849g);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    public Vector2(float f, float f2) {
        this.f2848f = f;
        this.f2849g = f2;
    }

    public Vector2(Vector2 vector2) {
        this.f2848f = vector2.f2848f;
        this.f2849g = vector2.f2849g;
    }
}
