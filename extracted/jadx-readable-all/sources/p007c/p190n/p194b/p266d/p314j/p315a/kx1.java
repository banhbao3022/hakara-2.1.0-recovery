package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kx1 extends mw1<b02> {
    public kx1() {
        super(b02.class, new hx1(bw1.class));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: a */
    public final String mo6268a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: b */
    public final e32 mo6269b() {
        return e32.SYMMETRIC;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ l92 mo6270c(g72 g72Var) throws r82 {
        return b02.m5904z(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo6271d(l92 l92Var) throws GeneralSecurityException {
        b02 b02Var = (b02) l92Var;
        h62.m7067b(b02Var.m5905v(), 0);
        new nx1();
        nx1.m7946h(b02Var.m5906x());
        new lz1();
        lz1.m7649h(b02Var.m5907y());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: g */
    public final jw1<e02, b02> mo6272g() {
        return new jx1(this, e02.class);
    }
}
