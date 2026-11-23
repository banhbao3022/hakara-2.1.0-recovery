package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class r72 {

    /* JADX INFO: renamed from: a */
    public final Object f18716a;

    /* JADX INFO: renamed from: b */
    public final int f18717b;

    public r72(Object obj, int i) {
        this.f18716a = obj;
        this.f18717b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r72)) {
            return false;
        }
        r72 r72Var = (r72) obj;
        return this.f18716a == r72Var.f18716a && this.f18717b == r72Var.f18717b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f18716a) * 65535) + this.f18717b;
    }
}
