package p636z0.p667e.p676b.p677v1;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.e.b.v1.z0, reason: use source file name */
/* JADX INFO: compiled from: MutableOptionsBundle.java */
/* JADX INFO: loaded from: classes.dex */
public final class MutableOptionsBundle extends OptionsBundle implements MutableConfig {
    public MutableOptionsBundle(TreeMap<Config3.a<?>, Map<Config3.c, Object>> treeMap) {
        super(treeMap);
    }

    /* JADX INFO: renamed from: y */
    public static MutableOptionsBundle m15434y() {
        return new MutableOptionsBundle(new TreeMap(C7829i.f36176f));
    }

    /* JADX INFO: renamed from: z */
    public static MutableOptionsBundle m15435z(Config3 config3) {
        TreeMap treeMap = new TreeMap(C7829i.f36176f);
        for (Config3.a<?> aVar : config3.mo15104c()) {
            Set<Config3.c> setMo15113p = config3.mo15113p(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (Config3.c cVar : setMo15113p) {
                arrayMap.put(cVar, config3.mo15111l(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new MutableOptionsBundle(treeMap);
    }

    /* JADX INFO: renamed from: A */
    public <ValueT> void m15436A(Config3.a<ValueT> aVar, Config3.c cVar, ValueT valuet) {
        Config3.c cVar2;
        Map<Config3.c, Object> map = this.f36111s.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f36111s.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        Config3.c cVar3 = (Config3.c) Collections.min(map.keySet());
        if (!map.get(cVar3).equals(valuet)) {
            Config3.c cVar4 = Config3.c.ALWAYS_OVERRIDE;
            boolean z = true;
            if ((cVar3 != cVar4 || cVar != cVar4) && (cVar3 != (cVar2 = Config3.c.REQUIRED) || cVar != cVar2)) {
                z = false;
            }
            if (z) {
                StringBuilder sbM1556G = outline.m1556G("Option values conflicts: ");
                sbM1556G.append(aVar.mo15383a());
                sbM1556G.append(", existing value (");
                sbM1556G.append(cVar3);
                sbM1556G.append(")=");
                sbM1556G.append(map.get(cVar3));
                sbM1556G.append(", conflicting (");
                sbM1556G.append(cVar);
                sbM1556G.append(")=");
                sbM1556G.append(valuet);
                throw new IllegalArgumentException(sbM1556G.toString());
            }
        }
        map.put(cVar, valuet);
    }
}
