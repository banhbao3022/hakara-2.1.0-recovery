package p007c.p190n.p194b.p266d.p314j.p320f;

import java.io.IOException;
import java.util.logging.Logger;
import p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4020v3;
import p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4029w3;

/* JADX INFO: renamed from: c.n.b.d.j.f.w3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4029w3<MessageType extends AbstractC4029w3<MessageType, BuilderType>, BuilderType extends AbstractC4020v3<MessageType, BuilderType>> implements InterfaceC3895i6 {
    public int zzbiv = 0;

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3895i6
    /* JADX INFO: renamed from: a */
    public final AbstractC3823b4 mo9041a() {
        try {
            AbstractC4057z4 abstractC4057z4 = (AbstractC4057z4) this;
            int iMo9043e = abstractC4057z4.mo9043e();
            AbstractC3823b4 abstractC3823b4 = AbstractC3823b4.f22519f;
            byte[] bArr = new byte[iMo9043e];
            Logger logger = AbstractC3923l4.f22763a;
            AbstractC3923l4.b bVar = new AbstractC3923l4.b(bArr, iMo9043e);
            abstractC4057z4.mo9044g(bVar);
            if (bVar.mo9090K() == 0) {
                return new C3893i4(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + 10);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo9287c(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: f */
    public int mo9288f() {
        throw new UnsupportedOperationException();
    }
}
