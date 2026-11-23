package p007c.p190n.p378c.p380b;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: renamed from: c.n.c.b.k, reason: use source file name */
/* JADX INFO: compiled from: CompactHashMap.java */
/* JADX INFO: loaded from: classes.dex */
public class CompactHashMap3<V> extends CompactHashMap4<K, V>.b<V> {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ CompactHashMap4 f26195j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompactHashMap3(CompactHashMap4 compactHashMap4) {
        super(null);
        this.f26195j = compactHashMap4;
    }

    @Override // p007c.p190n.p378c.p380b.CompactHashMap4.b
    /* JADX INFO: renamed from: a */
    public V mo11606a(int i) {
        return (V) this.f26195j.f26200j[i];
    }
}
