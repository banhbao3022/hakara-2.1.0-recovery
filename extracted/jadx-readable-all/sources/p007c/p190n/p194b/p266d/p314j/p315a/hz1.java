package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class hz1 extends mw1<sz1> {
    public hz1() {
        super(sz1.class, new fz1(qw1.class));
    }

    /* JADX INFO: renamed from: h */
    public static void m7180h(yz1 yz1Var) throws GeneralSecurityException {
        if (yz1Var.m8842v() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (yz1Var.m8842v() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: a */
    public final String mo6268a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: b */
    public final e32 mo6269b() {
        return e32.SYMMETRIC;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ l92 mo6270c(g72 g72Var) throws r82 {
        return sz1.m8379z(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: d */
    public final void mo6271d(l92 l92Var) throws GeneralSecurityException {
        sz1 sz1Var = (sz1) l92Var;
        h62.m7067b(sz1Var.m8380v(), 0);
        if (sz1Var.m8381x().mo5719m() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        m7180h(sz1Var.m8382y());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: g */
    public final jw1<vz1, sz1> mo6272g() {
        return new gz1(vz1.class);
    }
}
