package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ol1<O> {

    /* JADX INFO: renamed from: a */
    public final Object f17669a;

    /* JADX INFO: renamed from: b */
    public final String f17670b;

    /* JADX INFO: renamed from: c */
    public final kv1<?> f17671c;

    /* JADX INFO: renamed from: d */
    public final List<kv1<?>> f17672d;

    /* JADX INFO: renamed from: e */
    public final kv1<O> f17673e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ pl1 f17674f;

    public /* synthetic */ ol1(pl1 pl1Var, Object obj, kv1 kv1Var, List list, kv1 kv1Var2) {
        this(pl1Var, obj, null, kv1Var, list, kv1Var2);
    }

    public ol1(pl1 pl1Var, pl1 pl1Var2, String str, kv1 kv1Var, List<kv1> list, kv1<O> kv1Var2) {
        this.f17674f = pl1Var;
        this.f17669a = pl1Var2;
        this.f17670b = str;
        this.f17671c = kv1Var;
        this.f17672d = list;
        this.f17673e = kv1Var2;
    }

    /* JADX INFO: renamed from: a */
    public final <O2> ol1<O2> m8037a(qu1<O, O2> qu1Var) {
        return m8038b(qu1Var, this.f17674f.f18025b);
    }

    /* JADX INFO: renamed from: b */
    public final <O2> ol1<O2> m8038b(qu1<O, O2> qu1Var, Executor executor) {
        return new ol1<>(this.f17674f, this.f17669a, this.f17670b, this.f17671c, this.f17672d, cw0.m6249s(this.f17673e, qu1Var, executor));
    }

    /* JADX INFO: renamed from: c */
    public final <O2> ol1<O2> m8039c(final kv1<O2> kv1Var) {
        return m8038b(new qu1(kv1Var) { // from class: c.n.b.d.j.a.kl1

            /* JADX INFO: renamed from: a */
            public final kv1 f15978a;

            {
                this.f15978a = kv1Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                return this.f15978a;
            }
        }, C2962do.f13335f);
    }

    /* JADX INFO: renamed from: d */
    public final <T extends Throwable> ol1<O> m8040d(Class<T> cls, qu1<T, O> qu1Var) {
        pl1 pl1Var = this.f17674f;
        return new ol1<>(pl1Var, this.f17669a, this.f17670b, this.f17671c, this.f17672d, cw0.m6247q(this.f17673e, cls, qu1Var, pl1Var.f18025b));
    }

    /* JADX INFO: renamed from: e */
    public final ol1<O> m8041e(long j2, TimeUnit timeUnit) {
        pl1 pl1Var = this.f17674f;
        return new ol1<>(pl1Var, this.f17669a, this.f17670b, this.f17671c, this.f17672d, cw0.m6248r(this.f17673e, j2, timeUnit, pl1Var.f18026c));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: f */
    public final fl1 m8042f() {
        Object obj = this.f17669a;
        String strMo8127c = this.f17670b;
        if (strMo8127c == null) {
            strMo8127c = this.f17674f.mo8127c(obj);
        }
        final fl1 fl1Var = new fl1(obj, strMo8127c, this.f17673e);
        this.f17674f.f18027d.mo8215G((fl1<E, ?>) fl1Var);
        kv1<?> kv1Var = this.f17671c;
        Runnable runnable = new Runnable(this, fl1Var) { // from class: c.n.b.d.j.a.ml1

            /* JADX INFO: renamed from: f */
            public final ol1 f16792f;

            /* JADX INFO: renamed from: g */
            public final fl1 f16793g;

            {
                this.f16792f = this;
                this.f16793g = fl1Var;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.lang.Runnable
            public final void run() {
                this.f16792f.f17674f.f18027d.mo8217j((fl1<E, ?>) this.f16793g);
            }
        };
        lv1 lv1Var = C2962do.f13335f;
        kv1Var.mo6230f(runnable, lv1Var);
        fl1Var.mo6230f(new ev1(fl1Var, new nl1(this, fl1Var)), lv1Var);
        return fl1Var;
    }
}
