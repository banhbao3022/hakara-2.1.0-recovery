package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p315a.l92;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mw1<KeyProtoT extends l92> {

    /* JADX INFO: renamed from: a */
    public final Class<KeyProtoT> f16953a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, lw1<?, KeyProtoT>> f16954b;

    /* JADX INFO: renamed from: c */
    public final Class<?> f16955c;

    @SafeVarargs
    public mw1(Class<KeyProtoT> cls, lw1<?, KeyProtoT>... lw1VarArr) {
        this.f16953a = cls;
        HashMap map = new HashMap();
        for (int i = 0; i <= 0; i++) {
            lw1<?, KeyProtoT> lw1Var = lw1VarArr[i];
            if (map.containsKey(lw1Var.f16628a)) {
                String strValueOf = String.valueOf(lw1Var.f16628a.getCanonicalName());
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map.put(lw1Var.f16628a, lw1Var);
        }
        this.f16955c = lw1VarArr[0].f16628a;
        this.f16954b = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo6268a();

    /* JADX INFO: renamed from: b */
    public abstract e32 mo6269b();

    /* JADX INFO: renamed from: c */
    public abstract KeyProtoT mo6270c(g72 g72Var) throws r82;

    /* JADX INFO: renamed from: d */
    public abstract void mo6271d(KeyProtoT keyprotot) throws GeneralSecurityException;

    /* JADX INFO: renamed from: e */
    public final <P> P m7736e(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        lw1<?, KeyProtoT> lw1Var = this.f16954b.get(cls);
        if (lw1Var != null) {
            return (P) lw1Var.mo5892a(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException(outline.m1552C(new StringBuilder(String.valueOf(canonicalName).length() + 41), "Requested primitive class ", canonicalName, " not supported."));
    }

    /* JADX INFO: renamed from: f */
    public final Set<Class<?>> m7737f() {
        return this.f16954b.keySet();
    }

    /* JADX INFO: renamed from: g */
    public jw1<?, KeyProtoT> mo6272g() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
