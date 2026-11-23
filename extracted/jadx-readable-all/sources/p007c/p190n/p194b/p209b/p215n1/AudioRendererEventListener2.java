package p007c.p190n.p194b.p209b.p215n1;

import android.os.Handler;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderCounters;
import p007c.p190n.p194b.p209b.p217p1.DecoderReuseEvaluation;

/* JADX INFO: renamed from: c.n.b.b.n1.r, reason: use source file name */
/* JADX INFO: compiled from: AudioRendererEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public interface AudioRendererEventListener2 {

    /* JADX INFO: renamed from: c.n.b.b.n1.r$a */
    /* JADX INFO: compiled from: AudioRendererEventListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Handler f7115a;

        /* JADX INFO: renamed from: b */
        public final AudioRendererEventListener2 f7116b;

        public a(Handler handler, AudioRendererEventListener2 audioRendererEventListener2) {
            if (audioRendererEventListener2 != null) {
                Objects.requireNonNull(handler);
            } else {
                handler = null;
            }
            this.f7115a = handler;
            this.f7116b = audioRendererEventListener2;
        }

        /* JADX INFO: renamed from: a */
        public void m3567a(final DecoderCounters decoderCounters) {
            synchronized (decoderCounters) {
            }
            Handler handler = this.f7115a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.n.b.b.n1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener2.a aVar = this.f6977f;
                        DecoderCounters decoderCounters2 = decoderCounters;
                        Objects.requireNonNull(aVar);
                        synchronized (decoderCounters2) {
                        }
                        AudioRendererEventListener2 audioRendererEventListener2 = aVar.f7116b;
                        int i = Util6.f6307a;
                        audioRendererEventListener2.mo1148e(decoderCounters2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: A */
    void mo1129A(Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    /* JADX INFO: renamed from: G */
    void mo1132G(boolean z);

    /* JADX INFO: renamed from: H */
    void mo1133H(Exception exc);

    /* JADX INFO: renamed from: L */
    void mo1137L(long j2);

    @Deprecated
    /* JADX INFO: renamed from: N */
    void mo1139N(Format format);

    /* JADX INFO: renamed from: V */
    void mo1142V(int i, long j2, long j3);

    /* JADX INFO: renamed from: e */
    void mo1148e(DecoderCounters decoderCounters);

    /* JADX INFO: renamed from: g */
    void mo1150g(DecoderCounters decoderCounters);

    /* JADX INFO: renamed from: u */
    void mo1154u(String str);

    /* JADX INFO: renamed from: v */
    void mo1155v(String str, long j2, long j3);
}
