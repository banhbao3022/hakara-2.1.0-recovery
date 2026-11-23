package p509g1;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.j, reason: use source file name */
/* JADX INFO: compiled from: CipherSuite.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CipherSuite {

    /* JADX INFO: renamed from: a */
    public static final Comparator<String> f30047a;

    /* JADX INFO: renamed from: b */
    public static final Map<String, CipherSuite> f30048b;

    /* JADX INFO: renamed from: c */
    public static final CipherSuite f30049c;

    /* JADX INFO: renamed from: d */
    public static final CipherSuite f30050d;

    /* JADX INFO: renamed from: e */
    public static final CipherSuite f30051e;

    /* JADX INFO: renamed from: f */
    public static final CipherSuite f30052f;

    /* JADX INFO: renamed from: g */
    public static final CipherSuite f30053g;

    /* JADX INFO: renamed from: h */
    public static final CipherSuite f30054h;

    /* JADX INFO: renamed from: i */
    public static final CipherSuite f30055i;

    /* JADX INFO: renamed from: j */
    public static final CipherSuite f30056j;

    /* JADX INFO: renamed from: k */
    public static final CipherSuite f30057k;

    /* JADX INFO: renamed from: l */
    public static final CipherSuite f30058l;

    /* JADX INFO: renamed from: m */
    public static final CipherSuite f30059m;

    /* JADX INFO: renamed from: n */
    public static final CipherSuite f30060n;

    /* JADX INFO: renamed from: o */
    public static final CipherSuite f30061o;

    /* JADX INFO: renamed from: p */
    public static final CipherSuite f30062p;

    /* JADX INFO: renamed from: q */
    public static final CipherSuite f30063q;

    /* JADX INFO: renamed from: r */
    public static final CipherSuite f30064r;

    /* JADX INFO: renamed from: s */
    public static final b f30065s;

    /* JADX INFO: renamed from: t */
    public final String f30066t;

    /* JADX INFO: renamed from: g1.j$a */
    /* JADX INFO: compiled from: CipherSuite.kt */
    public static final class a implements Comparator<String> {
        /* JADX WARN: Code duplicated, block: B:9:0x002c A[RETURN, SYNTHETIC] */
        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            Intrinsics2.m13090f(str3, "a");
            Intrinsics2.m13090f(str4, "b");
            int iMin = Math.min(str3.length(), str4.length());
            for (int i = 4; i < iMin; i++) {
                char cCharAt = str3.charAt(i);
                char cCharAt2 = str4.charAt(i);
                if (cCharAt != cCharAt2) {
                    if (cCharAt < cCharAt2) {
                        return -1;
                    }
                    return 1;
                }
            }
            int length = str3.length();
            int length2 = str4.length();
            if (length == length2) {
                return 0;
            }
            if (length < length2) {
                return -1;
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: g1.j$b */
    /* JADX INFO: compiled from: CipherSuite.kt */
    public static final class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public static final CipherSuite m13356a(b bVar, String str, int i) {
            CipherSuite cipherSuite = new CipherSuite(str, null);
            CipherSuite.f30048b.put(str, cipherSuite);
            return cipherSuite;
        }

        /* JADX INFO: renamed from: b */
        public final synchronized CipherSuite m13357b(String str) {
            CipherSuite cipherSuite;
            Intrinsics2.m13090f(str, "javaName");
            Map<String, CipherSuite> map = CipherSuite.f30048b;
            cipherSuite = map.get(str);
            if (cipherSuite == null) {
                cipherSuite = map.get(m13358c(str));
                if (cipherSuite == null) {
                    cipherSuite = new CipherSuite(str, null);
                }
                map.put(str, cipherSuite);
            }
            return cipherSuite;
        }

        /* JADX INFO: renamed from: c */
        public final String m13358c(String str) {
            if (StringsJVM.m12997n(str, "TLS_", false, 2)) {
                StringBuilder sbM1556G = outline.m1556G("SSL_");
                String strSubstring = str.substring(4);
                Intrinsics2.m13086b(strSubstring, "(this as java.lang.String).substring(startIndex)");
                sbM1556G.append(strSubstring);
                return sbM1556G.toString();
            }
            if (!StringsJVM.m12997n(str, "SSL_", false, 2)) {
                return str;
            }
            StringBuilder sbM1556G2 = outline.m1556G("TLS_");
            String strSubstring2 = str.substring(4);
            Intrinsics2.m13086b(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            sbM1556G2.append(strSubstring2);
            return sbM1556G2.toString();
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        b bVar = new b(null);
        f30065s = bVar;
        f30047a = new a();
        f30048b = new LinkedHashMap();
        b.m13356a(bVar, "SSL_RSA_WITH_NULL_MD5", 1);
        b.m13356a(bVar, "SSL_RSA_WITH_NULL_SHA", 2);
        b.m13356a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        b.m13356a(bVar, "SSL_RSA_WITH_RC4_128_MD5", 4);
        b.m13356a(bVar, "SSL_RSA_WITH_RC4_128_SHA", 5);
        b.m13356a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        b.m13356a(bVar, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        f30049c = b.m13356a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        b.m13356a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        b.m13356a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        b.m13356a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        b.m13356a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        b.m13356a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        b.m13356a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        b.m13356a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        b.m13356a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        b.m13356a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        b.m13356a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        b.m13356a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        b.m13356a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        b.m13356a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        b.m13356a(bVar, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        b.m13356a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        b.m13356a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        b.m13356a(bVar, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        b.m13356a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        b.m13356a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        b.m13356a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        b.m13356a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f30050d = b.m13356a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        b.m13356a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        b.m13356a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        b.m13356a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f30051e = b.m13356a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        b.m13356a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        b.m13356a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        b.m13356a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        b.m13356a(bVar, "TLS_RSA_WITH_NULL_SHA256", 59);
        b.m13356a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        b.m13356a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        b.m13356a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        b.m13356a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        b.m13356a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        b.m13356a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        b.m13356a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        b.m13356a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        b.m13356a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        b.m13356a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        b.m13356a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        b.m13356a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        b.m13356a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        b.m13356a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        b.m13356a(bVar, "TLS_PSK_WITH_RC4_128_SHA", 138);
        b.m13356a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        b.m13356a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        b.m13356a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        b.m13356a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f30052f = b.m13356a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f30053g = b.m13356a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        b.m13356a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        b.m13356a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        b.m13356a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        b.m13356a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        b.m13356a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        b.m13356a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        b.m13356a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        b.m13356a(bVar, "TLS_FALLBACK_SCSV", 22016);
        b.m13356a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        b.m13356a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        b.m13356a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        b.m13356a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        b.m13356a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        b.m13356a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        b.m13356a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        b.m13356a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        b.m13356a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        b.m13356a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        b.m13356a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        b.m13356a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        b.m13356a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        b.m13356a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        b.m13356a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        b.m13356a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        b.m13356a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        b.m13356a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f30054h = b.m13356a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f30055i = b.m13356a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        b.m13356a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        b.m13356a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        b.m13356a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        b.m13356a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        b.m13356a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        b.m13356a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        b.m13356a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        b.m13356a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        b.m13356a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        b.m13356a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        b.m13356a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        b.m13356a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        b.m13356a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f30056j = b.m13356a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f30057k = b.m13356a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        b.m13356a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        b.m13356a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f30058l = b.m13356a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f30059m = b.m13356a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        b.m13356a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        b.m13356a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        b.m13356a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        b.m13356a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f30060n = b.m13356a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f30061o = b.m13356a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        b.m13356a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        b.m13356a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f30062p = b.m13356a(bVar, "TLS_AES_128_GCM_SHA256", 4865);
        f30063q = b.m13356a(bVar, "TLS_AES_256_GCM_SHA384", 4866);
        f30064r = b.m13356a(bVar, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        b.m13356a(bVar, "TLS_AES_128_CCM_SHA256", 4868);
        b.m13356a(bVar, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public CipherSuite(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f30066t = str;
    }

    public String toString() {
        return this.f30066t;
    }
}
