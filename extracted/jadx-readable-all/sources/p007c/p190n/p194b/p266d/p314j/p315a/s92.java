package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class s92 {

    /* JADX INFO: renamed from: a */
    public static final s92 f19505a = new s92();

    /* JADX INFO: renamed from: c */
    public final ConcurrentMap<Class<?>, ba2<?>> f19507c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final ca2 f19506b = new e92();

    /* JADX INFO: renamed from: a */
    public final <T> ba2<T> m8349a(Class<T> cls) {
        o92 o92Var;
        Class<?> cls2;
        Charset charset = p82.f17879a;
        Objects.requireNonNull(cls, "messageType");
        ba2<T> ba2VarM7782F = (ba2) this.f19507c.get(cls);
        if (ba2VarM7782F == null) {
            e92 e92Var = (e92) this.f19506b;
            Objects.requireNonNull(e92Var);
            Class<?> cls3 = da2.f13197a;
            if (!g82.class.isAssignableFrom(cls) && (cls2 = da2.f13197a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            j92 j92VarMo6150b = e92Var.f13534b.mo6150b(cls);
            if (j92VarMo6150b.zza()) {
                if (g82.class.isAssignableFrom(cls)) {
                    oa2<?, ?> oa2Var = da2.f13200d;
                    t72<?> t72Var = v72.f20708a;
                    o92Var = new o92(oa2Var, v72.f20708a, j92VarMo6150b.mo7320a());
                } else {
                    oa2<?, ?> oa2Var2 = da2.f13198b;
                    t72<?> t72Var2 = v72.f20709b;
                    if (t72Var2 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    o92Var = new o92(oa2Var2, t72Var2, j92VarMo6150b.mo7320a());
                }
                ba2VarM7782F = o92Var;
            } else {
                if (g82.class.isAssignableFrom(cls)) {
                    if (j92VarMo6150b.mo7321b() == 1) {
                        p92 p92Var = q92.f18241b;
                        a92 a92Var = a92.f12046b;
                        oa2<?, ?> oa2Var3 = da2.f13200d;
                        t72<?> t72Var3 = v72.f20708a;
                        ba2VarM7782F = n92.m7782F(j92VarMo6150b, p92Var, a92Var, oa2Var3, v72.f20708a, i92.f15114b);
                    } else {
                        ba2VarM7782F = n92.m7782F(j92VarMo6150b, q92.f18241b, a92.f12046b, da2.f13200d, null, i92.f15114b);
                    }
                } else {
                    if (j92VarMo6150b.mo7321b() == 1) {
                        p92 p92Var2 = q92.f18240a;
                        a92 a92Var2 = a92.f12045a;
                        oa2<?, ?> oa2Var4 = da2.f13198b;
                        t72<?> t72Var4 = v72.f20709b;
                        if (t72Var4 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        ba2VarM7782F = n92.m7782F(j92VarMo6150b, p92Var2, a92Var2, oa2Var4, t72Var4, i92.f15113a);
                    } else {
                        ba2VarM7782F = n92.m7782F(j92VarMo6150b, q92.f18240a, a92.f12045a, da2.f13199c, null, i92.f15113a);
                    }
                }
            }
            ba2<T> ba2Var = (ba2) this.f19507c.putIfAbsent(cls, ba2VarM7782F);
            if (ba2Var != null) {
                return ba2Var;
            }
        }
        return ba2VarM7782F;
    }
}
