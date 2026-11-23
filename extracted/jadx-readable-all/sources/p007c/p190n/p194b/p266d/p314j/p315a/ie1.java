package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ie1 implements x41<n00> {

    /* JADX INFO: renamed from: a */
    public final Context f15164a;

    /* JADX INFO: renamed from: b */
    public final Executor f15165b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3264lu f15166c;

    /* JADX INFO: renamed from: d */
    public final h41 f15167d;

    /* JADX INFO: renamed from: e */
    public final l41 f15168e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f15169f;

    /* JADX INFO: renamed from: g */
    public InterfaceC3719y3 f15170g;

    /* JADX INFO: renamed from: h */
    public final u80 f15171h;

    /* JADX INFO: renamed from: i */
    public final hi1 f15172i;

    /* JADX INFO: renamed from: j */
    public kv1<n00> f15173j;

    public ie1(Context context, Executor executor, jw2 jw2Var, AbstractC3264lu abstractC3264lu, h41 h41Var, l41 l41Var, hi1 hi1Var) {
        this.f15164a = context;
        this.f15165b = executor;
        this.f15166c = abstractC3264lu;
        this.f15167d = h41Var;
        this.f15168e = l41Var;
        this.f15172i = hi1Var;
        this.f15171h = abstractC3264lu.mo7627i();
        this.f15169f = new FrameLayout(context);
        hi1Var.f14856b = jw2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x41
    /* JADX INFO: renamed from: a */
    public final boolean mo6606a() {
        kv1<n00> kv1Var = this.f15173j;
        return (kv1Var == null || kv1Var.isDone()) ? false : true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x41
    /* JADX INFO: renamed from: b */
    public final boolean mo6607b(ew2 ew2Var, String str, v41 v41Var, w41<? super n00> w41Var) throws RemoteException {
        k10 k10VarM8759e;
        if (str == null) {
            C2622l.m5408n3("Ad unit ID should not be null for banner ad.");
            this.f15165b.execute(new Runnable(this) { // from class: c.n.b.d.j.a.ee1

                /* JADX INFO: renamed from: f */
                public final ie1 f13571f;

                {
                    this.f13571f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f13571f.f15167d.mo6216o0(C2622l.m5285M2(6, null, null));
                }
            });
            return false;
        }
        if (mo6606a()) {
            return false;
        }
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14400m5;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && ew2Var.f13718k) {
            this.f15166c.mo7644z().m6073b(true);
        }
        hi1 hi1Var = this.f15172i;
        hi1Var.f14857c = str;
        hi1Var.f14855a = ew2Var;
        ii1 ii1VarM7136a = hi1Var.m7136a();
        if (C3534t4.f19761b.m6603d().booleanValue() && this.f15172i.f14856b.f15845p) {
            h41 h41Var = this.f15167d;
            if (h41Var != null) {
                h41Var.mo6216o0(C2622l.m5285M2(7, null, null));
            }
            return false;
        }
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14225L4)).booleanValue()) {
            C3710xv c3710xvMo7630l = this.f15166c.mo7630l();
            s50 s50Var = new s50();
            s50Var.f19467a = this.f15164a;
            s50Var.f19468b = ii1VarM7136a;
            c3710xvMo7630l.f21691b = new t50(s50Var);
            ia0 ia0Var = new ia0();
            ia0Var.m7226g(this.f15167d, this.f15165b);
            ia0Var.m7223d(this.f15167d, this.f15165b);
            c3710xvMo7630l.f21690a = new ja0(ia0Var);
            c3710xvMo7630l.f21692c = new q21(this.f15170g);
            c3710xvMo7630l.f21695f = new me0(mg0.f16747a, null);
            c3710xvMo7630l.f21693d = new g20(this.f15171h);
            c3710xvMo7630l.f21694e = new k00(this.f15169f);
            k10VarM8759e = c3710xvMo7630l.mo7309d();
        } else {
            C3710xv c3710xvMo7630l2 = this.f15166c.mo7630l();
            s50 s50Var2 = new s50();
            s50Var2.f19467a = this.f15164a;
            s50Var2.f19468b = ii1VarM7136a;
            c3710xvMo7630l2.f21691b = new t50(s50Var2);
            ia0 ia0Var2 = new ia0();
            ia0Var2.m7226g(this.f15167d, this.f15165b);
            ia0Var2.m7224e(this.f15167d, this.f15165b);
            ia0Var2.m7224e(this.f15168e, this.f15165b);
            ia0Var2.f15119e.add(new bc0<>(this.f15167d, this.f15165b));
            ia0Var2.m7220a(this.f15167d, this.f15165b);
            ia0Var2.m7221b(this.f15167d, this.f15165b);
            ia0Var2.m7222c(this.f15167d, this.f15165b);
            ia0Var2.m7223d(this.f15167d, this.f15165b);
            ia0Var2.m7225f(this.f15167d, this.f15165b);
            c3710xvMo7630l2.f21690a = new ja0(ia0Var2);
            c3710xvMo7630l2.f21692c = new q21(this.f15170g);
            c3710xvMo7630l2.f21695f = new me0(mg0.f16747a, null);
            c3710xvMo7630l2.f21693d = new g20(this.f15171h);
            c3710xvMo7630l2.f21694e = new k00(this.f15169f);
            k10VarM8759e = c3710xvMo7630l2.mo7309d();
        }
        q30<n00> q30VarMo5864b = k10VarM8759e.mo5864b();
        kv1<n00> kv1VarM8190c = q30VarMo5864b.m8190c(q30VarMo5864b.m8189b());
        this.f15173j = kv1VarM8190c;
        he1 he1Var = new he1(this, w41Var, k10VarM8759e);
        Executor executor = this.f15165b;
        ((fl1) kv1VarM8190c).f14054h.mo6230f(new ev1(kv1VarM8190c, he1Var), executor);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7245c() {
        Object parent = this.f15169f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return C2267h1.m4758q(view, powerManager, keyguardManager);
    }
}
