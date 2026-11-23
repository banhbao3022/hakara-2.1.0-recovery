package p007c.p190n.p194b.p209b.p215n1;

import java.nio.ByteBuffer;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.n1.d0, reason: use source file name */
/* JADX INFO: compiled from: ResamplingAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class ResamplingAudioProcessor extends BaseAudioProcessor {
    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: c */
    public void mo3522c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f7167b.f7113d;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else if (i2 != 268435456) {
            if (i2 != 536870912) {
                if (i2 != 805306368) {
                    throw new IllegalStateException();
                }
                i /= 2;
            } else {
                i /= 3;
                i *= 2;
            }
        }
        ByteBuffer byteBufferM3580k = m3580k(i);
        int i3 = this.f7167b.f7113d;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM3580k.put((byte) 0);
                byteBufferM3580k.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sM3120h = (short) (Util6.m3120h(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM3580k.put((byte) (sM3120h & 255));
                byteBufferM3580k.put((byte) ((sM3120h >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM3580k.put(byteBuffer.get(iPosition + 1));
                byteBufferM3580k.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferM3580k.put(byteBuffer.get(iPosition + 1));
                byteBufferM3580k.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM3580k.put(byteBuffer.get(iPosition + 2));
                byteBufferM3580k.put(byteBuffer.get(iPosition + 3));
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
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new AudioProcessor.a(aVar.f7111b, aVar.f7112c, 2) : AudioProcessor.a.f7110a;
        }
        throw new AudioProcessor.b(aVar);
    }
}
