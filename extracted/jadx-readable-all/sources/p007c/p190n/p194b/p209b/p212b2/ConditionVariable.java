package p007c.p190n.p194b.p209b.p212b2;

/* JADX INFO: renamed from: c.n.b.b.b2.j, reason: use source file name */
/* JADX INFO: compiled from: ConditionVariable.java */
/* JADX INFO: loaded from: classes.dex */
public class ConditionVariable {

    /* JADX INFO: renamed from: a */
    public final Clock2 f6326a;

    /* JADX INFO: renamed from: b */
    public boolean f6327b;

    public ConditionVariable() {
        this(Clock2.f6300a);
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m3140a() {
        boolean z;
        z = this.f6327b;
        this.f6327b = false;
        return z;
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m3141b() {
        if (this.f6327b) {
            return false;
        }
        this.f6327b = true;
        notifyAll();
        return true;
    }

    public ConditionVariable(Clock2 clock2) {
        this.f6326a = clock2;
    }
}
