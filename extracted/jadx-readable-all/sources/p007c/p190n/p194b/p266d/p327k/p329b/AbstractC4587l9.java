package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.l9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4587l9 extends C4686u5 implements InterfaceC4697v5 {

    /* JADX INFO: renamed from: b */
    public final C4611n9 f24132b;

    /* JADX INFO: renamed from: c */
    public boolean f24133c;

    public AbstractC4587l9(C4611n9 c4611n9) {
        super(c4611n9.f24201k);
        this.f24132b = c4611n9;
        c4611n9.f24206p++;
    }

    /* JADX INFO: renamed from: h */
    public C4679t9 m10641h() {
        return this.f24132b.m10666N();
    }

    /* JADX INFO: renamed from: i */
    public final void m10642i() {
        if (!this.f24133c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10643k() {
        if (this.f24133c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo10577p();
        this.f24132b.f24207q++;
        this.f24133c = true;
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo10577p();

    /* JADX INFO: renamed from: q */
    public C4517g m10644q() {
        return this.f24132b.m10663K();
    }

    /* JADX INFO: renamed from: r */
    public C4652r4 m10645r() {
        return this.f24132b.m10660H();
    }
}
