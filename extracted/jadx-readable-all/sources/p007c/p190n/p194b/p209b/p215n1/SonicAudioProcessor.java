package p007c.p190n.p194b.p209b.p215n1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.b.n1.g0, reason: use source file name */
/* JADX INFO: compiled from: SonicAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class SonicAudioProcessor implements AudioProcessor {

    /* JADX INFO: renamed from: b */
    public int f7052b;

    /* JADX INFO: renamed from: c */
    public float f7053c = 1.0f;

    /* JADX INFO: renamed from: d */
    public float f7054d = 1.0f;

    /* JADX INFO: renamed from: e */
    public AudioProcessor.a f7055e;

    /* JADX INFO: renamed from: f */
    public AudioProcessor.a f7056f;

    /* JADX INFO: renamed from: g */
    public AudioProcessor.a f7057g;

    /* JADX INFO: renamed from: h */
    public AudioProcessor.a f7058h;

    /* JADX INFO: renamed from: i */
    public boolean f7059i;

    /* JADX INFO: renamed from: j */
    public Sonic2 f7060j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f7061k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f7062l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f7063m;

    /* JADX INFO: renamed from: n */
    public long f7064n;

    /* JADX INFO: renamed from: o */
    public long f7065o;

    /* JADX INFO: renamed from: p */
    public boolean f7066p;

    public SonicAudioProcessor() {
        AudioProcessor.a aVar = AudioProcessor.a.f7110a;
        this.f7055e = aVar;
        this.f7056f = aVar;
        this.f7057g = aVar;
        this.f7058h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f7109a;
        this.f7061k = byteBuffer;
        this.f7062l = byteBuffer.asShortBuffer();
        this.f7063m = byteBuffer;
        this.f7052b = -1;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: a */
    public boolean mo3533a() {
        return this.f7056f.f7111b != -1 && (Math.abs(this.f7053c - 1.0f) >= 1.0E-4f || Math.abs(this.f7054d - 1.0f) >= 1.0E-4f || this.f7056f.f7111b != this.f7055e.f7111b);
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: b */
    public ByteBuffer mo3546b() {
        int i;
        Sonic2 sonic2 = this.f7060j;
        if (sonic2 != null && (i = sonic2.f7040m * sonic2.f7029b * 2) > 0) {
            if (this.f7061k.capacity() < i) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.f7061k = byteBufferOrder;
                this.f7062l = byteBufferOrder.asShortBuffer();
            } else {
                this.f7061k.clear();
                this.f7062l.clear();
            }
            ShortBuffer shortBuffer = this.f7062l;
            int iMin = Math.min(shortBuffer.remaining() / sonic2.f7029b, sonic2.f7040m);
            shortBuffer.put(sonic2.f7039l, 0, sonic2.f7029b * iMin);
            int i2 = sonic2.f7040m - iMin;
            sonic2.f7040m = i2;
            short[] sArr = sonic2.f7039l;
            int i3 = sonic2.f7029b;
            System.arraycopy(sArr, iMin * i3, sArr, 0, i2 * i3);
            this.f7065o += (long) i;
            this.f7061k.limit(i);
            this.f7063m = this.f7061k;
        }
        ByteBuffer byteBuffer = this.f7063m;
        this.f7063m = AudioProcessor.f7109a;
        return byteBuffer;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: c */
    public void mo3522c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            Sonic2 sonic2 = this.f7060j;
            Objects.requireNonNull(sonic2);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f7064n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = sonic2.f7029b;
            int i2 = iRemaining2 / i;
            short[] sArrM3543c = sonic2.m3543c(sonic2.f7037j, sonic2.f7038k, i2);
            sonic2.f7037j = sArrM3543c;
            shortBufferAsShortBuffer.get(sArrM3543c, sonic2.f7038k * sonic2.f7029b, ((i * i2) * 2) / 2);
            sonic2.f7038k += i2;
            sonic2.m3545f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: d */
    public AudioProcessor.a mo3547d(AudioProcessor.a aVar) throws AudioProcessor.b {
        if (aVar.f7113d != 2) {
            throw new AudioProcessor.b(aVar);
        }
        int i = this.f7052b;
        if (i == -1) {
            i = aVar.f7111b;
        }
        this.f7055e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i, aVar.f7112c, 2);
        this.f7056f = aVar2;
        this.f7059i = true;
        return aVar2;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: e */
    public void mo3548e() {
        int i;
        Sonic2 sonic2 = this.f7060j;
        if (sonic2 != null) {
            int i2 = sonic2.f7038k;
            float f = sonic2.f7030c;
            float f2 = sonic2.f7031d;
            int i3 = sonic2.f7040m + ((int) ((((i2 / (f / f2)) + sonic2.f7042o) / (sonic2.f7032e * f2)) + 0.5f));
            sonic2.f7037j = sonic2.m3543c(sonic2.f7037j, i2, (sonic2.f7035h * 2) + i2);
            int i4 = 0;
            while (true) {
                i = sonic2.f7035h * 2;
                int i5 = sonic2.f7029b;
                if (i4 >= i * i5) {
                    break;
                }
                sonic2.f7037j[(i5 * i2) + i4] = 0;
                i4++;
            }
            sonic2.f7038k = i + sonic2.f7038k;
            sonic2.m3545f();
            if (sonic2.f7040m > i3) {
                sonic2.f7040m = i3;
            }
            sonic2.f7038k = 0;
            sonic2.f7045r = 0;
            sonic2.f7042o = 0;
        }
        this.f7066p = true;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    public void flush() {
        if (mo3533a()) {
            AudioProcessor.a aVar = this.f7055e;
            this.f7057g = aVar;
            AudioProcessor.a aVar2 = this.f7056f;
            this.f7058h = aVar2;
            if (this.f7059i) {
                this.f7060j = new Sonic2(aVar.f7111b, aVar.f7112c, this.f7053c, this.f7054d, aVar2.f7111b);
            } else {
                Sonic2 sonic2 = this.f7060j;
                if (sonic2 != null) {
                    sonic2.f7038k = 0;
                    sonic2.f7040m = 0;
                    sonic2.f7042o = 0;
                    sonic2.f7043p = 0;
                    sonic2.f7044q = 0;
                    sonic2.f7045r = 0;
                    sonic2.f7046s = 0;
                    sonic2.f7047t = 0;
                    sonic2.f7048u = 0;
                    sonic2.f7049v = 0;
                }
            }
        }
        this.f7063m = AudioProcessor.f7109a;
        this.f7064n = 0L;
        this.f7065o = 0L;
        this.f7066p = false;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: g */
    public boolean mo3549g() {
        Sonic2 sonic2;
        return this.f7066p && ((sonic2 = this.f7060j) == null || (sonic2.f7040m * sonic2.f7029b) * 2 == 0);
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    public void reset() {
        this.f7053c = 1.0f;
        this.f7054d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f7110a;
        this.f7055e = aVar;
        this.f7056f = aVar;
        this.f7057g = aVar;
        this.f7058h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f7109a;
        this.f7061k = byteBuffer;
        this.f7062l = byteBuffer.asShortBuffer();
        this.f7063m = byteBuffer;
        this.f7052b = -1;
        this.f7059i = false;
        this.f7060j = null;
        this.f7064n = 0L;
        this.f7065o = 0L;
        this.f7066p = false;
    }
}
