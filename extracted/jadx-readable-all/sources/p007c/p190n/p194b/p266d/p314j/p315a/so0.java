package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class so0 implements zl1 {

    /* JADX INFO: renamed from: g */
    public final lo0 f19631g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2782b f19632h;

    /* JADX INFO: renamed from: f */
    public final Map<rl1, Long> f19630f = new HashMap();

    /* JADX INFO: renamed from: i */
    public final Map<rl1, ro0> f19633i = new HashMap();

    public so0(lo0 lo0Var, Set<ro0> set, InterfaceC2782b interfaceC2782b) {
        this.f19631g = lo0Var;
        for (ro0 ro0Var : set) {
            this.f19633i.put(ro0Var.f18980b, ro0Var);
        }
        this.f19632h = interfaceC2782b;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: A */
    public final void mo7032A(rl1 rl1Var, String str, Throwable th) {
        if (this.f19630f.containsKey(rl1Var)) {
            long jMo5621a = this.f19632h.mo5621a() - this.f19630f.get(rl1Var).longValue();
            ConcurrentHashMap<String, String> concurrentHashMap = this.f19631g.f16429a;
            String strValueOf = String.valueOf(str);
            String strConcat = strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task.");
            String strValueOf2 = String.valueOf(Long.toString(jMo5621a));
            concurrentHashMap.put(strConcat, strValueOf2.length() != 0 ? "f.".concat(strValueOf2) : new String("f."));
        }
        if (this.f19633i.containsKey(rl1Var)) {
            m8358a(rl1Var, false);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: F */
    public final void mo7033F(rl1 rl1Var, String str) {
        if (this.f19630f.containsKey(rl1Var)) {
            long jMo5621a = this.f19632h.mo5621a() - this.f19630f.get(rl1Var).longValue();
            ConcurrentHashMap<String, String> concurrentHashMap = this.f19631g.f16429a;
            String strValueOf = String.valueOf(str);
            String strConcat = strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task.");
            String strValueOf2 = String.valueOf(Long.toString(jMo5621a));
            concurrentHashMap.put(strConcat, strValueOf2.length() != 0 ? "s.".concat(strValueOf2) : new String("s."));
        }
        if (this.f19633i.containsKey(rl1Var)) {
            m8358a(rl1Var, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8358a(rl1 rl1Var, boolean z) {
        rl1 rl1Var2 = this.f19633i.get(rl1Var).f18979a;
        String str = true != z ? "f." : "s.";
        if (this.f19630f.containsKey(rl1Var2)) {
            long jMo5621a = this.f19632h.mo5621a() - this.f19630f.get(rl1Var2).longValue();
            ConcurrentHashMap<String, String> concurrentHashMap = this.f19631g.f16429a;
            Objects.requireNonNull(this.f19633i.get(rl1Var));
            String strConcat = "label.".concat("ttc");
            String strValueOf = String.valueOf(Long.toString(jMo5621a));
            concurrentHashMap.put(strConcat, strValueOf.length() != 0 ? str.concat(strValueOf) : new String(str));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: n */
    public final void mo7034n(rl1 rl1Var, String str) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: p */
    public final void mo7035p(rl1 rl1Var, String str) {
        this.f19630f.put(rl1Var, Long.valueOf(this.f19632h.mo5621a()));
    }
}
