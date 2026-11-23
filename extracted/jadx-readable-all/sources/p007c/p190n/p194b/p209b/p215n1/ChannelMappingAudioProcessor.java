package p007c.p190n.p194b.p209b.p215n1;

import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.b.n1.x, reason: use source file name */
/* JADX INFO: compiled from: ChannelMappingAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class ChannelMappingAudioProcessor extends BaseAudioProcessor {

    /* JADX INFO: renamed from: i */
    public int[] f7174i;

    /* JADX INFO: renamed from: j */
    public int[] f7175j;

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: c */
    public void mo3522c(ByteBuffer byteBuffer) {
        int[] iArr = this.f7175j;
        Objects.requireNonNull(iArr);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM3580k = m3580k(((iLimit - iPosition) / this.f7167b.f7114e) * this.f7168c.f7114e);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferM3580k.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f7167b.f7114e;
        }
        byteBuffer.position(iLimit);
        byteBufferM3580k.flip();
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor
    /* JADX INFO: renamed from: f */
    public AudioProcessor.a mo3523f(AudioProcessor.a aVar) throws AudioProcessor.b {
        int[] iArr = this.f7174i;
        if (iArr == null) {
            return AudioProcessor.a.f7110a;
        }
        if (aVar.f7113d != 2) {
            throw new AudioProcessor.b(aVar);
        }
        boolean z = aVar.f7112c != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= aVar.f7112c) {
                throw new AudioProcessor.b(aVar);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new AudioProcessor.a(aVar.f7111b, iArr.length, 2) : AudioProcessor.a.f7110a;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor
    /* JADX INFO: renamed from: h */
    public void mo3534h() {
        this.f7175j = this.f7174i;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor
    /* JADX INFO: renamed from: j */
    public void mo3536j() {
        this.f7175j = null;
        this.f7174i = null;
    }
}
