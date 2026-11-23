package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class u01<AdT> implements qu1<di1, AdT> {

    /* JADX INFO: renamed from: a */
    public final yl1 f20188a;

    /* JADX INFO: renamed from: b */
    public final k60 f20189b;

    /* JADX INFO: renamed from: c */
    public final ym1 f20190c;

    /* JADX INFO: renamed from: d */
    public final bn1 f20191d;

    /* JADX INFO: renamed from: e */
    public final Executor f20192e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f20193f;

    /* JADX INFO: renamed from: g */
    public final p20<AdT> f20194g;

    /* JADX INFO: renamed from: h */
    public final p01 f20195h;

    /* JADX INFO: renamed from: i */
    public final hx0 f20196i;

    public u01(yl1 yl1Var, p01 p01Var, k60 k60Var, ym1 ym1Var, bn1 bn1Var, p20<AdT> p20Var, Executor executor, ScheduledExecutorService scheduledExecutorService, hx0 hx0Var) {
        this.f20188a = yl1Var;
        this.f20195h = p01Var;
        this.f20189b = k60Var;
        this.f20190c = ym1Var;
        this.f20191d = bn1Var;
        this.f20194g = p20Var;
        this.f20192e = executor;
        this.f20193f = scheduledExecutorService;
        this.f20196i = hx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
    /* JADX INFO: renamed from: a */
    public final kv1 mo4612a(di1 di1Var) throws Exception {
        String strM1585g;
        int i;
        final di1 di1Var2 = di1Var;
        int i2 = di1Var2.f13281b.f12695b.f20321e;
        if (i2 == 0) {
            strM1585g = "No ad config.";
        } else if (i2 < 200 || i2 >= 300) {
            strM1585g = (i2 < 300 || i2 >= 400) ? outline.m1585g(46, "Received error HTTP response code: ", i2) : "No location header to follow redirect or too many redirects.";
        } else if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14363h3)).booleanValue()) {
            strM1585g = "No ad config.";
        } else {
            strM1585g = "No fill.";
        }
        th1 th1Var = di1Var2.f13281b.f12695b.f20324h;
        if (th1Var != null) {
            strM1585g = th1Var.f19832a;
        }
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14273T4;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && (i = di1Var2.f13281b.f12695b.f20321e) != 0 && (i < 200 || i >= 300)) {
            return new gv1(new s01(3, strM1585g));
        }
        fl1 fl1VarM8042f = C2622l.m5435t0(new gv1(new s01(3, strM1585g)), rl1.RENDER_CONFIG_INIT, this.f20188a).m8042f();
        this.f20189b.m7109u0(new C3231ky(di1Var2, this.f20191d, this.f20190c), this.f20192e);
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14279U4)).booleanValue()) {
            for (rh1 rh1Var : di1Var2.f13281b.f12694a) {
                hx0 hx0Var = this.f20196i;
                Objects.requireNonNull(hx0Var);
                String str = rh1Var.f18831v;
                if (!hx0Var.f15045b.containsKey(str)) {
                    Bundle bundle = new Bundle();
                    Iterator<String> itKeys = rh1Var.f18830u.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        try {
                            bundle.putString(next, rh1Var.f18830u.getString(next));
                        } catch (JSONException unused) {
                        }
                    }
                    ow2 ow2Var = new ow2(rh1Var.f18780D, 0L, null, bundle);
                    hx0Var.f15044a.add(ow2Var);
                    hx0Var.f15045b.put(str, ow2Var);
                }
                Iterator<String> it = rh1Var.f18803a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.f20196i.m7179a(rh1Var, 0L, C2622l.m5285M2(1, null, null));
                        break;
                    }
                    bx0<AdT> bx0VarMo7493a = this.f20194g.mo7493a(rh1Var.f18805b, it.next());
                    if (bx0VarMo7493a != null && bx0VarMo7493a.mo6116b(di1Var2, rh1Var)) {
                        break;
                    }
                }
            }
        }
        int i3 = 0;
        for (final rh1 rh1Var2 : di1Var2.f13281b.f12694a) {
            for (String str2 : rh1Var2.f18803a) {
                final bx0<AdT> bx0VarMo7493a2 = this.f20194g.mo7493a(rh1Var2.f18805b, str2);
                if (bx0VarMo7493a2 != null && bx0VarMo7493a2.mo6116b(di1Var2, rh1Var2)) {
                    ol1<I> ol1VarM8125a = this.f20188a.m8125a(rl1.RENDER_CONFIG_WATERFALL, fl1VarM8042f);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 26);
                    sb.append("render-config-");
                    sb.append(i3);
                    sb.append("-");
                    sb.append(str2);
                    String string = sb.toString();
                    pl1 pl1Var = ol1VarM8125a.f17674f;
                    fl1VarM8042f = new ol1(pl1Var, ol1VarM8125a.f17669a, string, ol1VarM8125a.f17671c, ol1VarM8125a.f17672d, cw0.m6247q(ol1VarM8125a.f17673e, Throwable.class, new qu1(this, di1Var2, rh1Var2, bx0VarMo7493a2) { // from class: c.n.b.d.j.a.t01

                        /* JADX INFO: renamed from: a */
                        public final u01 f19745a;

                        /* JADX INFO: renamed from: b */
                        public final di1 f19746b;

                        /* JADX INFO: renamed from: c */
                        public final rh1 f19747c;

                        /* JADX INFO: renamed from: d */
                        public final bx0 f19748d;

                        {
                            this.f19745a = this;
                            this.f19746b = di1Var2;
                            this.f19747c = rh1Var2;
                            this.f19748d = bx0VarMo7493a2;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                        /* JADX INFO: renamed from: a */
                        public final kv1 mo4612a(Object obj) {
                            u01 u01Var = this.f19745a;
                            di1 di1Var3 = this.f19746b;
                            rh1 rh1Var3 = this.f19747c;
                            bx0 bx0Var = this.f19748d;
                            p01 p01Var = u01Var.f20195h;
                            uh1 uh1Var = di1Var3.f13281b.f12695b;
                            kv1 kv1VarM6248r = cw0.m6248r(bx0Var.mo6115a(di1Var3, rh1Var3), rh1Var3.f18789M, TimeUnit.MILLISECONDS, u01Var.f20193f);
                            long jMo5621a = p01Var.f17805a.mo5621a();
                            String str3 = rh1Var3.f18831v;
                            if (str3 != null) {
                                kv1VarM6248r.mo6230f(new ev1(kv1VarM6248r, new o01(p01Var, jMo5621a, str3, rh1Var3, uh1Var)), C2962do.f13335f);
                            }
                            return kv1VarM6248r;
                        }
                    }, pl1Var.f18025b)).m8042f();
                    break;
                }
            }
            i3++;
        }
        return fl1VarM8042f;
    }
}
