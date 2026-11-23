package p007c.p190n.p194b.p195a;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.b, reason: use source file name */
/* JADX INFO: compiled from: Encoding.java */
/* JADX INFO: loaded from: classes.dex */
public final class Encoding {

    /* JADX INFO: renamed from: a */
    public final String f5515a;

    public Encoding(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f5515a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Encoding) {
            return this.f5515a.equals(((Encoding) obj).f5515a);
        }
        return false;
    }

    public int hashCode() {
        return this.f5515a.hashCode() ^ 1000003;
    }

    public String toString() {
        return outline.m1550A(outline.m1556G("Encoding{name=\""), this.f5515a, "\"}");
    }
}
