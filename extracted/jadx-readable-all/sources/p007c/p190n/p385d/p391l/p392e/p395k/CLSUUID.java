package p007c.p190n.p385d.p391l.p392e.p395k;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: c.n.d.l.e.k.f, reason: use source file name */
/* JADX INFO: compiled from: CLSUUID.java */
/* JADX INFO: loaded from: classes.dex */
public class CLSUUID {

    /* JADX INFO: renamed from: a */
    public static final AtomicLong f26481a = new AtomicLong(0);

    /* JADX INFO: renamed from: b */
    public static String f26482b;

    public CLSUUID(IdManager idManager) {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArrM11737a = m11737a(time % 1000);
        byte[] bArrM11737a2 = m11737a(f26481a.incrementAndGet());
        byte[] bArrM11737a3 = m11737a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {bArrArray[0], bArrArray[1], bArrArray[2], bArrArray[3], bArrM11737a[0], bArrM11737a[1], bArrM11737a2[0], bArrM11737a2[1], bArrM11737a3[0], bArrM11737a3[1]};
        String strM11757t = CommonUtils.m11757t(idManager.m11775b());
        String strM11753p = CommonUtils.m11753p(bArr);
        Locale locale = Locale.US;
        f26482b = String.format(locale, "%s-%s-%s-%s", strM11753p.substring(0, 12), strM11753p.substring(12, 16), strM11753p.subSequence(16, 20), strM11757t.substring(0, 12)).toUpperCase(locale);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m11737a(long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j2);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public String toString() {
        return f26482b;
    }
}
