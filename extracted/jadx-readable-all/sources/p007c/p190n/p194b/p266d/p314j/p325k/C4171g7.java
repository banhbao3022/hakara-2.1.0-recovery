package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: c.n.b.d.j.k.g7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4171g7<K, V> implements Iterator<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: f */
    public int f23172f = -1;

    /* JADX INFO: renamed from: g */
    public boolean f23173g;

    /* JADX INFO: renamed from: h */
    public Iterator<Map.Entry<K, V>> f23174h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C4087a7 f23175i;

    public C4171g7(C4087a7 c4087a7, C4115c7 c4115c7) {
        this.f23175i = c4087a7;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator<Map.Entry<K, V>> m9632a() {
        if (this.f23174h == null) {
            this.f23174h = this.f23175i.f23034i.entrySet().iterator();
        }
        return this.f23174h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23172f + 1 < this.f23175i.f23033h.size() || (!this.f23175i.f23034i.isEmpty() && m9632a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f23173g = true;
        int i = this.f23172f + 1;
        this.f23172f = i;
        return i < this.f23175i.f23033h.size() ? this.f23175i.f23033h.get(this.f23172f) : m9632a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f23173g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f23173g = false;
        C4087a7 c4087a7 = this.f23175i;
        int i = C4087a7.f23031f;
        c4087a7.m9353h();
        if (this.f23172f >= this.f23175i.f23033h.size()) {
            m9632a().remove();
            return;
        }
        C4087a7 c4087a8 = this.f23175i;
        int i2 = this.f23172f;
        this.f23172f = i2 - 1;
        c4087a8.m9351f(i2);
    }
}
