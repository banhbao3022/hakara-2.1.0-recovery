package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2317h;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class n21 implements InterfaceC2317h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3147io f17001a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ di1 f17002b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rh1 f17003c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t21 f17004d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ o21 f17005e;

    public n21(o21 o21Var, C3147io c3147io, di1 di1Var, rh1 rh1Var, t21 t21Var) {
        this.f17005e = o21Var;
        this.f17001a = c3147io;
        this.f17002b = di1Var;
        this.f17003c = rh1Var;
        this.f17004d = t21Var;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2317h
    /* JADX INFO: renamed from: a */
    public final void mo4846a() {
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2317h
    /* JADX INFO: renamed from: b */
    public final void mo4847b() {
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2317h
    /* JADX INFO: renamed from: c */
    public final void mo4848c(View view) {
        C3147io c3147io = this.f17001a;
        x21 x21Var = this.f17005e.f17508d;
        di1 di1Var = this.f17002b;
        rh1 rh1Var = this.f17003c;
        t21 t21Var = this.f17004d;
        Objects.requireNonNull(x21Var);
        zc0 zc0VarMo7564c = x21Var.f21429a.mo7564c(new c30(di1Var, rh1Var, null), new v21(u21.f20203a));
        w21 w21Var = new w21(zc0VarMo7564c);
        synchronized (t21Var) {
            t21Var.f19754a = w21Var;
        }
        c3147io.m7286a(zc0VarMo7564c.mo7412h());
    }
}
