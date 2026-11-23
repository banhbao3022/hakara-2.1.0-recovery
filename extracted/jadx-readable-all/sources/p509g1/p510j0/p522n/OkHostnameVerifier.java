package p509g1.p510j0.p522n;

import java.net.UnknownHostException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s.Collections4;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: g1.j0.n.d, reason: use source file name */
/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class OkHostnameVerifier implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final OkHostnameVerifier f30579a = new OkHostnameVerifier();

    /* JADX INFO: renamed from: a */
    public final List<String> m13620a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections4.f29519f;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!Intrinsics2.m13085a(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections4.f29519f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX INFO: renamed from: b */
    public final boolean m13621b(String str, X509Certificate x509Certificate) throws UnknownHostException {
        boolean zM13085a;
        int length;
        Intrinsics2.m13090f(str, "host");
        Intrinsics2.m13090f(x509Certificate, "certificate");
        byte[] bArr = Util9.f30070a;
        Intrinsics2.m13090f(str, "$this$canParseAsIpAddress");
        if (Util9.f30075f.m12982a(str)) {
            String strM14084e0 = SkuDao.a.m14084e0(str);
            List<String> listM13620a = m13620a(x509Certificate, 7);
            if (!listM13620a.isEmpty()) {
                Iterator<T> it = listM13620a.iterator();
                while (it.hasNext()) {
                    if (Intrinsics2.m13085a(strM14084e0, SkuDao.a.m14084e0((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            Locale locale = Locale.US;
            Intrinsics2.m13086b(locale, "Locale.US");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics2.m13086b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List<String> listM13620a2 = m13620a(x509Certificate, 2);
            if (!listM13620a2.isEmpty()) {
                for (String strM1599u : listM13620a2) {
                    if ((lowerCase.length() == 0) || StringsJVM.m12997n(lowerCase, ".", false, 2) || StringsJVM.m12988e(lowerCase, "..", false, 2)) {
                        zM13085a = false;
                    } else if ((strM1599u == null || strM1599u.length() == 0) || StringsJVM.m12997n(strM1599u, ".", false, 2) || StringsJVM.m12988e(strM1599u, "..", false, 2)) {
                        zM13085a = false;
                    } else {
                        String strM1599u2 = !StringsJVM.m12988e(lowerCase, ".", false, 2) ? outline.m1599u(lowerCase, ".") : lowerCase;
                        if (!StringsJVM.m12988e(strM1599u, ".", false, 2)) {
                            strM1599u = outline.m1599u(strM1599u, ".");
                        }
                        Locale locale2 = Locale.US;
                        Intrinsics2.m13086b(locale2, "Locale.US");
                        if (strM1599u == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase2 = strM1599u.toLowerCase(locale2);
                        Intrinsics2.m13086b(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                        if (!Strings5.m13006p(lowerCase2, "*", false, 2)) {
                            zM13085a = Intrinsics2.m13085a(strM1599u2, lowerCase2);
                        } else if (!StringsJVM.m12997n(lowerCase2, "*.", false, 2) || Strings5.m13011u(lowerCase2, '*', 1, false, 4) != -1 || strM1599u2.length() < lowerCase2.length() || Intrinsics2.m13085a("*.", lowerCase2)) {
                            zM13085a = false;
                        } else {
                            String strSubstring = lowerCase2.substring(1);
                            Intrinsics2.m13086b(strSubstring, "(this as java.lang.String).substring(startIndex)");
                            if (StringsJVM.m12988e(strM1599u2, strSubstring, false, 2) && ((length = strM1599u2.length() - strSubstring.length()) <= 0 || Strings5.m13014x(strM1599u2, '.', length - 1, false, 4) == -1)) {
                                zM13085a = true;
                            } else {
                                zM13085a = false;
                            }
                        }
                    }
                    if (zM13085a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        Intrinsics2.m13090f(str, "host");
        Intrinsics2.m13090f(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return m13621b(str, (X509Certificate) certificate);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
