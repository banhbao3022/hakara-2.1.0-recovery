package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.AbstractMap;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ct1 extends ts1<Map.Entry> {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ dt1 f13118h;

    public ct1(dt1 dt1Var) {
        this.f13118h = dt1Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C2622l.m5250F2(i, this.f13118h.f13384k, "index");
        Object[] objArr = this.f13118h.f13383j;
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(objArr[i2], objArr[i2 + 1]);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: q */
    public final boolean mo6094q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13118h.f13384k;
    }
}
