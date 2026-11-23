package p007c.p190n.p194b.p209b.p215n1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: c.n.b.b.n1.w, reason: use source file name */
/* JADX INFO: compiled from: BaseAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAudioProcessor implements AudioProcessor {

    /* JADX INFO: renamed from: b */
    public AudioProcessor.a f7167b;

    /* JADX INFO: renamed from: c */
    public AudioProcessor.a f7168c;

    /* JADX INFO: renamed from: d */
    public AudioProcessor.a f7169d;

    /* JADX INFO: renamed from: e */
    public AudioProcessor.a f7170e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f7171f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f7172g;

    /* JADX INFO: renamed from: h */
    public boolean f7173h;

    public BaseAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.f7109a;
        this.f7171f = byteBuffer;
        this.f7172g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f7110a;
        this.f7169d = aVar;
        this.f7170e = aVar;
        this.f7167b = aVar;
        this.f7168c = aVar;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: a */
    public boolean mo3533a() {
        return this.f7170e != AudioProcessor.a.f7110a;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: b */
    public ByteBuffer mo3546b() {
        ByteBuffer byteBuffer = this.f7172g;
        this.f7172g = AudioProcessor.f7109a;
        return byteBuffer;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: d */
    public final AudioProcessor.a mo3547d(AudioProcessor.a aVar) throws AudioProcessor.b {
        this.f7169d = aVar;
        this.f7170e = mo3523f(aVar);
        return mo3533a() ? this.f7170e : AudioProcessor.a.f7110a;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: e */
    public final void mo3548e() {
        this.f7173h = true;
        mo3535i();
    }

    /* JADX INFO: renamed from: f */
    public AudioProcessor.a mo3523f(AudioProcessor.a aVar) throws AudioProcessor.b {
        return AudioProcessor.a.f7110a;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    public final void flush() {
        this.f7172g = AudioProcessor.f7109a;
        this.f7173h = false;
        this.f7167b = this.f7169d;
        this.f7168c = this.f7170e;
        mo3534h();
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    /* JADX INFO: renamed from: g */
    public boolean mo3549g() {
        return this.f7173h && this.f7172g == AudioProcessor.f7109a;
    }

    /* JADX INFO: renamed from: h */
    public void mo3534h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo3535i() {
    }

    /* JADX INFO: renamed from: j */
    public void mo3536j() {
    }

    /* JADX INFO: renamed from: k */
    public final ByteBuffer m3580k(int i) {
        if (this.f7171f.capacity() < i) {
            this.f7171f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f7171f.clear();
        }
        ByteBuffer byteBuffer = this.f7171f;
        this.f7172g = byteBuffer;
        return byteBuffer;
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioProcessor
    public final void reset() {
        flush();
        this.f7171f = AudioProcessor.f7109a;
        AudioProcessor.a aVar = AudioProcessor.a.f7110a;
        this.f7169d = aVar;
        this.f7170e = aVar;
        this.f7167b = aVar;
        this.f7168c = aVar;
        mo3536j();
    }
}
