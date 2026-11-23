package p007c.p190n.p194b.p209b.p218q1;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;

/* JADX INFO: renamed from: c.n.b.b.q1.v, reason: use source file name */
/* JADX INFO: compiled from: DrmSessionEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public interface DrmSessionEventListener2 {
    /* JADX INFO: renamed from: B */
    void mo1130B(int i, MediaSource2.a aVar);

    /* JADX INFO: renamed from: F */
    void mo1131F(int i, MediaSource2.a aVar);

    /* JADX INFO: renamed from: M */
    void mo1138M(int i, MediaSource2.a aVar);

    /* JADX INFO: renamed from: T */
    void mo1141T(int i, MediaSource2.a aVar);

    /* JADX INFO: renamed from: Y */
    void mo1144Y(int i, MediaSource2.a aVar);

    /* JADX INFO: renamed from: p */
    void mo1152p(int i, MediaSource2.a aVar, Exception exc);

    /* JADX INFO: renamed from: c.n.b.b.q1.v$a */
    /* JADX INFO: compiled from: DrmSessionEventListener.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f7437a;

        /* JADX INFO: renamed from: b */
        public final MediaSource2.a f7438b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList<C8510a> f7439c;

        /* JADX INFO: renamed from: c.n.b.b.q1.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DrmSessionEventListener.java */
        public static final class C8510a {

            /* JADX INFO: renamed from: a */
            public Handler f7440a;

            /* JADX INFO: renamed from: b */
            public DrmSessionEventListener2 f7441b;

            public C8510a(Handler handler, DrmSessionEventListener2 drmSessionEventListener2) {
                this.f7440a = handler;
                this.f7441b = drmSessionEventListener2;
            }
        }

        public a() {
            this.f7439c = new CopyOnWriteArrayList<>();
            this.f7437a = 0;
            this.f7438b = null;
        }

        /* JADX INFO: renamed from: a */
        public void m3695a() {
            for (C8510a c8510a : this.f7439c) {
                final DrmSessionEventListener2 drmSessionEventListener2 = c8510a.f7441b;
                Util6.m3102K(c8510a.f7440a, new Runnable() { // from class: c.n.b.b.q1.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener2.a aVar = this.f7342f;
                        drmSessionEventListener2.mo1138M(aVar.f7437a, aVar.f7438b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3696b() {
            for (C8510a c8510a : this.f7439c) {
                final DrmSessionEventListener2 drmSessionEventListener2 = c8510a.f7441b;
                Util6.m3102K(c8510a.f7440a, new Runnable() { // from class: c.n.b.b.q1.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener2.a aVar = this.f7340f;
                        drmSessionEventListener2.mo1130B(aVar.f7437a, aVar.f7438b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: c */
        public void m3697c() {
            for (C8510a c8510a : this.f7439c) {
                final DrmSessionEventListener2 drmSessionEventListener2 = c8510a.f7441b;
                Util6.m3102K(c8510a.f7440a, new Runnable() { // from class: c.n.b.b.q1.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener2.a aVar = this.f7344f;
                        drmSessionEventListener2.mo1144Y(aVar.f7437a, aVar.f7438b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: d */
        public void m3698d() {
            for (C8510a c8510a : this.f7439c) {
                final DrmSessionEventListener2 drmSessionEventListener2 = c8510a.f7441b;
                Util6.m3102K(c8510a.f7440a, new Runnable() { // from class: c.n.b.b.q1.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener2.a aVar = this.f7328f;
                        drmSessionEventListener2.mo1131F(aVar.f7437a, aVar.f7438b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: e */
        public void m3699e(final Exception exc) {
            for (C8510a c8510a : this.f7439c) {
                final DrmSessionEventListener2 drmSessionEventListener2 = c8510a.f7441b;
                Util6.m3102K(c8510a.f7440a, new Runnable() { // from class: c.n.b.b.q1.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener2.a aVar = this.f7350f;
                        drmSessionEventListener2.mo1152p(aVar.f7437a, aVar.f7438b, exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: f */
        public void m3700f() {
            for (C8510a c8510a : this.f7439c) {
                final DrmSessionEventListener2 drmSessionEventListener2 = c8510a.f7441b;
                Util6.m3102K(c8510a.f7440a, new Runnable() { // from class: c.n.b.b.q1.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener2.a aVar = this.f7334f;
                        drmSessionEventListener2.mo1141T(aVar.f7437a, aVar.f7438b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: g */
        public a m3701g(int i, MediaSource2.a aVar) {
            return new a(this.f7439c, i, aVar);
        }

        public a(CopyOnWriteArrayList<C8510a> copyOnWriteArrayList, int i, MediaSource2.a aVar) {
            this.f7439c = copyOnWriteArrayList;
            this.f7437a = i;
            this.f7438b = aVar;
        }
    }
}
