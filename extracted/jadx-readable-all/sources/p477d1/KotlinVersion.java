package p477d1;

import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.e, reason: use source file name */
/* JADX INFO: compiled from: KotlinVersion.kt */
/* JADX INFO: loaded from: classes.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {

    /* JADX INFO: renamed from: f */
    public static final KotlinVersion f29478f;

    /* JADX INFO: renamed from: g */
    public final int f29479g;

    /* JADX INFO: renamed from: h */
    public final int f29480h;

    /* JADX INFO: renamed from: i */
    public final int f29481i;

    /* JADX INFO: renamed from: j */
    public final int f29482j;

    /* JADX INFO: renamed from: d1.e$a */
    /* JADX INFO: compiled from: KotlinVersion.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        f29478f = new KotlinVersion(1, 4, 32);
    }

    public KotlinVersion(int i, int i2, int i3) {
        this.f29480h = i;
        this.f29481i = i2;
        this.f29482j = i3;
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            this.f29479g = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(KotlinVersion kotlinVersion) {
        KotlinVersion kotlinVersion2 = kotlinVersion;
        Intrinsics2.m13089e(kotlinVersion2, "other");
        return this.f29479g - kotlinVersion2.f29479g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinVersion)) {
            obj = null;
        }
        KotlinVersion kotlinVersion = (KotlinVersion) obj;
        return kotlinVersion != null && this.f29479g == kotlinVersion.f29479g;
    }

    public int hashCode() {
        return this.f29479g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29480h);
        sb.append('.');
        sb.append(this.f29481i);
        sb.append('.');
        sb.append(this.f29482j);
        return sb.toString();
    }

    public KotlinVersion(int i, int i2) {
        this(i, i2, 0);
    }
}
