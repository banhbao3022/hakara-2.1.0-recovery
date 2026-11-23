package p007c.p082f.p083a.p084a;

import java.io.Serializable;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.f.a.a.h, reason: use source file name */
/* JADX INFO: compiled from: Ray.java */
/* JADX INFO: loaded from: classes.dex */
public class Ray implements Serializable {

    /* JADX INFO: renamed from: f */
    public final Vector3 f2846f;

    /* JADX INFO: renamed from: g */
    public final Vector3 f2847g;

    static {
        new Vector3();
    }

    public Ray() {
        this.f2846f = new Vector3();
        this.f2847g = new Vector3();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != Ray.class) {
            return false;
        }
        Ray ray = (Ray) obj;
        return this.f2847g.equals(ray.f2847g) && this.f2846f.equals(ray.f2846f);
    }

    public int hashCode() {
        return this.f2846f.hashCode() + ((this.f2847g.hashCode() + 73) * 73);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ray [");
        sbM1556G.append(this.f2846f);
        sbM1556G.append(":");
        sbM1556G.append(this.f2847g);
        sbM1556G.append("]");
        return sbM1556G.toString();
    }

    public Ray(Vector3 vector3, Vector3 vector4) {
        Vector3 vector5 = new Vector3();
        this.f2846f = vector5;
        Vector3 vector6 = new Vector3();
        this.f2847g = vector6;
        vector5.m1620e(vector3);
        vector6.m1620e(vector4);
        vector6.m1618c();
    }
}
