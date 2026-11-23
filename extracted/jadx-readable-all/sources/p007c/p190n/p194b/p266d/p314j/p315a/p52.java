package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.x52;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class p52<T_WRAPPER extends x52<T_ENGINE>, T_ENGINE> {

    /* JADX INFO: renamed from: a */
    public static final Logger f17854a = Logger.getLogger(p52.class.getName());

    /* JADX INFO: renamed from: b */
    public static final List<Provider> f17855b;

    /* JADX INFO: renamed from: c */
    public static final p52<q52, Cipher> f17856c;

    /* JADX INFO: renamed from: d */
    public static final p52<u52, Mac> f17857d;

    /* JADX INFO: renamed from: e */
    public static final p52<r52, KeyAgreement> f17858e;

    /* JADX INFO: renamed from: f */
    public static final p52<t52, KeyPairGenerator> f17859f;

    /* JADX INFO: renamed from: g */
    public static final p52<s52, KeyFactory> f17860g;

    /* JADX INFO: renamed from: h */
    public final T_WRAPPER f17861h;

    /* JADX INFO: renamed from: i */
    public final List<Provider> f17862i = f17855b;

    static {
        if (C2622l.m5451w1()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f17854a.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            f17855b = arrayList;
        } else {
            f17855b = new ArrayList();
        }
        f17856c = new p52<>(new q52());
        f17857d = new p52<>(new u52());
        new p52(new w52());
        new p52(new v52());
        f17858e = new p52<>(new r52());
        f17859f = new p52<>(new t52());
        f17860g = new p52<>(new s52());
    }

    public p52(T_WRAPPER t_wrapper) {
        this.f17861h = t_wrapper;
    }

    /* JADX INFO: renamed from: a */
    public final T_ENGINE m8079a(String str) throws GeneralSecurityException {
        Iterator<Provider> it = this.f17862i.iterator();
        while (it.hasNext()) {
            try {
                return (T_ENGINE) this.f17861h.mo8191a(str, it.next());
            } catch (Exception unused) {
            }
        }
        return (T_ENGINE) this.f17861h.mo8191a(str, null);
    }
}
