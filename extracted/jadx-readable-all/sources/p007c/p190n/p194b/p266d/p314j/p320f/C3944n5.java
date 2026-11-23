package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.f.n5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3944n5<K> implements Iterator<Map.Entry<K, Object>> {

    /* JADX INFO: renamed from: f */
    public Iterator<Map.Entry<K, Object>> f22822f;

    public C3944n5(Iterator<Map.Entry<K, Object>> it) {
        this.f22822f = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22822f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f22822f.next();
        return next.getValue() instanceof C3934m5 ? new C3954o5(next, null) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f22822f.remove();
    }
}
