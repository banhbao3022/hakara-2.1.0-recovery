package p007c.p190n.p194b.p209b.p215n1;

import java.nio.ByteBuffer;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.n1.e0, reason: use source file name */
/* JADX INFO: compiled from: SilenceSkippingAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class SilenceSkippingAudioProcessor extends BaseAudioProcessor {

    /* JADX INFO: renamed from: i */
    public final long f7014i;

    /* JADX INFO: renamed from: j */
    public final long f7015j;

    /* JADX INFO: renamed from: k */
    public final short f7016k;

    /* JADX INFO: renamed from: l */
    public int f7017l;

    /* JADX INFO: renamed from: m */
    public boolean f7018m;

    /* JADX INFO: renamed from: n */
    public byte[] f7019n;

    /* JADX INFO: renamed from: o */
    public byte[] f7020o;

    /* JADX INFO: renamed from: p */
    public int f7021p;

    /* JADX INFO: renamed from: q */
    public int f7022q;

    /* JADX INFO: renamed from: r */
    public int f7023r;

    /* JADX INFO: renamed from: s */
    public boolean f7024s;

    /* JADX INFO: renamed from: t */
    public long f7025t;

    public SilenceSkippingAudioProcessor() {
        this(150000L, 20000L, (short) 1024);
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor, p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: a */
    public boolean mo3533a() {
        return this.f7018m;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: c */
    public void mo3522c(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f7172g.hasRemaining()) {
            int i = this.f7021p;
            if (i == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f7019n.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.f7016k) {
                        int i2 = this.f7017l;
                        iPosition = ((iLimit2 / i2) * i2) + i2;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f7021p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    m3580k(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f7024s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i == 1) {
                int iLimit3 = byteBuffer.limit();
                int iM3537l = m3537l(byteBuffer);
                int iPosition2 = iM3537l - byteBuffer.position();
                byte[] bArr = this.f7019n;
                int length = bArr.length;
                int i3 = this.f7022q;
                int i4 = length - i3;
                if (iM3537l >= iLimit3 || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f7019n, this.f7022q, iMin);
                    int i5 = this.f7022q + iMin;
                    this.f7022q = i5;
                    byte[] bArr2 = this.f7019n;
                    if (i5 == bArr2.length) {
                        if (this.f7024s) {
                            m3538m(bArr2, this.f7023r);
                            this.f7025t += (long) ((this.f7022q - (this.f7023r * 2)) / this.f7017l);
                        } else {
                            this.f7025t += (long) ((i5 - this.f7023r) / this.f7017l);
                        }
                        m3539n(byteBuffer, this.f7019n, this.f7022q);
                        this.f7022q = 0;
                        this.f7021p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    m3538m(bArr, i3);
                    this.f7022q = 0;
                    this.f7021p = 0;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iM3537l2 = m3537l(byteBuffer);
                byteBuffer.limit(iM3537l2);
                this.f7025t += (long) (byteBuffer.remaining() / this.f7017l);
                m3539n(byteBuffer, this.f7020o, this.f7023r);
                if (iM3537l2 < iLimit4) {
                    m3538m(this.f7020o, this.f7023r);
                    this.f7021p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor
    /* JADX INFO: renamed from: f */
    public AudioProcessor.a mo3523f(AudioProcessor.a aVar) throws AudioProcessor.b {
        if (aVar.f7113d == 2) {
            return this.f7018m ? aVar : AudioProcessor.a.f7110a;
        }
        throw new AudioProcessor.b(aVar);
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor
    /* JADX INFO: renamed from: h */
    public void mo3534h() {
        if (this.f7018m) {
            AudioProcessor.a aVar = this.f7167b;
            int i = aVar.f7114e;
            this.f7017l = i;
            long j2 = this.f7014i;
            long j3 = aVar.f7111b;
            int i2 = ((int) ((j2 * j3) / 1000000)) * i;
            if (this.f7019n.length != i2) {
                this.f7019n = new byte[i2];
            }
            int i3 = ((int) ((this.f7015j * j3) / 1000000)) * i;
            this.f7023r = i3;
            if (this.f7020o.length != i3) {
                this.f7020o = new byte[i3];
            }
        }
        this.f7021p = 0;
        this.f7025t = 0L;
        this.f7022q = 0;
        this.f7024s = false;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor
    /* JADX INFO: renamed from: i */
    public void mo3535i() {
        int i = this.f7022q;
        if (i > 0) {
            m3538m(this.f7019n, i);
        }
        if (this.f7024s) {
            return;
        }
        this.f7025t += (long) (this.f7023r / this.f7017l);
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.BaseAudioProcessor
    /* JADX INFO: renamed from: j */
    public void mo3536j() {
        this.f7018m = false;
        this.f7023r = 0;
        byte[] bArr = Util6.f6312f;
        this.f7019n = bArr;
        this.f7020o = bArr;
    }

    /* JADX INFO: renamed from: l */
    public final int m3537l(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f7016k) {
                int i = this.f7017l;
                return (iPosition / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    /* JADX INFO: renamed from: m */
    public final void m3538m(byte[] bArr, int i) {
        m3580k(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f7024s = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m3539n(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.f7023r);
        int i2 = this.f7023r - iMin;
        System.arraycopy(bArr, i - i2, this.f7020o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f7020o, i2, iMin);
    }

    public SilenceSkippingAudioProcessor(long j2, long j3, short s) {
        C2096e.m4566b(j3 <= j2);
        this.f7014i = j2;
        this.f7015j = j3;
        this.f7016k = s;
        byte[] bArr = Util6.f6312f;
        this.f7019n = bArr;
        this.f7020o = bArr;
    }
}
