package p509g1;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import p477d1.TypeCastException;
import p477d1.p483s.Iterables2;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;
import p509g1.p510j0.p522n.CertificateChainCleaner;

/* JADX INFO: renamed from: g1.h, reason: use source file name */
/* JADX INFO: compiled from: CertificatePinner.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CertificatePinner2 extends Lambda implements InterfaceC6153a<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CertificatePinner f30031g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f30032h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f30033i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CertificatePinner2(CertificatePinner certificatePinner, List list, String str) {
        super(0);
        this.f30031g = certificatePinner;
        this.f30032h = list;
        this.f30033i = str;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public List<? extends X509Certificate> mo2c() {
        List<Certificate> listMo13614a;
        CertificateChainCleaner certificateChainCleaner = this.f30031g.f30019d;
        if (certificateChainCleaner == null || (listMo13614a = certificateChainCleaner.mo13614a(this.f30032h, this.f30033i)) == null) {
            listMo13614a = this.f30032h;
        }
        ArrayList arrayList = new ArrayList(Iterables2.m13042g(listMo13614a, 10));
        for (Certificate certificate : listMo13614a) {
            if (certificate == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
