package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ke2 extends kf2 {

    /* JADX INFO: renamed from: g */
    public final byte[] f15930g;

    public ke2(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f15930g = bArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kf2, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f15930g;
    }
}
