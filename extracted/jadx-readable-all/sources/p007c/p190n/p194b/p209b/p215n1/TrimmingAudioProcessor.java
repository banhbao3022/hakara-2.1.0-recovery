package p007c.p190n.p194b.p209b.p215n1;

import java.nio.ByteBuffer;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.n1.h0, reason: use source file name */
/* JADX INFO: compiled from: TrimmingAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class TrimmingAudioProcessor extends BaseAudioProcessor {

    /* JADX INFO: renamed from: i */
    public int f7071i;

    /* JADX INFO: renamed from: j */
    public int f7072j;

    /* JADX INFO: renamed from: k */
    public boolean f7073k;

    /* JADX INFO: renamed from: l */
    public int f7074l;

    /* JADX INFO: renamed from: m */
    public byte[] f7075m = Util6.f6312f;

    /* JADX INFO: renamed from: n */
    public int f7076n;

    /* JADX INFO: renamed from: o */
    public long f7077o;

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor, p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: b */
    public ByteBuffer mo3546b() {
        int i;
        if (super.mo3549g() && (i = this.f7076n) > 0) {
            m3580k(i).put(this.f7075m, 0, this.f7076n).flip();
            this.f7076n = 0;
        }
        return super.mo3546b();
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: c */
    public void mo3522c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f7074l);
        this.f7077o += (long) (iMin / this.f7167b.f7114e);
        this.f7074l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f7074l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f7076n + i2) - this.f7075m.length;
        ByteBuffer byteBufferM3580k = m3580k(length);
        int iM3121i = Util6.m3121i(length, 0, this.f7076n);
        byteBufferM3580k.put(this.f7075m, 0, iM3121i);
        int iM3121i2 = Util6.m3121i(length - iM3121i, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM3121i2);
        byteBufferM3580k.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM3121i2;
        int i4 = this.f7076n - iM3121i;
        this.f7076n = i4;
        byte[] bArr = this.f7075m;
        System.arraycopy(bArr, iM3121i, bArr, 0, i4);
        byteBuffer.get(this.f7075m, this.f7076n, i3);
        this.f7076n += i3;
        byteBufferM3580k.flip();
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor
    /* JADX INFO: renamed from: f */
    public AudioProcessor.a mo3523f(AudioProcessor.a aVar) throws AudioProcessor.b {
        if (aVar.f7113d != 2) {
            throw new AudioProcessor.b(aVar);
        }
        this.f7073k = true;
        return (this.f7071i == 0 && this.f7072j == 0) ? AudioProcessor.a.f7110a : aVar;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor, p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: g */
    public boolean mo3549g() {
        return super.mo3549g() && this.f7076n == 0;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor
    /* JADX INFO: renamed from: h */
    public void mo3534h() {
        if (this.f7073k) {
            this.f7073k = false;
            int i = this.f7072j;
            int i2 = this.f7167b.f7114e;
            this.f7075m = new byte[i * i2];
            this.f7074l = this.f7071i * i2;
        }
        this.f7076n = 0;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor
    /* JADX INFO: renamed from: i */
    public void mo3535i() {
        if (this.f7073k) {
            int i = this.f7076n;
            if (i > 0) {
                this.f7077o += (long) (i / this.f7167b.f7114e);
            }
            this.f7076n = 0;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor
    /* JADX INFO: renamed from: j */
    public void mo3536j() {
        this.f7075m = Util6.f6312f;
    }
}
