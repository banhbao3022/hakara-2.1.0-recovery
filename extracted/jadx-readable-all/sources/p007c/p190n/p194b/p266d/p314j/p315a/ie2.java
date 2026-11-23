package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;
import java.util.Map;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ie2 implements jr1 {

    /* JADX INFO: renamed from: a */
    public final pp1 f15174a;

    /* JADX INFO: renamed from: b */
    public final cq1 f15175b;

    /* JADX INFO: renamed from: c */
    public final ve2 f15176c;

    /* JADX INFO: renamed from: d */
    public final he2 f15177d;

    public ie2(pp1 pp1Var, cq1 cq1Var, ve2 ve2Var, he2 he2Var) {
        this.f15174a = pp1Var;
        this.f15175b = cq1Var;
        this.f15176c = ve2Var;
        this.f15177d = he2Var;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m7246a() {
        Map<String, Object> mapM7247b = m7247b();
        cq1 cq1Var = this.f15175b;
        AbstractC4781i<f31> abstractC4781i = cq1Var.f13088g;
        f31 f31VarZza = cq1Var.f13086e.zza();
        if (abstractC4781i.mo10941n()) {
            f31VarZza = abstractC4781i.mo10937j();
        }
        HashMap map = (HashMap) mapM7247b;
        map.put("gai", Boolean.valueOf(this.f15174a.mo8145b()));
        map.put("did", f31VarZza.m6765l0());
        map.put("dst", Integer.valueOf(f31VarZza.m6766m0().f13703o));
        map.put("doo", Boolean.valueOf(f31VarZza.m6767n0()));
        return mapM7247b;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, Object> m7247b() {
        HashMap map = new HashMap();
        cq1 cq1Var = this.f15175b;
        AbstractC4781i<f31> abstractC4781i = cq1Var.f13089h;
        f31 f31VarZza = cq1Var.f13087f.zza();
        if (abstractC4781i.mo10941n()) {
            f31VarZza = abstractC4781i.mo10937j();
        }
        map.put("v", this.f15174a.mo8144a());
        map.put("gms", Boolean.valueOf(this.f15174a.mo8146c()));
        map.put("int", f31VarZza.m6764k0());
        map.put("up", Boolean.valueOf(this.f15177d.f14830a));
        map.put("t", new Throwable());
        return map;
    }
}
