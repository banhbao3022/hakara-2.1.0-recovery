package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class t80 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final WeakReference<u80> f19792f;

    public /* synthetic */ t80(u80 u80Var) {
        this.f19792f = new WeakReference<>(u80Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        u80 u80Var = this.f19792f.get();
        if (u80Var != null) {
            u80Var.m7108A0(s80.f19484a);
        }
    }
}
