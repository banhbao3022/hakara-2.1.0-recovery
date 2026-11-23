package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.ScheduledFuture;
import p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2323n;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nl0 implements InterfaceC2323n {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ yl0 f17155f;

    public nl0(yl0 yl0Var) {
        this.f17155f = yl0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2323n
    /* JADX INFO: renamed from: A0 */
    public final void mo4862A0() {
        u80 u80Var = this.f17155f.f21915g;
        synchronized (u80Var) {
            if (u80Var.f20236k) {
                if (u80Var.f20235j > 0 && u80Var.f20237l.isCancelled()) {
                    u80Var.m8476E0(u80Var.f20235j);
                }
                u80Var.f20236k = false;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2323n
    /* JADX INFO: renamed from: b */
    public final void mo4863b() {
        u80 u80Var = this.f17155f.f21915g;
        synchronized (u80Var) {
            if (!u80Var.f20236k) {
                ScheduledFuture<?> scheduledFuture = u80Var.f20237l;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    u80Var.f20235j = -1L;
                } else {
                    u80Var.f20237l.cancel(true);
                    u80Var.f20235j = u80Var.f20234i - u80Var.f20233h.mo5621a();
                }
                u80Var.f20236k = true;
            }
        }
    }
}
