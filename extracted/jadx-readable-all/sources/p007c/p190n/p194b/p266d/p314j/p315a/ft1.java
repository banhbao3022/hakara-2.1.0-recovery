package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ft1 extends ts1<Object> {

    /* JADX INFO: renamed from: h */
    public final transient Object[] f14113h;

    /* JADX INFO: renamed from: i */
    public final transient int f14114i;

    /* JADX INFO: renamed from: j */
    public final transient int f14115j;

    public ft1(Object[] objArr, int i, int i2) {
        this.f14113h = objArr;
        this.f14114i = i;
        this.f14115j = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C2622l.m5250F2(i, this.f14115j, "index");
        return this.f14113h[i + i + this.f14114i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: q */
    public final boolean mo6094q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14115j;
    }
}
