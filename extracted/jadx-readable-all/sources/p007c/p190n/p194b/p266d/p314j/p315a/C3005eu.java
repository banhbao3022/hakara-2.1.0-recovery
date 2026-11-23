package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.eu */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3005eu {

    /* JADX INFO: renamed from: a */
    public final int f13691a;

    /* JADX INFO: renamed from: b */
    public final int f13692b;

    /* JADX INFO: renamed from: c */
    public final int f13693c;

    public C3005eu(int i, int i2, int i3) {
        this.f13691a = i;
        this.f13693c = i2;
        this.f13692b = i3;
    }

    /* JADX INFO: renamed from: a */
    public static C3005eu m6686a(jw2 jw2Var) {
        if (jw2Var.f15838i) {
            return new C3005eu(3, 0, 0);
        }
        if (jw2Var.f15843n) {
            return new C3005eu(2, 0, 0);
        }
        return jw2Var.f15842m ? m6687b() : m6688c(jw2Var.f15840k, jw2Var.f15837h);
    }

    /* JADX INFO: renamed from: b */
    public static C3005eu m6687b() {
        return new C3005eu(0, 0, 0);
    }

    /* JADX INFO: renamed from: c */
    public static C3005eu m6688c(int i, int i2) {
        return new C3005eu(1, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6689d() {
        return this.f13691a == 3;
    }
}
