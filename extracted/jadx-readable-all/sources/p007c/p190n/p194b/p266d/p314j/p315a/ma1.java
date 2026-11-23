package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ma1<T> {

    /* JADX INFO: renamed from: a */
    public final Set<ia1<? extends ha1<T>>> f16707a;

    /* JADX INFO: renamed from: b */
    public final Executor f16708b;

    public ma1(Executor executor, Set<ia1<? extends ha1<T>>> set) {
        this.f16708b = executor;
        this.f16707a = set;
    }

    /* JADX INFO: renamed from: a */
    public final kv1<T> m7679a(final T t) {
        final ArrayList arrayList = new ArrayList(this.f16707a.size());
        for (final ia1<? extends ha1<T>> ia1Var : this.f16707a) {
            kv1<S> kv1VarZza = ia1Var.zza();
            if (C3460r4.f18704a.m6603d().booleanValue()) {
                final long jMo5621a = C2330u.f10884a.f10896k.mo5621a();
                kv1VarZza.mo6230f(new Runnable(ia1Var, jMo5621a) { // from class: c.n.b.d.j.a.ka1

                    /* JADX INFO: renamed from: f */
                    public final ia1 f15906f;

                    /* JADX INFO: renamed from: g */
                    public final long f15907g;

                    {
                        this.f15906f = ia1Var;
                        this.f15907g = jMo5621a;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ia1 ia1Var2 = this.f15906f;
                        long j2 = this.f15907g;
                        String canonicalName = ia1Var2.getClass().getCanonicalName();
                        long jMo5621a2 = C2330u.f10884a.f10896k.mo5621a();
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb.append("Signal runtime : ");
                        sb.append(canonicalName);
                        sb.append(" = ");
                        sb.append(jMo5621a2 - j2);
                        C2096e.m4590z(sb.toString());
                    }
                }, C2962do.f13335f);
            }
            arrayList.add(kv1VarZza);
        }
        return cw0.m6252v(arrayList).m6889a(new Callable(arrayList, t) { // from class: c.n.b.d.j.a.la1

            /* JADX INFO: renamed from: a */
            public final List f16300a;

            /* JADX INFO: renamed from: b */
            public final Object f16301b;

            {
                this.f16300a = arrayList;
                this.f16301b = t;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = this.f16300a;
                Object obj = this.f16301b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ha1 ha1Var = (ha1) ((kv1) it.next()).get();
                    if (ha1Var != null) {
                        ha1Var.mo5696d(obj);
                    }
                }
                return obj;
            }
        }, this.f16708b);
    }
}
