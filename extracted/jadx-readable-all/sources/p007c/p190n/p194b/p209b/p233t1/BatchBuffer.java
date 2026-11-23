package p007c.p190n.p194b.p209b.p233t1;

import java.nio.ByteBuffer;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.t1.g, reason: use source file name */
/* JADX INFO: compiled from: BatchBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class BatchBuffer extends DecoderInputBuffer {

    /* JADX INFO: renamed from: n */
    public long f8545n;

    /* JADX INFO: renamed from: o */
    public int f8546o;

    /* JADX INFO: renamed from: p */
    public int f8547p;

    public BatchBuffer() {
        super(2);
        this.f8547p = 32;
    }

    /* JADX INFO: renamed from: C */
    public boolean m3933C(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        boolean z;
        C2096e.m4566b(!decoderInputBuffer.m3634B());
        C2096e.m4566b(!decoderInputBuffer.m3626s());
        C2096e.m4566b(!decoderInputBuffer.m3628v());
        if (m3934D()) {
            if (this.f8546o < this.f8547p && decoderInputBuffer.m3627u() == m3627u()) {
                ByteBuffer byteBuffer2 = decoderInputBuffer.f7287h;
                if (byteBuffer2 != null && (byteBuffer = this.f7287h) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    }
                }
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        int i = this.f8546o;
        this.f8546o = i + 1;
        if (i == 0) {
            this.f7289j = decoderInputBuffer.f7289j;
            if (decoderInputBuffer.m3629w()) {
                this.f7262f = 1;
            }
        }
        if (decoderInputBuffer.m3627u()) {
            this.f7262f = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.f7287h;
        if (byteBuffer3 != null) {
            m3637z(byteBuffer3.remaining());
            this.f7287h.put(byteBuffer3);
        }
        this.f8545n = decoderInputBuffer.f7289j;
        return true;
    }

    /* JADX INFO: renamed from: D */
    public boolean m3934D() {
        return this.f8546o > 0;
    }

    @Override // p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer
    /* JADX INFO: renamed from: x */
    public void mo3635x() {
        super.mo3635x();
        this.f8546o = 0;
    }
}
