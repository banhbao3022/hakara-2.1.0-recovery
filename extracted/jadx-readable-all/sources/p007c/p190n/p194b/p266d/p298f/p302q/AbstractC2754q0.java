package p007c.p190n.p194b.p266d.p298f.p302q;

/* JADX INFO: renamed from: c.n.b.d.f.q.q0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2754q0<TListener> {

    /* JADX INFO: renamed from: a */
    public TListener f11899a;

    /* JADX INFO: renamed from: b */
    public boolean f11900b = false;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC2717c f11901c;

    public AbstractC2754q0(AbstractC2717c abstractC2717c, TListener tlistener) {
        this.f11901c = abstractC2717c;
        this.f11899a = tlistener;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5594a();

    /* JADX INFO: renamed from: b */
    public abstract void mo5595b(TListener tlistener);

    /* JADX INFO: renamed from: c */
    public final void m5609c() {
        synchronized (this) {
            this.f11899a = null;
        }
        synchronized (this.f11901c.f11811m) {
            this.f11901c.f11811m.remove(this);
        }
    }
}
