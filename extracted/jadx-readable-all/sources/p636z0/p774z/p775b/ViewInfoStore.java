package p636z0.p774z.p775b;

import androidx.recyclerview.widget.RecyclerView;
import p636z0.p691g.LongSparseArray;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.p738k.Pools2;
import p636z0.p725k.p738k.Pools3;

/* JADX INFO: renamed from: z0.z.b.h0, reason: use source file name */
/* JADX INFO: compiled from: ViewInfoStore.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewInfoStore {

    /* JADX INFO: renamed from: a */
    public final SimpleArrayMap<RecyclerView.AbstractC0149b0, a> f39218a = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: b */
    public final LongSparseArray<RecyclerView.AbstractC0149b0> f39219b = new LongSparseArray<>();

    /* JADX INFO: renamed from: z0.z.b.h0$a */
    /* JADX INFO: compiled from: ViewInfoStore.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static Pools2<a> f39220a = new Pools3(20);

        /* JADX INFO: renamed from: b */
        public int f39221b;

        /* JADX INFO: renamed from: c */
        public RecyclerView.AbstractC0157j.c f39222c;

        /* JADX INFO: renamed from: d */
        public RecyclerView.AbstractC0157j.c f39223d;

        /* JADX INFO: renamed from: a */
        public static a m17037a() {
            a aVarMo2057a = f39220a.mo2057a();
            return aVarMo2057a == null ? new a() : aVarMo2057a;
        }

        /* JADX INFO: renamed from: b */
        public static void m17038b(a aVar) {
            aVar.f39221b = 0;
            aVar.f39222c = null;
            aVar.f39223d = null;
            f39220a.mo2058b(aVar);
        }
    }

    /* JADX INFO: renamed from: z0.z.b.h0$b */
    /* JADX INFO: compiled from: ViewInfoStore.java */
    public interface b {
    }

    /* JADX INFO: renamed from: a */
    public void m17030a(RecyclerView.AbstractC0149b0 abstractC0149b0) {
        a orDefault = this.f39218a.getOrDefault(abstractC0149b0, null);
        if (orDefault == null) {
            orDefault = a.m17037a();
            this.f39218a.put(abstractC0149b0, orDefault);
        }
        orDefault.f39221b |= 1;
    }

    /* JADX INFO: renamed from: b */
    public void m17031b(RecyclerView.AbstractC0149b0 abstractC0149b0, RecyclerView.AbstractC0157j.c cVar) {
        a orDefault = this.f39218a.getOrDefault(abstractC0149b0, null);
        if (orDefault == null) {
            orDefault = a.m17037a();
            this.f39218a.put(abstractC0149b0, orDefault);
        }
        orDefault.f39223d = cVar;
        orDefault.f39221b |= 8;
    }

    /* JADX INFO: renamed from: c */
    public void m17032c(RecyclerView.AbstractC0149b0 abstractC0149b0, RecyclerView.AbstractC0157j.c cVar) {
        a orDefault = this.f39218a.getOrDefault(abstractC0149b0, null);
        if (orDefault == null) {
            orDefault = a.m17037a();
            this.f39218a.put(abstractC0149b0, orDefault);
        }
        orDefault.f39222c = cVar;
        orDefault.f39221b |= 4;
    }

    /* JADX INFO: renamed from: d */
    public boolean m17033d(RecyclerView.AbstractC0149b0 abstractC0149b0) {
        a orDefault = this.f39218a.getOrDefault(abstractC0149b0, null);
        return (orDefault == null || (orDefault.f39221b & 1) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final RecyclerView.AbstractC0157j.c m17034e(RecyclerView.AbstractC0149b0 abstractC0149b0, int i) {
        a aVarM15612l;
        RecyclerView.AbstractC0157j.c cVar;
        int iM15608e = this.f39218a.m15608e(abstractC0149b0);
        if (iM15608e >= 0 && (aVarM15612l = this.f39218a.m15612l(iM15608e)) != null) {
            int i2 = aVarM15612l.f39221b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                aVarM15612l.f39221b = i3;
                if (i == 4) {
                    cVar = aVarM15612l.f39222c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarM15612l.f39223d;
                }
                if ((i3 & 12) == 0) {
                    this.f39218a.mo2036j(iM15608e);
                    a.m17038b(aVarM15612l);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m17035f(RecyclerView.AbstractC0149b0 abstractC0149b0) {
        a orDefault = this.f39218a.getOrDefault(abstractC0149b0, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f39221b &= -2;
    }

    /* JADX INFO: renamed from: g */
    public void m17036g(RecyclerView.AbstractC0149b0 abstractC0149b0) {
        for (int iM15595o = this.f39219b.m15595o() - 1; iM15595o >= 0; iM15595o--) {
            if (abstractC0149b0 == this.f39219b.m15596p(iM15595o)) {
                LongSparseArray<RecyclerView.AbstractC0149b0> longSparseArray = this.f39219b;
                Object[] objArr = longSparseArray.f36637i;
                Object obj = objArr[iM15595o];
                Object obj2 = LongSparseArray.f36634f;
                if (obj == obj2) {
                    break;
                }
                objArr[iM15595o] = obj2;
                longSparseArray.f36635g = true;
                break;
            }
        }
        a aVarRemove = this.f39218a.remove(abstractC0149b0);
        if (aVarRemove != null) {
            a.m17038b(aVarRemove);
        }
    }
}
