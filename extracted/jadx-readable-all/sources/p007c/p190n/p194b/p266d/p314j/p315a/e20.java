package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class e20 implements u70, ip2 {

    /* JADX INFO: renamed from: f */
    public final rh1 f13452f;

    /* JADX INFO: renamed from: g */
    public final y60 f13453g;

    /* JADX INFO: renamed from: h */
    public final e80 f13454h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f13455i = new AtomicBoolean();

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f13456j = new AtomicBoolean();

    public e20(rh1 rh1Var, y60 y60Var, e80 e80Var) {
        this.f13452f = rh1Var;
        this.f13453g = y60Var;
        this.f13454h = e80Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u70
    /* JADX INFO: renamed from: a0 */
    public final synchronized void mo5730a0() {
        if (this.f13452f.f18811e != 1) {
            if (this.f13455i.compareAndSet(false, true)) {
                this.f13453g.zza();
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ip2
    /* JADX INFO: renamed from: q0 */
    public final void mo6352q0(hp2 hp2Var) {
        if (this.f13452f.f18811e == 1 && hp2Var.f14934j && this.f13455i.compareAndSet(false, true)) {
            this.f13453g.zza();
        }
        if (hp2Var.f14934j && this.f13456j.compareAndSet(false, true)) {
            e80 e80Var = this.f13454h;
            synchronized (e80Var) {
                e80Var.m7108A0(c80.f12955a);
            }
        }
    }
}
