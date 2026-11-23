package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class he1 implements dv1<n00> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w41 f14827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k10 f14828b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie1 f14829c;

    public he1(ie1 ie1Var, w41 w41Var, k10 k10Var) {
        this.f14829c = ie1Var;
        this.f14827a = w41Var;
        this.f14828b = k10Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        final yv2 yv2VarM5274K1 = C2622l.m5274K1(th, this.f14828b.mo5864b().f18187l);
        synchronized (this.f14829c) {
            this.f14829c.f15173j = null;
            this.f14828b.mo5863a().m7108A0(new j60(yv2VarM5274K1));
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14225L4)).booleanValue()) {
                this.f14829c.f15165b.execute(new Runnable(this, yv2VarM5274K1) { // from class: c.n.b.d.j.a.ge1

                    /* JADX INFO: renamed from: f */
                    public final he1 f14545f;

                    /* JADX INFO: renamed from: g */
                    public final yv2 f14546g;

                    {
                        this.f14545f = this;
                        this.f14546g = yv2VarM5274K1;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        he1 he1Var = this.f14545f;
                        he1Var.f14829c.f15167d.mo6216o0(this.f14546g);
                    }
                });
            }
            this.f14829c.f15171h.m8475B0(60);
            cw0.m6233c(yv2VarM5274K1.f22116f, th, "BannerAdLoader.onFailure");
            this.f14827a.zza();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(n00 n00Var) {
        n00 n00Var2 = n00Var;
        synchronized (this.f14829c) {
            ie1 ie1Var = this.f14829c;
            ie1Var.f15173j = null;
            ie1Var.f15169f.removeAllViews();
            if (n00Var2.mo7743c() != null) {
                ViewParent parent = n00Var2.mo7743c().getParent();
                if (parent instanceof ViewGroup) {
                    a60 a60Var = n00Var2.f16669f;
                    String str = a60Var != null ? a60Var.f12023f : "";
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(str);
                    sb.append(" already has a parent view. Removing its old parent.");
                    C2622l.m5226A3(sb.toString());
                    ((ViewGroup) parent).removeView(n00Var2.mo7743c());
                }
            }
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14225L4;
            C2862b c2862b = C2862b.f12493a;
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                e90 e90Var = n00Var2.f16670g.f14516f;
                ie1 ie1Var2 = this.f14829c;
                h41 h41Var = ie1Var2.f15167d;
                g90 g90Var = e90Var.f13530a;
                g90Var.f14517g = h41Var;
                g90Var.f14518h = ie1Var2.f15168e;
            }
            this.f14829c.f15169f.addView(n00Var2.mo7743c());
            this.f14827a.mo5986b(n00Var2);
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                ie1 ie1Var3 = this.f14829c;
                Executor executor = ie1Var3.f15165b;
                final h41 h41Var2 = ie1Var3.f15167d;
                h41Var2.getClass();
                executor.execute(new Runnable(h41Var2) { // from class: c.n.b.d.j.a.fe1

                    /* JADX INFO: renamed from: f */
                    public final h41 f14028f;

                    {
                        this.f14028f = h41Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14028f.mo5730a0();
                    }
                });
            }
            this.f14829c.f15171h.m8475B0(n00Var2.mo7748h());
        }
    }
}
