package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.tq */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3556tq {

    /* JADX INFO: renamed from: a */
    public final kn2 f19953a = new kn2(true, 65536);

    /* JADX INFO: renamed from: b */
    public long f19954b = 15000000;

    /* JADX INFO: renamed from: c */
    public long f19955c = 30000000;

    /* JADX INFO: renamed from: d */
    public long f19956d = 2500000;

    /* JADX INFO: renamed from: e */
    public long f19957e = 5000000;

    /* JADX INFO: renamed from: f */
    public int f19958f;

    /* JADX INFO: renamed from: g */
    public boolean f19959g;

    /* JADX INFO: renamed from: a */
    public final void m8442a() {
        m8445d(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m8443b() {
        m8445d(true);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m8444c(long j2, boolean z) {
        long j3;
        try {
            j3 = z ? this.f19957e : this.f19956d;
        } catch (Throwable th) {
            throw th;
        }
        return j3 <= 0 || j2 >= j3;
    }

    /* JADX INFO: renamed from: d */
    public final void m8445d(boolean z) {
        this.f19958f = 0;
        this.f19959g = false;
        if (z) {
            kn2 kn2Var = this.f19953a;
            synchronized (kn2Var) {
                kn2Var.m7530a(0);
            }
        }
    }
}
