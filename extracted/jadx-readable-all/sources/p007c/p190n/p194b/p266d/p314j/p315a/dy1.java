package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dy1 implements bw1 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f13431a = new byte[0];

    /* JADX INFO: renamed from: b */
    public final k32 f13432b;

    /* JADX INFO: renamed from: c */
    public final bw1 f13433c;

    public dy1(k32 k32Var, bw1 bw1Var) {
        this.f13432b = k32Var;
        this.f13433c = bw1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bw1
    /* JADX INFO: renamed from: a */
    public final byte[] mo5927a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrMo7574w = cx1.m6262f(this.f13432b).mo7574w();
        byte[] bArrMo5927a = this.f13433c.mo5927a(bArrMo7574w, f13431a);
        String strM7434v = this.f13432b.m7434v();
        g72 g72Var = g72.f14513f;
        byte[] bArrMo5927a2 = ((bw1) cx1.m6267k(strM7434v, g72.m6939G(bArrMo7574w, 0, bArrMo7574w.length), bw1.class)).mo5927a(bArr, bArr2);
        int length = bArrMo5927a.length;
        return ByteBuffer.allocate(length + 4 + bArrMo5927a2.length).putInt(length).put(bArrMo5927a).put(bArrMo5927a2).array();
    }
}
