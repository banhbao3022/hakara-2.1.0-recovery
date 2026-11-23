package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: c.n.b.d.j.f.e4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3853e4 implements Iterator {

    /* JADX INFO: renamed from: f */
    public int f22569f = 0;

    /* JADX INFO: renamed from: g */
    public final int f22570g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC3823b4 f22571h;

    public C3853e4(AbstractC3823b4 abstractC3823b4) {
        this.f22571h = abstractC3823b4;
        this.f22570g = abstractC3823b4.size();
    }

    /* JADX INFO: renamed from: a */
    public final byte m9015a() {
        int i = this.f22569f;
        if (i >= this.f22570g) {
            throw new NoSuchElementException();
        }
        this.f22569f = i + 1;
        return this.f22571h.mo8949j(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22569f < this.f22570g;
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(m9015a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
