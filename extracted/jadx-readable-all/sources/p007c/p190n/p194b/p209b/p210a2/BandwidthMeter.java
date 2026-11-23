package p007c.p190n.p194b.p209b.p210a2;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: c.n.b.b.a2.f, reason: use source file name */
/* JADX INFO: compiled from: BandwidthMeter.java */
/* JADX INFO: loaded from: classes.dex */
public interface BandwidthMeter {

    /* JADX INFO: renamed from: c.n.b.b.a2.f$a */
    /* JADX INFO: compiled from: BandwidthMeter.java */
    public interface a {

        /* JADX INFO: renamed from: c.n.b.b.a2.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BandwidthMeter.java */
        public static final class C8508a {

            /* JADX INFO: renamed from: a */
            public final CopyOnWriteArrayList<C8509a> f5992a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: c.n.b.b.a2.f$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BandwidthMeter.java */
            public static final class C8509a {

                /* JADX INFO: renamed from: a */
                public final Handler f5993a;

                /* JADX INFO: renamed from: b */
                public final a f5994b;

                /* JADX INFO: renamed from: c */
                public boolean f5995c;

                public C8509a(Handler handler, a aVar) {
                    this.f5993a = handler;
                    this.f5994b = aVar;
                }
            }

            /* JADX INFO: renamed from: a */
            public void m2921a(a aVar) {
                for (C8509a c8509a : this.f5992a) {
                    if (c8509a.f5994b == aVar) {
                        c8509a.f5995c = true;
                        this.f5992a.remove(c8509a);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    TransferListener mo2917c();

    /* JADX INFO: renamed from: d */
    void mo2918d(a aVar);

    /* JADX INFO: renamed from: e */
    long mo2919e();

    /* JADX INFO: renamed from: g */
    void mo2920g(Handler handler, a aVar);
}
