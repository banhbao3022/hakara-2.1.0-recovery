package p636z0.p725k.p738k;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.k.k.b, reason: use source file name */
/* JADX INFO: compiled from: Pair.java */
/* JADX INFO: loaded from: classes.dex */
public class Pair<F, S> {

    /* JADX INFO: renamed from: a */
    public final F f37971a;

    /* JADX INFO: renamed from: b */
    public final S f37972b;

    public Pair(F f, S s) {
        this.f37971a = f;
        this.f37972b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Objects.equals(pair.f37971a, this.f37971a) && Objects.equals(pair.f37972b, this.f37972b);
    }

    public int hashCode() {
        F f = this.f37971a;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.f37972b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Pair{");
        sbM1556G.append(this.f37971a);
        sbM1556G.append(" ");
        sbM1556G.append(this.f37972b);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
