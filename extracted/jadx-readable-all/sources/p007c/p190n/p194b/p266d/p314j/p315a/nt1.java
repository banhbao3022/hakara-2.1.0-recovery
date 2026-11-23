package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Queue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nt1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f17268a = 0;

    static {
        new mt1();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m7935a(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArrRemove = queue.remove();
            int iMin = Math.min(i2, bArrRemove.length);
            System.arraycopy(bArrRemove, 0, bArr, i - i2, iMin);
            i2 -= iMin;
        }
        return bArr;
    }
}
