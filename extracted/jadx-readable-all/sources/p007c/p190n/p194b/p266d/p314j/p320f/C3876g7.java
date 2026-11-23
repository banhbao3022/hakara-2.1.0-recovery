package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: c.n.b.d.j.f.g7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3876g7<K, V> implements Iterator<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: f */
    public int f22684f = -1;

    /* JADX INFO: renamed from: g */
    public boolean f22685g;

    /* JADX INFO: renamed from: h */
    public Iterator<Map.Entry<K, V>> f22686h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3816a7 f22687i;

    public C3876g7(C3816a7 c3816a7, C3836c7 c3836c7) {
        this.f22687i = c3816a7;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator<Map.Entry<K, V>> m9029a() {
        if (this.f22686h == null) {
            this.f22686h = this.f22687i.f22511i.entrySet().iterator();
        }
        return this.f22686h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22684f + 1 < this.f22687i.f22510h.size() || (!this.f22687i.f22511i.isEmpty() && m9029a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f22685g = true;
        int i = this.f22684f + 1;
        this.f22684f = i;
        return i < this.f22687i.f22510h.size() ? this.f22687i.f22510h.get(this.f22684f) : m9029a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f22685g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f22685g = false;
        C3816a7 c3816a7 = this.f22687i;
        int i = C3816a7.f22508f;
        c3816a7.m8939h();
        if (this.f22684f >= this.f22687i.f22510h.size()) {
            m9029a().remove();
            return;
        }
        C3816a7 c3816a8 = this.f22687i;
        int i2 = this.f22684f;
        this.f22684f = i2 - 1;
        c3816a8.m8935d(i2);
    }
}
