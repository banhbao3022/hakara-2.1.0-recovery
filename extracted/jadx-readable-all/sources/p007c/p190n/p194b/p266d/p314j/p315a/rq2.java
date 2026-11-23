package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rq2 extends kq2 {

    /* JADX INFO: renamed from: c */
    public MessageDigest f19034c;

    /* JADX INFO: renamed from: d */
    public final int f19035d;

    /* JADX INFO: renamed from: e */
    public final int f19036e;

    public rq2(int i) {
        int i2 = i >> 3;
        this.f19035d = (i & 7) > 0 ? i2 + 1 : i2;
        this.f19036e = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kq2
    /* JADX INFO: renamed from: a */
    public final byte[] mo7536a(String str) {
        synchronized (this.f16020b) {
            MessageDigest messageDigestM7537b = m7537b();
            this.f19034c = messageDigestM7537b;
            if (messageDigestM7537b == null) {
                return new byte[0];
            }
            messageDigestM7537b.reset();
            this.f19034c.update(str.getBytes(Charset.forName(Utf8Charset.NAME)));
            byte[] bArrDigest = this.f19034c.digest();
            int length = bArrDigest.length;
            int i = this.f19035d;
            if (length > i) {
                length = i;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(bArrDigest, 0, bArr, 0, length);
            if ((this.f19036e & 7) > 0) {
                long j2 = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        j2 <<= 8;
                    }
                    j2 += (long) (bArr[i2] & 255);
                }
                long j3 = j2 >>> (8 - (this.f19036e & 7));
                int i3 = this.f19035d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        break;
                    }
                    bArr[i3] = (byte) (255 & j3);
                    j3 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
