package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;

/* JADX INFO: renamed from: c.n.b.d.k.b.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4481d {

    /* JADX INFO: renamed from: a */
    public static final C4481d f23819a = new C4481d(null, null);

    /* JADX INFO: renamed from: b */
    public final Boolean f23820b;

    /* JADX INFO: renamed from: c */
    public final Boolean f23821c;

    public C4481d(Boolean bool, Boolean bool2) {
        this.f23820b = bool;
        this.f23821c = bool2;
    }

    /* JADX INFO: renamed from: a */
    public static int m10483a(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX INFO: renamed from: b */
    public static C4481d m10484b(String str) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4 = null;
        if (str != null) {
            if (str.length() < 3) {
                bool2 = null;
            } else {
                char cCharAt = str.charAt(2);
                if (cCharAt == '0') {
                    bool2 = Boolean.FALSE;
                } else if (cCharAt != '1') {
                    bool2 = null;
                } else {
                    bool2 = Boolean.TRUE;
                }
            }
            if (str.length() >= 4) {
                char cCharAt2 = str.charAt(3);
                if (cCharAt2 == '0') {
                    bool3 = Boolean.FALSE;
                } else if (cCharAt2 == '1') {
                    bool3 = Boolean.TRUE;
                }
                bool4 = bool3;
            }
            bool = bool4;
            bool4 = bool2;
        } else {
            bool = null;
        }
        return new C4481d(bool4, bool);
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m10485c(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m10486e(int i, int i2) {
        return i <= i2;
    }

    /* JADX INFO: renamed from: g */
    public static C4481d m10487g(Bundle bundle) {
        return bundle == null ? f23819a : new C4481d(m10488i(bundle.getString("ad_storage")), m10488i(bundle.getString("analytics_storage")));
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m10488i(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final String m10489d() {
        char c2;
        StringBuilder sb = new StringBuilder("G1");
        Boolean bool = this.f23820b;
        char c3 = '0';
        if (bool == null) {
            c2 = '-';
        } else {
            c2 = bool.booleanValue() ? '1' : '0';
        }
        sb.append(c2);
        Boolean bool2 = this.f23821c;
        if (bool2 == null) {
            c3 = '-';
        } else if (bool2.booleanValue()) {
            c3 = '1';
        }
        sb.append(c3);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4481d)) {
            return false;
        }
        C4481d c4481d = (C4481d) obj;
        return m10483a(this.f23820b) == m10483a(c4481d.f23820b) && m10483a(this.f23821c) == m10483a(c4481d.f23821c);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10490f(C4481d c4481d) {
        Boolean bool = this.f23820b;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || c4481d.f23820b == bool2) {
            return this.f23821c == bool2 && c4481d.f23821c != bool2;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final C4481d m10491h(C4481d c4481d) {
        return new C4481d(m10485c(this.f23820b, c4481d.f23820b), m10485c(this.f23821c, c4481d.f23821c));
    }

    public final int hashCode() {
        return m10483a(this.f23821c) + ((m10483a(this.f23820b) + 527) * 31);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10492j() {
        Boolean bool = this.f23820b;
        return bool == null || bool.booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m10493k() {
        Boolean bool = this.f23821c;
        return bool == null || bool.booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.f23820b;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(bool.booleanValue() ? "granted" : "denied");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f23821c;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            sb.append(bool2.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }
}
