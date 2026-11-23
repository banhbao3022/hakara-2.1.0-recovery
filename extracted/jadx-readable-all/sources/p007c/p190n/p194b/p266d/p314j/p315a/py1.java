package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class py1 extends mw1<n12> {
    public py1() {
        super(n12.class, new ny1(ew1.class));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: a */
    public final String mo6268a() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: b */
    public final e32 mo6269b() {
        return e32.SYMMETRIC;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ l92 mo6270c(g72 g72Var) throws r82 {
        return n12.m7753y(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo6271d(l92 l92Var) throws GeneralSecurityException {
        n12 n12Var = (n12) l92Var;
        h62.m7067b(n12Var.m7755v(), 0);
        if (n12Var.m7756x().mo5719m() == 64) {
            return;
        }
        int iMo5719m = n12Var.m7756x().mo5719m();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(iMo5719m);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mw1
    /* JADX INFO: renamed from: g */
    public final jw1<q12, n12> mo6272g() {
        return new oy1(this, q12.class);
    }
}
