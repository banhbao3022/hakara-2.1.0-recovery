package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yo0 {

    /* JADX INFO: renamed from: e */
    public final String f21941e;

    /* JADX INFO: renamed from: f */
    public final uo0 f21942f;

    /* JADX INFO: renamed from: b */
    public final List<Map<String, String>> f21938b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f21939c = false;

    /* JADX INFO: renamed from: d */
    public boolean f21940d = false;

    /* JADX INFO: renamed from: a */
    public final InterfaceC2305w0 f21937a = C2330u.f10884a.f10893h.m6649f();

    public yo0(String str, uo0 uo0Var) {
        this.f21941e = str;
        this.f21942f = uo0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8811a(String str) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14354g1;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            if (!((Boolean) c2862b.f12496d.m6596a(C3052g3.f14351f5)).booleanValue()) {
                Map<String, String> mapM8815e = m8815e();
                HashMap map = (HashMap) mapM8815e;
                map.put("action", "adapter_init_started");
                map.put("ancn", str);
                this.f21938b.add(mapM8815e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8812b(String str) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14354g1;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            if (!((Boolean) c2862b.f12496d.m6596a(C3052g3.f14351f5)).booleanValue()) {
                Map<String, String> mapM8815e = m8815e();
                HashMap map = (HashMap) mapM8815e;
                map.put("action", "adapter_init_finished");
                map.put("ancn", str);
                this.f21938b.add(mapM8815e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m8813c(String str, String str2) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14354g1;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            if (!((Boolean) c2862b.f12496d.m6596a(C3052g3.f14351f5)).booleanValue()) {
                Map<String, String> mapM8815e = m8815e();
                HashMap map = (HashMap) mapM8815e;
                map.put("action", "adapter_init_finished");
                map.put("ancn", str);
                map.put("rqe", str2);
                this.f21938b.add(mapM8815e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m8814d() {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14354g1;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            if (!((Boolean) c2862b.f12496d.m6596a(C3052g3.f14351f5)).booleanValue()) {
                if (this.f21939c) {
                    return;
                }
                Map<String, String> mapM8815e = m8815e();
                ((HashMap) mapM8815e).put("action", "init_started");
                this.f21938b.add(mapM8815e);
                this.f21939c = true;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, String> m8815e() {
        uo0 uo0Var = this.f21942f;
        Objects.requireNonNull(uo0Var);
        HashMap map = new HashMap(uo0Var.f21275a);
        map.put("tms", Long.toString(C2330u.f10884a.f10896k.mo5621a(), 10));
        map.put("tid", this.f21937a.mo4811O() ? "" : this.f21941e);
        return map;
    }
}
