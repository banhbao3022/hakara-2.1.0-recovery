package p007c.p190n.p194b.p195a.p198j.p203v.p204h;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p007c.p190n.p194b.p195a.p198j.TransportContext;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore;
import p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationException;
import p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard;

/* JADX INFO: renamed from: c.n.b.a.j.v.h.g, reason: use source file name */
/* JADX INFO: compiled from: Uploader.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Uploader implements Runnable {

    /* JADX INFO: renamed from: f */
    public final Uploader6 f5833f;

    /* JADX INFO: renamed from: g */
    public final TransportContext f5834g;

    /* JADX INFO: renamed from: h */
    public final int f5835h;

    /* JADX INFO: renamed from: i */
    public final Runnable f5836i;

    public Uploader(Uploader6 uploader6, TransportContext transportContext, int i, Runnable runnable) {
        this.f5833f = uploader6;
        this.f5834g = transportContext;
        this.f5835h = i;
        this.f5836i = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        final Uploader6 uploader6 = this.f5833f;
        final TransportContext transportContext = this.f5834g;
        final int i = this.f5835h;
        Runnable runnable = this.f5836i;
        try {
            try {
                SynchronizationGuard synchronizationGuard = uploader6.f5853f;
                final EventStore eventStore = uploader6.f5850c;
                eventStore.getClass();
                synchronizationGuard.mo2871a(new SynchronizationGuard.a(eventStore) { // from class: c.n.b.a.j.v.h.j

                    /* JADX INFO: renamed from: a */
                    public final EventStore f5844a;

                    {
                        this.f5844a = eventStore;
                    }

                    @Override // p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard.a
                    /* JADX INFO: renamed from: h */
                    public Object mo2836h() {
                        return Integer.valueOf(this.f5844a.mo2860j());
                    }
                });
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) uploader6.f5848a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    uploader6.m2850a(transportContext, i);
                } else {
                    uploader6.f5853f.mo2871a(new SynchronizationGuard.a(uploader6, transportContext, i) { // from class: c.n.b.a.j.v.h.k

                        /* JADX INFO: renamed from: a */
                        public final Uploader6 f5845a;

                        /* JADX INFO: renamed from: b */
                        public final TransportContext f5846b;

                        /* JADX INFO: renamed from: c */
                        public final int f5847c;

                        {
                            this.f5845a = uploader6;
                            this.f5846b = transportContext;
                            this.f5847c = i;
                        }

                        @Override // p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard.a
                        /* JADX INFO: renamed from: h */
                        public Object mo2836h() {
                            Uploader6 uploader7 = this.f5845a;
                            uploader7.f5851d.mo2847a(this.f5846b, this.f5847c + 1);
                            return null;
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                uploader6.f5851d.mo2847a(transportContext, i + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
