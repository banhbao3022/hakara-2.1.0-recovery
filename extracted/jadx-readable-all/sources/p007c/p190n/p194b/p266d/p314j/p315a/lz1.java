package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class lz1 extends mw1<v22> {
    public lz1() {
        super(v22.class, new jz1(qw1.class));
    }

    /* JADX INFO: renamed from: h */
    public static final void m7649h(v22 v22Var) throws GeneralSecurityException {
        h62.m7067b(v22Var.m8534v(), 0);
        if (v22Var.m8536y().mo5719m() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m7650i(v22Var.m8535x());
    }

    /* JADX INFO: renamed from: i */
    public static void m7650i(b32 b32Var) throws GeneralSecurityException {
        if (b32Var.m5924x() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = b32Var.m5923v().ordinal();
        if (iOrdinal == 1) {
            if (b32Var.m5924x() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 3) {
            if (b32Var.m5924x() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (b32Var.m5924x() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: a */
    public final String mo6268a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: b */
    public final e32 mo6269b() {
        return e32.SYMMETRIC;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ l92 mo6270c(g72 g72Var) throws r82 {
        return v22.m8533z(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo6271d(l92 l92Var) throws GeneralSecurityException {
        m7649h((v22) l92Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: g */
    public final jw1<y22, v22> mo6272g() {
        return new kz1(this, y22.class);
    }
}
