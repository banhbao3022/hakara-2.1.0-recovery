package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends mw1<h02> {
    public nx1() {
        super(h02.class, new lx1(z52.class));
    }

    /* JADX INFO: renamed from: h */
    public static final void m7946h(h02 h02Var) throws GeneralSecurityException {
        h62.m7067b(h02Var.m7050v(), 0);
        h62.m7066a(h02Var.m7052y().mo5719m());
        m7947i(h02Var.m7051x());
    }

    /* JADX INFO: renamed from: i */
    public static final void m7947i(o02 o02Var) throws GeneralSecurityException {
        if (o02Var.m7956v() < 12 || o02Var.m7956v() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: a */
    public final String mo6268a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: b */
    public final e32 mo6269b() {
        return e32.SYMMETRIC;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ l92 mo6270c(g72 g72Var) throws r82 {
        return h02.m7049z(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo6271d(l92 l92Var) throws GeneralSecurityException {
        m7946h((h02) l92Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: g */
    public final jw1<l02, h02> mo6272g() {
        return new mx1(this, l02.class);
    }
}
