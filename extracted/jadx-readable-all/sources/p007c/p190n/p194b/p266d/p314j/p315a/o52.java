package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class o52 implements bw1 {

    /* JADX INFO: renamed from: a */
    public final z52 f17541a;

    /* JADX INFO: renamed from: b */
    public final qw1 f17542b;

    public o52(z52 z52Var, qw1 qw1Var, int i) {
        this.f17541a = z52Var;
        this.f17542b = qw1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bw1
    /* JADX INFO: renamed from: a */
    public final byte[] mo5927a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrMo6612a = this.f17541a.mo6612a(bArr);
        return C2622l.m5416p1(bArrMo6612a, this.f17542b.mo6289a(C2622l.m5416p1(bArr2, bArrMo6612a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }
}
