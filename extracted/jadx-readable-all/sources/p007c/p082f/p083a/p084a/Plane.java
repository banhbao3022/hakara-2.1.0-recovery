package p007c.p082f.p083a.p084a;

import java.io.Serializable;

/* JADX INFO: renamed from: c.f.a.a.e, reason: use source file name */
/* JADX INFO: compiled from: Plane.java */
/* JADX INFO: loaded from: classes.dex */
public class Plane implements Serializable {

    /* JADX INFO: renamed from: f */
    public final Vector3 f2838f;

    /* JADX INFO: renamed from: g */
    public float f2839g;

    public Plane() {
        this.f2838f = new Vector3();
        this.f2839g = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public void m1612a(Vector3 vector3, Vector3 vector4, Vector3 vector5) {
        Vector3 vector6 = this.f2838f;
        vector6.m1620e(vector3);
        vector6.m1621f(vector4);
        float f = vector4.f2851g - vector5.f2851g;
        float f2 = vector4.f2852h - vector5.f2852h;
        float f3 = vector4.f2853i - vector5.f2853i;
        float f4 = vector6.f2852h;
        float f5 = vector6.f2853i;
        float f6 = vector6.f2851g;
        vector6.m1619d((f4 * f3) - (f5 * f2), (f5 * f) - (f3 * f6), (f6 * f2) - (f4 * f));
        vector6.m1618c();
        this.f2839g = -vector3.m1617b(this.f2838f);
    }

    public String toString() {
        return this.f2838f.toString() + ", " + this.f2839g;
    }

    public Plane(Vector3 vector3, float f) {
        Vector3 vector4 = new Vector3();
        this.f2838f = vector4;
        this.f2839g = 0.0f;
        vector4.m1620e(vector3);
        vector4.m1618c();
        this.f2839g = f;
    }

    public Plane(Vector3 vector3, Vector3 vector4) {
        Vector3 vector5 = new Vector3();
        this.f2838f = vector5;
        this.f2839g = 0.0f;
        vector5.m1620e(vector3);
        vector5.m1618c();
        this.f2839g = -vector5.m1617b(vector4);
    }

    public Plane(Vector3 vector3, Vector3 vector4, Vector3 vector5) {
        this.f2838f = new Vector3();
        this.f2839g = 0.0f;
        m1612a(vector3, vector4, vector5);
    }
}
