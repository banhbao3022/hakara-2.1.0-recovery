package p007c.p190n.p194b.p266d.p290d.p295s;

import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.C2383e;

/* JADX INFO: renamed from: c.n.b.d.d.s.f0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2528f0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2522c0 f11410f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2550u f11411g;

    public RunnableC2528f0(C2522c0 c2522c0, C2550u c2550u) {
        this.f11410f = c2522c0;
        this.f11411g = c2550u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C2522c0 c2522c0 = this.f11410f;
        C2550u c2550u = this.f11411g;
        C2518b c2518b = C2522c0.f11384A;
        Objects.requireNonNull(c2522c0);
        String str = c2550u.f11467f;
        if (C2516a.m5114d(str, c2522c0.f11394K)) {
            z = false;
        } else {
            c2522c0.f11394K = str;
            z = true;
        }
        C2522c0.f11384A.m5119a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(c2522c0.f11396M));
        C2383e.c cVar = c2522c0.f11389F;
        if (cVar != null && (z || c2522c0.f11396M)) {
            cVar.mo4958d();
        }
        c2522c0.f11396M = false;
    }
}
