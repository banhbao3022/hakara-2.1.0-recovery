package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bd2<K, V> extends wc2<K, V, V> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f12573b = 0;

    static {
        ad2.m5731b(Collections.emptyMap());
    }

    public /* synthetic */ bd2(Map map) {
        super(map);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map<K, V> mo4613a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2622l.m5245E2(this.f21034a.size()));
        for (Map.Entry<K, gd2<V>> entry : this.f21034a.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().mo4613a());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
