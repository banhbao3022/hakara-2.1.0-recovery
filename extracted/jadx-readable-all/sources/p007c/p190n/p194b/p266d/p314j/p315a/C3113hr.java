package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: renamed from: c.n.b.d.j.a.hr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3113hr {

    /* JADX INFO: renamed from: a */
    public long f14940a;

    /* JADX INFO: renamed from: a */
    public final long m7157a(ByteBuffer byteBuffer) {
        b40 b40Var;
        b30 b30Var;
        long j2 = this.f14940a;
        if (j2 > 0) {
            return j2;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator<b10> it = new C3010ez(new C3076gr(byteBufferDuplicate), C3224kr.f16021c).m7690h().iterator();
            while (true) {
                b40Var = null;
                if (!it.hasNext()) {
                    b30Var = null;
                    break;
                }
                b10 next = it.next();
                if (next instanceof b30) {
                    b30Var = (b30) next;
                    break;
                }
            }
            for (b10 b10Var : b30Var.m7690h()) {
                if (b10Var instanceof b40) {
                    b40Var = (b40) b10Var;
                    break;
                }
            }
            long j3 = (b40Var.f12519r * 1000) / b40Var.f12518q;
            this.f14940a = j3;
            return j3;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
