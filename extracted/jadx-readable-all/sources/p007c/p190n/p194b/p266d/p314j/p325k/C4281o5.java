package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.k.o5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4281o5<K> implements Map.Entry<K, Object> {

    /* JADX INFO: renamed from: f */
    public Map.Entry<K, C4253m5> f23384f;

    public C4281o5(Map.Entry entry, C4295p5 c4295p5) {
        this.f23384f = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f23384f.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f23384f.getValue() == null) {
            return null;
        }
        int i = C4253m5.f23316c;
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof InterfaceC4240l6)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        C4253m5 value = this.f23384f.getValue();
        InterfaceC4240l6 interfaceC4240l6 = value.f23418a;
        value.f23419b = null;
        value.f23418a = (InterfaceC4240l6) obj;
        return interfaceC4240l6;
    }
}
