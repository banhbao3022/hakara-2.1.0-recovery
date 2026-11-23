package p007c.p085g.p086a.p112s;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.g.a.s.i, reason: use source file name */
/* JADX INFO: compiled from: MultiClassKey.java */
/* JADX INFO: loaded from: classes.dex */
public class MultiClassKey {

    /* JADX INFO: renamed from: a */
    public Class<?> f3825a;

    /* JADX INFO: renamed from: b */
    public Class<?> f3826b;

    /* JADX INFO: renamed from: c */
    public Class<?> f3827c;

    public MultiClassKey() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MultiClassKey.class != obj.getClass()) {
            return false;
        }
        MultiClassKey multiClassKey = (MultiClassKey) obj;
        return this.f3825a.equals(multiClassKey.f3825a) && this.f3826b.equals(multiClassKey.f3826b) && Util4.m2047b(this.f3827c, multiClassKey.f3827c);
    }

    public int hashCode() {
        int iHashCode = (this.f3826b.hashCode() + (this.f3825a.hashCode() * 31)) * 31;
        Class<?> cls = this.f3827c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("MultiClassKey{first=");
        sbM1556G.append(this.f3825a);
        sbM1556G.append(", second=");
        sbM1556G.append(this.f3826b);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }

    public MultiClassKey(Class<?> cls, Class<?> cls2) {
        this.f3825a = cls;
        this.f3826b = cls2;
        this.f3827c = null;
    }

    public MultiClassKey(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f3825a = cls;
        this.f3826b = cls2;
        this.f3827c = cls3;
    }
}
