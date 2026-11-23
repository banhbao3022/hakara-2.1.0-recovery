package p007c.p190n.p194b.p266d.p290d.p291r;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Logger;
import p007c.p190n.p194b.p195a.Transformer;
import p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4;
import p007c.p190n.p194b.p266d.p314j.p320f.C4055z2;

/* JADX INFO: renamed from: c.n.b.d.d.r.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2500m implements Transformer {

    /* JADX INFO: renamed from: a */
    public static final Transformer f11362a = new C2500m();

    @Override // p007c.p190n.p194b.p195a.Transformer
    public final Object apply(Object obj) {
        C4055z2 c4055z2 = (C4055z2) obj;
        Objects.requireNonNull(c4055z2);
        try {
            int iMo9043e = c4055z2.mo9043e();
            byte[] bArr = new byte[iMo9043e];
            Logger logger = AbstractC3923l4.f22763a;
            AbstractC3923l4.b bVar = new AbstractC3923l4.b(bArr, iMo9043e);
            c4055z2.mo9044g(bVar);
            if (bVar.mo9090K() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = c4055z2.getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + 10);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
