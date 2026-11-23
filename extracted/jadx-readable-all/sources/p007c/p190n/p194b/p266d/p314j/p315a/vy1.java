package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vy1 extends ww1<k22, n22> {
    public vy1() {
        super(k22.class, new ty1(fw1.class));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: a */
    public final String mo6268a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: b */
    public final e32 mo6269b() {
        return e32.ASYMMETRIC_PRIVATE;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ l92 mo6270c(g72 g72Var) throws r82 {
        return k22.m7427z(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: d */
    public final void mo6271d(l92 l92Var) throws GeneralSecurityException {
        k22 k22Var = (k22) l92Var;
        if (k22Var.m7430y().mo5719m() == 0) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        h62.m7067b(k22Var.m7428v(), 0);
        C2622l.m5324W0(k22Var.m7429x().m7767x());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: g */
    public final jw1<d22, k22> mo6272g() {
        return new uy1(this, d22.class);
    }
}
