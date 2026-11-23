package p509g1.p510j0.p514g;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import p477d1.TypeCastException;
import p477d1.p483s.Iterables2;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p509g1.Handshake;

/* JADX INFO: renamed from: g1.j0.g.i, reason: use source file name */
/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RealConnection3 extends Lambda implements InterfaceC6153a<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RealConnection f30256g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection3(RealConnection realConnection) {
        super(0);
        this.f30256g = realConnection;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public List<? extends X509Certificate> mo2c() {
        Handshake handshake = this.f30256g.f30238d;
        if (handshake == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        List<Certificate> listM13646b = handshake.m13646b();
        ArrayList arrayList = new ArrayList(Iterables2.m13042g(listM13646b, 10));
        for (Certificate certificate : listM13646b) {
            if (certificate == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
