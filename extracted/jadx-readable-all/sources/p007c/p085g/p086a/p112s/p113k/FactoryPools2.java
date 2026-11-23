package p007c.p085g.p086a.p112s.p113k;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: c.g.a.s.k.b, reason: use source file name */
/* JADX INFO: compiled from: FactoryPools.java */
/* JADX INFO: loaded from: classes.dex */
public class FactoryPools2<T> implements FactoryPools.b<List<T>> {
    @Override // p007c.p085g.p086a.p112s.p113k.FactoryPools.b
    public Object create() {
        return new ArrayList();
    }
}
