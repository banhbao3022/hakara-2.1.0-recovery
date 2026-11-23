package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ui2 extends qi2 {

    /* JADX INFO: renamed from: b */
    public final si2 f20357b = new si2();

    /* JADX INFO: renamed from: c */
    public ByteBuffer f20358c;

    /* JADX INFO: renamed from: d */
    public long f20359d;

    public ui2(int i) {
    }

    /* JADX INFO: renamed from: c */
    public final void m8506c() {
        this.f18310a = 0;
        ByteBuffer byteBuffer = this.f20358c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public final ByteBuffer m8507d(int i) {
        ByteBuffer byteBuffer = this.f20358c;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(iCapacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
}
