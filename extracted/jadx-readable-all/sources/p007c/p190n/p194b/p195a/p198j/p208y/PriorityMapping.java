package p007c.p190n.p194b.p195a.p198j.p208y;

import android.util.SparseArray;
import java.util.EnumMap;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p195a.Priority2;

/* JADX INFO: renamed from: c.n.b.a.j.y.a, reason: use source file name */
/* JADX INFO: compiled from: PriorityMapping.java */
/* JADX INFO: loaded from: classes.dex */
public final class PriorityMapping {

    /* JADX INFO: renamed from: a */
    public static SparseArray<Priority2> f5924a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public static EnumMap<Priority2, Integer> f5925b;

    static {
        EnumMap<Priority2, Integer> enumMap = new EnumMap<>(Priority2.class);
        f5925b = enumMap;
        enumMap.put(Priority2.DEFAULT, 0);
        f5925b.put(Priority2.VERY_LOW, 1);
        f5925b.put(Priority2.HIGHEST, 2);
        for (K k : f5925b.keySet()) {
            f5924a.append(f5925b.get(k).intValue(), k);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m2879a(Priority2 priority2) {
        Integer num = f5925b.get(priority2);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority2);
    }

    /* JADX INFO: renamed from: b */
    public static Priority2 m2880b(int i) {
        Priority2 priority2 = f5924a.get(i);
        if (priority2 != null) {
            return priority2;
        }
        throw new IllegalArgumentException(outline.m1590l("Unknown Priority for value ", i));
    }
}
