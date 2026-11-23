package p007c.p190n.p385d.p390k;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.k.s, reason: use source file name */
/* JADX INFO: compiled from: Dependency.java */
/* JADX INFO: loaded from: classes.dex */
public final class Dependency {

    /* JADX INFO: renamed from: a */
    public final Class<?> f26399a;

    /* JADX INFO: renamed from: b */
    public final int f26400b;

    /* JADX INFO: renamed from: c */
    public final int f26401c;

    public Dependency(Class<?> cls, int i, int i2) {
        Objects.requireNonNull(cls, "Null dependency anInterface.");
        this.f26399a = cls;
        this.f26400b = i;
        this.f26401c = i2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m11700a() {
        return this.f26400b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        return this.f26399a == dependency.f26399a && this.f26400b == dependency.f26400b && this.f26401c == dependency.f26401c;
    }

    public int hashCode() {
        return ((((this.f26399a.hashCode() ^ 1000003) * 1000003) ^ this.f26400b) * 1000003) ^ this.f26401c;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f26399a);
        sb.append(", type=");
        int i = this.f26400b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.f26401c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(outline.m1590l("Unsupported injection: ", i2));
            }
            str2 = "deferred";
        }
        return outline.m1550A(sb, str2, "}");
    }
}
