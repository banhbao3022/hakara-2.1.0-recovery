package p007c.p190n.p194b.p209b;

import android.os.Looper;
import p007c.p190n.p194b.p209b.p212b2.Clock2;

/* JADX INFO: renamed from: c.n.b.b.e1, reason: use source file name */
/* JADX INFO: compiled from: PlayerMessage.java */
/* JADX INFO: loaded from: classes.dex */
public final class PlayerMessage {

    /* JADX INFO: renamed from: a */
    public final b f6583a;

    /* JADX INFO: renamed from: b */
    public final a f6584b;

    /* JADX INFO: renamed from: c */
    public final Clock2 f6585c;

    /* JADX INFO: renamed from: d */
    public final Timeline f6586d;

    /* JADX INFO: renamed from: e */
    public int f6587e;

    /* JADX INFO: renamed from: f */
    public Object f6588f;

    /* JADX INFO: renamed from: g */
    public Looper f6589g;

    /* JADX INFO: renamed from: h */
    public int f6590h;

    /* JADX INFO: renamed from: i */
    public long f6591i = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public boolean f6592j = true;

    /* JADX INFO: renamed from: k */
    public boolean f6593k;

    /* JADX INFO: renamed from: l */
    public boolean f6594l;

    /* JADX INFO: renamed from: m */
    public boolean f6595m;

    /* JADX INFO: renamed from: c.n.b.b.e1$a */
    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface a {
    }

    /* JADX INFO: renamed from: c.n.b.b.e1$b */
    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface b {
        /* JADX INFO: renamed from: p */
        void mo3047p(int i, Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(a aVar, b bVar, Timeline timeline, int i, Clock2 clock2, Looper looper) {
        this.f6584b = aVar;
        this.f6583a = bVar;
        this.f6586d = timeline;
        this.f6589g = looper;
        this.f6585c = clock2;
        this.f6590h = i;
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m3353a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m3354b(boolean z) {
        this.f6594l = z | this.f6594l;
        this.f6595m = true;
        notifyAll();
    }
}
