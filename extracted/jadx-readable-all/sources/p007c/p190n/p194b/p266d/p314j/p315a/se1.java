package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p314j.p315a.m20;
import p007c.p190n.p194b.p266d.p314j.p315a.r50;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class se1<R extends r50<AdT>, AdT extends m20> implements lf1<R, AdT> {

    /* JADX INFO: renamed from: a */
    public final lf1<R, AdT> f19535a;

    /* JADX INFO: renamed from: b */
    public final lf1<R, xe1<AdT>> f19536b;

    /* JADX INFO: renamed from: c */
    public final jk1<AdT> f19537c;

    /* JADX INFO: renamed from: d */
    public R f19538d;

    /* JADX INFO: renamed from: e */
    public final Executor f19539e;

    public se1(lf1<R, AdT> lf1Var, lf1<R, xe1<AdT>> lf1Var2, jk1<AdT> jk1Var, Executor executor) {
        this.f19535a = lf1Var;
        this.f19536b = lf1Var2;
        this.f19537c = jk1Var;
        this.f19539e = executor;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lf1
    /* JADX INFO: renamed from: a */
    public final synchronized kv1<AdT> mo5768a(final mf1 mf1Var, final kf1<R> kf1Var) {
        final re1 re1Var;
        ii1 ii1VarZza = kf1Var.mo5787a(mf1Var.f16744b).mo7309d().zza();
        re1Var = new re1(kf1Var, mf1Var, ii1VarZza.f15191d, ii1VarZza.f15193f, this.f19539e, ii1VarZza.f15197j, null);
        return cw0.m6249s(zu1.m8908s(this.f19536b.mo5768a(mf1Var, kf1Var)), new qu1(this, mf1Var, re1Var, kf1Var) { // from class: c.n.b.d.j.a.ne1

            /* JADX INFO: renamed from: a */
            public final se1 f17079a;

            /* JADX INFO: renamed from: b */
            public final mf1 f17080b;

            /* JADX INFO: renamed from: c */
            public final re1 f17081c;

            /* JADX INFO: renamed from: d */
            public final kf1 f17082d;

            {
                this.f17079a = this;
                this.f17080b = mf1Var;
                this.f17081c = re1Var;
                this.f17082d = kf1Var;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [R extends c.n.b.d.j.a.r50<AdT>, c.n.b.d.j.a.r50] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                final se1 se1Var = this.f17079a;
                mf1 mf1Var2 = this.f17080b;
                re1 re1Var2 = this.f17081c;
                final kf1 kf1Var2 = this.f17082d;
                xe1 xe1Var = (xe1) obj;
                Objects.requireNonNull(se1Var);
                if (xe1Var != null) {
                    re1 re1Var3 = new re1(re1Var2.f18754a, re1Var2.f18755b, re1Var2.f18756c, re1Var2.f18757d, re1Var2.f18758e, re1Var2.f18759f, xe1Var.f21494a);
                    kv1 kv1VarM6249s = null;
                    if (xe1Var.f21496c != 0) {
                        se1Var.f19538d = null;
                        jk1<AdT> jk1Var = se1Var.f19537c;
                        synchronized (jk1Var.f15612g) {
                            jk1Var.f15612g.add(re1Var3);
                        }
                        return se1Var.m8350c(xe1Var.f21496c, mf1Var2, kf1Var2);
                    }
                    jk1<AdT> jk1Var2 = se1Var.f19537c;
                    synchronized (jk1Var2) {
                        kv1<vj1<AdT>> kv1Var = jk1Var2.f15609d;
                        if (!(kv1Var == 0 || kv1Var.isDone()) && jk1Var2.f15614i != 2) {
                            if (jk1Var2.f15607b.mo7273a() == null || re1Var3.mo7273a() == null || !jk1Var2.f15607b.mo7273a().equals(re1Var3.mo7273a())) {
                                jk1Var2.f15614i = 3;
                            } else {
                                jk1Var2.f15614i = 2;
                                kv1VarM6249s = cw0.m6249s(jk1Var2.f15608c, new qu1(jk1Var2) { // from class: c.n.b.d.j.a.dk1

                                    /* JADX INFO: renamed from: a */
                                    public final jk1 f13293a;

                                    {
                                        this.f13293a = jk1Var2;
                                    }

                                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                                    /* JADX INFO: renamed from: a */
                                    public final kv1 mo4612a(Object obj2) {
                                        kv1 kv1VarM6231a;
                                        jk1 jk1Var3 = this.f13293a;
                                        vj1 vj1Var = (vj1) obj2;
                                        synchronized (jk1Var3) {
                                            kv1VarM6231a = cw0.m6231a(new gk1(vj1Var, jk1Var3.f15607b));
                                        }
                                        return kv1VarM6231a;
                                    }
                                }, re1Var3.zza());
                            }
                        }
                    }
                    if (kv1VarM6249s != null) {
                        se1Var.f19538d = (R) kf1Var2.mo5787a(mf1Var2.f16744b).mo7309d();
                        return cw0.m6249s(kv1VarM6249s, new qu1(se1Var, kf1Var2) { // from class: c.n.b.d.j.a.pe1

                            /* JADX INFO: renamed from: a */
                            public final se1 f17944a;

                            /* JADX INFO: renamed from: b */
                            public final kf1 f17945b;

                            {
                                this.f17944a = se1Var;
                                this.f17945b = kf1Var2;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                            /* JADX INFO: renamed from: a */
                            public final kv1 mo4612a(Object obj2) throws or0 {
                                ik1 ik1Var;
                                se1 se1Var2 = this.f17944a;
                                kf1 kf1Var3 = this.f17945b;
                                gk1 gk1Var = (gk1) obj2;
                                Objects.requireNonNull(se1Var2);
                                if (gk1Var == null || gk1Var.f14606a == null || (ik1Var = gk1Var.f14607b) == null) {
                                    throw new or0(1, "Empty prefetch");
                                }
                                ls2 ls2VarM8452v = ts2.m8452v();
                                js2 js2VarM7546v = ks2.m7546v();
                                js2VarM7546v.m7388r(ns2.IN_MEMORY);
                                js2VarM7546v.m7389s(qs2.m8224v());
                                ls2VarM8452v.m7612r(js2VarM7546v);
                                gk1Var.f14606a.f20805a.f18181f.m7108A0(new x90(ls2VarM8452v.m6300o()));
                                return se1Var2.m8350c(gk1Var.f14606a, ((re1) ik1Var).f18755b, kf1Var3);
                            }
                        }, se1Var.f19539e);
                    }
                    jk1<AdT> jk1Var3 = se1Var.f19537c;
                    synchronized (jk1Var3.f15612g) {
                        jk1Var3.f15612g.add(re1Var3);
                    }
                    mf1Var2 = new mf1(mf1Var2.f16744b, xe1Var.f21495b);
                }
                kv1 kv1VarMo5768a = se1Var.f19535a.mo5768a(mf1Var2, (kf1<R>) kf1Var2);
                se1Var.f19538d = ((bf1) se1Var.f19535a).mo5769b();
                return kv1VarMo5768a;
            }
        }, this.f19539e);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lf1
    /* JADX INFO: renamed from: b */
    public final Object mo5769b() {
        R r;
        synchronized (this) {
            r = this.f19538d;
        }
        return r;
    }

    /* JADX INFO: renamed from: c */
    public final kv1<AdT> m8350c(vj1<AdT> vj1Var, mf1 mf1Var, kf1<R> kf1Var) {
        final q50<R> q50VarMo5787a = kf1Var.mo5787a(mf1Var.f16744b);
        if (vj1Var.f20807c != null) {
            R rMo7309d = q50VarMo5787a.mo7309d();
            if (rMo7309d.mo8259e() != null) {
                vj1Var.f20807c.f16668e.mo7249m(rMo7309d.mo8259e());
            }
            return cw0.m6231a(vj1Var.f20807c);
        }
        q50VarMo5787a.mo7307b(vj1Var.f20806b);
        kv1<AdT> kv1VarMo5768a = this.f19535a.mo5768a(mf1Var, new kf1(q50VarMo5787a) { // from class: c.n.b.d.j.a.oe1

            /* JADX INFO: renamed from: a */
            public final q50 f17606a;

            {
                this.f17606a = q50VarMo5787a;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.kf1
            /* JADX INFO: renamed from: a */
            public final q50 mo5787a(jf1 jf1Var) {
                return this.f17606a;
            }
        });
        this.f19538d = (R) ((bf1) this.f19535a).mo5769b();
        return kv1VarMo5768a;
    }
}
