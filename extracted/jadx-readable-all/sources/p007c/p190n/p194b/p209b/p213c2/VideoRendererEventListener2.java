package p007c.p190n.p194b.p209b.p213c2;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderCounters;
import p007c.p190n.p194b.p209b.p217p1.DecoderReuseEvaluation;

/* JADX INFO: renamed from: c.n.b.b.c2.u, reason: use source file name */
/* JADX INFO: compiled from: VideoRendererEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public interface VideoRendererEventListener2 {

    /* JADX INFO: renamed from: c.n.b.b.c2.u$a */
    /* JADX INFO: compiled from: VideoRendererEventListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Handler f6542a;

        /* JADX INFO: renamed from: b */
        public final VideoRendererEventListener2 f6543b;

        public a(Handler handler, VideoRendererEventListener2 videoRendererEventListener2) {
            if (videoRendererEventListener2 != null) {
                Objects.requireNonNull(handler);
            } else {
                handler = null;
            }
            this.f6542a = handler;
            this.f6543b = videoRendererEventListener2;
        }

        /* JADX INFO: renamed from: a */
        public void m3327a(final int i, final int i2, final int i3, final float f) {
            Handler handler = this.f6542a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.n.b.b.c2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener2.a aVar = this.f6426f;
                        int i4 = i;
                        int i5 = i2;
                        int i6 = i3;
                        float f2 = f;
                        VideoRendererEventListener2 videoRendererEventListener2 = aVar.f6543b;
                        int i7 = Util6.f6307a;
                        videoRendererEventListener2.mo1146b(i4, i5, i6, f2);
                    }
                });
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: I */
    void mo1134I(Format format);

    /* JADX INFO: renamed from: J */
    void mo1135J(DecoderCounters decoderCounters);

    /* JADX INFO: renamed from: K */
    void mo1136K(Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    /* JADX INFO: renamed from: R */
    void mo1140R(DecoderCounters decoderCounters);

    /* JADX INFO: renamed from: X */
    void mo1143X(long j2, int i);

    /* JADX INFO: renamed from: b */
    void mo1146b(int i, int i2, int i3, float f);

    /* JADX INFO: renamed from: f */
    void mo1149f(String str);

    /* JADX INFO: renamed from: i */
    void mo1151i(String str, long j2, long j3);

    /* JADX INFO: renamed from: t */
    void mo1153t(Surface surface);

    /* JADX INFO: renamed from: x */
    void mo1156x(int i, long j2);
}
