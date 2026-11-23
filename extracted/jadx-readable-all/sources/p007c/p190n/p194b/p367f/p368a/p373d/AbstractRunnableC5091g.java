package p007c.p190n.p194b.p367f.p368a.p373d;

import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.d.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC5091g implements Runnable {

    /* JADX INFO: renamed from: f */
    public final C5151o<?> f26044f;

    public AbstractRunnableC5091g() {
        this.f26044f = null;
    }

    public AbstractRunnableC5091g(C5151o<?> c5151o) {
        this.f26044f = c5151o;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo11431a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo11431a();
        } catch (Exception e) {
            C5151o<?> c5151o = this.f26044f;
            if (c5151o != null) {
                c5151o.m11572a(e);
            }
        }
    }
}
