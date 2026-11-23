package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import p007c.p190n.p194b.p266d.p314j.p315a.l92;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class iw1<PrimitiveT, KeyProtoT extends l92> implements hw1<PrimitiveT> {

    /* JADX INFO: renamed from: a */
    public final mw1<KeyProtoT> f15410a;

    /* JADX INFO: renamed from: b */
    public final Class<PrimitiveT> f15411b;

    public iw1(mw1<KeyProtoT> mw1Var, Class<PrimitiveT> cls) {
        if (!mw1Var.m7737f().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", mw1Var.toString(), cls.getName()));
        }
        this.f15410a = mw1Var;
        this.f15411b = cls;
    }

    /* JADX INFO: renamed from: a */
    public final l92 m7311a(g72 g72Var) throws GeneralSecurityException {
        try {
            jw1<?, KeyProtoT> jw1VarMo6272g = this.f15410a.mo6272g();
            l92 l92VarMo6124b = jw1VarMo6272g.mo6124b(g72Var);
            jw1VarMo6272g.mo6123a(l92VarMo6124b);
            return jw1VarMo6272g.mo6125c(l92VarMo6124b);
        } catch (r82 e) {
            String name = this.f15410a.mo6272g().f15834a.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final f32 m7312b(g72 g72Var) throws GeneralSecurityException {
        try {
            jw1<?, KeyProtoT> jw1VarMo6272g = this.f15410a.mo6272g();
            l92 l92VarMo6124b = jw1VarMo6272g.mo6124b(g72Var);
            jw1VarMo6272g.mo6123a(l92VarMo6124b);
            KeyProtoT keyprototMo6125c = jw1VarMo6272g.mo6125c(l92VarMo6124b);
            d32 d32VarM6775z = f32.m6775z();
            String strMo6268a = this.f15410a.mo6268a();
            if (d32VarM6775z.f13191h) {
                d32VarM6775z.m6298m();
                d32VarM6775z.f13191h = false;
            }
            ((f32) d32VarM6775z.f13190g).zzb = strMo6268a;
            g72 g72VarMo7573b = keyprototMo6125c.mo7573b();
            if (d32VarM6775z.f13191h) {
                d32VarM6775z.m6298m();
                d32VarM6775z.f13191h = false;
            }
            ((f32) d32VarM6775z.f13190g).zze = g72VarMo7573b;
            e32 e32VarMo6269b = this.f15410a.mo6269b();
            if (d32VarM6775z.f13191h) {
                d32VarM6775z.m6298m();
                d32VarM6775z.f13191h = false;
            }
            f32.m6774E((f32) d32VarM6775z.f13190g, e32VarMo6269b);
            return d32VarM6775z.m6300o();
        } catch (r82 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final PrimitiveT m7313c(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.f15411b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f15410a.mo6271d(keyprotot);
        return (PrimitiveT) this.f15410a.m7736e(keyprotot, this.f15411b);
    }
}
