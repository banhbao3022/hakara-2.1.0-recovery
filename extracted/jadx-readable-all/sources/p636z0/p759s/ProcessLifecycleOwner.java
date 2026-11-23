package p636z0.p759s;

import android.os.Handler;

/* JADX INFO: renamed from: z0.s.w, reason: use source file name */
/* JADX INFO: compiled from: ProcessLifecycleOwner.java */
/* JADX INFO: loaded from: classes.dex */
public class ProcessLifecycleOwner implements LifecycleOwner {

    /* JADX INFO: renamed from: f */
    public static final ProcessLifecycleOwner f38717f = new ProcessLifecycleOwner();

    /* JADX INFO: renamed from: k */
    public Handler f38722k;

    /* JADX INFO: renamed from: g */
    public int f38718g = 0;

    /* JADX INFO: renamed from: h */
    public int f38719h = 0;

    /* JADX INFO: renamed from: i */
    public boolean f38720i = true;

    /* JADX INFO: renamed from: j */
    public boolean f38721j = true;

    /* JADX INFO: renamed from: l */
    public final LifecycleRegistry f38723l = new LifecycleRegistry(this);

    /* JADX INFO: renamed from: m */
    public Runnable f38724m = new a();

    /* JADX INFO: renamed from: n */
    public ReportFragment.a f38725n = new b();

    /* JADX INFO: renamed from: z0.s.w$a */
    /* JADX INFO: compiled from: ProcessLifecycleOwner.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.this;
            if (processLifecycleOwner.f38719h == 0) {
                processLifecycleOwner.f38720i = true;
                processLifecycleOwner.f38723l.m16733f(Lifecycle3.a.ON_PAUSE);
            }
            ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.this;
            if (processLifecycleOwner2.f38718g == 0 && processLifecycleOwner2.f38720i) {
                processLifecycleOwner2.f38723l.m16733f(Lifecycle3.a.ON_STOP);
                processLifecycleOwner2.f38721j = true;
            }
        }
    }

    /* JADX INFO: renamed from: z0.s.w$b */
    /* JADX INFO: compiled from: ProcessLifecycleOwner.java */
    public class b implements ReportFragment.a {
        public b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16743a() {
        int i = this.f38719h + 1;
        this.f38719h = i;
        if (i == 1) {
            if (!this.f38720i) {
                this.f38722k.removeCallbacks(this.f38724m);
            } else {
                this.f38723l.m16733f(Lifecycle3.a.ON_RESUME);
                this.f38720i = false;
            }
        }
    }

    @Override // p636z0.p759s.LifecycleOwner
    /* JADX INFO: renamed from: b */
    public Lifecycle3 mo124b() {
        return this.f38723l;
    }

    /* JADX INFO: renamed from: c */
    public void m16744c() {
        int i = this.f38718g + 1;
        this.f38718g = i;
        if (i == 1 && this.f38721j) {
            this.f38723l.m16733f(Lifecycle3.a.ON_START);
            this.f38721j = false;
        }
    }
}
