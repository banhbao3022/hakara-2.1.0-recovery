package p007c.p190n.p194b.p266d.p314j.p323i;

import java.util.Queue;

/* JADX INFO: renamed from: c.n.b.d.j.i.c */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4068c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f23012a = 0;

    static {
        new C4066a();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m9331a(Queue<byte[]> queue, int i) {
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
