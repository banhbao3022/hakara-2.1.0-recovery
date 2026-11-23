package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ht1<E> extends xs1<E> {

    /* JADX INFO: renamed from: i */
    public static final ht1<Object> f15008i = new ht1<>(new Object[0], 0, null, 0, 0);

    /* JADX INFO: renamed from: j */
    public final transient Object[] f15009j;

    /* JADX INFO: renamed from: k */
    public final transient Object[] f15010k;

    /* JADX INFO: renamed from: l */
    public final transient int f15011l;

    /* JADX INFO: renamed from: m */
    public final transient int f15012m;

    /* JADX INFO: renamed from: n */
    public final transient int f15013n;

    public ht1(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f15009j = objArr;
        this.f15010k = objArr2;
        this.f15011l = i2;
        this.f15012m = i;
        this.f15013n = i3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: c */
    public final kt1<E> iterator() {
        return mo6685m().listIterator(0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f15010k;
        if (obj == null || objArr == null) {
            return false;
        }
        int iM5466z1 = C2622l.m5466z1(obj.hashCode());
        while (true) {
            int i = iM5466z1 & this.f15011l;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iM5466z1 = i + 1;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: f */
    public final Object[] mo6091f() {
        return this.f15009j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: h */
    public final int mo6092h() {
        return 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xs1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15012m;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xs1, p007c.p190n.p194b.p266d.p314j.p315a.qs1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return mo6685m().listIterator(0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: j */
    public final int mo6093j() {
        return this.f15013n;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: s */
    public final int mo6095s(Object[] objArr, int i) {
        System.arraycopy(this.f15009j, 0, objArr, i, this.f15013n);
        return i + this.f15013n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15013n;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xs1
    /* JADX INFO: renamed from: x */
    public final ts1<E> mo6519x() {
        return ts1.m8450v(this.f15009j, this.f15013n);
    }
}
