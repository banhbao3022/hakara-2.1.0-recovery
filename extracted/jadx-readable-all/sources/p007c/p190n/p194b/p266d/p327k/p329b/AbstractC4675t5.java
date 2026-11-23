package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.t5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4675t5 extends C4686u5 {

    /* JADX INFO: renamed from: b */
    public boolean f24448b;

    public AbstractC4675t5(C4707w4 c4707w4) {
        super(c4707w4);
        this.f24476a.f24525F++;
    }

    /* JADX INFO: renamed from: h */
    public void mo10532h() {
    }

    /* JADX INFO: renamed from: i */
    public final boolean m10762i() {
        return this.f24448b;
    }

    /* JADX INFO: renamed from: k */
    public final void m10763k() {
        if (!m10762i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m10764p() {
        if (this.f24448b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo10533r()) {
            return;
        }
        this.f24476a.f24526G.incrementAndGet();
        this.f24448b = true;
    }

    /* JADX INFO: renamed from: q */
    public final void m10765q() {
        if (this.f24448b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo10532h();
        this.f24476a.f24526G.incrementAndGet();
        this.f24448b = true;
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo10533r();
}
