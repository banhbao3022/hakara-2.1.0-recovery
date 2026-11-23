package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import java.util.Set;
import java.util.TimerTask;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.w */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2495w extends TimerTask {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2458h.i f11361f;

    public C2495w(C2458h.i iVar, C2458h c2458h) {
        this.f11361f = iVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C2458h.i iVar = this.f11361f;
        C2458h c2458h = C2458h.this;
        Set<C2458h.d> set = iVar.f11304a;
        int i = C2458h.f11287a;
        c2458h.m5076s(set);
        C2458h.i iVar2 = this.f11361f;
        C2458h.this.f11289c.postDelayed(this, iVar2.f11305b);
    }
}
