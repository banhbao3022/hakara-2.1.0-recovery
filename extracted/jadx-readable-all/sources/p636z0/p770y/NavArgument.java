package p636z0.p770y;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.y.d, reason: use source file name */
/* JADX INFO: compiled from: NavArgument.java */
/* JADX INFO: loaded from: classes.dex */
public final class NavArgument {

    /* JADX INFO: renamed from: a */
    public final NavType f38991a;

    /* JADX INFO: renamed from: b */
    public final boolean f38992b;

    /* JADX INFO: renamed from: c */
    public final boolean f38993c;

    /* JADX INFO: renamed from: d */
    public final Object f38994d;

    /* JADX INFO: renamed from: z0.y.d$a */
    /* JADX INFO: compiled from: NavArgument.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public NavType<?> f38995a;

        /* JADX INFO: renamed from: c */
        public Object f38997c;

        /* JADX INFO: renamed from: b */
        public boolean f38996b = false;

        /* JADX INFO: renamed from: d */
        public boolean f38998d = false;
    }

    public NavArgument(NavType<?> navType, boolean z, Object obj, boolean z2) {
        if (!navType.f39079l && z) {
            throw new IllegalArgumentException(navType.mo16921b() + " does not allow nullable values");
        }
        if (!z && z2 && obj == null) {
            StringBuilder sbM1556G = outline.m1556G("Argument with type ");
            sbM1556G.append(navType.mo16921b());
            sbM1556G.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(sbM1556G.toString());
        }
        this.f38991a = navType;
        this.f38992b = z;
        this.f38994d = obj;
        this.f38993c = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NavArgument.class != obj.getClass()) {
            return false;
        }
        NavArgument navArgument = (NavArgument) obj;
        if (this.f38992b != navArgument.f38992b || this.f38993c != navArgument.f38993c || !this.f38991a.equals(navArgument.f38991a)) {
            return false;
        }
        Object obj2 = this.f38994d;
        if (obj2 != null) {
            return obj2.equals(navArgument.f38994d);
        }
        return navArgument.f38994d == null;
    }

    public int hashCode() {
        int iHashCode = ((((this.f38991a.hashCode() * 31) + (this.f38992b ? 1 : 0)) * 31) + (this.f38993c ? 1 : 0)) * 31;
        Object obj = this.f38994d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
