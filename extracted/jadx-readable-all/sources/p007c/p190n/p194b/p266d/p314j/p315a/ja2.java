package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ja2 implements Iterator<Map.Entry> {

    /* JADX INFO: renamed from: f */
    public int f15540f = -1;

    /* JADX INFO: renamed from: g */
    public boolean f15541g;

    /* JADX INFO: renamed from: h */
    public Iterator<Map.Entry> f15542h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ la2 f15543i;

    /* JADX INFO: renamed from: a */
    public final Iterator<Map.Entry> m7322a() {
        if (this.f15542h == null) {
            this.f15542h = this.f15543i.f16305i.entrySet().iterator();
        }
        return this.f15542h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15540f + 1 >= this.f15543i.f16304h.size()) {
            return !this.f15543i.f16305i.isEmpty() && m7322a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry next() {
        this.f15541g = true;
        int i = this.f15540f + 1;
        this.f15540f = i;
        return i < this.f15543i.f16304h.size() ? this.f15543i.f16304h.get(this.f15540f) : m7322a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15541g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f15541g = false;
        la2 la2Var = this.f15543i;
        int i = la2.f16302f;
        la2Var.m7580g();
        if (this.f15540f >= this.f15543i.f16304h.size()) {
            m7322a().remove();
            return;
        }
        la2 la2Var2 = this.f15543i;
        int i2 = this.f15540f;
        this.f15540f = i2 - 1;
        la2Var2.m7578e(i2);
    }
}
