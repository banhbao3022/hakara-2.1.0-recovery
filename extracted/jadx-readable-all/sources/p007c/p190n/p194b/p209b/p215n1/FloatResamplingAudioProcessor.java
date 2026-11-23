package p007c.p190n.p194b.p209b.p215n1;

import java.nio.ByteBuffer;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.n1.a0, reason: use source file name */
/* JADX INFO: compiled from: FloatResamplingAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class FloatResamplingAudioProcessor extends BaseAudioProcessor {

    /* JADX INFO: renamed from: i */
    public static final int f6976i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: l */
    public static void m3521l(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f6976i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: c */
    public void mo3522c(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM3580k;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f7167b.f7113d;
        if (i2 == 536870912) {
            byteBufferM3580k = m3580k((i / 3) * 4);
            while (iPosition < iLimit) {
                m3521l(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM3580k);
                iPosition += 3;
            }
        } else {
            if (i2 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferM3580k = m3580k(i);
            while (iPosition < iLimit) {
                m3521l((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM3580k);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM3580k.flip();
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor
    /* JADX INFO: renamed from: f */
    public AudioProcessor.a mo3523f(AudioProcessor.a aVar) throws AudioProcessor.b {
        int i = aVar.f7113d;
        if (Util6.m3095D(i)) {
            return i != 4 ? new AudioProcessor.a(aVar.f7111b, aVar.f7112c, 4) : AudioProcessor.a.f7110a;
        }
        throw new AudioProcessor.b(aVar);
    }
}
