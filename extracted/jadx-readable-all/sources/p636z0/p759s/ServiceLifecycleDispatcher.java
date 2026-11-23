package p636z0.p759s;

import android.os.Handler;

/* JADX INFO: renamed from: z0.s.b0, reason: use source file name */
/* JADX INFO: compiled from: ServiceLifecycleDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class ServiceLifecycleDispatcher {

    /* JADX INFO: renamed from: a */
    public final LifecycleRegistry f38675a;

    /* JADX INFO: renamed from: b */
    public final Handler f38676b = new Handler();

    /* JADX INFO: renamed from: c */
    public a f38677c;

    /* JADX INFO: renamed from: z0.s.b0$a */
    /* JADX INFO: compiled from: ServiceLifecycleDispatcher.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final LifecycleRegistry f38678f;

        /* JADX INFO: renamed from: g */
        public final Lifecycle3.a f38679g;

        /* JADX INFO: renamed from: h */
        public boolean f38680h = false;

        public a(LifecycleRegistry lifecycleRegistry, Lifecycle3.a aVar) {
            this.f38678f = lifecycleRegistry;
            this.f38679g = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38680h) {
                return;
            }
            this.f38678f.m16733f(this.f38679g);
            this.f38680h = true;
        }
    }

    public ServiceLifecycleDispatcher(LifecycleOwner lifecycleOwner) {
        this.f38675a = new LifecycleRegistry(lifecycleOwner);
    }

    /* JADX INFO: renamed from: a */
    public final void m16717a(Lifecycle3.a aVar) {
        a aVar2 = this.f38677c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f38675a, aVar);
        this.f38677c = aVar3;
        this.f38676b.postAtFrontOfQueue(aVar3);
    }
}
