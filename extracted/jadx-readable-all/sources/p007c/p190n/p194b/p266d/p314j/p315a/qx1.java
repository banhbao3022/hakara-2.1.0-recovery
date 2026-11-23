package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qx1 extends mw1<r02> {
    public qx1() {
        super(r02.class, new ox1(bw1.class));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: a */
    public final String mo6268a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: b */
    public final e32 mo6269b() {
        return e32.SYMMETRIC;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ l92 mo6270c(g72 g72Var) throws r82 {
        return r02.m8238z(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo6271d(l92 l92Var) throws GeneralSecurityException {
        r02 r02Var = (r02) l92Var;
        h62.m7067b(r02Var.m8239v(), 0);
        h62.m7066a(r02Var.m8241y().mo5719m());
        if (r02Var.m8240x().m8713v() != 12 && r02Var.m8240x().m8713v() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: g */
    public final jw1<u02, r02> mo6272g() {
        return new px1(this, u02.class);
    }
}
