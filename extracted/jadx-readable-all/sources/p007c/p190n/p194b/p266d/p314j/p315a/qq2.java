package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qq2 {

    /* JADX INFO: renamed from: a */
    public final long f18412a;

    /* JADX INFO: renamed from: b */
    public final String f18413b;

    /* JADX INFO: renamed from: c */
    public final int f18414c;

    public qq2(long j2, String str, int i) {
        this.f18412a = j2;
        this.f18413b = str;
        this.f18414c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof qq2)) {
            qq2 qq2Var = (qq2) obj;
            if (qq2Var.f18412a == this.f18412a && qq2Var.f18414c == this.f18414c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f18412a;
    }
}
