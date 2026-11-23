package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5;
import p007c.p190n.p194b.p266d.p314j.p325k.C4095b1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4109c1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4207j1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4221k1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4313q9;
import p636z0.p691g.ArrayMap;
import p636z0.p691g.MapCollections;
import p636z0.p691g.SimpleArrayMap;

/* JADX INFO: renamed from: c.n.b.d.k.b.ia */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4552ia {

    /* JADX INFO: renamed from: a */
    public String f24010a;

    /* JADX INFO: renamed from: b */
    public boolean f24011b;

    /* JADX INFO: renamed from: c */
    public C4207j1 f24012c;

    /* JADX INFO: renamed from: d */
    public BitSet f24013d;

    /* JADX INFO: renamed from: e */
    public BitSet f24014e;

    /* JADX INFO: renamed from: f */
    public Map<Integer, Long> f24015f;

    /* JADX INFO: renamed from: g */
    public Map<Integer, List<Long>> f24016g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4528ga f24017h;

    public C4552ia(C4528ga c4528ga, String str, C4516fa c4516fa) {
        this.f24017h = c4528ga;
        this.f24010a = str;
        this.f24011b = true;
        this.f24013d = new BitSet();
        this.f24014e = new BitSet();
        this.f24015f = new ArrayMap();
        this.f24016g = new ArrayMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX INFO: renamed from: a */
    public final C4095b1 m10603a(int i) {
        ArrayList arrayList;
        ?? arrayList2;
        C4095b1.a aVarM9390D = C4095b1.m9390D();
        if (aVarM9390D.f23087h) {
            aVarM9390D.m9431r();
            aVarM9390D.f23087h = false;
        }
        C4095b1.m9392s((C4095b1) aVarM9390D.f23086g, i);
        boolean z = this.f24011b;
        if (aVarM9390D.f23087h) {
            aVarM9390D.m9431r();
            aVarM9390D.f23087h = false;
        }
        C4095b1.m9394u((C4095b1) aVarM9390D.f23086g, z);
        C4207j1 c4207j1 = this.f24012c;
        if (c4207j1 != null) {
            if (aVarM9390D.f23087h) {
                aVarM9390D.m9431r();
                aVarM9390D.f23087h = false;
            }
            C4095b1.m9395x((C4095b1) aVarM9390D.f23086g, c4207j1);
        }
        C4207j1.a aVarM9843K = C4207j1.m9843K();
        List<Long> listM10783B = C4679t9.m10783B(this.f24013d);
        if (aVarM9843K.f23087h) {
            aVarM9843K.m9431r();
            aVarM9843K.f23087h = false;
        }
        C4207j1.m9840B((C4207j1) aVarM9843K.f23086g, listM10783B);
        List<Long> listM10783B2 = C4679t9.m10783B(this.f24014e);
        if (aVarM9843K.f23087h) {
            aVarM9843K.m9431r();
            aVarM9843K.f23087h = false;
        }
        C4207j1.m9848w((C4207j1) aVarM9843K.f23086g, listM10783B2);
        if (this.f24015f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f24015f.size());
            Iterator<Integer> it = this.f24015f.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                C4109c1.a aVarM9495y = C4109c1.m9495y();
                if (aVarM9495y.f23087h) {
                    aVarM9495y.m9431r();
                    aVarM9495y.f23087h = false;
                }
                C4109c1.m9493s((C4109c1) aVarM9495y.f23086g, iIntValue);
                long jLongValue = this.f24015f.get(Integer.valueOf(iIntValue)).longValue();
                if (aVarM9495y.f23087h) {
                    aVarM9495y.m9431r();
                    aVarM9495y.f23087h = false;
                }
                C4109c1.m9494t((C4109c1) aVarM9495y.f23086g, jLongValue);
                arrayList.add((C4109c1) ((AbstractC4099b5) aVarM9495y.m9433t()));
            }
        }
        if (aVarM9843K.f23087h) {
            aVarM9843K.m9431r();
            aVarM9843K.f23087h = false;
        }
        C4207j1.m9841D((C4207j1) aVarM9843K.f23086g, arrayList);
        if (this.f24016g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f24016g.size());
            for (Integer num : this.f24016g.keySet()) {
                C4221k1.a aVarM9915z = C4221k1.m9915z();
                int iIntValue2 = num.intValue();
                if (aVarM9915z.f23087h) {
                    aVarM9915z.m9431r();
                    aVarM9915z.f23087h = false;
                }
                C4221k1.m9913t((C4221k1) aVarM9915z.f23086g, iIntValue2);
                List<Long> list = this.f24016g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    if (aVarM9915z.f23087h) {
                        aVarM9915z.m9431r();
                        aVarM9915z.f23087h = false;
                    }
                    C4221k1.m9914u((C4221k1) aVarM9915z.f23086g, list);
                }
                arrayList2.add((C4221k1) ((AbstractC4099b5) aVarM9915z.m9433t()));
            }
        }
        if (aVarM9843K.f23087h) {
            aVarM9843K.m9431r();
            aVarM9843K.f23087h = false;
        }
        C4207j1.m9842F((C4207j1) aVarM9843K.f23086g, arrayList2);
        if (aVarM9390D.f23087h) {
            aVarM9390D.m9431r();
            aVarM9390D.f23087h = false;
        }
        C4095b1.m9393t((C4095b1) aVarM9390D.f23086g, (C4207j1) ((AbstractC4099b5) aVarM9843K.m9433t()));
        return (C4095b1) ((AbstractC4099b5) aVarM9390D.m9433t());
    }

    /* JADX INFO: renamed from: b */
    public final void m10604b(AbstractC4564ja abstractC4564ja) {
        int iMo10617a = abstractC4564ja.mo10617a();
        Boolean bool = abstractC4564ja.f24045c;
        if (bool != null) {
            this.f24014e.set(iMo10617a, bool.booleanValue());
        }
        Boolean bool2 = abstractC4564ja.f24046d;
        if (bool2 != null) {
            this.f24013d.set(iMo10617a, bool2.booleanValue());
        }
        if (abstractC4564ja.f24047e != null) {
            Long l = this.f24015f.get(Integer.valueOf(iMo10617a));
            long jLongValue = abstractC4564ja.f24047e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.f24015f.put(Integer.valueOf(iMo10617a), Long.valueOf(jLongValue));
            }
        }
        if (abstractC4564ja.f24048f != null) {
            List<Long> arrayList = this.f24016g.get(Integer.valueOf(iMo10617a));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f24016g.put(Integer.valueOf(iMo10617a), arrayList);
            }
            if (abstractC4564ja.mo10618g()) {
                arrayList.clear();
            }
            if (C4313q9.m10173a() && this.f24017h.f24476a.f24534h.m10423u(this.f24010a, C4647r.f24342c0) && abstractC4564ja.mo10619h()) {
                arrayList.clear();
            }
            if (!C4313q9.m10173a() || !this.f24017h.f24476a.f24534h.m10423u(this.f24010a, C4647r.f24342c0)) {
                arrayList.add(Long.valueOf(abstractC4564ja.f24048f.longValue() / 1000));
                return;
            }
            long jLongValue2 = abstractC4564ja.f24048f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4552ia(C4528ga c4528ga, String str, C4207j1 c4207j1, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C4516fa c4516fa) {
        this.f24017h = c4528ga;
        this.f24010a = str;
        this.f24013d = bitSet;
        this.f24014e = bitSet2;
        this.f24015f = map;
        this.f24016g = new ArrayMap();
        for (Integer num : (MapCollections.c) ((ArrayMap) map2).keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) ((SimpleArrayMap) map2).get(num));
            this.f24016g.put(num, arrayList);
        }
        this.f24011b = false;
        this.f24012c = c4207j1;
    }
}
