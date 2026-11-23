package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ss1 extends ts1 {

    /* JADX INFO: renamed from: h */
    public final transient int f19695h;

    /* JADX INFO: renamed from: i */
    public final transient int f19696i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ts1 f19697j;

    public ss1(ts1 ts1Var, int i, int i2) {
        this.f19697j = ts1Var;
        this.f19695h = i;
        this.f19696i = i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: f */
    public final Object[] mo6091f() {
        return this.f19697j.mo6091f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        C2622l.m5250F2(i, this.f19696i, "index");
        return this.f19697j.get(i + this.f19695h);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: h */
    public final int mo6092h() {
        return this.f19697j.mo6092h() + this.f19695h;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: j */
    public final int mo6093j() {
        return this.f19697j.mo6092h() + this.f19695h + this.f19696i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: q */
    public final boolean mo6094q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19696i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ts1, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final ts1 subList(int i, int i2) {
        C2622l.m5403m3(i, i2, this.f19696i);
        ts1 ts1Var = this.f19697j;
        int i3 = this.f19695h;
        return ts1Var.subList(i + i3, i2 + i3);
    }
}
