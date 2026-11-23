package p007c.p114h.p145f.p146b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.h.f.b.d, reason: use source file name */
/* JADX INFO: compiled from: AudioTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class AudioTranscoder {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f4304a;

    /* JADX INFO: renamed from: b */
    public int f4305b;

    /* JADX INFO: renamed from: c */
    public int f4306c;

    /* JADX INFO: renamed from: d */
    public int f4307d;

    /* JADX INFO: renamed from: e */
    public Sonic f4308e;

    /* JADX INFO: renamed from: f */
    public float f4309f;

    /* JADX INFO: renamed from: g */
    public float f4310g;

    /* JADX INFO: renamed from: h */
    public int f4311h;

    /* JADX INFO: renamed from: i */
    public ByteBuffer f4312i;

    /* JADX INFO: renamed from: j */
    public ShortBuffer f4313j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f4314k;

    /* JADX INFO: renamed from: l */
    public long f4315l;

    /* JADX INFO: renamed from: m */
    public long f4316m;

    /* JADX INFO: renamed from: c.h.f.b.d$a */
    /* JADX INFO: compiled from: AudioTranscoder.java */
    public final class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        public a(AudioTranscoder audioTranscoder, int i, int i2, int i3) {
            StringBuilder sbM1559J = outline.m1559J("Unhandled format: ", i, " Hz, ", i2, " channels in encoding ");
            sbM1559J.append(i3);
            super(sbM1559J.toString());
        }
    }

    public AudioTranscoder() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        this.f4304a = byteBufferOrder;
        this.f4309f = 1.0f;
        this.f4310g = 1.0f;
        this.f4306c = -1;
        this.f4307d = -1;
        this.f4311h = -1;
        this.f4312i = byteBufferOrder;
        this.f4313j = byteBufferOrder.asShortBuffer();
        this.f4314k = this.f4304a;
        this.f4305b = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m2198a() {
        int i;
        Sonic sonic = this.f4308e;
        int i2 = sonic.f4346r;
        float f = sonic.f4331c;
        float f2 = sonic.f4332d;
        int i3 = sonic.f4347s + ((int) ((((i2 / (f / f2)) + sonic.f4348t) / (sonic.f4333e * f2)) + 0.5f));
        sonic.m2208c((sonic.f4336h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = sonic.f4336h * 2;
            int i5 = sonic.f4330b;
            if (i4 >= i * i5) {
                break;
            }
            sonic.f4339k[(i5 * i2) + i4] = 0;
            i4++;
        }
        sonic.f4346r = i + sonic.f4346r;
        sonic.m2211g();
        if (sonic.f4347s > i3) {
            sonic.f4347s = i3;
        }
        sonic.f4346r = 0;
        sonic.f4349u = 0;
        sonic.f4348t = 0;
    }

    /* JADX INFO: renamed from: b */
    public void m2199b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f4315l += (long) iRemaining;
            Sonic sonic = this.f4308e;
            Objects.requireNonNull(sonic);
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = sonic.f4330b;
            int i2 = iRemaining2 / i;
            sonic.m2208c(i2);
            shortBufferAsShortBuffer.get(sonic.f4339k, sonic.f4346r * sonic.f4330b, ((i * i2) * 2) / 2);
            sonic.f4346r += i2;
            sonic.m2211g();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int i3 = this.f4308e.f4347s * this.f4306c * 2;
        if (i3 > 0) {
            if (this.f4312i.capacity() < i3) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.f4312i = byteBufferOrder;
                this.f4313j = byteBufferOrder.asShortBuffer();
            } else {
                this.f4312i.clear();
                this.f4313j.clear();
            }
            Sonic sonic2 = this.f4308e;
            ShortBuffer shortBuffer = this.f4313j;
            Objects.requireNonNull(sonic2);
            int iMin = Math.min(shortBuffer.remaining() / sonic2.f4330b, sonic2.f4347s);
            shortBuffer.put(sonic2.f4341m, 0, sonic2.f4330b * iMin);
            int i4 = sonic2.f4347s - iMin;
            sonic2.f4347s = i4;
            short[] sArr = sonic2.f4341m;
            int i5 = sonic2.f4330b;
            System.arraycopy(sArr, iMin * i5, sArr, 0, i4 * i5);
            this.f4316m += (long) i3;
            this.f4312i.limit(i3);
            this.f4314k = this.f4312i;
        }
    }
}
