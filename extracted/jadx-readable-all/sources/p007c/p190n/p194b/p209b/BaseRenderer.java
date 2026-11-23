package p007c.p190n.p194b.p209b;

import java.io.IOException;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.MediaClock;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p243w1.SampleStream;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.b0, reason: use source file name */
/* JADX INFO: compiled from: BaseRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseRenderer implements Renderer2, RendererCapabilities {

    /* JADX INFO: renamed from: f */
    public final int f6248f;

    /* JADX INFO: renamed from: h */
    public RendererConfiguration f6250h;

    /* JADX INFO: renamed from: i */
    public int f6251i;

    /* JADX INFO: renamed from: j */
    public int f6252j;

    /* JADX INFO: renamed from: k */
    public SampleStream f6253k;

    /* JADX INFO: renamed from: l */
    public Format[] f6254l;

    /* JADX INFO: renamed from: m */
    public long f6255m;

    /* JADX INFO: renamed from: o */
    public boolean f6257o;

    /* JADX INFO: renamed from: p */
    public boolean f6258p;

    /* JADX INFO: renamed from: g */
    public final FormatHolder f6249g = new FormatHolder();

    /* JADX INFO: renamed from: n */
    public long f6256n = Long.MIN_VALUE;

    public BaseRenderer(int i) {
        this.f6248f = i;
    }

    /* JADX INFO: renamed from: A */
    public final FormatHolder m3029A() {
        this.f6249g.m3621a();
        return this.f6249g;
    }

    /* JADX INFO: renamed from: B */
    public void mo3030B() {
    }

    /* JADX INFO: renamed from: C */
    public void mo3031C(boolean z, boolean z2) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: D */
    public void mo3032D(long j2, boolean z) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: E */
    public void mo3033E() {
    }

    /* JADX INFO: renamed from: F */
    public void mo3034F() throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: G */
    public void mo3035G() {
    }

    /* JADX INFO: renamed from: H */
    public void mo3036H(Format[] formatArr, long j2, long j3) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: I */
    public final int m3037I(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
        SampleStream sampleStream = this.f6253k;
        Objects.requireNonNull(sampleStream);
        int iMo4130j = sampleStream.mo4130j(formatHolder, decoderInputBuffer, z);
        if (iMo4130j == -4) {
            if (decoderInputBuffer.m3628v()) {
                this.f6256n = Long.MIN_VALUE;
                return this.f6257o ? -4 : -3;
            }
            long j2 = decoderInputBuffer.f7289j + this.f6255m;
            decoderInputBuffer.f7289j = j2;
            this.f6256n = Math.max(this.f6256n, j2);
        } else if (iMo4130j == -5) {
            Format format = formatHolder.f7259b;
            Objects.requireNonNull(format);
            if (format.f6938u != Long.MAX_VALUE) {
                Format.b bVarM3515a = format.m3515a();
                bVarM3515a.f6962o = format.f6938u + this.f6255m;
                formatHolder.f7259b = bVarM3515a.m3519a();
            }
        }
        return iMo4130j;
    }

    @Override // p007c.p190n.p194b.p209b.RendererCapabilities
    /* JADX INFO: renamed from: e */
    public int mo3038e() throws ExoPlaybackException {
        return 0;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: f */
    public final void mo3039f(int i) {
        this.f6251i = i;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    public final int getState() {
        return this.f6252j;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: h */
    public final void mo3040h() {
        C2096e.m4570f(this.f6252j == 1);
        this.f6249g.m3621a();
        this.f6252j = 0;
        this.f6253k = null;
        this.f6254l = null;
        this.f6257o = false;
        mo3030B();
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: i */
    public final boolean mo3041i() {
        return this.f6256n == Long.MIN_VALUE;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: j */
    public final void mo3042j(Format[] formatArr, SampleStream sampleStream, long j2, long j3) throws ExoPlaybackException {
        C2096e.m4570f(!this.f6257o);
        this.f6253k = sampleStream;
        this.f6256n = j3;
        this.f6254l = formatArr;
        this.f6255m = j3;
        mo3036H(formatArr, j2, j3);
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: k */
    public final void mo3043k() {
        this.f6257o = true;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: l */
    public final RendererCapabilities mo3044l() {
        return this;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void mo3045m(float f, float f2) throws ExoPlaybackException {
        Renderer.m3365a(this, f, f2);
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: n */
    public final void mo3046n(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j2, boolean z, boolean z2, long j3, long j4) throws ExoPlaybackException {
        C2096e.m4570f(this.f6252j == 0);
        this.f6250h = rendererConfiguration;
        this.f6252j = 1;
        mo3031C(z, z2);
        mo3042j(formatArr, sampleStream, j3, j4);
        mo3032D(j2, z);
    }

    @Override // p007c.p190n.p194b.p209b.PlayerMessage.b
    /* JADX INFO: renamed from: p */
    public void mo3047p(int i, Object obj) throws ExoPlaybackException {
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: q */
    public final SampleStream mo3048q() {
        return this.f6253k;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: r */
    public final void mo3049r() throws IOException {
        SampleStream sampleStream = this.f6253k;
        Objects.requireNonNull(sampleStream);
        sampleStream.mo4128a();
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    public final void reset() {
        C2096e.m4570f(this.f6252j == 0);
        this.f6249g.m3621a();
        mo3033E();
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: s */
    public final long mo3050s() {
        return this.f6256n;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    public final void start() throws ExoPlaybackException {
        C2096e.m4570f(this.f6252j == 1);
        this.f6252j = 2;
        mo3034F();
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    public final void stop() {
        C2096e.m4570f(this.f6252j == 2);
        this.f6252j = 1;
        mo3035G();
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: t */
    public final void mo3051t(long j2) throws ExoPlaybackException {
        this.f6257o = false;
        this.f6256n = j2;
        mo3032D(j2, false);
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: u */
    public final boolean mo3052u() {
        return this.f6257o;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: v */
    public MediaClock mo3053v() {
        return null;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: x */
    public final int mo3054x() {
        return this.f6248f;
    }

    /* JADX INFO: renamed from: y */
    public final ExoPlaybackException m3055y(Throwable th, Format format) {
        return m3056z(th, format, false);
    }

    /* JADX INFO: renamed from: z */
    public final ExoPlaybackException m3056z(Throwable th, Format format, boolean z) {
        int iMo3383a;
        if (format == null || this.f6258p) {
            iMo3383a = 4;
        } else {
            this.f6258p = true;
            try {
                iMo3383a = mo3383a(format) & 7;
                this.f6258p = false;
            } catch (ExoPlaybackException unused) {
                this.f6258p = false;
                iMo3383a = 4;
            } catch (Throwable th2) {
                this.f6258p = false;
                throw th2;
            }
        }
        return new ExoPlaybackException(1, th, null, getName(), this.f6251i, format, format == null ? 4 : iMo3383a, z);
    }
}
