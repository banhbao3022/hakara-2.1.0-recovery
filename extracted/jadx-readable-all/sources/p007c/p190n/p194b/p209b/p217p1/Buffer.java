package p007c.p190n.p194b.p209b.p217p1;

/* JADX INFO: renamed from: c.n.b.b.p1.a, reason: use source file name */
/* JADX INFO: compiled from: Buffer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Buffer {

    /* JADX INFO: renamed from: f */
    public int f7262f;

    /* JADX INFO: renamed from: m */
    public final void m3624m(int i) {
        this.f7262f = i | this.f7262f;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m3625q(int i) {
        return (this.f7262f & i) == i;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3626s() {
        return m3625q(268435456);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m3627u() {
        return m3625q(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3628v() {
        return m3625q(4);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m3629w() {
        return m3625q(1);
    }
}
