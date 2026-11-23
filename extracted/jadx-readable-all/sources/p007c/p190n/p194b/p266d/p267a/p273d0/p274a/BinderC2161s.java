package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractBinderC3367om;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3264lu;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3510sh;
import p007c.p190n.p194b.p266d.p314j.p315a.C3525sw;
import p007c.p190n.p194b.p266d.p314j.p315a.C3552tm;
import p007c.p190n.p194b.p266d.p314j.p315a.C3562tw;
import p007c.p190n.p194b.p266d.p314j.p315a.C3702xn;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3293mm;
import p007c.p190n.p194b.p266d.p314j.p315a.cp0;
import p007c.p190n.p194b.p266d.p314j.p315a.cw0;
import p007c.p190n.p194b.p266d.p314j.p315a.du1;
import p007c.p190n.p194b.p266d.p314j.p315a.ev1;
import p007c.p190n.p194b.p266d.p314j.p315a.ew2;
import p007c.p190n.p194b.p266d.p314j.p315a.fj1;
import p007c.p190n.p194b.p266d.p314j.p315a.fw2;
import p007c.p190n.p194b.p266d.p314j.p315a.hi1;
import p007c.p190n.p194b.p266d.p314j.p315a.ia0;
import p007c.p190n.p194b.p266d.p314j.p315a.jw2;
import p007c.p190n.p194b.p266d.p314j.p315a.kv1;
import p007c.p190n.p194b.p266d.p314j.p315a.lv1;
import p007c.p190n.p194b.p266d.p314j.p315a.qu1;
import p007c.p190n.p194b.p266d.p314j.p315a.r30;
import p007c.p190n.p194b.p266d.p314j.p315a.rd2;
import p007c.p190n.p194b.p266d.p314j.p315a.s50;
import p007c.p190n.p194b.p266d.p314j.p315a.t50;
import p007c.p190n.p194b.p266d.p314j.p315a.vk0;
import p007c.p190n.p194b.p266d.p314j.p315a.wi1;
import p007c.p190n.p194b.p266d.p314j.p315a.zu1;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.s */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2161s extends AbstractBinderC3367om {

    /* JADX INFO: renamed from: g */
    public static final List<String> f10518g = new ArrayList(Arrays.asList("/aclk", "/pcs/click"));

    /* JADX INFO: renamed from: h */
    public static final List<String> f10519h = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* JADX INFO: renamed from: i */
    public static final List<String> f10520i = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion"));

    /* JADX INFO: renamed from: j */
    public static final List<String> f10521j = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* JADX INFO: renamed from: k */
    public final AbstractC3264lu f10522k;

    /* JADX INFO: renamed from: l */
    public Context f10523l;

    /* JADX INFO: renamed from: m */
    public final rd2 f10524m;

    /* JADX INFO: renamed from: n */
    public final C3702xn f10525n;

    /* JADX INFO: renamed from: o */
    public final wi1<vk0> f10526o;

    /* JADX INFO: renamed from: p */
    public final lv1 f10527p;

    /* JADX INFO: renamed from: q */
    public final ScheduledExecutorService f10528q;

    /* JADX INFO: renamed from: r */
    public C3510sh f10529r;

    /* JADX INFO: renamed from: s */
    public Point f10530s = new Point();

    /* JADX INFO: renamed from: t */
    public Point f10531t = new Point();

    /* JADX INFO: renamed from: u */
    public final Set<WebView> f10532u = Collections.newSetFromMap(new WeakHashMap());

    public BinderC2161s(AbstractC3264lu abstractC3264lu, Context context, rd2 rd2Var, C3702xn c3702xn, wi1<vk0> wi1Var, lv1 lv1Var, ScheduledExecutorService scheduledExecutorService) {
        this.f10522k = abstractC3264lu;
        this.f10523l = context;
        this.f10524m = rd2Var;
        this.f10525n = c3702xn;
        this.f10526o = wi1Var;
        this.f10527p = lv1Var;
        this.f10528q = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: F6 */
    public static boolean m4618F6(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (path.contains(it.next())) {
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith(it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H6 */
    public static final Uri m4619H6(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(string.substring(0, i));
        outline.m1572W(sb, str, "=", str2, "&");
        sb.append(string.substring(i));
        return Uri.parse(sb.toString());
    }

    /* JADX INFO: renamed from: G6 */
    public final kv1<String> m4620G6(final String str) {
        final vk0[] vk0VarArr = new vk0[1];
        kv1 kv1VarM6249s = cw0.m6249s(this.f10526o.m8652b(), new qu1(this, vk0VarArr, str) { // from class: c.n.b.d.a.d0.a.n

            /* JADX INFO: renamed from: a */
            public final BinderC2161s f10509a;

            /* JADX INFO: renamed from: b */
            public final vk0[] f10510b;

            /* JADX INFO: renamed from: c */
            public final String f10511c;

            {
                this.f10509a = this;
                this.f10510b = vk0VarArr;
                this.f10511c = str;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) throws JSONException {
                BinderC2161s binderC2161s = this.f10509a;
                vk0[] vk0VarArr2 = this.f10510b;
                String str2 = this.f10511c;
                vk0 vk0Var = (vk0) obj;
                Objects.requireNonNull(binderC2161s);
                vk0VarArr2[0] = vk0Var;
                Context context = binderC2161s.f10523l;
                C3510sh c3510sh = binderC2161s.f10529r;
                Map<String, WeakReference<View>> map = c3510sh.f19556g;
                JSONObject jSONObjectM4558G = C2096e.m4558G(context, map, map, c3510sh.f19555f);
                JSONObject jSONObjectM4553B = C2096e.m4553B(binderC2161s.f10523l, binderC2161s.f10529r.f19555f);
                JSONObject jSONObjectM4555D = C2096e.m4555D(binderC2161s.f10529r.f19555f);
                JSONObject jSONObjectM4557F = C2096e.m4557F(binderC2161s.f10523l, binderC2161s.f10529r.f19555f);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectM4558G);
                jSONObject.put("ad_view_signal", jSONObjectM4553B);
                jSONObject.put("scroll_view_signal", jSONObjectM4555D);
                jSONObject.put("lock_screen_signal", jSONObjectM4557F);
                if (str2 == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
                    jSONObject.put("click_signal", C2096e.m4559H(null, binderC2161s.f10523l, binderC2161s.f10531t, binderC2161s.f10530s));
                }
                return vk0Var.m8561a(str2, jSONObject);
            }
        }, this.f10527p);
        ((du1) kv1VarM6249s).mo6230f(new Runnable(this, vk0VarArr) { // from class: c.n.b.d.a.d0.a.o

            /* JADX INFO: renamed from: f */
            public final BinderC2161s f10512f;

            /* JADX INFO: renamed from: g */
            public final vk0[] f10513g;

            {
                this.f10512f = this;
                this.f10513g = vk0VarArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BinderC2161s binderC2161s = this.f10512f;
                vk0[] vk0VarArr2 = this.f10513g;
                Objects.requireNonNull(binderC2161s);
                vk0 vk0Var = vk0VarArr2[0];
                if (vk0Var != null) {
                    wi1<vk0> wi1Var = binderC2161s.f10526o;
                    kv1<vk0> kv1VarM6231a = cw0.m6231a(vk0Var);
                    synchronized (wi1Var) {
                        wi1Var.f21133a.addFirst(kv1VarM6231a);
                    }
                }
            }
        }, this.f10527p);
        return cw0.m6246p(cw0.m6250t((zu1) cw0.m6248r(zu1.m8908s(kv1VarM6249s), ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14469w4)).intValue(), TimeUnit.MILLISECONDS, this.f10528q), C2154l.f10507a, this.f10527p), Exception.class, C2155m.f10508a, this.f10527p);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4621r() {
        Map<String, WeakReference<View>> map;
        C3510sh c3510sh = this.f10529r;
        return (c3510sh == null || (map = c3510sh.f19556g) == null || map.isEmpty()) ? false : true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3404pm
    /* JADX INFO: renamed from: x4 */
    public final void mo4622x4(InterfaceC2799a interfaceC2799a, C3552tm c3552tm, InterfaceC3293mm interfaceC3293mm) {
        Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
        this.f10523l = context;
        String str = c3552tm.f19911f;
        String str2 = c3552tm.f19912g;
        jw2 jw2Var = c3552tm.f19913h;
        ew2 ew2VarM6890a = c3552tm.f19914i;
        C3525sw c3525swMo7640v = this.f10522k.mo7640v();
        s50 s50Var = new s50();
        s50Var.f19467a = context;
        hi1 hi1Var = new hi1();
        if (str == null) {
            str = "adUnitId";
        }
        hi1Var.f14857c = str;
        if (ew2VarM6890a == null) {
            ew2VarM6890a = new fw2().m6890a();
        }
        hi1Var.f14855a = ew2VarM6890a;
        if (jw2Var == null) {
            jw2Var = new jw2();
        }
        hi1Var.f14856b = jw2Var;
        s50Var.f19468b = hi1Var.m7136a();
        c3525swMo7640v.f19714a = new t50(s50Var);
        C2163u c2163u = new C2163u();
        c2163u.f10540a = str2;
        c3525swMo7640v.f19715b = new C2164v(c2163u);
        new ia0();
        C2622l.m5467z2(c3525swMo7640v.f19714a, t50.class);
        C2622l.m5467z2(c3525swMo7640v.f19715b, C2164v.class);
        kv1<C2145c> kv1VarMo4613a = new C3562tw(c3525swMo7640v.f19716c, c3525swMo7640v.f19715b, new r30(), new cp0(), c3525swMo7640v.f19714a, new fj1(), null, null).f20087A0.mo4613a();
        C2158p c2158p = new C2158p(this, interfaceC3293mm);
        kv1VarMo4613a.mo6230f(new ev1(kv1VarMo4613a, c2158p), this.f10522k.mo7624f());
    }
}
