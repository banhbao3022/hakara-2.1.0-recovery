package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.LinkedList;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;
import p007c.p190n.p194b.p266d.p314j.p315a.m20;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jk1<AdT extends m20> {

    /* JADX INFO: renamed from: a */
    public final jj1 f15606a;

    /* JADX INFO: renamed from: b */
    public ik1 f15607b;

    /* JADX INFO: renamed from: c */
    public sv1<vj1<AdT>> f15608c;

    /* JADX INFO: renamed from: d */
    public kv1<vj1<AdT>> f15609d;

    /* JADX INFO: renamed from: e */
    public final nj1 f15610e;

    /* JADX INFO: renamed from: f */
    public final hk1<AdT> f15611f;

    /* JADX INFO: renamed from: i */
    public int f15614i = 1;

    /* JADX INFO: renamed from: h */
    public final dv1<vj1<AdT>> f15613h = new fk1(this);

    /* JADX INFO: renamed from: g */
    public final LinkedList<ik1> f15612g = new LinkedList<>();

    public jk1(nj1 nj1Var, jj1 jj1Var, hk1<AdT> hk1Var) {
        this.f15610e = nj1Var;
        this.f15606a = jj1Var;
        this.f15611f = hk1Var;
        jj1Var.f15603a = new ek1(this);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final void m7356a(ik1 ik1Var) {
        synchronized (this.f15612g) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14266S3)).booleanValue() && !((C2311z0) C2330u.f10884a.f10893h.m6649f()).mo4818p().f12222j) {
                this.f15612g.clear();
                return;
            }
            kv1<vj1<AdT>> kv1Var = this.f15609d;
            boolean z = true;
            if (!(kv1Var == null || kv1Var.isDone())) {
                if (ik1Var != null) {
                    this.f15612g.add(ik1Var);
                }
                return;
            }
            if (ik1Var == null && this.f15612g.isEmpty()) {
                return;
            }
            if (ik1Var == null) {
                ik1Var = this.f15612g.pollFirst();
            }
            if (ik1Var.mo7273a() != null) {
                nj1 nj1Var = this.f15610e;
                wj1 wj1VarMo7273a = ik1Var.mo7273a();
                oj1 oj1Var = (oj1) nj1Var;
                synchronized (oj1Var) {
                    mj1 mj1Var = oj1Var.f17659a.get(wj1VarMo7273a);
                    if (mj1Var != null && mj1Var.m7716b() >= oj1Var.f17660b.f19585k) {
                        z = false;
                    }
                }
                if (z) {
                    this.f15607b = ik1Var.mo7274b();
                    this.f15608c = new sv1<>();
                    hk1<AdT> hk1Var = this.f15611f;
                    re1 re1Var = (re1) this.f15607b;
                    kv1<vj1<AdT>> kv1VarMo5768a = ((qe1) hk1Var).f18262a.mo5768a(re1Var.f18755b, re1Var.f18754a);
                    this.f15609d = kv1VarMo5768a;
                    cw0.m6253w(kv1VarMo5768a, this.f15613h, ik1Var.zza());
                    return;
                }
            }
            m7356a(null);
        }
    }
}
