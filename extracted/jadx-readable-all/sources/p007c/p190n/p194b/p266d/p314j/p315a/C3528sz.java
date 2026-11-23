package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.sz */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3528sz {

    /* JADX INFO: renamed from: a */
    public final im1 f19738a;

    /* JADX INFO: renamed from: b */
    public final po0 f19739b;

    /* JADX INFO: renamed from: c */
    public final di1 f19740c;

    public C3528sz(po0 po0Var, di1 di1Var, im1 im1Var) {
        this.f19738a = im1Var;
        this.f19739b = po0Var;
        this.f19740c = di1Var;
    }

    /* JADX INFO: renamed from: b */
    public static String m8372b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return "h";
        }
        if (i2 == 1) {
            return "bb";
        }
        if (i2 == 2) {
            return "cc";
        }
        if (i2 != 3) {
            return i2 != 4 ? "u" : "ac";
        }
        return "cb";
    }

    /* JADX INFO: renamed from: a */
    public final void m8373a(long j2, int i) {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14351f5)).booleanValue()) {
            im1 im1Var = this.f19738a;
            hm1 hm1VarM7144a = hm1.m7144a("ad_closed");
            hm1VarM7144a.m7148e(this.f19740c.f13281b.f12695b);
            hm1VarM7144a.f14911a.put("show_time", String.valueOf(j2));
            hm1VarM7144a.f14911a.put("ad_format", "app_open_ad");
            hm1VarM7144a.f14911a.put("acr", m8372b(i));
            im1Var.mo7280b(hm1VarM7144a);
            return;
        }
        oo0 oo0VarM8131a = this.f19739b.m8131a();
        oo0VarM8131a.m8046a(this.f19740c.f13281b.f12695b);
        oo0VarM8131a.f17700a.put("action", "ad_closed");
        oo0VarM8131a.f17700a.put("show_time", String.valueOf(j2));
        oo0VarM8131a.f17700a.put("ad_format", "app_open_ad");
        oo0VarM8131a.f17700a.put("acr", m8372b(i));
        oo0VarM8131a.m8047b();
    }
}
