package p007c.p190n.p378c.p380b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p378c.p379a.Supplier;

/* JADX INFO: renamed from: c.n.c.b.g0, reason: use source file name */
/* JADX INFO: compiled from: MultimapBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class MultimapBuilder<V> implements Supplier<List<V>>, Serializable {

    /* JADX INFO: renamed from: f */
    public final int f26188f;

    public MultimapBuilder(int i) {
        C4799a.m11000m(i, "expectedValuesPerKey");
        this.f26188f = i;
    }

    @Override // p007c.p190n.p378c.p379a.Supplier
    public Object get() {
        return new ArrayList(this.f26188f);
    }
}
