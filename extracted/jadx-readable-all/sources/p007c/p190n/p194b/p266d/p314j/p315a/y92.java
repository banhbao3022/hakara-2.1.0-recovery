package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class y92 implements Iterator<d72> {

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<aa2> f21823f;

    /* JADX INFO: renamed from: g */
    public d72 f21824g;

    public y92(g72 g72Var, w92 w92Var) {
        if (!(g72Var instanceof aa2)) {
            this.f21823f = null;
            this.f21824g = (d72) g72Var;
            return;
        }
        aa2 aa2Var = (aa2) g72Var;
        ArrayDeque<aa2> arrayDeque = new ArrayDeque<>(aa2Var.f12054m);
        this.f21823f = arrayDeque;
        arrayDeque.push(aa2Var);
        g72 g72Var2 = aa2Var.f12051j;
        while (g72Var2 instanceof aa2) {
            aa2 aa2Var2 = (aa2) g72Var2;
            this.f21823f.push(aa2Var2);
            g72Var2 = aa2Var2.f12051j;
        }
        this.f21824g = (d72) g72Var2;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d72 next() {
        d72 d72Var;
        d72 d72Var2 = this.f21824g;
        if (d72Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque<aa2> arrayDeque = this.f21823f;
            d72Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            g72 g72Var = this.f21823f.pop().f12052k;
            while (g72Var instanceof aa2) {
                aa2 aa2Var = (aa2) g72Var;
                this.f21823f.push(aa2Var);
                g72Var = aa2Var.f12051j;
            }
            d72Var = (d72) g72Var;
        } while (d72Var.mo5719m() == 0);
        this.f21824g = d72Var;
        return d72Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21824g != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
