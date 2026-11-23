package p636z0.p725k.p735h;

/* JADX INFO: renamed from: z0.k.h.a, reason: use source file name */
/* JADX INFO: compiled from: CancellationSignal.java */
/* JADX INFO: loaded from: classes.dex */
public final class CancellationSignal {

    /* JADX INFO: renamed from: a */
    public boolean f37890a;

    /* JADX INFO: renamed from: b */
    public a f37891b;

    /* JADX INFO: renamed from: c */
    public boolean f37892c;

    /* JADX INFO: renamed from: z0.k.h.a$a */
    /* JADX INFO: compiled from: CancellationSignal.java */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo15489b();
    }

    /* JADX INFO: renamed from: a */
    public void m16201a() {
        synchronized (this) {
            if (this.f37890a) {
                return;
            }
            this.f37890a = true;
            this.f37892c = true;
            a aVar = this.f37891b;
            if (aVar != null) {
                try {
                    aVar.mo15489b();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f37892c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f37892c = false;
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m16202b(a aVar) {
        synchronized (this) {
            while (this.f37892c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f37891b == aVar) {
                return;
            }
            this.f37891b = aVar;
            if (this.f37890a) {
                aVar.mo15489b();
            }
        }
    }
}
