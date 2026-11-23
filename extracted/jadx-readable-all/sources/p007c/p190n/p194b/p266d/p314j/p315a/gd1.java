package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3751yz;
import p007c.p190n.p194b.p266d.p314j.p315a.m20;
import p007c.p190n.p194b.p266d.p314j.p315a.q50;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gd1<AppOpenAd extends m20, AppOpenRequestComponent extends InterfaceC3751yz<AppOpenAd>, AppOpenRequestComponentBuilder extends q50<AppOpenRequestComponent>> implements x41<AppOpenAd> {

    /* JADX INFO: renamed from: a */
    public final Context f14534a;

    /* JADX INFO: renamed from: b */
    public final Executor f14535b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3264lu f14536c;

    /* JADX INFO: renamed from: d */
    public final ud1 f14537d;

    /* JADX INFO: renamed from: e */
    public final lf1<AppOpenRequestComponent, AppOpenAd> f14538e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f14539f;

    /* JADX INFO: renamed from: g */
    public final hi1 f14540g;

    /* JADX INFO: renamed from: h */
    public kv1<AppOpenAd> f14541h;

    public gd1(Context context, Executor executor, AbstractC3264lu abstractC3264lu, lf1<AppOpenRequestComponent, AppOpenAd> lf1Var, ud1 ud1Var, hi1 hi1Var) {
        this.f14534a = context;
        this.f14535b = executor;
        this.f14536c = abstractC3264lu;
        this.f14538e = lf1Var;
        this.f14537d = ud1Var;
        this.f14540g = hi1Var;
        this.f14539f = new FrameLayout(context);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x41
    /* JADX INFO: renamed from: a */
    public final boolean mo6606a() {
        kv1<AppOpenAd> kv1Var = this.f14541h;
        return (kv1Var == null || kv1Var.isDone()) ? false : true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x41
    /* JADX INFO: renamed from: b */
    public final synchronized boolean mo6607b(ew2 ew2Var, String str, v41 v41Var, w41<? super AppOpenAd> w41Var) throws RemoteException {
        C2622l.m5354d("loadAd must be called on the main UI thread.");
        if (str == null) {
            C2622l.m5408n3("Ad unit ID should not be null for app open ad.");
            this.f14535b.execute(new Runnable(this) { // from class: c.n.b.d.j.a.bd1

                /* JADX INFO: renamed from: f */
                public final gd1 f12572f;

                {
                    this.f12572f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12572f.f14537d.mo6216o0(C2622l.m5285M2(6, null, null));
                }
            });
            return false;
        }
        if (this.f14541h != null) {
            return false;
        }
        cw0.m6239i(this.f14534a, ew2Var.f13718k);
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14400m5)).booleanValue() && ew2Var.f13718k) {
            this.f14536c.mo7644z().m6073b(true);
        }
        hi1 hi1Var = this.f14540g;
        hi1Var.f14857c = str;
        hi1Var.f14856b = new jw2("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
        hi1Var.f14855a = ew2Var;
        ii1 ii1VarM7136a = hi1Var.m7136a();
        fd1 fd1Var = new fd1(null);
        fd1Var.f14017a = ii1VarM7136a;
        kv1<AppOpenAd> kv1VarMo5768a = this.f14538e.mo5768a(new mf1(fd1Var, null), new kf1(this) { // from class: c.n.b.d.j.a.cd1

            /* JADX INFO: renamed from: a */
            public final gd1 f12983a;

            {
                this.f12983a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.kf1
            /* JADX INFO: renamed from: a */
            public final q50 mo5787a(jf1 jf1Var) {
                return this.f12983a.m6992d(jf1Var);
            }
        });
        this.f14541h = kv1VarMo5768a;
        ed1 ed1Var = new ed1(this, w41Var, fd1Var);
        kv1VarMo5768a.mo6230f(new ev1(kv1VarMo5768a, ed1Var), this.f14535b);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract AppOpenRequestComponentBuilder mo6991c(k00 k00Var, t50 t50Var, ja0 ja0Var);

    /* JADX INFO: renamed from: d */
    public final synchronized AppOpenRequestComponentBuilder m6992d(jf1 jf1Var) {
        fd1 fd1Var = (fd1) jf1Var;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14231M4)).booleanValue()) {
            k00 k00Var = new k00(this.f14539f);
            s50 s50Var = new s50();
            s50Var.f19467a = this.f14534a;
            s50Var.f19468b = fd1Var.f14017a;
            return (AppOpenRequestComponentBuilder) mo6991c(k00Var, new t50(s50Var), new ja0(new ia0()));
        }
        ud1 ud1Var = this.f14537d;
        ud1 ud1Var2 = new ud1(ud1Var.f20282f);
        ud1Var2.f20289m = ud1Var;
        ia0 ia0Var = new ia0();
        ia0Var.f15122h.add(new bc0<>(ud1Var2, this.f14535b));
        ia0Var.f15120f.add(new bc0<>(ud1Var2, this.f14535b));
        ia0Var.f15127m.add(new bc0<>(ud1Var2, this.f14535b));
        ia0Var.f15126l.add(new bc0<>(ud1Var2, this.f14535b));
        ia0Var.f15128n = ud1Var2;
        k00 k00Var2 = new k00(this.f14539f);
        s50 s50Var2 = new s50();
        s50Var2.f19467a = this.f14534a;
        s50Var2.f19468b = fd1Var.f14017a;
        return (AppOpenRequestComponentBuilder) mo6991c(k00Var2, new t50(s50Var2), new ja0(ia0Var));
    }
}
