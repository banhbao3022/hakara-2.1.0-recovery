package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.c5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4475c5 extends C4460b2 {

    /* JADX INFO: renamed from: b */
    public boolean f23783b;

    public AbstractC4475c5(C4707w4 c4707w4) {
        super(c4707w4);
        this.f24476a.f24525F++;
    }

    /* JADX INFO: renamed from: t */
    public final void m10479t() {
        if (!this.f23783b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m10480u() {
        if (this.f23783b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo10481v()) {
            return;
        }
        this.f24476a.f24526G.incrementAndGet();
        this.f23783b = true;
    }

    /* JADX INFO: renamed from: v */
    public abstract boolean mo10481v();
}
