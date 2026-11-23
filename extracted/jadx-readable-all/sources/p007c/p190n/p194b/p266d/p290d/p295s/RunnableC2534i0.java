package p007c.p190n.p194b.p266d.p290d.p295s;

import p007c.p190n.p194b.p266d.p290d.C2383e;

/* JADX INFO: renamed from: c.n.b.d.d.s.i0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2534i0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2522c0 f11419f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f11420g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f11421h;

    public RunnableC2534i0(C2522c0 c2522c0, String str, String str2) {
        this.f11419f = c2522c0;
        this.f11420g = str;
        this.f11421h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2383e.d dVar;
        synchronized (this.f11419f.f11390G) {
            dVar = this.f11419f.f11390G.get(this.f11420g);
        }
        if (dVar != null) {
            dVar.mo4961a(this.f11419f.f11388E, this.f11420g, this.f11421h);
        } else {
            C2522c0.f11384A.m5119a("Discarded message for unknown namespace '%s'", this.f11420g);
        }
    }
}
