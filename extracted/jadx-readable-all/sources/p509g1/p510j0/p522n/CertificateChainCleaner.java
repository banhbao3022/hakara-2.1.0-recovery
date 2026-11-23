package p509g1.p510j0.p522n;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p477d1.p493x.p495c.DefaultConstructorMarker;

/* JADX INFO: renamed from: g1.j0.n.c, reason: use source file name */
/* JADX INFO: compiled from: CertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class CertificateChainCleaner {

    /* JADX INFO: renamed from: a */
    public static final a f30578a = new a(null);

    /* JADX INFO: renamed from: g1.j0.n.c$a */
    /* JADX INFO: compiled from: CertificateChainCleaner.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract List<Certificate> mo13614a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException;
}
