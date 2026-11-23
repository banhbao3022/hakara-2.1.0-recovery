package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.f.o5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3954o5<K> implements Map.Entry<K, Object> {

    /* JADX INFO: renamed from: f */
    public Map.Entry<K, C3934m5> f22827f;

    public C3954o5(Map.Entry entry, C3924l5 c3924l5) {
        this.f22827f = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f22827f.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f22827f.getValue() == null) {
            return null;
        }
        int i = C3934m5.f22790c;
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof InterfaceC3895i6)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        C3934m5 value = this.f22827f.getValue();
        InterfaceC3895i6 interfaceC3895i6 = value.f22850a;
        value.f22851b = null;
        value.f22850a = (InterfaceC3895i6) obj;
        return interfaceC3895i6;
    }
}
