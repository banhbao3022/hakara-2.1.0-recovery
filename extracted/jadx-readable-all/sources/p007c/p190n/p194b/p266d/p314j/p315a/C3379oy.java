package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.oy */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3379oy implements i60, u70, a70, uv2, w60 {

    /* JADX INFO: renamed from: f */
    public final Context f17782f;

    /* JADX INFO: renamed from: g */
    public final Executor f17783g;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f17784h;

    /* JADX INFO: renamed from: i */
    public final di1 f17785i;

    /* JADX INFO: renamed from: j */
    public final rh1 f17786j;

    /* JADX INFO: renamed from: k */
    public final ym1 f17787k;

    /* JADX INFO: renamed from: l */
    public final qi1 f17788l;

    /* JADX INFO: renamed from: m */
    public final rd2 f17789m;

    /* JADX INFO: renamed from: n */
    public final C2867b4 f17790n;

    /* JADX INFO: renamed from: o */
    public final WeakReference<View> f17791o;

    /* JADX INFO: renamed from: p */
    public boolean f17792p;

    /* JADX INFO: renamed from: q */
    public boolean f17793q;

    public C3379oy(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, di1 di1Var, rh1 rh1Var, ym1 ym1Var, qi1 qi1Var, View view, rd2 rd2Var, C2867b4 c2867b4, C2942d4 c2942d4, byte[] bArr) {
        this.f17782f = context;
        this.f17783g = executor;
        this.f17784h = scheduledExecutorService;
        this.f17785i = di1Var;
        this.f17786j = rh1Var;
        this.f17787k = ym1Var;
        this.f17788l = qi1Var;
        this.f17789m = rd2Var;
        this.f17791o = new WeakReference<>(view);
        this.f17790n = c2867b4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u70
    /* JADX INFO: renamed from: a0 */
    public final synchronized void mo5730a0() {
        if (this.f17792p) {
            ArrayList arrayList = new ArrayList(this.f17786j.f18809d);
            arrayList.addAll(this.f17786j.f18813f);
            this.f17788l.m8205a(this.f17787k.m8805b(this.f17785i, this.f17786j, true, null, null, arrayList));
        } else {
            qi1 qi1Var = this.f17788l;
            ym1 ym1Var = this.f17787k;
            di1 di1Var = this.f17785i;
            rh1 rh1Var = this.f17786j;
            qi1Var.m8205a(ym1Var.m8804a(di1Var, rh1Var, rh1Var.f18822m));
            qi1 qi1Var2 = this.f17788l;
            ym1 ym1Var2 = this.f17787k;
            di1 di1Var2 = this.f17785i;
            rh1 rh1Var2 = this.f17786j;
            qi1Var2.m8205a(ym1Var2.m8804a(di1Var2, rh1Var2, rh1Var2.f18813f));
        }
        this.f17792p = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: b */
    public final void mo6969b() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: c */
    public final void mo6970c() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: e */
    public final void mo6972e() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: f */
    public final void mo6973f() {
        qi1 qi1Var = this.f17788l;
        ym1 ym1Var = this.f17787k;
        di1 di1Var = this.f17785i;
        rh1 rh1Var = this.f17786j;
        qi1Var.m8205a(ym1Var.m8804a(di1Var, rh1Var, rh1Var.f18815g));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: g */
    public final void mo6974g() {
        qi1 qi1Var = this.f17788l;
        ym1 ym1Var = this.f17787k;
        di1 di1Var = this.f17785i;
        rh1 rh1Var = this.f17786j;
        qi1Var.m8205a(ym1Var.m8804a(di1Var, rh1Var, rh1Var.f18818i));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
    /* JADX INFO: renamed from: i */
    public final synchronized void mo5699i() {
        if (this.f17793q) {
            return;
        }
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14210J1;
        C2862b c2862b = C2862b.f12493a;
        String strMo4853b = ((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() ? this.f17789m.f18750d.mo4853b(this.f17782f, this.f17791o.get(), null) : null;
        if (!(((Boolean) c2862b.f12496d.m6596a(C3052g3.f14346f0)).booleanValue() && this.f17785i.f13281b.f12695b.f20323g) && C3386p4.f17828g.m6603d().booleanValue()) {
            zu1 zu1Var = (zu1) cw0.m6248r(zu1.m8908s(cw0.m6231a(null)), ((Long) c2862b.f12496d.m6596a(C3052g3.f14157B0)).longValue(), TimeUnit.MILLISECONDS, this.f17784h);
            zu1Var.mo6230f(new ev1(zu1Var, new C3342ny(this, strMo4853b)), this.f17783g);
            this.f17793q = true;
            return;
        }
        qi1 qi1Var = this.f17788l;
        ym1 ym1Var = this.f17787k;
        di1 di1Var = this.f17785i;
        rh1 rh1Var = this.f17786j;
        qi1Var.m8205a(ym1Var.m8805b(di1Var, rh1Var, false, strMo4853b, null, rh1Var.f18809d));
        this.f17793q = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uv2
    /* JADX INFO: renamed from: i0 */
    public final void mo2739i0() {
        if (!(((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14346f0)).booleanValue() && this.f17785i.f13281b.f12695b.f20323g) && C3386p4.f17825d.m6603d().booleanValue()) {
            kv1 kv1VarM6246p = cw0.m6246p(zu1.m8908s(this.f17790n.m5925a()), Throwable.class, C3268ly.f16637a, C2962do.f13335f);
            C3305my c3305my = new C3305my(this);
            ((du1) kv1VarM6246p).mo6230f(new ev1(kv1VarM6246p, c3305my), this.f17783g);
            return;
        }
        qi1 qi1Var = this.f17788l;
        ym1 ym1Var = this.f17787k;
        di1 di1Var = this.f17785i;
        rh1 rh1Var = this.f17786j;
        List<String> listM8804a = ym1Var.m8804a(di1Var, rh1Var, rh1Var.f18807c);
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        qi1Var.m8206b(listM8804a, true == C2267h1.m4747f(this.f17782f) ? 2 : 1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: j */
    public final void mo6975j(InterfaceC3068gj interfaceC3068gj, String str, String str2) {
        String str3;
        qi1 qi1Var = this.f17788l;
        ym1 ym1Var = this.f17787k;
        rh1 rh1Var = this.f17786j;
        List<String> list = rh1Var.f18817h;
        Objects.requireNonNull(ym1Var);
        ArrayList arrayList = new ArrayList();
        long jMo5623c = ym1Var.f21927g.mo5623c();
        try {
            String str4 = ((BinderC2957dj) interfaceC3068gj).f13282f;
            String string = Integer.toString(((BinderC2957dj) interfaceC3068gj).f13283g);
            ei1 ei1Var = ym1Var.f21926f;
            String str5 = "";
            if (ei1Var == null) {
                str3 = "";
            } else {
                str3 = ei1Var.f13588a;
                if (!TextUtils.isEmpty(str3) && C3553tn.m8431d()) {
                    str3 = "fakeForAdDebugLog";
                }
            }
            ei1 ei1Var2 = ym1Var.f21926f;
            if (ei1Var2 != null) {
                str5 = ei1Var2.f13589b;
                if (!TextUtils.isEmpty(str5) && C3553tn.m8431d()) {
                    str5 = "fakeForAdDebugLog";
                }
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C2622l.m5283M0(ym1.m8803c(ym1.m8803c(ym1.m8803c(ym1.m8803c(ym1.m8803c(ym1.m8803c(it.next(), "@gw_rwd_userid@", Uri.encode(str3)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(jMo5623c)), "@gw_rwd_itm@", Uri.encode(str4)), "@gw_rwd_amt@", string), "@gw_sdkver@", ym1Var.f21922b), ym1Var.f21925e, rh1Var.f18793Q));
            }
        } catch (RemoteException e) {
            C2622l.m5438t3("Unable to determine award type and amount.", e);
        }
        qi1Var.m8205a(arrayList);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w60
    /* JADX INFO: renamed from: m0 */
    public final void mo6976m0(yv2 yv2Var) {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14269T0)).booleanValue()) {
            int i = yv2Var.f22116f;
            List<String> list = this.f17786j.f18823n;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                StringBuilder sb = new StringBuilder(23);
                sb.append("2.");
                sb.append(i);
                arrayList.add(ym1.m8803c(str, "@gw_mpe@", sb.toString()));
            }
            this.f17788l.m8205a(this.f17787k.m8804a(this.f17785i, this.f17786j, arrayList));
        }
    }
}
