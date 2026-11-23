package p007c.p190n.p385d.p421t.p424r;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.t.r.b, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_TokenResult.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_TokenResult extends TokenResult {

    /* JADX INFO: renamed from: a */
    public final String f27196a;

    /* JADX INFO: renamed from: b */
    public final long f27197b;

    /* JADX INFO: renamed from: c */
    public final TokenResult.b f27198c;

    /* JADX INFO: renamed from: c.n.d.t.r.b$b */
    /* JADX INFO: compiled from: AutoValue_TokenResult.java */
    public static final class b extends TokenResult.a {

        /* JADX INFO: renamed from: a */
        public String f27199a;

        /* JADX INFO: renamed from: b */
        public Long f27200b;

        /* JADX INFO: renamed from: c */
        public TokenResult.b f27201c;

        @Override // p007c.p190n.p385d.p421t.p424r.TokenResult.a
        /* JADX INFO: renamed from: a */
        public TokenResult mo12150a() {
            String str = this.f27200b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new AutoValue_TokenResult(this.f27199a, this.f27200b.longValue(), this.f27201c, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", str));
        }

        @Override // p007c.p190n.p385d.p421t.p424r.TokenResult.a
        /* JADX INFO: renamed from: b */
        public TokenResult.a mo12151b(long j2) {
            this.f27200b = Long.valueOf(j2);
            return this;
        }
    }

    public AutoValue_TokenResult(String str, long j2, TokenResult.b bVar, a aVar) {
        this.f27196a = str;
        this.f27197b = j2;
        this.f27198c = bVar;
    }

    @Override // p007c.p190n.p385d.p421t.p424r.TokenResult
    /* JADX INFO: renamed from: b */
    public TokenResult.b mo12147b() {
        return this.f27198c;
    }

    @Override // p007c.p190n.p385d.p421t.p424r.TokenResult
    /* JADX INFO: renamed from: c */
    public String mo12148c() {
        return this.f27196a;
    }

    @Override // p007c.p190n.p385d.p421t.p424r.TokenResult
    /* JADX INFO: renamed from: d */
    public long mo12149d() {
        return this.f27197b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f27196a;
        if (str != null ? str.equals(tokenResult.mo12148c()) : tokenResult.mo12148c() == null) {
            if (this.f27197b == tokenResult.mo12149d()) {
                TokenResult.b bVar = this.f27198c;
                if (bVar == null) {
                    if (tokenResult.mo12147b() == null) {
                        return true;
                    }
                } else if (bVar.equals(tokenResult.mo12147b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f27196a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f27197b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        TokenResult.b bVar = this.f27198c;
        return i ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("TokenResult{token=");
        sbM1556G.append(this.f27196a);
        sbM1556G.append(", tokenExpirationTimestamp=");
        sbM1556G.append(this.f27197b);
        sbM1556G.append(", responseCode=");
        sbM1556G.append(this.f27198c);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
