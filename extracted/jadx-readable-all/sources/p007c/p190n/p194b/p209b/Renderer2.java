package p007c.p190n.p194b.p209b;

import java.io.IOException;
import p007c.p190n.p194b.p209b.p212b2.MediaClock;
import p007c.p190n.p194b.p209b.p243w1.SampleStream;

/* JADX INFO: renamed from: c.n.b.b.h1, reason: use source file name */
/* JADX INFO: compiled from: Renderer.java */
/* JADX INFO: loaded from: classes.dex */
public interface Renderer2 extends PlayerMessage.b {

    /* JADX INFO: renamed from: c.n.b.b.h1$a */
    /* JADX INFO: compiled from: Renderer.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3370a();

        /* JADX INFO: renamed from: b */
        void mo3371b(long j2);
    }

    /* JADX INFO: renamed from: c */
    boolean mo3297c();

    /* JADX INFO: renamed from: f */
    void mo3039f(int i);

    /* JADX INFO: renamed from: g */
    boolean mo3368g();

    String getName();

    int getState();

    /* JADX INFO: renamed from: h */
    void mo3040h();

    /* JADX INFO: renamed from: i */
    boolean mo3041i();

    /* JADX INFO: renamed from: j */
    void mo3042j(Format[] formatArr, SampleStream sampleStream, long j2, long j3) throws ExoPlaybackException;

    /* JADX INFO: renamed from: k */
    void mo3043k();

    /* JADX INFO: renamed from: l */
    RendererCapabilities mo3044l();

    /* JADX INFO: renamed from: m */
    void mo3045m(float f, float f2) throws ExoPlaybackException;

    /* JADX INFO: renamed from: n */
    void mo3046n(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j2, boolean z, boolean z2, long j3, long j4) throws ExoPlaybackException;

    /* JADX INFO: renamed from: o */
    void mo3369o(long j2, long j3) throws ExoPlaybackException;

    /* JADX INFO: renamed from: q */
    SampleStream mo3048q();

    /* JADX INFO: renamed from: r */
    void mo3049r() throws IOException;

    void reset();

    /* JADX INFO: renamed from: s */
    long mo3050s();

    void start() throws ExoPlaybackException;

    void stop();

    /* JADX INFO: renamed from: t */
    void mo3051t(long j2) throws ExoPlaybackException;

    /* JADX INFO: renamed from: u */
    boolean mo3052u();

    /* JADX INFO: renamed from: v */
    MediaClock mo3053v();

    /* JADX INFO: renamed from: x */
    int mo3054x();
}
