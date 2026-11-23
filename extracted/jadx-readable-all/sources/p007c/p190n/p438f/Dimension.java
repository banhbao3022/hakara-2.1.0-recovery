package p007c.p190n.p438f;

/* JADX INFO: renamed from: c.n.f.b, reason: use source file name */
/* JADX INFO: compiled from: Dimension.java */
/* JADX INFO: loaded from: classes.dex */
public final class Dimension {

    /* JADX INFO: renamed from: a */
    public final int f27605a;

    /* JADX INFO: renamed from: b */
    public final int f27606b;

    public Dimension(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException();
        }
        this.f27605a = i;
        this.f27606b = i2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dimension) {
            Dimension dimension = (Dimension) obj;
            if (this.f27605a == dimension.f27605a && this.f27606b == dimension.f27606b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f27605a * 32713) + this.f27606b;
    }

    public String toString() {
        return this.f27605a + "x" + this.f27606b;
    }
}
