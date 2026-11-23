package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.k.r5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4323r5<K> implements Iterator<Map.Entry<K, Object>> {

    /* JADX INFO: renamed from: f */
    public Iterator<Map.Entry<K, Object>> f23430f;

    public C4323r5(Iterator<Map.Entry<K, Object>> it) {
        this.f23430f = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23430f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f23430f.next();
        return next.getValue() instanceof C4253m5 ? new C4281o5(next, null) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f23430f.remove();
    }
}
