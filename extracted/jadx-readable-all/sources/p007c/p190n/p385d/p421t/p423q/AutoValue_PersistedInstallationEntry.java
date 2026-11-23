package p007c.p190n.p385d.p421t.p423q;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.t.q.a, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_PersistedInstallationEntry.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {

    /* JADX INFO: renamed from: b */
    public final String f27160b;

    /* JADX INFO: renamed from: c */
    public final PersistedInstallation.a f27161c;

    /* JADX INFO: renamed from: d */
    public final String f27162d;

    /* JADX INFO: renamed from: e */
    public final String f27163e;

    /* JADX INFO: renamed from: f */
    public final long f27164f;

    /* JADX INFO: renamed from: g */
    public final long f27165g;

    /* JADX INFO: renamed from: h */
    public final String f27166h;

    /* JADX INFO: renamed from: c.n.d.t.q.a$b */
    /* JADX INFO: compiled from: AutoValue_PersistedInstallationEntry.java */
    public static final class b extends PersistedInstallationEntry.a {

        /* JADX INFO: renamed from: a */
        public String f27167a;

        /* JADX INFO: renamed from: b */
        public PersistedInstallation.a f27168b;

        /* JADX INFO: renamed from: c */
        public String f27169c;

        /* JADX INFO: renamed from: d */
        public String f27170d;

        /* JADX INFO: renamed from: e */
        public Long f27171e;

        /* JADX INFO: renamed from: f */
        public Long f27172f;

        /* JADX INFO: renamed from: g */
        public String f27173g;

        public b() {
        }

        /* JADX WARN: Failed to analyze thrown exceptions
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
         */
        @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry.a
        /* JADX INFO: renamed from: a */
        public PersistedInstallationEntry mo12127a() {
            String strM1599u = this.f27168b == null ? " registrationStatus" : "";
            if (this.f27171e == null) {
                strM1599u = outline.m1599u(strM1599u, " expiresInSecs");
            }
            if (this.f27172f == null) {
                strM1599u = outline.m1599u(strM1599u, " tokenCreationEpochInSecs");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_PersistedInstallationEntry(this.f27167a, this.f27168b, this.f27169c, this.f27170d, this.f27171e.longValue(), this.f27172f.longValue(), this.f27173g, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }

        @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry.a
        /* JADX INFO: renamed from: b */
        public PersistedInstallationEntry.a mo12128b(String str) {
            this.f27169c = str;
            return this;
        }

        @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry.a
        /* JADX INFO: renamed from: c */
        public PersistedInstallationEntry.a mo12129c(long j2) {
            this.f27171e = Long.valueOf(j2);
            return this;
        }

        @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry.a
        /* JADX INFO: renamed from: d */
        public PersistedInstallationEntry.a mo12130d(String str) {
            this.f27167a = str;
            return this;
        }

        @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry.a
        /* JADX INFO: renamed from: e */
        public PersistedInstallationEntry.a mo12131e(String str) {
            this.f27173g = str;
            return this;
        }

        @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry.a
        /* JADX INFO: renamed from: f */
        public PersistedInstallationEntry.a mo12132f(String str) {
            this.f27170d = str;
            return this;
        }

        @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry.a
        /* JADX INFO: renamed from: g */
        public PersistedInstallationEntry.a mo12133g(PersistedInstallation.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f27168b = aVar;
            return this;
        }

        @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry.a
        /* JADX INFO: renamed from: h */
        public PersistedInstallationEntry.a mo12134h(long j2) {
            this.f27172f = Long.valueOf(j2);
            return this;
        }

        public b(PersistedInstallationEntry persistedInstallationEntry, a aVar) {
            AutoValue_PersistedInstallationEntry autoValue_PersistedInstallationEntry = (AutoValue_PersistedInstallationEntry) persistedInstallationEntry;
            this.f27167a = autoValue_PersistedInstallationEntry.f27160b;
            this.f27168b = autoValue_PersistedInstallationEntry.f27161c;
            this.f27169c = autoValue_PersistedInstallationEntry.f27162d;
            this.f27170d = autoValue_PersistedInstallationEntry.f27163e;
            this.f27171e = Long.valueOf(autoValue_PersistedInstallationEntry.f27164f);
            this.f27172f = Long.valueOf(autoValue_PersistedInstallationEntry.f27165g);
            this.f27173g = autoValue_PersistedInstallationEntry.f27166h;
        }
    }

    public AutoValue_PersistedInstallationEntry(String str, PersistedInstallation.a aVar, String str2, String str3, long j2, long j3, String str4, a aVar2) {
        this.f27160b = str;
        this.f27161c = aVar;
        this.f27162d = str2;
        this.f27163e = str3;
        this.f27164f = j2;
        this.f27165g = j3;
        this.f27166h = str4;
    }

    @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry
    /* JADX INFO: renamed from: a */
    public String mo12119a() {
        return this.f27162d;
    }

    @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry
    /* JADX INFO: renamed from: b */
    public long mo12120b() {
        return this.f27164f;
    }

    @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry
    /* JADX INFO: renamed from: c */
    public String mo12121c() {
        return this.f27160b;
    }

    @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry
    /* JADX INFO: renamed from: d */
    public String mo12122d() {
        return this.f27166h;
    }

    @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry
    /* JADX INFO: renamed from: e */
    public String mo12123e() {
        return this.f27163e;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str3 = this.f27160b;
        if (str3 != null ? str3.equals(persistedInstallationEntry.mo12121c()) : persistedInstallationEntry.mo12121c() == null) {
            if (this.f27161c.equals(persistedInstallationEntry.mo12124f()) && ((str = this.f27162d) != null ? str.equals(persistedInstallationEntry.mo12119a()) : persistedInstallationEntry.mo12119a() == null) && ((str2 = this.f27163e) != null ? str2.equals(persistedInstallationEntry.mo12123e()) : persistedInstallationEntry.mo12123e() == null) && this.f27164f == persistedInstallationEntry.mo12120b() && this.f27165g == persistedInstallationEntry.mo12125g()) {
                String str4 = this.f27166h;
                if (str4 == null) {
                    if (persistedInstallationEntry.mo12122d() == null) {
                        return true;
                    }
                } else if (str4.equals(persistedInstallationEntry.mo12122d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry
    /* JADX INFO: renamed from: f */
    public PersistedInstallation.a mo12124f() {
        return this.f27161c;
    }

    @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry
    /* JADX INFO: renamed from: g */
    public long mo12125g() {
        return this.f27165g;
    }

    public int hashCode() {
        String str = this.f27160b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f27161c.hashCode()) * 1000003;
        String str2 = this.f27162d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f27163e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j2 = this.f27164f;
        int i = (iHashCode3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f27165g;
        int i2 = (i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f27166h;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry
    /* JADX INFO: renamed from: k */
    public PersistedInstallationEntry.a mo12126k() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("PersistedInstallationEntry{firebaseInstallationId=");
        sbM1556G.append(this.f27160b);
        sbM1556G.append(", registrationStatus=");
        sbM1556G.append(this.f27161c);
        sbM1556G.append(", authToken=");
        sbM1556G.append(this.f27162d);
        sbM1556G.append(", refreshToken=");
        sbM1556G.append(this.f27163e);
        sbM1556G.append(", expiresInSecs=");
        sbM1556G.append(this.f27164f);
        sbM1556G.append(", tokenCreationEpochInSecs=");
        sbM1556G.append(this.f27165g);
        sbM1556G.append(", fisError=");
        return outline.m1550A(sbM1556G, this.f27166h, "}");
    }
}
