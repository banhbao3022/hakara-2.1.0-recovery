package p007c.p190n.p194b.p266d.p314j.p315a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2257e0;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ki0 {

    /* JADX INFO: renamed from: a */
    public final C2257e0 f15950a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2782b f15951b;

    /* JADX INFO: renamed from: c */
    public final Executor f15952c;

    public ki0(C2257e0 c2257e0, InterfaceC2782b interfaceC2782b, Executor executor) {
        this.f15950a = c2257e0;
        this.f15951b = interfaceC2782b;
        this.f15952c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m7500a(byte[] bArr, BitmapFactory.Options options) {
        long jMo5621a = this.f15951b.mo5621a();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jMo5621a2 = this.f15951b.mo5621a();
        if (bitmapDecodeByteArray != null) {
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            long j2 = jMo5621a2 - jMo5621a;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j2);
            sb.append(" on ui thread: ");
            sb.append(z);
            C2096e.m4590z(sb.toString());
        }
        return bitmapDecodeByteArray;
    }
}
