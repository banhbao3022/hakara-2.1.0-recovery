package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.app.Dialog;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.f1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2658f1 extends AbstractC2660g0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Dialog f11656a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC2652d1 f11657b;

    public C2658f1(RunnableC2652d1 runnableC2652d1, Dialog dialog) {
        this.f11657b = runnableC2652d1;
        this.f11656a = dialog;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2660g0
    /* JADX INFO: renamed from: a */
    public final void mo5512a() {
        this.f11657b.f11650g.m5508j();
        if (this.f11656a.isShowing()) {
            this.f11656a.dismiss();
        }
    }
}
