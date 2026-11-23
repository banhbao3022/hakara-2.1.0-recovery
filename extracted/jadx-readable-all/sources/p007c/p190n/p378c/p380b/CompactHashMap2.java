package p007c.p190n.p378c.p380b;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: c.n.c.b.j, reason: use source file name */
/* JADX INFO: compiled from: CompactHashMap.java */
/* JADX INFO: loaded from: classes.dex */
public class CompactHashMap2<K, V> extends CompactHashMap4<K, V>.b<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ CompactHashMap4 f26193j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompactHashMap2(CompactHashMap4 compactHashMap4) {
        super(null);
        this.f26193j = compactHashMap4;
    }

    @Override // p007c.p190n.p378c.p380b.CompactHashMap4.b
    /* JADX INFO: renamed from: a */
    public Object mo11606a(int i) {
        return new CompactHashMap4.d(i);
    }
}
