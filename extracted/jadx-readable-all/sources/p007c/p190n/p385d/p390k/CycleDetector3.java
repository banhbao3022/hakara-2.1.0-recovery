package p007c.p190n.p385d.p390k;

/* JADX INFO: renamed from: c.n.d.k.r, reason: use source file name */
/* JADX INFO: compiled from: CycleDetector.java */
/* JADX INFO: loaded from: classes.dex */
public class CycleDetector3 {

    /* JADX INFO: renamed from: a */
    public final Class<?> f26397a;

    /* JADX INFO: renamed from: b */
    public final boolean f26398b;

    public CycleDetector3(Class cls, boolean z, CycleDetector cycleDetector) {
        this.f26397a = cls;
        this.f26398b = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CycleDetector3)) {
            return false;
        }
        CycleDetector3 cycleDetector3 = (CycleDetector3) obj;
        return cycleDetector3.f26397a.equals(this.f26397a) && cycleDetector3.f26398b == this.f26398b;
    }

    public int hashCode() {
        return ((this.f26397a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f26398b).hashCode();
    }
}
