package p007c.p190n.p438f.p439i.p440b;

import p007c.p190n.p438f.p441j.BitArray;

/* JADX INFO: renamed from: c.n.f.i.b.b, reason: use source file name */
/* JADX INFO: compiled from: BinaryShiftToken.java */
/* JADX INFO: loaded from: classes.dex */
public final class BinaryShiftToken extends Token2 {

    /* JADX INFO: renamed from: c */
    public final short f27624c;

    /* JADX INFO: renamed from: d */
    public final short f27625d;

    public BinaryShiftToken(Token2 token2, int i, int i2) {
        super(token2);
        this.f27624c = (short) i;
        this.f27625d = (short) i2;
    }

    @Override // p007c.p190n.p438f.p439i.p440b.Token2
    /* JADX INFO: renamed from: a */
    public void mo12332a(BitArray bitArray, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f27625d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                bitArray.m12344d(31, 5);
                short s2 = this.f27625d;
                if (s2 > 62) {
                    bitArray.m12344d(s2 - 31, 16);
                } else if (i == 0) {
                    bitArray.m12344d(Math.min((int) s2, 31), 5);
                } else {
                    bitArray.m12344d(s2 - 31, 5);
                }
            }
            bitArray.m12344d(bArr[this.f27624c + i], 8);
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f27624c);
        sb.append("::");
        sb.append((this.f27624c + this.f27625d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
