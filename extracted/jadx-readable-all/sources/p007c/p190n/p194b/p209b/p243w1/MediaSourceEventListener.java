package p007c.p190n.p194b.p209b.p243w1;

import android.os.Handler;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.w1.f0, reason: use source file name */
/* JADX INFO: compiled from: MediaSourceEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public interface MediaSourceEventListener {
    /* JADX INFO: renamed from: P */
    void mo3498P(int i, MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* JADX INFO: renamed from: W */
    void mo3499W(int i, MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z);

    /* JADX INFO: renamed from: k */
    void mo3506k(int i, MediaSource2.a aVar, MediaLoadData mediaLoadData);

    /* JADX INFO: renamed from: l */
    void mo3507l(int i, MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* JADX INFO: renamed from: n */
    void mo3508n(int i, MediaSource2.a aVar, MediaLoadData mediaLoadData);

    /* JADX INFO: renamed from: r */
    void mo3509r(int i, MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* JADX INFO: renamed from: c.n.b.b.w1.f0$a */
    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f8873a;

        /* JADX INFO: renamed from: b */
        public final MediaSource2.a f8874b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList<C8511a> f8875c;

        /* JADX INFO: renamed from: d */
        public final long f8876d;

        /* JADX INFO: renamed from: c.n.b.b.w1.f0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MediaSourceEventListener.java */
        public static final class C8511a {

            /* JADX INFO: renamed from: a */
            public Handler f8877a;

            /* JADX INFO: renamed from: b */
            public MediaSourceEventListener f8878b;

            public C8511a(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.f8877a = handler;
                this.f8878b = mediaSourceEventListener;
            }
        }

        public a() {
            this.f8875c = new CopyOnWriteArrayList<>();
            this.f8873a = 0;
            this.f8874b = null;
            this.f8876d = 0L;
        }

        /* JADX INFO: renamed from: a */
        public final long m4098a(long j2) {
            long jM3237c = C.m3237c(j2);
            if (jM3237c == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f8876d + jM3237c;
        }

        /* JADX INFO: renamed from: b */
        public void m4099b(int i, Format format, int i2, Object obj, long j2) {
            m4100c(new MediaLoadData(1, i, format, i2, obj, m4098a(j2), -9223372036854775807L));
        }

        /* JADX INFO: renamed from: c */
        public void m4100c(final MediaLoadData mediaLoadData) {
            for (C8511a c8511a : this.f8875c) {
                final MediaSourceEventListener mediaSourceEventListener = c8511a.f8878b;
                Util6.m3102K(c8511a.f8877a, new Runnable() { // from class: c.n.b.b.w1.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.a aVar = this.f8866f;
                        mediaSourceEventListener.mo3506k(aVar.f8873a, aVar.f8874b, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: d */
        public void m4101d(LoadEventInfo loadEventInfo, int i) {
            m4102e(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX INFO: renamed from: e */
        public void m4102e(LoadEventInfo loadEventInfo, int i, int i2, Format format, int i3, Object obj, long j2, long j3) {
            m4103f(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, m4098a(j2), m4098a(j3)));
        }

        /* JADX INFO: renamed from: f */
        public void m4103f(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (C8511a c8511a : this.f8875c) {
                final MediaSourceEventListener mediaSourceEventListener = c8511a.f8878b;
                Util6.m3102K(c8511a.f8877a, new Runnable() { // from class: c.n.b.b.w1.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.a aVar = this.f8879f;
                        mediaSourceEventListener.mo3507l(aVar.f8873a, aVar.f8874b, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: g */
        public void m4104g(LoadEventInfo loadEventInfo, int i) {
            m4105h(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX INFO: renamed from: h */
        public void m4105h(LoadEventInfo loadEventInfo, int i, int i2, Format format, int i3, Object obj, long j2, long j3) {
            m4106i(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, m4098a(j2), m4098a(j3)));
        }

        /* JADX INFO: renamed from: i */
        public void m4106i(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (C8511a c8511a : this.f8875c) {
                final MediaSourceEventListener mediaSourceEventListener = c8511a.f8878b;
                Util6.m3102K(c8511a.f8877a, new Runnable() { // from class: c.n.b.b.w1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.a aVar = this.f8862f;
                        mediaSourceEventListener.mo3498P(aVar.f8873a, aVar.f8874b, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: j */
        public void m4107j(LoadEventInfo loadEventInfo, int i, int i2, Format format, int i3, Object obj, long j2, long j3, IOException iOException, boolean z) {
            m4109l(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, m4098a(j2), m4098a(j3)), iOException, z);
        }

        /* JADX INFO: renamed from: k */
        public void m4108k(LoadEventInfo loadEventInfo, int i, IOException iOException, boolean z) {
            m4107j(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        /* JADX INFO: renamed from: l */
        public void m4109l(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z) {
            for (C8511a c8511a : this.f8875c) {
                final MediaSourceEventListener mediaSourceEventListener = c8511a.f8878b;
                Util6.m3102K(c8511a.f8877a, new Runnable() { // from class: c.n.b.b.w1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.a aVar = this.f8851f;
                        mediaSourceEventListener.mo3499W(aVar.f8873a, aVar.f8874b, loadEventInfo, mediaLoadData, iOException, z);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: m */
        public void m4110m(LoadEventInfo loadEventInfo, int i) {
            m4111n(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX INFO: renamed from: n */
        public void m4111n(LoadEventInfo loadEventInfo, int i, int i2, Format format, int i3, Object obj, long j2, long j3) {
            m4112o(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, m4098a(j2), m4098a(j3)));
        }

        /* JADX INFO: renamed from: o */
        public void m4112o(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (C8511a c8511a : this.f8875c) {
                final MediaSourceEventListener mediaSourceEventListener = c8511a.f8878b;
                Util6.m3102K(c8511a.f8877a, new Runnable() { // from class: c.n.b.b.w1.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.a aVar = this.f8869f;
                        mediaSourceEventListener.mo3509r(aVar.f8873a, aVar.f8874b, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: p */
        public void m4113p(int i, long j2, long j3) {
            m4114q(new MediaLoadData(1, i, null, 3, null, m4098a(j2), m4098a(j3)));
        }

        /* JADX INFO: renamed from: q */
        public void m4114q(final MediaLoadData mediaLoadData) {
            final MediaSource2.a aVar = this.f8874b;
            Objects.requireNonNull(aVar);
            for (C8511a c8511a : this.f8875c) {
                final MediaSourceEventListener mediaSourceEventListener = c8511a.f8878b;
                Util6.m3102K(c8511a.f8877a, new Runnable() { // from class: c.n.b.b.w1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.a aVar2 = this.f8847f;
                        mediaSourceEventListener.mo3508n(aVar2.f8873a, aVar, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: r */
        public a m4115r(int i, MediaSource2.a aVar, long j2) {
            return new a(this.f8875c, i, aVar, j2);
        }

        public a(CopyOnWriteArrayList<C8511a> copyOnWriteArrayList, int i, MediaSource2.a aVar, long j2) {
            this.f8875c = copyOnWriteArrayList;
            this.f8873a = i;
            this.f8874b = aVar;
            this.f8876d = j2;
        }
    }
}
