package p636z0.p770y;

/* JADX INFO: renamed from: z0.y.o, reason: use source file name */
/* JADX INFO: compiled from: NavOptions.java */
/* JADX INFO: loaded from: classes.dex */
public final class NavOptions {

    /* JADX INFO: renamed from: a */
    public boolean f39054a;

    /* JADX INFO: renamed from: b */
    public int f39055b;

    /* JADX INFO: renamed from: c */
    public boolean f39056c;

    /* JADX INFO: renamed from: d */
    public int f39057d;

    /* JADX INFO: renamed from: e */
    public int f39058e;

    /* JADX INFO: renamed from: f */
    public int f39059f;

    /* JADX INFO: renamed from: g */
    public int f39060g;

    /* JADX INFO: renamed from: z0.y.o$a */
    /* JADX INFO: compiled from: NavOptions.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f39061a;

        /* JADX INFO: renamed from: c */
        public boolean f39063c;

        /* JADX INFO: renamed from: b */
        public int f39062b = -1;

        /* JADX INFO: renamed from: d */
        public int f39064d = -1;

        /* JADX INFO: renamed from: e */
        public int f39065e = -1;

        /* JADX INFO: renamed from: f */
        public int f39066f = -1;

        /* JADX INFO: renamed from: g */
        public int f39067g = -1;

        /* JADX INFO: renamed from: a */
        public NavOptions m16919a() {
            return new NavOptions(this.f39061a, this.f39062b, this.f39063c, this.f39064d, this.f39065e, this.f39066f, this.f39067g);
        }
    }

    public NavOptions(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5) {
        this.f39054a = z;
        this.f39055b = i;
        this.f39056c = z2;
        this.f39057d = i2;
        this.f39058e = i3;
        this.f39059f = i4;
        this.f39060g = i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NavOptions.class != obj.getClass()) {
            return false;
        }
        NavOptions navOptions = (NavOptions) obj;
        return this.f39054a == navOptions.f39054a && this.f39055b == navOptions.f39055b && this.f39056c == navOptions.f39056c && this.f39057d == navOptions.f39057d && this.f39058e == navOptions.f39058e && this.f39059f == navOptions.f39059f && this.f39060g == navOptions.f39060g;
    }

    public int hashCode() {
        return ((((((((((((this.f39054a ? 1 : 0) * 31) + this.f39055b) * 31) + (this.f39056c ? 1 : 0)) * 31) + this.f39057d) * 31) + this.f39058e) * 31) + this.f39059f) * 31) + this.f39060g;
    }
}
