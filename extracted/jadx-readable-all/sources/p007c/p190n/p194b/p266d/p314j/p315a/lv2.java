package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class lv2 {

    /* JADX INFO: renamed from: a */
    public final int f16616a;

    /* JADX INFO: renamed from: b */
    public final byte[] f16617b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f16618c;

    /* JADX INFO: renamed from: d */
    public final List<tr2> f16619d;

    /* JADX INFO: renamed from: e */
    public final boolean f16620e;

    public lv2(int i, byte[] bArr, Map map, List list, boolean z) {
        this.f16616a = i;
        this.f16617b = bArr;
        this.f16618c = map;
        if (list == null) {
            this.f16619d = null;
        } else {
            this.f16619d = Collections.unmodifiableList(list);
        }
        this.f16620e = z;
    }

    /* JADX INFO: renamed from: a */
    public static List<tr2> m7647a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new tr2(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public lv2(int i, byte[] bArr, Map<String, String> map, boolean z, long j2) {
        this(i, bArr, map, m7647a(map), z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
    public lv2(int i, byte[] bArr, boolean z, long j2, List<tr2> list) {
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (tr2 tr2Var : list) {
                treeMap.put(tr2Var.f19974a, tr2Var.f19975b);
            }
        }
        this(i, bArr, (Map) treeMap, list, z);
    }

    @Deprecated
    public lv2(byte[] bArr, Map<String, String> map) {
        this(200, bArr, (Map) map, (List) m7647a(map), false);
    }
}
