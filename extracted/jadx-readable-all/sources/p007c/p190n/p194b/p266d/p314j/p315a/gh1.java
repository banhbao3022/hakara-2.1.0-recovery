package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gh1 implements x41<dl0> {

    /* JADX INFO: renamed from: a */
    public final Context f14580a;

    /* JADX INFO: renamed from: b */
    public final Executor f14581b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3264lu f14582c;

    /* JADX INFO: renamed from: d */
    public final wg1 f14583d;

    /* JADX INFO: renamed from: e */
    public final lf1<hl0, dl0> f14584e;

    /* JADX INFO: renamed from: f */
    public final ei1 f14585f;

    /* JADX INFO: renamed from: g */
    public final hi1 f14586g;

    /* JADX INFO: renamed from: h */
    public kv1<dl0> f14587h;

    public gh1(Context context, Executor executor, AbstractC3264lu abstractC3264lu, lf1<hl0, dl0> lf1Var, wg1 wg1Var, hi1 hi1Var, ei1 ei1Var) {
        this.f14580a = context;
        this.f14581b = executor;
        this.f14582c = abstractC3264lu;
        this.f14584e = lf1Var;
        this.f14583d = wg1Var;
        this.f14586g = hi1Var;
        this.f14585f = ei1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x41
    /* JADX INFO: renamed from: a */
    public final boolean mo6606a() {
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x41
    /* JADX INFO: renamed from: b */
    public final boolean mo6607b(ew2 ew2Var, String str, v41 v41Var, w41<? super dl0> w41Var) throws RemoteException {
        C3253lj c3253lj = new C3253lj(ew2Var, str);
        if (c3253lj.f16371g == null) {
            C2622l.m5408n3("Ad unit ID should not be null for rewarded video ad.");
            this.f14581b.execute(new Runnable(this) { // from class: c.n.b.d.j.a.zg1

                /* JADX INFO: renamed from: f */
                public final gh1 f22272f;

                {
                    this.f22272f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f22272f.f14583d.mo6216o0(C2622l.m5285M2(6, null, null));
                }
            });
        } else {
            kv1<dl0> kv1Var = this.f14587h;
            if (kv1Var == null || kv1Var.isDone()) {
                cw0.m6239i(this.f14580a, c3253lj.f16370f.f13718k);
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14400m5)).booleanValue() && c3253lj.f16370f.f13718k) {
                    this.f14582c.mo7644z().m6073b(true);
                }
                hi1 hi1Var = this.f14586g;
                hi1Var.f14857c = c3253lj.f16371g;
                hi1Var.f14856b = new jw2("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
                hi1Var.f14855a = c3253lj.f16370f;
                ii1 ii1VarM7136a = hi1Var.m7136a();
                fh1 fh1Var = new fh1(null);
                fh1Var.f14039a = ii1VarM7136a;
                kv1<dl0> kv1VarMo5768a = this.f14584e.mo5768a(new mf1(fh1Var, null), new kf1(this) { // from class: c.n.b.d.j.a.ah1

                    /* JADX INFO: renamed from: a */
                    public final gh1 f12130a;

                    {
                        this.f12130a = this;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kf1
                    /* JADX INFO: renamed from: a */
                    public final q50 mo5787a(jf1 jf1Var) {
                        return this.f12130a.m7004c(jf1Var);
                    }
                });
                this.f14587h = kv1VarMo5768a;
                dh1 dh1Var = new dh1(this, w41Var, fh1Var);
                kv1VarMo5768a.mo6230f(new ev1(kv1VarMo5768a, dh1Var), this.f14581b);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final C3414pw m7004c(jf1 jf1Var) {
        C3414pw c3414pwMo7638t = this.f14582c.mo7638t();
        s50 s50Var = new s50();
        s50Var.f19467a = this.f14580a;
        s50Var.f19468b = ((fh1) jf1Var).f14039a;
        s50Var.f19470d = this.f14585f;
        c3414pwMo7638t.f18105b = new t50(s50Var);
        c3414pwMo7638t.f18104a = new ja0(new ia0());
        return c3414pwMo7638t;
    }
}
