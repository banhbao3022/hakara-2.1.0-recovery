package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class et1<K> extends xs1<K> {

    /* JADX INFO: renamed from: i */
    public final transient vs1<K, ?> f13689i;

    /* JADX INFO: renamed from: j */
    public final transient ts1<K> f13690j;

    public et1(vs1<K, ?> vs1Var, ts1<K> ts1Var) {
        this.f13689i = vs1Var;
        this.f13690j = ts1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: c */
    public final kt1<K> iterator() {
        return this.f13690j.listIterator(0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        return this.f13689i.get(obj) != null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xs1, p007c.p190n.p194b.p266d.p314j.p315a.qs1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return this.f13690j.listIterator(0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xs1, p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: m */
    public final ts1<K> mo6685m() {
        return this.f13690j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: s */
    public final int mo6095s(Object[] objArr, int i) {
        return this.f13690j.mo6095s(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((gt1) this.f13689i).f14679l;
    }
}
