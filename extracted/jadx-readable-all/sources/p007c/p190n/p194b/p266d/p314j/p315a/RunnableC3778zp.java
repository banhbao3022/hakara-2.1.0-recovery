package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: renamed from: c.n.b.d.j.a.zp */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3778zp implements Runnable {

    /* JADX INFO: renamed from: f */
    public final C3333np f22378f;

    /* JADX INFO: renamed from: g */
    public boolean f22379g = false;

    public RunnableC3778zp(C3333np c3333np) {
        this.f22378f = c3333np;
    }

    /* JADX INFO: renamed from: a */
    public final void m8897a() {
        this.f22379g = true;
        this.f22378f.m7899b();
    }

    /* JADX INFO: renamed from: b */
    public final void m8898b() {
        this.f22379g = false;
        xr1 xr1Var = C2267h1.f10713a;
        xr1Var.removeCallbacks(this);
        xr1Var.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f22379g) {
            return;
        }
        this.f22378f.m7899b();
        xr1 xr1Var = C2267h1.f10713a;
        xr1Var.removeCallbacks(this);
        xr1Var.postDelayed(this, 250L);
    }
}
