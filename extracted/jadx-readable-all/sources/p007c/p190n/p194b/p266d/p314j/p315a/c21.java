package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.q70;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class c21<AdT, AdapterT, ListenerT extends q70> implements bx0<AdT> {

    /* JADX INFO: renamed from: a */
    public final dx0<AdapterT, ListenerT> f12923a;

    /* JADX INFO: renamed from: b */
    public final kx0<AdT, AdapterT, ListenerT> f12924b;

    /* JADX INFO: renamed from: c */
    public final yl1 f12925c;

    /* JADX INFO: renamed from: d */
    public final lv1 f12926d;

    public c21(yl1 yl1Var, lv1 lv1Var, dx0<AdapterT, ListenerT> dx0Var, kx0<AdT, AdapterT, ListenerT> kx0Var) {
        this.f12925c = yl1Var;
        this.f12926d = lv1Var;
        this.f12924b = kx0Var;
        this.f12923a = dx0Var;
    }

    /* JADX INFO: renamed from: c */
    public static final String m6142c(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: a */
    public final kv1<AdT> mo6115a(final di1 di1Var, final rh1 rh1Var) {
        final ex0<AdapterT, ListenerT> ex0VarMo6274a;
        Iterator<String> it = rh1Var.f18828s.iterator();
        while (true) {
            if (!it.hasNext()) {
                ex0VarMo6274a = null;
                break;
            }
            try {
                ex0VarMo6274a = this.f12923a.mo6274a(it.next(), rh1Var.f18830u);
                break;
            } catch (mi1 unused) {
            }
        }
        if (ex0VarMo6274a == null) {
            return new gv1(new d01("Unable to instantiate mediation adapter class."));
        }
        C3147io c3147io = new C3147io();
        ex0VarMo6274a.f13745c.mo8192i4(new b21(this, ex0VarMo6274a, c3147io));
        if (rh1Var.f18784H) {
            Bundle bundle = di1Var.f13280a.f22289a.f15191d.f13725r;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        yl1 yl1Var = this.f12925c;
        ol1 ol1VarM5280L2 = C2622l.m5280L2(new el1(this, di1Var, rh1Var, ex0VarMo6274a) { // from class: c.n.b.d.j.a.z11

            /* JADX INFO: renamed from: a */
            public final c21 f22152a;

            /* JADX INFO: renamed from: b */
            public final di1 f22153b;

            /* JADX INFO: renamed from: c */
            public final rh1 f22154c;

            /* JADX INFO: renamed from: d */
            public final ex0 f22155d;

            {
                this.f22152a = this;
                this.f22153b = di1Var;
                this.f22154c = rh1Var;
                this.f22155d = ex0VarMo6274a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.el1
            public final void zza() throws mi1 {
                c21 c21Var = this.f22152a;
                c21Var.f12924b.mo5898b(this.f22153b, this.f22154c, (ex0<AdapterT, ListenerT>) this.f22155d);
            }
        }, this.f12926d, rl1.ADAPTER_LOAD_AD_SYN, yl1Var);
        ol1 ol1VarM8039c = ol1VarM5280L2.f17674f.m8125a(rl1.ADAPTER_LOAD_AD_ACK, ol1VarM5280L2.m8042f()).m8039c(c3147io);
        ol1 ol1VarM8125a = ol1VarM8039c.f17674f.m8125a(rl1.ADAPTER_WRAP_ADAPTER, ol1VarM8039c.m8042f());
        return ol1VarM8125a.m8038b(new jl1(new dl1(this, di1Var, rh1Var, ex0VarMo6274a) { // from class: c.n.b.d.j.a.a21

            /* JADX INFO: renamed from: a */
            public final c21 f12000a;

            /* JADX INFO: renamed from: b */
            public final di1 f12001b;

            /* JADX INFO: renamed from: c */
            public final rh1 f12002c;

            /* JADX INFO: renamed from: d */
            public final ex0 f12003d;

            {
                this.f12000a = this;
                this.f12001b = di1Var;
                this.f12002c = rh1Var;
                this.f12003d = ex0VarMo6274a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.dl1
            /* JADX INFO: renamed from: a */
            public final Object mo5679a(Object obj) {
                c21 c21Var = this.f12000a;
                return c21Var.f12924b.mo5897a(this.f12001b, this.f12002c, (ex0<AdapterT, ListenerT>) this.f12003d);
            }
        }), ol1VarM8125a.f17674f.f18025b).m8042f();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: b */
    public final boolean mo6116b(di1 di1Var, rh1 rh1Var) {
        return !rh1Var.f18828s.isEmpty();
    }
}
