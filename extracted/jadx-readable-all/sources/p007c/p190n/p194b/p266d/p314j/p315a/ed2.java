package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ed2<T> implements zc2<Set<T>> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f13561a = 0;

    /* JADX INFO: renamed from: b */
    public final List<gd2<T>> f13562b;

    /* JADX INFO: renamed from: c */
    public final List<gd2<Collection<T>>> f13563c;

    static {
        ad2.m5731b(Collections.emptySet());
    }

    public /* synthetic */ ed2(List list, List list2) {
        this.f13562b = list;
        this.f13563c = list2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set<T> mo4613a() {
        int size = this.f13562b.size();
        ArrayList arrayList = new ArrayList(this.f13563c.size());
        int size2 = this.f13563c.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> collectionMo4613a = this.f13563c.get(i).mo4613a();
            size += collectionMo4613a.size();
            arrayList.add(collectionMo4613a);
        }
        HashSet hashSet = new HashSet(C2622l.m5245E2(size));
        int size3 = this.f13562b.size();
        for (int i2 = 0; i2 < size3; i2++) {
            T tMo4613a = this.f13562b.get(i2).mo4613a();
            Objects.requireNonNull(tMo4613a);
            hashSet.add(tMo4613a);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                Objects.requireNonNull(obj);
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
