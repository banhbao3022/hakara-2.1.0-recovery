package p007c.p082f.p083a.p084a;

import java.io.Serializable;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.f.a.a.f, reason: use source file name */
/* JADX INFO: compiled from: Quaternion.java */
/* JADX INFO: loaded from: classes.dex */
public class Quaternion implements Serializable {

    /* JADX INFO: renamed from: f */
    public float f2840f;

    /* JADX INFO: renamed from: g */
    public float f2841g;

    /* JADX INFO: renamed from: h */
    public float f2842h;

    /* JADX INFO: renamed from: i */
    public float f2843i;

    static {
        new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);
        new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        this.f2840f = f;
        this.f2841g = f2;
        this.f2842h = f3;
        this.f2843i = f4;
    }

    /* JADX INFO: renamed from: a */
    public Quaternion m1613a(float f, float f2, float f3, float f4) {
        this.f2840f = f;
        this.f2841g = f2;
        this.f2842h = f3;
        this.f2843i = f4;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public Quaternion m1614b(Vector3 vector3, float f) {
        float f2 = vector3.f2851g;
        float f3 = vector3.f2852h;
        float f4 = vector3.f2853i;
        float f5 = f * 0.017453292f;
        Vector3 vector4 = Vector3.f2850f;
        float fSqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3) + (f2 * f2));
        if (fSqrt == 0.0f) {
            m1613a(0.0f, 0.0f, 0.0f, 1.0f);
        } else {
            float f6 = 1.0f / fSqrt;
            double d = (f5 < 0.0f ? 6.2831855f - ((-f5) % 6.2831855f) : f5 % 6.2831855f) / 2.0f;
            float fSin = (float) Math.sin(d);
            m1613a(f2 * f6 * fSin, f3 * f6 * fSin, f6 * f4 * fSin, (float) Math.cos(d));
            float f7 = this.f2840f;
            float f8 = this.f2841g;
            float f9 = (f8 * f8) + (f7 * f7);
            float f10 = this.f2842h;
            float f11 = (f10 * f10) + f9;
            float f12 = this.f2843i;
            float f13 = (f12 * f12) + f11;
            if (f13 != 0.0f) {
                int i = MathUtils.f2835a;
                if (!(Math.abs(f13 - 1.0f) <= 1.0E-6f)) {
                    float fSqrt2 = (float) Math.sqrt(f13);
                    this.f2843i /= fSqrt2;
                    this.f2840f /= fSqrt2;
                    this.f2841g /= fSqrt2;
                    this.f2842h /= fSqrt2;
                }
            }
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Quaternion)) {
            return false;
        }
        Quaternion quaternion = (Quaternion) obj;
        return Float.floatToRawIntBits(this.f2843i) == Float.floatToRawIntBits(quaternion.f2843i) && Float.floatToRawIntBits(this.f2840f) == Float.floatToRawIntBits(quaternion.f2840f) && Float.floatToRawIntBits(this.f2841g) == Float.floatToRawIntBits(quaternion.f2841g) && Float.floatToRawIntBits(this.f2842h) == Float.floatToRawIntBits(quaternion.f2842h);
    }

    public int hashCode() {
        return ((((((Float.floatToRawIntBits(this.f2843i) + 31) * 31) + Float.floatToRawIntBits(this.f2840f)) * 31) + Float.floatToRawIntBits(this.f2841g)) * 31) + Float.floatToRawIntBits(this.f2842h);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("[");
        sbM1556G.append(this.f2840f);
        sbM1556G.append("|");
        sbM1556G.append(this.f2841g);
        sbM1556G.append("|");
        sbM1556G.append(this.f2842h);
        sbM1556G.append("|");
        sbM1556G.append(this.f2843i);
        sbM1556G.append("]");
        return sbM1556G.toString();
    }

    public Quaternion() {
        m1613a(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public Quaternion(Quaternion quaternion) {
        m1613a(quaternion.f2840f, quaternion.f2841g, quaternion.f2842h, quaternion.f2843i);
    }

    public Quaternion(Vector3 vector3, float f) {
        m1614b(vector3, f);
    }
}
