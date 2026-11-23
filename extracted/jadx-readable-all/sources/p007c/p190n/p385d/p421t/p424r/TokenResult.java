package p007c.p190n.p385d.p421t.p424r;

/* JADX INFO: renamed from: c.n.d.t.r.f, reason: use source file name */
/* JADX INFO: compiled from: TokenResult.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class TokenResult {

    /* JADX INFO: renamed from: c.n.d.t.r.f$a */
    /* JADX INFO: compiled from: TokenResult.java */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract TokenResult mo12150a();

        /* JADX INFO: renamed from: b */
        public abstract a mo12151b(long j2);
    }

    /* JADX INFO: renamed from: c.n.d.t.r.f$b */
    /* JADX INFO: compiled from: TokenResult.java */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* JADX INFO: renamed from: a */
    public static a m12163a() {
        AutoValue_TokenResult.b bVar = new AutoValue_TokenResult.b();
        bVar.mo12151b(0L);
        return bVar;
    }

    /* JADX INFO: renamed from: b */
    public abstract b mo12147b();

    /* JADX INFO: renamed from: c */
    public abstract String mo12148c();

    /* JADX INFO: renamed from: d */
    public abstract long mo12149d();
}
