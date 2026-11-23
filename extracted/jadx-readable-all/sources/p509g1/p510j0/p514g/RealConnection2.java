package p509g1.p510j0.p514g;

import java.security.cert.Certificate;
import java.util.List;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p509g1.Address;
import p509g1.CertificatePinner;
import p509g1.Handshake;
import p509g1.p510j0.p522n.CertificateChainCleaner;

/* JADX INFO: renamed from: g1.j0.g.h, reason: use source file name */
/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RealConnection2 extends Lambda implements InterfaceC6153a<List<? extends Certificate>> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CertificatePinner f30253g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Handshake f30254h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Address f30255i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection2(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.f30253g = certificatePinner;
        this.f30254h = handshake;
        this.f30255i = address;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public List<? extends Certificate> mo2c() {
        CertificateChainCleaner certificateChainCleaner = this.f30253g.f30019d;
        if (certificateChainCleaner != null) {
            return certificateChainCleaner.mo13614a(this.f30254h.m13646b(), this.f30255i.f29835a.f30647g);
        }
        Intrinsics2.m13095k();
        throw null;
    }
}
