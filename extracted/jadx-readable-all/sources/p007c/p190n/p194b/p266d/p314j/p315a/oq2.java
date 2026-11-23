package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class oq2 extends kq2 {

    /* JADX INFO: renamed from: c */
    public MessageDigest f17722c;

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kq2
    /* JADX INFO: renamed from: a */
    public final byte[] mo7536a(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iM5375h0 = C2622l.m5375h0(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iM5375h0);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int iM5375h1 = C2622l.m5375h0(strArrSplit[i2]);
                    int i3 = (iM5375h1 >> 16) ^ ((char) iM5375h1);
                    byte[] bArr2 = {(byte) i3, (byte) (i3 >> 8)};
                    int i4 = i2 + i2;
                    bArr[i4] = bArr2[0];
                    bArr[i4 + 1] = bArr2[1];
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                    int iM5375h2 = C2622l.m5375h0(strArrSplit[i5]);
                    bArr[i5] = (byte) ((iM5375h2 >> 24) ^ (((iM5375h2 & 255) ^ ((iM5375h2 >> 8) & 255)) ^ ((iM5375h2 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f17722c = m7537b();
        synchronized (this.f16020b) {
            MessageDigest messageDigest = this.f17722c;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.f17722c.update(bArrArray);
            byte[] bArrDigest = this.f17722c.digest();
            int length2 = bArrDigest.length;
            if (length2 <= 4) {
                i = length2;
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(bArrDigest, 0, bArr3, 0, i);
            return bArr3;
        }
    }
}
