package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.Iterator;

/* JADX INFO: renamed from: c.n.b.d.k.b.n */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4601n implements Iterator<String> {

    /* JADX INFO: renamed from: f */
    public Iterator<String> f24170f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4613o f24171g;

    public C4601n(C4613o c4613o) {
        this.f24171g = c4613o;
        this.f24170f = c4613o.f24221f.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24170f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f24170f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
