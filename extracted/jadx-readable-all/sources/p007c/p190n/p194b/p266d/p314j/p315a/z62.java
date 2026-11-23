package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class z62 extends a72 {

    /* JADX INFO: renamed from: f */
    public int f22186f = 0;

    /* JADX INFO: renamed from: g */
    public final int f22187g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ g72 f22188h;

    public z62(g72 g72Var) {
        this.f22188h = g72Var;
        this.f22187g = g72Var.mo5719m();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a72
    /* JADX INFO: renamed from: a */
    public final byte mo5700a() {
        int i = this.f22186f;
        if (i >= this.f22187g) {
            throw new NoSuchElementException();
        }
        this.f22186f = i + 1;
        return this.f22188h.mo5718j(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22186f < this.f22187g;
    }
}
