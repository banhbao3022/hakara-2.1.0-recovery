package p007c.p085g.p086a.p089m.p092t.p093c0;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.m.t.c0.m, reason: use source file name */
/* JADX INFO: compiled from: SizeConfigStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public class SizeConfigStrategy implements LruPoolStrategy {

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config[] f3130a;

    /* JADX INFO: renamed from: b */
    public static final Bitmap.Config[] f3131b;

    /* JADX INFO: renamed from: c */
    public static final Bitmap.Config[] f3132c;

    /* JADX INFO: renamed from: d */
    public static final Bitmap.Config[] f3133d;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f3134e;

    /* JADX INFO: renamed from: f */
    public final c f3135f = new c();

    /* JADX INFO: renamed from: g */
    public final GroupedLinkedMap<b, Bitmap> f3136g = new GroupedLinkedMap<>();

    /* JADX INFO: renamed from: h */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f3137h = new HashMap();

    /* JADX INFO: renamed from: c.g.a.m.t.c0.m$a */
    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3138a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f3138a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3138a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3138a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3138a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.c0.m$b */
    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    public static final class b implements Poolable {

        /* JADX INFO: renamed from: a */
        public final c f3139a;

        /* JADX INFO: renamed from: b */
        public int f3140b;

        /* JADX INFO: renamed from: c */
        public Bitmap.Config f3141c;

        public b(c cVar) {
            this.f3139a = cVar;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.p093c0.Poolable
        /* JADX INFO: renamed from: a */
        public void mo1763a() {
            this.f3139a.m1748c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3140b == bVar.f3140b && Util4.m2047b(this.f3141c, bVar.f3141c);
        }

        public int hashCode() {
            int i = this.f3140b * 31;
            Bitmap.Config config = this.f3141c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return SizeConfigStrategy.m1769c(this.f3140b, this.f3141c);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.c0.m$c */
    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    public static class c extends BaseKeyPool<b> {
        @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BaseKeyPool
        /* JADX INFO: renamed from: a */
        public Poolable mo1746a() {
            return new b(this);
        }

        /* JADX INFO: renamed from: d */
        public b m1775d(int i, Bitmap.Config config) {
            b bVarM1747b = m1747b();
            bVarM1747b.f3140b = i;
            bVarM1747b.f3141c = config;
            return bVarM1747b;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f3130a = configArr;
        f3131b = configArr;
        f3132c = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f3133d = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f3134e = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: c */
    public static String m1769c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* JADX INFO: renamed from: a */
    public final void m1770a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapM1772d = m1772d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM1772d.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM1772d.remove(num);
                return;
            } else {
                navigableMapM1772d.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m1773e(bitmap) + ", this: " + this);
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m1771b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM2048c = Util4.m2048c(i, i2, config);
        b bVarM1747b = this.f3135f.m1747b();
        bVarM1747b.f3140b = iM2048c;
        bVarM1747b.f3141c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i3 = a.f3138a[config.ordinal()];
            if (i3 == 1) {
                configArr = f3130a;
            } else if (i3 == 2) {
                configArr = f3132c;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : f3134e;
            } else {
                configArr = f3133d;
            }
        } else {
            configArr = f3131b;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer numCeilingKey = m1772d(config2).ceilingKey(Integer.valueOf(iM2048c));
            if (numCeilingKey != null && numCeilingKey.intValue() <= iM2048c * 8) {
                if (numCeilingKey.intValue() == iM2048c && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f3135f.m1748c(bVarM1747b);
                bVarM1747b = this.f3135f.m1775d(numCeilingKey.intValue(), config2);
                break;
            }
        }
        Bitmap bitmapM1754a = this.f3136g.m1754a(bVarM1747b);
        if (bitmapM1754a != null) {
            m1770a(Integer.valueOf(bVarM1747b.f3140b), bitmapM1754a);
            bitmapM1754a.reconfigure(i, i2, config);
        }
        return bitmapM1754a;
    }

    /* JADX INFO: renamed from: d */
    public final NavigableMap<Integer, Integer> m1772d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f3137h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f3137h.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: e */
    public String m1773e(Bitmap bitmap) {
        return m1769c(Util4.m2049d(bitmap), bitmap.getConfig());
    }

    /* JADX INFO: renamed from: f */
    public void m1774f(Bitmap bitmap) {
        b bVarM1775d = this.f3135f.m1775d(Util4.m2049d(bitmap), bitmap.getConfig());
        this.f3136g.m1755b(bVarM1775d, bitmap);
        NavigableMap<Integer, Integer> navigableMapM1772d = m1772d(bitmap.getConfig());
        Integer num = (Integer) navigableMapM1772d.get(Integer.valueOf(bVarM1775d.f3140b));
        navigableMapM1772d.put(Integer.valueOf(bVarM1775d.f3140b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("SizeConfigStrategy{groupedMap=");
        sbM1556G.append(this.f3136g);
        sbM1556G.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f3137h.entrySet()) {
            sbM1556G.append(entry.getKey());
            sbM1556G.append('[');
            sbM1556G.append(entry.getValue());
            sbM1556G.append("], ");
        }
        if (!this.f3137h.isEmpty()) {
            sbM1556G.replace(sbM1556G.length() - 2, sbM1556G.length(), "");
        }
        sbM1556G.append(")}");
        return sbM1556G.toString();
    }
}
