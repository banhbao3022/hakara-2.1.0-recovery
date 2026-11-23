package p007c.p190n.p385d.p421t;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.t.a, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_InstallationTokenResult.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_InstallationTokenResult extends InstallationTokenResult {

    /* JADX INFO: renamed from: a */
    public final String f27118a;

    /* JADX INFO: renamed from: b */
    public final long f27119b;

    /* JADX INFO: renamed from: c */
    public final long f27120c;

    /* JADX INFO: renamed from: c.n.d.t.a$b */
    /* JADX INFO: compiled from: AutoValue_InstallationTokenResult.java */
    public static final class b extends InstallationTokenResult.a {

        /* JADX INFO: renamed from: a */
        public String f27121a;

        /* JADX INFO: renamed from: b */
        public Long f27122b;

        /* JADX INFO: renamed from: c */
        public Long f27123c;
    }

    public AutoValue_InstallationTokenResult(String str, long j2, long j3, a aVar) {
        this.f27118a = str;
        this.f27119b = j2;
        this.f27120c = j3;
    }

    @Override // p007c.p190n.p385d.p421t.InstallationTokenResult
    /* JADX INFO: renamed from: a */
    public String mo12093a() {
        return this.f27118a;
    }

    @Override // p007c.p190n.p385d.p421t.InstallationTokenResult
    /* JADX INFO: renamed from: b */
    public long mo12094b() {
        return this.f27120c;
    }

    @Override // p007c.p190n.p385d.p421t.InstallationTokenResult
    /* JADX INFO: renamed from: c */
    public long mo12095c() {
        return this.f27119b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        return this.f27118a.equals(installationTokenResult.mo12093a()) && this.f27119b == installationTokenResult.mo12095c() && this.f27120c == installationTokenResult.mo12094b();
    }

    public int hashCode() {
        int iHashCode = (this.f27118a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f27119b;
        long j3 = this.f27120c;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("InstallationTokenResult{token=");
        sbM1556G.append(this.f27118a);
        sbM1556G.append(", tokenExpirationTimestamp=");
        sbM1556G.append(this.f27119b);
        sbM1556G.append(", tokenCreationTimestamp=");
        sbM1556G.append(this.f27120c);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
