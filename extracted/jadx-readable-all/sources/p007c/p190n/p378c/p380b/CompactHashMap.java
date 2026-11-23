package p007c.p190n.p378c.p380b;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: renamed from: c.n.c.b.i, reason: use source file name */
/* JADX INFO: compiled from: CompactHashMap.java */
/* JADX INFO: loaded from: classes.dex */
public class CompactHashMap<K> extends CompactHashMap4<K, V>.b<K> {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ CompactHashMap4 f26192j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompactHashMap(CompactHashMap4 compactHashMap4) {
        super(null);
        this.f26192j = compactHashMap4;
    }

    @Override // p007c.p190n.p378c.p380b.CompactHashMap4.b
    /* JADX INFO: renamed from: a */
    public K mo11606a(int i) {
        return (K) this.f26192j.f26199i[i];
    }
}
