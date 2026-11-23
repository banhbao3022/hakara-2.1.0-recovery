package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class i50 implements i60, tb0, r90, w60 {

    /* JADX INFO: renamed from: f */
    public final y60 f15089f;

    /* JADX INFO: renamed from: g */
    public final rh1 f15090g;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f15091h;

    /* JADX INFO: renamed from: i */
    public final Executor f15092i;

    /* JADX INFO: renamed from: j */
    public final sv1<Boolean> f15093j = new sv1<>();

    /* JADX INFO: renamed from: k */
    public ScheduledFuture<?> f15094k;

    public i50(y60 y60Var, rh1 rh1Var, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f15089f = y60Var;
        this.f15090g = rh1Var;
        this.f15091h = scheduledExecutorService;
        this.f15092i = executor;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.r90
    /* JADX INFO: renamed from: a */
    public final synchronized void mo5829a() {
        if (this.f15093j.isDone()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f15094k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f15093j.mo6531l(Boolean.TRUE);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: b */
    public final void mo6969b() {
        int i = this.f15090g.f18795S;
        if (i == 0 || i == 1) {
            this.f15089f.zza();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: c */
    public final void mo6970c() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: e */
    public final void mo6972e() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: f */
    public final void mo6973f() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: g */
    public final void mo6974g() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb0
    /* JADX INFO: renamed from: h */
    public final void mo7194h() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: j */
    public final void mo6975j(InterfaceC3068gj interfaceC3068gj, String str, String str2) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.r90
    /* JADX INFO: renamed from: k */
    public final void mo5835k() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w60
    /* JADX INFO: renamed from: m0 */
    public final synchronized void mo6976m0(yv2 yv2Var) {
        if (this.f15093j.isDone()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f15094k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f15093j.mo6532m(new Exception());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb0
    public final void zza() {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14275U0)).booleanValue()) {
            rh1 rh1Var = this.f15090g;
            if (rh1Var.f18795S == 2) {
                if (rh1Var.f18825p == 0) {
                    this.f15089f.zza();
                    return;
                }
                sv1<Boolean> sv1Var = this.f15093j;
                sv1Var.mo6230f(new ev1(sv1Var, new h50(this)), this.f15092i);
                this.f15094k = this.f15091h.schedule(new Runnable(this) { // from class: c.n.b.d.j.a.g50

                    /* JADX INFO: renamed from: f */
                    public final i50 f14501f;

                    {
                        this.f14501f = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        i50 i50Var = this.f14501f;
                        synchronized (i50Var) {
                            if (i50Var.f15093j.isDone()) {
                                return;
                            }
                            i50Var.f15093j.mo6531l(Boolean.TRUE);
                        }
                    }
                }, this.f15090g.f18825p, TimeUnit.MILLISECONDS);
            }
        }
    }
}
