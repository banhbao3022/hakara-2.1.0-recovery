package p007c.p190n.p194b.p209b.p217p1;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.b.p1.f, reason: use source file name */
/* JADX INFO: compiled from: DecoderInputBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public class DecoderInputBuffer extends Buffer {

    /* JADX INFO: renamed from: g */
    public final CryptoInfo f7286g;

    /* JADX INFO: renamed from: h */
    public ByteBuffer f7287h;

    /* JADX INFO: renamed from: i */
    public boolean f7288i;

    /* JADX INFO: renamed from: j */
    public long f7289j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f7290k;

    /* JADX INFO: renamed from: l */
    public final int f7291l;

    /* JADX INFO: renamed from: m */
    public final int f7292m;

    /* JADX INFO: renamed from: c.n.b.b.p1.f$a */
    /* JADX INFO: compiled from: DecoderInputBuffer.java */
    public static final class a extends IllegalStateException {
        public a(int i, int i2) {
            super(outline.m1593o("Buffer too small (", i, " < ", i2, ")"));
        }
    }

    public DecoderInputBuffer(int i) {
        this(i, 0);
    }

    /* JADX INFO: renamed from: A */
    public final void m3633A() {
        ByteBuffer byteBuffer = this.f7287h;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f7290k;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m3634B() {
        return m3625q(1073741824);
    }

    /* JADX INFO: renamed from: x */
    public void mo3635x() {
        this.f7262f = 0;
        ByteBuffer byteBuffer = this.f7287h;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f7290k;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f7288i = false;
    }

    /* JADX INFO: renamed from: y */
    public final ByteBuffer m3636y(int i) {
        int i2 = this.f7291l;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f7287h;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @EnsuresNonNull({"data"})
    /* JADX INFO: renamed from: z */
    public void m3637z(int i) {
        int i2 = i + this.f7292m;
        ByteBuffer byteBuffer = this.f7287h;
        if (byteBuffer == null) {
            this.f7287h = m3636y(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f7287h = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM3636y = m3636y(i3);
        byteBufferM3636y.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM3636y.put(byteBuffer);
        }
        this.f7287h = byteBufferM3636y;
    }

    public DecoderInputBuffer(int i, int i2) {
        this.f7286g = new CryptoInfo();
        this.f7291l = i;
        this.f7292m = i2;
    }
}
