package p007c.p082f.p083a.p084a;

import com.badlogic.gdx.math.Matrix4;
import java.io.Serializable;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.f.a.a.j, reason: use source file name */
/* JADX INFO: compiled from: Vector3.java */
/* JADX INFO: loaded from: classes.dex */
public class Vector3 implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final Vector3 f2850f;

    /* JADX INFO: renamed from: g */
    public float f2851g;

    /* JADX INFO: renamed from: h */
    public float f2852h;

    /* JADX INFO: renamed from: i */
    public float f2853i;

    static {
        new Vector3(1.0f, 0.0f, 0.0f);
        new Vector3(0.0f, 1.0f, 0.0f);
        f2850f = new Vector3(0.0f, 0.0f, 1.0f);
        new Vector3(0.0f, 0.0f, 0.0f);
        new Matrix4();
    }

    public Vector3() {
    }

    /* JADX INFO: renamed from: a */
    public Vector3 m1616a(Vector3 vector3) {
        float f = this.f2852h;
        float f2 = vector3.f2853i;
        float f3 = this.f2853i;
        float f4 = vector3.f2852h;
        float f5 = vector3.f2851g;
        float f6 = this.f2851g;
        m1619d((f * f2) - (f3 * f4), (f3 * f5) - (f2 * f6), (f6 * f4) - (f * f5));
        return this;
    }

    /* JADX INFO: renamed from: b */
    public float m1617b(Vector3 vector3) {
        return (this.f2853i * vector3.f2853i) + (this.f2852h * vector3.f2852h) + (this.f2851g * vector3.f2851g);
    }

    /* JADX INFO: renamed from: c */
    public Vector3 m1618c() {
        float f = this.f2851g;
        float f2 = this.f2852h;
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.f2853i;
        float f5 = (f4 * f4) + f3;
        if (f5 != 0.0f && f5 != 1.0f) {
            float fSqrt = 1.0f / ((float) Math.sqrt(f5));
            m1619d(this.f2851g * fSqrt, this.f2852h * fSqrt, this.f2853i * fSqrt);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public Vector3 m1619d(float f, float f2, float f3) {
        this.f2851g = f;
        this.f2852h = f2;
        this.f2853i = f3;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public Vector3 m1620e(Vector3 vector3) {
        m1619d(vector3.f2851g, vector3.f2852h, vector3.f2853i);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Vector3.class != obj.getClass()) {
            return false;
        }
        Vector3 vector3 = (Vector3) obj;
        return Float.floatToIntBits(this.f2851g) == Float.floatToIntBits(vector3.f2851g) && Float.floatToIntBits(this.f2852h) == Float.floatToIntBits(vector3.f2852h) && Float.floatToIntBits(this.f2853i) == Float.floatToIntBits(vector3.f2853i);
    }

    /* JADX INFO: renamed from: f */
    public Vector3 m1621f(Vector3 vector3) {
        m1619d(this.f2851g - vector3.f2851g, this.f2852h - vector3.f2852h, this.f2853i - vector3.f2853i);
        return this;
    }

    public int hashCode() {
        return ((((Float.floatToIntBits(this.f2851g) + 31) * 31) + Float.floatToIntBits(this.f2852h)) * 31) + Float.floatToIntBits(this.f2853i);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("(");
        sbM1556G.append(this.f2851g);
        sbM1556G.append(",");
        sbM1556G.append(this.f2852h);
        sbM1556G.append(",");
        sbM1556G.append(this.f2853i);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    public Vector3(float f, float f2, float f3) {
        this.f2851g = f;
        this.f2852h = f2;
        this.f2853i = f3;
    }

    public Vector3(Vector3 vector3) {
        m1620e(vector3);
    }

    public Vector3(float[] fArr) {
        m1619d(fArr[0], fArr[1], fArr[2]);
    }

    public Vector3(Vector2 vector2, float f) {
        m1619d(vector2.f2848f, vector2.f2849g, f);
    }
}
