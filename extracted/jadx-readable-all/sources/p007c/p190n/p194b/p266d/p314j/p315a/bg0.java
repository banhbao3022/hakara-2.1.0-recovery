package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p636z0.p691g.SimpleArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bg0 {

    /* JADX INFO: renamed from: a */
    public int f12601a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3087h1 f12602b;

    /* JADX INFO: renamed from: c */
    public InterfaceC3350o5 f12603c;

    /* JADX INFO: renamed from: d */
    public View f12604d;

    /* JADX INFO: renamed from: e */
    public List<?> f12605e;

    /* JADX INFO: renamed from: g */
    public BinderC3606v1 f12607g;

    /* JADX INFO: renamed from: h */
    public Bundle f12608h;

    /* JADX INFO: renamed from: i */
    public InterfaceC3410ps f12609i;

    /* JADX INFO: renamed from: j */
    public InterfaceC3410ps f12610j;

    /* JADX INFO: renamed from: k */
    public InterfaceC2799a f12611k;

    /* JADX INFO: renamed from: l */
    public View f12612l;

    /* JADX INFO: renamed from: m */
    public InterfaceC2799a f12613m;

    /* JADX INFO: renamed from: n */
    public double f12614n;

    /* JADX INFO: renamed from: o */
    public InterfaceC3610v5 f12615o;

    /* JADX INFO: renamed from: p */
    public InterfaceC3610v5 f12616p;

    /* JADX INFO: renamed from: q */
    public String f12617q;

    /* JADX INFO: renamed from: t */
    public float f12620t;

    /* JADX INFO: renamed from: u */
    public String f12621u;

    /* JADX INFO: renamed from: r */
    public final SimpleArrayMap<String, BinderC3091h5> f12618r = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: s */
    public final SimpleArrayMap<String, String> f12619s = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: f */
    public List<BinderC3606v1> f12606f = Collections.emptyList();

    /* JADX INFO: renamed from: l */
    public static bg0 m5991l(InterfaceC2952de interfaceC2952de) {
        try {
            return m5992m(m5994o(interfaceC2952de.mo5979p(), interfaceC2952de), interfaceC2952de.mo5983u(), (View) m5993n(interfaceC2952de.mo5977n()), interfaceC2952de.mo5966c(), interfaceC2952de.mo5967d(), interfaceC2952de.mo5969f(), interfaceC2952de.mo5980q(), interfaceC2952de.mo5972i(), (View) m5993n(interfaceC2952de.mo5975l()), interfaceC2952de.mo5985z(), interfaceC2952de.mo5973j(), interfaceC2952de.mo5976m(), interfaceC2952de.mo5974k(), interfaceC2952de.mo5970g(), interfaceC2952de.mo5971h(), interfaceC2952de.mo5984v());
        } catch (RemoteException e) {
            C2622l.m5241D3("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static bg0 m5992m(InterfaceC3087h1 interfaceC3087h1, InterfaceC3350o5 interfaceC3350o5, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, InterfaceC2799a interfaceC2799a, String str4, String str5, double d, InterfaceC3610v5 interfaceC3610v5, String str6, float f) {
        bg0 bg0Var = new bg0();
        bg0Var.f12601a = 6;
        bg0Var.f12602b = interfaceC3087h1;
        bg0Var.f12603c = interfaceC3350o5;
        bg0Var.f12604d = view;
        bg0Var.m6006p("headline", str);
        bg0Var.f12605e = list;
        bg0Var.m6006p("body", str2);
        bg0Var.f12608h = bundle;
        bg0Var.m6006p("call_to_action", str3);
        bg0Var.f12612l = view2;
        bg0Var.f12613m = interfaceC2799a;
        bg0Var.m6006p("store", str4);
        bg0Var.m6006p("price", str5);
        bg0Var.f12614n = d;
        bg0Var.f12615o = interfaceC3610v5;
        bg0Var.m6006p("advertiser", str6);
        synchronized (bg0Var) {
            bg0Var.f12620t = f;
        }
        return bg0Var;
    }

    /* JADX INFO: renamed from: n */
    public static <T> T m5993n(InterfaceC2799a interfaceC2799a) {
        if (interfaceC2799a == null) {
            return null;
        }
        return (T) BinderC2800b.m5639T1(interfaceC2799a);
    }

    /* JADX INFO: renamed from: o */
    public static ag0 m5994o(InterfaceC3087h1 interfaceC3087h1, InterfaceC2952de interfaceC2952de) {
        if (interfaceC3087h1 == null) {
            return null;
        }
        return new ag0(interfaceC3087h1, interfaceC2952de);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized List<BinderC3606v1> m5995a() {
        return this.f12606f;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized BinderC3606v1 m5996b() {
        return this.f12607g;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized String m5997c() {
        return m6007q("body");
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Bundle m5998d() {
        if (this.f12608h == null) {
            this.f12608h = new Bundle();
        }
        return this.f12608h;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized String m5999e() {
        return m6007q("call_to_action");
    }

    /* JADX INFO: renamed from: f */
    public final synchronized View m6000f() {
        return this.f12612l;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized InterfaceC2799a m6001g() {
        return this.f12613m;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized String m6002h() {
        return this.f12617q;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized InterfaceC3410ps m6003i() {
        return this.f12609i;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized InterfaceC3410ps m6004j() {
        return this.f12610j;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized InterfaceC2799a m6005k() {
        return this.f12611k;
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m6006p(String str, String str2) {
        try {
            if (str2 == null) {
                this.f12619s.remove(str);
            } else {
                this.f12619s.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public final synchronized String m6007q(String str) {
        return this.f12619s.getOrDefault(str, null);
    }

    /* JADX INFO: renamed from: r */
    public final synchronized int m6008r() {
        return this.f12601a;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized InterfaceC3087h1 m6009s() {
        return this.f12602b;
    }

    /* JADX INFO: renamed from: t */
    public final synchronized InterfaceC3350o5 m6010t() {
        return this.f12603c;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized String m6011u() {
        return m6007q("headline");
    }

    /* JADX INFO: renamed from: v */
    public final synchronized List<?> m6012v() {
        return this.f12605e;
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC3610v5 m6013w() {
        List<?> list = this.f12605e;
        if (list != null && list.size() != 0) {
            Object obj = this.f12605e.get(0);
            if (obj instanceof IBinder) {
                return AbstractBinderC3572u5.m8470F6((IBinder) obj);
            }
        }
        return null;
    }
}
