package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sa2 implements Iterator<String> {

    /* JADX INFO: renamed from: f */
    public final Iterator<String> f19515f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ta2 f19516g;

    public sa2(ta2 ta2Var) {
        this.f19516g = ta2Var;
        this.f19515f = ta2Var.f19806f.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19515f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f19515f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
