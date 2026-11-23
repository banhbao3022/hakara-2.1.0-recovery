package p007c.p056c.p057a.p059b0;

import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p738k.Pair;

/* JADX INFO: renamed from: c.c.a.b0.i, reason: use source file name */
/* JADX INFO: compiled from: MutablePair.java */
/* JADX INFO: loaded from: classes.dex */
public class MutablePair<T> {

    /* JADX INFO: renamed from: a */
    public T f2000a;

    /* JADX INFO: renamed from: b */
    public T f2001b;

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        F f = pair.f37971a;
        Object obj2 = this.f2000a;
        if (!(f == obj2 || (f != 0 && f.equals(obj2)))) {
            return false;
        }
        S s = pair.f37972b;
        Object obj3 = this.f2001b;
        return s == obj3 || (s != 0 && s.equals(obj3));
    }

    public int hashCode() {
        T t = this.f2000a;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f2001b;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Pair{");
        sbM1556G.append(String.valueOf(this.f2000a));
        sbM1556G.append(" ");
        sbM1556G.append(String.valueOf(this.f2001b));
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
