package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Iterator;

/* JADX INFO: renamed from: c.n.b.d.j.f.q7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3976q7 implements Iterator<String> {

    /* JADX INFO: renamed from: f */
    public Iterator<String> f22852f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3956o7 f22853g;

    public C3976q7(C3956o7 c3956o7) {
        this.f22853g = c3956o7;
        this.f22852f = c3956o7.f22832f.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22852f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f22852f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
