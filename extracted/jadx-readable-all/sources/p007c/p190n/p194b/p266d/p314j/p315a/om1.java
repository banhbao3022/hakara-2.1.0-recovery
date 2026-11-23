package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class om1 implements im1 {

    /* JADX INFO: renamed from: a */
    public final sm1 f17678a;

    /* JADX INFO: renamed from: b */
    public final qm1 f17679b;

    /* JADX INFO: renamed from: c */
    public final fm1 f17680c;

    public om1(fm1 fm1Var, sm1 sm1Var, qm1 qm1Var, byte[] bArr) {
        this.f17680c = fm1Var;
        this.f17678a = sm1Var;
        this.f17679b = qm1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.im1
    /* JADX INFO: renamed from: a */
    public final String mo7279a(hm1 hm1Var) {
        sm1 sm1Var = this.f17678a;
        Map<String, String> mapM7149f = hm1Var.m7149f();
        this.f17679b.m8219a(mapM7149f);
        return sm1Var.m8356a(mapM7149f);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.im1
    /* JADX INFO: renamed from: b */
    public final void mo7280b(hm1 hm1Var) {
        final fm1 fm1Var = this.f17680c;
        final String strMo7279a = mo7279a(hm1Var);
        fm1Var.f14057a.execute(new Runnable(fm1Var, strMo7279a) { // from class: c.n.b.d.j.a.em1

            /* JADX INFO: renamed from: f */
            public final fm1 f13610f;

            /* JADX INFO: renamed from: g */
            public final String f13611g;

            {
                this.f13610f = fm1Var;
                this.f13611g = strMo7279a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                fm1 fm1Var2 = this.f13610f;
                fm1Var2.f14058b.mo4730f(this.f13611g);
            }
        });
    }
}
