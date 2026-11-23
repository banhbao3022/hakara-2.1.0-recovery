package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4293p3;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4321r3;

/* JADX INFO: renamed from: c.n.b.d.j.k.r3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4321r3<MessageType extends AbstractC4293p3<MessageType, BuilderType>, BuilderType extends AbstractC4321r3<MessageType, BuilderType>> implements InterfaceC4226k6 {
    /* JADX INFO: renamed from: j */
    public abstract BuilderType mo9424j(MessageType messagetype);

    /* JADX INFO: renamed from: k */
    public abstract BuilderType mo9425k(AbstractC4154f4 abstractC4154f4, C4280o4 c4280o4) throws IOException;

    /* JADX INFO: renamed from: l */
    public BuilderType mo9426l(byte[] bArr, int i, int i2) throws C4239l5 {
        try {
            AbstractC4154f4 abstractC4154f4M9597c = AbstractC4154f4.m9597c(bArr, i2);
            mo9425k(abstractC4154f4M9597c, C4280o4.m10117a());
            abstractC4154f4M9597c.mo9601d(0);
            return this;
        } catch (C4239l5 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m10186n("byte array"), e2);
        }
    }

    /* JADX INFO: renamed from: m */
    public BuilderType mo9427m(byte[] bArr, int i, int i2, C4280o4 c4280o4) throws C4239l5 {
        try {
            AbstractC4154f4 abstractC4154f4M9597c = AbstractC4154f4.m9597c(bArr, i2);
            mo9425k(abstractC4154f4M9597c, c4280o4);
            abstractC4154f4M9597c.mo9601d(0);
            return this;
        } catch (C4239l5 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m10186n("byte array"), e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final String m10186n(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(str.length() + name.length() + 60);
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // 
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();
}
