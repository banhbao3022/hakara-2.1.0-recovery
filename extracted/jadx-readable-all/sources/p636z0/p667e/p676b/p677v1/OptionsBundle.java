package p636z0.p667e.p676b.p677v1;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p636z0.p667e.p668a.p675f.C7736g;
import p636z0.p667e.p668a.p675f.CaptureRequestOptions;

/* JADX INFO: renamed from: z0.e.b.v1.b1, reason: use source file name */
/* JADX INFO: compiled from: OptionsBundle.java */
/* JADX INFO: loaded from: classes.dex */
public class OptionsBundle implements Config3 {

    /* JADX INFO: renamed from: r */
    public static final OptionsBundle f36110r = new OptionsBundle(new TreeMap(C7829i.f36176f));

    /* JADX INFO: renamed from: s */
    public final TreeMap<Config3.a<?>, Map<Config3.c, Object>> f36111s;

    public OptionsBundle(TreeMap<Config3.a<?>, Map<Config3.c, Object>> treeMap) {
        this.f36111s = treeMap;
    }

    /* JADX INFO: renamed from: x */
    public static OptionsBundle m15339x(Config3 config3) {
        if (OptionsBundle.class.equals(config3.getClass())) {
            return (OptionsBundle) config3;
        }
        TreeMap treeMap = new TreeMap(C7829i.f36176f);
        OptionsBundle optionsBundle = (OptionsBundle) config3;
        for (Config3.a<?> aVar : optionsBundle.mo15104c()) {
            Set<Config3.c> setMo15113p = optionsBundle.mo15113p(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (Config3.c cVar : setMo15113p) {
                arrayMap.put(cVar, optionsBundle.mo15111l(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new OptionsBundle(treeMap);
    }

    @Override // p636z0.p667e.p676b.p677v1.Config3
    /* JADX INFO: renamed from: a */
    public <ValueT> ValueT mo15102a(Config3.a<ValueT> aVar) {
        Map<Config3.c, Object> map = this.f36111s.get(aVar);
        if (map != null) {
            return (ValueT) map.get((Config3.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // p636z0.p667e.p676b.p677v1.Config3
    /* JADX INFO: renamed from: b */
    public boolean mo15103b(Config3.a<?> aVar) {
        return this.f36111s.containsKey(aVar);
    }

    @Override // p636z0.p667e.p676b.p677v1.Config3
    /* JADX INFO: renamed from: c */
    public Set<Config3.a<?>> mo15104c() {
        return Collections.unmodifiableSet(this.f36111s.keySet());
    }

    @Override // p636z0.p667e.p676b.p677v1.Config3
    /* JADX INFO: renamed from: d */
    public <ValueT> ValueT mo15105d(Config3.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) mo15102a(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // p636z0.p667e.p676b.p677v1.Config3
    /* JADX INFO: renamed from: e */
    public Config3.c mo15106e(Config3.a<?> aVar) {
        Map<Config3.c, Object> map = this.f36111s.get(aVar);
        if (map != null) {
            return (Config3.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // p636z0.p667e.p676b.p677v1.Config3
    /* JADX INFO: renamed from: k */
    public void mo15110k(String str, Config3.b bVar) {
        for (Map.Entry<Config3.a<?>, Map<Config3.c, Object>> entry : this.f36111s.tailMap(new AutoValue_Config_Option(str, Void.class, null)).entrySet()) {
            if (!entry.getKey().mo15383a().startsWith(str)) {
                return;
            }
            Config3.a<?> key = entry.getKey();
            C7736g c7736g = (C7736g) bVar;
            CaptureRequestOptions.a aVar = c7736g.f35842a;
            Config3 config3 = c7736g.f35843b;
            aVar.f35853a.m15436A(key, config3.mo15106e(key), config3.mo15102a(key));
        }
    }

    @Override // p636z0.p667e.p676b.p677v1.Config3
    /* JADX INFO: renamed from: l */
    public <ValueT> ValueT mo15111l(Config3.a<ValueT> aVar, Config3.c cVar) {
        Map<Config3.c, Object> map = this.f36111s.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // p636z0.p667e.p676b.p677v1.Config3
    /* JADX INFO: renamed from: p */
    public Set<Config3.c> mo15113p(Config3.a<?> aVar) {
        Map<Config3.c, Object> map = this.f36111s.get(aVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }
}
