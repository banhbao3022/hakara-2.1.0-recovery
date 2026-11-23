package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xj2 {

    /* JADX INFO: renamed from: a */
    public final int f21561a;

    /* JADX INFO: renamed from: b */
    public int f21562b;

    /* JADX INFO: renamed from: c */
    public int f21563c;

    /* JADX INFO: renamed from: d */
    public long f21564d;

    /* JADX INFO: renamed from: e */
    public final boolean f21565e;

    /* JADX INFO: renamed from: f */
    public final do2 f21566f;

    /* JADX INFO: renamed from: g */
    public final do2 f21567g;

    /* JADX INFO: renamed from: h */
    public int f21568h;

    /* JADX INFO: renamed from: i */
    public int f21569i;

    public xj2(do2 do2Var, do2 do2Var2, boolean z) {
        this.f21567g = do2Var;
        this.f21566f = do2Var2;
        this.f21565e = z;
        do2Var2.m6389f(12);
        this.f21561a = do2Var2.m6397n();
        do2Var.m6389f(12);
        this.f21569i = do2Var.m6397n();
        C2622l.m5363e3(do2Var.m6395l() == 1, "first_chunk must be 1");
        this.f21562b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8739a() {
        int i = this.f21562b + 1;
        this.f21562b = i;
        if (i == this.f21561a) {
            return false;
        }
        this.f21564d = this.f21565e ? this.f21566f.m6398o() : this.f21566f.m6394k();
        if (this.f21562b == this.f21568h) {
            this.f21563c = this.f21567g.m6397n();
            this.f21567g.m6390g(4);
            int i2 = this.f21569i - 1;
            this.f21569i = i2;
            this.f21568h = i2 > 0 ? (-1) + this.f21567g.m6397n() : -1;
        }
        return true;
    }
}
