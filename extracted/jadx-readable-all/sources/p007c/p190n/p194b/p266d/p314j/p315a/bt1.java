package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bt1<E> extends ts1<E> {

    /* JADX INFO: renamed from: h */
    public static final ts1<Object> f12860h = new bt1(new Object[0], 0);

    /* JADX INFO: renamed from: i */
    public final transient Object[] f12861i;

    /* JADX INFO: renamed from: j */
    public final transient int f12862j;

    public bt1(Object[] objArr, int i) {
        this.f12861i = objArr;
        this.f12862j = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: f */
    public final Object[] mo6091f() {
        return this.f12861i;
    }

    @Override // java.util.List
    public final E get(int i) {
        C2622l.m5250F2(i, this.f12862j, "index");
        return (E) this.f12861i[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: h */
    public final int mo6092h() {
        return 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: j */
    public final int mo6093j() {
        return this.f12862j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: q */
    public final boolean mo6094q() {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ts1, p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: s */
    public final int mo6095s(Object[] objArr, int i) {
        System.arraycopy(this.f12861i, 0, objArr, i, this.f12862j);
        return i + this.f12862j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12862j;
    }
}
