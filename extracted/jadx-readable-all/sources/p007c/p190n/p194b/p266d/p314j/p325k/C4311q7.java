package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Iterator;

/* JADX INFO: renamed from: c.n.b.d.j.k.q7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4311q7 implements Iterator<String> {

    /* JADX INFO: renamed from: f */
    public Iterator<String> f23420f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4283o7 f23421g;

    public C4311q7(C4283o7 c4283o7) {
        this.f23421g = c4283o7;
        this.f23420f = c4283o7.f23385f.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23420f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f23420f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
