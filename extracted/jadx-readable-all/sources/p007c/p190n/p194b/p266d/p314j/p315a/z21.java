package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class z21 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<String, InterfaceC3249lf> f22161a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public final mm0 f22162b;

    public z21(mm0 mm0Var) {
        this.f22162b = mm0Var;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3249lf m8844a(String str) {
        if (this.f22161a.containsKey(str)) {
            return this.f22161a.get(str);
        }
        return null;
    }
}
