package p007c.p190n.p385d.p421t.p424r;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.t.r.a, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_InstallationResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_InstallationResponse extends InstallationResponse {

    /* JADX INFO: renamed from: a */
    public final String f27186a;

    /* JADX INFO: renamed from: b */
    public final String f27187b;

    /* JADX INFO: renamed from: c */
    public final String f27188c;

    /* JADX INFO: renamed from: d */
    public final TokenResult f27189d;

    /* JADX INFO: renamed from: e */
    public final InstallationResponse.b f27190e;

    /* JADX INFO: renamed from: c.n.d.t.r.a$b */
    /* JADX INFO: compiled from: AutoValue_InstallationResponse.java */
    public static final class b extends InstallationResponse.a {

        /* JADX INFO: renamed from: a */
        public String f27191a;

        /* JADX INFO: renamed from: b */
        public String f27192b;

        /* JADX INFO: renamed from: c */
        public String f27193c;

        /* JADX INFO: renamed from: d */
        public TokenResult f27194d;

        /* JADX INFO: renamed from: e */
        public InstallationResponse.b f27195e;

        /* JADX INFO: renamed from: a */
        public InstallationResponse m12146a() {
            return new AutoValue_InstallationResponse(this.f27191a, this.f27192b, this.f27193c, this.f27194d, this.f27195e, null);
        }
    }

    public AutoValue_InstallationResponse(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.b bVar, a aVar) {
        this.f27186a = str;
        this.f27187b = str2;
        this.f27188c = str3;
        this.f27189d = tokenResult;
        this.f27190e = bVar;
    }

    @Override // p007c.p190n.p385d.p421t.p424r.InstallationResponse
    /* JADX INFO: renamed from: a */
    public TokenResult mo12141a() {
        return this.f27189d;
    }

    @Override // p007c.p190n.p385d.p421t.p424r.InstallationResponse
    /* JADX INFO: renamed from: b */
    public String mo12142b() {
        return this.f27187b;
    }

    @Override // p007c.p190n.p385d.p421t.p424r.InstallationResponse
    /* JADX INFO: renamed from: c */
    public String mo12143c() {
        return this.f27188c;
    }

    @Override // p007c.p190n.p385d.p421t.p424r.InstallationResponse
    /* JADX INFO: renamed from: d */
    public InstallationResponse.b mo12144d() {
        return this.f27190e;
    }

    @Override // p007c.p190n.p385d.p421t.p424r.InstallationResponse
    /* JADX INFO: renamed from: e */
    public String mo12145e() {
        return this.f27186a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f27186a;
        if (str != null ? str.equals(installationResponse.mo12145e()) : installationResponse.mo12145e() == null) {
            String str2 = this.f27187b;
            if (str2 != null ? str2.equals(installationResponse.mo12142b()) : installationResponse.mo12142b() == null) {
                String str3 = this.f27188c;
                if (str3 != null ? str3.equals(installationResponse.mo12143c()) : installationResponse.mo12143c() == null) {
                    TokenResult tokenResult = this.f27189d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.mo12141a()) : installationResponse.mo12141a() == null) {
                        InstallationResponse.b bVar = this.f27190e;
                        if (bVar == null) {
                            if (installationResponse.mo12144d() == null) {
                                return true;
                            }
                        } else if (bVar.equals(installationResponse.mo12144d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f27186a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f27187b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f27188c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f27189d;
        int iHashCode4 = (iHashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.b bVar = this.f27190e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("InstallationResponse{uri=");
        sbM1556G.append(this.f27186a);
        sbM1556G.append(", fid=");
        sbM1556G.append(this.f27187b);
        sbM1556G.append(", refreshToken=");
        sbM1556G.append(this.f27188c);
        sbM1556G.append(", authToken=");
        sbM1556G.append(this.f27189d);
        sbM1556G.append(", responseCode=");
        sbM1556G.append(this.f27190e);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
