package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cx1 {

    /* JADX INFO: renamed from: a */
    public static final Logger f13142a = Logger.getLogger(cx1.class.getName());

    /* JADX INFO: renamed from: b */
    public static final ConcurrentMap<String, bx1> f13143b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentMap<String, ax1> f13144c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentMap<String, Boolean> f13145d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentMap<String, cw1<?>> f13146e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public static final ConcurrentMap<Class<?>, uw1<?, ?>> f13147f = new ConcurrentHashMap();

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static cw1<?> m6257a(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentMap<String, cw1<?>> concurrentMap = f13146e;
        Locale locale = Locale.US;
        cw1<?> cw1Var = concurrentMap.get(str.toLowerCase(locale));
        if (cw1Var != null) {
            return cw1Var;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tink")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(strConcat);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized <P> void m6258b(hw1<P> hw1Var, boolean z) throws GeneralSecurityException {
        try {
            if (hw1Var == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String strMo6268a = ((iw1) hw1Var).f15410a.mo6268a();
            m6265i(strMo6268a, hw1Var.getClass(), z);
            f13143b.putIfAbsent(strMo6268a, new xw1(hw1Var));
            f13145d.put(strMo6268a, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized <KeyProtoT extends l92> void m6259c(mw1<KeyProtoT> mw1Var, boolean z) throws GeneralSecurityException {
        String strMo6268a = mw1Var.mo6268a();
        m6265i(strMo6268a, mw1Var.getClass(), true);
        ConcurrentMap<String, bx1> concurrentMap = f13143b;
        if (!concurrentMap.containsKey(strMo6268a)) {
            concurrentMap.put(strMo6268a, new yw1(mw1Var));
            f13144c.put(strMo6268a, new ax1(mw1Var));
        }
        f13145d.put(strMo6268a, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized <KeyProtoT extends l92, PublicKeyProtoT extends l92> void m6260d(ww1<KeyProtoT, PublicKeyProtoT> ww1Var, mw1<PublicKeyProtoT> mw1Var, boolean z) throws GeneralSecurityException {
        Class<?> clsMo6119c;
        m6265i("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ww1Var.getClass(), true);
        m6265i("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", mw1Var.getClass(), false);
        ConcurrentMap<String, bx1> concurrentMap = f13143b;
        if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (clsMo6119c = concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").mo6119c()) != null && !clsMo6119c.equals(mw1Var.getClass())) {
            f13142a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", ww1Var.getClass().getName(), clsMo6119c.getName(), mw1Var.getClass().getName()));
        }
        if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").mo6119c() == null) {
            concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new zw1(ww1Var, mw1Var));
            f13144c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new ax1(ww1Var));
        }
        ConcurrentMap<String, Boolean> concurrentMap2 = f13145d;
        concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
        if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new yw1(mw1Var));
        }
        concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized <B, P> void m6261e(uw1<B, P> uw1Var) throws GeneralSecurityException {
        try {
            if (uw1Var == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> clsMo5893a = uw1Var.mo5893a();
            ConcurrentMap<Class<?>, uw1<?, ?>> concurrentMap = f13147f;
            if (concurrentMap.containsKey(clsMo5893a)) {
                uw1<?, ?> uw1Var2 = concurrentMap.get(clsMo5893a);
                if (!uw1Var.getClass().equals(uw1Var2.getClass())) {
                    Logger logger = f13142a;
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(clsMo5893a);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 56);
                    sb.append("Attempted overwrite of a registered SetWrapper for type ");
                    sb.append(strValueOf);
                    logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", clsMo5893a.getName(), uw1Var2.getClass().getName(), uw1Var.getClass().getName()));
                }
            }
            concurrentMap.put(clsMo5893a, uw1Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static synchronized l92 m6262f(k32 k32Var) throws GeneralSecurityException {
        hw1<?> hw1VarMo6117a;
        hw1VarMo6117a = m6264h(k32Var.m7434v()).mo6117a();
        if (!f13145d.get(k32Var.m7434v()).booleanValue()) {
            String strValueOf = String.valueOf(k32Var.m7434v());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return ((iw1) hw1VarMo6117a).m7311a(k32Var.m7435x());
    }

    /* JADX INFO: renamed from: g */
    public static <P> P m6263g(String str, l92 l92Var, Class<P> cls) throws GeneralSecurityException {
        iw1 iw1Var = (iw1) m6266j(str, cls);
        String name = iw1Var.f15410a.f16953a.getName();
        String strConcat = name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type ");
        if (iw1Var.f15410a.f16953a.isInstance(l92Var)) {
            return (P) iw1Var.m7313c(l92Var);
        }
        throw new GeneralSecurityException(strConcat);
    }

    /* JADX INFO: renamed from: h */
    public static synchronized bx1 m6264h(String str) throws GeneralSecurityException {
        ConcurrentMap<String, bx1> concurrentMap;
        concurrentMap = f13143b;
        if (!concurrentMap.containsKey(str)) {
            String strValueOf = String.valueOf(str);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "No key manager found for key type ".concat(strValueOf) : new String("No key manager found for key type "));
        }
        return concurrentMap.get(str);
    }

    /* JADX INFO: renamed from: i */
    public static synchronized void m6265i(String str, Class<?> cls, boolean z) throws GeneralSecurityException {
        ConcurrentMap<String, bx1> concurrentMap = f13143b;
        if (concurrentMap.containsKey(str)) {
            bx1 bx1Var = concurrentMap.get(str);
            if (!bx1Var.mo6118b().equals(cls)) {
                f13142a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, bx1Var.mo6118b().getName(), cls.getName()));
            }
            if (!z || f13145d.get(str).booleanValue()) {
            } else {
                throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static <P> hw1<P> m6266j(String str, Class<P> cls) throws GeneralSecurityException {
        bx1 bx1VarM6264h = m6264h(str);
        if (bx1VarM6264h.mo6121e().contains(cls)) {
            return bx1VarM6264h.mo6120d(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(bx1VarM6264h.mo6118b());
        Set<Class<?>> setMo6121e = bx1VarM6264h.mo6121e();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : setMo6121e) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder(outline.m1578b(name.length(), 77, strValueOf.length(), String.valueOf(string).length()));
        outline.m1572W(sb2, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(outline.m1550A(sb2, ", supported primitives: ", string));
    }

    /* JADX INFO: renamed from: k */
    public static <P> P m6267k(String str, g72 g72Var, Class<P> cls) throws GeneralSecurityException {
        iw1 iw1Var = (iw1) m6266j(str, cls);
        Objects.requireNonNull(iw1Var);
        try {
            return (P) iw1Var.m7313c(iw1Var.f15410a.mo6270c(g72Var));
        } catch (r82 e) {
            String name = iw1Var.f15410a.f16953a.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e);
        }
    }
}
