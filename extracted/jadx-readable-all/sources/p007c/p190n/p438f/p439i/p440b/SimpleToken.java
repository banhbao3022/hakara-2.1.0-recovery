package p007c.p190n.p438f.p439i.p440b;

import p007c.p190n.p438f.p441j.BitArray;

/* JADX INFO: renamed from: c.n.f.i.b.f, reason: use source file name */
/* JADX INFO: compiled from: SimpleToken.java */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleToken extends Token2 {

    /* JADX INFO: renamed from: c */
    public final short f27632c;

    /* JADX INFO: renamed from: d */
    public final short f27633d;

    public SimpleToken(Token2 token2, int i, int i2) {
        super(token2);
        this.f27632c = (short) i;
        this.f27633d = (short) i2;
    }

    @Override // p007c.p190n.p438f.p439i.p440b.Token2
    /* JADX INFO: renamed from: a */
    public void mo12332a(BitArray bitArray, byte[] bArr) {
        bitArray.m12344d(this.f27632c, this.f27633d);
    }

    public String toString() {
        short s = this.f27632c;
        short s2 = this.f27633d;
        return "<" + Integer.toBinaryString((s & ((1 << s2) - 1)) | (1 << s2) | (1 << this.f27633d)).substring(1) + '>';
    }
}
