package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class m82<F, T> extends AbstractList<T> {

    /* JADX INFO: renamed from: f */
    public final List<F> f16699f;

    public m82(List<F> list, l82<F, T> l82Var) {
        this.f16699f = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        T t = (T) vs2.m8592f(((Integer) this.f16699f.get(i)).intValue());
        return t == null ? (T) vs2.AD_FORMAT_TYPE_UNSPECIFIED : t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16699f.size();
    }
}
