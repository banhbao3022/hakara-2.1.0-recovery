package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dd2<T> {

    /* JADX INFO: renamed from: a */
    public final List<gd2<T>> f13245a;

    /* JADX INFO: renamed from: b */
    public final List<gd2<Collection<T>>> f13246b;

    public dd2(int i, int i2) {
        this.f13245a = i == 0 ? Collections.emptyList() : new ArrayList(i);
        this.f13246b = i2 == 0 ? Collections.emptyList() : new ArrayList<>(i2);
    }

    /* JADX INFO: renamed from: a */
    public final ed2<T> m6354a() {
        return new ed2<>(this.f13245a, this.f13246b);
    }
}
