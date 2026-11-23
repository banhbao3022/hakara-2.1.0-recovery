package p636z0.p709j0.p710y.p719s;

/* JADX INFO: renamed from: z0.j0.y.s.d, reason: use source file name */
/* JADX INFO: compiled from: Preference.java */
/* JADX INFO: loaded from: classes.dex */
public class Preference {

    /* JADX INFO: renamed from: a */
    public String f37505a;

    /* JADX INFO: renamed from: b */
    public Long f37506b;

    public Preference(String str, boolean z) {
        this(str, z ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        if (!this.f37505a.equals(preference.f37505a)) {
            return false;
        }
        Long l = this.f37506b;
        Long l2 = preference.f37506b;
        if (l != null) {
            return l.equals(l2);
        }
        return l2 == null;
    }

    public int hashCode() {
        int iHashCode = this.f37505a.hashCode() * 31;
        Long l = this.f37506b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public Preference(String str, long j2) {
        this.f37505a = str;
        this.f37506b = Long.valueOf(j2);
    }
}
