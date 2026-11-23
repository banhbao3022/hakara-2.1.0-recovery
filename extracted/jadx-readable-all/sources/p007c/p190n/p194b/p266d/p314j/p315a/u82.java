package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class u82 {

    /* JADX INFO: renamed from: a */
    public volatile l92 f20242a;

    /* JADX INFO: renamed from: b */
    public volatile g72 f20243b;

    static {
        s72.m8347a();
    }

    /* JADX INFO: renamed from: a */
    public final int m8477a() {
        if (this.f20243b != null) {
            return ((e72) this.f20243b).f13527h.length;
        }
        if (this.f20242a != null) {
            return this.f20242a.mo6961e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final g72 m8478b() {
        if (this.f20243b != null) {
            return this.f20243b;
        }
        synchronized (this) {
            if (this.f20243b != null) {
                return this.f20243b;
            }
            if (this.f20242a == null) {
                this.f20243b = g72.f14513f;
            } else {
                this.f20243b = this.f20242a.mo7573b();
            }
            return this.f20243b;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8479c(l92 l92Var) {
        if (this.f20242a != null) {
            return;
        }
        synchronized (this) {
            if (this.f20242a == null) {
                try {
                    this.f20242a = l92Var;
                    this.f20243b = g72.f14513f;
                } catch (r82 unused) {
                    this.f20242a = l92Var;
                    this.f20243b = g72.f14513f;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u82)) {
            return false;
        }
        u82 u82Var = (u82) obj;
        l92 l92Var = this.f20242a;
        l92 l92Var2 = u82Var.f20242a;
        if (l92Var == null && l92Var2 == null) {
            return m8478b().equals(u82Var.m8478b());
        }
        if (l92Var != null && l92Var2 != null) {
            return l92Var.equals(l92Var2);
        }
        if (l92Var != null) {
            u82Var.m8479c(l92Var.mo6294g());
            return l92Var.equals(u82Var.f20242a);
        }
        m8479c(l92Var2.mo6294g());
        return this.f20242a.equals(l92Var2);
    }

    public int hashCode() {
        return 1;
    }
}
